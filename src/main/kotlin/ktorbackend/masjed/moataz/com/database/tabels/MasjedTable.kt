package ktorbackend.masjed.moataz.com.database.tabels

import ktorbackend.masjed.moataz.com.database.entities.MasjedEntity
import org.ktorm.schema.Table
import org.ktorm.schema.int
import org.ktorm.schema.varchar

object MasjedTable : Table<MasjedEntity>("masjed") {
    val masjedId = int("masjed_id").bindTo { it.masjedId }.primaryKey()
    val masjedName = varchar("masjed_name").bindTo { it.masjedName }
    val masjedDescription = varchar("masjed_description").bindTo { it.masjedDescription }
    val masjedImg = varchar("masjed_img").bindTo { it.masjedImg }
}
