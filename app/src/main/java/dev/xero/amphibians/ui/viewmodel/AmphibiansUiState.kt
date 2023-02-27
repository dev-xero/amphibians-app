package dev.xero.amphibians.ui.viewmodel

import dev.xero.amphibians.model.AmphibianData

sealed interface AmphibiansUiState {
	object Loading : AmphibiansUiState {
		val loadingMsg: String = "Loading Data"
	}

	object Failure : AmphibiansUiState {
		val errorMsg: String = "Failed to Load Data, Check Your Connection"
	}

	data class Success(
		val data: List<AmphibianData>
	) : AmphibiansUiState
}
