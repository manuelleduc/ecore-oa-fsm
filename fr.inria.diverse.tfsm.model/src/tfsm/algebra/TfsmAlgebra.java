package tfsm.algebra;

import tfsm.AndClockConstraint;
import tfsm.Clock;
import tfsm.ClockConstraintOperation;
import tfsm.ClockReset;
import tfsm.FSM;
import tfsm.FinalState;
import tfsm.InitialState;
import tfsm.LowerClockConstraint;
import tfsm.LowerEqualClockConstraint;
import tfsm.OrClockConstraint;
import tfsm.State;
import tfsm.TfsmPackage;
import tfsm.Transition;
import tfsm.UpperClockConstraint;
import tfsm.UpperEqualClockConstraint;
import java.util.Map;

public interface TfsmAlgebra<A, B, C, D, E, F> {

	A andClockConstraint(final AndClockConstraint andClockConstraint);

	B clock(final Clock clock);

	C clockReset(final ClockReset clockReset);

	D fSM(final FSM fSM);

	E finalState(final FinalState finalState);

	E initialState(final InitialState initialState);

	A lowerClockConstraint(final LowerClockConstraint lowerClockConstraint);

	A lowerEqualClockConstraint(final LowerEqualClockConstraint lowerEqualClockConstraint);

	A orClockConstraint(final OrClockConstraint orClockConstraint);

	E state(final State state);

	F transition(final Transition transition);

	A upperClockConstraint(final UpperClockConstraint upperClockConstraint);

	A upperEqualClockConstraint(final UpperEqualClockConstraint upperEqualClockConstraint);

	public default A $(final ClockConstraintOperation clockConstraintOperation) {
		final A ret;
		if (clockConstraintOperation.eClass().getClassifierID() == TfsmPackage.AND_CLOCK_CONSTRAINT) {
			ret = this.andClockConstraint((AndClockConstraint) clockConstraintOperation);
		} else if (clockConstraintOperation.eClass().getClassifierID() == TfsmPackage.LOWER_CLOCK_CONSTRAINT) {
			ret = this.lowerClockConstraint((LowerClockConstraint) clockConstraintOperation);
		} else if (clockConstraintOperation.eClass().getClassifierID() == TfsmPackage.LOWER_EQUAL_CLOCK_CONSTRAINT) {
			ret = this.lowerEqualClockConstraint((LowerEqualClockConstraint) clockConstraintOperation);
		} else if (clockConstraintOperation.eClass().getClassifierID() == TfsmPackage.OR_CLOCK_CONSTRAINT) {
			ret = this.orClockConstraint((OrClockConstraint) clockConstraintOperation);
		} else if (clockConstraintOperation.eClass().getClassifierID() == TfsmPackage.UPPER_CLOCK_CONSTRAINT) {
			ret = this.upperClockConstraint((UpperClockConstraint) clockConstraintOperation);
		} else if (clockConstraintOperation.eClass().getClassifierID() == TfsmPackage.UPPER_EQUAL_CLOCK_CONSTRAINT) {
			ret = this.upperEqualClockConstraint((UpperEqualClockConstraint) clockConstraintOperation);
		} else {
			throw new RuntimeException("Unknow ClockConstraintOperation " + clockConstraintOperation);
		}
		return ret;
	}
	public default B $(final Clock clock) {
		final B ret;
		if (clock.eClass().getClassifierID() == TfsmPackage.CLOCK) {
			ret = this.clock((Clock) clock);
		} else {
			throw new RuntimeException("Unknow Clock " + clock);
		}
		return ret;
	}
	public default C $(final ClockReset clockReset) {
		final C ret;
		if (clockReset.eClass().getClassifierID() == TfsmPackage.CLOCK_RESET) {
			ret = this.clockReset((ClockReset) clockReset);
		} else {
			throw new RuntimeException("Unknow ClockReset " + clockReset);
		}
		return ret;
	}
	public default D $(final FSM fSM) {
		final D ret;
		if (fSM.eClass().getClassifierID() == TfsmPackage.FSM) {
			ret = this.fSM((FSM) fSM);
		} else {
			throw new RuntimeException("Unknow FSM " + fSM);
		}
		return ret;
	}
	public default E $(final State state) {
		final E ret;
		if (state.eClass().getClassifierID() == TfsmPackage.FINAL_STATE) {
			ret = this.finalState((FinalState) state);
		} else if (state.eClass().getClassifierID() == TfsmPackage.INITIAL_STATE) {
			ret = this.initialState((InitialState) state);
		} else if (state.eClass().getClassifierID() == TfsmPackage.STATE) {
			ret = this.state((State) state);
		} else {
			throw new RuntimeException("Unknow State " + state);
		}
		return ret;
	}
	public default F $(final Transition transition) {
		final F ret;
		if (transition.eClass().getClassifierID() == TfsmPackage.TRANSITION) {
			ret = this.transition((Transition) transition);
		} else {
			throw new RuntimeException("Unknow Transition " + transition);
		}
		return ret;
	}
}