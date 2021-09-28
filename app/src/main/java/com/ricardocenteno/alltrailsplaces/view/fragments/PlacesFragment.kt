package com.ricardocenteno.alltrailsplaces.view.fragments

import android.Manifest
import android.app.SearchManager
import android.content.Context
import android.content.Intent
import android.content.pm.PackageManager
import android.location.Location
import android.net.Uri
import android.os.Bundle
import android.provider.Settings
import android.view.*
import android.widget.SearchView
import androidx.fragment.app.Fragment
import androidx.activity.result.contract.ActivityResultContracts
import androidx.core.app.ActivityCompat
import androidx.core.content.ContextCompat
import androidx.databinding.ObservableField
import androidx.lifecycle.ViewModelProvider
import com.google.android.gms.location.FusedLocationProviderClient
import com.google.android.gms.location.LocationServices
import com.google.android.gms.maps.model.LatLng
import com.google.android.gms.tasks.OnSuccessListener
import com.google.android.material.snackbar.Snackbar
import com.ricardocenteno.alltrailsplaces.R
import com.ricardocenteno.alltrailsplaces.databinding.FragmentPlacesBinding
import com.ricardocenteno.alltrailsplaces.view.util.showSnackbar
import com.ricardocenteno.alltrailsplaces.viewmodels.PlacesViewModel
import dagger.hilt.android.AndroidEntryPoint

@AndroidEntryPoint
class PlacesFragment : Fragment(), OnSuccessListener<Location> {
    private lateinit var binding: FragmentPlacesBinding
    private  lateinit var viewModel: PlacesViewModel
    private lateinit var fusedLocationClient: FusedLocationProviderClient
    private lateinit var layout: View
    val pageState = ObservableField(PageState.LIST)

    private val requestPermissionLauncher =
        registerForActivityResult(
            ActivityResultContracts.RequestPermission()
        ) { isGranted: Boolean ->
            if (isGranted) {
                enableGetLastLocation()
            } else {
                // Permission request was denied.
                layout.showSnackbar(
                    R.string.location_permission_denied,
                    Snackbar.LENGTH_INDEFINITE,
                    R.string.allow
                ) {
                    //Redirect user to settings to allow the permission
                    val intent = Intent()
                    intent.action = Settings.ACTION_APPLICATION_DETAILS_SETTINGS
                    val uri: Uri = Uri.fromParts(
                        "package",
                        context?.packageName,
                        null
                    )
                    intent.data = uri
                    this@PlacesFragment.startActivity(intent)
                }
            }
        }

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View {
        setHasOptionsMenu(true)
        binding = FragmentPlacesBinding.inflate(inflater)
        binding.fragment = this
        layout = binding.root
        return binding.root
    }

    override fun onCreateOptionsMenu(menu: Menu, inflater: MenuInflater) {
        inflater.inflate(R.menu.menu_search, menu)
        // Associate searchable configuration with the SearchView
        val searchManager = context?.getSystemService(Context.SEARCH_SERVICE) as SearchManager
        (menu.findItem(R.id.search).actionView as SearchView).apply {
            setSearchableInfo(searchManager.getSearchableInfo(activity?.componentName))
            this.setOnQueryTextListener(
                object: SearchView.OnQueryTextListener{
                    override fun onQueryTextSubmit(query: String?): Boolean {
                        query?.let {
                            viewModel.refreshRestaurants(query)
                        }
                        return false
                    }

                    override fun onQueryTextChange(newText: String?): Boolean {
                        return true
                    }
                }
            )
        }

    }



    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        viewModel = ViewModelProvider(requireActivity()).get(PlacesViewModel::class.java)
        viewModel.location.observe(viewLifecycleOwner, {viewModel.refreshRestaurants()})
        binding.viewModel = viewModel
        checkAndRequestPermissions()
    }

    fun setPageState() {
        pageState.set( if (pageState.get() == PageState.MAP) PageState.LIST else PageState.MAP)
    }

    override fun onSuccess(loc: Location?) {
        loc?.let {
            viewModel.location.postValue(LatLng(loc.latitude, loc.longitude))
        }
    }

    private fun enableGetLastLocation() {
        context?.let {
            fusedLocationClient = LocationServices.getFusedLocationProviderClient(it)
            if (ActivityCompat.checkSelfPermission(
                    it,
                    Manifest.permission.ACCESS_FINE_LOCATION
                ) == PackageManager.PERMISSION_GRANTED && ActivityCompat.checkSelfPermission(
                    it,
                    Manifest.permission.ACCESS_COARSE_LOCATION
                ) == PackageManager.PERMISSION_GRANTED
            ) {
                fusedLocationClient.lastLocation.addOnSuccessListener(this)
            }
        }
    }

    private fun checkAndRequestPermissions(){
        context?.let { context ->
            activity?.let { activity ->
                when {
                    ContextCompat.checkSelfPermission(
                        context,
                        Manifest.permission.ACCESS_FINE_LOCATION
                    ) == PackageManager.PERMISSION_GRANTED -> {
                        enableGetLastLocation()
                    }
                    ActivityCompat.shouldShowRequestPermissionRationale(
                        activity,
                        Manifest.permission.ACCESS_FINE_LOCATION
                    ) -> {
                        layout.showSnackbar(
                            R.string.location_access_required,
                            Snackbar.LENGTH_INDEFINITE,
                            R.string.allow
                        ) {
                            requestPermissionLauncher.launch(Manifest.permission.ACCESS_FINE_LOCATION)
                        }
                    }
                    else -> {
                        layout.showSnackbar(
                            R.string.location_access_required,
                            Snackbar.LENGTH_INDEFINITE,
                            R.string.allow
                        ) {
                            requestPermissionLauncher.launch(Manifest.permission.ACCESS_FINE_LOCATION)
                        }
                    }
                }
            }
        }
    }

    enum class PageState {
        MAP,
        LIST
    }
}