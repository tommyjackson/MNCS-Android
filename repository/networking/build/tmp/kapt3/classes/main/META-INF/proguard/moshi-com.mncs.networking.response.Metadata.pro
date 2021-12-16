-if class com.mncs.networking.response.Metadata
-keepnames class com.mncs.networking.response.Metadata
-if class com.mncs.networking.response.Metadata
-keep class com.mncs.networking.response.MetadataJsonAdapter {
    public <init>(com.squareup.moshi.Moshi);
}
