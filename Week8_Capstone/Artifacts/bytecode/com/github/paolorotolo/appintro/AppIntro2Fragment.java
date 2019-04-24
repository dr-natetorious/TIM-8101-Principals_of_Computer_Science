public final class com.github.paolorotolo.appintro.AppIntro2Fragment extends com.github.paolorotolo.appintro.AppIntroBaseFragment {
  public com.github.paolorotolo.appintro.AppIntro2Fragment();
    Code:
       0: aload_0
       1: invokespecial #8                  // Method com/github/paolorotolo/appintro/AppIntroBaseFragment."<init>":()V
       4: return

  public static com.github.paolorotolo.appintro.AppIntroFragment newInstance(java.lang.CharSequence, java.lang.CharSequence, int, int);
    Code:
       0: aload_0
       1: aload_1
       2: iload_2
       3: iload_3
       4: iconst_0
       5: iconst_0
       6: invokestatic  #14                 // Method newInstance:(Ljava/lang/CharSequence;Ljava/lang/CharSequence;IIII)Lcom/github/paolorotolo/appintro/AppIntroFragment;
       9: areturn

  public static com.github.paolorotolo.appintro.AppIntroFragment newInstance(java.lang.CharSequence, java.lang.CharSequence, int, int, int, int);
    Code:
       0: new           #16                 // class com/github/paolorotolo/appintro/AppIntroFragment
       3: dup
       4: invokespecial #17                 // Method com/github/paolorotolo/appintro/AppIntroFragment."<init>":()V
       7: astore        6
       9: new           #19                 // class android/os/Bundle
      12: dup
      13: invokespecial #20                 // Method android/os/Bundle."<init>":()V
      16: astore        7
      18: aload         7
      20: ldc           #22                 // String title
      22: aload_0
      23: invokeinterface #28,  1           // InterfaceMethod java/lang/CharSequence.toString:()Ljava/lang/String;
      28: invokevirtual #32                 // Method android/os/Bundle.putString:(Ljava/lang/String;Ljava/lang/String;)V
      31: aload         7
      33: ldc           #34                 // String title_typeface
      35: aconst_null
      36: invokevirtual #32                 // Method android/os/Bundle.putString:(Ljava/lang/String;Ljava/lang/String;)V
      39: aload         7
      41: ldc           #36                 // String desc
      43: aload_1
      44: invokeinterface #28,  1           // InterfaceMethod java/lang/CharSequence.toString:()Ljava/lang/String;
      49: invokevirtual #32                 // Method android/os/Bundle.putString:(Ljava/lang/String;Ljava/lang/String;)V
      52: aload         7
      54: ldc           #38                 // String desc_typeface
      56: aconst_null
      57: invokevirtual #32                 // Method android/os/Bundle.putString:(Ljava/lang/String;Ljava/lang/String;)V
      60: aload         7
      62: ldc           #40                 // String drawable
      64: iload_2
      65: invokevirtual #44                 // Method android/os/Bundle.putInt:(Ljava/lang/String;I)V
      68: aload         7
      70: ldc           #46                 // String bg_color
      72: iload_3
      73: invokevirtual #44                 // Method android/os/Bundle.putInt:(Ljava/lang/String;I)V
      76: aload         7
      78: ldc           #48                 // String title_color
      80: iload         4
      82: invokevirtual #44                 // Method android/os/Bundle.putInt:(Ljava/lang/String;I)V
      85: aload         7
      87: ldc           #50                 // String desc_color
      89: iload         5
      91: invokevirtual #44                 // Method android/os/Bundle.putInt:(Ljava/lang/String;I)V
      94: aload         6
      96: aload         7
      98: invokevirtual #54                 // Method com/github/paolorotolo/appintro/AppIntroFragment.setArguments:(Landroid/os/Bundle;)V
     101: aload         6
     103: areturn

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
      10: invokestatic  #58                 // Method newInstance:(Ljava/lang/CharSequence;Ljava/lang/String;Ljava/lang/CharSequence;Ljava/lang/String;IIII)Lcom/github/paolorotolo/appintro/AppIntroFragment;
      13: areturn

  public static com.github.paolorotolo.appintro.AppIntroFragment newInstance(java.lang.CharSequence, java.lang.String, java.lang.CharSequence, java.lang.String, int, int, int, int);
    Code:
       0: new           #16                 // class com/github/paolorotolo/appintro/AppIntroFragment
       3: dup
       4: invokespecial #17                 // Method com/github/paolorotolo/appintro/AppIntroFragment."<init>":()V
       7: astore        8
       9: new           #19                 // class android/os/Bundle
      12: dup
      13: invokespecial #20                 // Method android/os/Bundle."<init>":()V
      16: astore        9
      18: aload         9
      20: ldc           #22                 // String title
      22: aload_0
      23: invokeinterface #28,  1           // InterfaceMethod java/lang/CharSequence.toString:()Ljava/lang/String;
      28: invokevirtual #32                 // Method android/os/Bundle.putString:(Ljava/lang/String;Ljava/lang/String;)V
      31: aload         9
      33: ldc           #34                 // String title_typeface
      35: aload_1
      36: invokevirtual #32                 // Method android/os/Bundle.putString:(Ljava/lang/String;Ljava/lang/String;)V
      39: aload         9
      41: ldc           #36                 // String desc
      43: aload_2
      44: invokeinterface #28,  1           // InterfaceMethod java/lang/CharSequence.toString:()Ljava/lang/String;
      49: invokevirtual #32                 // Method android/os/Bundle.putString:(Ljava/lang/String;Ljava/lang/String;)V
      52: aload         9
      54: ldc           #38                 // String desc_typeface
      56: aload_3
      57: invokevirtual #32                 // Method android/os/Bundle.putString:(Ljava/lang/String;Ljava/lang/String;)V
      60: aload         9
      62: ldc           #40                 // String drawable
      64: iload         4
      66: invokevirtual #44                 // Method android/os/Bundle.putInt:(Ljava/lang/String;I)V
      69: aload         9
      71: ldc           #46                 // String bg_color
      73: iload         5
      75: invokevirtual #44                 // Method android/os/Bundle.putInt:(Ljava/lang/String;I)V
      78: aload         9
      80: ldc           #48                 // String title_color
      82: iload         6
      84: invokevirtual #44                 // Method android/os/Bundle.putInt:(Ljava/lang/String;I)V
      87: aload         9
      89: ldc           #50                 // String desc_color
      91: iload         7
      93: invokevirtual #44                 // Method android/os/Bundle.putInt:(Ljava/lang/String;I)V
      96: aload         8
      98: aload         9
     100: invokevirtual #54                 // Method com/github/paolorotolo/appintro/AppIntroFragment.setArguments:(Landroid/os/Bundle;)V
     103: aload         8
     105: areturn

  protected int getLayoutId();
    Code:
       0: getstatic     #66                 // Field com/github/paolorotolo/appintro/R$layout.fragment_intro2:I
       3: ireturn
}
