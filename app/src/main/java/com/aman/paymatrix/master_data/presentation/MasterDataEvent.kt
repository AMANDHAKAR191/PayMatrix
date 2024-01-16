package com.aman.taxcalculator.master_data.presentation

import com.aman.taxcalculator.user_data.presentation.MasterDataEvent

sealed class MasterDataEvent {
    object SaveMasterData : MasterDataEvent()

    data class UpdateNameOfOffice(val nameOfOffice: String) : MasterDataEvent()
    data class UpdateTanOfOffice(val tanOfOffice: String) : MasterDataEvent()
    data class UpdateNameOfPersonnel(val nameOfPersonnel: String) : MasterDataEvent()
    data class UpdatePayLevel(val payLevel: String) : MasterDataEvent()
    data class UpdatePanOfEmployee(val panOfEmployee: String) : MasterDataEvent()
    data class UpdateSiNumber(val siNumber: String) : MasterDataEvent()
    data class UpdateStateInsuranceMonthlyDeduction(val stateInsuranceMonthlyDeduction: String) : MasterDataEvent()
    data class UpdateBasicSalaryForMonth(val basicSalaryForMonth: String) : MasterDataEvent()
    data class UpdateIsNpsEmployee(val isNpsEmployee: Boolean) : MasterDataEvent()
    data class UpdateIsCommittedInFinancialYear(val isCommittedInFinancialYear: Boolean) : MasterDataEvent()
    data class UpdateLicPremiumDeductionFromSalary(val licPremiumDeductionFromSalary: String) : MasterDataEvent()
    data class UpdateIsGetSalaryFromPDHead(val isGetSalaryFromPDHead: Boolean) : MasterDataEvent()
    data class UpdateIsSeniorCitizen(val isSeniorCitizen: Boolean) : MasterDataEvent()
    data class UpdateNameOfDDO(val nameOfDDO: String) : MasterDataEvent()
    data class UpdateRankOfEmployee(val rankOfEmployee: String) : MasterDataEvent()
    data class UpdateNameOfService(val nameOfService: String) : MasterDataEvent()
    data class UpdateBankAccountNumber(val bankAccountNumber: String) : MasterDataEvent()
    data class UpdateGpfNo(val gpfNo: String) : MasterDataEvent()
    data class UpdateMobileNo(val mobileNo: String) : MasterDataEvent()
    data class UpdateRateOfHRA(val rateOfHRA: String) : MasterDataEvent()
    data class UpdateISGetBonus(val isGetBonus: Boolean) : MasterDataEvent()
    data class UpdateMonthOfMakingDeductedBill(val monthOfMakingDeductedBill: String) : MasterDataEvent()
    data class UpdateIsBenevolentFundDeduction(val isBenevolentFundDeduction: Boolean) : MasterDataEvent()
    data class UpdateUrbanCompensationAllowanceCCA(val urbanCompensationAllowanceCCA: String) : MasterDataEvent()
    data class UpdateGroupAccidentInsurancePremium(val groupAccidentInsurancePremium: String) : MasterDataEvent()
}