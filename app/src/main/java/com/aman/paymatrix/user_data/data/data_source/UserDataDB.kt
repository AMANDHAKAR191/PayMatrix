package com.aman.taxcalculator.user_data.data.data_source

import androidx.room.Database
import androidx.room.RoomDatabase
import com.aman.taxcalculator.user_data.domain.model.UserData

@Database(
    entities = [UserData::class],
    exportSchema = false,
    version = 1
)
abstract class UserDataDB : RoomDatabase() {

    abstract val userDataDao: UserDataDao

    companion object {
        const val DATABASE_NAME = "user_data_db"
    }

}