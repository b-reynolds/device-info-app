package com.example.deviceinfo.dataitems

import android.os.Build
import com.example.deviceinfo.R

/**
 * Provides information on the Manufacturer of the current device.
 */
class ManufacturerData : SimpleListItem(R.string.manufacturer, Build.MANUFACTURER)
