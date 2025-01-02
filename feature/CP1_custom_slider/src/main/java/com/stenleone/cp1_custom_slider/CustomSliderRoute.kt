package com.stenleone.cp1_custom_slider

import android.annotation.SuppressLint
import androidx.compose.material3.ExperimentalMaterial3Api
import androidx.compose.material3.Scaffold
import androidx.compose.material3.Text
import androidx.compose.material3.TopAppBar
import androidx.compose.runtime.Composable
import androidx.compose.ui.res.stringResource
import androidx.compose.ui.tooling.preview.Preview
import androidx.hilt.navigation.compose.hiltViewModel
import com.stenleone.core.LocalNavController
import com.stenleone.core.R
import com.stenleone.core.view.BackButton

@Composable
fun CustomSliderRoute(
    viewModel: CustomSliderViewModel = hiltViewModel()
) {
    val navController = LocalNavController.current

    CustomSliderScreen(
        navController::navigateUp
    )
}

@OptIn(ExperimentalMaterial3Api::class)
@SuppressLint("UnusedMaterial3ScaffoldPaddingParameter")
@Composable
private fun CustomSliderScreen(
    onBackPressed: () -> Unit = {}
) {
    Scaffold(
        topBar = {
            TopAppBar(
                navigationIcon = {
                    BackButton(onBackPressed)
                },
                title = {
                    Text(stringResource(R.string.custom_slider_feature))
                },
            )
        }
    ) {

    }
}

@Preview
@Composable
private fun Preview() {
    CustomSliderScreen()
}