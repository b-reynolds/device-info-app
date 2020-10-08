package com.example.deviceinfo.first

import androidx.lifecycle.ViewModel
import com.example.deviceinfo.dataitems.ManufacturerData
import com.xwray.groupie.Section

/**
 * A ViewModel for use with the [SummaryFragment].
 */
class SummaryViewModel : ViewModel() {
    /**
     * The list of data items to display to the user.
     */
    val dataItems = listOf(
        Section(
            ManufacturerData()
        )
    )
}
