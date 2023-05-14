package ktorbackend.masjed.moataz.com.server.response

import com.fasterxml.jackson.annotation.JsonIgnore
import com.fasterxml.jackson.databind.annotation.JsonSerialize
import io.ktor.http.*

@JsonSerialize
data class SuccessResponse<T>(
    val status: Boolean = true,
    val data: T? = null,
    val message: String = "",
    @JsonIgnore
    val statusCode: HttpStatusCode = HttpStatusCode.OK,
)
