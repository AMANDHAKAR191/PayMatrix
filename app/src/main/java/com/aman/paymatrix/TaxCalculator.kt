package com.aman.taxcalculator

import android.app.Application
import dagger.hilt.android.HiltAndroidApp

@HiltAndroidApp
class TaxCalculator:Application(){
    companion object{
        lateinit var instance:TaxCalculator
            private set
    }

    override fun onCreate() {
        super.onCreate()
        instance = this
    }
}