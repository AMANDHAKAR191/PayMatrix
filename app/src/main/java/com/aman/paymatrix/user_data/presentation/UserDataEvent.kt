package com.aman.taxcalculator.user_data.presentation

sealed class UserDataEvent {
    object SaveUserData : UserDataEvent()
    data class UpdateNameOfOffice(val nameOfOffice: String) : UserDataEvent()
    data class UpdateTanOfOffice(val tanOfOffice: String) : UserDataEvent()
    data class UpdatePayLevel(val payLevel: String) : UserDataEvent()
    data class UpdateNameOfEmployee(val nameOfPersonnel: String) : UserDataEvent()
    data class UpdatePanOfEmployee(val panOfEmployee: String) : UserDataEvent()
    data class UpdateSiNumber(val siNumber: String) : UserDataEvent()

    data class UpdateNameOfDDO(val nameOfDDO: String) : UserDataEvent()
    data class UpdateRankOfEmployee(val rankOfEmployee: String) : UserDataEvent()
    data class UpdateNameOfService(val nameOfService: String) : UserDataEvent()
    data class UpdateBankAccountNumber(val bankAccountNumber: String) : UserDataEvent()
    data class UpdateGpfNo(val gpfNo: String) : UserDataEvent()
    data class UpdateMobileNo(val mobileNo: String) : UserDataEvent()
}