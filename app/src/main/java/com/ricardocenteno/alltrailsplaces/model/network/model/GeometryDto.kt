package com.ricardocenteno.alltrailsplaces.model.network.model

import com.google.gson.annotations.SerializedName

data class GeometryDto(
    @SerializedName("location")
    val location: LocationDto?
)