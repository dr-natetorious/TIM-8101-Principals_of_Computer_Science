public final class ryey.easer.core.ui.version_n_info.WelcomeActivity extends com.github.paolorotolo.appintro.AppIntro2 {
  public ryey.easer.core.ui.version_n_info.WelcomeActivity();
    Code:
       0: aload_0
       1: invokespecial #8                  // Method com/github/paolorotolo/appintro/AppIntro2."<init>":()V
       4: return

  protected void onCreate(android.os.Bundle);
    Code:
       0: aload_0
       1: aload_1
       2: invokespecial #13                 // Method com/github/paolorotolo/appintro/AppIntro2.onCreate:(Landroid/os/Bundle;)V
       5: aload_0
       6: getstatic     #19                 // Field ryey/easer/core/ui/version_n_info/b.a:Lryey/easer/core/ui/version_n_info/b$a;
       9: ldc           #20                 // int 2131624323
      11: invokevirtual #25                 // Method ryey/easer/core/ui/version_n_info/b$a.a:(I)Lryey/easer/core/ui/version_n_info/b;
      14: checkcast     #27                 // class android/support/v4/app/i
      17: invokevirtual #31                 // Method addSlide:(Landroid/support/v4/app/i;)V
      20: aload_0
      21: getstatic     #19                 // Field ryey/easer/core/ui/version_n_info/b.a:Lryey/easer/core/ui/version_n_info/b$a;
      24: ldc           #32                 // int 2131624324
      26: invokevirtual #25                 // Method ryey/easer/core/ui/version_n_info/b$a.a:(I)Lryey/easer/core/ui/version_n_info/b;
      29: checkcast     #27                 // class android/support/v4/app/i
      32: invokevirtual #31                 // Method addSlide:(Landroid/support/v4/app/i;)V
      35: aload_0
      36: getstatic     #19                 // Field ryey/easer/core/ui/version_n_info/b.a:Lryey/easer/core/ui/version_n_info/b$a;
      39: ldc           #33                 // int 2131624325
      41: invokevirtual #25                 // Method ryey/easer/core/ui/version_n_info/b$a.a:(I)Lryey/easer/core/ui/version_n_info/b;
      44: checkcast     #27                 // class android/support/v4/app/i
      47: invokevirtual #31                 // Method addSlide:(Landroid/support/v4/app/i;)V
      50: aload_0
      51: getstatic     #19                 // Field ryey/easer/core/ui/version_n_info/b.a:Lryey/easer/core/ui/version_n_info/b$a;
      54: ldc           #34                 // int 2131624318
      56: ldc           #35                 // int 2131624326
      58: invokevirtual #38                 // Method ryey/easer/core/ui/version_n_info/b$a.a:(II)Lryey/easer/core/ui/version_n_info/b;
      61: checkcast     #27                 // class android/support/v4/app/i
      64: invokevirtual #31                 // Method addSlide:(Landroid/support/v4/app/i;)V
      67: aload_0
      68: iconst_1
      69: invokevirtual #42                 // Method showSkipButton:(Z)V
      72: return

  public void onDonePressed(android.support.v4.app.i);
    Code:
       0: aload_0
       1: aload_1
       2: invokespecial #45                 // Method com/github/paolorotolo/appintro/AppIntro2.onDonePressed:(Landroid/support/v4/app/i;)V
       5: aload_0
       6: checkcast     #47                 // class android/content/Context
       9: invokestatic  #53                 // Method android/preference/PreferenceManager.getDefaultSharedPreferences:(Landroid/content/Context;)Landroid/content/SharedPreferences;
      12: invokeinterface #59,  1           // InterfaceMethod android/content/SharedPreferences.edit:()Landroid/content/SharedPreferences$Editor;
      17: aload_0
      18: ldc           #60                 // int 2131624119
      20: invokevirtual #64                 // Method getString:(I)Ljava/lang/String;
      23: iconst_0
      24: invokeinterface #70,  3           // InterfaceMethod android/content/SharedPreferences$Editor.putBoolean:(Ljava/lang/String;Z)Landroid/content/SharedPreferences$Editor;
      29: invokeinterface #73,  1           // InterfaceMethod android/content/SharedPreferences$Editor.apply:()V
      34: aload_0
      35: invokevirtual #76                 // Method finish:()V
      38: return

  public void onSkipPressed(android.support.v4.app.i);
    Code:
       0: aload_0
       1: aload_1
       2: invokespecial #79                 // Method com/github/paolorotolo/appintro/AppIntro2.onSkipPressed:(Landroid/support/v4/app/i;)V
       5: aload_0
       6: aload_1
       7: invokevirtual #80                 // Method onDonePressed:(Landroid/support/v4/app/i;)V
      10: return
}
