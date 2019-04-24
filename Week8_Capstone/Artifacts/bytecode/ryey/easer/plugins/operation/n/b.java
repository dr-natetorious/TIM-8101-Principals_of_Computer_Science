public class ryey.easer.plugins.operation.n.b extends ryey.easer.plugins.operation.c<ryey.easer.plugins.operation.n.c> {
  ryey.easer.plugins.operation.n.b(android.content.Context);
    Code:
       0: aload_0
       1: aload_1
       2: invokespecial #15                 // Method ryey/easer/plugins/operation/c."<init>":(Landroid/content/Context;)V
       5: aload_0
       6: new           #7                  // class ryey/easer/plugins/operation/n/b$1
       9: dup
      10: aload_0
      11: invokespecial #18                 // Method ryey/easer/plugins/operation/n/b$1."<init>":(Lryey/easer/plugins/operation/n/b;)V
      14: putfield      #20                 // Field c:Landroid/content/ServiceConnection;
      17: return

  static ryey.easer.plugins.operation.n.c a(ryey.easer.plugins.operation.n.b);
    Code:
       0: aload_0
       1: getfield      #25                 // Field b:Lryey/easer/plugins/operation/n/c;
       4: areturn

  static android.content.Context b(ryey.easer.plugins.operation.n.b);
    Code:
       0: aload_0
       1: getfield      #29                 // Field a:Landroid/content/Context;
       4: areturn

  public boolean a(ryey.easer.commons.local_plugin.c.b);
    Code:
       0: aload_0
       1: aload_1
       2: checkcast     #32                 // class ryey/easer/plugins/operation/n/c
       5: invokevirtual #35                 // Method a:(Lryey/easer/plugins/operation/n/c;)Z
       8: ireturn

  public boolean a(ryey.easer.plugins.operation.n.c);
    Code:
       0: aload_0
       1: aload_1
       2: putfield      #25                 // Field b:Lryey/easer/plugins/operation/n/c;
       5: new           #37                 // class android/content/Intent
       8: dup
       9: aload_0
      10: getfield      #29                 // Field a:Landroid/content/Context;
      13: ldc           #39                 // class ryey/easer/core/EHService
      15: invokespecial #42                 // Method android/content/Intent."<init>":(Landroid/content/Context;Ljava/lang/Class;)V
      18: astore_1
      19: aload_0
      20: getfield      #29                 // Field a:Landroid/content/Context;
      23: aload_1
      24: aload_0
      25: getfield      #20                 // Field c:Landroid/content/ServiceConnection;
      28: iconst_1
      29: invokevirtual #48                 // Method android/content/Context.bindService:(Landroid/content/Intent;Landroid/content/ServiceConnection;I)Z
      32: pop
      33: iconst_1
      34: ireturn
}
