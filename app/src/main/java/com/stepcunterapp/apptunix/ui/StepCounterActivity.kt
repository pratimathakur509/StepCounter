package com.stepcunterapp.apptunix.ui

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.stepcunterapp.apptunix.R

class StepCounterActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_stepcounter)
        if (savedInstanceState == null) {
            supportFragmentManager.beginTransaction()
                .replace(R.id.container, StepCounterFragment.newInstance())
                .commitNow()
        }
    }

}