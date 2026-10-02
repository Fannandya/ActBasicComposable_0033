package com.mamay.actbasiccomposable

import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.padding
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.unit.dp


@Composable
fun TataletakColumn(modifier: Modifier){
    Column(modifier = modifier.padding(
        start = 16.dp,
        top = 16.dp,
        end = 16.dp,
        bottom = 16.dp
    )) {
        Text(text = "komponen 1")
        Text(text = "komponen 2")
        Text(text = "komponen 3")
        Text(text = "komponen 4")
    }
}

@Composable
fun TataletakRow(modifier: Modifier){
    Row(modifier = modifier.fillMaxWidth(),
        horizontalArrangement = Arrangement.SpaceEvenly) {
        Text(text = "komponen 1")
        Text(text = "komponen 2")
        Text(text = "komponen 3")
        Text(text = "komponen 4")
    }
}

