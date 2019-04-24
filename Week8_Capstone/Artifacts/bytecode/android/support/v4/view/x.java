public final class android.support.v4.view.x {
  java.lang.Runnable a;

  java.lang.Runnable b;

  int c;

  android.support.v4.view.x(android.view.View);
    Code:
       0: aload_0
       1: invokespecial #23                 // Method java/lang/Object."<init>":()V
       4: aload_0
       5: aconst_null
       6: putfield      #25                 // Field a:Ljava/lang/Runnable;
       9: aload_0
      10: aconst_null
      11: putfield      #27                 // Field b:Ljava/lang/Runnable;
      14: aload_0
      15: iconst_m1
      16: putfield      #29                 // Field c:I
      19: aload_0
      20: new           #31                 // class java/lang/ref/WeakReference
      23: dup
      24: aload_1
      25: invokespecial #34                 // Method java/lang/ref/WeakReference."<init>":(Ljava/lang/Object;)V
      28: putfield      #36                 // Field d:Ljava/lang/ref/WeakReference;
      31: return

  public long a();
    Code:
       0: aload_0
       1: getfield      #36                 // Field d:Ljava/lang/ref/WeakReference;
       4: invokevirtual #58                 // Method java/lang/ref/WeakReference.get:()Ljava/lang/Object;
       7: checkcast     #40                 // class android/view/View
      10: astore_1
      11: aload_1
      12: ifnull        23
      15: aload_1
      16: invokevirtual #44                 // Method android/view/View.animate:()Landroid/view/ViewPropertyAnimator;
      19: invokevirtual #61                 // Method android/view/ViewPropertyAnimator.getDuration:()J
      22: lreturn
      23: lconst_0
      24: lreturn

  public android.support.v4.view.x a(float);
    Code:
       0: aload_0
       1: getfield      #36                 // Field d:Ljava/lang/ref/WeakReference;
       4: invokevirtual #58                 // Method java/lang/ref/WeakReference.get:()Ljava/lang/Object;
       7: checkcast     #40                 // class android/view/View
      10: astore_2
      11: aload_2
      12: ifnull        24
      15: aload_2
      16: invokevirtual #44                 // Method android/view/View.animate:()Landroid/view/ViewPropertyAnimator;
      19: fload_1
      20: invokevirtual #66                 // Method android/view/ViewPropertyAnimator.alpha:(F)Landroid/view/ViewPropertyAnimator;
      23: pop
      24: aload_0
      25: areturn

  public android.support.v4.view.x a(long);
    Code:
       0: aload_0
       1: getfield      #36                 // Field d:Ljava/lang/ref/WeakReference;
       4: invokevirtual #58                 // Method java/lang/ref/WeakReference.get:()Ljava/lang/Object;
       7: checkcast     #40                 // class android/view/View
      10: astore_3
      11: aload_3
      12: ifnull        24
      15: aload_3
      16: invokevirtual #44                 // Method android/view/View.animate:()Landroid/view/ViewPropertyAnimator;
      19: lload_1
      20: invokevirtual #71                 // Method android/view/ViewPropertyAnimator.setDuration:(J)Landroid/view/ViewPropertyAnimator;
      23: pop
      24: aload_0
      25: areturn

  public android.support.v4.view.x a(android.support.v4.view.aa);
    Code:
       0: aload_0
       1: getfield      #36                 // Field d:Ljava/lang/ref/WeakReference;
       4: invokevirtual #58                 // Method java/lang/ref/WeakReference.get:()Ljava/lang/Object;
       7: checkcast     #40                 // class android/view/View
      10: astore_3
      11: aload_3
      12: ifnull        49
      15: getstatic     #77                 // Field android/os/Build$VERSION.SDK_INT:I
      18: bipush        19
      20: if_icmplt     49
      23: aconst_null
      24: astore_2
      25: aload_1
      26: ifnull        40
      29: new           #8                  // class android/support/v4/view/x$2
      32: dup
      33: aload_0
      34: aload_1
      35: aload_3
      36: invokespecial #80                 // Method android/support/v4/view/x$2."<init>":(Landroid/support/v4/view/x;Landroid/support/v4/view/aa;Landroid/view/View;)V
      39: astore_2
      40: aload_3
      41: invokevirtual #44                 // Method android/view/View.animate:()Landroid/view/ViewPropertyAnimator;
      44: aload_2
      45: invokevirtual #84                 // Method android/view/ViewPropertyAnimator.setUpdateListener:(Landroid/animation/ValueAnimator$AnimatorUpdateListener;)Landroid/view/ViewPropertyAnimator;
      48: pop
      49: aload_0
      50: areturn

  public android.support.v4.view.x a(android.support.v4.view.y);
    Code:
       0: aload_0
       1: getfield      #36                 // Field d:Ljava/lang/ref/WeakReference;
       4: invokevirtual #58                 // Method java/lang/ref/WeakReference.get:()Ljava/lang/Object;
       7: checkcast     #40                 // class android/view/View
      10: astore_2
      11: aload_2
      12: ifnull        50
      15: getstatic     #77                 // Field android/os/Build$VERSION.SDK_INT:I
      18: bipush        16
      20: if_icmplt     31
      23: aload_0
      24: aload_2
      25: aload_1
      26: invokespecial #87                 // Method a:(Landroid/view/View;Landroid/support/v4/view/y;)V
      29: aload_0
      30: areturn
      31: aload_2
      32: ldc           #88                 // int 2113929216
      34: aload_1
      35: invokevirtual #92                 // Method android/view/View.setTag:(ILjava/lang/Object;)V
      38: new           #10                 // class android/support/v4/view/x$a
      41: dup
      42: aload_0
      43: invokespecial #95                 // Method android/support/v4/view/x$a."<init>":(Landroid/support/v4/view/x;)V
      46: astore_1
      47: goto          23
      50: aload_0
      51: areturn

  public android.support.v4.view.x a(android.view.animation.Interpolator);
    Code:
       0: aload_0
       1: getfield      #36                 // Field d:Ljava/lang/ref/WeakReference;
       4: invokevirtual #58                 // Method java/lang/ref/WeakReference.get:()Ljava/lang/Object;
       7: checkcast     #40                 // class android/view/View
      10: astore_2
      11: aload_2
      12: ifnull        24
      15: aload_2
      16: invokevirtual #44                 // Method android/view/View.animate:()Landroid/view/ViewPropertyAnimator;
      19: aload_1
      20: invokevirtual #100                // Method android/view/ViewPropertyAnimator.setInterpolator:(Landroid/animation/TimeInterpolator;)Landroid/view/ViewPropertyAnimator;
      23: pop
      24: aload_0
      25: areturn

  public android.support.v4.view.x b(float);
    Code:
       0: aload_0
       1: getfield      #36                 // Field d:Ljava/lang/ref/WeakReference;
       4: invokevirtual #58                 // Method java/lang/ref/WeakReference.get:()Ljava/lang/Object;
       7: checkcast     #40                 // class android/view/View
      10: astore_2
      11: aload_2
      12: ifnull        24
      15: aload_2
      16: invokevirtual #44                 // Method android/view/View.animate:()Landroid/view/ViewPropertyAnimator;
      19: fload_1
      20: invokevirtual #103                // Method android/view/ViewPropertyAnimator.translationY:(F)Landroid/view/ViewPropertyAnimator;
      23: pop
      24: aload_0
      25: areturn

  public android.support.v4.view.x b(long);
    Code:
       0: aload_0
       1: getfield      #36                 // Field d:Ljava/lang/ref/WeakReference;
       4: invokevirtual #58                 // Method java/lang/ref/WeakReference.get:()Ljava/lang/Object;
       7: checkcast     #40                 // class android/view/View
      10: astore_3
      11: aload_3
      12: ifnull        24
      15: aload_3
      16: invokevirtual #44                 // Method android/view/View.animate:()Landroid/view/ViewPropertyAnimator;
      19: lload_1
      20: invokevirtual #106                // Method android/view/ViewPropertyAnimator.setStartDelay:(J)Landroid/view/ViewPropertyAnimator;
      23: pop
      24: aload_0
      25: areturn

  public void b();
    Code:
       0: aload_0
       1: getfield      #36                 // Field d:Ljava/lang/ref/WeakReference;
       4: invokevirtual #58                 // Method java/lang/ref/WeakReference.get:()Ljava/lang/Object;
       7: checkcast     #40                 // class android/view/View
      10: astore_1
      11: aload_1
      12: ifnull        22
      15: aload_1
      16: invokevirtual #44                 // Method android/view/View.animate:()Landroid/view/ViewPropertyAnimator;
      19: invokevirtual #109                // Method android/view/ViewPropertyAnimator.cancel:()V
      22: return

  public void c();
    Code:
       0: aload_0
       1: getfield      #36                 // Field d:Ljava/lang/ref/WeakReference;
       4: invokevirtual #58                 // Method java/lang/ref/WeakReference.get:()Ljava/lang/Object;
       7: checkcast     #40                 // class android/view/View
      10: astore_1
      11: aload_1
      12: ifnull        22
      15: aload_1
      16: invokevirtual #44                 // Method android/view/View.animate:()Landroid/view/ViewPropertyAnimator;
      19: invokevirtual #112                // Method android/view/ViewPropertyAnimator.start:()V
      22: return
}
