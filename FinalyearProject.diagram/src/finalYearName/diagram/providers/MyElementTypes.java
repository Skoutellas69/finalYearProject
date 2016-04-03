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
	public static final IElementType SecurityConstraint_2006 = getElementType("FinalyearProject.diagram.SecurityConstraint_2006"); //$NON-NLS-1$
	/**
	 * @generated
	 */
	public static final IElementType SecurityObjective_2007 = getElementType("FinalyearProject.diagram.SecurityObjective_2007"); //$NON-NLS-1$
	/**
	 * @generated
	 */
	public static final IElementType SecurityMechanism_2003 = getElementType("FinalyearProject.diagram.SecurityMechanism_2003"); //$NON-NLS-1$
	/**
	 * @generated
	 */
	public static final IElementType Actor_2001 = getElementType("FinalyearProject.diagram.Actor_2001"); //$NON-NLS-1$
	/**
	 * @generated
	 */
	public static final IElementType Threat_2005 = getElementType("FinalyearProject.diagram.Threat_2005"); //$NON-NLS-1$
	/**
	 * @generated
	 */
	public static final IElementType Goal_2002 = getElementType("FinalyearProject.diagram.Goal_2002"); //$NON-NLS-1$
	/**
	 * @generated
	 */
	public static final IElementType Plan_2004 = getElementType("FinalyearProject.diagram.Plan_2004"); //$NON-NLS-1$
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

			elements.put(Actor_2001,
					finalYearName.FinalYearNamePackage.eINSTANCE.getActor());

			elements.put(SecurityConstraint_2006,
					finalYearName.FinalYearNamePackage.eINSTANCE
							.getSecurityConstraint());

			elements.put(Plan_2004,
					finalYearName.FinalYearNamePackage.eINSTANCE.getPlan());

			elements.put(Goal_2002,
					finalYearName.FinalYearNamePackage.eINSTANCE.getGoal());

			elements.put(Threat_2005,
					finalYearName.FinalYearNamePackage.eINSTANCE.getThreat());

			elements.put(SecurityObjective_2007,
					finalYearName.FinalYearNamePackage.eINSTANCE
							.getSecurityObjective());

			elements.put(SecurityMechanism_2003,
					finalYearName.FinalYearNamePackage.eINSTANCE
							.getSecurityMechanism());

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
			KNOWN_ELEMENT_TYPES.add(Actor_2001);
			KNOWN_ELEMENT_TYPES.add(SecurityConstraint_2006);
			KNOWN_ELEMENT_TYPES.add(Plan_2004);
			KNOWN_ELEMENT_TYPES.add(Goal_2002);
			KNOWN_ELEMENT_TYPES.add(Threat_2005);
			KNOWN_ELEMENT_TYPES.add(SecurityObjective_2007);
			KNOWN_ELEMENT_TYPES.add(SecurityMechanism_2003);
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
		case finalYearName.diagram.edit.parts.ActorEditPart.VISUAL_ID:
			return Actor_2001;
		case finalYearName.diagram.edit.parts.SecurityConstraintEditPart.VISUAL_ID:
			return SecurityConstraint_2006;
		case finalYearName.diagram.edit.parts.PlanEditPart.VISUAL_ID:
			return Plan_2004;
		case finalYearName.diagram.edit.parts.GoalEditPart.VISUAL_ID:
			return Goal_2002;
		case finalYearName.diagram.edit.parts.ThreatEditPart.VISUAL_ID:
			return Threat_2005;
		case finalYearName.diagram.edit.parts.SecurityObjectiveEditPart.VISUAL_ID:
			return SecurityObjective_2007;
		case finalYearName.diagram.edit.parts.SecurityMechanismEditPart.VISUAL_ID:
			return SecurityMechanism_2003;
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
