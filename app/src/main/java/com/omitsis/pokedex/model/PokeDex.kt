package com.omitsis.pokedex.model

import com.google.gson.annotations.SerializedName

data class PokeDex(@SerializedName("pokemon") val pokemonList: List<Pokemon>)