package com.ricardocenteno.alltrailsplaces.view.fragments;

import android.os.Bundle;
import androidx.fragment.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.lifecycle.ViewModelProvider;
import com.ricardocenteno.alltrailsplaces.databinding.FragmentPlaceListBinding;
import com.ricardocenteno.alltrailsplaces.model.domain.model.Place;
import com.ricardocenteno.alltrailsplaces.view.adapters.PlacesRecyclerViewAdapter;
import com.ricardocenteno.alltrailsplaces.viewmodels.PlacesViewModel;
import dagger.hilt.android.AndroidEntryPoint;

@kotlin.Metadata(mv = {1, 5, 1}, k = 1, d1 = {"\u0000D\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0007\u0018\u00002\u00020\u0001B\u0005\u00a2\u0006\u0002\u0010\u0002J\u0016\u0010\t\u001a\u00020\n2\f\u0010\u000b\u001a\b\u0012\u0004\u0012\u00020\r0\fH\u0002J$\u0010\u000e\u001a\u00020\u000f2\u0006\u0010\u0010\u001a\u00020\u00112\b\u0010\u0012\u001a\u0004\u0018\u00010\u00132\b\u0010\u0014\u001a\u0004\u0018\u00010\u0015H\u0016J\u001a\u0010\u0016\u001a\u00020\n2\u0006\u0010\u0017\u001a\u00020\u000f2\b\u0010\u0014\u001a\u0004\u0018\u00010\u0015H\u0016R\u0011\u0010\u0003\u001a\u00020\u0004\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0005\u0010\u0006R\u000e\u0010\u0007\u001a\u00020\bX\u0082.\u00a2\u0006\u0002\n\u0000\u00a8\u0006\u0018"}, d2 = {"Lcom/ricardocenteno/alltrailsplaces/view/fragments/PlaceListFragment;", "Landroidx/fragment/app/Fragment;", "()V", "adapter", "Lcom/ricardocenteno/alltrailsplaces/view/adapters/PlacesRecyclerViewAdapter;", "getAdapter", "()Lcom/ricardocenteno/alltrailsplaces/view/adapters/PlacesRecyclerViewAdapter;", "viewModel", "Lcom/ricardocenteno/alltrailsplaces/viewmodels/PlacesViewModel;", "loadListPlaces", "", "items", "", "Lcom/ricardocenteno/alltrailsplaces/model/domain/model/Place;", "onCreateView", "Landroid/view/View;", "inflater", "Landroid/view/LayoutInflater;", "container", "Landroid/view/ViewGroup;", "savedInstanceState", "Landroid/os/Bundle;", "onViewCreated", "view", "app_debug"})
@dagger.hilt.android.AndroidEntryPoint()
public final class PlaceListFragment extends androidx.fragment.app.Fragment {
    private com.ricardocenteno.alltrailsplaces.viewmodels.PlacesViewModel viewModel;
    @org.jetbrains.annotations.NotNull()
    private final com.ricardocenteno.alltrailsplaces.view.adapters.PlacesRecyclerViewAdapter adapter = null;
    private java.util.HashMap _$_findViewCache;
    
    public PlaceListFragment() {
        super();
    }
    
    @org.jetbrains.annotations.NotNull()
    public final com.ricardocenteno.alltrailsplaces.view.adapters.PlacesRecyclerViewAdapter getAdapter() {
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
    public void onViewCreated(@org.jetbrains.annotations.NotNull()
    android.view.View view, @org.jetbrains.annotations.Nullable()
    android.os.Bundle savedInstanceState) {
    }
    
    private final void loadListPlaces(java.util.List<com.ricardocenteno.alltrailsplaces.model.domain.model.Place> items) {
    }
}