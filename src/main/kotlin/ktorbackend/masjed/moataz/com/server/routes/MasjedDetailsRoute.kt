package ktorbackend.masjed.moataz.com.server.routes

import io.ktor.server.application.*
import io.ktor.server.response.*
import io.ktor.server.routing.*
import ktorbackend.masjed.moataz.com.database.datasource.DataBaseDataSource
import ktorbackend.masjed.moataz.com.server.response.notFoundResponse
import org.koin.ktor.ext.inject

fun Route.masjedDetailsRoute() {
    val masjedDataSource by inject<DataBaseDataSource>()
    get("/getMasjedDetails/{id}") {
        val masjedDetails = masjedDataSource.getMasjedDetailsById(call.parameters["id"]!!.toInt())
        if (masjedDetails == null)
            call.notFoundResponse()
        else call.respond(masjedDetails)
    }
}
