package com.example.nim_roomdatabase.view.uicontroller

import androidx.compose.material3.ExperimentalMaterial3Api
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.navigation.NavHostController
import androidx.navigation.NavType
import androidx.navigation.compose.NavHost
import androidx.navigation.compose.composable
import androidx.navigation.compose.rememberNavController
import androidx.navigation.navArgument
import com.example.nim_roomdatabase.view.EntrySiswaScreen
import com.example.nim_roomdatabase.view.HomeScreen
import com.example.nim_roomdatabase.view.route.DestinasiDetailSiswa
import com.example.nim_roomdatabase.view.route.DestinasiEntry
import com.example.nim_roomdatabase.view.route.DestinasiHome
import com.example.nim_roomdatabase.view.route.DetailSiswaScreen

@Composable
fun SiswaApp(
    navController: NavHostController = rememberNavController(),
    modifier: Modifier = Modifier
) {



        composable(
            route = DestinasiDetailSiswa.routeWithArgs,
            arguments = listOf(
                navArgument(DestinasiDetailSiswa.itemIdArg) { // Hapus titik (.) sebelum navArgument
                    type = NavType.IntType
                }
            )
        ) {
            DetailSiswaScreen(
                navigateBack = { navController.navigateUp() })
        }
        composable (route=DestinasiEditSiswa.routeWithArgs,
            argument= listOf(navArgument(DestinasiEditSiswa.itemIdArg){
                type= NavType.IntType })){
            EditSiswaScreen(
                navigateback = {navController.popBackStack()},
                onnavigateup = {navController.navigateUp()}
            )

            }
    }
}