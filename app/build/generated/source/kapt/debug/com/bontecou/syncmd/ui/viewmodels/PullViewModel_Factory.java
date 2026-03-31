package com.bontecou.syncmd.ui.viewmodels;

import com.bontecou.syncmd.services.git.PullService;
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
public final class PullViewModel_Factory implements Factory<PullViewModel> {
  private final Provider<PullService> pullServiceProvider;

  public PullViewModel_Factory(Provider<PullService> pullServiceProvider) {
    this.pullServiceProvider = pullServiceProvider;
  }

  @Override
  public PullViewModel get() {
    return newInstance(pullServiceProvider.get());
  }

  public static PullViewModel_Factory create(Provider<PullService> pullServiceProvider) {
    return new PullViewModel_Factory(pullServiceProvider);
  }

  public static PullViewModel newInstance(PullService pullService) {
    return new PullViewModel(pullService);
  }
}
