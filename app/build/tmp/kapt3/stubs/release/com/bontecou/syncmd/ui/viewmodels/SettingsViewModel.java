package com.bontecou.syncmd.ui.viewmodels;

/**
 * ViewModel for app settings and repository management.
 */
@kotlin.Metadata(mv = {1, 9, 0}, k = 1, xi = 48, d1 = {"\u0000J\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\n\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\n\b\u0007\u0018\u00002\u00020\u0001B\u0011\b\u0007\u0012\b\b\u0001\u0010\u0002\u001a\u00020\u0003\u00a2\u0006\u0002\u0010\u0004J \u0010\u001d\u001a\u00020\u001e2\u0006\u0010\u001f\u001a\u00020\f2\u0006\u0010 \u001a\u00020\f2\b\b\u0002\u0010!\u001a\u00020\fJ\u0006\u0010\"\u001a\u00020\u001eJ\u0006\u0010#\u001a\u00020\u001eJ\u000e\u0010$\u001a\u00020\u001e2\u0006\u0010 \u001a\u00020\fJ\u000e\u0010%\u001a\u00020\u001e2\u0006\u0010 \u001a\u00020\fJ\u000e\u0010&\u001a\u00020\u001e2\u0006\u0010\'\u001a\u00020\nR\u001a\u0010\u0005\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\b0\u00070\u0006X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u0014\u0010\t\u001a\b\u0012\u0004\u0012\u00020\n0\u0006X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u0016\u0010\u000b\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\f0\u0006X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u0014\u0010\r\u001a\b\u0012\u0004\u0012\u00020\u000e0\u0006X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u0014\u0010\u000f\u001a\b\u0012\u0004\u0012\u00020\f0\u0006X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u001d\u0010\u0010\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\b0\u00070\u0011\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0012\u0010\u0013R\u0017\u0010\u0014\u001a\b\u0012\u0004\u0012\u00020\n0\u0011\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0015\u0010\u0013R\u000e\u0010\u0002\u001a\u00020\u0003X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u0019\u0010\u0016\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\f0\u0011\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0017\u0010\u0013R\u0017\u0010\u0018\u001a\b\u0012\u0004\u0012\u00020\u000e0\u0011\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0018\u0010\u0013R\u0017\u0010\u0019\u001a\b\u0012\u0004\u0012\u00020\f0\u0011\u00a2\u0006\b\n\u0000\u001a\u0004\b\u001a\u0010\u0013R\u000e\u0010\u001b\u001a\u00020\u001cX\u0082\u0004\u00a2\u0006\u0002\n\u0000\u00a8\u0006("}, d2 = {"Lcom/bontecou/syncmd/ui/viewmodels/SettingsViewModel;", "Landroidx/lifecycle/ViewModel;", "context", "Landroid/content/Context;", "(Landroid/content/Context;)V", "_allRepositories", "Lkotlinx/coroutines/flow/MutableStateFlow;", "", "Lcom/bontecou/syncmd/ui/viewmodels/SavedRepository;", "_appSettings", "Lcom/bontecou/syncmd/ui/viewmodels/AppSettings;", "_errorMessage", "", "_isLoading", "", "_selectedRepository", "allRepositories", "Lkotlinx/coroutines/flow/StateFlow;", "getAllRepositories", "()Lkotlinx/coroutines/flow/StateFlow;", "appSettings", "getAppSettings", "errorMessage", "getErrorMessage", "isLoading", "selectedRepository", "getSelectedRepository", "sharedPrefs", "Landroid/content/SharedPreferences;", "addRepository", "", "name", "path", "alias", "clearError", "loadSettings", "removeRepository", "setRepositoryPath", "updateSettings", "settings", "app_release"})
@dagger.hilt.android.lifecycle.HiltViewModel()
public final class SettingsViewModel extends androidx.lifecycle.ViewModel {
    @org.jetbrains.annotations.NotNull()
    private final android.content.Context context = null;
    @org.jetbrains.annotations.NotNull()
    private final android.content.SharedPreferences sharedPrefs = null;
    @org.jetbrains.annotations.NotNull()
    private final kotlinx.coroutines.flow.MutableStateFlow<java.lang.String> _selectedRepository = null;
    @org.jetbrains.annotations.NotNull()
    private final kotlinx.coroutines.flow.StateFlow<java.lang.String> selectedRepository = null;
    @org.jetbrains.annotations.NotNull()
    private final kotlinx.coroutines.flow.MutableStateFlow<java.util.List<com.bontecou.syncmd.ui.viewmodels.SavedRepository>> _allRepositories = null;
    @org.jetbrains.annotations.NotNull()
    private final kotlinx.coroutines.flow.StateFlow<java.util.List<com.bontecou.syncmd.ui.viewmodels.SavedRepository>> allRepositories = null;
    @org.jetbrains.annotations.NotNull()
    private final kotlinx.coroutines.flow.MutableStateFlow<com.bontecou.syncmd.ui.viewmodels.AppSettings> _appSettings = null;
    @org.jetbrains.annotations.NotNull()
    private final kotlinx.coroutines.flow.StateFlow<com.bontecou.syncmd.ui.viewmodels.AppSettings> appSettings = null;
    @org.jetbrains.annotations.NotNull()
    private final kotlinx.coroutines.flow.MutableStateFlow<java.lang.Boolean> _isLoading = null;
    @org.jetbrains.annotations.NotNull()
    private final kotlinx.coroutines.flow.StateFlow<java.lang.Boolean> isLoading = null;
    @org.jetbrains.annotations.NotNull()
    private final kotlinx.coroutines.flow.MutableStateFlow<java.lang.String> _errorMessage = null;
    @org.jetbrains.annotations.NotNull()
    private final kotlinx.coroutines.flow.StateFlow<java.lang.String> errorMessage = null;
    
    @javax.inject.Inject()
    public SettingsViewModel(@dagger.hilt.android.qualifiers.ApplicationContext()
    @org.jetbrains.annotations.NotNull()
    android.content.Context context) {
        super();
    }
    
    @org.jetbrains.annotations.NotNull()
    public final kotlinx.coroutines.flow.StateFlow<java.lang.String> getSelectedRepository() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final kotlinx.coroutines.flow.StateFlow<java.util.List<com.bontecou.syncmd.ui.viewmodels.SavedRepository>> getAllRepositories() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final kotlinx.coroutines.flow.StateFlow<com.bontecou.syncmd.ui.viewmodels.AppSettings> getAppSettings() {
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
    
    /**
     * Load all settings and repositories from SharedPreferences.
     */
    public final void loadSettings() {
    }
    
    /**
     * Set the selected repository.
     */
    public final void setRepositoryPath(@org.jetbrains.annotations.NotNull()
    java.lang.String path) {
    }
    
    /**
     * Add a new repository.
     */
    public final void addRepository(@org.jetbrains.annotations.NotNull()
    java.lang.String name, @org.jetbrains.annotations.NotNull()
    java.lang.String path, @org.jetbrains.annotations.NotNull()
    java.lang.String alias) {
    }
    
    /**
     * Remove a repository.
     */
    public final void removeRepository(@org.jetbrains.annotations.NotNull()
    java.lang.String path) {
    }
    
    /**
     * Update app settings.
     */
    public final void updateSettings(@org.jetbrains.annotations.NotNull()
    com.bontecou.syncmd.ui.viewmodels.AppSettings settings) {
    }
    
    /**
     * Clear error message.
     */
    public final void clearError() {
    }
}