package finalYearName.diagram.providers;

/**
 * @generated
 */
public class ElementInitializers {

	protected ElementInitializers() {
		// use #getInstance to access cached instance
	}

	/**
	 * @generated
	 */
	public static ElementInitializers getInstance() {
		ElementInitializers cached = finalYearName.diagram.part.MyDiagramEditorPlugin
				.getInstance().getElementInitializers();
		if (cached == null) {
			finalYearName.diagram.part.MyDiagramEditorPlugin.getInstance()
					.setElementInitializers(cached = new ElementInitializers());
		}
		return cached;
	}
}
