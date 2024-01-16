package com.aman.taxcalculator.user_data.presentation

import com.aman.taxcalculator.user_data.domain.model.UserData

data class UserDataState(
    val userData: UserData = UserData()
)