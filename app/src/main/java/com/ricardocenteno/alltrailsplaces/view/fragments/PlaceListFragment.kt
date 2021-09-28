package com.ricardocenteno.alltrailsplaces.view.fragments

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.lifecycle.ViewModelProvider
import com.ricardocenteno.alltrailsplaces.databinding.FragmentPlaceListBinding
import com.ricardocenteno.alltrailsplaces.model.domain.model.Place
import com.ricardocenteno.alltrailsplaces.view.adapters.PlacesRecyclerViewAdapter
import com.ricardocenteno.alltrailsplaces.viewmodels.PlacesViewModel
import dagger.hilt.android.AndroidEntryPoint

@AndroidEntryPoint
class PlaceListFragment : Fragment() {

    private lateinit var viewModel: PlacesViewModel
    val adapter =  PlacesRecyclerViewAdapter(emptyList())

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View {
        setHasOptionsMenu(true)
        val binding = FragmentPlaceListBinding.inflate(inflater)
        binding.fragment = this
        return binding.root
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        viewModel = ViewModelProvider(requireActivity()).get(PlacesViewModel::class.java)
        viewModel.restaurants.observe(viewLifecycleOwner, { places -> loadListPlaces(places)})
    }

    private fun loadListPlaces(items: List<Place>) {
        adapter.setItems(items)
    }
}