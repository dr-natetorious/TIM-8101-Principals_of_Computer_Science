class ryey.easer.core.ui.data.script.script_tree_list.b$1 implements android.view.View$OnCreateContextMenuListener {
  final ryey.easer.core.ui.data.script.script_tree_list.b a;

  ryey.easer.core.ui.data.script.script_tree_list.b$1(ryey.easer.core.ui.data.script.script_tree_list.b);
    Code:
       0: aload_0
       1: aload_1
       2: putfield      #17                 // Field a:Lryey/easer/core/ui/data/script/script_tree_list/b;
       5: aload_0
       6: invokespecial #20                 // Method java/lang/Object."<init>":()V
       9: return

  public void onCreateContextMenu(android.view.ContextMenu, android.view.View, android.view.ContextMenu$ContextMenuInfo);
    Code:
       0: aload_0
       1: getfield      #17                 // Field a:Lryey/easer/core/ui/data/script/script_tree_list/b;
       4: invokevirtual #27                 // Method ryey/easer/core/ui/data/script/script_tree_list/b.getActivity:()Landroid/support/v4/app/j;
       7: invokevirtual #33                 // Method android/support/v4/app/j.getMenuInflater:()Landroid/view/MenuInflater;
      10: ldc           #34                 // int 2131492868
      12: aload_1
      13: invokevirtual #40                 // Method android/view/MenuInflater.inflate:(ILandroid/view/Menu;)V
      16: return
}
