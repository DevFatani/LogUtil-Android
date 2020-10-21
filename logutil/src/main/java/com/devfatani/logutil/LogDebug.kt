package com.devfatani.logutil

import android.util.Log

public class LogDebug {
    public companion object {
        private const val TAG = "LogDebug"
        public fun printMessage(message: String) {
            Log.i(TAG, "printMessage: $message")
        }
    }
}