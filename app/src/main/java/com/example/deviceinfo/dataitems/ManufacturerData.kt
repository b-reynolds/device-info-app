package com.example.deviceinfo.dataitems

import android.os.Build

/**
 * Provides information on the Manufacturer of the current device.
 */
class ManufacturerData() : DataItem {
    override val label: String get() = "Manufacturer"
    override val value: String get() = Build.MANUFACTURER
}
