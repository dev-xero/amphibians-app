package dev.xero.amphibians.ui.viewmodel

import android.util.Log
import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.setValue
import androidx.lifecycle.ViewModel
import androidx.lifecycle.ViewModelProvider
import androidx.lifecycle.ViewModelProvider.AndroidViewModelFactory.Companion.APPLICATION_KEY
import androidx.lifecycle.viewModelScope
import androidx.lifecycle.viewmodel.initializer
import androidx.lifecycle.viewmodel.viewModelFactory
import dev.xero.amphibians.AmphibiansApplication
import dev.xero.amphibians.model.AmphibianData
import dev.xero.amphibians.repository.AmphibianRepositoryImplementation
import kotlinx.coroutines.launch
import okio.IOException

class AmphibiansViewModel(
	private val amphibiansRepository: AmphibianRepositoryImplementation
) : ViewModel() {

	private val TAG = "APP"

	var _uiState: AmphibiansUiState by mutableStateOf(AmphibiansUiState.Loading)
		private set

	// ATTEMPT TO FETCH THE DATA
	init {
		getAmphibians()
	}

	 private fun getAmphibians() {
		 viewModelScope.launch {
			 _uiState = try {
				 AmphibiansUiState.Success(data = amphibiansRepository.getAmphibianData())
			 } catch (e: IOException) {
				 Log.d(TAG, e.toString())
				 AmphibiansUiState.Failure
			 }
		 }
	}


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