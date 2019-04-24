final class android.support.v7.c.a.a {
  public static android.content.res.ColorStateList a(android.content.res.Resources, org.xmlpull.v1.XmlPullParser, android.content.res.Resources$Theme);
    Code:
       0: aload_1
       1: invokestatic  #32                 // Method android/util/Xml.asAttributeSet:(Lorg/xmlpull/v1/XmlPullParser;)Landroid/util/AttributeSet;
       4: astore        4
       6: aload_1
       7: invokeinterface #38,  1           // InterfaceMethod org/xmlpull/v1/XmlPullParser.next:()I
      12: istore_3
      13: iload_3
      14: iconst_2
      15: if_icmpeq     26
      18: iload_3
      19: iconst_1
      20: if_icmpeq     26
      23: goto          6
      26: iload_3
      27: iconst_2
      28: if_icmpeq     41
      31: new           #40                 // class org/xmlpull/v1/XmlPullParserException
      34: dup
      35: ldc           #42                 // String No start tag found
      37: invokespecial #46                 // Method org/xmlpull/v1/XmlPullParserException."<init>":(Ljava/lang/String;)V
      40: athrow
      41: aload_0
      42: aload_1
      43: aload         4
      45: aload_2
      46: invokestatic  #49                 // Method a:(Landroid/content/res/Resources;Lorg/xmlpull/v1/XmlPullParser;Landroid/util/AttributeSet;Landroid/content/res/Resources$Theme;)Landroid/content/res/ColorStateList;
      49: areturn
}
