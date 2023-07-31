package com.example.codingchallangeforcp

import androidx.compose.runtime.*
import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.material3.Button
import androidx.compose.material3.CircularProgressIndicator
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.ProgressIndicatorDefaults
import androidx.compose.material3.Surface
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import com.example.codingchallangeforcp.ui.theme.CodingchallangeforcpTheme

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            CodingchallangeforcpTheme {
                // A surface container using the 'background' color from the theme
                Surface(modifier = Modifier.fillMaxSize(), color = MaterialTheme.colorScheme.background) {
                    MyUI()
                }
            }
        }
    }
}

@Composable
fun MyUI() {
    var progress by remember{
        mutableStateOf(0.0f)
    }
    Column(verticalArrangement = Arrangement.Center,
        horizontalAlignment = Alignment.CenterHorizontally) {
        CircularProgressIndicator(
            progress= progress,
            color = ProgressIndicatorDefaults.circularColor,
            strokeWidth = 6.dp)
        Button(onClick = { progress += 0.1f }) {
            Text(text = "Increase Progress")
        }
    }
}

@Preview(showBackground = true)
@Composable
fun GreetingPreview() {
    CodingchallangeforcpTheme {
        MyUI()
    }
}