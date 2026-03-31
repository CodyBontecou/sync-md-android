package com.bontecou.syncmd.di;

import com.bontecou.syncmd.domain.repository.DiffRepository;
import com.bontecou.syncmd.services.git.DiffService;
import dagger.internal.DaggerGenerated;
import dagger.internal.Factory;
import dagger.internal.Preconditions;
import dagger.internal.QualifierMetadata;
import dagger.internal.ScopeMetadata;
import javax.annotation.processing.Generated;
import javax.inject.Provider;

@ScopeMetadata("javax.inject.Singleton")
@QualifierMetadata
@DaggerGenerated
@Generated(
    value = "dagger.internal.codegen.ComponentProcessor",
    comments = "https://dagger.dev"
)
@SuppressWarnings({
    "unchecked",
    "rawtypes",
    "KotlinInternal",
    "KotlinInternalInJava"
})
public final class ServiceModule_ProvideDiffServiceFactory implements Factory<DiffService> {
  private final Provider<DiffRepository> diffRepositoryProvider;

  public ServiceModule_ProvideDiffServiceFactory(Provider<DiffRepository> diffRepositoryProvider) {
    this.diffRepositoryProvider = diffRepositoryProvider;
  }

  @Override
  public DiffService get() {
    return provideDiffService(diffRepositoryProvider.get());
  }

  public static ServiceModule_ProvideDiffServiceFactory create(
      Provider<DiffRepository> diffRepositoryProvider) {
    return new ServiceModule_ProvideDiffServiceFactory(diffRepositoryProvider);
  }

  public static DiffService provideDiffService(DiffRepository diffRepository) {
    return Preconditions.checkNotNullFromProvides(ServiceModule.INSTANCE.provideDiffService(diffRepository));
  }
}
