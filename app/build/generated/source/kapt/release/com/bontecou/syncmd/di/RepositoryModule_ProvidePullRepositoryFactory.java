package com.bontecou.syncmd.di;

import com.bontecou.syncmd.domain.repository.PullRepository;
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
public final class RepositoryModule_ProvidePullRepositoryFactory implements Factory<PullRepository> {
  @Override
  public PullRepository get() {
    return providePullRepository();
  }

  public static RepositoryModule_ProvidePullRepositoryFactory create() {
    return InstanceHolder.INSTANCE;
  }

  public static PullRepository providePullRepository() {
    return Preconditions.checkNotNullFromProvides(RepositoryModule.INSTANCE.providePullRepository());
  }

  private static final class InstanceHolder {
    private static final RepositoryModule_ProvidePullRepositoryFactory INSTANCE = new RepositoryModule_ProvidePullRepositoryFactory();
  }
}
