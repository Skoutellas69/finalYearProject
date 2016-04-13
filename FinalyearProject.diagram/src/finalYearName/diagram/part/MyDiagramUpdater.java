package finalYearName.diagram.part;

import java.util.Collection;
import java.util.Collections;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;

import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EStructuralFeature;
import org.eclipse.emf.ecore.util.EcoreUtil;
import org.eclipse.gmf.runtime.notation.View;
import org.eclipse.gmf.tooling.runtime.update.DiagramUpdater;

/**
 * @generated
 */
public class MyDiagramUpdater {

	/**
	 * @generated
	 */
	public static List<finalYearName.diagram.part.MyNodeDescriptor> getSemanticChildren(
			View view) {
		switch (finalYearName.diagram.part.MyVisualIDRegistry.getVisualID(view)) {
		case finalYearName.diagram.edit.parts.ModelEditPart.VISUAL_ID:
			return getModel_1000SemanticChildren(view);
		}
		return Collections.emptyList();
	}

	/**
	 * @generated
	 */
	public static List<finalYearName.diagram.part.MyNodeDescriptor> getModel_1000SemanticChildren(
			View view) {
		if (!view.isSetElement()) {
			return Collections.emptyList();
		}
		finalYearName.Model modelElement = (finalYearName.Model) view
				.getElement();
		LinkedList<finalYearName.diagram.part.MyNodeDescriptor> result = new LinkedList<finalYearName.diagram.part.MyNodeDescriptor>();
		for (Iterator<?> it = modelElement.getHasAttackMethod().iterator(); it
				.hasNext();) {
			finalYearName.AttackMethod childElement = (finalYearName.AttackMethod) it
					.next();
			int visualID = finalYearName.diagram.part.MyVisualIDRegistry
					.getNodeVisualID(view, childElement);
			if (visualID == finalYearName.diagram.edit.parts.AttackMethodEditPart.VISUAL_ID) {
				result.add(new finalYearName.diagram.part.MyNodeDescriptor(
						childElement, visualID));
				continue;
			}
		}
		for (Iterator<?> it = modelElement.getHasOrganisation().iterator(); it
				.hasNext();) {
			finalYearName.Organisation childElement = (finalYearName.Organisation) it
					.next();
			int visualID = finalYearName.diagram.part.MyVisualIDRegistry
					.getNodeVisualID(view, childElement);
			if (visualID == finalYearName.diagram.edit.parts.OrganisationEditPart.VISUAL_ID) {
				result.add(new finalYearName.diagram.part.MyNodeDescriptor(
						childElement, visualID));
				continue;
			}
		}
		for (Iterator<?> it = modelElement.getHasSecurityObjective().iterator(); it
				.hasNext();) {
			finalYearName.SecurityObjective childElement = (finalYearName.SecurityObjective) it
					.next();
			int visualID = finalYearName.diagram.part.MyVisualIDRegistry
					.getNodeVisualID(view, childElement);
			if (visualID == finalYearName.diagram.edit.parts.SecurityObjectiveEditPart.VISUAL_ID) {
				result.add(new finalYearName.diagram.part.MyNodeDescriptor(
						childElement, visualID));
				continue;
			}
		}
		for (Iterator<?> it = modelElement.getHasActor().iterator(); it
				.hasNext();) {
			finalYearName.Actor childElement = (finalYearName.Actor) it.next();
			int visualID = finalYearName.diagram.part.MyVisualIDRegistry
					.getNodeVisualID(view, childElement);
			if (visualID == finalYearName.diagram.edit.parts.ActorEditPart.VISUAL_ID) {
				result.add(new finalYearName.diagram.part.MyNodeDescriptor(
						childElement, visualID));
				continue;
			}
		}
		for (Iterator<?> it = modelElement.getHasPlan().iterator(); it
				.hasNext();) {
			finalYearName.Plan childElement = (finalYearName.Plan) it.next();
			int visualID = finalYearName.diagram.part.MyVisualIDRegistry
					.getNodeVisualID(view, childElement);
			if (visualID == finalYearName.diagram.edit.parts.PlanEditPart.VISUAL_ID) {
				result.add(new finalYearName.diagram.part.MyNodeDescriptor(
						childElement, visualID));
				continue;
			}
		}
		for (Iterator<?> it = modelElement.getHasThreat().iterator(); it
				.hasNext();) {
			finalYearName.Threat childElement = (finalYearName.Threat) it
					.next();
			int visualID = finalYearName.diagram.part.MyVisualIDRegistry
					.getNodeVisualID(view, childElement);
			if (visualID == finalYearName.diagram.edit.parts.ThreatEditPart.VISUAL_ID) {
				result.add(new finalYearName.diagram.part.MyNodeDescriptor(
						childElement, visualID));
				continue;
			}
		}
		for (Iterator<?> it = modelElement.getHasAttacker().iterator(); it
				.hasNext();) {
			finalYearName.Attacker childElement = (finalYearName.Attacker) it
					.next();
			int visualID = finalYearName.diagram.part.MyVisualIDRegistry
					.getNodeVisualID(view, childElement);
			if (visualID == finalYearName.diagram.edit.parts.AttackerEditPart.VISUAL_ID) {
				result.add(new finalYearName.diagram.part.MyNodeDescriptor(
						childElement, visualID));
				continue;
			}
		}
		for (Iterator<?> it = modelElement.getHasResource().iterator(); it
				.hasNext();) {
			finalYearName.Resource childElement = (finalYearName.Resource) it
					.next();
			int visualID = finalYearName.diagram.part.MyVisualIDRegistry
					.getNodeVisualID(view, childElement);
			if (visualID == finalYearName.diagram.edit.parts.ResourceEditPart.VISUAL_ID) {
				result.add(new finalYearName.diagram.part.MyNodeDescriptor(
						childElement, visualID));
				continue;
			}
		}
		for (Iterator<?> it = modelElement.getHasGoal().iterator(); it
				.hasNext();) {
			finalYearName.Goal childElement = (finalYearName.Goal) it.next();
			int visualID = finalYearName.diagram.part.MyVisualIDRegistry
					.getNodeVisualID(view, childElement);
			if (visualID == finalYearName.diagram.edit.parts.GoalEditPart.VISUAL_ID) {
				result.add(new finalYearName.diagram.part.MyNodeDescriptor(
						childElement, visualID));
				continue;
			}
		}
		for (Iterator<?> it = modelElement.getHasSecurityMechanism().iterator(); it
				.hasNext();) {
			finalYearName.SecurityMechanism childElement = (finalYearName.SecurityMechanism) it
					.next();
			int visualID = finalYearName.diagram.part.MyVisualIDRegistry
					.getNodeVisualID(view, childElement);
			if (visualID == finalYearName.diagram.edit.parts.SecurityMechanismEditPart.VISUAL_ID) {
				result.add(new finalYearName.diagram.part.MyNodeDescriptor(
						childElement, visualID));
				continue;
			}
		}
		for (Iterator<?> it = modelElement.getHasSecurityConstraint()
				.iterator(); it.hasNext();) {
			finalYearName.SecurityConstraint childElement = (finalYearName.SecurityConstraint) it
					.next();
			int visualID = finalYearName.diagram.part.MyVisualIDRegistry
					.getNodeVisualID(view, childElement);
			if (visualID == finalYearName.diagram.edit.parts.SecurityConstraintEditPart.VISUAL_ID) {
				result.add(new finalYearName.diagram.part.MyNodeDescriptor(
						childElement, visualID));
				continue;
			}
		}
		for (Iterator<?> it = modelElement.getNewEReference().iterator(); it
				.hasNext();) {
			finalYearName.Vulnerability childElement = (finalYearName.Vulnerability) it
					.next();
			int visualID = finalYearName.diagram.part.MyVisualIDRegistry
					.getNodeVisualID(view, childElement);
			if (visualID == finalYearName.diagram.edit.parts.VulnerabilityEditPart.VISUAL_ID) {
				result.add(new finalYearName.diagram.part.MyNodeDescriptor(
						childElement, visualID));
				continue;
			}
		}
		for (Iterator<?> it = modelElement.getHasSoftGoal().iterator(); it
				.hasNext();) {
			finalYearName.SoftGoal childElement = (finalYearName.SoftGoal) it
					.next();
			int visualID = finalYearName.diagram.part.MyVisualIDRegistry
					.getNodeVisualID(view, childElement);
			if (visualID == finalYearName.diagram.edit.parts.SoftGoalEditPart.VISUAL_ID) {
				result.add(new finalYearName.diagram.part.MyNodeDescriptor(
						childElement, visualID));
				continue;
			}
		}
		return result;
	}

	/**
	 * @generated
	 */
	public static List<finalYearName.diagram.part.MyLinkDescriptor> getContainedLinks(
			View view) {
		switch (finalYearName.diagram.part.MyVisualIDRegistry.getVisualID(view)) {
		case finalYearName.diagram.edit.parts.ModelEditPart.VISUAL_ID:
			return getModel_1000ContainedLinks(view);
		case finalYearName.diagram.edit.parts.AttackMethodEditPart.VISUAL_ID:
			return getAttackMethod_2008ContainedLinks(view);
		case finalYearName.diagram.edit.parts.OrganisationEditPart.VISUAL_ID:
			return getOrganisation_2009ContainedLinks(view);
		case finalYearName.diagram.edit.parts.SecurityObjectiveEditPart.VISUAL_ID:
			return getSecurityObjective_2007ContainedLinks(view);
		case finalYearName.diagram.edit.parts.ActorEditPart.VISUAL_ID:
			return getActor_2001ContainedLinks(view);
		case finalYearName.diagram.edit.parts.PlanEditPart.VISUAL_ID:
			return getPlan_2004ContainedLinks(view);
		case finalYearName.diagram.edit.parts.ThreatEditPart.VISUAL_ID:
			return getThreat_2005ContainedLinks(view);
		case finalYearName.diagram.edit.parts.AttackerEditPart.VISUAL_ID:
			return getAttacker_2010ContainedLinks(view);
		case finalYearName.diagram.edit.parts.ResourceEditPart.VISUAL_ID:
			return getResource_2011ContainedLinks(view);
		case finalYearName.diagram.edit.parts.GoalEditPart.VISUAL_ID:
			return getGoal_2002ContainedLinks(view);
		case finalYearName.diagram.edit.parts.SecurityMechanismEditPart.VISUAL_ID:
			return getSecurityMechanism_2003ContainedLinks(view);
		case finalYearName.diagram.edit.parts.SecurityConstraintEditPart.VISUAL_ID:
			return getSecurityConstraint_2006ContainedLinks(view);
		case finalYearName.diagram.edit.parts.VulnerabilityEditPart.VISUAL_ID:
			return getVulnerability_2012ContainedLinks(view);
		case finalYearName.diagram.edit.parts.SoftGoalEditPart.VISUAL_ID:
			return getSoftGoal_2013ContainedLinks(view);
		case finalYearName.diagram.edit.parts.DependencyLinkEditPart.VISUAL_ID:
			return getDependencyLink_4001ContainedLinks(view);
		}
		return Collections.emptyList();
	}

	/**
	 * @generated
	 */
	public static List<finalYearName.diagram.part.MyLinkDescriptor> getIncomingLinks(
			View view) {
		switch (finalYearName.diagram.part.MyVisualIDRegistry.getVisualID(view)) {
		case finalYearName.diagram.edit.parts.AttackMethodEditPart.VISUAL_ID:
			return getAttackMethod_2008IncomingLinks(view);
		case finalYearName.diagram.edit.parts.OrganisationEditPart.VISUAL_ID:
			return getOrganisation_2009IncomingLinks(view);
		case finalYearName.diagram.edit.parts.SecurityObjectiveEditPart.VISUAL_ID:
			return getSecurityObjective_2007IncomingLinks(view);
		case finalYearName.diagram.edit.parts.ActorEditPart.VISUAL_ID:
			return getActor_2001IncomingLinks(view);
		case finalYearName.diagram.edit.parts.PlanEditPart.VISUAL_ID:
			return getPlan_2004IncomingLinks(view);
		case finalYearName.diagram.edit.parts.ThreatEditPart.VISUAL_ID:
			return getThreat_2005IncomingLinks(view);
		case finalYearName.diagram.edit.parts.AttackerEditPart.VISUAL_ID:
			return getAttacker_2010IncomingLinks(view);
		case finalYearName.diagram.edit.parts.ResourceEditPart.VISUAL_ID:
			return getResource_2011IncomingLinks(view);
		case finalYearName.diagram.edit.parts.GoalEditPart.VISUAL_ID:
			return getGoal_2002IncomingLinks(view);
		case finalYearName.diagram.edit.parts.SecurityMechanismEditPart.VISUAL_ID:
			return getSecurityMechanism_2003IncomingLinks(view);
		case finalYearName.diagram.edit.parts.SecurityConstraintEditPart.VISUAL_ID:
			return getSecurityConstraint_2006IncomingLinks(view);
		case finalYearName.diagram.edit.parts.VulnerabilityEditPart.VISUAL_ID:
			return getVulnerability_2012IncomingLinks(view);
		case finalYearName.diagram.edit.parts.SoftGoalEditPart.VISUAL_ID:
			return getSoftGoal_2013IncomingLinks(view);
		case finalYearName.diagram.edit.parts.DependencyLinkEditPart.VISUAL_ID:
			return getDependencyLink_4001IncomingLinks(view);
		}
		return Collections.emptyList();
	}

	/**
	 * @generated
	 */
	public static List<finalYearName.diagram.part.MyLinkDescriptor> getOutgoingLinks(
			View view) {
		switch (finalYearName.diagram.part.MyVisualIDRegistry.getVisualID(view)) {
		case finalYearName.diagram.edit.parts.AttackMethodEditPart.VISUAL_ID:
			return getAttackMethod_2008OutgoingLinks(view);
		case finalYearName.diagram.edit.parts.OrganisationEditPart.VISUAL_ID:
			return getOrganisation_2009OutgoingLinks(view);
		case finalYearName.diagram.edit.parts.SecurityObjectiveEditPart.VISUAL_ID:
			return getSecurityObjective_2007OutgoingLinks(view);
		case finalYearName.diagram.edit.parts.ActorEditPart.VISUAL_ID:
			return getActor_2001OutgoingLinks(view);
		case finalYearName.diagram.edit.parts.PlanEditPart.VISUAL_ID:
			return getPlan_2004OutgoingLinks(view);
		case finalYearName.diagram.edit.parts.ThreatEditPart.VISUAL_ID:
			return getThreat_2005OutgoingLinks(view);
		case finalYearName.diagram.edit.parts.AttackerEditPart.VISUAL_ID:
			return getAttacker_2010OutgoingLinks(view);
		case finalYearName.diagram.edit.parts.ResourceEditPart.VISUAL_ID:
			return getResource_2011OutgoingLinks(view);
		case finalYearName.diagram.edit.parts.GoalEditPart.VISUAL_ID:
			return getGoal_2002OutgoingLinks(view);
		case finalYearName.diagram.edit.parts.SecurityMechanismEditPart.VISUAL_ID:
			return getSecurityMechanism_2003OutgoingLinks(view);
		case finalYearName.diagram.edit.parts.SecurityConstraintEditPart.VISUAL_ID:
			return getSecurityConstraint_2006OutgoingLinks(view);
		case finalYearName.diagram.edit.parts.VulnerabilityEditPart.VISUAL_ID:
			return getVulnerability_2012OutgoingLinks(view);
		case finalYearName.diagram.edit.parts.SoftGoalEditPart.VISUAL_ID:
			return getSoftGoal_2013OutgoingLinks(view);
		case finalYearName.diagram.edit.parts.DependencyLinkEditPart.VISUAL_ID:
			return getDependencyLink_4001OutgoingLinks(view);
		}
		return Collections.emptyList();
	}

	/**
	 * @generated
	 */
	public static List<finalYearName.diagram.part.MyLinkDescriptor> getModel_1000ContainedLinks(
			View view) {
		finalYearName.Model modelElement = (finalYearName.Model) view
				.getElement();
		LinkedList<finalYearName.diagram.part.MyLinkDescriptor> result = new LinkedList<finalYearName.diagram.part.MyLinkDescriptor>();
		result.addAll(getContainedTypeModelFacetLinks_DependencyLink_4001(modelElement));
		return result;
	}

	/**
	 * @generated
	 */
	public static List<finalYearName.diagram.part.MyLinkDescriptor> getAttackMethod_2008ContainedLinks(
			View view) {
		return Collections.emptyList();
	}

	/**
	 * @generated
	 */
	public static List<finalYearName.diagram.part.MyLinkDescriptor> getOrganisation_2009ContainedLinks(
			View view) {
		return Collections.emptyList();
	}

	/**
	 * @generated
	 */
	public static List<finalYearName.diagram.part.MyLinkDescriptor> getSecurityObjective_2007ContainedLinks(
			View view) {
		return Collections.emptyList();
	}

	/**
	 * @generated
	 */
	public static List<finalYearName.diagram.part.MyLinkDescriptor> getActor_2001ContainedLinks(
			View view) {
		return Collections.emptyList();
	}

	/**
	 * @generated
	 */
	public static List<finalYearName.diagram.part.MyLinkDescriptor> getPlan_2004ContainedLinks(
			View view) {
		return Collections.emptyList();
	}

	/**
	 * @generated
	 */
	public static List<finalYearName.diagram.part.MyLinkDescriptor> getThreat_2005ContainedLinks(
			View view) {
		return Collections.emptyList();
	}

	/**
	 * @generated
	 */
	public static List<finalYearName.diagram.part.MyLinkDescriptor> getAttacker_2010ContainedLinks(
			View view) {
		return Collections.emptyList();
	}

	/**
	 * @generated
	 */
	public static List<finalYearName.diagram.part.MyLinkDescriptor> getResource_2011ContainedLinks(
			View view) {
		return Collections.emptyList();
	}

	/**
	 * @generated
	 */
	public static List<finalYearName.diagram.part.MyLinkDescriptor> getGoal_2002ContainedLinks(
			View view) {
		return Collections.emptyList();
	}

	/**
	 * @generated
	 */
	public static List<finalYearName.diagram.part.MyLinkDescriptor> getSecurityMechanism_2003ContainedLinks(
			View view) {
		return Collections.emptyList();
	}

	/**
	 * @generated
	 */
	public static List<finalYearName.diagram.part.MyLinkDescriptor> getSecurityConstraint_2006ContainedLinks(
			View view) {
		return Collections.emptyList();
	}

	/**
	 * @generated
	 */
	public static List<finalYearName.diagram.part.MyLinkDescriptor> getVulnerability_2012ContainedLinks(
			View view) {
		return Collections.emptyList();
	}

	/**
	 * @generated
	 */
	public static List<finalYearName.diagram.part.MyLinkDescriptor> getSoftGoal_2013ContainedLinks(
			View view) {
		return Collections.emptyList();
	}

	/**
	 * @generated
	 */
	public static List<finalYearName.diagram.part.MyLinkDescriptor> getDependencyLink_4001ContainedLinks(
			View view) {
		return Collections.emptyList();
	}

	/**
	 * @generated
	 */
	public static List<finalYearName.diagram.part.MyLinkDescriptor> getAttackMethod_2008IncomingLinks(
			View view) {
		return Collections.emptyList();
	}

	/**
	 * @generated
	 */
	public static List<finalYearName.diagram.part.MyLinkDescriptor> getOrganisation_2009IncomingLinks(
			View view) {
		return Collections.emptyList();
	}

	/**
	 * @generated
	 */
	public static List<finalYearName.diagram.part.MyLinkDescriptor> getSecurityObjective_2007IncomingLinks(
			View view) {
		return Collections.emptyList();
	}

	/**
	 * @generated
	 */
	public static List<finalYearName.diagram.part.MyLinkDescriptor> getActor_2001IncomingLinks(
			View view) {
		return Collections.emptyList();
	}

	/**
	 * @generated
	 */
	public static List<finalYearName.diagram.part.MyLinkDescriptor> getPlan_2004IncomingLinks(
			View view) {
		return Collections.emptyList();
	}

	/**
	 * @generated
	 */
	public static List<finalYearName.diagram.part.MyLinkDescriptor> getThreat_2005IncomingLinks(
			View view) {
		return Collections.emptyList();
	}

	/**
	 * @generated
	 */
	public static List<finalYearName.diagram.part.MyLinkDescriptor> getAttacker_2010IncomingLinks(
			View view) {
		return Collections.emptyList();
	}

	/**
	 * @generated
	 */
	public static List<finalYearName.diagram.part.MyLinkDescriptor> getResource_2011IncomingLinks(
			View view) {
		return Collections.emptyList();
	}

	/**
	 * @generated
	 */
	public static List<finalYearName.diagram.part.MyLinkDescriptor> getGoal_2002IncomingLinks(
			View view) {
		finalYearName.Goal modelElement = (finalYearName.Goal) view
				.getElement();
		Map<EObject, Collection<EStructuralFeature.Setting>> crossReferences = EcoreUtil.CrossReferencer
				.find(view.eResource().getResourceSet().getResources());
		LinkedList<finalYearName.diagram.part.MyLinkDescriptor> result = new LinkedList<finalYearName.diagram.part.MyLinkDescriptor>();
		result.addAll(getIncomingTypeModelFacetLinks_DependencyLink_4001(
				modelElement, crossReferences));
		return result;
	}

	/**
	 * @generated
	 */
	public static List<finalYearName.diagram.part.MyLinkDescriptor> getSecurityMechanism_2003IncomingLinks(
			View view) {
		return Collections.emptyList();
	}

	/**
	 * @generated
	 */
	public static List<finalYearName.diagram.part.MyLinkDescriptor> getSecurityConstraint_2006IncomingLinks(
			View view) {
		return Collections.emptyList();
	}

	/**
	 * @generated
	 */
	public static List<finalYearName.diagram.part.MyLinkDescriptor> getVulnerability_2012IncomingLinks(
			View view) {
		return Collections.emptyList();
	}

	/**
	 * @generated
	 */
	public static List<finalYearName.diagram.part.MyLinkDescriptor> getSoftGoal_2013IncomingLinks(
			View view) {
		return Collections.emptyList();
	}

	/**
	 * @generated
	 */
	public static List<finalYearName.diagram.part.MyLinkDescriptor> getDependencyLink_4001IncomingLinks(
			View view) {
		return Collections.emptyList();
	}

	/**
	 * @generated
	 */
	public static List<finalYearName.diagram.part.MyLinkDescriptor> getAttackMethod_2008OutgoingLinks(
			View view) {
		return Collections.emptyList();
	}

	/**
	 * @generated
	 */
	public static List<finalYearName.diagram.part.MyLinkDescriptor> getOrganisation_2009OutgoingLinks(
			View view) {
		return Collections.emptyList();
	}

	/**
	 * @generated
	 */
	public static List<finalYearName.diagram.part.MyLinkDescriptor> getSecurityObjective_2007OutgoingLinks(
			View view) {
		return Collections.emptyList();
	}

	/**
	 * @generated
	 */
	public static List<finalYearName.diagram.part.MyLinkDescriptor> getActor_2001OutgoingLinks(
			View view) {
		finalYearName.Actor modelElement = (finalYearName.Actor) view
				.getElement();
		LinkedList<finalYearName.diagram.part.MyLinkDescriptor> result = new LinkedList<finalYearName.diagram.part.MyLinkDescriptor>();
		result.addAll(getOutgoingTypeModelFacetLinks_DependencyLink_4001(modelElement));
		return result;
	}

	/**
	 * @generated
	 */
	public static List<finalYearName.diagram.part.MyLinkDescriptor> getPlan_2004OutgoingLinks(
			View view) {
		return Collections.emptyList();
	}

	/**
	 * @generated
	 */
	public static List<finalYearName.diagram.part.MyLinkDescriptor> getThreat_2005OutgoingLinks(
			View view) {
		return Collections.emptyList();
	}

	/**
	 * @generated
	 */
	public static List<finalYearName.diagram.part.MyLinkDescriptor> getAttacker_2010OutgoingLinks(
			View view) {
		return Collections.emptyList();
	}

	/**
	 * @generated
	 */
	public static List<finalYearName.diagram.part.MyLinkDescriptor> getResource_2011OutgoingLinks(
			View view) {
		return Collections.emptyList();
	}

	/**
	 * @generated
	 */
	public static List<finalYearName.diagram.part.MyLinkDescriptor> getGoal_2002OutgoingLinks(
			View view) {
		return Collections.emptyList();
	}

	/**
	 * @generated
	 */
	public static List<finalYearName.diagram.part.MyLinkDescriptor> getSecurityMechanism_2003OutgoingLinks(
			View view) {
		return Collections.emptyList();
	}

	/**
	 * @generated
	 */
	public static List<finalYearName.diagram.part.MyLinkDescriptor> getSecurityConstraint_2006OutgoingLinks(
			View view) {
		return Collections.emptyList();
	}

	/**
	 * @generated
	 */
	public static List<finalYearName.diagram.part.MyLinkDescriptor> getVulnerability_2012OutgoingLinks(
			View view) {
		return Collections.emptyList();
	}

	/**
	 * @generated
	 */
	public static List<finalYearName.diagram.part.MyLinkDescriptor> getSoftGoal_2013OutgoingLinks(
			View view) {
		return Collections.emptyList();
	}

	/**
	 * @generated
	 */
	public static List<finalYearName.diagram.part.MyLinkDescriptor> getDependencyLink_4001OutgoingLinks(
			View view) {
		return Collections.emptyList();
	}

	/**
	 * @generated
	 */
	private static Collection<finalYearName.diagram.part.MyLinkDescriptor> getContainedTypeModelFacetLinks_DependencyLink_4001(
			finalYearName.Model container) {
		LinkedList<finalYearName.diagram.part.MyLinkDescriptor> result = new LinkedList<finalYearName.diagram.part.MyLinkDescriptor>();
		for (Iterator<?> links = container.getHasDependencyLink().iterator(); links
				.hasNext();) {
			EObject linkObject = (EObject) links.next();
			if (false == linkObject instanceof finalYearName.DependencyLink) {
				continue;
			}
			finalYearName.DependencyLink link = (finalYearName.DependencyLink) linkObject;
			if (finalYearName.diagram.edit.parts.DependencyLinkEditPart.VISUAL_ID != finalYearName.diagram.part.MyVisualIDRegistry
					.getLinkWithClassVisualID(link)) {
				continue;
			}
			List targets = link.getToGoal();
			Object theTarget = targets.size() == 1 ? targets.get(0) : null;
			if (false == theTarget instanceof finalYearName.Goal) {
				continue;
			}
			finalYearName.Goal dst = (finalYearName.Goal) theTarget;
			List sources = link.getFromActor();
			Object theSource = sources.size() == 1 ? sources.get(0) : null;
			if (false == theSource instanceof finalYearName.Actor) {
				continue;
			}
			finalYearName.Actor src = (finalYearName.Actor) theSource;
			result.add(new finalYearName.diagram.part.MyLinkDescriptor(
					src,
					dst,
					link,
					finalYearName.diagram.providers.MyElementTypes.DependencyLink_4001,
					finalYearName.diagram.edit.parts.DependencyLinkEditPart.VISUAL_ID));
		}
		return result;
	}

	/**
	 * @generated
	 */
	private static Collection<finalYearName.diagram.part.MyLinkDescriptor> getIncomingTypeModelFacetLinks_DependencyLink_4001(
			finalYearName.Goal target,
			Map<EObject, Collection<EStructuralFeature.Setting>> crossReferences) {
		LinkedList<finalYearName.diagram.part.MyLinkDescriptor> result = new LinkedList<finalYearName.diagram.part.MyLinkDescriptor>();
		Collection<EStructuralFeature.Setting> settings = crossReferences
				.get(target);
		for (EStructuralFeature.Setting setting : settings) {
			if (setting.getEStructuralFeature() != finalYearName.FinalYearNamePackage.eINSTANCE
					.getDependencyLink_ToGoal()
					|| false == setting.getEObject() instanceof finalYearName.DependencyLink) {
				continue;
			}
			finalYearName.DependencyLink link = (finalYearName.DependencyLink) setting
					.getEObject();
			if (finalYearName.diagram.edit.parts.DependencyLinkEditPart.VISUAL_ID != finalYearName.diagram.part.MyVisualIDRegistry
					.getLinkWithClassVisualID(link)) {
				continue;
			}
			List sources = link.getFromActor();
			Object theSource = sources.size() == 1 ? sources.get(0) : null;
			if (false == theSource instanceof finalYearName.Actor) {
				continue;
			}
			finalYearName.Actor src = (finalYearName.Actor) theSource;
			result.add(new finalYearName.diagram.part.MyLinkDescriptor(
					src,
					target,
					link,
					finalYearName.diagram.providers.MyElementTypes.DependencyLink_4001,
					finalYearName.diagram.edit.parts.DependencyLinkEditPart.VISUAL_ID));
		}
		return result;
	}

	/**
	 * @generated
	 */
	private static Collection<finalYearName.diagram.part.MyLinkDescriptor> getOutgoingTypeModelFacetLinks_DependencyLink_4001(
			finalYearName.Actor source) {
		finalYearName.Model container = null;
		// Find container element for the link.
		// Climb up by containment hierarchy starting from the source
		// and return the first element that is instance of the container class.
		for (EObject element = source; element != null && container == null; element = element
				.eContainer()) {
			if (element instanceof finalYearName.Model) {
				container = (finalYearName.Model) element;
			}
		}
		if (container == null) {
			return Collections.emptyList();
		}
		LinkedList<finalYearName.diagram.part.MyLinkDescriptor> result = new LinkedList<finalYearName.diagram.part.MyLinkDescriptor>();
		for (Iterator<?> links = container.getHasDependencyLink().iterator(); links
				.hasNext();) {
			EObject linkObject = (EObject) links.next();
			if (false == linkObject instanceof finalYearName.DependencyLink) {
				continue;
			}
			finalYearName.DependencyLink link = (finalYearName.DependencyLink) linkObject;
			if (finalYearName.diagram.edit.parts.DependencyLinkEditPart.VISUAL_ID != finalYearName.diagram.part.MyVisualIDRegistry
					.getLinkWithClassVisualID(link)) {
				continue;
			}
			List targets = link.getToGoal();
			Object theTarget = targets.size() == 1 ? targets.get(0) : null;
			if (false == theTarget instanceof finalYearName.Goal) {
				continue;
			}
			finalYearName.Goal dst = (finalYearName.Goal) theTarget;
			List sources = link.getFromActor();
			Object theSource = sources.size() == 1 ? sources.get(0) : null;
			if (false == theSource instanceof finalYearName.Actor) {
				continue;
			}
			finalYearName.Actor src = (finalYearName.Actor) theSource;
			if (src != source) {
				continue;
			}
			result.add(new finalYearName.diagram.part.MyLinkDescriptor(
					src,
					dst,
					link,
					finalYearName.diagram.providers.MyElementTypes.DependencyLink_4001,
					finalYearName.diagram.edit.parts.DependencyLinkEditPart.VISUAL_ID));
		}
		return result;
	}

	/**
	 * @generated
	 */
	public static final DiagramUpdater TYPED_INSTANCE = new DiagramUpdater() {
		/**
		 * @generated
		 */
		@Override
		public List<finalYearName.diagram.part.MyNodeDescriptor> getSemanticChildren(
				View view) {
			return MyDiagramUpdater.getSemanticChildren(view);
		}

		/**
		 * @generated
		 */
		@Override
		public List<finalYearName.diagram.part.MyLinkDescriptor> getContainedLinks(
				View view) {
			return MyDiagramUpdater.getContainedLinks(view);
		}

		/**
		 * @generated
		 */
		@Override
		public List<finalYearName.diagram.part.MyLinkDescriptor> getIncomingLinks(
				View view) {
			return MyDiagramUpdater.getIncomingLinks(view);
		}

		/**
		 * @generated
		 */
		@Override
		public List<finalYearName.diagram.part.MyLinkDescriptor> getOutgoingLinks(
				View view) {
			return MyDiagramUpdater.getOutgoingLinks(view);
		}
	};

}
