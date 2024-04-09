package com.junqueira.presentationapp

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.rounded.Email
import androidx.compose.material.icons.rounded.Phone
import androidx.compose.material.icons.rounded.Share
import androidx.compose.material3.Icon
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Surface
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.junqueira.presentationapp.ui.theme.PresentationAppTheme
import com.junqueira.presentationapp.ui.theme.Purple40
import com.junqueira.presentationapp.ui.theme.Purple80

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            PresentationAppTheme {
                // A surface container using the 'background' color from the theme
                Surface(
                    modifier = Modifier.fillMaxSize(),
                    color = MaterialTheme.colorScheme.background
                ) {
                    Greeting("Android")
                }
            }
        }
    }
}

@Composable
fun SelfSection(modifier: Modifier = Modifier) {
    val image = painterResource(id = R.drawable.android_logo)
    Column(
        verticalArrangement = Arrangement.Center,
        horizontalAlignment = Alignment.CenterHorizontally,
        modifier = Modifier
            .background(color = Color(0xFFC2FCC6))
    ) {
        Image(
            painter = image,
            contentDescription = "Android logo",
            modifier = modifier
                .size(130.dp)
                .background(color = Color(0xFF3B5686))
        )
        Text(
            text = "Alfredo Junqueira",
            fontSize = 35.sp,
            modifier = modifier
                .padding(5.dp)
        )
        Text(
            text = "Android Developer Extraordinaire",
            color  = Color(0xFF3ddc84)
        )
    }
}

@Composable
fun ContactSection(modifier: Modifier = Modifier) {
    Row(
        horizontalArrangement = Arrangement.Center,
        verticalAlignment = Alignment.Bottom,
        modifier = Modifier
            .padding(bottom = 20.dp)
        ) {
        Column {
            Icon(
                Icons.Rounded.Phone,
                contentDescription = null,
                modifier = modifier
                    .padding(4.dp)
                    .size(20.dp)
            )
            Icon(
                Icons.Rounded.Share,
                contentDescription = null,
                modifier = modifier
                    .padding(4.dp)
                    .size(20.dp)
            )
            Icon(
                Icons.Rounded.Email,
                contentDescription = null,
                modifier = modifier
                    .padding(4.dp)
                    .size(20.dp)
            )
        }
        Column(Modifier.padding(bottom = 4.dp, start = 3.dp)) {
            Text(
                text = "+244 948 526 720",
                color = Color(0xFF3ddc84),
                fontSize = 13.sp,
                modifier = modifier
                    .padding(4.dp)

            )
            Text(
                text = "@alfredoaj",
                color = Color(0xFF3ddc84),
                fontSize = 13.sp,
                modifier = modifier
                    .padding(4.dp)
            )
            Text(
                text = "alfredojunqueira75@gmail.com",
                color = Color(0xFF3ddc84),
                fontSize = 13.sp,
                modifier = modifier
                    .padding(4.dp)
            )
        }
    }

}

@Composable
fun Greeting(name: String, modifier: Modifier = Modifier) {
    SelfSection()
    ContactSection()
}

@Preview(
    showBackground = true,
    showSystemUi = true
)
@Composable
fun GreetingPreview() {
    PresentationAppTheme {
        Greeting("Android")
    }
}