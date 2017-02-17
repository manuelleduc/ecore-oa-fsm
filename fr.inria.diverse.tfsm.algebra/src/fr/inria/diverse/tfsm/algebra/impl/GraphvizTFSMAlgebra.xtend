package fr.inria.diverse.tfsm.algebra.impl

import fr.inria.diverse.algebras.expressions.RepGraphvizExp
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

interface GraphvizTFSMAlgebra extends TfsmAlgebra<RepGraphvizExp, RepGraphvizExp, RepGraphvizExp, RepGraphvizExp, RepGraphvizExp, RepGraphvizExp> {

	override andClockConstraint(AndClockConstraint andClockConstraint) {
		[rep|'''(«$(andClockConstraint.left).result(rep)» AND «$(andClockConstraint.right).result(rep)»)''']
	}

	override clock(Clock clock) {
		throw new UnsupportedOperationException("TODO: auto-generated method stub")
	}

	override clockReset(ClockReset clockReset) {
		['''«clockReset.clock.name» = 0''']
	}

	override fSM(FSM fsm) {
		[ rep |
			rep.name = fsm.name
			fsm.transitions.forEach[e|$(e).result(rep)]
			rep.show
		]
	}
	
	override finalState(FinalState finalState) {
		[ rep |
			val nodename = state(finalState).result(rep)
			rep.addNode(nodename, newHashMap("shape" -> "box", "color" -> "green", "xlabel" -> nodename))
			nodename
		]
	}
	
	override initialState(InitialState initialState) {
		[ rep |
			val nodename = state(initialState).result(rep)
			rep.addNode(nodename, newHashMap("shape" -> "box", "color" -> "red", "xlabel" -> nodename))
			nodename
		]
	}
	
	override lowerClockConstraint(LowerClockConstraint clockConstraint) {
		['''«clockConstraint.threshold» > «clockConstraint.clock.name»''']
	}
	
	override lowerEqualClockConstraint(LowerEqualClockConstraint lowerEqualClockConstraint) {
		['''«lowerEqualClockConstraint.threshold» >= «lowerEqualClockConstraint.clock.name»''']
	}
	
	override orClockConstraint(OrClockConstraint orClockConstraint) {
		[rep|'''(«$(orClockConstraint.left).result(rep)» OR «$(orClockConstraint.right).result(rep)»)''']
	}
	
	override state(State state) {
		[ rep |
			val statename = this.state(state).result(rep)
			val attrs = if (state.stateguard != null) {
					val guard = $(state.stateguard).result(rep)
					newHashMap("label" -> guard)
				} else {
					newHashMap("label" -> '')
				}

			rep.addNode(statename, attrs)
			statename
		]
	}
	
	override transition(Transition transition) {
		[ rep |
			rep.edges.
				add('''«$(transition.from).result(rep)» -> «$(transition.to).result(rep)» [label="«transition.event»«IF transition.transitionguard != null»\n«$(transition.transitionguard).result(rep)»«ENDIF»«IF transition.clockresets != null && !transition.clockresets.empty»\n«FOR reset:transition.clockresets SEPARATOR '\n'»«$(reset).result(rep)»«ENDFOR»«ENDIF»"]''')
			""
		]
	}

	override upperClockConstraint(UpperClockConstraint upperClockConstraint) {
		['''«upperClockConstraint.threshold» < «upperClockConstraint.clock.name»''']
	}

	override upperEqualClockConstraint(UpperEqualClockConstraint upperEqualClockConstraint) {
		['''«upperEqualClockConstraint.threshold» <= «upperEqualClockConstraint.clock.name»''']
	}
}
