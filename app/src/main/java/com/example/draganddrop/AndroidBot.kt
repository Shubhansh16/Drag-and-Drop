package com.example.draganddrop

import androidx.compose.foundation.background
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.geometry.Offset
import androidx.compose.ui.geometry.Size
import androidx.compose.ui.graphics.Canvas
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.tooling.preview.Preview
import kotlin.text.Typography.times

@Composable
fun NewAndroidBot() {
  //import canvas
    androidx.compose.foundation.Canvas(
      modifier = Modifier
          .background(Color.White) //set background color of canvas
          .fillMaxSize()         //canvas will take full screen size
    ){
       //draw the head
        val width = size.width
        val height = size.height

        drawArc(
           startAngle = 0f,
            sweepAngle = -180f,
            useCenter = true,
            color = androidColor,
            size = Size(width/2f, width/2f),
            topLeft = Offset(width.times(.25f), height.times(.3f))
        )
    }
}

@Preview(showBackground = true)
@Composable
fun NewAndroidBotPreview() {
    NewAndroidBot()
}