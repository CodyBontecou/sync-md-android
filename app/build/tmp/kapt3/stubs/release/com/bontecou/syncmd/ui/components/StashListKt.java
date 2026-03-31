package com.bontecou.syncmd.ui.components;

@kotlin.Metadata(mv = {1, 9, 0}, k = 2, xi = 48, d1 = {"\u00000\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010 \n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\u001aD\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u00032\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00010\u00052\f\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00010\u00052\f\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\u00010\u00052\b\b\u0002\u0010\b\u001a\u00020\tH\u0007\u001a\\\u0010\n\u001a\u00020\u00012\f\u0010\u000b\u001a\b\u0012\u0004\u0012\u00020\u00030\f2\u0012\u0010\r\u001a\u000e\u0012\u0004\u0012\u00020\u000f\u0012\u0004\u0012\u00020\u00010\u000e2\u0012\u0010\u0010\u001a\u000e\u0012\u0004\u0012\u00020\u000f\u0012\u0004\u0012\u00020\u00010\u000e2\u0012\u0010\u0011\u001a\u000e\u0012\u0004\u0012\u00020\u000f\u0012\u0004\u0012\u00020\u00010\u000e2\b\b\u0002\u0010\b\u001a\u00020\tH\u0007\u00a8\u0006\u0012"}, d2 = {"StashItem", "", "stash", "Lcom/bontecou/syncmd/data/models/Stash;", "onApplyClick", "Lkotlin/Function0;", "onPopClick", "onDropClick", "modifier", "Landroidx/compose/ui/Modifier;", "StashList", "stashes", "", "onStashApply", "Lkotlin/Function1;", "", "onStashPop", "onStashDrop", "app_release"})
public final class StashListKt {
    
    /**
     * Displays a list of stashes with apply/pop/drop actions.
     */
    @androidx.compose.runtime.Composable()
    public static final void StashList(@org.jetbrains.annotations.NotNull()
    java.util.List<com.bontecou.syncmd.data.models.Stash> stashes, @org.jetbrains.annotations.NotNull()
    kotlin.jvm.functions.Function1<? super java.lang.String, kotlin.Unit> onStashApply, @org.jetbrains.annotations.NotNull()
    kotlin.jvm.functions.Function1<? super java.lang.String, kotlin.Unit> onStashPop, @org.jetbrains.annotations.NotNull()
    kotlin.jvm.functions.Function1<? super java.lang.String, kotlin.Unit> onStashDrop, @org.jetbrains.annotations.NotNull()
    androidx.compose.ui.Modifier modifier) {
    }
    
    /**
     * Single stash item in the list.
     */
    @androidx.compose.runtime.Composable()
    public static final void StashItem(@org.jetbrains.annotations.NotNull()
    com.bontecou.syncmd.data.models.Stash stash, @org.jetbrains.annotations.NotNull()
    kotlin.jvm.functions.Function0<kotlin.Unit> onApplyClick, @org.jetbrains.annotations.NotNull()
    kotlin.jvm.functions.Function0<kotlin.Unit> onPopClick, @org.jetbrains.annotations.NotNull()
    kotlin.jvm.functions.Function0<kotlin.Unit> onDropClick, @org.jetbrains.annotations.NotNull()
    androidx.compose.ui.Modifier modifier) {
    }
}