package com.shah.android.audiosy.ui.components.bottomnav

import androidx.compose.foundation.layout.RowScope
import androidx.compose.material3.Icon
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.NavigationBarItem
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.navigation.NavDestination
import androidx.navigation.NavDestination.Companion.hierarchy
import androidx.navigation.NavHostController
import com.shah.android.audiosy.utilities.helper.BottomNavScreens

/**
 * Created by Monil Shah on 03/12/22.
 */

@Composable
fun RowScope.BottomNavItem(
    screen: BottomNavScreens,
    currentDestination: NavDestination?,
    navController: NavHostController
) {
    // Bottom Nav Bar Item
    NavigationBarItem(
        label = {
            Text(text = screen.title, style = MaterialTheme.typography.labelMedium)
        },
        icon = {
            Icon(imageVector = screen.icon, contentDescription = screen.title)
        },
        selected = currentDestination?.hierarchy?.any {
            it.route == screen.route
        } == true,
        onClick = {
            navController.navigate(screen.route)
        }
    )
}

