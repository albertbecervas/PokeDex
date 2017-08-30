package com.omitsis.pokedex.mvp.interactor.impl

import android.content.Context
import com.omitsis.pokedex.PokemonService
import com.omitsis.pokedex.R
import com.omitsis.pokedex.model.PokeDex
import com.omitsis.pokedex.mvp.interactor.PokemonListInteractor
import com.omitsis.pokedex.mvp.listener.PokemonListListener
import retrofit2.Call
import retrofit2.Callback
import retrofit2.Response
import retrofit2.Retrofit
import javax.inject.Inject

class PokemonListInteractorImpl @Inject constructor(val retrofit: Retrofit,
                                                    val pokemonService: PokemonService,
                                                    val appContext: Context) : PokemonListInteractor {

    lateinit var call: Call<PokeDex>

    override fun loadPokemonList(pokemonListListener: PokemonListListener) {


        call = pokemonService.getPokedex();
        call.enqueue(object : Callback<PokeDex> {
            override fun onResponse(call: Call<PokeDex>?, response: Response<PokeDex>?) {

                if (response != null && response.isSuccessful) {
                    pokemonListListener.onSuccess(response.body()!!)
                } else {
                    pokemonListListener.onFailure(appContext.getString(R.string.error_fetching_data))
                }

            }

            override fun onFailure(call: Call<PokeDex>?, t: Throwable?) {
                pokemonListListener.onFailure(appContext.getString(R.string.error_fetching_data))
            }
        })


    }

    override fun cancel() {
        call.cancel()
    }
}