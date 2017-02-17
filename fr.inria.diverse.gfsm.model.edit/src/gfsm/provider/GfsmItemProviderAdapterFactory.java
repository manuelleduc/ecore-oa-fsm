/**
 */
package gfsm.provider;

import gfsm.util.GfsmAdapterFactory;

import java.util.ArrayList;
import java.util.Collection;

import org.eclipse.emf.common.notify.Adapter;
import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.Notifier;

import org.eclipse.emf.edit.provider.ChangeNotifier;
import org.eclipse.emf.edit.provider.ComposeableAdapterFactory;
import org.eclipse.emf.edit.provider.ComposedAdapterFactory;
import org.eclipse.emf.edit.provider.IChangeNotifier;
import org.eclipse.emf.edit.provider.IDisposable;
import org.eclipse.emf.edit.provider.IEditingDomainItemProvider;
import org.eclipse.emf.edit.provider.IItemLabelProvider;
import org.eclipse.emf.edit.provider.IItemPropertySource;
import org.eclipse.emf.edit.provider.INotifyChangedListener;
import org.eclipse.emf.edit.provider.IStructuredItemContentProvider;
import org.eclipse.emf.edit.provider.ITreeItemContentProvider;

/**
 * This is the factory that is used to provide the interfaces needed to support Viewers.
 * The adapters generated by this factory convert EMF adapter notifications into calls to {@link #fireNotifyChanged fireNotifyChanged}.
 * The adapters also support Eclipse property sheets.
 * Note that most of the adapters are shared among multiple instances.
 * <!-- begin-user-doc -->
 * <!-- end-user-doc -->
 * @generated
 */
public class GfsmItemProviderAdapterFactory extends GfsmAdapterFactory implements ComposeableAdapterFactory, IChangeNotifier, IDisposable {
	/**
	 * This keeps track of the root adapter factory that delegates to this adapter factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected ComposedAdapterFactory parentAdapterFactory;

	/**
	 * This is used to implement {@link org.eclipse.emf.edit.provider.IChangeNotifier}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected IChangeNotifier changeNotifier = new ChangeNotifier();

	/**
	 * This keeps track of all the supported types checked by {@link #isFactoryForType isFactoryForType}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected Collection<Object> supportedTypes = new ArrayList<Object>();

	/**
	 * This constructs an instance.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public GfsmItemProviderAdapterFactory() {
		supportedTypes.add(IEditingDomainItemProvider.class);
		supportedTypes.add(IStructuredItemContentProvider.class);
		supportedTypes.add(ITreeItemContentProvider.class);
		supportedTypes.add(IItemLabelProvider.class);
		supportedTypes.add(IItemPropertySource.class);
	}

	/**
	 * This keeps track of the one adapter used for all {@link gfsm.Transition} instances.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected TransitionItemProvider transitionItemProvider;

	/**
	 * This creates an adapter for a {@link gfsm.Transition}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Adapter createTransitionAdapter() {
		if (transitionItemProvider == null) {
			transitionItemProvider = new TransitionItemProvider(this);
		}

		return transitionItemProvider;
	}

	/**
	 * This keeps track of the one adapter used for all {@link gfsm.State} instances.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected StateItemProvider stateItemProvider;

	/**
	 * This creates an adapter for a {@link gfsm.State}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Adapter createStateAdapter() {
		if (stateItemProvider == null) {
			stateItemProvider = new StateItemProvider(this);
		}

		return stateItemProvider;
	}

	/**
	 * This keeps track of the one adapter used for all {@link gfsm.FinalState} instances.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected FinalStateItemProvider finalStateItemProvider;

	/**
	 * This creates an adapter for a {@link gfsm.FinalState}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Adapter createFinalStateAdapter() {
		if (finalStateItemProvider == null) {
			finalStateItemProvider = new FinalStateItemProvider(this);
		}

		return finalStateItemProvider;
	}

	/**
	 * This keeps track of the one adapter used for all {@link gfsm.InitialState} instances.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected InitialStateItemProvider initialStateItemProvider;

	/**
	 * This creates an adapter for a {@link gfsm.InitialState}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Adapter createInitialStateAdapter() {
		if (initialStateItemProvider == null) {
			initialStateItemProvider = new InitialStateItemProvider(this);
		}

		return initialStateItemProvider;
	}

	/**
	 * This keeps track of the one adapter used for all {@link gfsm.FSM} instances.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected FSMItemProvider fsmItemProvider;

	/**
	 * This creates an adapter for a {@link gfsm.FSM}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Adapter createFSMAdapter() {
		if (fsmItemProvider == null) {
			fsmItemProvider = new FSMItemProvider(this);
		}

		return fsmItemProvider;
	}

	/**
	 * This keeps track of the one adapter used for all {@link gfsm.IntAdd} instances.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected IntAddItemProvider intAddItemProvider;

	/**
	 * This creates an adapter for a {@link gfsm.IntAdd}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Adapter createIntAddAdapter() {
		if (intAddItemProvider == null) {
			intAddItemProvider = new IntAddItemProvider(this);
		}

		return intAddItemProvider;
	}

	/**
	 * This keeps track of the one adapter used for all {@link gfsm.IntMult} instances.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected IntMultItemProvider intMultItemProvider;

	/**
	 * This creates an adapter for a {@link gfsm.IntMult}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Adapter createIntMultAdapter() {
		if (intMultItemProvider == null) {
			intMultItemProvider = new IntMultItemProvider(this);
		}

		return intMultItemProvider;
	}

	/**
	 * This keeps track of the one adapter used for all {@link gfsm.IntNeg} instances.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected IntNegItemProvider intNegItemProvider;

	/**
	 * This creates an adapter for a {@link gfsm.IntNeg}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Adapter createIntNegAdapter() {
		if (intNegItemProvider == null) {
			intNegItemProvider = new IntNegItemProvider(this);
		}

		return intNegItemProvider;
	}

	/**
	 * This keeps track of the one adapter used for all {@link gfsm.IntVarRef} instances.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected IntVarRefItemProvider intVarRefItemProvider;

	/**
	 * This creates an adapter for a {@link gfsm.IntVarRef}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Adapter createIntVarRefAdapter() {
		if (intVarRefItemProvider == null) {
			intVarRefItemProvider = new IntVarRefItemProvider(this);
		}

		return intVarRefItemProvider;
	}

	/**
	 * This keeps track of the one adapter used for all {@link gfsm.ConstExpr} instances.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected ConstExprItemProvider constExprItemProvider;

	/**
	 * This creates an adapter for a {@link gfsm.ConstExpr}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Adapter createConstExprAdapter() {
		if (constExprItemProvider == null) {
			constExprItemProvider = new ConstExprItemProvider(this);
		}

		return constExprItemProvider;
	}

	/**
	 * This keeps track of the one adapter used for all {@link gfsm.IntVarAssign} instances.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected IntVarAssignItemProvider intVarAssignItemProvider;

	/**
	 * This creates an adapter for a {@link gfsm.IntVarAssign}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Adapter createIntVarAssignAdapter() {
		if (intVarAssignItemProvider == null) {
			intVarAssignItemProvider = new IntVarAssignItemProvider(this);
		}

		return intVarAssignItemProvider;
	}

	/**
	 * This keeps track of the one adapter used for all {@link gfsm.IntBlock} instances.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected IntBlockItemProvider intBlockItemProvider;

	/**
	 * This creates an adapter for a {@link gfsm.IntBlock}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Adapter createIntBlockAdapter() {
		if (intBlockItemProvider == null) {
			intBlockItemProvider = new IntBlockItemProvider(this);
		}

		return intBlockItemProvider;
	}

	/**
	 * This keeps track of the one adapter used for all {@link gfsm.BooleanEqual} instances.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected BooleanEqualItemProvider booleanEqualItemProvider;

	/**
	 * This creates an adapter for a {@link gfsm.BooleanEqual}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Adapter createBooleanEqualAdapter() {
		if (booleanEqualItemProvider == null) {
			booleanEqualItemProvider = new BooleanEqualItemProvider(this);
		}

		return booleanEqualItemProvider;
	}

	/**
	 * This keeps track of the one adapter used for all {@link gfsm.BooleanOr} instances.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected BooleanOrItemProvider booleanOrItemProvider;

	/**
	 * This creates an adapter for a {@link gfsm.BooleanOr}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Adapter createBooleanOrAdapter() {
		if (booleanOrItemProvider == null) {
			booleanOrItemProvider = new BooleanOrItemProvider(this);
		}

		return booleanOrItemProvider;
	}

	/**
	 * This keeps track of the one adapter used for all {@link gfsm.BooleanAnd} instances.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected BooleanAndItemProvider booleanAndItemProvider;

	/**
	 * This creates an adapter for a {@link gfsm.BooleanAnd}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Adapter createBooleanAndAdapter() {
		if (booleanAndItemProvider == null) {
			booleanAndItemProvider = new BooleanAndItemProvider(this);
		}

		return booleanAndItemProvider;
	}

	/**
	 * This keeps track of the one adapter used for all {@link gfsm.BooleanGreaterThan} instances.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected BooleanGreaterThanItemProvider booleanGreaterThanItemProvider;

	/**
	 * This creates an adapter for a {@link gfsm.BooleanGreaterThan}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Adapter createBooleanGreaterThanAdapter() {
		if (booleanGreaterThanItemProvider == null) {
			booleanGreaterThanItemProvider = new BooleanGreaterThanItemProvider(this);
		}

		return booleanGreaterThanItemProvider;
	}

	/**
	 * This returns the root adapter factory that contains this factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ComposeableAdapterFactory getRootAdapterFactory() {
		return parentAdapterFactory == null ? this : parentAdapterFactory.getRootAdapterFactory();
	}

	/**
	 * This sets the composed adapter factory that contains this factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setParentAdapterFactory(ComposedAdapterFactory parentAdapterFactory) {
		this.parentAdapterFactory = parentAdapterFactory;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public boolean isFactoryForType(Object type) {
		return supportedTypes.contains(type) || super.isFactoryForType(type);
	}

	/**
	 * This implementation substitutes the factory itself as the key for the adapter.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Adapter adapt(Notifier notifier, Object type) {
		return super.adapt(notifier, this);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object adapt(Object object, Object type) {
		if (isFactoryForType(type)) {
			Object adapter = super.adapt(object, type);
			if (!(type instanceof Class<?>) || (((Class<?>)type).isInstance(adapter))) {
				return adapter;
			}
		}

		return null;
	}

	/**
	 * This adds a listener.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void addListener(INotifyChangedListener notifyChangedListener) {
		changeNotifier.addListener(notifyChangedListener);
	}

	/**
	 * This removes a listener.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void removeListener(INotifyChangedListener notifyChangedListener) {
		changeNotifier.removeListener(notifyChangedListener);
	}

	/**
	 * This delegates to {@link #changeNotifier} and to {@link #parentAdapterFactory}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void fireNotifyChanged(Notification notification) {
		changeNotifier.fireNotifyChanged(notification);

		if (parentAdapterFactory != null) {
			parentAdapterFactory.fireNotifyChanged(notification);
		}
	}

	/**
	 * This disposes all of the item providers created by this factory. 
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void dispose() {
		if (transitionItemProvider != null) transitionItemProvider.dispose();
		if (stateItemProvider != null) stateItemProvider.dispose();
		if (finalStateItemProvider != null) finalStateItemProvider.dispose();
		if (initialStateItemProvider != null) initialStateItemProvider.dispose();
		if (fsmItemProvider != null) fsmItemProvider.dispose();
		if (intAddItemProvider != null) intAddItemProvider.dispose();
		if (intMultItemProvider != null) intMultItemProvider.dispose();
		if (intNegItemProvider != null) intNegItemProvider.dispose();
		if (intVarRefItemProvider != null) intVarRefItemProvider.dispose();
		if (constExprItemProvider != null) constExprItemProvider.dispose();
		if (intVarAssignItemProvider != null) intVarAssignItemProvider.dispose();
		if (intBlockItemProvider != null) intBlockItemProvider.dispose();
		if (booleanEqualItemProvider != null) booleanEqualItemProvider.dispose();
		if (booleanOrItemProvider != null) booleanOrItemProvider.dispose();
		if (booleanAndItemProvider != null) booleanAndItemProvider.dispose();
		if (booleanGreaterThanItemProvider != null) booleanGreaterThanItemProvider.dispose();
	}

}
