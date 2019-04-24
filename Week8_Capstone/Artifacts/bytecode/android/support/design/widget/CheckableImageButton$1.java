class android.support.design.widget.CheckableImageButton$1 extends android.support.v4.view.b {
  final android.support.design.widget.CheckableImageButton a;

  android.support.design.widget.CheckableImageButton$1(android.support.design.widget.CheckableImageButton);
    Code:
       0: aload_0
       1: aload_1
       2: putfield      #14                 // Field a:Landroid/support/design/widget/CheckableImageButton;
       5: aload_0
       6: invokespecial #17                 // Method android/support/v4/view/b."<init>":()V
       9: return

  public void a(android.view.View, android.support.v4.view.a.b);
    Code:
       0: aload_0
       1: aload_1
       2: aload_2
       3: invokespecial #21                 // Method android/support/v4/view/b.a:(Landroid/view/View;Landroid/support/v4/view/a/b;)V
       6: aload_2
       7: iconst_1
       8: invokevirtual #26                 // Method android/support/v4/view/a/b.a:(Z)V
      11: aload_2
      12: aload_0
      13: getfield      #14                 // Field a:Landroid/support/design/widget/CheckableImageButton;
      16: invokevirtual #30                 // Method android/support/design/widget/CheckableImageButton.isChecked:()Z
      19: invokevirtual #33                 // Method android/support/v4/view/a/b.b:(Z)V
      22: return

  public void a(android.view.View, android.view.accessibility.AccessibilityEvent);
    Code:
       0: aload_0
       1: aload_1
       2: aload_2
       3: invokespecial #36                 // Method android/support/v4/view/b.a:(Landroid/view/View;Landroid/view/accessibility/AccessibilityEvent;)V
       6: aload_2
       7: aload_0
       8: getfield      #14                 // Field a:Landroid/support/design/widget/CheckableImageButton;
      11: invokevirtual #30                 // Method android/support/design/widget/CheckableImageButton.isChecked:()Z
      14: invokevirtual #41                 // Method android/view/accessibility/AccessibilityEvent.setChecked:(Z)V
      17: return
}
