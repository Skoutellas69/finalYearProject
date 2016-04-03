package finalYearName.diagram.providers.assistants;

import java.util.ArrayList;
import java.util.List;

import org.eclipse.core.runtime.IAdaptable;
import org.eclipse.gmf.runtime.diagram.ui.editparts.IGraphicalEditPart;
import org.eclipse.gmf.runtime.emf.type.core.IElementType;

/**
 * @generated
 */
public class MyModelingAssistantProviderOfGoalEditPart extends
		finalYearName.diagram.providers.MyModelingAssistantProvider {

	/**
	 * @generated
	 */
	@Override
	public List<IElementType> getRelTypesOnTarget(IAdaptable target) {
		IGraphicalEditPart targetEditPart = (IGraphicalEditPart) target
				.getAdapter(IGraphicalEditPart.class);
		return doGetRelTypesOnTarget((finalYearName.diagram.edit.parts.GoalEditPart) targetEditPart);
	}

	/**
	 * @generated
	 */
	public List<IElementType> doGetRelTypesOnTarget(
			finalYearName.diagram.edit.parts.GoalEditPart target) {
		List<IElementType> types = new ArrayList<IElementType>(1);
		types.add(finalYearName.diagram.providers.MyElementTypes.DependencyLink_4001);
		return types;
	}

	/**
	 * @generated
	 */
	@Override
	public List<IElementType> getTypesForSource(IAdaptable target,
			IElementType relationshipType) {
		IGraphicalEditPart targetEditPart = (IGraphicalEditPart) target
				.getAdapter(IGraphicalEditPart.class);
		return doGetTypesForSource(
				(finalYearName.diagram.edit.parts.GoalEditPart) targetEditPart,
				relationshipType);
	}

	/**
	 * @generated
	 */
	public List<IElementType> doGetTypesForSource(
			finalYearName.diagram.edit.parts.GoalEditPart target,
			IElementType relationshipType) {
		List<IElementType> types = new ArrayList<IElementType>();
		if (relationshipType == finalYearName.diagram.providers.MyElementTypes.DependencyLink_4001) {
			types.add(finalYearName.diagram.providers.MyElementTypes.Actor_2001);
		}
		return types;
	}

}
