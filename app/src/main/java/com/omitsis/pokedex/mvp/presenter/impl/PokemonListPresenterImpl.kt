package com.omitsis.pokedex.mvp.presenter.impl

import com.omitsis.pokedex.extensions.id
import com.omitsis.pokedex.model.PokeDex
import com.omitsis.pokedex.model.Pokemon
import com.omitsis.pokedex.mvp.interactor.PokemonListInteractor
import com.omitsis.pokedex.mvp.listener.PokemonListListener
import com.omitsis.pokedex.mvp.presenter.PokemonListPresenter
import com.omitsis.pokedex.mvp.view.PokemonListView
import java.util.*
import javax.inject.Inject

class PokemonListPresenterImpl @Inject constructor(var pokemonListView: PokemonListView,
                                                   var pokemonListInteractor: PokemonListInteractor)
    : PokemonListPresenter {

    override fun loadPokemonList() {

        pokemonListView.showProgress()

        pokemonListInteractor.loadPokemonList(object : PokemonListListener{
            override fun onSuccess(pokeDex: PokeDex) {
                val pokemonList: List<Pokemon> = pokeDex.pokemonList

                Collections.sort(pokemonList) { x, y -> x.id() - y.id() }

                pokemonListView.showPokemonList(pokeDex.pokemonList)
                pokemonListView.hideProgress()
            }

            override fun onFailure(message: String) {
                pokemonListView.hideProgress()
                pokemonListView.showMessage(message)
            }

        })

    }

    override fun cancel() {
        pokemonListInteractor.cancel()
    }
}