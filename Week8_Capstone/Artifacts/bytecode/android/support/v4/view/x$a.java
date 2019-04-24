class android.support.v4.view.x$a implements android.support.v4.view.y {
  android.support.v4.view.x a;

  boolean b;

  android.support.v4.view.x$a(android.support.v4.view.x);
    Code:
       0: aload_0
       1: invokespecial #17                 // Method java/lang/Object."<init>":()V
       4: aload_0
       5: aload_1
       6: putfield      #19                 // Field a:Landroid/support/v4/view/x;
       9: return

  public void a(android.view.View);
    Code:
       0: aload_0
       1: iconst_0
       2: putfield      #23                 // Field b:Z
       5: aload_0
       6: getfield      #19                 // Field a:Landroid/support/v4/view/x;
       9: getfield      #27                 // Field android/support/v4/view/x.c:I
      12: istore_2
      13: aconst_null
      14: astore_3
      15: iload_2
      16: iconst_m1
      17: if_icmple     26
      20: aload_1
      21: iconst_2
      22: aconst_null
      23: invokevirtual #33                 // Method android/view/View.setLayerType:(ILandroid/graphics/Paint;)V
      26: aload_0
      27: getfield      #19                 // Field a:Landroid/support/v4/view/x;
      30: getfield      #36                 // Field android/support/v4/view/x.a:Ljava/lang/Runnable;
      33: ifnull        60
      36: aload_0
      37: getfield      #19                 // Field a:Landroid/support/v4/view/x;
      40: getfield      #36                 // Field android/support/v4/view/x.a:Ljava/lang/Runnable;
      43: astore        4
      45: aload_0
      46: getfield      #19                 // Field a:Landroid/support/v4/view/x;
      49: aconst_null
      50: putfield      #36                 // Field android/support/v4/view/x.a:Ljava/lang/Runnable;
      53: aload         4
      55: invokeinterface #41,  1           // InterfaceMethod java/lang/Runnable.run:()V
      60: aload_1
      61: ldc           #42                 // int 2113929216
      63: invokevirtual #46                 // Method android/view/View.getTag:(I)Ljava/lang/Object;
      66: astore        4
      68: aload         4
      70: instanceof    #6                  // class android/support/v4/view/y
      73: ifeq          82
      76: aload         4
      78: checkcast     #6                  // class android/support/v4/view/y
      81: astore_3
      82: aload_3
      83: ifnull        93
      86: aload_3
      87: aload_1
      88: invokeinterface #48,  2           // InterfaceMethod android/support/v4/view/y.a:(Landroid/view/View;)V
      93: return

  public void b(android.view.View);
    Code:
       0: aload_0
       1: getfield      #19                 // Field a:Landroid/support/v4/view/x;
       4: getfield      #27                 // Field android/support/v4/view/x.c:I
       7: istore_2
       8: aconst_null
       9: astore_3
      10: iload_2
      11: iconst_m1
      12: if_icmple     35
      15: aload_1
      16: aload_0
      17: getfield      #19                 // Field a:Landroid/support/v4/view/x;
      20: getfield      #27                 // Field android/support/v4/view/x.c:I
      23: aconst_null
      24: invokevirtual #33                 // Method android/view/View.setLayerType:(ILandroid/graphics/Paint;)V
      27: aload_0
      28: getfield      #19                 // Field a:Landroid/support/v4/view/x;
      31: iconst_m1
      32: putfield      #27                 // Field android/support/v4/view/x.c:I
      35: getstatic     #53                 // Field android/os/Build$VERSION.SDK_INT:I
      38: bipush        16
      40: if_icmpge     50
      43: aload_0
      44: getfield      #23                 // Field b:Z
      47: ifne          122
      50: aload_0
      51: getfield      #19                 // Field a:Landroid/support/v4/view/x;
      54: getfield      #55                 // Field android/support/v4/view/x.b:Ljava/lang/Runnable;
      57: ifnull        84
      60: aload_0
      61: getfield      #19                 // Field a:Landroid/support/v4/view/x;
      64: getfield      #55                 // Field android/support/v4/view/x.b:Ljava/lang/Runnable;
      67: astore        4
      69: aload_0
      70: getfield      #19                 // Field a:Landroid/support/v4/view/x;
      73: aconst_null
      74: putfield      #55                 // Field android/support/v4/view/x.b:Ljava/lang/Runnable;
      77: aload         4
      79: invokeinterface #41,  1           // InterfaceMethod java/lang/Runnable.run:()V
      84: aload_1
      85: ldc           #42                 // int 2113929216
      87: invokevirtual #46                 // Method android/view/View.getTag:(I)Ljava/lang/Object;
      90: astore        4
      92: aload         4
      94: instanceof    #6                  // class android/support/v4/view/y
      97: ifeq          106
     100: aload         4
     102: checkcast     #6                  // class android/support/v4/view/y
     105: astore_3
     106: aload_3
     107: ifnull        117
     110: aload_3
     111: aload_1
     112: invokeinterface #57,  2           // InterfaceMethod android/support/v4/view/y.b:(Landroid/view/View;)V
     117: aload_0
     118: iconst_1
     119: putfield      #23                 // Field b:Z
     122: return

  public void c(android.view.View);
    Code:
       0: aload_1
       1: ldc           #42                 // int 2113929216
       3: invokevirtual #46                 // Method android/view/View.getTag:(I)Ljava/lang/Object;
       6: astore_2
       7: aload_2
       8: instanceof    #6                  // class android/support/v4/view/y
      11: ifeq          22
      14: aload_2
      15: checkcast     #6                  // class android/support/v4/view/y
      18: astore_2
      19: goto          24
      22: aconst_null
      23: astore_2
      24: aload_2
      25: ifnull        35
      28: aload_2
      29: aload_1
      30: invokeinterface #59,  2           // InterfaceMethod android/support/v4/view/y.c:(Landroid/view/View;)V
      35: return
}
