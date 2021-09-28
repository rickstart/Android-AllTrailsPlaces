package com.ricardocenteno.alltrailsplaces.viewmodels

import androidx.databinding.ObservableField
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel
import androidx.lifecycle.viewModelScope
import com.google.android.gms.maps.model.LatLng
import com.ricardocenteno.alltrailsplaces.model.domain.model.Location
import com.ricardocenteno.alltrailsplaces.model.domain.model.Place
import com.ricardocenteno.alltrailsplaces.model.repository.PlaceRepository
import dagger.hilt.android.lifecycle.HiltViewModel
import kotlinx.coroutines.launch
import javax.inject.Inject

@HiltViewModel
class PlacesViewModel
@Inject
constructor(
    private val repository: PlaceRepository
): ViewModel() {
    // this is location in case the emulator or device is not able to get it
    private val defaultLocation = LatLng(33.1672, -96.7081)
    val restaurants = MutableLiveData<List<Place>>()
    val location = MutableLiveData(defaultLocation)
    val placeSelected = ObservableField<Place>()

    fun refreshRestaurants() {
        viewModelScope.launch {
            val loc = if(location.value != null) location.value else defaultLocation
            loc?.let {
                restaurants.postValue(
                    repository.searchRestaurants(loc.latitude, loc.longitude)
                )
            }
        }
    }

    fun refreshRestaurants( name: String) {
        viewModelScope.launch {
            val loc = if(location.value != null) location.value else defaultLocation
            loc?.let {
                restaurants.postValue(
                    repository.searchRestaurants(loc.latitude, loc.longitude, name)
                )
            }
        }
    }
}