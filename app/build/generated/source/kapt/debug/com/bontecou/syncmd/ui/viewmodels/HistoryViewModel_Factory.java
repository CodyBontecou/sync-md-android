package com.bontecou.syncmd.ui.viewmodels;

import com.bontecou.syncmd.services.git.HistoryService;
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
public final class HistoryViewModel_Factory implements Factory<HistoryViewModel> {
  private final Provider<HistoryService> historyServiceProvider;

  public HistoryViewModel_Factory(Provider<HistoryService> historyServiceProvider) {
    this.historyServiceProvider = historyServiceProvider;
  }

  @Override
  public HistoryViewModel get() {
    return newInstance(historyServiceProvider.get());
  }

  public static HistoryViewModel_Factory create(Provider<HistoryService> historyServiceProvider) {
    return new HistoryViewModel_Factory(historyServiceProvider);
  }

  public static HistoryViewModel newInstance(HistoryService historyService) {
    return new HistoryViewModel(historyService);
  }
}
