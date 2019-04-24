class ryey.easer.core.ui.setting.a extends android.preference.CheckBoxPreference implements android.preference.Preference$OnPreferenceChangeListener {
  ryey.easer.core.ui.setting.a(android.content.Context, ryey.easer.commons.local_plugin.d);
    Code:
       0: aload_0
       1: aload_1
       2: invokespecial #13                 // Method android/preference/CheckBoxPreference."<init>":(Landroid/content/Context;)V
       5: aload_0
       6: aload_2
       7: putfield      #15                 // Field a:Lryey/easer/commons/local_plugin/d;
      10: aload_0
      11: aload_0
      12: invokevirtual #19                 // Method setOnPreferenceChangeListener:(Landroid/preference/Preference$OnPreferenceChangeListener;)V
      15: aload_0
      16: aload_2
      17: invokestatic  #24                 // Method ryey/easer/commons/a.a:(Lryey/easer/commons/local_plugin/d;)Ljava/lang/String;
      20: invokevirtual #28                 // Method setKey:(Ljava/lang/String;)V
      23: aload_0
      24: ldc           #29                 // int 2131427460
      26: invokevirtual #33                 // Method setLayoutResource:(I)V
      29: aload_0
      30: aload_2
      31: invokeinterface #39,  1           // InterfaceMethod ryey/easer/commons/local_plugin/d.b:()I
      36: invokevirtual #42                 // Method setTitle:(I)V
      39: aload_2
      40: aload_1
      41: invokeinterface #45,  2           // InterfaceMethod ryey/easer/commons/local_plugin/d.a:(Landroid/content/Context;)Z
      46: ifeq          58
      49: aload_0
      50: iconst_1
      51: invokestatic  #51                 // Method java/lang/Boolean.valueOf:(Z)Ljava/lang/Boolean;
      54: invokevirtual #55                 // Method setDefaultValue:(Ljava/lang/Object;)V
      57: return
      58: aload_0
      59: iconst_0
      60: invokestatic  #51                 // Method java/lang/Boolean.valueOf:(Z)Ljava/lang/Boolean;
      63: invokevirtual #55                 // Method setDefaultValue:(Ljava/lang/Object;)V
      66: aload_0
      67: iconst_0
      68: invokevirtual #59                 // Method setEnabled:(Z)V
      71: aload_0
      72: ldc           #60                 // int 2131624147
      74: invokevirtual #63                 // Method setSummary:(I)V
      77: return

  protected void onBindView(android.view.View);
    Code:
       0: aload_0
       1: aload_1
       2: invokespecial #68                 // Method android/preference/CheckBoxPreference.onBindView:(Landroid/view/View;)V
       5: aload_1
       6: ldc           #69                 // int 2131296449
       8: invokevirtual #75                 // Method android/view/View.findViewById:(I)Landroid/view/View;
      11: checkcast     #77                 // class android/widget/ImageView
      14: astore_1
      15: aload_0
      16: getfield      #15                 // Field a:Lryey/easer/commons/local_plugin/d;
      19: instanceof    #79                 // class ryey/easer/commons/local_plugin/c/d
      22: ifeq          68
      25: aload_0
      26: getfield      #15                 // Field a:Lryey/easer/commons/local_plugin/d;
      29: checkcast     #79                 // class ryey/easer/commons/local_plugin/c/d
      32: invokeinterface #83,  1           // InterfaceMethod ryey/easer/commons/local_plugin/c/d.e:()Lryey/easer/commons/local_plugin/c/e;
      37: astore_3
      38: aload_3
      39: getstatic     #89                 // Field ryey/easer/commons/local_plugin/c/e.c:Lryey/easer/commons/local_plugin/c/e;
      42: if_acmpeq     61
      45: aload_3
      46: getstatic     #91                 // Field ryey/easer/commons/local_plugin/c/e.b:Lryey/easer/commons/local_plugin/c/e;
      49: if_acmpne     55
      52: goto          61
      55: bipush        8
      57: istore_2
      58: goto          63
      61: iconst_0
      62: istore_2
      63: aload_1
      64: iload_2
      65: invokevirtual #94                 // Method android/widget/ImageView.setVisibility:(I)V
      68: return

  public boolean onPreferenceChange(android.preference.Preference, java.lang.Object);
    Code:
       0: aload_2
       1: checkcast     #47                 // class java/lang/Boolean
       4: invokevirtual #100                // Method java/lang/Boolean.booleanValue:()Z
       7: ifeq          47
      10: aload_0
      11: getfield      #15                 // Field a:Lryey/easer/commons/local_plugin/d;
      14: aload_0
      15: invokevirtual #104                // Method getContext:()Landroid/content/Context;
      18: invokeinterface #106,  2          // InterfaceMethod ryey/easer/commons/local_plugin/d.b:(Landroid/content/Context;)Z
      23: ifne          47
      26: aload_0
      27: getfield      #15                 // Field a:Lryey/easer/commons/local_plugin/d;
      30: aload_0
      31: invokevirtual #104                // Method getContext:()Landroid/content/Context;
      34: checkcast     #108                // class android/app/Activity
      37: sipush        2333
      40: invokeinterface #111,  3          // InterfaceMethod ryey/easer/commons/local_plugin/d.a:(Landroid/app/Activity;I)V
      45: iconst_0
      46: ireturn
      47: iconst_1
      48: ireturn
}
