package dev.xero.amphibians.repository

import dev.xero.amphibians.api.AmphibiansApiServiceInterface
import dev.xero.amphibians.model.AmphibianData

class AmphibianRepositoryImplementation(
	private val amphibiansApiService: AmphibiansApiServiceInterface
) : AmphibianRepositoryInterface {
	override suspend fun getAmphibianData(): List<AmphibianData> = amphibiansApiService.getAmphibianData()
}