package com.stepcunterapp.apptunix.utils

import java.text.SimpleDateFormat
import java.util.*

object DateUtils {

    fun getFormattedDate(date: Date): String {
        val sdf = SimpleDateFormat("yyyy-M-dd HH:mm:ss", Locale.TAIWAN)
        return sdf.format(date)
    }

}