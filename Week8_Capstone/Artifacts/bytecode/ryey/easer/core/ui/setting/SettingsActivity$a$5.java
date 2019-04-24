class ryey.easer.core.ui.setting.SettingsActivity$a$5 implements android.preference.Preference$OnPreferenceClickListener {
  final ryey.easer.core.ui.setting.SettingsActivity$a a;

  ryey.easer.core.ui.setting.SettingsActivity$a$5(ryey.easer.core.ui.setting.SettingsActivity$a);
    Code:
       0: aload_0
       1: aload_1
       2: putfield      #19                 // Field a:Lryey/easer/core/ui/setting/SettingsActivity$a;
       5: aload_0
       6: invokespecial #22                 // Method java/lang/Object."<init>":()V
       9: return

  public boolean onPreferenceClick(android.preference.Preference);
    Code:
       0: new           #27                 // class ryey/easer/core/ui/setting/b
       3: dup
       4: invokespecial #28                 // Method ryey/easer/core/ui/setting/b."<init>":()V
       7: astore_1
       8: aload_0
       9: getfield      #19                 // Field a:Lryey/easer/core/ui/setting/SettingsActivity$a;
      12: invokevirtual #32                 // Method ryey/easer/core/ui/setting/SettingsActivity$a.getFragmentManager:()Landroid/app/FragmentManager;
      15: invokevirtual #38                 // Method android/app/FragmentManager.beginTransaction:()Landroid/app/FragmentTransaction;
      18: ldc           #39                 // int 16908290
      20: aload_1
      21: invokevirtual #45                 // Method android/app/FragmentTransaction.replace:(ILandroid/app/Fragment;)Landroid/app/FragmentTransaction;
      24: ldc           #47                 // String bs_plugin_enabled
      26: invokevirtual #51                 // Method android/app/FragmentTransaction.addToBackStack:(Ljava/lang/String;)Landroid/app/FragmentTransaction;
      29: invokevirtual #55                 // Method android/app/FragmentTransaction.commit:()I
      32: pop
      33: iconst_1
      34: ireturn
}
