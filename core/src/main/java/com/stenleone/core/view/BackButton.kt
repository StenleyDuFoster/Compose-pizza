package com.stenleone.core.view

import androidx.compose.foundation.Image
import androidx.compose.foundation.clickable
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.shape.CircleShape
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import com.stenleone.core.R

@Composable
fun BackButton(
    onBackPressed: () -> Unit,
    modifier: Modifier = Modifier
) {
    Box(
        modifier
            .clip(CircleShape)
            .clickable {
                onBackPressed.invoke()
            }
    ) {
        Image(
            painterResource(R.drawable.ic_arrow_back),
            contentDescription = "arrow back",
            modifier = Modifier
                .padding(8.dp)
                .size(24.dp)
        )
    }
}

@Preview
@Composable
private fun Preview() {
    BackButton(
        {

        }
    )
}