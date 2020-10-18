package com.example.deviceinfo.settings

import android.os.Bundle
import androidx.appcompat.app.AppCompatDelegate
import androidx.preference.ListPreference
import androidx.preference.PreferenceFragmentCompat
import com.example.deviceinfo.R

/**
 * A fragment used to display settings to the user.
 */
class SettingsFragment : PreferenceFragmentCompat() {
    private val themes: Map<String, Int>
        get() {
            val values = resources.getStringArray(R.array.themes)
            return mapOf(
                values[0] to AppCompatDelegate.MODE_NIGHT_NO,
                values[1] to AppCompatDelegate.MODE_NIGHT_YES,
                values[2] to AppCompatDelegate.MODE_NIGHT_FOLLOW_SYSTEM
            )
        }

    override fun onCreatePreferences(savedInstanceState: Bundle?, rootKey: String?) {
        setPreferencesFromResource(R.xml.preferences, rootKey)
        findPreference<ListPreference>(getString(R.string.theme_key))
            ?.setOnPreferenceChangeListener { _, newValue ->
                handleThemeSelection(themes, newValue as? String)
                true
            }
    }

    private fun handleThemeSelection(themes: Map<String, Int>, selection: String?) {
        if (selection == null) return
        val selectionId = themes[selection] ?: return

        AppCompatDelegate.setDefaultNightMode(selectionId)
    }
}
