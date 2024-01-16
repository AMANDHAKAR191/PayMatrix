package com.aman.taxcalculator.ga555a.domain.repository

import com.aman.taxcalculator.ga555a.domain.model.Ga55aData
import com.aman.taxcalculator.master_data.domain.model.MasterData
import kotlinx.coroutines.flow.Flow

interface Ga55aDataRepository {

    fun getGa55aData(): Flow<List<Ga55aData>>

    suspend fun getGa55aDataById(name:String, mobileNo:String): Ga55aData?

    suspend fun insertGa55aData(ga55aData: Ga55aData)

    suspend fun deleteGa55aData(ga55aData: Ga55aData)
}