package com.aman.taxcalculator.ga555a.presentation

import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.lazy.LazyColumn
import androidx.compose.foundation.lazy.items
import androidx.compose.material3.ExperimentalMaterial3Api
import androidx.compose.material3.Scaffold
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.runtime.collectAsState
import androidx.compose.ui.Modifier
import kotlinx.coroutines.flow.StateFlow

@OptIn(ExperimentalMaterial3Api::class)
@Composable
fun Ga55aDataScreen(
    _state: StateFlow<Ga55aDataState>,
    onEvent: (Ga55aDataEvent) -> Unit,
) {
    val state = _state.collectAsState()
    Scaffold(
        content = { innerPadding ->
            LazyColumn(
                modifier = Modifier.padding(innerPadding),
                content = {
                    items(state.value.ga55aDataMonthList){
                        Column(
                            modifier = Modifier.fillMaxWidth()
                        ) {
                            Text(text = it.name)
                            Text(text = it.pan)
                            Text(text = it.tan)
                            Text(text = it.bankAccount)
                            Text(text = it.post)
                            Text(text = it.siNo)
                            Text(text = it.gpfNo)
                            Text(text = it.mobileNo)
                        }
                    }
                }
            )

        }
    )
}