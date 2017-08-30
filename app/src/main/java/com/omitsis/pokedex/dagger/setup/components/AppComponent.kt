package com.omitsis.pokedex.dagger.setup.components

import com.omitsis.pokedex.dagger.components.PokemonListComponent
import com.omitsis.pokedex.dagger.modules.PokemonListModule
import com.omitsis.pokedex.dagger.setup.modules.*
import dagger.Component
import javax.inject.Singleton

@Singleton
@Component(modules = arrayOf(
        AppContextModule::class,
        RetrofitModule::class,
        ClientModule::class,
        GsonConverterModule::class,
        GsonModule::class,
        HostModule::class,
        LoggerModule::class
))
interface AppComponent {

    fun plus(pokemonListModule: PokemonListModule): PokemonListComponent

}