package com.bontecou.syncmd.ui.viewmodels;

/**
 * ViewModel for diff operations, staging, and commit creation.
 */
@kotlin.Metadata(mv = {1, 9, 0}, k = 1, xi = 48, d1 = {"\u0000>\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u000e\n\u0002\u0010\u0002\n\u0002\b\u000e\b\u0007\u0018\u00002\u00020\u0001B\u000f\b\u0007\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u00a2\u0006\u0002\u0010\u0004J\u0006\u0010\u001f\u001a\u00020 J\u0006\u0010!\u001a\u00020 J\u0006\u0010\"\u001a\u00020 J\u0010\u0010#\u001a\u00020 2\u0006\u0010$\u001a\u00020\u0007H\u0002J\u000e\u0010%\u001a\u00020 2\u0006\u0010$\u001a\u00020\u0007J\u000e\u0010&\u001a\u00020 2\u0006\u0010\'\u001a\u00020\u0007J\u000e\u0010(\u001a\u00020 2\u0006\u0010)\u001a\u00020\u0007J\u0006\u0010*\u001a\u00020 J\u000e\u0010+\u001a\u00020 2\u0006\u0010$\u001a\u00020\u0007J\u0006\u0010,\u001a\u00020 J\u000e\u0010-\u001a\u00020 2\u0006\u0010$\u001a\u00020\u0007R\u0014\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00070\u0006X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u0016\u0010\b\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00070\u0006X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u0016\u0010\t\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\n0\u0006X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u0016\u0010\u000b\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00070\u0006X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u0014\u0010\f\u001a\b\u0012\u0004\u0012\u00020\r0\u0006X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u0016\u0010\u000e\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\n0\u0006X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u0016\u0010\u000f\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00070\u0006X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u0017\u0010\u0010\u001a\b\u0012\u0004\u0012\u00020\u00070\u0011\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0012\u0010\u0013R\u0019\u0010\u0014\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00070\u0011\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0015\u0010\u0013R\u0019\u0010\u0016\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\n0\u0011\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0017\u0010\u0013R\u000e\u0010\u0002\u001a\u00020\u0003X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u0019\u0010\u0018\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00070\u0011\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0019\u0010\u0013R\u0017\u0010\u001a\u001a\b\u0012\u0004\u0012\u00020\r0\u0011\u00a2\u0006\b\n\u0000\u001a\u0004\b\u001a\u0010\u0013R\u0019\u0010\u001b\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\n0\u0011\u00a2\u0006\b\n\u0000\u001a\u0004\b\u001c\u0010\u0013R\u0019\u0010\u001d\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00070\u0011\u00a2\u0006\b\n\u0000\u001a\u0004\b\u001e\u0010\u0013\u00a8\u0006."}, d2 = {"Lcom/bontecou/syncmd/ui/viewmodels/DiffViewModel;", "Landroidx/lifecycle/ViewModel;", "diffService", "Lcom/bontecou/syncmd/services/git/DiffService;", "(Lcom/bontecou/syncmd/services/git/DiffService;)V", "_commitMessage", "Lkotlinx/coroutines/flow/MutableStateFlow;", "", "_currentRepoPath", "_diff", "Lcom/bontecou/syncmd/data/models/UnifiedDiffResult;", "_errorMessage", "_isLoading", "", "_selectedFileDiff", "_selectedFilePath", "commitMessage", "Lkotlinx/coroutines/flow/StateFlow;", "getCommitMessage", "()Lkotlinx/coroutines/flow/StateFlow;", "currentRepoPath", "getCurrentRepoPath", "diff", "getDiff", "errorMessage", "getErrorMessage", "isLoading", "selectedFileDiff", "getSelectedFileDiff", "selectedFilePath", "getSelectedFilePath", "clearError", "", "commit", "loadDiff", "loadFileDiff", "filePath", "selectFile", "setCommitMessage", "message", "setRepositoryPath", "repoPath", "stageAll", "stageFile", "unstageAll", "unstageFile", "app_release"})
@dagger.hilt.android.lifecycle.HiltViewModel()
public final class DiffViewModel extends androidx.lifecycle.ViewModel {
    @org.jetbrains.annotations.NotNull()
    private final com.bontecou.syncmd.services.git.DiffService diffService = null;
    @org.jetbrains.annotations.NotNull()
    private final kotlinx.coroutines.flow.MutableStateFlow<com.bontecou.syncmd.data.models.UnifiedDiffResult> _diff = null;
    @org.jetbrains.annotations.NotNull()
    private final kotlinx.coroutines.flow.StateFlow<com.bontecou.syncmd.data.models.UnifiedDiffResult> diff = null;
    @org.jetbrains.annotations.NotNull()
    private final kotlinx.coroutines.flow.MutableStateFlow<java.lang.String> _selectedFilePath = null;
    @org.jetbrains.annotations.NotNull()
    private final kotlinx.coroutines.flow.StateFlow<java.lang.String> selectedFilePath = null;
    @org.jetbrains.annotations.NotNull()
    private final kotlinx.coroutines.flow.MutableStateFlow<com.bontecou.syncmd.data.models.UnifiedDiffResult> _selectedFileDiff = null;
    @org.jetbrains.annotations.NotNull()
    private final kotlinx.coroutines.flow.StateFlow<com.bontecou.syncmd.data.models.UnifiedDiffResult> selectedFileDiff = null;
    @org.jetbrains.annotations.NotNull()
    private final kotlinx.coroutines.flow.MutableStateFlow<java.lang.String> _commitMessage = null;
    @org.jetbrains.annotations.NotNull()
    private final kotlinx.coroutines.flow.StateFlow<java.lang.String> commitMessage = null;
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
    public DiffViewModel(@org.jetbrains.annotations.NotNull()
    com.bontecou.syncmd.services.git.DiffService diffService) {
        super();
    }
    
    @org.jetbrains.annotations.NotNull()
    public final kotlinx.coroutines.flow.StateFlow<com.bontecou.syncmd.data.models.UnifiedDiffResult> getDiff() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final kotlinx.coroutines.flow.StateFlow<java.lang.String> getSelectedFilePath() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final kotlinx.coroutines.flow.StateFlow<com.bontecou.syncmd.data.models.UnifiedDiffResult> getSelectedFileDiff() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final kotlinx.coroutines.flow.StateFlow<java.lang.String> getCommitMessage() {
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
     * Set the current repository path and load diff status.
     */
    public final void setRepositoryPath(@org.jetbrains.annotations.NotNull()
    java.lang.String repoPath) {
    }
    
    /**
     * Load diff for all files in the repository.
     */
    public final void loadDiff() {
    }
    
    /**
     * Select a file to view its full diff.
     */
    public final void selectFile(@org.jetbrains.annotations.NotNull()
    java.lang.String filePath) {
    }
    
    /**
     * Load diff for a specific file.
     */
    private final void loadFileDiff(java.lang.String filePath) {
    }
    
    /**
     * Stage a file for commit.
     */
    public final void stageFile(@org.jetbrains.annotations.NotNull()
    java.lang.String filePath) {
    }
    
    /**
     * Unstage a file.
     */
    public final void unstageFile(@org.jetbrains.annotations.NotNull()
    java.lang.String filePath) {
    }
    
    /**
     * Stage all modified files.
     */
    public final void stageAll() {
    }
    
    /**
     * Unstage all files.
     */
    public final void unstageAll() {
    }
    
    /**
     * Update the commit message.
     */
    public final void setCommitMessage(@org.jetbrains.annotations.NotNull()
    java.lang.String message) {
    }
    
    /**
     * Commit all staged files.
     */
    public final void commit() {
    }
    
    /**
     * Clear error message.
     */
    public final void clearError() {
    }
}