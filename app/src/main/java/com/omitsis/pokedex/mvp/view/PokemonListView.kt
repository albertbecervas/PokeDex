package com.omitsis.pokedex.mvp.view

import com.omitsis.pokedex.model.Pokemon

interface PokemonListView : BaseView {

    fun showPokemonList(pokemonList: List<Pokemon>)

}