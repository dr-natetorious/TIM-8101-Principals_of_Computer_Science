class android.support.c.a.c$a extends android.graphics.drawable.Drawable$ConstantState {
  int a;

  android.support.c.a.i b;

  android.animation.AnimatorSet c;

  android.support.v4.g.a<android.animation.Animator, java.lang.String> d;

  public android.support.c.a.c$a(android.content.Context, android.support.c.a.c$a, android.graphics.drawable.Drawable$Callback, android.content.res.Resources);
    Code:
       0: aload_0
       1: invokespecial #23                 // Method android/graphics/drawable/Drawable$ConstantState."<init>":()V
       4: aload_2
       5: ifnull        234
       8: aload_0
       9: aload_2
      10: getfield      #25                 // Field a:I
      13: putfield      #25                 // Field a:I
      16: aload_2
      17: getfield      #27                 // Field b:Landroid/support/c/a/i;
      20: astore_1
      21: iconst_0
      22: istore        5
      24: aload_1
      25: ifnull        111
      28: aload_2
      29: getfield      #27                 // Field b:Landroid/support/c/a/i;
      32: invokevirtual #33                 // Method android/support/c/a/i.getConstantState:()Landroid/graphics/drawable/Drawable$ConstantState;
      35: astore_1
      36: aload         4
      38: ifnull        59
      41: aload_1
      42: aload         4
      44: invokevirtual #37                 // Method android/graphics/drawable/Drawable$ConstantState.newDrawable:(Landroid/content/res/Resources;)Landroid/graphics/drawable/Drawable;
      47: astore_1
      48: aload_0
      49: aload_1
      50: checkcast     #29                 // class android/support/c/a/i
      53: putfield      #27                 // Field b:Landroid/support/c/a/i;
      56: goto          67
      59: aload_1
      60: invokevirtual #40                 // Method android/graphics/drawable/Drawable$ConstantState.newDrawable:()Landroid/graphics/drawable/Drawable;
      63: astore_1
      64: goto          48
      67: aload_0
      68: aload_0
      69: getfield      #27                 // Field b:Landroid/support/c/a/i;
      72: invokevirtual #43                 // Method android/support/c/a/i.mutate:()Landroid/graphics/drawable/Drawable;
      75: checkcast     #29                 // class android/support/c/a/i
      78: putfield      #27                 // Field b:Landroid/support/c/a/i;
      81: aload_0
      82: getfield      #27                 // Field b:Landroid/support/c/a/i;
      85: aload_3
      86: invokevirtual #47                 // Method android/support/c/a/i.setCallback:(Landroid/graphics/drawable/Drawable$Callback;)V
      89: aload_0
      90: getfield      #27                 // Field b:Landroid/support/c/a/i;
      93: aload_2
      94: getfield      #27                 // Field b:Landroid/support/c/a/i;
      97: invokevirtual #51                 // Method android/support/c/a/i.getBounds:()Landroid/graphics/Rect;
     100: invokevirtual #55                 // Method android/support/c/a/i.setBounds:(Landroid/graphics/Rect;)V
     103: aload_0
     104: getfield      #27                 // Field b:Landroid/support/c/a/i;
     107: iconst_0
     108: invokevirtual #58                 // Method android/support/c/a/i.a:(Z)V
     111: aload_2
     112: getfield      #60                 // Field e:Ljava/util/ArrayList;
     115: ifnull        234
     118: aload_2
     119: getfield      #60                 // Field e:Ljava/util/ArrayList;
     122: invokevirtual #66                 // Method java/util/ArrayList.size:()I
     125: istore        6
     127: aload_0
     128: new           #62                 // class java/util/ArrayList
     131: dup
     132: iload         6
     134: invokespecial #69                 // Method java/util/ArrayList."<init>":(I)V
     137: putfield      #60                 // Field e:Ljava/util/ArrayList;
     140: aload_0
     141: new           #71                 // class android/support/v4/g/a
     144: dup
     145: iload         6
     147: invokespecial #72                 // Method android/support/v4/g/a."<init>":(I)V
     150: putfield      #74                 // Field d:Landroid/support/v4/g/a;
     153: iload         5
     155: iload         6
     157: if_icmpge     230
     160: aload_2
     161: getfield      #60                 // Field e:Ljava/util/ArrayList;
     164: iload         5
     166: invokevirtual #78                 // Method java/util/ArrayList.get:(I)Ljava/lang/Object;
     169: checkcast     #80                 // class android/animation/Animator
     172: astore_3
     173: aload_3
     174: invokevirtual #84                 // Method android/animation/Animator.clone:()Landroid/animation/Animator;
     177: astore_1
     178: aload_2
     179: getfield      #74                 // Field d:Landroid/support/v4/g/a;
     182: aload_3
     183: invokevirtual #87                 // Method android/support/v4/g/a.get:(Ljava/lang/Object;)Ljava/lang/Object;
     186: checkcast     #89                 // class java/lang/String
     189: astore_3
     190: aload_1
     191: aload_0
     192: getfield      #27                 // Field b:Landroid/support/c/a/i;
     195: aload_3
     196: invokevirtual #92                 // Method android/support/c/a/i.a:(Ljava/lang/String;)Ljava/lang/Object;
     199: invokevirtual #96                 // Method android/animation/Animator.setTarget:(Ljava/lang/Object;)V
     202: aload_0
     203: getfield      #60                 // Field e:Ljava/util/ArrayList;
     206: aload_1
     207: invokevirtual #100                // Method java/util/ArrayList.add:(Ljava/lang/Object;)Z
     210: pop
     211: aload_0
     212: getfield      #74                 // Field d:Landroid/support/v4/g/a;
     215: aload_1
     216: aload_3
     217: invokevirtual #104                // Method android/support/v4/g/a.put:(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
     220: pop
     221: iload         5
     223: iconst_1
     224: iadd
     225: istore        5
     227: goto          153
     230: aload_0
     231: invokevirtual #106                // Method a:()V
     234: return

  static java.util.ArrayList a(android.support.c.a.c$a);
    Code:
       0: aload_0
       1: getfield      #60                 // Field e:Ljava/util/ArrayList;
       4: areturn

  static java.util.ArrayList a(android.support.c.a.c$a, java.util.ArrayList);
    Code:
       0: aload_0
       1: aload_1
       2: putfield      #60                 // Field e:Ljava/util/ArrayList;
       5: aload_1
       6: areturn

  public void a();
    Code:
       0: aload_0
       1: getfield      #111                // Field c:Landroid/animation/AnimatorSet;
       4: ifnonnull     18
       7: aload_0
       8: new           #113                // class android/animation/AnimatorSet
      11: dup
      12: invokespecial #114                // Method android/animation/AnimatorSet."<init>":()V
      15: putfield      #111                // Field c:Landroid/animation/AnimatorSet;
      18: aload_0
      19: getfield      #111                // Field c:Landroid/animation/AnimatorSet;
      22: aload_0
      23: getfield      #60                 // Field e:Ljava/util/ArrayList;
      26: invokevirtual #118                // Method android/animation/AnimatorSet.playTogether:(Ljava/util/Collection;)V
      29: return

  public int getChangingConfigurations();
    Code:
       0: aload_0
       1: getfield      #25                 // Field a:I
       4: ireturn

  public android.graphics.drawable.Drawable newDrawable();
    Code:
       0: new           #121                // class java/lang/IllegalStateException
       3: dup
       4: ldc           #123                // String No constant state support for SDK < 24.
       6: invokespecial #126                // Method java/lang/IllegalStateException."<init>":(Ljava/lang/String;)V
       9: athrow

  public android.graphics.drawable.Drawable newDrawable(android.content.res.Resources);
    Code:
       0: new           #121                // class java/lang/IllegalStateException
       3: dup
       4: ldc           #123                // String No constant state support for SDK < 24.
       6: invokespecial #126                // Method java/lang/IllegalStateException."<init>":(Ljava/lang/String;)V
       9: athrow
}
