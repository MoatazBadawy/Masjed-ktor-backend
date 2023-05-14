package ktorbackend.masjed.moataz.com.server.routes

import io.ktor.server.application.*
import io.ktor.server.response.*
import io.ktor.server.routing.*
import ktorbackend.masjed.moataz.com.database.datasource.DataBaseDataSource
import ktorbackend.masjed.moataz.com.server.response.NotFoundResponse
import ktorbackend.masjed.moataz.com.server.response.SuccessResponse
import org.koin.ktor.ext.inject

fun Route.masjedRoute() {
    val masjedDataSource by inject<DataBaseDataSource>()
    get("/getMasjeds") {
        val masjeds = masjedDataSource.getAllMasjeds()
        if (masjeds.isEmpty())
            call.respond(NotFoundResponse(false, "No Masjeds Found"))
        else call.respond(SuccessResponse(data = masjeds, message = "Masjeds Found"))
    }
}
