package ktorbackend.masjed.moataz.com.di

import com.zaxxer.hikari.HikariConfig
import com.zaxxer.hikari.HikariDataSource
import ktorbackend.masjed.moataz.com.di.utils.DatabaseConstant
import org.koin.dsl.module
import org.ktorm.database.Database
import java.util.concurrent.TimeUnit

val databaseModule = module {
    single {
        val config = HikariConfig().apply {
            jdbcUrl = DatabaseConstant.MASJED_DATABASE_URL
            driverClassName = DatabaseConstant.MASJED_DATABASE_DRIVER
            username = DatabaseConstant.MASJED_DATABASE_USER
            password = DatabaseConstant.MASJED_DATABASE_PASSWORD
            maximumPoolSize = 5 // the maximum number of connections in the pool
            idleTimeout = TimeUnit.MINUTES.toMillis(10) // the maximum time a connection can sit idle in the pool
        }
        Database.connect(HikariDataSource(config))
    }
}
