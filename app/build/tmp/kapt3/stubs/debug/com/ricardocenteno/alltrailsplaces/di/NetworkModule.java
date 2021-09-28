package com.ricardocenteno.alltrailsplaces.di;

import com.ricardocenteno.alltrailsplaces.BuildConfig;
import com.ricardocenteno.alltrailsplaces.model.network.ApiInterceptor;
import com.ricardocenteno.alltrailsplaces.model.network.PlaceDtoMapper;
import com.ricardocenteno.alltrailsplaces.model.network.PlacesService;
import dagger.Module;
import dagger.Provides;
import dagger.hilt.InstallIn;
import dagger.hilt.components.SingletonComponent;
import javax.inject.Singleton;
import okhttp3.OkHttpClient;
import retrofit2.Retrofit;
import retrofit2.converter.gson.GsonConverterFactory;

@dagger.hilt.InstallIn(value = {dagger.hilt.components.SingletonComponent.class})
@kotlin.Metadata(mv = {1, 5, 1}, k = 1, d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\b\u00c7\u0002\u0018\u00002\u00020\u0001B\u0007\b\u0002\u00a2\u0006\u0002\u0010\u0002J\b\u0010\u0003\u001a\u00020\u0004H\u0007J\b\u0010\u0005\u001a\u00020\u0006H\u0007\u00a8\u0006\u0007"}, d2 = {"Lcom/ricardocenteno/alltrailsplaces/di/NetworkModule;", "", "()V", "providePlaceMapper", "Lcom/ricardocenteno/alltrailsplaces/model/network/PlaceDtoMapper;", "providePlacesService", "Lcom/ricardocenteno/alltrailsplaces/model/network/PlacesService;", "app_debug"})
@dagger.Module()
public final class NetworkModule {
    @org.jetbrains.annotations.NotNull()
    public static final com.ricardocenteno.alltrailsplaces.di.NetworkModule INSTANCE = null;
    
    private NetworkModule() {
        super();
    }
    
    @org.jetbrains.annotations.NotNull()
    @dagger.Provides()
    @javax.inject.Singleton()
    public final com.ricardocenteno.alltrailsplaces.model.network.PlaceDtoMapper providePlaceMapper() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    @dagger.Provides()
    @javax.inject.Singleton()
    public final com.ricardocenteno.alltrailsplaces.model.network.PlacesService providePlacesService() {
        return null;
    }
}