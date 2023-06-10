package ktorbackend.masjed.moataz.com.database.entities

import org.ktorm.entity.Entity

interface GalleryEntity: Entity<GalleryEntity> {
    companion object : Entity.Factory<GalleryEntity>()

    val id: Int
    val masjedId: Int
    val imgUrl: String
}
