package com.mncs.networking.util;

import java.lang.System;

@kotlin.Metadata(mv = {1, 5, 1}, k = 1, d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b6\u0018\u0000 \u0005*\u0006\b\u0000\u0010\u0001 \u0001*\u0006\b\u0001\u0010\u0002 \u00012\u00020\u0003:\u0003\u0005\u0006\u0007B\u0007\b\u0004\u00a2\u0006\u0002\u0010\u0004\u0082\u0001\u0002\b\t\u00a8\u0006\n"}, d2 = {"Lcom/mncs/networking/util/Either;", "S", "F", "", "()V", "Companion", "Failure", "Success", "Lcom/mncs/networking/util/Either$Success;", "Lcom/mncs/networking/util/Either$Failure;", "networking"})
public abstract class Either<S extends java.lang.Object, F extends java.lang.Object> {
    @org.jetbrains.annotations.NotNull()
    public static final com.mncs.networking.util.Either.Companion Companion = null;
    
    private Either() {
        super();
    }
    
    @kotlin.Metadata(mv = {1, 5, 1}, k = 1, d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u0001\n\u0002\b\u0006\b\u0016\u0018\u0000*\u0004\b\u0002\u0010\u00012\u000e\u0012\u0004\u0012\u0002H\u0001\u0012\u0004\u0012\u00020\u00030\u0002B\u000f\b\u0000\u0012\u0006\u0010\u0004\u001a\u00028\u0002\u00a2\u0006\u0002\u0010\u0005R\u0016\u0010\u0004\u001a\u00028\u0002X\u0096\u0004\u00a2\u0006\n\n\u0002\u0010\b\u001a\u0004\b\u0006\u0010\u0007\u00a8\u0006\t"}, d2 = {"Lcom/mncs/networking/util/Either$Success;", "S", "Lcom/mncs/networking/util/Either;", "", "success", "(Ljava/lang/Object;)V", "getSuccess", "()Ljava/lang/Object;", "Ljava/lang/Object;", "networking"})
    public static class Success<S extends java.lang.Object> extends com.mncs.networking.util.Either {
        private final S success = null;
        
        public Success(S success) {
            super();
        }
        
        public S getSuccess() {
            return null;
        }
    }
    
    @kotlin.Metadata(mv = {1, 5, 1}, k = 1, d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u0001\n\u0002\b\u0006\b\u0016\u0018\u0000*\u0004\b\u0002\u0010\u00012\u000e\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u0002H\u00010\u0002B\u000f\b\u0000\u0012\u0006\u0010\u0004\u001a\u00028\u0002\u00a2\u0006\u0002\u0010\u0005R\u0016\u0010\u0004\u001a\u00028\u0002X\u0096\u0004\u00a2\u0006\n\n\u0002\u0010\b\u001a\u0004\b\u0006\u0010\u0007\u00a8\u0006\t"}, d2 = {"Lcom/mncs/networking/util/Either$Failure;", "F", "Lcom/mncs/networking/util/Either;", "", "failure", "(Ljava/lang/Object;)V", "getFailure", "()Ljava/lang/Object;", "Ljava/lang/Object;", "networking"})
    public static class Failure<F extends java.lang.Object> extends com.mncs.networking.util.Either {
        private final F failure = null;
        
        public Failure(F failure) {
            super();
        }
        
        public F getFailure() {
            return null;
        }
    }
    
    @kotlin.Metadata(mv = {1, 5, 1}, k = 1, d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0001\n\u0002\b\u0004\b\u0086\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002\u00a2\u0006\u0002\u0010\u0002J)\u0010\u0003\u001a\u000e\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u0002H\u00060\u0004\"\b\b\u0002\u0010\u0006*\u00020\u00012\u0006\u0010\u0003\u001a\u0002H\u0006\u00a2\u0006\u0002\u0010\u0007J)\u0010\b\u001a\u000e\u0012\u0004\u0012\u0002H\u0006\u0012\u0004\u0012\u00020\u00050\u0004\"\b\b\u0002\u0010\u0006*\u00020\u00012\u0006\u0010\b\u001a\u0002H\u0006\u00a2\u0006\u0002\u0010\u0007\u00a8\u0006\t"}, d2 = {"Lcom/mncs/networking/util/Either$Companion;", "", "()V", "failure", "Lcom/mncs/networking/util/Either;", "", "T", "(Ljava/lang/Object;)Lcom/mncs/networking/util/Either;", "success", "networking"})
    public static final class Companion {
        
        private Companion() {
            super();
        }
        
        @org.jetbrains.annotations.NotNull()
        public final <T extends java.lang.Object>com.mncs.networking.util.Either success(@org.jetbrains.annotations.NotNull()
        T success) {
            return null;
        }
        
        @org.jetbrains.annotations.NotNull()
        public final <T extends java.lang.Object>com.mncs.networking.util.Either failure(@org.jetbrains.annotations.NotNull()
        T failure) {
            return null;
        }
    }
}