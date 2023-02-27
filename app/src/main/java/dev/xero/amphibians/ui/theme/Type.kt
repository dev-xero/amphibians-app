package dev.xero.amphibians.ui.theme

import androidx.compose.material.Typography
import androidx.compose.ui.text.TextStyle
import androidx.compose.ui.text.font.Font
import androidx.compose.ui.text.font.FontFamily
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.unit.sp
import dev.xero.amphibians.R

val IBMPlexSans = FontFamily(
	Font(
		resId = R.font.ibm_plex_sans_bold,
		weight = FontWeight.Bold
	),

	Font(
		resId = R.font.ibm_plex_sans_medium,
		weight = FontWeight.Medium
	)
)

val Typography = Typography(
	body1 = TextStyle(
		fontFamily = IBMPlexSans,
		fontWeight = FontWeight.Normal,
		fontSize = 14.sp
	),

	h3 = TextStyle(
		fontFamily = IBMPlexSans,
		fontWeight = FontWeight.Bold,
		fontSize = 24.sp
	)
)