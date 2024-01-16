package com.aman.taxcalculator.user_data.presentation

import androidx.lifecycle.ViewModel
import com.aman.taxcalculator.user_data.domain.repository.UserDataRepository
import dagger.hilt.android.lifecycle.HiltViewModel
import kotlinx.coroutines.flow.MutableStateFlow
import kotlinx.coroutines.flow.asStateFlow
import javax.inject.Inject

@HiltViewModel
class UserDataViewModel @Inject constructor(
    private val repository: UserDataRepository
) : ViewModel() {

    private var _state = MutableStateFlow(UserDataState())
    val state = _state.asStateFlow()

    fun Event(event: UserDataEvent) {

    }

}