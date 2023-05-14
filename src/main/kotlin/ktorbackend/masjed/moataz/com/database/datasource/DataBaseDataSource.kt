package ktorbackend.masjed.moataz.com.database.datasource

import ktorbackend.masjed.moataz.com.database.datasource.models.Masjed

interface DataBaseDataSource {
    suspend fun getAllMasjeds(): List<Masjed>
    suspend fun getMasjedDetailsById(id: Int): Masjed?
}
