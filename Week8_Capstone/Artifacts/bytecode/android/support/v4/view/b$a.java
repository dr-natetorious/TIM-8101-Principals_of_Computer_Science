class android.support.v4.view.b$a extends android.support.v4.view.b$b {
  android.support.v4.view.b$a();
    Code:
       0: aload_0
       1: invokespecial #13                 // Method android/support/v4/view/b$b."<init>":()V
       4: return

  public android.support.v4.view.a.c a(android.view.View$AccessibilityDelegate, android.view.View);
    Code:
       0: aload_1
       1: aload_2
       2: invokevirtual #21                 // Method android/view/View$AccessibilityDelegate.getAccessibilityNodeProvider:(Landroid/view/View;)Landroid/view/accessibility/AccessibilityNodeProvider;
       5: astore_1
       6: aload_1
       7: ifnull        19
      10: new           #23                 // class android/support/v4/view/a/c
      13: dup
      14: aload_1
      15: invokespecial #26                 // Method android/support/v4/view/a/c."<init>":(Ljava/lang/Object;)V
      18: areturn
      19: aconst_null
      20: areturn

  public android.view.View$AccessibilityDelegate a(android.support.v4.view.b);
    Code:
       0: new           #9                  // class android/support/v4/view/b$a$1
       3: dup
       4: aload_0
       5: aload_1
       6: invokespecial #30                 // Method android/support/v4/view/b$a$1."<init>":(Landroid/support/v4/view/b$a;Landroid/support/v4/view/b;)V
       9: areturn

  public boolean a(android.view.View$AccessibilityDelegate, android.view.View, int, android.os.Bundle);
    Code:
       0: aload_1
       1: aload_2
       2: iload_3
       3: aload         4
       5: invokevirtual #35                 // Method android/view/View$AccessibilityDelegate.performAccessibilityAction:(Landroid/view/View;ILandroid/os/Bundle;)Z
       8: ireturn
}
