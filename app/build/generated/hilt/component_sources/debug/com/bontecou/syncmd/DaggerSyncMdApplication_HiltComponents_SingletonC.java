package com.bontecou.syncmd;

import android.app.Activity;
import android.app.Service;
import android.view.View;
import androidx.fragment.app.Fragment;
import androidx.lifecycle.SavedStateHandle;
import androidx.lifecycle.ViewModel;
import com.bontecou.syncmd.di.RepositoryModule;
import com.bontecou.syncmd.di.RepositoryModule_ProvideBranchRepositoryFactory;
import com.bontecou.syncmd.di.RepositoryModule_ProvideConflictRepositoryFactory;
import com.bontecou.syncmd.di.RepositoryModule_ProvideDiffRepositoryFactory;
import com.bontecou.syncmd.di.RepositoryModule_ProvideHistoryRepositoryFactory;
import com.bontecou.syncmd.di.RepositoryModule_ProvidePullRepositoryFactory;
import com.bontecou.syncmd.di.ServiceModule;
import com.bontecou.syncmd.di.ServiceModule_ProvideBranchServiceFactory;
import com.bontecou.syncmd.di.ServiceModule_ProvideConflictServiceFactory;
import com.bontecou.syncmd.di.ServiceModule_ProvideDiffServiceFactory;
import com.bontecou.syncmd.di.ServiceModule_ProvideHistoryServiceFactory;
import com.bontecou.syncmd.di.ServiceModule_ProvidePullServiceFactory;
import com.bontecou.syncmd.domain.repository.BranchRepository;
import com.bontecou.syncmd.domain.repository.ConflictRepository;
import com.bontecou.syncmd.domain.repository.DiffRepository;
import com.bontecou.syncmd.domain.repository.HistoryRepository;
import com.bontecou.syncmd.domain.repository.PullRepository;
import com.bontecou.syncmd.services.git.BranchService;
import com.bontecou.syncmd.services.git.ConflictService;
import com.bontecou.syncmd.services.git.DiffService;
import com.bontecou.syncmd.services.git.HistoryService;
import com.bontecou.syncmd.services.git.PullService;
import com.bontecou.syncmd.ui.viewmodels.BranchViewModel;
import com.bontecou.syncmd.ui.viewmodels.BranchViewModel_HiltModules_KeyModule_ProvideFactory;
import com.bontecou.syncmd.ui.viewmodels.ConflictViewModel;
import com.bontecou.syncmd.ui.viewmodels.ConflictViewModel_HiltModules_KeyModule_ProvideFactory;
import com.bontecou.syncmd.ui.viewmodels.DiffViewModel;
import com.bontecou.syncmd.ui.viewmodels.DiffViewModel_HiltModules_KeyModule_ProvideFactory;
import com.bontecou.syncmd.ui.viewmodels.HistoryViewModel;
import com.bontecou.syncmd.ui.viewmodels.HistoryViewModel_HiltModules_KeyModule_ProvideFactory;
import com.bontecou.syncmd.ui.viewmodels.PullViewModel;
import com.bontecou.syncmd.ui.viewmodels.PullViewModel_HiltModules_KeyModule_ProvideFactory;
import com.bontecou.syncmd.ui.viewmodels.SettingsViewModel;
import com.bontecou.syncmd.ui.viewmodels.SettingsViewModel_HiltModules_KeyModule_ProvideFactory;
import dagger.hilt.android.ActivityRetainedLifecycle;
import dagger.hilt.android.ViewModelLifecycle;
import dagger.hilt.android.flags.HiltWrapper_FragmentGetContextFix_FragmentGetContextFixModule;
import dagger.hilt.android.internal.builders.ActivityComponentBuilder;
import dagger.hilt.android.internal.builders.ActivityRetainedComponentBuilder;
import dagger.hilt.android.internal.builders.FragmentComponentBuilder;
import dagger.hilt.android.internal.builders.ServiceComponentBuilder;
import dagger.hilt.android.internal.builders.ViewComponentBuilder;
import dagger.hilt.android.internal.builders.ViewModelComponentBuilder;
import dagger.hilt.android.internal.builders.ViewWithFragmentComponentBuilder;
import dagger.hilt.android.internal.lifecycle.DefaultViewModelFactories;
import dagger.hilt.android.internal.lifecycle.DefaultViewModelFactories_InternalFactoryFactory_Factory;
import dagger.hilt.android.internal.managers.ActivityRetainedComponentManager_LifecycleModule_ProvideActivityRetainedLifecycleFactory;
import dagger.hilt.android.internal.modules.ApplicationContextModule;
import dagger.hilt.android.internal.modules.ApplicationContextModule_ProvideContextFactory;
import dagger.internal.DaggerGenerated;
import dagger.internal.DoubleCheck;
import dagger.internal.MapBuilder;
import dagger.internal.Preconditions;
import dagger.internal.SetBuilder;
import java.util.Collections;
import java.util.Map;
import java.util.Set;
import javax.annotation.processing.Generated;
import javax.inject.Provider;

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
public final class DaggerSyncMdApplication_HiltComponents_SingletonC {
  private DaggerSyncMdApplication_HiltComponents_SingletonC() {
  }

  public static Builder builder() {
    return new Builder();
  }

  public static final class Builder {
    private ApplicationContextModule applicationContextModule;

    private Builder() {
    }

    public Builder applicationContextModule(ApplicationContextModule applicationContextModule) {
      this.applicationContextModule = Preconditions.checkNotNull(applicationContextModule);
      return this;
    }

    /**
     * @deprecated This module is declared, but an instance is not used in the component. This method is a no-op. For more, see https://dagger.dev/unused-modules.
     */
    @Deprecated
    public Builder hiltWrapper_FragmentGetContextFix_FragmentGetContextFixModule(
        HiltWrapper_FragmentGetContextFix_FragmentGetContextFixModule hiltWrapper_FragmentGetContextFix_FragmentGetContextFixModule) {
      Preconditions.checkNotNull(hiltWrapper_FragmentGetContextFix_FragmentGetContextFixModule);
      return this;
    }

    /**
     * @deprecated This module is declared, but an instance is not used in the component. This method is a no-op. For more, see https://dagger.dev/unused-modules.
     */
    @Deprecated
    public Builder repositoryModule(RepositoryModule repositoryModule) {
      Preconditions.checkNotNull(repositoryModule);
      return this;
    }

    /**
     * @deprecated This module is declared, but an instance is not used in the component. This method is a no-op. For more, see https://dagger.dev/unused-modules.
     */
    @Deprecated
    public Builder serviceModule(ServiceModule serviceModule) {
      Preconditions.checkNotNull(serviceModule);
      return this;
    }

    public SyncMdApplication_HiltComponents.SingletonC build() {
      Preconditions.checkBuilderRequirement(applicationContextModule, ApplicationContextModule.class);
      return new SingletonCImpl(applicationContextModule);
    }
  }

  private static final class ActivityRetainedCBuilder implements SyncMdApplication_HiltComponents.ActivityRetainedC.Builder {
    private final SingletonCImpl singletonCImpl;

    private ActivityRetainedCBuilder(SingletonCImpl singletonCImpl) {
      this.singletonCImpl = singletonCImpl;
    }

    @Override
    public SyncMdApplication_HiltComponents.ActivityRetainedC build() {
      return new ActivityRetainedCImpl(singletonCImpl);
    }
  }

  private static final class ActivityCBuilder implements SyncMdApplication_HiltComponents.ActivityC.Builder {
    private final SingletonCImpl singletonCImpl;

    private final ActivityRetainedCImpl activityRetainedCImpl;

    private Activity activity;

    private ActivityCBuilder(SingletonCImpl singletonCImpl,
        ActivityRetainedCImpl activityRetainedCImpl) {
      this.singletonCImpl = singletonCImpl;
      this.activityRetainedCImpl = activityRetainedCImpl;
    }

    @Override
    public ActivityCBuilder activity(Activity activity) {
      this.activity = Preconditions.checkNotNull(activity);
      return this;
    }

    @Override
    public SyncMdApplication_HiltComponents.ActivityC build() {
      Preconditions.checkBuilderRequirement(activity, Activity.class);
      return new ActivityCImpl(singletonCImpl, activityRetainedCImpl, activity);
    }
  }

  private static final class FragmentCBuilder implements SyncMdApplication_HiltComponents.FragmentC.Builder {
    private final SingletonCImpl singletonCImpl;

    private final ActivityRetainedCImpl activityRetainedCImpl;

    private final ActivityCImpl activityCImpl;

    private Fragment fragment;

    private FragmentCBuilder(SingletonCImpl singletonCImpl,
        ActivityRetainedCImpl activityRetainedCImpl, ActivityCImpl activityCImpl) {
      this.singletonCImpl = singletonCImpl;
      this.activityRetainedCImpl = activityRetainedCImpl;
      this.activityCImpl = activityCImpl;
    }

    @Override
    public FragmentCBuilder fragment(Fragment fragment) {
      this.fragment = Preconditions.checkNotNull(fragment);
      return this;
    }

    @Override
    public SyncMdApplication_HiltComponents.FragmentC build() {
      Preconditions.checkBuilderRequirement(fragment, Fragment.class);
      return new FragmentCImpl(singletonCImpl, activityRetainedCImpl, activityCImpl, fragment);
    }
  }

  private static final class ViewWithFragmentCBuilder implements SyncMdApplication_HiltComponents.ViewWithFragmentC.Builder {
    private final SingletonCImpl singletonCImpl;

    private final ActivityRetainedCImpl activityRetainedCImpl;

    private final ActivityCImpl activityCImpl;

    private final FragmentCImpl fragmentCImpl;

    private View view;

    private ViewWithFragmentCBuilder(SingletonCImpl singletonCImpl,
        ActivityRetainedCImpl activityRetainedCImpl, ActivityCImpl activityCImpl,
        FragmentCImpl fragmentCImpl) {
      this.singletonCImpl = singletonCImpl;
      this.activityRetainedCImpl = activityRetainedCImpl;
      this.activityCImpl = activityCImpl;
      this.fragmentCImpl = fragmentCImpl;
    }

    @Override
    public ViewWithFragmentCBuilder view(View view) {
      this.view = Preconditions.checkNotNull(view);
      return this;
    }

    @Override
    public SyncMdApplication_HiltComponents.ViewWithFragmentC build() {
      Preconditions.checkBuilderRequirement(view, View.class);
      return new ViewWithFragmentCImpl(singletonCImpl, activityRetainedCImpl, activityCImpl, fragmentCImpl, view);
    }
  }

  private static final class ViewCBuilder implements SyncMdApplication_HiltComponents.ViewC.Builder {
    private final SingletonCImpl singletonCImpl;

    private final ActivityRetainedCImpl activityRetainedCImpl;

    private final ActivityCImpl activityCImpl;

    private View view;

    private ViewCBuilder(SingletonCImpl singletonCImpl, ActivityRetainedCImpl activityRetainedCImpl,
        ActivityCImpl activityCImpl) {
      this.singletonCImpl = singletonCImpl;
      this.activityRetainedCImpl = activityRetainedCImpl;
      this.activityCImpl = activityCImpl;
    }

    @Override
    public ViewCBuilder view(View view) {
      this.view = Preconditions.checkNotNull(view);
      return this;
    }

    @Override
    public SyncMdApplication_HiltComponents.ViewC build() {
      Preconditions.checkBuilderRequirement(view, View.class);
      return new ViewCImpl(singletonCImpl, activityRetainedCImpl, activityCImpl, view);
    }
  }

  private static final class ViewModelCBuilder implements SyncMdApplication_HiltComponents.ViewModelC.Builder {
    private final SingletonCImpl singletonCImpl;

    private final ActivityRetainedCImpl activityRetainedCImpl;

    private SavedStateHandle savedStateHandle;

    private ViewModelLifecycle viewModelLifecycle;

    private ViewModelCBuilder(SingletonCImpl singletonCImpl,
        ActivityRetainedCImpl activityRetainedCImpl) {
      this.singletonCImpl = singletonCImpl;
      this.activityRetainedCImpl = activityRetainedCImpl;
    }

    @Override
    public ViewModelCBuilder savedStateHandle(SavedStateHandle handle) {
      this.savedStateHandle = Preconditions.checkNotNull(handle);
      return this;
    }

    @Override
    public ViewModelCBuilder viewModelLifecycle(ViewModelLifecycle viewModelLifecycle) {
      this.viewModelLifecycle = Preconditions.checkNotNull(viewModelLifecycle);
      return this;
    }

    @Override
    public SyncMdApplication_HiltComponents.ViewModelC build() {
      Preconditions.checkBuilderRequirement(savedStateHandle, SavedStateHandle.class);
      Preconditions.checkBuilderRequirement(viewModelLifecycle, ViewModelLifecycle.class);
      return new ViewModelCImpl(singletonCImpl, activityRetainedCImpl, savedStateHandle, viewModelLifecycle);
    }
  }

  private static final class ServiceCBuilder implements SyncMdApplication_HiltComponents.ServiceC.Builder {
    private final SingletonCImpl singletonCImpl;

    private Service service;

    private ServiceCBuilder(SingletonCImpl singletonCImpl) {
      this.singletonCImpl = singletonCImpl;
    }

    @Override
    public ServiceCBuilder service(Service service) {
      this.service = Preconditions.checkNotNull(service);
      return this;
    }

    @Override
    public SyncMdApplication_HiltComponents.ServiceC build() {
      Preconditions.checkBuilderRequirement(service, Service.class);
      return new ServiceCImpl(singletonCImpl, service);
    }
  }

  private static final class ViewWithFragmentCImpl extends SyncMdApplication_HiltComponents.ViewWithFragmentC {
    private final SingletonCImpl singletonCImpl;

    private final ActivityRetainedCImpl activityRetainedCImpl;

    private final ActivityCImpl activityCImpl;

    private final FragmentCImpl fragmentCImpl;

    private final ViewWithFragmentCImpl viewWithFragmentCImpl = this;

    private ViewWithFragmentCImpl(SingletonCImpl singletonCImpl,
        ActivityRetainedCImpl activityRetainedCImpl, ActivityCImpl activityCImpl,
        FragmentCImpl fragmentCImpl, View viewParam) {
      this.singletonCImpl = singletonCImpl;
      this.activityRetainedCImpl = activityRetainedCImpl;
      this.activityCImpl = activityCImpl;
      this.fragmentCImpl = fragmentCImpl;


    }
  }

  private static final class FragmentCImpl extends SyncMdApplication_HiltComponents.FragmentC {
    private final SingletonCImpl singletonCImpl;

    private final ActivityRetainedCImpl activityRetainedCImpl;

    private final ActivityCImpl activityCImpl;

    private final FragmentCImpl fragmentCImpl = this;

    private FragmentCImpl(SingletonCImpl singletonCImpl,
        ActivityRetainedCImpl activityRetainedCImpl, ActivityCImpl activityCImpl,
        Fragment fragmentParam) {
      this.singletonCImpl = singletonCImpl;
      this.activityRetainedCImpl = activityRetainedCImpl;
      this.activityCImpl = activityCImpl;


    }

    @Override
    public DefaultViewModelFactories.InternalFactoryFactory getHiltInternalFactoryFactory() {
      return activityCImpl.getHiltInternalFactoryFactory();
    }

    @Override
    public ViewWithFragmentComponentBuilder viewWithFragmentComponentBuilder() {
      return new ViewWithFragmentCBuilder(singletonCImpl, activityRetainedCImpl, activityCImpl, fragmentCImpl);
    }
  }

  private static final class ViewCImpl extends SyncMdApplication_HiltComponents.ViewC {
    private final SingletonCImpl singletonCImpl;

    private final ActivityRetainedCImpl activityRetainedCImpl;

    private final ActivityCImpl activityCImpl;

    private final ViewCImpl viewCImpl = this;

    private ViewCImpl(SingletonCImpl singletonCImpl, ActivityRetainedCImpl activityRetainedCImpl,
        ActivityCImpl activityCImpl, View viewParam) {
      this.singletonCImpl = singletonCImpl;
      this.activityRetainedCImpl = activityRetainedCImpl;
      this.activityCImpl = activityCImpl;


    }
  }

  private static final class ActivityCImpl extends SyncMdApplication_HiltComponents.ActivityC {
    private final SingletonCImpl singletonCImpl;

    private final ActivityRetainedCImpl activityRetainedCImpl;

    private final ActivityCImpl activityCImpl = this;

    private ActivityCImpl(SingletonCImpl singletonCImpl,
        ActivityRetainedCImpl activityRetainedCImpl, Activity activityParam) {
      this.singletonCImpl = singletonCImpl;
      this.activityRetainedCImpl = activityRetainedCImpl;


    }

    @Override
    public void injectMainActivity(MainActivity arg0) {
    }

    @Override
    public DefaultViewModelFactories.InternalFactoryFactory getHiltInternalFactoryFactory() {
      return DefaultViewModelFactories_InternalFactoryFactory_Factory.newInstance(getViewModelKeys(), new ViewModelCBuilder(singletonCImpl, activityRetainedCImpl));
    }

    @Override
    public Set<String> getViewModelKeys() {
      return SetBuilder.<String>newSetBuilder(6).add(BranchViewModel_HiltModules_KeyModule_ProvideFactory.provide()).add(ConflictViewModel_HiltModules_KeyModule_ProvideFactory.provide()).add(DiffViewModel_HiltModules_KeyModule_ProvideFactory.provide()).add(HistoryViewModel_HiltModules_KeyModule_ProvideFactory.provide()).add(PullViewModel_HiltModules_KeyModule_ProvideFactory.provide()).add(SettingsViewModel_HiltModules_KeyModule_ProvideFactory.provide()).build();
    }

    @Override
    public ViewModelComponentBuilder getViewModelComponentBuilder() {
      return new ViewModelCBuilder(singletonCImpl, activityRetainedCImpl);
    }

    @Override
    public FragmentComponentBuilder fragmentComponentBuilder() {
      return new FragmentCBuilder(singletonCImpl, activityRetainedCImpl, activityCImpl);
    }

    @Override
    public ViewComponentBuilder viewComponentBuilder() {
      return new ViewCBuilder(singletonCImpl, activityRetainedCImpl, activityCImpl);
    }
  }

  private static final class ViewModelCImpl extends SyncMdApplication_HiltComponents.ViewModelC {
    private final SingletonCImpl singletonCImpl;

    private final ActivityRetainedCImpl activityRetainedCImpl;

    private final ViewModelCImpl viewModelCImpl = this;

    private Provider<BranchViewModel> branchViewModelProvider;

    private Provider<ConflictViewModel> conflictViewModelProvider;

    private Provider<DiffViewModel> diffViewModelProvider;

    private Provider<HistoryViewModel> historyViewModelProvider;

    private Provider<PullViewModel> pullViewModelProvider;

    private Provider<SettingsViewModel> settingsViewModelProvider;

    private ViewModelCImpl(SingletonCImpl singletonCImpl,
        ActivityRetainedCImpl activityRetainedCImpl, SavedStateHandle savedStateHandleParam,
        ViewModelLifecycle viewModelLifecycleParam) {
      this.singletonCImpl = singletonCImpl;
      this.activityRetainedCImpl = activityRetainedCImpl;

      initialize(savedStateHandleParam, viewModelLifecycleParam);

    }

    @SuppressWarnings("unchecked")
    private void initialize(final SavedStateHandle savedStateHandleParam,
        final ViewModelLifecycle viewModelLifecycleParam) {
      this.branchViewModelProvider = new SwitchingProvider<>(singletonCImpl, activityRetainedCImpl, viewModelCImpl, 0);
      this.conflictViewModelProvider = new SwitchingProvider<>(singletonCImpl, activityRetainedCImpl, viewModelCImpl, 1);
      this.diffViewModelProvider = new SwitchingProvider<>(singletonCImpl, activityRetainedCImpl, viewModelCImpl, 2);
      this.historyViewModelProvider = new SwitchingProvider<>(singletonCImpl, activityRetainedCImpl, viewModelCImpl, 3);
      this.pullViewModelProvider = new SwitchingProvider<>(singletonCImpl, activityRetainedCImpl, viewModelCImpl, 4);
      this.settingsViewModelProvider = new SwitchingProvider<>(singletonCImpl, activityRetainedCImpl, viewModelCImpl, 5);
    }

    @Override
    public Map<String, Provider<ViewModel>> getHiltViewModelMap() {
      return MapBuilder.<String, Provider<ViewModel>>newMapBuilder(6).put("com.bontecou.syncmd.ui.viewmodels.BranchViewModel", ((Provider) branchViewModelProvider)).put("com.bontecou.syncmd.ui.viewmodels.ConflictViewModel", ((Provider) conflictViewModelProvider)).put("com.bontecou.syncmd.ui.viewmodels.DiffViewModel", ((Provider) diffViewModelProvider)).put("com.bontecou.syncmd.ui.viewmodels.HistoryViewModel", ((Provider) historyViewModelProvider)).put("com.bontecou.syncmd.ui.viewmodels.PullViewModel", ((Provider) pullViewModelProvider)).put("com.bontecou.syncmd.ui.viewmodels.SettingsViewModel", ((Provider) settingsViewModelProvider)).build();
    }

    private static final class SwitchingProvider<T> implements Provider<T> {
      private final SingletonCImpl singletonCImpl;

      private final ActivityRetainedCImpl activityRetainedCImpl;

      private final ViewModelCImpl viewModelCImpl;

      private final int id;

      SwitchingProvider(SingletonCImpl singletonCImpl, ActivityRetainedCImpl activityRetainedCImpl,
          ViewModelCImpl viewModelCImpl, int id) {
        this.singletonCImpl = singletonCImpl;
        this.activityRetainedCImpl = activityRetainedCImpl;
        this.viewModelCImpl = viewModelCImpl;
        this.id = id;
      }

      @SuppressWarnings("unchecked")
      @Override
      public T get() {
        switch (id) {
          case 0: // com.bontecou.syncmd.ui.viewmodels.BranchViewModel 
          return (T) new BranchViewModel(singletonCImpl.provideBranchServiceProvider.get());

          case 1: // com.bontecou.syncmd.ui.viewmodels.ConflictViewModel 
          return (T) new ConflictViewModel(singletonCImpl.provideConflictServiceProvider.get());

          case 2: // com.bontecou.syncmd.ui.viewmodels.DiffViewModel 
          return (T) new DiffViewModel(singletonCImpl.provideDiffServiceProvider.get());

          case 3: // com.bontecou.syncmd.ui.viewmodels.HistoryViewModel 
          return (T) new HistoryViewModel(singletonCImpl.provideHistoryServiceProvider.get());

          case 4: // com.bontecou.syncmd.ui.viewmodels.PullViewModel 
          return (T) new PullViewModel(singletonCImpl.providePullServiceProvider.get());

          case 5: // com.bontecou.syncmd.ui.viewmodels.SettingsViewModel 
          return (T) new SettingsViewModel(ApplicationContextModule_ProvideContextFactory.provideContext(singletonCImpl.applicationContextModule));

          default: throw new AssertionError(id);
        }
      }
    }
  }

  private static final class ActivityRetainedCImpl extends SyncMdApplication_HiltComponents.ActivityRetainedC {
    private final SingletonCImpl singletonCImpl;

    private final ActivityRetainedCImpl activityRetainedCImpl = this;

    private Provider<ActivityRetainedLifecycle> provideActivityRetainedLifecycleProvider;

    private ActivityRetainedCImpl(SingletonCImpl singletonCImpl) {
      this.singletonCImpl = singletonCImpl;

      initialize();

    }

    @SuppressWarnings("unchecked")
    private void initialize() {
      this.provideActivityRetainedLifecycleProvider = DoubleCheck.provider(new SwitchingProvider<ActivityRetainedLifecycle>(singletonCImpl, activityRetainedCImpl, 0));
    }

    @Override
    public ActivityComponentBuilder activityComponentBuilder() {
      return new ActivityCBuilder(singletonCImpl, activityRetainedCImpl);
    }

    @Override
    public ActivityRetainedLifecycle getActivityRetainedLifecycle() {
      return provideActivityRetainedLifecycleProvider.get();
    }

    private static final class SwitchingProvider<T> implements Provider<T> {
      private final SingletonCImpl singletonCImpl;

      private final ActivityRetainedCImpl activityRetainedCImpl;

      private final int id;

      SwitchingProvider(SingletonCImpl singletonCImpl, ActivityRetainedCImpl activityRetainedCImpl,
          int id) {
        this.singletonCImpl = singletonCImpl;
        this.activityRetainedCImpl = activityRetainedCImpl;
        this.id = id;
      }

      @SuppressWarnings("unchecked")
      @Override
      public T get() {
        switch (id) {
          case 0: // dagger.hilt.android.ActivityRetainedLifecycle 
          return (T) ActivityRetainedComponentManager_LifecycleModule_ProvideActivityRetainedLifecycleFactory.provideActivityRetainedLifecycle();

          default: throw new AssertionError(id);
        }
      }
    }
  }

  private static final class ServiceCImpl extends SyncMdApplication_HiltComponents.ServiceC {
    private final SingletonCImpl singletonCImpl;

    private final ServiceCImpl serviceCImpl = this;

    private ServiceCImpl(SingletonCImpl singletonCImpl, Service serviceParam) {
      this.singletonCImpl = singletonCImpl;


    }
  }

  private static final class SingletonCImpl extends SyncMdApplication_HiltComponents.SingletonC {
    private final ApplicationContextModule applicationContextModule;

    private final SingletonCImpl singletonCImpl = this;

    private Provider<BranchRepository> provideBranchRepositoryProvider;

    private Provider<BranchService> provideBranchServiceProvider;

    private Provider<ConflictRepository> provideConflictRepositoryProvider;

    private Provider<ConflictService> provideConflictServiceProvider;

    private Provider<DiffRepository> provideDiffRepositoryProvider;

    private Provider<DiffService> provideDiffServiceProvider;

    private Provider<HistoryRepository> provideHistoryRepositoryProvider;

    private Provider<HistoryService> provideHistoryServiceProvider;

    private Provider<PullRepository> providePullRepositoryProvider;

    private Provider<PullService> providePullServiceProvider;

    private SingletonCImpl(ApplicationContextModule applicationContextModuleParam) {
      this.applicationContextModule = applicationContextModuleParam;
      initialize(applicationContextModuleParam);

    }

    @SuppressWarnings("unchecked")
    private void initialize(final ApplicationContextModule applicationContextModuleParam) {
      this.provideBranchRepositoryProvider = DoubleCheck.provider(new SwitchingProvider<BranchRepository>(singletonCImpl, 1));
      this.provideBranchServiceProvider = DoubleCheck.provider(new SwitchingProvider<BranchService>(singletonCImpl, 0));
      this.provideConflictRepositoryProvider = DoubleCheck.provider(new SwitchingProvider<ConflictRepository>(singletonCImpl, 3));
      this.provideConflictServiceProvider = DoubleCheck.provider(new SwitchingProvider<ConflictService>(singletonCImpl, 2));
      this.provideDiffRepositoryProvider = DoubleCheck.provider(new SwitchingProvider<DiffRepository>(singletonCImpl, 5));
      this.provideDiffServiceProvider = DoubleCheck.provider(new SwitchingProvider<DiffService>(singletonCImpl, 4));
      this.provideHistoryRepositoryProvider = DoubleCheck.provider(new SwitchingProvider<HistoryRepository>(singletonCImpl, 7));
      this.provideHistoryServiceProvider = DoubleCheck.provider(new SwitchingProvider<HistoryService>(singletonCImpl, 6));
      this.providePullRepositoryProvider = DoubleCheck.provider(new SwitchingProvider<PullRepository>(singletonCImpl, 9));
      this.providePullServiceProvider = DoubleCheck.provider(new SwitchingProvider<PullService>(singletonCImpl, 8));
    }

    @Override
    public void injectSyncMdApplication(SyncMdApplication arg0) {
    }

    @Override
    public Set<Boolean> getDisableFragmentGetContextFix() {
      return Collections.<Boolean>emptySet();
    }

    @Override
    public ActivityRetainedComponentBuilder retainedComponentBuilder() {
      return new ActivityRetainedCBuilder(singletonCImpl);
    }

    @Override
    public ServiceComponentBuilder serviceComponentBuilder() {
      return new ServiceCBuilder(singletonCImpl);
    }

    private static final class SwitchingProvider<T> implements Provider<T> {
      private final SingletonCImpl singletonCImpl;

      private final int id;

      SwitchingProvider(SingletonCImpl singletonCImpl, int id) {
        this.singletonCImpl = singletonCImpl;
        this.id = id;
      }

      @SuppressWarnings("unchecked")
      @Override
      public T get() {
        switch (id) {
          case 0: // com.bontecou.syncmd.services.git.BranchService 
          return (T) ServiceModule_ProvideBranchServiceFactory.provideBranchService(singletonCImpl.provideBranchRepositoryProvider.get());

          case 1: // com.bontecou.syncmd.domain.repository.BranchRepository 
          return (T) RepositoryModule_ProvideBranchRepositoryFactory.provideBranchRepository();

          case 2: // com.bontecou.syncmd.services.git.ConflictService 
          return (T) ServiceModule_ProvideConflictServiceFactory.provideConflictService(singletonCImpl.provideConflictRepositoryProvider.get());

          case 3: // com.bontecou.syncmd.domain.repository.ConflictRepository 
          return (T) RepositoryModule_ProvideConflictRepositoryFactory.provideConflictRepository();

          case 4: // com.bontecou.syncmd.services.git.DiffService 
          return (T) ServiceModule_ProvideDiffServiceFactory.provideDiffService(singletonCImpl.provideDiffRepositoryProvider.get());

          case 5: // com.bontecou.syncmd.domain.repository.DiffRepository 
          return (T) RepositoryModule_ProvideDiffRepositoryFactory.provideDiffRepository();

          case 6: // com.bontecou.syncmd.services.git.HistoryService 
          return (T) ServiceModule_ProvideHistoryServiceFactory.provideHistoryService(singletonCImpl.provideHistoryRepositoryProvider.get());

          case 7: // com.bontecou.syncmd.domain.repository.HistoryRepository 
          return (T) RepositoryModule_ProvideHistoryRepositoryFactory.provideHistoryRepository();

          case 8: // com.bontecou.syncmd.services.git.PullService 
          return (T) ServiceModule_ProvidePullServiceFactory.providePullService(singletonCImpl.providePullRepositoryProvider.get());

          case 9: // com.bontecou.syncmd.domain.repository.PullRepository 
          return (T) RepositoryModule_ProvidePullRepositoryFactory.providePullRepository();

          default: throw new AssertionError(id);
        }
      }
    }
  }
}
