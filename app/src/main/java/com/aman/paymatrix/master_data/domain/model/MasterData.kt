package com.aman.taxcalculator.master_data.domain.model

import androidx.annotation.NonNull
import androidx.room.Entity

@Entity(primaryKeys = ["nameOfPersonnel", "mobileNo"])
data class MasterData(
    var nameOfOffice: String = "",
    var tanOfOffice: String = "",
    @NonNull var nameOfPersonnel: String = "",
    var payLevel: String = "",
    var panOfEmployee: String = "",
    var siNumber: String = "",
    var stateInsuranceMonthlyDeduction: String = "",
    var basicSalaryForMonth: String = "",
    var isNpsEmployee: Boolean = false,
    var isCommittedInFinancialYear: Boolean = false,
    var licPremiumDeductionFromSalary: String = "",
    var isGetSalaryFromPDHead: Boolean = false,
    var isSeniorCitizen: Boolean = false,

    var nameOfDDO: String = "",
    var rankOfEmployee: String = "",
    var nameOfService: String = "",
    var bankAccountNumber: String = "",
    var gpfNo: String = "",
    @NonNull var mobileNo: String = "",
    var rateOfHRA: String = "",
    var isGetBonus: Boolean = false,
    var monthOfMakingDeductedBill: String = "",
    var groupAccidentInsurancePremium: String = "",
    var isBenevolentFundDeduction: Boolean = false,
    var urbanCompensationAllowanceCCA: String = ""
)

class InvaridMasterDataException(message:String):Exception(message)

//var stateInsuranceMonthlyDeduction: String = "",
//var basicSalaryForMonth: String = "",
//var isNpsEmployee: Boolean = false,
//var isCommittedInFinancialYear: Boolean = false,
//var licPremiumDeductionFromSalary: String = "",
//var isGetSalaryFromPDHead: Boolean = false,
//var isSeniorCitizen: Boolean = false,
//
//var rateOfHRA: String = "",
//var isGetBonus: Boolean = false,
//var monthOfMakingDeductedBill: String = "",
//var groupAccidentInsurancePremium: String = "",
//var isBenevolentFundDeduction: Boolean = false,
//var urbanCompensationAllowanceCCA: String = ""
