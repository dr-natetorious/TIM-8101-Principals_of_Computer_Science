class android.support.v7.widget.aq extends android.support.v7.widget.RecyclerView$h implements android.support.v7.widget.RecyclerView$m {
  int a;

  int b;

  float c;

  int d;

  int e;

  float f;

  static {};
    Code:
       0: iconst_1
       1: newarray       int
       3: dup
       4: iconst_0
       5: ldc           #58                 // int 16842919
       7: iastore
       8: putstatic     #60                 // Field g:[I
      11: iconst_0
      12: newarray       int
      14: putstatic     #62                 // Field h:[I
      17: return

  android.support.v7.widget.aq(android.support.v7.widget.RecyclerView, android.graphics.drawable.StateListDrawable, android.graphics.drawable.Drawable, android.graphics.drawable.StateListDrawable, android.graphics.drawable.Drawable, int, int, int);
    Code:
       0: aload_0
       1: invokespecial #67                 // Method android/support/v7/widget/RecyclerView$h."<init>":()V
       4: aload_0
       5: iconst_0
       6: putfield      #69                 // Field s:I
       9: aload_0
      10: iconst_0
      11: putfield      #71                 // Field t:I
      14: aload_0
      15: iconst_0
      16: putfield      #73                 // Field v:Z
      19: aload_0
      20: iconst_0
      21: putfield      #75                 // Field w:Z
      24: aload_0
      25: iconst_0
      26: putfield      #77                 // Field x:I
      29: aload_0
      30: iconst_0
      31: putfield      #79                 // Field y:I
      34: aload_0
      35: iconst_2
      36: newarray       int
      38: putfield      #81                 // Field z:[I
      41: aload_0
      42: iconst_2
      43: newarray       int
      45: putfield      #83                 // Field A:[I
      48: aload_0
      49: iconst_2
      50: newarray       float
      52: dup
      53: iconst_0
      54: fconst_0
      55: fastore
      56: dup
      57: iconst_1
      58: fconst_1
      59: fastore
      60: invokestatic  #89                 // Method android/animation/ValueAnimator.ofFloat:([F)Landroid/animation/ValueAnimator;
      63: putfield      #91                 // Field B:Landroid/animation/ValueAnimator;
      66: aload_0
      67: iconst_0
      68: putfield      #93                 // Field C:I
      71: aload_0
      72: new           #8                  // class android/support/v7/widget/aq$1
      75: dup
      76: aload_0
      77: invokespecial #96                 // Method android/support/v7/widget/aq$1."<init>":(Landroid/support/v7/widget/aq;)V
      80: putfield      #98                 // Field D:Ljava/lang/Runnable;
      83: aload_0
      84: new           #10                 // class android/support/v7/widget/aq$2
      87: dup
      88: aload_0
      89: invokespecial #99                 // Method android/support/v7/widget/aq$2."<init>":(Landroid/support/v7/widget/aq;)V
      92: putfield      #101                // Field E:Landroid/support/v7/widget/RecyclerView$n;
      95: aload_0
      96: aload_2
      97: putfield      #103                // Field k:Landroid/graphics/drawable/StateListDrawable;
     100: aload_0
     101: aload_3
     102: putfield      #105                // Field l:Landroid/graphics/drawable/Drawable;
     105: aload_0
     106: aload         4
     108: putfield      #107                // Field o:Landroid/graphics/drawable/StateListDrawable;
     111: aload_0
     112: aload         5
     114: putfield      #109                // Field p:Landroid/graphics/drawable/Drawable;
     117: aload_0
     118: iload         6
     120: aload_2
     121: invokevirtual #115                // Method android/graphics/drawable/StateListDrawable.getIntrinsicWidth:()I
     124: invokestatic  #121                // Method java/lang/Math.max:(II)I
     127: putfield      #123                // Field m:I
     130: aload_0
     131: iload         6
     133: aload_3
     134: invokevirtual #126                // Method android/graphics/drawable/Drawable.getIntrinsicWidth:()I
     137: invokestatic  #121                // Method java/lang/Math.max:(II)I
     140: putfield      #128                // Field n:I
     143: aload_0
     144: iload         6
     146: aload         4
     148: invokevirtual #115                // Method android/graphics/drawable/StateListDrawable.getIntrinsicWidth:()I
     151: invokestatic  #121                // Method java/lang/Math.max:(II)I
     154: putfield      #130                // Field q:I
     157: aload_0
     158: iload         6
     160: aload         5
     162: invokevirtual #126                // Method android/graphics/drawable/Drawable.getIntrinsicWidth:()I
     165: invokestatic  #121                // Method java/lang/Math.max:(II)I
     168: putfield      #132                // Field r:I
     171: aload_0
     172: iload         7
     174: putfield      #134                // Field i:I
     177: aload_0
     178: iload         8
     180: putfield      #136                // Field j:I
     183: aload_0
     184: getfield      #103                // Field k:Landroid/graphics/drawable/StateListDrawable;
     187: sipush        255
     190: invokevirtual #140                // Method android/graphics/drawable/StateListDrawable.setAlpha:(I)V
     193: aload_0
     194: getfield      #105                // Field l:Landroid/graphics/drawable/Drawable;
     197: sipush        255
     200: invokevirtual #141                // Method android/graphics/drawable/Drawable.setAlpha:(I)V
     203: aload_0
     204: getfield      #91                 // Field B:Landroid/animation/ValueAnimator;
     207: new           #12                 // class android/support/v7/widget/aq$a
     210: dup
     211: aload_0
     212: aconst_null
     213: invokespecial #144                // Method android/support/v7/widget/aq$a."<init>":(Landroid/support/v7/widget/aq;Landroid/support/v7/widget/aq$1;)V
     216: invokevirtual #148                // Method android/animation/ValueAnimator.addListener:(Landroid/animation/Animator$AnimatorListener;)V
     219: aload_0
     220: getfield      #91                 // Field B:Landroid/animation/ValueAnimator;
     223: new           #15                 // class android/support/v7/widget/aq$b
     226: dup
     227: aload_0
     228: aconst_null
     229: invokespecial #149                // Method android/support/v7/widget/aq$b."<init>":(Landroid/support/v7/widget/aq;Landroid/support/v7/widget/aq$1;)V
     232: invokevirtual #153                // Method android/animation/ValueAnimator.addUpdateListener:(Landroid/animation/ValueAnimator$AnimatorUpdateListener;)V
     235: aload_0
     236: aload_1
     237: invokevirtual #156                // Method a:(Landroid/support/v7/widget/RecyclerView;)V
     240: return

  static int a(android.support.v7.widget.aq, int);
    Code:
       0: aload_0
       1: iload_1
       2: putfield      #93                 // Field C:I
       5: iload_1
       6: ireturn

  static android.animation.ValueAnimator a(android.support.v7.widget.aq);
    Code:
       0: aload_0
       1: getfield      #91                 // Field B:Landroid/animation/ValueAnimator;
       4: areturn

  static void b(android.support.v7.widget.aq);
    Code:
       0: aload_0
       1: invokespecial #247                // Method d:()V
       4: return

  static void b(android.support.v7.widget.aq, int);
    Code:
       0: aload_0
       1: iload_1
       2: invokespecial #256                // Method b:(I)V
       5: return

  static android.graphics.drawable.StateListDrawable c(android.support.v7.widget.aq);
    Code:
       0: aload_0
       1: getfield      #103                // Field k:Landroid/graphics/drawable/StateListDrawable;
       4: areturn

  static android.graphics.drawable.Drawable d(android.support.v7.widget.aq);
    Code:
       0: aload_0
       1: getfield      #105                // Field l:Landroid/graphics/drawable/Drawable;
       4: areturn

  public void a();
    Code:
       0: aload_0
       1: getfield      #93                 // Field C:I
       4: istore_1
       5: iload_1
       6: ifeq          22
       9: iload_1
      10: iconst_3
      11: if_icmpeq     15
      14: return
      15: aload_0
      16: getfield      #91                 // Field B:Landroid/animation/ValueAnimator;
      19: invokevirtual #283                // Method android/animation/ValueAnimator.cancel:()V
      22: aload_0
      23: iconst_1
      24: putfield      #93                 // Field C:I
      27: aload_0
      28: getfield      #91                 // Field B:Landroid/animation/ValueAnimator;
      31: iconst_2
      32: newarray       float
      34: dup
      35: iconst_0
      36: aload_0
      37: getfield      #91                 // Field B:Landroid/animation/ValueAnimator;
      40: invokevirtual #287                // Method android/animation/ValueAnimator.getAnimatedValue:()Ljava/lang/Object;
      43: checkcast     #289                // class java/lang/Float
      46: invokevirtual #293                // Method java/lang/Float.floatValue:()F
      49: fastore
      50: dup
      51: iconst_1
      52: fconst_1
      53: fastore
      54: invokevirtual #297                // Method android/animation/ValueAnimator.setFloatValues:([F)V
      57: aload_0
      58: getfield      #91                 // Field B:Landroid/animation/ValueAnimator;
      61: ldc2_w        #298                // long 500l
      64: invokevirtual #303                // Method android/animation/ValueAnimator.setDuration:(J)Landroid/animation/ValueAnimator;
      67: pop
      68: aload_0
      69: getfield      #91                 // Field B:Landroid/animation/ValueAnimator;
      72: lconst_0
      73: invokevirtual #307                // Method android/animation/ValueAnimator.setStartDelay:(J)V
      76: aload_0
      77: getfield      #91                 // Field B:Landroid/animation/ValueAnimator;
      80: invokevirtual #310                // Method android/animation/ValueAnimator.start:()V
      83: return

  void a(int);
    Code:
       0: aload_0
       1: getfield      #93                 // Field C:I
       4: tableswitch   { // 1 to 2
                     1: 29
                     2: 36
               default: 28
          }
      28: return
      29: aload_0
      30: getfield      #91                 // Field B:Landroid/animation/ValueAnimator;
      33: invokevirtual #283                // Method android/animation/ValueAnimator.cancel:()V
      36: aload_0
      37: iconst_3
      38: putfield      #93                 // Field C:I
      41: aload_0
      42: getfield      #91                 // Field B:Landroid/animation/ValueAnimator;
      45: iconst_2
      46: newarray       float
      48: dup
      49: iconst_0
      50: aload_0
      51: getfield      #91                 // Field B:Landroid/animation/ValueAnimator;
      54: invokevirtual #287                // Method android/animation/ValueAnimator.getAnimatedValue:()Ljava/lang/Object;
      57: checkcast     #289                // class java/lang/Float
      60: invokevirtual #293                // Method java/lang/Float.floatValue:()F
      63: fastore
      64: dup
      65: iconst_1
      66: fconst_0
      67: fastore
      68: invokevirtual #297                // Method android/animation/ValueAnimator.setFloatValues:([F)V
      71: aload_0
      72: getfield      #91                 // Field B:Landroid/animation/ValueAnimator;
      75: iload_1
      76: i2l
      77: invokevirtual #303                // Method android/animation/ValueAnimator.setDuration:(J)Landroid/animation/ValueAnimator;
      80: pop
      81: aload_0
      82: getfield      #91                 // Field B:Landroid/animation/ValueAnimator;
      85: invokevirtual #310                // Method android/animation/ValueAnimator.start:()V
      88: return

  void a(int, int);
    Code:
       0: aload_0
       1: getfield      #179                // Field u:Landroid/support/v7/widget/RecyclerView;
       4: invokevirtual #184                // Method android/support/v7/widget/RecyclerView.computeVerticalScrollRange:()I
       7: istore        5
       9: aload_0
      10: getfield      #71                 // Field t:I
      13: istore        6
      15: iload         5
      17: iload         6
      19: isub
      20: ifle          40
      23: aload_0
      24: getfield      #71                 // Field t:I
      27: aload_0
      28: getfield      #134                // Field i:I
      31: if_icmplt     40
      34: iconst_1
      35: istore        9
      37: goto          43
      40: iconst_0
      41: istore        9
      43: aload_0
      44: iload         9
      46: putfield      #73                 // Field v:Z
      49: aload_0
      50: getfield      #179                // Field u:Landroid/support/v7/widget/RecyclerView;
      53: invokevirtual #236                // Method android/support/v7/widget/RecyclerView.computeHorizontalScrollRange:()I
      56: istore        7
      58: aload_0
      59: getfield      #69                 // Field s:I
      62: istore        8
      64: iload         7
      66: iload         8
      68: isub
      69: ifle          89
      72: aload_0
      73: getfield      #69                 // Field s:I
      76: aload_0
      77: getfield      #134                // Field i:I
      80: if_icmplt     89
      83: iconst_1
      84: istore        9
      86: goto          92
      89: iconst_0
      90: istore        9
      92: aload_0
      93: iload         9
      95: putfield      #75                 // Field w:Z
      98: aload_0
      99: getfield      #73                 // Field v:Z
     102: ifne          125
     105: aload_0
     106: getfield      #75                 // Field w:Z
     109: ifne          125
     112: aload_0
     113: getfield      #77                 // Field x:I
     116: ifeq          124
     119: aload_0
     120: iconst_0
     121: invokespecial #256                // Method b:(I)V
     124: return
     125: aload_0
     126: getfield      #73                 // Field v:Z
     129: ifeq          175
     132: iload_2
     133: i2f
     134: fstore_3
     135: iload         6
     137: i2f
     138: fstore        4
     140: aload_0
     141: fload         4
     143: fload_3
     144: fload         4
     146: fconst_2
     147: fdiv
     148: fadd
     149: fmul
     150: iload         5
     152: i2f
     153: fdiv
     154: f2i
     155: putfield      #171                // Field b:I
     158: aload_0
     159: iload         6
     161: iload         6
     163: iload         6
     165: imul
     166: iload         5
     168: idiv
     169: invokestatic  #312                // Method java/lang/Math.min:(II)I
     172: putfield      #196                // Field a:I
     175: aload_0
     176: getfield      #75                 // Field w:Z
     179: ifeq          225
     182: iload_1
     183: i2f
     184: fstore_3
     185: iload         8
     187: i2f
     188: fstore        4
     190: aload_0
     191: fload         4
     193: fload_3
     194: fload         4
     196: fconst_2
     197: fdiv
     198: fadd
     199: fmul
     200: iload         7
     202: i2f
     203: fdiv
     204: f2i
     205: putfield      #231                // Field e:I
     208: aload_0
     209: iload         8
     211: iload         8
     213: iload         8
     215: imul
     216: iload         7
     218: idiv
     219: invokestatic  #312                // Method java/lang/Math.min:(II)I
     222: putfield      #253                // Field d:I
     225: aload_0
     226: getfield      #77                 // Field x:I
     229: ifeq          240
     232: aload_0
     233: getfield      #77                 // Field x:I
     236: iconst_1
     237: if_icmpne     245
     240: aload_0
     241: iconst_1
     242: invokespecial #256                // Method b:(I)V
     245: return

  public void a(android.support.v7.widget.RecyclerView);
    Code:
       0: aload_0
       1: getfield      #179                // Field u:Landroid/support/v7/widget/RecyclerView;
       4: aload_1
       5: if_acmpne     9
       8: return
       9: aload_0
      10: getfield      #179                // Field u:Landroid/support/v7/widget/RecyclerView;
      13: ifnull        20
      16: aload_0
      17: invokespecial #314                // Method c:()V
      20: aload_0
      21: aload_1
      22: putfield      #179                // Field u:Landroid/support/v7/widget/RecyclerView;
      25: aload_0
      26: getfield      #179                // Field u:Landroid/support/v7/widget/RecyclerView;
      29: ifnull        36
      32: aload_0
      33: invokespecial #316                // Method b:()V
      36: return

  public void a(boolean);
    Code:
       0: return

  boolean a(float, float);
    Code:
       0: aload_0
       1: invokespecial #204                // Method e:()Z
       4: ifeq          22
       7: fload_1
       8: aload_0
       9: getfield      #123                // Field m:I
      12: iconst_2
      13: idiv
      14: i2f
      15: fcmpg
      16: ifgt          73
      19: goto          37
      22: fload_1
      23: aload_0
      24: getfield      #69                 // Field s:I
      27: aload_0
      28: getfield      #123                // Field m:I
      31: isub
      32: i2f
      33: fcmpl
      34: iflt          73
      37: fload_2
      38: aload_0
      39: getfield      #171                // Field b:I
      42: aload_0
      43: getfield      #196                // Field a:I
      46: iconst_2
      47: idiv
      48: isub
      49: i2f
      50: fcmpl
      51: iflt          73
      54: fload_2
      55: aload_0
      56: getfield      #171                // Field b:I
      59: aload_0
      60: getfield      #196                // Field a:I
      63: iconst_2
      64: idiv
      65: iadd
      66: i2f
      67: fcmpg
      68: ifgt          73
      71: iconst_1
      72: ireturn
      73: iconst_0
      74: ireturn

  public boolean a(android.support.v7.widget.RecyclerView, android.view.MotionEvent);
    Code:
       0: aload_0
       1: getfield      #77                 // Field x:I
       4: istore_3
       5: iconst_0
       6: istore        5
       8: iload_3
       9: iconst_1
      10: if_icmpne     117
      13: aload_0
      14: aload_2
      15: invokevirtual #324                // Method android/view/MotionEvent.getX:()F
      18: aload_2
      19: invokevirtual #327                // Method android/view/MotionEvent.getY:()F
      22: invokevirtual #329                // Method a:(FF)Z
      25: istore        6
      27: aload_0
      28: aload_2
      29: invokevirtual #324                // Method android/view/MotionEvent.getX:()F
      32: aload_2
      33: invokevirtual #327                // Method android/view/MotionEvent.getY:()F
      36: invokevirtual #331                // Method b:(FF)Z
      39: istore        7
      41: iload         5
      43: istore        4
      45: aload_2
      46: invokevirtual #334                // Method android/view/MotionEvent.getAction:()I
      49: ifne          132
      52: iload         6
      54: ifne          66
      57: iload         5
      59: istore        4
      61: iload         7
      63: ifeq          132
      66: iload         7
      68: ifeq          89
      71: aload_0
      72: iconst_1
      73: putfield      #79                 // Field y:I
      76: aload_0
      77: aload_2
      78: invokevirtual #324                // Method android/view/MotionEvent.getX:()F
      81: f2i
      82: i2f
      83: putfield      #233                // Field f:F
      86: goto          109
      89: iload         6
      91: ifeq          109
      94: aload_0
      95: iconst_2
      96: putfield      #79                 // Field y:I
      99: aload_0
     100: aload_2
     101: invokevirtual #327                // Method android/view/MotionEvent.getY:()F
     104: f2i
     105: i2f
     106: putfield      #177                // Field c:F
     109: aload_0
     110: iconst_2
     111: invokespecial #256                // Method b:(I)V
     114: goto          129
     117: iload         5
     119: istore        4
     121: aload_0
     122: getfield      #77                 // Field x:I
     125: iconst_2
     126: if_icmpne     132
     129: iconst_1
     130: istore        4
     132: iload         4
     134: ireturn

  public void b(android.graphics.Canvas, android.support.v7.widget.RecyclerView, android.support.v7.widget.RecyclerView$u);
    Code:
       0: aload_0
       1: getfield      #69                 // Field s:I
       4: aload_0
       5: getfield      #179                // Field u:Landroid/support/v7/widget/RecyclerView;
       8: invokevirtual #338                // Method android/support/v7/widget/RecyclerView.getWidth:()I
      11: if_icmpne     63
      14: aload_0
      15: getfield      #71                 // Field t:I
      18: aload_0
      19: getfield      #179                // Field u:Landroid/support/v7/widget/RecyclerView;
      22: invokevirtual #341                // Method android/support/v7/widget/RecyclerView.getHeight:()I
      25: if_icmpeq     31
      28: goto          63
      31: aload_0
      32: getfield      #93                 // Field C:I
      35: ifeq          62
      38: aload_0
      39: getfield      #73                 // Field v:Z
      42: ifeq          50
      45: aload_0
      46: aload_1
      47: invokespecial #343                // Method a:(Landroid/graphics/Canvas;)V
      50: aload_0
      51: getfield      #75                 // Field w:Z
      54: ifeq          62
      57: aload_0
      58: aload_1
      59: invokespecial #345                // Method b:(Landroid/graphics/Canvas;)V
      62: return
      63: aload_0
      64: aload_0
      65: getfield      #179                // Field u:Landroid/support/v7/widget/RecyclerView;
      68: invokevirtual #338                // Method android/support/v7/widget/RecyclerView.getWidth:()I
      71: putfield      #69                 // Field s:I
      74: aload_0
      75: aload_0
      76: getfield      #179                // Field u:Landroid/support/v7/widget/RecyclerView;
      79: invokevirtual #341                // Method android/support/v7/widget/RecyclerView.getHeight:()I
      82: putfield      #71                 // Field t:I
      85: aload_0
      86: iconst_0
      87: invokespecial #256                // Method b:(I)V
      90: return

  public void b(android.support.v7.widget.RecyclerView, android.view.MotionEvent);
    Code:
       0: aload_0
       1: getfield      #77                 // Field x:I
       4: ifne          8
       7: return
       8: aload_2
       9: invokevirtual #334                // Method android/view/MotionEvent.getAction:()I
      12: ifne          99
      15: aload_0
      16: aload_2
      17: invokevirtual #324                // Method android/view/MotionEvent.getX:()F
      20: aload_2
      21: invokevirtual #327                // Method android/view/MotionEvent.getY:()F
      24: invokevirtual #329                // Method a:(FF)Z
      27: istore_3
      28: aload_0
      29: aload_2
      30: invokevirtual #324                // Method android/view/MotionEvent.getX:()F
      33: aload_2
      34: invokevirtual #327                // Method android/view/MotionEvent.getY:()F
      37: invokevirtual #331                // Method b:(FF)Z
      40: istore        4
      42: iload_3
      43: ifne          51
      46: iload         4
      48: ifeq          188
      51: iload         4
      53: ifeq          74
      56: aload_0
      57: iconst_1
      58: putfield      #79                 // Field y:I
      61: aload_0
      62: aload_2
      63: invokevirtual #324                // Method android/view/MotionEvent.getX:()F
      66: f2i
      67: i2f
      68: putfield      #233                // Field f:F
      71: goto          93
      74: iload_3
      75: ifeq          93
      78: aload_0
      79: iconst_2
      80: putfield      #79                 // Field y:I
      83: aload_0
      84: aload_2
      85: invokevirtual #327                // Method android/view/MotionEvent.getY:()F
      88: f2i
      89: i2f
      90: putfield      #177                // Field c:F
      93: aload_0
      94: iconst_2
      95: invokespecial #256                // Method b:(I)V
      98: return
      99: aload_2
     100: invokevirtual #334                // Method android/view/MotionEvent.getAction:()I
     103: iconst_1
     104: if_icmpne     136
     107: aload_0
     108: getfield      #77                 // Field x:I
     111: iconst_2
     112: if_icmpne     136
     115: aload_0
     116: fconst_0
     117: putfield      #177                // Field c:F
     120: aload_0
     121: fconst_0
     122: putfield      #233                // Field f:F
     125: aload_0
     126: iconst_1
     127: invokespecial #256                // Method b:(I)V
     130: aload_0
     131: iconst_0
     132: putfield      #79                 // Field y:I
     135: return
     136: aload_2
     137: invokevirtual #334                // Method android/view/MotionEvent.getAction:()I
     140: iconst_2
     141: if_icmpne     188
     144: aload_0
     145: getfield      #77                 // Field x:I
     148: iconst_2
     149: if_icmpne     188
     152: aload_0
     153: invokevirtual #249                // Method a:()V
     156: aload_0
     157: getfield      #79                 // Field y:I
     160: iconst_1
     161: if_icmpne     172
     164: aload_0
     165: aload_2
     166: invokevirtual #324                // Method android/view/MotionEvent.getX:()F
     169: invokespecial #348                // Method b:(F)V
     172: aload_0
     173: getfield      #79                 // Field y:I
     176: iconst_2
     177: if_icmpne     188
     180: aload_0
     181: aload_2
     182: invokevirtual #327                // Method android/view/MotionEvent.getY:()F
     185: invokespecial #350                // Method a:(F)V
     188: return

  boolean b(float, float);
    Code:
       0: fload_2
       1: aload_0
       2: getfield      #71                 // Field t:I
       5: aload_0
       6: getfield      #130                // Field q:I
       9: isub
      10: i2f
      11: fcmpl
      12: iflt          51
      15: fload_1
      16: aload_0
      17: getfield      #231                // Field e:I
      20: aload_0
      21: getfield      #253                // Field d:I
      24: iconst_2
      25: idiv
      26: isub
      27: i2f
      28: fcmpl
      29: iflt          51
      32: fload_1
      33: aload_0
      34: getfield      #231                // Field e:I
      37: aload_0
      38: getfield      #253                // Field d:I
      41: iconst_2
      42: idiv
      43: iadd
      44: i2f
      45: fcmpg
      46: ifgt          51
      49: iconst_1
      50: ireturn
      51: iconst_0
      52: ireturn
}
