package com.amangarg.starter_pattern_android

import android.content.Context
import android.content.Intent
import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Surface
import androidx.compose.material3.Text
import androidx.compose.ui.Modifier
import com.amangarg.starter_pattern_android.IntentConstants.ID
import com.amangarg.starter_pattern_android.IntentConstants.SOURCE
import com.amangarg.starter_pattern_android.IntentConstants.URL
import com.amangarg.starter_pattern_android.ui.theme.StarterPatternAndroidTheme

class NewsDetailsActivity : ComponentActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            StarterPatternAndroidTheme {
                // A surface container using the 'background' color from the theme
                Surface(
                    modifier = Modifier.fillMaxSize(),
                    color = MaterialTheme.colorScheme.background
                ) {
                    val id = intent.getStringExtra(ID)
                    val url = intent.getStringExtra(URL)
                    val source = intent.getStringExtra(SOURCE)

                    Column {
                        Text(text = id.toString())
                        Text(text = url.toString())
                        Text(text = "Source: $source")
                    }

                }
            }
        }
    }

    fun getStartIntent(context: Context, id: String, url: String, source: String): Intent {
        val intent = Intent(context, NewsDetailsActivity::class.java)
        intent.putExtra(ID, id)
        intent.putExtra(URL, url)
        intent.putExtra(SOURCE, source)
        return intent
    }
}