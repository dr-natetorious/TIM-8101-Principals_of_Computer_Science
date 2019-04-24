class android.support.v7.widget.d$d$1 extends android.support.v7.widget.as {
  final android.support.v7.widget.d a;

  final android.support.v7.widget.d$d b;

  android.support.v7.widget.d$d$1(android.support.v7.widget.d$d, android.view.View, android.support.v7.widget.d);
    Code:
       0: aload_0
       1: aload_1
       2: putfield      #19                 // Field b:Landroid/support/v7/widget/d$d;
       5: aload_0
       6: aload_3
       7: putfield      #21                 // Field a:Landroid/support/v7/widget/d;
      10: aload_0
      11: aload_2
      12: invokespecial #24                 // Method android/support/v7/widget/as."<init>":(Landroid/view/View;)V
      15: return

  public android.support.v7.view.menu.s a();
    Code:
       0: aload_0
       1: getfield      #19                 // Field b:Landroid/support/v7/widget/d$d;
       4: getfield      #27                 // Field android/support/v7/widget/d$d.a:Landroid/support/v7/widget/d;
       7: getfield      #31                 // Field android/support/v7/widget/d.h:Landroid/support/v7/widget/d$e;
      10: ifnonnull     15
      13: aconst_null
      14: areturn
      15: aload_0
      16: getfield      #19                 // Field b:Landroid/support/v7/widget/d$d;
      19: getfield      #27                 // Field android/support/v7/widget/d$d.a:Landroid/support/v7/widget/d;
      22: getfield      #31                 // Field android/support/v7/widget/d.h:Landroid/support/v7/widget/d$e;
      25: invokevirtual #36                 // Method android/support/v7/widget/d$e.b:()Landroid/support/v7/view/menu/m;
      28: areturn

  public boolean b();
    Code:
       0: aload_0
       1: getfield      #19                 // Field b:Landroid/support/v7/widget/d$d;
       4: getfield      #27                 // Field android/support/v7/widget/d$d.a:Landroid/support/v7/widget/d;
       7: invokevirtual #40                 // Method android/support/v7/widget/d.f:()Z
      10: pop
      11: iconst_1
      12: ireturn

  public boolean c();
    Code:
       0: aload_0
       1: getfield      #19                 // Field b:Landroid/support/v7/widget/d$d;
       4: getfield      #27                 // Field android/support/v7/widget/d$d.a:Landroid/support/v7/widget/d;
       7: getfield      #45                 // Field android/support/v7/widget/d.j:Landroid/support/v7/widget/d$c;
      10: ifnull        15
      13: iconst_0
      14: ireturn
      15: aload_0
      16: getfield      #19                 // Field b:Landroid/support/v7/widget/d$d;
      19: getfield      #27                 // Field android/support/v7/widget/d$d.a:Landroid/support/v7/widget/d;
      22: invokevirtual #48                 // Method android/support/v7/widget/d.g:()Z
      25: pop
      26: iconst_1
      27: ireturn
}
