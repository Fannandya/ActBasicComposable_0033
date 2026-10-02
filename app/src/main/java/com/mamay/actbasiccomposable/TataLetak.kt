package com.mamay.actbasiccomposable

import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxHeight
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.font.FontFamily
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.text.style.LineHeightStyle
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp


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

@Composable
fun TataletakBox(modifier: Modifier){
    Box(
        modifier = modifier
            .fillMaxHeight()
            .fillMaxWidth(), contentAlignment = Alignment.Center
    ) {
        Text(text = "Box 1")
        Text(text = "Column ")
        Text(text = "Row 1")
        Text(text = "Box 2")
        Text(text = "Column 2")
    }
}

@Composable
fun TataletakColumnRow(modifier: Modifier){
    Column(){
        // baris 1
        Row(modifier = modifier.fillMaxWidth(),
            horizontalArrangement = Arrangement.SpaceEvenly) {
            Text(text = "komponen 1 baris 1")
            Text(text = "komponen 2 baris 1")
            Text(text = "komponen 3 baris 1")
        }
        // baris 2
        Row(modifier = modifier.fillMaxWidth(),
            horizontalArrangement = Arrangement.SpaceEvenly) {
            Text(text = "komponen 1 baris 2")
            Text(text = "komponen 2 baris 2")
            Text(text = "komponen 3 baris 2")
        }

    }
}

@Composable
fun TataletakRowColumn(modifier: Modifier){
    Row(modifier = modifier.fillMaxWidth(),
        horizontalArrangement = Arrangement.SpaceEvenly){
        // kolom 1
        Row(modifier = modifier.fillMaxWidth(),
            horizontalArrangement = Arrangement.SpaceEvenly) {
            Text(text = "komponen 1 kolom 1")
            Text(text = "komponen 2 kolom 1")
            Text(text = "komponen 3 kolom 1")
        }
        // kolom 2
        Row(modifier = modifier.fillMaxWidth(),
            horizontalArrangement = Arrangement.SpaceEvenly) {
            Text(text = "komponen 1 kolom 2")
            Text(text = "komponen 2 kolom 2")
            Text(text = "komponen 3 kolom 2")
        }

    }
}

@Composable
fun TataletakBoxRowColumn(modifier: Modifier){
    val gambar = painterResource(id = R.drawable.gambar)
    Column {
        Box(
            modifier = modifier
                .fillMaxWidth()
                .height(100.dp)
                .background(color = Color.Yellow),
            contentAlignment = Alignment.Center
        ) {
            Column() {
                Row(
                    modifier = modifier.fillMaxWidth(),
                    horizontalArrangement = Arrangement.SpaceEvenly
                ) {
                    Text(text = "coll_row1_komponen1")
                    Text(text = "coll_row1_komponen1")
                    Text(text = "coll_row1_komponen1")
                }
                Row(
                    modifier = modifier.fillMaxWidth(),
                    horizontalArrangement = Arrangement.SpaceEvenly
                ) {
                    Text(text = "coll_row2_komponen1")
                    Text(text = "coll_row2_komponen1")
                    Text(text = "coll_row2_komponen1")
                }
            }
        }
        Spacer(modifier = Modifier.height(10.dp))
        Box(
            modifier = modifier
                .fillMaxWidth()
                .height(300.dp)
                .background(color = Color.Blue),
            contentAlignment = Alignment.Center
        ) {
            Image(painter = gambar,
                contentDescription = null,
                contentScale = ContentScale.Fit)
            Text(text = "My Music",
                fontSize = 30.sp,
                color = Color.Red,
                fontWeight = FontWeight.Bold,
                fontFamily = FontFamily.Cursive,
                modifier = Modifier.align(
                    Alignment.BottomCenter))
        }

    }
}