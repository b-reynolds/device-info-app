package com.example.deviceinfo.settings

import android.os.Bundle
import androidx.preference.ListPreference
import androidx.preference.PreferenceFragmentCompat
import com.example.deviceinfo.R
import com.example.deviceinfo.ThemeHelper

/**
 * A fragment used to display settings to the user.
 */
class SettingsFragment : PreferenceFragmentCompat() {

    override fun onCreatePreferences(savedInstanceState: Bundle?, rootKey: String?) {
        setPreferencesFromResource(R.xml.preferences, rootKey)
        findPreference<ListPreference>(getString(R.string.theme_key))
            ?.setOnPreferenceChangeListener { _, newValue ->
                handleThemeSelection(newValue as? String)
                true
            }
    }

    private fun handleThemeSelection(selection: String?) {
        if (selection == null) return

        ThemeHelper.applyTheme(selection)
    }
}
