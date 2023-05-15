package ktorbackend.masjed.moataz.com.server.routes

import io.ktor.server.application.*
import io.ktor.server.request.*
import io.ktor.server.response.*
import io.ktor.server.routing.*
import ktorbackend.masjed.moataz.com.database.datasource.DataBaseDataSource
import ktorbackend.masjed.moataz.com.database.datasource.models.Masjed
import ktorbackend.masjed.moataz.com.server.response.NotFoundResponse
import ktorbackend.masjed.moataz.com.server.response.SuccessResponse
import org.koin.ktor.ext.inject

fun Route.newMasjedRoute() {
    val masjedDataSource by inject<DataBaseDataSource>()
    post("/addNewMasjed") {
        val masjed = call.receive<Masjed>()
        val isAdded = masjedDataSource.addNewMasjed(masjed)
        val masjeds = masjedDataSource.getAllMasjeds()
        if (isAdded) call.respond(SuccessResponse(data = masjeds, message = "Masjed Added"))
        else call.respond(NotFoundResponse(false, "Masjed Not Added"))
    }
}
