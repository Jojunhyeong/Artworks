package com.example.artwork

import android.graphics.ColorSpace.Rgb
import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.BorderStroke
import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.border
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxHeight
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.width
import androidx.compose.foundation.layout.wrapContentSize
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Surface
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.draw.shadow
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.RectangleShape
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
                    color = MaterialTheme.colorScheme.background,
                ) {
                    ArtWorklayout()
                }
            }
        }
    }
}

@Composable
fun ArtWorklayout(){
    Column (modifier = Modifier.fillMaxSize()
        , horizontalAlignment = Alignment.CenterHorizontally
        , verticalArrangement = Arrangement.Center
        ){
        Box (modifier = Modifier
            .border(1.dp, Color.Black)
            ){
            Image(
                painter = painterResource(R.drawable.barcalogo),
                contentDescription = stringResource(
                    id = R.string.barca_logo
                ),
                modifier = Modifier.padding(40.dp).width(width = 250.dp).height(height = 330.dp)
            )
        }

        Spacer(modifier = Modifier.padding(10.dp))

        Box (modifier = Modifier
            .width(width = 360.dp)
            .padding(16.dp, 16.dp)
            .border(width = 1.dp, color = Color(226, 226, 226))
            .background(Color(226, 226, 226))){
            Column(modifier = Modifier.padding(12.dp, 8.dp), horizontalAlignment = Alignment.CenterHorizontally, verticalArrangement = Arrangement.Center) {
                Text(text = "FC BARCELONA", fontSize = 30.sp, fontWeight = FontWeight.Bold)
                Spacer(modifier = Modifier.padding(4.dp))
                Text(text = "Lionel Messi (2023)", fontSize = 17.sp)
            }
        }

        Row(verticalAlignment = Alignment.CenterVertically) {
            Box(modifier = Modifier.background(Color(61, 71, 111), shape = MaterialTheme.shapes.extraLarge)
                .border(2.dp, Color(61, 71, 111), shape = MaterialTheme.shapes.extraLarge)) {
                Text(text = "Previous", fontSize = 13.sp, modifier = Modifier.padding(35.dp, 10.dp), color = Color.White)
            }
            Spacer(modifier = Modifier.padding(40.dp, 40.dp))
            Box (modifier = Modifier.background(Color(61, 71, 111)
                , shape = MaterialTheme.shapes.extraLarge)
                .border(2.dp, Color(61, 71, 111)
                    , shape = MaterialTheme.shapes.extraLarge))
            {
                Text(text = "Next", fontSize = 13.sp, modifier = Modifier.padding(45.dp, 10.dp), color = Color.White)
            }

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