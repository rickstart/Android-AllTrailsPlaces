package com.ricardocenteno.alltrailsplaces.model.network.response

import com.google.gson.annotations.SerializedName
import com.ricardocenteno.alltrailsplaces.model.network.model.PlaceDto

data class GooglePlacesResponse(
    @SerializedName("next_page_response")
    val nextPageToken: String,
    @SerializedName("results")
    val placesList: List<PlaceDto>
)