package com.aman.taxcalculator.ga555a.data.repository

import com.aman.taxcalculator.ga555a.data.data_source.Ga55aDataDao
import com.aman.taxcalculator.ga555a.domain.model.Ga55aData
import com.aman.taxcalculator.ga555a.domain.repository.Ga55aDataRepository
import com.aman.taxcalculator.master_data.domain.model.MasterData
import kotlinx.coroutines.flow.Flow

class Ga55aDataRepositoryImpl(
    private val ga55aDataDao: Ga55aDataDao
): Ga55aDataRepository {
    override fun getGa55aData(): Flow<List<Ga55aData>> {
        return ga55aDataDao.getGa55aData()
    }

    override suspend fun getGa55aDataById(name:String, mobileNo:String): Ga55aData? {
        return ga55aDataDao.getGa55aDataById(name, mobileNo)
    }

    override suspend fun insertGa55aData(ga55aData: Ga55aData) {
        return ga55aDataDao.insertGa55aData(ga55aData)
    }

    override suspend fun deleteGa55aData(ga55aData: Ga55aData) {
        return ga55aDataDao.deleteGa55aData(ga55aData)
    }

}