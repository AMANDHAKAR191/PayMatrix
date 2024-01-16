package com.aman.taxcalculator.navigation

import androidx.compose.animation.EnterTransition
import androidx.compose.animation.ExitTransition
import androidx.compose.runtime.Composable
import androidx.hilt.navigation.compose.hiltViewModel
import androidx.navigation.NavHostController
import androidx.navigation.compose.NavHost
import androidx.navigation.compose.composable
import androidx.navigation.navigation
import com.aman.taxcalculator.ga555a.presentation.Ga55aDataScreen
import com.aman.taxcalculator.ga555a.presentation.Ga55aDataViewModel
import com.aman.taxcalculator.master_data.presentation.MasterDataScreen
import com.aman.taxcalculator.master_data.presentation.MasterDataViewModel
import com.aman.taxcalculator.user_data.presentation.UserDataScreen
import com.aman.taxcalculator.user_data.presentation.UserDataViewModel

@Composable
fun RootNavGraph(
    navController: NavHostController,
) {
    NavHost(
        navController = navController,
        startDestination = Screen.UserDataScreen.route,
        enterTransition = { EnterTransition.None },
        exitTransition = { ExitTransition.None }
    ) {
        navigation(
            route = Screen.UserDataScreen.route,
            startDestination = Screen.UserDataScreen.route
        ) {
            composable(route = Screen.UserDataScreen.route) {
                val viewModel: UserDataViewModel = hiltViewModel()
                UserDataScreen(
                    _state = viewModel.state,
                    onEvent = viewModel::Event,
                    navigateToMasterDataScreen = {

                    })
            }

            composable(route = Screen.MasterDataScreen.route) {
                val viewModel: MasterDataViewModel = hiltViewModel()
                MasterDataScreen(
                    _state = viewModel.state,
                    onEvent = viewModel::Event,
                    navigateToGa55aDataScreen = {
                        navController.navigate(Screen.Ga55aDataScreen.route)
                    }
                )
            }

            composable(route = Screen.Ga55aDataScreen.route) {
                val viewModel: Ga55aDataViewModel = hiltViewModel()
                Ga55aDataScreen(_state = viewModel.state, onEvent = viewModel::onEvent)
            }
        }
    }
}