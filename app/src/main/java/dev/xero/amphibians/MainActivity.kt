package dev.xero.amphibians

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.runtime.Composable
import androidx.compose.ui.tooling.preview.Preview
import dev.xero.amphibians.ui.AmphibiansApp
import dev.xero.amphibians.ui.theme.AmphibiansTheme

class MainActivity : ComponentActivity() {
	override fun onCreate(savedInstanceState: Bundle?) {
		super.onCreate(savedInstanceState)
		setContent {
			AmphibiansTheme {
				AmphibiansApp()
			}
		}
	}
}

@Preview
@Composable
fun DefaultPreview() {
	AmphibiansTheme {
		AmphibiansApp()
	}
}