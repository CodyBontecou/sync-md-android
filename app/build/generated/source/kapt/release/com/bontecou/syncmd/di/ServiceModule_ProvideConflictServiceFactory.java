package com.bontecou.syncmd.di;

import com.bontecou.syncmd.domain.repository.ConflictRepository;
import com.bontecou.syncmd.services.git.ConflictService;
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
public final class ServiceModule_ProvideConflictServiceFactory implements Factory<ConflictService> {
  private final Provider<ConflictRepository> conflictRepositoryProvider;

  public ServiceModule_ProvideConflictServiceFactory(
      Provider<ConflictRepository> conflictRepositoryProvider) {
    this.conflictRepositoryProvider = conflictRepositoryProvider;
  }

  @Override
  public ConflictService get() {
    return provideConflictService(conflictRepositoryProvider.get());
  }

  public static ServiceModule_ProvideConflictServiceFactory create(
      Provider<ConflictRepository> conflictRepositoryProvider) {
    return new ServiceModule_ProvideConflictServiceFactory(conflictRepositoryProvider);
  }

  public static ConflictService provideConflictService(ConflictRepository conflictRepository) {
    return Preconditions.checkNotNullFromProvides(ServiceModule.INSTANCE.provideConflictService(conflictRepository));
  }
}
