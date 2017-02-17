package fr.inria.diverse.tfsm.algebra.impl

import fr.inria.diverse.fsm.algebra.exprs.CtxExecutableExp
import fr.inria.diverse.fsm.algebra.exprs.ExecutableExp
import fr.inria.diverse.fsm.algebra.impl.ExecutableFSMAlgebra
import java.util.Map
import tfsm.AndClockConstraint
import tfsm.Clock
import tfsm.ClockReset
import tfsm.FSM
import tfsm.FinalState
import tfsm.InitialState
import tfsm.LowerClockConstraint
import tfsm.LowerEqualClockConstraint
import tfsm.OrClockConstraint
import tfsm.State
import tfsm.Transition
import tfsm.UpperClockConstraint
import tfsm.UpperEqualClockConstraint
import tfsm.algebra.TfsmAlgebra

// find out a solution to overload types defined at an upper level at the level of the arguments (here timedActions vs userinput)
interface ExecutableTFSMAlgebra extends TfsmAlgebra<Boolean, Void, CtxExecutableExp, ExecutableExp, ExecutableExp, ExecutableExp>, ExecutableFSMAlgebra {
	
	def Map<Integer, String> getTimedActions()
	
	def void setTime(Integer time)

	def Integer getTime()
	
	override andClockConstraint(AndClockConstraint andClockConstraint) {
		$(andClockConstraint.left) && $(andClockConstraint.right)
	}
	
	override clock(Clock clock) {
		throw new UnsupportedOperationException("TODO: auto-generated method stub")
	}
	
	override clockReset(ClockReset clockReset) {
		throw new UnsupportedOperationException("TODO: auto-generated method stub")
	}
	
	override fSM(FSM fsm) {
		[
			fsm.currentState = fsm.initialstate
			while (fsm.currentState != null) {
				$(fsm.currentState).execute
				fsm.clocks.forEach[e|e.tick = e.tick + 1]
				time = time + 1
			}
		]
	}
	
	override finalState(FinalState finalState) {
		this.state(finalState)
	}
	
	override initialState(InitialState initialState) {
		this.state(initialState)
	}
	
	override lowerClockConstraint(LowerClockConstraint clockConstraint) {
		clockConstraint.clock.tick < clockConstraint.threshold
	}
	
	override lowerEqualClockConstraint(LowerEqualClockConstraint lowerEqualClockConstraint) {
		lowerEqualClockConstraint.clock.tick <= lowerEqualClockConstraint.threshold
	}
	
	override orClockConstraint(OrClockConstraint orClockConstraint) {
		$(orClockConstraint.left) || $(orClockConstraint.right)
	}
	
	override state(State state) {
		[
			val action = timedActions.get(time)

			// action with time in the future.
			val futureActions = timedActions.filter[p1, p2|p1 >= time].size
			if (futureActions == 0) {
				if (!(state.fsm.currentState instanceof FinalState)) {
					println("[ERROR] no action available but final state not reached")
					state.fsm.currentState = null
				}
			} else if (action != null) {
				val nonGardedRes = state.outgoingtransitions.filter[e|e.event == action]
				// aweful downcast !!
				val res = nonGardedRes.filter [ e |
					e.transitionguard == null ||
						$(e.transitionguard)
				]
				val resSize = res.size
				if (resSize > 1) {
					println('''[ERROR] non deterministic: «res.length» outgoing transitions matches event «action»''')
					state.fsm.currentState = null
				} else if (resSize == 1) {
					val transition = res.get(
						0)
					println('''transition (time «time»): event «action» - «state.fsm.currentState.name» -> «transition.to.name»''')
					transition.clockresets.forEach[e|e.clock.tick = 0]
					println('''
						clocks :
						«FOR clock : state.fsm.clocks»
							- clock «clock.name» = «clock.tick»
						«ENDFOR»
					''')
					state.fsm.currentState = transition.to
				}
			}
			if (!$(state.fsm.currentState.stateguard)) {
				println('''[ERROR] deadlock! State guard triggered at time «time» on state «state.fsm.currentState.name»''')
				println('''
					clocks :
					«FOR clock : state.fsm.clocks»
						- clock «clock.name» = «clock.tick»
					«ENDFOR»
				''')

				state.fsm.currentState = null
			}
		]
	}
	
	override transition(Transition transition) {
		throw new UnsupportedOperationException("TODO: auto-generated method stub")
	}
	

	override upperClockConstraint(UpperClockConstraint upperClockConstraint) {
		upperClockConstraint.clock.tick > upperClockConstraint.threshold
	}

	override upperEqualClockConstraint(UpperEqualClockConstraint upperEqualClockConstraint) {
		upperEqualClockConstraint.clock.tick >= upperEqualClockConstraint.threshold
	}
}
