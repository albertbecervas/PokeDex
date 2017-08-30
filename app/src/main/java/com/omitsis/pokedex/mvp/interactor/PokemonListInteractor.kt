package com.omitsis.pokedex.mvp.interactor

import com.omitsis.pokedex.mvp.listener.PokemonListListener

interface PokemonListInteractor: BaseInteractor {

    fun loadPokemonList(pokemonListListener: PokemonListListener)

}