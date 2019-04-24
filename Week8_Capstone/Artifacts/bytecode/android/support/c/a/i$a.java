class android.support.c.a.i$a extends android.support.c.a.i$d {
  public android.support.c.a.i$a();
    Code:
       0: aload_0
       1: invokespecial #11                 // Method android/support/c/a/i$d."<init>":()V
       4: return

  public android.support.c.a.i$a(android.support.c.a.i$a);
    Code:
       0: aload_0
       1: aload_1
       2: invokespecial #16                 // Method android/support/c/a/i$d."<init>":(Landroid/support/c/a/i$d;)V
       5: return

  public void a(android.content.res.Resources, android.util.AttributeSet, android.content.res.Resources$Theme, org.xmlpull.v1.XmlPullParser);
    Code:
       0: aload         4
       2: ldc           #40                 // String pathData
       4: invokestatic  #45                 // Method android/support/v4/a/a/c.a:(Lorg/xmlpull/v1/XmlPullParser;Ljava/lang/String;)Z
       7: ifne          11
      10: return
      11: aload_1
      12: aload_3
      13: aload_2
      14: getstatic     #51                 // Field android/support/c/a/a.d:[I
      17: invokestatic  #54                 // Method android/support/v4/a/a/c.a:(Landroid/content/res/Resources;Landroid/content/res/Resources$Theme;Landroid/util/AttributeSet;[I)Landroid/content/res/TypedArray;
      20: astore_1
      21: aload_0
      22: aload_1
      23: invokespecial #56                 // Method a:(Landroid/content/res/TypedArray;)V
      26: aload_1
      27: invokevirtual #59                 // Method android/content/res/TypedArray.recycle:()V
      30: return

  public boolean a();
    Code:
       0: iconst_1
       1: ireturn
}
