package ktorbackend.masjed.moataz.com.database.tabels

import ktorbackend.masjed.moataz.com.database.entities.MasjedDetailsEntity
import org.ktorm.schema.Table
import org.ktorm.schema.int
import org.ktorm.schema.varchar

object MasjedDetailsTable : Table<MasjedDetailsEntity>("masjed_details") {
    val masjedDetailsId = int("masjed_details_id").bindTo { it.masjedDetailsId }.primaryKey()
    val masjedDetailsName = varchar("masjed_details_name").bindTo { it.masjedDetailsName }
    val masjedDetailsDescription = varchar("masjed_details_description").bindTo { it.masjedDetailsDescription }
    val masjedDetailsImg = varchar("masjed_details_img").bindTo { it.masjedDetailsImg }
    val masjedDetailsWorshipers = int("masjed_details_worshipers").bindTo { it.masjedDetailsWorshipers }
    val masjedDetailsImams = int("masjed_details_imams").bindTo { it.masjedDetailsImams }
    val masjedDetailsWorkers = int("masjed_details_workers").bindTo { it.masjedDetailsWorkers }
}
