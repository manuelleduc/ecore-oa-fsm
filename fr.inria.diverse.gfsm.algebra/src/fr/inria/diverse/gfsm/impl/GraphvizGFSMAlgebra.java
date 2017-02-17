package fr.inria.diverse.gfsm.impl;

import java.text.MessageFormat;
import java.util.HashMap;
import java.util.stream.Collectors;

import fr.inria.diverse.algebras.expressions.GraphvizExp;
import fr.inria.diverse.algebras.expressions.RepGraphvizExp;
import gfsm.BooleanAnd;
import gfsm.BooleanEqual;
import gfsm.BooleanGreaterThan;
import gfsm.BooleanOr;
import gfsm.ConstExpr;
import gfsm.FSM;
import gfsm.FinalState;
import gfsm.InitialState;
import gfsm.IntAdd;
import gfsm.IntBlock;
import gfsm.IntMult;
import gfsm.IntNeg;
import gfsm.IntVarAssign;
import gfsm.IntVarRef;
import gfsm.State;
import gfsm.Transition;
import gfsm.algebra.GfsmAlgebra;

public interface GraphvizGFSMAlgebra
		extends GfsmAlgebra<GraphvizExp, GraphvizExp, RepGraphvizExp, RepGraphvizExp, GraphvizExp, RepGraphvizExp> {

	@Override
	public default GraphvizExp booleanAnd(final BooleanAnd booleanAnd) {
		return () -> MessageFormat.format("{0} && {1}", this.$(booleanAnd.getBoolExpression1()).result(),
				this.$(booleanAnd.getBoolExpression2()).result());
	}

	@Override
	public default GraphvizExp booleanEqual(final BooleanEqual booleanEqual) {
		return () -> MessageFormat.format("{0} == {1}", this.$(booleanEqual.getExpression1()).result(),
				this.$(booleanEqual.getExpression2()).result());
	}

	@Override
	public default GraphvizExp booleanGreaterThan(final BooleanGreaterThan booleanGreaterThan) {
		return () -> MessageFormat.format("{0} >= {1}", this.$(booleanGreaterThan.getExpression1()).result(),
				this.$(booleanGreaterThan.getExpression2()).result());
	}

	@Override
	public default GraphvizExp booleanOr(final BooleanOr booleanOr) {
		return () -> MessageFormat.format("{0} && {1}", this.$(booleanOr.getBoolExpression1()).result(),
				this.$(booleanOr.getBoolExpression2()).result());
	}

	@Override
	public default GraphvizExp constExpr(final ConstExpr constExpr) {
		return () -> String.valueOf(constExpr.getValue());
	}

	@Override
	public default RepGraphvizExp fSM(final FSM fsm) {
		return (rep) -> {
			rep.name = fsm.getName();
			fsm.getTransitions().forEach(t -> $(t).result(rep));
			return rep.show();
		};
	}

	@Override
	public default RepGraphvizExp finalState(final FinalState finalState) {
		return (rep) -> {
			final String nodeName = this.state(finalState).result(rep);
			final HashMap<String, String> properties = new HashMap<>();
			properties.put("shape", "box");
			properties.put("color", "green");
			rep.addNode(nodeName, properties);
			return nodeName;
		};
	}

	@Override
	public default RepGraphvizExp initialState(final InitialState initialState) {
		return (rep) -> {
			final String nodeName = this.state(initialState).result(rep);
			final HashMap<String, String> properties = new HashMap<>();
			properties.put("shape", "box");
			properties.put("color", "red");
			rep.addNode(nodeName, properties);
			return nodeName;
		};
	}

	@Override
	public default GraphvizExp intAdd(final IntAdd intAdd) {
		return () -> MessageFormat.format("({0} + {1})", this.$(intAdd.getExpression1()).result(),
				this.$(intAdd.getExpression2()).result());
	}

	@Override
	public default GraphvizExp intBlock(final IntBlock intBlock) {
		return () -> intBlock.getOperations().stream().map(t -> this.$(t).result()).collect(Collectors.joining("\n"));
	}

	@Override
	public default GraphvizExp intMult(final IntMult mult) {
		return () -> MessageFormat.format("({0} * {1})", this.$(mult.getExpression1()).result(),
				this.$(mult.getExpression2()).result());
	}

	@Override
	public default GraphvizExp intNeg(final IntNeg intNeg) {
		return () -> MessageFormat.format("-{0}", this.$(intNeg.getExpression()).result());
	}

	@Override
	public default GraphvizExp intVarAssign(final IntVarAssign intVarAssign) {
		return () -> MessageFormat.format("{0} := {1}", intVarAssign.getName(),
				this.$(intVarAssign.getExpression()).result());
	}

	@Override
	public default GraphvizExp intVarRef(final IntVarRef intVarRef) {
		return () -> intVarRef.getName();
	}

	@Override
	public default RepGraphvizExp state(final State state) {
		return (rep) -> {
			final String stateName = this.state(state).result(rep);

			final HashMap<String, String> attrs = new HashMap<String, String>();
			if (state.getInExpression() != null) {

				// FIXME : Line breaks replacement is not so nice...
				final String guard1 = this.$(state.getInExpression()).result().replaceAll("\n", "\\\\n");
				attrs.put("label", "IN:\\n" + guard1);
			}

			if (state.getOutExpression() != null) {
				final String guard2 = this.$(state.getOutExpression()).result().replaceAll("\n", "\\\\n");
				final String orDefault = attrs.getOrDefault("label", "");
				final String value = orDefault + (orDefault.equals("") ? "" : "\\n") + "OUT:\\n" + guard2;
				attrs.put("label", value);
			}

			rep.addNode(stateName, attrs);
			return stateName;
		};
	}

	@Override
	public default RepGraphvizExp transition(final Transition transition) {
		return (rep) -> {

			final String guard;
			if (transition.getGuard() != null) {
				guard = this.$(transition.getGuard()).result();
			} else {
				guard = "";
			}

			rep.edges.add(this.$(transition.getFrom()).result(rep) + " -> " + this.$(transition.getTo()).result(rep)
					+ "[label=\"" + transition.getEvent() + (guard.equals("") ? "" : "\\n") + guard + "\"]");
			return "";
		};
	}

}
