package dev.xero.amphibians.ui

import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.lifecycle.viewmodel.compose.viewModel
import dev.xero.amphibians.ui.screens.HomeScreen
import dev.xero.amphibians.ui.viewmodel.AmphibiansUiState
import dev.xero.amphibians.ui.viewmodel.AmphibiansViewModel

@Composable
fun AmphibiansApp(
	modifier: Modifier = Modifier
) {
	val viewModel: AmphibiansViewModel = viewModel(factory = AmphibiansViewModel.Factory)

	when (val uiState = viewModel.uiState) {
		is AmphibiansUiState.Success -> HomeScreen(amphibianUiState = uiState)
		is AmphibiansUiState.Loading -> {}
		is AmphibiansUiState.Failure -> {}
	}
}