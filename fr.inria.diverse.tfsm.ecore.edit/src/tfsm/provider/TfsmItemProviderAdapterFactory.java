/**
 */
package tfsm.provider;

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

import tfsm.util.TfsmAdapterFactory;

/**
 * This is the factory that is used to provide the interfaces needed to support Viewers.
 * The adapters generated by this factory convert EMF adapter notifications into calls to {@link #fireNotifyChanged fireNotifyChanged}.
 * The adapters also support Eclipse property sheets.
 * Note that most of the adapters are shared among multiple instances.
 * <!-- begin-user-doc -->
 * <!-- end-user-doc -->
 * @generated
 */
public class TfsmItemProviderAdapterFactory extends TfsmAdapterFactory implements ComposeableAdapterFactory, IChangeNotifier, IDisposable {
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
	public TfsmItemProviderAdapterFactory() {
		this.supportedTypes.add(IEditingDomainItemProvider.class);
		this.supportedTypes.add(IStructuredItemContentProvider.class);
		this.supportedTypes.add(ITreeItemContentProvider.class);
		this.supportedTypes.add(IItemLabelProvider.class);
		this.supportedTypes.add(IItemPropertySource.class);
	}

	/**
	 * This keeps track of the one adapter used for all {@link tfsm.TimedFSM} instances.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected TimedFSMItemProvider timedFSMItemProvider;

	/**
	 * This creates an adapter for a {@link tfsm.TimedFSM}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Adapter createTimedFSMAdapter() {
		if (this.timedFSMItemProvider == null) {
			this.timedFSMItemProvider = new TimedFSMItemProvider(this);
		}

		return this.timedFSMItemProvider;
	}

	/**
	 * This keeps track of the one adapter used for all {@link tfsm.TimedState} instances.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected TimedStateItemProvider timedStateItemProvider;

	/**
	 * This creates an adapter for a {@link tfsm.TimedState}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Adapter createTimedStateAdapter() {
		if (this.timedStateItemProvider == null) {
			this.timedStateItemProvider = new TimedStateItemProvider(this);
		}

		return this.timedStateItemProvider;
	}

	/**
	 * This keeps track of the one adapter used for all {@link tfsm.TimedTransition} instances.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected TimedTransitionItemProvider timedTransitionItemProvider;

	/**
	 * This creates an adapter for a {@link tfsm.TimedTransition}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Adapter createTimedTransitionAdapter() {
		if (this.timedTransitionItemProvider == null) {
			this.timedTransitionItemProvider = new TimedTransitionItemProvider(this);
		}

		return this.timedTransitionItemProvider;
	}

	/**
	 * This keeps track of the one adapter used for all {@link tfsm.Clock} instances.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected ClockItemProvider clockItemProvider;

	/**
	 * This creates an adapter for a {@link tfsm.Clock}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Adapter createClockAdapter() {
		if (this.clockItemProvider == null) {
			this.clockItemProvider = new ClockItemProvider(this);
		}

		return this.clockItemProvider;
	}

	/**
	 * This keeps track of the one adapter used for all {@link tfsm.ClockReset} instances.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected ClockResetItemProvider clockResetItemProvider;

	/**
	 * This creates an adapter for a {@link tfsm.ClockReset}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Adapter createClockResetAdapter() {
		if (this.clockResetItemProvider == null) {
			this.clockResetItemProvider = new ClockResetItemProvider(this);
		}

		return this.clockResetItemProvider;
	}

	/**
	 * This keeps track of the one adapter used for all {@link tfsm.LowerClockConstraint} instances.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected LowerClockConstraintItemProvider lowerClockConstraintItemProvider;

	/**
	 * This creates an adapter for a {@link tfsm.LowerClockConstraint}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Adapter createLowerClockConstraintAdapter() {
		if (this.lowerClockConstraintItemProvider == null) {
			this.lowerClockConstraintItemProvider = new LowerClockConstraintItemProvider(this);
		}

		return this.lowerClockConstraintItemProvider;
	}

	/**
	 * This keeps track of the one adapter used for all {@link tfsm.LowerEqualClockConstraint} instances.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected LowerEqualClockConstraintItemProvider lowerEqualClockConstraintItemProvider;

	/**
	 * This creates an adapter for a {@link tfsm.LowerEqualClockConstraint}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Adapter createLowerEqualClockConstraintAdapter() {
		if (this.lowerEqualClockConstraintItemProvider == null) {
			this.lowerEqualClockConstraintItemProvider = new LowerEqualClockConstraintItemProvider(this);
		}

		return this.lowerEqualClockConstraintItemProvider;
	}

	/**
	 * This keeps track of the one adapter used for all {@link tfsm.UpperClockConstraint} instances.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected UpperClockConstraintItemProvider upperClockConstraintItemProvider;

	/**
	 * This creates an adapter for a {@link tfsm.UpperClockConstraint}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Adapter createUpperClockConstraintAdapter() {
		if (this.upperClockConstraintItemProvider == null) {
			this.upperClockConstraintItemProvider = new UpperClockConstraintItemProvider(this);
		}

		return this.upperClockConstraintItemProvider;
	}

	/**
	 * This keeps track of the one adapter used for all {@link tfsm.UpperEqualClockConstraint} instances.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected UpperEqualClockConstraintItemProvider upperEqualClockConstraintItemProvider;

	/**
	 * This creates an adapter for a {@link tfsm.UpperEqualClockConstraint}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Adapter createUpperEqualClockConstraintAdapter() {
		if (this.upperEqualClockConstraintItemProvider == null) {
			this.upperEqualClockConstraintItemProvider = new UpperEqualClockConstraintItemProvider(this);
		}

		return this.upperEqualClockConstraintItemProvider;
	}

	/**
	 * This keeps track of the one adapter used for all {@link tfsm.AndClockConstraint} instances.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected AndClockConstraintItemProvider andClockConstraintItemProvider;

	/**
	 * This creates an adapter for a {@link tfsm.AndClockConstraint}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Adapter createAndClockConstraintAdapter() {
		if (this.andClockConstraintItemProvider == null) {
			this.andClockConstraintItemProvider = new AndClockConstraintItemProvider(this);
		}

		return this.andClockConstraintItemProvider;
	}

	/**
	 * This keeps track of the one adapter used for all {@link tfsm.OrClockConstraint} instances.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected OrClockConstraintItemProvider orClockConstraintItemProvider;

	/**
	 * This creates an adapter for a {@link tfsm.OrClockConstraint}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Adapter createOrClockConstraintAdapter() {
		if (this.orClockConstraintItemProvider == null) {
			this.orClockConstraintItemProvider = new OrClockConstraintItemProvider(this);
		}

		return this.orClockConstraintItemProvider;
	}

	/**
	 * This keeps track of the one adapter used for all {@link tfsm.TimedFinalState} instances.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected TimedFinalStateItemProvider timedFinalStateItemProvider;

	/**
	 * This creates an adapter for a {@link tfsm.TimedFinalState}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Adapter createTimedFinalStateAdapter() {
		if (this.timedFinalStateItemProvider == null) {
			this.timedFinalStateItemProvider = new TimedFinalStateItemProvider(this);
		}

		return this.timedFinalStateItemProvider;
	}

	/**
	 * This keeps track of the one adapter used for all {@link tfsm.TimedInitialState} instances.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected TimedInitialStateItemProvider timedInitialStateItemProvider;

	/**
	 * This creates an adapter for a {@link tfsm.TimedInitialState}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Adapter createTimedInitialStateAdapter() {
		if (this.timedInitialStateItemProvider == null) {
			this.timedInitialStateItemProvider = new TimedInitialStateItemProvider(this);
		}

		return this.timedInitialStateItemProvider;
	}

	/**
	 * This returns the root adapter factory that contains this factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public ComposeableAdapterFactory getRootAdapterFactory() {
		return this.parentAdapterFactory == null ? this : this.parentAdapterFactory.getRootAdapterFactory();
	}

	/**
	 * This sets the composed adapter factory that contains this factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setParentAdapterFactory(final ComposedAdapterFactory parentAdapterFactory) {
		this.parentAdapterFactory = parentAdapterFactory;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public boolean isFactoryForType(final Object type) {
		return this.supportedTypes.contains(type) || super.isFactoryForType(type);
	}

	/**
	 * This implementation substitutes the factory itself as the key for the adapter.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Adapter adapt(final Notifier notifier, final Object type) {
		return super.adapt(notifier, this);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object adapt(final Object object, final Object type) {
		if (this.isFactoryForType(type)) {
			final Object adapter = super.adapt(object, type);
			if (!(type instanceof Class<?>) || ((Class<?>)type).isInstance(adapter)) {
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
	@Override
	public void addListener(final INotifyChangedListener notifyChangedListener) {
		this.changeNotifier.addListener(notifyChangedListener);
	}

	/**
	 * This removes a listener.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void removeListener(final INotifyChangedListener notifyChangedListener) {
		this.changeNotifier.removeListener(notifyChangedListener);
	}

	/**
	 * This delegates to {@link #changeNotifier} and to {@link #parentAdapterFactory}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void fireNotifyChanged(final Notification notification) {
		this.changeNotifier.fireNotifyChanged(notification);

		if (this.parentAdapterFactory != null) {
			this.parentAdapterFactory.fireNotifyChanged(notification);
		}
	}

	/**
	 * This disposes all of the item providers created by this factory. 
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void dispose() {
		if (this.timedFSMItemProvider != null) {
			this.timedFSMItemProvider.dispose();
		}
		if (this.timedStateItemProvider != null) {
			this.timedStateItemProvider.dispose();
		}
		if (this.timedTransitionItemProvider != null) {
			this.timedTransitionItemProvider.dispose();
		}
		if (this.clockItemProvider != null) {
			this.clockItemProvider.dispose();
		}
		if (this.clockResetItemProvider != null) {
			this.clockResetItemProvider.dispose();
		}
		if (this.lowerClockConstraintItemProvider != null) {
			this.lowerClockConstraintItemProvider.dispose();
		}
		if (this.lowerEqualClockConstraintItemProvider != null) {
			this.lowerEqualClockConstraintItemProvider.dispose();
		}
		if (this.upperClockConstraintItemProvider != null) {
			this.upperClockConstraintItemProvider.dispose();
		}
		if (this.upperEqualClockConstraintItemProvider != null) {
			this.upperEqualClockConstraintItemProvider.dispose();
		}
		if (this.andClockConstraintItemProvider != null) {
			this.andClockConstraintItemProvider.dispose();
		}
		if (this.orClockConstraintItemProvider != null) {
			this.orClockConstraintItemProvider.dispose();
		}
		if (this.timedFinalStateItemProvider != null) {
			this.timedFinalStateItemProvider.dispose();
		}
		if (this.timedInitialStateItemProvider != null) {
			this.timedInitialStateItemProvider.dispose();
		}
	}

}