package com.aman.taxcalculator.master_data.presentation

import com.aman.taxcalculator.master_data.domain.model.MasterData

data class MasterDataState(
    val masterData: MasterData = MasterData()
)