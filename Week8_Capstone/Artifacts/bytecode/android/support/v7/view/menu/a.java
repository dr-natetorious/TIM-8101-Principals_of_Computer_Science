public class android.support.v7.view.menu.a implements android.support.v4.c.a.b {
  public android.support.v7.view.menu.a(android.content.Context, int, int, int, int, java.lang.CharSequence);
    Code:
       0: aload_0
       1: invokespecial #43                 // Method java/lang/Object."<init>":()V
       4: aload_0
       5: sipush        4096
       8: putfield      #45                 // Field i:I
      11: aload_0
      12: sipush        4096
      15: putfield      #47                 // Field k:I
      18: aload_0
      19: iconst_0
      20: putfield      #49                 // Field m:I
      23: aload_0
      24: aconst_null
      25: putfield      #51                 // Field r:Landroid/content/res/ColorStateList;
      28: aload_0
      29: aconst_null
      30: putfield      #53                 // Field s:Landroid/graphics/PorterDuff$Mode;
      33: aload_0
      34: iconst_0
      35: putfield      #55                 // Field t:Z
      38: aload_0
      39: iconst_0
      40: putfield      #57                 // Field u:Z
      43: aload_0
      44: bipush        16
      46: putfield      #59                 // Field v:I
      49: aload_0
      50: aload_1
      51: putfield      #61                 // Field n:Landroid/content/Context;
      54: aload_0
      55: iload_3
      56: putfield      #63                 // Field a:I
      59: aload_0
      60: iload_2
      61: putfield      #65                 // Field b:I
      64: aload_0
      65: iload         4
      67: putfield      #67                 // Field c:I
      70: aload_0
      71: iload         5
      73: putfield      #69                 // Field d:I
      76: aload_0
      77: aload         6
      79: putfield      #71                 // Field e:Ljava/lang/CharSequence;
      82: return

  public android.support.v4.c.a.b a(int);
    Code:
       0: new           #94                 // class java/lang/UnsupportedOperationException
       3: dup
       4: invokespecial #95                 // Method java/lang/UnsupportedOperationException."<init>":()V
       7: athrow

  public android.support.v4.c.a.b a(android.support.v4.view.c);
    Code:
       0: new           #94                 // class java/lang/UnsupportedOperationException
       3: dup
       4: invokespecial #95                 // Method java/lang/UnsupportedOperationException."<init>":()V
       7: athrow

  public android.support.v4.c.a.b a(android.view.View);
    Code:
       0: new           #94                 // class java/lang/UnsupportedOperationException
       3: dup
       4: invokespecial #95                 // Method java/lang/UnsupportedOperationException."<init>":()V
       7: athrow

  public android.support.v4.c.a.b a(java.lang.CharSequence);
    Code:
       0: aload_0
       1: aload_1
       2: putfield      #100                // Field p:Ljava/lang/CharSequence;
       5: aload_0
       6: areturn

  public android.support.v4.view.c a();
    Code:
       0: aconst_null
       1: areturn

  public android.support.v4.c.a.b b(int);
    Code:
       0: aload_0
       1: iload_1
       2: invokevirtual #105                // Method setShowAsAction:(I)V
       5: aload_0
       6: areturn

  public android.support.v4.c.a.b b(java.lang.CharSequence);
    Code:
       0: aload_0
       1: aload_1
       2: putfield      #107                // Field q:Ljava/lang/CharSequence;
       5: aload_0
       6: areturn

  public boolean collapseActionView();
    Code:
       0: iconst_0
       1: ireturn

  public boolean expandActionView();
    Code:
       0: iconst_0
       1: ireturn

  public android.view.ActionProvider getActionProvider();
    Code:
       0: new           #94                 // class java/lang/UnsupportedOperationException
       3: dup
       4: invokespecial #95                 // Method java/lang/UnsupportedOperationException."<init>":()V
       7: athrow

  public android.view.View getActionView();
    Code:
       0: aconst_null
       1: areturn

  public int getAlphabeticModifiers();
    Code:
       0: aload_0
       1: getfield      #47                 // Field k:I
       4: ireturn

  public char getAlphabeticShortcut();
    Code:
       0: aload_0
       1: getfield      #120                // Field j:C
       4: ireturn

  public java.lang.CharSequence getContentDescription();
    Code:
       0: aload_0
       1: getfield      #100                // Field p:Ljava/lang/CharSequence;
       4: areturn

  public int getGroupId();
    Code:
       0: aload_0
       1: getfield      #65                 // Field b:I
       4: ireturn

  public android.graphics.drawable.Drawable getIcon();
    Code:
       0: aload_0
       1: getfield      #74                 // Field l:Landroid/graphics/drawable/Drawable;
       4: areturn

  public android.content.res.ColorStateList getIconTintList();
    Code:
       0: aload_0
       1: getfield      #51                 // Field r:Landroid/content/res/ColorStateList;
       4: areturn

  public android.graphics.PorterDuff$Mode getIconTintMode();
    Code:
       0: aload_0
       1: getfield      #53                 // Field s:Landroid/graphics/PorterDuff$Mode;
       4: areturn

  public android.content.Intent getIntent();
    Code:
       0: aload_0
       1: getfield      #132                // Field g:Landroid/content/Intent;
       4: areturn

  public int getItemId();
    Code:
       0: aload_0
       1: getfield      #63                 // Field a:I
       4: ireturn

  public android.view.ContextMenu$ContextMenuInfo getMenuInfo();
    Code:
       0: aconst_null
       1: areturn

  public int getNumericModifiers();
    Code:
       0: aload_0
       1: getfield      #45                 // Field i:I
       4: ireturn

  public char getNumericShortcut();
    Code:
       0: aload_0
       1: getfield      #139                // Field h:C
       4: ireturn

  public int getOrder();
    Code:
       0: aload_0
       1: getfield      #69                 // Field d:I
       4: ireturn

  public android.view.SubMenu getSubMenu();
    Code:
       0: aconst_null
       1: areturn

  public java.lang.CharSequence getTitle();
    Code:
       0: aload_0
       1: getfield      #71                 // Field e:Ljava/lang/CharSequence;
       4: areturn

  public java.lang.CharSequence getTitleCondensed();
    Code:
       0: aload_0
       1: getfield      #146                // Field f:Ljava/lang/CharSequence;
       4: ifnull        12
       7: aload_0
       8: getfield      #146                // Field f:Ljava/lang/CharSequence;
      11: areturn
      12: aload_0
      13: getfield      #71                 // Field e:Ljava/lang/CharSequence;
      16: areturn

  public java.lang.CharSequence getTooltipText();
    Code:
       0: aload_0
       1: getfield      #107                // Field q:Ljava/lang/CharSequence;
       4: areturn

  public boolean hasSubMenu();
    Code:
       0: iconst_0
       1: ireturn

  public boolean isActionViewExpanded();
    Code:
       0: iconst_0
       1: ireturn

  public boolean isCheckable();
    Code:
       0: aload_0
       1: getfield      #59                 // Field v:I
       4: iconst_1
       5: iand
       6: ifeq          11
       9: iconst_1
      10: ireturn
      11: iconst_0
      12: ireturn

  public boolean isChecked();
    Code:
       0: aload_0
       1: getfield      #59                 // Field v:I
       4: iconst_2
       5: iand
       6: ifeq          11
       9: iconst_1
      10: ireturn
      11: iconst_0
      12: ireturn

  public boolean isEnabled();
    Code:
       0: aload_0
       1: getfield      #59                 // Field v:I
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
       1: getfield      #59                 // Field v:I
       4: bipush        8
       6: iand
       7: ifne          12
      10: iconst_1
      11: ireturn
      12: iconst_0
      13: ireturn

  public android.view.MenuItem setActionProvider(android.view.ActionProvider);
    Code:
       0: new           #94                 // class java/lang/UnsupportedOperationException
       3: dup
       4: invokespecial #95                 // Method java/lang/UnsupportedOperationException."<init>":()V
       7: athrow

  public android.view.MenuItem setActionView(int);
    Code:
       0: aload_0
       1: iload_1
       2: invokevirtual #159                // Method a:(I)Landroid/support/v4/c/a/b;
       5: areturn

  public android.view.MenuItem setActionView(android.view.View);
    Code:
       0: aload_0
       1: aload_1
       2: invokevirtual #162                // Method a:(Landroid/view/View;)Landroid/support/v4/c/a/b;
       5: areturn

  public android.view.MenuItem setAlphabeticShortcut(char);
    Code:
       0: aload_0
       1: iload_1
       2: invokestatic  #170                // Method java/lang/Character.toLowerCase:(C)C
       5: putfield      #120                // Field j:C
       8: aload_0
       9: areturn

  public android.view.MenuItem setAlphabeticShortcut(char, int);
    Code:
       0: aload_0
       1: iload_1
       2: invokestatic  #170                // Method java/lang/Character.toLowerCase:(C)C
       5: putfield      #120                // Field j:C
       8: aload_0
       9: iload_2
      10: invokestatic  #177                // Method android/view/KeyEvent.normalizeMetaState:(I)I
      13: putfield      #47                 // Field k:I
      16: aload_0
      17: areturn

  public android.view.MenuItem setCheckable(boolean);
    Code:
       0: aload_0
       1: iload_1
       2: aload_0
       3: getfield      #59                 // Field v:I
       6: bipush        -2
       8: iand
       9: ior
      10: putfield      #59                 // Field v:I
      13: aload_0
      14: areturn

  public android.view.MenuItem setChecked(boolean);
    Code:
       0: aload_0
       1: getfield      #59                 // Field v:I
       4: istore_3
       5: iload_1
       6: ifeq          14
       9: iconst_2
      10: istore_2
      11: goto          16
      14: iconst_0
      15: istore_2
      16: aload_0
      17: iload_2
      18: iload_3
      19: bipush        -3
      21: iand
      22: ior
      23: putfield      #59                 // Field v:I
      26: aload_0
      27: areturn

  public android.view.MenuItem setContentDescription(java.lang.CharSequence);
    Code:
       0: aload_0
       1: aload_1
       2: invokevirtual #184                // Method a:(Ljava/lang/CharSequence;)Landroid/support/v4/c/a/b;
       5: areturn

  public android.view.MenuItem setEnabled(boolean);
    Code:
       0: aload_0
       1: getfield      #59                 // Field v:I
       4: istore_3
       5: iload_1
       6: ifeq          15
       9: bipush        16
      11: istore_2
      12: goto          17
      15: iconst_0
      16: istore_2
      17: aload_0
      18: iload_2
      19: iload_3
      20: bipush        -17
      22: iand
      23: ior
      24: putfield      #59                 // Field v:I
      27: aload_0
      28: areturn

  public android.view.MenuItem setIcon(int);
    Code:
       0: aload_0
       1: iload_1
       2: putfield      #49                 // Field m:I
       5: aload_0
       6: aload_0
       7: getfield      #61                 // Field n:Landroid/content/Context;
      10: iload_1
      11: invokestatic  #191                // Method android/support/v4/a/a.a:(Landroid/content/Context;I)Landroid/graphics/drawable/Drawable;
      14: putfield      #74                 // Field l:Landroid/graphics/drawable/Drawable;
      17: aload_0
      18: invokespecial #193                // Method b:()V
      21: aload_0
      22: areturn

  public android.view.MenuItem setIcon(android.graphics.drawable.Drawable);
    Code:
       0: aload_0
       1: aload_1
       2: putfield      #74                 // Field l:Landroid/graphics/drawable/Drawable;
       5: aload_0
       6: iconst_0
       7: putfield      #49                 // Field m:I
      10: aload_0
      11: invokespecial #193                // Method b:()V
      14: aload_0
      15: areturn

  public android.view.MenuItem setIconTintList(android.content.res.ColorStateList);
    Code:
       0: aload_0
       1: aload_1
       2: putfield      #51                 // Field r:Landroid/content/res/ColorStateList;
       5: aload_0
       6: iconst_1
       7: putfield      #55                 // Field t:Z
      10: aload_0
      11: invokespecial #193                // Method b:()V
      14: aload_0
      15: areturn

  public android.view.MenuItem setIconTintMode(android.graphics.PorterDuff$Mode);
    Code:
       0: aload_0
       1: aload_1
       2: putfield      #53                 // Field s:Landroid/graphics/PorterDuff$Mode;
       5: aload_0
       6: iconst_1
       7: putfield      #57                 // Field u:Z
      10: aload_0
      11: invokespecial #193                // Method b:()V
      14: aload_0
      15: areturn

  public android.view.MenuItem setIntent(android.content.Intent);
    Code:
       0: aload_0
       1: aload_1
       2: putfield      #132                // Field g:Landroid/content/Intent;
       5: aload_0
       6: areturn

  public android.view.MenuItem setNumericShortcut(char);
    Code:
       0: aload_0
       1: iload_1
       2: putfield      #139                // Field h:C
       5: aload_0
       6: areturn

  public android.view.MenuItem setNumericShortcut(char, int);
    Code:
       0: aload_0
       1: iload_1
       2: putfield      #139                // Field h:C
       5: aload_0
       6: iload_2
       7: invokestatic  #177                // Method android/view/KeyEvent.normalizeMetaState:(I)I
      10: putfield      #45                 // Field i:I
      13: aload_0
      14: areturn

  public android.view.MenuItem setOnActionExpandListener(android.view.MenuItem$OnActionExpandListener);
    Code:
       0: new           #94                 // class java/lang/UnsupportedOperationException
       3: dup
       4: invokespecial #95                 // Method java/lang/UnsupportedOperationException."<init>":()V
       7: athrow

  public android.view.MenuItem setOnMenuItemClickListener(android.view.MenuItem$OnMenuItemClickListener);
    Code:
       0: aload_0
       1: aload_1
       2: putfield      #207                // Field o:Landroid/view/MenuItem$OnMenuItemClickListener;
       5: aload_0
       6: areturn

  public android.view.MenuItem setShortcut(char, char);
    Code:
       0: aload_0
       1: iload_1
       2: putfield      #139                // Field h:C
       5: aload_0
       6: iload_2
       7: invokestatic  #170                // Method java/lang/Character.toLowerCase:(C)C
      10: putfield      #120                // Field j:C
      13: aload_0
      14: areturn

  public android.view.MenuItem setShortcut(char, char, int, int);
    Code:
       0: aload_0
       1: iload_1
       2: putfield      #139                // Field h:C
       5: aload_0
       6: iload_3
       7: invokestatic  #177                // Method android/view/KeyEvent.normalizeMetaState:(I)I
      10: putfield      #45                 // Field i:I
      13: aload_0
      14: iload_2
      15: invokestatic  #170                // Method java/lang/Character.toLowerCase:(C)C
      18: putfield      #120                // Field j:C
      21: aload_0
      22: iload         4
      24: invokestatic  #177                // Method android/view/KeyEvent.normalizeMetaState:(I)I
      27: putfield      #47                 // Field k:I
      30: aload_0
      31: areturn

  public void setShowAsAction(int);
    Code:
       0: return

  public android.view.MenuItem setShowAsActionFlags(int);
    Code:
       0: aload_0
       1: iload_1
       2: invokevirtual #213                // Method b:(I)Landroid/support/v4/c/a/b;
       5: areturn

  public android.view.MenuItem setTitle(int);
    Code:
       0: aload_0
       1: aload_0
       2: getfield      #61                 // Field n:Landroid/content/Context;
       5: invokevirtual #220                // Method android/content/Context.getResources:()Landroid/content/res/Resources;
       8: iload_1
       9: invokevirtual #226                // Method android/content/res/Resources.getString:(I)Ljava/lang/String;
      12: putfield      #71                 // Field e:Ljava/lang/CharSequence;
      15: aload_0
      16: areturn

  public android.view.MenuItem setTitle(java.lang.CharSequence);
    Code:
       0: aload_0
       1: aload_1
       2: putfield      #71                 // Field e:Ljava/lang/CharSequence;
       5: aload_0
       6: areturn

  public android.view.MenuItem setTitleCondensed(java.lang.CharSequence);
    Code:
       0: aload_0
       1: aload_1
       2: putfield      #146                // Field f:Ljava/lang/CharSequence;
       5: aload_0
       6: areturn

  public android.view.MenuItem setTooltipText(java.lang.CharSequence);
    Code:
       0: aload_0
       1: aload_1
       2: invokevirtual #230                // Method b:(Ljava/lang/CharSequence;)Landroid/support/v4/c/a/b;
       5: areturn

  public android.view.MenuItem setVisible(boolean);
    Code:
       0: aload_0
       1: getfield      #59                 // Field v:I
       4: istore_3
       5: bipush        8
       7: istore_2
       8: iload_1
       9: ifeq          14
      12: iconst_0
      13: istore_2
      14: aload_0
      15: iload_3
      16: bipush        8
      18: iand
      19: iload_2
      20: ior
      21: putfield      #59                 // Field v:I
      24: aload_0
      25: areturn
}
