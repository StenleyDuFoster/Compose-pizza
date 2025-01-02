package com.stenleone.compose_pizza

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.activity.enableEdgeToEdge
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Scaffold
import androidx.compose.runtime.CompositionLocalProvider
import androidx.compose.ui.Modifier
import androidx.navigation.compose.NavHost
import androidx.navigation.compose.rememberNavController
import com.stenleone.compose_pizza.featureList.featureList
import com.stenleone.core.FeatureListArg
import com.stenleone.core.LocalNavController
import com.stenleone.cp1_custom_slider.customSlider
import dagger.hilt.android.AndroidEntryPoint

@AndroidEntryPoint
class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContent {
            Scaffold {
                val paddings = it
                val navController = rememberNavController()
                CompositionLocalProvider(
                    LocalNavController provides navController
                ) {
                    MaterialTheme {
                        NavHost(
                            navController,
                            startDestination = FeatureListArg(),
                            modifier = Modifier.fillMaxSize()
                        ) {
                            featureList()
                            customSlider()
                        }
                    }
                }
            }
        }
    }
}