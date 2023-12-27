package com.example.restapi.navigation

import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.navigation.NavHostController
import androidx.navigation.compose.NavHost
import androidx.navigation.compose.composable
import androidx.navigation.compose.rememberNavController
import com.example.restapi.ui.home.screen.DestinasiHome
import com.example.restapi.ui.home.screen.HomeScreen
import com.example.restapi.ui.kontak.screen.DestinasiEntry
import com.example.restapi.ui.kontak.screen.EntryKontakScreen

@Composable
fun PengelolaHalaman(navController: NavHostController = rememberNavController()) {
    NavHost(
        navController = navController,
        startDestination = DestinasiHome.route,
        modifier = Modifier,
        ) {
        composable(DestinasiHome.route) {
            HomeScreen(navigateToItemEntry = {
                navController.navigate(DestinasiEntry.route)
            },
                onDetailClick = { itemId ->
                    navController.navigate(DestinasiEntry.route)
                    println(itemId)
                }
            )
        }
        composable(DestinasiEntry.route) {
            EntryKontakScreen(navigateBack = {
                navController.navigate(
                    DestinasiHome.route
                ) {
                    popUpTo(DestinasiHome.route) {
                        inclusive = true
                    }
                }
            }
            )
        }
    }
}