package com.example.proyecto_2_computo_m.network

import com.example.proyecto_2_computo_m.model.Estudiante_hp
import com.example.proyecto_2_computo_m.model.Estudiante_hpItem
import com.example.proyecto_2_computo_m.model.Estudiante_hp_detailItem
import retrofit2.Call
import retrofit2.Callback
import retrofit2.http.GET
import retrofit2.http.Path
import retrofit2.http.Query
import retrofit2.http.Url

/**
 * Creado por Amaury Perea Matsumura el 12/05/23
 */
interface EstudiantesApi {

    @GET
    fun getGames(
        @Url url: String?    //getGames("cm/games/games_list.php")
    ): Call<ArrayList<Estudiante_hp>>
    @GET("api/characters/student")    //getGameDetail("3763783", "amaury")   cm/games/game_detail.php?id=3763783&name=Amaury
    fun getGameDetail(
        @Query("id") id: String? /*,
        @Query("name") name: String?*/
    ): Call<Estudiante_hp_detailItem>

    @GET("/api/character/{id}")   //getGameDetailApiary("433243", "amaury")     //game/game_detail/433243/amaury
    fun getGameDetailApiary(
        @Path("id") id: String?/*,
        @Path ("nombre") nombre: String?*/
    ): Call<Estudiante_hp_detailItem>

}