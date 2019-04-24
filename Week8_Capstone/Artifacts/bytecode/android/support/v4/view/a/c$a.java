class android.support.v4.view.a.c$a extends android.view.accessibility.AccessibilityNodeProvider {
  final android.support.v4.view.a.c a;

  android.support.v4.view.a.c$a(android.support.v4.view.a.c);
    Code:
       0: aload_0
       1: invokespecial #13                 // Method android/view/accessibility/AccessibilityNodeProvider."<init>":()V
       4: aload_0
       5: aload_1
       6: putfield      #15                 // Field a:Landroid/support/v4/view/a/c;
       9: return

  public android.view.accessibility.AccessibilityNodeInfo createAccessibilityNodeInfo(int);
    Code:
       0: aload_0
       1: getfield      #15                 // Field a:Landroid/support/v4/view/a/c;
       4: iload_1
       5: invokevirtual #21                 // Method android/support/v4/view/a/c.a:(I)Landroid/support/v4/view/a/b;
       8: astore_2
       9: aload_2
      10: ifnonnull     15
      13: aconst_null
      14: areturn
      15: aload_2
      16: invokevirtual #26                 // Method android/support/v4/view/a/b.a:()Landroid/view/accessibility/AccessibilityNodeInfo;
      19: areturn

  public java.util.List<android.view.accessibility.AccessibilityNodeInfo> findAccessibilityNodeInfosByText(java.lang.String, int);
    Code:
       0: aload_0
       1: getfield      #15                 // Field a:Landroid/support/v4/view/a/c;
       4: aload_1
       5: iload_2
       6: invokevirtual #30                 // Method android/support/v4/view/a/c.a:(Ljava/lang/String;I)Ljava/util/List;
       9: astore_1
      10: aload_1
      11: ifnonnull     16
      14: aconst_null
      15: areturn
      16: new           #32                 // class java/util/ArrayList
      19: dup
      20: invokespecial #33                 // Method java/util/ArrayList."<init>":()V
      23: astore        4
      25: aload_1
      26: invokeinterface #39,  1           // InterfaceMethod java/util/List.size:()I
      31: istore_3
      32: iconst_0
      33: istore_2
      34: iload_2
      35: iload_3
      36: if_icmpge     67
      39: aload         4
      41: aload_1
      42: iload_2
      43: invokeinterface #43,  2           // InterfaceMethod java/util/List.get:(I)Ljava/lang/Object;
      48: checkcast     #23                 // class android/support/v4/view/a/b
      51: invokevirtual #26                 // Method android/support/v4/view/a/b.a:()Landroid/view/accessibility/AccessibilityNodeInfo;
      54: invokeinterface #47,  2           // InterfaceMethod java/util/List.add:(Ljava/lang/Object;)Z
      59: pop
      60: iload_2
      61: iconst_1
      62: iadd
      63: istore_2
      64: goto          34
      67: aload         4
      69: areturn

  public boolean performAction(int, int, android.os.Bundle);
    Code:
       0: aload_0
       1: getfield      #15                 // Field a:Landroid/support/v4/view/a/c;
       4: iload_1
       5: iload_2
       6: aload_3
       7: invokevirtual #53                 // Method android/support/v4/view/a/c.a:(IILandroid/os/Bundle;)Z
      10: ireturn
}
