package com.example.recyclerview.adapter

import android.content.DialogInterface.OnClickListener
import android.view.View
import android.widget.ImageView
import android.widget.TextView
import android.widget.Toast
import androidx.recyclerview.widget.RecyclerView
import com.bumptech.glide.Glide
import com.example.recyclerview.R
import com.example.recyclerview.SuperHeroe
import com.example.recyclerview.databinding.ItemSuperheroeBinding

class SuperHeroeViewHolder(val view: View) : RecyclerView.ViewHolder(view) {

    val binding = ItemSuperheroeBinding.bind(view)


    fun render(superHeroeModelo: SuperHeroe, onClickListener: (SuperHeroe)->Unit) {
        binding.tvSuperHeroe.text = superHeroeModelo.superHeroe
        binding.tvNombreReal.text = superHeroeModelo.nombreReal
        binding.tvPublicista.text = superHeroeModelo.publicista
        Glide.with(binding.ivSuperheroe.context).load(superHeroeModelo.foto)
            .into(binding.ivSuperheroe)
        itemView.setOnClickListener{
            onClickListener(superHeroeModelo)
        }
    }

}