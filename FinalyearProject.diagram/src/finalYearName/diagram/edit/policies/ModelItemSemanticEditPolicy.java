package finalYearName.diagram.edit.policies;

import org.eclipse.emf.transaction.TransactionalEditingDomain;
import org.eclipse.gef.commands.Command;
import org.eclipse.gmf.runtime.diagram.ui.editparts.IGraphicalEditPart;
import org.eclipse.gmf.runtime.emf.commands.core.commands.DuplicateEObjectsCommand;
import org.eclipse.gmf.runtime.emf.type.core.requests.CreateElementRequest;
import org.eclipse.gmf.runtime.emf.type.core.requests.DuplicateElementsRequest;

/**
 * @generated
 */
public class ModelItemSemanticEditPolicy extends
		finalYearName.diagram.edit.policies.MyBaseItemSemanticEditPolicy {

	/**
	 * @generated
	 */
	public ModelItemSemanticEditPolicy() {
		super(finalYearName.diagram.providers.MyElementTypes.Model_1000);
	}

	/**
	 * @generated
	 */
	protected Command getCreateCommand(CreateElementRequest req) {
		if (finalYearName.diagram.providers.MyElementTypes.Actor_2001 == req
				.getElementType()) {
			return getGEFWrapper(new finalYearName.diagram.edit.commands.ActorCreateCommand(
					req));
		}
		if (finalYearName.diagram.providers.MyElementTypes.SecurityConstraint_2006 == req
				.getElementType()) {
			return getGEFWrapper(new finalYearName.diagram.edit.commands.SecurityConstraintCreateCommand(
					req));
		}
		if (finalYearName.diagram.providers.MyElementTypes.Plan_2004 == req
				.getElementType()) {
			return getGEFWrapper(new finalYearName.diagram.edit.commands.PlanCreateCommand(
					req));
		}
		if (finalYearName.diagram.providers.MyElementTypes.Goal_2002 == req
				.getElementType()) {
			return getGEFWrapper(new finalYearName.diagram.edit.commands.GoalCreateCommand(
					req));
		}
		if (finalYearName.diagram.providers.MyElementTypes.Threat_2005 == req
				.getElementType()) {
			return getGEFWrapper(new finalYearName.diagram.edit.commands.ThreatCreateCommand(
					req));
		}
		if (finalYearName.diagram.providers.MyElementTypes.SecurityObjective_2007 == req
				.getElementType()) {
			return getGEFWrapper(new finalYearName.diagram.edit.commands.SecurityObjectiveCreateCommand(
					req));
		}
		if (finalYearName.diagram.providers.MyElementTypes.SecurityMechanism_2003 == req
				.getElementType()) {
			return getGEFWrapper(new finalYearName.diagram.edit.commands.SecurityMechanismCreateCommand(
					req));
		}
		return super.getCreateCommand(req);
	}

	/**
	 * @generated
	 */
	protected Command getDuplicateCommand(DuplicateElementsRequest req) {
		TransactionalEditingDomain editingDomain = ((IGraphicalEditPart) getHost())
				.getEditingDomain();
		return getGEFWrapper(new DuplicateAnythingCommand(editingDomain, req));
	}

	/**
	 * @generated
	 */
	private static class DuplicateAnythingCommand extends
			DuplicateEObjectsCommand {

		/**
		 * @generated
		 */
		public DuplicateAnythingCommand(
				TransactionalEditingDomain editingDomain,
				DuplicateElementsRequest req) {
			super(editingDomain, req.getLabel(), req
					.getElementsToBeDuplicated(), req
					.getAllDuplicatedElementsMap());
		}

	}

}
