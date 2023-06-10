package com.example.proyecto_2_computo_m
import android.content.Context
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.BaseAdapter
import com.example.proyecto_2_computo_m.databinding.PersonajesBinding

import com.example.proyecto_2_computo_m.model.Estudiante_hp

class Adapter(val context: Context, val datos: ArrayList<Estudiante_hp>): BaseAdapter() {

        val inflater: LayoutInflater = LayoutInflater.from(context)

        override fun getCount(): Int = datos.size

        override fun getItem(position: Int): Any = datos[position]

        override fun getItemId(position: Int): Long = datos[position].id

        override fun getView(position: Int, convertView: View?, parent: ViewGroup?): View {

            val binding =  PersonajesBinding.inflate(inflater)

            with(binding) {
                idNombre.text = datos[position].nombre
                idActor.text = datos[position].actor
            }

            return binding.root

        }
    }
