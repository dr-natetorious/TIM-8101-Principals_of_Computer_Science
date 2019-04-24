public class ryey.easer.plugins.operation.h.a extends ryey.easer.plugins.operation.c<ryey.easer.plugins.operation.h.b> {
  ryey.easer.plugins.operation.h.a(android.content.Context);
    Code:
       0: aload_0
       1: aload_1
       2: invokespecial #9                  // Method ryey/easer/plugins/operation/c."<init>":(Landroid/content/Context;)V
       5: return

  public boolean a(ryey.easer.commons.local_plugin.c.b);
    Code:
       0: aload_0
       1: aload_1
       2: checkcast     #14                 // class ryey/easer/plugins/operation/h/b
       5: invokevirtual #17                 // Method a:(Lryey/easer/plugins/operation/h/b;)Z
       8: ireturn

  public boolean a(ryey.easer.plugins.operation.h.b);
    Code:
       0: aload_1
       1: getfield      #21                 // Field ryey/easer/plugins/operation/h/b.b:Ljava/lang/String;
       4: invokestatic  #26                 // Method ryey/easer/b.a:(Ljava/lang/String;)Z
       7: ifeq          28
      10: aload_0
      11: getfield      #29                 // Field a:Landroid/content/Context;
      14: invokevirtual #35                 // Method android/content/Context.getPackageManager:()Landroid/content/pm/PackageManager;
      17: aload_1
      18: getfield      #37                 // Field ryey/easer/plugins/operation/h/b.a:Ljava/lang/String;
      21: invokevirtual #43                 // Method android/content/pm/PackageManager.getLaunchIntentForPackage:(Ljava/lang/String;)Landroid/content/Intent;
      24: astore_1
      25: goto          58
      28: new           #45                 // class android/content/Intent
      31: dup
      32: invokespecial #48                 // Method android/content/Intent."<init>":()V
      35: astore_2
      36: aload_2
      37: new           #50                 // class android/content/ComponentName
      40: dup
      41: aload_1
      42: getfield      #37                 // Field ryey/easer/plugins/operation/h/b.a:Ljava/lang/String;
      45: aload_1
      46: getfield      #21                 // Field ryey/easer/plugins/operation/h/b.b:Ljava/lang/String;
      49: invokespecial #53                 // Method android/content/ComponentName."<init>":(Ljava/lang/String;Ljava/lang/String;)V
      52: invokevirtual #57                 // Method android/content/Intent.setComponent:(Landroid/content/ComponentName;)Landroid/content/Intent;
      55: pop
      56: aload_2
      57: astore_1
      58: aload_1
      59: ifnull        79
      62: aload_1
      63: ldc           #58                 // int 268435456
      65: invokevirtual #62                 // Method android/content/Intent.addFlags:(I)Landroid/content/Intent;
      68: pop
      69: aload_0
      70: getfield      #29                 // Field a:Landroid/content/Context;
      73: aload_1
      74: invokevirtual #66                 // Method android/content/Context.startActivity:(Landroid/content/Intent;)V
      77: iconst_1
      78: ireturn
      79: iconst_0
      80: ireturn
}
