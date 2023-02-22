package com.example.composelessonsytnecoru

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.gestures.scrollable
import androidx.compose.foundation.layout.*
import androidx.compose.foundation.rememberScrollState
import androidx.compose.foundation.shape.CircleShape
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.foundation.verticalScroll
import androidx.compose.material.*
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.font.Font
import androidx.compose.ui.text.font.FontStyle
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.example.composelessonsytnecoru.ui.theme.ComposeLessonsYTNecoRuTheme

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            ComposeLessonsYTNecoRuTheme {
                Surface (
                    color = Color(0xFF201324)
                ) {
                    MainCard()
                }
            }
        }
    }
}

@Composable
fun MainCard(){
    Card (
        modifier = Modifier
            .fillMaxWidth()
            .padding(20.dp),
        shape = RoundedCornerShape(25.dp),
        elevation = 128.dp
    ) {
        Box(
            modifier = Modifier
                .fillMaxSize()
                .background(Color.DarkGray)
        ) {
            Column(
                modifier = Modifier.verticalScroll(rememberScrollState())
            ) {
                Text(
                    text = "Search",
                    color = Color.White,
                    fontSize = 18.sp,
                    modifier = Modifier.padding(start = 24.dp, top = 20.dp, bottom = 10.dp, end = 15.dp)
                )
                Divider(
                    color = Color.Gray,
                    thickness = 2.dp,
                    modifier = Modifier.padding()
                )
                FirstUsingCards(name = "Alexandro Dobruchio", profession = "art director")
                FirstUsingCards(name = "Jeph Castell", profession = "musician")
                FirstUsingCards(name = "Bertruchio de Berjerak", profession = "programmer")
                FirstUsingCards(name = "Bertruchio de Berjerak", profession = "programmer")
                FirstUsingCards(name = "Bertruchio de Berjerak", profession = "programmer")
                FirstUsingCards(name = "Jeph Castell", profession = "musician")
                FirstUsingCards(name = "Jeph Castell", profession = "musician")
                FirstUsingCards(name = "Alexandro Dobruchio", profession = "art director")
                FirstUsingCards(name = "Jeph Castell", profession = "musician")
            }
        }
    }
}

@Composable
fun FirstUsingCards(name: String, profession: String){
    Card (
        modifier = Modifier
            .fillMaxWidth()
            .padding(top = 20.dp, start = 10.dp, end = 10.dp),
        shape = RoundedCornerShape(25.dp),
        elevation = 10.dp
    ) {
        Box (
            modifier = Modifier.background(Color.Gray)
        ) {
            Row (
                verticalAlignment = Alignment.CenterVertically
            ){
                Image(
                    painter = painterResource(id = R.drawable.icon),
                    contentDescription = "iconImage",
                    contentScale = ContentScale.Crop,
                    modifier = Modifier
                        .padding(start = 10.dp, end = 10.dp, top = 15.dp, bottom = 10.dp)
                        .size(64.dp)
                        .clip(CircleShape)
                )

                Column ( modifier = Modifier.padding(15.dp)){
                    Text(text = name, fontSize = 18.sp)
                    Text(text = profession)
                }
            }
        }
    }
}

@Preview(showBackground = true)
@Composable
fun DefaultPreview() {
    ComposeLessonsYTNecoRuTheme {
        Surface (
            color = Color(0xFF201324)
        ) {
            MainCard()
        }
    }
}