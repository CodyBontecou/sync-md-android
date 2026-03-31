package com.bontecou.syncmd.ui.viewmodels;

import com.bontecou.syncmd.services.git.DiffService;
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
public final class DiffViewModel_Factory implements Factory<DiffViewModel> {
  private final Provider<DiffService> diffServiceProvider;

  public DiffViewModel_Factory(Provider<DiffService> diffServiceProvider) {
    this.diffServiceProvider = diffServiceProvider;
  }

  @Override
  public DiffViewModel get() {
    return newInstance(diffServiceProvider.get());
  }

  public static DiffViewModel_Factory create(Provider<DiffService> diffServiceProvider) {
    return new DiffViewModel_Factory(diffServiceProvider);
  }

  public static DiffViewModel newInstance(DiffService diffService) {
    return new DiffViewModel(diffService);
  }
}
