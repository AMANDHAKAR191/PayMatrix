package com.aman.taxcalculator.user_data.domain.model

import androidx.annotation.NonNull
import androidx.room.Entity

@Entity(primaryKeys = ["nameOfPersonnel", "mobileNo"])
data class UserData(
    val nameOfEmployee:String = "",
    val nameOfOffice:String = "",
    val panNumber:String = "",
    val tanNumber:String = "",
    val siNumber:String = "",
    val mobileNumber:String = "",
    val bankAccountNumber:String = "",
    val payLevel:List<String> = emptyList(), // post
    val rankOfEmployee:String = "",
    val nameOfService:String = "",
    val nameOfDDO:String = "",
    val gpfNumber:String = "",

)

class InvalidUserDataException(message:String):Exception(message)

//user data
//
//nameOfEmployee
//nameOfOffice
//panNumber
//tanNumber
//siNumber
//mobileNumber
//bankAccountNumber
//post/payLevel
//rankOfEmployee
//nameOfService
//nameOfDDO
//gpfNumber
