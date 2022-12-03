package com.shah.android.audiosy.ui.components.bottomnav

import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.navigation.NavHostController
import androidx.navigation.compose.NavHost
import androidx.navigation.compose.composable
import com.shah.android.audiosy.ui.screens.FavoritesScreen
import com.shah.android.audiosy.ui.screens.HomeScreen
import com.shah.android.audiosy.ui.screens.PlaylistScreen
import com.shah.android.audiosy.ui.screens.SettingsScreen
import com.shah.android.audiosy.utilities.helper.BottomNavScreens

/**
 * Created by Monil Shah on 03/12/22.
 */

@Composable
fun BottomNavGraph(navController: NavHostController, modifier: Modifier) {
    // Navigation host that has the screens connected to the bottom navigation bar through the navController
    NavHost(
        navController = navController,
        startDestination = BottomNavScreens.Home.route,
        modifier = modifier,
    ) {
        composable(route = BottomNavScreens.Home.route) {
            HomeScreen()
        }

        composable(route = BottomNavScreens.Favourites.route) {
            FavoritesScreen()
        }

        composable(route = BottomNavScreens.Playlists.route) {
            PlaylistScreen()
        }

        composable(route = BottomNavScreens.Settings.route) {
            SettingsScreen()
        }
    }
}
