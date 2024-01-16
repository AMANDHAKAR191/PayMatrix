package com.aman.taxcalculator.user_data.data.data_source

import androidx.room.Dao
import androidx.room.Delete
import androidx.room.Insert
import androidx.room.OnConflictStrategy
import androidx.room.Query
import com.aman.taxcalculator.user_data.domain.model.UserData
import kotlinx.coroutines.flow.Flow

@Dao
interface UserDataDao {
    @Query("SELECT * FROM userdata")
    fun getUserData(): Flow<List<UserData>>

    @Query("SELECT * FROM userdata WHERE nameOfEmployee = :nameOfEmployee AND mobileNumber = :mobileNumber")
    suspend fun getUserDataById(nameOfEmployee: String, mobileNumber: String): UserData?

    @Insert(onConflict = OnConflictStrategy.REPLACE)
    suspend fun insertUserData(userData: UserData)

    @Delete
    suspend fun deleteUserData(userData: UserData)
}
