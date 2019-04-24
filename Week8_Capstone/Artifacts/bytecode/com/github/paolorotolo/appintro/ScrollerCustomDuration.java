public class com.github.paolorotolo.appintro.ScrollerCustomDuration extends android.widget.Scroller {
  public com.github.paolorotolo.appintro.ScrollerCustomDuration(android.content.Context);
    Code:
       0: aload_0
       1: aload_1
       2: invokespecial #10                 // Method android/widget/Scroller."<init>":(Landroid/content/Context;)V
       5: aload_0
       6: ldc2_w        #11                 // double 6.0d
       9: putfield      #14                 // Field mScrollFactor:D
      12: return

  public com.github.paolorotolo.appintro.ScrollerCustomDuration(android.content.Context, android.view.animation.Interpolator);
    Code:
       0: aload_0
       1: aload_1
       2: aload_2
       3: invokespecial #18                 // Method android/widget/Scroller."<init>":(Landroid/content/Context;Landroid/view/animation/Interpolator;)V
       6: aload_0
       7: ldc2_w        #11                 // double 6.0d
      10: putfield      #14                 // Field mScrollFactor:D
      13: return

  public com.github.paolorotolo.appintro.ScrollerCustomDuration(android.content.Context, android.view.animation.Interpolator, boolean);
    Code:
       0: aload_0
       1: aload_1
       2: aload_2
       3: iload_3
       4: invokespecial #24                 // Method android/widget/Scroller."<init>":(Landroid/content/Context;Landroid/view/animation/Interpolator;Z)V
       7: aload_0
       8: ldc2_w        #11                 // double 6.0d
      11: putfield      #14                 // Field mScrollFactor:D
      14: return

  public void setScrollDurationFactor(double);
    Code:
       0: aload_0
       1: dload_1
       2: putfield      #14                 // Field mScrollFactor:D
       5: return

  public void startScroll(int, int, int, int, int);
    Code:
       0: aload_0
       1: iload_1
       2: iload_2
       3: iload_3
       4: iload         4
       6: iload         5
       8: i2d
       9: aload_0
      10: getfield      #14                 // Field mScrollFactor:D
      13: dmul
      14: d2i
      15: invokespecial #31                 // Method android/widget/Scroller.startScroll:(IIIII)V
      18: return
}
