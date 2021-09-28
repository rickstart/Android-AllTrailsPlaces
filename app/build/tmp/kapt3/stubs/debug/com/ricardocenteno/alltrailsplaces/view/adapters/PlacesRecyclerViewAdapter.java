package com.ricardocenteno.alltrailsplaces.view.adapters;

import android.content.Context;
import androidx.recyclerview.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;
import com.bumptech.glide.Glide;
import com.ricardocenteno.alltrailsplaces.databinding.ItemPlaceBinding;
import com.ricardocenteno.alltrailsplaces.model.domain.model.Place;

@kotlin.Metadata(mv = {1, 5, 1}, k = 1, d1 = {"\u00006\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0005\u0018\u00002\f\u0012\b\u0012\u00060\u0002R\u00020\u00000\u0001:\u0001\u0015B\u0013\u0012\f\u0010\u0003\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004\u00a2\u0006\u0002\u0010\u0006J\b\u0010\t\u001a\u00020\nH\u0016J\u001c\u0010\u000b\u001a\u00020\f2\n\u0010\r\u001a\u00060\u0002R\u00020\u00002\u0006\u0010\u000e\u001a\u00020\nH\u0016J\u001c\u0010\u000f\u001a\u00060\u0002R\u00020\u00002\u0006\u0010\u0010\u001a\u00020\u00112\u0006\u0010\u0012\u001a\u00020\nH\u0016J\u0014\u0010\u0013\u001a\u00020\f2\f\u0010\u0014\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004R\u000e\u0010\u0007\u001a\u00020\bX\u0082.\u00a2\u0006\u0002\n\u0000R\u0014\u0010\u0003\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004X\u0082\u000e\u00a2\u0006\u0002\n\u0000\u00a8\u0006\u0016"}, d2 = {"Lcom/ricardocenteno/alltrailsplaces/view/adapters/PlacesRecyclerViewAdapter;", "Landroidx/recyclerview/widget/RecyclerView$Adapter;", "Lcom/ricardocenteno/alltrailsplaces/view/adapters/PlacesRecyclerViewAdapter$ViewHolder;", "values", "", "Lcom/ricardocenteno/alltrailsplaces/model/domain/model/Place;", "(Ljava/util/List;)V", "context", "Landroid/content/Context;", "getItemCount", "", "onBindViewHolder", "", "holder", "position", "onCreateViewHolder", "parent", "Landroid/view/ViewGroup;", "viewType", "setItems", "items", "ViewHolder", "app_debug"})
public final class PlacesRecyclerViewAdapter extends androidx.recyclerview.widget.RecyclerView.Adapter<com.ricardocenteno.alltrailsplaces.view.adapters.PlacesRecyclerViewAdapter.ViewHolder> {
    private java.util.List<com.ricardocenteno.alltrailsplaces.model.domain.model.Place> values;
    private android.content.Context context;
    
    public PlacesRecyclerViewAdapter(@org.jetbrains.annotations.NotNull()
    java.util.List<com.ricardocenteno.alltrailsplaces.model.domain.model.Place> values) {
        super();
    }
    
    @org.jetbrains.annotations.NotNull()
    @java.lang.Override()
    public com.ricardocenteno.alltrailsplaces.view.adapters.PlacesRecyclerViewAdapter.ViewHolder onCreateViewHolder(@org.jetbrains.annotations.NotNull()
    android.view.ViewGroup parent, int viewType) {
        return null;
    }
    
    public final void setItems(@org.jetbrains.annotations.NotNull()
    java.util.List<com.ricardocenteno.alltrailsplaces.model.domain.model.Place> items) {
    }
    
    @java.lang.Override()
    public void onBindViewHolder(@org.jetbrains.annotations.NotNull()
    com.ricardocenteno.alltrailsplaces.view.adapters.PlacesRecyclerViewAdapter.ViewHolder holder, int position) {
    }
    
    @java.lang.Override()
    public int getItemCount() {
        return 0;
    }
    
    @kotlin.Metadata(mv = {1, 5, 1}, k = 1, d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0086\u0004\u0018\u00002\u00020\u0001B\r\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u00a2\u0006\u0002\u0010\u0004R\u0011\u0010\u0005\u001a\u00020\u0006\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0007\u0010\bR\u0011\u0010\t\u001a\u00020\n\u00a2\u0006\b\n\u0000\u001a\u0004\b\u000b\u0010\f\u00a8\u0006\r"}, d2 = {"Lcom/ricardocenteno/alltrailsplaces/view/adapters/PlacesRecyclerViewAdapter$ViewHolder;", "Landroidx/recyclerview/widget/RecyclerView$ViewHolder;", "binding", "Lcom/ricardocenteno/alltrailsplaces/databinding/ItemPlaceBinding;", "(Lcom/ricardocenteno/alltrailsplaces/view/adapters/PlacesRecyclerViewAdapter;Lcom/ricardocenteno/alltrailsplaces/databinding/ItemPlaceBinding;)V", "imagePlace", "Landroid/widget/ImageView;", "getImagePlace", "()Landroid/widget/ImageView;", "textPlaceName", "Landroid/widget/TextView;", "getTextPlaceName", "()Landroid/widget/TextView;", "app_debug"})
    public final class ViewHolder extends androidx.recyclerview.widget.RecyclerView.ViewHolder {
        @org.jetbrains.annotations.NotNull()
        private final android.widget.TextView textPlaceName = null;
        @org.jetbrains.annotations.NotNull()
        private final android.widget.ImageView imagePlace = null;
        
        public ViewHolder(@org.jetbrains.annotations.NotNull()
        com.ricardocenteno.alltrailsplaces.databinding.ItemPlaceBinding binding) {
            super(null);
        }
        
        @org.jetbrains.annotations.NotNull()
        public final android.widget.TextView getTextPlaceName() {
            return null;
        }
        
        @org.jetbrains.annotations.NotNull()
        public final android.widget.ImageView getImagePlace() {
            return null;
        }
    }
}