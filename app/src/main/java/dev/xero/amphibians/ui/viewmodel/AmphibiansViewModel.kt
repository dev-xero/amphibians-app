package dev.xero.amphibians.ui.viewmodel

import androidx.lifecycle.ViewModel
import androidx.lifecycle.ViewModelProvider
import androidx.lifecycle.ViewModelProvider.AndroidViewModelFactory.Companion.APPLICATION_KEY
import androidx.lifecycle.viewmodel.initializer
import androidx.lifecycle.viewmodel.viewModelFactory
import dev.xero.amphibians.AmphibiansApplication
import dev.xero.amphibians.model.AmphibianData
import dev.xero.amphibians.repository.AmphibianRepositoryImplementation
import kotlinx.coroutines.flow.MutableStateFlow
import kotlinx.coroutines.flow.StateFlow
import kotlinx.coroutines.flow.asStateFlow

class AmphibiansViewModel(
	private val amphibiansRepository: AmphibianRepositoryImplementation
) : ViewModel() {

	private val _uiState = MutableStateFlow(AmphibiansUiState())
	val uiState: StateFlow<AmphibiansUiState> = _uiState.asStateFlow()

	// Factory for the viewModel
	companion object {
		val Factory: ViewModelProvider.Factory = viewModelFactory {
			initializer {
				val application = (this[APPLICATION_KEY] as AmphibiansApplication)
				val amphibiansRepository = application.container.amphibiansRepository
				AmphibiansViewModel(amphibiansRepository = amphibiansRepository)
			}
		}
	}
}