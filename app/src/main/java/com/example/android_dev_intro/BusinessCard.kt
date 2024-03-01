package com.example.android_dev_intro

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.fillMaxHeight
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.width
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Surface
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.Alignment
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import com.example.android_dev_intro.ui.theme.AndroiddevintroTheme

class BusinessCard : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            AndroiddevintroTheme {
                // A surface container using the 'background' color from the theme
                Surface(
                    modifier = Modifier.fillMaxSize(),
                    color = MaterialTheme.colorScheme.background
                ) {
                    MyCard()
                }
            }
        }
    }
}

@Composable
fun MyCard() {
    Column {
        Row {
            Text("Hello World", textAlign = TextAlign.Start, modifier = Modifier.width(150.dp))
            Text("Hello World", textAlign = TextAlign.End, modifier = Modifier.width(150.dp))
        }
        Row {
            Text("Name", textAlign = TextAlign.Center, modifier = Modifier.width(300.dp).height(300.dp).padding(20.dp))
        }
    }

}

@Preview(showBackground = true)
@Composable
fun MyCardPreview() {
    AndroiddevintroTheme {
        MyCard()
    }
}