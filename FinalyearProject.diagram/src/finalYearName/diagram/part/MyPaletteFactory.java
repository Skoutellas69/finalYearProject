package finalYearName.diagram.part;

import java.util.Collections;

import org.eclipse.gef.palette.PaletteContainer;
import org.eclipse.gef.palette.PaletteGroup;
import org.eclipse.gef.palette.PaletteRoot;
import org.eclipse.gef.palette.ToolEntry;
import org.eclipse.gmf.tooling.runtime.part.DefaultLinkToolEntry;
import org.eclipse.gmf.tooling.runtime.part.DefaultNodeToolEntry;

/**
 * @generated
 */
public class MyPaletteFactory {

	/**
	 * @generated
	 */
	public void fillPalette(PaletteRoot paletteRoot) {
		paletteRoot.add(createFinalYearName1Group());
	}

	/**
	 * Creates "finalYearName" palette tool group
	 * @generated
	 */
	private PaletteContainer createFinalYearName1Group() {
		PaletteGroup paletteContainer = new PaletteGroup(
				finalYearName.diagram.part.Messages.FinalYearName1Group_title);
		paletteContainer.setId("createFinalYearName1Group"); //$NON-NLS-1$
		paletteContainer.add(createActor1CreationTool());
		paletteContainer.add(createGoal2CreationTool());
		paletteContainer.add(createDependencyLink3CreationTool());
		paletteContainer.add(createDependencyLinkToGoal4CreationTool());
		paletteContainer.add(createDependencyLinkFromActor5CreationTool());
		paletteContainer.add(createSecurityObjective6CreationTool());
		paletteContainer.add(createThreat7CreationTool());
		paletteContainer.add(createSecurityConstraint8CreationTool());
		paletteContainer.add(createPlan9CreationTool());
		paletteContainer.add(createSecurityMechanism10CreationTool());
		paletteContainer.add(createOrganisation11CreationTool());
		paletteContainer.add(createSoftGoal12CreationTool());
		paletteContainer.add(createResource13CreationTool());
		paletteContainer.add(createAttacker14CreationTool());
		paletteContainer.add(createVulnerability15CreationTool());
		paletteContainer.add(createAttackMethod16CreationTool());
		return paletteContainer;
	}

	/**
	 * @generated
	 */
	private ToolEntry createActor1CreationTool() {
		DefaultNodeToolEntry entry = new DefaultNodeToolEntry(
				finalYearName.diagram.part.Messages.Actor1CreationTool_title,
				finalYearName.diagram.part.Messages.Actor1CreationTool_desc,
				Collections
						.singletonList(finalYearName.diagram.providers.MyElementTypes.Actor_2001));
		entry.setId("createActor1CreationTool"); //$NON-NLS-1$
		entry.setSmallIcon(finalYearName.diagram.providers.MyElementTypes
				.getImageDescriptor(finalYearName.diagram.providers.MyElementTypes.Actor_2001));
		entry.setLargeIcon(entry.getSmallIcon());
		return entry;
	}

	/**
	 * @generated
	 */
	private ToolEntry createGoal2CreationTool() {
		DefaultNodeToolEntry entry = new DefaultNodeToolEntry(
				finalYearName.diagram.part.Messages.Goal2CreationTool_title,
				finalYearName.diagram.part.Messages.Goal2CreationTool_desc,
				Collections
						.singletonList(finalYearName.diagram.providers.MyElementTypes.Goal_2002));
		entry.setId("createGoal2CreationTool"); //$NON-NLS-1$
		entry.setSmallIcon(finalYearName.diagram.providers.MyElementTypes
				.getImageDescriptor(finalYearName.diagram.providers.MyElementTypes.Goal_2002));
		entry.setLargeIcon(entry.getSmallIcon());
		return entry;
	}

	/**
	 * @generated
	 */
	private ToolEntry createDependencyLink3CreationTool() {
		DefaultLinkToolEntry entry = new DefaultLinkToolEntry(
				finalYearName.diagram.part.Messages.DependencyLink3CreationTool_title,
				finalYearName.diagram.part.Messages.DependencyLink3CreationTool_desc,
				Collections
						.singletonList(finalYearName.diagram.providers.MyElementTypes.DependencyLink_4001));
		entry.setId("createDependencyLink3CreationTool"); //$NON-NLS-1$
		entry.setSmallIcon(finalYearName.diagram.providers.MyElementTypes
				.getImageDescriptor(finalYearName.diagram.providers.MyElementTypes.DependencyLink_4001));
		entry.setLargeIcon(entry.getSmallIcon());
		return entry;
	}

	/**
	 * @generated
	 */
	private ToolEntry createDependencyLinkToGoal4CreationTool() {
		ToolEntry entry = new ToolEntry(
				finalYearName.diagram.part.Messages.DependencyLinkToGoal4CreationTool_title,
				finalYearName.diagram.part.Messages.DependencyLinkToGoal4CreationTool_desc,
				null, null) {
		};
		entry.setId("createDependencyLinkToGoal4CreationTool"); //$NON-NLS-1$
		return entry;
	}

	/**
	 * @generated
	 */
	private ToolEntry createDependencyLinkFromActor5CreationTool() {
		ToolEntry entry = new ToolEntry(
				finalYearName.diagram.part.Messages.DependencyLinkFromActor5CreationTool_title,
				finalYearName.diagram.part.Messages.DependencyLinkFromActor5CreationTool_desc,
				null, null) {
		};
		entry.setId("createDependencyLinkFromActor5CreationTool"); //$NON-NLS-1$
		return entry;
	}

	/**
	 * @generated
	 */
	private ToolEntry createSecurityObjective6CreationTool() {
		DefaultNodeToolEntry entry = new DefaultNodeToolEntry(
				finalYearName.diagram.part.Messages.SecurityObjective6CreationTool_title,
				finalYearName.diagram.part.Messages.SecurityObjective6CreationTool_desc,
				Collections
						.singletonList(finalYearName.diagram.providers.MyElementTypes.SecurityObjective_2007));
		entry.setId("createSecurityObjective6CreationTool"); //$NON-NLS-1$
		entry.setSmallIcon(finalYearName.diagram.providers.MyElementTypes
				.getImageDescriptor(finalYearName.diagram.providers.MyElementTypes.SecurityObjective_2007));
		entry.setLargeIcon(entry.getSmallIcon());
		return entry;
	}

	/**
	 * @generated
	 */
	private ToolEntry createThreat7CreationTool() {
		DefaultNodeToolEntry entry = new DefaultNodeToolEntry(
				finalYearName.diagram.part.Messages.Threat7CreationTool_title,
				finalYearName.diagram.part.Messages.Threat7CreationTool_desc,
				Collections
						.singletonList(finalYearName.diagram.providers.MyElementTypes.Threat_2005));
		entry.setId("createThreat7CreationTool"); //$NON-NLS-1$
		entry.setSmallIcon(finalYearName.diagram.providers.MyElementTypes
				.getImageDescriptor(finalYearName.diagram.providers.MyElementTypes.Threat_2005));
		entry.setLargeIcon(entry.getSmallIcon());
		return entry;
	}

	/**
	 * @generated
	 */
	private ToolEntry createSecurityConstraint8CreationTool() {
		DefaultNodeToolEntry entry = new DefaultNodeToolEntry(
				finalYearName.diagram.part.Messages.SecurityConstraint8CreationTool_title,
				finalYearName.diagram.part.Messages.SecurityConstraint8CreationTool_desc,
				Collections
						.singletonList(finalYearName.diagram.providers.MyElementTypes.SecurityConstraint_2006));
		entry.setId("createSecurityConstraint8CreationTool"); //$NON-NLS-1$
		entry.setSmallIcon(finalYearName.diagram.providers.MyElementTypes
				.getImageDescriptor(finalYearName.diagram.providers.MyElementTypes.SecurityConstraint_2006));
		entry.setLargeIcon(entry.getSmallIcon());
		return entry;
	}

	/**
	 * @generated
	 */
	private ToolEntry createPlan9CreationTool() {
		DefaultNodeToolEntry entry = new DefaultNodeToolEntry(
				finalYearName.diagram.part.Messages.Plan9CreationTool_title,
				finalYearName.diagram.part.Messages.Plan9CreationTool_desc,
				Collections
						.singletonList(finalYearName.diagram.providers.MyElementTypes.Plan_2004));
		entry.setId("createPlan9CreationTool"); //$NON-NLS-1$
		entry.setSmallIcon(finalYearName.diagram.providers.MyElementTypes
				.getImageDescriptor(finalYearName.diagram.providers.MyElementTypes.Plan_2004));
		entry.setLargeIcon(entry.getSmallIcon());
		return entry;
	}

	/**
	 * @generated
	 */
	private ToolEntry createSecurityMechanism10CreationTool() {
		DefaultNodeToolEntry entry = new DefaultNodeToolEntry(
				finalYearName.diagram.part.Messages.SecurityMechanism10CreationTool_title,
				finalYearName.diagram.part.Messages.SecurityMechanism10CreationTool_desc,
				Collections
						.singletonList(finalYearName.diagram.providers.MyElementTypes.SecurityMechanism_2003));
		entry.setId("createSecurityMechanism10CreationTool"); //$NON-NLS-1$
		entry.setSmallIcon(finalYearName.diagram.providers.MyElementTypes
				.getImageDescriptor(finalYearName.diagram.providers.MyElementTypes.SecurityMechanism_2003));
		entry.setLargeIcon(entry.getSmallIcon());
		return entry;
	}

	/**
	 * @generated
	 */
	private ToolEntry createOrganisation11CreationTool() {
		DefaultNodeToolEntry entry = new DefaultNodeToolEntry(
				finalYearName.diagram.part.Messages.Organisation11CreationTool_title,
				finalYearName.diagram.part.Messages.Organisation11CreationTool_desc,
				Collections
						.singletonList(finalYearName.diagram.providers.MyElementTypes.Organisation_2009));
		entry.setId("createOrganisation11CreationTool"); //$NON-NLS-1$
		entry.setSmallIcon(finalYearName.diagram.providers.MyElementTypes
				.getImageDescriptor(finalYearName.diagram.providers.MyElementTypes.Organisation_2009));
		entry.setLargeIcon(entry.getSmallIcon());
		return entry;
	}

	/**
	 * @generated
	 */
	private ToolEntry createSoftGoal12CreationTool() {
		DefaultNodeToolEntry entry = new DefaultNodeToolEntry(
				finalYearName.diagram.part.Messages.SoftGoal12CreationTool_title,
				finalYearName.diagram.part.Messages.SoftGoal12CreationTool_desc,
				Collections
						.singletonList(finalYearName.diagram.providers.MyElementTypes.SoftGoal_2013));
		entry.setId("createSoftGoal12CreationTool"); //$NON-NLS-1$
		entry.setSmallIcon(finalYearName.diagram.providers.MyElementTypes
				.getImageDescriptor(finalYearName.diagram.providers.MyElementTypes.SoftGoal_2013));
		entry.setLargeIcon(entry.getSmallIcon());
		return entry;
	}

	/**
	 * @generated
	 */
	private ToolEntry createResource13CreationTool() {
		DefaultNodeToolEntry entry = new DefaultNodeToolEntry(
				finalYearName.diagram.part.Messages.Resource13CreationTool_title,
				finalYearName.diagram.part.Messages.Resource13CreationTool_desc,
				Collections
						.singletonList(finalYearName.diagram.providers.MyElementTypes.Resource_2011));
		entry.setId("createResource13CreationTool"); //$NON-NLS-1$
		entry.setSmallIcon(finalYearName.diagram.providers.MyElementTypes
				.getImageDescriptor(finalYearName.diagram.providers.MyElementTypes.Resource_2011));
		entry.setLargeIcon(entry.getSmallIcon());
		return entry;
	}

	/**
	 * @generated
	 */
	private ToolEntry createAttacker14CreationTool() {
		DefaultNodeToolEntry entry = new DefaultNodeToolEntry(
				finalYearName.diagram.part.Messages.Attacker14CreationTool_title,
				finalYearName.diagram.part.Messages.Attacker14CreationTool_desc,
				Collections
						.singletonList(finalYearName.diagram.providers.MyElementTypes.Attacker_2010));
		entry.setId("createAttacker14CreationTool"); //$NON-NLS-1$
		entry.setSmallIcon(finalYearName.diagram.providers.MyElementTypes
				.getImageDescriptor(finalYearName.diagram.providers.MyElementTypes.Attacker_2010));
		entry.setLargeIcon(entry.getSmallIcon());
		return entry;
	}

	/**
	 * @generated
	 */
	private ToolEntry createVulnerability15CreationTool() {
		DefaultNodeToolEntry entry = new DefaultNodeToolEntry(
				finalYearName.diagram.part.Messages.Vulnerability15CreationTool_title,
				finalYearName.diagram.part.Messages.Vulnerability15CreationTool_desc,
				Collections
						.singletonList(finalYearName.diagram.providers.MyElementTypes.Vulnerability_2012));
		entry.setId("createVulnerability15CreationTool"); //$NON-NLS-1$
		entry.setSmallIcon(finalYearName.diagram.providers.MyElementTypes
				.getImageDescriptor(finalYearName.diagram.providers.MyElementTypes.Vulnerability_2012));
		entry.setLargeIcon(entry.getSmallIcon());
		return entry;
	}

	/**
	 * @generated
	 */
	private ToolEntry createAttackMethod16CreationTool() {
		DefaultNodeToolEntry entry = new DefaultNodeToolEntry(
				finalYearName.diagram.part.Messages.AttackMethod16CreationTool_title,
				finalYearName.diagram.part.Messages.AttackMethod16CreationTool_desc,
				Collections
						.singletonList(finalYearName.diagram.providers.MyElementTypes.AttackMethod_2008));
		entry.setId("createAttackMethod16CreationTool"); //$NON-NLS-1$
		entry.setSmallIcon(finalYearName.diagram.providers.MyElementTypes
				.getImageDescriptor(finalYearName.diagram.providers.MyElementTypes.AttackMethod_2008));
		entry.setLargeIcon(entry.getSmallIcon());
		return entry;
	}

}
