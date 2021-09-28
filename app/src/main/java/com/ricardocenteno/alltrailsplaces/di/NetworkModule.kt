package com.ricardocenteno.alltrailsplaces.di

import com.ricardocenteno.alltrailsplaces.BuildConfig
import com.ricardocenteno.alltrailsplaces.model.network.ApiInterceptor
import com.ricardocenteno.alltrailsplaces.model.network.PlaceDtoMapper
import com.ricardocenteno.alltrailsplaces.model.network.PlacesService
import dagger.Module
import dagger.Provides
import dagger.hilt.InstallIn
import dagger.hilt.components.SingletonComponent
import javax.inject.Singleton
import okhttp3.OkHttpClient
import retrofit2.Retrofit
import retrofit2.converter.gson.GsonConverterFactory

@Module
@InstallIn(SingletonComponent::class)
object NetworkModule {

    @Singleton
    @Provides
    fun providePlaceMapper(): PlaceDtoMapper {
        return PlaceDtoMapper()
    }

    @Singleton
    @Provides
    fun providePlacesService(): PlacesService {
        val httpClient = OkHttpClient.Builder().addInterceptor(ApiInterceptor()).build()
        return Retrofit.Builder()
            .baseUrl(BuildConfig.URL_API)
            .addConverterFactory(GsonConverterFactory.create())
            .client(httpClient)
            .build()
            .create(PlacesService::class.java)
    }
}