public abstract class android.support.design.widget.b<B extends android.support.design.widget.b<B>> {
  static final android.os.Handler a;

  final android.support.design.widget.b$f b;

  final android.support.design.widget.k$a c;

  static {};
    Code:
       0: getstatic     #64                 // Field android/os/Build$VERSION.SDK_INT:I
       3: bipush        16
       5: if_icmplt     21
       8: getstatic     #64                 // Field android/os/Build$VERSION.SDK_INT:I
      11: bipush        19
      13: if_icmpgt     21
      16: iconst_1
      17: istore_0
      18: goto          23
      21: iconst_0
      22: istore_0
      23: iload_0
      24: putstatic     #66                 // Field d:Z
      27: new           #68                 // class android/os/Handler
      30: dup
      31: invokestatic  #74                 // Method android/os/Looper.getMainLooper:()Landroid/os/Looper;
      34: new           #7                  // class android/support/design/widget/b$1
      37: dup
      38: invokespecial #77                 // Method android/support/design/widget/b$1."<init>":()V
      41: invokespecial #80                 // Method android/os/Handler."<init>":(Landroid/os/Looper;Landroid/os/Handler$Callback;)V
      44: putstatic     #82                 // Field a:Landroid/os/Handler;
      47: return

  static android.support.design.widget.b$c a(android.support.design.widget.b);
    Code:
       0: aload_0
       1: getfield      #86                 // Field f:Landroid/support/design/widget/b$c;
       4: areturn

  static boolean f();
    Code:
       0: getstatic     #66                 // Field d:Z
       3: ireturn

  void a(int);
    Code:
       0: invokestatic  #170                // Method android/support/design/widget/k.a:()Landroid/support/design/widget/k;
       3: aload_0
       4: getfield      #172                // Field c:Landroid/support/design/widget/k$a;
       7: iload_1
       8: invokevirtual #175                // Method android/support/design/widget/k.a:(Landroid/support/design/widget/k$a;I)V
      11: return

  public boolean a();
    Code:
       0: invokestatic  #170                // Method android/support/design/widget/k.a:()Landroid/support/design/widget/k;
       3: aload_0
       4: getfield      #172                // Field c:Landroid/support/design/widget/k$a;
       7: invokevirtual #178                // Method android/support/design/widget/k.e:(Landroid/support/design/widget/k$a;)Z
      10: ireturn

  final void b();
    Code:
       0: aload_0
       1: getfield      #92                 // Field b:Landroid/support/design/widget/b$f;
       4: invokevirtual #182                // Method android/support/design/widget/b$f.getParent:()Landroid/view/ViewParent;
       7: ifnonnull     90
      10: aload_0
      11: getfield      #92                 // Field b:Landroid/support/design/widget/b$f;
      14: invokevirtual #186                // Method android/support/design/widget/b$f.getLayoutParams:()Landroid/view/ViewGroup$LayoutParams;
      17: astore_1
      18: aload_1
      19: instanceof    #188                // class android/support/design/widget/CoordinatorLayout$e
      22: ifeq          79
      25: aload_1
      26: checkcast     #188                // class android/support/design/widget/CoordinatorLayout$e
      29: astore_1
      30: new           #32                 // class android/support/design/widget/b$b
      33: dup
      34: aload_0
      35: invokespecial #189                // Method android/support/design/widget/b$b."<init>":(Landroid/support/design/widget/b;)V
      38: astore_2
      39: aload_2
      40: ldc           #190                // float 0.1f
      42: invokevirtual #193                // Method android/support/design/widget/b$b.a:(F)V
      45: aload_2
      46: ldc           #194                // float 0.6f
      48: invokevirtual #196                // Method android/support/design/widget/b$b.b:(F)V
      51: aload_2
      52: iconst_0
      53: invokevirtual #198                // Method android/support/design/widget/b$b.a:(I)V
      56: aload_2
      57: new           #17                 // class android/support/design/widget/b$5
      60: dup
      61: aload_0
      62: invokespecial #199                // Method android/support/design/widget/b$5."<init>":(Landroid/support/design/widget/b;)V
      65: invokevirtual #202                // Method android/support/design/widget/b$b.a:(Landroid/support/design/widget/SwipeDismissBehavior$a;)V
      68: aload_1
      69: aload_2
      70: invokevirtual #205                // Method android/support/design/widget/CoordinatorLayout$e.a:(Landroid/support/design/widget/CoordinatorLayout$b;)V
      73: aload_1
      74: bipush        80
      76: putfield      #207                // Field android/support/design/widget/CoordinatorLayout$e.g:I
      79: aload_0
      80: getfield      #209                // Field e:Landroid/view/ViewGroup;
      83: aload_0
      84: getfield      #92                 // Field b:Landroid/support/design/widget/b$f;
      87: invokevirtual #215                // Method android/view/ViewGroup.addView:(Landroid/view/View;)V
      90: aload_0
      91: getfield      #92                 // Field b:Landroid/support/design/widget/b$f;
      94: new           #19                 // class android/support/design/widget/b$6
      97: dup
      98: aload_0
      99: invokespecial #216                // Method android/support/design/widget/b$6."<init>":(Landroid/support/design/widget/b;)V
     102: invokevirtual #220                // Method android/support/design/widget/b$f.setOnAttachStateChangeListener:(Landroid/support/design/widget/b$d;)V
     105: aload_0
     106: getfield      #92                 // Field b:Landroid/support/design/widget/b$f;
     109: invokestatic  #226                // Method android/support/v4/view/s.w:(Landroid/view/View;)Z
     112: ifeq          132
     115: aload_0
     116: invokevirtual #228                // Method e:()Z
     119: ifeq          127
     122: aload_0
     123: invokevirtual #230                // Method c:()V
     126: return
     127: aload_0
     128: invokevirtual #232                // Method d:()V
     131: return
     132: aload_0
     133: getfield      #92                 // Field b:Landroid/support/design/widget/b$f;
     136: new           #23                 // class android/support/design/widget/b$7
     139: dup
     140: aload_0
     141: invokespecial #233                // Method android/support/design/widget/b$7."<init>":(Landroid/support/design/widget/b;)V
     144: invokevirtual #237                // Method android/support/design/widget/b$f.setOnLayoutChangeListener:(Landroid/support/design/widget/b$e;)V
     147: return

  final void b(int);
    Code:
       0: aload_0
       1: invokevirtual #228                // Method e:()Z
       4: ifeq          23
       7: aload_0
       8: getfield      #92                 // Field b:Landroid/support/design/widget/b$f;
      11: invokevirtual #240                // Method android/support/design/widget/b$f.getVisibility:()I
      14: ifne          23
      17: aload_0
      18: iload_1
      19: invokespecial #242                // Method d:(I)V
      22: return
      23: aload_0
      24: iload_1
      25: invokevirtual #244                // Method c:(I)V
      28: return

  void c();
    Code:
       0: getstatic     #64                 // Field android/os/Build$VERSION.SDK_INT:I
       3: bipush        12
       5: if_icmplt     110
       8: aload_0
       9: getfield      #92                 // Field b:Landroid/support/design/widget/b$f;
      12: invokevirtual #96                 // Method android/support/design/widget/b$f.getHeight:()I
      15: istore_1
      16: getstatic     #66                 // Field d:Z
      19: ifeq          33
      22: aload_0
      23: getfield      #92                 // Field b:Landroid/support/design/widget/b$f;
      26: iload_1
      27: invokestatic  #247                // Method android/support/v4/view/s.b:(Landroid/view/View;I)V
      30: goto          42
      33: aload_0
      34: getfield      #92                 // Field b:Landroid/support/design/widget/b$f;
      37: iload_1
      38: i2f
      39: invokevirtual #250                // Method android/support/design/widget/b$f.setTranslationY:(F)V
      42: new           #89                 // class android/animation/ValueAnimator
      45: dup
      46: invokespecial #90                 // Method android/animation/ValueAnimator."<init>":()V
      49: astore_2
      50: aload_2
      51: iconst_2
      52: newarray       int
      54: dup
      55: iconst_0
      56: iload_1
      57: iastore
      58: dup
      59: iconst_1
      60: iconst_0
      61: iastore
      62: invokevirtual #100                // Method android/animation/ValueAnimator.setIntValues:([I)V
      65: aload_2
      66: getstatic     #105                // Field android/support/design/widget/a.b:Landroid/view/animation/Interpolator;
      69: invokevirtual #109                // Method android/animation/ValueAnimator.setInterpolator:(Landroid/animation/TimeInterpolator;)V
      72: aload_2
      73: ldc2_w        #110                // long 250l
      76: invokevirtual #115                // Method android/animation/ValueAnimator.setDuration:(J)Landroid/animation/ValueAnimator;
      79: pop
      80: aload_2
      81: new           #25                 // class android/support/design/widget/b$8
      84: dup
      85: aload_0
      86: invokespecial #251                // Method android/support/design/widget/b$8."<init>":(Landroid/support/design/widget/b;)V
      89: invokevirtual #122                // Method android/animation/ValueAnimator.addListener:(Landroid/animation/Animator$AnimatorListener;)V
      92: aload_2
      93: new           #27                 // class android/support/design/widget/b$9
      96: dup
      97: aload_0
      98: iload_1
      99: invokespecial #252                // Method android/support/design/widget/b$9."<init>":(Landroid/support/design/widget/b;I)V
     102: invokevirtual #129                // Method android/animation/ValueAnimator.addUpdateListener:(Landroid/animation/ValueAnimator$AnimatorUpdateListener;)V
     105: aload_2
     106: invokevirtual #132                // Method android/animation/ValueAnimator.start:()V
     109: return
     110: aload_0
     111: getfield      #92                 // Field b:Landroid/support/design/widget/b$f;
     114: invokevirtual #136                // Method android/support/design/widget/b$f.getContext:()Landroid/content/Context;
     117: getstatic     #255                // Field android/support/design/a$a.design_snackbar_in:I
     120: invokestatic  #147                // Method android/view/animation/AnimationUtils.loadAnimation:(Landroid/content/Context;I)Landroid/view/animation/Animation;
     123: astore_2
     124: aload_2
     125: getstatic     #105                // Field android/support/design/widget/a.b:Landroid/view/animation/Interpolator;
     128: invokevirtual #152                // Method android/view/animation/Animation.setInterpolator:(Landroid/view/animation/Interpolator;)V
     131: aload_2
     132: ldc2_w        #110                // long 250l
     135: invokevirtual #155                // Method android/view/animation/Animation.setDuration:(J)V
     138: aload_2
     139: new           #9                  // class android/support/design/widget/b$10
     142: dup
     143: aload_0
     144: invokespecial #256                // Method android/support/design/widget/b$10."<init>":(Landroid/support/design/widget/b;)V
     147: invokevirtual #160                // Method android/view/animation/Animation.setAnimationListener:(Landroid/view/animation/Animation$AnimationListener;)V
     150: aload_0
     151: getfield      #92                 // Field b:Landroid/support/design/widget/b$f;
     154: aload_2
     155: invokevirtual #164                // Method android/support/design/widget/b$f.startAnimation:(Landroid/view/animation/Animation;)V
     158: return

  void c(int);
    Code:
       0: invokestatic  #170                // Method android/support/design/widget/k.a:()Landroid/support/design/widget/k;
       3: aload_0
       4: getfield      #172                // Field c:Landroid/support/design/widget/k$a;
       7: invokevirtual #259                // Method android/support/design/widget/k.a:(Landroid/support/design/widget/k$a;)V
      10: aload_0
      11: getfield      #261                // Field g:Ljava/util/List;
      14: ifnull        58
      17: aload_0
      18: getfield      #261                // Field g:Ljava/util/List;
      21: invokeinterface #266,  1          // InterfaceMethod java/util/List.size:()I
      26: iconst_1
      27: isub
      28: istore_2
      29: iload_2
      30: iflt          58
      33: aload_0
      34: getfield      #261                // Field g:Ljava/util/List;
      37: iload_2
      38: invokeinterface #270,  2          // InterfaceMethod java/util/List.get:(I)Ljava/lang/Object;
      43: checkcast     #29                 // class android/support/design/widget/b$a
      46: aload_0
      47: iload_1
      48: invokevirtual #273                // Method android/support/design/widget/b$a.a:(Ljava/lang/Object;I)V
      51: iload_2
      52: iconst_1
      53: isub
      54: istore_2
      55: goto          29
      58: getstatic     #64                 // Field android/os/Build$VERSION.SDK_INT:I
      61: bipush        11
      63: if_icmpge     75
      66: aload_0
      67: getfield      #92                 // Field b:Landroid/support/design/widget/b$f;
      70: bipush        8
      72: invokevirtual #276                // Method android/support/design/widget/b$f.setVisibility:(I)V
      75: aload_0
      76: getfield      #92                 // Field b:Landroid/support/design/widget/b$f;
      79: invokevirtual #182                // Method android/support/design/widget/b$f.getParent:()Landroid/view/ViewParent;
      82: astore_3
      83: aload_3
      84: instanceof    #211                // class android/view/ViewGroup
      87: ifeq          101
      90: aload_3
      91: checkcast     #211                // class android/view/ViewGroup
      94: aload_0
      95: getfield      #92                 // Field b:Landroid/support/design/widget/b$f;
      98: invokevirtual #279                // Method android/view/ViewGroup.removeView:(Landroid/view/View;)V
     101: return

  void d();
    Code:
       0: invokestatic  #170                // Method android/support/design/widget/k.a:()Landroid/support/design/widget/k;
       3: aload_0
       4: getfield      #172                // Field c:Landroid/support/design/widget/k$a;
       7: invokevirtual #281                // Method android/support/design/widget/k.b:(Landroid/support/design/widget/k$a;)V
      10: aload_0
      11: getfield      #261                // Field g:Ljava/util/List;
      14: ifnull        57
      17: aload_0
      18: getfield      #261                // Field g:Ljava/util/List;
      21: invokeinterface #266,  1          // InterfaceMethod java/util/List.size:()I
      26: iconst_1
      27: isub
      28: istore_1
      29: iload_1
      30: iflt          57
      33: aload_0
      34: getfield      #261                // Field g:Ljava/util/List;
      37: iload_1
      38: invokeinterface #270,  2          // InterfaceMethod java/util/List.get:(I)Ljava/lang/Object;
      43: checkcast     #29                 // class android/support/design/widget/b$a
      46: aload_0
      47: invokevirtual #284                // Method android/support/design/widget/b$a.a:(Ljava/lang/Object;)V
      50: iload_1
      51: iconst_1
      52: isub
      53: istore_1
      54: goto          29
      57: return

  boolean e();
    Code:
       0: aload_0
       1: getfield      #286                // Field h:Landroid/view/accessibility/AccessibilityManager;
       4: invokevirtual #291                // Method android/view/accessibility/AccessibilityManager.isEnabled:()Z
       7: iconst_1
       8: ixor
       9: ireturn
}
