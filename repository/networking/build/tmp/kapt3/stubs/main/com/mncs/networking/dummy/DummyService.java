package com.mncs.networking.dummy;

import java.lang.System;

@kotlin.Metadata(mv = {1, 5, 1}, k = 1, d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0000\bf\u0018\u00002\u00020\u0001J\'\u0010\u0002\u001a\u0018\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00020\u00050\u0003j\b\u0012\u0004\u0012\u00020\u0004`\u0006H\u00a7@\u00f8\u0001\u0000\u00a2\u0006\u0002\u0010\u0007J\'\u0010\b\u001a\u0018\u0012\u0004\u0012\u00020\t\u0012\u0004\u0012\u00020\u00050\u0003j\b\u0012\u0004\u0012\u00020\t`\u0006H\u00a7@\u00f8\u0001\u0000\u00a2\u0006\u0002\u0010\u0007\u0082\u0002\u0004\n\u0002\b\u0019\u00a8\u0006\n"}, d2 = {"Lcom/mncs/networking/dummy/DummyService;", "", "getDummyData", "Lcom/mncs/networking/util/Either;", "Lcom/mncs/networking/dummy/DummyDataResponse;", "Lcom/mncs/networking/response/GenericError;", "Lcom/mncs/networking/response/NetworkResponse;", "(Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "getEmptyDummyData", "", "networking"})
public abstract interface DummyService {
    
    @org.jetbrains.annotations.Nullable()
    @retrofit2.http.GET(value = "dummydata")
    public abstract java.lang.Object getDummyData(@org.jetbrains.annotations.NotNull()
    kotlin.coroutines.Continuation<? super com.mncs.networking.util.Either<com.mncs.networking.dummy.DummyDataResponse, ? extends com.mncs.networking.response.GenericError>> continuation);
    
    @org.jetbrains.annotations.Nullable()
    @retrofit2.http.GET(value = "dummydataempty")
    public abstract java.lang.Object getEmptyDummyData(@org.jetbrains.annotations.NotNull()
    kotlin.coroutines.Continuation<? super com.mncs.networking.util.Either<kotlin.Unit, ? extends com.mncs.networking.response.GenericError>> continuation);
}