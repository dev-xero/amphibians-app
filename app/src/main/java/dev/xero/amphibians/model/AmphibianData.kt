package dev.xero.amphibians.model

import androidx.annotation.DrawableRes

data class AmphibianData(
	val title: String?,
	val content: String?,
	/*TODO: CHANGE THIS TO STRING LATER*/
	@DrawableRes val imgSrc: Int? = null
)
