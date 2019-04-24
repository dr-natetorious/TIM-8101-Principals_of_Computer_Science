class android.support.v7.app.o extends android.support.v7.app.a {
  android.support.v7.widget.al a;

  boolean b;

  android.view.Window$Callback c;

  android.support.v7.app.o(android.support.v7.widget.Toolbar, java.lang.CharSequence, android.view.Window$Callback);
    Code:
       0: aload_0
       1: invokespecial #34                 // Method android/support/v7/app/a."<init>":()V
       4: aload_0
       5: new           #36                 // class java/util/ArrayList
       8: dup
       9: invokespecial #37                 // Method java/util/ArrayList."<init>":()V
      12: putfield      #39                 // Field f:Ljava/util/ArrayList;
      15: aload_0
      16: new           #6                  // class android/support/v7/app/o$1
      19: dup
      20: aload_0
      21: invokespecial #42                 // Method android/support/v7/app/o$1."<init>":(Landroid/support/v7/app/o;)V
      24: putfield      #44                 // Field g:Ljava/lang/Runnable;
      27: aload_0
      28: new           #8                  // class android/support/v7/app/o$2
      31: dup
      32: aload_0
      33: invokespecial #45                 // Method android/support/v7/app/o$2."<init>":(Landroid/support/v7/app/o;)V
      36: putfield      #47                 // Field h:Landroid/support/v7/widget/Toolbar$c;
      39: aload_0
      40: new           #49                 // class android/support/v7/widget/bq
      43: dup
      44: aload_1
      45: iconst_0
      46: invokespecial #52                 // Method android/support/v7/widget/bq."<init>":(Landroid/support/v7/widget/Toolbar;Z)V
      49: putfield      #54                 // Field a:Landroid/support/v7/widget/al;
      52: aload_0
      53: new           #16                 // class android/support/v7/app/o$c
      56: dup
      57: aload_0
      58: aload_3
      59: invokespecial #57                 // Method android/support/v7/app/o$c."<init>":(Landroid/support/v7/app/o;Landroid/view/Window$Callback;)V
      62: putfield      #59                 // Field c:Landroid/view/Window$Callback;
      65: aload_0
      66: getfield      #54                 // Field a:Landroid/support/v7/widget/al;
      69: aload_0
      70: getfield      #59                 // Field c:Landroid/view/Window$Callback;
      73: invokeinterface #64,  2           // InterfaceMethod android/support/v7/widget/al.a:(Landroid/view/Window$Callback;)V
      78: aload_1
      79: aload_0
      80: getfield      #47                 // Field h:Landroid/support/v7/widget/Toolbar$c;
      83: invokevirtual #70                 // Method android/support/v7/widget/Toolbar.setOnMenuItemClickListener:(Landroid/support/v7/widget/Toolbar$c;)V
      86: aload_0
      87: getfield      #54                 // Field a:Landroid/support/v7/widget/al;
      90: aload_2
      91: invokeinterface #73,  2           // InterfaceMethod android/support/v7/widget/al.a:(Ljava/lang/CharSequence;)V
      96: return

  public int a();
    Code:
       0: aload_0
       1: getfield      #54                 // Field a:Landroid/support/v7/widget/al;
       4: invokeinterface #90,  1           // InterfaceMethod android/support/v7/widget/al.o:()I
       9: ireturn

  public void a(float);
    Code:
       0: aload_0
       1: getfield      #54                 // Field a:Landroid/support/v7/widget/al;
       4: invokeinterface #94,  1           // InterfaceMethod android/support/v7/widget/al.a:()Landroid/view/ViewGroup;
       9: fload_1
      10: invokestatic  #99                 // Method android/support/v4/view/s.a:(Landroid/view/View;F)V
      13: return

  public void a(int);
    Code:
       0: aload_0
       1: getfield      #54                 // Field a:Landroid/support/v7/widget/al;
       4: iload_1
       5: invokeinterface #102,  2          // InterfaceMethod android/support/v7/widget/al.d:(I)V
      10: return

  public void a(int, int);
    Code:
       0: aload_0
       1: getfield      #54                 // Field a:Landroid/support/v7/widget/al;
       4: invokeinterface #90,  1           // InterfaceMethod android/support/v7/widget/al.o:()I
       9: istore_3
      10: aload_0
      11: getfield      #54                 // Field a:Landroid/support/v7/widget/al;
      14: iload_1
      15: iload_2
      16: iand
      17: iload_2
      18: iconst_m1
      19: ixor
      20: iload_3
      21: iand
      22: ior
      23: invokeinterface #105,  2          // InterfaceMethod android/support/v7/widget/al.c:(I)V
      28: return

  public void a(android.content.res.Configuration);
    Code:
       0: aload_0
       1: aload_1
       2: invokespecial #108                // Method android/support/v7/app/a.a:(Landroid/content/res/Configuration;)V
       5: return

  public void a(android.graphics.drawable.Drawable);
    Code:
       0: aload_0
       1: getfield      #54                 // Field a:Landroid/support/v7/widget/al;
       4: aload_1
       5: invokeinterface #111,  2          // InterfaceMethod android/support/v7/widget/al.b:(Landroid/graphics/drawable/Drawable;)V
      10: return

  public void a(java.lang.CharSequence);
    Code:
       0: aload_0
       1: getfield      #54                 // Field a:Landroid/support/v7/widget/al;
       4: aload_1
       5: invokeinterface #73,  2           // InterfaceMethod android/support/v7/widget/al.a:(Ljava/lang/CharSequence;)V
      10: return

  public void a(boolean);
    Code:
       0: iload_1
       1: ifeq          9
       4: iconst_2
       5: istore_2
       6: goto          11
       9: iconst_0
      10: istore_2
      11: aload_0
      12: iload_2
      13: iconst_2
      14: invokevirtual #114                // Method a:(II)V
      17: return

  public boolean a(int, android.view.KeyEvent);
    Code:
       0: aload_0
       1: invokespecial #117                // Method j:()Landroid/view/Menu;
       4: astore        5
       6: aload         5
       8: ifnull        67
      11: aload_2
      12: ifnull        23
      15: aload_2
      16: invokevirtual #122                // Method android/view/KeyEvent.getDeviceId:()I
      19: istore_3
      20: goto          25
      23: iconst_m1
      24: istore_3
      25: iload_3
      26: invokestatic  #128                // Method android/view/KeyCharacterMap.load:(I)Landroid/view/KeyCharacterMap;
      29: invokevirtual #131                // Method android/view/KeyCharacterMap.getKeyboardType:()I
      32: istore_3
      33: iconst_1
      34: istore        4
      36: iload_3
      37: iconst_1
      38: if_icmpeq     44
      41: goto          47
      44: iconst_0
      45: istore        4
      47: aload         5
      49: iload         4
      51: invokeinterface #136,  2          // InterfaceMethod android/view/Menu.setQwertyMode:(Z)V
      56: aload         5
      58: iload_1
      59: aload_2
      60: iconst_0
      61: invokeinterface #140,  4          // InterfaceMethod android/view/Menu.performShortcut:(ILandroid/view/KeyEvent;I)Z
      66: ireturn
      67: iconst_0
      68: ireturn

  public boolean a(android.view.KeyEvent);
    Code:
       0: aload_1
       1: invokevirtual #144                // Method android/view/KeyEvent.getAction:()I
       4: iconst_1
       5: if_icmpne     13
       8: aload_0
       9: invokevirtual #147                // Method c:()Z
      12: pop
      13: iconst_1
      14: ireturn

  public android.content.Context b();
    Code:
       0: aload_0
       1: getfield      #54                 // Field a:Landroid/support/v7/widget/al;
       4: invokeinterface #150,  1          // InterfaceMethod android/support/v7/widget/al.b:()Landroid/content/Context;
       9: areturn

  public void b(int);
    Code:
       0: aload_0
       1: getfield      #54                 // Field a:Landroid/support/v7/widget/al;
       4: iload_1
       5: invokeinterface #152,  2          // InterfaceMethod android/support/v7/widget/al.e:(I)V
      10: return

  public void b(boolean);
    Code:
       0: iload_1
       1: ifeq          9
       4: iconst_4
       5: istore_2
       6: goto          11
       9: iconst_0
      10: istore_2
      11: aload_0
      12: iload_2
      13: iconst_4
      14: invokevirtual #114                // Method a:(II)V
      17: return

  public void c(boolean);
    Code:
       0: return

  public boolean c();
    Code:
       0: aload_0
       1: getfield      #54                 // Field a:Landroid/support/v7/widget/al;
       4: invokeinterface #155,  1          // InterfaceMethod android/support/v7/widget/al.k:()Z
       9: ireturn

  public boolean d();
    Code:
       0: aload_0
       1: getfield      #54                 // Field a:Landroid/support/v7/widget/al;
       4: invokeinterface #158,  1          // InterfaceMethod android/support/v7/widget/al.l:()Z
       9: ireturn

  public void e(boolean);
    Code:
       0: return

  public boolean e();
    Code:
       0: aload_0
       1: getfield      #54                 // Field a:Landroid/support/v7/widget/al;
       4: invokeinterface #94,  1           // InterfaceMethod android/support/v7/widget/al.a:()Landroid/view/ViewGroup;
       9: aload_0
      10: getfield      #44                 // Field g:Ljava/lang/Runnable;
      13: invokevirtual #164                // Method android/view/ViewGroup.removeCallbacks:(Ljava/lang/Runnable;)Z
      16: pop
      17: aload_0
      18: getfield      #54                 // Field a:Landroid/support/v7/widget/al;
      21: invokeinterface #94,  1           // InterfaceMethod android/support/v7/widget/al.a:()Landroid/view/ViewGroup;
      26: aload_0
      27: getfield      #44                 // Field g:Ljava/lang/Runnable;
      30: invokestatic  #167                // Method android/support/v4/view/s.a:(Landroid/view/View;Ljava/lang/Runnable;)V
      33: iconst_1
      34: ireturn

  public void f(boolean);
    Code:
       0: return

  public boolean f();
    Code:
       0: aload_0
       1: getfield      #54                 // Field a:Landroid/support/v7/widget/al;
       4: invokeinterface #168,  1          // InterfaceMethod android/support/v7/widget/al.c:()Z
       9: ifeq          23
      12: aload_0
      13: getfield      #54                 // Field a:Landroid/support/v7/widget/al;
      16: invokeinterface #170,  1          // InterfaceMethod android/support/v7/widget/al.d:()V
      21: iconst_1
      22: ireturn
      23: iconst_0
      24: ireturn

  void g();
    Code:
       0: aload_0
       1: getfield      #54                 // Field a:Landroid/support/v7/widget/al;
       4: invokeinterface #94,  1           // InterfaceMethod android/support/v7/widget/al.a:()Landroid/view/ViewGroup;
       9: aload_0
      10: getfield      #44                 // Field g:Ljava/lang/Runnable;
      13: invokevirtual #164                // Method android/view/ViewGroup.removeCallbacks:(Ljava/lang/Runnable;)Z
      16: pop
      17: return

  public void g(boolean);
    Code:
       0: iload_1
       1: aload_0
       2: getfield      #172                // Field e:Z
       5: if_icmpne     9
       8: return
       9: aload_0
      10: iload_1
      11: putfield      #172                // Field e:Z
      14: aload_0
      15: getfield      #39                 // Field f:Ljava/util/ArrayList;
      18: invokevirtual #175                // Method java/util/ArrayList.size:()I
      21: istore_3
      22: iconst_0
      23: istore_2
      24: iload_2
      25: iload_3
      26: if_icmpge     53
      29: aload_0
      30: getfield      #39                 // Field f:Ljava/util/ArrayList;
      33: iload_2
      34: invokevirtual #179                // Method java/util/ArrayList.get:(I)Ljava/lang/Object;
      37: checkcast     #181                // class android/support/v7/app/a$b
      40: iload_1
      41: invokeinterface #183,  2          // InterfaceMethod android/support/v7/app/a$b.a:(Z)V
      46: iload_2
      47: iconst_1
      48: iadd
      49: istore_2
      50: goto          24
      53: return

  public android.view.Window$Callback h();
    Code:
       0: aload_0
       1: getfield      #59                 // Field c:Landroid/view/Window$Callback;
       4: areturn

  void i();
    Code:
       0: aload_0
       1: invokespecial #117                // Method j:()Landroid/view/Menu;
       4: astore_2
       5: aload_2
       6: instanceof    #187                // class android/support/v7/view/menu/h
       9: ifeq          20
      12: aload_2
      13: checkcast     #187                // class android/support/v7/view/menu/h
      16: astore_1
      17: goto          22
      20: aconst_null
      21: astore_1
      22: aload_1
      23: ifnull        30
      26: aload_1
      27: invokevirtual #189                // Method android/support/v7/view/menu/h.g:()V
      30: aload_2
      31: invokeinterface #192,  1          // InterfaceMethod android/view/Menu.clear:()V
      36: aload_0
      37: getfield      #59                 // Field c:Landroid/view/Window$Callback;
      40: iconst_0
      41: aload_2
      42: invokeinterface #198,  3          // InterfaceMethod android/view/Window$Callback.onCreatePanelMenu:(ILandroid/view/Menu;)Z
      47: ifeq          65
      50: aload_0
      51: getfield      #59                 // Field c:Landroid/view/Window$Callback;
      54: iconst_0
      55: aconst_null
      56: aload_2
      57: invokeinterface #202,  4          // InterfaceMethod android/view/Window$Callback.onPreparePanel:(ILandroid/view/View;Landroid/view/Menu;)Z
      62: ifne          71
      65: aload_2
      66: invokeinterface #192,  1          // InterfaceMethod android/view/Menu.clear:()V
      71: aload_1
      72: ifnull        79
      75: aload_1
      76: invokevirtual #204                // Method android/support/v7/view/menu/h.h:()V
      79: return
      80: astore_2
      81: aload_1
      82: ifnull        89
      85: aload_1
      86: invokevirtual #204                // Method android/support/v7/view/menu/h.h:()V
      89: aload_2
      90: athrow
    Exception table:
       from    to  target type
          30    65    80   any
          65    71    80   any
}
