class ryey.easer.core.ui.b$3 implements android.view.View$OnLongClickListener {
  final ryey.easer.core.ui.b a;

  ryey.easer.core.ui.b$3(ryey.easer.core.ui.b);
    Code:
       0: aload_0
       1: aload_1
       2: putfield      #17                 // Field a:Lryey/easer/core/ui/b;
       5: aload_0
       6: invokespecial #20                 // Method java/lang/Object."<init>":()V
       9: return

  public boolean onLongClick(android.view.View);
    Code:
       0: invokestatic  #28                 // Method ryey/easer/core/EHService.a:()Z
       3: ifeq          18
       6: aload_0
       7: getfield      #17                 // Field a:Lryey/easer/core/ui/b;
      10: invokevirtual #32                 // Method ryey/easer/core/ui/b.getContext:()Landroid/content/Context;
      13: invokestatic  #36                 // Method ryey/easer/core/EHService.b:(Landroid/content/Context;)V
      16: iconst_1
      17: ireturn
      18: iconst_0
      19: ireturn
}
