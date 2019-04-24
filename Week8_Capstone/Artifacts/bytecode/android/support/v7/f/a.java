public class android.support.v7.f.a implements android.text.method.TransformationMethod {
  public android.support.v7.f.a(android.content.Context);
    Code:
       0: aload_0
       1: invokespecial #13                 // Method java/lang/Object."<init>":()V
       4: aload_0
       5: aload_1
       6: invokevirtual #19                 // Method android/content/Context.getResources:()Landroid/content/res/Resources;
       9: invokevirtual #25                 // Method android/content/res/Resources.getConfiguration:()Landroid/content/res/Configuration;
      12: getfield      #30                 // Field android/content/res/Configuration.locale:Ljava/util/Locale;
      15: putfield      #32                 // Field a:Ljava/util/Locale;
      18: return

  public java.lang.CharSequence getTransformation(java.lang.CharSequence, android.view.View);
    Code:
       0: aload_1
       1: ifnull        18
       4: aload_1
       5: invokeinterface #41,  1           // InterfaceMethod java/lang/CharSequence.toString:()Ljava/lang/String;
      10: aload_0
      11: getfield      #32                 // Field a:Ljava/util/Locale;
      14: invokevirtual #47                 // Method java/lang/String.toUpperCase:(Ljava/util/Locale;)Ljava/lang/String;
      17: areturn
      18: aconst_null
      19: areturn

  public void onFocusChanged(android.view.View, java.lang.CharSequence, boolean, int, android.graphics.Rect);
    Code:
       0: return
}
