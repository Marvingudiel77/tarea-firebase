package com.marvingudiel.login_firebase.navigation

import androidx.compose.runtime.Composable
import androidx.navigation.compose.NavHost
import androidx.navigation.compose.composable
import androidx.navigation.compose.rememberNavController
import com.marvingudiel.login_firebase.view.login.BlanckView
import com.marvingudiel.login_firebase.view.login.TabsView
import com.marvingudiel.login_firebase.view.notas.HomeView
import com.marvingudiel.login_firebase.viewmodel.LoginViewModel
import com.marvingudiel.login_firebase.viewmodel.NotesViewModel

@Composable
fun NavManager(loginViewModel: LoginViewModel,
               notesViewModel: NotesViewModel
){
    val navController = rememberNavController()
    NavHost(navController = navController, startDestination = "black"){
        composable("black") {
            BlanckView(navController = navController)
        }
        composable("login") {
            TabsView(navController = navController, loginViewModel = loginViewModel)
        }
        composable("home") {
            HomeView(navController = navController, viewModel = notesViewModel)
        }
    }
}