package com.example.itemtweet

import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.fillMaxHeight
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.shape.CircleShape
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.rounded.Search
import androidx.compose.material3.Icon
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp

@Composable
fun ItemTweet() {
    Row(
        Modifier
            .fillMaxWidth()
            .height(400.dp)
        //.background(color = Color(0xFF1E201D))
    ) {
        IconProfile()
        InfoTweet()
    }
}

@Composable
fun IconProfile() {
    Column(
        modifier = Modifier
            .fillMaxHeight()
            .fillMaxWidth(0.3f)
            .background(color = Color(0xFF4FBB1A))
            .padding(top = 20.dp),
        horizontalAlignment = Alignment.CenterHorizontally,
        verticalArrangement = Arrangement.Top
    ) {
        Image(
            painter = painterResource(id = R.drawable.profile),
            contentDescription = "Icon Profile",
            modifier = Modifier
                .clip(CircleShape)
                .size(80.dp)
        )
    }
}

@Composable
fun InfoTweet() {
    Column(
        modifier = Modifier
            .fillMaxSize()
            .background(color = Color(0xFFAB1348))
    ) {

    }
}

@Preview(
    showSystemUi = true
)
@Composable
fun ItemTweetPrev() {
    ItemTweet()
}