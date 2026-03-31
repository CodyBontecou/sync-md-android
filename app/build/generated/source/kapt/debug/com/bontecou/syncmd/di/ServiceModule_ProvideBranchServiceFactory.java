package com.bontecou.syncmd.di;

import com.bontecou.syncmd.domain.repository.BranchRepository;
import com.bontecou.syncmd.services.git.BranchService;
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
public final class ServiceModule_ProvideBranchServiceFactory implements Factory<BranchService> {
  private final Provider<BranchRepository> branchRepositoryProvider;

  public ServiceModule_ProvideBranchServiceFactory(
      Provider<BranchRepository> branchRepositoryProvider) {
    this.branchRepositoryProvider = branchRepositoryProvider;
  }

  @Override
  public BranchService get() {
    return provideBranchService(branchRepositoryProvider.get());
  }

  public static ServiceModule_ProvideBranchServiceFactory create(
      Provider<BranchRepository> branchRepositoryProvider) {
    return new ServiceModule_ProvideBranchServiceFactory(branchRepositoryProvider);
  }

  public static BranchService provideBranchService(BranchRepository branchRepository) {
    return Preconditions.checkNotNullFromProvides(ServiceModule.INSTANCE.provideBranchService(branchRepository));
  }
}
