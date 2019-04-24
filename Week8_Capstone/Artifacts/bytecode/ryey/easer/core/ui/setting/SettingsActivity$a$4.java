class ryey.easer.core.ui.setting.SettingsActivity$a$4 implements android.preference.Preference$OnPreferenceChangeListener {
  final ryey.easer.core.ui.setting.SettingsActivity$a a;

  ryey.easer.core.ui.setting.SettingsActivity$a$4(ryey.easer.core.ui.setting.SettingsActivity$a);
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
       1: checkcast     #29                 // class java/lang/String
       4: astore_1
       5: aload_1
       6: invokestatic  #35                 // Method java/lang/Integer.parseInt:(Ljava/lang/String;)I
       9: ifge          20
      12: new           #27                 // class java/lang/NumberFormatException
      15: dup
      16: invokespecial #36                 // Method java/lang/NumberFormatException."<init>":()V
      19: athrow
      20: iconst_1
      21: ireturn
      22: aload_0
      23: getfield      #19                 // Field a:Lryey/easer/core/ui/setting/SettingsActivity$a;
      26: invokevirtual #40                 // Method ryey/easer/core/ui/setting/SettingsActivity$a.getActivity:()Landroid/app/Activity;
      29: ldc           #41                 // int 2131624029
      31: iconst_0
      32: invokestatic  #47                 // Method android/widget/Toast.makeText:(Landroid/content/Context;II)Landroid/widget/Toast;
      35: invokevirtual #50                 // Method android/widget/Toast.show:()V
      38: iconst_0
      39: ireturn
      40: astore_1
      41: goto          22
    Exception table:
       from    to  target type
           5    20    40   Class java/lang/NumberFormatException
}
