package com.mncs.networking.calladapter;

import java.lang.System;

@kotlin.Metadata(mv = {1, 5, 1}, k = 1, d1 = {"\u0000^\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\b\u0000\u0018\u0000*\b\b\u0000\u0010\u0001*\u00020\u00022\u0014\u0012\u0010\u0012\u000e\u0012\u0004\u0012\u0002H\u0001\u0012\u0004\u0012\u00020\u00050\u00040\u0003B=\u0012\u0006\u0010\u0006\u001a\u00020\u0007\u0012\u0012\u0010\b\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00028\u00000\t0\u0003\u0012\u0012\u0010\n\u001a\u000e\u0012\u0004\u0012\u00020\f\u0012\u0004\u0012\u00020\u00050\u000b\u0012\u0006\u0010\r\u001a\u00020\u000e\u00a2\u0006\u0002\u0010\u000fJ\b\u0010\u0010\u001a\u00020\u0011H\u0016J\u000e\u0010\u0012\u001a\b\u0012\u0004\u0012\u00028\u00000\u0000H\u0016J\"\u0010\u0013\u001a\u00020\u00112\u0018\u0010\u0014\u001a\u0014\u0012\u0010\u0012\u000e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00020\u00050\u00040\u0015H\u0016J\u001a\u0010\u0016\u001a\u0014\u0012\u0010\u0012\u000e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00020\u00050\u00040\u0017H\u0016J\b\u0010\u0018\u001a\u00020\u0019H\u0016J\b\u0010\u001a\u001a\u00020\u0019H\u0016J\b\u0010\u001b\u001a\u00020\u001cH\u0016J\b\u0010\u001d\u001a\u00020\u001eH\u0016R\u001a\u0010\b\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00028\u00000\t0\u0003X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u001a\u0010\n\u001a\u000e\u0012\u0004\u0012\u00020\f\u0012\u0004\u0012\u00020\u00050\u000bX\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u000e\u0010\r\u001a\u00020\u000eX\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0006\u001a\u00020\u0007X\u0082\u0004\u00a2\u0006\u0002\n\u0000\u00a8\u0006\u001f"}, d2 = {"Lcom/mncs/networking/calladapter/ResponseCall;", "S", "", "Lretrofit2/Call;", "Lcom/mncs/networking/util/Either;", "Lcom/mncs/networking/response/GenericError;", "successType", "Ljava/lang/reflect/Type;", "delegate", "Lcom/mncs/networking/response/GenericResponse;", "errorBodyConverter", "Lretrofit2/Converter;", "Lokhttp3/ResponseBody;", "moshi", "Lcom/squareup/moshi/Moshi;", "(Ljava/lang/reflect/Type;Lretrofit2/Call;Lretrofit2/Converter;Lcom/squareup/moshi/Moshi;)V", "cancel", "", "clone", "enqueue", "callback", "Lretrofit2/Callback;", "execute", "Lretrofit2/Response;", "isCanceled", "", "isExecuted", "request", "Lokhttp3/Request;", "timeout", "Lokio/Timeout;", "networking"})
public final class ResponseCall<S extends java.lang.Object> implements retrofit2.Call<com.mncs.networking.util.Either<? extends S, ? extends com.mncs.networking.response.GenericError>> {
    private final java.lang.reflect.Type successType = null;
    private final retrofit2.Call<com.mncs.networking.response.GenericResponse<S>> delegate = null;
    private final retrofit2.Converter<okhttp3.ResponseBody, com.mncs.networking.response.GenericError> errorBodyConverter = null;
    private final com.squareup.moshi.Moshi moshi = null;
    
    public ResponseCall(@org.jetbrains.annotations.NotNull()
    java.lang.reflect.Type successType, @org.jetbrains.annotations.NotNull()
    retrofit2.Call<com.mncs.networking.response.GenericResponse<S>> delegate, @org.jetbrains.annotations.NotNull()
    retrofit2.Converter<okhttp3.ResponseBody, com.mncs.networking.response.GenericError> errorBodyConverter, @org.jetbrains.annotations.NotNull()
    com.squareup.moshi.Moshi moshi) {
        super();
    }
    
    @kotlin.Suppress(names = {"UNCHECKED_CAST"})
    @java.lang.Override()
    public void enqueue(@org.jetbrains.annotations.NotNull()
    retrofit2.Callback<com.mncs.networking.util.Either<S, com.mncs.networking.response.GenericError>> callback) {
    }
    
    @java.lang.Override()
    public boolean isExecuted() {
        return false;
    }
    
    @org.jetbrains.annotations.NotNull()
    @java.lang.Override()
    public com.mncs.networking.calladapter.ResponseCall<S> clone() {
        return null;
    }
    
    @java.lang.Override()
    public boolean isCanceled() {
        return false;
    }
    
    @java.lang.Override()
    public void cancel() {
    }
    
    @org.jetbrains.annotations.NotNull()
    @java.lang.Override()
    public retrofit2.Response<com.mncs.networking.util.Either<S, com.mncs.networking.response.GenericError>> execute() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    @java.lang.Override()
    public okhttp3.Request request() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    @java.lang.Override()
    public okio.Timeout timeout() {
        return null;
    }
}