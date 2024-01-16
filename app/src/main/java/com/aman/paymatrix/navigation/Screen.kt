package com.aman.taxcalculator.navigation

sealed class Screen(val route:String) {
    object UserDataScreen:Screen(USER_DATA_SCREEN)
    object MasterDataScreen:Screen(MASTER_DATA_SCREEN)
    object Ga55aDataScreen:Screen(GA55A_DATA_SCREEN)

}

//Screens

const val USER_DATA_SCREEN = "UserDataScreen"
const val MASTER_DATA_SCREEN = "MasterDataScreen"
const val GA55A_DATA_SCREEN = "Ga55aDataScreen"
