package com.omitsis.pokedex.mvp.listener

import com.omitsis.pokedex.model.PokeDex

interface PokemonListListener: BaseListener {

    fun onSuccess(pokeDex: PokeDex)

}