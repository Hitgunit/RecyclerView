package com.example.recyclerview.adapter

import android.view.View
import android.widget.ImageView
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView
import com.bumptech.glide.Glide
import com.example.recyclerview.R
import com.example.recyclerview.SuperHeroe

class SuperHeroeViewHolder (val view: View):RecyclerView.ViewHolder(view) {

    val superHeroe = view.findViewById<TextView>(R.id.tvSuperHeroe)
    val nombreReal = view.findViewById<TextView>(R.id.tvNombreReal)
    val publicista = view.findViewById<TextView>(R.id.tvPublicista)
    val foto = view.findViewById<ImageView>(R.id.ivSuperheroe)

    fun render (superHeroeModelo : SuperHeroe) {
        superHeroe.text = superHeroeModelo.superHeroe
        nombreReal.text = superHeroeModelo.nombreReal
        publicista.text = superHeroeModelo.publicista
        Glide.with(foto.context).load(superHeroeModelo.foto).into(foto)
    }

}