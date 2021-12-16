package com.mncs.networking.response;

import java.lang.System;

@kotlin.Metadata(mv = {1, 5, 1}, k = 1, d1 = {"\u0000:\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0018\u0000 \u0014*\b\b\u0000\u0010\u0001*\u00020\u00022\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u0002H\u00010\u00040\u0003:\u0001\u0014B\u001b\u0012\f\u0010\u0005\u001a\b\u0012\u0004\u0012\u00028\u00000\u0003\u0012\u0006\u0010\u0006\u001a\u00020\u0007\u00a2\u0006\u0002\u0010\bJ\u0018\u0010\f\u001a\n\u0012\u0004\u0012\u00028\u0000\u0018\u00010\u00042\u0006\u0010\r\u001a\u00020\u000eH\u0016J \u0010\u000f\u001a\u00020\u00102\u0006\u0010\u0011\u001a\u00020\u00122\u000e\u0010\u0013\u001a\n\u0012\u0004\u0012\u00028\u0000\u0018\u00010\u0004H\u0016R\u0014\u0010\u0005\u001a\b\u0012\u0004\u0012\u00028\u00000\u0003X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0006\u001a\u00020\u0007X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u0016\u0010\t\u001a\n \u000b*\u0004\u0018\u00010\n0\nX\u0082\u0004\u00a2\u0006\u0002\n\u0000\u00a8\u0006\u0015"}, d2 = {"Lcom/mncs/networking/response/GenericResponseAdapter;", "T", "", "Lcom/squareup/moshi/JsonAdapter;", "Lcom/mncs/networking/response/GenericResponse;", "adapter", "moshi", "Lcom/squareup/moshi/Moshi;", "(Lcom/squareup/moshi/JsonAdapter;Lcom/squareup/moshi/Moshi;)V", "topLevelKeys", "Lcom/squareup/moshi/JsonReader$Options;", "kotlin.jvm.PlatformType", "fromJson", "reader", "Lcom/squareup/moshi/JsonReader;", "toJson", "", "writer", "Lcom/squareup/moshi/JsonWriter;", "value", "Companion", "networking"})
public final class GenericResponseAdapter<T extends java.lang.Object> extends com.squareup.moshi.JsonAdapter<com.mncs.networking.response.GenericResponse<T>> {
    private final com.squareup.moshi.JsonAdapter<T> adapter = null;
    private final com.squareup.moshi.Moshi moshi = null;
    private final com.squareup.moshi.JsonReader.Options topLevelKeys = null;
    @org.jetbrains.annotations.NotNull()
    public static final com.mncs.networking.response.GenericResponseAdapter.Companion Companion = null;
    private static final java.lang.String DATA_KEY = "data";
    private static final java.lang.String METADATA_KEY = "meta";
    
    public GenericResponseAdapter(@org.jetbrains.annotations.NotNull()
    com.squareup.moshi.JsonAdapter<T> adapter, @org.jetbrains.annotations.NotNull()
    com.squareup.moshi.Moshi moshi) {
        super();
    }
    
    @org.jetbrains.annotations.Nullable()
    @java.lang.Override()
    public com.mncs.networking.response.GenericResponse<T> fromJson(@org.jetbrains.annotations.NotNull()
    com.squareup.moshi.JsonReader reader) {
        return null;
    }
    
    @java.lang.Override()
    public void toJson(@org.jetbrains.annotations.NotNull()
    com.squareup.moshi.JsonWriter writer, @org.jetbrains.annotations.Nullable()
    com.mncs.networking.response.GenericResponse<T> value) {
    }
    
    @kotlin.Metadata(mv = {1, 5, 1}, k = 1, d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\b\u0086\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002\u00a2\u0006\u0002\u0010\u0002R\u000e\u0010\u0003\u001a\u00020\u0004X\u0082T\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0005\u001a\u00020\u0004X\u0082T\u00a2\u0006\u0002\n\u0000\u00a8\u0006\u0006"}, d2 = {"Lcom/mncs/networking/response/GenericResponseAdapter$Companion;", "", "()V", "DATA_KEY", "", "METADATA_KEY", "networking"})
    public static final class Companion {
        
        private Companion() {
            super();
        }
    }
}