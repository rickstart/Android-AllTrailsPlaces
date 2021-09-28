package com.ricardocenteno.alltrailsplaces.model.network

import com.ricardocenteno.alltrailsplaces.model.network.response.GooglePlacesResponse
import retrofit2.Response
import retrofit2.http.GET
import retrofit2.http.Query

interface PlacesService {
    @GET("place/nearbysearch/json")
    suspend fun getNearbyPlacesFromLocation(
        @Query("types") types: String,
        @Query("location") location: String,
        @Query("radius") radius: Int,
        @Query("name") name: String?,
    ): Response<GooglePlacesResponse>
}