public class ryey.easer.plugins.operation.ringer_mode.b extends ryey.easer.plugins.operation.c<ryey.easer.plugins.operation.ringer_mode.c> {
  public ryey.easer.plugins.operation.ringer_mode.b(android.content.Context);
    Code:
       0: aload_0
       1: aload_1
       2: invokespecial #11                 // Method ryey/easer/plugins/operation/c."<init>":(Landroid/content/Context;)V
       5: return

  public boolean a(ryey.easer.commons.local_plugin.c.b);
    Code:
       0: aload_0
       1: aload_1
       2: checkcast     #90                 // class ryey/easer/plugins/operation/ringer_mode/c
       5: invokevirtual #93                 // Method a:(Lryey/easer/plugins/operation/ringer_mode/c;)Z
       8: ireturn

  public boolean a(ryey.easer.plugins.operation.ringer_mode.c);
    Code:
       0: aload_1
       1: getfield      #95                 // Field ryey/easer/plugins/operation/ringer_mode/c.a:Lryey/easer/plugins/operation/ringer_mode/a;
       4: invokestatic  #98                 // Method ryey/easer/plugins/operation/ringer_mode/a.a:(Lryey/easer/plugins/operation/ringer_mode/a;)Lryey/easer/plugins/operation/ringer_mode/a;
       7: astore_1
       8: aload_0
       9: getfield      #75                 // Field a:Landroid/content/Context;
      12: ldc           #100                // String audio
      14: invokevirtual #106                // Method android/content/Context.getSystemService:(Ljava/lang/String;)Ljava/lang/Object;
      17: checkcast     #35                 // class android/media/AudioManager
      20: astore_2
      21: getstatic     #69                 // Field android/os/Build$VERSION.SDK_INT:I
      24: bipush        21
      26: if_icmplt     58
      29: aload_1
      30: getstatic     #108                // Field ryey/easer/plugins/operation/ringer_mode/a.b:Lryey/easer/plugins/operation/ringer_mode/a;
      33: if_acmpeq     52
      36: aload_1
      37: getstatic     #109                // Field ryey/easer/plugins/operation/ringer_mode/a.a:Lryey/easer/plugins/operation/ringer_mode/a;
      40: if_acmpne     46
      43: goto          52
      46: aload_0
      47: aload_1
      48: invokespecial #111                // Method a:(Lryey/easer/plugins/operation/ringer_mode/a;)Z
      51: ireturn
      52: aload_2
      53: aload_1
      54: invokestatic  #113                // Method a:(Landroid/media/AudioManager;Lryey/easer/plugins/operation/ringer_mode/a;)Z
      57: ireturn
      58: aload_2
      59: aload_1
      60: invokestatic  #113                // Method a:(Landroid/media/AudioManager;Lryey/easer/plugins/operation/ringer_mode/a;)Z
      63: ireturn
}
