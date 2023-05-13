package ktorbackend.masjed.moataz.com.database

import ktorbackend.masjed.moataz.com.database.tabels.MasjedDetailsTable
import ktorbackend.masjed.moataz.com.database.tabels.MasjedTable
import org.ktorm.database.Database
import org.ktorm.entity.sequenceOf

val Database.Masjed get() = this.sequenceOf(MasjedTable)

val Database.MasjedDetails get() = this.sequenceOf(MasjedDetailsTable)
