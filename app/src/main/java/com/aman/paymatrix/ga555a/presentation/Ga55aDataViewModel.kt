package com.aman.taxcalculator.ga555a.presentation

import androidx.lifecycle.ViewModel
import com.aman.taxcalculator.ga555a.domain.model.Ga55aData
import dagger.hilt.android.lifecycle.HiltViewModel
import kotlinx.coroutines.flow.MutableStateFlow
import kotlinx.coroutines.flow.asStateFlow
import kotlinx.coroutines.flow.update
import javax.inject.Inject

@HiltViewModel
class Ga55aDataViewModel @Inject constructor(

) : ViewModel() {
    private var _state = MutableStateFlow(Ga55aDataState())
    val state = _state.asStateFlow()


    init {
        _state.update {
            it.copy(
                ga55aDataMonthList = listOf(
                    Ga55aData(
                        name = "John Doe",
                        pan = "ABCDE1234F",
                        tan = "TAN12345",
                        bankAccount = "1234567890",
                        post = "Manager",
                        siNo = "SI123",
                        gpfNo = "GPF123",
                        mobileNo = "1234567890",

                        month = "January",
                        basicPay = "50000",
                        dearnessPay = "5000",
                        leavePay = "2000",
                        splPay = "3000",
                        da = "6000",
                        hra = "7000",
                        washingAllowance = "800",
                        rpo = "200",
                        otherAllowance1 = "1000",
                        otherAllowance2 = "1500",
                        grossPay = "75000",
                        gpf = "5000",
                        gpfLoan = "1000",
                        si = "1500",
                        siLoanAndInt = "500",
                        rghs = "300",
                        lic = "2000",
                        groupInsuranceAccidental = "500",
                        incomeTaxOrTds = "10000",
                        benefactorFund = "1000",
                        cmCoronaRelief = "500",
                        otherDeduction1 = "200",
                        otherDeduction2 = "300",
                        totalDeduction = "20000",
                        netPayment = "55000"
                    )
                )
            )
        }
    }


    fun onEvent(event: Ga55aDataEvent) {
        when (event) {

            else -> {}
        }
    }
}