package com.aman.taxcalculator.master_data.presentation

import androidx.lifecycle.ViewModel
import androidx.lifecycle.viewModelScope
import com.aman.taxcalculator.master_data.domain.repository.MasterDataRepository
import com.aman.taxcalculator.user_data.presentation.MasterDataEvent
import dagger.hilt.android.lifecycle.HiltViewModel
import kotlinx.coroutines.flow.MutableStateFlow
import kotlinx.coroutines.flow.asStateFlow
import kotlinx.coroutines.flow.update
import kotlinx.coroutines.launch
import javax.inject.Inject

@HiltViewModel
class MasterDataViewModel @Inject constructor(
    private val repository: MasterDataRepository
) : ViewModel() {

    private var _state = MutableStateFlow(MasterDataState())
    val state = _state.asStateFlow()

    fun Event(event: MasterDataEvent) {
        when (event) {
            MasterDataEvent.SaveMasterData -> {
                println("masterdata: ${state.value.masterData}")
                viewModelScope.launch {
                    repository.insertMasterData(state.value.masterData)
                }
            }

            is MasterDataEvent.UpdateNameOfOffice -> {
                _state.update {
                    it.copy(
                        masterData = it.masterData.copy(nameOfOffice = event.nameOfOffice)
                    )
                }
            }
            is MasterDataEvent.UpdateTanOfOffice -> {
                _state.update {
                    it.copy(
                        masterData = it.masterData.copy(tanOfOffice = event.tanOfOffice)
                    )
                }
            }
            is MasterDataEvent.UpdateNameOfPersonnel -> {
                _state.update {
                    it.copy(
                        masterData = it.masterData.copy(nameOfPersonnel = event.nameOfPersonnel)
                    )
                }
            }
            is MasterDataEvent.UpdatePayLevel -> {
                _state.update {
                    it.copy(
                        masterData = it.masterData.copy(payLevel = event.payLevel)
                    )
                }
            }
            is MasterDataEvent.UpdatePanOfEmployee -> {
                _state.update {
                    it.copy(
                        masterData = it.masterData.copy(panOfEmployee = event.panOfEmployee)
                    )
                }
            }
            is MasterDataEvent.UpdateSiNumber -> {
                _state.update {
                    it.copy(
                        masterData = it.masterData.copy(siNumber = event.siNumber)
                    )
                }
            }
            is MasterDataEvent.UpdateStateInsuranceMonthlyDeduction -> {
                _state.update {
                    it.copy(
                        masterData = it.masterData.copy(stateInsuranceMonthlyDeduction = event.stateInsuranceMonthlyDeduction)
                    )
                }
            }
            is MasterDataEvent.UpdateBasicSalaryForMonth -> {
                _state.update {
                    it.copy(
                        masterData = it.masterData.copy(basicSalaryForMonth = event.basicSalaryForMonth)
                    )
                }
            }
            is MasterDataEvent.UpdateIsNpsEmployee -> {
                _state.update {
                    it.copy(
                        masterData = it.masterData.copy(isNpsEmployee = event.isNpsEmployee)
                    )
                }
            }
            is MasterDataEvent.UpdateIsCommittedInFinancialYear -> {
                _state.update {
                    it.copy(
                        masterData = it.masterData.copy(isCommittedInFinancialYear = event.isCommittedInFinancialYear)
                    )
                }
            }
            is MasterDataEvent.UpdateIsGetSalaryFromPDHead -> {
                _state.update {
                    it.copy(
                        masterData = it.masterData.copy(isGetSalaryFromPDHead = event.isGetSalaryFromPDHead)
                    )
                }
            }
            is MasterDataEvent.UpdateLicPremiumDeductionFromSalary -> {
                _state.update {
                    it.copy(
                        masterData = it.masterData.copy(licPremiumDeductionFromSalary = event.licPremiumDeductionFromSalary)
                    )
                }
            }
            is MasterDataEvent.UpdateIsSeniorCitizen -> {
                _state.update {
                    it.copy(
                        masterData = it.masterData.copy(isSeniorCitizen = event.isSeniorCitizen)
                    )
                }
            }

            is MasterDataEvent.UpdateNameOfDDO -> {
                _state.update {
                    it.copy(
                        masterData = it.masterData.copy(nameOfDDO = event.nameOfDDO)
                    )
                }
            }
            is MasterDataEvent.UpdateRankOfEmployee -> {
                _state.update {
                    it.copy(
                        masterData = it.masterData.copy(rankOfEmployee = event.rankOfEmployee)
                    )
                }
            }
            is MasterDataEvent.UpdateNameOfService -> {
                _state.update {
                    it.copy(
                        masterData = it.masterData.copy(nameOfService = event.nameOfService)
                    )
                }
            }
            is MasterDataEvent.UpdateBankAccountNumber -> {
                _state.update {
                    it.copy(
                        masterData = it.masterData.copy(bankAccountNumber = event.bankAccountNumber)
                    )
                }
            }
            is MasterDataEvent.UpdateGpfNo -> {
                _state.update {
                    it.copy(
                        masterData = it.masterData.copy(gpfNo = event.gpfNo)
                    )
                }
            }
            is MasterDataEvent.UpdateMobileNo -> {
                _state.update {
                    it.copy(
                        masterData = it.masterData.copy(mobileNo = event.mobileNo)
                    )
                }
            }
            is MasterDataEvent.UpdateRateOfHRA -> {
                _state.update {
                    it.copy(
                        masterData = it.masterData.copy(rateOfHRA = event.rateOfHRA)
                    )
                }
            }
            is MasterDataEvent.UpdateISGetBonus -> {
                _state.update {
                    it.copy(
                        masterData = it.masterData.copy(isGetBonus = event.isGetBonus)
                    )
                }
            }
            is MasterDataEvent.UpdateMonthOfMakingDeductedBill -> {
                _state.update {
                    it.copy(
                        masterData = it.masterData.copy(monthOfMakingDeductedBill = event.monthOfMakingDeductedBill)
                    )
                }
            }

            is MasterDataEvent.UpdateGroupAccidentInsurancePremium -> {
                _state.update {
                    it.copy(
                        masterData = it.masterData.copy(groupAccidentInsurancePremium = event.groupAccidentInsurancePremium)
                    )
                }
            }
            is MasterDataEvent.UpdateIsBenevolentFundDeduction -> {
                _state.update {
                    it.copy(
                        masterData = it.masterData.copy(isBenevolentFundDeduction = event.isBenevolentFundDeduction)
                    )
                }
            }
            is MasterDataEvent.UpdateUrbanCompensationAllowanceCCA -> {
                _state.update {
                    it.copy(
                        masterData = it.masterData.copy(urbanCompensationAllowanceCCA = event.urbanCompensationAllowanceCCA)
                    )
                }
            }

        }
    }

}