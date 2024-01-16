package com.aman.taxcalculator.master_data.presentation

import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.width
import androidx.compose.foundation.rememberScrollState
import androidx.compose.foundation.text.KeyboardOptions
import androidx.compose.foundation.verticalScroll
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.AddAPhoto
import androidx.compose.material3.Button
import androidx.compose.material3.ExperimentalMaterial3Api
import androidx.compose.material3.Icon
import androidx.compose.material3.IconButton
import androidx.compose.material3.Scaffold
import androidx.compose.material3.Switch
import androidx.compose.material3.Text
import androidx.compose.material3.TextField
import androidx.compose.material3.TopAppBar
import androidx.compose.runtime.Composable
import androidx.compose.runtime.collectAsState
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.res.stringResource
import androidx.compose.ui.text.input.ImeAction
import androidx.compose.ui.text.input.KeyboardType
import androidx.compose.ui.text.style.TextOverflow
import androidx.compose.ui.unit.dp
import androidx.core.text.isDigitsOnly
import com.aman.taxcalculator.R
import kotlinx.coroutines.flow.StateFlow

@OptIn(ExperimentalMaterial3Api::class)
@Composable
fun MasterDataScreen(
    _state: StateFlow<MasterDataState>,
    onEvent: (MasterDataEvent) -> Unit,
    navigateToGa55aDataScreen:()->Unit
) {
    Scaffold(
        topBar = { TopAppBar(
            title = { Text(text = "Master") },
            actions = {
                IconButton(onClick = { navigateToGa55aDataScreen() }) {
                    Icon(imageVector = Icons.Default.AddAPhoto, contentDescription = "")
                }
            }) },
        content = { innerPadding ->
            Column(
                modifier = Modifier
                    .padding(innerPadding)
                    .verticalScroll(rememberScrollState())
            ) {
                val state = _state.collectAsState()
                val masterData = state.value.masterData

                TextField(
                    value = masterData.nameOfOffice,
                    onValueChange = {
                        onEvent(MasterDataEvent.UpdateNameOfOffice(it))
                    },
                    modifier = Modifier.fillMaxWidth(),
                    label = { Text(text = stringResource(id = R.string.nameOfOffice)) },
                    isError = masterData.nameOfOffice != "" && com.aman.taxcalculator.user_data.presentation.validateString(
                        masterData.nameOfOffice
                    ),
                    supportingText = {
                        if (com.aman.taxcalculator.user_data.presentation.validateString(masterData.nameOfOffice)) {
                            Text(text = "Office name should not contain number")
                        }
                    },
                    keyboardOptions = KeyboardOptions(
                        keyboardType = KeyboardType.Text,
                        imeAction = ImeAction.Next
                    )
                )
                TextField(
                    value = masterData.tanOfOffice,
                    onValueChange = {
                        onEvent(MasterDataEvent.UpdateTanOfOffice(it))
                    },
                    modifier = Modifier.fillMaxWidth(),
                    label = { Text(text = stringResource(id = R.string.tanOfOffice)) },
                    isError = masterData.tanOfOffice != "" && com.aman.taxcalculator.user_data.presentation.validateString(
                        masterData.tanOfOffice
                    ),
                    supportingText = {
                        if (com.aman.taxcalculator.user_data.presentation.validateString(masterData.tanOfOffice)) {
                            Text(text = "TAN should not contain number")
                        }
                    },
                    keyboardOptions = KeyboardOptions(
                        keyboardType = KeyboardType.Text,
                        imeAction = ImeAction.Next
                    )
                )
                TextField(
                    value = masterData.nameOfPersonnel,
                    onValueChange = { onEvent(MasterDataEvent.UpdateNameOfPersonnel(it)) },
                    modifier = Modifier.fillMaxWidth(),
                    label = { Text(text = stringResource(id = R.string.nameOfPersonnel)) },
                    isError = masterData.nameOfPersonnel != "" && com.aman.taxcalculator.user_data.presentation.validateString(
                        masterData.nameOfPersonnel
                    ),
                    supportingText = {
                        if (com.aman.taxcalculator.user_data.presentation.validateString(masterData.nameOfPersonnel)) {
                            Text(text = "Name should not contain number")
                        }
                    },
                    keyboardOptions = KeyboardOptions(
                        keyboardType = KeyboardType.Text,
                        imeAction = ImeAction.Next
                    )
                )
                TextField(
                    value = masterData.payLevel,
                    onValueChange = {
                        onEvent(MasterDataEvent.UpdatePayLevel(it))
                    },
                    modifier = Modifier.fillMaxWidth(),
                    label = { Text(text = stringResource(id = R.string.payLevel)) },
                    isError = masterData.payLevel != "" && com.aman.taxcalculator.user_data.presentation.validateString(
                        masterData.payLevel
                    ),
                    supportingText = {
                        if (com.aman.taxcalculator.user_data.presentation.validateString(masterData.payLevel)) {
                            Text(text = "Office name should not contain number")
                        }
                    },
                    keyboardOptions = KeyboardOptions(
                        keyboardType = KeyboardType.Text,
                        imeAction = ImeAction.Next
                    )
                )
                TextField(
                    value = masterData.panOfEmployee,
                    onValueChange = {
                        onEvent(MasterDataEvent.UpdatePanOfEmployee(it))
                    },
                    modifier = Modifier.fillMaxWidth(),
                    label = { Text(text = stringResource(id = R.string.panOfTheEmployee)) },
                    isError = !masterData.panOfEmployee.isDigitsOnly(),
                    supportingText = {
                        if (!masterData.urbanCompensationAllowanceCCA.isDigitsOnly()) {
                            Text(text = "Amount should be in number")
                        }
                    },
                    keyboardOptions = KeyboardOptions(
                        keyboardType = KeyboardType.Email,
                        imeAction = ImeAction.Next
                    )
                )
                TextField(
                    value = masterData.siNumber,
                    onValueChange = {
                        onEvent(MasterDataEvent.UpdateSiNumber(it))
                    },
                    modifier = Modifier.fillMaxWidth(),
                    label = { Text(text = stringResource(id = R.string.siNumber)) },
                    isError = !masterData.siNumber.isDigitsOnly(),
                    supportingText = {
                        if (!masterData.siNumber.isDigitsOnly()) {
                            Text(text = "Amount should be in number")
                        }
                    },
                    keyboardOptions = KeyboardOptions(
                        keyboardType = KeyboardType.Number,
                        imeAction = ImeAction.Next
                    )
                )

                TextField(
                    value = masterData.stateInsuranceMonthlyDeduction,
                    onValueChange = {
                        onEvent(MasterDataEvent.UpdateStateInsuranceMonthlyDeduction(it))
                    },
                    modifier = Modifier.fillMaxWidth(),
                    label = { Text(text = stringResource(id = R.string.stateInsuranceMonthlyDeduction)) },
                    isError = !masterData.stateInsuranceMonthlyDeduction.isDigitsOnly(),
                    supportingText = {
                        if (!masterData.stateInsuranceMonthlyDeduction.isDigitsOnly()) {
                            Text(text = "Amount should be in number")
                        }
                    },
                    keyboardOptions = KeyboardOptions(
                        keyboardType = KeyboardType.Number,
                        imeAction = ImeAction.Next
                    )
                )
                TextField(
                    value = masterData.basicSalaryForMonth,
                    onValueChange = { onEvent(MasterDataEvent.UpdateBasicSalaryForMonth(it)) },
                    modifier = Modifier.fillMaxWidth(),
                    label = { Text(text = stringResource(id = R.string.basicSalaryForMonth)) },
                    isError = !masterData.basicSalaryForMonth.isDigitsOnly(),
                    supportingText = {
                        if (!masterData.basicSalaryForMonth.isDigitsOnly()) {
                            Text(text = "Amount should be in number")
                        }
                    },
                    keyboardOptions = KeyboardOptions(
                        keyboardType = KeyboardType.Number,
                        imeAction = ImeAction.Next
                    )
                )
                CustomSwitch(
                    label = R.string.isNpsEmployee,
                    value = masterData.isNpsEmployee,
                    onCheckedChange = {
                        onEvent(MasterDataEvent.UpdateIsNpsEmployee(it))
                    })
                CustomSwitch(
                    label = R.string.isCommittedInFinancialYear,
                    value = masterData.isCommittedInFinancialYear,
                    onCheckedChange = {
                        onEvent(MasterDataEvent.UpdateIsCommittedInFinancialYear(it))
                    })
                TextField(
                    value = masterData.licPremiumDeductionFromSalary,
                    onValueChange = {
                        onEvent(MasterDataEvent.UpdateLicPremiumDeductionFromSalary(it))
                    },
                    modifier = Modifier.fillMaxWidth(),
                    label = { Text(text = stringResource(id = R.string.licPremiumDeductionFromSalary)) },
                    isError = !masterData.licPremiumDeductionFromSalary.isDigitsOnly(),
                    supportingText = {
                        if (!masterData.licPremiumDeductionFromSalary.isDigitsOnly()) {
                            Text(text = "Amount should be in number")
                        }
                    },
                    keyboardOptions = KeyboardOptions(
                        keyboardType = KeyboardType.Number,
                        imeAction = ImeAction.Next
                    )
                )
                CustomSwitch(
                    label = R.string.isGetSalaryFromPDHead,
                    value = masterData.isGetSalaryFromPDHead,
                    onCheckedChange = {
                        onEvent(MasterDataEvent.UpdateIsGetSalaryFromPDHead(it))
                    })
                CustomSwitch(
                    label = R.string.isSeniorCitizen,
                    value = masterData.isSeniorCitizen,
                    onCheckedChange = {
                        onEvent(MasterDataEvent.UpdateIsSeniorCitizen(it))
                    })
//
                TextField(
                    value = masterData.nameOfDDO,
                    onValueChange = {
                        onEvent(MasterDataEvent.UpdateNameOfDDO(it))
                    },
                    modifier = Modifier.fillMaxWidth(),
                    label = { Text(text = stringResource(id = R.string.nameOfDDO)) },
                    isError = masterData.nameOfDDO != "" && com.aman.taxcalculator.user_data.presentation.validateString(
                        masterData.nameOfDDO
                    ),
                    supportingText = {
                        if (com.aman.taxcalculator.user_data.presentation.validateString(masterData.nameOfDDO)) {
                            Text(text = "DDO name should not contain number")
                        }
                    },
                    keyboardOptions = KeyboardOptions(
                        keyboardType = KeyboardType.Text,
                        imeAction = ImeAction.Next
                    )
                )
                TextField(
                    value = masterData.rankOfEmployee,
                    onValueChange = {
                        onEvent(MasterDataEvent.UpdateRankOfEmployee(it))
                    },
                    modifier = Modifier.fillMaxWidth(),
                    label = { Text(text = stringResource(id = R.string.rankOfEmployee)) },
                    isError = masterData.rankOfEmployee != "" && com.aman.taxcalculator.user_data.presentation.validateString(
                        masterData.rankOfEmployee
                    ),
                    supportingText = {
                        if (com.aman.taxcalculator.user_data.presentation.validateString(masterData.rankOfEmployee)) {
                            Text(text = "Rank of Employee should not contain number")
                        }
                    },
                    keyboardOptions = KeyboardOptions(
                        keyboardType = KeyboardType.Text,
                        imeAction = ImeAction.Next
                    )
                )
                TextField(
                    value = masterData.nameOfService,
                    onValueChange = { onEvent(MasterDataEvent.UpdateNameOfService(it)) },
                    modifier = Modifier.fillMaxWidth(),
                    label = { Text(text = stringResource(id = R.string.nameOfService)) },
                    isError = masterData.nameOfService != "" && com.aman.taxcalculator.user_data.presentation.validateString(
                        masterData.nameOfService
                    ),
                    supportingText = {
                        if (com.aman.taxcalculator.user_data.presentation.validateString(masterData.nameOfService)) {
                            Text(text = "Office name should not contain number")
                        }
                    },
                    keyboardOptions = KeyboardOptions(
                        keyboardType = KeyboardType.Text,
                        imeAction = ImeAction.Next
                    )
                )
                TextField(
                    value = masterData.bankAccountNumber,
                    onValueChange = {
                        onEvent(MasterDataEvent.UpdateBankAccountNumber(it))
                    },
                    modifier = Modifier.fillMaxWidth(),
                    label = { Text(text = stringResource(id = R.string.bankAccountNumber)) },
                    isError = !masterData.bankAccountNumber.isDigitsOnly() || masterData.bankAccountNumber.length > 10,
                    supportingText = {
                        if (!masterData.bankAccountNumber.isDigitsOnly()) {
                            Text(text = "Account no should be in number")
                        } else if (masterData.bankAccountNumber.length > 10) {
                            Text(text = "Account number should not greater then 11 digits")
                        }
                    },
                    keyboardOptions = KeyboardOptions(
                        keyboardType = KeyboardType.NumberPassword,
                        imeAction = ImeAction.Next
                    )
                )
                TextField(
                    value = masterData.gpfNo,
                    onValueChange = {
                        onEvent(MasterDataEvent.UpdateGpfNo(it))
                    },
                    modifier = Modifier.fillMaxWidth(),
                    label = { Text(text = stringResource(id = R.string.gpfNo)) },
                    isError = !masterData.gpfNo.isDigitsOnly(),
                    supportingText = {
                        if (!masterData.gpfNo.isDigitsOnly()) {
                            Text(text = "Amount should be in number")
                        }
                    },
                    keyboardOptions = KeyboardOptions(
                        keyboardType = KeyboardType.Number,
                        imeAction = ImeAction.Next
                    )
                )
                TextField(
                    value = masterData.mobileNo,
                    onValueChange = {
                        onEvent(MasterDataEvent.UpdateMobileNo(it))
                    },
                    modifier = Modifier.fillMaxWidth(),
                    label = { Text(text = stringResource(id = R.string.mobileNo)) },
                    isError = !masterData.mobileNo.isDigitsOnly() || masterData.mobileNo.length > 11,
                    supportingText = {
                        if (!masterData.mobileNo.isDigitsOnly()) {
                            Text(text = "mobile no should be in number")
                        } else if (masterData.mobileNo.length > 11) {
                            Text(text = "mobile number should not greater then 10 digits")
                        }
                    },
                    keyboardOptions = KeyboardOptions(
                        keyboardType = KeyboardType.Number,
                        imeAction = ImeAction.Next
                    )
                )

                TextField(
                    value = masterData.rateOfHRA,
                    onValueChange = {
                        onEvent(MasterDataEvent.UpdateRateOfHRA(it))
                    },
                    modifier = Modifier.fillMaxWidth(),
                    label = { Text(text = stringResource(id = R.string.rateOfHRA)) },
                    isError = !masterData.rateOfHRA.isDigitsOnly(),
                    supportingText = {
                        if (!masterData.rateOfHRA.isDigitsOnly()) {
                            Text(text = "Amount should be in number")
                        }
                    },
                    keyboardOptions = KeyboardOptions(
                        keyboardType = KeyboardType.Number,
                        imeAction = ImeAction.Next
                    )
                )
                CustomSwitch(
                    label = R.string.isGetBonus,
                    value = masterData.isGetBonus,
                    onCheckedChange = {
                        onEvent(MasterDataEvent.UpdateISGetBonus(it))
                    })
                TextField(
                    value = masterData.monthOfMakingDeductedBill,
                    onValueChange = { onEvent(MasterDataEvent.UpdateMonthOfMakingDeductedBill(it)) },
                    modifier = Modifier.fillMaxWidth(),
                    label = { Text(text = stringResource(id = R.string.monthOfMakingDeductedBill)) },
                    isError = !masterData.monthOfMakingDeductedBill.isDigitsOnly(),
                    supportingText = {
                        if (!masterData.monthOfMakingDeductedBill.isDigitsOnly()) {
                            Text(text = "Amount should be in number")
                        }
                    },
                    keyboardOptions = KeyboardOptions(
                        keyboardType = KeyboardType.Number,
                        imeAction = ImeAction.Next
                    )
                )

                TextField(
                    value = masterData.groupAccidentInsurancePremium,
                    onValueChange = { onEvent(MasterDataEvent.UpdateGroupAccidentInsurancePremium(it)) },
                    modifier = Modifier.fillMaxWidth(),
                    label = { Text(text = stringResource(id = R.string.groupAccidentInsurancePremium)) },
                    isError = !masterData.groupAccidentInsurancePremium.isDigitsOnly(),
                    supportingText = {
                        if (!masterData.groupAccidentInsurancePremium.isDigitsOnly()) {
                            Text(text = "Amount should be in number")
                        }
                    },
                    keyboardOptions = KeyboardOptions(
                        keyboardType = KeyboardType.Text,
                        imeAction = ImeAction.Next
                    )
                )
                CustomSwitch(
                    label = R.string.isBenevolentFundDeduction,
                    value = masterData.isBenevolentFundDeduction,
                    onCheckedChange = {
                        onEvent(MasterDataEvent.UpdateIsBenevolentFundDeduction(it))
                    })
                TextField(
                    value = masterData.urbanCompensationAllowanceCCA,
                    onValueChange = {
                        onEvent(MasterDataEvent.UpdateUrbanCompensationAllowanceCCA(it))
                    },
                    modifier = Modifier.fillMaxWidth(),
                    label = { Text(text = stringResource(id = R.string.urbanCompensationAllowanceCCA)) },
                    isError = !masterData.urbanCompensationAllowanceCCA.isDigitsOnly(),
                    supportingText = {
                        if (!masterData.urbanCompensationAllowanceCCA.isDigitsOnly()) {
                            Text(text = "Amount should be in number")
                        }
                    },
                    keyboardOptions = KeyboardOptions(
                        keyboardType = KeyboardType.Number,
                        imeAction = ImeAction.Done
                    )
                )
                Button(onClick = {
                    onEvent(MasterDataEvent.SaveMasterData)
                    navigateToGa55aDataScreen()
                }) {
                    Text(text = "Submit")
                }
            }
        }
    )

}


@Composable
fun CustomSwitch(
    modifier: Modifier = Modifier,
    label: Int,
    value: Boolean,
    onCheckedChange: (Boolean) -> Unit,
    checkedIcon: Int = R.drawable.baseline_check_24, // default icon for checked state
    uncheckedIcon: Int = R.drawable.baseline_close_24 // default icon for unchecked state
) {
    Row(
        modifier = modifier
            .fillMaxWidth()
            .padding(horizontal = 20.dp),
        horizontalArrangement = Arrangement.SpaceBetween,
        verticalAlignment = Alignment.CenterVertically
    ) {
        Text(
            modifier = Modifier.weight(1f),
            text = stringResource(id = label),
            maxLines = 2,
            softWrap = true,
            overflow = TextOverflow.Ellipsis
        )
        Spacer(modifier = Modifier.width(20.dp))
        Switch(
            checked = value,
            onCheckedChange = { onCheckedChange(it) },
            thumbContent = {
                Icon(
                    painterResource(id = if (value) checkedIcon else uncheckedIcon),
                    contentDescription = if (value) "Checked" else "Unchecked"
                )
            }
        )
    }
}

fun validateString(input: String): Boolean {
    return !input.all {
        it.isLetter()
    }
}

