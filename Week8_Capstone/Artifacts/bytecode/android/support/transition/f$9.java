class android.support.transition.f$9 extends android.animation.AnimatorListenerAdapter {
  final android.view.View a;

  final android.graphics.Rect b;

  final int c;

  final int d;

  final int e;

  final int f;

  final android.support.transition.f g;

  android.support.transition.f$9(android.support.transition.f, android.view.View, android.graphics.Rect, int, int, int, int);
    Code:
       0: aload_0
       1: aload_1
       2: putfield      #25                 // Field g:Landroid/support/transition/f;
       5: aload_0
       6: aload_2
       7: putfield      #27                 // Field a:Landroid/view/View;
      10: aload_0
      11: aload_3
      12: putfield      #29                 // Field b:Landroid/graphics/Rect;
      15: aload_0
      16: iload         4
      18: putfield      #31                 // Field c:I
      21: aload_0
      22: iload         5
      24: putfield      #33                 // Field d:I
      27: aload_0
      28: iload         6
      30: putfield      #35                 // Field e:I
      33: aload_0
      34: iload         7
      36: putfield      #37                 // Field f:I
      39: aload_0
      40: invokespecial #40                 // Method android/animation/AnimatorListenerAdapter."<init>":()V
      43: return

  public void onAnimationCancel(android.animation.Animator);
    Code:
       0: aload_0
       1: iconst_1
       2: putfield      #45                 // Field h:Z
       5: return

  public void onAnimationEnd(android.animation.Animator);
    Code:
       0: aload_0
       1: getfield      #45                 // Field h:Z
       4: ifne          41
       7: aload_0
       8: getfield      #27                 // Field a:Landroid/view/View;
      11: aload_0
      12: getfield      #29                 // Field b:Landroid/graphics/Rect;
      15: invokestatic  #51                 // Method android/support/v4/view/s.a:(Landroid/view/View;Landroid/graphics/Rect;)V
      18: aload_0
      19: getfield      #27                 // Field a:Landroid/view/View;
      22: aload_0
      23: getfield      #31                 // Field c:I
      26: aload_0
      27: getfield      #33                 // Field d:I
      30: aload_0
      31: getfield      #35                 // Field e:I
      34: aload_0
      35: getfield      #37                 // Field f:I
      38: invokestatic  #56                 // Method android/support/transition/am.a:(Landroid/view/View;IIII)V
      41: return
}
