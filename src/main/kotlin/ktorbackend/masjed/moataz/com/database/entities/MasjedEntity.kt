package ktorbackend.masjed.moataz.com.database.entities

import org.ktorm.entity.Entity

interface MasjedEntity : Entity<MasjedEntity> {
    companion object : Entity.Factory<MasjedEntity>()

    val masjedId: Int
    var masjedName: String
    var masjedDescription: String
    var masjedImg: String
    var masjedWorshipers: Int
    var masjedImams: Int
    var masjedWorkers: Int
}
