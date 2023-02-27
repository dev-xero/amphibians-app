package dev.xero.amphibians.ui.components

import androidx.compose.foundation.background
import androidx.compose.foundation.layout.*
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material.Card
import androidx.compose.material.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.platform.LocalContext
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import coil.compose.AsyncImage
import coil.request.ImageRequest
import dev.xero.amphibians.model.AmphibianData
import dev.xero.amphibians.R
import dev.xero.amphibians.ui.theme.*

@Composable
fun AmphibianInfoCard(
	modifier: Modifier = Modifier,
	amphibianData: AmphibianData
) {
	Card(
		modifier = modifier
			.fillMaxWidth()
			.clip(shape = RoundedCornerShape(12.dp)),
		elevation = 2.dp
	) {

		Column(modifier = Modifier.fillMaxWidth()) {
			// Info Card Row
			Row(
				modifier = Modifier
					.fillMaxWidth()
					.background(color = LightGreen)
			) {
				Column(
					modifier = Modifier.padding(12.dp)
				) {
					Text(
						text = amphibianData.name ?: "No Title",
						fontSize = 22.sp,
						fontWeight = FontWeight.Bold,
						modifier = Modifier.padding(bottom = 4.dp),
						color = DeepGreen
					)
					Text(
						text = amphibianData.type ?: "Unknown",
						fontSize = 16.sp,
						fontWeight = FontWeight.Bold,
						modifier = Modifier.padding(bottom = 4.dp),
						color = MudGreen
					)
					Text(
						text = amphibianData.description ?: "No Description",
						fontSize = 14.sp,
						fontWeight = FontWeight.Medium,
						modifier = Modifier.padding(bottom = 8.dp),
						color = DeepBlue
					)
				}
			}

			AsyncImage(
				model = ImageRequest.Builder(context = LocalContext.current)
					.data(amphibianData.imgSrc)
					.crossfade(enable = true)
					.error(R.drawable.image_not_found)
					.placeholder(R.drawable.loading_img)
					.build(),
				contentDescription = "card_img",
				contentScale = ContentScale.FillWidth,
				modifier = Modifier.fillMaxWidth()
			)
		}
	}
}

@Preview
@Composable
fun AmphibianCardInfoDefaultPreview() {
	AmphibianInfoCard(amphibianData = AmphibianData(
		name = "Title",
		description = "Description",
		type = "Type",
		imgSrc = ""
	))
}