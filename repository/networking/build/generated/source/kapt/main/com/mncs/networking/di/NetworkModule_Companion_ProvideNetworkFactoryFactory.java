package com.mncs.networking.di;

import com.mncs.networking.factory.NetworkFactory;
import dagger.internal.DaggerGenerated;
import dagger.internal.Factory;
import dagger.internal.Preconditions;
import javax.annotation.processing.Generated;
import javax.inject.Provider;
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
public final class NetworkModule_Companion_ProvideNetworkFactoryFactory implements Factory<NetworkFactory> {
  private final Provider<OkHttpClient.Builder> builderProvider;

  public NetworkModule_Companion_ProvideNetworkFactoryFactory(
      Provider<OkHttpClient.Builder> builderProvider) {
    this.builderProvider = builderProvider;
  }

  @Override
  public NetworkFactory get() {
    return provideNetworkFactory(builderProvider.get());
  }

  public static NetworkModule_Companion_ProvideNetworkFactoryFactory create(
      Provider<OkHttpClient.Builder> builderProvider) {
    return new NetworkModule_Companion_ProvideNetworkFactoryFactory(builderProvider);
  }

  public static NetworkFactory provideNetworkFactory(OkHttpClient.Builder builder) {
    return Preconditions.checkNotNullFromProvides(NetworkModule.Companion.provideNetworkFactory(builder));
  }
}
