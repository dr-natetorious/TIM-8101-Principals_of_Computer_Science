class android.support.design.widget.e {
  static final android.view.animation.Interpolator a;

  static final int[] j;

  static final int[] k;

  static final int[] l;

  static final int[] m;

  int b;

  android.support.design.widget.i c;

  android.graphics.drawable.Drawable d;

  android.graphics.drawable.Drawable e;

  android.support.design.widget.c f;

  android.graphics.drawable.Drawable g;

  float h;

  float i;

  final android.support.design.widget.r n;

  final android.support.design.widget.j o;

  static {};
    Code:
       0: getstatic     #57                 // Field android/support/design/widget/a.c:Landroid/view/animation/Interpolator;
       3: putstatic     #59                 // Field a:Landroid/view/animation/Interpolator;
       6: iconst_2
       7: newarray       int
       9: dup
      10: iconst_0
      11: ldc           #60                 // int 16842919
      13: iastore
      14: dup
      15: iconst_1
      16: ldc           #61                 // int 16842910
      18: iastore
      19: putstatic     #63                 // Field j:[I
      22: iconst_2
      23: newarray       int
      25: dup
      26: iconst_0
      27: ldc           #64                 // int 16842908
      29: iastore
      30: dup
      31: iconst_1
      32: ldc           #61                 // int 16842910
      34: iastore
      35: putstatic     #66                 // Field k:[I
      38: iconst_1
      39: newarray       int
      41: dup
      42: iconst_0
      43: ldc           #61                 // int 16842910
      45: iastore
      46: putstatic     #68                 // Field l:[I
      49: iconst_0
      50: newarray       int
      52: putstatic     #70                 // Field m:[I
      55: return

  android.support.design.widget.e(android.support.design.widget.r, android.support.design.widget.j);
    Code:
       0: aload_0
       1: invokespecial #75                 // Method java/lang/Object."<init>":()V
       4: aload_0
       5: iconst_0
       6: putfield      #77                 // Field b:I
       9: aload_0
      10: new           #79                 // class android/graphics/Rect
      13: dup
      14: invokespecial #80                 // Method android/graphics/Rect."<init>":()V
      17: putfield      #82                 // Field r:Landroid/graphics/Rect;
      20: aload_0
      21: aload_1
      22: putfield      #84                 // Field n:Landroid/support/design/widget/r;
      25: aload_0
      26: aload_2
      27: putfield      #86                 // Field o:Landroid/support/design/widget/j;
      30: aload_0
      31: new           #88                 // class android/support/design/widget/l
      34: dup
      35: invokespecial #89                 // Method android/support/design/widget/l."<init>":()V
      38: putfield      #91                 // Field p:Landroid/support/design/widget/l;
      41: aload_0
      42: getfield      #91                 // Field p:Landroid/support/design/widget/l;
      45: getstatic     #63                 // Field j:[I
      48: aload_0
      49: new           #15                 // class android/support/design/widget/e$b
      52: dup
      53: aload_0
      54: invokespecial #94                 // Method android/support/design/widget/e$b."<init>":(Landroid/support/design/widget/e;)V
      57: invokespecial #97                 // Method a:(Landroid/support/design/widget/e$e;)Landroid/animation/ValueAnimator;
      60: invokevirtual #100                // Method android/support/design/widget/l.a:([ILandroid/animation/ValueAnimator;)V
      63: aload_0
      64: getfield      #91                 // Field p:Landroid/support/design/widget/l;
      67: getstatic     #66                 // Field k:[I
      70: aload_0
      71: new           #15                 // class android/support/design/widget/e$b
      74: dup
      75: aload_0
      76: invokespecial #94                 // Method android/support/design/widget/e$b."<init>":(Landroid/support/design/widget/e;)V
      79: invokespecial #97                 // Method a:(Landroid/support/design/widget/e$e;)Landroid/animation/ValueAnimator;
      82: invokevirtual #100                // Method android/support/design/widget/l.a:([ILandroid/animation/ValueAnimator;)V
      85: aload_0
      86: getfield      #91                 // Field p:Landroid/support/design/widget/l;
      89: getstatic     #68                 // Field l:[I
      92: aload_0
      93: new           #21                 // class android/support/design/widget/e$d
      96: dup
      97: aload_0
      98: invokespecial #101                // Method android/support/design/widget/e$d."<init>":(Landroid/support/design/widget/e;)V
     101: invokespecial #97                 // Method a:(Landroid/support/design/widget/e$e;)Landroid/animation/ValueAnimator;
     104: invokevirtual #100                // Method android/support/design/widget/l.a:([ILandroid/animation/ValueAnimator;)V
     107: aload_0
     108: getfield      #91                 // Field p:Landroid/support/design/widget/l;
     111: getstatic     #70                 // Field m:[I
     114: aload_0
     115: new           #12                 // class android/support/design/widget/e$a
     118: dup
     119: aload_0
     120: invokespecial #102                // Method android/support/design/widget/e$a."<init>":(Landroid/support/design/widget/e;)V
     123: invokespecial #97                 // Method a:(Landroid/support/design/widget/e$e;)Landroid/animation/ValueAnimator;
     126: invokevirtual #100                // Method android/support/design/widget/l.a:([ILandroid/animation/ValueAnimator;)V
     129: aload_0
     130: aload_0
     131: getfield      #84                 // Field n:Landroid/support/design/widget/r;
     134: invokevirtual #108                // Method android/support/design/widget/r.getRotation:()F
     137: putfield      #110                // Field q:F
     140: return

  float a();
    Code:
       0: aload_0
       1: getfield      #184                // Field h:F
       4: freturn

  android.support.design.widget.c a(int, android.content.res.ColorStateList);
    Code:
       0: aload_0
       1: getfield      #84                 // Field n:Landroid/support/design/widget/r;
       4: invokevirtual #189                // Method android/support/design/widget/r.getContext:()Landroid/content/Context;
       7: astore_3
       8: aload_0
       9: invokevirtual #192                // Method i:()Landroid/support/design/widget/c;
      12: astore        4
      14: aload         4
      16: aload_3
      17: getstatic     #197                // Field android/support/design/a$c.design_fab_stroke_top_outer_color:I
      20: invokestatic  #202                // Method android/support/v4/a/a.c:(Landroid/content/Context;I)I
      23: aload_3
      24: getstatic     #205                // Field android/support/design/a$c.design_fab_stroke_top_inner_color:I
      27: invokestatic  #202                // Method android/support/v4/a/a.c:(Landroid/content/Context;I)I
      30: aload_3
      31: getstatic     #208                // Field android/support/design/a$c.design_fab_stroke_end_inner_color:I
      34: invokestatic  #202                // Method android/support/v4/a/a.c:(Landroid/content/Context;I)I
      37: aload_3
      38: getstatic     #211                // Field android/support/design/a$c.design_fab_stroke_end_outer_color:I
      41: invokestatic  #202                // Method android/support/v4/a/a.c:(Landroid/content/Context;I)I
      44: invokevirtual #214                // Method android/support/design/widget/c.a:(IIII)V
      47: aload         4
      49: iload_1
      50: i2f
      51: invokevirtual #215                // Method android/support/design/widget/c.a:(F)V
      54: aload         4
      56: aload_2
      57: invokevirtual #218                // Method android/support/design/widget/c.a:(Landroid/content/res/ColorStateList;)V
      60: aload         4
      62: areturn

  final void a(float);
    Code:
       0: aload_0
       1: getfield      #184                // Field h:F
       4: fload_1
       5: fcmpl
       6: ifeq          23
       9: aload_0
      10: fload_1
      11: putfield      #184                // Field h:F
      14: aload_0
      15: fload_1
      16: aload_0
      17: getfield      #220                // Field i:F
      20: invokevirtual #223                // Method a:(FF)V
      23: return

  void a(float, float);
    Code:
       0: aload_0
       1: getfield      #171                // Field c:Landroid/support/design/widget/i;
       4: ifnull        25
       7: aload_0
       8: getfield      #171                // Field c:Landroid/support/design/widget/i;
      11: fload_1
      12: aload_0
      13: getfield      #220                // Field i:F
      16: fload_1
      17: fadd
      18: invokevirtual #224                // Method android/support/design/widget/i.a:(FF)V
      21: aload_0
      22: invokevirtual #226                // Method e:()V
      25: return

  void a(int);
    Code:
       0: aload_0
       1: getfield      #229                // Field e:Landroid/graphics/drawable/Drawable;
       4: ifnull        18
       7: aload_0
       8: getfield      #229                // Field e:Landroid/graphics/drawable/Drawable;
      11: iload_1
      12: invokestatic  #231                // Method b:(I)Landroid/content/res/ColorStateList;
      15: invokestatic  #236                // Method android/support/v4/b/a/a.a:(Landroid/graphics/drawable/Drawable;Landroid/content/res/ColorStateList;)V
      18: return

  void a(android.content.res.ColorStateList);
    Code:
       0: aload_0
       1: getfield      #238                // Field d:Landroid/graphics/drawable/Drawable;
       4: ifnull        15
       7: aload_0
       8: getfield      #238                // Field d:Landroid/graphics/drawable/Drawable;
      11: aload_1
      12: invokestatic  #236                // Method android/support/v4/b/a/a.a:(Landroid/graphics/drawable/Drawable;Landroid/content/res/ColorStateList;)V
      15: aload_0
      16: getfield      #178                // Field f:Landroid/support/design/widget/c;
      19: ifnull        30
      22: aload_0
      23: getfield      #178                // Field f:Landroid/support/design/widget/c;
      26: aload_1
      27: invokevirtual #218                // Method android/support/design/widget/c.a:(Landroid/content/res/ColorStateList;)V
      30: return

  void a(android.content.res.ColorStateList, android.graphics.PorterDuff$Mode, int, int);
    Code:
       0: aload_0
       1: aload_0
       2: invokevirtual #242                // Method k:()Landroid/graphics/drawable/GradientDrawable;
       5: invokestatic  #245                // Method android/support/v4/b/a/a.f:(Landroid/graphics/drawable/Drawable;)Landroid/graphics/drawable/Drawable;
       8: putfield      #238                // Field d:Landroid/graphics/drawable/Drawable;
      11: aload_0
      12: getfield      #238                // Field d:Landroid/graphics/drawable/Drawable;
      15: aload_1
      16: invokestatic  #236                // Method android/support/v4/b/a/a.a:(Landroid/graphics/drawable/Drawable;Landroid/content/res/ColorStateList;)V
      19: aload_2
      20: ifnull        31
      23: aload_0
      24: getfield      #238                // Field d:Landroid/graphics/drawable/Drawable;
      27: aload_2
      28: invokestatic  #248                // Method android/support/v4/b/a/a.a:(Landroid/graphics/drawable/Drawable;Landroid/graphics/PorterDuff$Mode;)V
      31: aload_0
      32: aload_0
      33: invokevirtual #242                // Method k:()Landroid/graphics/drawable/GradientDrawable;
      36: invokestatic  #245                // Method android/support/v4/b/a/a.f:(Landroid/graphics/drawable/Drawable;)Landroid/graphics/drawable/Drawable;
      39: putfield      #229                // Field e:Landroid/graphics/drawable/Drawable;
      42: aload_0
      43: getfield      #229                // Field e:Landroid/graphics/drawable/Drawable;
      46: iload_3
      47: invokestatic  #231                // Method b:(I)Landroid/content/res/ColorStateList;
      50: invokestatic  #236                // Method android/support/v4/b/a/a.a:(Landroid/graphics/drawable/Drawable;Landroid/content/res/ColorStateList;)V
      53: iload         4
      55: ifle          98
      58: aload_0
      59: aload_0
      60: iload         4
      62: aload_1
      63: invokevirtual #250                // Method a:(ILandroid/content/res/ColorStateList;)Landroid/support/design/widget/c;
      66: putfield      #178                // Field f:Landroid/support/design/widget/c;
      69: iconst_3
      70: anewarray     #252                // class android/graphics/drawable/Drawable
      73: astore_1
      74: aload_1
      75: iconst_0
      76: aload_0
      77: getfield      #178                // Field f:Landroid/support/design/widget/c;
      80: aastore
      81: aload_1
      82: iconst_1
      83: aload_0
      84: getfield      #238                // Field d:Landroid/graphics/drawable/Drawable;
      87: aastore
      88: aload_1
      89: iconst_2
      90: aload_0
      91: getfield      #229                // Field e:Landroid/graphics/drawable/Drawable;
      94: aastore
      95: goto          122
      98: aload_0
      99: aconst_null
     100: putfield      #178                // Field f:Landroid/support/design/widget/c;
     103: iconst_2
     104: anewarray     #252                // class android/graphics/drawable/Drawable
     107: astore_1
     108: aload_1
     109: iconst_0
     110: aload_0
     111: getfield      #238                // Field d:Landroid/graphics/drawable/Drawable;
     114: aastore
     115: aload_1
     116: iconst_1
     117: aload_0
     118: getfield      #229                // Field e:Landroid/graphics/drawable/Drawable;
     121: aastore
     122: aload_0
     123: new           #254                // class android/graphics/drawable/LayerDrawable
     126: dup
     127: aload_1
     128: invokespecial #257                // Method android/graphics/drawable/LayerDrawable."<init>":([Landroid/graphics/drawable/Drawable;)V
     131: putfield      #259                // Field g:Landroid/graphics/drawable/Drawable;
     134: aload_0
     135: new           #173                // class android/support/design/widget/i
     138: dup
     139: aload_0
     140: getfield      #84                 // Field n:Landroid/support/design/widget/r;
     143: invokevirtual #189                // Method android/support/design/widget/r.getContext:()Landroid/content/Context;
     146: aload_0
     147: getfield      #259                // Field g:Landroid/graphics/drawable/Drawable;
     150: aload_0
     151: getfield      #86                 // Field o:Landroid/support/design/widget/j;
     154: invokeinterface #263,  1          // InterfaceMethod android/support/design/widget/j.a:()F
     159: aload_0
     160: getfield      #184                // Field h:F
     163: aload_0
     164: getfield      #184                // Field h:F
     167: aload_0
     168: getfield      #220                // Field i:F
     171: fadd
     172: invokespecial #266                // Method android/support/design/widget/i."<init>":(Landroid/content/Context;Landroid/graphics/drawable/Drawable;FFF)V
     175: putfield      #171                // Field c:Landroid/support/design/widget/i;
     178: aload_0
     179: getfield      #171                // Field c:Landroid/support/design/widget/i;
     182: iconst_0
     183: invokevirtual #269                // Method android/support/design/widget/i.a:(Z)V
     186: aload_0
     187: getfield      #86                 // Field o:Landroid/support/design/widget/j;
     190: aload_0
     191: getfield      #171                // Field c:Landroid/support/design/widget/i;
     194: invokeinterface #272,  2          // InterfaceMethod android/support/design/widget/j.a:(Landroid/graphics/drawable/Drawable;)V
     199: return

  void a(android.graphics.PorterDuff$Mode);
    Code:
       0: aload_0
       1: getfield      #238                // Field d:Landroid/graphics/drawable/Drawable;
       4: ifnull        15
       7: aload_0
       8: getfield      #238                // Field d:Landroid/graphics/drawable/Drawable;
      11: aload_1
      12: invokestatic  #248                // Method android/support/v4/b/a/a.a:(Landroid/graphics/drawable/Drawable;Landroid/graphics/PorterDuff$Mode;)V
      15: return

  void a(android.graphics.Rect);
    Code:
       0: aload_0
       1: getfield      #171                // Field c:Landroid/support/design/widget/i;
       4: aload_1
       5: invokevirtual #278                // Method android/support/design/widget/i.getPadding:(Landroid/graphics/Rect;)Z
       8: pop
       9: return

  void a(android.support.design.widget.e$c, boolean);
    Code:
       0: aload_0
       1: invokevirtual #281                // Method n:()Z
       4: ifeq          8
       7: return
       8: aload_0
       9: getfield      #84                 // Field n:Landroid/support/design/widget/r;
      12: invokevirtual #285                // Method android/support/design/widget/r.animate:()Landroid/view/ViewPropertyAnimator;
      15: invokevirtual #290                // Method android/view/ViewPropertyAnimator.cancel:()V
      18: aload_0
      19: invokespecial #292                // Method p:()Z
      22: ifeq          76
      25: aload_0
      26: iconst_1
      27: putfield      #77                 // Field b:I
      30: aload_0
      31: getfield      #84                 // Field n:Landroid/support/design/widget/r;
      34: invokevirtual #285                // Method android/support/design/widget/r.animate:()Landroid/view/ViewPropertyAnimator;
      37: fconst_0
      38: invokevirtual #296                // Method android/view/ViewPropertyAnimator.scaleX:(F)Landroid/view/ViewPropertyAnimator;
      41: fconst_0
      42: invokevirtual #299                // Method android/view/ViewPropertyAnimator.scaleY:(F)Landroid/view/ViewPropertyAnimator;
      45: fconst_0
      46: invokevirtual #302                // Method android/view/ViewPropertyAnimator.alpha:(F)Landroid/view/ViewPropertyAnimator;
      49: ldc2_w        #303                // long 200l
      52: invokevirtual #307                // Method android/view/ViewPropertyAnimator.setDuration:(J)Landroid/view/ViewPropertyAnimator;
      55: getstatic     #57                 // Field android/support/design/widget/a.c:Landroid/view/animation/Interpolator;
      58: invokevirtual #310                // Method android/view/ViewPropertyAnimator.setInterpolator:(Landroid/animation/TimeInterpolator;)Landroid/view/ViewPropertyAnimator;
      61: new           #6                  // class android/support/design/widget/e$1
      64: dup
      65: aload_0
      66: iload_2
      67: aload_1
      68: invokespecial #313                // Method android/support/design/widget/e$1."<init>":(Landroid/support/design/widget/e;ZLandroid/support/design/widget/e$c;)V
      71: invokevirtual #317                // Method android/view/ViewPropertyAnimator.setListener:(Landroid/animation/Animator$AnimatorListener;)Landroid/view/ViewPropertyAnimator;
      74: pop
      75: return
      76: aload_0
      77: getfield      #84                 // Field n:Landroid/support/design/widget/r;
      80: astore        4
      82: iload_2
      83: ifeq          92
      86: bipush        8
      88: istore_3
      89: goto          94
      92: iconst_4
      93: istore_3
      94: aload         4
      96: iload_3
      97: iload_2
      98: invokevirtual #320                // Method android/support/design/widget/r.a:(IZ)V
     101: aload_1
     102: ifnull        111
     105: aload_1
     106: invokeinterface #322,  1          // InterfaceMethod android/support/design/widget/e$c.b:()V
     111: return

  void a(int[]);
    Code:
       0: aload_0
       1: getfield      #91                 // Field p:Landroid/support/design/widget/l;
       4: aload_1
       5: invokevirtual #325                // Method android/support/design/widget/l.a:([I)V
       8: return

  void b();
    Code:
       0: aload_0
       1: getfield      #91                 // Field p:Landroid/support/design/widget/l;
       4: invokevirtual #327                // Method android/support/design/widget/l.a:()V
       7: return

  final void b(float);
    Code:
       0: aload_0
       1: getfield      #220                // Field i:F
       4: fload_1
       5: fcmpl
       6: ifeq          23
       9: aload_0
      10: fload_1
      11: putfield      #220                // Field i:F
      14: aload_0
      15: aload_0
      16: getfield      #184                // Field h:F
      19: fload_1
      20: invokevirtual #223                // Method a:(FF)V
      23: return

  void b(android.graphics.Rect);
    Code:
       0: return

  void b(android.support.design.widget.e$c, boolean);
    Code:
       0: aload_0
       1: invokevirtual #329                // Method m:()Z
       4: ifeq          8
       7: return
       8: aload_0
       9: getfield      #84                 // Field n:Landroid/support/design/widget/r;
      12: invokevirtual #285                // Method android/support/design/widget/r.animate:()Landroid/view/ViewPropertyAnimator;
      15: invokevirtual #290                // Method android/view/ViewPropertyAnimator.cancel:()V
      18: aload_0
      19: invokespecial #292                // Method p:()Z
      22: ifeq          110
      25: aload_0
      26: iconst_2
      27: putfield      #77                 // Field b:I
      30: aload_0
      31: getfield      #84                 // Field n:Landroid/support/design/widget/r;
      34: invokevirtual #332                // Method android/support/design/widget/r.getVisibility:()I
      37: ifeq          64
      40: aload_0
      41: getfield      #84                 // Field n:Landroid/support/design/widget/r;
      44: fconst_0
      45: invokevirtual #335                // Method android/support/design/widget/r.setAlpha:(F)V
      48: aload_0
      49: getfield      #84                 // Field n:Landroid/support/design/widget/r;
      52: fconst_0
      53: invokevirtual #338                // Method android/support/design/widget/r.setScaleY:(F)V
      56: aload_0
      57: getfield      #84                 // Field n:Landroid/support/design/widget/r;
      60: fconst_0
      61: invokevirtual #341                // Method android/support/design/widget/r.setScaleX:(F)V
      64: aload_0
      65: getfield      #84                 // Field n:Landroid/support/design/widget/r;
      68: invokevirtual #285                // Method android/support/design/widget/r.animate:()Landroid/view/ViewPropertyAnimator;
      71: fconst_1
      72: invokevirtual #296                // Method android/view/ViewPropertyAnimator.scaleX:(F)Landroid/view/ViewPropertyAnimator;
      75: fconst_1
      76: invokevirtual #299                // Method android/view/ViewPropertyAnimator.scaleY:(F)Landroid/view/ViewPropertyAnimator;
      79: fconst_1
      80: invokevirtual #302                // Method android/view/ViewPropertyAnimator.alpha:(F)Landroid/view/ViewPropertyAnimator;
      83: ldc2_w        #303                // long 200l
      86: invokevirtual #307                // Method android/view/ViewPropertyAnimator.setDuration:(J)Landroid/view/ViewPropertyAnimator;
      89: getstatic     #343                // Field android/support/design/widget/a.d:Landroid/view/animation/Interpolator;
      92: invokevirtual #310                // Method android/view/ViewPropertyAnimator.setInterpolator:(Landroid/animation/TimeInterpolator;)Landroid/view/ViewPropertyAnimator;
      95: new           #8                  // class android/support/design/widget/e$2
      98: dup
      99: aload_0
     100: iload_2
     101: aload_1
     102: invokespecial #344                // Method android/support/design/widget/e$2."<init>":(Landroid/support/design/widget/e;ZLandroid/support/design/widget/e$c;)V
     105: invokevirtual #317                // Method android/view/ViewPropertyAnimator.setListener:(Landroid/animation/Animator$AnimatorListener;)Landroid/view/ViewPropertyAnimator;
     108: pop
     109: return
     110: aload_0
     111: getfield      #84                 // Field n:Landroid/support/design/widget/r;
     114: iconst_0
     115: iload_2
     116: invokevirtual #320                // Method android/support/design/widget/r.a:(IZ)V
     119: aload_0
     120: getfield      #84                 // Field n:Landroid/support/design/widget/r;
     123: fconst_1
     124: invokevirtual #335                // Method android/support/design/widget/r.setAlpha:(F)V
     127: aload_0
     128: getfield      #84                 // Field n:Landroid/support/design/widget/r;
     131: fconst_1
     132: invokevirtual #338                // Method android/support/design/widget/r.setScaleY:(F)V
     135: aload_0
     136: getfield      #84                 // Field n:Landroid/support/design/widget/r;
     139: fconst_1
     140: invokevirtual #341                // Method android/support/design/widget/r.setScaleX:(F)V
     143: aload_1
     144: ifnull        153
     147: aload_1
     148: invokeinterface #345,  1          // InterfaceMethod android/support/design/widget/e$c.a:()V
     153: return

  final android.graphics.drawable.Drawable c();
    Code:
       0: aload_0
       1: getfield      #259                // Field g:Landroid/graphics/drawable/Drawable;
       4: areturn

  void d();
    Code:
       0: return

  final void e();
    Code:
       0: aload_0
       1: getfield      #82                 // Field r:Landroid/graphics/Rect;
       4: astore_1
       5: aload_0
       6: aload_1
       7: invokevirtual #348                // Method a:(Landroid/graphics/Rect;)V
      10: aload_0
      11: aload_1
      12: invokevirtual #350                // Method b:(Landroid/graphics/Rect;)V
      15: aload_0
      16: getfield      #86                 // Field o:Landroid/support/design/widget/j;
      19: aload_1
      20: getfield      #353                // Field android/graphics/Rect.left:I
      23: aload_1
      24: getfield      #356                // Field android/graphics/Rect.top:I
      27: aload_1
      28: getfield      #359                // Field android/graphics/Rect.right:I
      31: aload_1
      32: getfield      #362                // Field android/graphics/Rect.bottom:I
      35: invokeinterface #363,  5          // InterfaceMethod android/support/design/widget/j.a:(IIII)V
      40: return

  void f();
    Code:
       0: aload_0
       1: invokevirtual #365                // Method h:()Z
       4: ifeq          25
       7: aload_0
       8: invokespecial #367                // Method o:()V
      11: aload_0
      12: getfield      #84                 // Field n:Landroid/support/design/widget/r;
      15: invokevirtual #371                // Method android/support/design/widget/r.getViewTreeObserver:()Landroid/view/ViewTreeObserver;
      18: aload_0
      19: getfield      #144                // Field s:Landroid/view/ViewTreeObserver$OnPreDrawListener;
      22: invokevirtual #377                // Method android/view/ViewTreeObserver.addOnPreDrawListener:(Landroid/view/ViewTreeObserver$OnPreDrawListener;)V
      25: return

  void g();
    Code:
       0: aload_0
       1: getfield      #144                // Field s:Landroid/view/ViewTreeObserver$OnPreDrawListener;
       4: ifnull        26
       7: aload_0
       8: getfield      #84                 // Field n:Landroid/support/design/widget/r;
      11: invokevirtual #371                // Method android/support/design/widget/r.getViewTreeObserver:()Landroid/view/ViewTreeObserver;
      14: aload_0
      15: getfield      #144                // Field s:Landroid/view/ViewTreeObserver$OnPreDrawListener;
      18: invokevirtual #380                // Method android/view/ViewTreeObserver.removeOnPreDrawListener:(Landroid/view/ViewTreeObserver$OnPreDrawListener;)V
      21: aload_0
      22: aconst_null
      23: putfield      #144                // Field s:Landroid/view/ViewTreeObserver$OnPreDrawListener;
      26: return

  boolean h();
    Code:
       0: iconst_1
       1: ireturn

  android.support.design.widget.c i();
    Code:
       0: new           #180                // class android/support/design/widget/c
       3: dup
       4: invokespecial #381                // Method android/support/design/widget/c."<init>":()V
       7: areturn

  void j();
    Code:
       0: aload_0
       1: getfield      #84                 // Field n:Landroid/support/design/widget/r;
       4: invokevirtual #108                // Method android/support/design/widget/r.getRotation:()F
       7: fstore_1
       8: aload_0
       9: getfield      #110                // Field q:F
      12: fload_1
      13: fcmpl
      14: ifeq          26
      17: aload_0
      18: fload_1
      19: putfield      #110                // Field q:F
      22: aload_0
      23: invokespecial #383                // Method q:()V
      26: return

  android.graphics.drawable.GradientDrawable k();
    Code:
       0: aload_0
       1: invokevirtual #385                // Method l:()Landroid/graphics/drawable/GradientDrawable;
       4: astore_1
       5: aload_1
       6: iconst_1
       7: invokevirtual #390                // Method android/graphics/drawable/GradientDrawable.setShape:(I)V
      10: aload_1
      11: iconst_m1
      12: invokevirtual #393                // Method android/graphics/drawable/GradientDrawable.setColor:(I)V
      15: aload_1
      16: areturn

  android.graphics.drawable.GradientDrawable l();
    Code:
       0: new           #387                // class android/graphics/drawable/GradientDrawable
       3: dup
       4: invokespecial #394                // Method android/graphics/drawable/GradientDrawable."<init>":()V
       7: areturn

  boolean m();
    Code:
       0: aload_0
       1: getfield      #84                 // Field n:Landroid/support/design/widget/r;
       4: invokevirtual #332                // Method android/support/design/widget/r.getVisibility:()I
       7: istore_1
       8: iconst_0
       9: istore_3
      10: iconst_0
      11: istore_2
      12: iload_1
      13: ifeq          28
      16: aload_0
      17: getfield      #77                 // Field b:I
      20: iconst_2
      21: if_icmpne     26
      24: iconst_1
      25: istore_2
      26: iload_2
      27: ireturn
      28: iload_3
      29: istore_2
      30: aload_0
      31: getfield      #77                 // Field b:I
      34: iconst_1
      35: if_icmpeq     40
      38: iconst_1
      39: istore_2
      40: iload_2
      41: ireturn

  boolean n();
    Code:
       0: aload_0
       1: getfield      #84                 // Field n:Landroid/support/design/widget/r;
       4: invokevirtual #332                // Method android/support/design/widget/r.getVisibility:()I
       7: istore_1
       8: iconst_0
       9: istore_3
      10: iconst_0
      11: istore_2
      12: iload_1
      13: ifne          28
      16: aload_0
      17: getfield      #77                 // Field b:I
      20: iconst_1
      21: if_icmpne     26
      24: iconst_1
      25: istore_2
      26: iload_2
      27: ireturn
      28: iload_3
      29: istore_2
      30: aload_0
      31: getfield      #77                 // Field b:I
      34: iconst_2
      35: if_icmpeq     40
      38: iconst_1
      39: istore_2
      40: iload_2
      41: ireturn
}
