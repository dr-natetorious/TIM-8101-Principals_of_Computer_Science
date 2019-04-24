public class ryey.easer.plugins.operation.a.a extends ryey.easer.plugins.operation.c<ryey.easer.plugins.operation.a.b> {
  public ryey.easer.plugins.operation.a.a(android.content.Context);
    Code:
       0: aload_0
       1: aload_1
       2: invokespecial #9                  // Method ryey/easer/plugins/operation/c."<init>":(Landroid/content/Context;)V
       5: return

  public boolean a(ryey.easer.commons.local_plugin.c.b);
    Code:
       0: aload_0
       1: aload_1
       2: checkcast     #54                 // class ryey/easer/plugins/operation/a/b
       5: invokevirtual #57                 // Method a:(Lryey/easer/plugins/operation/a/b;)Z
       8: ireturn

  public boolean a(ryey.easer.plugins.operation.a.b);
    Code:
       0: aload_1
       1: invokevirtual #61                 // Method ryey/easer/plugins/operation/a/b.c:()Ljava/lang/Boolean;
       4: astore_1
       5: aload_1
       6: invokevirtual #66                 // Method java/lang/Boolean.booleanValue:()Z
       9: aload_0
      10: invokespecial #68                 // Method a:()Z
      13: if_icmpne     18
      16: iconst_1
      17: ireturn
      18: getstatic     #18                 // Field android/os/Build$VERSION.SDK_INT:I
      21: bipush        16
      23: if_icmpgt     35
      26: aload_0
      27: aload_1
      28: invokevirtual #66                 // Method java/lang/Boolean.booleanValue:()Z
      31: invokespecial #70                 // Method a:(Z)Z
      34: ireturn
      35: aload_0
      36: aload_1
      37: invokevirtual #66                 // Method java/lang/Boolean.booleanValue:()Z
      40: invokespecial #72                 // Method b:(Z)Z
      43: ifeq          48
      46: iconst_1
      47: ireturn
      48: aload_0
      49: aload_1
      50: invokevirtual #66                 // Method java/lang/Boolean.booleanValue:()Z
      53: invokespecial #70                 // Method a:(Z)Z
      56: pop
      57: aload_0
      58: invokespecial #68                 // Method a:()Z
      61: ireturn
}
