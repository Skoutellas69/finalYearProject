package finalYearName.diagram.edit.commands;

import org.eclipse.core.commands.ExecutionException;
import org.eclipse.core.runtime.IAdaptable;
import org.eclipse.core.runtime.IProgressMonitor;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.gmf.runtime.common.core.command.CommandResult;
import org.eclipse.gmf.runtime.emf.type.core.commands.EditElementCommand;
import org.eclipse.gmf.runtime.emf.type.core.requests.ReorientRelationshipRequest;

/**
 * @generated
 */
public class DependencyLinkReorientCommand extends EditElementCommand {

	/**
	 * @generated
	 */
	private final int reorientDirection;

	/**
	 * @generated
	 */
	private final EObject oldEnd;

	/**
	 * @generated
	 */
	private final EObject newEnd;

	/**
	 * @generated
	 */
	public DependencyLinkReorientCommand(ReorientRelationshipRequest request) {
		super(request.getLabel(), request.getRelationship(), request);
		reorientDirection = request.getDirection();
		oldEnd = request.getOldRelationshipEnd();
		newEnd = request.getNewRelationshipEnd();
	}

	/**
	 * @generated
	 */
	public boolean canExecute() {
		if (false == getElementToEdit() instanceof finalYearName.DependencyLink) {
			return false;
		}
		if (reorientDirection == ReorientRelationshipRequest.REORIENT_SOURCE) {
			return canReorientSource();
		}
		if (reorientDirection == ReorientRelationshipRequest.REORIENT_TARGET) {
			return canReorientTarget();
		}
		return false;
	}

	/**
	 * @generated
	 */
	protected boolean canReorientSource() {
		if (!(oldEnd instanceof finalYearName.Actor && newEnd instanceof finalYearName.Actor)) {
			return false;
		}
		if (getLink().getToGoal().size() != 1) {
			return false;
		}
		finalYearName.Goal target = (finalYearName.Goal) getLink().getToGoal()
				.get(0);
		if (!(getLink().eContainer() instanceof finalYearName.Model)) {
			return false;
		}
		finalYearName.Model container = (finalYearName.Model) getLink()
				.eContainer();
		return finalYearName.diagram.edit.policies.MyBaseItemSemanticEditPolicy
				.getLinkConstraints().canExistDependencyLink_4001(container,
						getLink(), getNewSource(), target);
	}

	/**
	 * @generated
	 */
	protected boolean canReorientTarget() {
		if (!(oldEnd instanceof finalYearName.Goal && newEnd instanceof finalYearName.Goal)) {
			return false;
		}
		if (getLink().getFromActor().size() != 1) {
			return false;
		}
		finalYearName.Actor source = (finalYearName.Actor) getLink()
				.getFromActor().get(0);
		if (!(getLink().eContainer() instanceof finalYearName.Model)) {
			return false;
		}
		finalYearName.Model container = (finalYearName.Model) getLink()
				.eContainer();
		return finalYearName.diagram.edit.policies.MyBaseItemSemanticEditPolicy
				.getLinkConstraints().canExistDependencyLink_4001(container,
						getLink(), source, getNewTarget());
	}

	/**
	 * @generated
	 */
	protected CommandResult doExecuteWithResult(IProgressMonitor monitor,
			IAdaptable info) throws ExecutionException {
		if (!canExecute()) {
			throw new ExecutionException(
					"Invalid arguments in reorient link command"); //$NON-NLS-1$
		}
		if (reorientDirection == ReorientRelationshipRequest.REORIENT_SOURCE) {
			return reorientSource();
		}
		if (reorientDirection == ReorientRelationshipRequest.REORIENT_TARGET) {
			return reorientTarget();
		}
		throw new IllegalStateException();
	}

	/**
	 * @generated
	 */
	protected CommandResult reorientSource() throws ExecutionException {
		getLink().getFromActor().remove(getOldSource());
		getLink().getFromActor().add(getNewSource());
		return CommandResult.newOKCommandResult(getLink());
	}

	/**
	 * @generated
	 */
	protected CommandResult reorientTarget() throws ExecutionException {
		getLink().getToGoal().remove(getOldTarget());
		getLink().getToGoal().add(getNewTarget());
		return CommandResult.newOKCommandResult(getLink());
	}

	/**
	 * @generated
	 */
	protected finalYearName.DependencyLink getLink() {
		return (finalYearName.DependencyLink) getElementToEdit();
	}

	/**
	 * @generated
	 */
	protected finalYearName.Actor getOldSource() {
		return (finalYearName.Actor) oldEnd;
	}

	/**
	 * @generated
	 */
	protected finalYearName.Actor getNewSource() {
		return (finalYearName.Actor) newEnd;
	}

	/**
	 * @generated
	 */
	protected finalYearName.Goal getOldTarget() {
		return (finalYearName.Goal) oldEnd;
	}

	/**
	 * @generated
	 */
	protected finalYearName.Goal getNewTarget() {
		return (finalYearName.Goal) newEnd;
	}
}
