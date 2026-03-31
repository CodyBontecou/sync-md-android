package com.bontecou.syncmd.ui.viewmodels;

/**
 * ViewModel for history operations, stash management, and tag management.
 */
@kotlin.Metadata(mv = {1, 9, 0}, k = 1, xi = 48, d1 = {"\u0000T\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u000e\n\u0002\u0010\u0002\n\u0002\b\r\n\u0002\u0018\u0002\n\u0002\b\n\b\u0007\u0018\u00002\u00020\u0001B\u000f\b\u0007\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u00a2\u0006\u0002\u0010\u0004J\u0006\u0010\"\u001a\u00020#J.\u0010$\u001a\u00020#2\u0006\u0010%\u001a\u00020\n2\b\b\u0002\u0010&\u001a\u00020\n2\b\b\u0002\u0010\'\u001a\u00020\r2\n\b\u0002\u0010(\u001a\u0004\u0018\u00010\nJ\u000e\u0010)\u001a\u00020#2\u0006\u0010%\u001a\u00020\nJ\u0006\u0010*\u001a\u00020#J\b\u0010+\u001a\u00020#H\u0002J\u0006\u0010,\u001a\u00020#J\u0006\u0010-\u001a\u00020#J\u0006\u0010.\u001a\u00020#J\u0018\u0010/\u001a\u00020#2\u0006\u0010&\u001a\u00020\n2\b\b\u0002\u00100\u001a\u000201J\u000e\u00102\u001a\u00020#2\u0006\u00103\u001a\u00020\bJ\u000e\u00104\u001a\u00020#2\u0006\u00105\u001a\u00020\nJ\u000e\u00106\u001a\u00020#2\u0006\u00107\u001a\u00020\nJ\u000e\u00108\u001a\u00020#2\u0006\u00107\u001a\u00020\nJ\u000e\u00109\u001a\u00020#2\u0006\u00107\u001a\u00020\nJ\u0010\u0010:\u001a\u00020#2\b\b\u0002\u0010(\u001a\u00020\nR\u001a\u0010\u0005\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\b0\u00070\u0006X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u0016\u0010\t\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\n0\u0006X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u0016\u0010\u000b\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\n0\u0006X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u0014\u0010\f\u001a\b\u0012\u0004\u0012\u00020\r0\u0006X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u0016\u0010\u000e\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\b0\u0006X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u001a\u0010\u000f\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00100\u00070\u0006X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u001a\u0010\u0011\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00120\u00070\u0006X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u001d\u0010\u0013\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\b0\u00070\u0014\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0015\u0010\u0016R\u0019\u0010\u0017\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\n0\u0014\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0018\u0010\u0016R\u0019\u0010\u0019\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\n0\u0014\u00a2\u0006\b\n\u0000\u001a\u0004\b\u001a\u0010\u0016R\u000e\u0010\u0002\u001a\u00020\u0003X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u0017\u0010\u001b\u001a\b\u0012\u0004\u0012\u00020\r0\u0014\u00a2\u0006\b\n\u0000\u001a\u0004\b\u001b\u0010\u0016R\u0019\u0010\u001c\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\b0\u0014\u00a2\u0006\b\n\u0000\u001a\u0004\b\u001d\u0010\u0016R\u001d\u0010\u001e\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00100\u00070\u0014\u00a2\u0006\b\n\u0000\u001a\u0004\b\u001f\u0010\u0016R\u001d\u0010 \u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00120\u00070\u0014\u00a2\u0006\b\n\u0000\u001a\u0004\b!\u0010\u0016\u00a8\u0006;"}, d2 = {"Lcom/bontecou/syncmd/ui/viewmodels/HistoryViewModel;", "Landroidx/lifecycle/ViewModel;", "historyService", "Lcom/bontecou/syncmd/services/git/HistoryService;", "(Lcom/bontecou/syncmd/services/git/HistoryService;)V", "_commits", "Lkotlinx/coroutines/flow/MutableStateFlow;", "", "Lcom/bontecou/syncmd/data/models/Commit;", "_currentRepoPath", "", "_errorMessage", "_isLoading", "", "_selectedCommit", "_stashes", "Lcom/bontecou/syncmd/data/models/Stash;", "_tags", "Lcom/bontecou/syncmd/data/models/Tag;", "commits", "Lkotlinx/coroutines/flow/StateFlow;", "getCommits", "()Lkotlinx/coroutines/flow/StateFlow;", "currentRepoPath", "getCurrentRepoPath", "errorMessage", "getErrorMessage", "isLoading", "selectedCommit", "getSelectedCommit", "stashes", "getStashes", "tags", "getTags", "clearError", "", "createTag", "name", "commitHash", "annotated", "message", "deleteTag", "deselectCommit", "loadAll", "loadHistory", "loadStashes", "loadTags", "revertCommit", "strategy", "Lcom/bontecou/syncmd/data/models/RevertStrategy;", "selectCommit", "commit", "setRepositoryPath", "repoPath", "stashApply", "stashId", "stashDrop", "stashPop", "stashSave", "app_release"})
@dagger.hilt.android.lifecycle.HiltViewModel()
public final class HistoryViewModel extends androidx.lifecycle.ViewModel {
    @org.jetbrains.annotations.NotNull()
    private final com.bontecou.syncmd.services.git.HistoryService historyService = null;
    @org.jetbrains.annotations.NotNull()
    private final kotlinx.coroutines.flow.MutableStateFlow<java.util.List<com.bontecou.syncmd.data.models.Commit>> _commits = null;
    @org.jetbrains.annotations.NotNull()
    private final kotlinx.coroutines.flow.StateFlow<java.util.List<com.bontecou.syncmd.data.models.Commit>> commits = null;
    @org.jetbrains.annotations.NotNull()
    private final kotlinx.coroutines.flow.MutableStateFlow<java.util.List<com.bontecou.syncmd.data.models.Stash>> _stashes = null;
    @org.jetbrains.annotations.NotNull()
    private final kotlinx.coroutines.flow.StateFlow<java.util.List<com.bontecou.syncmd.data.models.Stash>> stashes = null;
    @org.jetbrains.annotations.NotNull()
    private final kotlinx.coroutines.flow.MutableStateFlow<java.util.List<com.bontecou.syncmd.data.models.Tag>> _tags = null;
    @org.jetbrains.annotations.NotNull()
    private final kotlinx.coroutines.flow.StateFlow<java.util.List<com.bontecou.syncmd.data.models.Tag>> tags = null;
    @org.jetbrains.annotations.NotNull()
    private final kotlinx.coroutines.flow.MutableStateFlow<com.bontecou.syncmd.data.models.Commit> _selectedCommit = null;
    @org.jetbrains.annotations.NotNull()
    private final kotlinx.coroutines.flow.StateFlow<com.bontecou.syncmd.data.models.Commit> selectedCommit = null;
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
    public HistoryViewModel(@org.jetbrains.annotations.NotNull()
    com.bontecou.syncmd.services.git.HistoryService historyService) {
        super();
    }
    
    @org.jetbrains.annotations.NotNull()
    public final kotlinx.coroutines.flow.StateFlow<java.util.List<com.bontecou.syncmd.data.models.Commit>> getCommits() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final kotlinx.coroutines.flow.StateFlow<java.util.List<com.bontecou.syncmd.data.models.Stash>> getStashes() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final kotlinx.coroutines.flow.StateFlow<java.util.List<com.bontecou.syncmd.data.models.Tag>> getTags() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final kotlinx.coroutines.flow.StateFlow<com.bontecou.syncmd.data.models.Commit> getSelectedCommit() {
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
     * Set the current repository path and load all history data.
     */
    public final void setRepositoryPath(@org.jetbrains.annotations.NotNull()
    java.lang.String repoPath) {
    }
    
    /**
     * Load all history data (commits, stashes, tags).
     */
    private final void loadAll() {
    }
    
    /**
     * Load commit history.
     */
    public final void loadHistory() {
    }
    
    /**
     * Load stashes.
     */
    public final void loadStashes() {
    }
    
    /**
     * Load tags.
     */
    public final void loadTags() {
    }
    
    /**
     * Select a commit for detailed view.
     */
    public final void selectCommit(@org.jetbrains.annotations.NotNull()
    com.bontecou.syncmd.data.models.Commit commit) {
    }
    
    /**
     * Deselect the currently selected commit.
     */
    public final void deselectCommit() {
    }
    
    /**
     * Revert a commit.
     */
    public final void revertCommit(@org.jetbrains.annotations.NotNull()
    java.lang.String commitHash, @org.jetbrains.annotations.NotNull()
    com.bontecou.syncmd.data.models.RevertStrategy strategy) {
    }
    
    /**
     * Save current changes to stash.
     */
    public final void stashSave(@org.jetbrains.annotations.NotNull()
    java.lang.String message) {
    }
    
    /**
     * Apply a stash without removing it.
     */
    public final void stashApply(@org.jetbrains.annotations.NotNull()
    java.lang.String stashId) {
    }
    
    /**
     * Pop a stash (apply and remove).
     */
    public final void stashPop(@org.jetbrains.annotations.NotNull()
    java.lang.String stashId) {
    }
    
    /**
     * Drop a stash without applying.
     */
    public final void stashDrop(@org.jetbrains.annotations.NotNull()
    java.lang.String stashId) {
    }
    
    /**
     * Create a new tag.
     */
    public final void createTag(@org.jetbrains.annotations.NotNull()
    java.lang.String name, @org.jetbrains.annotations.NotNull()
    java.lang.String commitHash, boolean annotated, @org.jetbrains.annotations.Nullable()
    java.lang.String message) {
    }
    
    /**
     * Delete a tag.
     */
    public final void deleteTag(@org.jetbrains.annotations.NotNull()
    java.lang.String name) {
    }
    
    /**
     * Clear error message.
     */
    public final void clearError() {
    }
}