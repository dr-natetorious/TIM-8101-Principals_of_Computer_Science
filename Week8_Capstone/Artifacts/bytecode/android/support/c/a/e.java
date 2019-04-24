public class android.support.c.a.e {
  public static android.animation.Animator a(android.content.Context, int);
    Code:
       0: getstatic     #54                 // Field android/os/Build$VERSION.SDK_INT:I
       3: bipush        24
       5: if_icmplt     14
       8: aload_0
       9: iload_1
      10: invokestatic  #59                 // Method android/animation/AnimatorInflater.loadAnimator:(Landroid/content/Context;I)Landroid/animation/Animator;
      13: areturn
      14: aload_0
      15: aload_0
      16: invokevirtual #65                 // Method android/content/Context.getResources:()Landroid/content/res/Resources;
      19: aload_0
      20: invokevirtual #69                 // Method android/content/Context.getTheme:()Landroid/content/res/Resources$Theme;
      23: iload_1
      24: invokestatic  #72                 // Method a:(Landroid/content/Context;Landroid/content/res/Resources;Landroid/content/res/Resources$Theme;I)Landroid/animation/Animator;
      27: areturn

  public static android.animation.Animator a(android.content.Context, android.content.res.Resources, android.content.res.Resources$Theme, int);
    Code:
       0: aload_0
       1: aload_1
       2: aload_2
       3: iload_3
       4: fconst_1
       5: invokestatic  #75                 // Method a:(Landroid/content/Context;Landroid/content/res/Resources;Landroid/content/res/Resources$Theme;IF)Landroid/animation/Animator;
       8: areturn

  public static android.animation.Animator a(android.content.Context, android.content.res.Resources, android.content.res.Resources$Theme, int, float);
    Code:
       0: aconst_null
       1: astore        7
       3: aconst_null
       4: astore        8
       6: aconst_null
       7: astore        5
       9: aload_1
      10: iload_3
      11: invokevirtual #85                 // Method android/content/res/Resources.getAnimation:(I)Landroid/content/res/XmlResourceParser;
      14: astore        6
      16: aload_0
      17: aload_1
      18: aload_2
      19: aload         6
      21: fload         4
      23: invokestatic  #88                 // Method a:(Landroid/content/Context;Landroid/content/res/Resources;Landroid/content/res/Resources$Theme;Lorg/xmlpull/v1/XmlPullParser;F)Landroid/animation/Animator;
      26: astore_0
      27: aload         6
      29: ifnull        39
      32: aload         6
      34: invokeinterface #93,  1           // InterfaceMethod android/content/res/XmlResourceParser.close:()V
      39: aload_0
      40: areturn
      41: astore_0
      42: aload         6
      44: astore        5
      46: goto          195
      49: astore_1
      50: aload         6
      52: astore_0
      53: goto          71
      56: astore_1
      57: aload         6
      59: astore_0
      60: goto          133
      63: astore_0
      64: goto          195
      67: astore_1
      68: aload         7
      70: astore_0
      71: aload_0
      72: astore        5
      74: new           #95                 // class java/lang/StringBuilder
      77: dup
      78: invokespecial #98                 // Method java/lang/StringBuilder."<init>":()V
      81: astore_2
      82: aload_0
      83: astore        5
      85: aload_2
      86: ldc           #100                // String Can't load animation resource ID #0x
      88: invokevirtual #104                // Method java/lang/StringBuilder.append:(Ljava/lang/String;)Ljava/lang/StringBuilder;
      91: pop
      92: aload_0
      93: astore        5
      95: aload_2
      96: iload_3
      97: invokestatic  #110                // Method java/lang/Integer.toHexString:(I)Ljava/lang/String;
     100: invokevirtual #104                // Method java/lang/StringBuilder.append:(Ljava/lang/String;)Ljava/lang/StringBuilder;
     103: pop
     104: aload_0
     105: astore        5
     107: new           #112                // class android/content/res/Resources$NotFoundException
     110: dup
     111: aload_2
     112: invokevirtual #116                // Method java/lang/StringBuilder.toString:()Ljava/lang/String;
     115: invokespecial #119                // Method android/content/res/Resources$NotFoundException."<init>":(Ljava/lang/String;)V
     118: astore_2
     119: aload_0
     120: astore        5
     122: aload_2
     123: aload_1
     124: invokevirtual #123                // Method android/content/res/Resources$NotFoundException.initCause:(Ljava/lang/Throwable;)Ljava/lang/Throwable;
     127: pop
     128: aload_0
     129: astore        5
     131: aload_2
     132: athrow
     133: aload_0
     134: astore        5
     136: new           #95                 // class java/lang/StringBuilder
     139: dup
     140: invokespecial #98                 // Method java/lang/StringBuilder."<init>":()V
     143: astore_2
     144: aload_0
     145: astore        5
     147: aload_2
     148: ldc           #100                // String Can't load animation resource ID #0x
     150: invokevirtual #104                // Method java/lang/StringBuilder.append:(Ljava/lang/String;)Ljava/lang/StringBuilder;
     153: pop
     154: aload_0
     155: astore        5
     157: aload_2
     158: iload_3
     159: invokestatic  #110                // Method java/lang/Integer.toHexString:(I)Ljava/lang/String;
     162: invokevirtual #104                // Method java/lang/StringBuilder.append:(Ljava/lang/String;)Ljava/lang/StringBuilder;
     165: pop
     166: aload_0
     167: astore        5
     169: new           #112                // class android/content/res/Resources$NotFoundException
     172: dup
     173: aload_2
     174: invokevirtual #116                // Method java/lang/StringBuilder.toString:()Ljava/lang/String;
     177: invokespecial #119                // Method android/content/res/Resources$NotFoundException."<init>":(Ljava/lang/String;)V
     180: astore_2
     181: aload_0
     182: astore        5
     184: aload_2
     185: aload_1
     186: invokevirtual #123                // Method android/content/res/Resources$NotFoundException.initCause:(Ljava/lang/Throwable;)Ljava/lang/Throwable;
     189: pop
     190: aload_0
     191: astore        5
     193: aload_2
     194: athrow
     195: aload         5
     197: ifnull        207
     200: aload         5
     202: invokeinterface #93,  1           // InterfaceMethod android/content/res/XmlResourceParser.close:()V
     207: aload_0
     208: athrow
     209: astore_1
     210: aload         8
     212: astore_0
     213: goto          133
    Exception table:
       from    to  target type
           9    16   209   Class org/xmlpull/v1/XmlPullParserException
           9    16    67   Class java/io/IOException
           9    16    63   any
          16    27    56   Class org/xmlpull/v1/XmlPullParserException
          16    27    49   Class java/io/IOException
          16    27    41   any
          74    82    63   any
          85    92    63   any
          95   104    63   any
         107   119    63   any
         122   128    63   any
         131   133    63   any
         136   144    63   any
         147   154    63   any
         157   166    63   any
         169   181    63   any
         184   190    63   any
         193   195    63   any
}
