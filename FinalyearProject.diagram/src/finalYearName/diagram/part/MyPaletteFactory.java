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
		ToolEntry entry = new ToolEntry(
				finalYearName.diagram.part.Messages.DependencyLink3CreationTool_title,
				finalYearName.diagram.part.Messages.DependencyLink3CreationTool_desc,
				null, null) {
		};
		entry.setId("createDependencyLink3CreationTool"); //$NON-NLS-1$
		return entry;
	}

	/**
	 * @generated
	 */
	private ToolEntry createDependencyLinkToGoal4CreationTool() {
		DefaultLinkToolEntry entry = new DefaultLinkToolEntry(
				finalYearName.diagram.part.Messages.DependencyLinkToGoal4CreationTool_title,
				finalYearName.diagram.part.Messages.DependencyLinkToGoal4CreationTool_desc,
				Collections
						.singletonList(finalYearName.diagram.providers.MyElementTypes.DependencyLink_4001));
		entry.setId("createDependencyLinkToGoal4CreationTool"); //$NON-NLS-1$
		entry.setSmallIcon(finalYearName.diagram.providers.MyElementTypes
				.getImageDescriptor(finalYearName.diagram.providers.MyElementTypes.DependencyLink_4001));
		entry.setLargeIcon(entry.getSmallIcon());
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

}
