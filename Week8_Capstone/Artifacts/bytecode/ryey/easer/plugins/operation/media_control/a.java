public class ryey.easer.plugins.operation.media_control.a extends ryey.easer.plugins.operation.c<ryey.easer.plugins.operation.media_control.b> {
  public ryey.easer.plugins.operation.media_control.a(android.content.Context);
    Code:
       0: aload_0
       1: aload_1
       2: invokespecial #11                 // Method ryey/easer/plugins/operation/c."<init>":(Landroid/content/Context;)V
       5: return

  public boolean a(ryey.easer.commons.local_plugin.c.b);
    Code:
       0: aload_0
       1: aload_1
       2: checkcast     #60                 // class ryey/easer/plugins/operation/media_control/b
       5: invokevirtual #114                // Method a:(Lryey/easer/plugins/operation/media_control/b;)Z
       8: ireturn

  public boolean a(ryey.easer.plugins.operation.media_control.b);
    Code:
       0: getstatic     #120                // Field android/os/Build$VERSION.SDK_INT:I
       3: bipush        21
       5: if_icmplt     14
       8: aload_0
       9: aload_1
      10: invokespecial #122                // Method c:(Lryey/easer/plugins/operation/media_control/b;)Z
      13: ireturn
      14: aload_0
      15: aload_1
      16: invokespecial #124                // Method b:(Lryey/easer/plugins/operation/media_control/b;)Z
      19: ireturn
}
