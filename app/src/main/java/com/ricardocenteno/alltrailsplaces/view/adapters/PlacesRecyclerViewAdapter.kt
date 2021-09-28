package com.ricardocenteno.alltrailsplaces.view.adapters

import android.content.Context
import androidx.recyclerview.widget.RecyclerView
import android.view.LayoutInflater
import android.view.ViewGroup
import android.widget.ImageView
import android.widget.TextView
import com.bumptech.glide.Glide
import com.ricardocenteno.alltrailsplaces.databinding.ItemPlaceBinding
import com.ricardocenteno.alltrailsplaces.model.domain.model.Place

class PlacesRecyclerViewAdapter(
    private var values: List<Place>
) : RecyclerView.Adapter<PlacesRecyclerViewAdapter.ViewHolder>() {

    private lateinit var context: Context
    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ViewHolder {
        context = parent.context
        return ViewHolder(
            ItemPlaceBinding.inflate(
                LayoutInflater.from(parent.context),
                parent,
                false
            )
        )
    }

    fun setItems(items: List<Place>) {
        values = items
        notifyDataSetChanged()
    }

    override fun onBindViewHolder(holder: ViewHolder, position: Int) {
        val item = values[position]
        holder.textPlaceName.text = item.name
        val photo = item.photos?.firstOrNull()
        photo?.let {
            Glide.with(context).load(photo.imageUrl).into(holder.imagePlace)
        }
    }

    override fun getItemCount(): Int = values.size

    inner class ViewHolder(binding: ItemPlaceBinding) : RecyclerView.ViewHolder(binding.root) {
        val textPlaceName: TextView = binding.textPlaceName
        val imagePlace: ImageView = binding.imgPlace
    }

}