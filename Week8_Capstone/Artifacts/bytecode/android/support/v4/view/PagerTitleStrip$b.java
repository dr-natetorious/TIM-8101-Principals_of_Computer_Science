class android.support.v4.view.PagerTitleStrip$b extends android.text.method.SingleLineTransformationMethod {
  android.support.v4.view.PagerTitleStrip$b(android.content.Context);
    Code:
       0: aload_0
       1: invokespecial #14                 // Method android/text/method/SingleLineTransformationMethod."<init>":()V
       4: aload_0
       5: aload_1
       6: invokevirtual #20                 // Method android/content/Context.getResources:()Landroid/content/res/Resources;
       9: invokevirtual #26                 // Method android/content/res/Resources.getConfiguration:()Landroid/content/res/Configuration;
      12: getfield      #31                 // Field android/content/res/Configuration.locale:Ljava/util/Locale;
      15: putfield      #33                 // Field a:Ljava/util/Locale;
      18: return

  public java.lang.CharSequence getTransformation(java.lang.CharSequence, android.view.View);
    Code:
       0: aload_0
       1: aload_1
       2: aload_2
       3: invokespecial #38                 // Method android/text/method/SingleLineTransformationMethod.getTransformation:(Ljava/lang/CharSequence;Landroid/view/View;)Ljava/lang/CharSequence;
       6: astore_1
       7: aload_1
       8: ifnull        25
      11: aload_1
      12: invokeinterface #44,  1           // InterfaceMethod java/lang/CharSequence.toString:()Ljava/lang/String;
      17: aload_0
      18: getfield      #33                 // Field a:Ljava/util/Locale;
      21: invokevirtual #50                 // Method java/lang/String.toUpperCase:(Ljava/util/Locale;)Ljava/lang/String;
      24: areturn
      25: aconst_null
      26: areturn
}
