class android.support.design.widget.q {
  static {};
    Code:
       0: iconst_1
       1: newarray       int
       3: dup
       4: iconst_0
       5: ldc           #9                  // int 16843848
       7: iastore
       8: putstatic     #11                 // Field a:[I
      11: return

  static void a(android.view.View);
    Code:
       0: aload_0
       1: getstatic     #19                 // Field android/view/ViewOutlineProvider.BOUNDS:Landroid/view/ViewOutlineProvider;
       4: invokevirtual #25                 // Method android/view/View.setOutlineProvider:(Landroid/view/ViewOutlineProvider;)V
       7: return

  static void a(android.view.View, float);
    Code:
       0: aload_0
       1: invokevirtual #30                 // Method android/view/View.getResources:()Landroid/content/res/Resources;
       4: getstatic     #36                 // Field android/support/design/a$g.app_bar_elevation_anim_duration:I
       7: invokevirtual #42                 // Method android/content/res/Resources.getInteger:(I)I
      10: istore_2
      11: new           #44                 // class android/animation/StateListAnimator
      14: dup
      15: invokespecial #47                 // Method android/animation/StateListAnimator."<init>":()V
      18: astore        7
      20: getstatic     #52                 // Field android/support/design/a$b.state_collapsible:I
      23: istore_3
      24: getstatic     #55                 // Field android/support/design/a$b.state_collapsed:I
      27: ineg
      28: istore        4
      30: aload_0
      31: ldc           #57                 // String elevation
      33: iconst_1
      34: newarray       float
      36: dup
      37: iconst_0
      38: fconst_0
      39: fastore
      40: invokestatic  #63                 // Method android/animation/ObjectAnimator.ofFloat:(Ljava/lang/Object;Ljava/lang/String;[F)Landroid/animation/ObjectAnimator;
      43: astore        8
      45: iload_2
      46: i2l
      47: lstore        5
      49: aload         8
      51: lload         5
      53: invokevirtual #67                 // Method android/animation/ObjectAnimator.setDuration:(J)Landroid/animation/ObjectAnimator;
      56: astore        8
      58: aload         7
      60: iconst_3
      61: newarray       int
      63: dup
      64: iconst_0
      65: ldc           #68                 // int 16842766
      67: iastore
      68: dup
      69: iconst_1
      70: iload_3
      71: iastore
      72: dup
      73: iconst_2
      74: iload         4
      76: iastore
      77: aload         8
      79: invokevirtual #72                 // Method android/animation/StateListAnimator.addState:([ILandroid/animation/Animator;)V
      82: aload_0
      83: ldc           #57                 // String elevation
      85: iconst_1
      86: newarray       float
      88: dup
      89: iconst_0
      90: fload_1
      91: fastore
      92: invokestatic  #63                 // Method android/animation/ObjectAnimator.ofFloat:(Ljava/lang/Object;Ljava/lang/String;[F)Landroid/animation/ObjectAnimator;
      95: lload         5
      97: invokevirtual #67                 // Method android/animation/ObjectAnimator.setDuration:(J)Landroid/animation/ObjectAnimator;
     100: astore        8
     102: aload         7
     104: iconst_1
     105: newarray       int
     107: dup
     108: iconst_0
     109: ldc           #68                 // int 16842766
     111: iastore
     112: aload         8
     114: invokevirtual #72                 // Method android/animation/StateListAnimator.addState:([ILandroid/animation/Animator;)V
     117: aload_0
     118: ldc           #57                 // String elevation
     120: iconst_1
     121: newarray       float
     123: dup
     124: iconst_0
     125: fconst_0
     126: fastore
     127: invokestatic  #63                 // Method android/animation/ObjectAnimator.ofFloat:(Ljava/lang/Object;Ljava/lang/String;[F)Landroid/animation/ObjectAnimator;
     130: lconst_0
     131: invokevirtual #67                 // Method android/animation/ObjectAnimator.setDuration:(J)Landroid/animation/ObjectAnimator;
     134: astore        8
     136: aload         7
     138: iconst_0
     139: newarray       int
     141: aload         8
     143: invokevirtual #72                 // Method android/animation/StateListAnimator.addState:([ILandroid/animation/Animator;)V
     146: aload_0
     147: aload         7
     149: invokevirtual #76                 // Method android/view/View.setStateListAnimator:(Landroid/animation/StateListAnimator;)V
     152: return

  static void a(android.view.View, android.util.AttributeSet, int, int);
    Code:
       0: aload_0
       1: invokevirtual #81                 // Method android/view/View.getContext:()Landroid/content/Context;
       4: astore        4
       6: aload         4
       8: aload_1
       9: getstatic     #11                 // Field a:[I
      12: iload_2
      13: iload_3
      14: invokevirtual #87                 // Method android/content/Context.obtainStyledAttributes:(Landroid/util/AttributeSet;[III)Landroid/content/res/TypedArray;
      17: astore_1
      18: aload_1
      19: iconst_0
      20: invokevirtual #93                 // Method android/content/res/TypedArray.hasValue:(I)Z
      23: ifeq          41
      26: aload_0
      27: aload         4
      29: aload_1
      30: iconst_0
      31: iconst_0
      32: invokevirtual #97                 // Method android/content/res/TypedArray.getResourceId:(II)I
      35: invokestatic  #103                // Method android/animation/AnimatorInflater.loadStateListAnimator:(Landroid/content/Context;I)Landroid/animation/StateListAnimator;
      38: invokevirtual #76                 // Method android/view/View.setStateListAnimator:(Landroid/animation/StateListAnimator;)V
      41: aload_1
      42: invokevirtual #106                // Method android/content/res/TypedArray.recycle:()V
      45: return
      46: astore_0
      47: aload_1
      48: invokevirtual #106                // Method android/content/res/TypedArray.recycle:()V
      51: aload_0
      52: athrow
    Exception table:
       from    to  target type
          18    41    46   any
}
