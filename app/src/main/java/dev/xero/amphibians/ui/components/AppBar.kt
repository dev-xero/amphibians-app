package dev.xero.amphibians.ui.components

import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.padding
import androidx.compose.material.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.res.stringResource
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import dev.xero.amphibians.R
import dev.xero.amphibians.ui.theme.DeepGreen
import dev.xero.amphibians.ui.theme.LightPaleGreen

@Composable
fun AppBar(
	modifier: Modifier = Modifier
) {
	Row(
		modifier = modifier
			.background(DeepGreen)
			.fillMaxWidth()
	) {
		Text(
			text = stringResource(id = R.string.app_name),
			fontWeight = FontWeight.Bold,
			fontSize = 32.sp,
			color = LightPaleGreen,
			modifier = Modifier
				.padding(
					horizontal = 12.dp,
					vertical = 16.dp
				)
		)
	}
}

@Preview
@Composable
fun DefaultAppBarPreview() {
	AppBar()
}