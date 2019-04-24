public class android.support.v4.a.a.c {
  public static float a(android.content.res.TypedArray, org.xmlpull.v1.XmlPullParser, java.lang.String, int, float);
    Code:
       0: aload_1
       1: aload_2
       2: invokestatic  #9                  // Method a:(Lorg/xmlpull/v1/XmlPullParser;Ljava/lang/String;)Z
       5: ifne          11
       8: fload         4
      10: freturn
      11: aload_0
      12: iload_3
      13: fload         4
      15: invokevirtual #15                 // Method android/content/res/TypedArray.getFloat:(IF)F
      18: freturn

  public static int a(android.content.res.TypedArray, org.xmlpull.v1.XmlPullParser, java.lang.String, int, int);
    Code:
       0: aload_1
       1: aload_2
       2: invokestatic  #9                  // Method a:(Lorg/xmlpull/v1/XmlPullParser;Ljava/lang/String;)Z
       5: ifne          11
       8: iload         4
      10: ireturn
      11: aload_0
      12: iload_3
      13: iload         4
      15: invokevirtual #21                 // Method android/content/res/TypedArray.getInt:(II)I
      18: ireturn

  public static android.content.res.TypedArray a(android.content.res.Resources, android.content.res.Resources$Theme, android.util.AttributeSet, int[]);
    Code:
       0: aload_1
       1: ifnonnull     11
       4: aload_0
       5: aload_2
       6: aload_3
       7: invokevirtual #28                 // Method android/content/res/Resources.obtainAttributes:(Landroid/util/AttributeSet;[I)Landroid/content/res/TypedArray;
      10: areturn
      11: aload_1
      12: aload_2
      13: aload_3
      14: iconst_0
      15: iconst_0
      16: invokevirtual #34                 // Method android/content/res/Resources$Theme.obtainStyledAttributes:(Landroid/util/AttributeSet;[III)Landroid/content/res/TypedArray;
      19: areturn

  public static java.lang.String a(android.content.res.TypedArray, org.xmlpull.v1.XmlPullParser, java.lang.String, int);
    Code:
       0: aload_1
       1: aload_2
       2: invokestatic  #9                  // Method a:(Lorg/xmlpull/v1/XmlPullParser;Ljava/lang/String;)Z
       5: ifne          10
       8: aconst_null
       9: areturn
      10: aload_0
      11: iload_3
      12: invokevirtual #39                 // Method android/content/res/TypedArray.getString:(I)Ljava/lang/String;
      15: areturn

  public static boolean a(android.content.res.TypedArray, org.xmlpull.v1.XmlPullParser, java.lang.String, int, boolean);
    Code:
       0: aload_1
       1: aload_2
       2: invokestatic  #9                  // Method a:(Lorg/xmlpull/v1/XmlPullParser;Ljava/lang/String;)Z
       5: ifne          11
       8: iload         4
      10: ireturn
      11: aload_0
      12: iload_3
      13: iload         4
      15: invokevirtual #44                 // Method android/content/res/TypedArray.getBoolean:(IZ)Z
      18: ireturn

  public static boolean a(org.xmlpull.v1.XmlPullParser, java.lang.String);
    Code:
       0: aload_0
       1: ldc           #46                 // String http://schemas.android.com/apk/res/android
       3: aload_1
       4: invokeinterface #52,  3           // InterfaceMethod org/xmlpull/v1/XmlPullParser.getAttributeValue:(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;
       9: ifnull        14
      12: iconst_1
      13: ireturn
      14: iconst_0
      15: ireturn

  public static int b(android.content.res.TypedArray, org.xmlpull.v1.XmlPullParser, java.lang.String, int, int);
    Code:
       0: aload_1
       1: aload_2
       2: invokestatic  #9                  // Method a:(Lorg/xmlpull/v1/XmlPullParser;Ljava/lang/String;)Z
       5: ifne          11
       8: iload         4
      10: ireturn
      11: aload_0
      12: iload_3
      13: iload         4
      15: invokevirtual #56                 // Method android/content/res/TypedArray.getColor:(II)I
      18: ireturn

  public static android.util.TypedValue b(android.content.res.TypedArray, org.xmlpull.v1.XmlPullParser, java.lang.String, int);
    Code:
       0: aload_1
       1: aload_2
       2: invokestatic  #9                  // Method a:(Lorg/xmlpull/v1/XmlPullParser;Ljava/lang/String;)Z
       5: ifne          10
       8: aconst_null
       9: areturn
      10: aload_0
      11: iload_3
      12: invokevirtual #61                 // Method android/content/res/TypedArray.peekValue:(I)Landroid/util/TypedValue;
      15: areturn

  public static int c(android.content.res.TypedArray, org.xmlpull.v1.XmlPullParser, java.lang.String, int, int);
    Code:
       0: aload_1
       1: aload_2
       2: invokestatic  #9                  // Method a:(Lorg/xmlpull/v1/XmlPullParser;Ljava/lang/String;)Z
       5: ifne          11
       8: iload         4
      10: ireturn
      11: aload_0
      12: iload_3
      13: iload         4
      15: invokevirtual #65                 // Method android/content/res/TypedArray.getResourceId:(II)I
      18: ireturn
}
