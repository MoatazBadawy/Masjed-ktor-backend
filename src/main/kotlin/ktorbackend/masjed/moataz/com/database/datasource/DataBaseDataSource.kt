package ktorbackend.masjed.moataz.com.database.datasource

import ktorbackend.masjed.moataz.com.database.datasource.models.Masjed
import ktorbackend.masjed.moataz.com.database.datasource.models.MasjedDetails

interface DataBaseDataSource {
    suspend fun getAllMasjeds(): List<Masjed>
    suspend fun getMasjedDetailsById(id: Int): MasjedDetails?
}
