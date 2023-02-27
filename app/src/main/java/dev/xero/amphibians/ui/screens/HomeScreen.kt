package dev.xero.amphibians.ui.screens

import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.lazy.LazyColumn
import androidx.compose.foundation.lazy.items
import androidx.compose.material.Scaffold
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.unit.dp
import dev.xero.amphibians.ui.components.AmphibianInfoCard
import dev.xero.amphibians.ui.components.AppBar
import dev.xero.amphibians.ui.viewmodel.AmphibiansUiState

@Composable
fun HomeScreen(
	modifier: Modifier = Modifier,
	amphibianUiState: AmphibiansUiState.Success
) {

	Scaffold(
		topBar = { AppBar() }
	) { padding ->
		LazyColumn(
		modifier = modifier
			.padding(8.dp),
		verticalArrangement = Arrangement.spacedBy(12.dp)
	) {
			items(items = amphibianUiState.data, key = { item -> item.imgSrc!! }) {
					dataItem -> AmphibianInfoCard(amphibianData = dataItem)
			}
		}
	}
}