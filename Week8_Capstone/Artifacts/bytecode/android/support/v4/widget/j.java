public final class android.support.v4.widget.j {
  public static void a(android.widget.ListView, int);
    Code:
       0: getstatic     #12                 // Field android/os/Build$VERSION.SDK_INT:I
       3: bipush        19
       5: if_icmplt     14
       8: aload_0
       9: iload_1
      10: invokevirtual #18                 // Method android/widget/ListView.scrollListBy:(I)V
      13: return
      14: aload_0
      15: invokevirtual #22                 // Method android/widget/ListView.getFirstVisiblePosition:()I
      18: istore_2
      19: iload_2
      20: iconst_m1
      21: if_icmpne     25
      24: return
      25: aload_0
      26: iconst_0
      27: invokevirtual #26                 // Method android/widget/ListView.getChildAt:(I)Landroid/view/View;
      30: astore_3
      31: aload_3
      32: ifnonnull     36
      35: return
      36: aload_0
      37: iload_2
      38: aload_3
      39: invokevirtual #31                 // Method android/view/View.getTop:()I
      42: iload_1
      43: isub
      44: invokevirtual #35                 // Method android/widget/ListView.setSelectionFromTop:(II)V
      47: return
}
