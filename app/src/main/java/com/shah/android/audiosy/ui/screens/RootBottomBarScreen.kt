package com.shah.android.audiosy.ui.screens

import androidx.compose.foundation.layout.padding
import androidx.compose.material3.ExperimentalMaterial3Api
import androidx.compose.material3.Scaffold
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.tooling.preview.Preview
import androidx.navigation.compose.rememberNavController
import com.shah.android.audiosy.ui.components.bottomnav.BottomNavBar
import com.shah.android.audiosy.ui.components.bottomnav.BottomNavGraph

/**
 * Created by Monil Shah on 03/12/22.
 */

@OptIn(ExperimentalMaterial3Api::class)
@Composable
fun RootBottomBarScreen() {
    val navController = rememberNavController()

    Scaffold(
        bottomBar = {
            BottomNavBar(navController = navController) // Root Bottom Nav Bar
        }
    ) { paddingValues ->
        // Nav Graph for Root Screen
        BottomNavGraph(
            navController = navController,
            modifier = Modifier.padding(paddingValues)
        )
    }
}

@Preview(showBackground = true)
@Composable
fun PreviewRootBottomBarScreen() {
    RootBottomBarScreen()
}
