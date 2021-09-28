package com.ricardocenteno.alltrailsplaces.view.util

import android.widget.ImageView
import androidx.databinding.BindingAdapter
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView
import com.bumptech.glide.Glide
import com.ricardocenteno.alltrailsplaces.model.domain.model.Photo

@BindingAdapter("setAdapter")
fun setAdapter(recyclerView: RecyclerView, adapter: RecyclerView.Adapter<*>) {
    recyclerView.layoutManager = LinearLayoutManager(
        recyclerView.context,
        LinearLayoutManager.VERTICAL,
        false)
    recyclerView.setHasFixedSize(true)
    recyclerView.adapter = adapter
}

@BindingAdapter("loadPlacePhoto")
fun loadPlacePhoto(imageView: ImageView, photos: List<Photo>?) {
    photos?.first()?.let { photo ->
        Glide.with(imageView.context).load(photo.imageUrl).into(imageView)
    }
}