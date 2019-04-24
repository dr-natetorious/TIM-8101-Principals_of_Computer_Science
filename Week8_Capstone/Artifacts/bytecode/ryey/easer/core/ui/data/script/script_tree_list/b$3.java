class ryey.easer.core.ui.data.script.script_tree_list.b$3 implements b.a.a.c$a {
  final ryey.easer.core.ui.data.script.script_tree_list.b a;

  ryey.easer.core.ui.data.script.script_tree_list.b$3(ryey.easer.core.ui.data.script.script_tree_list.b);
    Code:
       0: aload_0
       1: aload_1
       2: putfield      #17                 // Field a:Lryey/easer/core/ui/data/script/script_tree_list/b;
       5: aload_0
       6: invokespecial #20                 // Method java/lang/Object."<init>":()V
       9: return

  public void a(boolean, android.support.v7.widget.RecyclerView$x);
    Code:
       0: aload_2
       1: checkcast     #24                 // class ryey/easer/core/ui/data/script/script_tree_list/c$b
       4: astore_2
       5: iload_1
       6: ifeq          15
       9: bipush        90
      11: istore_3
      12: goto          18
      15: bipush        -90
      17: istore_3
      18: aload_2
      19: getfield      #28                 // Field ryey/easer/core/ui/data/script/script_tree_list/c$b.o:Landroid/widget/ImageView;
      22: invokevirtual #34                 // Method android/widget/ImageView.animate:()Landroid/view/ViewPropertyAnimator;
      25: iload_3
      26: i2f
      27: invokevirtual #40                 // Method android/view/ViewPropertyAnimator.rotationBy:(F)Landroid/view/ViewPropertyAnimator;
      30: invokevirtual #43                 // Method android/view/ViewPropertyAnimator.start:()V
      33: return

  public boolean a(b.a.a.b, android.support.v7.widget.RecyclerView$x);
    Code:
       0: aload_1
       1: invokevirtual #50                 // Method b/a/a/b.c:()Z
       4: ifne          18
       7: aload_0
       8: aload_1
       9: invokevirtual #53                 // Method b/a/a/b.g:()Z
      12: iconst_1
      13: ixor
      14: aload_2
      15: invokevirtual #55                 // Method a:(ZLandroid/support/v7/widget/RecyclerView$x;)V
      18: iconst_0
      19: ireturn
}
