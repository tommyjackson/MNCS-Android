package com.mncs.networking.util;

import java.lang.System;

@kotlin.Metadata(mv = {1, 5, 1}, k = 1, d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\bv\u0018\u00002\u00020\u0001:\u0002\u0006\u0007R\u0014\u0010\u0002\u001a\u0004\u0018\u00010\u0003X\u00a6\u0004\u00a2\u0006\u0006\u001a\u0004\b\u0004\u0010\u0005\u0082\u0001\u0002\b\t\u00a8\u0006\n"}, d2 = {"Lcom/mncs/networking/util/NetworkEither;", "", "metadata", "Lcom/mncs/networking/response/Metadata;", "getMetadata", "()Lcom/mncs/networking/response/Metadata;", "Failure", "Success", "Lcom/mncs/networking/util/NetworkEither$Success;", "Lcom/mncs/networking/util/NetworkEither$Failure;", "networking"})
public abstract interface NetworkEither {
    
    @org.jetbrains.annotations.Nullable()
    public abstract com.mncs.networking.response.Metadata getMetadata();
    
    @kotlin.Metadata(mv = {1, 5, 1}, k = 1, d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0007\b\u0016\u0018\u0000*\u0004\b\u0000\u0010\u00012\b\u0012\u0004\u0012\u0002H\u00010\u00022\u00020\u0003B\u001b\b\u0000\u0012\u0006\u0010\u0004\u001a\u00028\u0000\u0012\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u0006\u00a2\u0006\u0002\u0010\u0007R\u0016\u0010\u0005\u001a\u0004\u0018\u00010\u0006X\u0096\u0004\u00a2\u0006\b\n\u0000\u001a\u0004\b\b\u0010\tR\u0016\u0010\u0004\u001a\u00028\u0000X\u0096\u0004\u00a2\u0006\n\n\u0002\u0010\f\u001a\u0004\b\n\u0010\u000b\u00a8\u0006\r"}, d2 = {"Lcom/mncs/networking/util/NetworkEither$Success;", "S", "Lcom/mncs/networking/util/Either$Success;", "Lcom/mncs/networking/util/NetworkEither;", "success", "metadata", "Lcom/mncs/networking/response/Metadata;", "(Ljava/lang/Object;Lcom/mncs/networking/response/Metadata;)V", "getMetadata", "()Lcom/mncs/networking/response/Metadata;", "getSuccess", "()Ljava/lang/Object;", "Ljava/lang/Object;", "networking"})
    public static class Success<S extends java.lang.Object> extends com.mncs.networking.util.Either.Success<S> implements com.mncs.networking.util.NetworkEither {
        private final S success = null;
        @org.jetbrains.annotations.Nullable()
        private final com.mncs.networking.response.Metadata metadata = null;
        
        public Success(S success, @org.jetbrains.annotations.Nullable()
        com.mncs.networking.response.Metadata metadata) {
            super(null);
        }
        
        @java.lang.Override()
        public S getSuccess() {
            return null;
        }
        
        @org.jetbrains.annotations.Nullable()
        @java.lang.Override()
        public com.mncs.networking.response.Metadata getMetadata() {
            return null;
        }
    }
    
    @kotlin.Metadata(mv = {1, 5, 1}, k = 1, d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0007\b\u0016\u0018\u0000*\u0004\b\u0000\u0010\u00012\b\u0012\u0004\u0012\u0002H\u00010\u00022\u00020\u0003B\u001b\b\u0000\u0012\u0006\u0010\u0004\u001a\u00028\u0000\u0012\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u0006\u00a2\u0006\u0002\u0010\u0007R\u0016\u0010\u0004\u001a\u00028\u0000X\u0096\u0004\u00a2\u0006\n\n\u0002\u0010\n\u001a\u0004\b\b\u0010\tR\u0016\u0010\u0005\u001a\u0004\u0018\u00010\u0006X\u0096\u0004\u00a2\u0006\b\n\u0000\u001a\u0004\b\u000b\u0010\f\u00a8\u0006\r"}, d2 = {"Lcom/mncs/networking/util/NetworkEither$Failure;", "F", "Lcom/mncs/networking/util/Either$Failure;", "Lcom/mncs/networking/util/NetworkEither;", "failure", "metadata", "Lcom/mncs/networking/response/Metadata;", "(Ljava/lang/Object;Lcom/mncs/networking/response/Metadata;)V", "getFailure", "()Ljava/lang/Object;", "Ljava/lang/Object;", "getMetadata", "()Lcom/mncs/networking/response/Metadata;", "networking"})
    public static class Failure<F extends java.lang.Object> extends com.mncs.networking.util.Either.Failure<F> implements com.mncs.networking.util.NetworkEither {
        private final F failure = null;
        @org.jetbrains.annotations.Nullable()
        private final com.mncs.networking.response.Metadata metadata = null;
        
        public Failure(F failure, @org.jetbrains.annotations.Nullable()
        com.mncs.networking.response.Metadata metadata) {
            super(null);
        }
        
        @java.lang.Override()
        public F getFailure() {
            return null;
        }
        
        @org.jetbrains.annotations.Nullable()
        @java.lang.Override()
        public com.mncs.networking.response.Metadata getMetadata() {
            return null;
        }
    }
}