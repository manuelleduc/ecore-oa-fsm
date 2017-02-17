package fr.inria.diverse.tfsm.algebra.programs;

import java.util.HashMap;
import java.util.Map;
import java.util.Queue;

import org.eclipse.emf.common.util.URI;
import org.eclipse.emf.ecore.resource.Resource;
import org.eclipse.emf.ecore.resource.impl.ResourceSetImpl;
import org.eclipse.emf.ecore.xmi.impl.XMIResourceFactoryImpl;

import fr.inria.diverse.algebras.expressions.RepGraphvizExp;
import fr.inria.diverse.fsm.algebra.exprs.CtxExecutableExp;
import fr.inria.diverse.fsm.algebra.exprs.ExecutableExp;
import fr.inria.diverse.tfsm.algebra.impl.ExecutableTFSMAlgebra;
import fr.inria.diverse.tfsm.algebra.impl.GraphvizTFSMAlgebra;
import fr.inria.diverse.utils.GraphvizRep;
import tfsm.FSM;
import tfsm.TfsmPackage;
import tfsm.algebra.TfsmAlgebra;

public class Program2 {

	public static void main(final String[] args) {
		new Program2().execute();
	}

	private void execute() {
		final TfsmAlgebra<RepGraphvizExp, RepGraphvizExp, RepGraphvizExp, RepGraphvizExp, RepGraphvizExp, RepGraphvizExp> algGraphviz = new GraphvizTFSMAlgebra() {

		};
		final Map<java.lang.Integer, String> defaultTimedActions = new HashMap<Integer, String>();
		defaultTimedActions.put(3, "a");
		defaultTimedActions.put(7, "b");
		defaultTimedActions.put(9, "a");

		final TfsmAlgebra<Boolean, Void, CtxExecutableExp, ExecutableExp, ExecutableExp, ExecutableExp> algExec = new ExecutableTFSMAlgebra() {

			Map<Integer, String> timedActions = defaultTimedActions;

			@Override
			public Map<Integer, String> getTimedActions() {
				return this.timedActions;
			}

			Integer time = 0;

			@Override
			public void setTime(final Integer time) {
				this.time = time;
			}

			@Override
			public Integer getTime() {
				return this.time;
			}

			@Override
			public Queue<String> getUserinput() {
				throw new UnsupportedOperationException("TODO: auto-generated method stub");
			}

		};
		System.out.println(this.make(algGraphviz).result(new GraphvizRep()));
		this.make(algExec).execute();

	}

	private <A, B, C, D, E, F> D make(final TfsmAlgebra<A, B, C, D, E, F> f) {
		final FSM exp = this.createModel();

		return f.$(exp);
	}

	private FSM createModel() {
		final ResourceSetImpl resSet = new ResourceSetImpl();
		resSet.getResourceFactoryRegistry().getExtensionToFactoryMap().put("tfsm", new XMIResourceFactoryImpl());
		final TfsmPackage fsmPackage = TfsmPackage.eINSTANCE;
		// TODO: Replacing with System.getProperty("user.dir")
		final URI createURI = URI
				.createURI("/home/mleduc/dev/ecore/ecore-oa/fsm/fr.inria.diverse.tfsm.algebra3/model/TFSM1.tfsm");
		final Resource resource = resSet.getResource(createURI, true);
		return (FSM) resource.getContents().get(0);
	}

}
