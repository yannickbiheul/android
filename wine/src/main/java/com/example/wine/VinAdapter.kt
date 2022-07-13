package com.example.wine

import android.view.LayoutInflater
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import com.example.wine.databinding.LineWineBinding

class VinAdapter(val alVin:ArrayList<Vin>)
    : RecyclerView.Adapter<VinAdapter.VinViewHolder>(){

    class VinViewHolder(val binding : LineWineBinding)
        : RecyclerView.ViewHolder(binding.root)

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): VinViewHolder {
        val binding = LineWineBinding.inflate(
            LayoutInflater.from(parent.context),
            parent,
            false)
        return VinViewHolder(binding)
    }

    override fun onBindViewHolder(holder: VinViewHolder, position: Int) {
        val vin = alVin[position]
        holder.binding.vin = vin
    }

    override fun getItemCount(): Int = alVin.size


}