package ktorbackend.masjed.moataz.com.plugins

import io.ktor.server.application.*
import io.ktor.server.routing.*
import ktorbackend.masjed.moataz.com.server.routes.masjedDetailsRoute
import ktorbackend.masjed.moataz.com.server.routes.masjedRoute

fun Application.configureRouting() {
    routing {
        masjedRoute()
        masjedDetailsRoute()
    }
}
