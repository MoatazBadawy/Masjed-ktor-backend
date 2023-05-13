package ktorbackend.masjed.moataz.com.database.datasource

import ktorbackend.masjed.moataz.com.database.Masjed
import ktorbackend.masjed.moataz.com.database.MasjedDetails
import ktorbackend.masjed.moataz.com.database.datasource.mapper.toMasjedDetails
import ktorbackend.masjed.moataz.com.database.datasource.mapper.toMasjeds
import ktorbackend.masjed.moataz.com.database.datasource.models.Masjed
import ktorbackend.masjed.moataz.com.database.datasource.models.MasjedDetails
import org.ktorm.database.Database
import org.ktorm.dsl.eq
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

    override suspend fun getMasjedDetailsById(id: Int): MasjedDetails? {
        return database.MasjedDetails.find { masjedDetailsTable ->
            masjedDetailsTable.masjedDetailsId eq id
        }?.toMasjedDetails()
    }
}
