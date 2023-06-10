package ktorbackend.masjed.moataz.com.database.entities

import org.ktorm.entity.Entity

interface MasjedEntity : Entity<MasjedEntity> {
    companion object : Entity.Factory<MasjedEntity>()

    var id: Int
    var name: String
    var description: String
    var imgUrl: String
}
