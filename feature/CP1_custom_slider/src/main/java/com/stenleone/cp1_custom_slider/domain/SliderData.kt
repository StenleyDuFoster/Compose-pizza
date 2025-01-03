package com.stenleone.cp1_custom_slider.domain

import androidx.compose.runtime.Stable
import androidx.compose.ui.graphics.Brush
import androidx.compose.ui.graphics.Color

@Stable
class SliderData(
    val text: String,
    val dragPosition: Float,
    val isSnap: Boolean,
    val textColor: Color,
    val backgroundColor: Brush,
)