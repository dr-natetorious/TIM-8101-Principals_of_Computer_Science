class android.support.v7.widget.z$b$2 implements android.view.ViewTreeObserver$OnGlobalLayoutListener {
  final android.support.v7.widget.z$b a;

  android.support.v7.widget.z$b$2(android.support.v7.widget.z$b);
    Code:
       0: aload_0
       1: aload_1
       2: putfield      #20                 // Field a:Landroid/support/v7/widget/z$b;
       5: aload_0
       6: invokespecial #22                 // Method java/lang/Object."<init>":()V
       9: return

  public void onGlobalLayout();
    Code:
       0: aload_0
       1: getfield      #20                 // Field a:Landroid/support/v7/widget/z$b;
       4: aload_0
       5: getfield      #20                 // Field a:Landroid/support/v7/widget/z$b;
       8: getfield      #27                 // Field android/support/v7/widget/z$b.b:Landroid/support/v7/widget/z;
      11: invokevirtual #30                 // Method android/support/v7/widget/z$b.a:(Landroid/view/View;)Z
      14: ifne          25
      17: aload_0
      18: getfield      #20                 // Field a:Landroid/support/v7/widget/z$b;
      21: invokevirtual #33                 // Method android/support/v7/widget/z$b.e:()V
      24: return
      25: aload_0
      26: getfield      #20                 // Field a:Landroid/support/v7/widget/z$b;
      29: invokevirtual #35                 // Method android/support/v7/widget/z$b.b:()V
      32: aload_0
      33: getfield      #20                 // Field a:Landroid/support/v7/widget/z$b;
      36: invokestatic  #37                 // Method android/support/v7/widget/z$b.a:(Landroid/support/v7/widget/z$b;)V
      39: return
}
