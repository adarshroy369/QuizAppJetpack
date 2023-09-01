package com.example.myquizapp.QuizApp

import android.content.Context
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.navigation.NavController
import androidx.navigation.NavHostController
import androidx.navigation.compose.NavHost
import androidx.navigation.compose.composable



@Composable
fun QuizNavGraph(
    navController: NavHostController,
    modifier:Modifier = Modifier
){
    NavHost(navController = navController,
    startDestination = MainScreenDestination.route,
        modifier = Modifier){
composable(route=MainScreenDestination.route) {

    MainScreen(
        navigateToQuiz = { navController.navigate(QuizDestination.route) }
    )
}

        composable(route = QuizDestination.route){
            QuizScreen(
navigateBack = { navController.popBackStack()}
            )
        }
    }
}