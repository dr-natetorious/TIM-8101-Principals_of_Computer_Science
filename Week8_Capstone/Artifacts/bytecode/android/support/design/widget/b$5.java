class android.support.design.widget.b$5 implements android.support.design.widget.SwipeDismissBehavior$a {
  final android.support.design.widget.b a;

  android.support.design.widget.b$5(android.support.design.widget.b);
    Code:
       0: aload_0
       1: aload_1
       2: putfield      #17                 // Field a:Landroid/support/design/widget/b;
       5: aload_0
       6: invokespecial #19                 // Method java/lang/Object."<init>":()V
       9: return

  public void a(int);
    Code:
       0: iload_1
       1: tableswitch   { // 0 to 2
                     0: 43
                     1: 29
                     2: 29
               default: 28
          }
      28: return
      29: invokestatic  #26                 // Method android/support/design/widget/k.a:()Landroid/support/design/widget/k;
      32: aload_0
      33: getfield      #17                 // Field a:Landroid/support/design/widget/b;
      36: getfield      #30                 // Field android/support/design/widget/b.c:Landroid/support/design/widget/k$a;
      39: invokevirtual #33                 // Method android/support/design/widget/k.c:(Landroid/support/design/widget/k$a;)V
      42: return
      43: invokestatic  #26                 // Method android/support/design/widget/k.a:()Landroid/support/design/widget/k;
      46: aload_0
      47: getfield      #17                 // Field a:Landroid/support/design/widget/b;
      50: getfield      #30                 // Field android/support/design/widget/b.c:Landroid/support/design/widget/k$a;
      53: invokevirtual #36                 // Method android/support/design/widget/k.d:(Landroid/support/design/widget/k$a;)V
      56: return

  public void a(android.view.View);
    Code:
       0: aload_1
       1: bipush        8
       3: invokevirtual #42                 // Method android/view/View.setVisibility:(I)V
       6: aload_0
       7: getfield      #17                 // Field a:Landroid/support/design/widget/b;
      10: iconst_0
      11: invokevirtual #44                 // Method android/support/design/widget/b.a:(I)V
      14: return
}
