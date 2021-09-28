package com.ricardocenteno.alltrailsplaces.view.fragments;

import androidx.lifecycle.ViewModelProvider;
import android.os.Bundle;
import androidx.fragment.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import com.google.android.gms.maps.CameraUpdateFactory;
import com.google.android.gms.maps.GoogleMap;
import com.google.android.gms.maps.OnMapReadyCallback;
import com.google.android.gms.maps.SupportMapFragment;
import com.google.android.gms.maps.model.LatLng;
import com.google.android.gms.maps.model.Marker;
import com.google.android.gms.maps.model.MarkerOptions;
import com.ricardocenteno.alltrailsplaces.R;
import com.ricardocenteno.alltrailsplaces.databinding.FragmentMapPlacesBinding;
import com.ricardocenteno.alltrailsplaces.model.domain.model.Place;
import com.ricardocenteno.alltrailsplaces.viewmodels.PlacesViewModel;
import dagger.hilt.android.AndroidEntryPoint;

@kotlin.Metadata(mv = {1, 5, 1}, k = 2, d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0007\n\u0002\b\u0002\"\u000e\u0010\u0000\u001a\u00020\u0001X\u0086T\u00a2\u0006\u0002\n\u0000\"\u000e\u0010\u0002\u001a\u00020\u0001X\u0086T\u00a2\u0006\u0002\n\u0000\u00a8\u0006\u0003"}, d2 = {"DEFAULT_MAP_ZOOM", "", "DEFAULT_PLACE_ZOOM", "app_debug"})
public final class MapPlacesFragmentKt {
    public static final float DEFAULT_MAP_ZOOM = 13.0F;
    public static final float DEFAULT_PLACE_ZOOM = 15.0F;
}