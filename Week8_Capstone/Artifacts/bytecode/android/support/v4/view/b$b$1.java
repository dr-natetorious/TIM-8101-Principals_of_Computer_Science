class android.support.v4.view.b$b$1 extends android.view.View$AccessibilityDelegate {
  final android.support.v4.view.b a;

  final android.support.v4.view.b$b b;

  android.support.v4.view.b$b$1(android.support.v4.view.b$b, android.support.v4.view.b);
    Code:
       0: aload_0
       1: aload_1
       2: putfield      #18                 // Field b:Landroid/support/v4/view/b$b;
       5: aload_0
       6: aload_2
       7: putfield      #20                 // Field a:Landroid/support/v4/view/b;
      10: aload_0
      11: invokespecial #23                 // Method android/view/View$AccessibilityDelegate."<init>":()V
      14: return

  public boolean dispatchPopulateAccessibilityEvent(android.view.View, android.view.accessibility.AccessibilityEvent);
    Code:
       0: aload_0
       1: getfield      #20                 // Field a:Landroid/support/v4/view/b;
       4: aload_1
       5: aload_2
       6: invokevirtual #29                 // Method android/support/v4/view/b.c:(Landroid/view/View;Landroid/view/accessibility/AccessibilityEvent;)Z
       9: ireturn

  public void onInitializeAccessibilityEvent(android.view.View, android.view.accessibility.AccessibilityEvent);
    Code:
       0: aload_0
       1: getfield      #20                 // Field a:Landroid/support/v4/view/b;
       4: aload_1
       5: aload_2
       6: invokevirtual #33                 // Method android/support/v4/view/b.a:(Landroid/view/View;Landroid/view/accessibility/AccessibilityEvent;)V
       9: return

  public void onInitializeAccessibilityNodeInfo(android.view.View, android.view.accessibility.AccessibilityNodeInfo);
    Code:
       0: aload_0
       1: getfield      #20                 // Field a:Landroid/support/v4/view/b;
       4: aload_1
       5: aload_2
       6: invokestatic  #40                 // Method android/support/v4/view/a/b.a:(Landroid/view/accessibility/AccessibilityNodeInfo;)Landroid/support/v4/view/a/b;
       9: invokevirtual #43                 // Method android/support/v4/view/b.a:(Landroid/view/View;Landroid/support/v4/view/a/b;)V
      12: return

  public void onPopulateAccessibilityEvent(android.view.View, android.view.accessibility.AccessibilityEvent);
    Code:
       0: aload_0
       1: getfield      #20                 // Field a:Landroid/support/v4/view/b;
       4: aload_1
       5: aload_2
       6: invokevirtual #47                 // Method android/support/v4/view/b.d:(Landroid/view/View;Landroid/view/accessibility/AccessibilityEvent;)V
       9: return

  public boolean onRequestSendAccessibilityEvent(android.view.ViewGroup, android.view.View, android.view.accessibility.AccessibilityEvent);
    Code:
       0: aload_0
       1: getfield      #20                 // Field a:Landroid/support/v4/view/b;
       4: aload_1
       5: aload_2
       6: aload_3
       7: invokevirtual #51                 // Method android/support/v4/view/b.a:(Landroid/view/ViewGroup;Landroid/view/View;Landroid/view/accessibility/AccessibilityEvent;)Z
      10: ireturn

  public void sendAccessibilityEvent(android.view.View, int);
    Code:
       0: aload_0
       1: getfield      #20                 // Field a:Landroid/support/v4/view/b;
       4: aload_1
       5: iload_2
       6: invokevirtual #55                 // Method android/support/v4/view/b.a:(Landroid/view/View;I)V
       9: return

  public void sendAccessibilityEventUnchecked(android.view.View, android.view.accessibility.AccessibilityEvent);
    Code:
       0: aload_0
       1: getfield      #20                 // Field a:Landroid/support/v4/view/b;
       4: aload_1
       5: aload_2
       6: invokevirtual #58                 // Method android/support/v4/view/b.b:(Landroid/view/View;Landroid/view/accessibility/AccessibilityEvent;)V
       9: return
}
