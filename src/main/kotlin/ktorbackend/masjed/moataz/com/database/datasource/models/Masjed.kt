package ktorbackend.masjed.moataz.com.database.datasource.models

import kotlinx.serialization.SerialName
import kotlinx.serialization.Serializable

@Serializable
data class Masjed(
    @SerialName("masjed_id")
    val masjedId: Int,
    @SerialName("masjed_name")
    val masjedName: String,
    @SerialName("masjed_description")
    val masjedDescription: String,
    @SerialName("masjed_img")
    val masjedImg: String
)
