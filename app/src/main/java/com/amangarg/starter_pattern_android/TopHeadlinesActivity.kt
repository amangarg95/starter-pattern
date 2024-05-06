package com.amangarg.starter_pattern_android

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.height
import androidx.compose.material3.Button
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Surface
import androidx.compose.material3.Text
import androidx.compose.ui.Modifier
import androidx.compose.ui.unit.dp
import com.amangarg.starter_pattern_android.ui.theme.StarterPatternAndroidTheme

class TopHeadlinesActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            StarterPatternAndroidTheme {
                // A surface container using the 'background' color from the theme
                Surface(
                    modifier = Modifier.fillMaxSize(),
                    color = MaterialTheme.colorScheme.background
                ) {

                    /*
                    val newsDetailsIntent = Intent(this, NewsDetailsActivity::class.java)
                    newsDetailsIntent.putExtra(IntentConstants.ID, "123")
                    newsDetailsIntent.putExtra(IntentConstants.URL, "www.example.com")
                    newsDetailsIntent.putExtra(IntentConstants.SOURCE, "www.google.com")
                    */

                    val newsDetailsIntent =
                        NewsDetailsActivity().getStartIntent(
                            this,
                            "123",
                            "www.example.com",
                            "www.google.com"
                        )

                    Button(
                        modifier = Modifier.height(32.dp),
                        onClick = { startActivity(newsDetailsIntent) }) {
                        Text(text = "Open News Details")
                    }
                }
            }
        }
    }
}