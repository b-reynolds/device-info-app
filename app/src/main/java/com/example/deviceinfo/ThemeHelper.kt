package com.example.deviceinfo

import android.os.Build
import androidx.appcompat.app.AppCompatDelegate

/**
 * Helper class for working with Day Night themes.
 *
 */
object ThemeHelper {
    private const val DAY_THEME = "Day"
    private const val NIGHT_THEME = "Night"
    const val DEFAULT_MODE = "System"

    /**
     * Apply a theme to the app.
     */
    fun applyTheme(themePref: String) {
        when (themePref) {
            DAY_THEME -> AppCompatDelegate.setDefaultNightMode(AppCompatDelegate.MODE_NIGHT_NO)
            NIGHT_THEME -> AppCompatDelegate.setDefaultNightMode(AppCompatDelegate.MODE_NIGHT_YES)
            else ->
                if (Build.VERSION.SDK_INT >= Build.VERSION_CODES.Q) {
                    AppCompatDelegate.setDefaultNightMode(AppCompatDelegate.MODE_NIGHT_FOLLOW_SYSTEM)
                } else {
                    AppCompatDelegate.setDefaultNightMode(AppCompatDelegate.MODE_NIGHT_AUTO_BATTERY)
                }
        }
    }
}
