package com.aman.taxcalculator.user_data.domain.repository

import com.aman.taxcalculator.user_data.domain.model.UserData
import kotlinx.coroutines.flow.Flow

interface UserDataRepository {
    fun getUserData(): Flow<List<UserData>>
    suspend fun getUserDataById(nameOfPersonnel: String, mobileNo: String): UserData?
    suspend fun insertUserData(masterData: UserData)
    suspend fun deleteUserData(masterData: UserData)
}