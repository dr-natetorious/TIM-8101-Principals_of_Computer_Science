class ryey.easer.core.ui.setting.SettingsActivity$a$6 implements android.preference.Preference$OnPreferenceClickListener {
  final ryey.easer.core.ui.setting.SettingsActivity$a a;

  ryey.easer.core.ui.setting.SettingsActivity$a$6(ryey.easer.core.ui.setting.SettingsActivity$a);
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
       7: invokestatic  #35                 // Method ryey/easer/core/a/a/f.b:(Landroid/content/Context;)Z
      10: ifne          29
      13: aload_0
      14: getfield      #19                 // Field a:Lryey/easer/core/ui/setting/SettingsActivity$a;
      17: invokevirtual #29                 // Method ryey/easer/core/ui/setting/SettingsActivity$a.getActivity:()Landroid/app/Activity;
      20: ldc           #36                 // int 2131624142
      22: iconst_1
      23: invokestatic  #42                 // Method android/widget/Toast.makeText:(Landroid/content/Context;II)Landroid/widget/Toast;
      26: invokevirtual #45                 // Method android/widget/Toast.show:()V
      29: iconst_1
      30: ireturn
}
