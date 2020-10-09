package com.example.deviceinfo.dataitems

import android.os.BatteryManager
import com.example.deviceinfo.R

/**
 * Provides information on the current battery capacity of the current device.
 */
class BatteryCapacityData(batteryManager: BatteryManager) : SimpleListItem(
    R.string.battery_capacity,
    batteryManager.getIntProperty(BatteryManager.BATTERY_PROPERTY_CAPACITY).toString()
)
