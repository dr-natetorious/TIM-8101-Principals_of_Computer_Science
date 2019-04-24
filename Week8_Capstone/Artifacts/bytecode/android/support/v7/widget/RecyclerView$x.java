public abstract class android.support.v7.widget.RecyclerView$x {
  public final android.view.View a;

  java.lang.ref.WeakReference<android.support.v7.widget.RecyclerView> b;

  int c;

  int d;

  long e;

  int f;

  int g;

  android.support.v7.widget.RecyclerView$x h;

  android.support.v7.widget.RecyclerView$x i;

  java.util.List<java.lang.Object> j;

  java.util.List<java.lang.Object> k;

  int l;

  android.support.v7.widget.RecyclerView m;

  static {};
    Code:
       0: getstatic     #44                 // Field java/util/Collections.EMPTY_LIST:Ljava/util/List;
       3: putstatic     #46                 // Field o:Ljava/util/List;
       6: return

  public android.support.v7.widget.RecyclerView$x(android.view.View);
    Code:
       0: aload_0
       1: invokespecial #51                 // Method java/lang/Object."<init>":()V
       4: aload_0
       5: iconst_m1
       6: putfield      #53                 // Field c:I
       9: aload_0
      10: iconst_m1
      11: putfield      #55                 // Field d:I
      14: aload_0
      15: ldc2_w        #56                 // long -1l
      18: putfield      #59                 // Field e:J
      21: aload_0
      22: iconst_m1
      23: putfield      #61                 // Field f:I
      26: aload_0
      27: iconst_m1
      28: putfield      #63                 // Field g:I
      31: aload_0
      32: aconst_null
      33: putfield      #65                 // Field h:Landroid/support/v7/widget/RecyclerView$x;
      36: aload_0
      37: aconst_null
      38: putfield      #67                 // Field i:Landroid/support/v7/widget/RecyclerView$x;
      41: aload_0
      42: aconst_null
      43: putfield      #69                 // Field j:Ljava/util/List;
      46: aload_0
      47: aconst_null
      48: putfield      #71                 // Field k:Ljava/util/List;
      51: aload_0
      52: iconst_0
      53: putfield      #73                 // Field p:I
      56: aload_0
      57: aconst_null
      58: putfield      #75                 // Field q:Landroid/support/v7/widget/RecyclerView$p;
      61: aload_0
      62: iconst_0
      63: putfield      #77                 // Field r:Z
      66: aload_0
      67: iconst_0
      68: putfield      #79                 // Field s:I
      71: aload_0
      72: iconst_m1
      73: putfield      #81                 // Field l:I
      76: aload_1
      77: ifnonnull     90
      80: new           #83                 // class java/lang/IllegalArgumentException
      83: dup
      84: ldc           #85                 // String itemView may not be null
      86: invokespecial #88                 // Method java/lang/IllegalArgumentException."<init>":(Ljava/lang/String;)V
      89: athrow
      90: aload_0
      91: aload_1
      92: putfield      #90                 // Field a:Landroid/view/View;
      95: return

  static android.support.v7.widget.RecyclerView$p a(android.support.v7.widget.RecyclerView$x, android.support.v7.widget.RecyclerView$p);
    Code:
       0: aload_0
       1: aload_1
       2: putfield      #75                 // Field q:Landroid/support/v7/widget/RecyclerView$p;
       5: aload_1
       6: areturn

  static void a(android.support.v7.widget.RecyclerView$x, android.support.v7.widget.RecyclerView);
    Code:
       0: aload_0
       1: aload_1
       2: invokespecial #104                // Method a:(Landroid/support/v7/widget/RecyclerView;)V
       5: return

  static boolean a(android.support.v7.widget.RecyclerView$x);
    Code:
       0: aload_0
       1: invokespecial #113                // Method A:()Z
       4: ireturn

  static boolean a(android.support.v7.widget.RecyclerView$x, boolean);
    Code:
       0: aload_0
       1: iload_1
       2: putfield      #77                 // Field r:Z
       5: iload_1
       6: ireturn

  static void b(android.support.v7.widget.RecyclerView$x, android.support.v7.widget.RecyclerView);
    Code:
       0: aload_0
       1: aload_1
       2: invokespecial #116                // Method b:(Landroid/support/v7/widget/RecyclerView;)V
       5: return

  static boolean b(android.support.v7.widget.RecyclerView$x);
    Code:
       0: aload_0
       1: getfield      #77                 // Field r:Z
       4: ireturn

  static boolean c(android.support.v7.widget.RecyclerView$x);
    Code:
       0: aload_0
       1: invokespecial #119                // Method z:()Z
       4: ireturn

  static int d(android.support.v7.widget.RecyclerView$x);
    Code:
       0: aload_0
       1: getfield      #94                 // Field n:I
       4: ireturn

  void a();
    Code:
       0: aload_0
       1: iconst_m1
       2: putfield      #55                 // Field d:I
       5: aload_0
       6: iconst_m1
       7: putfield      #63                 // Field g:I
      10: return

  void a(int, int);
    Code:
       0: aload_0
       1: iload_1
       2: iload_2
       3: iand
       4: aload_0
       5: getfield      #94                 // Field n:I
       8: iload_2
       9: iconst_m1
      10: ixor
      11: iand
      12: ior
      13: putfield      #94                 // Field n:I
      16: return

  void a(int, int, boolean);
    Code:
       0: aload_0
       1: bipush        8
       3: invokevirtual #133                // Method b:(I)V
       6: aload_0
       7: iload_2
       8: iload_3
       9: invokevirtual #136                // Method a:(IZ)V
      12: aload_0
      13: iload_1
      14: putfield      #53                 // Field c:I
      17: return

  void a(int, boolean);
    Code:
       0: aload_0
       1: getfield      #55                 // Field d:I
       4: iconst_m1
       5: if_icmpne     16
       8: aload_0
       9: aload_0
      10: getfield      #53                 // Field c:I
      13: putfield      #55                 // Field d:I
      16: aload_0
      17: getfield      #63                 // Field g:I
      20: iconst_m1
      21: if_icmpne     32
      24: aload_0
      25: aload_0
      26: getfield      #53                 // Field c:I
      29: putfield      #63                 // Field g:I
      32: iload_2
      33: ifeq          46
      36: aload_0
      37: aload_0
      38: getfield      #63                 // Field g:I
      41: iload_1
      42: iadd
      43: putfield      #63                 // Field g:I
      46: aload_0
      47: aload_0
      48: getfield      #53                 // Field c:I
      51: iload_1
      52: iadd
      53: putfield      #53                 // Field c:I
      56: aload_0
      57: getfield      #90                 // Field a:Landroid/view/View;
      60: invokevirtual #142                // Method android/view/View.getLayoutParams:()Landroid/view/ViewGroup$LayoutParams;
      63: ifnull        80
      66: aload_0
      67: getfield      #90                 // Field a:Landroid/view/View;
      70: invokevirtual #142                // Method android/view/View.getLayoutParams:()Landroid/view/ViewGroup$LayoutParams;
      73: checkcast     #144                // class android/support/v7/widget/RecyclerView$j
      76: iconst_1
      77: putfield      #146                // Field android/support/v7/widget/RecyclerView$j.e:Z
      80: return

  void a(android.support.v7.widget.RecyclerView$p, boolean);
    Code:
       0: aload_0
       1: aload_1
       2: putfield      #75                 // Field q:Landroid/support/v7/widget/RecyclerView$p;
       5: aload_0
       6: iload_2
       7: putfield      #77                 // Field r:Z
      10: return

  void a(java.lang.Object);
    Code:
       0: aload_1
       1: ifnonnull     12
       4: aload_0
       5: sipush        1024
       8: invokevirtual #133                // Method b:(I)V
      11: return
      12: sipush        1024
      15: aload_0
      16: getfield      #94                 // Field n:I
      19: iand
      20: ifne          38
      23: aload_0
      24: invokespecial #150                // Method y:()V
      27: aload_0
      28: getfield      #69                 // Field j:Ljava/util/List;
      31: aload_1
      32: invokeinterface #156,  2          // InterfaceMethod java/util/List.add:(Ljava/lang/Object;)Z
      37: pop
      38: return

  public final void a(boolean);
    Code:
       0: iload_1
       1: ifeq          14
       4: aload_0
       5: getfield      #73                 // Field p:I
       8: iconst_1
       9: isub
      10: istore_2
      11: goto          21
      14: aload_0
      15: getfield      #73                 // Field p:I
      18: iconst_1
      19: iadd
      20: istore_2
      21: aload_0
      22: iload_2
      23: putfield      #73                 // Field p:I
      26: aload_0
      27: getfield      #73                 // Field p:I
      30: ifge          70
      33: aload_0
      34: iconst_0
      35: putfield      #73                 // Field p:I
      38: new           #159                // class java/lang/StringBuilder
      41: dup
      42: invokespecial #160                // Method java/lang/StringBuilder."<init>":()V
      45: astore_3
      46: aload_3
      47: ldc           #162                // String isRecyclable decremented below 0: unmatched pair of setIsRecyable() calls for
      49: invokevirtual #166                // Method java/lang/StringBuilder.append:(Ljava/lang/String;)Ljava/lang/StringBuilder;
      52: pop
      53: aload_3
      54: aload_0
      55: invokevirtual #169                // Method java/lang/StringBuilder.append:(Ljava/lang/Object;)Ljava/lang/StringBuilder;
      58: pop
      59: ldc           #171                // String View
      61: aload_3
      62: invokevirtual #175                // Method java/lang/StringBuilder.toString:()Ljava/lang/String;
      65: invokestatic  #180                // Method android/util/Log.e:(Ljava/lang/String;Ljava/lang/String;)I
      68: pop
      69: return
      70: iload_1
      71: ifne          96
      74: aload_0
      75: getfield      #73                 // Field p:I
      78: iconst_1
      79: if_icmpne     96
      82: aload_0
      83: getfield      #94                 // Field n:I
      86: bipush        16
      88: ior
      89: istore_2
      90: aload_0
      91: iload_2
      92: putfield      #94                 // Field n:I
      95: return
      96: iload_1
      97: ifeq          118
     100: aload_0
     101: getfield      #73                 // Field p:I
     104: ifne          118
     107: aload_0
     108: getfield      #94                 // Field n:I
     111: bipush        -17
     113: iand
     114: istore_2
     115: goto          90
     118: return

  boolean a(int);
    Code:
       0: iload_1
       1: aload_0
       2: getfield      #94                 // Field n:I
       5: iand
       6: ifeq          11
       9: iconst_1
      10: ireturn
      11: iconst_0
      12: ireturn

  void b();
    Code:
       0: aload_0
       1: getfield      #55                 // Field d:I
       4: iconst_m1
       5: if_icmpne     16
       8: aload_0
       9: aload_0
      10: getfield      #53                 // Field c:I
      13: putfield      #55                 // Field d:I
      16: return

  void b(int);
    Code:
       0: aload_0
       1: iload_1
       2: aload_0
       3: getfield      #94                 // Field n:I
       6: ior
       7: putfield      #94                 // Field n:I
      10: return

  boolean c();
    Code:
       0: aload_0
       1: getfield      #94                 // Field n:I
       4: sipush        128
       7: iand
       8: ifeq          13
      11: iconst_1
      12: ireturn
      13: iconst_0
      14: ireturn

  public final int d();
    Code:
       0: aload_0
       1: getfield      #63                 // Field g:I
       4: iconst_m1
       5: if_icmpne     13
       8: aload_0
       9: getfield      #53                 // Field c:I
      12: ireturn
      13: aload_0
      14: getfield      #63                 // Field g:I
      17: ireturn

  public final int e();
    Code:
       0: aload_0
       1: getfield      #184                // Field m:Landroid/support/v7/widget/RecyclerView;
       4: ifnonnull     9
       7: iconst_m1
       8: ireturn
       9: aload_0
      10: getfield      #184                // Field m:Landroid/support/v7/widget/RecyclerView;
      13: aload_0
      14: invokevirtual #186                // Method android/support/v7/widget/RecyclerView.d:(Landroid/support/v7/widget/RecyclerView$x;)I
      17: ireturn

  public final int f();
    Code:
       0: aload_0
       1: getfield      #55                 // Field d:I
       4: ireturn

  public final long g();
    Code:
       0: aload_0
       1: getfield      #59                 // Field e:J
       4: lreturn

  public final int h();
    Code:
       0: aload_0
       1: getfield      #61                 // Field f:I
       4: ireturn

  boolean i();
    Code:
       0: aload_0
       1: getfield      #75                 // Field q:Landroid/support/v7/widget/RecyclerView$p;
       4: ifnull        9
       7: iconst_1
       8: ireturn
       9: iconst_0
      10: ireturn

  void j();
    Code:
       0: aload_0
       1: getfield      #75                 // Field q:Landroid/support/v7/widget/RecyclerView$p;
       4: aload_0
       5: invokevirtual #192                // Method android/support/v7/widget/RecyclerView$p.c:(Landroid/support/v7/widget/RecyclerView$x;)V
       8: return

  boolean k();
    Code:
       0: aload_0
       1: getfield      #94                 // Field n:I
       4: bipush        32
       6: iand
       7: ifeq          12
      10: iconst_1
      11: ireturn
      12: iconst_0
      13: ireturn

  void l();
    Code:
       0: aload_0
       1: aload_0
       2: getfield      #94                 // Field n:I
       5: bipush        -33
       7: iand
       8: putfield      #94                 // Field n:I
      11: return

  void m();
    Code:
       0: aload_0
       1: aload_0
       2: getfield      #94                 // Field n:I
       5: sipush        -257
       8: iand
       9: putfield      #94                 // Field n:I
      12: return

  boolean n();
    Code:
       0: aload_0
       1: getfield      #94                 // Field n:I
       4: iconst_4
       5: iand
       6: ifeq          11
       9: iconst_1
      10: ireturn
      11: iconst_0
      12: ireturn

  boolean o();
    Code:
       0: aload_0
       1: getfield      #94                 // Field n:I
       4: iconst_2
       5: iand
       6: ifeq          11
       9: iconst_1
      10: ireturn
      11: iconst_0
      12: ireturn

  boolean p();
    Code:
       0: aload_0
       1: getfield      #94                 // Field n:I
       4: iconst_1
       5: iand
       6: ifeq          11
       9: iconst_1
      10: ireturn
      11: iconst_0
      12: ireturn

  boolean q();
    Code:
       0: aload_0
       1: getfield      #94                 // Field n:I
       4: bipush        8
       6: iand
       7: ifeq          12
      10: iconst_1
      11: ireturn
      12: iconst_0
      13: ireturn

  boolean r();
    Code:
       0: aload_0
       1: getfield      #94                 // Field n:I
       4: sipush        256
       7: iand
       8: ifeq          13
      11: iconst_1
      12: ireturn
      13: iconst_0
      14: ireturn

  boolean s();
    Code:
       0: aload_0
       1: getfield      #94                 // Field n:I
       4: sipush        512
       7: iand
       8: ifne          23
      11: aload_0
      12: invokevirtual #194                // Method n:()Z
      15: ifeq          21
      18: goto          23
      21: iconst_0
      22: ireturn
      23: iconst_1
      24: ireturn

  void t();
    Code:
       0: aload_0
       1: getfield      #69                 // Field j:Ljava/util/List;
       4: ifnull        16
       7: aload_0
       8: getfield      #69                 // Field j:Ljava/util/List;
      11: invokeinterface #198,  1          // InterfaceMethod java/util/List.clear:()V
      16: aload_0
      17: aload_0
      18: getfield      #94                 // Field n:I
      21: sipush        -1025
      24: iand
      25: putfield      #94                 // Field n:I
      28: return

  public java.lang.String toString();
    Code:
       0: new           #159                // class java/lang/StringBuilder
       3: dup
       4: invokespecial #160                // Method java/lang/StringBuilder."<init>":()V
       7: astore_1
       8: aload_1
       9: ldc           #200                // String ViewHolder{
      11: invokevirtual #166                // Method java/lang/StringBuilder.append:(Ljava/lang/String;)Ljava/lang/StringBuilder;
      14: pop
      15: aload_1
      16: aload_0
      17: invokevirtual #203                // Method java/lang/Object.hashCode:()I
      20: invokestatic  #209                // Method java/lang/Integer.toHexString:(I)Ljava/lang/String;
      23: invokevirtual #166                // Method java/lang/StringBuilder.append:(Ljava/lang/String;)Ljava/lang/StringBuilder;
      26: pop
      27: aload_1
      28: ldc           #211                // String  position=
      30: invokevirtual #166                // Method java/lang/StringBuilder.append:(Ljava/lang/String;)Ljava/lang/StringBuilder;
      33: pop
      34: aload_1
      35: aload_0
      36: getfield      #53                 // Field c:I
      39: invokevirtual #214                // Method java/lang/StringBuilder.append:(I)Ljava/lang/StringBuilder;
      42: pop
      43: aload_1
      44: ldc           #216                // String  id=
      46: invokevirtual #166                // Method java/lang/StringBuilder.append:(Ljava/lang/String;)Ljava/lang/StringBuilder;
      49: pop
      50: aload_1
      51: aload_0
      52: getfield      #59                 // Field e:J
      55: invokevirtual #219                // Method java/lang/StringBuilder.append:(J)Ljava/lang/StringBuilder;
      58: pop
      59: aload_1
      60: ldc           #221                // String , oldPos=
      62: invokevirtual #166                // Method java/lang/StringBuilder.append:(Ljava/lang/String;)Ljava/lang/StringBuilder;
      65: pop
      66: aload_1
      67: aload_0
      68: getfield      #55                 // Field d:I
      71: invokevirtual #214                // Method java/lang/StringBuilder.append:(I)Ljava/lang/StringBuilder;
      74: pop
      75: aload_1
      76: ldc           #223                // String , pLpos:
      78: invokevirtual #166                // Method java/lang/StringBuilder.append:(Ljava/lang/String;)Ljava/lang/StringBuilder;
      81: pop
      82: aload_1
      83: aload_0
      84: getfield      #63                 // Field g:I
      87: invokevirtual #214                // Method java/lang/StringBuilder.append:(I)Ljava/lang/StringBuilder;
      90: pop
      91: new           #159                // class java/lang/StringBuilder
      94: dup
      95: aload_1
      96: invokevirtual #175                // Method java/lang/StringBuilder.toString:()Ljava/lang/String;
      99: invokespecial #224                // Method java/lang/StringBuilder."<init>":(Ljava/lang/String;)V
     102: astore_2
     103: aload_0
     104: invokevirtual #226                // Method i:()Z
     107: ifeq          139
     110: aload_2
     111: ldc           #228                // String  scrap
     113: invokevirtual #166                // Method java/lang/StringBuilder.append:(Ljava/lang/String;)Ljava/lang/StringBuilder;
     116: pop
     117: aload_0
     118: getfield      #77                 // Field r:Z
     121: ifeq          130
     124: ldc           #230                // String [changeScrap]
     126: astore_1
     127: goto          133
     130: ldc           #232                // String [attachedScrap]
     132: astore_1
     133: aload_2
     134: aload_1
     135: invokevirtual #166                // Method java/lang/StringBuilder.append:(Ljava/lang/String;)Ljava/lang/StringBuilder;
     138: pop
     139: aload_0
     140: invokevirtual #194                // Method n:()Z
     143: ifeq          153
     146: aload_2
     147: ldc           #234                // String  invalid
     149: invokevirtual #166                // Method java/lang/StringBuilder.append:(Ljava/lang/String;)Ljava/lang/StringBuilder;
     152: pop
     153: aload_0
     154: invokevirtual #236                // Method p:()Z
     157: ifne          167
     160: aload_2
     161: ldc           #238                // String  unbound
     163: invokevirtual #166                // Method java/lang/StringBuilder.append:(Ljava/lang/String;)Ljava/lang/StringBuilder;
     166: pop
     167: aload_0
     168: invokevirtual #240                // Method o:()Z
     171: ifeq          181
     174: aload_2
     175: ldc           #242                // String  update
     177: invokevirtual #166                // Method java/lang/StringBuilder.append:(Ljava/lang/String;)Ljava/lang/StringBuilder;
     180: pop
     181: aload_0
     182: invokevirtual #244                // Method q:()Z
     185: ifeq          195
     188: aload_2
     189: ldc           #246                // String  removed
     191: invokevirtual #166                // Method java/lang/StringBuilder.append:(Ljava/lang/String;)Ljava/lang/StringBuilder;
     194: pop
     195: aload_0
     196: invokevirtual #248                // Method c:()Z
     199: ifeq          209
     202: aload_2
     203: ldc           #250                // String  ignored
     205: invokevirtual #166                // Method java/lang/StringBuilder.append:(Ljava/lang/String;)Ljava/lang/StringBuilder;
     208: pop
     209: aload_0
     210: invokevirtual #252                // Method r:()Z
     213: ifeq          223
     216: aload_2
     217: ldc           #254                // String  tmpDetached
     219: invokevirtual #166                // Method java/lang/StringBuilder.append:(Ljava/lang/String;)Ljava/lang/StringBuilder;
     222: pop
     223: aload_0
     224: invokevirtual #257                // Method w:()Z
     227: ifne          272
     230: new           #159                // class java/lang/StringBuilder
     233: dup
     234: invokespecial #160                // Method java/lang/StringBuilder."<init>":()V
     237: astore_1
     238: aload_1
     239: ldc_w         #259                // String  not recyclable(
     242: invokevirtual #166                // Method java/lang/StringBuilder.append:(Ljava/lang/String;)Ljava/lang/StringBuilder;
     245: pop
     246: aload_1
     247: aload_0
     248: getfield      #73                 // Field p:I
     251: invokevirtual #214                // Method java/lang/StringBuilder.append:(I)Ljava/lang/StringBuilder;
     254: pop
     255: aload_1
     256: ldc_w         #261                // String )
     259: invokevirtual #166                // Method java/lang/StringBuilder.append:(Ljava/lang/String;)Ljava/lang/StringBuilder;
     262: pop
     263: aload_2
     264: aload_1
     265: invokevirtual #175                // Method java/lang/StringBuilder.toString:()Ljava/lang/String;
     268: invokevirtual #166                // Method java/lang/StringBuilder.append:(Ljava/lang/String;)Ljava/lang/StringBuilder;
     271: pop
     272: aload_0
     273: invokevirtual #263                // Method s:()Z
     276: ifeq          287
     279: aload_2
     280: ldc_w         #265                // String  undefined adapter position
     283: invokevirtual #166                // Method java/lang/StringBuilder.append:(Ljava/lang/String;)Ljava/lang/StringBuilder;
     286: pop
     287: aload_0
     288: getfield      #90                 // Field a:Landroid/view/View;
     291: invokevirtual #269                // Method android/view/View.getParent:()Landroid/view/ViewParent;
     294: ifnonnull     305
     297: aload_2
     298: ldc_w         #271                // String  no parent
     301: invokevirtual #166                // Method java/lang/StringBuilder.append:(Ljava/lang/String;)Ljava/lang/StringBuilder;
     304: pop
     305: aload_2
     306: ldc_w         #273                // String }
     309: invokevirtual #166                // Method java/lang/StringBuilder.append:(Ljava/lang/String;)Ljava/lang/StringBuilder;
     312: pop
     313: aload_2
     314: invokevirtual #175                // Method java/lang/StringBuilder.toString:()Ljava/lang/String;
     317: areturn

  java.util.List<java.lang.Object> u();
    Code:
       0: aload_0
       1: getfield      #94                 // Field n:I
       4: sipush        1024
       7: iand
       8: ifne          42
      11: aload_0
      12: getfield      #69                 // Field j:Ljava/util/List;
      15: ifnull        38
      18: aload_0
      19: getfield      #69                 // Field j:Ljava/util/List;
      22: invokeinterface #278,  1          // InterfaceMethod java/util/List.size:()I
      27: ifne          33
      30: goto          38
      33: aload_0
      34: getfield      #71                 // Field k:Ljava/util/List;
      37: areturn
      38: getstatic     #46                 // Field o:Ljava/util/List;
      41: areturn
      42: getstatic     #46                 // Field o:Ljava/util/List;
      45: areturn

  void v();
    Code:
       0: aload_0
       1: iconst_0
       2: putfield      #94                 // Field n:I
       5: aload_0
       6: iconst_m1
       7: putfield      #53                 // Field c:I
      10: aload_0
      11: iconst_m1
      12: putfield      #55                 // Field d:I
      15: aload_0
      16: ldc2_w        #56                 // long -1l
      19: putfield      #59                 // Field e:J
      22: aload_0
      23: iconst_m1
      24: putfield      #63                 // Field g:I
      27: aload_0
      28: iconst_0
      29: putfield      #73                 // Field p:I
      32: aload_0
      33: aconst_null
      34: putfield      #65                 // Field h:Landroid/support/v7/widget/RecyclerView$x;
      37: aload_0
      38: aconst_null
      39: putfield      #67                 // Field i:Landroid/support/v7/widget/RecyclerView$x;
      42: aload_0
      43: invokevirtual #283                // Method t:()V
      46: aload_0
      47: iconst_0
      48: putfield      #79                 // Field s:I
      51: aload_0
      52: iconst_m1
      53: putfield      #81                 // Field l:I
      56: aload_0
      57: invokestatic  #284                // Method android/support/v7/widget/RecyclerView.c:(Landroid/support/v7/widget/RecyclerView$x;)V
      60: return

  public final boolean w();
    Code:
       0: aload_0
       1: getfield      #94                 // Field n:I
       4: bipush        16
       6: iand
       7: ifne          22
      10: aload_0
      11: getfield      #90                 // Field a:Landroid/view/View;
      14: invokestatic  #99                 // Method android/support/v4/view/s.b:(Landroid/view/View;)Z
      17: ifne          22
      20: iconst_1
      21: ireturn
      22: iconst_0
      23: ireturn

  boolean x();
    Code:
       0: aload_0
       1: getfield      #94                 // Field n:I
       4: iconst_2
       5: iand
       6: ifeq          11
       9: iconst_1
      10: ireturn
      11: iconst_0
      12: ireturn
}
