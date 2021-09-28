package com.ricardocenteno.alltrailsplaces.model.network.model

import com.google.gson.annotations.SerializedName

data class PhotoDto (
    @SerializedName("height")
    val height: Int?,
    @SerializedName("width")
    val width: Int?,
    @SerializedName("photo_reference")
    val photoReference: String?
)