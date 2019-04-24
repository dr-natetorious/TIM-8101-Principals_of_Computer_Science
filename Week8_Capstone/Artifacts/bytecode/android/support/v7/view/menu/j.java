public final class android.support.v7.view.menu.j implements android.support.v4.c.a.b {
  android.support.v7.view.menu.h a;

  android.support.v7.view.menu.j(android.support.v7.view.menu.h, int, int, int, int, java.lang.CharSequence, int);
    Code:
       0: aload_0
       1: invokespecial #63                 // Method java/lang/Object."<init>":()V
       4: aload_0
       5: sipush        4096
       8: putfield      #65                 // Field j:I
      11: aload_0
      12: sipush        4096
      15: putfield      #67                 // Field l:I
      18: aload_0
      19: iconst_0
      20: putfield      #69                 // Field n:I
      23: aload_0
      24: aconst_null
      25: putfield      #71                 // Field t:Landroid/content/res/ColorStateList;
      28: aload_0
      29: aconst_null
      30: putfield      #73                 // Field u:Landroid/graphics/PorterDuff$Mode;
      33: aload_0
      34: iconst_0
      35: putfield      #75                 // Field v:Z
      38: aload_0
      39: iconst_0
      40: putfield      #77                 // Field w:Z
      43: aload_0
      44: iconst_0
      45: putfield      #79                 // Field x:Z
      48: aload_0
      49: bipush        16
      51: putfield      #81                 // Field y:I
      54: aload_0
      55: iconst_0
      56: putfield      #83                 // Field z:I
      59: aload_0
      60: iconst_0
      61: putfield      #85                 // Field D:Z
      64: aload_0
      65: aload_1
      66: putfield      #87                 // Field a:Landroid/support/v7/view/menu/h;
      69: aload_0
      70: iload_3
      71: putfield      #89                 // Field b:I
      74: aload_0
      75: iload_2
      76: putfield      #91                 // Field c:I
      79: aload_0
      80: iload         4
      82: putfield      #93                 // Field d:I
      85: aload_0
      86: iload         5
      88: putfield      #95                 // Field e:I
      91: aload_0
      92: aload         6
      94: putfield      #97                 // Field f:Ljava/lang/CharSequence;
      97: aload_0
      98: iload         7
     100: putfield      #83                 // Field z:I
     103: return

  public android.support.v4.c.a.b a(int);
    Code:
       0: aload_0
       1: getfield      #87                 // Field a:Landroid/support/v7/view/menu/h;
       4: invokevirtual #121                // Method android/support/v7/view/menu/h.e:()Landroid/content/Context;
       7: astore_2
       8: aload_0
       9: aload_2
      10: invokestatic  #127                // Method android/view/LayoutInflater.from:(Landroid/content/Context;)Landroid/view/LayoutInflater;
      13: iload_1
      14: new           #129                // class android/widget/LinearLayout
      17: dup
      18: aload_2
      19: invokespecial #132                // Method android/widget/LinearLayout."<init>":(Landroid/content/Context;)V
      22: iconst_0
      23: invokevirtual #136                // Method android/view/LayoutInflater.inflate:(ILandroid/view/ViewGroup;Z)Landroid/view/View;
      26: invokevirtual #139                // Method a:(Landroid/view/View;)Landroid/support/v4/c/a/b;
      29: pop
      30: aload_0
      31: areturn

  public android.support.v4.c.a.b a(android.support.v4.view.c);
    Code:
       0: aload_0
       1: getfield      #142                // Field B:Landroid/support/v4/view/c;
       4: ifnull        14
       7: aload_0
       8: getfield      #142                // Field B:Landroid/support/v4/view/c;
      11: invokevirtual #146                // Method android/support/v4/view/c.f:()V
      14: aload_0
      15: aconst_null
      16: putfield      #148                // Field A:Landroid/view/View;
      19: aload_0
      20: aload_1
      21: putfield      #142                // Field B:Landroid/support/v4/view/c;
      24: aload_0
      25: getfield      #87                 // Field a:Landroid/support/v7/view/menu/h;
      28: iconst_1
      29: invokevirtual #151                // Method android/support/v7/view/menu/h.a:(Z)V
      32: aload_0
      33: getfield      #142                // Field B:Landroid/support/v4/view/c;
      36: ifnull        54
      39: aload_0
      40: getfield      #142                // Field B:Landroid/support/v4/view/c;
      43: new           #8                  // class android/support/v7/view/menu/j$1
      46: dup
      47: aload_0
      48: invokespecial #154                // Method android/support/v7/view/menu/j$1."<init>":(Landroid/support/v7/view/menu/j;)V
      51: invokevirtual #157                // Method android/support/v4/view/c.a:(Landroid/support/v4/view/c$b;)V
      54: aload_0
      55: areturn

  public android.support.v4.c.a.b a(android.view.View);
    Code:
       0: aload_0
       1: aload_1
       2: putfield      #148                // Field A:Landroid/view/View;
       5: aload_0
       6: aconst_null
       7: putfield      #142                // Field B:Landroid/support/v4/view/c;
      10: aload_1
      11: ifnull        37
      14: aload_1
      15: invokevirtual #163                // Method android/view/View.getId:()I
      18: iconst_m1
      19: if_icmpne     37
      22: aload_0
      23: getfield      #89                 // Field b:I
      26: ifle          37
      29: aload_1
      30: aload_0
      31: getfield      #89                 // Field b:I
      34: invokevirtual #167                // Method android/view/View.setId:(I)V
      37: aload_0
      38: getfield      #87                 // Field a:Landroid/support/v7/view/menu/h;
      41: aload_0
      42: invokevirtual #169                // Method android/support/v7/view/menu/h.b:(Landroid/support/v7/view/menu/j;)V
      45: aload_0
      46: areturn

  public android.support.v4.c.a.b a(java.lang.CharSequence);
    Code:
       0: aload_0
       1: aload_1
       2: putfield      #172                // Field r:Ljava/lang/CharSequence;
       5: aload_0
       6: getfield      #87                 // Field a:Landroid/support/v7/view/menu/h;
       9: iconst_0
      10: invokevirtual #151                // Method android/support/v7/view/menu/h.a:(Z)V
      13: aload_0
      14: areturn

  public android.support.v4.view.c a();
    Code:
       0: aload_0
       1: getfield      #142                // Field B:Landroid/support/v4/view/c;
       4: areturn

  java.lang.CharSequence a(android.support.v7.view.menu.p$a);
    Code:
       0: aload_1
       1: ifnull        18
       4: aload_1
       5: invokeinterface #179,  1          // InterfaceMethod android/support/v7/view/menu/p$a.b:()Z
      10: ifeq          18
      13: aload_0
      14: invokevirtual #183                // Method getTitleCondensed:()Ljava/lang/CharSequence;
      17: areturn
      18: aload_0
      19: invokevirtual #186                // Method getTitle:()Ljava/lang/CharSequence;
      22: areturn

  public void a(android.support.v7.view.menu.u);
    Code:
       0: aload_0
       1: aload_1
       2: putfield      #189                // Field o:Landroid/support/v7/view/menu/u;
       5: aload_1
       6: aload_0
       7: invokevirtual #186                // Method getTitle:()Ljava/lang/CharSequence;
      10: invokevirtual #195                // Method android/support/v7/view/menu/u.setHeaderTitle:(Ljava/lang/CharSequence;)Landroid/view/SubMenu;
      13: pop
      14: return

  void a(android.view.ContextMenu$ContextMenuInfo);
    Code:
       0: aload_0
       1: aload_1
       2: putfield      #198                // Field E:Landroid/view/ContextMenu$ContextMenuInfo;
       5: return

  public void a(boolean);
    Code:
       0: aload_0
       1: getfield      #81                 // Field y:I
       4: istore_3
       5: iload_1
       6: ifeq          14
       9: iconst_4
      10: istore_2
      11: goto          16
      14: iconst_0
      15: istore_2
      16: aload_0
      17: iload_2
      18: iload_3
      19: bipush        -5
      21: iand
      22: ior
      23: putfield      #81                 // Field y:I
      26: return

  public android.support.v4.c.a.b b(int);
    Code:
       0: aload_0
       1: iload_1
       2: invokevirtual #201                // Method setShowAsAction:(I)V
       5: aload_0
       6: areturn

  public android.support.v4.c.a.b b(java.lang.CharSequence);
    Code:
       0: aload_0
       1: aload_1
       2: putfield      #203                // Field s:Ljava/lang/CharSequence;
       5: aload_0
       6: getfield      #87                 // Field a:Landroid/support/v7/view/menu/h;
       9: iconst_0
      10: invokevirtual #151                // Method android/support/v7/view/menu/h.a:(Z)V
      13: aload_0
      14: areturn

  void b(boolean);
    Code:
       0: aload_0
       1: getfield      #81                 // Field y:I
       4: istore_3
       5: aload_0
       6: getfield      #81                 // Field y:I
       9: istore        4
      11: iload_1
      12: ifeq          20
      15: iconst_2
      16: istore_2
      17: goto          22
      20: iconst_0
      21: istore_2
      22: aload_0
      23: iload_2
      24: iload         4
      26: bipush        -3
      28: iand
      29: ior
      30: putfield      #81                 // Field y:I
      33: iload_3
      34: aload_0
      35: getfield      #81                 // Field y:I
      38: if_icmpeq     49
      41: aload_0
      42: getfield      #87                 // Field a:Landroid/support/v7/view/menu/h;
      45: iconst_0
      46: invokevirtual #151                // Method android/support/v7/view/menu/h.a:(Z)V
      49: return

  public boolean b();
    Code:
       0: aload_0
       1: getfield      #207                // Field q:Landroid/view/MenuItem$OnMenuItemClickListener;
       4: ifnull        22
       7: aload_0
       8: getfield      #207                // Field q:Landroid/view/MenuItem$OnMenuItemClickListener;
      11: aload_0
      12: invokeinterface #213,  2          // InterfaceMethod android/view/MenuItem$OnMenuItemClickListener.onMenuItemClick:(Landroid/view/MenuItem;)Z
      17: ifeq          22
      20: iconst_1
      21: ireturn
      22: aload_0
      23: getfield      #87                 // Field a:Landroid/support/v7/view/menu/h;
      26: aload_0
      27: getfield      #87                 // Field a:Landroid/support/v7/view/menu/h;
      30: aload_0
      31: invokevirtual #216                // Method android/support/v7/view/menu/h.a:(Landroid/support/v7/view/menu/h;Landroid/view/MenuItem;)Z
      34: ifeq          39
      37: iconst_1
      38: ireturn
      39: aload_0
      40: getfield      #218                // Field p:Ljava/lang/Runnable;
      43: ifnull        57
      46: aload_0
      47: getfield      #218                // Field p:Ljava/lang/Runnable;
      50: invokeinterface #223,  1          // InterfaceMethod java/lang/Runnable.run:()V
      55: iconst_1
      56: ireturn
      57: aload_0
      58: getfield      #225                // Field h:Landroid/content/Intent;
      61: ifnull        90
      64: aload_0
      65: getfield      #87                 // Field a:Landroid/support/v7/view/menu/h;
      68: invokevirtual #121                // Method android/support/v7/view/menu/h.e:()Landroid/content/Context;
      71: aload_0
      72: getfield      #225                // Field h:Landroid/content/Intent;
      75: invokevirtual #231                // Method android/content/Context.startActivity:(Landroid/content/Intent;)V
      78: iconst_1
      79: ireturn
      80: astore_1
      81: ldc           #233                // String MenuItemImpl
      83: ldc           #235                // String Can't find activity to handle intent; ignoring
      85: aload_1
      86: invokestatic  #240                // Method android/util/Log.e:(Ljava/lang/String;Ljava/lang/String;Ljava/lang/Throwable;)I
      89: pop
      90: aload_0
      91: getfield      #142                // Field B:Landroid/support/v4/view/c;
      94: ifnull        109
      97: aload_0
      98: getfield      #142                // Field B:Landroid/support/v4/view/c;
     101: invokevirtual #242                // Method android/support/v4/view/c.d:()Z
     104: ifeq          109
     107: iconst_1
     108: ireturn
     109: iconst_0
     110: ireturn
    Exception table:
       from    to  target type
          64    78    80   Class android/content/ActivityNotFoundException

  public int c();
    Code:
       0: aload_0
       1: getfield      #95                 // Field e:I
       4: ireturn

  boolean c(boolean);
    Code:
       0: aload_0
       1: getfield      #81                 // Field y:I
       4: istore_3
       5: aload_0
       6: getfield      #81                 // Field y:I
       9: istore        4
      11: iconst_0
      12: istore        5
      14: iload_1
      15: ifeq          23
      18: iconst_0
      19: istore_2
      20: goto          26
      23: bipush        8
      25: istore_2
      26: aload_0
      27: iload_2
      28: iload         4
      30: bipush        -9
      32: iand
      33: ior
      34: putfield      #81                 // Field y:I
      37: iload         5
      39: istore_1
      40: iload_3
      41: aload_0
      42: getfield      #81                 // Field y:I
      45: if_icmpeq     50
      48: iconst_1
      49: istore_1
      50: iload_1
      51: ireturn

  public boolean collapseActionView();
    Code:
       0: aload_0
       1: getfield      #83                 // Field z:I
       4: bipush        8
       6: iand
       7: ifne          12
      10: iconst_0
      11: ireturn
      12: aload_0
      13: getfield      #148                // Field A:Landroid/view/View;
      16: ifnonnull     21
      19: iconst_1
      20: ireturn
      21: aload_0
      22: getfield      #246                // Field C:Landroid/view/MenuItem$OnActionExpandListener;
      25: ifnull        46
      28: aload_0
      29: getfield      #246                // Field C:Landroid/view/MenuItem$OnActionExpandListener;
      32: aload_0
      33: invokeinterface #251,  2          // InterfaceMethod android/view/MenuItem$OnActionExpandListener.onMenuItemActionCollapse:(Landroid/view/MenuItem;)Z
      38: ifeq          44
      41: goto          46
      44: iconst_0
      45: ireturn
      46: aload_0
      47: getfield      #87                 // Field a:Landroid/support/v7/view/menu/h;
      50: aload_0
      51: invokevirtual #254                // Method android/support/v7/view/menu/h.d:(Landroid/support/v7/view/menu/j;)Z
      54: ireturn

  char d();
    Code:
       0: aload_0
       1: getfield      #87                 // Field a:Landroid/support/v7/view/menu/h;
       4: invokevirtual #256                // Method android/support/v7/view/menu/h.b:()Z
       7: ifeq          15
      10: aload_0
      11: getfield      #258                // Field k:C
      14: ireturn
      15: aload_0
      16: getfield      #260                // Field i:C
      19: ireturn

  public void d(boolean);
    Code:
       0: iload_1
       1: ifeq          18
       4: aload_0
       5: getfield      #81                 // Field y:I
       8: bipush        32
      10: ior
      11: istore_2
      12: aload_0
      13: iload_2
      14: putfield      #81                 // Field y:I
      17: return
      18: aload_0
      19: getfield      #81                 // Field y:I
      22: bipush        -33
      24: iand
      25: istore_2
      26: goto          12

  java.lang.String e();
    Code:
       0: aload_0
       1: invokevirtual #263                // Method d:()C
       4: istore_1
       5: iload_1
       6: ifne          13
       9: ldc_w         #265                // String
      12: areturn
      13: new           #267                // class java/lang/StringBuilder
      16: dup
      17: getstatic     #269                // Field F:Ljava/lang/String;
      20: invokespecial #272                // Method java/lang/StringBuilder."<init>":(Ljava/lang/String;)V
      23: astore_3
      24: iload_1
      25: bipush        8
      27: if_icmpeq     65
      30: iload_1
      31: bipush        10
      33: if_icmpeq     58
      36: iload_1
      37: bipush        32
      39: if_icmpeq     51
      42: aload_3
      43: iload_1
      44: invokevirtual #276                // Method java/lang/StringBuilder.append:(C)Ljava/lang/StringBuilder;
      47: pop
      48: goto          75
      51: getstatic     #278                // Field I:Ljava/lang/String;
      54: astore_2
      55: goto          69
      58: getstatic     #280                // Field G:Ljava/lang/String;
      61: astore_2
      62: goto          69
      65: getstatic     #282                // Field H:Ljava/lang/String;
      68: astore_2
      69: aload_3
      70: aload_2
      71: invokevirtual #285                // Method java/lang/StringBuilder.append:(Ljava/lang/String;)Ljava/lang/StringBuilder;
      74: pop
      75: aload_3
      76: invokevirtual #288                // Method java/lang/StringBuilder.toString:()Ljava/lang/String;
      79: areturn

  public void e(boolean);
    Code:
       0: aload_0
       1: iload_1
       2: putfield      #85                 // Field D:Z
       5: aload_0
       6: getfield      #87                 // Field a:Landroid/support/v7/view/menu/h;
       9: iconst_0
      10: invokevirtual #151                // Method android/support/v7/view/menu/h.a:(Z)V
      13: return

  public boolean expandActionView();
    Code:
       0: aload_0
       1: invokevirtual #291                // Method n:()Z
       4: ifne          9
       7: iconst_0
       8: ireturn
       9: aload_0
      10: getfield      #246                // Field C:Landroid/view/MenuItem$OnActionExpandListener;
      13: ifnull        34
      16: aload_0
      17: getfield      #246                // Field C:Landroid/view/MenuItem$OnActionExpandListener;
      20: aload_0
      21: invokeinterface #294,  2          // InterfaceMethod android/view/MenuItem$OnActionExpandListener.onMenuItemActionExpand:(Landroid/view/MenuItem;)Z
      26: ifeq          32
      29: goto          34
      32: iconst_0
      33: ireturn
      34: aload_0
      35: getfield      #87                 // Field a:Landroid/support/v7/view/menu/h;
      38: aload_0
      39: invokevirtual #296                // Method android/support/v7/view/menu/h.c:(Landroid/support/v7/view/menu/j;)Z
      42: ireturn

  boolean f();
    Code:
       0: aload_0
       1: getfield      #87                 // Field a:Landroid/support/v7/view/menu/h;
       4: invokevirtual #298                // Method android/support/v7/view/menu/h.c:()Z
       7: ifeq          19
      10: aload_0
      11: invokevirtual #263                // Method d:()C
      14: ifeq          19
      17: iconst_1
      18: ireturn
      19: iconst_0
      20: ireturn

  public boolean g();
    Code:
       0: aload_0
       1: getfield      #81                 // Field y:I
       4: iconst_4
       5: iand
       6: ifeq          11
       9: iconst_1
      10: ireturn
      11: iconst_0
      12: ireturn

  public android.view.ActionProvider getActionProvider();
    Code:
       0: new           #302                // class java/lang/UnsupportedOperationException
       3: dup
       4: ldc_w         #304                // String This is not supported, use MenuItemCompat.getActionProvider()
       7: invokespecial #305                // Method java/lang/UnsupportedOperationException."<init>":(Ljava/lang/String;)V
      10: athrow

  public android.view.View getActionView();
    Code:
       0: aload_0
       1: getfield      #148                // Field A:Landroid/view/View;
       4: ifnull        12
       7: aload_0
       8: getfield      #148                // Field A:Landroid/view/View;
      11: areturn
      12: aload_0
      13: getfield      #142                // Field B:Landroid/support/v4/view/c;
      16: ifnull        36
      19: aload_0
      20: aload_0
      21: getfield      #142                // Field B:Landroid/support/v4/view/c;
      24: aload_0
      25: invokevirtual #310                // Method android/support/v4/view/c.a:(Landroid/view/MenuItem;)Landroid/view/View;
      28: putfield      #148                // Field A:Landroid/view/View;
      31: aload_0
      32: getfield      #148                // Field A:Landroid/view/View;
      35: areturn
      36: aconst_null
      37: areturn

  public int getAlphabeticModifiers();
    Code:
       0: aload_0
       1: getfield      #67                 // Field l:I
       4: ireturn

  public char getAlphabeticShortcut();
    Code:
       0: aload_0
       1: getfield      #258                // Field k:C
       4: ireturn

  public java.lang.CharSequence getContentDescription();
    Code:
       0: aload_0
       1: getfield      #172                // Field r:Ljava/lang/CharSequence;
       4: areturn

  public int getGroupId();
    Code:
       0: aload_0
       1: getfield      #91                 // Field c:I
       4: ireturn

  public android.graphics.drawable.Drawable getIcon();
    Code:
       0: aload_0
       1: getfield      #317                // Field m:Landroid/graphics/drawable/Drawable;
       4: ifnull        18
       7: aload_0
       8: getfield      #317                // Field m:Landroid/graphics/drawable/Drawable;
      11: astore_1
      12: aload_0
      13: aload_1
      14: invokespecial #319                // Method a:(Landroid/graphics/drawable/Drawable;)Landroid/graphics/drawable/Drawable;
      17: areturn
      18: aload_0
      19: getfield      #69                 // Field n:I
      22: ifeq          53
      25: aload_0
      26: getfield      #87                 // Field a:Landroid/support/v7/view/menu/h;
      29: invokevirtual #121                // Method android/support/v7/view/menu/h.e:()Landroid/content/Context;
      32: aload_0
      33: getfield      #69                 // Field n:I
      36: invokestatic  #324                // Method android/support/v7/c/a/b.b:(Landroid/content/Context;I)Landroid/graphics/drawable/Drawable;
      39: astore_1
      40: aload_0
      41: iconst_0
      42: putfield      #69                 // Field n:I
      45: aload_0
      46: aload_1
      47: putfield      #317                // Field m:Landroid/graphics/drawable/Drawable;
      50: goto          12
      53: aconst_null
      54: areturn

  public android.content.res.ColorStateList getIconTintList();
    Code:
       0: aload_0
       1: getfield      #71                 // Field t:Landroid/content/res/ColorStateList;
       4: areturn

  public android.graphics.PorterDuff$Mode getIconTintMode();
    Code:
       0: aload_0
       1: getfield      #73                 // Field u:Landroid/graphics/PorterDuff$Mode;
       4: areturn

  public android.content.Intent getIntent();
    Code:
       0: aload_0
       1: getfield      #225                // Field h:Landroid/content/Intent;
       4: areturn

  public int getItemId();
    Code:
       0: aload_0
       1: getfield      #89                 // Field b:I
       4: ireturn

  public android.view.ContextMenu$ContextMenuInfo getMenuInfo();
    Code:
       0: aload_0
       1: getfield      #198                // Field E:Landroid/view/ContextMenu$ContextMenuInfo;
       4: areturn

  public int getNumericModifiers();
    Code:
       0: aload_0
       1: getfield      #65                 // Field j:I
       4: ireturn

  public char getNumericShortcut();
    Code:
       0: aload_0
       1: getfield      #260                // Field i:C
       4: ireturn

  public int getOrder();
    Code:
       0: aload_0
       1: getfield      #93                 // Field d:I
       4: ireturn

  public android.view.SubMenu getSubMenu();
    Code:
       0: aload_0
       1: getfield      #189                // Field o:Landroid/support/v7/view/menu/u;
       4: areturn

  public java.lang.CharSequence getTitle();
    Code:
       0: aload_0
       1: getfield      #97                 // Field f:Ljava/lang/CharSequence;
       4: areturn

  public java.lang.CharSequence getTitleCondensed();
    Code:
       0: aload_0
       1: getfield      #342                // Field g:Ljava/lang/CharSequence;
       4: ifnull        15
       7: aload_0
       8: getfield      #342                // Field g:Ljava/lang/CharSequence;
      11: astore_1
      12: goto          20
      15: aload_0
      16: getfield      #97                 // Field f:Ljava/lang/CharSequence;
      19: astore_1
      20: aload_1
      21: astore_2
      22: getstatic     #347                // Field android/os/Build$VERSION.SDK_INT:I
      25: bipush        18
      27: if_icmpge     52
      30: aload_1
      31: astore_2
      32: aload_1
      33: ifnull        52
      36: aload_1
      37: astore_2
      38: aload_1
      39: instanceof    #349                // class java/lang/String
      42: ifne          52
      45: aload_1
      46: invokeinterface #352,  1          // InterfaceMethod java/lang/CharSequence.toString:()Ljava/lang/String;
      51: astore_2
      52: aload_2
      53: areturn

  public java.lang.CharSequence getTooltipText();
    Code:
       0: aload_0
       1: getfield      #203                // Field s:Ljava/lang/CharSequence;
       4: areturn

  public void h();
    Code:
       0: aload_0
       1: getfield      #87                 // Field a:Landroid/support/v7/view/menu/h;
       4: aload_0
       5: invokevirtual #169                // Method android/support/v7/view/menu/h.b:(Landroid/support/v7/view/menu/j;)V
       8: return

  public boolean hasSubMenu();
    Code:
       0: aload_0
       1: getfield      #189                // Field o:Landroid/support/v7/view/menu/u;
       4: ifnull        9
       7: iconst_1
       8: ireturn
       9: iconst_0
      10: ireturn

  public boolean i();
    Code:
       0: aload_0
       1: getfield      #87                 // Field a:Landroid/support/v7/view/menu/h;
       4: invokevirtual #356                // Method android/support/v7/view/menu/h.q:()Z
       7: ireturn

  public boolean isActionViewExpanded();
    Code:
       0: aload_0
       1: getfield      #85                 // Field D:Z
       4: ireturn

  public boolean isCheckable();
    Code:
       0: aload_0
       1: getfield      #81                 // Field y:I
       4: iconst_1
       5: iand
       6: iconst_1
       7: if_icmpne     12
      10: iconst_1
      11: ireturn
      12: iconst_0
      13: ireturn

  public boolean isChecked();
    Code:
       0: aload_0
       1: getfield      #81                 // Field y:I
       4: iconst_2
       5: iand
       6: iconst_2
       7: if_icmpne     12
      10: iconst_1
      11: ireturn
      12: iconst_0
      13: ireturn

  public boolean isEnabled();
    Code:
       0: aload_0
       1: getfield      #81                 // Field y:I
       4: bipush        16
       6: iand
       7: ifeq          12
      10: iconst_1
      11: ireturn
      12: iconst_0
      13: ireturn

  public boolean isVisible();
    Code:
       0: aload_0
       1: getfield      #142                // Field B:Landroid/support/v4/view/c;
       4: astore_3
       5: iconst_0
       6: istore_1
       7: iconst_0
       8: istore_2
       9: aload_3
      10: ifnull        51
      13: aload_0
      14: getfield      #142                // Field B:Landroid/support/v4/view/c;
      17: invokevirtual #362                // Method android/support/v4/view/c.b:()Z
      20: ifeq          51
      23: iload_2
      24: istore_1
      25: aload_0
      26: getfield      #81                 // Field y:I
      29: bipush        8
      31: iand
      32: ifne          49
      35: iload_2
      36: istore_1
      37: aload_0
      38: getfield      #142                // Field B:Landroid/support/v4/view/c;
      41: invokevirtual #363                // Method android/support/v4/view/c.c:()Z
      44: ifeq          49
      47: iconst_1
      48: istore_1
      49: iload_1
      50: ireturn
      51: aload_0
      52: getfield      #81                 // Field y:I
      55: bipush        8
      57: iand
      58: ifne          63
      61: iconst_1
      62: istore_1
      63: iload_1
      64: ireturn

  public boolean j();
    Code:
       0: aload_0
       1: getfield      #81                 // Field y:I
       4: bipush        32
       6: iand
       7: bipush        32
       9: if_icmpne     14
      12: iconst_1
      13: ireturn
      14: iconst_0
      15: ireturn

  public boolean k();
    Code:
       0: aload_0
       1: getfield      #83                 // Field z:I
       4: iconst_1
       5: iand
       6: iconst_1
       7: if_icmpne     12
      10: iconst_1
      11: ireturn
      12: iconst_0
      13: ireturn

  public boolean l();
    Code:
       0: aload_0
       1: getfield      #83                 // Field z:I
       4: iconst_2
       5: iand
       6: iconst_2
       7: if_icmpne     12
      10: iconst_1
      11: ireturn
      12: iconst_0
      13: ireturn

  public boolean m();
    Code:
       0: aload_0
       1: getfield      #83                 // Field z:I
       4: iconst_4
       5: iand
       6: iconst_4
       7: if_icmpne     12
      10: iconst_1
      11: ireturn
      12: iconst_0
      13: ireturn

  public boolean n();
    Code:
       0: aload_0
       1: getfield      #83                 // Field z:I
       4: istore_1
       5: iconst_0
       6: istore_3
       7: iload_3
       8: istore_2
       9: iload_1
      10: bipush        8
      12: iand
      13: ifeq          53
      16: aload_0
      17: getfield      #148                // Field A:Landroid/view/View;
      20: ifnonnull     42
      23: aload_0
      24: getfield      #142                // Field B:Landroid/support/v4/view/c;
      27: ifnull        42
      30: aload_0
      31: aload_0
      32: getfield      #142                // Field B:Landroid/support/v4/view/c;
      35: aload_0
      36: invokevirtual #310                // Method android/support/v4/view/c.a:(Landroid/view/MenuItem;)Landroid/view/View;
      39: putfield      #148                // Field A:Landroid/view/View;
      42: iload_3
      43: istore_2
      44: aload_0
      45: getfield      #148                // Field A:Landroid/view/View;
      48: ifnull        53
      51: iconst_1
      52: istore_2
      53: iload_2
      54: ireturn

  public android.view.MenuItem setActionProvider(android.view.ActionProvider);
    Code:
       0: new           #302                // class java/lang/UnsupportedOperationException
       3: dup
       4: ldc_w         #367                // String This is not supported, use MenuItemCompat.setActionProvider()
       7: invokespecial #305                // Method java/lang/UnsupportedOperationException."<init>":(Ljava/lang/String;)V
      10: athrow

  public android.view.MenuItem setActionView(int);
    Code:
       0: aload_0
       1: iload_1
       2: invokevirtual #371                // Method a:(I)Landroid/support/v4/c/a/b;
       5: areturn

  public android.view.MenuItem setActionView(android.view.View);
    Code:
       0: aload_0
       1: aload_1
       2: invokevirtual #139                // Method a:(Landroid/view/View;)Landroid/support/v4/c/a/b;
       5: areturn

  public android.view.MenuItem setAlphabeticShortcut(char);
    Code:
       0: aload_0
       1: getfield      #258                // Field k:C
       4: iload_1
       5: if_icmpne     10
       8: aload_0
       9: areturn
      10: aload_0
      11: iload_1
      12: invokestatic  #380                // Method java/lang/Character.toLowerCase:(C)C
      15: putfield      #258                // Field k:C
      18: aload_0
      19: getfield      #87                 // Field a:Landroid/support/v7/view/menu/h;
      22: iconst_0
      23: invokevirtual #151                // Method android/support/v7/view/menu/h.a:(Z)V
      26: aload_0
      27: areturn

  public android.view.MenuItem setAlphabeticShortcut(char, int);
    Code:
       0: aload_0
       1: getfield      #258                // Field k:C
       4: iload_1
       5: if_icmpne     18
       8: aload_0
       9: getfield      #67                 // Field l:I
      12: iload_2
      13: if_icmpne     18
      16: aload_0
      17: areturn
      18: aload_0
      19: iload_1
      20: invokestatic  #380                // Method java/lang/Character.toLowerCase:(C)C
      23: putfield      #258                // Field k:C
      26: aload_0
      27: iload_2
      28: invokestatic  #387                // Method android/view/KeyEvent.normalizeMetaState:(I)I
      31: putfield      #67                 // Field l:I
      34: aload_0
      35: getfield      #87                 // Field a:Landroid/support/v7/view/menu/h;
      38: iconst_0
      39: invokevirtual #151                // Method android/support/v7/view/menu/h.a:(Z)V
      42: aload_0
      43: areturn

  public android.view.MenuItem setCheckable(boolean);
    Code:
       0: aload_0
       1: getfield      #81                 // Field y:I
       4: istore_2
       5: aload_0
       6: iload_1
       7: aload_0
       8: getfield      #81                 // Field y:I
      11: bipush        -2
      13: iand
      14: ior
      15: putfield      #81                 // Field y:I
      18: iload_2
      19: aload_0
      20: getfield      #81                 // Field y:I
      23: if_icmpeq     34
      26: aload_0
      27: getfield      #87                 // Field a:Landroid/support/v7/view/menu/h;
      30: iconst_0
      31: invokevirtual #151                // Method android/support/v7/view/menu/h.a:(Z)V
      34: aload_0
      35: areturn

  public android.view.MenuItem setChecked(boolean);
    Code:
       0: aload_0
       1: getfield      #81                 // Field y:I
       4: iconst_4
       5: iand
       6: ifeq          19
       9: aload_0
      10: getfield      #87                 // Field a:Landroid/support/v7/view/menu/h;
      13: aload_0
      14: invokevirtual #393                // Method android/support/v7/view/menu/h.a:(Landroid/view/MenuItem;)V
      17: aload_0
      18: areturn
      19: aload_0
      20: iload_1
      21: invokevirtual #395                // Method b:(Z)V
      24: aload_0
      25: areturn

  public android.view.MenuItem setContentDescription(java.lang.CharSequence);
    Code:
       0: aload_0
       1: aload_1
       2: invokevirtual #399                // Method a:(Ljava/lang/CharSequence;)Landroid/support/v4/c/a/b;
       5: areturn

  public android.view.MenuItem setEnabled(boolean);
    Code:
       0: iload_1
       1: ifeq          20
       4: aload_0
       5: getfield      #81                 // Field y:I
       8: bipush        16
      10: ior
      11: istore_2
      12: aload_0
      13: iload_2
      14: putfield      #81                 // Field y:I
      17: goto          31
      20: aload_0
      21: getfield      #81                 // Field y:I
      24: bipush        -17
      26: iand
      27: istore_2
      28: goto          12
      31: aload_0
      32: getfield      #87                 // Field a:Landroid/support/v7/view/menu/h;
      35: iconst_0
      36: invokevirtual #151                // Method android/support/v7/view/menu/h.a:(Z)V
      39: aload_0
      40: areturn

  public android.view.MenuItem setIcon(int);
    Code:
       0: aload_0
       1: aconst_null
       2: putfield      #317                // Field m:Landroid/graphics/drawable/Drawable;
       5: aload_0
       6: iload_1
       7: putfield      #69                 // Field n:I
      10: aload_0
      11: iconst_1
      12: putfield      #79                 // Field x:Z
      15: aload_0
      16: getfield      #87                 // Field a:Landroid/support/v7/view/menu/h;
      19: iconst_0
      20: invokevirtual #151                // Method android/support/v7/view/menu/h.a:(Z)V
      23: aload_0
      24: areturn

  public android.view.MenuItem setIcon(android.graphics.drawable.Drawable);
    Code:
       0: aload_0
       1: iconst_0
       2: putfield      #69                 // Field n:I
       5: aload_0
       6: aload_1
       7: putfield      #317                // Field m:Landroid/graphics/drawable/Drawable;
      10: aload_0
      11: iconst_1
      12: putfield      #79                 // Field x:Z
      15: aload_0
      16: getfield      #87                 // Field a:Landroid/support/v7/view/menu/h;
      19: iconst_0
      20: invokevirtual #151                // Method android/support/v7/view/menu/h.a:(Z)V
      23: aload_0
      24: areturn

  public android.view.MenuItem setIconTintList(android.content.res.ColorStateList);
    Code:
       0: aload_0
       1: aload_1
       2: putfield      #71                 // Field t:Landroid/content/res/ColorStateList;
       5: aload_0
       6: iconst_1
       7: putfield      #75                 // Field v:Z
      10: aload_0
      11: iconst_1
      12: putfield      #79                 // Field x:Z
      15: aload_0
      16: getfield      #87                 // Field a:Landroid/support/v7/view/menu/h;
      19: iconst_0
      20: invokevirtual #151                // Method android/support/v7/view/menu/h.a:(Z)V
      23: aload_0
      24: areturn

  public android.view.MenuItem setIconTintMode(android.graphics.PorterDuff$Mode);
    Code:
       0: aload_0
       1: aload_1
       2: putfield      #73                 // Field u:Landroid/graphics/PorterDuff$Mode;
       5: aload_0
       6: iconst_1
       7: putfield      #77                 // Field w:Z
      10: aload_0
      11: iconst_1
      12: putfield      #79                 // Field x:Z
      15: aload_0
      16: getfield      #87                 // Field a:Landroid/support/v7/view/menu/h;
      19: iconst_0
      20: invokevirtual #151                // Method android/support/v7/view/menu/h.a:(Z)V
      23: aload_0
      24: areturn

  public android.view.MenuItem setIntent(android.content.Intent);
    Code:
       0: aload_0
       1: aload_1
       2: putfield      #225                // Field h:Landroid/content/Intent;
       5: aload_0
       6: areturn

  public android.view.MenuItem setNumericShortcut(char);
    Code:
       0: aload_0
       1: getfield      #260                // Field i:C
       4: iload_1
       5: if_icmpne     10
       8: aload_0
       9: areturn
      10: aload_0
      11: iload_1
      12: putfield      #260                // Field i:C
      15: aload_0
      16: getfield      #87                 // Field a:Landroid/support/v7/view/menu/h;
      19: iconst_0
      20: invokevirtual #151                // Method android/support/v7/view/menu/h.a:(Z)V
      23: aload_0
      24: areturn

  public android.view.MenuItem setNumericShortcut(char, int);
    Code:
       0: aload_0
       1: getfield      #260                // Field i:C
       4: iload_1
       5: if_icmpne     18
       8: aload_0
       9: getfield      #65                 // Field j:I
      12: iload_2
      13: if_icmpne     18
      16: aload_0
      17: areturn
      18: aload_0
      19: iload_1
      20: putfield      #260                // Field i:C
      23: aload_0
      24: iload_2
      25: invokestatic  #387                // Method android/view/KeyEvent.normalizeMetaState:(I)I
      28: putfield      #65                 // Field j:I
      31: aload_0
      32: getfield      #87                 // Field a:Landroid/support/v7/view/menu/h;
      35: iconst_0
      36: invokevirtual #151                // Method android/support/v7/view/menu/h.a:(Z)V
      39: aload_0
      40: areturn

  public android.view.MenuItem setOnActionExpandListener(android.view.MenuItem$OnActionExpandListener);
    Code:
       0: aload_0
       1: aload_1
       2: putfield      #246                // Field C:Landroid/view/MenuItem$OnActionExpandListener;
       5: aload_0
       6: areturn

  public android.view.MenuItem setOnMenuItemClickListener(android.view.MenuItem$OnMenuItemClickListener);
    Code:
       0: aload_0
       1: aload_1
       2: putfield      #207                // Field q:Landroid/view/MenuItem$OnMenuItemClickListener;
       5: aload_0
       6: areturn

  public android.view.MenuItem setShortcut(char, char);
    Code:
       0: aload_0
       1: iload_1
       2: putfield      #260                // Field i:C
       5: aload_0
       6: iload_2
       7: invokestatic  #380                // Method java/lang/Character.toLowerCase:(C)C
      10: putfield      #258                // Field k:C
      13: aload_0
      14: getfield      #87                 // Field a:Landroid/support/v7/view/menu/h;
      17: iconst_0
      18: invokevirtual #151                // Method android/support/v7/view/menu/h.a:(Z)V
      21: aload_0
      22: areturn

  public android.view.MenuItem setShortcut(char, char, int, int);
    Code:
       0: aload_0
       1: iload_1
       2: putfield      #260                // Field i:C
       5: aload_0
       6: iload_3
       7: invokestatic  #387                // Method android/view/KeyEvent.normalizeMetaState:(I)I
      10: putfield      #65                 // Field j:I
      13: aload_0
      14: iload_2
      15: invokestatic  #380                // Method java/lang/Character.toLowerCase:(C)C
      18: putfield      #258                // Field k:C
      21: aload_0
      22: iload         4
      24: invokestatic  #387                // Method android/view/KeyEvent.normalizeMetaState:(I)I
      27: putfield      #67                 // Field l:I
      30: aload_0
      31: getfield      #87                 // Field a:Landroid/support/v7/view/menu/h;
      34: iconst_0
      35: invokevirtual #151                // Method android/support/v7/view/menu/h.a:(Z)V
      38: aload_0
      39: areturn

  public void setShowAsAction(int);
    Code:
       0: iload_1
       1: iconst_3
       2: iand
       3: tableswitch   { // 0 to 2
                     0: 39
                     1: 39
                     2: 39
               default: 28
          }
      28: new           #418                // class java/lang/IllegalArgumentException
      31: dup
      32: ldc_w         #420                // String SHOW_AS_ACTION_ALWAYS, SHOW_AS_ACTION_IF_ROOM, and SHOW_AS_ACTION_NEVER are mutually exclusive.
      35: invokespecial #421                // Method java/lang/IllegalArgumentException."<init>":(Ljava/lang/String;)V
      38: athrow
      39: aload_0
      40: iload_1
      41: putfield      #83                 // Field z:I
      44: aload_0
      45: getfield      #87                 // Field a:Landroid/support/v7/view/menu/h;
      48: aload_0
      49: invokevirtual #169                // Method android/support/v7/view/menu/h.b:(Landroid/support/v7/view/menu/j;)V
      52: return

  public android.view.MenuItem setShowAsActionFlags(int);
    Code:
       0: aload_0
       1: iload_1
       2: invokevirtual #424                // Method b:(I)Landroid/support/v4/c/a/b;
       5: areturn

  public android.view.MenuItem setTitle(int);
    Code:
       0: aload_0
       1: aload_0
       2: getfield      #87                 // Field a:Landroid/support/v7/view/menu/h;
       5: invokevirtual #121                // Method android/support/v7/view/menu/h.e:()Landroid/content/Context;
       8: iload_1
       9: invokevirtual #429                // Method android/content/Context.getString:(I)Ljava/lang/String;
      12: invokevirtual #431                // Method setTitle:(Ljava/lang/CharSequence;)Landroid/view/MenuItem;
      15: areturn

  public android.view.MenuItem setTitle(java.lang.CharSequence);
    Code:
       0: aload_0
       1: aload_1
       2: putfield      #97                 // Field f:Ljava/lang/CharSequence;
       5: aload_0
       6: getfield      #87                 // Field a:Landroid/support/v7/view/menu/h;
       9: iconst_0
      10: invokevirtual #151                // Method android/support/v7/view/menu/h.a:(Z)V
      13: aload_0
      14: getfield      #189                // Field o:Landroid/support/v7/view/menu/u;
      17: ifnull        29
      20: aload_0
      21: getfield      #189                // Field o:Landroid/support/v7/view/menu/u;
      24: aload_1
      25: invokevirtual #195                // Method android/support/v7/view/menu/u.setHeaderTitle:(Ljava/lang/CharSequence;)Landroid/view/SubMenu;
      28: pop
      29: aload_0
      30: areturn

  public android.view.MenuItem setTitleCondensed(java.lang.CharSequence);
    Code:
       0: aload_0
       1: aload_1
       2: putfield      #342                // Field g:Ljava/lang/CharSequence;
       5: aload_1
       6: ifnonnull     14
       9: aload_0
      10: getfield      #97                 // Field f:Ljava/lang/CharSequence;
      13: astore_1
      14: aload_0
      15: getfield      #87                 // Field a:Landroid/support/v7/view/menu/h;
      18: iconst_0
      19: invokevirtual #151                // Method android/support/v7/view/menu/h.a:(Z)V
      22: aload_0
      23: areturn

  public android.view.MenuItem setTooltipText(java.lang.CharSequence);
    Code:
       0: aload_0
       1: aload_1
       2: invokevirtual #435                // Method b:(Ljava/lang/CharSequence;)Landroid/support/v4/c/a/b;
       5: areturn

  public android.view.MenuItem setVisible(boolean);
    Code:
       0: aload_0
       1: iload_1
       2: invokevirtual #438                // Method c:(Z)Z
       5: ifeq          16
       8: aload_0
       9: getfield      #87                 // Field a:Landroid/support/v7/view/menu/h;
      12: aload_0
      13: invokevirtual #440                // Method android/support/v7/view/menu/h.a:(Landroid/support/v7/view/menu/j;)V
      16: aload_0
      17: areturn

  public java.lang.String toString();
    Code:
       0: aload_0
       1: getfield      #97                 // Field f:Ljava/lang/CharSequence;
       4: ifnull        17
       7: aload_0
       8: getfield      #97                 // Field f:Ljava/lang/CharSequence;
      11: invokeinterface #352,  1          // InterfaceMethod java/lang/CharSequence.toString:()Ljava/lang/String;
      16: areturn
      17: aconst_null
      18: areturn
}
