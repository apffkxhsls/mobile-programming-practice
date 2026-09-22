package com.example.happybirthday.component

import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.width
import androidx.compose.foundation.layout.wrapContentSize
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.ColorFilter
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.example.happybirthday.R
import com.example.happybirthday.ui.theme.HappyBirthdayTheme

@Composable
fun Logo(modifier: Modifier = Modifier) {
    val logo = painterResource(R.drawable.android_logo)
    Box(
        modifier = modifier
            .padding(horizontal = 130.dp)
            .padding(top = 200.dp)
    ) {
        Image(
            painter = logo,
            contentDescription = null,
            modifier = modifier.background(Color(0xFF073042))
        )
    }
}

@Composable
fun Name(name: String, modifier: Modifier = Modifier) {
    Row(horizontalArrangement = Arrangement.SpaceBetween) {
        Text(
            modifier = modifier
                .fillMaxWidth()
                .wrapContentSize(align = Alignment.Center),
            text = name,
            fontSize = 50.sp,
            fontWeight = FontWeight.W300,
            textAlign = TextAlign.Center,
        )
    }
}

@Composable
fun Position(position: String, modifier: Modifier = Modifier) {
    Row(horizontalArrangement = Arrangement.SpaceBetween) {
        Text(
            modifier = modifier
                .fillMaxWidth()
                .wrapContentSize(align = Alignment.Center),
            text = position,
            fontWeight = FontWeight.Bold,
            color = Color(0xFF006D3B),
            textAlign = TextAlign.Center,
        )
    }
}

@Composable
fun Contact(
    phoneNumber: String,
    share: String,
    mail: String,
    modifier: Modifier = Modifier
) {
    val phoneIcon = painterResource(R.drawable.phone)
    val shareIcon = painterResource(R.drawable.share)
    val mailIcon = painterResource(R.drawable.mail)

    Box(
        modifier = modifier
            .padding(bottom = 40.dp)
            .fillMaxWidth()
    ) {
        Column(
            modifier = Modifier.align(Alignment.TopCenter),
            verticalArrangement = Arrangement.Center
        ) {
            Row(horizontalArrangement = Arrangement.SpaceBetween) {
                Image(
                    painter = phoneIcon,
                    contentDescription = null,
                    colorFilter = ColorFilter.tint(Color(0xFF006D3B))
                )
                Spacer(modifier = Modifier.width(20.dp))
                Text(modifier = Modifier, text = phoneNumber)
            }

            Spacer(modifier = Modifier.height(10.dp))

            Row(horizontalArrangement = Arrangement.SpaceBetween) {
                Image(
                    painter = shareIcon,
                    contentDescription = null,
                    colorFilter = ColorFilter.tint(Color(0xFF006D3B))
                )
                Spacer(modifier = Modifier.width(20.dp))
                Text(modifier = Modifier, text = share)
            }

            Spacer(modifier = Modifier.height(10.dp))

            Row(horizontalArrangement = Arrangement.SpaceBetween) {
                Image(
                    painter = mailIcon,
                    contentDescription = null,
                    colorFilter = ColorFilter.tint(Color(0xFF006D3B))
                )
                Spacer(modifier = Modifier.width(20.dp))
                Text(modifier = Modifier, text = mail)
            }
        }
    }
}

@Composable
fun FirstScreen(modifier: Modifier = Modifier) {
    Column(
        modifier = modifier
            .background(Color(0xFFD2E8D4))
    ) {
        Logo()

        Spacer(modifier = Modifier.height(10.dp))

        Name(name = "Jennifer Doe")

        Spacer(modifier = Modifier.height(5.dp))

        Position(position = "Android Developer Extraordinaire")

        Spacer(modifier = Modifier.height(200.dp))

        Contact(
            phoneNumber = "+11 (123) 444 555 666",
            share = "@AndroidDev",
            mail = "jen.doe@android.com"
        )
    }
}

@Preview(showBackground = true)
@Composable
private fun FirstScreenPreview() {
    HappyBirthdayTheme {
        FirstScreen()
    }
}
