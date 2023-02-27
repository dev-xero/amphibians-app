package dev.xero.amphibians.ui.viewmodel

import androidx.lifecycle.ViewModel
import dev.xero.amphibians.model.AmphibianData
import kotlinx.coroutines.flow.MutableStateFlow
import kotlinx.coroutines.flow.StateFlow
import kotlinx.coroutines.flow.asStateFlow

class AmphibiansViewModel : ViewModel() {

	private val _uiState = MutableStateFlow(AmphibiansUiState())
	val uiState: StateFlow<AmphibiansUiState> = _uiState.asStateFlow()

	/*TODO: REMOVE THIS LATER, TESTING WITH FAKES*/
	init {
		val fakeData = listOf(
			AmphibianData(
				id = 1,
				name = "Amphibian 01",
				description = "Description on amphibian 01"
			),
			AmphibianData(
				id = 2,
				name = "Amphibian 02",
				description = "Description on amphibian 02"
			),
			AmphibianData(
				id = 3,
				name = "Amphibian 03",
				description = "Description on amphibian 03"
			)
		)

		_uiState.value.data = fakeData

	}
}