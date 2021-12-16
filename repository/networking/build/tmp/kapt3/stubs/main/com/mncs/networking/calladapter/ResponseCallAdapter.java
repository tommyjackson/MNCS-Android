package com.mncs.networking.calladapter;

import java.lang.System;

@kotlin.Metadata(mv = {1, 5, 1}, k = 1, d1 = {"\u0000:\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\u0018\u0000*\b\b\u0000\u0010\u0001*\u00020\u00022&\u0012\n\u0012\b\u0012\u0004\u0012\u0002H\u00010\u0004\u0012\u0016\u0012\u0014\u0012\u0010\u0012\u000e\u0012\u0004\u0012\u0002H\u0001\u0012\u0004\u0012\u00020\u00070\u00060\u00050\u0003B1\u0012\u0006\u0010\b\u001a\u00020\t\u0012\u0006\u0010\n\u001a\u00020\t\u0012\u0012\u0010\u000b\u001a\u000e\u0012\u0004\u0012\u00020\r\u0012\u0004\u0012\u00020\u00070\f\u0012\u0006\u0010\u000e\u001a\u00020\u000f\u00a2\u0006\u0002\u0010\u0010J.\u0010\u0011\u001a\u0014\u0012\u0010\u0012\u000e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00020\u00070\u00060\u00052\u0012\u0010\u0012\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00028\u00000\u00040\u0005H\u0016J\b\u0010\u0013\u001a\u00020\tH\u0016R\u001a\u0010\u000b\u001a\u000e\u0012\u0004\u0012\u00020\r\u0012\u0004\u0012\u00020\u00070\fX\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u000e\u001a\u00020\u000fX\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u000e\u0010\n\u001a\u00020\tX\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u000e\u0010\b\u001a\u00020\tX\u0082\u0004\u00a2\u0006\u0002\n\u0000\u00a8\u0006\u0014"}, d2 = {"Lcom/mncs/networking/calladapter/ResponseCallAdapter;", "S", "", "Lretrofit2/CallAdapter;", "Lcom/mncs/networking/response/GenericResponse;", "Lretrofit2/Call;", "Lcom/mncs/networking/util/Either;", "Lcom/mncs/networking/response/GenericError;", "wrappedType", "Ljava/lang/reflect/Type;", "successType", "errorBodyConverter", "Lretrofit2/Converter;", "Lokhttp3/ResponseBody;", "moshi", "Lcom/squareup/moshi/Moshi;", "(Ljava/lang/reflect/Type;Ljava/lang/reflect/Type;Lretrofit2/Converter;Lcom/squareup/moshi/Moshi;)V", "adapt", "call", "responseType", "networking"})
public final class ResponseCallAdapter<S extends java.lang.Object> implements retrofit2.CallAdapter<com.mncs.networking.response.GenericResponse<S>, retrofit2.Call<com.mncs.networking.util.Either<? extends S, ? extends com.mncs.networking.response.GenericError>>> {
    private final java.lang.reflect.Type wrappedType = null;
    private final java.lang.reflect.Type successType = null;
    private final retrofit2.Converter<okhttp3.ResponseBody, com.mncs.networking.response.GenericError> errorBodyConverter = null;
    private final com.squareup.moshi.Moshi moshi = null;
    
    public ResponseCallAdapter(@org.jetbrains.annotations.NotNull()
    java.lang.reflect.Type wrappedType, @org.jetbrains.annotations.NotNull()
    java.lang.reflect.Type successType, @org.jetbrains.annotations.NotNull()
    retrofit2.Converter<okhttp3.ResponseBody, com.mncs.networking.response.GenericError> errorBodyConverter, @org.jetbrains.annotations.NotNull()
    com.squareup.moshi.Moshi moshi) {
        super();
    }
    
    @org.jetbrains.annotations.NotNull()
    @java.lang.Override()
    public java.lang.reflect.Type responseType() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    @java.lang.Override()
    public retrofit2.Call<com.mncs.networking.util.Either<S, com.mncs.networking.response.GenericError>> adapt(@org.jetbrains.annotations.NotNull()
    retrofit2.Call<com.mncs.networking.response.GenericResponse<S>> call) {
        return null;
    }
}