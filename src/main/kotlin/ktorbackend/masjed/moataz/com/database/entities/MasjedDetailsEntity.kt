package ktorbackend.masjed.moataz.com.database.entities

import org.ktorm.entity.Entity

interface MasjedDetailsEntity : Entity<MasjedDetailsEntity> {
    companion object : Entity.Factory<MasjedDetailsEntity>()

    val masjedDetailsId: Int
    val masjedDetailsName: String
    val masjedDetailsDescription: String
    val masjedDetailsImg: String
    val masjedDetailsWorshipers: Int
    val masjedDetailsImams: Int
    val masjedDetailsWorkers: Int
}
