public class ryey.easer.plugins.operation.p.a extends ryey.easer.plugins.operation.c<ryey.easer.plugins.operation.p.b> {
  ryey.easer.plugins.operation.p.a(android.content.Context);
    Code:
       0: aload_0
       1: aload_1
       2: invokespecial #9                  // Method ryey/easer/plugins/operation/c."<init>":(Landroid/content/Context;)V
       5: return

  public boolean a(ryey.easer.commons.local_plugin.c.b);
    Code:
       0: aload_0
       1: aload_1
       2: checkcast     #14                 // class ryey/easer/plugins/operation/p/b
       5: invokevirtual #17                 // Method a:(Lryey/easer/plugins/operation/p/b;)Z
       8: ireturn

  public boolean a(ryey.easer.plugins.operation.p.b);
    Code:
       0: aload_0
       1: getfield      #20                 // Field a:Landroid/content/Context;
       4: ldc           #22                 // String uimode
       6: invokevirtual #28                 // Method android/content/Context.getSystemService:(Ljava/lang/String;)Ljava/lang/Object;
       9: checkcast     #30                 // class android/app/UiModeManager
      12: astore_2
      13: aload_2
      14: ifnonnull     28
      17: ldc           #32                 // String Can't get UiModeManager???
      19: iconst_0
      20: anewarray     #34                 // class java/lang/Object
      23: invokestatic  #40                 // Method com/b/a/i.f:(Ljava/lang/String;[Ljava/lang/Object;)V
      26: iconst_0
      27: ireturn
      28: aload_1
      29: getfield      #43                 // Field ryey/easer/plugins/operation/p/b.a:Lryey/easer/plugins/operation/p/b$a;
      32: getstatic     #46                 // Field ryey/easer/plugins/operation/p/b$a.a:Lryey/easer/plugins/operation/p/b$a;
      35: if_acmpne     46
      38: aload_2
      39: iconst_0
      40: invokevirtual #50                 // Method android/app/UiModeManager.enableCarMode:(I)V
      43: goto          51
      46: aload_2
      47: iconst_0
      48: invokevirtual #53                 // Method android/app/UiModeManager.disableCarMode:(I)V
      51: iconst_1
      52: ireturn
}
