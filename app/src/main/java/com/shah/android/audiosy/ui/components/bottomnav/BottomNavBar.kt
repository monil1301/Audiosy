package com.shah.android.audiosy.ui.components.bottomnav

import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.NavigationBar
import androidx.compose.runtime.Composable
import androidx.compose.runtime.getValue
import androidx.navigation.NavHostController
import androidx.navigation.compose.currentBackStackEntryAsState
import com.shah.android.audiosy.utilities.helper.BottomNavScreens

/**
 * Created by Monil Shah on 03/12/22.
 */

// Creates a bottom navigation bar
@Composable
fun BottomNavBar(navController: NavHostController) {
    // list of root screens to be shown on bottom nav
    val screens = listOf(
        BottomNavScreens.Home,
        BottomNavScreens.Favourites,
        BottomNavScreens.Playlists,
        BottomNavScreens.Settings
    )

    val navBackStackEntry by navController.currentBackStackEntryAsState()
    val currentDestination = navBackStackEntry?.destination

    // Bottom navigation bar
    NavigationBar(
        containerColor = MaterialTheme.colorScheme.background,
        contentColor = MaterialTheme.colorScheme.primary
    ) {
        screens.forEach { screen ->
            // Single item for bottom navigation bar
            BottomNavItem(
                screen = screen,
                currentDestination = currentDestination,
                navController = navController
            )
        }
    }
}
