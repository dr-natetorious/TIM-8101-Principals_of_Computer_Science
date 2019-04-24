class android.support.v7.app.j$a extends android.support.v7.app.h$b {
  final android.support.v7.app.j c;

  android.support.v7.app.j$a(android.support.v7.app.j, android.view.Window$Callback);
    Code:
       0: aload_0
       1: aload_1
       2: putfield      #13                 // Field c:Landroid/support/v7/app/j;
       5: aload_0
       6: aload_1
       7: aload_2
       8: invokespecial #16                 // Method android/support/v7/app/h$b."<init>":(Landroid/support/v7/app/h;Landroid/view/Window$Callback;)V
      11: return

  final android.view.ActionMode a(android.view.ActionMode$Callback);
    Code:
       0: new           #20                 // class android/support/v7/view/f$a
       3: dup
       4: aload_0
       5: getfield      #13                 // Field c:Landroid/support/v7/app/j;
       8: getfield      #23                 // Field android/support/v7/app/j.a:Landroid/content/Context;
      11: aload_1
      12: invokespecial #26                 // Method android/support/v7/view/f$a."<init>":(Landroid/content/Context;Landroid/view/ActionMode$Callback;)V
      15: astore_1
      16: aload_0
      17: getfield      #13                 // Field c:Landroid/support/v7/app/j;
      20: aload_1
      21: invokevirtual #29                 // Method android/support/v7/app/j.a:(Landroid/support/v7/view/b$a;)Landroid/support/v7/view/b;
      24: astore_2
      25: aload_2
      26: ifnull        35
      29: aload_1
      30: aload_2
      31: invokevirtual #33                 // Method android/support/v7/view/f$a.b:(Landroid/support/v7/view/b;)Landroid/view/ActionMode;
      34: areturn
      35: aconst_null
      36: areturn

  public android.view.ActionMode onWindowStartingActionMode(android.view.ActionMode$Callback);
    Code:
       0: aload_0
       1: getfield      #13                 // Field c:Landroid/support/v7/app/j;
       4: invokevirtual #38                 // Method android/support/v7/app/j.p:()Z
       7: ifeq          16
      10: aload_0
      11: aload_1
      12: invokevirtual #40                 // Method a:(Landroid/view/ActionMode$Callback;)Landroid/view/ActionMode;
      15: areturn
      16: aload_0
      17: aload_1
      18: invokespecial #42                 // Method android/support/v7/app/h$b.onWindowStartingActionMode:(Landroid/view/ActionMode$Callback;)Landroid/view/ActionMode;
      21: areturn
}
