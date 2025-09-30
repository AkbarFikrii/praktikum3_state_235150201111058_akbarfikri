package com.example.praktikum3_state_235150201111058_akbarfikri

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.clickable
import androidx.compose.foundation.layout.*
import androidx.compose.foundation.shape.CircleShape
import androidx.compose.material3.Button
import androidx.compose.material3.Text
import androidx.compose.runtime.*
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.example.praktikum3_state_235150201111058_akbarfikri.ui.theme.Praktikum3_State_235150201111058_AkbarFikriTheme

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            Praktikum3_State_235150201111058_AkbarFikriTheme {
//                CounterApp()
//                ColorToggleButton()
                InteractiveProfile()
            }
        }
    }
}

@Composable
fun CounterApp() {
    var count by remember { mutableStateOf(0) }

    Column(
        modifier = Modifier.fillMaxSize().padding(16.dp),
        horizontalAlignment = Alignment.CenterHorizontally,
        verticalArrangement = Arrangement.Center
    ) {
        Text("Nilai Counter: $count", fontSize = 24.sp, fontWeight = FontWeight.Bold)
        Spacer(modifier = Modifier.height(16.dp))
        Row(
            horizontalArrangement = Arrangement.spacedBy(16.dp)
        ) {
            Button(onClick = { count++ }) {
                Text("Tambah (+)")
            }
            Button(
                onClick = { if (count > 0) count-- },
                enabled = count > 0
            ) {
                Text("Kurang (-)")
            }
        }
    }
}

@Composable
fun ColorToggleButton() {
    var isRed by remember { mutableStateOf(true) }
    val boxColor = if (isRed) Color.Red else Color.Green

    Column(
        modifier = Modifier.fillMaxSize(),
        horizontalAlignment = Alignment.CenterHorizontally,
        verticalArrangement = Arrangement.Center
    ) {
        Box(
            modifier = Modifier
                .size(200.dp)
                .background(boxColor)
                .clickable { isRed = !isRed }
        )
    }
}

@Composable
fun InteractiveProfile() {
    var isFollowed by remember { mutableStateOf(false) }

    Column(
        modifier = Modifier.fillMaxSize().padding(16.dp),
        horizontalAlignment = Alignment.CenterHorizontally,
        verticalArrangement = Arrangement.Center
    ) {
        Image(
            painter = painterResource(R.drawable.ic_launcher_foreground),
            contentDescription = "Foto Profil",
            modifier = Modifier.size(120.dp).clip(CircleShape)
        )
        Spacer(modifier = Modifier.height(8.dp))
        Text("Nama: Akbar Fikri Abdillah", fontSize = 20.sp, fontWeight = FontWeight.Bold)
        Spacer(modifier = Modifier.height(4.dp))
        Text("Mahasiswa Teknik Informatika")
        Spacer(modifier = Modifier.height(12.dp))

        Button(onClick = { isFollowed = !isFollowed }) {
            Text(if (isFollowed) "Unfollow" else "Follow")
        }

        Spacer(modifier = Modifier.height(8.dp))
        Text(
            text = if (isFollowed) "Anda mengikuti akun ini" else "Anda belum mengikuti akun ini",
            color = if (isFollowed) Color.Blue else Color.Gray,
            fontSize = 14.sp
        )
    }
}

@Preview(showBackground = true)
@Composable
fun DefaultPreview() {
    Praktikum3_State_235150201111058_AkbarFikriTheme {
        InteractiveProfile()
    }
}