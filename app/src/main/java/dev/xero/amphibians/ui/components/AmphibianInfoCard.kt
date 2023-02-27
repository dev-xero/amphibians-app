package dev.xero.amphibians.ui.components

import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.*
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material.Card
import androidx.compose.material.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.res.stringResource
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import dev.xero.amphibians.model.AmphibianData
import dev.xero.amphibians.ui.theme.DeepBlue
import dev.xero.amphibians.R
import dev.xero.amphibians.ui.theme.MudGreen
import dev.xero.amphibians.ui.theme.LightGreen

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

		/*TODO: CHANGE THIS LATER WHEN USING ASYNC IMAGE()*/
		val imageRes = amphibianData.imgSrc ?: R.drawable.image_not_found

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
						text = amphibianData.title ?: "No Title",
						fontSize = 22.sp,
						fontWeight = FontWeight.Bold,
						modifier = Modifier.padding(bottom = 4.dp),
						color = MudGreen
					)
					Text(
						text = amphibianData.content ?: "No Description",
						fontSize = 16.sp,
						fontWeight = FontWeight.Bold,
						modifier = Modifier.padding(bottom = 8.dp),
						color = DeepBlue
					)
				}
			}

			/*TODO: CHANGE THIS TO ASYNC IMAGE()*/
			Image(
				painter = painterResource(id = imageRes),
				contentDescription = stringResource(id = R.string.image_not_found),
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
		id = 0,
		title = "Title",
		content = "Description"
	))
}