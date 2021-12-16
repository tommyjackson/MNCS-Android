package com.mncs.networking.factory;

import java.lang.System;

@kotlin.Metadata(mv = {1, 5, 1}, k = 1, d1 = {"\u0000<\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\u0018\u0002\n\u0000\u0018\u00002\u00020\u0001B\u0015\u0012\u000e\b\u0002\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003\u00a2\u0006\u0002\u0010\u0005J\u001f\u0010\u000f\u001a\u00020\u00102\u0017\u0010\u0011\u001a\u0013\u0012\u0004\u0012\u00020\u0013\u0012\u0004\u0012\u00020\u00140\u0012\u00a2\u0006\u0002\b\u0015R#\u0010\u0006\u001a\n \b*\u0004\u0018\u00010\u00070\u00078@X\u0080\u0084\u0002\u00a2\u0006\f\n\u0004\b\u000b\u0010\f\u001a\u0004\b\t\u0010\nR\u000e\u0010\r\u001a\u00020\u000eX\u0082\u0004\u00a2\u0006\u0002\n\u0000\u00a8\u0006\u0016"}, d2 = {"Lcom/mncs/networking/factory/NetworkFactory;", "", "clientBuilder", "Lkotlin/Function0;", "Lokhttp3/OkHttpClient$Builder;", "(Lkotlin/jvm/functions/Function0;)V", "rootClient", "Lokhttp3/OkHttpClient;", "kotlin.jvm.PlatformType", "getRootClient$networking", "()Lokhttp3/OkHttpClient;", "rootClient$delegate", "Lkotlin/Lazy;", "rootMoshi", "Lcom/squareup/moshi/Moshi;", "build", "Lretrofit2/Retrofit;", "configuration", "Lkotlin/Function1;", "Lcom/mncs/networking/factory/NetworkOptions;", "", "Lkotlin/ExtensionFunctionType;", "networking"})
public final class NetworkFactory {
    private final kotlin.Lazy rootClient$delegate = null;
    private final com.squareup.moshi.Moshi rootMoshi = null;
    
    public NetworkFactory() {
        super();
    }
    
    public NetworkFactory(@org.jetbrains.annotations.NotNull()
    kotlin.jvm.functions.Function0<okhttp3.OkHttpClient.Builder> clientBuilder) {
        super();
    }
    
    public final okhttp3.OkHttpClient getRootClient$networking() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final retrofit2.Retrofit build(@org.jetbrains.annotations.NotNull()
    kotlin.jvm.functions.Function1<? super com.mncs.networking.factory.NetworkOptions, kotlin.Unit> configuration) {
        return null;
    }
}