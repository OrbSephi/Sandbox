package org.mathieu.sandbox.utils

import android.content.Context
import android.os.Vibrator
import androidx.core.content.ContextCompat

// Function for vibration
fun vibratePhone(context: Context) {
    val vibrator = ContextCompat.getSystemService(context, Vibrator::class.java) as Vibrator

    if (vibrator.hasVibrator()) {
            @Suppress("DEPRECATION")
            vibrator.vibrate(100)
    }
}