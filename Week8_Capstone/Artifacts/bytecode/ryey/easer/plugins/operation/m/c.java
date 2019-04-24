public class ryey.easer.plugins.operation.m.c extends ryey.easer.plugins.operation.c<ryey.easer.plugins.operation.m.d> {
  public ryey.easer.plugins.operation.m.c(android.content.Context);
    Code:
       0: aload_0
       1: aload_1
       2: invokespecial #9                  // Method ryey/easer/plugins/operation/c."<init>":(Landroid/content/Context;)V
       5: return

  public boolean a(ryey.easer.commons.local_plugin.c.b);
    Code:
       0: aload_0
       1: aload_1
       2: checkcast     #14                 // class ryey/easer/plugins/operation/m/d
       5: invokevirtual #17                 // Method a:(Lryey/easer/plugins/operation/m/d;)Z
       8: ireturn

  public boolean a(ryey.easer.plugins.operation.m.d);
    Code:
       0: aload_1
       1: getfield      #20                 // Field ryey/easer/plugins/operation/m/d.a:Ljava/lang/String;
       4: astore_2
       5: aload_1
       6: getfield      #23                 // Field ryey/easer/plugins/operation/m/d.b:Ljava/lang/String;
       9: astore_1
      10: invokestatic  #29                 // Method android/telephony/SmsManager.getDefault:()Landroid/telephony/SmsManager;
      13: astore_3
      14: aload_3
      15: ifnonnull     20
      18: iconst_0
      19: ireturn
      20: aload_3
      21: aload_2
      22: aconst_null
      23: aload_1
      24: aconst_null
      25: aconst_null
      26: invokevirtual #33                 // Method android/telephony/SmsManager.sendTextMessage:(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Landroid/app/PendingIntent;Landroid/app/PendingIntent;)V
      29: iconst_1
      30: ireturn
}
