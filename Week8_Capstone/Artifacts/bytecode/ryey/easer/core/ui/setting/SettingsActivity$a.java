public class ryey.easer.core.ui.setting.SettingsActivity$a extends android.preference.PreferenceFragment {
  public ryey.easer.core.ui.setting.SettingsActivity$a();
    Code:
       0: aload_0
       1: invokespecial #23                 // Method android/preference/PreferenceFragment."<init>":()V
       4: return

  static java.lang.String a();
    Code:
       0: invokestatic  #28                 // Method b:()Ljava/lang/String;
       3: areturn

  static void a(android.content.Context);
    Code:
       0: aload_0
       1: invokestatic  #31                 // Method b:(Landroid/content/Context;)V
       4: return

  public void onActivityResult(int, int, android.content.Intent);
    Code:
       0: iload_2
       1: iconst_m1
       2: if_icmpne     96
       5: iload_1
       6: bipush        10
       8: if_icmpne     57
      11: aload_3
      12: invokevirtual #127                // Method android/content/Intent.getData:()Landroid/net/Uri;
      15: astore_3
      16: aload_0
      17: invokevirtual #131                // Method getActivity:()Landroid/app/Activity;
      20: aload_3
      21: invokestatic  #134                // Method ryey/easer/core/a/d.b:(Landroid/content/Context;Landroid/net/Uri;)V
      24: aload_0
      25: invokevirtual #131                // Method getActivity:()Landroid/app/Activity;
      28: invokestatic  #139                // Method ryey/easer/core/EHService.c:(Landroid/content/Context;)V
      31: return
      32: astore_3
      33: aload_0
      34: invokevirtual #131                // Method getActivity:()Landroid/app/Activity;
      37: ldc           #140                // int 2131624146
      39: iconst_1
      40: invokestatic  #143                // Method android/widget/Toast.makeText:(Landroid/content/Context;II)Landroid/widget/Toast;
      43: invokevirtual #112                // Method android/widget/Toast.show:()V
      46: goto          92
      49: astore_3
      50: ldc           #145                // String IOException caught when importing data
      52: astore        4
      54: goto          82
      57: iload_1
      58: bipush        15
      60: if_icmpne     96
      63: aload_3
      64: invokevirtual #127                // Method android/content/Intent.getData:()Landroid/net/Uri;
      67: astore_3
      68: aload_0
      69: invokevirtual #131                // Method getActivity:()Landroid/app/Activity;
      72: aload_3
      73: invokestatic  #147                // Method ryey/easer/core/a/d.a:(Landroid/content/Context;Landroid/net/Uri;)V
      76: return
      77: astore_3
      78: ldc           #149                // String IOException caught when exporting data
      80: astore        4
      82: aload_3
      83: aload         4
      85: iconst_0
      86: anewarray     #41                 // class java/lang/Object
      89: invokestatic  #152                // Method com/b/a/i.a:(Ljava/lang/Throwable;Ljava/lang/String;[Ljava/lang/Object;)V
      92: aload_3
      93: invokestatic  #117                // Method com/google/a/a/a/a/a/a.a:(Ljava/lang/Throwable;)V
      96: return
    Exception table:
       from    to  target type
          16    31    49   Class java/io/IOException
          16    31    32   Class ryey/easer/core/a/e
          68    76    77   Class java/io/IOException

  public void onCreate(android.os.Bundle);
    Code:
       0: aload_0
       1: aload_1
       2: invokespecial #158                // Method android/preference/PreferenceFragment.onCreate:(Landroid/os/Bundle;)V
       5: aload_0
       6: ldc           #159                // int 2131820546
       8: invokevirtual #163                // Method addPreferencesFromResource:(I)V
      11: iconst_0
      12: istore_3
      13: aload_0
      14: invokevirtual #131                // Method getActivity:()Landroid/app/Activity;
      17: invokevirtual #169                // Method android/app/Activity.getPackageManager:()Landroid/content/pm/PackageManager;
      20: aload_0
      21: invokevirtual #131                // Method getActivity:()Landroid/app/Activity;
      24: invokevirtual #172                // Method android/app/Activity.getPackageName:()Ljava/lang/String;
      27: iconst_0
      28: invokevirtual #178                // Method android/content/pm/PackageManager.getPackageInfo:(Ljava/lang/String;I)Landroid/content/pm/PackageInfo;
      31: getfield      #184                // Field android/content/pm/PackageInfo.versionName:Ljava/lang/String;
      34: astore_1
      35: aload_0
      36: aload_0
      37: ldc           #185                // int 2131624118
      39: invokevirtual #186                // Method getString:(I)Ljava/lang/String;
      42: invokevirtual #190                // Method findPreference:(Ljava/lang/CharSequence;)Landroid/preference/Preference;
      45: aload_1
      46: invokevirtual #196                // Method android/preference/Preference.setSummary:(Ljava/lang/CharSequence;)V
      49: goto          63
      52: astore_1
      53: aload_1
      54: ldc           #198                // String Unable to get app version
      56: iconst_0
      57: anewarray     #41                 // class java/lang/Object
      60: invokestatic  #152                // Method com/b/a/i.a:(Ljava/lang/Throwable;Ljava/lang/String;[Ljava/lang/Object;)V
      63: aload_0
      64: aload_0
      65: ldc           #199                // int 2131624108
      67: invokevirtual #186                // Method getString:(I)Ljava/lang/String;
      70: invokevirtual #190                // Method findPreference:(Ljava/lang/CharSequence;)Landroid/preference/Preference;
      73: new           #9                  // class ryey/easer/core/ui/setting/SettingsActivity$a$1
      76: dup
      77: aload_0
      78: invokespecial #202                // Method ryey/easer/core/ui/setting/SettingsActivity$a$1."<init>":(Lryey/easer/core/ui/setting/SettingsActivity$a;)V
      81: invokevirtual #206                // Method android/preference/Preference.setOnPreferenceClickListener:(Landroid/preference/Preference$OnPreferenceClickListener;)V
      84: aload_0
      85: aload_0
      86: ldc           #207                // int 2131624110
      88: invokevirtual #186                // Method getString:(I)Ljava/lang/String;
      91: invokevirtual #190                // Method findPreference:(Ljava/lang/CharSequence;)Landroid/preference/Preference;
      94: new           #11                 // class ryey/easer/core/ui/setting/SettingsActivity$a$2
      97: dup
      98: aload_0
      99: invokespecial #208                // Method ryey/easer/core/ui/setting/SettingsActivity$a$2."<init>":(Lryey/easer/core/ui/setting/SettingsActivity$a;)V
     102: invokevirtual #206                // Method android/preference/Preference.setOnPreferenceClickListener:(Landroid/preference/Preference$OnPreferenceClickListener;)V
     105: aload_0
     106: aload_0
     107: ldc           #209                // int 2131624111
     109: invokevirtual #186                // Method getString:(I)Ljava/lang/String;
     112: invokevirtual #190                // Method findPreference:(Ljava/lang/CharSequence;)Landroid/preference/Preference;
     115: new           #13                 // class ryey/easer/core/ui/setting/SettingsActivity$a$3
     118: dup
     119: aload_0
     120: invokespecial #210                // Method ryey/easer/core/ui/setting/SettingsActivity$a$3."<init>":(Lryey/easer/core/ui/setting/SettingsActivity$a;)V
     123: invokevirtual #214                // Method android/preference/Preference.setOnPreferenceChangeListener:(Landroid/preference/Preference$OnPreferenceChangeListener;)V
     126: aload_0
     127: aload_0
     128: ldc           #215                // int 2131624104
     130: invokevirtual #186                // Method getString:(I)Ljava/lang/String;
     133: invokevirtual #190                // Method findPreference:(Ljava/lang/CharSequence;)Landroid/preference/Preference;
     136: new           #15                 // class ryey/easer/core/ui/setting/SettingsActivity$a$4
     139: dup
     140: aload_0
     141: invokespecial #216                // Method ryey/easer/core/ui/setting/SettingsActivity$a$4."<init>":(Lryey/easer/core/ui/setting/SettingsActivity$a;)V
     144: invokevirtual #214                // Method android/preference/Preference.setOnPreferenceChangeListener:(Landroid/preference/Preference$OnPreferenceChangeListener;)V
     147: aload_0
     148: aload_0
     149: ldc           #217                // int 2131624112
     151: invokevirtual #186                // Method getString:(I)Ljava/lang/String;
     154: invokevirtual #190                // Method findPreference:(Ljava/lang/CharSequence;)Landroid/preference/Preference;
     157: new           #17                 // class ryey/easer/core/ui/setting/SettingsActivity$a$5
     160: dup
     161: aload_0
     162: invokespecial #218                // Method ryey/easer/core/ui/setting/SettingsActivity$a$5."<init>":(Lryey/easer/core/ui/setting/SettingsActivity$a;)V
     165: invokevirtual #206                // Method android/preference/Preference.setOnPreferenceClickListener:(Landroid/preference/Preference$OnPreferenceClickListener;)V
     168: aload_0
     169: aload_0
     170: ldc           #219                // int 2131624103
     172: invokevirtual #186                // Method getString:(I)Ljava/lang/String;
     175: invokevirtual #190                // Method findPreference:(Ljava/lang/CharSequence;)Landroid/preference/Preference;
     178: new           #19                 // class ryey/easer/core/ui/setting/SettingsActivity$a$6
     181: dup
     182: aload_0
     183: invokespecial #220                // Method ryey/easer/core/ui/setting/SettingsActivity$a$6."<init>":(Lryey/easer/core/ui/setting/SettingsActivity$a;)V
     186: invokevirtual #206                // Method android/preference/Preference.setOnPreferenceClickListener:(Landroid/preference/Preference$OnPreferenceClickListener;)V
     189: aload_0
     190: aload_0
     191: ldc           #221                // int 2131624115
     193: invokevirtual #186                // Method getString:(I)Ljava/lang/String;
     196: invokevirtual #190                // Method findPreference:(Ljava/lang/CharSequence;)Landroid/preference/Preference;
     199: astore_1
     200: getstatic     #227                // Field android/os/Build$VERSION.SDK_INT:I
     203: bipush        26
     205: if_icmpgt     213
     208: iconst_1
     209: istore_2
     210: goto          215
     213: iconst_0
     214: istore_2
     215: aload_1
     216: iload_2
     217: invokevirtual #231                // Method android/preference/Preference.setEnabled:(Z)V
     220: aload_0
     221: aload_0
     222: ldc           #232                // int 2131624109
     224: invokevirtual #186                // Method getString:(I)Ljava/lang/String;
     227: invokevirtual #190                // Method findPreference:(Ljava/lang/CharSequence;)Landroid/preference/Preference;
     230: astore_1
     231: iload_3
     232: istore_2
     233: getstatic     #227                // Field android/os/Build$VERSION.SDK_INT:I
     236: bipush        26
     238: if_icmpgt     243
     241: iconst_1
     242: istore_2
     243: aload_1
     244: iload_2
     245: invokevirtual #231                // Method android/preference/Preference.setEnabled:(Z)V
     248: return
    Exception table:
       from    to  target type
          13    49    52   Class android/content/pm/PackageManager$NameNotFoundException

  public void onPause();
    Code:
       0: aload_0
       1: invokespecial #235                // Method android/preference/PreferenceFragment.onPause:()V
       4: aload_0
       5: invokevirtual #239                // Method getPreferenceScreen:()Landroid/preference/PreferenceScreen;
       8: invokevirtual #245                // Method android/preference/PreferenceScreen.getSharedPreferences:()Landroid/content/SharedPreferences;
      11: aload_0
      12: invokevirtual #131                // Method getActivity:()Landroid/app/Activity;
      15: checkcast     #6                  // class ryey/easer/core/ui/setting/SettingsActivity
      18: invokeinterface #251,  2          // InterfaceMethod android/content/SharedPreferences.unregisterOnSharedPreferenceChangeListener:(Landroid/content/SharedPreferences$OnSharedPreferenceChangeListener;)V
      23: return

  public void onRequestPermissionsResult(int, java.lang.String[], int[]);
    Code:
       0: iload_1
       1: iconst_1
       2: if_icmpeq     29
       5: iload_1
       6: tableswitch   { // 11 to 12
                    11: 29
                    12: 29
               default: 28
          }
      28: return
      29: aload_3
      30: arraylength
      31: ifne          44
      34: ldc           #255                // String Request permission result with ZERO length!!!
      36: iconst_0
      37: anewarray     #41                 // class java/lang/Object
      40: invokestatic  #258                // Method com/b/a/i.f:(Ljava/lang/String;[Ljava/lang/Object;)V
      43: return
      44: aload_3
      45: iconst_0
      46: iaload
      47: ifne          75
      50: ldc_w         #260                // String Request for permission <%s> granted
      53: astore        4
      55: iconst_1
      56: anewarray     #41                 // class java/lang/Object
      59: astore_3
      60: aload_3
      61: iconst_0
      62: aload_2
      63: iconst_0
      64: aaload
      65: aastore
      66: aload         4
      68: astore_2
      69: aload_2
      70: aload_3
      71: invokestatic  #262                // Method com/b/a/i.c:(Ljava/lang/String;[Ljava/lang/Object;)V
      74: return
      75: ldc_w         #264                // String Request for permission <%s> denied
      78: astore        4
      80: iconst_1
      81: anewarray     #41                 // class java/lang/Object
      84: astore_3
      85: aload_3
      86: iconst_0
      87: aload_2
      88: iconst_0
      89: aaload
      90: aastore
      91: aload         4
      93: astore_2
      94: goto          69

  public void onResume();
    Code:
       0: aload_0
       1: invokespecial #267                // Method android/preference/PreferenceFragment.onResume:()V
       4: aload_0
       5: invokevirtual #239                // Method getPreferenceScreen:()Landroid/preference/PreferenceScreen;
       8: invokevirtual #245                // Method android/preference/PreferenceScreen.getSharedPreferences:()Landroid/content/SharedPreferences;
      11: aload_0
      12: invokevirtual #131                // Method getActivity:()Landroid/app/Activity;
      15: checkcast     #6                  // class ryey/easer/core/ui/setting/SettingsActivity
      18: invokeinterface #270,  2          // InterfaceMethod android/content/SharedPreferences.registerOnSharedPreferenceChangeListener:(Landroid/content/SharedPreferences$OnSharedPreferenceChangeListener;)V
      23: return
}
