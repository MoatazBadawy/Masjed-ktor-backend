package ktorbackend.masjed.moataz.com

import com.fasterxml.jackson.databind.SerializationFeature
import io.ktor.serialization.jackson.*
import io.ktor.server.application.*
import io.ktor.server.engine.*
import io.ktor.server.netty.*
import io.ktor.server.plugins.contentnegotiation.*
import ktorbackend.masjed.moataz.com.di.dataBaseDataSourceModule
import ktorbackend.masjed.moataz.com.di.databaseModule
import ktorbackend.masjed.moataz.com.plugins.configureRouting
import org.koin.ktor.plugin.Koin

fun main() {
    embeddedServer(
        Netty,
        port = 8080,
        host = "0.0.0.0",
        module = Application::masjedModule
    ).start(wait = true)
}

fun Application.masjedModule() {
    install(Koin) {
        modules(databaseModule, dataBaseDataSourceModule)
    }
    install(ContentNegotiation) {
        jackson {
            enable(SerializationFeature.INDENT_OUTPUT)
        }
    }
    configureRouting()
}
