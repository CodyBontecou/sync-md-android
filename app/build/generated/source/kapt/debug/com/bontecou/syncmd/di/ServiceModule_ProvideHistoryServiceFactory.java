package com.bontecou.syncmd.di;

import com.bontecou.syncmd.domain.repository.HistoryRepository;
import com.bontecou.syncmd.services.git.HistoryService;
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
public final class ServiceModule_ProvideHistoryServiceFactory implements Factory<HistoryService> {
  private final Provider<HistoryRepository> historyRepositoryProvider;

  public ServiceModule_ProvideHistoryServiceFactory(
      Provider<HistoryRepository> historyRepositoryProvider) {
    this.historyRepositoryProvider = historyRepositoryProvider;
  }

  @Override
  public HistoryService get() {
    return provideHistoryService(historyRepositoryProvider.get());
  }

  public static ServiceModule_ProvideHistoryServiceFactory create(
      Provider<HistoryRepository> historyRepositoryProvider) {
    return new ServiceModule_ProvideHistoryServiceFactory(historyRepositoryProvider);
  }

  public static HistoryService provideHistoryService(HistoryRepository historyRepository) {
    return Preconditions.checkNotNullFromProvides(ServiceModule.INSTANCE.provideHistoryService(historyRepository));
  }
}
