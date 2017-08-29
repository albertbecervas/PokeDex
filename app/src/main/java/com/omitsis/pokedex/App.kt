package com.omitsis.pokedex

import android.app.Application
import com.omitsis.pokedex.dagger.setup.components.AppComponent
import com.omitsis.pokedex.dagger.setup.components.DaggerAppComponent


class App : Application() {

    companion object {
        @JvmStatic lateinit var instance: App
        @JvmStatic lateinit var appComponent: AppComponent
    }

    override fun onCreate() {
        super.onCreate()
        instance = this
        appComponent = DaggerAppComponent.builder().build()
    }

}