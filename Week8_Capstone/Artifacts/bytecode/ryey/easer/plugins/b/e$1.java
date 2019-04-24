class ryey.easer.plugins.b.e$1 implements android.content.DialogInterface$OnClickListener {
  final ryey.easer.plugins.b.e a;

  ryey.easer.plugins.b.e$1(ryey.easer.plugins.b.e);
    Code:
       0: aload_0
       1: aload_1
       2: putfield      #16                 // Field a:Lryey/easer/plugins/b/e;
       5: aload_0
       6: invokespecial #19                 // Method java/lang/Object."<init>":()V
       9: return

  public void onClick(android.content.DialogInterface, int);
    Code:
       0: aload_0
       1: getfield      #16                 // Field a:Lryey/easer/plugins/b/e;
       4: invokevirtual #26                 // Method ryey/easer/plugins/b/e.getTargetFragment:()Landroid/support/v4/app/i;
       7: checkcast     #28                 // class ryey/easer/plugins/b/e$c
      10: aload_0
      11: getfield      #16                 // Field a:Lryey/easer/plugins/b/e;
      14: invokestatic  #31                 // Method ryey/easer/plugins/b/e.a:(Lryey/easer/plugins/b/e;)Ljava/util/List;
      17: invokeinterface #34,  2           // InterfaceMethod ryey/easer/plugins/b/e$c.a:(Ljava/util/List;)V
      22: aload_0
      23: getfield      #16                 // Field a:Lryey/easer/plugins/b/e;
      26: invokevirtual #36                 // Method ryey/easer/plugins/b/e.a:()V
      29: return
}
