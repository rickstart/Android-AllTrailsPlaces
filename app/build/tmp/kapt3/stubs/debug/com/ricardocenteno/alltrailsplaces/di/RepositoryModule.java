package com.ricardocenteno.alltrailsplaces.di;

import com.ricardocenteno.alltrailsplaces.model.network.PlaceDtoMapper;
import com.ricardocenteno.alltrailsplaces.model.network.PlacesService;
import com.ricardocenteno.alltrailsplaces.model.repository.PlaceRepository;
import com.ricardocenteno.alltrailsplaces.model.repository.PlaceRepository_Impl;
import dagger.Module;
import dagger.Provides;
import dagger.hilt.InstallIn;
import dagger.hilt.components.SingletonComponent;
import javax.inject.Singleton;

@dagger.hilt.InstallIn(value = {dagger.hilt.components.SingletonComponent.class})
@kotlin.Metadata(mv = {1, 5, 1}, k = 1, d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\b\u00c7\u0002\u0018\u00002\u00020\u0001B\u0007\b\u0002\u00a2\u0006\u0002\u0010\u0002J\u0018\u0010\u0003\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u00062\u0006\u0010\u0007\u001a\u00020\bH\u0007\u00a8\u0006\t"}, d2 = {"Lcom/ricardocenteno/alltrailsplaces/di/RepositoryModule;", "", "()V", "provideRecipeRepository", "Lcom/ricardocenteno/alltrailsplaces/model/repository/PlaceRepository;", "placesService", "Lcom/ricardocenteno/alltrailsplaces/model/network/PlacesService;", "placesMapper", "Lcom/ricardocenteno/alltrailsplaces/model/network/PlaceDtoMapper;", "app_debug"})
@dagger.Module()
public final class RepositoryModule {
    @org.jetbrains.annotations.NotNull()
    public static final com.ricardocenteno.alltrailsplaces.di.RepositoryModule INSTANCE = null;
    
    private RepositoryModule() {
        super();
    }
    
    @org.jetbrains.annotations.NotNull()
    @dagger.Provides()
    @javax.inject.Singleton()
    public final com.ricardocenteno.alltrailsplaces.model.repository.PlaceRepository provideRecipeRepository(@org.jetbrains.annotations.NotNull()
    com.ricardocenteno.alltrailsplaces.model.network.PlacesService placesService, @org.jetbrains.annotations.NotNull()
    com.ricardocenteno.alltrailsplaces.model.network.PlaceDtoMapper placesMapper) {
        return null;
    }
}