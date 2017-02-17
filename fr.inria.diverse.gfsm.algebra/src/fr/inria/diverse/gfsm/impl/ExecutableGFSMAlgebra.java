package fr.inria.diverse.gfsm.impl;

import java.util.List;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Optional;
import java.util.Queue;
import java.util.stream.Collectors;

import fr.inria.diverse.algebras.expressions.CtxEvalExp;
import fr.inria.diverse.algebras.expressions.EvalOpExp;
import fr.inria.diverse.fsm.algebra.exprs.ExecutableExp;
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

public interface ExecutableGFSMAlgebra extends
		GfsmAlgebra<CtxEvalExp<Integer, Boolean>, CtxEvalExp<Integer, Integer>, ExecutableExp, ExecutableExp, EvalOpExp<Integer>, ExecutableExp> {

	void setCtx(Map<String, Integer> ctx);

	Map<String, Integer> getCtx();

	@Override
	public default CtxEvalExp<Integer, Boolean> booleanAnd(final BooleanAnd booleanAnd) {
		return ctx -> this.$(booleanAnd.getBoolExpression1()).result(ctx)
				.flatMap(e1 -> this.$(booleanAnd.getBoolExpression2()).result(ctx).map(e2 -> e1 && e2));
	}

	@Override
	public default CtxEvalExp<Integer, Boolean> booleanEqual(final BooleanEqual booleanEqual) {
		return ctx -> this.$(booleanEqual.getExpression1()).result(ctx)
				.flatMap(e1 -> this.$(booleanEqual.getExpression2()).result(ctx).map(e2 -> e1.equals(e2)));
	}

	@Override
	public default CtxEvalExp<Integer, Boolean> booleanGreaterThan(final BooleanGreaterThan booleanGreaterThan) {
		return ctx -> this.$(booleanGreaterThan.getExpression1()).result(ctx)
				.flatMap(e1 -> this.$(booleanGreaterThan.getExpression2()).result(ctx).map(e2 -> e1 > e2));
	}

	@Override
	public default CtxEvalExp<Integer, Boolean> booleanOr(final BooleanOr booleanOr) {
		return ctx -> this.$(booleanOr.getBoolExpression1()).result(ctx)
				.flatMap(e1 -> this.$(booleanOr.getBoolExpression2()).result(ctx).map(e2 -> e1 || e2));
	}

	@Override
	public default ExecutableExp fSM(final FSM fsm) {

		return () -> {

			fsm.setCurrentState(fsm.getInitialstate());
			this._processInExpression(fsm.getCurrentState());
			while (fsm.getCurrentState() != null) {
				this.$(fsm.getCurrentState()).execute();
			}
		};
	}

	@Override
	public default ExecutableExp finalState(final FinalState finalState) {
		return this.state(finalState);
	}

	@Override
	public default ExecutableExp initialState(final InitialState initialState) {
		return this.state(initialState);
	}

	@Override
	public default CtxEvalExp<Integer, Integer> intAdd(final IntAdd intAdd) {
		return ctx -> this.$(intAdd.getExpression1()).result(ctx)
				.flatMap(e1 -> this.$(intAdd.getExpression2()).result(ctx).map(e2 -> e1 + e2));
	}

	@Override
	public default EvalOpExp<Integer> intBlock(final IntBlock intBlock) {
		return ctx -> !intBlock.getOperations().stream().map(operation -> this.$(operation).eval(ctx)).filter(x -> !x)
				.findAny().isPresent();
	}

	@Override
	public default CtxEvalExp<Integer, Integer> intMult(final IntMult intMult) {
		return ctx -> this.$(intMult.getExpression1()).result(ctx)
				.flatMap(e1 -> this.$(intMult.getExpression2()).result(ctx).map(e2 -> e1 * e2));
	}

	@Override
	public default CtxEvalExp<Integer, Integer> intNeg(final IntNeg intNeg) {
		return ctx -> this.$(intNeg.getExpression()).result(ctx).map(e -> -e);
	}

	@Override
	public default EvalOpExp<Integer> intVarAssign(final IntVarAssign intVarAssign) {

		return ctx -> {
			final Optional<Integer> result = $(intVarAssign.getExpression()).result(ctx);
			result.ifPresent(res -> {
				final String name = intVarAssign.getName();
				ctx.put(name, res);
			});
			return result.isPresent();
		};
	}

	@Override
	public default CtxEvalExp<Integer, Integer> intVarRef(final IntVarRef intVarRef) {
		return ctx -> {
			Optional<Integer> ret;
			if (ctx.containsKey(intVarRef.getName())) {
				ret = Optional.of(ctx.get(intVarRef.getName()));
			} else {
				ret = Optional.empty();
			}
			return ret;
		};
	}

	@Override
	public default ExecutableExp state(final State state) {
		return () -> {
			final String action = this.getUserinput().poll();
			if (action == null) {
				if (!(state.getFsm().getCurrentState() instanceof FinalState)) {
					System.out.println("[ERROR] no action available but final state not reached");
					state.getFsm().setCurrentState(null);
				}
			} else {
				final List<Transition> res = state.getOutgoingtransitions().stream()
						.filter(t -> t.getEvent().equals(action)).filter(t -> {
							final boolean ret;
							ret = $(t.getGuard()).result(ExecutableGFSMAlgebra.this.getCtx()).orElseThrow(
									() -> new RuntimeException("failed to process " + t.getEvent() + " guard"));
							return ret;
						}).collect(Collectors.toList());

				if (res.size() == 1) {
					System.out.println("transition: event " + action + " - " + state.getName() + " -> "
							+ res.get(0).getTo().getName());
					this._printCtx();
					this._processOutExpression(state.getFsm().getCurrentState());
					this._printCtx();
					state.getFsm().setCurrentState(res.get(0).getTo());
					this._processInExpression(state.getFsm().getCurrentState());
					this._printCtx();
				} else if (res.size() > 1) {
					System.out.println("[ERROR] Non deterministic " + res.size()
							+ " outgoing transitions matches event " + action);
					state.getFsm().setCurrentState(null);
				} else {
					System.out.println("[ERROR] Deadlock");
					state.getFsm().setCurrentState(null);
				}
			}

		};
	}

	@Override
	public default ExecutableExp transition(final Transition gTransition) {
		throw new RuntimeException("gTransition");
	}

	Queue<String> getUserinput();

	@Override
	public default CtxEvalExp<Integer, Integer> constExpr(final ConstExpr constExpr) {
		return ctx -> Optional.of(constExpr.getValue());
	}

	public default void _printCtx() {
		System.out.println("Context : ");
		for (final Entry<String, Integer> e : this.getCtx().entrySet()) {
			System.out.println(e.getKey() + ": " + e.getValue());
		}
	}

	public default void _processOutExpression(final State currentState) {
		$(currentState.getOutExpression()).eval(this.getCtx());

	}

	public default void _processInExpression(final State currentState) {
		$(currentState.getInExpression()).eval(this.getCtx());
	}
}
