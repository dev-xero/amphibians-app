package dev.xero.amphibians.ui.screens

import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.*
import androidx.compose.material.Text
import androidx.compose.runtime.*
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.rotate
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.res.stringResource
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import dev.xero.amphibians.R
import dev.xero.amphibians.ui.theme.DeepGreen
import dev.xero.amphibians.ui.theme.LightPaleGreen
import kotlinx.coroutines.delay

@Composable
fun LoadingScreen(
	modifier: Modifier = Modifier
) {
	Box(
		modifier = modifier
			.fillMaxSize()
			.background(color = DeepGreen),
		contentAlignment = Alignment.Center
	) {
		var rotateAnimationState by remember { mutableStateOf(0f) }

		LaunchedEffect(Unit) {
			while (true) {
				delay(100)
				rotateAnimationState = (rotateAnimationState + 50f) % 360f
			}
		}

		Column(
			horizontalAlignment = Alignment.CenterHorizontally,
			verticalArrangement = Arrangement.spacedBy(4.dp)
		) {
			Image(
				painter = painterResource(id = R.drawable.spinner),
				contentDescription = null,
				modifier = Modifier.rotate(rotateAnimationState)
			)

			Text(
				text = stringResource(id = R.string.loading),
				color = LightPaleGreen,
				fontWeight = FontWeight.Bold,
				fontSize = 20.sp,
				textAlign = TextAlign.Center,
				modifier = Modifier.padding(top = 8.dp)
			)
		}
	}
}

@Preview
@Composable
fun LoadingScreenDefaultPreview() {
	LoadingScreen()
}