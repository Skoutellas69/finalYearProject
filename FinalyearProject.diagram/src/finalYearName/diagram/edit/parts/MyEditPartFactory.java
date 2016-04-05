package finalYearName.diagram.edit.parts;

import org.eclipse.gef.EditPart;
import org.eclipse.gef.EditPartFactory;
import org.eclipse.gef.tools.CellEditorLocator;
import org.eclipse.gmf.runtime.diagram.ui.editparts.ITextAwareEditPart;
import org.eclipse.gmf.runtime.notation.View;
import org.eclipse.gmf.tooling.runtime.directedit.locator.CellEditorLocatorAccess;

/**
 * @generated
 */
public class MyEditPartFactory implements EditPartFactory {

	/**
	 * @generated
	 */
	public EditPart createEditPart(EditPart context, Object model) {
		if (model instanceof View) {
			View view = (View) model;
			switch (finalYearName.diagram.part.MyVisualIDRegistry
					.getVisualID(view)) {

			case finalYearName.diagram.edit.parts.ModelEditPart.VISUAL_ID:
				return new finalYearName.diagram.edit.parts.ModelEditPart(view);

			case finalYearName.diagram.edit.parts.AttackMethodEditPart.VISUAL_ID:
				return new finalYearName.diagram.edit.parts.AttackMethodEditPart(
						view);

			case finalYearName.diagram.edit.parts.OrganisationEditPart.VISUAL_ID:
				return new finalYearName.diagram.edit.parts.OrganisationEditPart(
						view);

			case finalYearName.diagram.edit.parts.SecurityObjectiveEditPart.VISUAL_ID:
				return new finalYearName.diagram.edit.parts.SecurityObjectiveEditPart(
						view);

			case finalYearName.diagram.edit.parts.ActorEditPart.VISUAL_ID:
				return new finalYearName.diagram.edit.parts.ActorEditPart(view);

			case finalYearName.diagram.edit.parts.PlanEditPart.VISUAL_ID:
				return new finalYearName.diagram.edit.parts.PlanEditPart(view);

			case finalYearName.diagram.edit.parts.ThreatEditPart.VISUAL_ID:
				return new finalYearName.diagram.edit.parts.ThreatEditPart(view);

			case finalYearName.diagram.edit.parts.AttackerEditPart.VISUAL_ID:
				return new finalYearName.diagram.edit.parts.AttackerEditPart(
						view);

			case finalYearName.diagram.edit.parts.ResourceEditPart.VISUAL_ID:
				return new finalYearName.diagram.edit.parts.ResourceEditPart(
						view);

			case finalYearName.diagram.edit.parts.GoalEditPart.VISUAL_ID:
				return new finalYearName.diagram.edit.parts.GoalEditPart(view);

			case finalYearName.diagram.edit.parts.SecurityMechanismEditPart.VISUAL_ID:
				return new finalYearName.diagram.edit.parts.SecurityMechanismEditPart(
						view);

			case finalYearName.diagram.edit.parts.SecurityConstraintEditPart.VISUAL_ID:
				return new finalYearName.diagram.edit.parts.SecurityConstraintEditPart(
						view);

			case finalYearName.diagram.edit.parts.VulnerabilityEditPart.VISUAL_ID:
				return new finalYearName.diagram.edit.parts.VulnerabilityEditPart(
						view);

			case finalYearName.diagram.edit.parts.SoftGoalEditPart.VISUAL_ID:
				return new finalYearName.diagram.edit.parts.SoftGoalEditPart(
						view);

			case finalYearName.diagram.edit.parts.DependencyLinkEditPart.VISUAL_ID:
				return new finalYearName.diagram.edit.parts.DependencyLinkEditPart(
						view);

			}
		}
		return createUnrecognizedEditPart(context, model);
	}

	/**
	 * @generated
	 */
	private EditPart createUnrecognizedEditPart(EditPart context, Object model) {
		// Handle creation of unrecognized child node EditParts here
		return null;
	}

	/**
	 * @generated
	 */
	public static CellEditorLocator getTextCellEditorLocator(
			ITextAwareEditPart source) {
		return CellEditorLocatorAccess.INSTANCE
				.getTextCellEditorLocator(source);
	}

}
