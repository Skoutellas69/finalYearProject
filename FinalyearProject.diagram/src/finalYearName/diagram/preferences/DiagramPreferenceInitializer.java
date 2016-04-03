package finalYearName.diagram.preferences;

import org.eclipse.core.runtime.preferences.AbstractPreferenceInitializer;
import org.eclipse.jface.preference.IPreferenceStore;

/**
 * @generated
 */
public class DiagramPreferenceInitializer extends AbstractPreferenceInitializer {

	/**
	 * @generated
	 */
	public void initializeDefaultPreferences() {
		IPreferenceStore store = getPreferenceStore();
		finalYearName.diagram.preferences.DiagramGeneralPreferencePage
				.initDefaults(store);
		finalYearName.diagram.preferences.DiagramAppearancePreferencePage
				.initDefaults(store);
		finalYearName.diagram.preferences.DiagramConnectionsPreferencePage
				.initDefaults(store);
		finalYearName.diagram.preferences.DiagramPrintingPreferencePage
				.initDefaults(store);
		finalYearName.diagram.preferences.DiagramRulersAndGridPreferencePage
				.initDefaults(store);

	}

	/**
	 * @generated
	 */
	protected IPreferenceStore getPreferenceStore() {
		return finalYearName.diagram.part.MyDiagramEditorPlugin.getInstance()
				.getPreferenceStore();
	}
}
