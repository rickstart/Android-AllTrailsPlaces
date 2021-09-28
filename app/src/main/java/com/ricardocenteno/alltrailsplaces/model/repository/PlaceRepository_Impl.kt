package com.ricardocenteno.alltrailsplaces.model.repository

import android.util.Log
import com.ricardocenteno.alltrailsplaces.model.domain.model.Place
import com.ricardocenteno.alltrailsplaces.model.network.PlaceDtoMapper
import com.ricardocenteno.alltrailsplaces.model.network.PlacesService
import com.ricardocenteno.alltrailsplaces.model.network.model.PlaceDto

const val DEFAULT_RADIUS = 2000
class PlaceRepository_Impl(
    private val placesService: PlacesService,
    private val mapper: PlaceDtoMapper
): PlaceRepository {

    override suspend fun searchRestaurants(lat: Double, lng: Double): List<Place> {
        var placesDtos = emptyList<PlaceDto>()
        val response = placesService.getNearbyPlacesFromLocation(
            PlaceTypes.RESTAURANT.desc,
            "$lat,$lng",
            DEFAULT_RADIUS,
            null
        )

        if (response.isSuccessful) {
            response.body()?.let {
                placesDtos = it.placesList
            }
        }

        return mapper.toDomainList(placesDtos)
    }

    override suspend fun searchRestaurants(lat: Double, lng: Double, name: String): List<Place> {
        var placesDtos = emptyList<PlaceDto>()
        val response = placesService.getNearbyPlacesFromLocation(
            PlaceTypes.RESTAURANT.desc,
            "$lat,$lng",
            DEFAULT_RADIUS,
            name
        )

        if (response.isSuccessful) {
            response.body()?.let {
                Log.e("DEBUG", it.toString())
                placesDtos = it.placesList
            }
        }

        return mapper.toDomainList(placesDtos)
    }

}

enum class PlaceTypes(val desc: String) {
    RESTAURANT("restaurant")
}