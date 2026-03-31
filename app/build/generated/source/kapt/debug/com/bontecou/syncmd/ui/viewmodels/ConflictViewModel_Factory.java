package com.bontecou.syncmd.ui.viewmodels;

import com.bontecou.syncmd.services.git.ConflictService;
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
public final class ConflictViewModel_Factory implements Factory<ConflictViewModel> {
  private final Provider<ConflictService> conflictServiceProvider;

  public ConflictViewModel_Factory(Provider<ConflictService> conflictServiceProvider) {
    this.conflictServiceProvider = conflictServiceProvider;
  }

  @Override
  public ConflictViewModel get() {
    return newInstance(conflictServiceProvider.get());
  }

  public static ConflictViewModel_Factory create(
      Provider<ConflictService> conflictServiceProvider) {
    return new ConflictViewModel_Factory(conflictServiceProvider);
  }

  public static ConflictViewModel newInstance(ConflictService conflictService) {
    return new ConflictViewModel(conflictService);
  }
}
