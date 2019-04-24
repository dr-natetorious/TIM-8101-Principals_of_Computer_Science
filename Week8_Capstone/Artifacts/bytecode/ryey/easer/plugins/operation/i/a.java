public class ryey.easer.plugins.operation.i.a extends ryey.easer.plugins.operation.c<ryey.easer.plugins.operation.i.b> {
  public ryey.easer.plugins.operation.i.a(android.content.Context);
    Code:
       0: aload_0
       1: aload_1
       2: invokespecial #14                 // Method ryey/easer/plugins/operation/c."<init>":(Landroid/content/Context;)V
       5: return

  public boolean a(ryey.easer.commons.local_plugin.c.b);
    Code:
       0: aload_0
       1: aload_1
       2: checkcast     #18                 // class ryey/easer/plugins/operation/i/b
       5: invokevirtual #21                 // Method a:(Lryey/easer/plugins/operation/i/b;)Z
       8: ireturn

  public boolean a(ryey.easer.plugins.operation.i.b);
    Code:
       0: new           #9                  // class ryey/easer/plugins/operation/i/a$a
       3: dup
       4: aconst_null
       5: invokespecial #24                 // Method ryey/easer/plugins/operation/i/a$a."<init>":(Lryey/easer/plugins/operation/i/a$1;)V
       8: iconst_1
       9: anewarray     #18                 // class ryey/easer/plugins/operation/i/b
      12: dup
      13: iconst_0
      14: aload_1
      15: aastore
      16: invokevirtual #28                 // Method ryey/easer/plugins/operation/i/a$a.execute:([Ljava/lang/Object;)Landroid/os/AsyncTask;
      19: pop
      20: iconst_1
      21: ireturn
}
