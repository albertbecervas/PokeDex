package com.omitsis.pokedex.dagger.components

import com.omitsis.pokedex.activities.PokemonListActivity
import com.omitsis.pokedex.dagger.modules.PokemonListModule
import dagger.Subcomponent

@Subcomponent(modules = arrayOf(PokemonListModule::class))
interface PokemonListComponent {

    fun inject(activity: PokemonListActivity)

}