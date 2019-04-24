public class android.support.v7.app.b implements android.support.v4.widget.DrawerLayout$c {
  boolean a;

  android.view.View$OnClickListener b;

  public android.support.v7.app.b(android.app.Activity, android.support.v4.widget.DrawerLayout, android.support.v7.widget.Toolbar, int, int);
    Code:
       0: aload_0
       1: aload_1
       2: aload_3
       3: aload_2
       4: aconst_null
       5: iload         4
       7: iload         5
       9: invokespecial #40                 // Method "<init>":(Landroid/app/Activity;Landroid/support/v7/widget/Toolbar;Landroid/support/v4/widget/DrawerLayout;Landroid/support/v7/d/a/b;II)V
      12: return

  android.support.v7.app.b(android.app.Activity, android.support.v7.widget.Toolbar, android.support.v4.widget.DrawerLayout, android.support.v7.d.a.b, int, int);
    Code:
       0: aload_0
       1: invokespecial #44                 // Method java/lang/Object."<init>":()V
       4: aload_0
       5: iconst_1
       6: putfield      #46                 // Field f:Z
       9: aload_0
      10: iconst_1
      11: putfield      #48                 // Field a:Z
      14: aload_0
      15: iconst_0
      16: putfield      #50                 // Field j:Z
      19: aload_2
      20: ifnull        50
      23: aload_0
      24: new           #22                 // class android/support/v7/app/b$e
      27: dup
      28: aload_2
      29: invokespecial #53                 // Method android/support/v7/app/b$e."<init>":(Landroid/support/v7/widget/Toolbar;)V
      32: putfield      #55                 // Field c:Landroid/support/v7/app/b$a;
      35: aload_2
      36: new           #8                  // class android/support/v7/app/b$1
      39: dup
      40: aload_0
      41: invokespecial #58                 // Method android/support/v7/app/b$1."<init>":(Landroid/support/v7/app/b;)V
      44: invokevirtual #64                 // Method android/support/v7/widget/Toolbar.setNavigationOnClickListener:(Landroid/view/View$OnClickListener;)V
      47: goto          110
      50: aload_1
      51: instanceof    #13                 // class android/support/v7/app/b$b
      54: ifeq          73
      57: aload_0
      58: aload_1
      59: checkcast     #13                 // class android/support/v7/app/b$b
      62: invokeinterface #68,  1           // InterfaceMethod android/support/v7/app/b$b.getDrawerToggleDelegate:()Landroid/support/v7/app/b$a;
      67: putfield      #55                 // Field c:Landroid/support/v7/app/b$a;
      70: goto          110
      73: getstatic     #73                 // Field android/os/Build$VERSION.SDK_INT:I
      76: bipush        18
      78: if_icmplt     98
      81: new           #19                 // class android/support/v7/app/b$d
      84: dup
      85: aload_1
      86: invokespecial #76                 // Method android/support/v7/app/b$d."<init>":(Landroid/app/Activity;)V
      89: astore_1
      90: aload_0
      91: aload_1
      92: putfield      #55                 // Field c:Landroid/support/v7/app/b$a;
      95: goto          110
      98: new           #16                 // class android/support/v7/app/b$c
     101: dup
     102: aload_1
     103: invokespecial #77                 // Method android/support/v7/app/b$c."<init>":(Landroid/app/Activity;)V
     106: astore_1
     107: goto          90
     110: aload_0
     111: aload_3
     112: putfield      #79                 // Field d:Landroid/support/v4/widget/DrawerLayout;
     115: aload_0
     116: iload         5
     118: putfield      #81                 // Field h:I
     121: aload_0
     122: iload         6
     124: putfield      #83                 // Field i:I
     127: aload         4
     129: ifnonnull     155
     132: aload_0
     133: new           #85                 // class android/support/v7/d/a/b
     136: dup
     137: aload_0
     138: getfield      #55                 // Field c:Landroid/support/v7/app/b$a;
     141: invokeinterface #88,  1           // InterfaceMethod android/support/v7/app/b$a.b:()Landroid/content/Context;
     146: invokespecial #91                 // Method android/support/v7/d/a/b."<init>":(Landroid/content/Context;)V
     149: putfield      #93                 // Field e:Landroid/support/v7/d/a/b;
     152: goto          161
     155: aload_0
     156: aload         4
     158: putfield      #93                 // Field e:Landroid/support/v7/d/a/b;
     161: aload_0
     162: aload_0
     163: invokevirtual #96                 // Method c:()Landroid/graphics/drawable/Drawable;
     166: putfield      #98                 // Field g:Landroid/graphics/drawable/Drawable;
     169: return

  public void a();
    Code:
       0: aload_0
       1: getfield      #79                 // Field d:Landroid/support/v4/widget/DrawerLayout;
       4: ldc           #105                // int 8388611
       6: invokevirtual #110                // Method android/support/v4/widget/DrawerLayout.g:(I)Z
       9: ifeq          22
      12: fconst_1
      13: fstore_1
      14: aload_0
      15: fload_1
      16: invokespecial #112                // Method a:(F)V
      19: goto          27
      22: fconst_0
      23: fstore_1
      24: goto          14
      27: aload_0
      28: getfield      #48                 // Field a:Z
      31: ifeq          70
      34: aload_0
      35: getfield      #93                 // Field e:Landroid/support/v7/d/a/b;
      38: astore_3
      39: aload_0
      40: getfield      #79                 // Field d:Landroid/support/v4/widget/DrawerLayout;
      43: ldc           #105                // int 8388611
      45: invokevirtual #110                // Method android/support/v4/widget/DrawerLayout.g:(I)Z
      48: ifeq          59
      51: aload_0
      52: getfield      #83                 // Field i:I
      55: istore_2
      56: goto          64
      59: aload_0
      60: getfield      #81                 // Field h:I
      63: istore_2
      64: aload_0
      65: aload_3
      66: iload_2
      67: invokevirtual #115                // Method a:(Landroid/graphics/drawable/Drawable;I)V
      70: return

  public void a(int);
    Code:
       0: return

  void a(android.graphics.drawable.Drawable, int);
    Code:
       0: aload_0
       1: getfield      #50                 // Field j:Z
       4: ifne          32
       7: aload_0
       8: getfield      #55                 // Field c:Landroid/support/v7/app/b$a;
      11: invokeinterface #119,  1          // InterfaceMethod android/support/v7/app/b$a.c:()Z
      16: ifne          32
      19: ldc           #121                // String ActionBarDrawerToggle
      21: ldc           #123                // String DrawerToggle may not show up because NavigationIcon is not visible. You may need to call actionbar.setDisplayHomeAsUpEnabled(true);
      23: invokestatic  #129                // Method android/util/Log.w:(Ljava/lang/String;Ljava/lang/String;)I
      26: pop
      27: aload_0
      28: iconst_1
      29: putfield      #50                 // Field j:Z
      32: aload_0
      33: getfield      #55                 // Field c:Landroid/support/v7/app/b$a;
      36: aload_1
      37: iload_2
      38: invokeinterface #130,  3          // InterfaceMethod android/support/v7/app/b$a.a:(Landroid/graphics/drawable/Drawable;I)V
      43: return

  public void a(android.view.View);
    Code:
       0: aload_0
       1: fconst_1
       2: invokespecial #112                // Method a:(F)V
       5: aload_0
       6: getfield      #48                 // Field a:Z
       9: ifeq          20
      12: aload_0
      13: aload_0
      14: getfield      #83                 // Field i:I
      17: invokevirtual #133                // Method b:(I)V
      20: return

  public void a(android.view.View, float);
    Code:
       0: aload_0
       1: getfield      #46                 // Field f:Z
       4: ifeq          21
       7: aload_0
       8: fconst_1
       9: fconst_0
      10: fload_2
      11: invokestatic  #140                // Method java/lang/Math.max:(FF)F
      14: invokestatic  #143                // Method java/lang/Math.min:(FF)F
      17: invokespecial #112                // Method a:(F)V
      20: return
      21: aload_0
      22: fconst_0
      23: invokespecial #112                // Method a:(F)V
      26: return

  void b();
    Code:
       0: aload_0
       1: getfield      #79                 // Field d:Landroid/support/v4/widget/DrawerLayout;
       4: ldc           #105                // int 8388611
       6: invokevirtual #146                // Method android/support/v4/widget/DrawerLayout.a:(I)I
       9: istore_1
      10: aload_0
      11: getfield      #79                 // Field d:Landroid/support/v4/widget/DrawerLayout;
      14: ldc           #105                // int 8388611
      16: invokevirtual #148                // Method android/support/v4/widget/DrawerLayout.h:(I)Z
      19: ifeq          37
      22: iload_1
      23: iconst_2
      24: if_icmpeq     37
      27: aload_0
      28: getfield      #79                 // Field d:Landroid/support/v4/widget/DrawerLayout;
      31: ldc           #105                // int 8388611
      33: invokevirtual #150                // Method android/support/v4/widget/DrawerLayout.f:(I)V
      36: return
      37: iload_1
      38: iconst_1
      39: if_icmpeq     51
      42: aload_0
      43: getfield      #79                 // Field d:Landroid/support/v4/widget/DrawerLayout;
      46: ldc           #105                // int 8388611
      48: invokevirtual #152                // Method android/support/v4/widget/DrawerLayout.e:(I)V
      51: return

  void b(int);
    Code:
       0: aload_0
       1: getfield      #55                 // Field c:Landroid/support/v7/app/b$a;
       4: iload_1
       5: invokeinterface #154,  2          // InterfaceMethod android/support/v7/app/b$a.a:(I)V
      10: return

  public void b(android.view.View);
    Code:
       0: aload_0
       1: fconst_0
       2: invokespecial #112                // Method a:(F)V
       5: aload_0
       6: getfield      #48                 // Field a:Z
       9: ifeq          20
      12: aload_0
      13: aload_0
      14: getfield      #81                 // Field h:I
      17: invokevirtual #133                // Method b:(I)V
      20: return

  android.graphics.drawable.Drawable c();
    Code:
       0: aload_0
       1: getfield      #55                 // Field c:Landroid/support/v7/app/b$a;
       4: invokeinterface #156,  1          // InterfaceMethod android/support/v7/app/b$a.a:()Landroid/graphics/drawable/Drawable;
       9: areturn
}
