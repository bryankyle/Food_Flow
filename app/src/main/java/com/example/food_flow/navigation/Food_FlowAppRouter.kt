package com.example.food_flow.navigation

import androidx.compose.runtime.MutableState
import androidx.compose.runtime.mutableStateOf

sealed class Screen {


    data object SplashScreen : Screen()
    data object SignUpScreen : Screen()
    data object TermsAndConditionsScreen : Screen()
    data object LoginScreen : Screen ()
    data object HomeScreen :  Screen ()
    data object DonateScreen : Screen ()
    data object FoodBankScreen : Screen ()
    data object ReceiveScreen : Screen ()
    data object FoodMapScreen : Screen ()
    data object ViewDonationsScreen : Screen ()
    data object DonationsSubmittedScreen : Screen ()

}


object Food_FlowAppRouter {

    var currentScreen: MutableState<Screen> = mutableStateOf(Screen.SplashScreen)

    fun navigateTo(destination : Screen){
        currentScreen.value = destination
    }


}