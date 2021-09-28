package com.ricardocenteno.alltrailsplaces.model.network.model

import com.google.gson.annotations.SerializedName

data class LocationDto (
    @SerializedName("lat")
    val lat: Double?,
    @SerializedName("lng")
    val lng: Double?
)