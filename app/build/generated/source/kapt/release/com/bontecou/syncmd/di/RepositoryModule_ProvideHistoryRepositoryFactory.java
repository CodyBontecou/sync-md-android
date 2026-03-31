package com.bontecou.syncmd.di;

import com.bontecou.syncmd.domain.repository.HistoryRepository;
import dagger.internal.DaggerGenerated;
import dagger.internal.Factory;
import dagger.internal.Preconditions;
import dagger.internal.QualifierMetadata;
import dagger.internal.ScopeMetadata;
import javax.annotation.processing.Generated;

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
public final class RepositoryModule_ProvideHistoryRepositoryFactory implements Factory<HistoryRepository> {
  @Override
  public HistoryRepository get() {
    return provideHistoryRepository();
  }

  public static RepositoryModule_ProvideHistoryRepositoryFactory create() {
    return InstanceHolder.INSTANCE;
  }

  public static HistoryRepository provideHistoryRepository() {
    return Preconditions.checkNotNullFromProvides(RepositoryModule.INSTANCE.provideHistoryRepository());
  }

  private static final class InstanceHolder {
    private static final RepositoryModule_ProvideHistoryRepositoryFactory INSTANCE = new RepositoryModule_ProvideHistoryRepositoryFactory();
  }
}
