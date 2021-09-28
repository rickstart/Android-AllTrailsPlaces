package com.ricardocenteno.alltrailsplaces.model.repository;

import com.ricardocenteno.alltrailsplaces.model.domain.model.Place;

@kotlin.Metadata(mv = {1, 5, 1}, k = 1, d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0006\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0002\bf\u0018\u00002\u00020\u0001J\'\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00040\u00032\u0006\u0010\u0005\u001a\u00020\u00062\u0006\u0010\u0007\u001a\u00020\u0006H\u00a6@\u00f8\u0001\u0000\u00a2\u0006\u0002\u0010\bJ/\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00040\u00032\u0006\u0010\u0005\u001a\u00020\u00062\u0006\u0010\u0007\u001a\u00020\u00062\u0006\u0010\t\u001a\u00020\nH\u00a6@\u00f8\u0001\u0000\u00a2\u0006\u0002\u0010\u000b\u0082\u0002\u0004\n\u0002\b\u0019\u00a8\u0006\f"}, d2 = {"Lcom/ricardocenteno/alltrailsplaces/model/repository/PlaceRepository;", "", "searchRestaurants", "", "Lcom/ricardocenteno/alltrailsplaces/model/domain/model/Place;", "lat", "", "lng", "(DDLkotlin/coroutines/Continuation;)Ljava/lang/Object;", "name", "", "(DDLjava/lang/String;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "app_debug"})
public abstract interface PlaceRepository {
    
    @org.jetbrains.annotations.Nullable()
    public abstract java.lang.Object searchRestaurants(double lat, double lng, @org.jetbrains.annotations.NotNull()
    kotlin.coroutines.Continuation<? super java.util.List<com.ricardocenteno.alltrailsplaces.model.domain.model.Place>> continuation);
    
    @org.jetbrains.annotations.Nullable()
    public abstract java.lang.Object searchRestaurants(double lat, double lng, @org.jetbrains.annotations.NotNull()
    java.lang.String name, @org.jetbrains.annotations.NotNull()
    kotlin.coroutines.Continuation<? super java.util.List<com.ricardocenteno.alltrailsplaces.model.domain.model.Place>> continuation);
}