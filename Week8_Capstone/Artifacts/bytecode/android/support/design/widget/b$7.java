class android.support.design.widget.b$7 implements android.support.design.widget.b$e {
  final android.support.design.widget.b a;

  android.support.design.widget.b$7(android.support.design.widget.b);
    Code:
       0: aload_0
       1: aload_1
       2: putfield      #17                 // Field a:Landroid/support/design/widget/b;
       5: aload_0
       6: invokespecial #19                 // Method java/lang/Object."<init>":()V
       9: return

  public void a(android.view.View, int, int, int, int);
    Code:
       0: aload_0
       1: getfield      #17                 // Field a:Landroid/support/design/widget/b;
       4: getfield      #24                 // Field android/support/design/widget/b.b:Landroid/support/design/widget/b$f;
       7: aconst_null
       8: invokevirtual #30                 // Method android/support/design/widget/b$f.setOnLayoutChangeListener:(Landroid/support/design/widget/b$e;)V
      11: aload_0
      12: getfield      #17                 // Field a:Landroid/support/design/widget/b;
      15: invokevirtual #34                 // Method android/support/design/widget/b.e:()Z
      18: ifeq          29
      21: aload_0
      22: getfield      #17                 // Field a:Landroid/support/design/widget/b;
      25: invokevirtual #37                 // Method android/support/design/widget/b.c:()V
      28: return
      29: aload_0
      30: getfield      #17                 // Field a:Landroid/support/design/widget/b;
      33: invokevirtual #40                 // Method android/support/design/widget/b.d:()V
      36: return
}
