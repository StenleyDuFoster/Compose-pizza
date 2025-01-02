package com.stenleone.compose_pizza.featureList

import android.annotation.SuppressLint
import androidx.compose.foundation.clickable
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.navigationBarsPadding
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.statusBarsPadding
import androidx.compose.foundation.lazy.LazyColumn
import androidx.compose.material3.Scaffold
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.runtime.remember
import androidx.compose.ui.Modifier
import androidx.compose.ui.res.stringResource
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import com.stenleone.core.LocalNavController
import com.stenleone.core.NavFeature

@Composable
fun FeatureListRoute() {
    val items = remember {
        NavFeature.getAll()
    }
    val navController = LocalNavController.current

    FeatureList(
        items,
        navController::navigate
    )
}

@SuppressLint("UnusedMaterial3ScaffoldPaddingParameter")
@Composable
private fun FeatureList(
    items: List<NavFeature> = emptyList(),
    onItemClick: (NavFeature) -> Unit = {}
) {
    Scaffold {
        LazyColumn(
            modifier = Modifier
                .fillMaxSize()
                .statusBarsPadding()
                .navigationBarsPadding()
        ) {
            items(items.size) {
                val item = items.getOrNull(it) ?: return@items
                Text(
                    stringResource(id = item.nameId),
                    modifier = Modifier
                        .clickable {
                            onItemClick.invoke(item)
                        }
                        .fillMaxWidth()
                        .padding(
                            horizontal = 16.dp,
                            vertical = 12.dp
                        )
                )
            }
        }
    }
}

@Preview
@Composable
private fun Preview() {
    FeatureList()
}