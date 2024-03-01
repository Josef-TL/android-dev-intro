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
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Surface
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.tooling.preview.Preview
import com.example.android_dev_intro.ui.theme.AndroiddevintroTheme

class SecondaryActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            AndroiddevintroTheme {
                // A surface container using the 'background' color from the theme
                Surface(
                    modifier = Modifier.fillMaxSize(),
                    color = MaterialTheme.colorScheme.background
                ) {
                    Flagview()
                }
            }
        }
    }
}

@Composable
fun Flagview() {
    Column(modifier = Modifier.background(Color.White)) {
        Row {
            Box(modifier = Modifier
                .background(Color.Red)
                .fillMaxHeight(0.35f)
                .fillMaxWidth(0.45f)
            ){};
            Box(modifier = Modifier
                .background(Color.White)
                .fillMaxHeight(0.35f)
                .fillMaxWidth(0.2f)
            ){};
            Box(modifier = Modifier
                .background(Color.Red)
                .fillMaxHeight(0.35f)
                .fillMaxWidth()
            ){};

        }
        Row {
            Box(modifier = Modifier
                .background(Color.White)
                .fillMaxHeight(0.08f)
                .fillMaxWidth()
            ){};
        }
        Row {
            Box(modifier = Modifier
                .background(Color.Red)
                .fillMaxHeight()
                .fillMaxWidth(0.45f)
            ){};
            Box(modifier = Modifier
                .background(Color.White)
                .fillMaxHeight()
                .fillMaxWidth(0.2f)
            ){};
            Box(modifier = Modifier
                .background(Color.Red)
                .fillMaxHeight()
                .fillMaxWidth()
            ){};
        }
    }
}

@Preview(showBackground = true)
@Composable
fun FlagviewPreview() {
    AndroiddevintroTheme {
        Flagview()
    }
}