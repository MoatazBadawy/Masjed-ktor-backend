package ktorbackend.masjed.moataz.com.database.datasource.models

import kotlinx.serialization.SerialName
import kotlinx.serialization.Serializable

@Serializable
data class MasjedRequest(
    @SerialName("masjed_name")
    val masjedName: String,
    @SerialName("masjed_description")
    val masjedDescription: String,
    @SerialName("masjed_img")
    val masjedImg: String,
    @SerialName("masjed_worshipers")
    val masjedWorshipers: Int,
    @SerialName("masjed_imams")
    val masjedImams: Int,
    @SerialName("masjed_workers")
    val masjedWorkers: Int
)
