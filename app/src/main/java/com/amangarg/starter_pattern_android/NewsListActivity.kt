package com.amangarg.starter_pattern_android

import android.content.Intent
import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.height
import androidx.compose.material3.Button
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Surface
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.unit.dp
import com.amangarg.starter_pattern_android.ui.theme.StarterPatternAndroidTheme

class NewsListActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            StarterPatternAndroidTheme {
                // A surface container using the 'background' color from the theme
                Surface(
                    modifier = Modifier.fillMaxSize(),
                    color = MaterialTheme.colorScheme.background
                ) {
                    val newsDetailsIntent = Intent(this, NewsDetailsActivity::class.java)
                    newsDetailsIntent.putExtra(IntentConstants.ID, "123")
                    newsDetailsIntent.putExtra(IntentConstants.URL, "www.example.com")

                    val topHeadlinesIntent = Intent(this, TopHeadlinesActivity::class.java)

                    Column {
                        Button(
                            modifier = Modifier.height(32.dp),
                            onClick = { startActivity(newsDetailsIntent) }) {
                            Text(text = "Open News Details")
                        }

                        Button(
                            modifier = Modifier.height(32.dp),
                            onClick = { startActivity(topHeadlinesIntent) }) {
                            Text(text = "Open Top Headlines")
                        }
                    }
                }
            }
        }
    }
}

@Composable
fun Greeting2(name: String, modifier: Modifier = Modifier) {
    Text(
        text = "News List",
        modifier = modifier
    )
}

