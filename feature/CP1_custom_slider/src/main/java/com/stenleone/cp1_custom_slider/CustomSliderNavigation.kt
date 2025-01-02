package com.stenleone.cp1_custom_slider

import androidx.navigation.NavGraphBuilder
import androidx.navigation.compose.composable
import com.stenleone.core.CustomSliderFeature

fun NavGraphBuilder.customSlider() {
    composable<CustomSliderFeature> {
        CustomSliderRoute()
    }
}