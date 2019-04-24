public final class android.support.v4.view.a.a {
  public static int a(android.view.accessibility.AccessibilityEvent);
    Code:
       0: getstatic     #12                 // Field android/os/Build$VERSION.SDK_INT:I
       3: bipush        19
       5: if_icmplt     13
       8: aload_0
       9: invokevirtual #18                 // Method android/view/accessibility/AccessibilityEvent.getContentChangeTypes:()I
      12: ireturn
      13: iconst_0
      14: ireturn

  public static void a(android.view.accessibility.AccessibilityEvent, int);
    Code:
       0: getstatic     #12                 // Field android/os/Build$VERSION.SDK_INT:I
       3: bipush        19
       5: if_icmplt     13
       8: aload_0
       9: iload_1
      10: invokevirtual #24                 // Method android/view/accessibility/AccessibilityEvent.setContentChangeTypes:(I)V
      13: return
}
