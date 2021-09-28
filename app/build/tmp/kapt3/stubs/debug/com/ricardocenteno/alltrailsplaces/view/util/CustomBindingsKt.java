package com.ricardocenteno.alltrailsplaces.view.util;

import android.widget.ImageView;
import androidx.databinding.BindingAdapter;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import com.bumptech.glide.Glide;
import com.ricardocenteno.alltrailsplaces.model.domain.model.Photo;

@kotlin.Metadata(mv = {1, 5, 1}, k = 2, d1 = {"\u0000&\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\u001a \u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u00032\u000e\u0010\u0004\u001a\n\u0012\u0004\u0012\u00020\u0006\u0018\u00010\u0005H\u0007\u001a\u001c\u0010\u0007\u001a\u00020\u00012\u0006\u0010\b\u001a\u00020\t2\n\u0010\n\u001a\u0006\u0012\u0002\b\u00030\u000bH\u0007\u00a8\u0006\f"}, d2 = {"loadPlacePhoto", "", "imageView", "Landroid/widget/ImageView;", "photos", "", "Lcom/ricardocenteno/alltrailsplaces/model/domain/model/Photo;", "setAdapter", "recyclerView", "Landroidx/recyclerview/widget/RecyclerView;", "adapter", "Landroidx/recyclerview/widget/RecyclerView$Adapter;", "app_debug"})
public final class CustomBindingsKt {
    
    @androidx.databinding.BindingAdapter(value = {"setAdapter"})
    public static final void setAdapter(@org.jetbrains.annotations.NotNull()
    androidx.recyclerview.widget.RecyclerView recyclerView, @org.jetbrains.annotations.NotNull()
    androidx.recyclerview.widget.RecyclerView.Adapter<?> adapter) {
    }
    
    @androidx.databinding.BindingAdapter(value = {"loadPlacePhoto"})
    public static final void loadPlacePhoto(@org.jetbrains.annotations.NotNull()
    android.widget.ImageView imageView, @org.jetbrains.annotations.Nullable()
    java.util.List<com.ricardocenteno.alltrailsplaces.model.domain.model.Photo> photos) {
    }
}