package com.aman.paymatrix.master_data

import android.content.Context
import android.content.SharedPreferences
import com.aman.taxcalculator.TaxCalculator

class MasterSharedPref() {
    var sharedPreferences: SharedPreferences
    val SHARED_PREF_PAY_MATRIX = "keysSharedPreference"

    //
    val NAME_OF_OFFICE = "NameOfOffice"
    val TAN_OF_OFFICE = "TanOfOffice"
    val

    init {
        sharedPreferences = TaxCalculator.instance.getSharedPreferences(SHARED_PREF_PAY_MATRIX, Context.MODE_PRIVATE)
    }
}