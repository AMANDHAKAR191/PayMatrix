package com.aman.taxcalculator.user_data.presentation

import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.padding
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
import androidx.compose.material3.Text
import androidx.compose.material3.TextField
import androidx.compose.material3.TopAppBar
import androidx.compose.runtime.Composable
import androidx.compose.runtime.collectAsState
import androidx.compose.ui.Modifier
import androidx.compose.ui.res.stringResource
import androidx.compose.ui.text.input.ImeAction
import androidx.compose.ui.text.input.KeyboardType
import com.aman.taxcalculator.R
import com.aman.taxcalculator.master_data.presentation.MasterDataEvent
import kotlinx.coroutines.flow.StateFlow

@OptIn(ExperimentalMaterial3Api::class)
@Composable
fun UserDataScreen(
    _state: StateFlow<UserDataState>,
    onEvent: (UserDataEvent) -> Unit,
    navigateToMasterDataScreen: () -> Unit
) {

    val state = _state.collectAsState()
    val userData = state.value.userData
    Scaffold(
        topBar = {
            TopAppBar(
                title = { Text(text = "user") },
                actions = {
                    IconButton(onClick = { navigateToMasterDataScreen() }) {
                        Icon(imageVector = Icons.Default.AddAPhoto, contentDescription = "")
                    }
                })
        },
        content = { innerPadding ->
            Column(
                modifier = Modifier
                    .padding(innerPadding)
                    .verticalScroll(rememberScrollState())
            ) {
                CustomTextField(
                    value = userData.nameOfEmployee,
                    supportingText = "Employee name should not contain number",
                    keyboardType = KeyboardType.Text,
                    imeAction = ImeAction.Next,
                    onValueChange = {
                        onEvent(UserDataEvent.UpdateNameOfEmployee(it))
                    }
                )
                CustomTextField(
                    value = userData.nameOfEmployee,
                    supportingText = "Employee name should not contain number",
                    keyboardType = KeyboardType.Text,
                    imeAction = ImeAction.Next,
                    onValueChange = {
                        onEvent(UserDataEvent.UpdateNameOfOffice(it))
                    }
                )
                CustomTextField(
                    value = userData.nameOfEmployee,
                    supportingText = "Employee name should not contain number",
                    keyboardType = KeyboardType.Text,
                    imeAction = ImeAction.Next,
                    onValueChange = {
                        onEvent(UserDataEvent.UpdateRankOfEmployee(it))
                    }
                )
                CustomTextField(
                    value = userData.nameOfEmployee,
                    supportingText = "Employee name should not contain number",
                    keyboardType = KeyboardType.Text,
                    imeAction = ImeAction.Next,
                    onValueChange = {
                        onEvent(UserDataEvent.UpdateNameOfService(it))
                    }
                )
                CustomTextField(
                    value = userData.nameOfEmployee,
                    supportingText = "Employee name should not contain number",
                    keyboardType = KeyboardType.Text,
                    imeAction = ImeAction.Next,
                    onValueChange = {
                        onEvent(UserDataEvent.UpdatePayLevel(it))
                    }
                )
                CustomTextField(
                    value = userData.nameOfEmployee,
                    supportingText = "Employee name should not contain number",
                    keyboardType = KeyboardType.Text,
                    imeAction = ImeAction.Next,
                    onValueChange = {
                        onEvent(UserDataEvent.UpdatePanOfEmployee(it))
                    }
                )
                CustomTextField(
                    value = userData.nameOfEmployee,
                    supportingText = "Employee name should not contain number",
                    keyboardType = KeyboardType.Text,
                    imeAction = ImeAction.Next,
                    onValueChange = {
                        onEvent(UserDataEvent.UpdateTanOfOffice(it))
                    }
                )
                CustomTextField(
                    value = userData.nameOfEmployee,
                    supportingText = "Employee name should not contain number",
                    keyboardType = KeyboardType.Text,
                    imeAction = ImeAction.Next,
                    onValueChange = {
                        onEvent(UserDataEvent.UpdateBankAccountNumber(it))
                    }
                )
                CustomTextField(
                    value = userData.nameOfEmployee,
                    supportingText = "Employee name should not contain number",
                    keyboardType = KeyboardType.Text,
                    imeAction = ImeAction.Next,
                    onValueChange = {
                        onEvent(UserDataEvent.UpdateMobileNo(it))
                    }
                )
                CustomTextField(
                    value = userData.nameOfEmployee,
                    supportingText = "Employee name should not contain number",
                    keyboardType = KeyboardType.Text,
                    imeAction = ImeAction.Next,
                    onValueChange = {
                        onEvent(UserDataEvent.UpdateGpfNo(it))
                    }
                )
                CustomTextField(
                    value = userData.nameOfEmployee,
                    supportingText = "Employee name should not contain number",
                    keyboardType = KeyboardType.Text,
                    imeAction = ImeAction.Next,
                    onValueChange = {
                        onEvent(UserDataEvent.UpdateSiNumber(it))
                    }
                )


                Button(onClick = {
                    onEvent(UserDataEvent.SaveUserData)
                    navigateToMasterDataScreen()
                }) {
                    Text(text = "Submit")
                }
            }
        }
    )

}


fun validateString(input: String): Boolean {
    return !input.all {
        it.isLetter()
    }
}

@OptIn(ExperimentalMaterial3Api::class)
@Composable
fun CustomTextField(
    value:String,
    supportingText:String,
    keyboardType:KeyboardType,
    imeAction:ImeAction,
    onValueChange:(String)->Unit
) {
    TextField(
        value = value,
        onValueChange = {
            onValueChange(it)
        },
        modifier = Modifier.fillMaxWidth(),
        label = { Text(text = stringResource(id = R.string.nameOfOffice)) },
        isError = value != "" && validateString(value),
        supportingText = {
            if (validateString(value)) {
                Text(text = supportingText)
            }
        },
        keyboardOptions = KeyboardOptions(
            keyboardType = keyboardType,
            imeAction = imeAction
        )
    )
}

