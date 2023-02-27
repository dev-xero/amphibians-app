package dev.xero.amphibians.ui.screens

import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.*
import androidx.compose.material.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.alpha
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

@Composable
fun ErrorScreen(
	modifier: Modifier = Modifier
) {
	Box(
		contentAlignment = Alignment.Center,
		modifier = modifier
			.fillMaxSize()
			.background(color = DeepGreen)
	) {
		Column(
			verticalArrangement = Arrangement.spacedBy(8.dp),
			horizontalAlignment = Alignment.CenterHorizontally,
			modifier = Modifier.padding(horizontal = 16.dp)
		) {
			Image(
				painter = painterResource(id = R.drawable.no_network),
				contentDescription = null,
				modifier = Modifier.size(80.dp)
			)
			
			Text(
				text = stringResource(id = R.string.network_error),
				color = LightPaleGreen,
				fontWeight = FontWeight.Bold,
				fontSize = 20.sp,
				textAlign = TextAlign.Center,
				modifier = Modifier.padding(top = 8.dp)
			)

			Text(
				text = stringResource(id = R.string.suggestion),
				color = LightPaleGreen,
				fontWeight = FontWeight.Medium,
				fontSize = 16.sp,
				textAlign = TextAlign.Center,
				modifier = Modifier.alpha(0.8f)
			)
		}
	}
}

@Preview
@Composable
fun ErrorScreenDefaultPreview() {
	ErrorScreen()
}