-if class com.mncs.networking.dummy.DummyDataResponse
-keepnames class com.mncs.networking.dummy.DummyDataResponse
-if class com.mncs.networking.dummy.DummyDataResponse
-keep class com.mncs.networking.dummy.DummyDataResponseJsonAdapter {
    public <init>(com.squareup.moshi.Moshi);
}
