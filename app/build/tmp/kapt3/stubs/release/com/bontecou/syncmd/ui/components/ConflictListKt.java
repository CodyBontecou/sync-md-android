package com.bontecou.syncmd.ui.components;

@kotlin.Metadata(mv = {1, 9, 0}, k = 2, xi = 48, d1 = {"\u00008\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010 \n\u0000\n\u0002\u0010\"\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\u001a2\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00052\f\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00010\u00072\b\b\u0002\u0010\b\u001a\u00020\tH\u0007\u001aD\u0010\n\u001a\u00020\u00012\f\u0010\u000b\u001a\b\u0012\u0004\u0012\u00020\u00030\f2\u000e\b\u0002\u0010\r\u001a\b\u0012\u0004\u0012\u00020\u000f0\u000e2\u0012\u0010\u0010\u001a\u000e\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u00010\u00112\b\b\u0002\u0010\b\u001a\u00020\tH\u0007\u00a8\u0006\u0012"}, d2 = {"ConflictItem", "", "conflict", "Lcom/bontecou/syncmd/data/models/Conflict;", "isResolved", "", "onSelectClick", "Lkotlin/Function0;", "modifier", "Landroidx/compose/ui/Modifier;", "ConflictList", "conflicts", "", "resolvedConflicts", "", "", "onSelectConflict", "Lkotlin/Function1;", "app_release"})
public final class ConflictListKt {
    
    /**
     * Displays a list of conflicting files.
     */
    @androidx.compose.runtime.Composable()
    public static final void ConflictList(@org.jetbrains.annotations.NotNull()
    java.util.List<com.bontecou.syncmd.data.models.Conflict> conflicts, @org.jetbrains.annotations.NotNull()
    java.util.Set<java.lang.String> resolvedConflicts, @org.jetbrains.annotations.NotNull()
    kotlin.jvm.functions.Function1<? super com.bontecou.syncmd.data.models.Conflict, kotlin.Unit> onSelectConflict, @org.jetbrains.annotations.NotNull()
    androidx.compose.ui.Modifier modifier) {
    }
    
    /**
     * Single conflict item in the list.
     */
    @androidx.compose.runtime.Composable()
    public static final void ConflictItem(@org.jetbrains.annotations.NotNull()
    com.bontecou.syncmd.data.models.Conflict conflict, boolean isResolved, @org.jetbrains.annotations.NotNull()
    kotlin.jvm.functions.Function0<kotlin.Unit> onSelectClick, @org.jetbrains.annotations.NotNull()
    androidx.compose.ui.Modifier modifier) {
    }
}