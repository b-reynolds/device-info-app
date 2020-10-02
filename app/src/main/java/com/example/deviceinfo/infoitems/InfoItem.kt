package com.example.deviceinfo.infoitems

/**
 * Provides a simple piece of data to display to the user.
 */
interface InfoItem {
    /**
     * Readable label of the data.
     */
    val label: String

    /**
     * Readable value of the data.
     */
    val value: String
}
