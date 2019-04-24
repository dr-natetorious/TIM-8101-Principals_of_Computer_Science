class android.support.transition.ag implements android.support.transition.ai {
  android.support.transition.ag();
    Code:
       0: aload_0
       1: invokespecial #21                 // Method java/lang/Object."<init>":()V
       4: return

  public android.support.transition.ae a(android.view.ViewGroup);
    Code:
       0: aload_1
       1: invokestatic  #71                 // Method android/support/transition/ac.a:(Landroid/view/ViewGroup;)Landroid/support/transition/ac;
       4: areturn

  public void a(android.view.ViewGroup, boolean);
    Code:
       0: getstatic     #76                 // Field a:Landroid/animation/LayoutTransition;
       3: astore        5
       5: iconst_0
       6: istore        4
       8: iconst_0
       9: istore_3
      10: aload         5
      12: ifnonnull     66
      15: new           #8                  // class android/support/transition/ag$1
      18: dup
      19: aload_0
      20: invokespecial #79                 // Method android/support/transition/ag$1."<init>":(Landroid/support/transition/ag;)V
      23: putstatic     #76                 // Field a:Landroid/animation/LayoutTransition;
      26: getstatic     #76                 // Field a:Landroid/animation/LayoutTransition;
      29: iconst_2
      30: aconst_null
      31: invokevirtual #83                 // Method android/animation/LayoutTransition.setAnimator:(ILandroid/animation/Animator;)V
      34: getstatic     #76                 // Field a:Landroid/animation/LayoutTransition;
      37: iconst_0
      38: aconst_null
      39: invokevirtual #83                 // Method android/animation/LayoutTransition.setAnimator:(ILandroid/animation/Animator;)V
      42: getstatic     #76                 // Field a:Landroid/animation/LayoutTransition;
      45: iconst_1
      46: aconst_null
      47: invokevirtual #83                 // Method android/animation/LayoutTransition.setAnimator:(ILandroid/animation/Animator;)V
      50: getstatic     #76                 // Field a:Landroid/animation/LayoutTransition;
      53: iconst_3
      54: aconst_null
      55: invokevirtual #83                 // Method android/animation/LayoutTransition.setAnimator:(ILandroid/animation/Animator;)V
      58: getstatic     #76                 // Field a:Landroid/animation/LayoutTransition;
      61: iconst_4
      62: aconst_null
      63: invokevirtual #83                 // Method android/animation/LayoutTransition.setAnimator:(ILandroid/animation/Animator;)V
      66: iload_2
      67: ifeq          123
      70: aload_1
      71: invokevirtual #89                 // Method android/view/ViewGroup.getLayoutTransition:()Landroid/animation/LayoutTransition;
      74: astore        5
      76: aload         5
      78: ifnull        111
      81: aload         5
      83: invokevirtual #93                 // Method android/animation/LayoutTransition.isRunning:()Z
      86: ifeq          94
      89: aload         5
      91: invokestatic  #95                 // Method a:(Landroid/animation/LayoutTransition;)V
      94: aload         5
      96: getstatic     #76                 // Field a:Landroid/animation/LayoutTransition;
      99: if_acmpeq     111
     102: aload_1
     103: getstatic     #101                // Field android/support/transition/r$a.transition_layout_save:I
     106: aload         5
     108: invokevirtual #105                // Method android/view/ViewGroup.setTag:(ILjava/lang/Object;)V
     111: getstatic     #76                 // Field a:Landroid/animation/LayoutTransition;
     114: astore        5
     116: aload_1
     117: aload         5
     119: invokevirtual #108                // Method android/view/ViewGroup.setLayoutTransition:(Landroid/animation/LayoutTransition;)V
     122: return
     123: aload_1
     124: aconst_null
     125: invokevirtual #108                // Method android/view/ViewGroup.setLayoutTransition:(Landroid/animation/LayoutTransition;)V
     128: getstatic     #110                // Field c:Z
     131: ifne          166
     134: ldc           #85                 // class android/view/ViewGroup
     136: ldc           #112                // String mLayoutSuppressed
     138: invokevirtual #116                // Method java/lang/Class.getDeclaredField:(Ljava/lang/String;)Ljava/lang/reflect/Field;
     141: putstatic     #118                // Field b:Ljava/lang/reflect/Field;
     144: getstatic     #118                // Field b:Ljava/lang/reflect/Field;
     147: iconst_1
     148: invokevirtual #121                // Method java/lang/reflect/Field.setAccessible:(Z)V
     151: goto          162
     154: ldc           #51                 // String ViewGroupUtilsApi14
     156: ldc           #123                // String Failed to access mLayoutSuppressed field by reflection
     158: invokestatic  #59                 // Method android/util/Log.i:(Ljava/lang/String;Ljava/lang/String;)I
     161: pop
     162: iconst_1
     163: putstatic     #110                // Field c:Z
     166: iload         4
     168: istore_2
     169: getstatic     #118                // Field b:Ljava/lang/reflect/Field;
     172: ifnull        212
     175: getstatic     #118                // Field b:Ljava/lang/reflect/Field;
     178: aload_1
     179: invokevirtual #127                // Method java/lang/reflect/Field.getBoolean:(Ljava/lang/Object;)Z
     182: istore_2
     183: iload_2
     184: ifeq          201
     187: getstatic     #118                // Field b:Ljava/lang/reflect/Field;
     190: aload_1
     191: iconst_0
     192: invokevirtual #131                // Method java/lang/reflect/Field.setBoolean:(Ljava/lang/Object;Z)V
     195: goto          201
     198: goto          204
     201: goto          212
     204: ldc           #51                 // String ViewGroupUtilsApi14
     206: ldc           #133                // String Failed to get mLayoutSuppressed field by reflection
     208: invokestatic  #59                 // Method android/util/Log.i:(Ljava/lang/String;Ljava/lang/String;)I
     211: pop
     212: iload_2
     213: ifeq          220
     216: aload_1
     217: invokevirtual #136                // Method android/view/ViewGroup.requestLayout:()V
     220: aload_1
     221: getstatic     #101                // Field android/support/transition/r$a.transition_layout_save:I
     224: invokevirtual #140                // Method android/view/ViewGroup.getTag:(I)Ljava/lang/Object;
     227: checkcast     #33                 // class android/animation/LayoutTransition
     230: astore        5
     232: aload         5
     234: ifnull        248
     237: aload_1
     238: getstatic     #101                // Field android/support/transition/r$a.transition_layout_save:I
     241: aconst_null
     242: invokevirtual #105                // Method android/view/ViewGroup.setTag:(ILjava/lang/Object;)V
     245: goto          116
     248: return
     249: astore        5
     251: goto          154
     254: astore        5
     256: iload_3
     257: istore_2
     258: goto          204
     261: astore        5
     263: goto          198
    Exception table:
       from    to  target type
         134   151   249   Class java/lang/NoSuchFieldException
         175   183   254   Class java/lang/IllegalAccessException
         187   195   261   Class java/lang/IllegalAccessException
}
