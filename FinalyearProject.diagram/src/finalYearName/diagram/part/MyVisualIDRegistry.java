package finalYearName.diagram.part;

import org.eclipse.core.runtime.Platform;
import org.eclipse.emf.ecore.EAnnotation;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.gmf.runtime.notation.Diagram;
import org.eclipse.gmf.runtime.notation.View;
import org.eclipse.gmf.tooling.runtime.structure.DiagramStructure;

/**
 * This registry is used to determine which type of visual object should be
 * created for the corresponding Diagram, Node, ChildNode or Link represented
 * by a domain model object.
 * 
 * @generated
 */
public class MyVisualIDRegistry {

	/**
	 * @generated
	 */
	private static final String DEBUG_KEY = "FinalyearProject.diagram/debug/visualID"; //$NON-NLS-1$

	/**
	 * @generated
	 */
	public static int getVisualID(View view) {
		if (view instanceof Diagram) {
			if (finalYearName.diagram.edit.parts.ModelEditPart.MODEL_ID
					.equals(view.getType())) {
				return finalYearName.diagram.edit.parts.ModelEditPart.VISUAL_ID;
			} else {
				return -1;
			}
		}
		return finalYearName.diagram.part.MyVisualIDRegistry.getVisualID(view
				.getType());
	}

	/**
	 * @generated
	 */
	public static String getModelID(View view) {
		View diagram = view.getDiagram();
		while (view != diagram) {
			EAnnotation annotation = view.getEAnnotation("Shortcut"); //$NON-NLS-1$
			if (annotation != null) {
				return (String) annotation.getDetails().get("modelID"); //$NON-NLS-1$
			}
			view = (View) view.eContainer();
		}
		return diagram != null ? diagram.getType() : null;
	}

	/**
	 * @generated
	 */
	public static int getVisualID(String type) {
		try {
			return Integer.parseInt(type);
		} catch (NumberFormatException e) {
			if (Boolean.TRUE.toString().equalsIgnoreCase(
					Platform.getDebugOption(DEBUG_KEY))) {
				finalYearName.diagram.part.MyDiagramEditorPlugin.getInstance()
						.logError(
								"Unable to parse view type as a visualID number: "
										+ type);
			}
		}
		return -1;
	}

	/**
	 * @generated
	 */
	public static String getType(int visualID) {
		return Integer.toString(visualID);
	}

	/**
	 * @generated
	 */
	public static int getDiagramVisualID(EObject domainElement) {
		if (domainElement == null) {
			return -1;
		}
		if (finalYearName.FinalYearNamePackage.eINSTANCE.getModel()
				.isSuperTypeOf(domainElement.eClass())
				&& isDiagram((finalYearName.Model) domainElement)) {
			return finalYearName.diagram.edit.parts.ModelEditPart.VISUAL_ID;
		}
		return -1;
	}

	/**
	 * @generated
	 */
	public static int getNodeVisualID(View containerView, EObject domainElement) {
		if (domainElement == null) {
			return -1;
		}
		String containerModelID = finalYearName.diagram.part.MyVisualIDRegistry
				.getModelID(containerView);
		if (!finalYearName.diagram.edit.parts.ModelEditPart.MODEL_ID
				.equals(containerModelID)) {
			return -1;
		}
		int containerVisualID;
		if (finalYearName.diagram.edit.parts.ModelEditPart.MODEL_ID
				.equals(containerModelID)) {
			containerVisualID = finalYearName.diagram.part.MyVisualIDRegistry
					.getVisualID(containerView);
		} else {
			if (containerView instanceof Diagram) {
				containerVisualID = finalYearName.diagram.edit.parts.ModelEditPart.VISUAL_ID;
			} else {
				return -1;
			}
		}
		switch (containerVisualID) {
		case finalYearName.diagram.edit.parts.ModelEditPart.VISUAL_ID:
			if (finalYearName.FinalYearNamePackage.eINSTANCE.getAttackMethod()
					.isSuperTypeOf(domainElement.eClass())) {
				return finalYearName.diagram.edit.parts.AttackMethodEditPart.VISUAL_ID;
			}
			if (finalYearName.FinalYearNamePackage.eINSTANCE.getOrganisation()
					.isSuperTypeOf(domainElement.eClass())) {
				return finalYearName.diagram.edit.parts.OrganisationEditPart.VISUAL_ID;
			}
			if (finalYearName.FinalYearNamePackage.eINSTANCE
					.getSecurityObjective().isSuperTypeOf(
							domainElement.eClass())) {
				return finalYearName.diagram.edit.parts.SecurityObjectiveEditPart.VISUAL_ID;
			}
			if (finalYearName.FinalYearNamePackage.eINSTANCE.getActor()
					.isSuperTypeOf(domainElement.eClass())) {
				return finalYearName.diagram.edit.parts.ActorEditPart.VISUAL_ID;
			}
			if (finalYearName.FinalYearNamePackage.eINSTANCE.getPlan()
					.isSuperTypeOf(domainElement.eClass())) {
				return finalYearName.diagram.edit.parts.PlanEditPart.VISUAL_ID;
			}
			if (finalYearName.FinalYearNamePackage.eINSTANCE.getThreat()
					.isSuperTypeOf(domainElement.eClass())) {
				return finalYearName.diagram.edit.parts.ThreatEditPart.VISUAL_ID;
			}
			if (finalYearName.FinalYearNamePackage.eINSTANCE.getAttacker()
					.isSuperTypeOf(domainElement.eClass())) {
				return finalYearName.diagram.edit.parts.AttackerEditPart.VISUAL_ID;
			}
			if (finalYearName.FinalYearNamePackage.eINSTANCE.getResource()
					.isSuperTypeOf(domainElement.eClass())) {
				return finalYearName.diagram.edit.parts.ResourceEditPart.VISUAL_ID;
			}
			if (finalYearName.FinalYearNamePackage.eINSTANCE.getGoal()
					.isSuperTypeOf(domainElement.eClass())) {
				return finalYearName.diagram.edit.parts.GoalEditPart.VISUAL_ID;
			}
			if (finalYearName.FinalYearNamePackage.eINSTANCE
					.getSecurityMechanism().isSuperTypeOf(
							domainElement.eClass())) {
				return finalYearName.diagram.edit.parts.SecurityMechanismEditPart.VISUAL_ID;
			}
			if (finalYearName.FinalYearNamePackage.eINSTANCE
					.getSecurityConstraint().isSuperTypeOf(
							domainElement.eClass())) {
				return finalYearName.diagram.edit.parts.SecurityConstraintEditPart.VISUAL_ID;
			}
			if (finalYearName.FinalYearNamePackage.eINSTANCE.getVulnerability()
					.isSuperTypeOf(domainElement.eClass())) {
				return finalYearName.diagram.edit.parts.VulnerabilityEditPart.VISUAL_ID;
			}
			if (finalYearName.FinalYearNamePackage.eINSTANCE.getSoftGoal()
					.isSuperTypeOf(domainElement.eClass())) {
				return finalYearName.diagram.edit.parts.SoftGoalEditPart.VISUAL_ID;
			}
			break;
		}
		return -1;
	}

	/**
	 * @generated
	 */
	public static boolean canCreateNode(View containerView, int nodeVisualID) {
		String containerModelID = finalYearName.diagram.part.MyVisualIDRegistry
				.getModelID(containerView);
		if (!finalYearName.diagram.edit.parts.ModelEditPart.MODEL_ID
				.equals(containerModelID)) {
			return false;
		}
		int containerVisualID;
		if (finalYearName.diagram.edit.parts.ModelEditPart.MODEL_ID
				.equals(containerModelID)) {
			containerVisualID = finalYearName.diagram.part.MyVisualIDRegistry
					.getVisualID(containerView);
		} else {
			if (containerView instanceof Diagram) {
				containerVisualID = finalYearName.diagram.edit.parts.ModelEditPart.VISUAL_ID;
			} else {
				return false;
			}
		}
		switch (containerVisualID) {
		case finalYearName.diagram.edit.parts.ModelEditPart.VISUAL_ID:
			if (finalYearName.diagram.edit.parts.AttackMethodEditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			if (finalYearName.diagram.edit.parts.OrganisationEditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			if (finalYearName.diagram.edit.parts.SecurityObjectiveEditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			if (finalYearName.diagram.edit.parts.ActorEditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			if (finalYearName.diagram.edit.parts.PlanEditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			if (finalYearName.diagram.edit.parts.ThreatEditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			if (finalYearName.diagram.edit.parts.AttackerEditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			if (finalYearName.diagram.edit.parts.ResourceEditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			if (finalYearName.diagram.edit.parts.GoalEditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			if (finalYearName.diagram.edit.parts.SecurityMechanismEditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			if (finalYearName.diagram.edit.parts.SecurityConstraintEditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			if (finalYearName.diagram.edit.parts.VulnerabilityEditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			if (finalYearName.diagram.edit.parts.SoftGoalEditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			break;
		}
		return false;
	}

	/**
	 * @generated
	 */
	public static int getLinkWithClassVisualID(EObject domainElement) {
		if (domainElement == null) {
			return -1;
		}
		if (finalYearName.FinalYearNamePackage.eINSTANCE.getDependencyLink()
				.isSuperTypeOf(domainElement.eClass())) {
			return finalYearName.diagram.edit.parts.DependencyLinkEditPart.VISUAL_ID;
		}
		return -1;
	}

	/**
	 * User can change implementation of this method to handle some specific
	 * situations not covered by default logic.
	 * 
	 * @generated
	 */
	private static boolean isDiagram(finalYearName.Model element) {
		return true;
	}

	/**
	 * @generated
	 */
	public static boolean checkNodeVisualID(View containerView,
			EObject domainElement, int candidate) {
		if (candidate == -1) {
			//unrecognized id is always bad
			return false;
		}
		int basic = getNodeVisualID(containerView, domainElement);
		return basic == candidate;
	}

	/**
	 * @generated
	 */
	public static boolean isCompartmentVisualID(int visualID) {
		return false;
	}

	/**
	 * @generated
	 */
	public static boolean isSemanticLeafVisualID(int visualID) {
		switch (visualID) {
		case finalYearName.diagram.edit.parts.ModelEditPart.VISUAL_ID:
			return false;
		case finalYearName.diagram.edit.parts.ActorEditPart.VISUAL_ID:
		case finalYearName.diagram.edit.parts.GoalEditPart.VISUAL_ID:
		case finalYearName.diagram.edit.parts.SecurityMechanismEditPart.VISUAL_ID:
		case finalYearName.diagram.edit.parts.PlanEditPart.VISUAL_ID:
		case finalYearName.diagram.edit.parts.ThreatEditPart.VISUAL_ID:
		case finalYearName.diagram.edit.parts.SecurityConstraintEditPart.VISUAL_ID:
		case finalYearName.diagram.edit.parts.SecurityObjectiveEditPart.VISUAL_ID:
		case finalYearName.diagram.edit.parts.AttackMethodEditPart.VISUAL_ID:
		case finalYearName.diagram.edit.parts.OrganisationEditPart.VISUAL_ID:
		case finalYearName.diagram.edit.parts.AttackerEditPart.VISUAL_ID:
		case finalYearName.diagram.edit.parts.ResourceEditPart.VISUAL_ID:
		case finalYearName.diagram.edit.parts.VulnerabilityEditPart.VISUAL_ID:
		case finalYearName.diagram.edit.parts.SoftGoalEditPart.VISUAL_ID:
			return true;
		default:
			break;
		}
		return false;
	}

	/**
	 * @generated
	 */
	public static final DiagramStructure TYPED_INSTANCE = new DiagramStructure() {
		/**
		 * @generated
		 */
		@Override
		public int getVisualID(View view) {
			return finalYearName.diagram.part.MyVisualIDRegistry
					.getVisualID(view);
		}

		/**
		 * @generated
		 */
		@Override
		public String getModelID(View view) {
			return finalYearName.diagram.part.MyVisualIDRegistry
					.getModelID(view);
		}

		/**
		 * @generated
		 */
		@Override
		public int getNodeVisualID(View containerView, EObject domainElement) {
			return finalYearName.diagram.part.MyVisualIDRegistry
					.getNodeVisualID(containerView, domainElement);
		}

		/**
		 * @generated
		 */
		@Override
		public boolean checkNodeVisualID(View containerView,
				EObject domainElement, int candidate) {
			return finalYearName.diagram.part.MyVisualIDRegistry
					.checkNodeVisualID(containerView, domainElement, candidate);
		}

		/**
		 * @generated
		 */
		@Override
		public boolean isCompartmentVisualID(int visualID) {
			return finalYearName.diagram.part.MyVisualIDRegistry
					.isCompartmentVisualID(visualID);
		}

		/**
		 * @generated
		 */
		@Override
		public boolean isSemanticLeafVisualID(int visualID) {
			return finalYearName.diagram.part.MyVisualIDRegistry
					.isSemanticLeafVisualID(visualID);
		}
	};

}
