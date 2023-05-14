package ktorbackend.masjed.moataz.com.database.datasource

import ktorbackend.masjed.moataz.com.database.Masjed
import ktorbackend.masjed.moataz.com.database.datasource.mapper.toMasjed
import ktorbackend.masjed.moataz.com.database.datasource.mapper.toMasjedEntity
import ktorbackend.masjed.moataz.com.database.datasource.mapper.toMasjeds
import ktorbackend.masjed.moataz.com.database.datasource.models.Masjed
import ktorbackend.masjed.moataz.com.database.datasource.models.MasjedRequest
import org.ktorm.database.Database
import org.ktorm.dsl.eq
import org.ktorm.entity.add
import org.ktorm.entity.find
import org.ktorm.entity.map

class DataBaseDataSourceImpl(
    private val database: Database
) : DataBaseDataSource {
    override suspend fun getAllMasjeds(): List<Masjed> {
        return database.Masjed.map { masjedEntity ->
            masjedEntity
        }.toMasjeds()
    }

    override suspend fun getMasjedDetailsById(id: Int): Masjed? {
        return database.Masjed.find { masjedTable ->
            masjedTable.masjedId eq id
        }?.toMasjed()
    }

    override suspend fun addNewMasjed(masjed: MasjedRequest): Boolean {
        return database.Masjed.add(masjed.toMasjedEntity()) > 0
    }
}
