package com.omitsis.pokedex.dagger.setup.modules

import com.omitsis.pokedex.PokemonService
import dagger.Module
import dagger.Provides
import okhttp3.OkHttpClient
import retrofit2.Converter
import retrofit2.Retrofit
import javax.inject.Singleton

@Module
class RetrofitModule {

    @Provides
    @Singleton
    fun provideRetrofit(httpClient: OkHttpClient, baseUrl: String, converter: Converter.Factory): Retrofit {

        return Retrofit.Builder()
                .baseUrl(baseUrl)
                .addConverterFactory(converter)
                .client(httpClient).build()

    }

    @Provides
    @Singleton
    fun provideService(retrofit: Retrofit): PokemonService {
        return retrofit.create(PokemonService::class.java)
    }

}