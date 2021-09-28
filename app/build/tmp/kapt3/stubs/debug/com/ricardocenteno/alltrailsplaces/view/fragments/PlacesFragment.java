package com.ricardocenteno.alltrailsplaces.view.fragments;

import android.Manifest;
import android.app.SearchManager;
import android.content.Context;
import android.content.Intent;
import android.content.pm.PackageManager;
import android.location.Location;
import android.net.Uri;
import android.os.Bundle;
import android.provider.Settings;
import android.view.*;
import android.widget.SearchView;
import androidx.fragment.app.Fragment;
import androidx.activity.result.contract.ActivityResultContracts;
import androidx.core.app.ActivityCompat;
import androidx.core.content.ContextCompat;
import androidx.databinding.ObservableField;
import androidx.lifecycle.ViewModelProvider;
import com.google.android.gms.location.FusedLocationProviderClient;
import com.google.android.gms.location.LocationServices;
import com.google.android.gms.maps.model.LatLng;
import com.google.android.gms.tasks.OnSuccessListener;
import com.google.android.material.snackbar.Snackbar;
import com.ricardocenteno.alltrailsplaces.R;
import com.ricardocenteno.alltrailsplaces.databinding.FragmentPlacesBinding;
import com.ricardocenteno.alltrailsplaces.viewmodels.PlacesViewModel;
import dagger.hilt.android.AndroidEntryPoint;

@kotlin.Metadata(mv = {1, 5, 1}, k = 1, d1 = {"\u0000j\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0007\b\u0007\u0018\u00002\u00020\u00012\b\u0012\u0004\u0012\u00020\u00030\u0002:\u0001)B\u0005\u00a2\u0006\u0002\u0010\u0004J\b\u0010\u0016\u001a\u00020\u0017H\u0002J\b\u0010\u0018\u001a\u00020\u0017H\u0002J\u0018\u0010\u0019\u001a\u00020\u00172\u0006\u0010\u001a\u001a\u00020\u001b2\u0006\u0010\u001c\u001a\u00020\u001dH\u0016J$\u0010\u001e\u001a\u00020\n2\u0006\u0010\u001c\u001a\u00020\u001f2\b\u0010 \u001a\u0004\u0018\u00010!2\b\u0010\"\u001a\u0004\u0018\u00010#H\u0016J\u0012\u0010$\u001a\u00020\u00172\b\u0010%\u001a\u0004\u0018\u00010\u0003H\u0016J\u001a\u0010&\u001a\u00020\u00172\u0006\u0010\'\u001a\u00020\n2\b\u0010\"\u001a\u0004\u0018\u00010#H\u0016J\u0006\u0010(\u001a\u00020\u0017R\u000e\u0010\u0005\u001a\u00020\u0006X\u0082.\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0007\u001a\u00020\bX\u0082.\u00a2\u0006\u0002\n\u0000R\u000e\u0010\t\u001a\u00020\nX\u0082.\u00a2\u0006\u0002\n\u0000R\u001f\u0010\u000b\u001a\u0010\u0012\f\u0012\n \u000e*\u0004\u0018\u00010\r0\r0\f\u00a2\u0006\b\n\u0000\u001a\u0004\b\u000f\u0010\u0010R\u001c\u0010\u0011\u001a\u0010\u0012\f\u0012\n \u000e*\u0004\u0018\u00010\u00130\u00130\u0012X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0014\u001a\u00020\u0015X\u0082.\u00a2\u0006\u0002\n\u0000\u00a8\u0006*"}, d2 = {"Lcom/ricardocenteno/alltrailsplaces/view/fragments/PlacesFragment;", "Landroidx/fragment/app/Fragment;", "Lcom/google/android/gms/tasks/OnSuccessListener;", "Landroid/location/Location;", "()V", "binding", "Lcom/ricardocenteno/alltrailsplaces/databinding/FragmentPlacesBinding;", "fusedLocationClient", "Lcom/google/android/gms/location/FusedLocationProviderClient;", "layout", "Landroid/view/View;", "pageState", "Landroidx/databinding/ObservableField;", "Lcom/ricardocenteno/alltrailsplaces/view/fragments/PlacesFragment$PageState;", "kotlin.jvm.PlatformType", "getPageState", "()Landroidx/databinding/ObservableField;", "requestPermissionLauncher", "Landroidx/activity/result/ActivityResultLauncher;", "", "viewModel", "Lcom/ricardocenteno/alltrailsplaces/viewmodels/PlacesViewModel;", "checkAndRequestPermissions", "", "enableGetLastLocation", "onCreateOptionsMenu", "menu", "Landroid/view/Menu;", "inflater", "Landroid/view/MenuInflater;", "onCreateView", "Landroid/view/LayoutInflater;", "container", "Landroid/view/ViewGroup;", "savedInstanceState", "Landroid/os/Bundle;", "onSuccess", "loc", "onViewCreated", "view", "setPageState", "PageState", "app_debug"})
@dagger.hilt.android.AndroidEntryPoint()
public final class PlacesFragment extends androidx.fragment.app.Fragment implements com.google.android.gms.tasks.OnSuccessListener<android.location.Location> {
    private com.ricardocenteno.alltrailsplaces.databinding.FragmentPlacesBinding binding;
    private com.ricardocenteno.alltrailsplaces.viewmodels.PlacesViewModel viewModel;
    private com.google.android.gms.location.FusedLocationProviderClient fusedLocationClient;
    private android.view.View layout;
    @org.jetbrains.annotations.NotNull()
    private final androidx.databinding.ObservableField<com.ricardocenteno.alltrailsplaces.view.fragments.PlacesFragment.PageState> pageState = null;
    private final androidx.activity.result.ActivityResultLauncher<java.lang.String> requestPermissionLauncher = null;
    private java.util.HashMap _$_findViewCache;
    
    public PlacesFragment() {
        super();
    }
    
    @org.jetbrains.annotations.NotNull()
    public final androidx.databinding.ObservableField<com.ricardocenteno.alltrailsplaces.view.fragments.PlacesFragment.PageState> getPageState() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    @java.lang.Override()
    public android.view.View onCreateView(@org.jetbrains.annotations.NotNull()
    android.view.LayoutInflater inflater, @org.jetbrains.annotations.Nullable()
    android.view.ViewGroup container, @org.jetbrains.annotations.Nullable()
    android.os.Bundle savedInstanceState) {
        return null;
    }
    
    @java.lang.Override()
    public void onCreateOptionsMenu(@org.jetbrains.annotations.NotNull()
    android.view.Menu menu, @org.jetbrains.annotations.NotNull()
    android.view.MenuInflater inflater) {
    }
    
    @java.lang.Override()
    public void onViewCreated(@org.jetbrains.annotations.NotNull()
    android.view.View view, @org.jetbrains.annotations.Nullable()
    android.os.Bundle savedInstanceState) {
    }
    
    public final void setPageState() {
    }
    
    @java.lang.Override()
    public void onSuccess(@org.jetbrains.annotations.Nullable()
    android.location.Location loc) {
    }
    
    private final void enableGetLastLocation() {
    }
    
    private final void checkAndRequestPermissions() {
    }
    
    @kotlin.Metadata(mv = {1, 5, 1}, k = 1, d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\b\u0004\b\u0086\u0001\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001B\u0007\b\u0002\u00a2\u0006\u0002\u0010\u0002j\u0002\b\u0003j\u0002\b\u0004\u00a8\u0006\u0005"}, d2 = {"Lcom/ricardocenteno/alltrailsplaces/view/fragments/PlacesFragment$PageState;", "", "(Ljava/lang/String;I)V", "MAP", "LIST", "app_debug"})
    public static enum PageState {
        /*public static final*/ MAP /* = new MAP() */,
        /*public static final*/ LIST /* = new LIST() */;
        
        PageState() {
        }
    }
}