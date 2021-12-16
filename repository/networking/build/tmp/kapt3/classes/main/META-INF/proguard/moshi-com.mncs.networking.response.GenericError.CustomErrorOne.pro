-if class com.mncs.networking.response.GenericError$CustomErrorOne
-keepnames class com.mncs.networking.response.GenericError$CustomErrorOne
-if class com.mncs.networking.response.GenericError$CustomErrorOne
-keep class com.mncs.networking.response.GenericError_CustomErrorOneJsonAdapter {
    public <init>(com.squareup.moshi.Moshi);
}
-if class com.mncs.networking.response.GenericError$CustomErrorOne
-keepnames class kotlin.jvm.internal.DefaultConstructorMarker
-if class com.mncs.networking.response.GenericError$CustomErrorOne
-keepclassmembers class com.mncs.networking.response.GenericError$CustomErrorOne {
    public synthetic <init>(java.lang.String,int,java.lang.String,int,kotlin.jvm.internal.DefaultConstructorMarker);
}
