package ktorbackend.masjed.moataz.com.database.datasource

import ktorbackend.masjed.moataz.com.database.Gallery
import ktorbackend.masjed.moataz.com.database.Masjed
import ktorbackend.masjed.moataz.com.database.MasjedDetails
import ktorbackend.masjed.moataz.com.database.datasource.mapper.toGalleries
import ktorbackend.masjed.moataz.com.database.datasource.mapper.toMasjedDetails
import ktorbackend.masjed.moataz.com.database.datasource.mapper.toMasjedEntity
import ktorbackend.masjed.moataz.com.database.datasource.mapper.toMasjeds
import ktorbackend.masjed.moataz.com.database.datasource.models.Masjed
import ktorbackend.masjed.moataz.com.database.datasource.models.MasjedDetails
import org.ktorm.database.Database
import org.ktorm.dsl.eq
import org.ktorm.entity.*

class DataBaseDataSourceImpl(
    private val database: Database
) : DataBaseDataSource {
    override suspend fun getAllMasjeds(): List<Masjed> {
        return database.Masjed.map { masjedEntity ->
            masjedEntity
        }.toMasjeds()
    }

    override suspend fun getMasjedDetailsById(id: Int): MasjedDetails? {
        val masjedDetailsEntity = database.MasjedDetails
            .filter { it.masjedId eq id }
            .singleOrNull()

        return masjedDetailsEntity?.let { entity ->
            val gallery = database.Gallery
                .filter { it.masjedId eq entity.masjedId }
                .toList()
                .toGalleries()

            entity.toMasjedDetails(gallery)
        }
    }

    override suspend fun addNewMasjed(masjed: Masjed): Boolean {
        return database.Masjed.add(masjed.toMasjedEntity()) > 0
    }
}
