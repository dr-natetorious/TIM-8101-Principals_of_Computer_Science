public class android.support.v7.view.menu.k extends android.support.v7.view.menu.c<android.support.v4.c.a.b> implements android.view.MenuItem {
  android.support.v7.view.menu.k(android.content.Context, android.support.v4.c.a.b);
    Code:
       0: aload_0
       1: aload_1
       2: aload_2
       3: invokespecial #25                 // Method android/support/v7/view/menu/c."<init>":(Landroid/content/Context;Ljava/lang/Object;)V
       6: return

  android.support.v7.view.menu.k$a a(android.view.ActionProvider);
    Code:
       0: new           #9                  // class android/support/v7/view/menu/k$a
       3: dup
       4: aload_0
       5: aload_0
       6: getfield      #30                 // Field a:Landroid/content/Context;
       9: aload_1
      10: invokespecial #33                 // Method android/support/v7/view/menu/k$a."<init>":(Landroid/support/v7/view/menu/k;Landroid/content/Context;Landroid/view/ActionProvider;)V
      13: areturn

  public void a(boolean);
    Code:
       0: aload_0
       1: getfield      #38                 // Field c:Ljava/lang/reflect/Method;
       4: ifnonnull     36
       7: aload_0
       8: aload_0
       9: getfield      #41                 // Field b:Ljava/lang/Object;
      12: checkcast     #43                 // class android/support/v4/c/a/b
      15: invokevirtual #49                 // Method java/lang/Object.getClass:()Ljava/lang/Class;
      18: ldc           #51                 // String setExclusiveCheckable
      20: iconst_1
      21: anewarray     #53                 // class java/lang/Class
      24: dup
      25: iconst_0
      26: getstatic     #59                 // Field java/lang/Boolean.TYPE:Ljava/lang/Class;
      29: aastore
      30: invokevirtual #63                 // Method java/lang/Class.getDeclaredMethod:(Ljava/lang/String;[Ljava/lang/Class;)Ljava/lang/reflect/Method;
      33: putfield      #38                 // Field c:Ljava/lang/reflect/Method;
      36: aload_0
      37: getfield      #38                 // Field c:Ljava/lang/reflect/Method;
      40: aload_0
      41: getfield      #41                 // Field b:Ljava/lang/Object;
      44: iconst_1
      45: anewarray     #45                 // class java/lang/Object
      48: dup
      49: iconst_0
      50: iload_1
      51: invokestatic  #67                 // Method java/lang/Boolean.valueOf:(Z)Ljava/lang/Boolean;
      54: aastore
      55: invokevirtual #73                 // Method java/lang/reflect/Method.invoke:(Ljava/lang/Object;[Ljava/lang/Object;)Ljava/lang/Object;
      58: pop
      59: return
      60: astore_2
      61: ldc           #75                 // String MenuItemWrapper
      63: ldc           #77                 // String Error while calling setExclusiveCheckable
      65: aload_2
      66: invokestatic  #83                 // Method android/util/Log.w:(Ljava/lang/String;Ljava/lang/String;Ljava/lang/Throwable;)I
      69: pop
      70: return
    Exception table:
       from    to  target type
           0    36    60   Class java/lang/Exception
          36    59    60   Class java/lang/Exception

  public boolean collapseActionView();
    Code:
       0: aload_0
       1: getfield      #41                 // Field b:Ljava/lang/Object;
       4: checkcast     #43                 // class android/support/v4/c/a/b
       7: invokeinterface #87,  1           // InterfaceMethod android/support/v4/c/a/b.collapseActionView:()Z
      12: ireturn

  public boolean expandActionView();
    Code:
       0: aload_0
       1: getfield      #41                 // Field b:Ljava/lang/Object;
       4: checkcast     #43                 // class android/support/v4/c/a/b
       7: invokeinterface #90,  1           // InterfaceMethod android/support/v4/c/a/b.expandActionView:()Z
      12: ireturn

  public android.view.ActionProvider getActionProvider();
    Code:
       0: aload_0
       1: getfield      #41                 // Field b:Ljava/lang/Object;
       4: checkcast     #43                 // class android/support/v4/c/a/b
       7: invokeinterface #95,  1           // InterfaceMethod android/support/v4/c/a/b.a:()Landroid/support/v4/view/c;
      12: astore_1
      13: aload_1
      14: instanceof    #9                  // class android/support/v7/view/menu/k$a
      17: ifeq          28
      20: aload_1
      21: checkcast     #9                  // class android/support/v7/view/menu/k$a
      24: getfield      #98                 // Field android/support/v7/view/menu/k$a.a:Landroid/view/ActionProvider;
      27: areturn
      28: aconst_null
      29: areturn

  public android.view.View getActionView();
    Code:
       0: aload_0
       1: getfield      #41                 // Field b:Ljava/lang/Object;
       4: checkcast     #43                 // class android/support/v4/c/a/b
       7: invokeinterface #102,  1          // InterfaceMethod android/support/v4/c/a/b.getActionView:()Landroid/view/View;
      12: astore_2
      13: aload_2
      14: astore_1
      15: aload_2
      16: instanceof    #12                 // class android/support/v7/view/menu/k$b
      19: ifeq          30
      22: aload_2
      23: checkcast     #12                 // class android/support/v7/view/menu/k$b
      26: invokevirtual #104                // Method android/support/v7/view/menu/k$b.c:()Landroid/view/View;
      29: astore_1
      30: aload_1
      31: areturn

  public int getAlphabeticModifiers();
    Code:
       0: aload_0
       1: getfield      #41                 // Field b:Ljava/lang/Object;
       4: checkcast     #43                 // class android/support/v4/c/a/b
       7: invokeinterface #108,  1          // InterfaceMethod android/support/v4/c/a/b.getAlphabeticModifiers:()I
      12: ireturn

  public char getAlphabeticShortcut();
    Code:
       0: aload_0
       1: getfield      #41                 // Field b:Ljava/lang/Object;
       4: checkcast     #43                 // class android/support/v4/c/a/b
       7: invokeinterface #112,  1          // InterfaceMethod android/support/v4/c/a/b.getAlphabeticShortcut:()C
      12: ireturn

  public java.lang.CharSequence getContentDescription();
    Code:
       0: aload_0
       1: getfield      #41                 // Field b:Ljava/lang/Object;
       4: checkcast     #43                 // class android/support/v4/c/a/b
       7: invokeinterface #116,  1          // InterfaceMethod android/support/v4/c/a/b.getContentDescription:()Ljava/lang/CharSequence;
      12: areturn

  public int getGroupId();
    Code:
       0: aload_0
       1: getfield      #41                 // Field b:Ljava/lang/Object;
       4: checkcast     #43                 // class android/support/v4/c/a/b
       7: invokeinterface #119,  1          // InterfaceMethod android/support/v4/c/a/b.getGroupId:()I
      12: ireturn

  public android.graphics.drawable.Drawable getIcon();
    Code:
       0: aload_0
       1: getfield      #41                 // Field b:Ljava/lang/Object;
       4: checkcast     #43                 // class android/support/v4/c/a/b
       7: invokeinterface #123,  1          // InterfaceMethod android/support/v4/c/a/b.getIcon:()Landroid/graphics/drawable/Drawable;
      12: areturn

  public android.content.res.ColorStateList getIconTintList();
    Code:
       0: aload_0
       1: getfield      #41                 // Field b:Ljava/lang/Object;
       4: checkcast     #43                 // class android/support/v4/c/a/b
       7: invokeinterface #127,  1          // InterfaceMethod android/support/v4/c/a/b.getIconTintList:()Landroid/content/res/ColorStateList;
      12: areturn

  public android.graphics.PorterDuff$Mode getIconTintMode();
    Code:
       0: aload_0
       1: getfield      #41                 // Field b:Ljava/lang/Object;
       4: checkcast     #43                 // class android/support/v4/c/a/b
       7: invokeinterface #131,  1          // InterfaceMethod android/support/v4/c/a/b.getIconTintMode:()Landroid/graphics/PorterDuff$Mode;
      12: areturn

  public android.content.Intent getIntent();
    Code:
       0: aload_0
       1: getfield      #41                 // Field b:Ljava/lang/Object;
       4: checkcast     #43                 // class android/support/v4/c/a/b
       7: invokeinterface #135,  1          // InterfaceMethod android/support/v4/c/a/b.getIntent:()Landroid/content/Intent;
      12: areturn

  public int getItemId();
    Code:
       0: aload_0
       1: getfield      #41                 // Field b:Ljava/lang/Object;
       4: checkcast     #43                 // class android/support/v4/c/a/b
       7: invokeinterface #138,  1          // InterfaceMethod android/support/v4/c/a/b.getItemId:()I
      12: ireturn

  public android.view.ContextMenu$ContextMenuInfo getMenuInfo();
    Code:
       0: aload_0
       1: getfield      #41                 // Field b:Ljava/lang/Object;
       4: checkcast     #43                 // class android/support/v4/c/a/b
       7: invokeinterface #142,  1          // InterfaceMethod android/support/v4/c/a/b.getMenuInfo:()Landroid/view/ContextMenu$ContextMenuInfo;
      12: areturn

  public int getNumericModifiers();
    Code:
       0: aload_0
       1: getfield      #41                 // Field b:Ljava/lang/Object;
       4: checkcast     #43                 // class android/support/v4/c/a/b
       7: invokeinterface #145,  1          // InterfaceMethod android/support/v4/c/a/b.getNumericModifiers:()I
      12: ireturn

  public char getNumericShortcut();
    Code:
       0: aload_0
       1: getfield      #41                 // Field b:Ljava/lang/Object;
       4: checkcast     #43                 // class android/support/v4/c/a/b
       7: invokeinterface #148,  1          // InterfaceMethod android/support/v4/c/a/b.getNumericShortcut:()C
      12: ireturn

  public int getOrder();
    Code:
       0: aload_0
       1: getfield      #41                 // Field b:Ljava/lang/Object;
       4: checkcast     #43                 // class android/support/v4/c/a/b
       7: invokeinterface #151,  1          // InterfaceMethod android/support/v4/c/a/b.getOrder:()I
      12: ireturn

  public android.view.SubMenu getSubMenu();
    Code:
       0: aload_0
       1: aload_0
       2: getfield      #41                 // Field b:Ljava/lang/Object;
       5: checkcast     #43                 // class android/support/v4/c/a/b
       8: invokeinterface #155,  1          // InterfaceMethod android/support/v4/c/a/b.getSubMenu:()Landroid/view/SubMenu;
      13: invokevirtual #158                // Method a:(Landroid/view/SubMenu;)Landroid/view/SubMenu;
      16: areturn

  public java.lang.CharSequence getTitle();
    Code:
       0: aload_0
       1: getfield      #41                 // Field b:Ljava/lang/Object;
       4: checkcast     #43                 // class android/support/v4/c/a/b
       7: invokeinterface #161,  1          // InterfaceMethod android/support/v4/c/a/b.getTitle:()Ljava/lang/CharSequence;
      12: areturn

  public java.lang.CharSequence getTitleCondensed();
    Code:
       0: aload_0
       1: getfield      #41                 // Field b:Ljava/lang/Object;
       4: checkcast     #43                 // class android/support/v4/c/a/b
       7: invokeinterface #164,  1          // InterfaceMethod android/support/v4/c/a/b.getTitleCondensed:()Ljava/lang/CharSequence;
      12: areturn

  public java.lang.CharSequence getTooltipText();
    Code:
       0: aload_0
       1: getfield      #41                 // Field b:Ljava/lang/Object;
       4: checkcast     #43                 // class android/support/v4/c/a/b
       7: invokeinterface #167,  1          // InterfaceMethod android/support/v4/c/a/b.getTooltipText:()Ljava/lang/CharSequence;
      12: areturn

  public boolean hasSubMenu();
    Code:
       0: aload_0
       1: getfield      #41                 // Field b:Ljava/lang/Object;
       4: checkcast     #43                 // class android/support/v4/c/a/b
       7: invokeinterface #170,  1          // InterfaceMethod android/support/v4/c/a/b.hasSubMenu:()Z
      12: ireturn

  public boolean isActionViewExpanded();
    Code:
       0: aload_0
       1: getfield      #41                 // Field b:Ljava/lang/Object;
       4: checkcast     #43                 // class android/support/v4/c/a/b
       7: invokeinterface #173,  1          // InterfaceMethod android/support/v4/c/a/b.isActionViewExpanded:()Z
      12: ireturn

  public boolean isCheckable();
    Code:
       0: aload_0
       1: getfield      #41                 // Field b:Ljava/lang/Object;
       4: checkcast     #43                 // class android/support/v4/c/a/b
       7: invokeinterface #176,  1          // InterfaceMethod android/support/v4/c/a/b.isCheckable:()Z
      12: ireturn

  public boolean isChecked();
    Code:
       0: aload_0
       1: getfield      #41                 // Field b:Ljava/lang/Object;
       4: checkcast     #43                 // class android/support/v4/c/a/b
       7: invokeinterface #179,  1          // InterfaceMethod android/support/v4/c/a/b.isChecked:()Z
      12: ireturn

  public boolean isEnabled();
    Code:
       0: aload_0
       1: getfield      #41                 // Field b:Ljava/lang/Object;
       4: checkcast     #43                 // class android/support/v4/c/a/b
       7: invokeinterface #182,  1          // InterfaceMethod android/support/v4/c/a/b.isEnabled:()Z
      12: ireturn

  public boolean isVisible();
    Code:
       0: aload_0
       1: getfield      #41                 // Field b:Ljava/lang/Object;
       4: checkcast     #43                 // class android/support/v4/c/a/b
       7: invokeinterface #185,  1          // InterfaceMethod android/support/v4/c/a/b.isVisible:()Z
      12: ireturn

  public android.view.MenuItem setActionProvider(android.view.ActionProvider);
    Code:
       0: aload_0
       1: getfield      #41                 // Field b:Ljava/lang/Object;
       4: checkcast     #43                 // class android/support/v4/c/a/b
       7: astore_2
       8: aload_1
       9: ifnull        21
      12: aload_0
      13: aload_1
      14: invokevirtual #189                // Method a:(Landroid/view/ActionProvider;)Landroid/support/v7/view/menu/k$a;
      17: astore_1
      18: goto          23
      21: aconst_null
      22: astore_1
      23: aload_2
      24: aload_1
      25: invokeinterface #192,  2          // InterfaceMethod android/support/v4/c/a/b.a:(Landroid/support/v4/view/c;)Landroid/support/v4/c/a/b;
      30: pop
      31: aload_0
      32: areturn

  public android.view.MenuItem setActionView(int);
    Code:
       0: aload_0
       1: getfield      #41                 // Field b:Ljava/lang/Object;
       4: checkcast     #43                 // class android/support/v4/c/a/b
       7: iload_1
       8: invokeinterface #196,  2          // InterfaceMethod android/support/v4/c/a/b.setActionView:(I)Landroid/view/MenuItem;
      13: pop
      14: aload_0
      15: getfield      #41                 // Field b:Ljava/lang/Object;
      18: checkcast     #43                 // class android/support/v4/c/a/b
      21: invokeinterface #102,  1          // InterfaceMethod android/support/v4/c/a/b.getActionView:()Landroid/view/View;
      26: astore_2
      27: aload_2
      28: instanceof    #198                // class android/view/CollapsibleActionView
      31: ifeq          55
      34: aload_0
      35: getfield      #41                 // Field b:Ljava/lang/Object;
      38: checkcast     #43                 // class android/support/v4/c/a/b
      41: new           #12                 // class android/support/v7/view/menu/k$b
      44: dup
      45: aload_2
      46: invokespecial #201                // Method android/support/v7/view/menu/k$b."<init>":(Landroid/view/View;)V
      49: invokeinterface #204,  2          // InterfaceMethod android/support/v4/c/a/b.setActionView:(Landroid/view/View;)Landroid/view/MenuItem;
      54: pop
      55: aload_0
      56: areturn

  public android.view.MenuItem setActionView(android.view.View);
    Code:
       0: aload_1
       1: astore_2
       2: aload_1
       3: instanceof    #198                // class android/view/CollapsibleActionView
       6: ifeq          18
       9: new           #12                 // class android/support/v7/view/menu/k$b
      12: dup
      13: aload_1
      14: invokespecial #201                // Method android/support/v7/view/menu/k$b."<init>":(Landroid/view/View;)V
      17: astore_2
      18: aload_0
      19: getfield      #41                 // Field b:Ljava/lang/Object;
      22: checkcast     #43                 // class android/support/v4/c/a/b
      25: aload_2
      26: invokeinterface #204,  2          // InterfaceMethod android/support/v4/c/a/b.setActionView:(Landroid/view/View;)Landroid/view/MenuItem;
      31: pop
      32: aload_0
      33: areturn

  public android.view.MenuItem setAlphabeticShortcut(char);
    Code:
       0: aload_0
       1: getfield      #41                 // Field b:Ljava/lang/Object;
       4: checkcast     #43                 // class android/support/v4/c/a/b
       7: iload_1
       8: invokeinterface #208,  2          // InterfaceMethod android/support/v4/c/a/b.setAlphabeticShortcut:(C)Landroid/view/MenuItem;
      13: pop
      14: aload_0
      15: areturn

  public android.view.MenuItem setAlphabeticShortcut(char, int);
    Code:
       0: aload_0
       1: getfield      #41                 // Field b:Ljava/lang/Object;
       4: checkcast     #43                 // class android/support/v4/c/a/b
       7: iload_1
       8: iload_2
       9: invokeinterface #211,  3          // InterfaceMethod android/support/v4/c/a/b.setAlphabeticShortcut:(CI)Landroid/view/MenuItem;
      14: pop
      15: aload_0
      16: areturn

  public android.view.MenuItem setCheckable(boolean);
    Code:
       0: aload_0
       1: getfield      #41                 // Field b:Ljava/lang/Object;
       4: checkcast     #43                 // class android/support/v4/c/a/b
       7: iload_1
       8: invokeinterface #215,  2          // InterfaceMethod android/support/v4/c/a/b.setCheckable:(Z)Landroid/view/MenuItem;
      13: pop
      14: aload_0
      15: areturn

  public android.view.MenuItem setChecked(boolean);
    Code:
       0: aload_0
       1: getfield      #41                 // Field b:Ljava/lang/Object;
       4: checkcast     #43                 // class android/support/v4/c/a/b
       7: iload_1
       8: invokeinterface #218,  2          // InterfaceMethod android/support/v4/c/a/b.setChecked:(Z)Landroid/view/MenuItem;
      13: pop
      14: aload_0
      15: areturn

  public android.view.MenuItem setContentDescription(java.lang.CharSequence);
    Code:
       0: aload_0
       1: getfield      #41                 // Field b:Ljava/lang/Object;
       4: checkcast     #43                 // class android/support/v4/c/a/b
       7: aload_1
       8: invokeinterface #223,  2          // InterfaceMethod android/support/v4/c/a/b.a:(Ljava/lang/CharSequence;)Landroid/support/v4/c/a/b;
      13: pop
      14: aload_0
      15: areturn

  public android.view.MenuItem setEnabled(boolean);
    Code:
       0: aload_0
       1: getfield      #41                 // Field b:Ljava/lang/Object;
       4: checkcast     #43                 // class android/support/v4/c/a/b
       7: iload_1
       8: invokeinterface #226,  2          // InterfaceMethod android/support/v4/c/a/b.setEnabled:(Z)Landroid/view/MenuItem;
      13: pop
      14: aload_0
      15: areturn

  public android.view.MenuItem setIcon(int);
    Code:
       0: aload_0
       1: getfield      #41                 // Field b:Ljava/lang/Object;
       4: checkcast     #43                 // class android/support/v4/c/a/b
       7: iload_1
       8: invokeinterface #229,  2          // InterfaceMethod android/support/v4/c/a/b.setIcon:(I)Landroid/view/MenuItem;
      13: pop
      14: aload_0
      15: areturn

  public android.view.MenuItem setIcon(android.graphics.drawable.Drawable);
    Code:
       0: aload_0
       1: getfield      #41                 // Field b:Ljava/lang/Object;
       4: checkcast     #43                 // class android/support/v4/c/a/b
       7: aload_1
       8: invokeinterface #232,  2          // InterfaceMethod android/support/v4/c/a/b.setIcon:(Landroid/graphics/drawable/Drawable;)Landroid/view/MenuItem;
      13: pop
      14: aload_0
      15: areturn

  public android.view.MenuItem setIconTintList(android.content.res.ColorStateList);
    Code:
       0: aload_0
       1: getfield      #41                 // Field b:Ljava/lang/Object;
       4: checkcast     #43                 // class android/support/v4/c/a/b
       7: aload_1
       8: invokeinterface #236,  2          // InterfaceMethod android/support/v4/c/a/b.setIconTintList:(Landroid/content/res/ColorStateList;)Landroid/view/MenuItem;
      13: pop
      14: aload_0
      15: areturn

  public android.view.MenuItem setIconTintMode(android.graphics.PorterDuff$Mode);
    Code:
       0: aload_0
       1: getfield      #41                 // Field b:Ljava/lang/Object;
       4: checkcast     #43                 // class android/support/v4/c/a/b
       7: aload_1
       8: invokeinterface #240,  2          // InterfaceMethod android/support/v4/c/a/b.setIconTintMode:(Landroid/graphics/PorterDuff$Mode;)Landroid/view/MenuItem;
      13: pop
      14: aload_0
      15: areturn

  public android.view.MenuItem setIntent(android.content.Intent);
    Code:
       0: aload_0
       1: getfield      #41                 // Field b:Ljava/lang/Object;
       4: checkcast     #43                 // class android/support/v4/c/a/b
       7: aload_1
       8: invokeinterface #244,  2          // InterfaceMethod android/support/v4/c/a/b.setIntent:(Landroid/content/Intent;)Landroid/view/MenuItem;
      13: pop
      14: aload_0
      15: areturn

  public android.view.MenuItem setNumericShortcut(char);
    Code:
       0: aload_0
       1: getfield      #41                 // Field b:Ljava/lang/Object;
       4: checkcast     #43                 // class android/support/v4/c/a/b
       7: iload_1
       8: invokeinterface #247,  2          // InterfaceMethod android/support/v4/c/a/b.setNumericShortcut:(C)Landroid/view/MenuItem;
      13: pop
      14: aload_0
      15: areturn

  public android.view.MenuItem setNumericShortcut(char, int);
    Code:
       0: aload_0
       1: getfield      #41                 // Field b:Ljava/lang/Object;
       4: checkcast     #43                 // class android/support/v4/c/a/b
       7: iload_1
       8: iload_2
       9: invokeinterface #249,  3          // InterfaceMethod android/support/v4/c/a/b.setNumericShortcut:(CI)Landroid/view/MenuItem;
      14: pop
      15: aload_0
      16: areturn

  public android.view.MenuItem setOnActionExpandListener(android.view.MenuItem$OnActionExpandListener);
    Code:
       0: aload_0
       1: getfield      #41                 // Field b:Ljava/lang/Object;
       4: checkcast     #43                 // class android/support/v4/c/a/b
       7: astore_2
       8: aload_1
       9: ifnull        25
      12: new           #15                 // class android/support/v7/view/menu/k$c
      15: dup
      16: aload_0
      17: aload_1
      18: invokespecial #254                // Method android/support/v7/view/menu/k$c."<init>":(Landroid/support/v7/view/menu/k;Landroid/view/MenuItem$OnActionExpandListener;)V
      21: astore_1
      22: goto          27
      25: aconst_null
      26: astore_1
      27: aload_2
      28: aload_1
      29: invokeinterface #256,  2          // InterfaceMethod android/support/v4/c/a/b.setOnActionExpandListener:(Landroid/view/MenuItem$OnActionExpandListener;)Landroid/view/MenuItem;
      34: pop
      35: aload_0
      36: areturn

  public android.view.MenuItem setOnMenuItemClickListener(android.view.MenuItem$OnMenuItemClickListener);
    Code:
       0: aload_0
       1: getfield      #41                 // Field b:Ljava/lang/Object;
       4: checkcast     #43                 // class android/support/v4/c/a/b
       7: astore_2
       8: aload_1
       9: ifnull        25
      12: new           #18                 // class android/support/v7/view/menu/k$d
      15: dup
      16: aload_0
      17: aload_1
      18: invokespecial #261                // Method android/support/v7/view/menu/k$d."<init>":(Landroid/support/v7/view/menu/k;Landroid/view/MenuItem$OnMenuItemClickListener;)V
      21: astore_1
      22: goto          27
      25: aconst_null
      26: astore_1
      27: aload_2
      28: aload_1
      29: invokeinterface #263,  2          // InterfaceMethod android/support/v4/c/a/b.setOnMenuItemClickListener:(Landroid/view/MenuItem$OnMenuItemClickListener;)Landroid/view/MenuItem;
      34: pop
      35: aload_0
      36: areturn

  public android.view.MenuItem setShortcut(char, char);
    Code:
       0: aload_0
       1: getfield      #41                 // Field b:Ljava/lang/Object;
       4: checkcast     #43                 // class android/support/v4/c/a/b
       7: iload_1
       8: iload_2
       9: invokeinterface #267,  3          // InterfaceMethod android/support/v4/c/a/b.setShortcut:(CC)Landroid/view/MenuItem;
      14: pop
      15: aload_0
      16: areturn

  public android.view.MenuItem setShortcut(char, char, int, int);
    Code:
       0: aload_0
       1: getfield      #41                 // Field b:Ljava/lang/Object;
       4: checkcast     #43                 // class android/support/v4/c/a/b
       7: iload_1
       8: iload_2
       9: iload_3
      10: iload         4
      12: invokeinterface #270,  5          // InterfaceMethod android/support/v4/c/a/b.setShortcut:(CCII)Landroid/view/MenuItem;
      17: pop
      18: aload_0
      19: areturn

  public void setShowAsAction(int);
    Code:
       0: aload_0
       1: getfield      #41                 // Field b:Ljava/lang/Object;
       4: checkcast     #43                 // class android/support/v4/c/a/b
       7: iload_1
       8: invokeinterface #274,  2          // InterfaceMethod android/support/v4/c/a/b.setShowAsAction:(I)V
      13: return

  public android.view.MenuItem setShowAsActionFlags(int);
    Code:
       0: aload_0
       1: getfield      #41                 // Field b:Ljava/lang/Object;
       4: checkcast     #43                 // class android/support/v4/c/a/b
       7: iload_1
       8: invokeinterface #277,  2          // InterfaceMethod android/support/v4/c/a/b.setShowAsActionFlags:(I)Landroid/view/MenuItem;
      13: pop
      14: aload_0
      15: areturn

  public android.view.MenuItem setTitle(int);
    Code:
       0: aload_0
       1: getfield      #41                 // Field b:Ljava/lang/Object;
       4: checkcast     #43                 // class android/support/v4/c/a/b
       7: iload_1
       8: invokeinterface #280,  2          // InterfaceMethod android/support/v4/c/a/b.setTitle:(I)Landroid/view/MenuItem;
      13: pop
      14: aload_0
      15: areturn

  public android.view.MenuItem setTitle(java.lang.CharSequence);
    Code:
       0: aload_0
       1: getfield      #41                 // Field b:Ljava/lang/Object;
       4: checkcast     #43                 // class android/support/v4/c/a/b
       7: aload_1
       8: invokeinterface #282,  2          // InterfaceMethod android/support/v4/c/a/b.setTitle:(Ljava/lang/CharSequence;)Landroid/view/MenuItem;
      13: pop
      14: aload_0
      15: areturn

  public android.view.MenuItem setTitleCondensed(java.lang.CharSequence);
    Code:
       0: aload_0
       1: getfield      #41                 // Field b:Ljava/lang/Object;
       4: checkcast     #43                 // class android/support/v4/c/a/b
       7: aload_1
       8: invokeinterface #285,  2          // InterfaceMethod android/support/v4/c/a/b.setTitleCondensed:(Ljava/lang/CharSequence;)Landroid/view/MenuItem;
      13: pop
      14: aload_0
      15: areturn

  public android.view.MenuItem setTooltipText(java.lang.CharSequence);
    Code:
       0: aload_0
       1: getfield      #41                 // Field b:Ljava/lang/Object;
       4: checkcast     #43                 // class android/support/v4/c/a/b
       7: aload_1
       8: invokeinterface #288,  2          // InterfaceMethod android/support/v4/c/a/b.b:(Ljava/lang/CharSequence;)Landroid/support/v4/c/a/b;
      13: pop
      14: aload_0
      15: areturn

  public android.view.MenuItem setVisible(boolean);
    Code:
       0: aload_0
       1: getfield      #41                 // Field b:Ljava/lang/Object;
       4: checkcast     #43                 // class android/support/v4/c/a/b
       7: iload_1
       8: invokeinterface #291,  2          // InterfaceMethod android/support/v4/c/a/b.setVisible:(Z)Landroid/view/MenuItem;
      13: areturn
}
