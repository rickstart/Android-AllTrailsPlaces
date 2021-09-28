package com.ricardocenteno.alltrailsplaces.model.domain.model


data class Place(
    val name: String?,
    val location: Location?,
    val photos: List<Photo>?
)