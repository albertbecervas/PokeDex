package com.omitsis.pokedex.dagger.modules

import com.omitsis.pokedex.mvp.interactor.PokemonListInteractor
import com.omitsis.pokedex.mvp.interactor.impl.PokemonListInteractorImpl
import com.omitsis.pokedex.mvp.presenter.PokemonListPresenter
import com.omitsis.pokedex.mvp.presenter.impl.PokemonListPresenterImpl
import com.omitsis.pokedex.mvp.view.PokemonListView
import dagger.Module
import dagger.Provides

@Module
class PokemonListModule(val pokemonListView: PokemonListView) {

    @Provides
    fun provideView(): PokemonListView = pokemonListView

    @Provides
    fun providePresenter(pokemonListPresenter: PokemonListPresenterImpl): PokemonListPresenter = pokemonListPresenter

    @Provides
    fun provideInteractor(pokemonListInteractor: PokemonListInteractorImpl): PokemonListInteractor = pokemonListInteractor

}