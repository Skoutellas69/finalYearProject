package finalYearName.diagram.providers.assistants;

import java.util.ArrayList;
import java.util.List;

import org.eclipse.core.runtime.IAdaptable;
import org.eclipse.gmf.runtime.emf.type.core.IElementType;

/**
 * @generated
 */
public class MyModelingAssistantProviderOfModelEditPart extends
		finalYearName.diagram.providers.MyModelingAssistantProvider {

	/**
	 * @generated
	 */
	@Override
	public List<IElementType> getTypesForPopupBar(IAdaptable host) {
		List<IElementType> types = new ArrayList<IElementType>(7);
		types.add(finalYearName.diagram.providers.MyElementTypes.Actor_2001);
		types.add(finalYearName.diagram.providers.MyElementTypes.SecurityConstraint_2006);
		types.add(finalYearName.diagram.providers.MyElementTypes.Plan_2004);
		types.add(finalYearName.diagram.providers.MyElementTypes.Goal_2002);
		types.add(finalYearName.diagram.providers.MyElementTypes.Threat_2005);
		types.add(finalYearName.diagram.providers.MyElementTypes.SecurityObjective_2007);
		types.add(finalYearName.diagram.providers.MyElementTypes.SecurityMechanism_2003);
		return types;
	}

}
