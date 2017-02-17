/**
 */
package expression.provider;


import expression.ExpressionFactory;
import expression.ExpressionPackage;
import expression.IntBinaryExpression;
import java.util.Collection;
import java.util.List;

import org.eclipse.emf.common.notify.AdapterFactory;
import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.ecore.EStructuralFeature;
import org.eclipse.emf.edit.provider.IItemPropertyDescriptor;
import org.eclipse.emf.edit.provider.ViewerNotification;

/**
 * This is the item provider adapter for a {@link expression.IntBinaryExpression} object.
 * <!-- begin-user-doc -->
 * <!-- end-user-doc -->
 * @generated
 */
public class IntBinaryExpressionItemProvider extends IntExpressionItemProvider {
	/**
	 * This constructs an instance from a factory and a notifier.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public IntBinaryExpressionItemProvider(final AdapterFactory adapterFactory) {
		super(adapterFactory);
	}

	/**
	 * This returns the property descriptors for the adapted class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public List<IItemPropertyDescriptor> getPropertyDescriptors(final Object object) {
		if (this.itemPropertyDescriptors == null) {
			super.getPropertyDescriptors(object);

		}
		return this.itemPropertyDescriptors;
	}

	/**
	 * This specifies how to implement {@link #getChildren} and is used to deduce an appropriate feature for an
	 * {@link org.eclipse.emf.edit.command.AddCommand}, {@link org.eclipse.emf.edit.command.RemoveCommand} or
	 * {@link org.eclipse.emf.edit.command.MoveCommand} in {@link #createCommand}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Collection<? extends EStructuralFeature> getChildrenFeatures(final Object object) {
		if (this.childrenFeatures == null) {
			super.getChildrenFeatures(object);
			this.childrenFeatures.add(ExpressionPackage.Literals.INT_BINARY_EXPRESSION__EXPRESSION1);
			this.childrenFeatures.add(ExpressionPackage.Literals.INT_BINARY_EXPRESSION__EXPRESSION2);
		}
		return this.childrenFeatures;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EStructuralFeature getChildFeature(final Object object, final Object child) {
		// Check the type of the specified child object and return the proper feature to use for
		// adding (see {@link AddCommand}) it as a child.

		return super.getChildFeature(object, child);
	}

	/**
	 * This returns IntBinaryExpression.gif.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object getImage(final Object object) {
		return this.overlayImage(object, this.getResourceLocator().getImage("full/obj16/IntBinaryExpression"));
	}

	/**
	 * This returns the label text for the adapted class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getText(final Object object) {
		return this.getString("_UI_IntBinaryExpression_type");
	}
	

	/**
	 * This handles model notifications by calling {@link #updateChildren} to update any cached
	 * children and by creating a viewer notification, which it passes to {@link #fireNotifyChanged}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void notifyChanged(final Notification notification) {
		this.updateChildren(notification);

		switch (notification.getFeatureID(IntBinaryExpression.class)) {
			case ExpressionPackage.INT_BINARY_EXPRESSION__EXPRESSION1:
			case ExpressionPackage.INT_BINARY_EXPRESSION__EXPRESSION2:
				this.fireNotifyChanged(new ViewerNotification(notification, notification.getNotifier(), true, false));
				return;
		}
		super.notifyChanged(notification);
	}

	/**
	 * This adds {@link org.eclipse.emf.edit.command.CommandParameter}s describing the children
	 * that can be created under this object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected void collectNewChildDescriptors(final Collection<Object> newChildDescriptors, final Object object) {
		super.collectNewChildDescriptors(newChildDescriptors, object);

		newChildDescriptors.add
			(this.createChildParameter
				(ExpressionPackage.Literals.INT_BINARY_EXPRESSION__EXPRESSION1,
				 ExpressionFactory.eINSTANCE.createIntAdd()));

		newChildDescriptors.add
			(this.createChildParameter
				(ExpressionPackage.Literals.INT_BINARY_EXPRESSION__EXPRESSION1,
				 ExpressionFactory.eINSTANCE.createIntMult()));

		newChildDescriptors.add
			(this.createChildParameter
				(ExpressionPackage.Literals.INT_BINARY_EXPRESSION__EXPRESSION1,
				 ExpressionFactory.eINSTANCE.createIntNeg()));

		newChildDescriptors.add
			(this.createChildParameter
				(ExpressionPackage.Literals.INT_BINARY_EXPRESSION__EXPRESSION1,
				 ExpressionFactory.eINSTANCE.createIntVarRef()));

		newChildDescriptors.add
			(this.createChildParameter
				(ExpressionPackage.Literals.INT_BINARY_EXPRESSION__EXPRESSION1,
				 ExpressionFactory.eINSTANCE.createConstExpr()));

		newChildDescriptors.add
			(this.createChildParameter
				(ExpressionPackage.Literals.INT_BINARY_EXPRESSION__EXPRESSION2,
				 ExpressionFactory.eINSTANCE.createIntAdd()));

		newChildDescriptors.add
			(this.createChildParameter
				(ExpressionPackage.Literals.INT_BINARY_EXPRESSION__EXPRESSION2,
				 ExpressionFactory.eINSTANCE.createIntMult()));

		newChildDescriptors.add
			(this.createChildParameter
				(ExpressionPackage.Literals.INT_BINARY_EXPRESSION__EXPRESSION2,
				 ExpressionFactory.eINSTANCE.createIntNeg()));

		newChildDescriptors.add
			(this.createChildParameter
				(ExpressionPackage.Literals.INT_BINARY_EXPRESSION__EXPRESSION2,
				 ExpressionFactory.eINSTANCE.createIntVarRef()));

		newChildDescriptors.add
			(this.createChildParameter
				(ExpressionPackage.Literals.INT_BINARY_EXPRESSION__EXPRESSION2,
				 ExpressionFactory.eINSTANCE.createConstExpr()));
	}

	/**
	 * This returns the label text for {@link org.eclipse.emf.edit.command.CreateChildCommand}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getCreateChildText(final Object owner, final Object feature, final Object child, final Collection<?> selection) {
		final Object childFeature = feature;
		final Object childObject = child;

		final boolean qualify =
			childFeature == ExpressionPackage.Literals.INT_BINARY_EXPRESSION__EXPRESSION1 ||
			childFeature == ExpressionPackage.Literals.INT_BINARY_EXPRESSION__EXPRESSION2;

		if (qualify) {
			return this.getString
				("_UI_CreateChild_text2",
				 new Object[] { this.getTypeText(childObject), this.getFeatureText(childFeature), this.getTypeText(owner) });
		}
		return super.getCreateChildText(owner, feature, child, selection);
	}

}
