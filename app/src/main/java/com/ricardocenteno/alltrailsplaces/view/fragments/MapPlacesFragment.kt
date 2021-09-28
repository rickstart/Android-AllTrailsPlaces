package com.ricardocenteno.alltrailsplaces.view.fragments

import androidx.lifecycle.ViewModelProvider
import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import com.google.android.gms.maps.CameraUpdateFactory
import com.google.android.gms.maps.GoogleMap
import com.google.android.gms.maps.OnMapReadyCallback
import com.google.android.gms.maps.SupportMapFragment
import com.google.android.gms.maps.model.LatLng
import com.google.android.gms.maps.model.Marker
import com.google.android.gms.maps.model.MarkerOptions
import com.ricardocenteno.alltrailsplaces.R
import com.ricardocenteno.alltrailsplaces.databinding.FragmentMapPlacesBinding
import com.ricardocenteno.alltrailsplaces.model.domain.model.Place
import com.ricardocenteno.alltrailsplaces.viewmodels.PlacesViewModel
import dagger.hilt.android.AndroidEntryPoint

const val DEFAULT_MAP_ZOOM = 13f
const val DEFAULT_PLACE_ZOOM = 15f

@AndroidEntryPoint
class MapPlacesFragment : Fragment(), OnMapReadyCallback, GoogleMap.OnMarkerClickListener{
    private lateinit var mMap: GoogleMap
    private lateinit var viewModel: PlacesViewModel
    private lateinit var layout: View
    private lateinit var binding: FragmentMapPlacesBinding

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View {
        binding = FragmentMapPlacesBinding.inflate(inflater)
        layout = binding.root
        return layout
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        viewModel = ViewModelProvider(requireActivity()).get(PlacesViewModel::class.java)
        viewModel.restaurants.observe(viewLifecycleOwner, { places -> showRestaurants(places)})
        viewModel.location.observe(viewLifecycleOwner, {updateCurrentLocation(it)})
        val mapFragment = childFragmentManager.findFragmentById(R.id.map) as SupportMapFragment?
        mapFragment?.getMapAsync(this)
    }

    override fun onMapReady(googleMap: GoogleMap) {
        mMap = googleMap
        mMap.setOnMarkerClickListener(this)
    }

    private fun showRestaurants(places: List<Place>) {
        mMap.clear()
        viewModel.placeSelected.set(null)
        places.forEach { place ->
            val loc = if (place.location != null)
                LatLng(place.location.lat, place.location.lng)
            else null
            loc?.let {
                val marker = mMap.addMarker(MarkerOptions()
                        .position(it)
                        .title(place.name)
                )

                marker?.tag = place
            }
        }
    }

    private fun updateCurrentLocation(location: LatLng) {
        viewModel.refreshRestaurants()
        if (this::mMap.isInitialized) {
            mMap.moveCamera(
                CameraUpdateFactory.newLatLngZoom(
                    location,
                    DEFAULT_MAP_ZOOM
                )
            )
        }
    }

    override fun onMarkerClick(marker: Marker): Boolean {
        val place = marker.tag as? Place
        place?.let {
            place.location?.let {
                val latLng = LatLng(place.location.lat, place.location.lng)
                viewModel.placeSelected.set(place)
                mMap.moveCamera(
                    CameraUpdateFactory.newLatLngZoom(
                        latLng,
                        DEFAULT_PLACE_ZOOM
                    )
                )
            }
        }

        return true
    }
}