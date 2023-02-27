package dev.xero.amphibians.ui

import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.lazy.LazyColumn
import androidx.compose.foundation.lazy.items
import androidx.compose.material.Scaffold
import androidx.compose.runtime.Composable
import androidx.compose.runtime.collectAsState
import androidx.compose.runtime.getValue
import androidx.compose.ui.Modifier
import androidx.compose.ui.unit.dp
import androidx.lifecycle.viewmodel.compose.viewModel
import dev.xero.amphibians.ui.components.AmphibianInfoCard
import dev.xero.amphibians.ui.components.AppBar
import dev.xero.amphibians.ui.viewmodel.AmphibiansViewModel

@Composable
fun AmphibiansApp(
	modifier: Modifier = Modifier
) {
	val viewModel: AmphibiansViewModel = viewModel()
	val uiState by viewModel.uiState.collectAsState()

	Scaffold(
		topBar = { AppBar() }
	) {
		 padding -> LazyColumn(
			modifier = modifier
				.padding(8.dp),
			verticalArrangement = Arrangement.spacedBy(12.dp)
		) {
			items(items = uiState.data, key = { item -> item.id }) {
				dataItem -> AmphibianInfoCard(amphibianData = dataItem)
			}
		}
	}
}