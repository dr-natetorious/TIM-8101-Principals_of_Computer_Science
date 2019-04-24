class android.support.v4.view.a.c$b extends android.support.v4.view.a.c$a {
  android.support.v4.view.a.c$b(android.support.v4.view.a.c);
    Code:
       0: aload_0
       1: aload_1
       2: invokespecial #11                 // Method android/support/v4/view/a/c$a."<init>":(Landroid/support/v4/view/a/c;)V
       5: return

  public android.view.accessibility.AccessibilityNodeInfo findFocus(int);
    Code:
       0: aload_0
       1: getfield      #18                 // Field a:Landroid/support/v4/view/a/c;
       4: iload_1
       5: invokevirtual #21                 // Method android/support/v4/view/a/c.b:(I)Landroid/support/v4/view/a/b;
       8: astore_2
       9: aload_2
      10: ifnonnull     15
      13: aconst_null
      14: areturn
      15: aload_2
      16: invokevirtual #26                 // Method android/support/v4/view/a/b.a:()Landroid/view/accessibility/AccessibilityNodeInfo;
      19: areturn
}
