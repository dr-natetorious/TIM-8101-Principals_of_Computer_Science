class ryey.easer.plugins.operation.g.b extends ryey.easer.plugins.operation.c<ryey.easer.plugins.operation.g.c> {
  public ryey.easer.plugins.operation.g.b(android.content.Context);
    Code:
       0: aload_0
       1: aload_1
       2: invokespecial #11                 // Method ryey/easer/plugins/operation/c."<init>":(Landroid/content/Context;)V
       5: aload_0
       6: aload_1
       7: invokestatic  #17                 // Method ryey/easer/plugins/operation/g/a.a:(Landroid/content/Context;)Lryey/easer/plugins/operation/g/a;
      10: putfield      #19                 // Field b:Lryey/easer/plugins/operation/g/a;
      13: return

  public boolean a(ryey.easer.commons.local_plugin.c.b);
    Code:
       0: aload_0
       1: aload_1
       2: checkcast     #23                 // class ryey/easer/plugins/operation/g/c
       5: invokevirtual #26                 // Method a:(Lryey/easer/plugins/operation/g/c;)Z
       8: ireturn

  public boolean a(ryey.easer.plugins.operation.g.c);
    Code:
       0: aload_1
       1: invokevirtual #32                 // Method ryey/easer/plugins/operation/g/c.c:()Ljava/lang/Boolean;
       4: astore_1
       5: aload_0
       6: getfield      #19                 // Field b:Lryey/easer/plugins/operation/g/a;
       9: invokevirtual #35                 // Method ryey/easer/plugins/operation/g/a.c:()Z
      12: aload_1
      13: invokevirtual #40                 // Method java/lang/Boolean.booleanValue:()Z
      16: if_icmpne     21
      19: iconst_1
      20: ireturn
      21: aload_1
      22: invokevirtual #40                 // Method java/lang/Boolean.booleanValue:()Z
      25: ifeq          36
      28: aload_0
      29: getfield      #19                 // Field b:Lryey/easer/plugins/operation/g/a;
      32: invokevirtual #42                 // Method ryey/easer/plugins/operation/g/a.a:()Z
      35: ireturn
      36: aload_0
      37: getfield      #19                 // Field b:Lryey/easer/plugins/operation/g/a;
      40: invokevirtual #44                 // Method ryey/easer/plugins/operation/g/a.b:()Z
      43: istore_2
      44: iload_2
      45: ireturn
      46: astore_1
      47: aload_1
      48: ldc           #46                 // String error while changing hotspot state
      50: iconst_0
      51: anewarray     #48                 // class java/lang/Object
      54: invokestatic  #53                 // Method com/b/a/i.a:(Ljava/lang/Throwable;Ljava/lang/String;[Ljava/lang/Object;)V
      57: aload_1
      58: invokestatic  #58                 // Method com/google/a/a/a/a/a/a.a:(Ljava/lang/Throwable;)V
      61: iconst_0
      62: ireturn
    Exception table:
       from    to  target type
           5    19    46   Class java/lang/Exception
          21    36    46   Class java/lang/Exception
          36    44    46   Class java/lang/Exception
}
