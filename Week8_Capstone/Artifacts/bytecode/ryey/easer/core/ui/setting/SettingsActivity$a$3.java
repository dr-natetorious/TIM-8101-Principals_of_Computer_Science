class ryey.easer.core.ui.setting.SettingsActivity$a$3 implements android.preference.Preference$OnPreferenceChangeListener {
  final ryey.easer.core.ui.setting.SettingsActivity$a a;

  ryey.easer.core.ui.setting.SettingsActivity$a$3(ryey.easer.core.ui.setting.SettingsActivity$a);
    Code:
       0: aload_0
       1: aload_1
       2: putfield      #19                 // Field a:Lryey/easer/core/ui/setting/SettingsActivity$a;
       5: aload_0
       6: invokespecial #22                 // Method java/lang/Object."<init>":()V
       9: return

  public boolean onPreferenceChange(android.preference.Preference, java.lang.Object);
    Code:
       0: aload_2
       1: checkcast     #27                 // class java/lang/Boolean
       4: invokevirtual #31                 // Method java/lang/Boolean.booleanValue:()Z
       7: ifeq          61
      10: aload_0
      11: getfield      #19                 // Field a:Lryey/easer/core/ui/setting/SettingsActivity$a;
      14: invokevirtual #35                 // Method ryey/easer/core/ui/setting/SettingsActivity$a.getActivity:()Landroid/app/Activity;
      17: ldc           #37                 // String android.permission.WRITE_EXTERNAL_STORAGE
      19: invokestatic  #42                 // Method ryey/easer/b.a:(Landroid/content/Context;Ljava/lang/String;)Z
      22: ifne          61
      25: ldc           #44                 // String Permission <%s> not granted. Requesting...
      27: iconst_1
      28: anewarray     #4                  // class java/lang/Object
      31: dup
      32: iconst_0
      33: ldc           #37                 // String android.permission.WRITE_EXTERNAL_STORAGE
      35: aastore
      36: invokestatic  #50                 // Method com/b/a/i.c:(Ljava/lang/String;[Ljava/lang/Object;)V
      39: aload_0
      40: getfield      #19                 // Field a:Lryey/easer/core/ui/setting/SettingsActivity$a;
      43: invokevirtual #35                 // Method ryey/easer/core/ui/setting/SettingsActivity$a.getActivity:()Landroid/app/Activity;
      46: iconst_1
      47: anewarray     #52                 // class java/lang/String
      50: dup
      51: iconst_0
      52: ldc           #37                 // String android.permission.WRITE_EXTERNAL_STORAGE
      54: aastore
      55: iconst_1
      56: invokestatic  #57                 // Method android/support/v4/app/a.a:(Landroid/app/Activity;[Ljava/lang/String;I)V
      59: iconst_0
      60: ireturn
      61: iconst_1
      62: ireturn
}
