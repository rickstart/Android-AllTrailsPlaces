package com.ricardocenteno.alltrailsplaces.model.network;

import com.ricardocenteno.alltrailsplaces.model.network.response.GooglePlacesResponse;
import retrofit2.Response;
import retrofit2.http.GET;
import retrofit2.http.Query;

@kotlin.Metadata(mv = {1, 5, 1}, k = 1, d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0003\bf\u0018\u00002\u00020\u0001JA\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00040\u00032\b\b\u0001\u0010\u0005\u001a\u00020\u00062\b\b\u0001\u0010\u0007\u001a\u00020\u00062\b\b\u0001\u0010\b\u001a\u00020\t2\n\b\u0001\u0010\n\u001a\u0004\u0018\u00010\u0006H\u00a7@\u00f8\u0001\u0000\u00a2\u0006\u0002\u0010\u000b\u0082\u0002\u0004\n\u0002\b\u0019\u00a8\u0006\f"}, d2 = {"Lcom/ricardocenteno/alltrailsplaces/model/network/PlacesService;", "", "getNearbyPlacesFromLocation", "Lretrofit2/Response;", "Lcom/ricardocenteno/alltrailsplaces/model/network/response/GooglePlacesResponse;", "types", "", "location", "radius", "", "name", "(Ljava/lang/String;Ljava/lang/String;ILjava/lang/String;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "app_debug"})
public abstract interface PlacesService {
    
    @org.jetbrains.annotations.Nullable()
    @retrofit2.http.GET(value = "place/nearbysearch/json")
    public abstract java.lang.Object getNearbyPlacesFromLocation(@org.jetbrains.annotations.NotNull()
    @retrofit2.http.Query(value = "types")
    java.lang.String types, @org.jetbrains.annotations.NotNull()
    @retrofit2.http.Query(value = "location")
    java.lang.String location, @retrofit2.http.Query(value = "radius")
    int radius, @org.jetbrains.annotations.Nullable()
    @retrofit2.http.Query(value = "name")
    java.lang.String name, @org.jetbrains.annotations.NotNull()
    kotlin.coroutines.Continuation<? super retrofit2.Response<com.ricardocenteno.alltrailsplaces.model.network.response.GooglePlacesResponse>> continuation);
}