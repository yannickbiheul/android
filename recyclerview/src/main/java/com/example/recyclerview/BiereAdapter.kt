package com.example.recyclerview

import android.view.LayoutInflater
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import com.example.recyclerview.databinding.LineBeerBinding

class BiereAdapter(val alBiere:ArrayList<Biere>)
    : RecyclerView.Adapter<BiereAdapter.BiereViewHolder>() {

    class BiereViewHolder(val binding: LineBeerBinding)
        : RecyclerView.ViewHolder(binding.root)

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): BiereViewHolder {
        // on récupère le binding du layout line_beer.xml
        val binding = LineBeerBinding.inflate(
            LayoutInflater.from(parent.context),
            parent,
            false)
        return BiereViewHolder(binding)
    }

    override fun onBindViewHolder(holder: BiereViewHolder, position: Int) {
        val biere = alBiere[position]
        holder.binding.beer = biere
    }

    override fun getItemCount(): Int = alBiere.size
}