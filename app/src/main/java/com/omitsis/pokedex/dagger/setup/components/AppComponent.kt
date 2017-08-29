package com.omitsis.pokedex.dagger.setup.components

import com.omitsis.pokedex.dagger.components.PokemonListComponent
import com.omitsis.pokedex.dagger.modules.PokemonListModule
import com.omitsis.pokedex.dagger.setup.modules.AppContextModule
import com.omitsis.pokedex.dagger.setup.modules.HostModule
import com.omitsis.pokedex.dagger.setup.modules.RetrofitModule
import dagger.Component
import javax.inject.Singleton

@Singleton
@Component(modules = arrayOf(
        AppContextModule::class,
        RetrofitModule::class,
        HostModule::class
))
interface AppComponent {

    fun plus(pokemonListModule: PokemonListModule): PokemonListComponent

}