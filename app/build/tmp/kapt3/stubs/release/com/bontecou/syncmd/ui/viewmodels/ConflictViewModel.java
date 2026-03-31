package com.bontecou.syncmd.ui.viewmodels;

/**
 * ViewModel for merge conflict detection and resolution.
 */
@kotlin.Metadata(mv = {1, 9, 0}, k = 1, xi = 48, d1 = {"\u0000V\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\"\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0010\n\u0002\u0010\u0002\n\u0002\b\u000b\n\u0002\u0018\u0002\n\u0002\b\t\b\u0007\u0018\u00002\u00020\u0001B\u000f\b\u0007\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u00a2\u0006\u0002\u0010\u0004J\u0006\u0010%\u001a\u00020&J\u000e\u0010\'\u001a\u00020&2\u0006\u0010(\u001a\u00020\nJ\u000e\u0010)\u001a\u00020&2\u0006\u0010(\u001a\u00020\nJ\u000e\u0010*\u001a\u00020&2\u0006\u0010(\u001a\u00020\nJ\u0006\u0010+\u001a\u00020&J\u000e\u0010,\u001a\u00020&2\u0006\u0010-\u001a\u00020\nJ\u0006\u0010.\u001a\u00020&J\u0006\u0010/\u001a\u00020&J\u000e\u00100\u001a\u00020&2\u0006\u00101\u001a\u000202J\"\u00103\u001a\u00020&2\u0006\u0010(\u001a\u00020\n2\u0006\u00101\u001a\u0002022\n\b\u0002\u00104\u001a\u0004\u0018\u00010\nJ\u000e\u00105\u001a\u00020&2\u0006\u00106\u001a\u00020\bJ\u000e\u00107\u001a\u00020&2\u0006\u00108\u001a\u00020\nJ\u000e\u00109\u001a\u00020&2\u0006\u0010:\u001a\u00020\nR\u001a\u0010\u0005\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\b0\u00070\u0006X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u0016\u0010\t\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\n0\u0006X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u0016\u0010\u000b\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\n0\u0006X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u0014\u0010\f\u001a\b\u0012\u0004\u0012\u00020\r0\u0006X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u0014\u0010\u000e\u001a\b\u0012\u0004\u0012\u00020\n0\u0006X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u0016\u0010\u000f\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00100\u0006X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u001a\u0010\u0011\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\n0\u00120\u0006X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u0016\u0010\u0013\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\b0\u0006X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0002\u001a\u00020\u0003X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u001d\u0010\u0014\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\b0\u00070\u0015\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0016\u0010\u0017R\u0019\u0010\u0018\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\n0\u0015\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0019\u0010\u0017R\u0019\u0010\u001a\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\n0\u0015\u00a2\u0006\b\n\u0000\u001a\u0004\b\u001b\u0010\u0017R\u0017\u0010\u001c\u001a\b\u0012\u0004\u0012\u00020\r0\u0015\u00a2\u0006\b\n\u0000\u001a\u0004\b\u001c\u0010\u0017R\u0017\u0010\u001d\u001a\b\u0012\u0004\u0012\u00020\n0\u0015\u00a2\u0006\b\n\u0000\u001a\u0004\b\u001e\u0010\u0017R\u0019\u0010\u001f\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00100\u0015\u00a2\u0006\b\n\u0000\u001a\u0004\b \u0010\u0017R\u001d\u0010!\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\n0\u00120\u0015\u00a2\u0006\b\n\u0000\u001a\u0004\b\"\u0010\u0017R\u0019\u0010#\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\b0\u0015\u00a2\u0006\b\n\u0000\u001a\u0004\b$\u0010\u0017\u00a8\u0006;"}, d2 = {"Lcom/bontecou/syncmd/ui/viewmodels/ConflictViewModel;", "Landroidx/lifecycle/ViewModel;", "conflictService", "Lcom/bontecou/syncmd/services/git/ConflictService;", "(Lcom/bontecou/syncmd/services/git/ConflictService;)V", "_conflicts", "Lkotlinx/coroutines/flow/MutableStateFlow;", "", "Lcom/bontecou/syncmd/data/models/Conflict;", "_currentRepoPath", "", "_errorMessage", "_isLoading", "", "_manualResolutionContent", "_mergeState", "Lcom/bontecou/syncmd/data/models/MergeState;", "_resolvedConflicts", "", "_selectedConflict", "conflicts", "Lkotlinx/coroutines/flow/StateFlow;", "getConflicts", "()Lkotlinx/coroutines/flow/StateFlow;", "currentRepoPath", "getCurrentRepoPath", "errorMessage", "getErrorMessage", "isLoading", "manualResolutionContent", "getManualResolutionContent", "mergeState", "getMergeState", "resolvedConflicts", "getResolvedConflicts", "selectedConflict", "getSelectedConflict", "abortMerge", "", "acceptManual", "filePath", "acceptOurs", "acceptTheirs", "clearError", "completeMerge", "message", "deselectConflict", "loadConflicts", "resolveAllConflicts", "strategy", "Lcom/bontecou/syncmd/data/models/ConflictResolutionStrategy;", "resolveConflict", "customContent", "selectConflict", "conflict", "setManualResolutionContent", "content", "setRepositoryPath", "repoPath", "app_release"})
@dagger.hilt.android.lifecycle.HiltViewModel()
public final class ConflictViewModel extends androidx.lifecycle.ViewModel {
    @org.jetbrains.annotations.NotNull()
    private final com.bontecou.syncmd.services.git.ConflictService conflictService = null;
    @org.jetbrains.annotations.NotNull()
    private final kotlinx.coroutines.flow.MutableStateFlow<java.util.List<com.bontecou.syncmd.data.models.Conflict>> _conflicts = null;
    @org.jetbrains.annotations.NotNull()
    private final kotlinx.coroutines.flow.StateFlow<java.util.List<com.bontecou.syncmd.data.models.Conflict>> conflicts = null;
    @org.jetbrains.annotations.NotNull()
    private final kotlinx.coroutines.flow.MutableStateFlow<com.bontecou.syncmd.data.models.MergeState> _mergeState = null;
    @org.jetbrains.annotations.NotNull()
    private final kotlinx.coroutines.flow.StateFlow<com.bontecou.syncmd.data.models.MergeState> mergeState = null;
    @org.jetbrains.annotations.NotNull()
    private final kotlinx.coroutines.flow.MutableStateFlow<com.bontecou.syncmd.data.models.Conflict> _selectedConflict = null;
    @org.jetbrains.annotations.NotNull()
    private final kotlinx.coroutines.flow.StateFlow<com.bontecou.syncmd.data.models.Conflict> selectedConflict = null;
    @org.jetbrains.annotations.NotNull()
    private final kotlinx.coroutines.flow.MutableStateFlow<java.lang.String> _manualResolutionContent = null;
    @org.jetbrains.annotations.NotNull()
    private final kotlinx.coroutines.flow.StateFlow<java.lang.String> manualResolutionContent = null;
    @org.jetbrains.annotations.NotNull()
    private final kotlinx.coroutines.flow.MutableStateFlow<java.util.Set<java.lang.String>> _resolvedConflicts = null;
    @org.jetbrains.annotations.NotNull()
    private final kotlinx.coroutines.flow.StateFlow<java.util.Set<java.lang.String>> resolvedConflicts = null;
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
    public ConflictViewModel(@org.jetbrains.annotations.NotNull()
    com.bontecou.syncmd.services.git.ConflictService conflictService) {
        super();
    }
    
    @org.jetbrains.annotations.NotNull()
    public final kotlinx.coroutines.flow.StateFlow<java.util.List<com.bontecou.syncmd.data.models.Conflict>> getConflicts() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final kotlinx.coroutines.flow.StateFlow<com.bontecou.syncmd.data.models.MergeState> getMergeState() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final kotlinx.coroutines.flow.StateFlow<com.bontecou.syncmd.data.models.Conflict> getSelectedConflict() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final kotlinx.coroutines.flow.StateFlow<java.lang.String> getManualResolutionContent() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final kotlinx.coroutines.flow.StateFlow<java.util.Set<java.lang.String>> getResolvedConflicts() {
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
     * Set the current repository path and load conflicts.
     */
    public final void setRepositoryPath(@org.jetbrains.annotations.NotNull()
    java.lang.String repoPath) {
    }
    
    /**
     * Load all conflicts from the repository.
     */
    public final void loadConflicts() {
    }
    
    /**
     * Select a conflict to view details.
     */
    public final void selectConflict(@org.jetbrains.annotations.NotNull()
    com.bontecou.syncmd.data.models.Conflict conflict) {
    }
    
    /**
     * Deselect current conflict.
     */
    public final void deselectConflict() {
    }
    
    /**
     * Update manual resolution content.
     */
    public final void setManualResolutionContent(@org.jetbrains.annotations.NotNull()
    java.lang.String content) {
    }
    
    /**
     * Resolve a conflict using specified strategy.
     */
    public final void resolveConflict(@org.jetbrains.annotations.NotNull()
    java.lang.String filePath, @org.jetbrains.annotations.NotNull()
    com.bontecou.syncmd.data.models.ConflictResolutionStrategy strategy, @org.jetbrains.annotations.Nullable()
    java.lang.String customContent) {
    }
    
    /**
     * Resolve conflict accepting our version.
     */
    public final void acceptOurs(@org.jetbrains.annotations.NotNull()
    java.lang.String filePath) {
    }
    
    /**
     * Resolve conflict accepting their version.
     */
    public final void acceptTheirs(@org.jetbrains.annotations.NotNull()
    java.lang.String filePath) {
    }
    
    /**
     * Resolve conflict with manual content.
     */
    public final void acceptManual(@org.jetbrains.annotations.NotNull()
    java.lang.String filePath) {
    }
    
    /**
     * Resolve all conflicts using the same strategy.
     */
    public final void resolveAllConflicts(@org.jetbrains.annotations.NotNull()
    com.bontecou.syncmd.data.models.ConflictResolutionStrategy strategy) {
    }
    
    /**
     * Complete merge with a commit message.
     */
    public final void completeMerge(@org.jetbrains.annotations.NotNull()
    java.lang.String message) {
    }
    
    /**
     * Abort merge and return to pre-merge state.
     */
    public final void abortMerge() {
    }
    
    /**
     * Clear error message.
     */
    public final void clearError() {
    }
}