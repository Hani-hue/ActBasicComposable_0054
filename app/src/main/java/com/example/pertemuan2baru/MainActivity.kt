package com.example.pertemuan2baru

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.padding
import androidx.compose.material3.Scaffold
import androidx.compose.ui.Modifier
import com.example.pertemuan2baru.ui.theme.Pertemuan2BaruTheme

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            Pertemuan2BaruTheme {                                  // B besar
                Scaffold(modifier = Modifier.fillMaxSize()) { innerPadding ->
                    Tugas(
                        modifier = Modifier.padding(innerPadding)
                    )
                }
            }
        }
    }
}