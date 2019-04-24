public class android.support.v4.view.a.d {
  public static void a(android.view.accessibility.AccessibilityRecord, int);
    Code:
       0: getstatic     #13                 // Field android/os/Build$VERSION.SDK_INT:I
       3: bipush        15
       5: if_icmplt     13
       8: aload_0
       9: iload_1
      10: invokevirtual #19                 // Method android/view/accessibility/AccessibilityRecord.setMaxScrollX:(I)V
      13: return

  public static void b(android.view.accessibility.AccessibilityRecord, int);
    Code:
       0: getstatic     #13                 // Field android/os/Build$VERSION.SDK_INT:I
       3: bipush        15
       5: if_icmplt     13
       8: aload_0
       9: iload_1
      10: invokevirtual #24                 // Method android/view/accessibility/AccessibilityRecord.setMaxScrollY:(I)V
      13: return

  public boolean equals(java.lang.Object);
    Code:
       0: aload_0
       1: aload_1
       2: if_acmpne     7
       5: iconst_1
       6: ireturn
       7: aload_1
       8: ifnonnull     13
      11: iconst_0
      12: ireturn
      13: aload_0
      14: invokevirtual #31                 // Method java/lang/Object.getClass:()Ljava/lang/Class;
      17: aload_1
      18: invokevirtual #31                 // Method java/lang/Object.getClass:()Ljava/lang/Class;
      21: if_acmpeq     26
      24: iconst_0
      25: ireturn
      26: aload_1
      27: checkcast     #2                  // class android/support/v4/view/a/d
      30: astore_1
      31: aload_0
      32: getfield      #33                 // Field a:Landroid/view/accessibility/AccessibilityRecord;
      35: ifnonnull     47
      38: aload_1
      39: getfield      #33                 // Field a:Landroid/view/accessibility/AccessibilityRecord;
      42: ifnull        63
      45: iconst_0
      46: ireturn
      47: aload_0
      48: getfield      #33                 // Field a:Landroid/view/accessibility/AccessibilityRecord;
      51: aload_1
      52: getfield      #33                 // Field a:Landroid/view/accessibility/AccessibilityRecord;
      55: invokevirtual #35                 // Method java/lang/Object.equals:(Ljava/lang/Object;)Z
      58: ifne          63
      61: iconst_0
      62: ireturn
      63: iconst_1
      64: ireturn

  public int hashCode();
    Code:
       0: aload_0
       1: getfield      #33                 // Field a:Landroid/view/accessibility/AccessibilityRecord;
       4: ifnonnull     9
       7: iconst_0
       8: ireturn
       9: aload_0
      10: getfield      #33                 // Field a:Landroid/view/accessibility/AccessibilityRecord;
      13: invokevirtual #40                 // Method java/lang/Object.hashCode:()I
      16: ireturn
}
