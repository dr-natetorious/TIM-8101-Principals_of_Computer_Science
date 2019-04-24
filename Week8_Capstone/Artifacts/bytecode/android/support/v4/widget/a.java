public abstract class android.support.v4.widget.a implements android.view.View$OnTouchListener {
  final android.support.v4.widget.a$a a;

  final android.view.View b;

  boolean c;

  boolean d;

  boolean e;

  static {};
    Code:
       0: invokestatic  #43                 // Method android/view/ViewConfiguration.getTapTimeout:()I
       3: putstatic     #45                 // Field r:I
       6: return

  public android.support.v4.widget.a(android.view.View);
    Code:
       0: aload_0
       1: invokespecial #50                 // Method java/lang/Object."<init>":()V
       4: aload_0
       5: new           #8                  // class android/support/v4/widget/a$a
       8: dup
       9: invokespecial #51                 // Method android/support/v4/widget/a$a."<init>":()V
      12: putfield      #53                 // Field a:Landroid/support/v4/widget/a$a;
      15: aload_0
      16: new           #55                 // class android/view/animation/AccelerateInterpolator
      19: dup
      20: invokespecial #56                 // Method android/view/animation/AccelerateInterpolator."<init>":()V
      23: putfield      #58                 // Field f:Landroid/view/animation/Interpolator;
      26: aload_0
      27: iconst_2
      28: newarray       float
      30: dup
      31: iconst_0
      32: fconst_0
      33: fastore
      34: dup
      35: iconst_1
      36: fconst_0
      37: fastore
      38: putfield      #60                 // Field h:[F
      41: aload_0
      42: iconst_2
      43: newarray       float
      45: dup
      46: iconst_0
      47: ldc           #61                 // float 3.4028235E38f
      49: fastore
      50: dup
      51: iconst_1
      52: ldc           #61                 // float 3.4028235E38f
      54: fastore
      55: putfield      #63                 // Field i:[F
      58: aload_0
      59: iconst_2
      60: newarray       float
      62: dup
      63: iconst_0
      64: fconst_0
      65: fastore
      66: dup
      67: iconst_1
      68: fconst_0
      69: fastore
      70: putfield      #65                 // Field l:[F
      73: aload_0
      74: iconst_2
      75: newarray       float
      77: dup
      78: iconst_0
      79: fconst_0
      80: fastore
      81: dup
      82: iconst_1
      83: fconst_0
      84: fastore
      85: putfield      #67                 // Field m:[F
      88: aload_0
      89: iconst_2
      90: newarray       float
      92: dup
      93: iconst_0
      94: ldc           #61                 // float 3.4028235E38f
      96: fastore
      97: dup
      98: iconst_1
      99: ldc           #61                 // float 3.4028235E38f
     101: fastore
     102: putfield      #69                 // Field n:[F
     105: aload_0
     106: aload_1
     107: putfield      #71                 // Field b:Landroid/view/View;
     110: invokestatic  #77                 // Method android/content/res/Resources.getSystem:()Landroid/content/res/Resources;
     113: invokevirtual #81                 // Method android/content/res/Resources.getDisplayMetrics:()Landroid/util/DisplayMetrics;
     116: astore_1
     117: aload_1
     118: getfield      #87                 // Field android/util/DisplayMetrics.density:F
     121: ldc           #88                 // float 1575.0f
     123: fmul
     124: ldc           #89                 // float 0.5f
     126: fadd
     127: f2i
     128: istore_3
     129: aload_1
     130: getfield      #87                 // Field android/util/DisplayMetrics.density:F
     133: ldc           #90                 // float 315.0f
     135: fmul
     136: ldc           #89                 // float 0.5f
     138: fadd
     139: f2i
     140: istore        4
     142: iload_3
     143: i2f
     144: fstore_2
     145: aload_0
     146: fload_2
     147: fload_2
     148: invokevirtual #93                 // Method a:(FF)Landroid/support/v4/widget/a;
     151: pop
     152: iload         4
     154: i2f
     155: fstore_2
     156: aload_0
     157: fload_2
     158: fload_2
     159: invokevirtual #95                 // Method b:(FF)Landroid/support/v4/widget/a;
     162: pop
     163: aload_0
     164: iconst_1
     165: invokevirtual #98                 // Method a:(I)Landroid/support/v4/widget/a;
     168: pop
     169: aload_0
     170: ldc           #61                 // float 3.4028235E38f
     172: ldc           #61                 // float 3.4028235E38f
     174: invokevirtual #100                // Method e:(FF)Landroid/support/v4/widget/a;
     177: pop
     178: aload_0
     179: ldc           #101                // float 0.2f
     181: ldc           #101                // float 0.2f
     183: invokevirtual #103                // Method d:(FF)Landroid/support/v4/widget/a;
     186: pop
     187: aload_0
     188: fconst_1
     189: fconst_1
     190: invokevirtual #105                // Method c:(FF)Landroid/support/v4/widget/a;
     193: pop
     194: aload_0
     195: getstatic     #45                 // Field r:I
     198: invokevirtual #107                // Method b:(I)Landroid/support/v4/widget/a;
     201: pop
     202: aload_0
     203: sipush        500
     206: invokevirtual #109                // Method c:(I)Landroid/support/v4/widget/a;
     209: pop
     210: aload_0
     211: sipush        500
     214: invokevirtual #111                // Method d:(I)Landroid/support/v4/widget/a;
     217: pop
     218: return

  static float a(float, float, float);
    Code:
       0: fload_0
       1: fload_2
       2: fcmpl
       3: ifle          8
       6: fload_2
       7: freturn
       8: fload_0
       9: fload_1
      10: fcmpg
      11: ifge          16
      14: fload_1
      15: freturn
      16: fload_0
      17: freturn

  static int a(int, int, int);
    Code:
       0: iload_0
       1: iload_2
       2: if_icmple     7
       5: iload_2
       6: ireturn
       7: iload_0
       8: iload_1
       9: if_icmpge     14
      12: iload_1
      13: ireturn
      14: iload_0
      15: ireturn

  public android.support.v4.widget.a a(float, float);
    Code:
       0: aload_0
       1: getfield      #69                 // Field n:[F
       4: iconst_0
       5: fload_1
       6: ldc           #157                // float 1000.0f
       8: fdiv
       9: fastore
      10: aload_0
      11: getfield      #69                 // Field n:[F
      14: iconst_1
      15: fload_2
      16: ldc           #157                // float 1000.0f
      18: fdiv
      19: fastore
      20: aload_0
      21: areturn

  public android.support.v4.widget.a a(int);
    Code:
       0: aload_0
       1: iload_1
       2: putfield      #156                // Field j:I
       5: aload_0
       6: areturn

  public android.support.v4.widget.a a(boolean);
    Code:
       0: aload_0
       1: getfield      #160                // Field p:Z
       4: ifeq          15
       7: iload_1
       8: ifne          15
      11: aload_0
      12: invokespecial #162                // Method d:()V
      15: aload_0
      16: iload_1
      17: putfield      #160                // Field p:Z
      20: aload_0
      21: areturn

  public abstract void a(int, int);

  boolean a();
    Code:
       0: aload_0
       1: getfield      #53                 // Field a:Landroid/support/v4/widget/a$a;
       4: astore_3
       5: aload_3
       6: invokevirtual #166                // Method android/support/v4/widget/a$a.f:()I
       9: istore_1
      10: aload_3
      11: invokevirtual #168                // Method android/support/v4/widget/a$a.e:()I
      14: istore_2
      15: iload_1
      16: ifeq          27
      19: aload_0
      20: iload_1
      21: invokevirtual #171                // Method f:(I)Z
      24: ifne          39
      27: iload_2
      28: ifeq          41
      31: aload_0
      32: iload_2
      33: invokevirtual #173                // Method e:(I)Z
      36: ifeq          41
      39: iconst_1
      40: ireturn
      41: iconst_0
      42: ireturn

  public android.support.v4.widget.a b(float, float);
    Code:
       0: aload_0
       1: getfield      #67                 // Field m:[F
       4: iconst_0
       5: fload_1
       6: ldc           #157                // float 1000.0f
       8: fdiv
       9: fastore
      10: aload_0
      11: getfield      #67                 // Field m:[F
      14: iconst_1
      15: fload_2
      16: ldc           #157                // float 1000.0f
      18: fdiv
      19: fastore
      20: aload_0
      21: areturn

  public android.support.v4.widget.a b(int);
    Code:
       0: aload_0
       1: iload_1
       2: putfield      #142                // Field k:I
       5: aload_0
       6: areturn

  void b();
    Code:
       0: invokestatic  #179                // Method android/os/SystemClock.uptimeMillis:()J
       3: lstore_1
       4: lload_1
       5: lload_1
       6: iconst_3
       7: fconst_0
       8: fconst_0
       9: iconst_0
      10: invokestatic  #185                // Method android/view/MotionEvent.obtain:(JJIFFI)Landroid/view/MotionEvent;
      13: astore_3
      14: aload_0
      15: getfield      #71                 // Field b:Landroid/view/View;
      18: aload_3
      19: invokevirtual #191                // Method android/view/View.onTouchEvent:(Landroid/view/MotionEvent;)Z
      22: pop
      23: aload_3
      24: invokevirtual #194                // Method android/view/MotionEvent.recycle:()V
      27: return

  public android.support.v4.widget.a c(float, float);
    Code:
       0: aload_0
       1: getfield      #65                 // Field l:[F
       4: iconst_0
       5: fload_1
       6: ldc           #157                // float 1000.0f
       8: fdiv
       9: fastore
      10: aload_0
      11: getfield      #65                 // Field l:[F
      14: iconst_1
      15: fload_2
      16: ldc           #157                // float 1000.0f
      18: fdiv
      19: fastore
      20: aload_0
      21: areturn

  public android.support.v4.widget.a c(int);
    Code:
       0: aload_0
       1: getfield      #53                 // Field a:Landroid/support/v4/widget/a$a;
       4: iload_1
       5: invokevirtual #197                // Method android/support/v4/widget/a$a.a:(I)V
       8: aload_0
       9: areturn

  public android.support.v4.widget.a d(float, float);
    Code:
       0: aload_0
       1: getfield      #60                 // Field h:[F
       4: iconst_0
       5: fload_1
       6: fastore
       7: aload_0
       8: getfield      #60                 // Field h:[F
      11: iconst_1
      12: fload_2
      13: fastore
      14: aload_0
      15: areturn

  public android.support.v4.widget.a d(int);
    Code:
       0: aload_0
       1: getfield      #53                 // Field a:Landroid/support/v4/widget/a$a;
       4: iload_1
       5: invokevirtual #199                // Method android/support/v4/widget/a$a.b:(I)V
       8: aload_0
       9: areturn

  public android.support.v4.widget.a e(float, float);
    Code:
       0: aload_0
       1: getfield      #63                 // Field i:[F
       4: iconst_0
       5: fload_1
       6: fastore
       7: aload_0
       8: getfield      #63                 // Field i:[F
      11: iconst_1
      12: fload_2
      13: fastore
      14: aload_0
      15: areturn

  public abstract boolean e(int);

  public abstract boolean f(int);

  public boolean onTouch(android.view.View, android.view.MotionEvent);
    Code:
       0: aload_0
       1: getfield      #160                // Field p:Z
       4: istore        5
       6: iconst_0
       7: istore        6
       9: iload         5
      11: ifne          16
      14: iconst_0
      15: ireturn
      16: aload_2
      17: invokevirtual #204                // Method android/view/MotionEvent.getActionMasked:()I
      20: tableswitch   { // 0 to 3
                     0: 62
                     1: 55
                     2: 72
                     3: 55
               default: 52
          }
      52: goto          147
      55: aload_0
      56: invokespecial #162                // Method d:()V
      59: goto          147
      62: aload_0
      63: iconst_1
      64: putfield      #206                // Field d:Z
      67: aload_0
      68: iconst_0
      69: putfield      #140                // Field o:Z
      72: aload_0
      73: iconst_0
      74: aload_2
      75: invokevirtual #210                // Method android/view/MotionEvent.getX:()F
      78: aload_1
      79: invokevirtual #213                // Method android/view/View.getWidth:()I
      82: i2f
      83: aload_0
      84: getfield      #71                 // Field b:Landroid/view/View;
      87: invokevirtual #213                // Method android/view/View.getWidth:()I
      90: i2f
      91: invokespecial #215                // Method a:(IFFF)F
      94: fstore_3
      95: aload_0
      96: iconst_1
      97: aload_2
      98: invokevirtual #218                // Method android/view/MotionEvent.getY:()F
     101: aload_1
     102: invokevirtual #221                // Method android/view/View.getHeight:()I
     105: i2f
     106: aload_0
     107: getfield      #71                 // Field b:Landroid/view/View;
     110: invokevirtual #221                // Method android/view/View.getHeight:()I
     113: i2f
     114: invokespecial #215                // Method a:(IFFF)F
     117: fstore        4
     119: aload_0
     120: getfield      #53                 // Field a:Landroid/support/v4/widget/a$a;
     123: fload_3
     124: fload         4
     126: invokevirtual #224                // Method android/support/v4/widget/a$a.a:(FF)V
     129: aload_0
     130: getfield      #136                // Field e:Z
     133: ifne          147
     136: aload_0
     137: invokevirtual #226                // Method a:()Z
     140: ifeq          147
     143: aload_0
     144: invokespecial #228                // Method c:()V
     147: iload         6
     149: istore        5
     151: aload_0
     152: getfield      #230                // Field q:Z
     155: ifeq          172
     158: iload         6
     160: istore        5
     162: aload_0
     163: getfield      #136                // Field e:Z
     166: ifeq          172
     169: iconst_1
     170: istore        5
     172: iload         5
     174: ireturn
}
