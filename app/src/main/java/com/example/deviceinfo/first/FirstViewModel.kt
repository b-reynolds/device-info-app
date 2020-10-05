package com.example.deviceinfo.first

import androidx.lifecycle.ViewModel
import com.example.deviceinfo.dataitems.DataItem
import com.example.deviceinfo.dataitems.ManufacturerData

/**
 * A ViewModel for use with the [FirstFragment].
 */
class FirstViewModel : ViewModel() {
    /**
     * Initial list of [DataItem] to display to the user.
     */
    val dataItems = listOf<DataItem>(
        ManufacturerData()
    )
}
