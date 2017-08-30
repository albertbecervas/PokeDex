package com.omitsis.pokedex.dagger.setup.modules

import dagger.Module
import dagger.Provides
import okhttp3.logging.HttpLoggingInterceptor
import timber.log.Timber

@Module
class LoggerModule {

    @Provides
    fun provideLogger(): HttpLoggingInterceptor {
        return HttpLoggingInterceptor(HttpLoggingInterceptor.Logger { message -> Timber.d(message); })
    }

}