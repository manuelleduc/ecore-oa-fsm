package fsm.algebra;

import fsm.FSM;
import fsm.FinalState;
import fsm.FsmPackage;
import fsm.InitialState;
import fsm.State;
import fsm.Transition;
import java.util.Map;

public interface FsmAlgebra<A, B, C> {

	A fSM(final FSM fSM);

	B finalState(final FinalState finalState);

	B initialState(final InitialState initialState);

	B state(final State state);

	C transition(final Transition transition);

	public default A $(final FSM fSM) {
		final A ret;
		if (fSM.eClass().getClassifierID() == FsmPackage.FSM) {
			ret = this.fSM((FSM) fSM);
		} else {
			throw new RuntimeException("Unknow FSM " + fSM);
		}
		return ret;
	}
	public default B $(final State state) {
		final B ret;
		if (state.eClass().getClassifierID() == FsmPackage.FINAL_STATE) {
			ret = this.finalState((FinalState) state);
		} else if (state.eClass().getClassifierID() == FsmPackage.INITIAL_STATE) {
			ret = this.initialState((InitialState) state);
		} else if (state.eClass().getClassifierID() == FsmPackage.STATE) {
			ret = this.state((State) state);
		} else {
			throw new RuntimeException("Unknow State " + state);
		}
		return ret;
	}
	public default C $(final Transition transition) {
		final C ret;
		if (transition.eClass().getClassifierID() == FsmPackage.TRANSITION) {
			ret = this.transition((Transition) transition);
		} else {
			throw new RuntimeException("Unknow Transition " + transition);
		}
		return ret;
	}
}