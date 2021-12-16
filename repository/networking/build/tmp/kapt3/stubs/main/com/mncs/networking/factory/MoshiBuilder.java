package com.mncs.networking.factory;

import java.lang.System;

@kotlin.Metadata(mv = {1, 5, 1}, k = 1, d1 = {"\u00002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0010\n\u0002\u0018\u0002\n\u0002\b\u0003\u0018\u00002\u00020\u0001B\r\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u00a2\u0006\u0002\u0010\u0004J\u000e\u0010\u0005\u001a\u00020\u00002\u0006\u0010\u0006\u001a\u00020\u0007J\"\u0010\u0005\u001a\u00020\u0000\"\u0004\b\u0000\u0010\b2\u0006\u0010\t\u001a\u00020\n2\f\u0010\u000b\u001a\b\u0012\u0004\u0012\u0002H\b0\fJ\u000e\u0010\u0005\u001a\u00020\u00002\u0006\u0010\u0006\u001a\u00020\u0001J1\u0010\r\u001a\u00020\u0000\"\u000e\b\u0000\u0010\b*\b\u0012\u0004\u0012\u0002H\b0\u000e2\f\u0010\t\u001a\b\u0012\u0004\u0012\u0002H\b0\u000f2\u0006\u0010\u0010\u001a\u0002H\b\u00a2\u0006\u0002\u0010\u0011R\u000e\u0010\u0002\u001a\u00020\u0003X\u0082\u0004\u00a2\u0006\u0002\n\u0000\u00a8\u0006\u0012"}, d2 = {"Lcom/mncs/networking/factory/MoshiBuilder;", "", "builder", "Lcom/squareup/moshi/Moshi$Builder;", "(Lcom/squareup/moshi/Moshi$Builder;)V", "add", "adapter", "Lcom/squareup/moshi/JsonAdapter$Factory;", "T", "type", "Ljava/lang/reflect/Type;", "jsonAdapter", "Lcom/squareup/moshi/JsonAdapter;", "addEnum", "", "Lkotlin/reflect/KClass;", "fallbackValue", "(Lkotlin/reflect/KClass;Ljava/lang/Enum;)Lcom/mncs/networking/factory/MoshiBuilder;", "networking"})
public final class MoshiBuilder {
    private final com.squareup.moshi.Moshi.Builder builder = null;
    
    public MoshiBuilder(@org.jetbrains.annotations.NotNull()
    com.squareup.moshi.Moshi.Builder builder) {
        super();
    }
    
    @org.jetbrains.annotations.NotNull()
    public final <T extends java.lang.Object>com.mncs.networking.factory.MoshiBuilder add(@org.jetbrains.annotations.NotNull()
    java.lang.reflect.Type type, @org.jetbrains.annotations.NotNull()
    com.squareup.moshi.JsonAdapter<T> jsonAdapter) {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final com.mncs.networking.factory.MoshiBuilder add(@org.jetbrains.annotations.NotNull()
    com.squareup.moshi.JsonAdapter.Factory adapter) {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final com.mncs.networking.factory.MoshiBuilder add(@org.jetbrains.annotations.NotNull()
    java.lang.Object adapter) {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final <T extends java.lang.Enum<T>>com.mncs.networking.factory.MoshiBuilder addEnum(@org.jetbrains.annotations.NotNull()
    kotlin.reflect.KClass<T> type, @org.jetbrains.annotations.NotNull()
    T fallbackValue) {
        return null;
    }
}