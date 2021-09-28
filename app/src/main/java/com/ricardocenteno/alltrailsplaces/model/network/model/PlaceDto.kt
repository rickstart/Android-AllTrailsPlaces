package com.ricardocenteno.alltrailsplaces.model.network.model

import com.google.gson.annotations.SerializedName

data class PlaceDto(
    @SerializedName("name")
    val name: String?,
    @SerializedName("business_status")
    val businessStatus: String?,
    @SerializedName("geometry")
    val geometry: GeometryDto?,
    @SerializedName("photos")
    val photos: List<PhotoDto>?
)