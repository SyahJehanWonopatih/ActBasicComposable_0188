package com.example.basiclayout.ui.theme

import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier

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
                color = Color.White
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
        }

    }
}