class android.support.v7.widget.m$a implements android.support.v7.widget.m$c {
  android.support.v7.widget.m$a();
    Code:
       0: aload_0
       1: invokespecial #13                 // Method java/lang/Object."<init>":()V
       4: return

  public android.graphics.drawable.Drawable a(android.content.Context, org.xmlpull.v1.XmlPullParser, android.util.AttributeSet, android.content.res.Resources$Theme);
    Code:
       0: aload_1
       1: aload_1
       2: invokevirtual #23                 // Method android/content/Context.getResources:()Landroid/content/res/Resources;
       5: aload_2
       6: aload_3
       7: aload         4
       9: invokestatic  #28                 // Method android/support/c/a/c.a:(Landroid/content/Context;Landroid/content/res/Resources;Lorg/xmlpull/v1/XmlPullParser;Landroid/util/AttributeSet;Landroid/content/res/Resources$Theme;)Landroid/support/c/a/c;
      12: astore_1
      13: aload_1
      14: areturn
      15: astore_1
      16: ldc           #30                 // String AvdcInflateDelegate
      18: ldc           #32                 // String Exception while inflating <animated-vector>
      20: aload_1
      21: invokestatic  #38                 // Method android/util/Log.e:(Ljava/lang/String;Ljava/lang/String;Ljava/lang/Throwable;)I
      24: pop
      25: aconst_null
      26: areturn
    Exception table:
       from    to  target type
           0    13    15   Class java/lang/Exception
}
