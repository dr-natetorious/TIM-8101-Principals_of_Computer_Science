public class android.support.v7.view.menu.u extends android.support.v7.view.menu.h implements android.view.SubMenu {
  public android.support.v7.view.menu.u(android.content.Context, android.support.v7.view.menu.h, android.support.v7.view.menu.j);
    Code:
       0: aload_0
       1: aload_1
       2: invokespecial #15                 // Method android/support/v7/view/menu/h."<init>":(Landroid/content/Context;)V
       5: aload_0
       6: aload_2
       7: putfield      #17                 // Field d:Landroid/support/v7/view/menu/h;
      10: aload_0
      11: aload_3
      12: putfield      #19                 // Field e:Landroid/support/v7/view/menu/j;
      15: return

  public java.lang.String a();
    Code:
       0: aload_0
       1: getfield      #19                 // Field e:Landroid/support/v7/view/menu/j;
       4: ifnull        18
       7: aload_0
       8: getfield      #19                 // Field e:Landroid/support/v7/view/menu/j;
      11: invokevirtual #28                 // Method android/support/v7/view/menu/j.getItemId:()I
      14: istore_1
      15: goto          20
      18: iconst_0
      19: istore_1
      20: iload_1
      21: ifne          26
      24: aconst_null
      25: areturn
      26: new           #30                 // class java/lang/StringBuilder
      29: dup
      30: invokespecial #33                 // Method java/lang/StringBuilder."<init>":()V
      33: astore_2
      34: aload_2
      35: aload_0
      36: invokespecial #35                 // Method android/support/v7/view/menu/h.a:()Ljava/lang/String;
      39: invokevirtual #39                 // Method java/lang/StringBuilder.append:(Ljava/lang/String;)Ljava/lang/StringBuilder;
      42: pop
      43: aload_2
      44: ldc           #41                 // String :
      46: invokevirtual #39                 // Method java/lang/StringBuilder.append:(Ljava/lang/String;)Ljava/lang/StringBuilder;
      49: pop
      50: aload_2
      51: iload_1
      52: invokevirtual #44                 // Method java/lang/StringBuilder.append:(I)Ljava/lang/StringBuilder;
      55: pop
      56: aload_2
      57: invokevirtual #47                 // Method java/lang/StringBuilder.toString:()Ljava/lang/String;
      60: areturn

  public void a(android.support.v7.view.menu.h$a);
    Code:
       0: aload_0
       1: getfield      #17                 // Field d:Landroid/support/v7/view/menu/h;
       4: aload_1
       5: invokevirtual #50                 // Method android/support/v7/view/menu/h.a:(Landroid/support/v7/view/menu/h$a;)V
       8: return

  boolean a(android.support.v7.view.menu.h, android.view.MenuItem);
    Code:
       0: aload_0
       1: aload_1
       2: aload_2
       3: invokespecial #53                 // Method android/support/v7/view/menu/h.a:(Landroid/support/v7/view/menu/h;Landroid/view/MenuItem;)Z
       6: ifne          26
       9: aload_0
      10: getfield      #17                 // Field d:Landroid/support/v7/view/menu/h;
      13: aload_1
      14: aload_2
      15: invokevirtual #53                 // Method android/support/v7/view/menu/h.a:(Landroid/support/v7/view/menu/h;Landroid/view/MenuItem;)Z
      18: ifeq          24
      21: goto          26
      24: iconst_0
      25: ireturn
      26: iconst_1
      27: ireturn

  public boolean b();
    Code:
       0: aload_0
       1: getfield      #17                 // Field d:Landroid/support/v7/view/menu/h;
       4: invokevirtual #57                 // Method android/support/v7/view/menu/h.b:()Z
       7: ireturn

  public boolean c();
    Code:
       0: aload_0
       1: getfield      #17                 // Field d:Landroid/support/v7/view/menu/h;
       4: invokevirtual #60                 // Method android/support/v7/view/menu/h.c:()Z
       7: ireturn

  public boolean c(android.support.v7.view.menu.j);
    Code:
       0: aload_0
       1: getfield      #17                 // Field d:Landroid/support/v7/view/menu/h;
       4: aload_1
       5: invokevirtual #63                 // Method android/support/v7/view/menu/h.c:(Landroid/support/v7/view/menu/j;)Z
       8: ireturn

  public boolean d(android.support.v7.view.menu.j);
    Code:
       0: aload_0
       1: getfield      #17                 // Field d:Landroid/support/v7/view/menu/h;
       4: aload_1
       5: invokevirtual #65                 // Method android/support/v7/view/menu/h.d:(Landroid/support/v7/view/menu/j;)Z
       8: ireturn

  public android.view.MenuItem getItem();
    Code:
       0: aload_0
       1: getfield      #19                 // Field e:Landroid/support/v7/view/menu/j;
       4: areturn

  public android.support.v7.view.menu.h p();
    Code:
       0: aload_0
       1: getfield      #17                 // Field d:Landroid/support/v7/view/menu/h;
       4: invokevirtual #71                 // Method android/support/v7/view/menu/h.p:()Landroid/support/v7/view/menu/h;
       7: areturn

  public android.view.Menu s();
    Code:
       0: aload_0
       1: getfield      #17                 // Field d:Landroid/support/v7/view/menu/h;
       4: areturn

  public android.view.SubMenu setHeaderIcon(int);
    Code:
       0: aload_0
       1: iload_1
       2: invokespecial #78                 // Method android/support/v7/view/menu/h.e:(I)Landroid/support/v7/view/menu/h;
       5: checkcast     #6                  // class android/view/SubMenu
       8: areturn

  public android.view.SubMenu setHeaderIcon(android.graphics.drawable.Drawable);
    Code:
       0: aload_0
       1: aload_1
       2: invokespecial #82                 // Method android/support/v7/view/menu/h.a:(Landroid/graphics/drawable/Drawable;)Landroid/support/v7/view/menu/h;
       5: checkcast     #6                  // class android/view/SubMenu
       8: areturn

  public android.view.SubMenu setHeaderTitle(int);
    Code:
       0: aload_0
       1: iload_1
       2: invokespecial #85                 // Method android/support/v7/view/menu/h.d:(I)Landroid/support/v7/view/menu/h;
       5: checkcast     #6                  // class android/view/SubMenu
       8: areturn

  public android.view.SubMenu setHeaderTitle(java.lang.CharSequence);
    Code:
       0: aload_0
       1: aload_1
       2: invokespecial #89                 // Method android/support/v7/view/menu/h.a:(Ljava/lang/CharSequence;)Landroid/support/v7/view/menu/h;
       5: checkcast     #6                  // class android/view/SubMenu
       8: areturn

  public android.view.SubMenu setHeaderView(android.view.View);
    Code:
       0: aload_0
       1: aload_1
       2: invokespecial #94                 // Method android/support/v7/view/menu/h.a:(Landroid/view/View;)Landroid/support/v7/view/menu/h;
       5: checkcast     #6                  // class android/view/SubMenu
       8: areturn

  public android.view.SubMenu setIcon(int);
    Code:
       0: aload_0
       1: getfield      #19                 // Field e:Landroid/support/v7/view/menu/j;
       4: iload_1
       5: invokevirtual #98                 // Method android/support/v7/view/menu/j.setIcon:(I)Landroid/view/MenuItem;
       8: pop
       9: aload_0
      10: areturn

  public android.view.SubMenu setIcon(android.graphics.drawable.Drawable);
    Code:
       0: aload_0
       1: getfield      #19                 // Field e:Landroid/support/v7/view/menu/j;
       4: aload_1
       5: invokevirtual #101                // Method android/support/v7/view/menu/j.setIcon:(Landroid/graphics/drawable/Drawable;)Landroid/view/MenuItem;
       8: pop
       9: aload_0
      10: areturn

  public void setQwertyMode(boolean);
    Code:
       0: aload_0
       1: getfield      #17                 // Field d:Landroid/support/v7/view/menu/h;
       4: iload_1
       5: invokevirtual #105                // Method android/support/v7/view/menu/h.setQwertyMode:(Z)V
       8: return
}
