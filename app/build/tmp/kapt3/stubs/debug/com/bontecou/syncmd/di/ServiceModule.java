package com.bontecou.syncmd.di;

/**
 * Hilt module providing service implementations for dependency injection.
 */
@dagger.Module()
@kotlin.Metadata(mv = {1, 9, 0}, k = 1, xi = 48, d1 = {"\u0000H\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\b\u00c7\u0002\u0018\u00002\u00020\u0001B\u0007\b\u0002\u00a2\u0006\u0002\u0010\u0002J\u0010\u0010\u0003\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u0006H\u0007J\u0010\u0010\u0007\u001a\u00020\b2\u0006\u0010\t\u001a\u00020\nH\u0007J\u0010\u0010\u000b\u001a\u00020\f2\u0006\u0010\r\u001a\u00020\u000eH\u0007J\u0010\u0010\u000f\u001a\u00020\u00102\u0006\u0010\u0011\u001a\u00020\u0012H\u0007J\u0010\u0010\u0013\u001a\u00020\u00142\u0006\u0010\u0015\u001a\u00020\u0016H\u0007\u00a8\u0006\u0017"}, d2 = {"Lcom/bontecou/syncmd/di/ServiceModule;", "", "()V", "provideBranchService", "Lcom/bontecou/syncmd/services/git/BranchService;", "branchRepository", "Lcom/bontecou/syncmd/domain/repository/BranchRepository;", "provideConflictService", "Lcom/bontecou/syncmd/services/git/ConflictService;", "conflictRepository", "Lcom/bontecou/syncmd/domain/repository/ConflictRepository;", "provideDiffService", "Lcom/bontecou/syncmd/services/git/DiffService;", "diffRepository", "Lcom/bontecou/syncmd/domain/repository/DiffRepository;", "provideHistoryService", "Lcom/bontecou/syncmd/services/git/HistoryService;", "historyRepository", "Lcom/bontecou/syncmd/domain/repository/HistoryRepository;", "providePullService", "Lcom/bontecou/syncmd/services/git/PullService;", "pullRepository", "Lcom/bontecou/syncmd/domain/repository/PullRepository;", "app_debug"})
@dagger.hilt.InstallIn(value = {dagger.hilt.components.SingletonComponent.class})
public final class ServiceModule {
    @org.jetbrains.annotations.NotNull()
    public static final com.bontecou.syncmd.di.ServiceModule INSTANCE = null;
    
    private ServiceModule() {
        super();
    }
    
    @dagger.Provides()
    @javax.inject.Singleton()
    @org.jetbrains.annotations.NotNull()
    public final com.bontecou.syncmd.services.git.PullService providePullService(@org.jetbrains.annotations.NotNull()
    com.bontecou.syncmd.domain.repository.PullRepository pullRepository) {
        return null;
    }
    
    @dagger.Provides()
    @javax.inject.Singleton()
    @org.jetbrains.annotations.NotNull()
    public final com.bontecou.syncmd.services.git.DiffService provideDiffService(@org.jetbrains.annotations.NotNull()
    com.bontecou.syncmd.domain.repository.DiffRepository diffRepository) {
        return null;
    }
    
    @dagger.Provides()
    @javax.inject.Singleton()
    @org.jetbrains.annotations.NotNull()
    public final com.bontecou.syncmd.services.git.BranchService provideBranchService(@org.jetbrains.annotations.NotNull()
    com.bontecou.syncmd.domain.repository.BranchRepository branchRepository) {
        return null;
    }
    
    @dagger.Provides()
    @javax.inject.Singleton()
    @org.jetbrains.annotations.NotNull()
    public final com.bontecou.syncmd.services.git.ConflictService provideConflictService(@org.jetbrains.annotations.NotNull()
    com.bontecou.syncmd.domain.repository.ConflictRepository conflictRepository) {
        return null;
    }
    
    @dagger.Provides()
    @javax.inject.Singleton()
    @org.jetbrains.annotations.NotNull()
    public final com.bontecou.syncmd.services.git.HistoryService provideHistoryService(@org.jetbrains.annotations.NotNull()
    com.bontecou.syncmd.domain.repository.HistoryRepository historyRepository) {
        return null;
    }
}