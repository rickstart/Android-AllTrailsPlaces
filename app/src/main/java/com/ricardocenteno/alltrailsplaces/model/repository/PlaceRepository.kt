package com.ricardocenteno.alltrailsplaces.model.repository

import com.ricardocenteno.alltrailsplaces.model.domain.model.Place

interface PlaceRepository {
    suspend fun searchRestaurants(lat: Double, lng: Double): List<Place>
    suspend fun searchRestaurants(lat: Double, lng: Double, name: String): List<Place>
}