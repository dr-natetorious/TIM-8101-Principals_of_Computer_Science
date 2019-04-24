public class ryey.easer.plugins.operation.f.a extends ryey.easer.plugins.operation.c<ryey.easer.plugins.operation.f.b> {
  public ryey.easer.plugins.operation.f.a(android.content.Context);
    Code:
       0: aload_0
       1: aload_1
       2: invokespecial #9                  // Method ryey/easer/plugins/operation/c."<init>":(Landroid/content/Context;)V
       5: return

  public boolean a(ryey.easer.commons.local_plugin.c.b);
    Code:
       0: aload_0
       1: aload_1
       2: checkcast     #14                 // class ryey/easer/plugins/operation/f/b
       5: invokevirtual #17                 // Method a:(Lryey/easer/plugins/operation/f/b;)Z
       8: ireturn

  public boolean a(ryey.easer.plugins.operation.f.b);
    Code:
       0: aload_1
       1: invokevirtual #23                 // Method ryey/easer/plugins/operation/f/b.c:()Ljava/lang/String;
       4: ldc           #25                 // String \n
       6: invokevirtual #31                 // Method java/lang/String.split:(Ljava/lang/String;)[Ljava/lang/String;
       9: astore_1
      10: aload_0
      11: getfield      #34                 // Field a:Landroid/content/Context;
      14: invokestatic  #39                 // Method ryey/easer/plugins/b/d.a:(Landroid/content/Context;)Z
      17: ifeq          28
      20: aload_1
      21: invokestatic  #42                 // Method ryey/easer/plugins/b/d.a:([Ljava/lang/String;)Ljava/lang/Process;
      24: pop
      25: goto          33
      28: aload_1
      29: invokestatic  #45                 // Method ryey/easer/plugins/b/d.b:([Ljava/lang/String;)Ljava/lang/Process;
      32: pop
      33: iconst_1
      34: ireturn
      35: astore_1
      36: aload_1
      37: ldc           #47                 // String error while launching process
      39: iconst_0
      40: anewarray     #49                 // class java/lang/Object
      43: invokestatic  #54                 // Method com/b/a/i.a:(Ljava/lang/Throwable;Ljava/lang/String;[Ljava/lang/Object;)V
      46: aload_1
      47: invokestatic  #59                 // Method com/google/a/a/a/a/a/a.a:(Ljava/lang/Throwable;)V
      50: iconst_0
      51: ireturn
    Exception table:
       from    to  target type
          10    25    35   Class java/io/IOException
          28    33    35   Class java/io/IOException
}
