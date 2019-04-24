public class android.support.v7.widget.br {
  public static void a(android.view.View, java.lang.CharSequence);
    Code:
       0: getstatic     #12                 // Field android/os/Build$VERSION.SDK_INT:I
       3: bipush        26
       5: if_icmplt     14
       8: aload_0
       9: aload_1
      10: invokevirtual #18                 // Method android/view/View.setTooltipText:(Ljava/lang/CharSequence;)V
      13: return
      14: aload_0
      15: aload_1
      16: invokestatic  #22                 // Method android/support/v7/widget/bs.a:(Landroid/view/View;Ljava/lang/CharSequence;)V
      19: return
}
