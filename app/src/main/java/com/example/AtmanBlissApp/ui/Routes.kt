package com.example.cupcake.ui

// It contains route names to all three screens
sealed class Routes(val route: String) {
    object AtmanBlissScreen : Routes("home")
    //for the home screen
    object Music : Routes("Music")
    object Productivity : Routes("Productivity")
    object Memes : Routes("Memes")
    object Meditation : Routes("Meditation")
    object OptionScreen : Routes("OptionScreen")
}
