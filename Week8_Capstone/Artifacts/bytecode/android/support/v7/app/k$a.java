class android.support.v7.app.k$a extends android.support.v7.app.j$a {
  final android.support.v7.app.k d;

  android.support.v7.app.k$a(android.support.v7.app.k, android.view.Window$Callback);
    Code:
       0: aload_0
       1: aload_1
       2: putfield      #13                 // Field d:Landroid/support/v7/app/k;
       5: aload_0
       6: aload_1
       7: aload_2
       8: invokespecial #16                 // Method android/support/v7/app/j$a."<init>":(Landroid/support/v7/app/j;Landroid/view/Window$Callback;)V
      11: return

  public android.view.ActionMode onWindowStartingActionMode(android.view.ActionMode$Callback);
    Code:
       0: aconst_null
       1: areturn

  public android.view.ActionMode onWindowStartingActionMode(android.view.ActionMode$Callback, int);
    Code:
       0: aload_0
       1: getfield      #13                 // Field d:Landroid/support/v7/app/k;
       4: invokevirtual #24                 // Method android/support/v7/app/k.p:()Z
       7: ifeq          23
      10: iload_2
      11: ifeq          17
      14: goto          23
      17: aload_0
      18: aload_1
      19: invokevirtual #26                 // Method a:(Landroid/view/ActionMode$Callback;)Landroid/view/ActionMode;
      22: areturn
      23: aload_0
      24: aload_1
      25: iload_2
      26: invokespecial #28                 // Method android/support/v7/app/j$a.onWindowStartingActionMode:(Landroid/view/ActionMode$Callback;I)Landroid/view/ActionMode;
      29: areturn
}
