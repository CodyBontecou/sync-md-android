package com.bontecou.syncmd.ui.viewmodels;

import com.bontecou.syncmd.services.git.BranchService;
import dagger.internal.DaggerGenerated;
import dagger.internal.Factory;
import dagger.internal.QualifierMetadata;
import dagger.internal.ScopeMetadata;
import javax.annotation.processing.Generated;
import javax.inject.Provider;

@ScopeMetadata
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
public final class BranchViewModel_Factory implements Factory<BranchViewModel> {
  private final Provider<BranchService> branchServiceProvider;

  public BranchViewModel_Factory(Provider<BranchService> branchServiceProvider) {
    this.branchServiceProvider = branchServiceProvider;
  }

  @Override
  public BranchViewModel get() {
    return newInstance(branchServiceProvider.get());
  }

  public static BranchViewModel_Factory create(Provider<BranchService> branchServiceProvider) {
    return new BranchViewModel_Factory(branchServiceProvider);
  }

  public static BranchViewModel newInstance(BranchService branchService) {
    return new BranchViewModel(branchService);
  }
}
