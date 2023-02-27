package dev.xero.amphibians.ui.viewmodel

import androidx.lifecycle.ViewModel
import kotlinx.coroutines.flow.MutableStateFlow
import kotlinx.coroutines.flow.StateFlow
import kotlinx.coroutines.flow.asStateFlow

class AmphibiansViewModel : ViewModel() {

	private val _uiState = MutableStateFlow(AmphibiansUiState())
	val uiStateFlow: StateFlow<AmphibiansUiState> = _uiState.asStateFlow()

}