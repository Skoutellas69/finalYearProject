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
		paletteContainer.add(createSecurityObjective4CreationTool());
		paletteContainer.add(createThreat5CreationTool());
		paletteContainer.add(createSecurityConstraint6CreationTool());
		paletteContainer.add(createPlan7CreationTool());
		paletteContainer.add(createSecurityMechanism8CreationTool());
		paletteContainer.add(createOrganisation9CreationTool());
		paletteContainer.add(createSoftGoal10CreationTool());
		paletteContainer.add(createResource11CreationTool());
		paletteContainer.add(createAttacker12CreationTool());
		paletteContainer.add(createVulnerability13CreationTool());
		paletteContainer.add(createAttackMethod14CreationTool());
		paletteContainer.add(createDependencyLinkToGoal15CreationTool());
		paletteContainer.add(createDependencyLinkFromActor16CreationTool());
		paletteContainer
				.add(createDependencyLinkToSecurityObjective17CreationTool());
		paletteContainer
				.add(createDependencyLinkToSecurityConstraint18CreationTool());
		paletteContainer
				.add(createDependencyLinkToAttackMethod19CreationTool());
		paletteContainer
				.add(createDependencyLinkToVulnerability20CreationTool());
		paletteContainer.add(createDependencyLinkToAttacker21CreationTool());
		paletteContainer.add(createDependencyLinkToResource22CreationTool());
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
	private ToolEntry createSecurityObjective4CreationTool() {
		DefaultNodeToolEntry entry = new DefaultNodeToolEntry(
				finalYearName.diagram.part.Messages.SecurityObjective4CreationTool_title,
				finalYearName.diagram.part.Messages.SecurityObjective4CreationTool_desc,
				Collections
						.singletonList(finalYearName.diagram.providers.MyElementTypes.SecurityObjective_2007));
		entry.setId("createSecurityObjective4CreationTool"); //$NON-NLS-1$
		entry.setSmallIcon(finalYearName.diagram.providers.MyElementTypes
				.getImageDescriptor(finalYearName.diagram.providers.MyElementTypes.SecurityObjective_2007));
		entry.setLargeIcon(entry.getSmallIcon());
		return entry;
	}

	/**
	 * @generated
	 */
	private ToolEntry createThreat5CreationTool() {
		DefaultNodeToolEntry entry = new DefaultNodeToolEntry(
				finalYearName.diagram.part.Messages.Threat5CreationTool_title,
				finalYearName.diagram.part.Messages.Threat5CreationTool_desc,
				Collections
						.singletonList(finalYearName.diagram.providers.MyElementTypes.Threat_2005));
		entry.setId("createThreat5CreationTool"); //$NON-NLS-1$
		entry.setSmallIcon(finalYearName.diagram.providers.MyElementTypes
				.getImageDescriptor(finalYearName.diagram.providers.MyElementTypes.Threat_2005));
		entry.setLargeIcon(entry.getSmallIcon());
		return entry;
	}

	/**
	 * @generated
	 */
	private ToolEntry createSecurityConstraint6CreationTool() {
		DefaultNodeToolEntry entry = new DefaultNodeToolEntry(
				finalYearName.diagram.part.Messages.SecurityConstraint6CreationTool_title,
				finalYearName.diagram.part.Messages.SecurityConstraint6CreationTool_desc,
				Collections
						.singletonList(finalYearName.diagram.providers.MyElementTypes.SecurityConstraint_2006));
		entry.setId("createSecurityConstraint6CreationTool"); //$NON-NLS-1$
		entry.setSmallIcon(finalYearName.diagram.providers.MyElementTypes
				.getImageDescriptor(finalYearName.diagram.providers.MyElementTypes.SecurityConstraint_2006));
		entry.setLargeIcon(entry.getSmallIcon());
		return entry;
	}

	/**
	 * @generated
	 */
	private ToolEntry createPlan7CreationTool() {
		DefaultNodeToolEntry entry = new DefaultNodeToolEntry(
				finalYearName.diagram.part.Messages.Plan7CreationTool_title,
				finalYearName.diagram.part.Messages.Plan7CreationTool_desc,
				Collections
						.singletonList(finalYearName.diagram.providers.MyElementTypes.Plan_2004));
		entry.setId("createPlan7CreationTool"); //$NON-NLS-1$
		entry.setSmallIcon(finalYearName.diagram.providers.MyElementTypes
				.getImageDescriptor(finalYearName.diagram.providers.MyElementTypes.Plan_2004));
		entry.setLargeIcon(entry.getSmallIcon());
		return entry;
	}

	/**
	 * @generated
	 */
	private ToolEntry createSecurityMechanism8CreationTool() {
		DefaultNodeToolEntry entry = new DefaultNodeToolEntry(
				finalYearName.diagram.part.Messages.SecurityMechanism8CreationTool_title,
				finalYearName.diagram.part.Messages.SecurityMechanism8CreationTool_desc,
				Collections
						.singletonList(finalYearName.diagram.providers.MyElementTypes.SecurityMechanism_2003));
		entry.setId("createSecurityMechanism8CreationTool"); //$NON-NLS-1$
		entry.setSmallIcon(finalYearName.diagram.providers.MyElementTypes
				.getImageDescriptor(finalYearName.diagram.providers.MyElementTypes.SecurityMechanism_2003));
		entry.setLargeIcon(entry.getSmallIcon());
		return entry;
	}

	/**
	 * @generated
	 */
	private ToolEntry createOrganisation9CreationTool() {
		DefaultNodeToolEntry entry = new DefaultNodeToolEntry(
				finalYearName.diagram.part.Messages.Organisation9CreationTool_title,
				finalYearName.diagram.part.Messages.Organisation9CreationTool_desc,
				Collections
						.singletonList(finalYearName.diagram.providers.MyElementTypes.Organisation_2009));
		entry.setId("createOrganisation9CreationTool"); //$NON-NLS-1$
		entry.setSmallIcon(finalYearName.diagram.providers.MyElementTypes
				.getImageDescriptor(finalYearName.diagram.providers.MyElementTypes.Organisation_2009));
		entry.setLargeIcon(entry.getSmallIcon());
		return entry;
	}

	/**
	 * @generated
	 */
	private ToolEntry createSoftGoal10CreationTool() {
		DefaultNodeToolEntry entry = new DefaultNodeToolEntry(
				finalYearName.diagram.part.Messages.SoftGoal10CreationTool_title,
				finalYearName.diagram.part.Messages.SoftGoal10CreationTool_desc,
				Collections
						.singletonList(finalYearName.diagram.providers.MyElementTypes.SoftGoal_2013));
		entry.setId("createSoftGoal10CreationTool"); //$NON-NLS-1$
		entry.setSmallIcon(finalYearName.diagram.providers.MyElementTypes
				.getImageDescriptor(finalYearName.diagram.providers.MyElementTypes.SoftGoal_2013));
		entry.setLargeIcon(entry.getSmallIcon());
		return entry;
	}

	/**
	 * @generated
	 */
	private ToolEntry createResource11CreationTool() {
		DefaultNodeToolEntry entry = new DefaultNodeToolEntry(
				finalYearName.diagram.part.Messages.Resource11CreationTool_title,
				finalYearName.diagram.part.Messages.Resource11CreationTool_desc,
				Collections
						.singletonList(finalYearName.diagram.providers.MyElementTypes.Resource_2011));
		entry.setId("createResource11CreationTool"); //$NON-NLS-1$
		entry.setSmallIcon(finalYearName.diagram.providers.MyElementTypes
				.getImageDescriptor(finalYearName.diagram.providers.MyElementTypes.Resource_2011));
		entry.setLargeIcon(entry.getSmallIcon());
		return entry;
	}

	/**
	 * @generated
	 */
	private ToolEntry createAttacker12CreationTool() {
		DefaultNodeToolEntry entry = new DefaultNodeToolEntry(
				finalYearName.diagram.part.Messages.Attacker12CreationTool_title,
				finalYearName.diagram.part.Messages.Attacker12CreationTool_desc,
				Collections
						.singletonList(finalYearName.diagram.providers.MyElementTypes.Attacker_2010));
		entry.setId("createAttacker12CreationTool"); //$NON-NLS-1$
		entry.setSmallIcon(finalYearName.diagram.providers.MyElementTypes
				.getImageDescriptor(finalYearName.diagram.providers.MyElementTypes.Attacker_2010));
		entry.setLargeIcon(entry.getSmallIcon());
		return entry;
	}

	/**
	 * @generated
	 */
	private ToolEntry createVulnerability13CreationTool() {
		DefaultNodeToolEntry entry = new DefaultNodeToolEntry(
				finalYearName.diagram.part.Messages.Vulnerability13CreationTool_title,
				finalYearName.diagram.part.Messages.Vulnerability13CreationTool_desc,
				Collections
						.singletonList(finalYearName.diagram.providers.MyElementTypes.Vulnerability_2012));
		entry.setId("createVulnerability13CreationTool"); //$NON-NLS-1$
		entry.setSmallIcon(finalYearName.diagram.providers.MyElementTypes
				.getImageDescriptor(finalYearName.diagram.providers.MyElementTypes.Vulnerability_2012));
		entry.setLargeIcon(entry.getSmallIcon());
		return entry;
	}

	/**
	 * @generated
	 */
	private ToolEntry createAttackMethod14CreationTool() {
		DefaultNodeToolEntry entry = new DefaultNodeToolEntry(
				finalYearName.diagram.part.Messages.AttackMethod14CreationTool_title,
				finalYearName.diagram.part.Messages.AttackMethod14CreationTool_desc,
				Collections
						.singletonList(finalYearName.diagram.providers.MyElementTypes.AttackMethod_2008));
		entry.setId("createAttackMethod14CreationTool"); //$NON-NLS-1$
		entry.setSmallIcon(finalYearName.diagram.providers.MyElementTypes
				.getImageDescriptor(finalYearName.diagram.providers.MyElementTypes.AttackMethod_2008));
		entry.setLargeIcon(entry.getSmallIcon());
		return entry;
	}

	/**
	 * @generated
	 */
	private ToolEntry createDependencyLinkToGoal15CreationTool() {
		ToolEntry entry = new ToolEntry(
				finalYearName.diagram.part.Messages.DependencyLinkToGoal15CreationTool_title,
				finalYearName.diagram.part.Messages.DependencyLinkToGoal15CreationTool_desc,
				null, null) {
		};
		entry.setId("createDependencyLinkToGoal15CreationTool"); //$NON-NLS-1$
		return entry;
	}

	/**
	 * @generated
	 */
	private ToolEntry createDependencyLinkFromActor16CreationTool() {
		ToolEntry entry = new ToolEntry(
				finalYearName.diagram.part.Messages.DependencyLinkFromActor16CreationTool_title,
				finalYearName.diagram.part.Messages.DependencyLinkFromActor16CreationTool_desc,
				null, null) {
		};
		entry.setId("createDependencyLinkFromActor16CreationTool"); //$NON-NLS-1$
		return entry;
	}

	/**
	 * @generated
	 */
	private ToolEntry createDependencyLinkToSecurityObjective17CreationTool() {
		ToolEntry entry = new ToolEntry(
				finalYearName.diagram.part.Messages.DependencyLinkToSecurityObjective17CreationTool_title,
				finalYearName.diagram.part.Messages.DependencyLinkToSecurityObjective17CreationTool_desc,
				null, null) {
		};
		entry.setId("createDependencyLinkToSecurityObjective17CreationTool"); //$NON-NLS-1$
		return entry;
	}

	/**
	 * @generated
	 */
	private ToolEntry createDependencyLinkToSecurityConstraint18CreationTool() {
		ToolEntry entry = new ToolEntry(
				finalYearName.diagram.part.Messages.DependencyLinkToSecurityConstraint18CreationTool_title,
				finalYearName.diagram.part.Messages.DependencyLinkToSecurityConstraint18CreationTool_desc,
				null, null) {
		};
		entry.setId("createDependencyLinkToSecurityConstraint18CreationTool"); //$NON-NLS-1$
		return entry;
	}

	/**
	 * @generated
	 */
	private ToolEntry createDependencyLinkToAttackMethod19CreationTool() {
		ToolEntry entry = new ToolEntry(
				finalYearName.diagram.part.Messages.DependencyLinkToAttackMethod19CreationTool_title,
				finalYearName.diagram.part.Messages.DependencyLinkToAttackMethod19CreationTool_desc,
				null, null) {
		};
		entry.setId("createDependencyLinkToAttackMethod19CreationTool"); //$NON-NLS-1$
		return entry;
	}

	/**
	 * @generated
	 */
	private ToolEntry createDependencyLinkToVulnerability20CreationTool() {
		ToolEntry entry = new ToolEntry(
				finalYearName.diagram.part.Messages.DependencyLinkToVulnerability20CreationTool_title,
				finalYearName.diagram.part.Messages.DependencyLinkToVulnerability20CreationTool_desc,
				null, null) {
		};
		entry.setId("createDependencyLinkToVulnerability20CreationTool"); //$NON-NLS-1$
		return entry;
	}

	/**
	 * @generated
	 */
	private ToolEntry createDependencyLinkToAttacker21CreationTool() {
		ToolEntry entry = new ToolEntry(
				finalYearName.diagram.part.Messages.DependencyLinkToAttacker21CreationTool_title,
				finalYearName.diagram.part.Messages.DependencyLinkToAttacker21CreationTool_desc,
				null, null) {
		};
		entry.setId("createDependencyLinkToAttacker21CreationTool"); //$NON-NLS-1$
		return entry;
	}

	/**
	 * @generated
	 */
	private ToolEntry createDependencyLinkToResource22CreationTool() {
		ToolEntry entry = new ToolEntry(
				finalYearName.diagram.part.Messages.DependencyLinkToResource22CreationTool_title,
				finalYearName.diagram.part.Messages.DependencyLinkToResource22CreationTool_desc,
				null, null) {
		};
		entry.setId("createDependencyLinkToResource22CreationTool"); //$NON-NLS-1$
		return entry;
	}

}
