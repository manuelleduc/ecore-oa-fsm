package fr.inria.diverse.gfsm.programs;

import java.util.HashMap;
import java.util.LinkedList;
import java.util.Map;
import java.util.Queue;

import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.common.util.URI;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.resource.Resource;
import org.eclipse.emf.ecore.resource.impl.ResourceSetImpl;
import org.eclipse.emf.ecore.xmi.impl.XMIResourceFactoryImpl;

import fr.inria.diverse.gfsm.impl.ExecutableGFSMAlgebra;
import fr.inria.diverse.gfsm.impl.GraphvizGFSMAlgebra;
import fr.inria.diverse.utils.GraphvizRep;
import gfsm.FSM;
import gfsm.GfsmPackage;
import gfsm.algebra.GfsmAlgebra;

public class Program1 {

	public static void main(final String[] args) {
		new Program1().execute("GFSM1.gfsm");
	}

	private void execute(final String progName) {
		final Queue<String> initUserInput = new LinkedList<>();
		initUserInput.add("t1");
		System.out.println(this.make(new GraphvizGFSMAlgebra() {
		}, progName).result(new GraphvizRep()));
		this.make(new ExecutableGFSMAlgebra() {

			private Map<String, Integer> ctx = new HashMap<>();
			private Queue<String> userinput = initUserInput;

			@Override
			public Queue<String> getUserinput() {
				return this.userinput;
			}

			@Override
			public void setCtx(final Map<String, Integer> ctx) {
				this.ctx = ctx;

			}

			@Override
			public Map<String, Integer> getCtx() {
				return this.ctx;
			}

		}, progName).execute();
	}

	private <A, B, F, C, D, E> F make(final GfsmAlgebra<A, B, F, C, D, E> graphvizGFSMAlgebra, final String progName) {
		final FSM model = this.createModel(progName);
		return graphvizGFSMAlgebra.$(model);
	}

	private FSM createModel(final String progName) {
		final ResourceSetImpl resSet = new ResourceSetImpl();
		resSet.getResourceFactoryRegistry().getExtensionToFactoryMap().put("gfsm", new XMIResourceFactoryImpl());
		final GfsmPackage gFsmPackage = GfsmPackage.eINSTANCE;
		// TODO: Replacing with System.getProperty("user.dir")
		final URI createURI = URI
				.createURI("/home/mleduc/dev/ecore/ecore-oa/fsm/fr.inria.diverse.gfsm.algebra/model/" + progName);
		final Resource resource = resSet.getResource(createURI, true);
		final EList<EObject> contents = resource.getContents();
		return (FSM) contents.get(0);
	}
}
