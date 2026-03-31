package com.bontecou.syncmd.di;

import com.bontecou.syncmd.domain.repository.DiffRepository;
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
public final class RepositoryModule_ProvideDiffRepositoryFactory implements Factory<DiffRepository> {
  @Override
  public DiffRepository get() {
    return provideDiffRepository();
  }

  public static RepositoryModule_ProvideDiffRepositoryFactory create() {
    return InstanceHolder.INSTANCE;
  }

  public static DiffRepository provideDiffRepository() {
    return Preconditions.checkNotNullFromProvides(RepositoryModule.INSTANCE.provideDiffRepository());
  }

  private static final class InstanceHolder {
    private static final RepositoryModule_ProvideDiffRepositoryFactory INSTANCE = new RepositoryModule_ProvideDiffRepositoryFactory();
  }
}
