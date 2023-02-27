package dev.xero.amphibians.ui.theme

import androidx.compose.material.MaterialTheme
import androidx.compose.material.darkColors
import androidx.compose.runtime.Composable

private val ColorPalette = darkColors(
	primary = DeepGreen,
	primaryVariant = MudGreen,
	secondary = DeepBlue,
	background = PaleGreen,
	onSurface = LightPaleGreen
)


@Composable
fun AmphibiansTheme(content: @Composable () -> Unit) {
	val colors = ColorPalette

	MaterialTheme(
		colors = colors,
		typography = Typography,
		shapes = Shapes,
		content = content
	)
}