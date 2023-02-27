package dev.xero.amphibians.ui

import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.lazy.LazyColumn
import androidx.compose.material.Scaffold
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import dev.xero.amphibians.ui.components.AppBar

@Composable
fun AmphibiansApp(
	modifier: Modifier = Modifier
) {
	Scaffold(
		topBar = { AppBar() }
	) {
		padding -> LazyColumn(
			modifier = modifier
				.padding(padding)
		) {}
	}
}