public class android.support.v4.view.a.b$c {
  final java.lang.Object a;

  android.support.v4.view.a.b$c(java.lang.Object);
    Code:
       0: aload_0
       1: invokespecial #14                 // Method java/lang/Object."<init>":()V
       4: aload_0
       5: aload_1
       6: putfield      #16                 // Field a:Ljava/lang/Object;
       9: return

  public static android.support.v4.view.a.b$c a(int, int, int, int, boolean, boolean);
    Code:
       0: getstatic     #24                 // Field android/os/Build$VERSION.SDK_INT:I
       3: bipush        21
       5: if_icmplt     27
       8: new           #2                  // class android/support/v4/view/a/b$c
      11: dup
      12: iload_0
      13: iload_1
      14: iload_2
      15: iload_3
      16: iload         4
      18: iload         5
      20: invokestatic  #30                 // Method android/view/accessibility/AccessibilityNodeInfo$CollectionItemInfo.obtain:(IIIIZZ)Landroid/view/accessibility/AccessibilityNodeInfo$CollectionItemInfo;
      23: invokespecial #32                 // Method "<init>":(Ljava/lang/Object;)V
      26: areturn
      27: getstatic     #24                 // Field android/os/Build$VERSION.SDK_INT:I
      30: bipush        19
      32: if_icmplt     52
      35: new           #2                  // class android/support/v4/view/a/b$c
      38: dup
      39: iload_0
      40: iload_1
      41: iload_2
      42: iload_3
      43: iload         4
      45: invokestatic  #35                 // Method android/view/accessibility/AccessibilityNodeInfo$CollectionItemInfo.obtain:(IIIIZ)Landroid/view/accessibility/AccessibilityNodeInfo$CollectionItemInfo;
      48: invokespecial #32                 // Method "<init>":(Ljava/lang/Object;)V
      51: areturn
      52: new           #2                  // class android/support/v4/view/a/b$c
      55: dup
      56: aconst_null
      57: invokespecial #32                 // Method "<init>":(Ljava/lang/Object;)V
      60: areturn
}
