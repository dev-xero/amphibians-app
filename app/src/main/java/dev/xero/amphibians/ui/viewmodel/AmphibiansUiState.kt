package dev.xero.amphibians.ui.viewmodel

import dev.xero.amphibians.model.AmphibianData

data class AmphibiansUiState(
	var data: List<AmphibianData> = emptyList()
)
