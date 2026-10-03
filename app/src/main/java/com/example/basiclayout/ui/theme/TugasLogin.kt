package com.example.basiclayout.ui.theme

import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.border
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.shape.CircleShape
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.example.basiclayout.R

val BiruTerang = Color(0xFF00A2E8)
val MerahTerang = Color(0xFFED1C24)
val UnguMuda = Color(0xFFC8BFE7)

@Composable
fun TugasLogin(modifier: Modifier = Modifier) {
    Box(modifier = Modifier.fillMaxSize()) {
        Image(
            painter = painterResource(id = R.drawable.bg_login),
            contentDescription = null,
            contentScale = ContentScale.Crop,
            modifier = Modifier.fillMaxSize()
        )

        Column(
            modifier = modifier
                .fillMaxSize()
                .padding(top = 16.dp),
            horizontalAlignment = Alignment.CenterHorizontally
        ) {
            Text(
                text = "Login",
                fontSize = 30.sp,
                fontWeight = FontWeight.Bold,
                color = BiruTerang
            )
            Text(
                text = "Ini adalah halaman login,",
                fontSize = 16.sp,
                color = Color.Red
            )
            Spacer(modifier = Modifier.height(48.dp))
            Image(
                painter = painterResource(id = R.drawable.logo_umy),
                contentDescription = "Logo UMY",
                modifier = Modifier.size(140.dp)
            )
            Spacer(modifier = Modifier.height(56.dp))
            Text(
                text = "Nama",
                fontSize = 16.sp,
                fontWeight = FontWeight.Bold,
                color = MerahTerang
            )
            Text(
                text = "Syah Jehan",
                fontSize = 16.sp,
                fontWeight = FontWeight.Bold,
                color = BiruTerang
            )
            Text(
                text = "20240140188",
                fontSize = 24.sp,
                fontWeight = FontWeight.Bold,
                color = Color.White
            )
            Spacer(modifier = Modifier.height(12.dp))
            Image(
                painter = painterResource(id = R.drawable.foto_pengangguran),
                contentDescription = null,
                contentScale = ContentScale.Fit,
                modifier = Modifier
                    .size(350.dp)
                    .clip(CircleShape)
                    .background(UnguMuda)
                    .border(width = 4.dp, color = Color.White, shape = CircleShape)
            )
        }

    }
}

@Preview(showBackground = true, showSystemUi = true)
@Composable
fun TugasLoginPreview() {
    BasicLayoutTheme {
        TugasLogin()
    }
}