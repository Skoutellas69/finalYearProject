package finalYearName.diagram.providers;

import java.util.HashSet;
import java.util.IdentityHashMap;
import java.util.Map;
import java.util.Set;

import org.eclipse.core.runtime.IAdaptable;
import org.eclipse.emf.ecore.ENamedElement;
import org.eclipse.gmf.runtime.emf.type.core.ElementTypeRegistry;
import org.eclipse.gmf.runtime.emf.type.core.IElementType;
import org.eclipse.gmf.tooling.runtime.providers.DiagramElementTypeImages;
import org.eclipse.gmf.tooling.runtime.providers.DiagramElementTypes;
import org.eclipse.jface.resource.ImageDescriptor;
import org.eclipse.swt.graphics.Image;

/**
 * @generated
 */
public class MyElementTypes {

	/**
	 * @generated
	 */
	private MyElementTypes() {
	}

	/**
	 * @generated
	 */
	private static Map<IElementType, ENamedElement> elements;

	/**
	 * @generated
	 */
	private static DiagramElementTypeImages elementTypeImages = new DiagramElementTypeImages(
			finalYearName.diagram.part.MyDiagramEditorPlugin.getInstance()
					.getItemProvidersAdapterFactory());

	/**
	 * @generated
	 */
	private static Set<IElementType> KNOWN_ELEMENT_TYPES;

	/**
	 * @generated
	 */
	public static final IElementType Model_1000 = getElementType("FinalyearProject.diagram.Model_1000"); //$NON-NLS-1$
	/**
	 * @generated
	 */
	public static final IElementType SoftGoal_2013 = getElementType("FinalyearProject.diagram.SoftGoal_2013"); //$NON-NLS-1$
	/**
	 * @generated
	 */
	public static final IElementType SecurityMechanism_2003 = getElementType("FinalyearProject.diagram.SecurityMechanism_2003"); //$NON-NLS-1$
	/**
	 * @generated
	 */
	public static final IElementType Organisation_2009 = getElementType("FinalyearProject.diagram.Organisation_2009"); //$NON-NLS-1$
	/**
	 * @generated
	 */
	public static final IElementType Actor_2001 = getElementType("FinalyearProject.diagram.Actor_2001"); //$NON-NLS-1$
	/**
	 * @generated
	 */
	public static final IElementType AttackMethod_2008 = getElementType("FinalyearProject.diagram.AttackMethod_2008"); //$NON-NLS-1$
	/**
	 * @generated
	 */
	public static final IElementType Plan_2004 = getElementType("FinalyearProject.diagram.Plan_2004"); //$NON-NLS-1$
	/**
	 * @generated
	 */
	public static final IElementType Threat_2005 = getElementType("FinalyearProject.diagram.Threat_2005"); //$NON-NLS-1$
	/**
	 * @generated
	 */
	public static final IElementType SecurityConstraint_2006 = getElementType("FinalyearProject.diagram.SecurityConstraint_2006"); //$NON-NLS-1$
	/**
	 * @generated
	 */
	public static final IElementType Vulnerability_2012 = getElementType("FinalyearProject.diagram.Vulnerability_2012"); //$NON-NLS-1$
	/**
	 * @generated
	 */
	public static final IElementType SecurityObjective_2007 = getElementType("FinalyearProject.diagram.SecurityObjective_2007"); //$NON-NLS-1$
	/**
	 * @generated
	 */
	public static final IElementType Goal_2002 = getElementType("FinalyearProject.diagram.Goal_2002"); //$NON-NLS-1$
	/**
	 * @generated
	 */
	public static final IElementType Resource_2011 = getElementType("FinalyearProject.diagram.Resource_2011"); //$NON-NLS-1$
	/**
	 * @generated
	 */
	public static final IElementType Attacker_2010 = getElementType("FinalyearProject.diagram.Attacker_2010"); //$NON-NLS-1$
	/**
	 * @generated
	 */
	public static final IElementType DependencyLink_4001 = getElementType("FinalyearProject.diagram.DependencyLink_4001"); //$NON-NLS-1$

	/**
	 * @generated
	 */
	public static ImageDescriptor getImageDescriptor(ENamedElement element) {
		return elementTypeImages.getImageDescriptor(element);
	}

	/**
	 * @generated
	 */
	public static Image getImage(ENamedElement element) {
		return elementTypeImages.getImage(element);
	}

	/**
	 * @generated
	 */
	public static ImageDescriptor getImageDescriptor(IAdaptable hint) {
		return getImageDescriptor(getElement(hint));
	}

	/**
	 * @generated
	 */
	public static Image getImage(IAdaptable hint) {
		return getImage(getElement(hint));
	}

	/**
	 * Returns 'type' of the ecore object associated with the hint.
	 * 
	 * @generated
	 */
	public static ENamedElement getElement(IAdaptable hint) {
		Object type = hint.getAdapter(IElementType.class);
		if (elements == null) {
			elements = new IdentityHashMap<IElementType, ENamedElement>();

			elements.put(Model_1000,
					finalYearName.FinalYearNamePackage.eINSTANCE.getModel());

			elements.put(SoftGoal_2013,
					finalYearName.FinalYearNamePackage.eINSTANCE.getSoftGoal());

			elements.put(SecurityMechanism_2003,
					finalYearName.FinalYearNamePackage.eINSTANCE
							.getSecurityMechanism());

			elements.put(Organisation_2009,
					finalYearName.FinalYearNamePackage.eINSTANCE
							.getOrganisation());

			elements.put(Actor_2001,
					finalYearName.FinalYearNamePackage.eINSTANCE.getActor());

			elements.put(AttackMethod_2008,
					finalYearName.FinalYearNamePackage.eINSTANCE
							.getAttackMethod());

			elements.put(Plan_2004,
					finalYearName.FinalYearNamePackage.eINSTANCE.getPlan());

			elements.put(Threat_2005,
					finalYearName.FinalYearNamePackage.eINSTANCE.getThreat());

			elements.put(SecurityConstraint_2006,
					finalYearName.FinalYearNamePackage.eINSTANCE
							.getSecurityConstraint());

			elements.put(Vulnerability_2012,
					finalYearName.FinalYearNamePackage.eINSTANCE
							.getVulnerability());

			elements.put(SecurityObjective_2007,
					finalYearName.FinalYearNamePackage.eINSTANCE
							.getSecurityObjective());

			elements.put(Goal_2002,
					finalYearName.FinalYearNamePackage.eINSTANCE.getGoal());

			elements.put(Resource_2011,
					finalYearName.FinalYearNamePackage.eINSTANCE.getResource());

			elements.put(Attacker_2010,
					finalYearName.FinalYearNamePackage.eINSTANCE.getAttacker());

			elements.put(DependencyLink_4001,
					finalYearName.FinalYearNamePackage.eINSTANCE
							.getDependencyLink());
		}
		return (ENamedElement) elements.get(type);
	}

	/**
	 * @generated
	 */
	private static IElementType getElementType(String id) {
		return ElementTypeRegistry.getInstance().getType(id);
	}

	/**
	 * @generated
	 */
	public static boolean isKnownElementType(IElementType elementType) {
		if (KNOWN_ELEMENT_TYPES == null) {
			KNOWN_ELEMENT_TYPES = new HashSet<IElementType>();
			KNOWN_ELEMENT_TYPES.add(Model_1000);
			KNOWN_ELEMENT_TYPES.add(SoftGoal_2013);
			KNOWN_ELEMENT_TYPES.add(SecurityMechanism_2003);
			KNOWN_ELEMENT_TYPES.add(Organisation_2009);
			KNOWN_ELEMENT_TYPES.add(Actor_2001);
			KNOWN_ELEMENT_TYPES.add(AttackMethod_2008);
			KNOWN_ELEMENT_TYPES.add(Plan_2004);
			KNOWN_ELEMENT_TYPES.add(Threat_2005);
			KNOWN_ELEMENT_TYPES.add(SecurityConstraint_2006);
			KNOWN_ELEMENT_TYPES.add(Vulnerability_2012);
			KNOWN_ELEMENT_TYPES.add(SecurityObjective_2007);
			KNOWN_ELEMENT_TYPES.add(Goal_2002);
			KNOWN_ELEMENT_TYPES.add(Resource_2011);
			KNOWN_ELEMENT_TYPES.add(Attacker_2010);
			KNOWN_ELEMENT_TYPES.add(DependencyLink_4001);
		}
		return KNOWN_ELEMENT_TYPES.contains(elementType);
	}

	/**
	 * @generated
	 */
	public static IElementType getElementType(int visualID) {
		switch (visualID) {
		case finalYearName.diagram.edit.parts.ModelEditPart.VISUAL_ID:
			return Model_1000;
		case finalYearName.diagram.edit.parts.SoftGoalEditPart.VISUAL_ID:
			return SoftGoal_2013;
		case finalYearName.diagram.edit.parts.SecurityMechanismEditPart.VISUAL_ID:
			return SecurityMechanism_2003;
		case finalYearName.diagram.edit.parts.OrganisationEditPart.VISUAL_ID:
			return Organisation_2009;
		case finalYearName.diagram.edit.parts.ActorEditPart.VISUAL_ID:
			return Actor_2001;
		case finalYearName.diagram.edit.parts.AttackMethodEditPart.VISUAL_ID:
			return AttackMethod_2008;
		case finalYearName.diagram.edit.parts.PlanEditPart.VISUAL_ID:
			return Plan_2004;
		case finalYearName.diagram.edit.parts.ThreatEditPart.VISUAL_ID:
			return Threat_2005;
		case finalYearName.diagram.edit.parts.SecurityConstraintEditPart.VISUAL_ID:
			return SecurityConstraint_2006;
		case finalYearName.diagram.edit.parts.VulnerabilityEditPart.VISUAL_ID:
			return Vulnerability_2012;
		case finalYearName.diagram.edit.parts.SecurityObjectiveEditPart.VISUAL_ID:
			return SecurityObjective_2007;
		case finalYearName.diagram.edit.parts.GoalEditPart.VISUAL_ID:
			return Goal_2002;
		case finalYearName.diagram.edit.parts.ResourceEditPart.VISUAL_ID:
			return Resource_2011;
		case finalYearName.diagram.edit.parts.AttackerEditPart.VISUAL_ID:
			return Attacker_2010;
		case finalYearName.diagram.edit.parts.DependencyLinkEditPart.VISUAL_ID:
			return DependencyLink_4001;
		}
		return null;
	}

	/**
	 * @generated
	 */
	public static final DiagramElementTypes TYPED_INSTANCE = new DiagramElementTypes(
			elementTypeImages) {

		/**
		 * @generated
		 */
		@Override
		public boolean isKnownElementType(IElementType elementType) {
			return finalYearName.diagram.providers.MyElementTypes
					.isKnownElementType(elementType);
		}

		/**
		 * @generated
		 */
		@Override
		public IElementType getElementTypeForVisualId(int visualID) {
			return finalYearName.diagram.providers.MyElementTypes
					.getElementType(visualID);
		}

		/**
		 * @generated
		 */
		@Override
		public ENamedElement getDefiningNamedElement(
				IAdaptable elementTypeAdapter) {
			return finalYearName.diagram.providers.MyElementTypes
					.getElement(elementTypeAdapter);
		}
	};

}
