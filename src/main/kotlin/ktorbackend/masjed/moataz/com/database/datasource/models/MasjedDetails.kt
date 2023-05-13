package ktorbackend.masjed.moataz.com.database.datasource.models

import kotlinx.serialization.SerialName
import kotlinx.serialization.Serializable

@Serializable
data class MasjedDetails(
    @SerialName("masjed_details_id")
    val masjedDetailsId: Int,
    @SerialName("masjed_details_name")
    val masjedDetailsName: String,
    @SerialName("masjed_details_description")
    val masjedDetailsDescription: String,
    @SerialName("masjed_details_img")
    val masjedDetailsImg: String,
    @SerialName("masjed_details_worshipers")
    val masjedDetailsWorshipers: Int,
    @SerialName("masjed_details_imams")
    val masjedDetailsImams: Int,
    @SerialName("masjed_details_workers")
    val masjedDetailsWorkers: Int
)
