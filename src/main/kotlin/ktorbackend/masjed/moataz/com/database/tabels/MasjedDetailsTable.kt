package ktorbackend.masjed.moataz.com.database.tabels

import ktorbackend.masjed.moataz.com.database.entities.MasjedDetailsEntity
import org.ktorm.schema.Table
import org.ktorm.schema.int
import org.ktorm.schema.text
import org.ktorm.schema.varchar

object MasjedDetailsTable: Table<MasjedDetailsEntity>("masjed_details") {
    val id = int("id").primaryKey().bindTo { it.id }
    val masjedId = int("masjed_id").bindTo { it.masjedId }
    val name = varchar("name").bindTo { it.name }
    val description = text("description").bindTo { it.description }
    val imgUrl = varchar("img_url").bindTo { it.imgUrl }
    val address = varchar("address").bindTo { it.address }
    val siteArea = int("site_area").bindTo { it.siteArea }
    val minarets = int("minarets").bindTo { it.minarets }
    val worshipers = int("worshipers").bindTo { it.worshipers }
    val imams = int("imams").bindTo { it.imams }
    val workers = int("workers").bindTo { it.workers }
}
