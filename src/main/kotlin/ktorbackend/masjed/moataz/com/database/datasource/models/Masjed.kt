package ktorbackend.masjed.moataz.com.database.datasource.models

import kotlinx.serialization.SerialName
import kotlinx.serialization.Serializable

@Serializable
data class Masjed(
    val id: Int,
    val name: String,
    val description: String,
    val imgUrl: String,
)
