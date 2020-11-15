package com.example.deviceinfo

import android.app.Application
import androidx.preference.PreferenceManager

/**
 * Main entry point of the application.
 */
class App : Application() {

    override fun onCreate() {
        super.onCreate()
        val sharedPreferences = PreferenceManager.getDefaultSharedPreferences(this)
        val themePref = sharedPreferences.getString(
            getString(R.string.theme_key),
            ThemeHelper.DEFAULT_MODE
        )
        ThemeHelper.applyTheme(themePref!!)
    }
}
