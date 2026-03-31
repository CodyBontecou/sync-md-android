package com.bontecou.syncmd.di;

/**
 * Hilt module providing repository implementations for dependency injection.
 * Repositories are stateless and operate on dynamic repository paths provided at runtime.
 */
@dagger.Module()
@kotlin.Metadata(mv = {1, 9, 0}, k = 1, xi = 48, d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\b\u00c7\u0002\u0018\u00002\u00020\u0001B\u0007\b\u0002\u00a2\u0006\u0002\u0010\u0002J\b\u0010\u0003\u001a\u00020\u0004H\u0007J\b\u0010\u0005\u001a\u00020\u0006H\u0007J\b\u0010\u0007\u001a\u00020\bH\u0007J\b\u0010\t\u001a\u00020\nH\u0007J\b\u0010\u000b\u001a\u00020\fH\u0007\u00a8\u0006\r"}, d2 = {"Lcom/bontecou/syncmd/di/RepositoryModule;", "", "()V", "provideBranchRepository", "Lcom/bontecou/syncmd/domain/repository/BranchRepository;", "provideConflictRepository", "Lcom/bontecou/syncmd/domain/repository/ConflictRepository;", "provideDiffRepository", "Lcom/bontecou/syncmd/domain/repository/DiffRepository;", "provideHistoryRepository", "Lcom/bontecou/syncmd/domain/repository/HistoryRepository;", "providePullRepository", "Lcom/bontecou/syncmd/domain/repository/PullRepository;", "app_release"})
@dagger.hilt.InstallIn(value = {dagger.hilt.components.SingletonComponent.class})
public final class RepositoryModule {
    @org.jetbrains.annotations.NotNull()
    public static final com.bontecou.syncmd.di.RepositoryModule INSTANCE = null;
    
    private RepositoryModule() {
        super();
    }
    
    @dagger.Provides()
    @javax.inject.Singleton()
    @org.jetbrains.annotations.NotNull()
    public final com.bontecou.syncmd.domain.repository.PullRepository providePullRepository() {
        return null;
    }
    
    @dagger.Provides()
    @javax.inject.Singleton()
    @org.jetbrains.annotations.NotNull()
    public final com.bontecou.syncmd.domain.repository.DiffRepository provideDiffRepository() {
        return null;
    }
    
    @dagger.Provides()
    @javax.inject.Singleton()
    @org.jetbrains.annotations.NotNull()
    public final com.bontecou.syncmd.domain.repository.BranchRepository provideBranchRepository() {
        return null;
    }
    
    @dagger.Provides()
    @javax.inject.Singleton()
    @org.jetbrains.annotations.NotNull()
    public final com.bontecou.syncmd.domain.repository.ConflictRepository provideConflictRepository() {
        return null;
    }
    
    @dagger.Provides()
    @javax.inject.Singleton()
    @org.jetbrains.annotations.NotNull()
    public final com.bontecou.syncmd.domain.repository.HistoryRepository provideHistoryRepository() {
        return null;
    }
}