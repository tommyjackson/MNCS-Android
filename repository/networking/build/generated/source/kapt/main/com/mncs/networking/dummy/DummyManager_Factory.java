package com.mncs.networking.dummy;

import dagger.internal.DaggerGenerated;
import dagger.internal.Factory;
import javax.annotation.processing.Generated;
import javax.inject.Provider;

@DaggerGenerated
@Generated(
    value = "dagger.internal.codegen.ComponentProcessor",
    comments = "https://dagger.dev"
)
@SuppressWarnings({
    "unchecked",
    "rawtypes"
})
public final class DummyManager_Factory implements Factory<DummyManager> {
  private final Provider<DummyService> dummyServiceProvider;

  public DummyManager_Factory(Provider<DummyService> dummyServiceProvider) {
    this.dummyServiceProvider = dummyServiceProvider;
  }

  @Override
  public DummyManager get() {
    return newInstance(dummyServiceProvider.get());
  }

  public static DummyManager_Factory create(Provider<DummyService> dummyServiceProvider) {
    return new DummyManager_Factory(dummyServiceProvider);
  }

  public static DummyManager newInstance(DummyService dummyService) {
    return new DummyManager(dummyService);
  }
}
