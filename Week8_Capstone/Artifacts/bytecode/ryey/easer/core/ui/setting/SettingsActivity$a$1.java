class ryey.easer.core.ui.setting.SettingsActivity$a$1 implements android.preference.Preference$OnPreferenceClickListener {
  final ryey.easer.core.ui.setting.SettingsActivity$a a;

  ryey.easer.core.ui.setting.SettingsActivity$a$1(ryey.easer.core.ui.setting.SettingsActivity$a);
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
       7: ldc           #31                 // String android.permission.WRITE_EXTERNAL_STORAGE
       9: invokestatic  #36                 // Method ryey/easer/b.a:(Landroid/content/Context;Ljava/lang/String;)Z
      12: ifne          38
      15: aload_0
      16: getfield      #19                 // Field a:Lryey/easer/core/ui/setting/SettingsActivity$a;
      19: invokevirtual #29                 // Method ryey/easer/core/ui/setting/SettingsActivity$a.getActivity:()Landroid/app/Activity;
      22: iconst_1
      23: anewarray     #38                 // class java/lang/String
      26: dup
      27: iconst_0
      28: ldc           #31                 // String android.permission.WRITE_EXTERNAL_STORAGE
      30: aastore
      31: bipush        11
      33: invokestatic  #43                 // Method android/support/v4/app/a.a:(Landroid/app/Activity;[Ljava/lang/String;I)V
      36: iconst_1
      37: ireturn
      38: getstatic     #49                 // Field android/os/Build$VERSION.SDK_INT:I
      41: bipush        19
      43: if_icmpge     58
      46: aload_0
      47: getfield      #19                 // Field a:Lryey/easer/core/ui/setting/SettingsActivity$a;
      50: invokevirtual #29                 // Method ryey/easer/core/ui/setting/SettingsActivity$a.getActivity:()Landroid/app/Activity;
      53: invokestatic  #52                 // Method ryey/easer/core/ui/setting/SettingsActivity$a.a:(Landroid/content/Context;)V
      56: iconst_1
      57: ireturn
      58: new           #54                 // class android/content/Intent
      61: dup
      62: ldc           #56                 // String android.intent.action.CREATE_DOCUMENT
      64: invokespecial #59                 // Method android/content/Intent."<init>":(Ljava/lang/String;)V
      67: astore_1
      68: aload_1
      69: ldc           #61                 // String android.intent.category.OPENABLE
      71: invokevirtual #65                 // Method android/content/Intent.addCategory:(Ljava/lang/String;)Landroid/content/Intent;
      74: pop
      75: aload_1
      76: ldc           #67                 // String application/zip
      78: invokevirtual #70                 // Method android/content/Intent.setType:(Ljava/lang/String;)Landroid/content/Intent;
      81: pop
      82: aload_1
      83: ldc           #72                 // String android.intent.extra.TITLE
      85: invokestatic  #75                 // Method ryey/easer/core/ui/setting/SettingsActivity$a.a:()Ljava/lang/String;
      88: invokevirtual #79                 // Method android/content/Intent.putExtra:(Ljava/lang/String;Ljava/lang/String;)Landroid/content/Intent;
      91: pop
      92: aload_0
      93: getfield      #19                 // Field a:Lryey/easer/core/ui/setting/SettingsActivity$a;
      96: aload_1
      97: bipush        15
      99: invokevirtual #83                 // Method ryey/easer/core/ui/setting/SettingsActivity$a.startActivityForResult:(Landroid/content/Intent;I)V
     102: iconst_1
     103: ireturn
}
