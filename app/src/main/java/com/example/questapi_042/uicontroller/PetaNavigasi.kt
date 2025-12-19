package com.example.questapi_042.uicontroller

import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.navigation.NavHostController
import androidx.navigation.NavType
import androidx.navigation.compose.NavHost
import androidx.navigation.compose.composable
import androidx.navigation.compose.rememberNavController
import androidx.navigation.navArgument
import com.example.questapi_042.uicontroller.route.DestinasiEntry
import com.example.questapi_042.uicontroller.route.DestinasiHome
import com.example.questapi_082.view.EntrySiswaScreen
import com.example.questapi_082.view.HomeScreen

@Composable
fun DataSiswaApp(navController: NavHostController = rememberNavController(), modifier: Modifier){
    HostNavigasi(navController = navController)
}
