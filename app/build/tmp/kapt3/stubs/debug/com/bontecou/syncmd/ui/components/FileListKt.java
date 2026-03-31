package com.bontecou.syncmd.ui.components;

@kotlin.Metadata(mv = {1, 9, 0}, k = 2, xi = 48, d1 = {"\u0000B\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u001ar\u0010\u0000\u001a\u00020\u00012\f\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00040\u00032\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u00062\u0012\u0010\u0007\u001a\u000e\u0012\u0004\u0012\u00020\u0006\u0012\u0004\u0012\u00020\u00010\b2\u0012\u0010\t\u001a\u000e\u0012\u0004\u0012\u00020\u0006\u0012\u0004\u0012\u00020\u00010\b2\u0012\u0010\n\u001a\u000e\u0012\u0004\u0012\u00020\u0006\u0012\u0004\u0012\u00020\u00010\b2\b\b\u0002\u0010\u000b\u001a\u00020\f2\b\b\u0002\u0010\r\u001a\u00020\u000eH\u0007\u001aX\u0010\u000f\u001a\u00020\u00012\u0006\u0010\u0010\u001a\u00020\u00042\b\b\u0002\u0010\u0011\u001a\u00020\f2\b\b\u0002\u0010\u000b\u001a\u00020\f2\f\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\u00010\u00122\f\u0010\t\u001a\b\u0012\u0004\u0012\u00020\u00010\u00122\f\u0010\n\u001a\b\u0012\u0004\u0012\u00020\u00010\u00122\b\b\u0002\u0010\r\u001a\u00020\u000eH\u0007\u001a\u0015\u0010\u0013\u001a\u00020\u00142\u0006\u0010\u0015\u001a\u00020\u0016H\u0007\u00a2\u0006\u0002\u0010\u0017\u001a\u000e\u0010\u0018\u001a\u00020\u00062\u0006\u0010\u0015\u001a\u00020\u0016\u00a8\u0006\u0019"}, d2 = {"FileList", "", "files", "", "Lcom/bontecou/syncmd/data/models/FileDiff;", "selectedFilePath", "", "onFileClick", "Lkotlin/Function1;", "onStageClick", "onUnstageClick", "isStaged", "", "modifier", "Landroidx/compose/ui/Modifier;", "FileListItem", "fileDiff", "isSelected", "Lkotlin/Function0;", "statusColor", "Landroidx/compose/ui/graphics/Color;", "status", "Lcom/bontecou/syncmd/data/models/DiffStatus;", "(Lcom/bontecou/syncmd/data/models/DiffStatus;)J", "statusIcon", "app_debug"})
public final class FileListKt {
    
    /**
     * Displays a list of files with status badges and click handlers.
     */
    @androidx.compose.runtime.Composable()
    public static final void FileList(@org.jetbrains.annotations.NotNull()
    java.util.List<com.bontecou.syncmd.data.models.FileDiff> files, @org.jetbrains.annotations.Nullable()
    java.lang.String selectedFilePath, @org.jetbrains.annotations.NotNull()
    kotlin.jvm.functions.Function1<? super java.lang.String, kotlin.Unit> onFileClick, @org.jetbrains.annotations.NotNull()
    kotlin.jvm.functions.Function1<? super java.lang.String, kotlin.Unit> onStageClick, @org.jetbrains.annotations.NotNull()
    kotlin.jvm.functions.Function1<? super java.lang.String, kotlin.Unit> onUnstageClick, boolean isStaged, @org.jetbrains.annotations.NotNull()
    androidx.compose.ui.Modifier modifier) {
    }
    
    /**
     * Single file item in the file list.
     */
    @androidx.compose.runtime.Composable()
    public static final void FileListItem(@org.jetbrains.annotations.NotNull()
    com.bontecou.syncmd.data.models.FileDiff fileDiff, boolean isSelected, boolean isStaged, @org.jetbrains.annotations.NotNull()
    kotlin.jvm.functions.Function0<kotlin.Unit> onFileClick, @org.jetbrains.annotations.NotNull()
    kotlin.jvm.functions.Function0<kotlin.Unit> onStageClick, @org.jetbrains.annotations.NotNull()
    kotlin.jvm.functions.Function0<kotlin.Unit> onUnstageClick, @org.jetbrains.annotations.NotNull()
    androidx.compose.ui.Modifier modifier) {
    }
    
    /**
     * Get the status badge color.
     */
    @androidx.compose.runtime.Composable()
    public static final long statusColor(@org.jetbrains.annotations.NotNull()
    com.bontecou.syncmd.data.models.DiffStatus status) {
        return 0L;
    }
    
    /**
     * Get the status badge icon text.
     */
    @org.jetbrains.annotations.NotNull()
    public static final java.lang.String statusIcon(@org.jetbrains.annotations.NotNull()
    com.bontecou.syncmd.data.models.DiffStatus status) {
        return null;
    }
}