package com.ricardocenteno.alltrailsplaces.di

import com.ricardocenteno.alltrailsplaces.model.network.PlaceDtoMapper
import com.ricardocenteno.alltrailsplaces.model.network.PlacesService
import com.ricardocenteno.alltrailsplaces.model.repository.PlaceRepository
import com.ricardocenteno.alltrailsplaces.model.repository.PlaceRepository_Impl

import dagger.Module
import dagger.Provides
import dagger.hilt.InstallIn
import dagger.hilt.components.SingletonComponent
import javax.inject.Singleton

@Module
@InstallIn(SingletonComponent::class)
object RepositoryModule {

    @Singleton
    @Provides
    fun provideRecipeRepository(
        placesService: PlacesService,
        placesMapper: PlaceDtoMapper,
    ): PlaceRepository{
        return PlaceRepository_Impl(
            placesService = placesService,
            mapper = placesMapper
        )
    }
}