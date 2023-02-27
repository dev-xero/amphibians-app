package dev.xero.amphibians.model

import kotlinx.serialization.SerialName
import kotlinx.serialization.Serializable

@Serializable
data class AmphibianData(
	val id: Int,
	val name: String?,
	val description: String?,
	@SerialName("img_src") val imgSrc: String?
)
