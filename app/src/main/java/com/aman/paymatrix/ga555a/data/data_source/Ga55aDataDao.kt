package com.aman.taxcalculator.ga555a.data.data_source

import androidx.room.Dao
import androidx.room.Delete
import androidx.room.Insert
import androidx.room.OnConflictStrategy
import androidx.room.Query
import com.aman.taxcalculator.ga555a.domain.model.Ga55aData
import com.aman.taxcalculator.master_data.domain.model.MasterData
import kotlinx.coroutines.flow.Flow

@Dao
interface Ga55aDataDao {
    @Query("SELECT * FROM ga55adata")
    fun getGa55aData(): Flow<List<Ga55aData>>

    @Query("SELECT * FROM ga55adata WHERE name = :name AND mobileNo = :mobileNo")
    suspend fun getGa55aDataById(name:String, mobileNo:String): Ga55aData?

    @Insert(onConflict = OnConflictStrategy.REPLACE)
    suspend fun insertGa55aData(ga55aData: Ga55aData)

    @Delete
    suspend fun deleteGa55aData(ga55aData: Ga55aData)
}