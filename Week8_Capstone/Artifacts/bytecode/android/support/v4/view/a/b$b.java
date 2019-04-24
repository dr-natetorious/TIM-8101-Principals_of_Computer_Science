public class android.support.v4.view.a.b$b {
  final java.lang.Object a;

  android.support.v4.view.a.b$b(java.lang.Object);
    Code:
       0: aload_0
       1: invokespecial #14                 // Method java/lang/Object."<init>":()V
       4: aload_0
       5: aload_1
       6: putfield      #16                 // Field a:Ljava/lang/Object;
       9: return

  public static android.support.v4.view.a.b$b a(int, int, boolean, int);
    Code:
       0: getstatic     #24                 // Field android/os/Build$VERSION.SDK_INT:I
       3: bipush        21
       5: if_icmplt     23
       8: new           #2                  // class android/support/v4/view/a/b$b
      11: dup
      12: iload_0
      13: iload_1
      14: iload_2
      15: iload_3
      16: invokestatic  #30                 // Method android/view/accessibility/AccessibilityNodeInfo$CollectionInfo.obtain:(IIZI)Landroid/view/accessibility/AccessibilityNodeInfo$CollectionInfo;
      19: invokespecial #32                 // Method "<init>":(Ljava/lang/Object;)V
      22: areturn
      23: getstatic     #24                 // Field android/os/Build$VERSION.SDK_INT:I
      26: bipush        19
      28: if_icmplt     45
      31: new           #2                  // class android/support/v4/view/a/b$b
      34: dup
      35: iload_0
      36: iload_1
      37: iload_2
      38: invokestatic  #35                 // Method android/view/accessibility/AccessibilityNodeInfo$CollectionInfo.obtain:(IIZ)Landroid/view/accessibility/AccessibilityNodeInfo$CollectionInfo;
      41: invokespecial #32                 // Method "<init>":(Ljava/lang/Object;)V
      44: areturn
      45: new           #2                  // class android/support/v4/view/a/b$b
      48: dup
      49: aconst_null
      50: invokespecial #32                 // Method "<init>":(Ljava/lang/Object;)V
      53: areturn
}
