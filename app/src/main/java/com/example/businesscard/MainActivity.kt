package com.example.businesscard

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.activity.enableEdgeToEdge
import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.width
import androidx.compose.material3.Scaffold
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.font.FontStyle
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.example.businesscard.ui.theme.BusinessCardTheme

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContent {
            BusinessCardTheme {
                Scaffold(modifier = Modifier.fillMaxSize()) { innerPadding ->
                    MainCard(
                        modifier = Modifier.padding(innerPadding)
                    )
                }
            }
        }
    }
}

@Composable
fun MainCard(modifier: Modifier = Modifier) {
    Column(
        modifier = Modifier
            .background(Color(red =14, green = 161, blue = 122))
            .fillMaxSize()
    ){
        Top(modifier)
        Bottom(modifier)
    }
}

@Composable
private fun Bottom(modifier: Modifier) {
    Column(
        verticalArrangement = Arrangement.Bottom,
        //horizontalAlignment = Alignment.Start,
        modifier = Modifier
            .padding(15.dp)
            .fillMaxSize()
    ) {
        Phone_number()
        Share()
        Email_add()
    }
}
@Composable
private fun Email_add()
{
    Row{
        Image(
            painter = painterResource(id = R.drawable.email),
            contentDescription = null,
            modifier = Modifier
                .padding(10.dp)
                .width(45.dp)
                .height(55.dp)
        )
        Text(
            text = "apilkhadka@gmail.com",
            modifier = Modifier.padding(16.dp),
            fontSize = 23.sp,
            textAlign = TextAlign.Justify
        )
    }
}
@Composable
private fun Share()
{
    Row{
        Image(
            painter = painterResource(id = R.drawable.share),
            contentDescription = null,
            modifier = Modifier
                .padding(10.dp)
                .width(45.dp)
                .height(55.dp)
        )
        Text(
            text = "@apil.me",
            modifier = Modifier.padding(16.dp),
            fontSize = 26.sp,
            textAlign = TextAlign.Justify
        )
    }
}
@Composable
private fun Phone_number() {
    Row {
        //Icon(Icons.Rounded.Send, contentDescription = "phone", tint = Red, )
        Image(
            painter = painterResource(id = R.drawable.phone),
            contentDescription = null,
            modifier = Modifier
                .padding(10.dp)
                .width(45.dp)
                .height(55.dp)
        )
        Text(
            text = "+977 9864782896",
            modifier = Modifier.padding(16.dp),
            fontSize = 26.sp,
            textAlign = TextAlign.Justify
        )
    }
}

@Composable
private fun Top(modifier: Modifier) {
    Column(
        modifier = Modifier
            .padding(34.dp)
            .fillMaxWidth()
    ) {
        Image(
            painter = painterResource(id = R.drawable.android),
            contentDescription = null,
            alignment = Alignment.Center,
            modifier = Modifier
                .padding(70.dp)
                .height(200.dp)
                .width(200.dp)

        )
        Text(
            text = "Apil Khadka",
            modifier = modifier
                .padding(1.dp)
                .align(Alignment.CenterHorizontally)
            ,
            textAlign = TextAlign.Center,
            fontWeight = FontWeight.Bold,
            fontStyle = FontStyle.Italic,
            fontSize = 45.sp
        )
    }
}

@Preview(showBackground = true)
@Composable
fun GreetingPreview() {
    BusinessCardTheme {
        Scaffold(modifier = Modifier.fillMaxSize()) { innerPadding ->
            MainCard(
                modifier = Modifier.padding(innerPadding)
            )
        }
    }
}