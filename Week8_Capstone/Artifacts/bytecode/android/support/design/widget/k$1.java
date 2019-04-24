class android.support.design.widget.k$1 implements android.os.Handler$Callback {
  final android.support.design.widget.k a;

  android.support.design.widget.k$1(android.support.design.widget.k);
    Code:
       0: aload_0
       1: aload_1
       2: putfield      #16                 // Field a:Landroid/support/design/widget/k;
       5: aload_0
       6: invokespecial #17                 // Method java/lang/Object."<init>":()V
       9: return

  public boolean handleMessage(android.os.Message);
    Code:
       0: aload_1
       1: getfield      #26                 // Field android/os/Message.what:I
       4: ifeq          9
       7: iconst_0
       8: ireturn
       9: aload_0
      10: getfield      #16                 // Field a:Landroid/support/design/widget/k;
      13: aload_1
      14: getfield      #30                 // Field android/os/Message.obj:Ljava/lang/Object;
      17: checkcast     #32                 // class android/support/design/widget/k$b
      20: invokevirtual #35                 // Method android/support/design/widget/k.a:(Landroid/support/design/widget/k$b;)V
      23: iconst_1
      24: ireturn
}
