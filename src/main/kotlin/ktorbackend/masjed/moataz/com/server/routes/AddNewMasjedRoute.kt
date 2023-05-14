package ktorbackend.masjed.moataz.com.server.routes

import io.ktor.server.application.*
import io.ktor.server.request.*
import io.ktor.server.response.*
import io.ktor.server.routing.*
import ktorbackend.masjed.moataz.com.database.datasource.DataBaseDataSource
import ktorbackend.masjed.moataz.com.database.datasource.models.MasjedRequest
import ktorbackend.masjed.moataz.com.server.response.NotFoundResponse
import ktorbackend.masjed.moataz.com.server.response.SuccessResponse
import org.koin.ktor.ext.inject

fun Route.newMasjedRoute() {
    val masjedDataSource by inject<DataBaseDataSource>()
    post("/addNewMasjed") {
        call.receiveParameters().apply {
            val masjedRequest = MasjedRequest(
                get("masjed_name")!!,
                get("masjed_description")!!,
                get("masjed_img")!!,
                get("masjed_worshipers")!!.toInt(),
                get("masjed_imams")!!.toInt(),
                get("masjed_workers")!!.toInt()
            )
            val isAdded = masjedDataSource.addNewMasjed(masjedRequest)
            if (isAdded)
                call.respond(SuccessResponse(data = isAdded, message = "Masjed Added Successfully"))
            else call.respond(NotFoundResponse(false, "Masjed Not Added"))
        }
    }
}