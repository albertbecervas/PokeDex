package com.omitsis.pokedex.activities

import android.os.Bundle
import android.support.v7.widget.LinearLayoutManager
import android.support.v7.widget.RecyclerView
import com.omitsis.pokedex.R
import com.omitsis.pokedex.adapter.PokemonListAdapter
import com.omitsis.pokedex.dagger.modules.PokemonListModule
import com.omitsis.pokedex.dagger.setup.components.AppComponent
import com.omitsis.pokedex.model.Pokemon
import com.omitsis.pokedex.mvp.presenter.PokemonListPresenter
import com.omitsis.pokedex.mvp.view.PokemonListView
import org.jetbrains.anko.toast
import java.util.ArrayList
import javax.inject.Inject

class PokemonListActivity : BaseActivity() , PokemonListView{

    lateinit var pokemonListRv: RecyclerView

    lateinit var pokemonAdapter: PokemonListAdapter

    @Inject
    protected lateinit var presenter: PokemonListPresenter

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(getActivityLayout())

        pokemonListRv = findViewById(R.id.recycler_pokemon) as RecyclerView

        presenter.loadPokemonList()
    }


    override fun injectDependencies(appComponent: AppComponent) {
        appComponent.plus(PokemonListModule(this)).inject(this)
    }

    override fun getActivityLayout(): Int = R.layout.activity_pokemon_list

    override fun showPokemonList(pokemonList: List<Pokemon>) {
        pokemonListRv.layoutManager = LinearLayoutManager(this)
        pokemonAdapter = PokemonListAdapter( this, pokemonList)
        pokemonListRv.adapter = pokemonAdapter
    }
}
