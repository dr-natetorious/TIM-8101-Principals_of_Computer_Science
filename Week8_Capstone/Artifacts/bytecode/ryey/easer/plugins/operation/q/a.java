public class ryey.easer.plugins.operation.q.a extends ryey.easer.plugins.operation.c<ryey.easer.plugins.operation.q.b> {
  ryey.easer.plugins.operation.q.a(android.content.Context);
    Code:
       0: aload_0
       1: aload_1
       2: invokespecial #9                  // Method ryey/easer/plugins/operation/c."<init>":(Landroid/content/Context;)V
       5: return

  public boolean a(ryey.easer.commons.local_plugin.c.b);
    Code:
       0: aload_0
       1: aload_1
       2: checkcast     #27                 // class ryey/easer/plugins/operation/q/b
       5: invokevirtual #30                 // Method a:(Lryey/easer/plugins/operation/q/b;)Z
       8: ireturn

  public boolean a(ryey.easer.plugins.operation.q.b);
    Code:
       0: aload_0
       1: getfield      #35                 // Field a:Landroid/content/Context;
       4: ldc           #37                 // String audio
       6: invokevirtual #43                 // Method android/content/Context.getSystemService:(Ljava/lang/String;)Ljava/lang/Object;
       9: checkcast     #20                 // class android/media/AudioManager
      12: astore_2
      13: aload_2
      14: iconst_2
      15: aload_1
      16: getfield      #46                 // Field ryey/easer/plugins/operation/q/b.a:Ljava/lang/Integer;
      19: invokestatic  #48                 // Method a:(Landroid/media/AudioManager;ILjava/lang/Integer;)V
      22: aload_2
      23: iconst_3
      24: aload_1
      25: getfield      #51                 // Field ryey/easer/plugins/operation/q/b.b:Ljava/lang/Integer;
      28: invokestatic  #48                 // Method a:(Landroid/media/AudioManager;ILjava/lang/Integer;)V
      31: aload_2
      32: iconst_4
      33: aload_1
      34: getfield      #54                 // Field ryey/easer/plugins/operation/q/b.c:Ljava/lang/Integer;
      37: invokestatic  #48                 // Method a:(Landroid/media/AudioManager;ILjava/lang/Integer;)V
      40: aload_2
      41: iconst_5
      42: aload_1
      43: getfield      #57                 // Field ryey/easer/plugins/operation/q/b.d:Ljava/lang/Integer;
      46: invokestatic  #48                 // Method a:(Landroid/media/AudioManager;ILjava/lang/Integer;)V
      49: aload_2
      50: bipush        6
      52: aload_1
      53: getfield      #60                 // Field ryey/easer/plugins/operation/q/b.e:Ljava/lang/Integer;
      56: invokestatic  #48                 // Method a:(Landroid/media/AudioManager;ILjava/lang/Integer;)V
      59: aload_1
      60: getfield      #63                 // Field ryey/easer/plugins/operation/q/b.f:Ljava/lang/Integer;
      63: ifnull        100
      66: aload_1
      67: getfield      #63                 // Field ryey/easer/plugins/operation/q/b.f:Ljava/lang/Integer;
      70: invokevirtual #18                 // Method java/lang/Integer.intValue:()I
      73: sipush        1000
      76: imul
      77: i2l
      78: invokestatic  #69                 // Method java/lang/Thread.sleep:(J)V
      81: aload_2
      82: iconst_3
      83: aload_1
      84: getfield      #60                 // Field ryey/easer/plugins/operation/q/b.e:Ljava/lang/Integer;
      87: invokestatic  #48                 // Method a:(Landroid/media/AudioManager;ILjava/lang/Integer;)V
      90: goto          100
      93: astore_1
      94: aload_1
      95: invokestatic  #74                 // Method com/google/a/a/a/a/a/a.a:(Ljava/lang/Throwable;)V
      98: iconst_0
      99: ireturn
     100: iconst_1
     101: ireturn
    Exception table:
       from    to  target type
          66    90    93   Class java/lang/InterruptedException
}
