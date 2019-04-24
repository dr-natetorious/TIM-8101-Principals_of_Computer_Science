class android.support.v7.widget.StaggeredGridLayoutManager$e {
  java.util.ArrayList<android.view.View> a;

  int b;

  int c;

  int d;

  final int e;

  final android.support.v7.widget.StaggeredGridLayoutManager f;

  android.support.v7.widget.StaggeredGridLayoutManager$e(android.support.v7.widget.StaggeredGridLayoutManager, int);
    Code:
       0: aload_0
       1: aload_1
       2: putfield      #20                 // Field f:Landroid/support/v7/widget/StaggeredGridLayoutManager;
       5: aload_0
       6: invokespecial #23                 // Method java/lang/Object."<init>":()V
       9: aload_0
      10: new           #25                 // class java/util/ArrayList
      13: dup
      14: invokespecial #26                 // Method java/util/ArrayList."<init>":()V
      17: putfield      #28                 // Field a:Ljava/util/ArrayList;
      20: aload_0
      21: ldc           #29                 // int -2147483648
      23: putfield      #31                 // Field b:I
      26: aload_0
      27: ldc           #29                 // int -2147483648
      29: putfield      #33                 // Field c:I
      32: aload_0
      33: iconst_0
      34: putfield      #35                 // Field d:I
      37: aload_0
      38: iload_2
      39: putfield      #37                 // Field e:I
      42: return

  int a(int);
    Code:
       0: aload_0
       1: getfield      #31                 // Field b:I
       4: ldc           #29                 // int -2147483648
       6: if_icmpeq     14
       9: aload_0
      10: getfield      #31                 // Field b:I
      13: ireturn
      14: aload_0
      15: getfield      #28                 // Field a:Ljava/util/ArrayList;
      18: invokevirtual #43                 // Method java/util/ArrayList.size:()I
      21: ifne          26
      24: iload_1
      25: ireturn
      26: aload_0
      27: invokevirtual #45                 // Method a:()V
      30: aload_0
      31: getfield      #31                 // Field b:I
      34: ireturn

  int a(int, int, boolean);
    Code:
       0: aload_0
       1: iload_1
       2: iload_2
       3: iconst_0
       4: iconst_0
       5: iload_3
       6: invokevirtual #49                 // Method a:(IIZZZ)I
       9: ireturn

  int a(int, int, boolean, boolean, boolean);
    Code:
       0: aload_0
       1: getfield      #20                 // Field f:Landroid/support/v7/widget/StaggeredGridLayoutManager;
       4: getfield      #52                 // Field android/support/v7/widget/StaggeredGridLayoutManager.b:Landroid/support/v7/widget/ba;
       7: invokevirtual #56                 // Method android/support/v7/widget/ba.c:()I
      10: istore        9
      12: aload_0
      13: getfield      #20                 // Field f:Landroid/support/v7/widget/StaggeredGridLayoutManager;
      16: getfield      #52                 // Field android/support/v7/widget/StaggeredGridLayoutManager.b:Landroid/support/v7/widget/ba;
      19: invokevirtual #58                 // Method android/support/v7/widget/ba.d:()I
      22: istore        10
      24: iload_2
      25: iload_1
      26: if_icmple     35
      29: iconst_1
      30: istore        6
      32: goto          38
      35: iconst_m1
      36: istore        6
      38: iload_1
      39: iload_2
      40: if_icmpeq     225
      43: aload_0
      44: getfield      #28                 // Field a:Ljava/util/ArrayList;
      47: iload_1
      48: invokevirtual #62                 // Method java/util/ArrayList.get:(I)Ljava/lang/Object;
      51: checkcast     #64                 // class android/view/View
      54: astore        13
      56: aload_0
      57: getfield      #20                 // Field f:Landroid/support/v7/widget/StaggeredGridLayoutManager;
      60: getfield      #52                 // Field android/support/v7/widget/StaggeredGridLayoutManager.b:Landroid/support/v7/widget/ba;
      63: aload         13
      65: invokevirtual #67                 // Method android/support/v7/widget/ba.a:(Landroid/view/View;)I
      68: istore        11
      70: aload_0
      71: getfield      #20                 // Field f:Landroid/support/v7/widget/StaggeredGridLayoutManager;
      74: getfield      #52                 // Field android/support/v7/widget/StaggeredGridLayoutManager.b:Landroid/support/v7/widget/ba;
      77: aload         13
      79: invokevirtual #69                 // Method android/support/v7/widget/ba.b:(Landroid/view/View;)I
      82: istore        12
      84: iconst_0
      85: istore        8
      87: iload         5
      89: ifeq          111
      92: iload         11
      94: iload         10
      96: if_icmpgt     105
      99: iconst_1
     100: istore        7
     102: goto          121
     105: iconst_0
     106: istore        7
     108: goto          121
     111: iload         11
     113: iload         10
     115: if_icmpge     105
     118: goto          99
     121: iload         5
     123: ifeq          139
     126: iload         12
     128: iload         9
     130: if_icmplt     149
     133: iconst_1
     134: istore        8
     136: goto          149
     139: iload         12
     141: iload         9
     143: if_icmple     149
     146: goto          133
     149: iload         7
     151: ifeq          217
     154: iload         8
     156: ifeq          217
     159: iload_3
     160: ifeq          192
     163: iload         4
     165: ifeq          192
     168: iload         11
     170: iload         9
     172: if_icmplt     217
     175: iload         12
     177: iload         10
     179: if_icmpgt     217
     182: aload_0
     183: getfield      #20                 // Field f:Landroid/support/v7/widget/StaggeredGridLayoutManager;
     186: aload         13
     188: invokevirtual #71                 // Method android/support/v7/widget/StaggeredGridLayoutManager.d:(Landroid/view/View;)I
     191: ireturn
     192: iload         4
     194: ifeq          200
     197: goto          182
     200: iload         11
     202: iload         9
     204: if_icmplt     182
     207: iload         12
     209: iload         10
     211: if_icmple     217
     214: goto          182
     217: iload_1
     218: iload         6
     220: iadd
     221: istore_1
     222: goto          38
     225: iconst_m1
     226: ireturn

  public android.view.View a(int, int);
    Code:
       0: aconst_null
       1: astore        5
       3: aconst_null
       4: astore        4
       6: iload_2
       7: iconst_m1
       8: if_icmpne     119
      11: aload_0
      12: getfield      #28                 // Field a:Ljava/util/ArrayList;
      15: invokevirtual #43                 // Method java/util/ArrayList.size:()I
      18: istore_3
      19: iconst_0
      20: istore_2
      21: aload         4
      23: astore        5
      25: iload_2
      26: iload_3
      27: if_icmpge     230
      30: aload_0
      31: getfield      #28                 // Field a:Ljava/util/ArrayList;
      34: iload_2
      35: invokevirtual #62                 // Method java/util/ArrayList.get:(I)Ljava/lang/Object;
      38: checkcast     #64                 // class android/view/View
      41: astore        6
      43: aload_0
      44: getfield      #20                 // Field f:Landroid/support/v7/widget/StaggeredGridLayoutManager;
      47: getfield      #75                 // Field android/support/v7/widget/StaggeredGridLayoutManager.d:Z
      50: ifeq          70
      53: aload         4
      55: astore        5
      57: aload_0
      58: getfield      #20                 // Field f:Landroid/support/v7/widget/StaggeredGridLayoutManager;
      61: aload         6
      63: invokevirtual #71                 // Method android/support/v7/widget/StaggeredGridLayoutManager.d:(Landroid/view/View;)I
      66: iload_1
      67: if_icmple     230
      70: aload_0
      71: getfield      #20                 // Field f:Landroid/support/v7/widget/StaggeredGridLayoutManager;
      74: getfield      #75                 // Field android/support/v7/widget/StaggeredGridLayoutManager.d:Z
      77: ifne          96
      80: aload_0
      81: getfield      #20                 // Field f:Landroid/support/v7/widget/StaggeredGridLayoutManager;
      84: aload         6
      86: invokevirtual #71                 // Method android/support/v7/widget/StaggeredGridLayoutManager.d:(Landroid/view/View;)I
      89: iload_1
      90: if_icmplt     96
      93: aload         4
      95: areturn
      96: aload         4
      98: astore        5
     100: aload         6
     102: invokevirtual #79                 // Method android/view/View.hasFocusable:()Z
     105: ifeq          230
     108: iload_2
     109: iconst_1
     110: iadd
     111: istore_2
     112: aload         6
     114: astore        4
     116: goto          21
     119: aload_0
     120: getfield      #28                 // Field a:Ljava/util/ArrayList;
     123: invokevirtual #43                 // Method java/util/ArrayList.size:()I
     126: iconst_1
     127: isub
     128: istore_2
     129: aload         5
     131: astore        4
     133: aload         4
     135: astore        5
     137: iload_2
     138: iflt          230
     141: aload_0
     142: getfield      #28                 // Field a:Ljava/util/ArrayList;
     145: iload_2
     146: invokevirtual #62                 // Method java/util/ArrayList.get:(I)Ljava/lang/Object;
     149: checkcast     #64                 // class android/view/View
     152: astore        6
     154: aload_0
     155: getfield      #20                 // Field f:Landroid/support/v7/widget/StaggeredGridLayoutManager;
     158: getfield      #75                 // Field android/support/v7/widget/StaggeredGridLayoutManager.d:Z
     161: ifeq          181
     164: aload         4
     166: astore        5
     168: aload_0
     169: getfield      #20                 // Field f:Landroid/support/v7/widget/StaggeredGridLayoutManager;
     172: aload         6
     174: invokevirtual #71                 // Method android/support/v7/widget/StaggeredGridLayoutManager.d:(Landroid/view/View;)I
     177: iload_1
     178: if_icmpge     230
     181: aload_0
     182: getfield      #20                 // Field f:Landroid/support/v7/widget/StaggeredGridLayoutManager;
     185: getfield      #75                 // Field android/support/v7/widget/StaggeredGridLayoutManager.d:Z
     188: ifne          207
     191: aload_0
     192: getfield      #20                 // Field f:Landroid/support/v7/widget/StaggeredGridLayoutManager;
     195: aload         6
     197: invokevirtual #71                 // Method android/support/v7/widget/StaggeredGridLayoutManager.d:(Landroid/view/View;)I
     200: iload_1
     201: if_icmpgt     207
     204: aload         4
     206: areturn
     207: aload         4
     209: astore        5
     211: aload         6
     213: invokevirtual #79                 // Method android/view/View.hasFocusable:()Z
     216: ifeq          230
     219: iload_2
     220: iconst_1
     221: isub
     222: istore_2
     223: aload         6
     225: astore        4
     227: goto          133
     230: aload         5
     232: areturn

  void a();
    Code:
       0: aload_0
       1: getfield      #28                 // Field a:Ljava/util/ArrayList;
       4: iconst_0
       5: invokevirtual #62                 // Method java/util/ArrayList.get:(I)Ljava/lang/Object;
       8: checkcast     #64                 // class android/view/View
      11: astore_1
      12: aload_0
      13: aload_1
      14: invokevirtual #82                 // Method c:(Landroid/view/View;)Landroid/support/v7/widget/StaggeredGridLayoutManager$b;
      17: astore_2
      18: aload_0
      19: aload_0
      20: getfield      #20                 // Field f:Landroid/support/v7/widget/StaggeredGridLayoutManager;
      23: getfield      #52                 // Field android/support/v7/widget/StaggeredGridLayoutManager.b:Landroid/support/v7/widget/ba;
      26: aload_1
      27: invokevirtual #67                 // Method android/support/v7/widget/ba.a:(Landroid/view/View;)I
      30: putfield      #31                 // Field b:I
      33: aload_2
      34: getfield      #86                 // Field android/support/v7/widget/StaggeredGridLayoutManager$b.b:Z
      37: ifeq          84
      40: aload_0
      41: getfield      #20                 // Field f:Landroid/support/v7/widget/StaggeredGridLayoutManager;
      44: getfield      #90                 // Field android/support/v7/widget/StaggeredGridLayoutManager.h:Landroid/support/v7/widget/StaggeredGridLayoutManager$c;
      47: aload_2
      48: invokevirtual #92                 // Method android/support/v7/widget/StaggeredGridLayoutManager$b.f:()I
      51: invokevirtual #97                 // Method android/support/v7/widget/StaggeredGridLayoutManager$c.f:(I)Landroid/support/v7/widget/StaggeredGridLayoutManager$c$a;
      54: astore_1
      55: aload_1
      56: ifnull        84
      59: aload_1
      60: getfield      #100                // Field android/support/v7/widget/StaggeredGridLayoutManager$c$a.b:I
      63: iconst_m1
      64: if_icmpne     84
      67: aload_0
      68: aload_0
      69: getfield      #31                 // Field b:I
      72: aload_1
      73: aload_0
      74: getfield      #37                 // Field e:I
      77: invokevirtual #102                // Method android/support/v7/widget/StaggeredGridLayoutManager$c$a.a:(I)I
      80: isub
      81: putfield      #31                 // Field b:I
      84: return

  void a(android.view.View);
    Code:
       0: aload_0
       1: aload_1
       2: invokevirtual #82                 // Method c:(Landroid/view/View;)Landroid/support/v7/widget/StaggeredGridLayoutManager$b;
       5: astore_2
       6: aload_2
       7: aload_0
       8: putfield      #106                // Field android/support/v7/widget/StaggeredGridLayoutManager$b.a:Landroid/support/v7/widget/StaggeredGridLayoutManager$e;
      11: aload_0
      12: getfield      #28                 // Field a:Ljava/util/ArrayList;
      15: iconst_0
      16: aload_1
      17: invokevirtual #110                // Method java/util/ArrayList.add:(ILjava/lang/Object;)V
      20: aload_0
      21: ldc           #29                 // int -2147483648
      23: putfield      #31                 // Field b:I
      26: aload_0
      27: getfield      #28                 // Field a:Ljava/util/ArrayList;
      30: invokevirtual #43                 // Method java/util/ArrayList.size:()I
      33: iconst_1
      34: if_icmpne     43
      37: aload_0
      38: ldc           #29                 // int -2147483648
      40: putfield      #33                 // Field c:I
      43: aload_2
      44: invokevirtual #112                // Method android/support/v7/widget/StaggeredGridLayoutManager$b.d:()Z
      47: ifne          57
      50: aload_2
      51: invokevirtual #114                // Method android/support/v7/widget/StaggeredGridLayoutManager$b.e:()Z
      54: ifeq          77
      57: aload_0
      58: aload_0
      59: getfield      #35                 // Field d:I
      62: aload_0
      63: getfield      #20                 // Field f:Landroid/support/v7/widget/StaggeredGridLayoutManager;
      66: getfield      #52                 // Field android/support/v7/widget/StaggeredGridLayoutManager.b:Landroid/support/v7/widget/ba;
      69: aload_1
      70: invokevirtual #116                // Method android/support/v7/widget/ba.e:(Landroid/view/View;)I
      73: iadd
      74: putfield      #35                 // Field d:I
      77: return

  void a(boolean, int);
    Code:
       0: iload_1
       1: ifeq          14
       4: aload_0
       5: ldc           #29                 // int -2147483648
       7: invokevirtual #119                // Method b:(I)I
      10: istore_3
      11: goto          21
      14: aload_0
      15: ldc           #29                 // int -2147483648
      17: invokevirtual #120                // Method a:(I)I
      20: istore_3
      21: aload_0
      22: invokevirtual #122                // Method e:()V
      25: iload_3
      26: ldc           #29                 // int -2147483648
      28: if_icmpne     32
      31: return
      32: iload_1
      33: ifeq          50
      36: iload_3
      37: aload_0
      38: getfield      #20                 // Field f:Landroid/support/v7/widget/StaggeredGridLayoutManager;
      41: getfield      #52                 // Field android/support/v7/widget/StaggeredGridLayoutManager.b:Landroid/support/v7/widget/ba;
      44: invokevirtual #58                 // Method android/support/v7/widget/ba.d:()I
      47: if_icmplt     68
      50: iload_1
      51: ifne          69
      54: iload_3
      55: aload_0
      56: getfield      #20                 // Field f:Landroid/support/v7/widget/StaggeredGridLayoutManager;
      59: getfield      #52                 // Field android/support/v7/widget/StaggeredGridLayoutManager.b:Landroid/support/v7/widget/ba;
      62: invokevirtual #56                 // Method android/support/v7/widget/ba.c:()I
      65: if_icmple     69
      68: return
      69: iload_3
      70: istore        4
      72: iload_2
      73: ldc           #29                 // int -2147483648
      75: if_icmpeq     83
      78: iload_3
      79: iload_2
      80: iadd
      81: istore        4
      83: aload_0
      84: iload         4
      86: putfield      #33                 // Field c:I
      89: aload_0
      90: iload         4
      92: putfield      #31                 // Field b:I
      95: return

  int b();
    Code:
       0: aload_0
       1: getfield      #31                 // Field b:I
       4: ldc           #29                 // int -2147483648
       6: if_icmpeq     14
       9: aload_0
      10: getfield      #31                 // Field b:I
      13: ireturn
      14: aload_0
      15: invokevirtual #45                 // Method a:()V
      18: aload_0
      19: getfield      #31                 // Field b:I
      22: ireturn

  int b(int);
    Code:
       0: aload_0
       1: getfield      #33                 // Field c:I
       4: ldc           #29                 // int -2147483648
       6: if_icmpeq     14
       9: aload_0
      10: getfield      #33                 // Field c:I
      13: ireturn
      14: aload_0
      15: getfield      #28                 // Field a:Ljava/util/ArrayList;
      18: invokevirtual #43                 // Method java/util/ArrayList.size:()I
      21: ifne          26
      24: iload_1
      25: ireturn
      26: aload_0
      27: invokevirtual #124                // Method c:()V
      30: aload_0
      31: getfield      #33                 // Field c:I
      34: ireturn

  void b(android.view.View);
    Code:
       0: aload_0
       1: aload_1
       2: invokevirtual #82                 // Method c:(Landroid/view/View;)Landroid/support/v7/widget/StaggeredGridLayoutManager$b;
       5: astore_2
       6: aload_2
       7: aload_0
       8: putfield      #106                // Field android/support/v7/widget/StaggeredGridLayoutManager$b.a:Landroid/support/v7/widget/StaggeredGridLayoutManager$e;
      11: aload_0
      12: getfield      #28                 // Field a:Ljava/util/ArrayList;
      15: aload_1
      16: invokevirtual #127                // Method java/util/ArrayList.add:(Ljava/lang/Object;)Z
      19: pop
      20: aload_0
      21: ldc           #29                 // int -2147483648
      23: putfield      #33                 // Field c:I
      26: aload_0
      27: getfield      #28                 // Field a:Ljava/util/ArrayList;
      30: invokevirtual #43                 // Method java/util/ArrayList.size:()I
      33: iconst_1
      34: if_icmpne     43
      37: aload_0
      38: ldc           #29                 // int -2147483648
      40: putfield      #31                 // Field b:I
      43: aload_2
      44: invokevirtual #112                // Method android/support/v7/widget/StaggeredGridLayoutManager$b.d:()Z
      47: ifne          57
      50: aload_2
      51: invokevirtual #114                // Method android/support/v7/widget/StaggeredGridLayoutManager$b.e:()Z
      54: ifeq          77
      57: aload_0
      58: aload_0
      59: getfield      #35                 // Field d:I
      62: aload_0
      63: getfield      #20                 // Field f:Landroid/support/v7/widget/StaggeredGridLayoutManager;
      66: getfield      #52                 // Field android/support/v7/widget/StaggeredGridLayoutManager.b:Landroid/support/v7/widget/ba;
      69: aload_1
      70: invokevirtual #116                // Method android/support/v7/widget/ba.e:(Landroid/view/View;)I
      73: iadd
      74: putfield      #35                 // Field d:I
      77: return

  android.support.v7.widget.StaggeredGridLayoutManager$b c(android.view.View);
    Code:
       0: aload_1
       1: invokevirtual #131                // Method android/view/View.getLayoutParams:()Landroid/view/ViewGroup$LayoutParams;
       4: checkcast     #84                 // class android/support/v7/widget/StaggeredGridLayoutManager$b
       7: areturn

  void c();
    Code:
       0: aload_0
       1: getfield      #28                 // Field a:Ljava/util/ArrayList;
       4: aload_0
       5: getfield      #28                 // Field a:Ljava/util/ArrayList;
       8: invokevirtual #43                 // Method java/util/ArrayList.size:()I
      11: iconst_1
      12: isub
      13: invokevirtual #62                 // Method java/util/ArrayList.get:(I)Ljava/lang/Object;
      16: checkcast     #64                 // class android/view/View
      19: astore_1
      20: aload_0
      21: aload_1
      22: invokevirtual #82                 // Method c:(Landroid/view/View;)Landroid/support/v7/widget/StaggeredGridLayoutManager$b;
      25: astore_2
      26: aload_0
      27: aload_0
      28: getfield      #20                 // Field f:Landroid/support/v7/widget/StaggeredGridLayoutManager;
      31: getfield      #52                 // Field android/support/v7/widget/StaggeredGridLayoutManager.b:Landroid/support/v7/widget/ba;
      34: aload_1
      35: invokevirtual #69                 // Method android/support/v7/widget/ba.b:(Landroid/view/View;)I
      38: putfield      #33                 // Field c:I
      41: aload_2
      42: getfield      #86                 // Field android/support/v7/widget/StaggeredGridLayoutManager$b.b:Z
      45: ifeq          92
      48: aload_0
      49: getfield      #20                 // Field f:Landroid/support/v7/widget/StaggeredGridLayoutManager;
      52: getfield      #90                 // Field android/support/v7/widget/StaggeredGridLayoutManager.h:Landroid/support/v7/widget/StaggeredGridLayoutManager$c;
      55: aload_2
      56: invokevirtual #92                 // Method android/support/v7/widget/StaggeredGridLayoutManager$b.f:()I
      59: invokevirtual #97                 // Method android/support/v7/widget/StaggeredGridLayoutManager$c.f:(I)Landroid/support/v7/widget/StaggeredGridLayoutManager$c$a;
      62: astore_1
      63: aload_1
      64: ifnull        92
      67: aload_1
      68: getfield      #100                // Field android/support/v7/widget/StaggeredGridLayoutManager$c$a.b:I
      71: iconst_1
      72: if_icmpne     92
      75: aload_0
      76: aload_0
      77: getfield      #33                 // Field c:I
      80: aload_1
      81: aload_0
      82: getfield      #37                 // Field e:I
      85: invokevirtual #102                // Method android/support/v7/widget/StaggeredGridLayoutManager$c$a.a:(I)I
      88: iadd
      89: putfield      #33                 // Field c:I
      92: return

  void c(int);
    Code:
       0: aload_0
       1: iload_1
       2: putfield      #31                 // Field b:I
       5: aload_0
       6: iload_1
       7: putfield      #33                 // Field c:I
      10: return

  int d();
    Code:
       0: aload_0
       1: getfield      #33                 // Field c:I
       4: ldc           #29                 // int -2147483648
       6: if_icmpeq     14
       9: aload_0
      10: getfield      #33                 // Field c:I
      13: ireturn
      14: aload_0
      15: invokevirtual #124                // Method c:()V
      18: aload_0
      19: getfield      #33                 // Field c:I
      22: ireturn

  void d(int);
    Code:
       0: aload_0
       1: getfield      #31                 // Field b:I
       4: ldc           #29                 // int -2147483648
       6: if_icmpeq     19
       9: aload_0
      10: aload_0
      11: getfield      #31                 // Field b:I
      14: iload_1
      15: iadd
      16: putfield      #31                 // Field b:I
      19: aload_0
      20: getfield      #33                 // Field c:I
      23: ldc           #29                 // int -2147483648
      25: if_icmpeq     38
      28: aload_0
      29: aload_0
      30: getfield      #33                 // Field c:I
      33: iload_1
      34: iadd
      35: putfield      #33                 // Field c:I
      38: return

  void e();
    Code:
       0: aload_0
       1: getfield      #28                 // Field a:Ljava/util/ArrayList;
       4: invokevirtual #135                // Method java/util/ArrayList.clear:()V
       7: aload_0
       8: invokevirtual #137                // Method f:()V
      11: aload_0
      12: iconst_0
      13: putfield      #35                 // Field d:I
      16: return

  void f();
    Code:
       0: aload_0
       1: ldc           #29                 // int -2147483648
       3: putfield      #31                 // Field b:I
       6: aload_0
       7: ldc           #29                 // int -2147483648
       9: putfield      #33                 // Field c:I
      12: return

  void g();
    Code:
       0: aload_0
       1: getfield      #28                 // Field a:Ljava/util/ArrayList;
       4: invokevirtual #43                 // Method java/util/ArrayList.size:()I
       7: istore_1
       8: aload_0
       9: getfield      #28                 // Field a:Ljava/util/ArrayList;
      12: iload_1
      13: iconst_1
      14: isub
      15: invokevirtual #141                // Method java/util/ArrayList.remove:(I)Ljava/lang/Object;
      18: checkcast     #64                 // class android/view/View
      21: astore_2
      22: aload_0
      23: aload_2
      24: invokevirtual #82                 // Method c:(Landroid/view/View;)Landroid/support/v7/widget/StaggeredGridLayoutManager$b;
      27: astore_3
      28: aload_3
      29: aconst_null
      30: putfield      #106                // Field android/support/v7/widget/StaggeredGridLayoutManager$b.a:Landroid/support/v7/widget/StaggeredGridLayoutManager$e;
      33: aload_3
      34: invokevirtual #112                // Method android/support/v7/widget/StaggeredGridLayoutManager$b.d:()Z
      37: ifne          47
      40: aload_3
      41: invokevirtual #114                // Method android/support/v7/widget/StaggeredGridLayoutManager$b.e:()Z
      44: ifeq          67
      47: aload_0
      48: aload_0
      49: getfield      #35                 // Field d:I
      52: aload_0
      53: getfield      #20                 // Field f:Landroid/support/v7/widget/StaggeredGridLayoutManager;
      56: getfield      #52                 // Field android/support/v7/widget/StaggeredGridLayoutManager.b:Landroid/support/v7/widget/ba;
      59: aload_2
      60: invokevirtual #116                // Method android/support/v7/widget/ba.e:(Landroid/view/View;)I
      63: isub
      64: putfield      #35                 // Field d:I
      67: iload_1
      68: iconst_1
      69: if_icmpne     78
      72: aload_0
      73: ldc           #29                 // int -2147483648
      75: putfield      #31                 // Field b:I
      78: aload_0
      79: ldc           #29                 // int -2147483648
      81: putfield      #33                 // Field c:I
      84: return

  void h();
    Code:
       0: aload_0
       1: getfield      #28                 // Field a:Ljava/util/ArrayList;
       4: iconst_0
       5: invokevirtual #141                // Method java/util/ArrayList.remove:(I)Ljava/lang/Object;
       8: checkcast     #64                 // class android/view/View
      11: astore_1
      12: aload_0
      13: aload_1
      14: invokevirtual #82                 // Method c:(Landroid/view/View;)Landroid/support/v7/widget/StaggeredGridLayoutManager$b;
      17: astore_2
      18: aload_2
      19: aconst_null
      20: putfield      #106                // Field android/support/v7/widget/StaggeredGridLayoutManager$b.a:Landroid/support/v7/widget/StaggeredGridLayoutManager$e;
      23: aload_0
      24: getfield      #28                 // Field a:Ljava/util/ArrayList;
      27: invokevirtual #43                 // Method java/util/ArrayList.size:()I
      30: ifne          39
      33: aload_0
      34: ldc           #29                 // int -2147483648
      36: putfield      #33                 // Field c:I
      39: aload_2
      40: invokevirtual #112                // Method android/support/v7/widget/StaggeredGridLayoutManager$b.d:()Z
      43: ifne          53
      46: aload_2
      47: invokevirtual #114                // Method android/support/v7/widget/StaggeredGridLayoutManager$b.e:()Z
      50: ifeq          73
      53: aload_0
      54: aload_0
      55: getfield      #35                 // Field d:I
      58: aload_0
      59: getfield      #20                 // Field f:Landroid/support/v7/widget/StaggeredGridLayoutManager;
      62: getfield      #52                 // Field android/support/v7/widget/StaggeredGridLayoutManager.b:Landroid/support/v7/widget/ba;
      65: aload_1
      66: invokevirtual #116                // Method android/support/v7/widget/ba.e:(Landroid/view/View;)I
      69: isub
      70: putfield      #35                 // Field d:I
      73: aload_0
      74: ldc           #29                 // int -2147483648
      76: putfield      #31                 // Field b:I
      79: return

  public int i();
    Code:
       0: aload_0
       1: getfield      #35                 // Field d:I
       4: ireturn

  public int j();
    Code:
       0: aload_0
       1: getfield      #20                 // Field f:Landroid/support/v7/widget/StaggeredGridLayoutManager;
       4: getfield      #75                 // Field android/support/v7/widget/StaggeredGridLayoutManager.d:Z
       7: ifeq          30
      10: aload_0
      11: getfield      #28                 // Field a:Ljava/util/ArrayList;
      14: invokevirtual #43                 // Method java/util/ArrayList.size:()I
      17: iconst_1
      18: isub
      19: istore_1
      20: iconst_m1
      21: istore_2
      22: aload_0
      23: iload_1
      24: iload_2
      25: iconst_1
      26: invokevirtual #145                // Method a:(IIZ)I
      29: ireturn
      30: iconst_0
      31: istore_1
      32: aload_0
      33: getfield      #28                 // Field a:Ljava/util/ArrayList;
      36: invokevirtual #43                 // Method java/util/ArrayList.size:()I
      39: istore_2
      40: goto          22

  public int k();
    Code:
       0: aload_0
       1: getfield      #20                 // Field f:Landroid/support/v7/widget/StaggeredGridLayoutManager;
       4: getfield      #75                 // Field android/support/v7/widget/StaggeredGridLayoutManager.d:Z
       7: ifeq          28
      10: iconst_0
      11: istore_1
      12: aload_0
      13: getfield      #28                 // Field a:Ljava/util/ArrayList;
      16: invokevirtual #43                 // Method java/util/ArrayList.size:()I
      19: istore_2
      20: aload_0
      21: iload_1
      22: iload_2
      23: iconst_1
      24: invokevirtual #145                // Method a:(IIZ)I
      27: ireturn
      28: aload_0
      29: getfield      #28                 // Field a:Ljava/util/ArrayList;
      32: invokevirtual #43                 // Method java/util/ArrayList.size:()I
      35: iconst_1
      36: isub
      37: istore_1
      38: iconst_m1
      39: istore_2
      40: goto          20
}
