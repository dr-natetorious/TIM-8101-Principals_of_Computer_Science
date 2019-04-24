public class ryey.easer.plugins.operation.j.a extends ryey.easer.plugins.operation.c<ryey.easer.plugins.operation.j.b> {
  ryey.easer.plugins.operation.j.a(android.content.Context);
    Code:
       0: aload_0
       1: aload_1
       2: invokespecial #9                  // Method ryey/easer/plugins/operation/c."<init>":(Landroid/content/Context;)V
       5: return

  public boolean a(ryey.easer.commons.local_plugin.c.b);
    Code:
       0: aload_0
       1: aload_1
       2: checkcast     #14                 // class ryey/easer/plugins/operation/j/b
       5: invokevirtual #17                 // Method a:(Lryey/easer/plugins/operation/j/b;)Z
       8: ireturn

  public boolean a(ryey.easer.plugins.operation.j.b);
    Code:
       0: new           #21                 // class android/media/MediaPlayer
       3: dup
       4: invokespecial #24                 // Method android/media/MediaPlayer."<init>":()V
       7: astore_2
       8: aload_2
       9: aload_1
      10: getfield      #27                 // Field ryey/easer/plugins/operation/j/b.a:Ljava/lang/String;
      13: invokevirtual #31                 // Method android/media/MediaPlayer.setDataSource:(Ljava/lang/String;)V
      16: aload_2
      17: invokevirtual #34                 // Method android/media/MediaPlayer.prepare:()V
      20: aload_2
      21: invokevirtual #37                 // Method android/media/MediaPlayer.start:()V
      24: iconst_1
      25: ireturn
      26: astore_1
      27: aload_1
      28: invokestatic  #42                 // Method com/google/a/a/a/a/a/a.a:(Ljava/lang/Throwable;)V
      31: iconst_0
      32: ireturn
    Exception table:
       from    to  target type
           8    24    26   Class java/io/IOException
}
