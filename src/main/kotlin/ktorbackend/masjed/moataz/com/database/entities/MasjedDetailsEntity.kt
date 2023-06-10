package ktorbackend.masjed.moataz.com.database.entities

import org.ktorm.entity.Entity

interface MasjedDetailsEntity : Entity<MasjedDetailsEntity> {
    companion object : Entity.Factory<MasjedDetailsEntity>()

    val id: Int
    val masjedId: Int
    val name: String
    val description: String
    val imgUrl: String
    val address: String
    val siteArea: Int
    val minarets: Int
    val worshipers: Int
    val imams: Int
    val workers: Int
}
