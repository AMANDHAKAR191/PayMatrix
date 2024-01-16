package com.aman.taxcalculator.ga555a.data.data_source

import androidx.room.Database
import androidx.room.RoomDatabase
import com.aman.taxcalculator.ga555a.domain.model.Ga55aData


@Database(
    entities = [Ga55aData::class],
    exportSchema = false,
    version = 1
)
abstract class Ga55aDataDB : RoomDatabase() {

    abstract val ga55aDataDao:Ga55aDataDao

    companion object {
        const val DATABASE_NAME = "ga55a_data_db"
    }

}