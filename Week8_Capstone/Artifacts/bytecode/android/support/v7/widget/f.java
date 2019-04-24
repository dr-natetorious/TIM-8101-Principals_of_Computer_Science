class android.support.v7.widget.f implements android.support.v7.widget.az$a {
  final java.util.ArrayList<android.support.v7.widget.f$b> a;

  final java.util.ArrayList<android.support.v7.widget.f$b> b;

  final android.support.v7.widget.f$a c;

  java.lang.Runnable d;

  final boolean e;

  final android.support.v7.widget.az f;

  android.support.v7.widget.f(android.support.v7.widget.f$a);
    Code:
       0: aload_0
       1: aload_1
       2: iconst_0
       3: invokespecial #32                 // Method "<init>":(Landroid/support/v7/widget/f$a;Z)V
       6: return

  android.support.v7.widget.f(android.support.v7.widget.f$a, boolean);
    Code:
       0: aload_0
       1: invokespecial #36                 // Method java/lang/Object."<init>":()V
       4: aload_0
       5: new           #38                 // class android/support/v4/g/k$b
       8: dup
       9: bipush        30
      11: invokespecial #41                 // Method android/support/v4/g/k$b."<init>":(I)V
      14: putfield      #43                 // Field g:Landroid/support/v4/g/k$a;
      17: aload_0
      18: new           #45                 // class java/util/ArrayList
      21: dup
      22: invokespecial #46                 // Method java/util/ArrayList."<init>":()V
      25: putfield      #48                 // Field a:Ljava/util/ArrayList;
      28: aload_0
      29: new           #45                 // class java/util/ArrayList
      32: dup
      33: invokespecial #46                 // Method java/util/ArrayList."<init>":()V
      36: putfield      #50                 // Field b:Ljava/util/ArrayList;
      39: aload_0
      40: iconst_0
      41: putfield      #52                 // Field h:I
      44: aload_0
      45: aload_1
      46: putfield      #54                 // Field c:Landroid/support/v7/widget/f$a;
      49: aload_0
      50: iload_2
      51: putfield      #56                 // Field e:Z
      54: aload_0
      55: new           #58                 // class android/support/v7/widget/az
      58: dup
      59: aload_0
      60: invokespecial #61                 // Method android/support/v7/widget/az."<init>":(Landroid/support/v7/widget/az$a;)V
      63: putfield      #63                 // Field f:Landroid/support/v7/widget/az;
      66: return

  int a(int, int);
    Code:
       0: aload_0
       1: getfield      #50                 // Field b:Ljava/util/ArrayList;
       4: invokevirtual #88                 // Method java/util/ArrayList.size:()I
       7: istore        5
       9: iload_2
      10: istore        4
      12: iload_1
      13: istore_2
      14: iload         4
      16: iload         5
      18: if_icmpge     174
      21: aload_0
      22: getfield      #50                 // Field b:Ljava/util/ArrayList;
      25: iload         4
      27: invokevirtual #92                 // Method java/util/ArrayList.get:(I)Ljava/lang/Object;
      30: checkcast     #11                 // class android/support/v7/widget/f$b
      33: astore        6
      35: aload         6
      37: getfield      #94                 // Field android/support/v7/widget/f$b.a:I
      40: bipush        8
      42: if_icmpne     96
      45: aload         6
      47: getfield      #68                 // Field android/support/v7/widget/f$b.b:I
      50: iload_2
      51: if_icmpne     63
      54: aload         6
      56: getfield      #70                 // Field android/support/v7/widget/f$b.d:I
      59: istore_1
      60: goto          163
      63: iload_2
      64: istore_3
      65: aload         6
      67: getfield      #68                 // Field android/support/v7/widget/f$b.b:I
      70: iload_2
      71: if_icmpge     78
      74: iload_2
      75: iconst_1
      76: isub
      77: istore_3
      78: iload_3
      79: istore_1
      80: aload         6
      82: getfield      #70                 // Field android/support/v7/widget/f$b.d:I
      85: iload_3
      86: if_icmpgt     163
      89: iload_3
      90: iconst_1
      91: iadd
      92: istore_1
      93: goto          163
      96: iload_2
      97: istore_1
      98: aload         6
     100: getfield      #68                 // Field android/support/v7/widget/f$b.b:I
     103: iload_2
     104: if_icmpgt     163
     107: aload         6
     109: getfield      #94                 // Field android/support/v7/widget/f$b.a:I
     112: iconst_2
     113: if_icmpne     144
     116: iload_2
     117: aload         6
     119: getfield      #68                 // Field android/support/v7/widget/f$b.b:I
     122: aload         6
     124: getfield      #70                 // Field android/support/v7/widget/f$b.d:I
     127: iadd
     128: if_icmpge     133
     131: iconst_m1
     132: ireturn
     133: iload_2
     134: aload         6
     136: getfield      #70                 // Field android/support/v7/widget/f$b.d:I
     139: isub
     140: istore_1
     141: goto          163
     144: iload_2
     145: istore_1
     146: aload         6
     148: getfield      #94                 // Field android/support/v7/widget/f$b.a:I
     151: iconst_1
     152: if_icmpne     163
     155: iload_2
     156: aload         6
     158: getfield      #70                 // Field android/support/v7/widget/f$b.d:I
     161: iadd
     162: istore_1
     163: iload         4
     165: iconst_1
     166: iadd
     167: istore        4
     169: iload_1
     170: istore_2
     171: goto          14
     174: iload_2
     175: ireturn

  public android.support.v7.widget.f$b a(int, int, int, java.lang.Object);
    Code:
       0: aload_0
       1: getfield      #43                 // Field g:Landroid/support/v4/g/k$a;
       4: invokeinterface #151,  1          // InterfaceMethod android/support/v4/g/k$a.a:()Ljava/lang/Object;
       9: checkcast     #11                 // class android/support/v7/widget/f$b
      12: astore        5
      14: aload         5
      16: ifnonnull     32
      19: new           #11                 // class android/support/v7/widget/f$b
      22: dup
      23: iload_1
      24: iload_2
      25: iload_3
      26: aload         4
      28: invokespecial #154                // Method android/support/v7/widget/f$b."<init>":(IIILjava/lang/Object;)V
      31: areturn
      32: aload         5
      34: iload_1
      35: putfield      #94                 // Field android/support/v7/widget/f$b.a:I
      38: aload         5
      40: iload_2
      41: putfield      #68                 // Field android/support/v7/widget/f$b.b:I
      44: aload         5
      46: iload_3
      47: putfield      #70                 // Field android/support/v7/widget/f$b.d:I
      50: aload         5
      52: aload         4
      54: putfield      #100                // Field android/support/v7/widget/f$b.c:Ljava/lang/Object;
      57: aload         5
      59: areturn

  void a();
    Code:
       0: aload_0
       1: aload_0
       2: getfield      #48                 // Field a:Ljava/util/ArrayList;
       5: invokevirtual #157                // Method a:(Ljava/util/List;)V
       8: aload_0
       9: aload_0
      10: getfield      #50                 // Field b:Ljava/util/ArrayList;
      13: invokevirtual #157                // Method a:(Ljava/util/List;)V
      16: aload_0
      17: iconst_0
      18: putfield      #52                 // Field h:I
      21: return

  public void a(android.support.v7.widget.f$b);
    Code:
       0: aload_0
       1: getfield      #56                 // Field e:Z
       4: ifne          23
       7: aload_1
       8: aconst_null
       9: putfield      #100                // Field android/support/v7/widget/f$b.c:Ljava/lang/Object;
      12: aload_0
      13: getfield      #43                 // Field g:Landroid/support/v4/g/k$a;
      16: aload_1
      17: invokeinterface #159,  2          // InterfaceMethod android/support/v4/g/k$a.a:(Ljava/lang/Object;)Z
      22: pop
      23: return

  void a(android.support.v7.widget.f$b, int);
    Code:
       0: aload_0
       1: getfield      #54                 // Field c:Landroid/support/v7/widget/f$a;
       4: aload_1
       5: invokeinterface #160,  2          // InterfaceMethod android/support/v7/widget/f$a.a:(Landroid/support/v7/widget/f$b;)V
      10: aload_1
      11: getfield      #94                 // Field android/support/v7/widget/f$b.a:I
      14: istore_3
      15: iload_3
      16: iconst_2
      17: if_icmpeq     54
      20: iload_3
      21: iconst_4
      22: if_icmpeq     35
      25: new           #118                // class java/lang/IllegalArgumentException
      28: dup
      29: ldc           #162                // String only remove and update ops can be dispatched in first pass
      31: invokespecial #125                // Method java/lang/IllegalArgumentException."<init>":(Ljava/lang/String;)V
      34: athrow
      35: aload_0
      36: getfield      #54                 // Field c:Landroid/support/v7/widget/f$a;
      39: iload_2
      40: aload_1
      41: getfield      #70                 // Field android/support/v7/widget/f$b.d:I
      44: aload_1
      45: getfield      #100                // Field android/support/v7/widget/f$b.c:Ljava/lang/Object;
      48: invokeinterface #146,  4          // InterfaceMethod android/support/v7/widget/f$a.a:(IILjava/lang/Object;)V
      53: return
      54: aload_0
      55: getfield      #54                 // Field c:Landroid/support/v7/widget/f$a;
      58: iload_2
      59: aload_1
      60: getfield      #70                 // Field android/support/v7/widget/f$b.d:I
      63: invokeinterface #164,  3          // InterfaceMethod android/support/v7/widget/f$a.a:(II)V
      68: return

  void a(java.util.List<android.support.v7.widget.f$b>);
    Code:
       0: aload_1
       1: invokeinterface #167,  1          // InterfaceMethod java/util/List.size:()I
       6: istore_3
       7: iconst_0
       8: istore_2
       9: iload_2
      10: iload_3
      11: if_icmpge     35
      14: aload_0
      15: aload_1
      16: iload_2
      17: invokeinterface #168,  2          // InterfaceMethod java/util/List.get:(I)Ljava/lang/Object;
      22: checkcast     #11                 // class android/support/v7/widget/f$b
      25: invokevirtual #83                 // Method a:(Landroid/support/v7/widget/f$b;)V
      28: iload_2
      29: iconst_1
      30: iadd
      31: istore_2
      32: goto          9
      35: aload_1
      36: invokeinterface #171,  1          // InterfaceMethod java/util/List.clear:()V
      41: return

  boolean a(int);
    Code:
       0: iload_1
       1: aload_0
       2: getfield      #52                 // Field h:I
       5: iand
       6: ifeq          11
       9: iconst_1
      10: ireturn
      11: iconst_0
      12: ireturn

  boolean a(int, int, int);
    Code:
       0: iconst_0
       1: istore        4
       3: iload_1
       4: iload_2
       5: if_icmpne     10
       8: iconst_0
       9: ireturn
      10: iload_3
      11: iconst_1
      12: if_icmpeq     25
      15: new           #118                // class java/lang/IllegalArgumentException
      18: dup
      19: ldc           #176                // String Moving more than 1 item is not supported yet
      21: invokespecial #125                // Method java/lang/IllegalArgumentException."<init>":(Ljava/lang/String;)V
      24: athrow
      25: aload_0
      26: getfield      #48                 // Field a:Ljava/util/ArrayList;
      29: aload_0
      30: bipush        8
      32: iload_1
      33: iload_2
      34: aconst_null
      35: invokevirtual #79                 // Method a:(IIILjava/lang/Object;)Landroid/support/v7/widget/f$b;
      38: invokevirtual #134                // Method java/util/ArrayList.add:(Ljava/lang/Object;)Z
      41: pop
      42: aload_0
      43: aload_0
      44: getfield      #52                 // Field h:I
      47: bipush        8
      49: ior
      50: putfield      #52                 // Field h:I
      53: aload_0
      54: getfield      #48                 // Field a:Ljava/util/ArrayList;
      57: invokevirtual #88                 // Method java/util/ArrayList.size:()I
      60: iconst_1
      61: if_icmpne     67
      64: iconst_1
      65: istore        4
      67: iload         4
      69: ireturn

  boolean a(int, int, java.lang.Object);
    Code:
       0: iconst_0
       1: istore        4
       3: iload_2
       4: iconst_1
       5: if_icmpge     10
       8: iconst_0
       9: ireturn
      10: aload_0
      11: getfield      #48                 // Field a:Ljava/util/ArrayList;
      14: aload_0
      15: iconst_4
      16: iload_1
      17: iload_2
      18: aload_3
      19: invokevirtual #79                 // Method a:(IIILjava/lang/Object;)Landroid/support/v7/widget/f$b;
      22: invokevirtual #134                // Method java/util/ArrayList.add:(Ljava/lang/Object;)Z
      25: pop
      26: aload_0
      27: aload_0
      28: getfield      #52                 // Field h:I
      31: iconst_4
      32: ior
      33: putfield      #52                 // Field h:I
      36: aload_0
      37: getfield      #48                 // Field a:Ljava/util/ArrayList;
      40: invokevirtual #88                 // Method java/util/ArrayList.size:()I
      43: iconst_1
      44: if_icmpne     50
      47: iconst_1
      48: istore        4
      50: iload         4
      52: ireturn

  int b(int);
    Code:
       0: aload_0
       1: iload_1
       2: iconst_0
       3: invokevirtual #102                // Method a:(II)I
       6: ireturn

  void b();
    Code:
       0: aload_0
       1: getfield      #63                 // Field f:Landroid/support/v7/widget/az;
       4: aload_0
       5: getfield      #48                 // Field a:Ljava/util/ArrayList;
       8: invokevirtual #179                // Method android/support/v7/widget/az.a:(Ljava/util/List;)V
      11: aload_0
      12: getfield      #48                 // Field a:Ljava/util/ArrayList;
      15: invokevirtual #88                 // Method java/util/ArrayList.size:()I
      18: istore_2
      19: iconst_0
      20: istore_1
      21: iload_1
      22: iload_2
      23: if_icmpge     139
      26: aload_0
      27: getfield      #48                 // Field a:Ljava/util/ArrayList;
      30: iload_1
      31: invokevirtual #92                 // Method java/util/ArrayList.get:(I)Ljava/lang/Object;
      34: checkcast     #11                 // class android/support/v7/widget/f$b
      37: astore        4
      39: aload         4
      41: getfield      #94                 // Field android/support/v7/widget/f$b.a:I
      44: istore_3
      45: iload_3
      46: iconst_4
      47: if_icmpeq     110
      50: iload_3
      51: bipush        8
      53: if_icmpeq     101
      56: iload_3
      57: tableswitch   { // 1 to 2
                     1: 92
                     2: 83
               default: 80
          }
      80: goto          116
      83: aload_0
      84: aload         4
      86: invokespecial #181                // Method c:(Landroid/support/v7/widget/f$b;)V
      89: goto          116
      92: aload_0
      93: aload         4
      95: invokespecial #183                // Method f:(Landroid/support/v7/widget/f$b;)V
      98: goto          116
     101: aload_0
     102: aload         4
     104: invokespecial #185                // Method b:(Landroid/support/v7/widget/f$b;)V
     107: goto          116
     110: aload_0
     111: aload         4
     113: invokespecial #187                // Method d:(Landroid/support/v7/widget/f$b;)V
     116: aload_0
     117: getfield      #189                // Field d:Ljava/lang/Runnable;
     120: ifnull        132
     123: aload_0
     124: getfield      #189                // Field d:Ljava/lang/Runnable;
     127: invokeinterface #194,  1          // InterfaceMethod java/lang/Runnable.run:()V
     132: iload_1
     133: iconst_1
     134: iadd
     135: istore_1
     136: goto          21
     139: aload_0
     140: getfield      #48                 // Field a:Ljava/util/ArrayList;
     143: invokevirtual #195                // Method java/util/ArrayList.clear:()V
     146: return

  boolean b(int, int);
    Code:
       0: iconst_0
       1: istore_3
       2: iload_2
       3: iconst_1
       4: if_icmpge     9
       7: iconst_0
       8: ireturn
       9: aload_0
      10: getfield      #48                 // Field a:Ljava/util/ArrayList;
      13: aload_0
      14: iconst_1
      15: iload_1
      16: iload_2
      17: aconst_null
      18: invokevirtual #79                 // Method a:(IIILjava/lang/Object;)Landroid/support/v7/widget/f$b;
      21: invokevirtual #134                // Method java/util/ArrayList.add:(Ljava/lang/Object;)Z
      24: pop
      25: aload_0
      26: aload_0
      27: getfield      #52                 // Field h:I
      30: iconst_1
      31: ior
      32: putfield      #52                 // Field h:I
      35: aload_0
      36: getfield      #48                 // Field a:Ljava/util/ArrayList;
      39: invokevirtual #88                 // Method java/util/ArrayList.size:()I
      42: iconst_1
      43: if_icmpne     48
      46: iconst_1
      47: istore_3
      48: iload_3
      49: ireturn

  public int c(int);
    Code:
       0: aload_0
       1: getfield      #48                 // Field a:Ljava/util/ArrayList;
       4: invokevirtual #88                 // Method java/util/ArrayList.size:()I
       7: istore        5
       9: iconst_0
      10: istore        4
      12: iload_1
      13: istore_2
      14: iload         4
      16: iload         5
      18: if_icmpge     197
      21: aload_0
      22: getfield      #48                 // Field a:Ljava/util/ArrayList;
      25: iload         4
      27: invokevirtual #92                 // Method java/util/ArrayList.get:(I)Ljava/lang/Object;
      30: checkcast     #11                 // class android/support/v7/widget/f$b
      33: astore        6
      35: aload         6
      37: getfield      #94                 // Field android/support/v7/widget/f$b.a:I
      40: istore_1
      41: iload_1
      42: bipush        8
      44: if_icmpeq     138
      47: iload_1
      48: tableswitch   { // 1 to 2
                     1: 116
                     2: 77
               default: 72
          }
      72: iload_2
      73: istore_1
      74: goto          186
      77: iload_2
      78: istore_1
      79: aload         6
      81: getfield      #68                 // Field android/support/v7/widget/f$b.b:I
      84: iload_2
      85: if_icmpgt     186
      88: aload         6
      90: getfield      #68                 // Field android/support/v7/widget/f$b.b:I
      93: aload         6
      95: getfield      #70                 // Field android/support/v7/widget/f$b.d:I
      98: iadd
      99: iload_2
     100: if_icmple     105
     103: iconst_m1
     104: ireturn
     105: iload_2
     106: aload         6
     108: getfield      #70                 // Field android/support/v7/widget/f$b.d:I
     111: isub
     112: istore_1
     113: goto          186
     116: iload_2
     117: istore_1
     118: aload         6
     120: getfield      #68                 // Field android/support/v7/widget/f$b.b:I
     123: iload_2
     124: if_icmpgt     186
     127: iload_2
     128: aload         6
     130: getfield      #70                 // Field android/support/v7/widget/f$b.d:I
     133: iadd
     134: istore_1
     135: goto          186
     138: aload         6
     140: getfield      #68                 // Field android/support/v7/widget/f$b.b:I
     143: iload_2
     144: if_icmpne     156
     147: aload         6
     149: getfield      #70                 // Field android/support/v7/widget/f$b.d:I
     152: istore_1
     153: goto          186
     156: iload_2
     157: istore_3
     158: aload         6
     160: getfield      #68                 // Field android/support/v7/widget/f$b.b:I
     163: iload_2
     164: if_icmpge     171
     167: iload_2
     168: iconst_1
     169: isub
     170: istore_3
     171: iload_3
     172: istore_1
     173: aload         6
     175: getfield      #70                 // Field android/support/v7/widget/f$b.d:I
     178: iload_3
     179: if_icmpgt     186
     182: iload_3
     183: iconst_1
     184: iadd
     185: istore_1
     186: iload         4
     188: iconst_1
     189: iadd
     190: istore        4
     192: iload_1
     193: istore_2
     194: goto          14
     197: iload_2
     198: ireturn

  void c();
    Code:
       0: aload_0
       1: getfield      #50                 // Field b:Ljava/util/ArrayList;
       4: invokevirtual #88                 // Method java/util/ArrayList.size:()I
       7: istore_2
       8: iconst_0
       9: istore_1
      10: iload_1
      11: iload_2
      12: if_icmpge     42
      15: aload_0
      16: getfield      #54                 // Field c:Landroid/support/v7/widget/f$a;
      19: aload_0
      20: getfield      #50                 // Field b:Ljava/util/ArrayList;
      23: iload_1
      24: invokevirtual #92                 // Method java/util/ArrayList.get:(I)Ljava/lang/Object;
      27: checkcast     #11                 // class android/support/v7/widget/f$b
      30: invokeinterface #197,  2          // InterfaceMethod android/support/v7/widget/f$a.b:(Landroid/support/v7/widget/f$b;)V
      35: iload_1
      36: iconst_1
      37: iadd
      38: istore_1
      39: goto          10
      42: aload_0
      43: aload_0
      44: getfield      #50                 // Field b:Ljava/util/ArrayList;
      47: invokevirtual #157                // Method a:(Ljava/util/List;)V
      50: aload_0
      51: iconst_0
      52: putfield      #52                 // Field h:I
      55: return

  boolean c(int, int);
    Code:
       0: iconst_0
       1: istore_3
       2: iload_2
       3: iconst_1
       4: if_icmpge     9
       7: iconst_0
       8: ireturn
       9: aload_0
      10: getfield      #48                 // Field a:Ljava/util/ArrayList;
      13: aload_0
      14: iconst_2
      15: iload_1
      16: iload_2
      17: aconst_null
      18: invokevirtual #79                 // Method a:(IIILjava/lang/Object;)Landroid/support/v7/widget/f$b;
      21: invokevirtual #134                // Method java/util/ArrayList.add:(Ljava/lang/Object;)Z
      24: pop
      25: aload_0
      26: aload_0
      27: getfield      #52                 // Field h:I
      30: iconst_2
      31: ior
      32: putfield      #52                 // Field h:I
      35: aload_0
      36: getfield      #48                 // Field a:Ljava/util/ArrayList;
      39: invokevirtual #88                 // Method java/util/ArrayList.size:()I
      42: iconst_1
      43: if_icmpne     48
      46: iconst_1
      47: istore_3
      48: iload_3
      49: ireturn

  boolean d();
    Code:
       0: aload_0
       1: getfield      #48                 // Field a:Ljava/util/ArrayList;
       4: invokevirtual #88                 // Method java/util/ArrayList.size:()I
       7: ifle          12
      10: iconst_1
      11: ireturn
      12: iconst_0
      13: ireturn

  void e();
    Code:
       0: aload_0
       1: invokevirtual #200                // Method c:()V
       4: aload_0
       5: getfield      #48                 // Field a:Ljava/util/ArrayList;
       8: invokevirtual #88                 // Method java/util/ArrayList.size:()I
      11: istore_2
      12: iconst_0
      13: istore_1
      14: iload_1
      15: iload_2
      16: if_icmpge     232
      19: aload_0
      20: getfield      #48                 // Field a:Ljava/util/ArrayList;
      23: iload_1
      24: invokevirtual #92                 // Method java/util/ArrayList.get:(I)Ljava/lang/Object;
      27: checkcast     #11                 // class android/support/v7/widget/f$b
      30: astore        4
      32: aload         4
      34: getfield      #94                 // Field android/support/v7/widget/f$b.a:I
      37: istore_3
      38: iload_3
      39: iconst_4
      40: if_icmpeq     174
      43: iload_3
      44: bipush        8
      46: if_icmpeq     141
      49: iload_3
      50: tableswitch   { // 1 to 2
                     1: 108
                     2: 75
               default: 72
          }
      72: goto          209
      75: aload_0
      76: getfield      #54                 // Field c:Landroid/support/v7/widget/f$a;
      79: aload         4
      81: invokeinterface #197,  2          // InterfaceMethod android/support/v7/widget/f$a.b:(Landroid/support/v7/widget/f$b;)V
      86: aload_0
      87: getfield      #54                 // Field c:Landroid/support/v7/widget/f$a;
      90: aload         4
      92: getfield      #68                 // Field android/support/v7/widget/f$b.b:I
      95: aload         4
      97: getfield      #70                 // Field android/support/v7/widget/f$b.d:I
     100: invokeinterface #164,  3          // InterfaceMethod android/support/v7/widget/f$a.a:(II)V
     105: goto          209
     108: aload_0
     109: getfield      #54                 // Field c:Landroid/support/v7/widget/f$a;
     112: aload         4
     114: invokeinterface #197,  2          // InterfaceMethod android/support/v7/widget/f$a.b:(Landroid/support/v7/widget/f$b;)V
     119: aload_0
     120: getfield      #54                 // Field c:Landroid/support/v7/widget/f$a;
     123: aload         4
     125: getfield      #68                 // Field android/support/v7/widget/f$b.b:I
     128: aload         4
     130: getfield      #70                 // Field android/support/v7/widget/f$b.d:I
     133: invokeinterface #141,  3          // InterfaceMethod android/support/v7/widget/f$a.c:(II)V
     138: goto          209
     141: aload_0
     142: getfield      #54                 // Field c:Landroid/support/v7/widget/f$a;
     145: aload         4
     147: invokeinterface #197,  2          // InterfaceMethod android/support/v7/widget/f$a.b:(Landroid/support/v7/widget/f$b;)V
     152: aload_0
     153: getfield      #54                 // Field c:Landroid/support/v7/widget/f$a;
     156: aload         4
     158: getfield      #68                 // Field android/support/v7/widget/f$b.b:I
     161: aload         4
     163: getfield      #70                 // Field android/support/v7/widget/f$b.d:I
     166: invokeinterface #143,  3          // InterfaceMethod android/support/v7/widget/f$a.d:(II)V
     171: goto          209
     174: aload_0
     175: getfield      #54                 // Field c:Landroid/support/v7/widget/f$a;
     178: aload         4
     180: invokeinterface #197,  2          // InterfaceMethod android/support/v7/widget/f$a.b:(Landroid/support/v7/widget/f$b;)V
     185: aload_0
     186: getfield      #54                 // Field c:Landroid/support/v7/widget/f$a;
     189: aload         4
     191: getfield      #68                 // Field android/support/v7/widget/f$b.b:I
     194: aload         4
     196: getfield      #70                 // Field android/support/v7/widget/f$b.d:I
     199: aload         4
     201: getfield      #100                // Field android/support/v7/widget/f$b.c:Ljava/lang/Object;
     204: invokeinterface #146,  4          // InterfaceMethod android/support/v7/widget/f$a.a:(IILjava/lang/Object;)V
     209: aload_0
     210: getfield      #189                // Field d:Ljava/lang/Runnable;
     213: ifnull        225
     216: aload_0
     217: getfield      #189                // Field d:Ljava/lang/Runnable;
     220: invokeinterface #194,  1          // InterfaceMethod java/lang/Runnable.run:()V
     225: iload_1
     226: iconst_1
     227: iadd
     228: istore_1
     229: goto          14
     232: aload_0
     233: aload_0
     234: getfield      #48                 // Field a:Ljava/util/ArrayList;
     237: invokevirtual #157                // Method a:(Ljava/util/List;)V
     240: aload_0
     241: iconst_0
     242: putfield      #52                 // Field h:I
     245: return

  boolean f();
    Code:
       0: aload_0
       1: getfield      #50                 // Field b:Ljava/util/ArrayList;
       4: invokevirtual #203                // Method java/util/ArrayList.isEmpty:()Z
       7: ifne          22
      10: aload_0
      11: getfield      #48                 // Field a:Ljava/util/ArrayList;
      14: invokevirtual #203                // Method java/util/ArrayList.isEmpty:()Z
      17: ifne          22
      20: iconst_1
      21: ireturn
      22: iconst_0
      23: ireturn
}
