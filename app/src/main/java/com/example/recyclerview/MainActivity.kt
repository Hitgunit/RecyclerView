package com.example.recyclerview

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Toast
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView
import com.example.recyclerview.adapter.SuperHeroeAdapter
import com.example.recyclerview.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {

    private lateinit var binding:ActivityMainBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)
        initRecyclerView()
    }

    private fun initRecyclerView(){
        binding.recyclerSuperHeroe.layoutManager = LinearLayoutManager(this)
        binding.recyclerSuperHeroe.adapter = SuperHeroeAdapter(SuperHeroeProveedor.listaSuperHeroes){superHeroe -> onItemSeleccionado(superHeroe) }
    }

    fun onItemSeleccionado(superHeroe: SuperHeroe){
        Toast.makeText(this, superHeroe.superHeroe, Toast.LENGTH_SHORT).show()
        Toast.makeText(this, superHeroe.nombreReal, Toast.LENGTH_SHORT).show()
    }
}