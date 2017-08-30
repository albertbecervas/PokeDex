package com.omitsis.pokedex

import com.omitsis.pokedex.model.PokeDex
import com.omitsis.pokedex.model.Pokemon
import retrofit2.Call
import retrofit2.http.GET
import retrofit2.http.Path

interface PokemonService {

    @GET("/api/v1/pokedex/1") fun getPokedex(): Call<PokeDex>

    @GET("/{resource_uri}") fun getPokemon(@Path("resource_uri") resourceUri: String): Call<Pokemon>

}