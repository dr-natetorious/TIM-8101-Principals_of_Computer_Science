class ryey.easer.plugins.a.b.d$3$1 implements android.content.DialogInterface$OnClickListener {
  final ryey.easer.plugins.a.b.d$3 a;

  ryey.easer.plugins.a.b.d$3$1(ryey.easer.plugins.a.b.d$3);
    Code:
       0: aload_0
       1: aload_1
       2: putfield      #17                 // Field a:Lryey/easer/plugins/a/b/d$3;
       5: aload_0
       6: invokespecial #20                 // Method java/lang/Object."<init>":()V
       9: return

  public void onClick(android.content.DialogInterface, int);
    Code:
       0: aload_0
       1: getfield      #17                 // Field a:Lryey/easer/plugins/a/b/d$3;
       4: getfield      #25                 // Field ryey/easer/plugins/a/b/d$3.a:Lryey/easer/plugins/a/b/d;
       7: invokevirtual #31                 // Method ryey/easer/plugins/a/b/d.getContext:()Landroid/content/Context;
      10: aload_0
      11: getfield      #17                 // Field a:Lryey/easer/plugins/a/b/d$3;
      14: getfield      #25                 // Field ryey/easer/plugins/a/b/d$3.a:Lryey/easer/plugins/a/b/d;
      17: invokestatic  #34                 // Method ryey/easer/plugins/a/b/d.a:(Lryey/easer/plugins/a/b/d;)Landroid/content/BroadcastReceiver;
      20: invokevirtual #40                 // Method android/content/Context.unregisterReceiver:(Landroid/content/BroadcastReceiver;)V
      23: aload_1
      24: invokeinterface #45,  1           // InterfaceMethod android/content/DialogInterface.dismiss:()V
      29: return
}
