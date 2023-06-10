package com.example.proyecto_2_computo_m

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Toast


import com.example.proyecto_2_computo_m.databinding.ActivityListaPersonajesBinding
import com.example.proyecto_2_computo_m.model.Estudiante_hp
import kotlin.random.Random

class Lista_Personajes : AppCompatActivity() {
    private  lateinit var binding : ActivityListaPersonajesBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityListaPersonajesBinding.inflate(layoutInflater)
        setContentView(binding.root)

        val datos = ArrayList<Estudiante_hp>()

        for (i in 1..50) {
            val animeTmp = Estudiante_hp(
                i + Random.nextLong(10000),
                "Nombre $i",
                "Actor $i",
            )
            datos.add(animeTmp)
        }

        val miAdapter = Adapter(this, datos)

        binding.listView.adapter = miAdapter


        binding.listView.setOnItemClickListener { parent, view, position, id ->


            mensaje("Clic en el elemento con posición $position y id $id")

            /*.makeText(
                this,
                "Clic en el elemento con posición $position y id $id",
                Toast.LENGTH_LONG
            ).show()*/

            val anime = parent.adapter.getItem(position) as Estudiante_hp

            /*Toast.makeText(
                this,
                "Clic en el elemento con título: ${anime.titulo}",
                Toast.LENGTH_LONG
            ).show()*/

            mensaje("Clic en el elemento con título: ${anime.nombre}", Toast.LENGTH_LONG)

        }
    }
}
