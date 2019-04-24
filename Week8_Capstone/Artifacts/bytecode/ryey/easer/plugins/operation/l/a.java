public class ryey.easer.plugins.operation.l.a extends ryey.easer.plugins.operation.c<ryey.easer.plugins.operation.l.b> {
  static {};
    Code:
       0: getstatic     #14                 // Field android/os/Build$VERSION.SDK_INT:I
       3: bipush        21
       5: if_icmplt     17
       8: invokestatic  #20                 // Method java/util/concurrent/ThreadLocalRandom.current:()Ljava/util/concurrent/ThreadLocalRandom;
      11: invokevirtual #24                 // Method java/util/concurrent/ThreadLocalRandom.nextInt:()I
      14: putstatic     #26                 // Field b:I
      17: return

  public ryey.easer.plugins.operation.l.a(android.content.Context);
    Code:
       0: aload_0
       1: aload_1
       2: invokespecial #31                 // Method ryey/easer/plugins/operation/c."<init>":(Landroid/content/Context;)V
       5: return

  public boolean a(ryey.easer.commons.local_plugin.c.b);
    Code:
       0: aload_0
       1: aload_1
       2: checkcast     #35                 // class ryey/easer/plugins/operation/l/b
       5: invokevirtual #38                 // Method a:(Lryey/easer/plugins/operation/l/b;)Z
       8: ireturn

  public boolean a(ryey.easer.plugins.operation.l.b);
    Code:
       0: aload_0
       1: getfield      #41                 // Field a:Landroid/content/Context;
       4: ldc           #43                 // String notification
       6: invokevirtual #49                 // Method android/content/Context.getSystemService:(Ljava/lang/String;)Ljava/lang/Object;
       9: checkcast     #51                 // class android/app/NotificationManager
      12: astore_2
      13: new           #53                 // class android/support/v4/app/ac$b
      16: dup
      17: aload_0
      18: getfield      #41                 // Field a:Landroid/content/Context;
      21: invokespecial #54                 // Method android/support/v4/app/ac$b."<init>":(Landroid/content/Context;)V
      24: astore_3
      25: aload_3
      26: ldc           #55                 // int 2131558400
      28: invokevirtual #58                 // Method android/support/v4/app/ac$b.a:(I)Landroid/support/v4/app/ac$b;
      31: pop
      32: aload_3
      33: aload_1
      34: getfield      #61                 // Field ryey/easer/plugins/operation/l/b.a:Ljava/lang/String;
      37: invokevirtual #64                 // Method android/support/v4/app/ac$b.a:(Ljava/lang/CharSequence;)Landroid/support/v4/app/ac$b;
      40: pop
      41: aload_3
      42: aload_1
      43: getfield      #66                 // Field ryey/easer/plugins/operation/l/b.b:Ljava/lang/String;
      46: invokevirtual #68                 // Method android/support/v4/app/ac$b.b:(Ljava/lang/CharSequence;)Landroid/support/v4/app/ac$b;
      49: pop
      50: aload_2
      51: getstatic     #26                 // Field b:I
      54: aload_3
      55: invokevirtual #71                 // Method android/support/v4/app/ac$b.a:()Landroid/app/Notification;
      58: invokevirtual #75                 // Method android/app/NotificationManager.notify:(ILandroid/app/Notification;)V
      61: getstatic     #26                 // Field b:I
      64: iconst_1
      65: iadd
      66: putstatic     #26                 // Field b:I
      69: iconst_1
      70: ireturn
}
