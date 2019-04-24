public class ryey.easer.plugins.operation.o.a extends ryey.easer.plugins.operation.c<ryey.easer.plugins.operation.o.b> {
  public ryey.easer.plugins.operation.o.a(android.content.Context);
    Code:
       0: aload_0
       1: aload_1
       2: invokespecial #9                  // Method ryey/easer/plugins/operation/c."<init>":(Landroid/content/Context;)V
       5: return

  public boolean a(ryey.easer.commons.local_plugin.c.b);
    Code:
       0: aload_0
       1: aload_1
       2: checkcast     #14                 // class ryey/easer/plugins/operation/o/b
       5: invokevirtual #17                 // Method a:(Lryey/easer/plugins/operation/o/b;)Z
       8: ireturn

  public boolean a(ryey.easer.plugins.operation.o.b);
    Code:
       0: aload_1
       1: invokevirtual #21                 // Method ryey/easer/plugins/operation/o/b.c:()Ljava/lang/Boolean;
       4: invokevirtual #27                 // Method java/lang/Boolean.booleanValue:()Z
       7: invokestatic  #33                 // Method android/content/ContentResolver.setMasterSyncAutomatically:(Z)V
      10: iconst_1
      11: ireturn
}
