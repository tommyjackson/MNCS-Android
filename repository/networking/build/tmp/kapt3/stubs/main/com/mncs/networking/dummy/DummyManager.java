package com.mncs.networking.dummy;

import java.lang.System;

@kotlin.Metadata(mv = {1, 5, 1}, k = 1, d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0000\b\u0007\u0018\u00002\u00020\u0001B\u000f\b\u0007\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u00a2\u0006\u0002\u0010\u0004J\u001d\u0010\u0005\u001a\u000e\u0012\u0004\u0012\u00020\u0007\u0012\u0004\u0012\u00020\b0\u0006H\u0086@\u00f8\u0001\u0000\u00a2\u0006\u0002\u0010\tJ\u001d\u0010\n\u001a\u000e\u0012\u0004\u0012\u00020\u000b\u0012\u0004\u0012\u00020\b0\u0006H\u0086@\u00f8\u0001\u0000\u00a2\u0006\u0002\u0010\tR\u000e\u0010\u0002\u001a\u00020\u0003X\u0082\u0004\u00a2\u0006\u0002\n\u0000\u0082\u0002\u0004\n\u0002\b\u0019\u00a8\u0006\f"}, d2 = {"Lcom/mncs/networking/dummy/DummyManager;", "", "dummyService", "Lcom/mncs/networking/dummy/DummyService;", "(Lcom/mncs/networking/dummy/DummyService;)V", "getDummyData", "Lcom/mncs/networking/util/Either;", "Lcom/mncs/networking/dummy/DummyData;", "Lcom/mncs/networking/response/GenericError;", "(Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "getEmptyDummyData", "", "networking"})
@javax.inject.Singleton()
public final class DummyManager {
    private final com.mncs.networking.dummy.DummyService dummyService = null;
    
    @javax.inject.Inject()
    public DummyManager(@org.jetbrains.annotations.NotNull()
    com.mncs.networking.dummy.DummyService dummyService) {
        super();
    }
    
    @org.jetbrains.annotations.Nullable()
    public final java.lang.Object getDummyData(@org.jetbrains.annotations.NotNull()
    kotlin.coroutines.Continuation<? super com.mncs.networking.util.Either<com.mncs.networking.dummy.DummyData, ? extends com.mncs.networking.response.GenericError>> continuation) {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable()
    public final java.lang.Object getEmptyDummyData(@org.jetbrains.annotations.NotNull()
    kotlin.coroutines.Continuation<? super com.mncs.networking.util.Either<kotlin.Unit, ? extends com.mncs.networking.response.GenericError>> continuation) {
        return null;
    }
}