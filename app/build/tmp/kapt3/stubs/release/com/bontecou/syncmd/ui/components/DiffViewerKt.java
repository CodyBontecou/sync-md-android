package com.bontecou.syncmd.ui.components;

@kotlin.Metadata(mv = {1, 9, 0}, k = 2, xi = 48, d1 = {"\u00002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\u001a\u001a\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u0005H\u0007\u001a\u001a\u0010\u0006\u001a\u00020\u00012\u0006\u0010\u0007\u001a\u00020\b2\b\b\u0002\u0010\u0004\u001a\u00020\u0005H\u0007\u001a\u001c\u0010\t\u001a\u00020\u00012\b\u0010\n\u001a\u0004\u0018\u00010\u000b2\b\b\u0002\u0010\u0004\u001a\u00020\u0005H\u0007\u001a\u0015\u0010\f\u001a\u00020\r2\u0006\u0010\u000e\u001a\u00020\u000fH\u0007\u00a2\u0006\u0002\u0010\u0010\u001a\u0015\u0010\u0011\u001a\u00020\r2\u0006\u0010\u000e\u001a\u00020\u000fH\u0007\u00a2\u0006\u0002\u0010\u0010\u001a\u0013\u0010\u0012\u001a\u00020\r2\u0006\u0010\u000e\u001a\u00020\u000f\u00a2\u0006\u0002\u0010\u0010\u00a8\u0006\u0013"}, d2 = {"DiffHunkViewer", "", "hunk", "Lcom/bontecou/syncmd/data/models/DiffHunk;", "modifier", "Landroidx/compose/ui/Modifier;", "DiffLineViewer", "line", "Lcom/bontecou/syncmd/data/models/DiffLine;", "DiffViewer", "diff", "Lcom/bontecou/syncmd/data/models/UnifiedDiffResult;", "lineBackgroundColor", "Landroidx/compose/ui/graphics/Color;", "type", "Lcom/bontecou/syncmd/data/models/DiffLineType;", "(Lcom/bontecou/syncmd/data/models/DiffLineType;)J", "lineIndicatorColor", "lineTextColor", "app_release"})
public final class DiffViewerKt {
    
    /**
     * Displays a unified diff with syntax highlighting.
     */
    @androidx.compose.runtime.Composable()
    public static final void DiffViewer(@org.jetbrains.annotations.Nullable()
    com.bontecou.syncmd.data.models.UnifiedDiffResult diff, @org.jetbrains.annotations.NotNull()
    androidx.compose.ui.Modifier modifier) {
    }
    
    /**
     * Displays a single diff hunk (a contiguous block of changes).
     */
    @androidx.compose.runtime.Composable()
    public static final void DiffHunkViewer(@org.jetbrains.annotations.NotNull()
    com.bontecou.syncmd.data.models.DiffHunk hunk, @org.jetbrains.annotations.NotNull()
    androidx.compose.ui.Modifier modifier) {
    }
    
    /**
     * Displays a single line in a diff.
     */
    @androidx.compose.runtime.Composable()
    public static final void DiffLineViewer(@org.jetbrains.annotations.NotNull()
    com.bontecou.syncmd.data.models.DiffLine line, @org.jetbrains.annotations.NotNull()
    androidx.compose.ui.Modifier modifier) {
    }
    
    /**
     * Get the background color for a diff line.
     */
    @androidx.compose.runtime.Composable()
    public static final long lineBackgroundColor(@org.jetbrains.annotations.NotNull()
    com.bontecou.syncmd.data.models.DiffLineType type) {
        return 0L;
    }
    
    /**
     * Get the indicator color for a diff line.
     */
    @androidx.compose.runtime.Composable()
    public static final long lineIndicatorColor(@org.jetbrains.annotations.NotNull()
    com.bontecou.syncmd.data.models.DiffLineType type) {
        return 0L;
    }
    
    /**
     * Get the text color for a diff line.
     */
    public static final long lineTextColor(@org.jetbrains.annotations.NotNull()
    com.bontecou.syncmd.data.models.DiffLineType type) {
        return 0L;
    }
}