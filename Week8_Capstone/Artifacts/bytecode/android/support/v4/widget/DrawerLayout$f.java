class android.support.v4.widget.DrawerLayout$f extends android.support.v4.widget.p$a {
  final android.support.v4.widget.DrawerLayout a;

  android.support.v4.widget.DrawerLayout$f(android.support.v4.widget.DrawerLayout, int);
    Code:
       0: aload_0
       1: aload_1
       2: putfield      #21                 // Field a:Landroid/support/v4/widget/DrawerLayout;
       5: aload_0
       6: invokespecial #24                 // Method android/support/v4/widget/p$a."<init>":()V
       9: aload_0
      10: new           #9                  // class android/support/v4/widget/DrawerLayout$f$1
      13: dup
      14: aload_0
      15: invokespecial #27                 // Method android/support/v4/widget/DrawerLayout$f$1."<init>":(Landroid/support/v4/widget/DrawerLayout$f;)V
      18: putfield      #29                 // Field d:Ljava/lang/Runnable;
      21: aload_0
      22: iload_2
      23: putfield      #31                 // Field b:I
      26: return

  public int a(android.view.View, int, int);
    Code:
       0: aload_1
       1: invokevirtual #46                 // Method android/view/View.getTop:()I
       4: ireturn

  public void a();
    Code:
       0: aload_0
       1: getfield      #21                 // Field a:Landroid/support/v4/widget/DrawerLayout;
       4: aload_0
       5: getfield      #29                 // Field d:Ljava/lang/Runnable;
       8: invokevirtual #50                 // Method android/support/v4/widget/DrawerLayout.removeCallbacks:(Ljava/lang/Runnable;)Z
      11: pop
      12: return

  public void a(int);
    Code:
       0: aload_0
       1: getfield      #21                 // Field a:Landroid/support/v4/widget/DrawerLayout;
       4: aload_0
       5: getfield      #31                 // Field b:I
       8: iload_1
       9: aload_0
      10: getfield      #53                 // Field c:Landroid/support/v4/widget/p;
      13: invokevirtual #58                 // Method android/support/v4/widget/p.c:()Landroid/view/View;
      16: invokevirtual #61                 // Method android/support/v4/widget/DrawerLayout.a:(IILandroid/view/View;)V
      19: return

  public void a(int, int);
    Code:
       0: aload_0
       1: getfield      #21                 // Field a:Landroid/support/v4/widget/DrawerLayout;
       4: aload_0
       5: getfield      #29                 // Field d:Ljava/lang/Runnable;
       8: ldc2_w        #63                 // long 160l
      11: invokevirtual #68                 // Method android/support/v4/widget/DrawerLayout.postDelayed:(Ljava/lang/Runnable;J)Z
      14: pop
      15: return

  public void a(android.support.v4.widget.p);
    Code:
       0: aload_0
       1: aload_1
       2: putfield      #53                 // Field c:Landroid/support/v4/widget/p;
       5: return

  public void a(android.view.View, float, float);
    Code:
       0: aload_0
       1: getfield      #21                 // Field a:Landroid/support/v4/widget/DrawerLayout;
       4: aload_1
       5: invokevirtual #73                 // Method android/support/v4/widget/DrawerLayout.d:(Landroid/view/View;)F
       8: fstore_3
       9: aload_1
      10: invokevirtual #76                 // Method android/view/View.getWidth:()I
      13: istore        6
      15: aload_0
      16: getfield      #21                 // Field a:Landroid/support/v4/widget/DrawerLayout;
      19: aload_1
      20: iconst_3
      21: invokevirtual #79                 // Method android/support/v4/widget/DrawerLayout.a:(Landroid/view/View;I)Z
      24: ifeq          63
      27: fload_2
      28: fconst_0
      29: fcmpl
      30: ifgt          57
      33: fload_2
      34: fconst_0
      35: fcmpl
      36: ifne          49
      39: fload_3
      40: ldc           #80                 // float 0.5f
      42: fcmpl
      43: ifle          49
      46: goto          57
      49: iload         6
      51: ineg
      52: istore        4
      54: goto          106
      57: iconst_0
      58: istore        4
      60: goto          106
      63: aload_0
      64: getfield      #21                 // Field a:Landroid/support/v4/widget/DrawerLayout;
      67: invokevirtual #81                 // Method android/support/v4/widget/DrawerLayout.getWidth:()I
      70: istore        5
      72: fload_2
      73: fconst_0
      74: fcmpg
      75: iflt          99
      78: iload         5
      80: istore        4
      82: fload_2
      83: fconst_0
      84: fcmpl
      85: ifne          106
      88: iload         5
      90: istore        4
      92: fload_3
      93: ldc           #80                 // float 0.5f
      95: fcmpl
      96: ifle          106
      99: iload         5
     101: iload         6
     103: isub
     104: istore        4
     106: aload_0
     107: getfield      #53                 // Field c:Landroid/support/v4/widget/p;
     110: iload         4
     112: aload_1
     113: invokevirtual #46                 // Method android/view/View.getTop:()I
     116: invokevirtual #84                 // Method android/support/v4/widget/p.a:(II)Z
     119: pop
     120: aload_0
     121: getfield      #21                 // Field a:Landroid/support/v4/widget/DrawerLayout;
     124: invokevirtual #87                 // Method android/support/v4/widget/DrawerLayout.invalidate:()V
     127: return

  public void a(android.view.View, int, int, int, int);
    Code:
       0: aload_1
       1: invokevirtual #76                 // Method android/view/View.getWidth:()I
       4: istore_3
       5: aload_0
       6: getfield      #21                 // Field a:Landroid/support/v4/widget/DrawerLayout;
       9: aload_1
      10: iconst_3
      11: invokevirtual #79                 // Method android/support/v4/widget/DrawerLayout.a:(Landroid/view/View;I)Z
      14: ifeq          33
      17: iload_2
      18: iload_3
      19: iadd
      20: i2f
      21: fstore        6
      23: fload         6
      25: iload_3
      26: i2f
      27: fdiv
      28: fstore        6
      30: goto          48
      33: aload_0
      34: getfield      #21                 // Field a:Landroid/support/v4/widget/DrawerLayout;
      37: invokevirtual #81                 // Method android/support/v4/widget/DrawerLayout.getWidth:()I
      40: iload_2
      41: isub
      42: i2f
      43: fstore        6
      45: goto          23
      48: aload_0
      49: getfield      #21                 // Field a:Landroid/support/v4/widget/DrawerLayout;
      52: aload_1
      53: fload         6
      55: invokevirtual #91                 // Method android/support/v4/widget/DrawerLayout.b:(Landroid/view/View;F)V
      58: fload         6
      60: fconst_0
      61: fcmpl
      62: ifne          70
      65: iconst_4
      66: istore_2
      67: goto          72
      70: iconst_0
      71: istore_2
      72: aload_1
      73: iload_2
      74: invokevirtual #94                 // Method android/view/View.setVisibility:(I)V
      77: aload_0
      78: getfield      #21                 // Field a:Landroid/support/v4/widget/DrawerLayout;
      81: invokevirtual #87                 // Method android/support/v4/widget/DrawerLayout.invalidate:()V
      84: return

  public boolean a(android.view.View, int);
    Code:
       0: aload_0
       1: getfield      #21                 // Field a:Landroid/support/v4/widget/DrawerLayout;
       4: aload_1
       5: invokevirtual #98                 // Method android/support/v4/widget/DrawerLayout.g:(Landroid/view/View;)Z
       8: ifeq          39
      11: aload_0
      12: getfield      #21                 // Field a:Landroid/support/v4/widget/DrawerLayout;
      15: aload_1
      16: aload_0
      17: getfield      #31                 // Field b:I
      20: invokevirtual #79                 // Method android/support/v4/widget/DrawerLayout.a:(Landroid/view/View;I)Z
      23: ifeq          39
      26: aload_0
      27: getfield      #21                 // Field a:Landroid/support/v4/widget/DrawerLayout;
      30: aload_1
      31: invokevirtual #101                // Method android/support/v4/widget/DrawerLayout.a:(Landroid/view/View;)I
      34: ifne          39
      37: iconst_1
      38: ireturn
      39: iconst_0
      40: ireturn

  public int b(android.view.View);
    Code:
       0: aload_0
       1: getfield      #21                 // Field a:Landroid/support/v4/widget/DrawerLayout;
       4: aload_1
       5: invokevirtual #98                 // Method android/support/v4/widget/DrawerLayout.g:(Landroid/view/View;)Z
       8: ifeq          16
      11: aload_1
      12: invokevirtual #76                 // Method android/view/View.getWidth:()I
      15: ireturn
      16: iconst_0
      17: ireturn

  public int b(android.view.View, int, int);
    Code:
       0: aload_0
       1: getfield      #21                 // Field a:Landroid/support/v4/widget/DrawerLayout;
       4: aload_1
       5: iconst_3
       6: invokevirtual #79                 // Method android/support/v4/widget/DrawerLayout.a:(Landroid/view/View;I)Z
       9: ifeq          32
      12: aload_1
      13: invokevirtual #76                 // Method android/view/View.getWidth:()I
      16: ineg
      17: istore_3
      18: iconst_0
      19: istore        4
      21: iload_3
      22: iload_2
      23: iload         4
      25: invokestatic  #107                // Method java/lang/Math.min:(II)I
      28: invokestatic  #110                // Method java/lang/Math.max:(II)I
      31: ireturn
      32: aload_0
      33: getfield      #21                 // Field a:Landroid/support/v4/widget/DrawerLayout;
      36: invokevirtual #81                 // Method android/support/v4/widget/DrawerLayout.getWidth:()I
      39: istore        4
      41: iload         4
      43: aload_1
      44: invokevirtual #76                 // Method android/view/View.getWidth:()I
      47: isub
      48: istore_3
      49: goto          21

  void b();
    Code:
       0: aload_0
       1: getfield      #53                 // Field c:Landroid/support/v4/widget/p;
       4: invokevirtual #112                // Method android/support/v4/widget/p.b:()I
       7: istore_3
       8: aload_0
       9: getfield      #31                 // Field b:I
      12: istore_1
      13: iconst_0
      14: istore_2
      15: iload_1
      16: iconst_3
      17: if_icmpne     25
      20: iconst_1
      21: istore_1
      22: goto          27
      25: iconst_0
      26: istore_1
      27: iload_1
      28: ifeq          60
      31: aload_0
      32: getfield      #21                 // Field a:Landroid/support/v4/widget/DrawerLayout;
      35: iconst_3
      36: invokevirtual #35                 // Method android/support/v4/widget/DrawerLayout.c:(I)Landroid/view/View;
      39: astore        4
      41: aload         4
      43: ifnull        53
      46: aload         4
      48: invokevirtual #76                 // Method android/view/View.getWidth:()I
      51: ineg
      52: istore_2
      53: iload_2
      54: iload_3
      55: iadd
      56: istore_2
      57: goto          80
      60: aload_0
      61: getfield      #21                 // Field a:Landroid/support/v4/widget/DrawerLayout;
      64: iconst_5
      65: invokevirtual #35                 // Method android/support/v4/widget/DrawerLayout.c:(I)Landroid/view/View;
      68: astore        4
      70: aload_0
      71: getfield      #21                 // Field a:Landroid/support/v4/widget/DrawerLayout;
      74: invokevirtual #81                 // Method android/support/v4/widget/DrawerLayout.getWidth:()I
      77: iload_3
      78: isub
      79: istore_2
      80: aload         4
      82: ifnull        173
      85: iload_1
      86: ifeq          98
      89: aload         4
      91: invokevirtual #115                // Method android/view/View.getLeft:()I
      94: iload_2
      95: if_icmplt     111
      98: iload_1
      99: ifne          173
     102: aload         4
     104: invokevirtual #115                // Method android/view/View.getLeft:()I
     107: iload_2
     108: if_icmple     173
     111: aload_0
     112: getfield      #21                 // Field a:Landroid/support/v4/widget/DrawerLayout;
     115: aload         4
     117: invokevirtual #101                // Method android/support/v4/widget/DrawerLayout.a:(Landroid/view/View;)I
     120: ifne          173
     123: aload         4
     125: invokevirtual #119                // Method android/view/View.getLayoutParams:()Landroid/view/ViewGroup$LayoutParams;
     128: checkcast     #121                // class android/support/v4/widget/DrawerLayout$d
     131: astore        5
     133: aload_0
     134: getfield      #53                 // Field c:Landroid/support/v4/widget/p;
     137: aload         4
     139: iload_2
     140: aload         4
     142: invokevirtual #46                 // Method android/view/View.getTop:()I
     145: invokevirtual #124                // Method android/support/v4/widget/p.a:(Landroid/view/View;II)Z
     148: pop
     149: aload         5
     151: iconst_1
     152: putfield      #127                // Field android/support/v4/widget/DrawerLayout$d.c:Z
     155: aload_0
     156: getfield      #21                 // Field a:Landroid/support/v4/widget/DrawerLayout;
     159: invokevirtual #87                 // Method android/support/v4/widget/DrawerLayout.invalidate:()V
     162: aload_0
     163: invokespecial #129                // Method c:()V
     166: aload_0
     167: getfield      #21                 // Field a:Landroid/support/v4/widget/DrawerLayout;
     170: invokevirtual #131                // Method android/support/v4/widget/DrawerLayout.d:()V
     173: return

  public void b(int, int);
    Code:
       0: iload_1
       1: iconst_1
       2: iand
       3: iconst_1
       4: if_icmpne     23
       7: aload_0
       8: getfield      #21                 // Field a:Landroid/support/v4/widget/DrawerLayout;
      11: astore_3
      12: iconst_3
      13: istore_1
      14: aload_3
      15: iload_1
      16: invokevirtual #35                 // Method android/support/v4/widget/DrawerLayout.c:(I)Landroid/view/View;
      19: astore_3
      20: goto          33
      23: aload_0
      24: getfield      #21                 // Field a:Landroid/support/v4/widget/DrawerLayout;
      27: astore_3
      28: iconst_5
      29: istore_1
      30: goto          14
      33: aload_3
      34: ifnull        57
      37: aload_0
      38: getfield      #21                 // Field a:Landroid/support/v4/widget/DrawerLayout;
      41: aload_3
      42: invokevirtual #101                // Method android/support/v4/widget/DrawerLayout.a:(Landroid/view/View;)I
      45: ifne          57
      48: aload_0
      49: getfield      #53                 // Field c:Landroid/support/v4/widget/p;
      52: aload_3
      53: iload_2
      54: invokevirtual #134                // Method android/support/v4/widget/p.a:(Landroid/view/View;I)V
      57: return

  public void b(android.view.View, int);
    Code:
       0: aload_1
       1: invokevirtual #119                // Method android/view/View.getLayoutParams:()Landroid/view/ViewGroup$LayoutParams;
       4: checkcast     #121                // class android/support/v4/widget/DrawerLayout$d
       7: iconst_0
       8: putfield      #127                // Field android/support/v4/widget/DrawerLayout$d.c:Z
      11: aload_0
      12: invokespecial #129                // Method c:()V
      15: return

  public boolean b(int);
    Code:
       0: iconst_0
       1: ireturn
}
