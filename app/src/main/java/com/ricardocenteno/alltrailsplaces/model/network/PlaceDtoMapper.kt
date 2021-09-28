package com.ricardocenteno.alltrailsplaces.model.network

import com.ricardocenteno.alltrailsplaces.BuildConfig
import com.ricardocenteno.alltrailsplaces.model.domain.model.Location
import com.ricardocenteno.alltrailsplaces.model.domain.model.Photo
import com.ricardocenteno.alltrailsplaces.model.domain.model.Place
import com.ricardocenteno.alltrailsplaces.model.domain.util.DomainMapper
import com.ricardocenteno.alltrailsplaces.model.network.model.PlaceDto

private const val photos_api = "place/photo?maxwidth=400&photo_reference="
class PlaceDtoMapper : DomainMapper<PlaceDto, Place> {
    override fun mapToDomainModel(model: PlaceDto): Place {
        val photos = mutableListOf<Photo>()
        model.photos?.forEach {
            photos.add(
                Photo(
                    BuildConfig.URL_API+
                            photos_api+it.photoReference
                            +"&key="+BuildConfig.API_KEY
                )
            )
        }
        return Place(
            model.name,
            model.geometry?.location?.lat?.let { lat ->
                model.geometry.location.lng?.let { lng ->
                    Location(
                        lat,
                        lng
                    )
                }
            },
            photos
        )
    }

    override fun mapFromDomainModel(domainModel: Place): PlaceDto {
        TODO("Not yet implemented")
    }

    fun toDomainList(initial: List<PlaceDto>?): List<Place> {
        val places = initial?.map { mapToDomainModel(it) } ?: emptyList()
        return  places
    }
}