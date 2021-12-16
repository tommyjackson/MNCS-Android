package com.mncs.networking.factory;

import java.lang.System;

@kotlin.Metadata(mv = {1, 5, 1}, k = 1, d1 = {"\u0000D\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0005\n\u0002\u0010\u000e\n\u0002\b\u0005\n\u0002\u0010!\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\u0018\u00002\u00020\u0001B\r\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u00a2\u0006\u0002\u0010\u0004J\u000e\u0010\u0018\u001a\u00020\u00192\u0006\u0010\u001a\u001a\u00020\u0013J\u0006\u0010\u0005\u001a\u00020\u0019J\u000e\u0010\u000b\u001a\u00020\u00192\u0006\u0010\u000b\u001a\u00020\fJ\u001f\u0010\u001b\u001a\u00020\u00192\u0017\u0010\u001c\u001a\u0013\u0012\u0004\u0012\u00020\u001e\u0012\u0004\u0012\u00020\u00190\u001d\u00a2\u0006\u0002\b\u001fR\u001a\u0010\u0005\u001a\u00020\u0006X\u0080\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u0007\u0010\b\"\u0004\b\t\u0010\nR\u001c\u0010\u000b\u001a\u0004\u0018\u00010\fX\u0080\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\r\u0010\u000e\"\u0004\b\u000f\u0010\u0010R\u001a\u0010\u0011\u001a\b\u0012\u0004\u0012\u00020\u00130\u0012X\u0080\u0004\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0014\u0010\u0015R\u0014\u0010\u0002\u001a\u00020\u0003X\u0080\u0004\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0016\u0010\u0017\u00a8\u0006 "}, d2 = {"Lcom/mncs/networking/factory/NetworkOptions;", "", "moshiBuilder", "Lcom/squareup/moshi/Moshi$Builder;", "(Lcom/squareup/moshi/Moshi$Builder;)V", "applyJwt", "", "getApplyJwt$networking", "()Z", "setApplyJwt$networking", "(Z)V", "baseUrl", "", "getBaseUrl$networking", "()Ljava/lang/String;", "setBaseUrl$networking", "(Ljava/lang/String;)V", "interceptors", "", "Lokhttp3/Interceptor;", "getInterceptors$networking", "()Ljava/util/List;", "getMoshiBuilder$networking", "()Lcom/squareup/moshi/Moshi$Builder;", "addInterceptor", "", "interceptor", "configureMoshi", "configuration", "Lkotlin/Function1;", "Lcom/mncs/networking/factory/MoshiBuilder;", "Lkotlin/ExtensionFunctionType;", "networking"})
public final class NetworkOptions {
    @org.jetbrains.annotations.NotNull()
    private final com.squareup.moshi.Moshi.Builder moshiBuilder = null;
    @org.jetbrains.annotations.Nullable()
    private java.lang.String baseUrl;
    private boolean applyJwt = false;
    @org.jetbrains.annotations.NotNull()
    private final java.util.List<okhttp3.Interceptor> interceptors = null;
    
    public NetworkOptions(@org.jetbrains.annotations.NotNull()
    com.squareup.moshi.Moshi.Builder moshiBuilder) {
        super();
    }
    
    @org.jetbrains.annotations.NotNull()
    public final com.squareup.moshi.Moshi.Builder getMoshiBuilder$networking() {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable()
    public final java.lang.String getBaseUrl$networking() {
        return null;
    }
    
    public final void setBaseUrl$networking(@org.jetbrains.annotations.Nullable()
    java.lang.String p0) {
    }
    
    public final boolean getApplyJwt$networking() {
        return false;
    }
    
    public final void setApplyJwt$networking(boolean p0) {
    }
    
    @org.jetbrains.annotations.NotNull()
    public final java.util.List<okhttp3.Interceptor> getInterceptors$networking() {
        return null;
    }
    
    public final void baseUrl(@org.jetbrains.annotations.NotNull()
    java.lang.String baseUrl) {
    }
    
    public final void addInterceptor(@org.jetbrains.annotations.NotNull()
    okhttp3.Interceptor interceptor) {
    }
    
    public final void applyJwt() {
    }
    
    public final void configureMoshi(@org.jetbrains.annotations.NotNull()
    kotlin.jvm.functions.Function1<? super com.mncs.networking.factory.MoshiBuilder, kotlin.Unit> configuration) {
    }
}