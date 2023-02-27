package dev.xero.amphibians

import android.app.Application
import dev.xero.amphibians.di.AppContainer
import dev.xero.amphibians.di.AppContainerInterface

class AmphibiansApplication : Application() {
	lateinit var container: AppContainerInterface
	override fun onCreate() {
		super.onCreate()
		container = AppContainer()
	}
}