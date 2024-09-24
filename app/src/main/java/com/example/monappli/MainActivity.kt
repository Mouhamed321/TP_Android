package com.example.monappli

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.activity.enableEdgeToEdge
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.material3.Scaffold
import androidx.compose.ui.Modifier
import com.example.monappli.ui.theme.MonAppliTheme

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            MonAppliTheme {
                Scaffold(modifier = Modifier.fillMaxSize()) { innerPadding ->
                    MonProfil()  // Appelle MonProfil depuis Home.kt
                }
            }
        }
    }
}
