package com.bontecou.syncmd.ui.components;

@kotlin.Metadata(mv = {1, 9, 0}, k = 2, xi = 48, d1 = {"\u0000>\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\u001aT\u0010\u0000\u001a\u00020\u00012\f\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00040\u00032\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u00042\u0012\u0010\u0006\u001a\u000e\u0012\u0004\u0012\u00020\b\u0012\u0004\u0012\u00020\u00010\u00072\u0012\u0010\t\u001a\u000e\u0012\u0004\u0012\u00020\b\u0012\u0004\u0012\u00020\u00010\u00072\b\b\u0002\u0010\n\u001a\u00020\u000bH\u0007\u001a@\u0010\f\u001a\u00020\u00012\u0006\u0010\r\u001a\u00020\u00042\b\b\u0002\u0010\u000e\u001a\u00020\u000f2\f\u0010\u0010\u001a\b\u0012\u0004\u0012\u00020\u00010\u00112\f\u0010\u0012\u001a\b\u0012\u0004\u0012\u00020\u00010\u00112\b\b\u0002\u0010\n\u001a\u00020\u000bH\u0007\u001a\u0015\u0010\u0013\u001a\u00020\u00142\u0006\u0010\u0015\u001a\u00020\bH\u0007\u00a2\u0006\u0002\u0010\u0016\u001a\u000e\u0010\u0017\u001a\u00020\b2\u0006\u0010\u0015\u001a\u00020\b\u001a\u0015\u0010\u0018\u001a\u00020\u00142\u0006\u0010\u0015\u001a\u00020\bH\u0007\u00a2\u0006\u0002\u0010\u0016\u00a8\u0006\u0019"}, d2 = {"BranchList", "", "branches", "", "Lcom/bontecou/syncmd/data/models/Branch;", "currentBranch", "onSwitchBranch", "Lkotlin/Function1;", "", "onDeleteBranch", "modifier", "Landroidx/compose/ui/Modifier;", "BranchListItem", "branch", "isCurrent", "", "onSwitchClick", "Lkotlin/Function0;", "onDeleteClick", "branchTypeBgColor", "Landroidx/compose/ui/graphics/Color;", "type", "(Ljava/lang/String;)J", "branchTypeLabel", "branchTypeTextColor", "app_release"})
public final class BranchListKt {
    
    /**
     * Displays a list of branches with switch and delete actions.
     */
    @androidx.compose.runtime.Composable()
    public static final void BranchList(@org.jetbrains.annotations.NotNull()
    java.util.List<com.bontecou.syncmd.data.models.Branch> branches, @org.jetbrains.annotations.Nullable()
    com.bontecou.syncmd.data.models.Branch currentBranch, @org.jetbrains.annotations.NotNull()
    kotlin.jvm.functions.Function1<? super java.lang.String, kotlin.Unit> onSwitchBranch, @org.jetbrains.annotations.NotNull()
    kotlin.jvm.functions.Function1<? super java.lang.String, kotlin.Unit> onDeleteBranch, @org.jetbrains.annotations.NotNull()
    androidx.compose.ui.Modifier modifier) {
    }
    
    /**
     * Single branch item in the branch list.
     */
    @androidx.compose.runtime.Composable()
    public static final void BranchListItem(@org.jetbrains.annotations.NotNull()
    com.bontecou.syncmd.data.models.Branch branch, boolean isCurrent, @org.jetbrains.annotations.NotNull()
    kotlin.jvm.functions.Function0<kotlin.Unit> onSwitchClick, @org.jetbrains.annotations.NotNull()
    kotlin.jvm.functions.Function0<kotlin.Unit> onDeleteClick, @org.jetbrains.annotations.NotNull()
    androidx.compose.ui.Modifier modifier) {
    }
    
    /**
     * Get background color for branch type badge.
     */
    @androidx.compose.runtime.Composable()
    public static final long branchTypeBgColor(@org.jetbrains.annotations.NotNull()
    java.lang.String type) {
        return 0L;
    }
    
    /**
     * Get text color for branch type badge.
     */
    @androidx.compose.runtime.Composable()
    public static final long branchTypeTextColor(@org.jetbrains.annotations.NotNull()
    java.lang.String type) {
        return 0L;
    }
    
    /**
     * Get display label for branch type.
     */
    @org.jetbrains.annotations.NotNull()
    public static final java.lang.String branchTypeLabel(@org.jetbrains.annotations.NotNull()
    java.lang.String type) {
        return null;
    }
}