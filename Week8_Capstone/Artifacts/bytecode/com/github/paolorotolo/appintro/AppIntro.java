public abstract class com.github.paolorotolo.appintro.AppIntro extends com.github.paolorotolo.appintro.AppIntroBase {
  static {};
    Code:
       0: ldc           #2                  // class com/github/paolorotolo/appintro/AppIntro
       2: invokestatic  #14                 // Method com/github/paolorotolo/appintro/util/LogHelper.makeLogTag:(Ljava/lang/Class;)Ljava/lang/String;
       5: putstatic     #16                 // Field TAG:Ljava/lang/String;
       8: return

  public com.github.paolorotolo.appintro.AppIntro();
    Code:
       0: aload_0
       1: invokespecial #20                 // Method com/github/paolorotolo/appintro/AppIntroBase."<init>":()V
       4: return

  protected int getLayoutId();
    Code:
       0: getstatic     #28                 // Field com/github/paolorotolo/appintro/R$layout.intro_layout:I
       3: ireturn

  public void setBarColor(int);
    Code:
       0: aload_0
       1: getstatic     #35                 // Field com/github/paolorotolo/appintro/R$id.bottom:I
       4: invokevirtual #39                 // Method findViewById:(I)Landroid/view/View;
       7: checkcast     #41                 // class android/widget/LinearLayout
      10: iload_1
      11: invokevirtual #44                 // Method android/widget/LinearLayout.setBackgroundColor:(I)V
      14: return

  public void setColorDoneText(int);
    Code:
       0: aload_0
       1: getstatic     #48                 // Field com/github/paolorotolo/appintro/R$id.done:I
       4: invokevirtual #39                 // Method findViewById:(I)Landroid/view/View;
       7: checkcast     #50                 // class android/widget/TextView
      10: iload_1
      11: invokevirtual #53                 // Method android/widget/TextView.setTextColor:(I)V
      14: return

  public void setColorSkipButton(int);
    Code:
       0: aload_0
       1: getstatic     #57                 // Field com/github/paolorotolo/appintro/R$id.skip:I
       4: invokevirtual #39                 // Method findViewById:(I)Landroid/view/View;
       7: checkcast     #50                 // class android/widget/TextView
      10: iload_1
      11: invokevirtual #53                 // Method android/widget/TextView.setTextColor:(I)V
      14: return

  public void setDoneText(java.lang.CharSequence);
    Code:
       0: aload_0
       1: getstatic     #48                 // Field com/github/paolorotolo/appintro/R$id.done:I
       4: invokevirtual #39                 // Method findViewById:(I)Landroid/view/View;
       7: checkcast     #50                 // class android/widget/TextView
      10: aload_1
      11: invokevirtual #62                 // Method android/widget/TextView.setText:(Ljava/lang/CharSequence;)V
      14: return

  public void setDoneTextTypeface(java.lang.String);
    Code:
       0: aload_0
       1: getstatic     #48                 // Field com/github/paolorotolo/appintro/R$id.done:I
       4: invokevirtual #39                 // Method findViewById:(I)Landroid/view/View;
       7: checkcast     #50                 // class android/widget/TextView
      10: astore_2
      11: aload_1
      12: aload_0
      13: invokestatic  #70                 // Method com/github/paolorotolo/appintro/util/CustomFontCache.get:(Ljava/lang/String;Landroid/content/Context;)Landroid/graphics/Typeface;
      16: ifnull        28
      19: aload_2
      20: aload_1
      21: aload_0
      22: invokestatic  #70                 // Method com/github/paolorotolo/appintro/util/CustomFontCache.get:(Ljava/lang/String;Landroid/content/Context;)Landroid/graphics/Typeface;
      25: invokevirtual #74                 // Method android/widget/TextView.setTypeface:(Landroid/graphics/Typeface;)V
      28: return

  public void setImageNextButton(android.graphics.drawable.Drawable);
    Code:
       0: aload_0
       1: getstatic     #79                 // Field com/github/paolorotolo/appintro/R$id.next:I
       4: invokevirtual #39                 // Method findViewById:(I)Landroid/view/View;
       7: checkcast     #81                 // class android/widget/ImageView
      10: aload_1
      11: invokevirtual #84                 // Method android/widget/ImageView.setImageDrawable:(Landroid/graphics/drawable/Drawable;)V
      14: return

  public void setNextArrowColor(int);
    Code:
       0: aload_0
       1: getstatic     #79                 // Field com/github/paolorotolo/appintro/R$id.next:I
       4: invokevirtual #39                 // Method findViewById:(I)Landroid/view/View;
       7: checkcast     #87                 // class android/widget/ImageButton
      10: iload_1
      11: invokevirtual #90                 // Method android/widget/ImageButton.setColorFilter:(I)V
      14: return

  public void setSeparatorColor(int);
    Code:
       0: aload_0
       1: getstatic     #94                 // Field com/github/paolorotolo/appintro/R$id.bottom_separator:I
       4: invokevirtual #39                 // Method findViewById:(I)Landroid/view/View;
       7: checkcast     #50                 // class android/widget/TextView
      10: iload_1
      11: invokevirtual #95                 // Method android/widget/TextView.setBackgroundColor:(I)V
      14: return

  public void setSkipText(java.lang.CharSequence);
    Code:
       0: aload_0
       1: getstatic     #57                 // Field com/github/paolorotolo/appintro/R$id.skip:I
       4: invokevirtual #39                 // Method findViewById:(I)Landroid/view/View;
       7: checkcast     #50                 // class android/widget/TextView
      10: aload_1
      11: invokevirtual #62                 // Method android/widget/TextView.setText:(Ljava/lang/CharSequence;)V
      14: return

  public void setSkipTextTypeface(java.lang.String);
    Code:
       0: aload_0
       1: getstatic     #57                 // Field com/github/paolorotolo/appintro/R$id.skip:I
       4: invokevirtual #39                 // Method findViewById:(I)Landroid/view/View;
       7: checkcast     #50                 // class android/widget/TextView
      10: astore_2
      11: aload_1
      12: aload_0
      13: invokestatic  #70                 // Method com/github/paolorotolo/appintro/util/CustomFontCache.get:(Ljava/lang/String;Landroid/content/Context;)Landroid/graphics/Typeface;
      16: ifnull        28
      19: aload_2
      20: aload_1
      21: aload_0
      22: invokestatic  #70                 // Method com/github/paolorotolo/appintro/util/CustomFontCache.get:(Ljava/lang/String;Landroid/content/Context;)Landroid/graphics/Typeface;
      25: invokevirtual #74                 // Method android/widget/TextView.setTypeface:(Landroid/graphics/Typeface;)V
      28: return

  public void showDoneButton(boolean);
    Code:
       0: aload_0
       1: iload_1
       2: invokevirtual #103                // Method setProgressButtonEnabled:(Z)V
       5: return

  public void showSeparator(boolean);
    Code:
       0: aload_0
       1: getstatic     #94                 // Field com/github/paolorotolo/appintro/R$id.bottom_separator:I
       4: invokevirtual #39                 // Method findViewById:(I)Landroid/view/View;
       7: checkcast     #50                 // class android/widget/TextView
      10: astore_3
      11: iload_1
      12: ifeq          23
      15: iconst_0
      16: istore_2
      17: aload_3
      18: iload_2
      19: invokevirtual #108                // Method android/widget/TextView.setVisibility:(I)V
      22: return
      23: iconst_4
      24: istore_2
      25: goto          17
}
