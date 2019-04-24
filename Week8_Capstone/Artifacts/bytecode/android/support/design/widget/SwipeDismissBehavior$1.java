class android.support.design.widget.SwipeDismissBehavior$1 extends android.support.v4.widget.p$a {
  final android.support.design.widget.SwipeDismissBehavior a;

  android.support.design.widget.SwipeDismissBehavior$1(android.support.design.widget.SwipeDismissBehavior);
    Code:
       0: aload_0
       1: aload_1
       2: putfield      #15                 // Field a:Landroid/support/design/widget/SwipeDismissBehavior;
       5: aload_0
       6: invokespecial #18                 // Method android/support/v4/widget/p$a."<init>":()V
       9: aload_0
      10: iconst_m1
      11: putfield      #20                 // Field c:I
      14: return

  public int a(android.view.View, int, int);
    Code:
       0: aload_1
       1: invokevirtual #59                 // Method android/view/View.getTop:()I
       4: ireturn

  public void a(int);
    Code:
       0: aload_0
       1: getfield      #15                 // Field a:Landroid/support/design/widget/SwipeDismissBehavior;
       4: getfield      #63                 // Field android/support/design/widget/SwipeDismissBehavior.c:Landroid/support/design/widget/SwipeDismissBehavior$a;
       7: ifnull        23
      10: aload_0
      11: getfield      #15                 // Field a:Landroid/support/design/widget/SwipeDismissBehavior;
      14: getfield      #63                 // Field android/support/design/widget/SwipeDismissBehavior.c:Landroid/support/design/widget/SwipeDismissBehavior$a;
      17: iload_1
      18: invokeinterface #67,  2           // InterfaceMethod android/support/design/widget/SwipeDismissBehavior$a.a:(I)V
      23: return

  public void a(android.view.View, float, float);
    Code:
       0: aload_0
       1: iconst_m1
       2: putfield      #20                 // Field c:I
       5: aload_1
       6: invokevirtual #42                 // Method android/view/View.getWidth:()I
       9: istore        4
      11: aload_0
      12: aload_1
      13: fload_2
      14: invokespecial #70                 // Method a:(Landroid/view/View;F)Z
      17: ifeq          58
      20: aload_1
      21: invokevirtual #37                 // Method android/view/View.getLeft:()I
      24: aload_0
      25: getfield      #39                 // Field b:I
      28: if_icmpge     43
      31: aload_0
      32: getfield      #39                 // Field b:I
      35: iload         4
      37: isub
      38: istore        4
      40: goto          52
      43: aload_0
      44: getfield      #39                 // Field b:I
      47: iload         4
      49: iadd
      50: istore        4
      52: iconst_1
      53: istore        5
      55: goto          67
      58: aload_0
      59: getfield      #39                 // Field b:I
      62: istore        4
      64: iconst_0
      65: istore        5
      67: aload_0
      68: getfield      #15                 // Field a:Landroid/support/design/widget/SwipeDismissBehavior;
      71: getfield      #73                 // Field android/support/design/widget/SwipeDismissBehavior.b:Landroid/support/v4/widget/p;
      74: iload         4
      76: aload_1
      77: invokevirtual #59                 // Method android/view/View.getTop:()I
      80: invokevirtual #78                 // Method android/support/v4/widget/p.a:(II)Z
      83: ifeq          105
      86: aload_1
      87: new           #80                 // class android/support/design/widget/SwipeDismissBehavior$b
      90: dup
      91: aload_0
      92: getfield      #15                 // Field a:Landroid/support/design/widget/SwipeDismissBehavior;
      95: aload_1
      96: iload         5
      98: invokespecial #83                 // Method android/support/design/widget/SwipeDismissBehavior$b."<init>":(Landroid/support/design/widget/SwipeDismissBehavior;Landroid/view/View;Z)V
     101: invokestatic  #86                 // Method android/support/v4/view/s.a:(Landroid/view/View;Ljava/lang/Runnable;)V
     104: return
     105: iload         5
     107: ifeq          133
     110: aload_0
     111: getfield      #15                 // Field a:Landroid/support/design/widget/SwipeDismissBehavior;
     114: getfield      #63                 // Field android/support/design/widget/SwipeDismissBehavior.c:Landroid/support/design/widget/SwipeDismissBehavior$a;
     117: ifnull        133
     120: aload_0
     121: getfield      #15                 // Field a:Landroid/support/design/widget/SwipeDismissBehavior;
     124: getfield      #63                 // Field android/support/design/widget/SwipeDismissBehavior.c:Landroid/support/design/widget/SwipeDismissBehavior$a;
     127: aload_1
     128: invokeinterface #89,  2           // InterfaceMethod android/support/design/widget/SwipeDismissBehavior$a.a:(Landroid/view/View;)V
     133: return

  public void a(android.view.View, int, int, int, int);
    Code:
       0: aload_0
       1: getfield      #39                 // Field b:I
       4: i2f
       5: aload_1
       6: invokevirtual #42                 // Method android/view/View.getWidth:()I
       9: i2f
      10: aload_0
      11: getfield      #15                 // Field a:Landroid/support/design/widget/SwipeDismissBehavior;
      14: getfield      #93                 // Field android/support/design/widget/SwipeDismissBehavior.f:F
      17: fmul
      18: fadd
      19: fstore        6
      21: aload_0
      22: getfield      #39                 // Field b:I
      25: i2f
      26: aload_1
      27: invokevirtual #42                 // Method android/view/View.getWidth:()I
      30: i2f
      31: aload_0
      32: getfield      #15                 // Field a:Landroid/support/design/widget/SwipeDismissBehavior;
      35: getfield      #96                 // Field android/support/design/widget/SwipeDismissBehavior.g:F
      38: fmul
      39: fadd
      40: fstore        7
      42: iload_2
      43: i2f
      44: fstore        8
      46: fload         8
      48: fload         6
      50: fcmpg
      51: ifgt          60
      54: aload_1
      55: fconst_1
      56: invokevirtual #100                // Method android/view/View.setAlpha:(F)V
      59: return
      60: fload         8
      62: fload         7
      64: fcmpl
      65: iflt          74
      68: aload_1
      69: fconst_0
      70: invokevirtual #100                // Method android/view/View.setAlpha:(F)V
      73: return
      74: aload_1
      75: fconst_0
      76: fconst_1
      77: fload         6
      79: fload         7
      81: fload         8
      83: invokestatic  #103                // Method android/support/design/widget/SwipeDismissBehavior.b:(FFF)F
      86: fsub
      87: fconst_1
      88: invokestatic  #105                // Method android/support/design/widget/SwipeDismissBehavior.a:(FFF)F
      91: invokevirtual #100                // Method android/view/View.setAlpha:(F)V
      94: return

  public boolean a(android.view.View, int);
    Code:
       0: aload_0
       1: getfield      #20                 // Field c:I
       4: iconst_m1
       5: if_icmpne     21
       8: aload_0
       9: getfield      #15                 // Field a:Landroid/support/design/widget/SwipeDismissBehavior;
      12: aload_1
      13: invokevirtual #109                // Method android/support/design/widget/SwipeDismissBehavior.a:(Landroid/view/View;)Z
      16: ifeq          21
      19: iconst_1
      20: ireturn
      21: iconst_0
      22: ireturn

  public int b(android.view.View);
    Code:
       0: aload_1
       1: invokevirtual #42                 // Method android/view/View.getWidth:()I
       4: ireturn

  public int b(android.view.View, int, int);
    Code:
       0: aload_1
       1: invokestatic  #28                 // Method android/support/v4/view/s.e:(Landroid/view/View;)I
       4: iconst_1
       5: if_icmpne     13
       8: iconst_1
       9: istore_3
      10: goto          15
      13: iconst_0
      14: istore_3
      15: aload_0
      16: getfield      #15                 // Field a:Landroid/support/design/widget/SwipeDismissBehavior;
      19: getfield      #31                 // Field android/support/design/widget/SwipeDismissBehavior.d:I
      22: ifne          71
      25: iload_3
      26: ifeq          48
      29: aload_0
      30: getfield      #39                 // Field b:I
      33: aload_1
      34: invokevirtual #42                 // Method android/view/View.getWidth:()I
      37: isub
      38: istore_3
      39: aload_0
      40: getfield      #39                 // Field b:I
      43: istore        4
      45: goto          102
      48: aload_0
      49: getfield      #39                 // Field b:I
      52: istore_3
      53: aload_0
      54: getfield      #39                 // Field b:I
      57: istore        4
      59: aload_1
      60: invokevirtual #42                 // Method android/view/View.getWidth:()I
      63: iload         4
      65: iadd
      66: istore        4
      68: goto          102
      71: aload_0
      72: getfield      #15                 // Field a:Landroid/support/design/widget/SwipeDismissBehavior;
      75: getfield      #31                 // Field android/support/design/widget/SwipeDismissBehavior.d:I
      78: iconst_1
      79: if_icmpne     89
      82: iload_3
      83: ifeq          29
      86: goto          48
      89: aload_0
      90: getfield      #39                 // Field b:I
      93: aload_1
      94: invokevirtual #42                 // Method android/view/View.getWidth:()I
      97: isub
      98: istore_3
      99: goto          53
     102: iload_3
     103: iload_2
     104: iload         4
     106: invokestatic  #112                // Method android/support/design/widget/SwipeDismissBehavior.a:(III)I
     109: ireturn

  public void b(android.view.View, int);
    Code:
       0: aload_0
       1: iload_2
       2: putfield      #20                 // Field c:I
       5: aload_0
       6: aload_1
       7: invokevirtual #37                 // Method android/view/View.getLeft:()I
      10: putfield      #39                 // Field b:I
      13: aload_1
      14: invokevirtual #117                // Method android/view/View.getParent:()Landroid/view/ViewParent;
      17: astore_1
      18: aload_1
      19: ifnull        29
      22: aload_1
      23: iconst_1
      24: invokeinterface #123,  2          // InterfaceMethod android/view/ViewParent.requestDisallowInterceptTouchEvent:(Z)V
      29: return
}
