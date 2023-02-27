package dev.xero.amphibians.di

import com.jakewharton.retrofit2.converter.kotlinx.serialization.asConverterFactory
import dev.xero.amphibians.api.AmphibiansApiServiceInterface
import dev.xero.amphibians.repository.AmphibianRepositoryImplementation
import kotlinx.serialization.ExperimentalSerializationApi
import kotlinx.serialization.json.Json
import okhttp3.MediaType.Companion.toMediaType
import retrofit2.Retrofit

interface AppContainerInterface {
	val amphibiansRepository: AmphibianRepositoryImplementation
}

class AppContainer : AppContainerInterface {
	private val BASE_URL = "https://android-kotlin-fun-mars-server.appspot.com"

	// SETUP OUR RETROFIT INSTANCE
	@OptIn(ExperimentalSerializationApi::class)
	private val retrofit: Retrofit = Retrofit
		.Builder()
		.addConverterFactory(Json.asConverterFactory("application/json".toMediaType()))
		.baseUrl(BASE_URL)
		.build()

	// LAZY INITIALIZATION
	private val apiService: AmphibiansApiServiceInterface by lazy {
		retrofit.create(AmphibiansApiServiceInterface::class.java)
	}

	// PASS THE API SERVICE TO THE REPOSITORY
	override val amphibiansRepository: AmphibianRepositoryImplementation by lazy {
		AmphibianRepositoryImplementation(apiService)
	}
}