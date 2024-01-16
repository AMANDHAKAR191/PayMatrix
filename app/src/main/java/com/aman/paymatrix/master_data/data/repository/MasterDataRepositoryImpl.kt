package com.aman.taxcalculator.master_data.data.repository

import com.aman.taxcalculator.user_data.data.data_source.UserDataDao
import com.aman.taxcalculator.master_data.domain.model.MasterData
import com.aman.taxcalculator.master_data.domain.repository.MasterDataRepository
import kotlinx.coroutines.flow.Flow

class MasterDataRepositoryImpl(
    private val dao: UserDataDao
) : MasterDataRepository {
    override fun getMasterData(): Flow<List<MasterData>> {
        return dao.getMasterData()
    }

    override suspend fun getMasterDataById(nameOfPersonnel: String, mobileNo: String): MasterData? {
        return dao.getMasterDataById(nameOfPersonnel = nameOfPersonnel, mobileNo = mobileNo)
    }

    override suspend fun insertMasterData(masterData: MasterData) {
        dao.insertMasterData(masterData = masterData)
    }

    override suspend fun deleteMasterData(masterData: MasterData) {
        dao.deleteMasterData(masterData = masterData)
    }
 

}