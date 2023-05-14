package ktorbackend.masjed.moataz.com.server.routes

import io.ktor.server.application.*
import io.ktor.server.request.*
import io.ktor.server.response.*
import io.ktor.server.routing.*
import ktorbackend.masjed.moataz.com.database.datasource.DataBaseDataSource
import ktorbackend.masjed.moataz.com.database.datasource.models.Masjed
import org.koin.ktor.ext.inject

fun Route.newMasjedRoute() {
    val masjedDataSource by inject<DataBaseDataSource>()
    post("/addNewMasjed") {
        val masjed = call.receive<Masjed>()
        val isAdded = masjedDataSource.addNewMasjed(masjed)
        if (isAdded) call.respond("Added Successfully")
        else call.respond("Error Happened")
    }
}
