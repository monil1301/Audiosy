package com.shah.android.audiosy.ui.screens

import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Surface
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.tooling.preview.Preview
import com.shah.android.audiosy.activities.Greeting

/**
 * Created by Monil Shah on 03/12/22.
 */

@Composable
fun HomeScreen() {
    Surface(
        modifier = Modifier.fillMaxSize(),
        color = MaterialTheme.colorScheme.background
    ) {
        Greeting("Home")
    }
}

@Preview
@Composable
fun PreviewHomeScreen() {
    HomeScreen()
}
