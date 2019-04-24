class ryey.easer.plugins.event.c.a$1 extends android.content.BroadcastReceiver {
  final ryey.easer.plugins.event.c.a a;

  ryey.easer.plugins.event.c.a$1(ryey.easer.plugins.event.c.a);
    Code:
       0: aload_0
       1: aload_1
       2: putfield      #12                 // Field a:Lryey/easer/plugins/event/c/a;
       5: aload_0
       6: invokespecial #15                 // Method android/content/BroadcastReceiver."<init>":()V
       9: return

  public void onReceive(android.content.Context, android.content.Intent);
    Code:
       0: aload_0
       1: getfield      #12                 // Field a:Lryey/easer/plugins/event/c/a;
       4: iconst_1
       5: aload_2
       6: invokestatic  #21                 // Method ryey/easer/plugins/event/c/a.a:(Landroid/content/Intent;)Landroid/os/Bundle;
       9: invokestatic  #24                 // Method ryey/easer/plugins/event/c/a.a:(Lryey/easer/plugins/event/c/a;ZLandroid/os/Bundle;)V
      12: return
}
