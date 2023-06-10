package com.example.proyecto_2_computo_m

import com.example.proyecto_2_computo_m.model.Estudiante_hp
import retrofit2.Call
import retrofit2.http.GET

interface HogwartsApiService {
    @GET("api/characters/students")
    fun getStudents(): Call<List<Estudiante_hp>>
}
