public abstract class android.support.v7.widget.RecyclerView$i {
  android.support.v7.widget.aj p;

  android.support.v7.widget.RecyclerView q;

  android.support.v7.widget.bv r;

  android.support.v7.widget.bv s;

  android.support.v7.widget.RecyclerView$t t;

  boolean u;

  boolean v;

  boolean w;

  int x;

  boolean y;

  public android.support.v7.widget.RecyclerView$i();
    Code:
       0: aload_0
       1: invokespecial #44                 // Method java/lang/Object."<init>":()V
       4: aload_0
       5: new           #9                  // class android/support/v7/widget/RecyclerView$i$1
       8: dup
       9: aload_0
      10: invokespecial #47                 // Method android/support/v7/widget/RecyclerView$i$1."<init>":(Landroid/support/v7/widget/RecyclerView$i;)V
      13: putfield      #49                 // Field a:Landroid/support/v7/widget/bv$b;
      16: aload_0
      17: new           #11                 // class android/support/v7/widget/RecyclerView$i$2
      20: dup
      21: aload_0
      22: invokespecial #50                 // Method android/support/v7/widget/RecyclerView$i$2."<init>":(Landroid/support/v7/widget/RecyclerView$i;)V
      25: putfield      #52                 // Field b:Landroid/support/v7/widget/bv$b;
      28: aload_0
      29: new           #54                 // class android/support/v7/widget/bv
      32: dup
      33: aload_0
      34: getfield      #49                 // Field a:Landroid/support/v7/widget/bv$b;
      37: invokespecial #57                 // Method android/support/v7/widget/bv."<init>":(Landroid/support/v7/widget/bv$b;)V
      40: putfield      #59                 // Field r:Landroid/support/v7/widget/bv;
      43: aload_0
      44: new           #54                 // class android/support/v7/widget/bv
      47: dup
      48: aload_0
      49: getfield      #52                 // Field b:Landroid/support/v7/widget/bv$b;
      52: invokespecial #57                 // Method android/support/v7/widget/bv."<init>":(Landroid/support/v7/widget/bv$b;)V
      55: putfield      #61                 // Field s:Landroid/support/v7/widget/bv;
      58: aload_0
      59: iconst_0
      60: putfield      #63                 // Field u:Z
      63: aload_0
      64: iconst_0
      65: putfield      #65                 // Field v:Z
      68: aload_0
      69: iconst_0
      70: putfield      #67                 // Field w:Z
      73: aload_0
      74: iconst_1
      75: putfield      #69                 // Field c:Z
      78: aload_0
      79: iconst_1
      80: putfield      #71                 // Field d:Z
      83: return

  public static int a(int, int, int);
    Code:
       0: iload_0
       1: invokestatic  #79                 // Method android/view/View$MeasureSpec.getMode:(I)I
       4: istore_3
       5: iload_0
       6: invokestatic  #82                 // Method android/view/View$MeasureSpec.getSize:(I)I
       9: istore_0
      10: iload_3
      11: ldc           #83                 // int -2147483648
      13: if_icmpeq     30
      16: iload_3
      17: ldc           #84                 // int 1073741824
      19: if_icmpeq     28
      22: iload_1
      23: iload_2
      24: invokestatic  #90                 // Method java/lang/Math.max:(II)I
      27: istore_0
      28: iload_0
      29: ireturn
      30: iload_0
      31: iload_1
      32: iload_2
      33: invokestatic  #90                 // Method java/lang/Math.max:(II)I
      36: invokestatic  #93                 // Method java/lang/Math.min:(II)I
      39: ireturn

  public static int a(int, int, int, int, boolean);
    Code:
       0: iconst_0
       1: istore        6
       3: iconst_0
       4: iload_0
       5: iload_2
       6: isub
       7: invokestatic  #90                 // Method java/lang/Math.max:(II)I
      10: istore        5
      12: iload         4
      14: ifeq          67
      17: iload_3
      18: iflt          29
      21: iload_3
      22: istore_2
      23: ldc           #84                 // int 1073741824
      25: istore_0
      26: goto          125
      29: iload_3
      30: iconst_m1
      31: if_icmpne     120
      34: iload_1
      35: ldc           #83                 // int -2147483648
      37: if_icmpeq     57
      40: iload_1
      41: ifeq          50
      44: iload_1
      45: ldc           #84                 // int 1073741824
      47: if_icmpeq     57
      50: iconst_0
      51: istore_1
      52: iconst_0
      53: istore_0
      54: goto          60
      57: iload         5
      59: istore_0
      60: iload_0
      61: istore_2
      62: iload_1
      63: istore_0
      64: goto          125
      67: iload_3
      68: iflt          74
      71: goto          21
      74: iload_3
      75: iconst_m1
      76: if_icmpne     87
      79: iload_1
      80: istore_0
      81: iload         5
      83: istore_2
      84: goto          125
      87: iload_3
      88: bipush        -2
      90: if_icmpne     120
      93: iload_1
      94: ldc           #83                 // int -2147483648
      96: if_icmpeq     111
      99: iload         5
     101: istore_2
     102: iload         6
     104: istore_0
     105: iload_1
     106: ldc           #84                 // int 1073741824
     108: if_icmpne     125
     111: ldc           #83                 // int -2147483648
     113: istore_0
     114: iload         5
     116: istore_2
     117: goto          125
     120: iconst_0
     121: istore_2
     122: iload         6
     124: istore_0
     125: iload_2
     126: iload_0
     127: invokestatic  #97                 // Method android/view/View$MeasureSpec.makeMeasureSpec:(II)I
     130: ireturn

  public static android.support.v7.widget.RecyclerView$i$b a(android.content.Context, android.util.AttributeSet, int, int);
    Code:
       0: new           #16                 // class android/support/v7/widget/RecyclerView$i$b
       3: dup
       4: invokespecial #99                 // Method android/support/v7/widget/RecyclerView$i$b."<init>":()V
       7: astore        4
       9: aload_0
      10: aload_1
      11: getstatic     #105                // Field android/support/v7/e/a$b.RecyclerView:[I
      14: iload_2
      15: iload_3
      16: invokevirtual #111                // Method android/content/Context.obtainStyledAttributes:(Landroid/util/AttributeSet;[III)Landroid/content/res/TypedArray;
      19: astore_0
      20: aload         4
      22: aload_0
      23: getstatic     #114                // Field android/support/v7/e/a$b.RecyclerView_android_orientation:I
      26: iconst_1
      27: invokevirtual #119                // Method android/content/res/TypedArray.getInt:(II)I
      30: putfield      #121                // Field android/support/v7/widget/RecyclerView$i$b.a:I
      33: aload         4
      35: aload_0
      36: getstatic     #124                // Field android/support/v7/e/a$b.RecyclerView_spanCount:I
      39: iconst_1
      40: invokevirtual #119                // Method android/content/res/TypedArray.getInt:(II)I
      43: putfield      #126                // Field android/support/v7/widget/RecyclerView$i$b.b:I
      46: aload         4
      48: aload_0
      49: getstatic     #129                // Field android/support/v7/e/a$b.RecyclerView_reverseLayout:I
      52: iconst_0
      53: invokevirtual #133                // Method android/content/res/TypedArray.getBoolean:(IZ)Z
      56: putfield      #134                // Field android/support/v7/widget/RecyclerView$i$b.c:Z
      59: aload         4
      61: aload_0
      62: getstatic     #137                // Field android/support/v7/e/a$b.RecyclerView_stackFromEnd:I
      65: iconst_0
      66: invokevirtual #133                // Method android/content/res/TypedArray.getBoolean:(IZ)Z
      69: putfield      #138                // Field android/support/v7/widget/RecyclerView$i$b.d:Z
      72: aload_0
      73: invokevirtual #141                // Method android/content/res/TypedArray.recycle:()V
      76: aload         4
      78: areturn

  static void a(android.support.v7.widget.RecyclerView$i, android.support.v7.widget.RecyclerView$t);
    Code:
       0: aload_0
       1: aload_1
       2: invokespecial #153                // Method a:(Landroid/support/v7/widget/RecyclerView$t;)V
       5: return

  public int A();
    Code:
       0: aload_0
       1: getfield      #169                // Field q:Landroid/support/v7/widget/RecyclerView;
       4: ifnull        15
       7: aload_0
       8: getfield      #169                // Field q:Landroid/support/v7/widget/RecyclerView;
      11: invokevirtual #351                // Method android/support/v7/widget/RecyclerView.getPaddingLeft:()I
      14: ireturn
      15: iconst_0
      16: ireturn

  public int B();
    Code:
       0: aload_0
       1: getfield      #169                // Field q:Landroid/support/v7/widget/RecyclerView;
       4: ifnull        15
       7: aload_0
       8: getfield      #169                // Field q:Landroid/support/v7/widget/RecyclerView;
      11: invokevirtual #354                // Method android/support/v7/widget/RecyclerView.getPaddingTop:()I
      14: ireturn
      15: iconst_0
      16: ireturn

  public int C();
    Code:
       0: aload_0
       1: getfield      #169                // Field q:Landroid/support/v7/widget/RecyclerView;
       4: ifnull        15
       7: aload_0
       8: getfield      #169                // Field q:Landroid/support/v7/widget/RecyclerView;
      11: invokevirtual #357                // Method android/support/v7/widget/RecyclerView.getPaddingRight:()I
      14: ireturn
      15: iconst_0
      16: ireturn

  public int D();
    Code:
       0: aload_0
       1: getfield      #169                // Field q:Landroid/support/v7/widget/RecyclerView;
       4: ifnull        15
       7: aload_0
       8: getfield      #169                // Field q:Landroid/support/v7/widget/RecyclerView;
      11: invokevirtual #360                // Method android/support/v7/widget/RecyclerView.getPaddingBottom:()I
      14: ireturn
      15: iconst_0
      16: ireturn

  public android.view.View E();
    Code:
       0: aload_0
       1: getfield      #169                // Field q:Landroid/support/v7/widget/RecyclerView;
       4: ifnonnull     9
       7: aconst_null
       8: areturn
       9: aload_0
      10: getfield      #169                // Field q:Landroid/support/v7/widget/RecyclerView;
      13: invokevirtual #336                // Method android/support/v7/widget/RecyclerView.getFocusedChild:()Landroid/view/View;
      16: astore_1
      17: aload_1
      18: ifnull        36
      21: aload_0
      22: getfield      #144                // Field p:Landroid/support/v7/widget/aj;
      25: aload_1
      26: invokevirtual #364                // Method android/support/v7/widget/aj.c:(Landroid/view/View;)Z
      29: ifeq          34
      32: aconst_null
      33: areturn
      34: aload_1
      35: areturn
      36: aconst_null
      37: areturn

  public int F();
    Code:
       0: aload_0
       1: getfield      #169                // Field q:Landroid/support/v7/widget/RecyclerView;
       4: invokestatic  #369                // Method android/support/v4/view/s.i:(Landroid/view/View;)I
       7: ireturn

  public int G();
    Code:
       0: aload_0
       1: getfield      #169                // Field q:Landroid/support/v7/widget/RecyclerView;
       4: invokestatic  #372                // Method android/support/v4/view/s.j:(Landroid/view/View;)I
       7: ireturn

  void H();
    Code:
       0: aload_0
       1: getfield      #198                // Field t:Landroid/support/v7/widget/RecyclerView$t;
       4: ifnull        14
       7: aload_0
       8: getfield      #198                // Field t:Landroid/support/v7/widget/RecyclerView$t;
      11: invokevirtual #375                // Method android/support/v7/widget/RecyclerView$t.a:()V
      14: return

  public void I();
    Code:
       0: aload_0
       1: iconst_1
       2: putfield      #63                 // Field u:Z
       5: return

  boolean J();
    Code:
       0: aload_0
       1: invokevirtual #378                // Method v:()I
       4: istore_2
       5: iconst_0
       6: istore_1
       7: iload_1
       8: iload_2
       9: if_icmpge     44
      12: aload_0
      13: iload_1
      14: invokevirtual #381                // Method h:(I)Landroid/view/View;
      17: invokevirtual #209                // Method android/view/View.getLayoutParams:()Landroid/view/ViewGroup$LayoutParams;
      20: astore_3
      21: aload_3
      22: getfield      #385                // Field android/view/ViewGroup$LayoutParams.width:I
      25: ifge          37
      28: aload_3
      29: getfield      #387                // Field android/view/ViewGroup$LayoutParams.height:I
      32: ifge          37
      35: iconst_1
      36: ireturn
      37: iload_1
      38: iconst_1
      39: iadd
      40: istore_1
      41: goto          7
      44: iconst_0
      45: ireturn

  public int a(int, android.support.v7.widget.RecyclerView$p, android.support.v7.widget.RecyclerView$u);
    Code:
       0: iconst_0
       1: ireturn

  public int a(android.support.v7.widget.RecyclerView$p, android.support.v7.widget.RecyclerView$u);
    Code:
       0: aload_0
       1: getfield      #169                // Field q:Landroid/support/v7/widget/RecyclerView;
       4: astore_1
       5: iconst_1
       6: istore        4
       8: iload         4
      10: istore_3
      11: aload_1
      12: ifnull        48
      15: aload_0
      16: getfield      #169                // Field q:Landroid/support/v7/widget/RecyclerView;
      19: getfield      #173                // Field android/support/v7/widget/RecyclerView.l:Landroid/support/v7/widget/RecyclerView$a;
      22: ifnonnull     27
      25: iconst_1
      26: ireturn
      27: iload         4
      29: istore_3
      30: aload_0
      31: invokevirtual #391                // Method f:()Z
      34: ifeq          48
      37: aload_0
      38: getfield      #169                // Field q:Landroid/support/v7/widget/RecyclerView;
      41: getfield      #173                // Field android/support/v7/widget/RecyclerView.l:Landroid/support/v7/widget/RecyclerView$a;
      44: invokevirtual #393                // Method android/support/v7/widget/RecyclerView$a.a:()I
      47: istore_3
      48: iload_3
      49: ireturn

  public abstract android.support.v7.widget.RecyclerView$j a();

  public android.support.v7.widget.RecyclerView$j a(android.content.Context, android.util.AttributeSet);
    Code:
       0: new           #211                // class android/support/v7/widget/RecyclerView$j
       3: dup
       4: aload_1
       5: aload_2
       6: invokespecial #398                // Method android/support/v7/widget/RecyclerView$j."<init>":(Landroid/content/Context;Landroid/util/AttributeSet;)V
       9: areturn

  public android.support.v7.widget.RecyclerView$j a(android.view.ViewGroup$LayoutParams);
    Code:
       0: aload_1
       1: instanceof    #211                // class android/support/v7/widget/RecyclerView$j
       4: ifeq          19
       7: new           #211                // class android/support/v7/widget/RecyclerView$j
      10: dup
      11: aload_1
      12: checkcast     #211                // class android/support/v7/widget/RecyclerView$j
      15: invokespecial #402                // Method android/support/v7/widget/RecyclerView$j."<init>":(Landroid/support/v7/widget/RecyclerView$j;)V
      18: areturn
      19: aload_1
      20: instanceof    #404                // class android/view/ViewGroup$MarginLayoutParams
      23: ifeq          38
      26: new           #211                // class android/support/v7/widget/RecyclerView$j
      29: dup
      30: aload_1
      31: checkcast     #404                // class android/view/ViewGroup$MarginLayoutParams
      34: invokespecial #407                // Method android/support/v7/widget/RecyclerView$j."<init>":(Landroid/view/ViewGroup$MarginLayoutParams;)V
      37: areturn
      38: new           #211                // class android/support/v7/widget/RecyclerView$j
      41: dup
      42: aload_1
      43: invokespecial #410                // Method android/support/v7/widget/RecyclerView$j."<init>":(Landroid/view/ViewGroup$LayoutParams;)V
      46: areturn

  public android.view.View a(android.view.View, int, android.support.v7.widget.RecyclerView$p, android.support.v7.widget.RecyclerView$u);
    Code:
       0: aconst_null
       1: areturn

  public void a(int, int, android.support.v7.widget.RecyclerView$u, android.support.v7.widget.RecyclerView$i$a);
    Code:
       0: return

  public void a(int, android.support.v7.widget.RecyclerView$i$a);
    Code:
       0: return

  public void a(int, android.support.v7.widget.RecyclerView$p);
    Code:
       0: aload_0
       1: iload_1
       2: invokevirtual #381                // Method h:(I)Landroid/view/View;
       5: astore_3
       6: aload_0
       7: iload_1
       8: invokevirtual #179                // Method f:(I)V
      11: aload_2
      12: aload_3
      13: invokevirtual #416                // Method android/support/v7/widget/RecyclerView$p.a:(Landroid/view/View;)V
      16: return

  public void a(android.graphics.Rect, int, int);
    Code:
       0: aload_1
       1: invokevirtual #326                // Method android/graphics/Rect.width:()I
       4: istore        4
       6: aload_0
       7: invokevirtual #289                // Method A:()I
      10: istore        5
      12: aload_0
      13: invokevirtual #297                // Method C:()I
      16: istore        6
      18: aload_1
      19: invokevirtual #329                // Method android/graphics/Rect.height:()I
      22: istore        7
      24: aload_0
      25: invokevirtual #292                // Method B:()I
      28: istore        8
      30: aload_0
      31: invokevirtual #303                // Method D:()I
      34: istore        9
      36: aload_0
      37: iload_2
      38: iload         4
      40: iload         5
      42: iadd
      43: iload         6
      45: iadd
      46: aload_0
      47: invokevirtual #419                // Method F:()I
      50: invokestatic  #421                // Method a:(III)I
      53: iload_3
      54: iload         7
      56: iload         8
      58: iadd
      59: iload         9
      61: iadd
      62: aload_0
      63: invokevirtual #423                // Method G:()I
      66: invokestatic  #421                // Method a:(III)I
      69: invokevirtual #425                // Method f:(II)V
      72: return

  public void a(android.os.Parcelable);
    Code:
       0: return

  void a(android.support.v4.view.a.b);
    Code:
       0: aload_0
       1: aload_0
       2: getfield      #169                // Field q:Landroid/support/v7/widget/RecyclerView;
       5: getfield      #430                // Field android/support/v7/widget/RecyclerView.d:Landroid/support/v7/widget/RecyclerView$p;
       8: aload_0
       9: getfield      #169                // Field q:Landroid/support/v7/widget/RecyclerView;
      12: getfield      #433                // Field android/support/v7/widget/RecyclerView.C:Landroid/support/v7/widget/RecyclerView$u;
      15: aload_1
      16: invokevirtual #436                // Method a:(Landroid/support/v7/widget/RecyclerView$p;Landroid/support/v7/widget/RecyclerView$u;Landroid/support/v4/view/a/b;)V
      19: return

  public void a(android.support.v7.widget.RecyclerView$a, android.support.v7.widget.RecyclerView$a);
    Code:
       0: return

  public void a(android.support.v7.widget.RecyclerView$p);
    Code:
       0: aload_0
       1: invokevirtual #378                // Method v:()I
       4: iconst_1
       5: isub
       6: istore_2
       7: iload_2
       8: iflt          29
      11: aload_0
      12: aload_1
      13: iload_2
      14: aload_0
      15: iload_2
      16: invokevirtual #381                // Method h:(I)Landroid/view/View;
      19: invokespecial #440                // Method a:(Landroid/support/v7/widget/RecyclerView$p;ILandroid/view/View;)V
      22: iload_2
      23: iconst_1
      24: isub
      25: istore_2
      26: goto          7
      29: return

  public void a(android.support.v7.widget.RecyclerView$p, android.support.v7.widget.RecyclerView$u, int, int);
    Code:
       0: aload_0
       1: getfield      #169                // Field q:Landroid/support/v7/widget/RecyclerView;
       4: iload_3
       5: iload         4
       7: invokevirtual #442                // Method android/support/v7/widget/RecyclerView.e:(II)V
      10: return

  public void a(android.support.v7.widget.RecyclerView$p, android.support.v7.widget.RecyclerView$u, android.support.v4.view.a.b);
    Code:
       0: aload_0
       1: getfield      #169                // Field q:Landroid/support/v7/widget/RecyclerView;
       4: iconst_m1
       5: invokevirtual #446                // Method android/support/v7/widget/RecyclerView.canScrollVertically:(I)Z
       8: ifne          22
      11: aload_0
      12: getfield      #169                // Field q:Landroid/support/v7/widget/RecyclerView;
      15: iconst_m1
      16: invokevirtual #449                // Method android/support/v7/widget/RecyclerView.canScrollHorizontally:(I)Z
      19: ifeq          34
      22: aload_3
      23: sipush        8192
      26: invokevirtual #453                // Method android/support/v4/view/a/b.a:(I)V
      29: aload_3
      30: iconst_1
      31: invokevirtual #456                // Method android/support/v4/view/a/b.k:(Z)V
      34: aload_0
      35: getfield      #169                // Field q:Landroid/support/v7/widget/RecyclerView;
      38: iconst_1
      39: invokevirtual #446                // Method android/support/v7/widget/RecyclerView.canScrollVertically:(I)Z
      42: ifne          56
      45: aload_0
      46: getfield      #169                // Field q:Landroid/support/v7/widget/RecyclerView;
      49: iconst_1
      50: invokevirtual #449                // Method android/support/v7/widget/RecyclerView.canScrollHorizontally:(I)Z
      53: ifeq          68
      56: aload_3
      57: sipush        4096
      60: invokevirtual #453                // Method android/support/v4/view/a/b.a:(I)V
      63: aload_3
      64: iconst_1
      65: invokevirtual #456                // Method android/support/v4/view/a/b.k:(Z)V
      68: aload_3
      69: aload_0
      70: aload_1
      71: aload_2
      72: invokevirtual #458                // Method a:(Landroid/support/v7/widget/RecyclerView$p;Landroid/support/v7/widget/RecyclerView$u;)I
      75: aload_0
      76: aload_1
      77: aload_2
      78: invokevirtual #460                // Method b:(Landroid/support/v7/widget/RecyclerView$p;Landroid/support/v7/widget/RecyclerView$u;)I
      81: aload_0
      82: aload_1
      83: aload_2
      84: invokevirtual #463                // Method e:(Landroid/support/v7/widget/RecyclerView$p;Landroid/support/v7/widget/RecyclerView$u;)Z
      87: aload_0
      88: aload_1
      89: aload_2
      90: invokevirtual #465                // Method d:(Landroid/support/v7/widget/RecyclerView$p;Landroid/support/v7/widget/RecyclerView$u;)I
      93: invokestatic  #470                // Method android/support/v4/view/a/b$b.a:(IIZI)Landroid/support/v4/view/a/b$b;
      96: invokevirtual #473                // Method android/support/v4/view/a/b.a:(Ljava/lang/Object;)V
      99: return

  public void a(android.support.v7.widget.RecyclerView$p, android.support.v7.widget.RecyclerView$u, android.view.View, android.support.v4.view.a.b);
    Code:
       0: aload_0
       1: invokevirtual #391                // Method f:()Z
       4: ifeq          17
       7: aload_0
       8: aload_3
       9: invokevirtual #476                // Method d:(Landroid/view/View;)I
      12: istore        5
      14: goto          20
      17: iconst_0
      18: istore        5
      20: aload_0
      21: invokevirtual #478                // Method e:()Z
      24: ifeq          37
      27: aload_0
      28: aload_3
      29: invokevirtual #476                // Method d:(Landroid/view/View;)I
      32: istore        6
      34: goto          40
      37: iconst_0
      38: istore        6
      40: aload         4
      42: iload         5
      44: iconst_1
      45: iload         6
      47: iconst_1
      48: iconst_0
      49: iconst_0
      50: invokestatic  #483                // Method android/support/v4/view/a/b$c.a:(IIIIZZ)Landroid/support/v4/view/a/b$c;
      53: invokevirtual #485                // Method android/support/v4/view/a/b.b:(Ljava/lang/Object;)V
      56: return

  public void a(android.support.v7.widget.RecyclerView$p, android.support.v7.widget.RecyclerView$u, android.view.accessibility.AccessibilityEvent);
    Code:
       0: aload_0
       1: getfield      #169                // Field q:Landroid/support/v7/widget/RecyclerView;
       4: ifnull        113
       7: aload_3
       8: ifnonnull     12
      11: return
      12: aload_0
      13: getfield      #169                // Field q:Landroid/support/v7/widget/RecyclerView;
      16: astore_1
      17: iconst_1
      18: istore        5
      20: iload         5
      22: istore        4
      24: aload_1
      25: iconst_1
      26: invokevirtual #446                // Method android/support/v7/widget/RecyclerView.canScrollVertically:(I)Z
      29: ifne          83
      32: iload         5
      34: istore        4
      36: aload_0
      37: getfield      #169                // Field q:Landroid/support/v7/widget/RecyclerView;
      40: iconst_m1
      41: invokevirtual #446                // Method android/support/v7/widget/RecyclerView.canScrollVertically:(I)Z
      44: ifne          83
      47: iload         5
      49: istore        4
      51: aload_0
      52: getfield      #169                // Field q:Landroid/support/v7/widget/RecyclerView;
      55: iconst_m1
      56: invokevirtual #449                // Method android/support/v7/widget/RecyclerView.canScrollHorizontally:(I)Z
      59: ifne          83
      62: aload_0
      63: getfield      #169                // Field q:Landroid/support/v7/widget/RecyclerView;
      66: iconst_1
      67: invokevirtual #449                // Method android/support/v7/widget/RecyclerView.canScrollHorizontally:(I)Z
      70: ifeq          80
      73: iload         5
      75: istore        4
      77: goto          83
      80: iconst_0
      81: istore        4
      83: aload_3
      84: iload         4
      86: invokevirtual #491                // Method android/view/accessibility/AccessibilityEvent.setScrollable:(Z)V
      89: aload_0
      90: getfield      #169                // Field q:Landroid/support/v7/widget/RecyclerView;
      93: getfield      #173                // Field android/support/v7/widget/RecyclerView.l:Landroid/support/v7/widget/RecyclerView$a;
      96: ifnull        113
      99: aload_3
     100: aload_0
     101: getfield      #169                // Field q:Landroid/support/v7/widget/RecyclerView;
     104: getfield      #173                // Field android/support/v7/widget/RecyclerView.l:Landroid/support/v7/widget/RecyclerView$a;
     107: invokevirtual #393                // Method android/support/v7/widget/RecyclerView$a.a:()I
     110: invokevirtual #494                // Method android/view/accessibility/AccessibilityEvent.setItemCount:(I)V
     113: return

  public void a(android.support.v7.widget.RecyclerView$u);
    Code:
       0: return

  public void a(android.support.v7.widget.RecyclerView);
    Code:
       0: return

  public void a(android.support.v7.widget.RecyclerView, int, int);
    Code:
       0: return

  public void a(android.support.v7.widget.RecyclerView, int, int, int);
    Code:
       0: return

  public void a(android.support.v7.widget.RecyclerView, int, int, java.lang.Object);
    Code:
       0: aload_0
       1: aload_1
       2: iload_2
       3: iload_3
       4: invokevirtual #501                // Method c:(Landroid/support/v7/widget/RecyclerView;II)V
       7: return

  public void a(android.support.v7.widget.RecyclerView, android.support.v7.widget.RecyclerView$p);
    Code:
       0: aload_0
       1: aload_1
       2: invokevirtual #504                // Method e:(Landroid/support/v7/widget/RecyclerView;)V
       5: return

  public void a(android.view.View);
    Code:
       0: aload_0
       1: aload_1
       2: iconst_m1
       3: invokevirtual #507                // Method a:(Landroid/view/View;I)V
       6: return

  public void a(android.view.View, int);
    Code:
       0: aload_0
       1: aload_1
       2: iload_2
       3: iconst_1
       4: invokespecial #508                // Method a:(Landroid/view/View;IZ)V
       7: return

  public void a(android.view.View, int, int);
    Code:
       0: aload_1
       1: invokevirtual #209                // Method android/view/View.getLayoutParams:()Landroid/view/ViewGroup$LayoutParams;
       4: checkcast     #211                // class android/support/v7/widget/RecyclerView$j
       7: astore        8
       9: aload_0
      10: getfield      #169                // Field q:Landroid/support/v7/widget/RecyclerView;
      13: aload_1
      14: invokevirtual #512                // Method android/support/v7/widget/RecyclerView.k:(Landroid/view/View;)Landroid/graphics/Rect;
      17: astore        9
      19: aload         9
      21: getfield      #311                // Field android/graphics/Rect.left:I
      24: istore        6
      26: aload         9
      28: getfield      #345                // Field android/graphics/Rect.right:I
      31: istore        7
      33: aload         9
      35: getfield      #320                // Field android/graphics/Rect.top:I
      38: istore        4
      40: aload         9
      42: getfield      #348                // Field android/graphics/Rect.bottom:I
      45: istore        5
      47: aload_0
      48: invokevirtual #294                // Method y:()I
      51: aload_0
      52: invokevirtual #514                // Method w:()I
      55: aload_0
      56: invokevirtual #289                // Method A:()I
      59: aload_0
      60: invokevirtual #297                // Method C:()I
      63: iadd
      64: aload         8
      66: getfield      #517                // Field android/support/v7/widget/RecyclerView$j.leftMargin:I
      69: iadd
      70: aload         8
      72: getfield      #520                // Field android/support/v7/widget/RecyclerView$j.rightMargin:I
      75: iadd
      76: iload_2
      77: iload         6
      79: iload         7
      81: iadd
      82: iadd
      83: iadd
      84: aload         8
      86: getfield      #521                // Field android/support/v7/widget/RecyclerView$j.width:I
      89: aload_0
      90: invokevirtual #478                // Method e:()Z
      93: invokestatic  #523                // Method a:(IIIIZ)I
      96: istore_2
      97: aload_0
      98: invokevirtual #300                // Method z:()I
     101: aload_0
     102: invokevirtual #525                // Method x:()I
     105: aload_0
     106: invokevirtual #292                // Method B:()I
     109: aload_0
     110: invokevirtual #303                // Method D:()I
     113: iadd
     114: aload         8
     116: getfield      #528                // Field android/support/v7/widget/RecyclerView$j.topMargin:I
     119: iadd
     120: aload         8
     122: getfield      #531                // Field android/support/v7/widget/RecyclerView$j.bottomMargin:I
     125: iadd
     126: iload_3
     127: iload         4
     129: iload         5
     131: iadd
     132: iadd
     133: iadd
     134: aload         8
     136: getfield      #532                // Field android/support/v7/widget/RecyclerView$j.height:I
     139: aload_0
     140: invokevirtual #391                // Method f:()Z
     143: invokestatic  #523                // Method a:(IIIIZ)I
     146: istore_3
     147: aload_0
     148: aload_1
     149: iload_2
     150: iload_3
     151: aload         8
     153: invokevirtual #535                // Method b:(Landroid/view/View;IILandroid/support/v7/widget/RecyclerView$j;)Z
     156: ifeq          165
     159: aload_1
     160: iload_2
     161: iload_3
     162: invokevirtual #538                // Method android/view/View.measure:(II)V
     165: return

  public void a(android.view.View, int, int, int, int);
    Code:
       0: aload_1
       1: invokevirtual #209                // Method android/view/View.getLayoutParams:()Landroid/view/ViewGroup$LayoutParams;
       4: checkcast     #211                // class android/support/v7/widget/RecyclerView$j
       7: astore        6
       9: aload         6
      11: getfield      #541                // Field android/support/v7/widget/RecyclerView$j.d:Landroid/graphics/Rect;
      14: astore        7
      16: aload_1
      17: iload_2
      18: aload         7
      20: getfield      #311                // Field android/graphics/Rect.left:I
      23: iadd
      24: aload         6
      26: getfield      #517                // Field android/support/v7/widget/RecyclerView$j.leftMargin:I
      29: iadd
      30: iload_3
      31: aload         7
      33: getfield      #320                // Field android/graphics/Rect.top:I
      36: iadd
      37: aload         6
      39: getfield      #528                // Field android/support/v7/widget/RecyclerView$j.topMargin:I
      42: iadd
      43: iload         4
      45: aload         7
      47: getfield      #345                // Field android/graphics/Rect.right:I
      50: isub
      51: aload         6
      53: getfield      #520                // Field android/support/v7/widget/RecyclerView$j.rightMargin:I
      56: isub
      57: iload         5
      59: aload         7
      61: getfield      #348                // Field android/graphics/Rect.bottom:I
      64: isub
      65: aload         6
      67: getfield      #531                // Field android/support/v7/widget/RecyclerView$j.bottomMargin:I
      70: isub
      71: invokevirtual #545                // Method android/view/View.layout:(IIII)V
      74: return

  public void a(android.view.View, int, android.support.v7.widget.RecyclerView$j);
    Code:
       0: aload_1
       1: invokestatic  #157                // Method android/support/v7/widget/RecyclerView.e:(Landroid/view/View;)Landroid/support/v7/widget/RecyclerView$x;
       4: astore        4
       6: aload         4
       8: invokevirtual #167                // Method android/support/v7/widget/RecyclerView$x.q:()Z
      11: ifeq          29
      14: aload_0
      15: getfield      #169                // Field q:Landroid/support/v7/widget/RecyclerView;
      18: getfield      #192                // Field android/support/v7/widget/RecyclerView.g:Landroid/support/v7/widget/bw;
      21: aload         4
      23: invokevirtual #203                // Method android/support/v7/widget/bw.e:(Landroid/support/v7/widget/RecyclerView$x;)V
      26: goto          41
      29: aload_0
      30: getfield      #169                // Field q:Landroid/support/v7/widget/RecyclerView;
      33: getfield      #192                // Field android/support/v7/widget/RecyclerView.g:Landroid/support/v7/widget/bw;
      36: aload         4
      38: invokevirtual #201                // Method android/support/v7/widget/bw.f:(Landroid/support/v7/widget/RecyclerView$x;)V
      41: aload_0
      42: getfield      #144                // Field p:Landroid/support/v7/widget/aj;
      45: aload_1
      46: iload_2
      47: aload_3
      48: aload         4
      50: invokevirtual #167                // Method android/support/v7/widget/RecyclerView$x.q:()Z
      53: invokevirtual #276                // Method android/support/v7/widget/aj.a:(Landroid/view/View;ILandroid/view/ViewGroup$LayoutParams;Z)V
      56: return

  public void a(android.view.View, android.graphics.Rect);
    Code:
       0: aload_1
       1: aload_2
       2: invokestatic  #548                // Method android/support/v7/widget/RecyclerView.b:(Landroid/view/View;Landroid/graphics/Rect;)V
       5: return

  void a(android.view.View, android.support.v4.view.a.b);
    Code:
       0: aload_1
       1: invokestatic  #157                // Method android/support/v7/widget/RecyclerView.e:(Landroid/view/View;)Landroid/support/v7/widget/RecyclerView$x;
       4: astore_3
       5: aload_3
       6: ifnull        50
       9: aload_3
      10: invokevirtual #167                // Method android/support/v7/widget/RecyclerView$x.q:()Z
      13: ifne          50
      16: aload_0
      17: getfield      #144                // Field p:Landroid/support/v7/widget/aj;
      20: aload_3
      21: getfield      #281                // Field android/support/v7/widget/RecyclerView$x.a:Landroid/view/View;
      24: invokevirtual #364                // Method android/support/v7/widget/aj.c:(Landroid/view/View;)Z
      27: ifne          50
      30: aload_0
      31: aload_0
      32: getfield      #169                // Field q:Landroid/support/v7/widget/RecyclerView;
      35: getfield      #430                // Field android/support/v7/widget/RecyclerView.d:Landroid/support/v7/widget/RecyclerView$p;
      38: aload_0
      39: getfield      #169                // Field q:Landroid/support/v7/widget/RecyclerView;
      42: getfield      #433                // Field android/support/v7/widget/RecyclerView.C:Landroid/support/v7/widget/RecyclerView$u;
      45: aload_1
      46: aload_2
      47: invokevirtual #551                // Method a:(Landroid/support/v7/widget/RecyclerView$p;Landroid/support/v7/widget/RecyclerView$u;Landroid/view/View;Landroid/support/v4/view/a/b;)V
      50: return

  public void a(android.view.View, android.support.v7.widget.RecyclerView$p);
    Code:
       0: aload_0
       1: aload_1
       2: invokevirtual #553                // Method c:(Landroid/view/View;)V
       5: aload_2
       6: aload_1
       7: invokevirtual #416                // Method android/support/v7/widget/RecyclerView$p.a:(Landroid/view/View;)V
      10: return

  public void a(android.view.View, boolean, android.graphics.Rect);
    Code:
       0: iload_2
       1: ifeq          55
       4: aload_1
       5: invokevirtual #209                // Method android/view/View.getLayoutParams:()Landroid/view/ViewGroup$LayoutParams;
       8: checkcast     #211                // class android/support/v7/widget/RecyclerView$j
      11: getfield      #541                // Field android/support/v7/widget/RecyclerView$j.d:Landroid/graphics/Rect;
      14: astore        4
      16: aload_3
      17: aload         4
      19: getfield      #311                // Field android/graphics/Rect.left:I
      22: ineg
      23: aload         4
      25: getfield      #320                // Field android/graphics/Rect.top:I
      28: ineg
      29: aload_1
      30: invokevirtual #557                // Method android/view/View.getWidth:()I
      33: aload         4
      35: getfield      #345                // Field android/graphics/Rect.right:I
      38: iadd
      39: aload_1
      40: invokevirtual #560                // Method android/view/View.getHeight:()I
      43: aload         4
      45: getfield      #348                // Field android/graphics/Rect.bottom:I
      48: iadd
      49: invokevirtual #563                // Method android/graphics/Rect.set:(IIII)V
      52: goto          69
      55: aload_3
      56: iconst_0
      57: iconst_0
      58: aload_1
      59: invokevirtual #557                // Method android/view/View.getWidth:()I
      62: aload_1
      63: invokevirtual #560                // Method android/view/View.getHeight:()I
      66: invokevirtual #563                // Method android/graphics/Rect.set:(IIII)V
      69: aload_0
      70: getfield      #169                // Field q:Landroid/support/v7/widget/RecyclerView;
      73: ifnull        162
      76: aload_1
      77: invokevirtual #567                // Method android/view/View.getMatrix:()Landroid/graphics/Matrix;
      80: astore        4
      82: aload         4
      84: ifnull        162
      87: aload         4
      89: invokevirtual #572                // Method android/graphics/Matrix.isIdentity:()Z
      92: ifne          162
      95: aload_0
      96: getfield      #169                // Field q:Landroid/support/v7/widget/RecyclerView;
      99: getfield      #575                // Field android/support/v7/widget/RecyclerView.k:Landroid/graphics/RectF;
     102: astore        5
     104: aload         5
     106: aload_3
     107: invokevirtual #580                // Method android/graphics/RectF.set:(Landroid/graphics/Rect;)V
     110: aload         4
     112: aload         5
     114: invokevirtual #584                // Method android/graphics/Matrix.mapRect:(Landroid/graphics/RectF;)Z
     117: pop
     118: aload_3
     119: aload         5
     121: getfield      #586                // Field android/graphics/RectF.left:F
     124: f2d
     125: invokestatic  #590                // Method java/lang/Math.floor:(D)D
     128: d2i
     129: aload         5
     131: getfield      #592                // Field android/graphics/RectF.top:F
     134: f2d
     135: invokestatic  #590                // Method java/lang/Math.floor:(D)D
     138: d2i
     139: aload         5
     141: getfield      #594                // Field android/graphics/RectF.right:F
     144: f2d
     145: invokestatic  #597                // Method java/lang/Math.ceil:(D)D
     148: d2i
     149: aload         5
     151: getfield      #599                // Field android/graphics/RectF.bottom:F
     154: f2d
     155: invokestatic  #597                // Method java/lang/Math.ceil:(D)D
     158: d2i
     159: invokevirtual #563                // Method android/graphics/Rect.set:(IIII)V
     162: aload_3
     163: aload_1
     164: invokevirtual #306                // Method android/view/View.getLeft:()I
     167: aload_1
     168: invokevirtual #317                // Method android/view/View.getTop:()I
     171: invokevirtual #602                // Method android/graphics/Rect.offset:(II)V
     174: return

  public void a(android.view.accessibility.AccessibilityEvent);
    Code:
       0: aload_0
       1: aload_0
       2: getfield      #169                // Field q:Landroid/support/v7/widget/RecyclerView;
       5: getfield      #430                // Field android/support/v7/widget/RecyclerView.d:Landroid/support/v7/widget/RecyclerView$p;
       8: aload_0
       9: getfield      #169                // Field q:Landroid/support/v7/widget/RecyclerView;
      12: getfield      #433                // Field android/support/v7/widget/RecyclerView.C:Landroid/support/v7/widget/RecyclerView$u;
      15: aload_1
      16: invokevirtual #605                // Method a:(Landroid/support/v7/widget/RecyclerView$p;Landroid/support/v7/widget/RecyclerView$u;Landroid/view/accessibility/AccessibilityEvent;)V
      19: return

  public void a(java.lang.String);
    Code:
       0: aload_0
       1: getfield      #169                // Field q:Landroid/support/v7/widget/RecyclerView;
       4: ifnull        15
       7: aload_0
       8: getfield      #169                // Field q:Landroid/support/v7/widget/RecyclerView;
      11: aload_1
      12: invokevirtual #607                // Method android/support/v7/widget/RecyclerView.a:(Ljava/lang/String;)V
      15: return

  boolean a(int, android.os.Bundle);
    Code:
       0: aload_0
       1: aload_0
       2: getfield      #169                // Field q:Landroid/support/v7/widget/RecyclerView;
       5: getfield      #430                // Field android/support/v7/widget/RecyclerView.d:Landroid/support/v7/widget/RecyclerView$p;
       8: aload_0
       9: getfield      #169                // Field q:Landroid/support/v7/widget/RecyclerView;
      12: getfield      #433                // Field android/support/v7/widget/RecyclerView.C:Landroid/support/v7/widget/RecyclerView$u;
      15: iload_1
      16: aload_2
      17: invokevirtual #611                // Method a:(Landroid/support/v7/widget/RecyclerView$p;Landroid/support/v7/widget/RecyclerView$u;ILandroid/os/Bundle;)Z
      20: ireturn

  public boolean a(android.support.v7.widget.RecyclerView$j);
    Code:
       0: aload_1
       1: ifnull        6
       4: iconst_1
       5: ireturn
       6: iconst_0
       7: ireturn

  public boolean a(android.support.v7.widget.RecyclerView$p, android.support.v7.widget.RecyclerView$u, int, android.os.Bundle);
    Code:
       0: aload_0
       1: getfield      #169                // Field q:Landroid/support/v7/widget/RecyclerView;
       4: ifnonnull     9
       7: iconst_0
       8: ireturn
       9: iload_3
      10: sipush        4096
      13: if_icmpeq     102
      16: iload_3
      17: sipush        8192
      20: if_icmpeq     31
      23: iconst_0
      24: istore_3
      25: iconst_0
      26: istore        6
      28: goto          168
      31: aload_0
      32: getfield      #169                // Field q:Landroid/support/v7/widget/RecyclerView;
      35: iconst_m1
      36: invokevirtual #446                // Method android/support/v7/widget/RecyclerView.canScrollVertically:(I)Z
      39: ifeq          62
      42: aload_0
      43: invokevirtual #300                // Method z:()I
      46: aload_0
      47: invokevirtual #292                // Method B:()I
      50: isub
      51: aload_0
      52: invokevirtual #303                // Method D:()I
      55: isub
      56: ineg
      57: istore        5
      59: goto          65
      62: iconst_0
      63: istore        5
      65: iload         5
      67: istore_3
      68: aload_0
      69: getfield      #169                // Field q:Landroid/support/v7/widget/RecyclerView;
      72: iconst_m1
      73: invokevirtual #449                // Method android/support/v7/widget/RecyclerView.canScrollHorizontally:(I)Z
      76: ifeq          25
      79: aload_0
      80: invokevirtual #294                // Method y:()I
      83: aload_0
      84: invokevirtual #289                // Method A:()I
      87: isub
      88: aload_0
      89: invokevirtual #297                // Method C:()I
      92: isub
      93: ineg
      94: istore        6
      96: iload         5
      98: istore_3
      99: goto          168
     102: aload_0
     103: getfield      #169                // Field q:Landroid/support/v7/widget/RecyclerView;
     106: iconst_1
     107: invokevirtual #446                // Method android/support/v7/widget/RecyclerView.canScrollVertically:(I)Z
     110: ifeq          132
     113: aload_0
     114: invokevirtual #300                // Method z:()I
     117: aload_0
     118: invokevirtual #292                // Method B:()I
     121: isub
     122: aload_0
     123: invokevirtual #303                // Method D:()I
     126: isub
     127: istore        5
     129: goto          135
     132: iconst_0
     133: istore        5
     135: iload         5
     137: istore_3
     138: aload_0
     139: getfield      #169                // Field q:Landroid/support/v7/widget/RecyclerView;
     142: iconst_1
     143: invokevirtual #449                // Method android/support/v7/widget/RecyclerView.canScrollHorizontally:(I)Z
     146: ifeq          25
     149: aload_0
     150: invokevirtual #294                // Method y:()I
     153: aload_0
     154: invokevirtual #289                // Method A:()I
     157: isub
     158: aload_0
     159: invokevirtual #297                // Method C:()I
     162: isub
     163: istore        6
     165: iload         5
     167: istore_3
     168: iload_3
     169: ifne          179
     172: iload         6
     174: ifne          179
     177: iconst_0
     178: ireturn
     179: aload_0
     180: getfield      #169                // Field q:Landroid/support/v7/widget/RecyclerView;
     183: iload         6
     185: iload_3
     186: invokevirtual #615                // Method android/support/v7/widget/RecyclerView.scrollBy:(II)V
     189: iconst_1
     190: ireturn

  public boolean a(android.support.v7.widget.RecyclerView$p, android.support.v7.widget.RecyclerView$u, android.view.View, int, android.os.Bundle);
    Code:
       0: iconst_0
       1: ireturn

  public boolean a(android.support.v7.widget.RecyclerView, android.support.v7.widget.RecyclerView$u, android.view.View, android.view.View);
    Code:
       0: aload_0
       1: aload_1
       2: aload_3
       3: aload         4
       5: invokevirtual #620                // Method a:(Landroid/support/v7/widget/RecyclerView;Landroid/view/View;Landroid/view/View;)Z
       8: ireturn

  public boolean a(android.support.v7.widget.RecyclerView, android.view.View, android.graphics.Rect, boolean);
    Code:
       0: aload_0
       1: aload_1
       2: aload_2
       3: aload_3
       4: iload         4
       6: iconst_0
       7: invokevirtual #624                // Method a:(Landroid/support/v7/widget/RecyclerView;Landroid/view/View;Landroid/graphics/Rect;ZZ)Z
      10: ireturn

  public boolean a(android.support.v7.widget.RecyclerView, android.view.View, android.graphics.Rect, boolean, boolean);
    Code:
       0: aload_0
       1: aload_1
       2: aload_2
       3: aload_3
       4: iload         4
       6: invokespecial #626                // Method b:(Landroid/support/v7/widget/RecyclerView;Landroid/view/View;Landroid/graphics/Rect;Z)[I
       9: astore_2
      10: aload_2
      11: iconst_0
      12: iaload
      13: istore        6
      15: aload_2
      16: iconst_1
      17: iaload
      18: istore        7
      20: iload         5
      22: ifeq          37
      25: aload_0
      26: aload_1
      27: iload         6
      29: iload         7
      31: invokespecial #628                // Method d:(Landroid/support/v7/widget/RecyclerView;II)Z
      34: ifeq          50
      37: iload         6
      39: ifne          52
      42: iload         7
      44: ifeq          50
      47: goto          52
      50: iconst_0
      51: ireturn
      52: iload         4
      54: ifeq          67
      57: aload_1
      58: iload         6
      60: iload         7
      62: invokevirtual #615                // Method android/support/v7/widget/RecyclerView.scrollBy:(II)V
      65: iconst_1
      66: ireturn
      67: aload_1
      68: iload         6
      70: iload         7
      72: invokevirtual #630                // Method android/support/v7/widget/RecyclerView.a:(II)V
      75: iconst_1
      76: ireturn

  public boolean a(android.support.v7.widget.RecyclerView, android.view.View, android.view.View);
    Code:
       0: aload_0
       1: invokevirtual #633                // Method s:()Z
       4: ifne          19
       7: aload_1
       8: invokevirtual #636                // Method android/support/v7/widget/RecyclerView.o:()Z
      11: ifeq          17
      14: goto          19
      17: iconst_0
      18: ireturn
      19: iconst_1
      20: ireturn

  public boolean a(android.support.v7.widget.RecyclerView, java.util.ArrayList<android.view.View>, int, int);
    Code:
       0: iconst_0
       1: ireturn

  boolean a(android.view.View, int, int, android.support.v7.widget.RecyclerView$j);
    Code:
       0: aload_0
       1: getfield      #69                 // Field c:Z
       4: ifeq          44
       7: aload_1
       8: invokevirtual #643                // Method android/view/View.getMeasuredWidth:()I
      11: iload_2
      12: aload         4
      14: getfield      #521                // Field android/support/v7/widget/RecyclerView$j.width:I
      17: invokestatic  #645                // Method b:(III)Z
      20: ifeq          44
      23: aload_1
      24: invokevirtual #648                // Method android/view/View.getMeasuredHeight:()I
      27: iload_3
      28: aload         4
      30: getfield      #532                // Field android/support/v7/widget/RecyclerView$j.height:I
      33: invokestatic  #645                // Method b:(III)Z
      36: ifne          42
      39: goto          44
      42: iconst_0
      43: ireturn
      44: iconst_1
      45: ireturn

  boolean a(android.view.View, int, android.os.Bundle);
    Code:
       0: aload_0
       1: aload_0
       2: getfield      #169                // Field q:Landroid/support/v7/widget/RecyclerView;
       5: getfield      #430                // Field android/support/v7/widget/RecyclerView.d:Landroid/support/v7/widget/RecyclerView$p;
       8: aload_0
       9: getfield      #169                // Field q:Landroid/support/v7/widget/RecyclerView;
      12: getfield      #433                // Field android/support/v7/widget/RecyclerView.C:Landroid/support/v7/widget/RecyclerView$u;
      15: aload_1
      16: iload_2
      17: aload_3
      18: invokevirtual #651                // Method a:(Landroid/support/v7/widget/RecyclerView$p;Landroid/support/v7/widget/RecyclerView$u;Landroid/view/View;ILandroid/os/Bundle;)Z
      21: ireturn

  public boolean a(android.view.View, boolean, boolean);
    Code:
       0: aload_0
       1: getfield      #59                 // Field r:Landroid/support/v7/widget/bv;
       4: aload_1
       5: sipush        24579
       8: invokevirtual #655                // Method android/support/v7/widget/bv.a:(Landroid/view/View;I)Z
      11: ifeq          33
      14: aload_0
      15: getfield      #61                 // Field s:Landroid/support/v7/widget/bv;
      18: aload_1
      19: sipush        24579
      22: invokevirtual #655                // Method android/support/v7/widget/bv.a:(Landroid/view/View;I)Z
      25: ifeq          33
      28: iconst_1
      29: istore_3
      30: goto          35
      33: iconst_0
      34: istore_3
      35: iload_2
      36: ifeq          41
      39: iload_3
      40: ireturn
      41: iload_3
      42: iconst_1
      43: ixor
      44: ireturn

  public boolean a(java.lang.Runnable);
    Code:
       0: aload_0
       1: getfield      #169                // Field q:Landroid/support/v7/widget/RecyclerView;
       4: ifnull        16
       7: aload_0
       8: getfield      #169                // Field q:Landroid/support/v7/widget/RecyclerView;
      11: aload_1
      12: invokevirtual #659                // Method android/support/v7/widget/RecyclerView.removeCallbacks:(Ljava/lang/Runnable;)Z
      15: ireturn
      16: iconst_0
      17: ireturn

  public int b(int, android.support.v7.widget.RecyclerView$p, android.support.v7.widget.RecyclerView$u);
    Code:
       0: iconst_0
       1: ireturn

  public int b(android.support.v7.widget.RecyclerView$p, android.support.v7.widget.RecyclerView$u);
    Code:
       0: aload_0
       1: getfield      #169                // Field q:Landroid/support/v7/widget/RecyclerView;
       4: astore_1
       5: iconst_1
       6: istore        4
       8: iload         4
      10: istore_3
      11: aload_1
      12: ifnull        48
      15: aload_0
      16: getfield      #169                // Field q:Landroid/support/v7/widget/RecyclerView;
      19: getfield      #173                // Field android/support/v7/widget/RecyclerView.l:Landroid/support/v7/widget/RecyclerView$a;
      22: ifnonnull     27
      25: iconst_1
      26: ireturn
      27: iload         4
      29: istore_3
      30: aload_0
      31: invokevirtual #478                // Method e:()Z
      34: ifeq          48
      37: aload_0
      38: getfield      #169                // Field q:Landroid/support/v7/widget/RecyclerView;
      41: getfield      #173                // Field android/support/v7/widget/RecyclerView.l:Landroid/support/v7/widget/RecyclerView$a;
      44: invokevirtual #393                // Method android/support/v7/widget/RecyclerView$a.a:()I
      47: istore_3
      48: iload_3
      49: ireturn

  void b(android.support.v7.widget.RecyclerView$p);
    Code:
       0: aload_1
       1: invokevirtual #661                // Method android/support/v7/widget/RecyclerView$p.e:()I
       4: istore_3
       5: iload_3
       6: iconst_1
       7: isub
       8: istore_2
       9: iload_2
      10: iflt          103
      13: aload_1
      14: iload_2
      15: invokevirtual #663                // Method android/support/v7/widget/RecyclerView$p.e:(I)Landroid/view/View;
      18: astore        4
      20: aload         4
      22: invokestatic  #157                // Method android/support/v7/widget/RecyclerView.e:(Landroid/view/View;)Landroid/support/v7/widget/RecyclerView$x;
      25: astore        5
      27: aload         5
      29: invokevirtual #162                // Method android/support/v7/widget/RecyclerView$x.c:()Z
      32: ifeq          38
      35: goto          96
      38: aload         5
      40: iconst_0
      41: invokevirtual #665                // Method android/support/v7/widget/RecyclerView$x.a:(Z)V
      44: aload         5
      46: invokevirtual #667                // Method android/support/v7/widget/RecyclerView$x.r:()Z
      49: ifeq          62
      52: aload_0
      53: getfield      #169                // Field q:Landroid/support/v7/widget/RecyclerView;
      56: aload         4
      58: iconst_0
      59: invokevirtual #671                // Method android/support/v7/widget/RecyclerView.removeDetachedView:(Landroid/view/View;Z)V
      62: aload_0
      63: getfield      #169                // Field q:Landroid/support/v7/widget/RecyclerView;
      66: getfield      #674                // Field android/support/v7/widget/RecyclerView.y:Landroid/support/v7/widget/RecyclerView$f;
      69: ifnull        84
      72: aload_0
      73: getfield      #169                // Field q:Landroid/support/v7/widget/RecyclerView;
      76: getfield      #674                // Field android/support/v7/widget/RecyclerView.y:Landroid/support/v7/widget/RecyclerView$f;
      79: aload         5
      81: invokevirtual #678                // Method android/support/v7/widget/RecyclerView$f.d:(Landroid/support/v7/widget/RecyclerView$x;)V
      84: aload         5
      86: iconst_1
      87: invokevirtual #665                // Method android/support/v7/widget/RecyclerView$x.a:(Z)V
      90: aload_1
      91: aload         4
      93: invokevirtual #679                // Method android/support/v7/widget/RecyclerView$p.b:(Landroid/view/View;)V
      96: iload_2
      97: iconst_1
      98: isub
      99: istore_2
     100: goto          9
     103: aload_1
     104: invokevirtual #681                // Method android/support/v7/widget/RecyclerView$p.f:()V
     107: iload_3
     108: ifle          118
     111: aload_0
     112: getfield      #169                // Field q:Landroid/support/v7/widget/RecyclerView;
     115: invokevirtual #682                // Method android/support/v7/widget/RecyclerView.invalidate:()V
     118: return

  void b(android.support.v7.widget.RecyclerView);
    Code:
       0: aload_1
       1: ifnonnull     29
       4: aload_0
       5: aconst_null
       6: putfield      #169                // Field q:Landroid/support/v7/widget/RecyclerView;
       9: aload_0
      10: aconst_null
      11: putfield      #144                // Field p:Landroid/support/v7/widget/aj;
      14: iconst_0
      15: istore_2
      16: aload_0
      17: iconst_0
      18: putfield      #684                // Field g:I
      21: aload_0
      22: iload_2
      23: putfield      #686                // Field h:I
      26: goto          58
      29: aload_0
      30: aload_1
      31: putfield      #169                // Field q:Landroid/support/v7/widget/RecyclerView;
      34: aload_0
      35: aload_1
      36: getfield      #688                // Field android/support/v7/widget/RecyclerView.f:Landroid/support/v7/widget/aj;
      39: putfield      #144                // Field p:Landroid/support/v7/widget/aj;
      42: aload_0
      43: aload_1
      44: invokevirtual #689                // Method android/support/v7/widget/RecyclerView.getWidth:()I
      47: putfield      #684                // Field g:I
      50: aload_1
      51: invokevirtual #690                // Method android/support/v7/widget/RecyclerView.getHeight:()I
      54: istore_2
      55: goto          21
      58: aload_0
      59: ldc           #84                 // int 1073741824
      61: putfield      #692                // Field e:I
      64: aload_0
      65: ldc           #84                 // int 1073741824
      67: putfield      #694                // Field f:I
      70: return

  public void b(android.support.v7.widget.RecyclerView, int, int);
    Code:
       0: return

  void b(android.support.v7.widget.RecyclerView, android.support.v7.widget.RecyclerView$p);
    Code:
       0: aload_0
       1: iconst_0
       2: putfield      #65                 // Field v:Z
       5: aload_0
       6: aload_1
       7: aload_2
       8: invokevirtual #696                // Method a:(Landroid/support/v7/widget/RecyclerView;Landroid/support/v7/widget/RecyclerView$p;)V
      11: return

  public void b(android.view.View);
    Code:
       0: aload_0
       1: aload_1
       2: iconst_m1
       3: invokevirtual #698                // Method b:(Landroid/view/View;I)V
       6: return

  public void b(android.view.View, int);
    Code:
       0: aload_0
       1: aload_1
       2: iload_2
       3: iconst_0
       4: invokespecial #508                // Method a:(Landroid/view/View;IZ)V
       7: return

  public void b(android.view.View, android.graphics.Rect);
    Code:
       0: aload_0
       1: getfield      #169                // Field q:Landroid/support/v7/widget/RecyclerView;
       4: ifnonnull     16
       7: aload_2
       8: iconst_0
       9: iconst_0
      10: iconst_0
      11: iconst_0
      12: invokevirtual #563                // Method android/graphics/Rect.set:(IIII)V
      15: return
      16: aload_2
      17: aload_0
      18: getfield      #169                // Field q:Landroid/support/v7/widget/RecyclerView;
      21: aload_1
      22: invokevirtual #512                // Method android/support/v7/widget/RecyclerView.k:(Landroid/view/View;)Landroid/graphics/Rect;
      25: invokevirtual #699                // Method android/graphics/Rect.set:(Landroid/graphics/Rect;)V
      28: return

  public boolean b();
    Code:
       0: iconst_0
       1: ireturn

  boolean b(android.view.View, int, int, android.support.v7.widget.RecyclerView$j);
    Code:
       0: aload_1
       1: invokevirtual #702                // Method android/view/View.isLayoutRequested:()Z
       4: ifne          51
       7: aload_0
       8: getfield      #69                 // Field c:Z
      11: ifeq          51
      14: aload_1
      15: invokevirtual #557                // Method android/view/View.getWidth:()I
      18: iload_2
      19: aload         4
      21: getfield      #521                // Field android/support/v7/widget/RecyclerView$j.width:I
      24: invokestatic  #645                // Method b:(III)Z
      27: ifeq          51
      30: aload_1
      31: invokevirtual #560                // Method android/view/View.getHeight:()I
      34: iload_3
      35: aload         4
      37: getfield      #532                // Field android/support/v7/widget/RecyclerView$j.height:I
      40: invokestatic  #645                // Method b:(III)Z
      43: ifne          49
      46: goto          51
      49: iconst_0
      50: ireturn
      51: iconst_1
      52: ireturn

  public int c(android.support.v7.widget.RecyclerView$u);
    Code:
       0: iconst_0
       1: ireturn

  public android.view.View c(int);
    Code:
       0: aload_0
       1: invokevirtual #378                // Method v:()I
       4: istore_3
       5: iconst_0
       6: istore_2
       7: iload_2
       8: iload_3
       9: if_icmpge     82
      12: aload_0
      13: iload_2
      14: invokevirtual #381                // Method h:(I)Landroid/view/View;
      17: astore        4
      19: aload         4
      21: invokestatic  #157                // Method android/support/v7/widget/RecyclerView.e:(Landroid/view/View;)Landroid/support/v7/widget/RecyclerView$x;
      24: astore        5
      26: aload         5
      28: ifnonnull     34
      31: goto          75
      34: aload         5
      36: invokevirtual #705                // Method android/support/v7/widget/RecyclerView$x.d:()I
      39: iload_1
      40: if_icmpne     75
      43: aload         5
      45: invokevirtual #162                // Method android/support/v7/widget/RecyclerView$x.c:()Z
      48: ifne          75
      51: aload_0
      52: getfield      #169                // Field q:Landroid/support/v7/widget/RecyclerView;
      55: getfield      #433                // Field android/support/v7/widget/RecyclerView.C:Landroid/support/v7/widget/RecyclerView$u;
      58: invokevirtual #709                // Method android/support/v7/widget/RecyclerView$u.a:()Z
      61: ifne          72
      64: aload         5
      66: invokevirtual #167                // Method android/support/v7/widget/RecyclerView$x.q:()Z
      69: ifne          75
      72: aload         4
      74: areturn
      75: iload_2
      76: iconst_1
      77: iadd
      78: istore_2
      79: goto          7
      82: aconst_null
      83: areturn

  void c(int, int);
    Code:
       0: aload_0
       1: iload_1
       2: invokestatic  #82                 // Method android/view/View$MeasureSpec.getSize:(I)I
       5: putfield      #684                // Field g:I
       8: aload_0
       9: iload_1
      10: invokestatic  #79                 // Method android/view/View$MeasureSpec.getMode:(I)I
      13: putfield      #692                // Field e:I
      16: aload_0
      17: getfield      #692                // Field e:I
      20: ifne          34
      23: getstatic     #711                // Field android/support/v7/widget/RecyclerView.b:Z
      26: ifne          34
      29: aload_0
      30: iconst_0
      31: putfield      #684                // Field g:I
      34: aload_0
      35: iload_2
      36: invokestatic  #82                 // Method android/view/View$MeasureSpec.getSize:(I)I
      39: putfield      #686                // Field h:I
      42: aload_0
      43: iload_2
      44: invokestatic  #79                 // Method android/view/View$MeasureSpec.getMode:(I)I
      47: putfield      #694                // Field f:I
      50: aload_0
      51: getfield      #694                // Field f:I
      54: ifne          68
      57: getstatic     #711                // Field android/support/v7/widget/RecyclerView.b:Z
      60: ifne          68
      63: aload_0
      64: iconst_0
      65: putfield      #686                // Field h:I
      68: return

  public void c(android.support.v7.widget.RecyclerView$p);
    Code:
       0: aload_0
       1: invokevirtual #378                // Method v:()I
       4: iconst_1
       5: isub
       6: istore_2
       7: iload_2
       8: iflt          38
      11: aload_0
      12: iload_2
      13: invokevirtual #381                // Method h:(I)Landroid/view/View;
      16: invokestatic  #157                // Method android/support/v7/widget/RecyclerView.e:(Landroid/view/View;)Landroid/support/v7/widget/RecyclerView$x;
      19: invokevirtual #162                // Method android/support/v7/widget/RecyclerView$x.c:()Z
      22: ifne          31
      25: aload_0
      26: iload_2
      27: aload_1
      28: invokevirtual #713                // Method a:(ILandroid/support/v7/widget/RecyclerView$p;)V
      31: iload_2
      32: iconst_1
      33: isub
      34: istore_2
      35: goto          7
      38: return

  public void c(android.support.v7.widget.RecyclerView$p, android.support.v7.widget.RecyclerView$u);
    Code:
       0: ldc_w         #715                // String RecyclerView
       3: ldc_w         #717                // String You must override onLayoutChildren(Recycler recycler, State state)
       6: invokestatic  #722                // Method android/util/Log.e:(Ljava/lang/String;Ljava/lang/String;)I
       9: pop
      10: return

  void c(android.support.v7.widget.RecyclerView);
    Code:
       0: aload_0
       1: iconst_1
       2: putfield      #65                 // Field v:Z
       5: aload_0
       6: aload_1
       7: invokevirtual #724                // Method d:(Landroid/support/v7/widget/RecyclerView;)V
      10: return

  public void c(android.support.v7.widget.RecyclerView, int, int);
    Code:
       0: return

  public void c(android.view.View);
    Code:
       0: aload_0
       1: getfield      #144                // Field p:Landroid/support/v7/widget/aj;
       4: aload_1
       5: invokevirtual #725                // Method android/support/v7/widget/aj.a:(Landroid/view/View;)V
       8: return

  public void c(android.view.View, int);
    Code:
       0: aload_0
       1: aload_1
       2: iload_2
       3: aload_1
       4: invokevirtual #209                // Method android/view/View.getLayoutParams:()Landroid/view/ViewGroup$LayoutParams;
       7: checkcast     #211                // class android/support/v7/widget/RecyclerView$j
      10: invokevirtual #727                // Method a:(Landroid/view/View;ILandroid/support/v7/widget/RecyclerView$j;)V
      13: return

  public boolean c();
    Code:
       0: aload_0
       1: getfield      #67                 // Field w:Z
       4: ireturn

  public int d(android.support.v7.widget.RecyclerView$p, android.support.v7.widget.RecyclerView$u);
    Code:
       0: iconst_0
       1: ireturn

  public int d(android.support.v7.widget.RecyclerView$u);
    Code:
       0: iconst_0
       1: ireturn

  public int d(android.view.View);
    Code:
       0: aload_1
       1: invokevirtual #209                // Method android/view/View.getLayoutParams:()Landroid/view/ViewGroup$LayoutParams;
       4: checkcast     #211                // class android/support/v7/widget/RecyclerView$j
       7: invokevirtual #729                // Method android/support/v7/widget/RecyclerView$j.f:()I
      10: ireturn

  public android.os.Parcelable d();
    Code:
       0: aconst_null
       1: areturn

  public android.view.View d(android.view.View, int);
    Code:
       0: aconst_null
       1: areturn

  public void d(int);
    Code:
       0: return

  void d(int, int);
    Code:
       0: aload_0
       1: invokevirtual #378                // Method v:()I
       4: istore        11
       6: iload         11
       8: ifne          21
      11: aload_0
      12: getfield      #169                // Field q:Landroid/support/v7/widget/RecyclerView;
      15: iload_1
      16: iload_2
      17: invokevirtual #442                // Method android/support/v7/widget/RecyclerView.e:(II)V
      20: return
      21: iconst_0
      22: istore        4
      24: ldc_w         #732                // int 2147483647
      27: istore        9
      29: ldc_w         #732                // int 2147483647
      32: istore        6
      34: ldc           #83                 // int -2147483648
      36: istore        7
      38: ldc           #83                 // int -2147483648
      40: istore_3
      41: iload         4
      43: iload         11
      45: if_icmpge     179
      48: aload_0
      49: iload         4
      51: invokevirtual #381                // Method h:(I)Landroid/view/View;
      54: astore        12
      56: aload_0
      57: getfield      #169                // Field q:Landroid/support/v7/widget/RecyclerView;
      60: getfield      #339                // Field android/support/v7/widget/RecyclerView.j:Landroid/graphics/Rect;
      63: astore        13
      65: aload_0
      66: aload         12
      68: aload         13
      70: invokevirtual #342                // Method a:(Landroid/view/View;Landroid/graphics/Rect;)V
      73: iload         9
      75: istore        5
      77: aload         13
      79: getfield      #311                // Field android/graphics/Rect.left:I
      82: iload         9
      84: if_icmpge     94
      87: aload         13
      89: getfield      #311                // Field android/graphics/Rect.left:I
      92: istore        5
      94: iload         7
      96: istore        8
      98: aload         13
     100: getfield      #345                // Field android/graphics/Rect.right:I
     103: iload         7
     105: if_icmple     115
     108: aload         13
     110: getfield      #345                // Field android/graphics/Rect.right:I
     113: istore        8
     115: iload         6
     117: istore        7
     119: aload         13
     121: getfield      #320                // Field android/graphics/Rect.top:I
     124: iload         6
     126: if_icmpge     136
     129: aload         13
     131: getfield      #320                // Field android/graphics/Rect.top:I
     134: istore        7
     136: iload_3
     137: istore        10
     139: aload         13
     141: getfield      #348                // Field android/graphics/Rect.bottom:I
     144: iload_3
     145: if_icmple     155
     148: aload         13
     150: getfield      #348                // Field android/graphics/Rect.bottom:I
     153: istore        10
     155: iload         4
     157: iconst_1
     158: iadd
     159: istore        4
     161: iload         7
     163: istore        6
     165: iload         5
     167: istore        9
     169: iload         8
     171: istore        7
     173: iload         10
     175: istore_3
     176: goto          41
     179: aload_0
     180: getfield      #169                // Field q:Landroid/support/v7/widget/RecyclerView;
     183: getfield      #339                // Field android/support/v7/widget/RecyclerView.j:Landroid/graphics/Rect;
     186: iload         9
     188: iload         6
     190: iload         7
     192: iload_3
     193: invokevirtual #563                // Method android/graphics/Rect.set:(IIII)V
     196: aload_0
     197: aload_0
     198: getfield      #169                // Field q:Landroid/support/v7/widget/RecyclerView;
     201: getfield      #339                // Field android/support/v7/widget/RecyclerView.j:Landroid/graphics/Rect;
     204: iload_1
     205: iload_2
     206: invokevirtual #734                // Method a:(Landroid/graphics/Rect;II)V
     209: return

  public void d(android.support.v7.widget.RecyclerView);
    Code:
       0: return

  public int e(android.support.v7.widget.RecyclerView$u);
    Code:
       0: iconst_0
       1: ireturn

  public android.view.View e(android.view.View);
    Code:
       0: aload_0
       1: getfield      #169                // Field q:Landroid/support/v7/widget/RecyclerView;
       4: ifnonnull     9
       7: aconst_null
       8: areturn
       9: aload_0
      10: getfield      #169                // Field q:Landroid/support/v7/widget/RecyclerView;
      13: aload_1
      14: invokevirtual #737                // Method android/support/v7/widget/RecyclerView.c:(Landroid/view/View;)Landroid/view/View;
      17: astore_1
      18: aload_1
      19: ifnonnull     24
      22: aconst_null
      23: areturn
      24: aload_0
      25: getfield      #144                // Field p:Landroid/support/v7/widget/aj;
      28: aload_1
      29: invokevirtual #364                // Method android/support/v7/widget/aj.c:(Landroid/view/View;)Z
      32: ifeq          37
      35: aconst_null
      36: areturn
      37: aload_1
      38: areturn

  public void e(int, int);
    Code:
       0: aload_0
       1: iload_1
       2: invokevirtual #381                // Method h:(I)Landroid/view/View;
       5: astore_3
       6: aload_3
       7: ifnonnull     56
      10: new           #228                // class java/lang/StringBuilder
      13: dup
      14: invokespecial #229                // Method java/lang/StringBuilder."<init>":()V
      17: astore_3
      18: aload_3
      19: ldc_w         #739                // String Cannot move a child from non-existing index:
      22: invokevirtual #235                // Method java/lang/StringBuilder.append:(Ljava/lang/String;)Ljava/lang/StringBuilder;
      25: pop
      26: aload_3
      27: iload_1
      28: invokevirtual #241                // Method java/lang/StringBuilder.append:(I)Ljava/lang/StringBuilder;
      31: pop
      32: aload_3
      33: aload_0
      34: getfield      #169                // Field q:Landroid/support/v7/widget/RecyclerView;
      37: invokevirtual #740                // Method android/support/v7/widget/RecyclerView.toString:()Ljava/lang/String;
      40: invokevirtual #235                // Method java/lang/StringBuilder.append:(Ljava/lang/String;)Ljava/lang/StringBuilder;
      43: pop
      44: new           #742                // class java/lang/IllegalArgumentException
      47: dup
      48: aload_3
      49: invokevirtual #249                // Method java/lang/StringBuilder.toString:()Ljava/lang/String;
      52: invokespecial #743                // Method java/lang/IllegalArgumentException."<init>":(Ljava/lang/String;)V
      55: athrow
      56: aload_0
      57: iload_1
      58: invokevirtual #186                // Method g:(I)V
      61: aload_0
      62: aload_3
      63: iload_2
      64: invokevirtual #745                // Method c:(Landroid/view/View;I)V
      67: return

  public void e(android.support.v7.widget.RecyclerView);
    Code:
       0: return

  public boolean e();
    Code:
       0: iconst_0
       1: ireturn

  public boolean e(android.support.v7.widget.RecyclerView$p, android.support.v7.widget.RecyclerView$u);
    Code:
       0: iconst_0
       1: ireturn

  public int f(android.support.v7.widget.RecyclerView$u);
    Code:
       0: iconst_0
       1: ireturn

  public int f(android.view.View);
    Code:
       0: aload_1
       1: invokevirtual #209                // Method android/view/View.getLayoutParams:()Landroid/view/ViewGroup$LayoutParams;
       4: checkcast     #211                // class android/support/v7/widget/RecyclerView$j
       7: getfield      #541                // Field android/support/v7/widget/RecyclerView$j.d:Landroid/graphics/Rect;
      10: astore_2
      11: aload_1
      12: invokevirtual #643                // Method android/view/View.getMeasuredWidth:()I
      15: aload_2
      16: getfield      #311                // Field android/graphics/Rect.left:I
      19: iadd
      20: aload_2
      21: getfield      #345                // Field android/graphics/Rect.right:I
      24: iadd
      25: ireturn

  public void f(int);
    Code:
       0: aload_0
       1: iload_1
       2: invokevirtual #381                // Method h:(I)Landroid/view/View;
       5: ifnull        16
       8: aload_0
       9: getfield      #144                // Field p:Landroid/support/v7/widget/aj;
      12: iload_1
      13: invokevirtual #746                // Method android/support/v7/widget/aj.a:(I)V
      16: return

  public void f(int, int);
    Code:
       0: aload_0
       1: getfield      #169                // Field q:Landroid/support/v7/widget/RecyclerView;
       4: iload_1
       5: iload_2
       6: invokestatic  #748                // Method android/support/v7/widget/RecyclerView.a:(Landroid/support/v7/widget/RecyclerView;II)V
       9: return

  void f(android.support.v7.widget.RecyclerView);
    Code:
       0: aload_0
       1: aload_1
       2: invokevirtual #689                // Method android/support/v7/widget/RecyclerView.getWidth:()I
       5: ldc           #84                 // int 1073741824
       7: invokestatic  #97                 // Method android/view/View$MeasureSpec.makeMeasureSpec:(II)I
      10: aload_1
      11: invokevirtual #690                // Method android/support/v7/widget/RecyclerView.getHeight:()I
      14: ldc           #84                 // int 1073741824
      16: invokestatic  #97                 // Method android/view/View$MeasureSpec.makeMeasureSpec:(II)I
      19: invokevirtual #750                // Method c:(II)V
      22: return

  public boolean f();
    Code:
       0: iconst_0
       1: ireturn

  public int g(android.support.v7.widget.RecyclerView$u);
    Code:
       0: iconst_0
       1: ireturn

  public int g(android.view.View);
    Code:
       0: aload_1
       1: invokevirtual #209                // Method android/view/View.getLayoutParams:()Landroid/view/ViewGroup$LayoutParams;
       4: checkcast     #211                // class android/support/v7/widget/RecyclerView$j
       7: getfield      #541                // Field android/support/v7/widget/RecyclerView$j.d:Landroid/graphics/Rect;
      10: astore_2
      11: aload_1
      12: invokevirtual #648                // Method android/view/View.getMeasuredHeight:()I
      15: aload_2
      16: getfield      #320                // Field android/graphics/Rect.top:I
      19: iadd
      20: aload_2
      21: getfield      #348                // Field android/graphics/Rect.bottom:I
      24: iadd
      25: ireturn

  public void g(int);
    Code:
       0: aload_0
       1: iload_1
       2: aload_0
       3: iload_1
       4: invokevirtual #381                // Method h:(I)Landroid/view/View;
       7: invokespecial #752                // Method a:(ILandroid/view/View;)V
      10: return

  public int h(android.support.v7.widget.RecyclerView$u);
    Code:
       0: iconst_0
       1: ireturn

  public int h(android.view.View);
    Code:
       0: aload_1
       1: invokevirtual #306                // Method android/view/View.getLeft:()I
       4: aload_0
       5: aload_1
       6: invokevirtual #754                // Method n:(Landroid/view/View;)I
       9: isub
      10: ireturn

  public android.view.View h(int);
    Code:
       0: aload_0
       1: getfield      #144                // Field p:Landroid/support/v7/widget/aj;
       4: ifnull        16
       7: aload_0
       8: getfield      #144                // Field p:Landroid/support/v7/widget/aj;
      11: iload_1
      12: invokevirtual #756                // Method android/support/v7/widget/aj.b:(I)Landroid/view/View;
      15: areturn
      16: aconst_null
      17: areturn

  public int i(android.view.View);
    Code:
       0: aload_1
       1: invokevirtual #317                // Method android/view/View.getTop:()I
       4: aload_0
       5: aload_1
       6: invokevirtual #758                // Method l:(Landroid/view/View;)I
       9: isub
      10: ireturn

  public void i(int);
    Code:
       0: aload_0
       1: getfield      #169                // Field q:Landroid/support/v7/widget/RecyclerView;
       4: ifnull        15
       7: aload_0
       8: getfield      #169                // Field q:Landroid/support/v7/widget/RecyclerView;
      11: iload_1
      12: invokevirtual #760                // Method android/support/v7/widget/RecyclerView.d:(I)V
      15: return

  public int j(android.view.View);
    Code:
       0: aload_1
       1: invokevirtual #763                // Method android/view/View.getRight:()I
       4: aload_0
       5: aload_1
       6: invokevirtual #765                // Method o:(Landroid/view/View;)I
       9: iadd
      10: ireturn

  public void j(int);
    Code:
       0: aload_0
       1: getfield      #169                // Field q:Landroid/support/v7/widget/RecyclerView;
       4: ifnull        15
       7: aload_0
       8: getfield      #169                // Field q:Landroid/support/v7/widget/RecyclerView;
      11: iload_1
      12: invokevirtual #767                // Method android/support/v7/widget/RecyclerView.c:(I)V
      15: return

  public int k(android.view.View);
    Code:
       0: aload_1
       1: invokevirtual #770                // Method android/view/View.getBottom:()I
       4: aload_0
       5: aload_1
       6: invokevirtual #772                // Method m:(Landroid/view/View;)I
       9: iadd
      10: ireturn

  public void k(int);
    Code:
       0: return

  public int l(android.view.View);
    Code:
       0: aload_1
       1: invokevirtual #209                // Method android/view/View.getLayoutParams:()Landroid/view/ViewGroup$LayoutParams;
       4: checkcast     #211                // class android/support/v7/widget/RecyclerView$j
       7: getfield      #541                // Field android/support/v7/widget/RecyclerView$j.d:Landroid/graphics/Rect;
      10: getfield      #320                // Field android/graphics/Rect.top:I
      13: ireturn

  boolean l();
    Code:
       0: iconst_0
       1: ireturn

  public int m(android.view.View);
    Code:
       0: aload_1
       1: invokevirtual #209                // Method android/view/View.getLayoutParams:()Landroid/view/ViewGroup$LayoutParams;
       4: checkcast     #211                // class android/support/v7/widget/RecyclerView$j
       7: getfield      #541                // Field android/support/v7/widget/RecyclerView$j.d:Landroid/graphics/Rect;
      10: getfield      #348                // Field android/graphics/Rect.bottom:I
      13: ireturn

  public int n(android.view.View);
    Code:
       0: aload_1
       1: invokevirtual #209                // Method android/view/View.getLayoutParams:()Landroid/view/ViewGroup$LayoutParams;
       4: checkcast     #211                // class android/support/v7/widget/RecyclerView$j
       7: getfield      #541                // Field android/support/v7/widget/RecyclerView$j.d:Landroid/graphics/Rect;
      10: getfield      #311                // Field android/graphics/Rect.left:I
      13: ireturn

  public int o(android.view.View);
    Code:
       0: aload_1
       1: invokevirtual #209                // Method android/view/View.getLayoutParams:()Landroid/view/ViewGroup$LayoutParams;
       4: checkcast     #211                // class android/support/v7/widget/RecyclerView$j
       7: getfield      #541                // Field android/support/v7/widget/RecyclerView$j.d:Landroid/graphics/Rect;
      10: getfield      #345                // Field android/graphics/Rect.right:I
      13: ireturn

  public void o();
    Code:
       0: aload_0
       1: getfield      #169                // Field q:Landroid/support/v7/widget/RecyclerView;
       4: ifnull        14
       7: aload_0
       8: getfield      #169                // Field q:Landroid/support/v7/widget/RecyclerView;
      11: invokevirtual #775                // Method android/support/v7/widget/RecyclerView.requestLayout:()V
      14: return

  public final boolean p();
    Code:
       0: aload_0
       1: getfield      #71                 // Field d:Z
       4: ireturn

  public boolean q();
    Code:
       0: aload_0
       1: getfield      #65                 // Field v:Z
       4: ireturn

  public boolean r();
    Code:
       0: aload_0
       1: getfield      #169                // Field q:Landroid/support/v7/widget/RecyclerView;
       4: ifnull        19
       7: aload_0
       8: getfield      #169                // Field q:Landroid/support/v7/widget/RecyclerView;
      11: getfield      #777                // Field android/support/v7/widget/RecyclerView.h:Z
      14: ifeq          19
      17: iconst_1
      18: ireturn
      19: iconst_0
      20: ireturn

  public boolean s();
    Code:
       0: aload_0
       1: getfield      #198                // Field t:Landroid/support/v7/widget/RecyclerView$t;
       4: ifnull        19
       7: aload_0
       8: getfield      #198                // Field t:Landroid/support/v7/widget/RecyclerView$t;
      11: invokevirtual #266                // Method android/support/v7/widget/RecyclerView$t.c:()Z
      14: ifeq          19
      17: iconst_1
      18: ireturn
      19: iconst_0
      20: ireturn

  public int t();
    Code:
       0: aload_0
       1: getfield      #169                // Field q:Landroid/support/v7/widget/RecyclerView;
       4: invokestatic  #779                // Method android/support/v4/view/s.e:(Landroid/view/View;)I
       7: ireturn

  public int u();
    Code:
       0: iconst_m1
       1: ireturn

  public int v();
    Code:
       0: aload_0
       1: getfield      #144                // Field p:Landroid/support/v7/widget/aj;
       4: ifnull        15
       7: aload_0
       8: getfield      #144                // Field p:Landroid/support/v7/widget/aj;
      11: invokevirtual #226                // Method android/support/v7/widget/aj.b:()I
      14: ireturn
      15: iconst_0
      16: ireturn

  public int w();
    Code:
       0: aload_0
       1: getfield      #692                // Field e:I
       4: ireturn

  public int x();
    Code:
       0: aload_0
       1: getfield      #694                // Field f:I
       4: ireturn

  public int y();
    Code:
       0: aload_0
       1: getfield      #684                // Field g:I
       4: ireturn

  public int z();
    Code:
       0: aload_0
       1: getfield      #686                // Field h:I
       4: ireturn
}
