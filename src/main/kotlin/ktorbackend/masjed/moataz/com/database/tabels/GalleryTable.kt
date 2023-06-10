package ktorbackend.masjed.moataz.com.database.tabels

import ktorbackend.masjed.moataz.com.database.entities.GalleryEntity
import org.ktorm.schema.Table
import org.ktorm.schema.int
import org.ktorm.schema.varchar

object GalleryTable : Table<GalleryEntity>("gallery") {
    val id = int("id").primaryKey().bindTo { it.id }
    val masjedId = int("masjed_id").bindTo { it.masjedId }
    val imgUrl = varchar("img_url").bindTo { it.imgUrl }
}
