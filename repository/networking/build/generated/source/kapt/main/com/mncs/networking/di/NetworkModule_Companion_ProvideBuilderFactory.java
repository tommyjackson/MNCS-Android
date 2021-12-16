package com.mncs.networking.di;

import dagger.internal.DaggerGenerated;
import dagger.internal.Factory;
import dagger.internal.Preconditions;
import javax.annotation.processing.Generated;
import okhttp3.OkHttpClient;

@DaggerGenerated
@Generated(
    value = "dagger.internal.codegen.ComponentProcessor",
    comments = "https://dagger.dev"
)
@SuppressWarnings({
    "unchecked",
    "rawtypes"
})
public final class NetworkModule_Companion_ProvideBuilderFactory implements Factory<OkHttpClient.Builder> {
  @Override
  public OkHttpClient.Builder get() {
    return provideBuilder();
  }

  public static NetworkModule_Companion_ProvideBuilderFactory create() {
    return InstanceHolder.INSTANCE;
  }

  public static OkHttpClient.Builder provideBuilder() {
    return Preconditions.checkNotNullFromProvides(NetworkModule.Companion.provideBuilder());
  }

  private static final class InstanceHolder {
    private static final NetworkModule_Companion_ProvideBuilderFactory INSTANCE = new NetworkModule_Companion_ProvideBuilderFactory();
  }
}
