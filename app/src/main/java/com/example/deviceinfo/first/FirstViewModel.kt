package com.example.deviceinfo.first

import androidx.lifecycle.ViewModel
import com.example.deviceinfo.dataitems.ManufacturerData
import com.xwray.groupie.Section

/**
 * A ViewModel for use with the [FirstFragment].
 */
class FirstViewModel : ViewModel() {
    /**
     * The list of data items to display to the user.
     */
    val dataItems = listOf(
        Section(
            ManufacturerData()
        )
    )
}
