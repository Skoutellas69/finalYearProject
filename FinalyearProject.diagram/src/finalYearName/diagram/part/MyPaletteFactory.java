package finalYearName.diagram.part;

import java.util.Collections;

import org.eclipse.gef.palette.PaletteContainer;
import org.eclipse.gef.palette.PaletteGroup;
import org.eclipse.gef.palette.PaletteRoot;
import org.eclipse.gef.palette.PaletteSeparator;
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
		paletteContainer.add(createGoal1CreationTool());
		paletteContainer.add(createDependencyLink2CreationTool());
		paletteContainer.add(createSecurityObjective3CreationTool());
		paletteContainer.add(createThreat4CreationTool());
		paletteContainer.add(createSecurityConstraint5CreationTool());
		paletteContainer.add(createPlan6CreationTool());
		paletteContainer.add(createSecurityMechanism7CreationTool());
		paletteContainer.add(createOrganisation8CreationTool());
		paletteContainer.add(createSoftGoal9CreationTool());
		paletteContainer.add(createResource10CreationTool());
		paletteContainer.add(createAttacker11CreationTool());
		paletteContainer.add(createVulnerability12CreationTool());
		paletteContainer.add(createAttackMethod13CreationTool());
		paletteContainer.add(new PaletteSeparator());
		paletteContainer.add(createActor15CreationTool());
		return paletteContainer;
	}

	/**
	 * @generated
	 */
	private ToolEntry createGoal1CreationTool() {
		DefaultNodeToolEntry entry = new DefaultNodeToolEntry(
				finalYearName.diagram.part.Messages.Goal1CreationTool_title,
				finalYearName.diagram.part.Messages.Goal1CreationTool_desc,
				Collections
						.singletonList(finalYearName.diagram.providers.MyElementTypes.Goal_2002));
		entry.setId("createGoal1CreationTool"); //$NON-NLS-1$
		entry.setSmallIcon(finalYearName.diagram.providers.MyElementTypes
				.getImageDescriptor(finalYearName.diagram.providers.MyElementTypes.Goal_2002));
		entry.setLargeIcon(entry.getSmallIcon());
		return entry;
	}

	/**
	 * @generated
	 */
	private ToolEntry createDependencyLink2CreationTool() {
		DefaultLinkToolEntry entry = new DefaultLinkToolEntry(
				finalYearName.diagram.part.Messages.DependencyLink2CreationTool_title,
				finalYearName.diagram.part.Messages.DependencyLink2CreationTool_desc,
				Collections
						.singletonList(finalYearName.diagram.providers.MyElementTypes.DependencyLink_4001));
		entry.setId("createDependencyLink2CreationTool"); //$NON-NLS-1$
		entry.setSmallIcon(finalYearName.diagram.providers.MyElementTypes
				.getImageDescriptor(finalYearName.diagram.providers.MyElementTypes.DependencyLink_4001));
		entry.setLargeIcon(entry.getSmallIcon());
		return entry;
	}

	/**
	 * @generated
	 */
	private ToolEntry createSecurityObjective3CreationTool() {
		DefaultNodeToolEntry entry = new DefaultNodeToolEntry(
				finalYearName.diagram.part.Messages.SecurityObjective3CreationTool_title,
				finalYearName.diagram.part.Messages.SecurityObjective3CreationTool_desc,
				Collections
						.singletonList(finalYearName.diagram.providers.MyElementTypes.SecurityObjective_2007));
		entry.setId("createSecurityObjective3CreationTool"); //$NON-NLS-1$
		entry.setSmallIcon(finalYearName.diagram.providers.MyElementTypes
				.getImageDescriptor(finalYearName.diagram.providers.MyElementTypes.SecurityObjective_2007));
		entry.setLargeIcon(entry.getSmallIcon());
		return entry;
	}

	/**
	 * @generated
	 */
	private ToolEntry createThreat4CreationTool() {
		DefaultNodeToolEntry entry = new DefaultNodeToolEntry(
				finalYearName.diagram.part.Messages.Threat4CreationTool_title,
				finalYearName.diagram.part.Messages.Threat4CreationTool_desc,
				Collections
						.singletonList(finalYearName.diagram.providers.MyElementTypes.Threat_2005));
		entry.setId("createThreat4CreationTool"); //$NON-NLS-1$
		entry.setSmallIcon(finalYearName.diagram.providers.MyElementTypes
				.getImageDescriptor(finalYearName.diagram.providers.MyElementTypes.Threat_2005));
		entry.setLargeIcon(entry.getSmallIcon());
		return entry;
	}

	/**
	 * @generated
	 */
	private ToolEntry createSecurityConstraint5CreationTool() {
		DefaultNodeToolEntry entry = new DefaultNodeToolEntry(
				finalYearName.diagram.part.Messages.SecurityConstraint5CreationTool_title,
				finalYearName.diagram.part.Messages.SecurityConstraint5CreationTool_desc,
				Collections
						.singletonList(finalYearName.diagram.providers.MyElementTypes.SecurityConstraint_2006));
		entry.setId("createSecurityConstraint5CreationTool"); //$NON-NLS-1$
		entry.setSmallIcon(finalYearName.diagram.providers.MyElementTypes
				.getImageDescriptor(finalYearName.diagram.providers.MyElementTypes.SecurityConstraint_2006));
		entry.setLargeIcon(entry.getSmallIcon());
		return entry;
	}

	/**
	 * @generated
	 */
	private ToolEntry createPlan6CreationTool() {
		DefaultNodeToolEntry entry = new DefaultNodeToolEntry(
				finalYearName.diagram.part.Messages.Plan6CreationTool_title,
				finalYearName.diagram.part.Messages.Plan6CreationTool_desc,
				Collections
						.singletonList(finalYearName.diagram.providers.MyElementTypes.Plan_2004));
		entry.setId("createPlan6CreationTool"); //$NON-NLS-1$
		entry.setSmallIcon(finalYearName.diagram.providers.MyElementTypes
				.getImageDescriptor(finalYearName.diagram.providers.MyElementTypes.Plan_2004));
		entry.setLargeIcon(entry.getSmallIcon());
		return entry;
	}

	/**
	 * @generated
	 */
	private ToolEntry createSecurityMechanism7CreationTool() {
		DefaultNodeToolEntry entry = new DefaultNodeToolEntry(
				finalYearName.diagram.part.Messages.SecurityMechanism7CreationTool_title,
				finalYearName.diagram.part.Messages.SecurityMechanism7CreationTool_desc,
				Collections
						.singletonList(finalYearName.diagram.providers.MyElementTypes.SecurityMechanism_2003));
		entry.setId("createSecurityMechanism7CreationTool"); //$NON-NLS-1$
		entry.setSmallIcon(finalYearName.diagram.providers.MyElementTypes
				.getImageDescriptor(finalYearName.diagram.providers.MyElementTypes.SecurityMechanism_2003));
		entry.setLargeIcon(entry.getSmallIcon());
		return entry;
	}

	/**
	 * @generated
	 */
	private ToolEntry createOrganisation8CreationTool() {
		DefaultNodeToolEntry entry = new DefaultNodeToolEntry(
				finalYearName.diagram.part.Messages.Organisation8CreationTool_title,
				finalYearName.diagram.part.Messages.Organisation8CreationTool_desc,
				Collections
						.singletonList(finalYearName.diagram.providers.MyElementTypes.Organisation_2009));
		entry.setId("createOrganisation8CreationTool"); //$NON-NLS-1$
		entry.setSmallIcon(finalYearName.diagram.providers.MyElementTypes
				.getImageDescriptor(finalYearName.diagram.providers.MyElementTypes.Organisation_2009));
		entry.setLargeIcon(entry.getSmallIcon());
		return entry;
	}

	/**
	 * @generated
	 */
	private ToolEntry createSoftGoal9CreationTool() {
		DefaultNodeToolEntry entry = new DefaultNodeToolEntry(
				finalYearName.diagram.part.Messages.SoftGoal9CreationTool_title,
				finalYearName.diagram.part.Messages.SoftGoal9CreationTool_desc,
				Collections
						.singletonList(finalYearName.diagram.providers.MyElementTypes.SoftGoal_2013));
		entry.setId("createSoftGoal9CreationTool"); //$NON-NLS-1$
		entry.setSmallIcon(finalYearName.diagram.providers.MyElementTypes
				.getImageDescriptor(finalYearName.diagram.providers.MyElementTypes.SoftGoal_2013));
		entry.setLargeIcon(entry.getSmallIcon());
		return entry;
	}

	/**
	 * @generated
	 */
	private ToolEntry createResource10CreationTool() {
		DefaultNodeToolEntry entry = new DefaultNodeToolEntry(
				finalYearName.diagram.part.Messages.Resource10CreationTool_title,
				finalYearName.diagram.part.Messages.Resource10CreationTool_desc,
				Collections
						.singletonList(finalYearName.diagram.providers.MyElementTypes.Resource_2011));
		entry.setId("createResource10CreationTool"); //$NON-NLS-1$
		entry.setSmallIcon(finalYearName.diagram.providers.MyElementTypes
				.getImageDescriptor(finalYearName.diagram.providers.MyElementTypes.Resource_2011));
		entry.setLargeIcon(entry.getSmallIcon());
		return entry;
	}

	/**
	 * @generated
	 */
	private ToolEntry createAttacker11CreationTool() {
		DefaultNodeToolEntry entry = new DefaultNodeToolEntry(
				finalYearName.diagram.part.Messages.Attacker11CreationTool_title,
				finalYearName.diagram.part.Messages.Attacker11CreationTool_desc,
				Collections
						.singletonList(finalYearName.diagram.providers.MyElementTypes.Attacker_2010));
		entry.setId("createAttacker11CreationTool"); //$NON-NLS-1$
		entry.setSmallIcon(finalYearName.diagram.providers.MyElementTypes
				.getImageDescriptor(finalYearName.diagram.providers.MyElementTypes.Attacker_2010));
		entry.setLargeIcon(entry.getSmallIcon());
		return entry;
	}

	/**
	 * @generated
	 */
	private ToolEntry createVulnerability12CreationTool() {
		DefaultNodeToolEntry entry = new DefaultNodeToolEntry(
				finalYearName.diagram.part.Messages.Vulnerability12CreationTool_title,
				finalYearName.diagram.part.Messages.Vulnerability12CreationTool_desc,
				Collections
						.singletonList(finalYearName.diagram.providers.MyElementTypes.Vulnerability_2012));
		entry.setId("createVulnerability12CreationTool"); //$NON-NLS-1$
		entry.setSmallIcon(finalYearName.diagram.providers.MyElementTypes
				.getImageDescriptor(finalYearName.diagram.providers.MyElementTypes.Vulnerability_2012));
		entry.setLargeIcon(entry.getSmallIcon());
		return entry;
	}

	/**
	 * @generated
	 */
	private ToolEntry createAttackMethod13CreationTool() {
		DefaultNodeToolEntry entry = new DefaultNodeToolEntry(
				finalYearName.diagram.part.Messages.AttackMethod13CreationTool_title,
				finalYearName.diagram.part.Messages.AttackMethod13CreationTool_desc,
				Collections
						.singletonList(finalYearName.diagram.providers.MyElementTypes.AttackMethod_2008));
		entry.setId("createAttackMethod13CreationTool"); //$NON-NLS-1$
		entry.setSmallIcon(finalYearName.diagram.providers.MyElementTypes
				.getImageDescriptor(finalYearName.diagram.providers.MyElementTypes.AttackMethod_2008));
		entry.setLargeIcon(entry.getSmallIcon());
		return entry;
	}

	/**
	 * @generated
	 */
	private ToolEntry createActor15CreationTool() {
		ToolEntry entry = new ToolEntry(
				finalYearName.diagram.part.Messages.Actor15CreationTool_title,
				finalYearName.diagram.part.Messages.Actor15CreationTool_desc,
				null, null) {
		};
		entry.setId("createActor15CreationTool"); //$NON-NLS-1$
		return entry;
	}

}
