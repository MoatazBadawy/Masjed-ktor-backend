package ktorbackend.masjed.moataz.com.server.routes

import io.ktor.server.application.*
import io.ktor.server.response.*
import io.ktor.server.routing.*
import ktorbackend.masjed.moataz.com.database.datasource.DataBaseDataSource
import ktorbackend.masjed.moataz.com.server.response.NotFoundResponse
import ktorbackend.masjed.moataz.com.server.response.SuccessResponse
import org.koin.ktor.ext.inject

fun Route.masjedDetailsRoute() {
    val masjedDataSource by inject<DataBaseDataSource>()
    get("/getMasjedDetails/{id}") {
        val masjedDetails = masjedDataSource.getMasjedDetailsById(call.parameters["id"]!!.toInt())
        if (masjedDetails == null)
            call.respond(NotFoundResponse(false, "No Masjed Found"))
        else call.respond(SuccessResponse(data = masjedDetails, message = "Masjed Found"))
    }
}
