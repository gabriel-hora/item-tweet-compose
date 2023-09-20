package com.example.itemtweet

import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.clickable
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
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.saveable.rememberSaveable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.ColorFilter
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp

@Composable
fun ItemTweet() {
    Row(
        Modifier
            .fillMaxWidth()
            .height(400.dp)
            .background(color = Color(0xFF080808))
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
            .fillMaxWidth(0.25f)
            .padding(top = 20.dp),
        horizontalAlignment = Alignment.CenterHorizontally,
        verticalArrangement = Arrangement.Top
    ) {
        Image(
            painter = painterResource(id = R.drawable.profile),
            contentDescription = "Icon Profile",
            modifier = Modifier
                .clip(CircleShape)
                .size(60.dp)
        )
    }
}

@Composable
fun InfoTweet() {
    Column(
        modifier = Modifier
            .fillMaxSize()
    ) {
        Header()
        Body()
        Footer()
    }
}

@Composable
fun Header() {
    Row(
        Modifier
            .fillMaxWidth()
            .height(55.dp)
    ) {
        Text(
            modifier = Modifier.padding(top = 20.dp, end = 10.dp),
            text = "Aris",
            fontWeight = FontWeight.Bold,
            fontSize = 18.sp,
            color = Color.White
        )

        Text(
            modifier = Modifier.padding(top = 20.dp),
            text = "@AristiDevs 4h",
            fontWeight = FontWeight.Medium,
            color = Color.Gray,
            fontSize = 18.sp
        )

        Row(
            Modifier
                .fillMaxSize()
                .padding(top = 20.dp, end = 20.dp), horizontalArrangement = Arrangement.End
        ) {
            Image(
                painter = painterResource(id = R.drawable.ic_dots),
                contentDescription = "options"
            )
        }
    }
}

@Composable
fun Body() {
    Column(
        Modifier
            .fillMaxWidth()
            .height(300.dp)
            .padding(end = 20.dp)
    ) {
        Text(
            text = "A descrição desse Tweet não podemos explicar, porque tudo que fazemos está aqui. Pense bem.",
            fontSize = 18.sp,
            color = Color.White,
            fontWeight = FontWeight.Normal
        )

        Image(
            modifier = Modifier
                .padding(top = 20.dp)
                .clip(RoundedCornerShape(10.dp)),
            painter = painterResource(id = R.drawable.profile),
            contentDescription = "imagem adicionada",
            contentScale = ContentScale.Crop
        )
    }
}

@Composable
fun Footer() {

    val checkLike = rememberSaveable { mutableStateOf(true) }
    val counterLike = rememberSaveable { mutableStateOf(10) }



    Row(
        verticalAlignment = Alignment.CenterVertically,
        horizontalArrangement = Arrangement.SpaceBetween,
        modifier = Modifier
            .fillMaxWidth()
            .padding(top = 20.dp, end = 40.dp)
    ) {
        Row() {
            Image(
                painter = painterResource(id = R.drawable.ic_chat),
                contentDescription = "ic chat",
                colorFilter = ColorFilter.tint(Color.Gray),
                modifier = Modifier
                    .padding(end = 5.dp)
                    .size(25.dp)
            )
            Text(text = "1", color = Color.Gray, fontSize = 18.sp)
        }

        Row() {
            Image(
                painter = painterResource(id = R.drawable.ic_rt),
                contentDescription = "ic chat",
                colorFilter = ColorFilter.tint(Color.Gray),
                modifier = Modifier
                    .padding(end = 5.dp)
                    .size(25.dp)
            )
            Text(text = "1", color = Color.Gray, fontSize = 18.sp)
        }

        Row() {
            Image(
                painter = painterResource(id = R.drawable.ic_like),
                contentDescription = "ic chat",
                colorFilter = ColorFilter.tint(Color.Gray),
                modifier = Modifier
                    .padding(end = 5.dp)
                    .size(25.dp)
                    .clickable {
                        if (checkLike.value) {
                            checkLike.value = false
                            counterLike.value += 1
                        } else {
                            checkLike.value = true
                            counterLike.value -= 1
                        }
                    }
            )
            Text(text = counterLike.value.toString(), color = Color.Gray, fontSize = 18.sp)
        }
    }
}

@Preview()
@Composable
fun ItemTweetPrev() {
    ItemTweet()
}