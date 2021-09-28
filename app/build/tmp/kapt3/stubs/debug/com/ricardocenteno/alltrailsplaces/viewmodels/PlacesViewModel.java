package com.ricardocenteno.alltrailsplaces.viewmodels;

import androidx.databinding.ObservableField;
import androidx.lifecycle.MutableLiveData;
import androidx.lifecycle.ViewModel;
import com.google.android.gms.maps.model.LatLng;
import com.ricardocenteno.alltrailsplaces.model.domain.model.Location;
import com.ricardocenteno.alltrailsplaces.model.domain.model.Place;
import com.ricardocenteno.alltrailsplaces.model.repository.PlaceRepository;
import dagger.hilt.android.lifecycle.HiltViewModel;
import javax.inject.Inject;

@dagger.hilt.android.lifecycle.HiltViewModel()
@kotlin.Metadata(mv = {1, 5, 1}, k = 1, d1 = {"\u0000@\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010 \n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\b\u0007\u0018\u00002\u00020\u0001B\u000f\b\u0007\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u00a2\u0006\u0002\u0010\u0004J\u0006\u0010\u0014\u001a\u00020\u0015J\u000e\u0010\u0014\u001a\u00020\u00152\u0006\u0010\u0016\u001a\u00020\u0017R\u000e\u0010\u0005\u001a\u00020\u0006X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u001f\u0010\u0007\u001a\u0010\u0012\f\u0012\n \t*\u0004\u0018\u00010\u00060\u00060\b\u00a2\u0006\b\n\u0000\u001a\u0004\b\n\u0010\u000bR\u0017\u0010\f\u001a\b\u0012\u0004\u0012\u00020\u000e0\r\u00a2\u0006\b\n\u0000\u001a\u0004\b\u000f\u0010\u0010R\u000e\u0010\u0002\u001a\u00020\u0003X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u001d\u0010\u0011\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u000e0\u00120\b\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0013\u0010\u000b\u00a8\u0006\u0018"}, d2 = {"Lcom/ricardocenteno/alltrailsplaces/viewmodels/PlacesViewModel;", "Landroidx/lifecycle/ViewModel;", "repository", "Lcom/ricardocenteno/alltrailsplaces/model/repository/PlaceRepository;", "(Lcom/ricardocenteno/alltrailsplaces/model/repository/PlaceRepository;)V", "defaultLocation", "Lcom/google/android/gms/maps/model/LatLng;", "location", "Landroidx/lifecycle/MutableLiveData;", "kotlin.jvm.PlatformType", "getLocation", "()Landroidx/lifecycle/MutableLiveData;", "placeSelected", "Landroidx/databinding/ObservableField;", "Lcom/ricardocenteno/alltrailsplaces/model/domain/model/Place;", "getPlaceSelected", "()Landroidx/databinding/ObservableField;", "restaurants", "", "getRestaurants", "refreshRestaurants", "", "name", "", "app_debug"})
public final class PlacesViewModel extends androidx.lifecycle.ViewModel {
    private final com.ricardocenteno.alltrailsplaces.model.repository.PlaceRepository repository = null;
    private final com.google.android.gms.maps.model.LatLng defaultLocation = null;
    @org.jetbrains.annotations.NotNull()
    private final androidx.lifecycle.MutableLiveData<java.util.List<com.ricardocenteno.alltrailsplaces.model.domain.model.Place>> restaurants = null;
    @org.jetbrains.annotations.NotNull()
    private final androidx.lifecycle.MutableLiveData<com.google.android.gms.maps.model.LatLng> location = null;
    @org.jetbrains.annotations.NotNull()
    private final androidx.databinding.ObservableField<com.ricardocenteno.alltrailsplaces.model.domain.model.Place> placeSelected = null;
    
    @javax.inject.Inject()
    public PlacesViewModel(@org.jetbrains.annotations.NotNull()
    com.ricardocenteno.alltrailsplaces.model.repository.PlaceRepository repository) {
        super();
    }
    
    @org.jetbrains.annotations.NotNull()
    public final androidx.lifecycle.MutableLiveData<java.util.List<com.ricardocenteno.alltrailsplaces.model.domain.model.Place>> getRestaurants() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final androidx.lifecycle.MutableLiveData<com.google.android.gms.maps.model.LatLng> getLocation() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final androidx.databinding.ObservableField<com.ricardocenteno.alltrailsplaces.model.domain.model.Place> getPlaceSelected() {
        return null;
    }
    
    public final void refreshRestaurants() {
    }
    
    public final void refreshRestaurants(@org.jetbrains.annotations.NotNull()
    java.lang.String name) {
    }
}