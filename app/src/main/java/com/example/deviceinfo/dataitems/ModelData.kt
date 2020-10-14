package com.example.deviceinfo.dataitems

import android.os.Build
import com.example.deviceinfo.R

/**
 * Provides information about the model of the current device.
 */
class ModelData : SimpleListItem(R.string.model, Build.MODEL)
