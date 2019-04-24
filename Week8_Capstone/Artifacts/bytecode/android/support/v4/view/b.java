public class android.support.v4.view.b {
  final android.view.View$AccessibilityDelegate b;

  static {};
    Code:
       0: getstatic     #25                 // Field android/os/Build$VERSION.SDK_INT:I
       3: bipush        16
       5: if_icmplt     23
       8: new           #6                  // class android/support/v4/view/b$a
      11: dup
      12: invokespecial #28                 // Method android/support/v4/view/b$a."<init>":()V
      15: astore_0
      16: aload_0
      17: putstatic     #30                 // Field a:Landroid/support/v4/view/b$b;
      20: goto          34
      23: new           #11                 // class android/support/v4/view/b$b
      26: dup
      27: invokespecial #31                 // Method android/support/v4/view/b$b."<init>":()V
      30: astore_0
      31: goto          16
      34: new           #33                 // class android/view/View$AccessibilityDelegate
      37: dup
      38: invokespecial #34                 // Method android/view/View$AccessibilityDelegate."<init>":()V
      41: putstatic     #36                 // Field c:Landroid/view/View$AccessibilityDelegate;
      44: return

  public android.support.v4.view.b();
    Code:
       0: aload_0
       1: invokespecial #38                 // Method java/lang/Object."<init>":()V
       4: aload_0
       5: getstatic     #30                 // Field a:Landroid/support/v4/view/b$b;
       8: aload_0
       9: invokevirtual #41                 // Method android/support/v4/view/b$b.a:(Landroid/support/v4/view/b;)Landroid/view/View$AccessibilityDelegate;
      12: putfield      #43                 // Field b:Landroid/view/View$AccessibilityDelegate;
      15: return

  public android.support.v4.view.a.c a(android.view.View);
    Code:
       0: getstatic     #30                 // Field a:Landroid/support/v4/view/b$b;
       3: getstatic     #36                 // Field c:Landroid/view/View$AccessibilityDelegate;
       6: aload_1
       7: invokevirtual #47                 // Method android/support/v4/view/b$b.a:(Landroid/view/View$AccessibilityDelegate;Landroid/view/View;)Landroid/support/v4/view/a/c;
      10: areturn

  android.view.View$AccessibilityDelegate a();
    Code:
       0: aload_0
       1: getfield      #43                 // Field b:Landroid/view/View$AccessibilityDelegate;
       4: areturn

  public void a(android.view.View, int);
    Code:
       0: getstatic     #36                 // Field c:Landroid/view/View$AccessibilityDelegate;
       3: aload_1
       4: iload_2
       5: invokevirtual #52                 // Method android/view/View$AccessibilityDelegate.sendAccessibilityEvent:(Landroid/view/View;I)V
       8: return

  public void a(android.view.View, android.support.v4.view.a.b);
    Code:
       0: getstatic     #36                 // Field c:Landroid/view/View$AccessibilityDelegate;
       3: aload_1
       4: aload_2
       5: invokevirtual #58                 // Method android/support/v4/view/a/b.a:()Landroid/view/accessibility/AccessibilityNodeInfo;
       8: invokevirtual #62                 // Method android/view/View$AccessibilityDelegate.onInitializeAccessibilityNodeInfo:(Landroid/view/View;Landroid/view/accessibility/AccessibilityNodeInfo;)V
      11: return

  public void a(android.view.View, android.view.accessibility.AccessibilityEvent);
    Code:
       0: getstatic     #36                 // Field c:Landroid/view/View$AccessibilityDelegate;
       3: aload_1
       4: aload_2
       5: invokevirtual #66                 // Method android/view/View$AccessibilityDelegate.onInitializeAccessibilityEvent:(Landroid/view/View;Landroid/view/accessibility/AccessibilityEvent;)V
       8: return

  public boolean a(android.view.View, int, android.os.Bundle);
    Code:
       0: getstatic     #30                 // Field a:Landroid/support/v4/view/b$b;
       3: getstatic     #36                 // Field c:Landroid/view/View$AccessibilityDelegate;
       6: aload_1
       7: iload_2
       8: aload_3
       9: invokevirtual #70                 // Method android/support/v4/view/b$b.a:(Landroid/view/View$AccessibilityDelegate;Landroid/view/View;ILandroid/os/Bundle;)Z
      12: ireturn

  public boolean a(android.view.ViewGroup, android.view.View, android.view.accessibility.AccessibilityEvent);
    Code:
       0: getstatic     #36                 // Field c:Landroid/view/View$AccessibilityDelegate;
       3: aload_1
       4: aload_2
       5: aload_3
       6: invokevirtual #74                 // Method android/view/View$AccessibilityDelegate.onRequestSendAccessibilityEvent:(Landroid/view/ViewGroup;Landroid/view/View;Landroid/view/accessibility/AccessibilityEvent;)Z
       9: ireturn

  public void b(android.view.View, android.view.accessibility.AccessibilityEvent);
    Code:
       0: getstatic     #36                 // Field c:Landroid/view/View$AccessibilityDelegate;
       3: aload_1
       4: aload_2
       5: invokevirtual #77                 // Method android/view/View$AccessibilityDelegate.sendAccessibilityEventUnchecked:(Landroid/view/View;Landroid/view/accessibility/AccessibilityEvent;)V
       8: return

  public boolean c(android.view.View, android.view.accessibility.AccessibilityEvent);
    Code:
       0: getstatic     #36                 // Field c:Landroid/view/View$AccessibilityDelegate;
       3: aload_1
       4: aload_2
       5: invokevirtual #81                 // Method android/view/View$AccessibilityDelegate.dispatchPopulateAccessibilityEvent:(Landroid/view/View;Landroid/view/accessibility/AccessibilityEvent;)Z
       8: ireturn

  public void d(android.view.View, android.view.accessibility.AccessibilityEvent);
    Code:
       0: getstatic     #36                 // Field c:Landroid/view/View$AccessibilityDelegate;
       3: aload_1
       4: aload_2
       5: invokevirtual #85                 // Method android/view/View$AccessibilityDelegate.onPopulateAccessibilityEvent:(Landroid/view/View;Landroid/view/accessibility/AccessibilityEvent;)V
       8: return
}
