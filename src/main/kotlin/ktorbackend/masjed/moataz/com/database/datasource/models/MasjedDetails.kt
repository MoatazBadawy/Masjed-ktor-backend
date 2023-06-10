package ktorbackend.masjed.moataz.com.database.datasource.models

import com.fasterxml.jackson.annotation.JsonIgnore
import kotlinx.serialization.Serializable

@Serializable
data class MasjedDetails(
    val id: Int,
    @JsonIgnore
    val masjedId: Int,
    val name: String,
    val description: String,
    val imgUrl: String,
    val address: String,
    val siteArea: Int,
    val minarets: Int,
    val worshipers: Int,
    val imams: Int,
    val workers: Int,
    val gallery: List<Gallery>,
)
