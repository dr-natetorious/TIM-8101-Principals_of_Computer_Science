public final class com.github.paolorotolo.appintro.AppIntroFragment extends com.github.paolorotolo.appintro.AppIntroBaseFragment {
  public com.github.paolorotolo.appintro.AppIntroFragment();
    Code:
       0: aload_0
       1: invokespecial #8                  // Method com/github/paolorotolo/appintro/AppIntroBaseFragment."<init>":()V
       4: return

  public static com.github.paolorotolo.appintro.AppIntroFragment newInstance(com.github.paolorotolo.appintro.model.SliderPage);
    Code:
       0: new           #2                  // class com/github/paolorotolo/appintro/AppIntroFragment
       3: dup
       4: invokespecial #12                 // Method "<init>":()V
       7: astore_1
       8: new           #14                 // class android/os/Bundle
      11: dup
      12: invokespecial #15                 // Method android/os/Bundle."<init>":()V
      15: astore_2
      16: aload_2
      17: ldc           #17                 // String title
      19: aload_0
      20: invokevirtual #23                 // Method com/github/paolorotolo/appintro/model/SliderPage.getTitleString:()Ljava/lang/String;
      23: invokevirtual #27                 // Method android/os/Bundle.putString:(Ljava/lang/String;Ljava/lang/String;)V
      26: aload_2
      27: ldc           #29                 // String title_typeface
      29: aload_0
      30: invokevirtual #32                 // Method com/github/paolorotolo/appintro/model/SliderPage.getTitleTypeface:()Ljava/lang/String;
      33: invokevirtual #27                 // Method android/os/Bundle.putString:(Ljava/lang/String;Ljava/lang/String;)V
      36: aload_2
      37: ldc           #34                 // String desc
      39: aload_0
      40: invokevirtual #37                 // Method com/github/paolorotolo/appintro/model/SliderPage.getDescriptionString:()Ljava/lang/String;
      43: invokevirtual #27                 // Method android/os/Bundle.putString:(Ljava/lang/String;Ljava/lang/String;)V
      46: aload_2
      47: ldc           #39                 // String desc_typeface
      49: aload_0
      50: invokevirtual #42                 // Method com/github/paolorotolo/appintro/model/SliderPage.getDescTypeface:()Ljava/lang/String;
      53: invokevirtual #27                 // Method android/os/Bundle.putString:(Ljava/lang/String;Ljava/lang/String;)V
      56: aload_2
      57: ldc           #44                 // String drawable
      59: aload_0
      60: invokevirtual #48                 // Method com/github/paolorotolo/appintro/model/SliderPage.getImageDrawable:()I
      63: invokevirtual #52                 // Method android/os/Bundle.putInt:(Ljava/lang/String;I)V
      66: aload_2
      67: ldc           #54                 // String bg_color
      69: aload_0
      70: invokevirtual #57                 // Method com/github/paolorotolo/appintro/model/SliderPage.getBgColor:()I
      73: invokevirtual #52                 // Method android/os/Bundle.putInt:(Ljava/lang/String;I)V
      76: aload_2
      77: ldc           #59                 // String title_color
      79: aload_0
      80: invokevirtual #62                 // Method com/github/paolorotolo/appintro/model/SliderPage.getTitleColor:()I
      83: invokevirtual #52                 // Method android/os/Bundle.putInt:(Ljava/lang/String;I)V
      86: aload_2
      87: ldc           #64                 // String desc_color
      89: aload_0
      90: invokevirtual #67                 // Method com/github/paolorotolo/appintro/model/SliderPage.getDescColor:()I
      93: invokevirtual #52                 // Method android/os/Bundle.putInt:(Ljava/lang/String;I)V
      96: aload_1
      97: aload_2
      98: invokevirtual #71                 // Method setArguments:(Landroid/os/Bundle;)V
     101: aload_1
     102: areturn

  public static com.github.paolorotolo.appintro.AppIntroFragment newInstance(java.lang.CharSequence, java.lang.CharSequence, int, int);
    Code:
       0: aload_0
       1: aconst_null
       2: aload_1
       3: aconst_null
       4: iload_2
       5: iload_3
       6: iconst_0
       7: iconst_0
       8: invokestatic  #75                 // Method newInstance:(Ljava/lang/CharSequence;Ljava/lang/String;Ljava/lang/CharSequence;Ljava/lang/String;IIII)Lcom/github/paolorotolo/appintro/AppIntroFragment;
      11: areturn

  public static com.github.paolorotolo.appintro.AppIntroFragment newInstance(java.lang.CharSequence, java.lang.String, java.lang.CharSequence, java.lang.String, int, int);
    Code:
       0: aload_0
       1: aload_1
       2: aload_2
       3: aload_3
       4: iload         4
       6: iload         5
       8: iconst_0
       9: iconst_0
      10: invokestatic  #75                 // Method newInstance:(Ljava/lang/CharSequence;Ljava/lang/String;Ljava/lang/CharSequence;Ljava/lang/String;IIII)Lcom/github/paolorotolo/appintro/AppIntroFragment;
      13: areturn

  public static com.github.paolorotolo.appintro.AppIntroFragment newInstance(java.lang.CharSequence, java.lang.String, java.lang.CharSequence, java.lang.String, int, int, int, int);
    Code:
       0: new           #19                 // class com/github/paolorotolo/appintro/model/SliderPage
       3: dup
       4: invokespecial #77                 // Method com/github/paolorotolo/appintro/model/SliderPage."<init>":()V
       7: astore        8
       9: aload         8
      11: aload_0
      12: invokevirtual #81                 // Method com/github/paolorotolo/appintro/model/SliderPage.setTitle:(Ljava/lang/CharSequence;)V
      15: aload         8
      17: aload_1
      18: invokevirtual #85                 // Method com/github/paolorotolo/appintro/model/SliderPage.setTitleTypeface:(Ljava/lang/String;)V
      21: aload         8
      23: aload_2
      24: invokevirtual #88                 // Method com/github/paolorotolo/appintro/model/SliderPage.setDescription:(Ljava/lang/CharSequence;)V
      27: aload         8
      29: aload_3
      30: invokevirtual #91                 // Method com/github/paolorotolo/appintro/model/SliderPage.setDescTypeface:(Ljava/lang/String;)V
      33: aload         8
      35: iload         4
      37: invokevirtual #95                 // Method com/github/paolorotolo/appintro/model/SliderPage.setImageDrawable:(I)V
      40: aload         8
      42: iload         5
      44: invokevirtual #98                 // Method com/github/paolorotolo/appintro/model/SliderPage.setBgColor:(I)V
      47: aload         8
      49: iload         6
      51: invokevirtual #101                // Method com/github/paolorotolo/appintro/model/SliderPage.setTitleColor:(I)V
      54: aload         8
      56: iload         7
      58: invokevirtual #104                // Method com/github/paolorotolo/appintro/model/SliderPage.setDescColor:(I)V
      61: aload         8
      63: invokestatic  #106                // Method newInstance:(Lcom/github/paolorotolo/appintro/model/SliderPage;)Lcom/github/paolorotolo/appintro/AppIntroFragment;
      66: areturn

  protected int getLayoutId();
    Code:
       0: getstatic     #113                // Field com/github/paolorotolo/appintro/R$layout.fragment_intro:I
       3: ireturn
}
