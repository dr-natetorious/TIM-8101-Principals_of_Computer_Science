class android.support.v7.app.k extends android.support.v7.app.j {
  android.support.v7.app.k(android.content.Context, android.view.Window, android.support.v7.app.f);
    Code:
       0: aload_0
       1: aload_1
       2: aload_2
       3: aload_3
       4: invokespecial #13                 // Method android/support/v7/app/j."<init>":(Landroid/content/Context;Landroid/view/Window;Landroid/support/v7/app/f;)V
       7: aload_0
       8: aload_1
       9: ldc           #15                 // String uimode
      11: invokevirtual #21                 // Method android/content/Context.getSystemService:(Ljava/lang/String;)Ljava/lang/Object;
      14: checkcast     #23                 // class android/app/UiModeManager
      17: putfield      #25                 // Field t:Landroid/app/UiModeManager;
      20: return

  android.view.Window$Callback a(android.view.Window$Callback);
    Code:
       0: new           #6                  // class android/support/v7/app/k$a
       3: dup
       4: aload_0
       5: aload_1
       6: invokespecial #30                 // Method android/support/v7/app/k$a."<init>":(Landroid/support/v7/app/k;Landroid/view/Window$Callback;)V
       9: areturn

  int d(int);
    Code:
       0: iload_1
       1: ifne          16
       4: aload_0
       5: getfield      #25                 // Field t:Landroid/app/UiModeManager;
       8: invokevirtual #36                 // Method android/app/UiModeManager.getNightMode:()I
      11: ifne          16
      14: iconst_m1
      15: ireturn
      16: aload_0
      17: iload_1
      18: invokespecial #38                 // Method android/support/v7/app/j.d:(I)I
      21: ireturn
}
