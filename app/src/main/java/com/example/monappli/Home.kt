package com.example.monappli

import androidx.compose.foundation.Image
import androidx.compose.foundation.layout.*
import androidx.compose.foundation.shape.CircleShape
import androidx.compose.material3.Button
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import androidx.window.core.layout.WindowSizeClass
import androidx.window.core.layout.WindowWidthSizeClass

@Composable
fun MonProfil(windowClass: WindowSizeClass) {
    when (windowClass.windowWidthSizeClass) {
        WindowWidthSizeClass.COMPACT -> {
            Column(
                modifier = Modifier.fillMaxSize(),
                verticalArrangement = Arrangement.SpaceEvenly,
                horizontalAlignment = Alignment.CenterHorizontally
            ) {
                MonImage()
                MonNom()
                MesAdresses()
                Demarrer()
            }
        }
        else -> {
            Row(
                modifier = Modifier.fillMaxSize(),
                verticalAlignment = Alignment.CenterVertically,
                horizontalArrangement = Arrangement.SpaceEvenly
            ) {
                Column(
                    horizontalAlignment = Alignment.CenterHorizontally
                ) {
                    MonImage()
                    MonNom()
                }
                Column(
                    horizontalAlignment = Alignment.CenterHorizontally
                ) {
                    MesAdresses()
                    Demarrer()
                }
            }
        }
    }
}

@Composable
fun MonImage(modifier: Modifier = Modifier) {
    Image(
        painter = painterResource(id = R.drawable.shifu),
        contentDescription = "Photo de profil",
        contentScale = ContentScale.Crop,
        modifier = Modifier
            .size(150.dp)
            .clip(CircleShape)
            .padding(10.dp)
    )
}

@Composable
fun MonNom(modifier: Modifier = Modifier) {
    Column(modifier = Modifier.padding(10.dp)) {
        Text(text = "Mouhamed DORE")
        Text(text = "Elève ingénieur à ISIS")
    }
}

@Composable
fun MesAdresses(modifier: Modifier = Modifier) {
    Column(modifier = Modifier.padding(40.dp)) {
        Row(
            verticalAlignment = Alignment.CenterVertically,
            modifier = Modifier.padding(vertical = 8.dp)
        ) {
            Image(
                painter = painterResource(id = R.drawable.mail),
                contentDescription = "Mail",
                modifier = Modifier
                    .size(24.dp)
                    .padding(end = 8.dp)
            )
            Text(text = "mouhamed.dore@etud.univ-jfc.fr", fontSize = 15.sp)
        }

        Row(
            verticalAlignment = Alignment.CenterVertically,
            modifier = Modifier.padding(vertical = 8.dp)
        ) {
            Image(
                painter = painterResource(id = R.drawable.linkedin),
                contentDescription = "LinkedIn",
                modifier = Modifier
                    .size(24.dp)
                    .padding(end = 8.dp)
            )
            Text(text = "www.linkedin.com/in/mouhamed-dore", fontSize = 15.sp)
        }
    }
}

@Composable
fun Demarrer(modifier: Modifier = Modifier) {
    Column(
        modifier = Modifier
            .fillMaxSize()
            .padding(16.dp),
        verticalArrangement = Arrangement.SpaceBetween,
        horizontalAlignment = Alignment.CenterHorizontally
    ) {
        Spacer(modifier = Modifier.weight(1f))

        Button(
            onClick = { /*TODO*/ },
            modifier = Modifier.padding(16.dp)
        ) {
            Text(text = "Démarrer")
        }
    }
}
