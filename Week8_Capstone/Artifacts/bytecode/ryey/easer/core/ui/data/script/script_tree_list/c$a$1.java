class ryey.easer.core.ui.data.script.script_tree_list.c$a$1 implements android.view.View$OnLongClickListener {
  final ryey.easer.core.ui.data.script.script_tree_list.a a;

  final ryey.easer.core.ui.data.script.script_tree_list.c$a b;

  ryey.easer.core.ui.data.script.script_tree_list.c$a$1(ryey.easer.core.ui.data.script.script_tree_list.c$a, ryey.easer.core.ui.data.script.script_tree_list.a);
    Code:
       0: aload_0
       1: aload_1
       2: putfield      #20                 // Field b:Lryey/easer/core/ui/data/script/script_tree_list/c$a;
       5: aload_0
       6: aload_2
       7: putfield      #22                 // Field a:Lryey/easer/core/ui/data/script/script_tree_list/a;
      10: aload_0
      11: invokespecial #25                 // Method java/lang/Object."<init>":()V
      14: return

  public boolean onLongClick(android.view.View);
    Code:
       0: aload_0
       1: getfield      #20                 // Field b:Lryey/easer/core/ui/data/script/script_tree_list/c$a;
       4: getfield      #31                 // Field ryey/easer/core/ui/data/script/script_tree_list/c$a.a:Ljava/lang/ref/WeakReference;
       7: invokevirtual #37                 // Method java/lang/ref/WeakReference.get:()Ljava/lang/Object;
      10: checkcast     #13                 // class ryey/easer/core/ui/data/script/script_tree_list/c
      13: getfield      #40                 // Field ryey/easer/core/ui/data/script/script_tree_list/c.a:Lryey/easer/core/ui/data/script/script_tree_list/c$c;
      16: ifnull        45
      19: aload_0
      20: getfield      #20                 // Field b:Lryey/easer/core/ui/data/script/script_tree_list/c$a;
      23: getfield      #31                 // Field ryey/easer/core/ui/data/script/script_tree_list/c$a.a:Ljava/lang/ref/WeakReference;
      26: invokevirtual #37                 // Method java/lang/ref/WeakReference.get:()Ljava/lang/Object;
      29: checkcast     #13                 // class ryey/easer/core/ui/data/script/script_tree_list/c
      32: getfield      #40                 // Field ryey/easer/core/ui/data/script/script_tree_list/c.a:Lryey/easer/core/ui/data/script/script_tree_list/c$c;
      35: aload_1
      36: aload_0
      37: getfield      #22                 // Field a:Lryey/easer/core/ui/data/script/script_tree_list/a;
      40: invokeinterface #45,  3           // InterfaceMethod ryey/easer/core/ui/data/script/script_tree_list/c$c.a:(Landroid/view/View;Lryey/easer/core/ui/data/script/script_tree_list/a;)V
      45: iconst_1
      46: ireturn
}
