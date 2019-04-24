public class ryey.easer.core.ui.MainActivity extends android.support.v7.app.e implements android.support.design.widget.NavigationView$a {
  static {};
    Code:
       0: iconst_1
       1: invokestatic  #19                 // Method android/support/v7/app/g.a:(Z)V
       4: new           #10                 // class ryey/easer/core/ui/MainActivity$a
       7: dup
       8: aconst_null
       9: invokespecial #23                 // Method ryey/easer/core/ui/MainActivity$a."<init>":(Lryey/easer/core/ui/MainActivity$1;)V
      12: putstatic     #25                 // Field a:Lryey/easer/core/ui/MainActivity$a;
      15: return

  public ryey.easer.core.ui.MainActivity();
    Code:
       0: aload_0
       1: invokespecial #28                 // Method android/support/v7/app/e."<init>":()V
       4: return

  void a(int);
    Code:
       0: aload_0
       1: invokevirtual #33                 // Method getSupportFragmentManager:()Landroid/support/v4/app/n;
       4: astore        5
       6: getstatic     #25                 // Field a:Lryey/easer/core/ui/MainActivity$a;
       9: iload_1
      10: invokestatic  #36                 // Method ryey/easer/core/ui/MainActivity$a.a:(Lryey/easer/core/ui/MainActivity$a;I)Ljava/lang/String;
      13: astore        4
      15: iload_1
      16: ldc           #37                 // int 2131296486
      18: if_icmpne     68
      21: aload         5
      23: aload         4
      25: invokevirtual #42                 // Method android/support/v4/app/n.a:(Ljava/lang/String;)Landroid/support/v4/app/i;
      28: astore_3
      29: aload_3
      30: astore_2
      31: aload_3
      32: ifnonnull     43
      35: new           #44                 // class ryey/easer/core/ui/b
      38: dup
      39: invokespecial #45                 // Method ryey/easer/core/ui/b."<init>":()V
      42: astore_2
      43: aload         5
      45: invokevirtual #48                 // Method android/support/v4/app/n.a:()Landroid/support/v4/app/u;
      48: ldc           #49                 // int 2131296353
      50: aload_2
      51: aload         4
      53: invokevirtual #55                 // Method android/support/v4/app/u.b:(ILandroid/support/v4/app/i;Ljava/lang/String;)Landroid/support/v4/app/u;
      56: astore_2
      57: aload_2
      58: aload         4
      60: invokevirtual #58                 // Method android/support/v4/app/u.a:(Ljava/lang/String;)Landroid/support/v4/app/u;
      63: invokevirtual #62                 // Method android/support/v4/app/u.c:()I
      66: pop
      67: return
      68: iload_1
      69: ldc           #63                 // int 2131296487
      71: if_icmpne     99
      74: aload         5
      76: aload         4
      78: invokevirtual #42                 // Method android/support/v4/app/n.a:(Ljava/lang/String;)Landroid/support/v4/app/i;
      81: astore_3
      82: aload_3
      83: astore_2
      84: aload_3
      85: ifnonnull     43
      88: new           #65                 // class ryey/easer/core/ui/c
      91: dup
      92: invokespecial #66                 // Method ryey/easer/core/ui/c."<init>":()V
      95: astore_2
      96: goto          43
      99: iload_1
     100: ldc           #67                 // int 2131296488
     102: if_icmpeq     196
     105: iload_1
     106: ldc           #68                 // int 2131296490
     108: if_icmpeq     196
     111: iload_1
     112: ldc           #69                 // int 2131296489
     114: if_icmpeq     196
     117: iload_1
     118: ldc           #70                 // int 2131296484
     120: if_icmpne     126
     123: goto          196
     126: iload_1
     127: ldc           #71                 // int 2131296483
     129: if_icmpne     149
     132: new           #73                 // class android/content/Intent
     135: dup
     136: aload_0
     137: ldc           #75                 // class ryey/easer/core/ui/AboutActivity
     139: invokespecial #78                 // Method android/content/Intent."<init>":(Landroid/content/Context;Ljava/lang/Class;)V
     142: astore_2
     143: aload_0
     144: aload_2
     145: invokevirtual #82                 // Method startActivity:(Landroid/content/Intent;)V
     148: return
     149: iload_1
     150: ldc           #83                 // int 2131296491
     152: if_icmpne     169
     155: new           #73                 // class android/content/Intent
     158: dup
     159: aload_0
     160: ldc           #85                 // class ryey/easer/core/ui/setting/SettingsActivity
     162: invokespecial #78                 // Method android/content/Intent."<init>":(Landroid/content/Context;Ljava/lang/Class;)V
     165: astore_2
     166: goto          143
     169: iload_1
     170: ldc           #86                 // int 2131296485
     172: if_icmpne     268
     175: aload         5
     177: aload         4
     179: invokevirtual #42                 // Method android/support/v4/app/n.a:(Ljava/lang/String;)Landroid/support/v4/app/i;
     182: astore_3
     183: aload_3
     184: astore_2
     185: aload_3
     186: ifnonnull     43
     189: invokestatic  #91                 // Method ryey/easer/core/ui/a.b:()Lryey/easer/core/ui/a;
     192: astore_2
     193: goto          43
     196: aload         5
     198: aload         4
     200: invokevirtual #42                 // Method android/support/v4/app/n.a:(Ljava/lang/String;)Landroid/support/v4/app/i;
     203: astore_3
     204: aload_3
     205: astore_2
     206: aload_3
     207: ifnonnull     251
     210: getstatic     #25                 // Field a:Lryey/easer/core/ui/MainActivity$a;
     213: iload_1
     214: invokestatic  #94                 // Method ryey/easer/core/ui/MainActivity$a.b:(Lryey/easer/core/ui/MainActivity$a;I)Lryey/easer/core/ui/data/e$a;
     217: astore_2
     218: aload_2
     219: ifnonnull     246
     222: new           #96                 // class java/lang/IllegalStateException
     225: dup
     226: ldc           #98                 // String ListType with mismatched layout id: %s
     228: iconst_1
     229: anewarray     #100                // class java/lang/Object
     232: dup
     233: iconst_0
     234: iload_1
     235: invokestatic  #106                // Method java/lang/Integer.valueOf:(I)Ljava/lang/Integer;
     238: aastore
     239: invokestatic  #112                // Method java/lang/String.format:(Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/String;
     242: invokespecial #115                // Method java/lang/IllegalStateException."<init>":(Ljava/lang/String;)V
     245: athrow
     246: aload_2
     247: invokestatic  #120                // Method ryey/easer/core/ui/data/d.a:(Lryey/easer/core/ui/data/e$a;)Lryey/easer/core/ui/data/d;
     250: astore_2
     251: aload         5
     253: invokevirtual #48                 // Method android/support/v4/app/n.a:()Landroid/support/v4/app/u;
     256: ldc           #49                 // int 2131296353
     258: aload_2
     259: aload         4
     261: invokevirtual #55                 // Method android/support/v4/app/u.b:(ILandroid/support/v4/app/i;Ljava/lang/String;)Landroid/support/v4/app/u;
     264: astore_2
     265: goto          57
     268: return

  public boolean a(android.view.MenuItem);
    Code:
       0: aload_0
       1: aload_1
       2: invokeinterface #126,  1          // InterfaceMethod android/view/MenuItem.getItemId:()I
       7: invokevirtual #128                // Method a:(I)V
      10: aload_0
      11: ldc           #129                // int 2131296374
      13: invokevirtual #133                // Method findViewById:(I)Landroid/view/View;
      16: checkcast     #135                // class android/support/v4/widget/DrawerLayout
      19: ldc           #136                // int 8388611
      21: invokevirtual #139                // Method android/support/v4/widget/DrawerLayout.f:(I)V
      24: iconst_1
      25: ireturn

  public void onBackPressed();
    Code:
       0: aload_0
       1: ldc           #129                // int 2131296374
       3: invokevirtual #133                // Method findViewById:(I)Landroid/view/View;
       6: checkcast     #135                // class android/support/v4/widget/DrawerLayout
       9: astore_1
      10: aload_1
      11: ldc           #136                // int 8388611
      13: invokevirtual #144                // Method android/support/v4/widget/DrawerLayout.g:(I)Z
      16: ifeq          26
      19: aload_1
      20: ldc           #136                // int 8388611
      22: invokevirtual #139                // Method android/support/v4/widget/DrawerLayout.f:(I)V
      25: return
      26: aload_0
      27: invokevirtual #33                 // Method getSupportFragmentManager:()Landroid/support/v4/app/n;
      30: iconst_0
      31: iconst_0
      32: invokevirtual #147                // Method android/support/v4/app/n.a:(II)V
      35: aload_0
      36: ldc           #148                // int 2131296492
      38: invokevirtual #133                // Method findViewById:(I)Landroid/view/View;
      41: checkcast     #150                // class android/support/design/widget/NavigationView
      44: ldc           #37                 // int 2131296486
      46: invokevirtual #153                // Method android/support/design/widget/NavigationView.setCheckedItem:(I)V
      49: aload_0
      50: invokespecial #155                // Method android/support/v7/app/e.onBackPressed:()V
      53: return

  protected void onCreate(android.os.Bundle);
    Code:
       0: aload_0
       1: aload_1
       2: invokespecial #159                // Method android/support/v7/app/e.onCreate:(Landroid/os/Bundle;)V
       5: aload_0
       6: ldc           #160                // int 2131820546
       8: iconst_0
       9: invokestatic  #166                // Method android/preference/PreferenceManager.setDefaultValues:(Landroid/content/Context;IZ)V
      12: aload_0
      13: ldc           #167                // int 2131427363
      15: invokevirtual #170                // Method setContentView:(I)V
      18: aload_0
      19: ldc           #171                // int 2131296724
      21: invokevirtual #133                // Method findViewById:(I)Landroid/view/View;
      24: checkcast     #173                // class android/support/v7/widget/Toolbar
      27: astore_3
      28: aload_0
      29: aload_3
      30: invokevirtual #177                // Method setSupportActionBar:(Landroid/support/v7/widget/Toolbar;)V
      33: aload_0
      34: ldc           #129                // int 2131296374
      36: invokevirtual #133                // Method findViewById:(I)Landroid/view/View;
      39: checkcast     #135                // class android/support/v4/widget/DrawerLayout
      42: astore_2
      43: new           #179                // class android/support/v7/app/b
      46: dup
      47: aload_0
      48: aload_2
      49: aload_3
      50: ldc           #180                // int 2131624152
      52: ldc           #181                // int 2131624151
      54: invokespecial #184                // Method android/support/v7/app/b."<init>":(Landroid/app/Activity;Landroid/support/v4/widget/DrawerLayout;Landroid/support/v7/widget/Toolbar;II)V
      57: astore_3
      58: aload_2
      59: aload_3
      60: invokevirtual #187                // Method android/support/v4/widget/DrawerLayout.a:(Landroid/support/v4/widget/DrawerLayout$c;)V
      63: aload_3
      64: invokevirtual #189                // Method android/support/v7/app/b.a:()V
      67: aload_0
      68: ldc           #148                // int 2131296492
      70: invokevirtual #133                // Method findViewById:(I)Landroid/view/View;
      73: checkcast     #150                // class android/support/design/widget/NavigationView
      76: astore_2
      77: aload_2
      78: aload_0
      79: invokevirtual #193                // Method android/support/design/widget/NavigationView.setNavigationItemSelectedListener:(Landroid/support/design/widget/NavigationView$a;)V
      82: aload_1
      83: ifnonnull     119
      86: aload_2
      87: ldc           #37                 // int 2131296486
      89: invokevirtual #153                // Method android/support/design/widget/NavigationView.setCheckedItem:(I)V
      92: new           #44                 // class ryey/easer/core/ui/b
      95: dup
      96: invokespecial #45                 // Method ryey/easer/core/ui/b."<init>":()V
      99: astore_1
     100: aload_0
     101: invokevirtual #33                 // Method getSupportFragmentManager:()Landroid/support/v4/app/n;
     104: invokevirtual #48                 // Method android/support/v4/app/n.a:()Landroid/support/v4/app/u;
     107: ldc           #49                 // int 2131296353
     109: aload_1
     110: ldc           #195                // String ryey.easer.FRAGMENT.OUTLINE
     112: invokevirtual #55                 // Method android/support/v4/app/u.b:(ILandroid/support/v4/app/i;Ljava/lang/String;)Landroid/support/v4/app/u;
     115: invokevirtual #62                 // Method android/support/v4/app/u.c:()I
     118: pop
     119: getstatic     #200                // Field ryey/easer/core/ui/version_n_info/a.a:Lryey/easer/core/ui/version_n_info/a;
     122: aload_0
     123: invokevirtual #203                // Method ryey/easer/core/ui/version_n_info/a.a:(Landroid/content/Context;)V
     126: getstatic     #208                // Field ryey/easer/core/ui/version_n_info/c.a:Lryey/easer/core/ui/version_n_info/c;
     129: aload_0
     130: invokevirtual #209                // Method ryey/easer/core/ui/version_n_info/c.a:(Landroid/content/Context;)V
     133: getstatic     #208                // Field ryey/easer/core/ui/version_n_info/c.a:Lryey/easer/core/ui/version_n_info/c;
     136: aload_0
     137: invokevirtual #211                // Method ryey/easer/core/ui/version_n_info/c.b:(Landroid/content/Context;)V
     140: return

  protected void onDestroy();
    Code:
       0: aload_0
       1: invokespecial #214                // Method android/support/v7/app/e.onDestroy:()V
       4: return
}
