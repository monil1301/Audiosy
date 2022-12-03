package com.shah.android.audiosy.utilities.helper

import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.outlined.Home
import androidx.compose.material.icons.outlined.Settings
import androidx.compose.material.icons.rounded.FavoriteBorder
import androidx.compose.material.icons.rounded.PlaylistPlay
import androidx.compose.ui.graphics.vector.ImageVector

/**
 * Created by Monil Shah on 03/12/22.
 */

sealed class BottomNavScreens(
    val route: String,
    val title: String,
    val icon: ImageVector
) {
    object Home : BottomNavScreens(
        route = Constants.BottomNav.Route.home,
        title = Constants.BottomNav.Title.home,
        icon = Icons.Outlined.Home
    )

    object Favourites : BottomNavScreens(
        route = Constants.BottomNav.Route.favorites,
        title = Constants.BottomNav.Title.favorites,
        icon = Icons.Rounded.FavoriteBorder
    )

    object Playlists : BottomNavScreens(
        route = Constants.BottomNav.Route.playlists,
        title = Constants.BottomNav.Title.playlists,
        icon = Icons.Rounded.PlaylistPlay
    )

    object Settings : BottomNavScreens(
        route = Constants.BottomNav.Route.settings,
        title = Constants.BottomNav.Title.settings,
        icon = Icons.Outlined.Settings
    )
}
