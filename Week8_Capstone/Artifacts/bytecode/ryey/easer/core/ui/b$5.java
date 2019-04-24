class ryey.easer.core.ui.b$5 implements android.view.View$OnClickListener {
  final ryey.easer.core.ui.b a;

  ryey.easer.core.ui.b$5(ryey.easer.core.ui.b);
    Code:
       0: aload_0
       1: aload_1
       2: putfield      #17                 // Field a:Lryey/easer/core/ui/b;
       5: aload_0
       6: invokespecial #20                 // Method java/lang/Object."<init>":()V
       9: return

  public void onClick(android.view.View);
    Code:
       0: aload_0
       1: getfield      #17                 // Field a:Lryey/easer/core/ui/b;
       4: invokevirtual #27                 // Method ryey/easer/core/ui/b.getActivity:()Landroid/support/v4/app/j;
       7: invokestatic  #33                 // Method ryey/easer/core/EHService.c:(Landroid/content/Context;)V
      10: return
}
