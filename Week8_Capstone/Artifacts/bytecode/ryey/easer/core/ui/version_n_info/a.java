public final class ryey.easer.core.ui.version_n_info.a {
  public static final ryey.easer.core.ui.version_n_info.a a;

  static {};
    Code:
       0: new           #2                  // class ryey/easer/core/ui/version_n_info/a
       3: dup
       4: invokespecial #11                 // Method "<init>":()V
       7: putstatic     #13                 // Field a:Lryey/easer/core/ui/version_n_info/a;
      10: return

  public final void a(android.content.Context);
    Code:
       0: aload_1
       1: ldc           #18                 // String context
       3: invokestatic  #24                 // Method a/b/b/c.b:(Ljava/lang/Object;Ljava/lang/String;)V
       6: aload_1
       7: invokestatic  #30                 // Method android/preference/PreferenceManager.getDefaultSharedPreferences:(Landroid/content/Context;)Landroid/content/SharedPreferences;
      10: aload_1
      11: ldc           #31                 // int 2131624119
      13: invokevirtual #37                 // Method android/content/Context.getString:(I)Ljava/lang/String;
      16: iconst_1
      17: invokeinterface #43,  3           // InterfaceMethod android/content/SharedPreferences.getBoolean:(Ljava/lang/String;Z)Z
      22: ifeq          39
      25: aload_1
      26: new           #45                 // class android/content/Intent
      29: dup
      30: aload_1
      31: ldc           #47                 // class ryey/easer/core/ui/version_n_info/WelcomeActivity
      33: invokespecial #50                 // Method android/content/Intent."<init>":(Landroid/content/Context;Ljava/lang/Class;)V
      36: invokevirtual #54                 // Method android/content/Context.startActivity:(Landroid/content/Intent;)V
      39: return
}
