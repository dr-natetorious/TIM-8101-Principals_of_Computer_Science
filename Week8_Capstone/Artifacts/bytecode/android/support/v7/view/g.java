public class android.support.v7.view.g extends android.view.MenuInflater {
  static final java.lang.Class<?>[] a;

  static final java.lang.Class<?>[] b;

  final java.lang.Object[] c;

  final java.lang.Object[] d;

  android.content.Context e;

  static {};
    Code:
       0: iconst_1
       1: anewarray     #23                 // class java/lang/Class
       4: dup
       5: iconst_0
       6: ldc           #25                 // class android/content/Context
       8: aastore
       9: putstatic     #27                 // Field a:[Ljava/lang/Class;
      12: getstatic     #27                 // Field a:[Ljava/lang/Class;
      15: putstatic     #29                 // Field b:[Ljava/lang/Class;
      18: return

  public android.support.v7.view.g(android.content.Context);
    Code:
       0: aload_0
       1: aload_1
       2: invokespecial #34                 // Method android/view/MenuInflater."<init>":(Landroid/content/Context;)V
       5: aload_0
       6: aload_1
       7: putfield      #36                 // Field e:Landroid/content/Context;
      10: aload_0
      11: iconst_1
      12: anewarray     #38                 // class java/lang/Object
      15: dup
      16: iconst_0
      17: aload_1
      18: aastore
      19: putfield      #40                 // Field c:[Ljava/lang/Object;
      22: aload_0
      23: aload_0
      24: getfield      #40                 // Field c:[Ljava/lang/Object;
      27: putfield      #42                 // Field d:[Ljava/lang/Object;
      30: return

  java.lang.Object a();
    Code:
       0: aload_0
       1: getfield      #129                // Field f:Ljava/lang/Object;
       4: ifnonnull     19
       7: aload_0
       8: aload_0
       9: aload_0
      10: getfield      #36                 // Field e:Landroid/content/Context;
      13: invokespecial #53                 // Method a:(Ljava/lang/Object;)Ljava/lang/Object;
      16: putfield      #129                // Field f:Ljava/lang/Object;
      19: aload_0
      20: getfield      #129                // Field f:Ljava/lang/Object;
      23: areturn

  public void inflate(int, android.view.Menu);
    Code:
       0: aload_2
       1: instanceof    #137                // class android/support/v4/c/a/a
       4: ifne          14
       7: aload_0
       8: iload_1
       9: aload_2
      10: invokespecial #139                // Method android/view/MenuInflater.inflate:(ILandroid/view/Menu;)V
      13: return
      14: aconst_null
      15: astore        5
      17: aconst_null
      18: astore        6
      20: aconst_null
      21: astore_3
      22: aload_0
      23: getfield      #36                 // Field e:Landroid/content/Context;
      26: invokevirtual #143                // Method android/content/Context.getResources:()Landroid/content/res/Resources;
      29: iload_1
      30: invokevirtual #149                // Method android/content/res/Resources.getLayout:(I)Landroid/content/res/XmlResourceParser;
      33: astore        4
      35: aload_0
      36: aload         4
      38: aload         4
      40: invokestatic  #155                // Method android/util/Xml.asAttributeSet:(Lorg/xmlpull/v1/XmlPullParser;)Landroid/util/AttributeSet;
      43: aload_2
      44: invokespecial #124                // Method a:(Lorg/xmlpull/v1/XmlPullParser;Landroid/util/AttributeSet;Landroid/view/Menu;)V
      47: aload         4
      49: ifnull        59
      52: aload         4
      54: invokeinterface #160,  1          // InterfaceMethod android/content/res/XmlResourceParser.close:()V
      59: return
      60: astore_2
      61: aload         4
      63: astore_3
      64: goto          111
      67: astore_2
      68: aload         4
      70: astore_3
      71: goto          89
      74: astore_2
      75: aload         4
      77: astore_3
      78: goto          100
      81: astore_2
      82: goto          111
      85: astore_2
      86: aload         5
      88: astore_3
      89: new           #162                // class android/view/InflateException
      92: dup
      93: ldc           #164                // String Error inflating menu XML
      95: aload_2
      96: invokespecial #167                // Method android/view/InflateException."<init>":(Ljava/lang/String;Ljava/lang/Throwable;)V
      99: athrow
     100: new           #162                // class android/view/InflateException
     103: dup
     104: ldc           #164                // String Error inflating menu XML
     106: aload_2
     107: invokespecial #167                // Method android/view/InflateException."<init>":(Ljava/lang/String;Ljava/lang/Throwable;)V
     110: athrow
     111: aload_3
     112: ifnull        121
     115: aload_3
     116: invokeinterface #160,  1          // InterfaceMethod android/content/res/XmlResourceParser.close:()V
     121: aload_2
     122: athrow
     123: astore_2
     124: aload         6
     126: astore_3
     127: goto          100
    Exception table:
       from    to  target type
          22    35   123   Class org/xmlpull/v1/XmlPullParserException
          22    35    85   Class java/io/IOException
          22    35    81   any
          35    47    74   Class org/xmlpull/v1/XmlPullParserException
          35    47    67   Class java/io/IOException
          35    47    60   any
          89   100    81   any
         100   111    81   any
}
