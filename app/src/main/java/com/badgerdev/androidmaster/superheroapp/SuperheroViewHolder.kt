package com.badgerdev.androidmaster.superheroapp

import android.view.View
import androidx.recyclerview.widget.RecyclerView
import com.badgerdev.androidmaster.databinding.ItemSuperheroBinding
import com.squareup.picasso.Picasso

class SuperheroViewHolder(view: View) : RecyclerView.ViewHolder(view) {

    private val binding = ItemSuperheroBinding.bind(view)

    fun bind(
        superheroItemResponse: SuperHeroItemResponse,
        onItemSelected: (String) -> Unit
    ) {
        binding.tvSuperheroName.text = superheroItemResponse.name
        Picasso.get().load(superheroItemResponse.image.url).into(binding.ivSuperhero)
        binding.root.setOnClickListener{ onItemSelected(superheroItemResponse.superheroId) }
    }
}