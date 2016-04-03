package finalYearName.diagram.navigator;

import org.eclipse.jface.viewers.ViewerSorter;

/**
 * @generated
 */
public class MyNavigatorSorter extends ViewerSorter {

	/**
	 * @generated
	 */
	private static final int GROUP_CATEGORY = 4003;

	/**
	 * @generated
	 */
	public int category(Object element) {
		if (element instanceof finalYearName.diagram.navigator.MyNavigatorItem) {
			finalYearName.diagram.navigator.MyNavigatorItem item = (finalYearName.diagram.navigator.MyNavigatorItem) element;
			return finalYearName.diagram.part.MyVisualIDRegistry
					.getVisualID(item.getView());
		}
		return GROUP_CATEGORY;
	}

}
