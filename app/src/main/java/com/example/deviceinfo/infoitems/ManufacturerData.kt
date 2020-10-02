package com.example.deviceinfo.infoitems

import android.os.Build

/**
 * Provides information on the Manufacturer of the current device.
 */
class ManufacturerData() : InfoItem {
    override val label: String get() = "Manufacturer"
    override val value: String get() = Build.MANUFACTURER
}
