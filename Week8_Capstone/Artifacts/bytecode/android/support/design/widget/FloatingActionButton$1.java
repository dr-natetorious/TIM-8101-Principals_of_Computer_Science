class android.support.design.widget.FloatingActionButton$1 implements android.support.design.widget.e$c {
  final android.support.design.widget.FloatingActionButton$a a;

  final android.support.design.widget.FloatingActionButton b;

  android.support.design.widget.FloatingActionButton$1(android.support.design.widget.FloatingActionButton, android.support.design.widget.FloatingActionButton$a);
    Code:
       0: aload_0
       1: aload_1
       2: putfield      #18                 // Field b:Landroid/support/design/widget/FloatingActionButton;
       5: aload_0
       6: aload_2
       7: putfield      #20                 // Field a:Landroid/support/design/widget/FloatingActionButton$a;
      10: aload_0
      11: invokespecial #23                 // Method java/lang/Object."<init>":()V
      14: return

  public void a();
    Code:
       0: aload_0
       1: getfield      #20                 // Field a:Landroid/support/design/widget/FloatingActionButton$a;
       4: aload_0
       5: getfield      #18                 // Field b:Landroid/support/design/widget/FloatingActionButton;
       8: invokevirtual #29                 // Method android/support/design/widget/FloatingActionButton$a.a:(Landroid/support/design/widget/FloatingActionButton;)V
      11: return

  public void b();
    Code:
       0: aload_0
       1: getfield      #20                 // Field a:Landroid/support/design/widget/FloatingActionButton$a;
       4: aload_0
       5: getfield      #18                 // Field b:Landroid/support/design/widget/FloatingActionButton;
       8: invokevirtual #31                 // Method android/support/design/widget/FloatingActionButton$a.b:(Landroid/support/design/widget/FloatingActionButton;)V
      11: return
}
