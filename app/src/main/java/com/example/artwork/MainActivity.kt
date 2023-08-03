package com.example.artwork

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.Image
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.width
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Surface
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.res.stringResource
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.example.artwork.ui.theme.ArtworkTheme

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            ArtworkTheme {
                // A surface container using the 'background' color from the theme
                Surface(
                    modifier = Modifier.fillMaxSize(),
                    color = MaterialTheme.colorScheme.background
                ) {
                    ArtWorklayout()
                }
            }
        }
    }
}

@Composable
fun ArtWorklayout(){
    Column (modifier = Modifier.fillMaxSize(), horizontalAlignment = Alignment.CenterHorizontally, verticalArrangement = Arrangement.Center){
        Image(painter = painterResource(R.drawable.barcalogo ), contentDescription = stringResource(
            id = R.string.barca_logo))
        Spacer(modifier = Modifier.padding(10.dp))

        Column(horizontalAlignment = Alignment.CenterHorizontally) {
            Text(text = "Artwork Title", fontSize = 30.sp, fontWeight = FontWeight.Bold)
            Spacer(modifier = Modifier.padding(4.dp))
            Text(text = "Artwork Artist (Year)", fontSize = 17.sp)
        }

        Row(verticalAlignment = Alignment.CenterVertically) {
            Text(text = "Previous", fontSize = 20.sp)
            Spacer(modifier = Modifier.padding(40.dp, 15.dp))
            Text(text = "Next", fontSize = 20.sp)
            
        }

    }

}

@Preview(showBackground = true)
@Composable
fun GreetingPreview() {
    ArtworkTheme {
        ArtWorklayout()
    }
}