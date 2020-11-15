package com.example.deviceinfo

import android.os.Bundle
import android.view.Menu
import android.view.MenuItem
import android.view.View
import androidx.appcompat.app.AppCompatActivity
import androidx.navigation.findNavController

/**
 * First activity which will be launched when the app is opened.
 */
class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        setSupportActionBar(findViewById(R.id.toolbar))
    }

    override fun onCreateOptionsMenu(menu: Menu): Boolean {
        menuInflater.inflate(R.menu.menu_main, menu)
        return true
    }

    override fun onOptionsItemSelected(item: MenuItem): Boolean {
        return when (item.itemId) {
            R.id.action_settings -> {
                findViewById<View>(R.id.nav_host_fragment).findNavController().apply {
                    if (currentDestination?.id != R.id.settingsFragment) {
                        navigate(R.id.toSettingsFragment)
                    }
                }
                true
            }
            else -> super.onOptionsItemSelected(item)
        }
    }
}
