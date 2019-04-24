public class android.support.v4.a.a.a {
  public static android.support.v4.a.a.a$a a(org.xmlpull.v1.XmlPullParser, android.content.res.Resources);
    Code:
       0: aload_0
       1: invokeinterface #23,  1           // InterfaceMethod org/xmlpull/v1/XmlPullParser.next:()I
       6: istore_2
       7: iload_2
       8: iconst_2
       9: if_icmpeq     20
      12: iload_2
      13: iconst_1
      14: if_icmpeq     20
      17: goto          0
      20: iload_2
      21: iconst_2
      22: if_icmpeq     35
      25: new           #25                 // class org/xmlpull/v1/XmlPullParserException
      28: dup
      29: ldc           #27                 // String No start tag found
      31: invokespecial #31                 // Method org/xmlpull/v1/XmlPullParserException."<init>":(Ljava/lang/String;)V
      34: athrow
      35: aload_0
      36: aload_1
      37: invokestatic  #33                 // Method b:(Lorg/xmlpull/v1/XmlPullParser;Landroid/content/res/Resources;)Landroid/support/v4/a/a/a$a;
      40: areturn

  public static java.util.List<java.util.List<byte[]>> a(android.content.res.Resources, int);
    Code:
       0: aconst_null
       1: astore_3
       2: aconst_null
       3: astore        4
       5: iload_1
       6: ifeq          124
       9: aload_0
      10: iload_1
      11: invokevirtual #41                 // Method android/content/res/Resources.obtainTypedArray:(I)Landroid/content/res/TypedArray;
      14: astore        5
      16: aload         4
      18: astore_3
      19: aload         5
      21: invokevirtual #46                 // Method android/content/res/TypedArray.length:()I
      24: ifle          119
      27: new           #48                 // class java/util/ArrayList
      30: dup
      31: invokespecial #51                 // Method java/util/ArrayList."<init>":()V
      34: astore        4
      36: aload         5
      38: iconst_0
      39: iconst_0
      40: invokevirtual #55                 // Method android/content/res/TypedArray.getResourceId:(II)I
      43: ifeq          51
      46: iconst_1
      47: istore_2
      48: goto          53
      51: iconst_0
      52: istore_2
      53: iload_2
      54: ifeq          100
      57: iconst_0
      58: istore_1
      59: aload         4
      61: astore_3
      62: iload_1
      63: aload         5
      65: invokevirtual #46                 // Method android/content/res/TypedArray.length:()I
      68: if_icmpge     119
      71: aload         4
      73: aload_0
      74: aload         5
      76: iload_1
      77: iconst_0
      78: invokevirtual #55                 // Method android/content/res/TypedArray.getResourceId:(II)I
      81: invokevirtual #59                 // Method android/content/res/Resources.getStringArray:(I)[Ljava/lang/String;
      84: invokestatic  #62                 // Method a:([Ljava/lang/String;)Ljava/util/List;
      87: invokeinterface #68,  2           // InterfaceMethod java/util/List.add:(Ljava/lang/Object;)Z
      92: pop
      93: iload_1
      94: iconst_1
      95: iadd
      96: istore_1
      97: goto          59
     100: aload         4
     102: aload_0
     103: iload_1
     104: invokevirtual #59                 // Method android/content/res/Resources.getStringArray:(I)[Ljava/lang/String;
     107: invokestatic  #62                 // Method a:([Ljava/lang/String;)Ljava/util/List;
     110: invokeinterface #68,  2           // InterfaceMethod java/util/List.add:(Ljava/lang/Object;)Z
     115: pop
     116: aload         4
     118: astore_3
     119: aload         5
     121: invokevirtual #71                 // Method android/content/res/TypedArray.recycle:()V
     124: aload_3
     125: ifnull        130
     128: aload_3
     129: areturn
     130: invokestatic  #77                 // Method java/util/Collections.emptyList:()Ljava/util/List;
     133: areturn
}
