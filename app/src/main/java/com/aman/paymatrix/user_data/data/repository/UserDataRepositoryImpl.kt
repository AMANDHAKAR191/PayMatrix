package com.aman.taxcalculator.user_data.data.repository

import com.aman.taxcalculator.user_data.data.data_source.UserDataDao
import com.aman.taxcalculator.user_data.domain.model.UserData
import com.aman.taxcalculator.user_data.domain.repository.UserDataRepository
import kotlinx.coroutines.flow.Flow

class UserDataRepositoryImpl(
    private val dao: UserDataDao
) : UserDataRepository {
    override fun getUserData(): Flow<List<UserData>> {
        return dao.getUserData()
    }

    override suspend fun getUserDataById(nameOfEmployee: String, mobileNumber: String): UserData? {
        return dao.getUserDataById(nameOfEmployee =  nameOfEmployee, mobileNumber = mobileNumber)
    }

    override suspend fun insertUserData(userData: UserData) {
        dao.insertUserData(userData = userData)
    }

    override suspend fun deleteUserData(userData: UserData) {
        dao.deleteUserData(userData = userData)
    }
 

}