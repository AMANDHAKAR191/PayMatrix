package com.aman.taxcalculator.di

import android.app.Application
import androidx.room.Room
import com.aman.taxcalculator.master_data.data.data_source.MasterDataDB
import com.aman.taxcalculator.user_data.data.repository.MasterDataRepositoryImpl
import com.aman.taxcalculator.master_data.domain.repository.MasterDataRepository
import dagger.Module
import dagger.Provides
import dagger.hilt.InstallIn
import dagger.hilt.android.components.ViewModelComponent

@Module
@InstallIn(ViewModelComponent::class)
class AppModule {

    @Provides
    fun provideMasterDataDB(application: Application): MasterDataDB {
        return Room.databaseBuilder(
            application,
            MasterDataDB::class.java,
            MasterDataDB.DATABASE_NAME
        ).build()
    }

    @Provides
    fun provideMasterDataRepository(db: MasterDataDB): MasterDataRepository {
        return MasterDataRepositoryImpl(db.masterDataDao)
    }


}