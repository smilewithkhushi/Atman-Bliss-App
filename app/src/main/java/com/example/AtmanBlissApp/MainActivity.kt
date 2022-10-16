
package com.example.cupcake

import android.os.Bundle
import android.view.Surface
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.material.MaterialTheme
import androidx.compose.runtime.Composable
import androidx.navigation.compose.NavHost
import androidx.navigation.compose.composable
import androidx.navigation.compose.rememberNavController
import com.example.cupcake.ui.Routes

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            com.example.cupcake.ui.theme.MaterialTheme() {
                ScreenMain()
            }
        }
        }
    }

@Composable
fun ScreenMain() {
    val navController = rememberNavController()

    NavHost(navController = navController, startDestination = Routes.AtmanBlissScreen.route) {

        // First route : Home
        composable(Routes.AtmanBlissScreen.route) {

            // Lay down the Home Composable
            // and pass the navController
            AtmanBlissScreen(navController = navController)
        }

        // Another Route : Profile
        composable(Routes.OptionScreen.route) {
            // Profile Screen
            OptionScreen(navController = navController)
        }

        composable(Routes.Meditation.route) {
            Meditation(navController = navController)
        }

        composable(Routes.Music.route) {
            Music(navController = navController)
        }
        composable(Routes.Memes.route) {
            Memes(navController = navController)
        }

        composable(Routes.Productivity.route) {
            Productivity(navController = navController)
        }

    }
}
