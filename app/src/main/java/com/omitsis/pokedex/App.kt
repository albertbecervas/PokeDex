package com.omitsis.pokedex

import android.app.Application
import com.omitsis.pokedex.dagger.setup.components.AppComponent
import com.omitsis.pokedex.dagger.setup.components.DaggerAppComponent
import timber.log.Timber


class App : Application() {

    companion object {
        @JvmStatic lateinit var instance: App
        @JvmStatic lateinit var appComponent: AppComponent
    }

    override fun onCreate() {
        super.onCreate()
        Timber.plant(Timber.DebugTree())
        instance = this
        appComponent = DaggerAppComponent.create()
    }

}