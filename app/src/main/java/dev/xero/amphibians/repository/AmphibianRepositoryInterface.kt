package dev.xero.amphibians.repository

import dev.xero.amphibians.model.AmphibianData

interface AmphibianRepositoryInterface {
	suspend fun getAmphibianData():
		List<AmphibianData>
}