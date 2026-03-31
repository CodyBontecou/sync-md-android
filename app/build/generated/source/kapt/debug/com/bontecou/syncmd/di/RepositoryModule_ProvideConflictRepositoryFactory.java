package com.bontecou.syncmd.di;

import com.bontecou.syncmd.domain.repository.ConflictRepository;
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
public final class RepositoryModule_ProvideConflictRepositoryFactory implements Factory<ConflictRepository> {
  @Override
  public ConflictRepository get() {
    return provideConflictRepository();
  }

  public static RepositoryModule_ProvideConflictRepositoryFactory create() {
    return InstanceHolder.INSTANCE;
  }

  public static ConflictRepository provideConflictRepository() {
    return Preconditions.checkNotNullFromProvides(RepositoryModule.INSTANCE.provideConflictRepository());
  }

  private static final class InstanceHolder {
    private static final RepositoryModule_ProvideConflictRepositoryFactory INSTANCE = new RepositoryModule_ProvideConflictRepositoryFactory();
  }
}
