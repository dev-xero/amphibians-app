package dev.xero.amphibians.api

import dev.xero.amphibians.model.AmphibianData
import retrofit2.http.GET

interface AmphibiansApiServiceInterface {
	@GET("amphibians")
	suspend fun getAmphibianData():
		List<AmphibianData>
}