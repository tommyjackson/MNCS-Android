package com.mncs.networking.response;

import java.lang.System;

@kotlin.Metadata(mv = {1, 5, 1}, k = 1, d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0000\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\bv\u0018\u0000*\u0004\b\u0000\u0010\u00012\u00020\u0002:\u0004\u0006\u0007\b\tR\u0014\u0010\u0003\u001a\u0004\u0018\u00018\u0000X\u00a6\u0004\u00a2\u0006\u0006\u001a\u0004\b\u0004\u0010\u0005\u0082\u0001\u0004\n\u000b\f\r\u00a8\u0006\u000e"}, d2 = {"Lcom/mncs/networking/response/GenericResponse;", "T", "", "data", "getData", "()Ljava/lang/Object;", "EmptyResponse", "ResponseJustMeta", "ResponseWithMeta", "ResponseWithoutMeta", "Lcom/mncs/networking/response/GenericResponse$ResponseWithMeta;", "Lcom/mncs/networking/response/GenericResponse$ResponseWithoutMeta;", "Lcom/mncs/networking/response/GenericResponse$ResponseJustMeta;", "Lcom/mncs/networking/response/GenericResponse$EmptyResponse;", "networking"})
public abstract interface GenericResponse<T extends java.lang.Object> {
    
    @org.jetbrains.annotations.Nullable()
    public abstract T getData();
    
    @kotlin.Metadata(mv = {1, 5, 1}, k = 1, d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u000b\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\b\u0086\b\u0018\u0000*\u0004\b\u0001\u0010\u00012\b\u0012\u0004\u0012\u0002H\u00010\u0002B\u0015\u0012\u0006\u0010\u0003\u001a\u00028\u0001\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u00a2\u0006\u0002\u0010\u0006J\u000e\u0010\f\u001a\u00028\u0001H\u00c6\u0003\u00a2\u0006\u0002\u0010\bJ\t\u0010\r\u001a\u00020\u0005H\u00c6\u0003J(\u0010\u000e\u001a\b\u0012\u0004\u0012\u00028\u00010\u00002\b\b\u0002\u0010\u0003\u001a\u00028\u00012\b\b\u0002\u0010\u0004\u001a\u00020\u0005H\u00c6\u0001\u00a2\u0006\u0002\u0010\u000fJ\u0013\u0010\u0010\u001a\u00020\u00112\b\u0010\u0012\u001a\u0004\u0018\u00010\u0013H\u00d6\u0003J\t\u0010\u0014\u001a\u00020\u0015H\u00d6\u0001J\t\u0010\u0016\u001a\u00020\u0017H\u00d6\u0001R\u0016\u0010\u0003\u001a\u00028\u0001X\u0096\u0004\u00a2\u0006\n\n\u0002\u0010\t\u001a\u0004\b\u0007\u0010\bR\u0011\u0010\u0004\u001a\u00020\u0005\u00a2\u0006\b\n\u0000\u001a\u0004\b\n\u0010\u000b\u00a8\u0006\u0018"}, d2 = {"Lcom/mncs/networking/response/GenericResponse$ResponseWithMeta;", "T", "Lcom/mncs/networking/response/GenericResponse;", "data", "metadata", "Lcom/mncs/networking/response/Metadata;", "(Ljava/lang/Object;Lcom/mncs/networking/response/Metadata;)V", "getData", "()Ljava/lang/Object;", "Ljava/lang/Object;", "getMetadata", "()Lcom/mncs/networking/response/Metadata;", "component1", "component2", "copy", "(Ljava/lang/Object;Lcom/mncs/networking/response/Metadata;)Lcom/mncs/networking/response/GenericResponse$ResponseWithMeta;", "equals", "", "other", "", "hashCode", "", "toString", "", "networking"})
    public static final class ResponseWithMeta<T extends java.lang.Object> implements com.mncs.networking.response.GenericResponse<T> {
        private final T data = null;
        @org.jetbrains.annotations.NotNull()
        private final com.mncs.networking.response.Metadata metadata = null;
        
        @org.jetbrains.annotations.NotNull()
        public final com.mncs.networking.response.GenericResponse.ResponseWithMeta<T> copy(T data, @org.jetbrains.annotations.NotNull()
        com.mncs.networking.response.Metadata metadata) {
            return null;
        }
        
        @java.lang.Override()
        public boolean equals(@org.jetbrains.annotations.Nullable()
        java.lang.Object other) {
            return false;
        }
        
        @java.lang.Override()
        public int hashCode() {
            return 0;
        }
        
        @org.jetbrains.annotations.NotNull()
        @java.lang.Override()
        public java.lang.String toString() {
            return null;
        }
        
        public ResponseWithMeta(T data, @org.jetbrains.annotations.NotNull()
        com.mncs.networking.response.Metadata metadata) {
            super();
        }
        
        public final T component1() {
            return null;
        }
        
        @java.lang.Override()
        public T getData() {
            return null;
        }
        
        @org.jetbrains.annotations.NotNull()
        public final com.mncs.networking.response.Metadata component2() {
            return null;
        }
        
        @org.jetbrains.annotations.NotNull()
        public final com.mncs.networking.response.Metadata getMetadata() {
            return null;
        }
    }
    
    @kotlin.Metadata(mv = {1, 5, 1}, k = 1, d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\t\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\b\u0086\b\u0018\u0000*\u0004\b\u0001\u0010\u00012\b\u0012\u0004\u0012\u0002H\u00010\u0002B\r\u0012\u0006\u0010\u0003\u001a\u00028\u0001\u00a2\u0006\u0002\u0010\u0004J\u000e\u0010\b\u001a\u00028\u0001H\u00c6\u0003\u00a2\u0006\u0002\u0010\u0006J\u001e\u0010\t\u001a\b\u0012\u0004\u0012\u00028\u00010\u00002\b\b\u0002\u0010\u0003\u001a\u00028\u0001H\u00c6\u0001\u00a2\u0006\u0002\u0010\nJ\u0013\u0010\u000b\u001a\u00020\f2\b\u0010\r\u001a\u0004\u0018\u00010\u000eH\u00d6\u0003J\t\u0010\u000f\u001a\u00020\u0010H\u00d6\u0001J\t\u0010\u0011\u001a\u00020\u0012H\u00d6\u0001R\u0016\u0010\u0003\u001a\u00028\u0001X\u0096\u0004\u00a2\u0006\n\n\u0002\u0010\u0007\u001a\u0004\b\u0005\u0010\u0006\u00a8\u0006\u0013"}, d2 = {"Lcom/mncs/networking/response/GenericResponse$ResponseWithoutMeta;", "T", "Lcom/mncs/networking/response/GenericResponse;", "data", "(Ljava/lang/Object;)V", "getData", "()Ljava/lang/Object;", "Ljava/lang/Object;", "component1", "copy", "(Ljava/lang/Object;)Lcom/mncs/networking/response/GenericResponse$ResponseWithoutMeta;", "equals", "", "other", "", "hashCode", "", "toString", "", "networking"})
    public static final class ResponseWithoutMeta<T extends java.lang.Object> implements com.mncs.networking.response.GenericResponse<T> {
        private final T data = null;
        
        @org.jetbrains.annotations.NotNull()
        public final com.mncs.networking.response.GenericResponse.ResponseWithoutMeta<T> copy(T data) {
            return null;
        }
        
        @java.lang.Override()
        public boolean equals(@org.jetbrains.annotations.Nullable()
        java.lang.Object other) {
            return false;
        }
        
        @java.lang.Override()
        public int hashCode() {
            return 0;
        }
        
        @org.jetbrains.annotations.NotNull()
        @java.lang.Override()
        public java.lang.String toString() {
            return null;
        }
        
        public ResponseWithoutMeta(T data) {
            super();
        }
        
        public final T component1() {
            return null;
        }
        
        @java.lang.Override()
        public T getData() {
            return null;
        }
    }
    
    @kotlin.Metadata(mv = {1, 5, 1}, k = 1, d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u000b\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\b\u0086\b\u0018\u0000*\u0004\b\u0001\u0010\u00012\b\u0012\u0004\u0012\u0002H\u00010\u0002B\u0019\u0012\n\b\u0002\u0010\u0003\u001a\u0004\u0018\u00018\u0001\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u00a2\u0006\u0002\u0010\u0006J\u0010\u0010\f\u001a\u0004\u0018\u00018\u0001H\u00c6\u0003\u00a2\u0006\u0002\u0010\bJ\t\u0010\r\u001a\u00020\u0005H\u00c6\u0003J*\u0010\u000e\u001a\b\u0012\u0004\u0012\u00028\u00010\u00002\n\b\u0002\u0010\u0003\u001a\u0004\u0018\u00018\u00012\b\b\u0002\u0010\u0004\u001a\u00020\u0005H\u00c6\u0001\u00a2\u0006\u0002\u0010\u000fJ\u0013\u0010\u0010\u001a\u00020\u00112\b\u0010\u0012\u001a\u0004\u0018\u00010\u0013H\u00d6\u0003J\t\u0010\u0014\u001a\u00020\u0015H\u00d6\u0001J\t\u0010\u0016\u001a\u00020\u0017H\u00d6\u0001R\u0018\u0010\u0003\u001a\u0004\u0018\u00018\u0001X\u0096\u0004\u00a2\u0006\n\n\u0002\u0010\t\u001a\u0004\b\u0007\u0010\bR\u0011\u0010\u0004\u001a\u00020\u0005\u00a2\u0006\b\n\u0000\u001a\u0004\b\n\u0010\u000b\u00a8\u0006\u0018"}, d2 = {"Lcom/mncs/networking/response/GenericResponse$ResponseJustMeta;", "T", "Lcom/mncs/networking/response/GenericResponse;", "data", "metadata", "Lcom/mncs/networking/response/Metadata;", "(Ljava/lang/Object;Lcom/mncs/networking/response/Metadata;)V", "getData", "()Ljava/lang/Object;", "Ljava/lang/Object;", "getMetadata", "()Lcom/mncs/networking/response/Metadata;", "component1", "component2", "copy", "(Ljava/lang/Object;Lcom/mncs/networking/response/Metadata;)Lcom/mncs/networking/response/GenericResponse$ResponseJustMeta;", "equals", "", "other", "", "hashCode", "", "toString", "", "networking"})
    public static final class ResponseJustMeta<T extends java.lang.Object> implements com.mncs.networking.response.GenericResponse<T> {
        @org.jetbrains.annotations.Nullable()
        private final T data = null;
        @org.jetbrains.annotations.NotNull()
        private final com.mncs.networking.response.Metadata metadata = null;
        
        @org.jetbrains.annotations.NotNull()
        public final com.mncs.networking.response.GenericResponse.ResponseJustMeta<T> copy(@org.jetbrains.annotations.Nullable()
        T data, @org.jetbrains.annotations.NotNull()
        com.mncs.networking.response.Metadata metadata) {
            return null;
        }
        
        @java.lang.Override()
        public boolean equals(@org.jetbrains.annotations.Nullable()
        java.lang.Object other) {
            return false;
        }
        
        @java.lang.Override()
        public int hashCode() {
            return 0;
        }
        
        @org.jetbrains.annotations.NotNull()
        @java.lang.Override()
        public java.lang.String toString() {
            return null;
        }
        
        public ResponseJustMeta(@org.jetbrains.annotations.Nullable()
        T data, @org.jetbrains.annotations.NotNull()
        com.mncs.networking.response.Metadata metadata) {
            super();
        }
        
        @org.jetbrains.annotations.Nullable()
        public final T component1() {
            return null;
        }
        
        @org.jetbrains.annotations.Nullable()
        @java.lang.Override()
        public T getData() {
            return null;
        }
        
        @org.jetbrains.annotations.NotNull()
        public final com.mncs.networking.response.Metadata component2() {
            return null;
        }
        
        @org.jetbrains.annotations.NotNull()
        public final com.mncs.networking.response.Metadata getMetadata() {
            return null;
        }
    }
    
    @kotlin.Metadata(mv = {1, 5, 1}, k = 1, d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0006\b\u00c6\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\u0007\b\u0002\u00a2\u0006\u0002\u0010\u0003R\u0018\u0010\u0004\u001a\u0004\u0018\u00010\u0002X\u0096\u0004\u00a2\u0006\n\n\u0002\u0010\u0007\u001a\u0004\b\u0005\u0010\u0006\u00a8\u0006\b"}, d2 = {"Lcom/mncs/networking/response/GenericResponse$EmptyResponse;", "Lcom/mncs/networking/response/GenericResponse;", "", "()V", "data", "getData", "()Lkotlin/Unit;", "Lkotlin/Unit;", "networking"})
    public static final class EmptyResponse implements com.mncs.networking.response.GenericResponse<kotlin.Unit> {
        @org.jetbrains.annotations.NotNull()
        public static final com.mncs.networking.response.GenericResponse.EmptyResponse INSTANCE = null;
        @org.jetbrains.annotations.Nullable()
        private static final kotlin.Unit data = null;
        
        private EmptyResponse() {
            super();
        }
        
        @org.jetbrains.annotations.Nullable()
        @java.lang.Override()
        public kotlin.Unit getData() {
            return null;
        }
    }
}