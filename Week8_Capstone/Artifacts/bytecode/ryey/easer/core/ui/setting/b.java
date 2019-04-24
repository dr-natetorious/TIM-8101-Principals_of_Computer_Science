public class ryey.easer.core.ui.setting.b extends android.preference.PreferenceFragment implements ryey.easer.core.f$f {
  ryey.easer.core.f a;

  public ryey.easer.core.ui.setting.b();
    Code:
       0: aload_0
       1: invokespecial #12                 // Method android/preference/PreferenceFragment."<init>":()V
       4: return

  public void a(java.util.Set<ryey.easer.core.e>);
    Code:
       0: aload_0
       1: invokevirtual #18                 // Method getPreferenceScreen:()Landroid/preference/PreferenceScreen;
       4: aload_0
       5: ldc           #19                 // int 2131624113
       7: invokevirtual #23                 // Method getString:(I)Ljava/lang/String;
      10: invokevirtual #29                 // Method android/preference/PreferenceScreen.findPreference:(Ljava/lang/CharSequence;)Landroid/preference/Preference;
      13: checkcast     #31                 // class android/preference/PreferenceCategory
      16: astore_2
      17: aload_1
      18: invokeinterface #37,  1           // InterfaceMethod java/util/Set.iterator:()Ljava/util/Iterator;
      23: astore_1
      24: aload_1
      25: invokeinterface #43,  1           // InterfaceMethod java/util/Iterator.hasNext:()Z
      30: ifeq          63
      33: aload_1
      34: invokeinterface #47,  1           // InterfaceMethod java/util/Iterator.next:()Ljava/lang/Object;
      39: checkcast     #49                 // class ryey/easer/core/g
      42: astore_3
      43: aload_2
      44: new           #51                 // class ryey/easer/core/ui/setting/c
      47: dup
      48: aload_0
      49: invokevirtual #55                 // Method getActivity:()Landroid/app/Activity;
      52: aload_3
      53: invokespecial #58                 // Method ryey/easer/core/ui/setting/c."<init>":(Landroid/content/Context;Lryey/easer/core/g;)V
      56: invokevirtual #62                 // Method android/preference/PreferenceCategory.addPreference:(Landroid/preference/Preference;)Z
      59: pop
      60: goto          24
      63: return

  public void onCreate(android.os.Bundle);
    Code:
       0: aload_0
       1: aload_1
       2: invokespecial #68                 // Method android/preference/PreferenceFragment.onCreate:(Landroid/os/Bundle;)V
       5: aload_0
       6: ldc           #69                 // int 2131820545
       8: invokevirtual #73                 // Method addPreferencesFromResource:(I)V
      11: aload_0
      12: new           #75                 // class ryey/easer/core/f
      15: dup
      16: aload_0
      17: invokevirtual #55                 // Method getActivity:()Landroid/app/Activity;
      20: invokespecial #78                 // Method ryey/easer/core/f."<init>":(Landroid/content/Context;)V
      23: putfield      #80                 // Field a:Lryey/easer/core/f;
      26: aload_0
      27: getfield      #80                 // Field a:Lryey/easer/core/f;
      30: invokevirtual #82                 // Method ryey/easer/core/f.a:()V
      33: aload_0
      34: invokevirtual #18                 // Method getPreferenceScreen:()Landroid/preference/PreferenceScreen;
      37: aload_0
      38: ldc           #83                 // int 2131624107
      40: invokevirtual #23                 // Method getString:(I)Ljava/lang/String;
      43: invokevirtual #29                 // Method android/preference/PreferenceScreen.findPreference:(Ljava/lang/CharSequence;)Landroid/preference/Preference;
      46: checkcast     #31                 // class android/preference/PreferenceCategory
      49: astore_1
      50: invokestatic  #88                 // Method ryey/easer/plugins/b.a:()Lryey/easer/plugins/b;
      53: invokevirtual #92                 // Method ryey/easer/plugins/b.c:()Lryey/easer/plugins/b$c;
      56: invokevirtual #97                 // Method ryey/easer/plugins/b$c.a:()Ljava/util/List;
      59: invokeinterface #100,  1          // InterfaceMethod java/util/List.iterator:()Ljava/util/Iterator;
      64: astore_2
      65: aload_2
      66: invokeinterface #43,  1           // InterfaceMethod java/util/Iterator.hasNext:()Z
      71: ifeq          104
      74: aload_2
      75: invokeinterface #47,  1           // InterfaceMethod java/util/Iterator.next:()Ljava/lang/Object;
      80: checkcast     #102                // class ryey/easer/commons/local_plugin/d
      83: astore_3
      84: aload_1
      85: new           #104                // class ryey/easer/core/ui/setting/a
      88: dup
      89: aload_0
      90: invokevirtual #55                 // Method getActivity:()Landroid/app/Activity;
      93: aload_3
      94: invokespecial #107                // Method ryey/easer/core/ui/setting/a."<init>":(Landroid/content/Context;Lryey/easer/commons/local_plugin/d;)V
      97: invokevirtual #62                 // Method android/preference/PreferenceCategory.addPreference:(Landroid/preference/Preference;)Z
     100: pop
     101: goto          65
     104: aload_0
     105: invokevirtual #18                 // Method getPreferenceScreen:()Landroid/preference/PreferenceScreen;
     108: aload_0
     109: ldc           #108                // int 2131624106
     111: invokevirtual #23                 // Method getString:(I)Ljava/lang/String;
     114: invokevirtual #29                 // Method android/preference/PreferenceScreen.findPreference:(Ljava/lang/CharSequence;)Landroid/preference/Preference;
     117: checkcast     #31                 // class android/preference/PreferenceCategory
     120: astore_1
     121: invokestatic  #88                 // Method ryey/easer/plugins/b.a:()Lryey/easer/plugins/b;
     124: invokevirtual #111                // Method ryey/easer/plugins/b.b:()Lryey/easer/plugins/b$c;
     127: invokevirtual #97                 // Method ryey/easer/plugins/b$c.a:()Ljava/util/List;
     130: invokeinterface #100,  1          // InterfaceMethod java/util/List.iterator:()Ljava/util/Iterator;
     135: astore_2
     136: aload_2
     137: invokeinterface #43,  1           // InterfaceMethod java/util/Iterator.hasNext:()Z
     142: ifeq          175
     145: aload_2
     146: invokeinterface #47,  1           // InterfaceMethod java/util/Iterator.next:()Ljava/lang/Object;
     151: checkcast     #102                // class ryey/easer/commons/local_plugin/d
     154: astore_3
     155: aload_1
     156: new           #104                // class ryey/easer/core/ui/setting/a
     159: dup
     160: aload_0
     161: invokevirtual #55                 // Method getActivity:()Landroid/app/Activity;
     164: aload_3
     165: invokespecial #107                // Method ryey/easer/core/ui/setting/a."<init>":(Landroid/content/Context;Lryey/easer/commons/local_plugin/d;)V
     168: invokevirtual #62                 // Method android/preference/PreferenceCategory.addPreference:(Landroid/preference/Preference;)Z
     171: pop
     172: goto          136
     175: aload_0
     176: invokevirtual #18                 // Method getPreferenceScreen:()Landroid/preference/PreferenceScreen;
     179: aload_0
     180: ldc           #112                // int 2131624105
     182: invokevirtual #23                 // Method getString:(I)Ljava/lang/String;
     185: invokevirtual #29                 // Method android/preference/PreferenceScreen.findPreference:(Ljava/lang/CharSequence;)Landroid/preference/Preference;
     188: checkcast     #31                 // class android/preference/PreferenceCategory
     191: astore_1
     192: invokestatic  #88                 // Method ryey/easer/plugins/b.a:()Lryey/easer/plugins/b;
     195: invokevirtual #115                // Method ryey/easer/plugins/b.d:()Lryey/easer/plugins/b$c;
     198: invokevirtual #97                 // Method ryey/easer/plugins/b$c.a:()Ljava/util/List;
     201: invokeinterface #100,  1          // InterfaceMethod java/util/List.iterator:()Ljava/util/Iterator;
     206: astore_2
     207: aload_2
     208: invokeinterface #43,  1           // InterfaceMethod java/util/Iterator.hasNext:()Z
     213: ifeq          246
     216: aload_2
     217: invokeinterface #47,  1           // InterfaceMethod java/util/Iterator.next:()Ljava/lang/Object;
     222: checkcast     #102                // class ryey/easer/commons/local_plugin/d
     225: astore_3
     226: aload_1
     227: new           #104                // class ryey/easer/core/ui/setting/a
     230: dup
     231: aload_0
     232: invokevirtual #55                 // Method getActivity:()Landroid/app/Activity;
     235: aload_3
     236: invokespecial #107                // Method ryey/easer/core/ui/setting/a."<init>":(Landroid/content/Context;Lryey/easer/commons/local_plugin/d;)V
     239: invokevirtual #62                 // Method android/preference/PreferenceCategory.addPreference:(Landroid/preference/Preference;)Z
     242: pop
     243: goto          207
     246: aload_0
     247: getfield      #80                 // Field a:Lryey/easer/core/f;
     250: aload_0
     251: invokevirtual #118                // Method ryey/easer/core/f.a:(Lryey/easer/core/f$f;)V
     254: return

  public void onDestroy();
    Code:
       0: aload_0
       1: invokespecial #121                // Method android/preference/PreferenceFragment.onDestroy:()V
       4: aload_0
       5: getfield      #80                 // Field a:Lryey/easer/core/f;
       8: invokevirtual #123                // Method ryey/easer/core/f.b:()V
      11: return
}
