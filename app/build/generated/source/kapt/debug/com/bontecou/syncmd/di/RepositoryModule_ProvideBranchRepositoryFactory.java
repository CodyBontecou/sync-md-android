package com.bontecou.syncmd.di;

import com.bontecou.syncmd.domain.repository.BranchRepository;
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
public final class RepositoryModule_ProvideBranchRepositoryFactory implements Factory<BranchRepository> {
  @Override
  public BranchRepository get() {
    return provideBranchRepository();
  }

  public static RepositoryModule_ProvideBranchRepositoryFactory create() {
    return InstanceHolder.INSTANCE;
  }

  public static BranchRepository provideBranchRepository() {
    return Preconditions.checkNotNullFromProvides(RepositoryModule.INSTANCE.provideBranchRepository());
  }

  private static final class InstanceHolder {
    private static final RepositoryModule_ProvideBranchRepositoryFactory INSTANCE = new RepositoryModule_ProvideBranchRepositoryFactory();
  }
}
