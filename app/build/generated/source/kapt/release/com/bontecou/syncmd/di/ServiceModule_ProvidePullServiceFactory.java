package com.bontecou.syncmd.di;

import com.bontecou.syncmd.domain.repository.PullRepository;
import com.bontecou.syncmd.services.git.PullService;
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
public final class ServiceModule_ProvidePullServiceFactory implements Factory<PullService> {
  private final Provider<PullRepository> pullRepositoryProvider;

  public ServiceModule_ProvidePullServiceFactory(Provider<PullRepository> pullRepositoryProvider) {
    this.pullRepositoryProvider = pullRepositoryProvider;
  }

  @Override
  public PullService get() {
    return providePullService(pullRepositoryProvider.get());
  }

  public static ServiceModule_ProvidePullServiceFactory create(
      Provider<PullRepository> pullRepositoryProvider) {
    return new ServiceModule_ProvidePullServiceFactory(pullRepositoryProvider);
  }

  public static PullService providePullService(PullRepository pullRepository) {
    return Preconditions.checkNotNullFromProvides(ServiceModule.INSTANCE.providePullService(pullRepository));
  }
}
