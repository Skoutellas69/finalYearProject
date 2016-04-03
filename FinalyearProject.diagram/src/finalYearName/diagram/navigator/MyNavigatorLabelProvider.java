package finalYearName.diagram.navigator;

import org.eclipse.gmf.runtime.emf.type.core.IElementType;
import org.eclipse.gmf.runtime.notation.View;
import org.eclipse.jface.resource.ImageDescriptor;
import org.eclipse.jface.resource.ImageRegistry;
import org.eclipse.jface.viewers.ITreePathLabelProvider;
import org.eclipse.jface.viewers.LabelProvider;
import org.eclipse.jface.viewers.TreePath;
import org.eclipse.jface.viewers.ViewerLabel;
import org.eclipse.swt.graphics.Image;
import org.eclipse.ui.IMemento;
import org.eclipse.ui.navigator.ICommonContentExtensionSite;
import org.eclipse.ui.navigator.ICommonLabelProvider;

/**
 * @generated
 */
public class MyNavigatorLabelProvider extends LabelProvider implements
		ICommonLabelProvider, ITreePathLabelProvider {

	/**
	 * @generated
	 */
	static {
		finalYearName.diagram.part.MyDiagramEditorPlugin
				.getInstance()
				.getImageRegistry()
				.put("Navigator?UnknownElement", ImageDescriptor.getMissingImageDescriptor()); //$NON-NLS-1$
		finalYearName.diagram.part.MyDiagramEditorPlugin
				.getInstance()
				.getImageRegistry()
				.put("Navigator?ImageNotFound", ImageDescriptor.getMissingImageDescriptor()); //$NON-NLS-1$
	}

	/**
	 * @generated
	 */
	public void updateLabel(ViewerLabel label, TreePath elementPath) {
		Object element = elementPath.getLastSegment();
		if (element instanceof finalYearName.diagram.navigator.MyNavigatorItem
				&& !isOwnView(((finalYearName.diagram.navigator.MyNavigatorItem) element)
						.getView())) {
			return;
		}
		label.setText(getText(element));
		label.setImage(getImage(element));
	}

	/**
	 * @generated
	 */
	public Image getImage(Object element) {
		if (element instanceof finalYearName.diagram.navigator.MyNavigatorGroup) {
			finalYearName.diagram.navigator.MyNavigatorGroup group = (finalYearName.diagram.navigator.MyNavigatorGroup) element;
			return finalYearName.diagram.part.MyDiagramEditorPlugin
					.getInstance().getBundledImage(group.getIcon());
		}

		if (element instanceof finalYearName.diagram.navigator.MyNavigatorItem) {
			finalYearName.diagram.navigator.MyNavigatorItem navigatorItem = (finalYearName.diagram.navigator.MyNavigatorItem) element;
			if (!isOwnView(navigatorItem.getView())) {
				return super.getImage(element);
			}
			return getImage(navigatorItem.getView());
		}

		return super.getImage(element);
	}

	/**
	 * @generated
	 */
	public Image getImage(View view) {
		switch (finalYearName.diagram.part.MyVisualIDRegistry.getVisualID(view)) {
		case finalYearName.diagram.edit.parts.ModelEditPart.VISUAL_ID:
			return getImage(
					"Navigator?Diagram?finalYearURI?Model", finalYearName.diagram.providers.MyElementTypes.Model_1000); //$NON-NLS-1$
		case finalYearName.diagram.edit.parts.ActorEditPart.VISUAL_ID:
			return getImage(
					"Navigator?TopLevelNode?finalYearURI?Actor", finalYearName.diagram.providers.MyElementTypes.Actor_2001); //$NON-NLS-1$
		case finalYearName.diagram.edit.parts.GoalEditPart.VISUAL_ID:
			return getImage(
					"Navigator?TopLevelNode?finalYearURI?Goal", finalYearName.diagram.providers.MyElementTypes.Goal_2002); //$NON-NLS-1$
		case finalYearName.diagram.edit.parts.SecurityMechanismEditPart.VISUAL_ID:
			return getImage(
					"Navigator?TopLevelNode?finalYearURI?SecurityMechanism", finalYearName.diagram.providers.MyElementTypes.SecurityMechanism_2003); //$NON-NLS-1$
		case finalYearName.diagram.edit.parts.PlanEditPart.VISUAL_ID:
			return getImage(
					"Navigator?TopLevelNode?finalYearURI?Plan", finalYearName.diagram.providers.MyElementTypes.Plan_2004); //$NON-NLS-1$
		case finalYearName.diagram.edit.parts.ThreatEditPart.VISUAL_ID:
			return getImage(
					"Navigator?TopLevelNode?finalYearURI?Threat", finalYearName.diagram.providers.MyElementTypes.Threat_2005); //$NON-NLS-1$
		case finalYearName.diagram.edit.parts.SecurityConstraintEditPart.VISUAL_ID:
			return getImage(
					"Navigator?TopLevelNode?finalYearURI?SecurityConstraint", finalYearName.diagram.providers.MyElementTypes.SecurityConstraint_2006); //$NON-NLS-1$
		case finalYearName.diagram.edit.parts.SecurityObjectiveEditPart.VISUAL_ID:
			return getImage(
					"Navigator?TopLevelNode?finalYearURI?SecurityObjective", finalYearName.diagram.providers.MyElementTypes.SecurityObjective_2007); //$NON-NLS-1$
		case finalYearName.diagram.edit.parts.DependencyLinkEditPart.VISUAL_ID:
			return getImage(
					"Navigator?Link?finalYearURI?DependencyLink", finalYearName.diagram.providers.MyElementTypes.DependencyLink_4001); //$NON-NLS-1$
		}
		return getImage("Navigator?UnknownElement", null); //$NON-NLS-1$
	}

	/**
	 * @generated
	 */
	private Image getImage(String key, IElementType elementType) {
		ImageRegistry imageRegistry = finalYearName.diagram.part.MyDiagramEditorPlugin
				.getInstance().getImageRegistry();
		Image image = imageRegistry.get(key);
		if (image == null
				&& elementType != null
				&& finalYearName.diagram.providers.MyElementTypes
						.isKnownElementType(elementType)) {
			image = finalYearName.diagram.providers.MyElementTypes
					.getImage(elementType);
			imageRegistry.put(key, image);
		}

		if (image == null) {
			image = imageRegistry.get("Navigator?ImageNotFound"); //$NON-NLS-1$
			imageRegistry.put(key, image);
		}
		return image;
	}

	/**
	 * @generated
	 */
	public String getText(Object element) {
		if (element instanceof finalYearName.diagram.navigator.MyNavigatorGroup) {
			finalYearName.diagram.navigator.MyNavigatorGroup group = (finalYearName.diagram.navigator.MyNavigatorGroup) element;
			return group.getGroupName();
		}

		if (element instanceof finalYearName.diagram.navigator.MyNavigatorItem) {
			finalYearName.diagram.navigator.MyNavigatorItem navigatorItem = (finalYearName.diagram.navigator.MyNavigatorItem) element;
			if (!isOwnView(navigatorItem.getView())) {
				return null;
			}
			return getText(navigatorItem.getView());
		}

		return super.getText(element);
	}

	/**
	 * @generated
	 */
	public String getText(View view) {
		if (view.getElement() != null && view.getElement().eIsProxy()) {
			return getUnresolvedDomainElementProxyText(view);
		}
		switch (finalYearName.diagram.part.MyVisualIDRegistry.getVisualID(view)) {
		case finalYearName.diagram.edit.parts.ModelEditPart.VISUAL_ID:
			return getModel_1000Text(view);
		case finalYearName.diagram.edit.parts.ActorEditPart.VISUAL_ID:
			return getActor_2001Text(view);
		case finalYearName.diagram.edit.parts.GoalEditPart.VISUAL_ID:
			return getGoal_2002Text(view);
		case finalYearName.diagram.edit.parts.SecurityMechanismEditPart.VISUAL_ID:
			return getSecurityMechanism_2003Text(view);
		case finalYearName.diagram.edit.parts.PlanEditPart.VISUAL_ID:
			return getPlan_2004Text(view);
		case finalYearName.diagram.edit.parts.ThreatEditPart.VISUAL_ID:
			return getThreat_2005Text(view);
		case finalYearName.diagram.edit.parts.SecurityConstraintEditPart.VISUAL_ID:
			return getSecurityConstraint_2006Text(view);
		case finalYearName.diagram.edit.parts.SecurityObjectiveEditPart.VISUAL_ID:
			return getSecurityObjective_2007Text(view);
		case finalYearName.diagram.edit.parts.DependencyLinkEditPart.VISUAL_ID:
			return getDependencyLink_4001Text(view);
		}
		return getUnknownElementText(view);
	}

	/**
	 * @generated
	 */
	private String getModel_1000Text(View view) {
		return ""; //$NON-NLS-1$
	}

	/**
	 * @generated
	 */
	private String getActor_2001Text(View view) {
		return ""; //$NON-NLS-1$
	}

	/**
	 * @generated
	 */
	private String getGoal_2002Text(View view) {
		return ""; //$NON-NLS-1$
	}

	/**
	 * @generated
	 */
	private String getSecurityMechanism_2003Text(View view) {
		return ""; //$NON-NLS-1$
	}

	/**
	 * @generated
	 */
	private String getPlan_2004Text(View view) {
		return ""; //$NON-NLS-1$
	}

	/**
	 * @generated
	 */
	private String getThreat_2005Text(View view) {
		return ""; //$NON-NLS-1$
	}

	/**
	 * @generated
	 */
	private String getSecurityConstraint_2006Text(View view) {
		return ""; //$NON-NLS-1$
	}

	/**
	 * @generated
	 */
	private String getSecurityObjective_2007Text(View view) {
		return ""; //$NON-NLS-1$
	}

	/**
	 * @generated
	 */
	private String getDependencyLink_4001Text(View view) {
		return ""; //$NON-NLS-1$
	}

	/**
	 * @generated
	 */
	private String getUnknownElementText(View view) {
		return "<UnknownElement Visual_ID = " + view.getType() + ">"; //$NON-NLS-1$  //$NON-NLS-2$
	}

	/**
	 * @generated
	 */
	private String getUnresolvedDomainElementProxyText(View view) {
		return "<Unresolved domain element Visual_ID = " + view.getType() + ">"; //$NON-NLS-1$  //$NON-NLS-2$
	}

	/**
	 * @generated
	 */
	public void init(ICommonContentExtensionSite aConfig) {
	}

	/**
	 * @generated
	 */
	public void restoreState(IMemento aMemento) {
	}

	/**
	 * @generated
	 */
	public void saveState(IMemento aMemento) {
	}

	/**
	 * @generated
	 */
	public String getDescription(Object anElement) {
		return null;
	}

	/**
	 * @generated
	 */
	private boolean isOwnView(View view) {
		return finalYearName.diagram.edit.parts.ModelEditPart.MODEL_ID
				.equals(finalYearName.diagram.part.MyVisualIDRegistry
						.getModelID(view));
	}

}
