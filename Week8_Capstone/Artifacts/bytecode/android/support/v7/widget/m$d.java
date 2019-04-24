class android.support.v7.widget.m$d implements android.support.v7.widget.m$c {
  android.support.v7.widget.m$d();
    Code:
       0: aload_0
       1: invokespecial #13                 // Method java/lang/Object."<init>":()V
       4: return

  public android.graphics.drawable.Drawable a(android.content.Context, org.xmlpull.v1.XmlPullParser, android.util.AttributeSet, android.content.res.Resources$Theme);
    Code:
       0: aload_1
       1: invokevirtual #24                 // Method android/content/Context.getResources:()Landroid/content/res/Resources;
       4: aload_2
       5: aload_3
       6: aload         4
       8: invokestatic  #29                 // Method android/support/c/a/i.a:(Landroid/content/res/Resources;Lorg/xmlpull/v1/XmlPullParser;Landroid/util/AttributeSet;Landroid/content/res/Resources$Theme;)Landroid/support/c/a/i;
      11: astore_1
      12: aload_1
      13: areturn
      14: astore_1
      15: ldc           #31                 // String VdcInflateDelegate
      17: ldc           #33                 // String Exception while inflating <vector>
      19: aload_1
      20: invokestatic  #39                 // Method android/util/Log.e:(Ljava/lang/String;Ljava/lang/String;Ljava/lang/Throwable;)I
      23: pop
      24: aconst_null
      25: areturn
    Exception table:
       from    to  target type
           0    12    14   Class java/lang/Exception
}
