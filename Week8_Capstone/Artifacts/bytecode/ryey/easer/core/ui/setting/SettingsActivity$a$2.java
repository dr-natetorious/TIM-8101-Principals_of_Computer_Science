class ryey.easer.core.ui.setting.SettingsActivity$a$2 implements android.preference.Preference$OnPreferenceClickListener {
  final ryey.easer.core.ui.setting.SettingsActivity$a a;

  ryey.easer.core.ui.setting.SettingsActivity$a$2(ryey.easer.core.ui.setting.SettingsActivity$a);
    Code:
       0: aload_0
       1: aload_1
       2: putfield      #19                 // Field a:Lryey/easer/core/ui/setting/SettingsActivity$a;
       5: aload_0
       6: invokespecial #22                 // Method java/lang/Object."<init>":()V
       9: return

  public boolean onPreferenceClick(android.preference.Preference);
    Code:
       0: aload_0
       1: getfield      #19                 // Field a:Lryey/easer/core/ui/setting/SettingsActivity$a;
       4: invokevirtual #29                 // Method ryey/easer/core/ui/setting/SettingsActivity$a.getActivity:()Landroid/app/Activity;
       7: ldc           #31                 // String android.permission.READ_EXTERNAL_STORAGE
       9: invokestatic  #36                 // Method ryey/easer/b.a:(Landroid/content/Context;Ljava/lang/String;)Z
      12: ifne          46
      15: getstatic     #42                 // Field android/os/Build$VERSION.SDK_INT:I
      18: bipush        16
      20: if_icmplt     73
      23: aload_0
      24: getfield      #19                 // Field a:Lryey/easer/core/ui/setting/SettingsActivity$a;
      27: invokevirtual #29                 // Method ryey/easer/core/ui/setting/SettingsActivity$a.getActivity:()Landroid/app/Activity;
      30: iconst_1
      31: anewarray     #44                 // class java/lang/String
      34: dup
      35: iconst_0
      36: ldc           #31                 // String android.permission.READ_EXTERNAL_STORAGE
      38: aastore
      39: bipush        12
      41: invokestatic  #49                 // Method android/support/v4/app/a.a:(Landroid/app/Activity;[Ljava/lang/String;I)V
      44: iconst_0
      45: ireturn
      46: new           #51                 // class android/content/Intent
      49: dup
      50: ldc           #53                 // String android.intent.action.GET_CONTENT
      52: invokespecial #56                 // Method android/content/Intent."<init>":(Ljava/lang/String;)V
      55: astore_1
      56: aload_1
      57: ldc           #58                 // String application/zip
      59: invokevirtual #62                 // Method android/content/Intent.setType:(Ljava/lang/String;)Landroid/content/Intent;
      62: pop
      63: aload_0
      64: getfield      #19                 // Field a:Lryey/easer/core/ui/setting/SettingsActivity$a;
      67: aload_1
      68: bipush        10
      70: invokevirtual #66                 // Method ryey/easer/core/ui/setting/SettingsActivity$a.startActivityForResult:(Landroid/content/Intent;I)V
      73: iconst_1
      74: ireturn
}
