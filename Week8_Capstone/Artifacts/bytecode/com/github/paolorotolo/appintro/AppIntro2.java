public abstract class com.github.paolorotolo.appintro.AppIntro2 extends com.github.paolorotolo.appintro.AppIntroBase {
  protected android.widget.FrameLayout backgroundFrame;

  protected android.view.View customBackgroundView;

  static {};
    Code:
       0: ldc           #2                  // class com/github/paolorotolo/appintro/AppIntro2
       2: invokestatic  #21                 // Method com/github/paolorotolo/appintro/util/LogHelper.makeLogTag:(Ljava/lang/Class;)Ljava/lang/String;
       5: putstatic     #23                 // Field TAG:Ljava/lang/String;
       8: return

  public com.github.paolorotolo.appintro.AppIntro2();
    Code:
       0: aload_0
       1: invokespecial #27                 // Method com/github/paolorotolo/appintro/AppIntroBase."<init>":()V
       4: return

  protected int getLayoutId();
    Code:
       0: getstatic     #35                 // Field com/github/paolorotolo/appintro/R$layout.intro_layout2:I
       3: ireturn

  protected void onCreate(android.os.Bundle);
    Code:
       0: aload_0
       1: aload_1
       2: invokespecial #39                 // Method com/github/paolorotolo/appintro/AppIntroBase.onCreate:(Landroid/os/Bundle;)V
       5: aload_0
       6: aload_0
       7: getstatic     #44                 // Field com/github/paolorotolo/appintro/R$id.background:I
      10: invokevirtual #48                 // Method findViewById:(I)Landroid/view/View;
      13: checkcast     #50                 // class android/widget/FrameLayout
      16: putfield      #52                 // Field backgroundFrame:Landroid/widget/FrameLayout;
      19: return

  public void setAnimationColors(java.util.ArrayList<java.lang.Integer>);
    Code:
       0: aload_0
       1: aload_1
       2: putfield      #56                 // Field transitionColors:Ljava/util/ArrayList;
       5: return

  public void setBackgroundView(android.view.View);
    Code:
       0: aload_0
       1: aload_1
       2: putfield      #62                 // Field customBackgroundView:Landroid/view/View;
       5: aload_0
       6: getfield      #62                 // Field customBackgroundView:Landroid/view/View;
       9: ifnull        23
      12: aload_0
      13: getfield      #52                 // Field backgroundFrame:Landroid/widget/FrameLayout;
      16: aload_0
      17: getfield      #62                 // Field customBackgroundView:Landroid/view/View;
      20: invokevirtual #65                 // Method android/widget/FrameLayout.addView:(Landroid/view/View;)V
      23: return

  public void setBarColor(int);
    Code:
       0: aload_0
       1: getstatic     #70                 // Field com/github/paolorotolo/appintro/R$id.bottom:I
       4: invokevirtual #48                 // Method findViewById:(I)Landroid/view/View;
       7: checkcast     #72                 // class android/widget/LinearLayout
      10: iload_1
      11: invokevirtual #75                 // Method android/widget/LinearLayout.setBackgroundColor:(I)V
      14: return

  public void setImageSkipButton(android.graphics.drawable.Drawable);
    Code:
       0: aload_0
       1: getstatic     #80                 // Field com/github/paolorotolo/appintro/R$id.skip:I
       4: invokevirtual #48                 // Method findViewById:(I)Landroid/view/View;
       7: checkcast     #82                 // class android/widget/ImageButton
      10: aload_1
      11: invokevirtual #85                 // Method android/widget/ImageButton.setImageDrawable:(Landroid/graphics/drawable/Drawable;)V
      14: return

  public void showDoneButton(boolean);
    Code:
       0: aload_0
       1: iload_1
       2: invokevirtual #91                 // Method setProgressButtonEnabled:(Z)V
       5: return
}
