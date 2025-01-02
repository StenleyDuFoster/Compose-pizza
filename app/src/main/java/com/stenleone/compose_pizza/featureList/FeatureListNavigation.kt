package com.stenleone.compose_pizza.featureList

import androidx.navigation.NavGraphBuilder
import androidx.navigation.compose.composable
import com.stenleone.core.FeatureListArg

fun NavGraphBuilder.featureList() {
    composable<FeatureListArg> {
        FeatureListRoute()
    }
}