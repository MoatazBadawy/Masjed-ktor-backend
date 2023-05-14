package ktorbackend.masjed.moataz.com.database.entities

import org.ktorm.entity.Entity

interface MasjedEntity : Entity<MasjedEntity> {
    companion object : Entity.Factory<MasjedEntity>()

    val masjedId: Int
    val masjedName: String
    val masjedDescription: String
    val masjedImg: String
    val masjedWorshipers: Int
    val masjedImams: Int
    val masjedWorkers: Int
}
