package ktorbackend.masjed.moataz.com.database.datasource.models

import com.fasterxml.jackson.annotation.JsonIgnore
import kotlinx.serialization.Serializable

@Serializable
data class Gallery(
    val id: Int,
    @JsonIgnore
    val masjedId: Int,
    val imgUrl: String,
)
