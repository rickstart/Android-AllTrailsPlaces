package com.ricardocenteno.alltrailsplaces.model.network.model;

import com.google.gson.annotations.SerializedName;

@kotlin.Metadata(mv = {1, 5, 1}, k = 1, d1 = {"\u00004\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u000e\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\b\u0086\b\u0018\u00002\u00020\u0001B3\u0012\b\u0010\u0002\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0006\u0012\u000e\u0010\u0007\u001a\n\u0012\u0004\u0012\u00020\t\u0018\u00010\b\u00a2\u0006\u0002\u0010\nJ\u000b\u0010\u0012\u001a\u0004\u0018\u00010\u0003H\u00c6\u0003J\u000b\u0010\u0013\u001a\u0004\u0018\u00010\u0003H\u00c6\u0003J\u000b\u0010\u0014\u001a\u0004\u0018\u00010\u0006H\u00c6\u0003J\u0011\u0010\u0015\u001a\n\u0012\u0004\u0012\u00020\t\u0018\u00010\bH\u00c6\u0003J?\u0010\u0016\u001a\u00020\u00002\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u00062\u0010\b\u0002\u0010\u0007\u001a\n\u0012\u0004\u0012\u00020\t\u0018\u00010\bH\u00c6\u0001J\u0013\u0010\u0017\u001a\u00020\u00182\b\u0010\u0019\u001a\u0004\u0018\u00010\u0001H\u00d6\u0003J\t\u0010\u001a\u001a\u00020\u001bH\u00d6\u0001J\t\u0010\u001c\u001a\u00020\u0003H\u00d6\u0001R\u0018\u0010\u0004\u001a\u0004\u0018\u00010\u00038\u0006X\u0087\u0004\u00a2\u0006\b\n\u0000\u001a\u0004\b\u000b\u0010\fR\u0018\u0010\u0005\u001a\u0004\u0018\u00010\u00068\u0006X\u0087\u0004\u00a2\u0006\b\n\u0000\u001a\u0004\b\r\u0010\u000eR\u0018\u0010\u0002\u001a\u0004\u0018\u00010\u00038\u0006X\u0087\u0004\u00a2\u0006\b\n\u0000\u001a\u0004\b\u000f\u0010\fR\u001e\u0010\u0007\u001a\n\u0012\u0004\u0012\u00020\t\u0018\u00010\b8\u0006X\u0087\u0004\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0010\u0010\u0011\u00a8\u0006\u001d"}, d2 = {"Lcom/ricardocenteno/alltrailsplaces/model/network/model/PlaceDto;", "", "name", "", "businessStatus", "geometry", "Lcom/ricardocenteno/alltrailsplaces/model/network/model/GeometryDto;", "photos", "", "Lcom/ricardocenteno/alltrailsplaces/model/network/model/PhotoDto;", "(Ljava/lang/String;Ljava/lang/String;Lcom/ricardocenteno/alltrailsplaces/model/network/model/GeometryDto;Ljava/util/List;)V", "getBusinessStatus", "()Ljava/lang/String;", "getGeometry", "()Lcom/ricardocenteno/alltrailsplaces/model/network/model/GeometryDto;", "getName", "getPhotos", "()Ljava/util/List;", "component1", "component2", "component3", "component4", "copy", "equals", "", "other", "hashCode", "", "toString", "app_debug"})
public final class PlaceDto {
    @org.jetbrains.annotations.Nullable()
    @com.google.gson.annotations.SerializedName(value = "name")
    private final java.lang.String name = null;
    @org.jetbrains.annotations.Nullable()
    @com.google.gson.annotations.SerializedName(value = "business_status")
    private final java.lang.String businessStatus = null;
    @org.jetbrains.annotations.Nullable()
    @com.google.gson.annotations.SerializedName(value = "geometry")
    private final com.ricardocenteno.alltrailsplaces.model.network.model.GeometryDto geometry = null;
    @org.jetbrains.annotations.Nullable()
    @com.google.gson.annotations.SerializedName(value = "photos")
    private final java.util.List<com.ricardocenteno.alltrailsplaces.model.network.model.PhotoDto> photos = null;
    
    @org.jetbrains.annotations.NotNull()
    public final com.ricardocenteno.alltrailsplaces.model.network.model.PlaceDto copy(@org.jetbrains.annotations.Nullable()
    java.lang.String name, @org.jetbrains.annotations.Nullable()
    java.lang.String businessStatus, @org.jetbrains.annotations.Nullable()
    com.ricardocenteno.alltrailsplaces.model.network.model.GeometryDto geometry, @org.jetbrains.annotations.Nullable()
    java.util.List<com.ricardocenteno.alltrailsplaces.model.network.model.PhotoDto> photos) {
        return null;
    }
    
    @java.lang.Override()
    public boolean equals(@org.jetbrains.annotations.Nullable()
    java.lang.Object other) {
        return false;
    }
    
    @java.lang.Override()
    public int hashCode() {
        return 0;
    }
    
    @org.jetbrains.annotations.NotNull()
    @java.lang.Override()
    public java.lang.String toString() {
        return null;
    }
    
    public PlaceDto(@org.jetbrains.annotations.Nullable()
    java.lang.String name, @org.jetbrains.annotations.Nullable()
    java.lang.String businessStatus, @org.jetbrains.annotations.Nullable()
    com.ricardocenteno.alltrailsplaces.model.network.model.GeometryDto geometry, @org.jetbrains.annotations.Nullable()
    java.util.List<com.ricardocenteno.alltrailsplaces.model.network.model.PhotoDto> photos) {
        super();
    }
    
    @org.jetbrains.annotations.Nullable()
    public final java.lang.String component1() {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable()
    public final java.lang.String getName() {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable()
    public final java.lang.String component2() {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable()
    public final java.lang.String getBusinessStatus() {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable()
    public final com.ricardocenteno.alltrailsplaces.model.network.model.GeometryDto component3() {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable()
    public final com.ricardocenteno.alltrailsplaces.model.network.model.GeometryDto getGeometry() {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable()
    public final java.util.List<com.ricardocenteno.alltrailsplaces.model.network.model.PhotoDto> component4() {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable()
    public final java.util.List<com.ricardocenteno.alltrailsplaces.model.network.model.PhotoDto> getPhotos() {
        return null;
    }
}