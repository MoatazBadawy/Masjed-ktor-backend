package ktorbackend.masjed.moataz.com.database.datasource.mapper

import ktorbackend.masjed.moataz.com.database.datasource.models.Masjed
import ktorbackend.masjed.moataz.com.database.datasource.models.MasjedDetails
import ktorbackend.masjed.moataz.com.database.entities.MasjedDetailsEntity
import ktorbackend.masjed.moataz.com.database.entities.MasjedEntity

fun List<MasjedEntity>.toMasjeds(): List<Masjed> {
    return map { it.toMasjed() }
}

fun MasjedEntity.toMasjed(): Masjed {
    return Masjed(
        masjedId = masjedId,
        masjedName = masjedName,
        masjedDescription = masjedDescription,
        masjedImg = masjedImg
    )
}

fun MasjedDetailsEntity.toMasjedDetails(): MasjedDetails {
    return MasjedDetails(
        masjedDetailsId = masjedDetailsId,
        masjedDetailsName = masjedDetailsName,
        masjedDetailsDescription = masjedDetailsDescription,
        masjedDetailsImg = masjedDetailsImg,
        masjedDetailsWorshipers = masjedDetailsWorshipers,
        masjedDetailsImams = masjedDetailsImams,
        masjedDetailsWorkers = masjedDetailsWorkers
    )
}