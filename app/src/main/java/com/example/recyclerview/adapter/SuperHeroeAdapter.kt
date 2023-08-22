package com.example.recyclerview.adapter

import android.view.LayoutInflater
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import com.example.recyclerview.R
import com.example.recyclerview.SuperHeroe

class SuperHeroeAdapter(val superHeroeLista: List<SuperHeroe>): RecyclerView.Adapter<SuperHeroeViewHolder>() {
    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): SuperHeroeViewHolder {
        val layoutInflater = LayoutInflater.from(parent.context)
        return SuperHeroeViewHolder(layoutInflater.inflate(R.layout.item_superheroe, parent, false))
    }

    //conteo de cuantos itmes se van a dibujar
    override fun getItemCount(): Int {
        return superHeroeLista.size
    }

    override fun onBindViewHolder(holder: SuperHeroeViewHolder, position: Int) {
        val item = superHeroeLista[position]
        holder.render(item)
    }
}