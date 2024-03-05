package com.example.ktproject

import androidx.compose.ui.Alignment.Horizontal

import android.content.Context
import android.graphics.Paint
import android.icu.text.DisplayContext
import android.os.Bundle
import android.widget.Toast
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.layout.*
import androidx.compose.material.Button
import androidx.compose.material.Surface
import androidx.compose.material.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Alignment.Companion.Center
import androidx.compose.ui.Alignment.Companion.CenterHorizontally
import androidx.compose.ui.Alignment.Companion.CenterVertically
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.platform.LocalContext
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.tooling.preview.PreviewParameter
import androidx.compose.ui.unit.TextUnit
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.example.ktproject.ui.theme.KTprojectTheme

class MainActivity : ComponentActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            KTprojectTheme {
                val context = LocalContext.current
                // A surface container using the 'background' color from the theme
                Surface(
                    modifier = Modifier.fillMaxSize(),
                    color = Color.Black
                )
                {
                    CreateButtons(context
                    )
                }

            }
        }
    }
}

fun AllAction(context: Context) {
    Toast.makeText(context, "AllAction", Toast.LENGTH_SHORT).show()
}
fun DramaAction(context: Context) {
    Toast.makeText(context, "DramaAction", Toast.LENGTH_SHORT).show()
}
fun HorrorAction(context: Context) {
    Toast.makeText(context, "HorrorAction", Toast.LENGTH_SHORT).show()
}
fun AdventureAction(context: Context) {
    Toast.makeText(context, "AdventureAction", Toast.LENGTH_SHORT).show()
}
fun ScienceFictionAction(context: Context) {
    Toast.makeText(context, "ScienceFictionAction", Toast.LENGTH_SHORT).show()
}
fun ComedyAction(context: Context) {
    Toast.makeText(context, "ComedyAction", Toast.LENGTH_SHORT).show()
}



@Composable
fun CreateButtons(context: Context,modifier: Modifier = Modifier ) {

    Column (horizontalAlignment = Alignment.CenterHorizontally, modifier = Modifier
    ){
        Text(fontSize = 32.sp, color = Color.White, text = "Movie Ranker", modifier = Modifier.padding(24.dp))

        Button({ AllAction(context)},) {
            Text(fontSize = 28.sp, textAlign = TextAlign.Center ,text = "All", modifier = Modifier.size(width = 300.dp, height = 48.dp))
        }
        Spacer(modifier = Modifier.height(16.dp)) // Adjust the height value as needed

        Button({ DramaAction(context) }) {
            Text(textAlign = TextAlign.Center,text = "Drama", modifier = Modifier.size(width = 300.dp, height = 48.dp))
        }
        Spacer(modifier = Modifier.height(16.dp)) // Adjust the height value as needed

        Button({ HorrorAction(context) }) {
            Text("Horror", textAlign = TextAlign.Center,modifier = Modifier.size(width = 300.dp, height = 48.dp))
        }
        Spacer(modifier = Modifier.height(16.dp)) // Adjust the height value as needed

        Button({ AdventureAction(context) }) {
            Text("Adventure", textAlign = TextAlign.Center,modifier = Modifier.size(width = 300.dp, height = 48.dp))
        }
        Spacer(modifier = Modifier.height(16.dp)) // Adjust the height value as needed

        Button({ ScienceFictionAction(context) }) {
            Text("Science Fiction",textAlign = TextAlign.Center,modifier = Modifier.size(width = 300.dp, height = 48.dp))
        }
        Spacer(modifier = Modifier.height(16.dp)) // Adjust the height value as needed

        Button({ ComedyAction(context) }) {
            Text("Comedy",textAlign = TextAlign.Center, modifier = Modifier.size(width = 300.dp, height = 48.dp))
        }
    }
}