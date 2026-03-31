package com.bontecou.syncmd.ui.viewmodels;

/**
 * ViewModel for branch operations and merge management.
 */
@kotlin.Metadata(mv = {1, 9, 0}, k = 1, xi = 48, d1 = {"\u0000J\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0010\n\u0002\u0010\u0002\n\u0002\b\n\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0007\u0018\u00002\u00020\u0001B\u000f\b\u0007\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u00a2\u0006\u0002\u0010\u0004J\u0006\u0010#\u001a\u00020$J\u0018\u0010%\u001a\u00020$2\u0006\u0010&\u001a\u00020\u000b2\b\b\u0002\u0010\'\u001a\u00020\u000bJ\u0018\u0010(\u001a\u00020$2\u0006\u0010)\u001a\u00020\u000b2\b\b\u0002\u0010*\u001a\u00020\u000eJ\u0006\u0010+\u001a\u00020$J\u0018\u0010,\u001a\u00020$2\u0006\u0010-\u001a\u00020\u000b2\b\b\u0002\u0010.\u001a\u00020/J\u000e\u00100\u001a\u00020$2\u0006\u00101\u001a\u00020\u000bJ\u000e\u00102\u001a\u00020$2\u0006\u0010)\u001a\u00020\u000bR\u001a\u0010\u0005\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\b0\u00070\u0006X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u0016\u0010\t\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\b0\u0006X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u0016\u0010\n\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u000b0\u0006X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u0016\u0010\f\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u000b0\u0006X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u0014\u0010\r\u001a\b\u0012\u0004\u0012\u00020\u000e0\u0006X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u001a\u0010\u000f\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\b0\u00070\u0006X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u0014\u0010\u0010\u001a\b\u0012\u0004\u0012\u00020\u000e0\u0006X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u001a\u0010\u0011\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\b0\u00070\u0006X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u001d\u0010\u0012\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\b0\u00070\u0013\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0014\u0010\u0015R\u000e\u0010\u0002\u001a\u00020\u0003X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u0019\u0010\u0016\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\b0\u0013\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0017\u0010\u0015R\u0019\u0010\u0018\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u000b0\u0013\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0019\u0010\u0015R\u0019\u0010\u001a\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u000b0\u0013\u00a2\u0006\b\n\u0000\u001a\u0004\b\u001b\u0010\u0015R\u0017\u0010\u001c\u001a\b\u0012\u0004\u0012\u00020\u000e0\u0013\u00a2\u0006\b\n\u0000\u001a\u0004\b\u001c\u0010\u0015R\u001d\u0010\u001d\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\b0\u00070\u0013\u00a2\u0006\b\n\u0000\u001a\u0004\b\u001e\u0010\u0015R\u0017\u0010\u001f\u001a\b\u0012\u0004\u0012\u00020\u000e0\u0013\u00a2\u0006\b\n\u0000\u001a\u0004\b \u0010\u0015R\u001d\u0010!\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\b0\u00070\u0013\u00a2\u0006\b\n\u0000\u001a\u0004\b\"\u0010\u0015\u00a8\u00063"}, d2 = {"Lcom/bontecou/syncmd/ui/viewmodels/BranchViewModel;", "Landroidx/lifecycle/ViewModel;", "branchService", "Lcom/bontecou/syncmd/services/git/BranchService;", "(Lcom/bontecou/syncmd/services/git/BranchService;)V", "_allBranches", "Lkotlinx/coroutines/flow/MutableStateFlow;", "", "Lcom/bontecou/syncmd/data/models/Branch;", "_currentBranch", "_currentRepoPath", "", "_errorMessage", "_isLoading", "", "_localBranches", "_mergeInProgress", "_remoteBranches", "allBranches", "Lkotlinx/coroutines/flow/StateFlow;", "getAllBranches", "()Lkotlinx/coroutines/flow/StateFlow;", "currentBranch", "getCurrentBranch", "currentRepoPath", "getCurrentRepoPath", "errorMessage", "getErrorMessage", "isLoading", "localBranches", "getLocalBranches", "mergeInProgress", "getMergeInProgress", "remoteBranches", "getRemoteBranches", "clearError", "", "createBranch", "name", "startPoint", "deleteBranch", "branchName", "force", "loadBranches", "mergeBranch", "sourceBranch", "strategy", "Lcom/bontecou/syncmd/data/models/MergeStrategy;", "setRepositoryPath", "repoPath", "switchBranch", "app_debug"})
@dagger.hilt.android.lifecycle.HiltViewModel()
public final class BranchViewModel extends androidx.lifecycle.ViewModel {
    @org.jetbrains.annotations.NotNull()
    private final com.bontecou.syncmd.services.git.BranchService branchService = null;
    @org.jetbrains.annotations.NotNull()
    private final kotlinx.coroutines.flow.MutableStateFlow<java.util.List<com.bontecou.syncmd.data.models.Branch>> _allBranches = null;
    @org.jetbrains.annotations.NotNull()
    private final kotlinx.coroutines.flow.StateFlow<java.util.List<com.bontecou.syncmd.data.models.Branch>> allBranches = null;
    @org.jetbrains.annotations.NotNull()
    private final kotlinx.coroutines.flow.MutableStateFlow<java.util.List<com.bontecou.syncmd.data.models.Branch>> _localBranches = null;
    @org.jetbrains.annotations.NotNull()
    private final kotlinx.coroutines.flow.StateFlow<java.util.List<com.bontecou.syncmd.data.models.Branch>> localBranches = null;
    @org.jetbrains.annotations.NotNull()
    private final kotlinx.coroutines.flow.MutableStateFlow<java.util.List<com.bontecou.syncmd.data.models.Branch>> _remoteBranches = null;
    @org.jetbrains.annotations.NotNull()
    private final kotlinx.coroutines.flow.StateFlow<java.util.List<com.bontecou.syncmd.data.models.Branch>> remoteBranches = null;
    @org.jetbrains.annotations.NotNull()
    private final kotlinx.coroutines.flow.MutableStateFlow<com.bontecou.syncmd.data.models.Branch> _currentBranch = null;
    @org.jetbrains.annotations.NotNull()
    private final kotlinx.coroutines.flow.StateFlow<com.bontecou.syncmd.data.models.Branch> currentBranch = null;
    @org.jetbrains.annotations.NotNull()
    private final kotlinx.coroutines.flow.MutableStateFlow<java.lang.Boolean> _mergeInProgress = null;
    @org.jetbrains.annotations.NotNull()
    private final kotlinx.coroutines.flow.StateFlow<java.lang.Boolean> mergeInProgress = null;
    @org.jetbrains.annotations.NotNull()
    private final kotlinx.coroutines.flow.MutableStateFlow<java.lang.Boolean> _isLoading = null;
    @org.jetbrains.annotations.NotNull()
    private final kotlinx.coroutines.flow.StateFlow<java.lang.Boolean> isLoading = null;
    @org.jetbrains.annotations.NotNull()
    private final kotlinx.coroutines.flow.MutableStateFlow<java.lang.String> _errorMessage = null;
    @org.jetbrains.annotations.NotNull()
    private final kotlinx.coroutines.flow.StateFlow<java.lang.String> errorMessage = null;
    @org.jetbrains.annotations.NotNull()
    private final kotlinx.coroutines.flow.MutableStateFlow<java.lang.String> _currentRepoPath = null;
    @org.jetbrains.annotations.NotNull()
    private final kotlinx.coroutines.flow.StateFlow<java.lang.String> currentRepoPath = null;
    
    @javax.inject.Inject()
    public BranchViewModel(@org.jetbrains.annotations.NotNull()
    com.bontecou.syncmd.services.git.BranchService branchService) {
        super();
    }
    
    @org.jetbrains.annotations.NotNull()
    public final kotlinx.coroutines.flow.StateFlow<java.util.List<com.bontecou.syncmd.data.models.Branch>> getAllBranches() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final kotlinx.coroutines.flow.StateFlow<java.util.List<com.bontecou.syncmd.data.models.Branch>> getLocalBranches() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final kotlinx.coroutines.flow.StateFlow<java.util.List<com.bontecou.syncmd.data.models.Branch>> getRemoteBranches() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final kotlinx.coroutines.flow.StateFlow<com.bontecou.syncmd.data.models.Branch> getCurrentBranch() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final kotlinx.coroutines.flow.StateFlow<java.lang.Boolean> getMergeInProgress() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final kotlinx.coroutines.flow.StateFlow<java.lang.Boolean> isLoading() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final kotlinx.coroutines.flow.StateFlow<java.lang.String> getErrorMessage() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final kotlinx.coroutines.flow.StateFlow<java.lang.String> getCurrentRepoPath() {
        return null;
    }
    
    /**
     * Set the current repository path and load branches.
     */
    public final void setRepositoryPath(@org.jetbrains.annotations.NotNull()
    java.lang.String repoPath) {
    }
    
    /**
     * Load all branches from the repository.
     */
    public final void loadBranches() {
    }
    
    /**
     * Switch to a different branch.
     */
    public final void switchBranch(@org.jetbrains.annotations.NotNull()
    java.lang.String branchName) {
    }
    
    /**
     * Create a new branch.
     */
    public final void createBranch(@org.jetbrains.annotations.NotNull()
    java.lang.String name, @org.jetbrains.annotations.NotNull()
    java.lang.String startPoint) {
    }
    
    /**
     * Delete a branch.
     */
    public final void deleteBranch(@org.jetbrains.annotations.NotNull()
    java.lang.String branchName, boolean force) {
    }
    
    /**
     * Merge a source branch into the current branch.
     */
    public final void mergeBranch(@org.jetbrains.annotations.NotNull()
    java.lang.String sourceBranch, @org.jetbrains.annotations.NotNull()
    com.bontecou.syncmd.data.models.MergeStrategy strategy) {
    }
    
    /**
     * Clear error message.
     */
    public final void clearError() {
    }
}