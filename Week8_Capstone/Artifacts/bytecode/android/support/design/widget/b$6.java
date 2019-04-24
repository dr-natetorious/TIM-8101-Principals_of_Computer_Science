class android.support.design.widget.b$6 implements android.support.design.widget.b$d {
  final android.support.design.widget.b a;

  android.support.design.widget.b$6(android.support.design.widget.b);
    Code:
       0: aload_0
       1: aload_1
       2: putfield      #19                 // Field a:Landroid/support/design/widget/b;
       5: aload_0
       6: invokespecial #21                 // Method java/lang/Object."<init>":()V
       9: return

  public void a(android.view.View);
    Code:
       0: return

  public void b(android.view.View);
    Code:
       0: aload_0
       1: getfield      #19                 // Field a:Landroid/support/design/widget/b;
       4: invokevirtual #26                 // Method android/support/design/widget/b.a:()Z
       7: ifeq          25
      10: getstatic     #29                 // Field android/support/design/widget/b.a:Landroid/os/Handler;
      13: new           #13                 // class android/support/design/widget/b$6$1
      16: dup
      17: aload_0
      18: invokespecial #32                 // Method android/support/design/widget/b$6$1."<init>":(Landroid/support/design/widget/b$6;)V
      21: invokevirtual #38                 // Method android/os/Handler.post:(Ljava/lang/Runnable;)Z
      24: pop
      25: return
}
