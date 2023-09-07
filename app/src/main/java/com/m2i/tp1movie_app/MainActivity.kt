package com.m2i.tp1movie_app

import com.m2i.tp1movie_app.ui.theme.Tp1movieappTheme


import android.os.Bundle

import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent


import androidx.compose.material3.ExperimentalMaterial3Api

import androidx.compose.runtime.Composable

import androidx.compose.ui.tooling.preview.Preview

import com.m2i.tp1movie_app.navigation.MovieNavigation



class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            MyApp {
                MovieNavigation()
            }
        }
    }
}

@OptIn(ExperimentalMaterial3Api::class)

@Composable
fun MyApp(content: @Composable () -> Unit){ // Unit = void
    Tp1movieappTheme {
        content()
    }
}


@Preview(showBackground = true)
@Composable
fun GreetingPreview() {
    MyApp {
        MovieNavigation()
    }
}