package com.ricardocenteno.alltrailsplaces.model.repository;

import android.util.Log;
import com.ricardocenteno.alltrailsplaces.model.domain.model.Place;
import com.ricardocenteno.alltrailsplaces.model.network.PlaceDtoMapper;
import com.ricardocenteno.alltrailsplaces.model.network.PlacesService;
import com.ricardocenteno.alltrailsplaces.model.network.model.PlaceDto;

@kotlin.Metadata(mv = {1, 5, 1}, k = 1, d1 = {"\u00002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0006\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0002\u0018\u00002\u00020\u0001B\u0015\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u00a2\u0006\u0002\u0010\u0006J\'\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\t0\b2\u0006\u0010\n\u001a\u00020\u000b2\u0006\u0010\f\u001a\u00020\u000bH\u0096@\u00f8\u0001\u0000\u00a2\u0006\u0002\u0010\rJ/\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\t0\b2\u0006\u0010\n\u001a\u00020\u000b2\u0006\u0010\f\u001a\u00020\u000b2\u0006\u0010\u000e\u001a\u00020\u000fH\u0096@\u00f8\u0001\u0000\u00a2\u0006\u0002\u0010\u0010R\u000e\u0010\u0004\u001a\u00020\u0005X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0002\u001a\u00020\u0003X\u0082\u0004\u00a2\u0006\u0002\n\u0000\u0082\u0002\u0004\n\u0002\b\u0019\u00a8\u0006\u0011"}, d2 = {"Lcom/ricardocenteno/alltrailsplaces/model/repository/PlaceRepository_Impl;", "Lcom/ricardocenteno/alltrailsplaces/model/repository/PlaceRepository;", "placesService", "Lcom/ricardocenteno/alltrailsplaces/model/network/PlacesService;", "mapper", "Lcom/ricardocenteno/alltrailsplaces/model/network/PlaceDtoMapper;", "(Lcom/ricardocenteno/alltrailsplaces/model/network/PlacesService;Lcom/ricardocenteno/alltrailsplaces/model/network/PlaceDtoMapper;)V", "searchRestaurants", "", "Lcom/ricardocenteno/alltrailsplaces/model/domain/model/Place;", "lat", "", "lng", "(DDLkotlin/coroutines/Continuation;)Ljava/lang/Object;", "name", "", "(DDLjava/lang/String;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "app_debug"})
public final class PlaceRepository_Impl implements com.ricardocenteno.alltrailsplaces.model.repository.PlaceRepository {
    private final com.ricardocenteno.alltrailsplaces.model.network.PlacesService placesService = null;
    private final com.ricardocenteno.alltrailsplaces.model.network.PlaceDtoMapper mapper = null;
    
    public PlaceRepository_Impl(@org.jetbrains.annotations.NotNull()
    com.ricardocenteno.alltrailsplaces.model.network.PlacesService placesService, @org.jetbrains.annotations.NotNull()
    com.ricardocenteno.alltrailsplaces.model.network.PlaceDtoMapper mapper) {
        super();
    }
    
    @org.jetbrains.annotations.Nullable()
    @java.lang.Override()
    public java.lang.Object searchRestaurants(double lat, double lng, @org.jetbrains.annotations.NotNull()
    kotlin.coroutines.Continuation<? super java.util.List<com.ricardocenteno.alltrailsplaces.model.domain.model.Place>> continuation) {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable()
    @java.lang.Override()
    public java.lang.Object searchRestaurants(double lat, double lng, @org.jetbrains.annotations.NotNull()
    java.lang.String name, @org.jetbrains.annotations.NotNull()
    kotlin.coroutines.Continuation<? super java.util.List<com.ricardocenteno.alltrailsplaces.model.domain.model.Place>> continuation) {
        return null;
    }
}