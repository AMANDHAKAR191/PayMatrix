package com.aman.taxcalculator.master_data.domain.repository

import com.aman.taxcalculator.master_data.domain.model.MasterData
import kotlinx.coroutines.flow.Flow

interface MasterDataRepository {

    fun getMasterData(): Flow<List<MasterData>>

    suspend fun getMasterDataById(nameOfPersonnel: String, mobileNo: String): MasterData?

    suspend fun insertMasterData(masterData: MasterData)

    suspend fun deleteMasterData(masterData: MasterData)
}