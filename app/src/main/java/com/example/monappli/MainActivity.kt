package com.example.monappli

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.activity.enableEdgeToEdge
import androidx.compose.foundation.Image
import androidx.compose.foundation.border
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.shape.CircleShape
import androidx.compose.material3.Button
import androidx.compose.material3.Scaffold
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import com.example.monappli.ui.theme.MonAppliTheme

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            MonAppliTheme {
                Scaffold(modifier = Modifier.fillMaxSize()) { innerPadding ->
                    MonProfil()
                }
            }
        }
    }
}

@Composable
fun MonProfil(modifier: Modifier = Modifier) {
    Column(
        modifier = Modifier.fillMaxWidth(),
        horizontalAlignment = Alignment.CenterHorizontally
    ) {
        MonImage()
        MonNom()
        MesAdresses()
        Demarrer()

    }

}

@Composable
fun MonImage(modifier: Modifier = Modifier){
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
fun MonNom(modifier: Modifier = Modifier){
    Text(text = "Mouhamed DORE")
    Text(text = "Elève ingénieur à ISIS",
         modifier= Modifier.padding(10.dp))

}

@Composable
fun MesAdresses(modifier: Modifier = Modifier){
    Column(modifier = Modifier.padding(50.dp)) {
        Text(text = "mouhamed.dore@etud.univ-jfc.fr")
        Text(text = "www.linkedin.com/in/mouhamed-dore")
    }
}


@Composable
fun Demarrer(modifier: Modifier = Modifier){
    Button(
        onClick = { /*TODO*/ },
        Modifier.padding(80.dp))
    {
        Text(text = "Démarrer")
    }
}
