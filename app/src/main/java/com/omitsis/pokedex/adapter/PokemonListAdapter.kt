package com.omitsis.pokedex.adapter

import android.content.Context
import android.support.v7.widget.RecyclerView
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import com.omitsis.pokedex.R
import com.omitsis.pokedex.model.Pokemon
import kotlinx.android.synthetic.main.list_item_pokemon.view.*

class PokemonListAdapter(val context: Context, val pokemonList: List<Pokemon>) : RecyclerView.Adapter<PokemonListAdapter.PokemonListViewHolder>() {
    override fun onCreateViewHolder(parent: ViewGroup?, viewType: Int): PokemonListViewHolder? =
            PokemonListViewHolder(LayoutInflater.from(context).inflate(R.layout.list_item_pokemon, parent, false))

    override fun onBindViewHolder(holder: PokemonListViewHolder?, position: Int) {
        val pokemon: Pokemon = pokemonList[position]
        holder?.bind(pokemon)
    }

    override fun getItemCount(): Int = pokemonList.size

    class PokemonListViewHolder(itemView: View) : RecyclerView.ViewHolder(itemView) {

        fun bind(pokemon: Pokemon) {
            with(pokemon) {
                itemView.pokemon_name.text = pokemon.name
            }
        }

    }
}