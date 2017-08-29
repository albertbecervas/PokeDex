package com.omitsis.pokedex.activities

import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import com.omitsis.pokedex.R
import com.omitsis.pokedex.dagger.modules.PokemonListModule
import com.omitsis.pokedex.dagger.setup.components.AppComponent
import com.omitsis.pokedex.mvp.view.PokemonListView

class PokemonListActivity : BaseActivity() , PokemonListView{

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_pokemon_list)
    }

    override fun getActivityLayout(): Int = R.layout.activity_pokemon_list

    override fun injectDependencies(appComponent: AppComponent) {
        appComponent.plus(PokemonListModule(this)).inject(this)
    }

    override fun showPokemonList() {
        TODO("not implemented") //To change body of created functions use File | Settings | File Templates.
    }
}
