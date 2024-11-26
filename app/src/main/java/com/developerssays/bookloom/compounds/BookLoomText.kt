package com.developerssays.bookloom.compounds

import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.text.font.FontFamily
import androidx.compose.ui.text.font.FontStyle
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.unit.sp

@Composable
fun BookLoomText(string: String)
{
    Text(text = string,
        style = MaterialTheme.typography.headlineLarge,
        fontSize = 22.sp,
        fontStyle = FontStyle.Normal,
        fontWeight = FontWeight.Bold,
        fontFamily = FontFamily.Monospace,
        color = Color.White)
}


@Composable
fun BookLoomTextHeading(string: String)
{
    Text(text = string,
        style = MaterialTheme.typography.headlineLarge,
        fontSize = 22.sp,
        fontStyle = FontStyle.Normal,
        fontWeight = FontWeight.Bold,
        fontFamily = FontFamily.Monospace,
        color = Color.Black)
}



