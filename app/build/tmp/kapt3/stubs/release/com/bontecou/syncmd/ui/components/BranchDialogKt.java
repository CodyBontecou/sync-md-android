package com.bontecou.syncmd.ui.components;

@kotlin.Metadata(mv = {1, 9, 0}, k = 2, xi = 48, d1 = {"\u0000>\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0004\u001a^\u0010\u0000\u001a\u00020\u00012\f\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00010\u000326\u0010\u0004\u001a2\u0012\u0013\u0012\u00110\u0006\u00a2\u0006\f\b\u0007\u0012\b\b\b\u0012\u0004\b\b(\b\u0012\u0013\u0012\u00110\u0006\u00a2\u0006\f\b\u0007\u0012\b\b\b\u0012\u0004\b\b(\t\u0012\u0004\u0012\u00020\u00010\u00052\u000e\b\u0002\u0010\n\u001a\b\u0012\u0004\u0012\u00020\f0\u000bH\u0007\u001aA\u0010\r\u001a\u00020\u00012\u0006\u0010\u000e\u001a\u00020\u00062\f\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00010\u00032!\u0010\u000f\u001a\u001d\u0012\u0013\u0012\u00110\u0011\u00a2\u0006\f\b\u0007\u0012\b\b\b\u0012\u0004\b\b(\u0012\u0012\u0004\u0012\u00020\u00010\u0010H\u0007\u001ah\u0010\u0013\u001a\u00020\u00012\f\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00010\u000326\u0010\u0014\u001a2\u0012\u0013\u0012\u00110\u0006\u00a2\u0006\f\b\u0007\u0012\b\b\b\u0012\u0004\b\b(\u0015\u0012\u0013\u0012\u00110\u0016\u00a2\u0006\f\b\u0007\u0012\b\b\b\u0012\u0004\b\b(\u0017\u0012\u0004\u0012\u00020\u00010\u00052\b\b\u0002\u0010\u0018\u001a\u00020\u00062\u000e\b\u0002\u0010\n\u001a\b\u0012\u0004\u0012\u00020\f0\u000bH\u0007\u001a\u000e\u0010\u0019\u001a\u00020\u00062\u0006\u0010\u0017\u001a\u00020\u0016\u00a8\u0006\u001a"}, d2 = {"CreateBranchDialog", "", "onDismiss", "Lkotlin/Function0;", "onCreate", "Lkotlin/Function2;", "", "Lkotlin/ParameterName;", "name", "startPoint", "availableBranches", "", "Lcom/bontecou/syncmd/data/models/Branch;", "DeleteBranchDialog", "branchName", "onConfirm", "Lkotlin/Function1;", "", "force", "MergeBranchDialog", "onMerge", "sourceBranch", "Lcom/bontecou/syncmd/data/models/MergeStrategy;", "strategy", "currentBranch", "strategyDescription", "app_release"})
public final class BranchDialogKt {
    
    /**
     * Dialog for creating a new branch.
     */
    @androidx.compose.runtime.Composable()
    public static final void CreateBranchDialog(@org.jetbrains.annotations.NotNull()
    kotlin.jvm.functions.Function0<kotlin.Unit> onDismiss, @org.jetbrains.annotations.NotNull()
    kotlin.jvm.functions.Function2<? super java.lang.String, ? super java.lang.String, kotlin.Unit> onCreate, @org.jetbrains.annotations.NotNull()
    java.util.List<com.bontecou.syncmd.data.models.Branch> availableBranches) {
    }
    
    /**
     * Dialog for merging branches.
     */
    @androidx.compose.runtime.Composable()
    public static final void MergeBranchDialog(@org.jetbrains.annotations.NotNull()
    kotlin.jvm.functions.Function0<kotlin.Unit> onDismiss, @org.jetbrains.annotations.NotNull()
    kotlin.jvm.functions.Function2<? super java.lang.String, ? super com.bontecou.syncmd.data.models.MergeStrategy, kotlin.Unit> onMerge, @org.jetbrains.annotations.NotNull()
    java.lang.String currentBranch, @org.jetbrains.annotations.NotNull()
    java.util.List<com.bontecou.syncmd.data.models.Branch> availableBranches) {
    }
    
    /**
     * Dialog for confirming branch deletion.
     */
    @androidx.compose.runtime.Composable()
    public static final void DeleteBranchDialog(@org.jetbrains.annotations.NotNull()
    java.lang.String branchName, @org.jetbrains.annotations.NotNull()
    kotlin.jvm.functions.Function0<kotlin.Unit> onDismiss, @org.jetbrains.annotations.NotNull()
    kotlin.jvm.functions.Function1<? super java.lang.Boolean, kotlin.Unit> onConfirm) {
    }
    
    /**
     * Get a description of a merge strategy.
     */
    @org.jetbrains.annotations.NotNull()
    public static final java.lang.String strategyDescription(@org.jetbrains.annotations.NotNull()
    com.bontecou.syncmd.data.models.MergeStrategy strategy) {
        return null;
    }
}