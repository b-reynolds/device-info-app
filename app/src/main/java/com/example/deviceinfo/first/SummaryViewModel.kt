package com.example.deviceinfo.first

import android.content.Context
import android.content.Context.BATTERY_SERVICE
import android.os.BatteryManager
import androidx.lifecycle.ViewModel
import com.example.deviceinfo.dataitems.BatteryCapacityData
import com.example.deviceinfo.dataitems.ManufacturerData
import com.xwray.groupie.Section

/**
 * A ViewModel for use with the [SummaryFragment].
 */
class SummaryViewModel : ViewModel() {

    /**
     * Generates the list of data items to display to the user.
     */
    fun getDataItems(context: Context) = listOf(
        Section(
            listOf(
                ManufacturerData(),
                BatteryCapacityData(
                    requireNotNull(context.getSystemService(BATTERY_SERVICE) as? BatteryManager)
                )
            )
        )
    )
}
