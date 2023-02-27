package dev.xero.amphibians.ui.viewmodel

import dev.xero.amphibians.model.AmphibianData

data class AmphibiansUiState(
	val data: List<AmphibianData> = emptyList()
)
