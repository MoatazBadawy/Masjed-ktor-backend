package ktorbackend.masjed.moataz.com.database.datasource.mapper

import ktorbackend.masjed.moataz.com.database.datasource.models.Gallery
import ktorbackend.masjed.moataz.com.database.datasource.models.Masjed
import ktorbackend.masjed.moataz.com.database.datasource.models.MasjedDetails
import ktorbackend.masjed.moataz.com.database.entities.GalleryEntity
import ktorbackend.masjed.moataz.com.database.entities.MasjedDetailsEntity
import ktorbackend.masjed.moataz.com.database.entities.MasjedEntity

/**
 * Map MasjedEntity to Masjed
 */
fun List<MasjedEntity>.toMasjeds(): List<Masjed> {
    return map { it.toMasjed() }
}

fun MasjedEntity.toMasjed(): Masjed {
    return Masjed(
        id = id,
        name = name,
        description = description,
        imgUrl = imgUrl
    )
}

fun Masjed.toMasjedEntity(): MasjedEntity {
    return MasjedEntity {
        id = this@toMasjedEntity.id
        name = this@toMasjedEntity.name
        description = this@toMasjedEntity.description
        imgUrl = this@toMasjedEntity.imgUrl
    }
}

/**
 * Map MasjedDetailsEntity to MasjedDetails
 */
fun MasjedDetailsEntity.toMasjedDetails(gallery: List<Gallery>): MasjedDetails {
    return MasjedDetails(
        id = id,
        masjedId = masjedId,
        name = name,
        description = description,
        imgUrl = imgUrl,
        address = address,
        siteArea = siteArea,
        minarets = minarets,
        worshipers = worshipers,
        imams = imams,
        workers = workers,
        gallery = gallery
    )
}

/**
 * Map GalleryEntity to Gallery
 */
fun List<GalleryEntity>.toGalleries(): List<Gallery> {
    return map { it.toGallery() }
}

fun GalleryEntity.toGallery(): Gallery {
    return Gallery(
        id = id,
        masjedId = masjedId,
        imgUrl = imgUrl
    )
}
