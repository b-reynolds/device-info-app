package com.example.deviceinfo.dataitems

/**
 * Provides a simple piece of data to display to the user.
 */
interface DataItem {
    /**
     * Readable label of the data.
     */
    val label: String

    /**
     * Readable value of the data.
     */
    val value: String
}
