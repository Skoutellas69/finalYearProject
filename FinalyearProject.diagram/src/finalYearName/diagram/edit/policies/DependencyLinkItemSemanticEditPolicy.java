package finalYearName.diagram.edit.policies;

import org.eclipse.gef.commands.Command;
import org.eclipse.gmf.runtime.emf.type.core.commands.DestroyElementCommand;
import org.eclipse.gmf.runtime.emf.type.core.requests.DestroyElementRequest;

/**
 * @generated
 */
public class DependencyLinkItemSemanticEditPolicy extends
		finalYearName.diagram.edit.policies.MyBaseItemSemanticEditPolicy {

	/**
	 * @generated
	 */
	public DependencyLinkItemSemanticEditPolicy() {
		super(
				finalYearName.diagram.providers.MyElementTypes.DependencyLink_4001);
	}

	/**
	 * @generated
	 */
	protected Command getDestroyElementCommand(DestroyElementRequest req) {
		return getGEFWrapper(new DestroyElementCommand(req));
	}

}
