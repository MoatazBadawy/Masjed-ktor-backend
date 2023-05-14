package ktorbackend.masjed.moataz.com.server.response

import io.ktor.http.*
import io.ktor.server.application.*
import io.ktor.server.response.*

suspend fun ApplicationCall.notFoundResponse() {
    return respond(
        status = HttpStatusCode.NotFound,
        message = "No Masjeds Found"
    )
}