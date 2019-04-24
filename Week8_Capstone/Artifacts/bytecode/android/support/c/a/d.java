public class android.support.c.a.d {
  public static android.view.animation.Interpolator a(android.content.Context, int);
    Code:
       0: getstatic     #16                 // Field android/os/Build$VERSION.SDK_INT:I
       3: bipush        21
       5: if_icmplt     14
       8: aload_0
       9: iload_1
      10: invokestatic  #21                 // Method android/view/animation/AnimationUtils.loadInterpolator:(Landroid/content/Context;I)Landroid/view/animation/Interpolator;
      13: areturn
      14: aconst_null
      15: astore        5
      17: aconst_null
      18: astore_2
      19: aconst_null
      20: astore        4
      22: iload_1
      23: ldc           #22                 // int 17563663
      25: if_icmpne     36
      28: new           #24                 // class android/support/v4/view/b/a
      31: dup
      32: invokespecial #28                 // Method android/support/v4/view/b/a."<init>":()V
      35: areturn
      36: iload_1
      37: ldc           #29                 // int 17563661
      39: if_icmpne     50
      42: new           #31                 // class android/support/v4/view/b/b
      45: dup
      46: invokespecial #32                 // Method android/support/v4/view/b/b."<init>":()V
      49: areturn
      50: iload_1
      51: ldc           #33                 // int 17563662
      53: if_icmpne     64
      56: new           #35                 // class android/support/v4/view/b/c
      59: dup
      60: invokespecial #36                 // Method android/support/v4/view/b/c."<init>":()V
      63: areturn
      64: aload_0
      65: invokevirtual #42                 // Method android/content/Context.getResources:()Landroid/content/res/Resources;
      68: iload_1
      69: invokevirtual #48                 // Method android/content/res/Resources.getAnimation:(I)Landroid/content/res/XmlResourceParser;
      72: astore_3
      73: aload_0
      74: aload_0
      75: invokevirtual #42                 // Method android/content/Context.getResources:()Landroid/content/res/Resources;
      78: aload_0
      79: invokevirtual #52                 // Method android/content/Context.getTheme:()Landroid/content/res/Resources$Theme;
      82: aload_3
      83: invokestatic  #55                 // Method a:(Landroid/content/Context;Landroid/content/res/Resources;Landroid/content/res/Resources$Theme;Lorg/xmlpull/v1/XmlPullParser;)Landroid/view/animation/Interpolator;
      86: astore_0
      87: aload_3
      88: ifnull        97
      91: aload_3
      92: invokeinterface #60,  1           // InterfaceMethod android/content/res/XmlResourceParser.close:()V
      97: aload_0
      98: areturn
      99: astore_0
     100: aload_3
     101: astore_2
     102: goto          247
     105: astore_2
     106: aload_3
     107: astore_0
     108: aload_2
     109: astore_3
     110: goto          121
     113: astore_2
     114: aload_3
     115: astore_0
     116: aload_2
     117: astore_3
     118: goto          184
     121: aload_0
     122: astore_2
     123: new           #62                 // class java/lang/StringBuilder
     126: dup
     127: invokespecial #63                 // Method java/lang/StringBuilder."<init>":()V
     130: astore        4
     132: aload_0
     133: astore_2
     134: aload         4
     136: ldc           #65                 // String Can't load animation resource ID #0x
     138: invokevirtual #69                 // Method java/lang/StringBuilder.append:(Ljava/lang/String;)Ljava/lang/StringBuilder;
     141: pop
     142: aload_0
     143: astore_2
     144: aload         4
     146: iload_1
     147: invokestatic  #75                 // Method java/lang/Integer.toHexString:(I)Ljava/lang/String;
     150: invokevirtual #69                 // Method java/lang/StringBuilder.append:(Ljava/lang/String;)Ljava/lang/StringBuilder;
     153: pop
     154: aload_0
     155: astore_2
     156: new           #77                 // class android/content/res/Resources$NotFoundException
     159: dup
     160: aload         4
     162: invokevirtual #81                 // Method java/lang/StringBuilder.toString:()Ljava/lang/String;
     165: invokespecial #84                 // Method android/content/res/Resources$NotFoundException."<init>":(Ljava/lang/String;)V
     168: astore        4
     170: aload_0
     171: astore_2
     172: aload         4
     174: aload_3
     175: invokevirtual #88                 // Method android/content/res/Resources$NotFoundException.initCause:(Ljava/lang/Throwable;)Ljava/lang/Throwable;
     178: pop
     179: aload_0
     180: astore_2
     181: aload         4
     183: athrow
     184: aload_0
     185: astore_2
     186: new           #62                 // class java/lang/StringBuilder
     189: dup
     190: invokespecial #63                 // Method java/lang/StringBuilder."<init>":()V
     193: astore        4
     195: aload_0
     196: astore_2
     197: aload         4
     199: ldc           #65                 // String Can't load animation resource ID #0x
     201: invokevirtual #69                 // Method java/lang/StringBuilder.append:(Ljava/lang/String;)Ljava/lang/StringBuilder;
     204: pop
     205: aload_0
     206: astore_2
     207: aload         4
     209: iload_1
     210: invokestatic  #75                 // Method java/lang/Integer.toHexString:(I)Ljava/lang/String;
     213: invokevirtual #69                 // Method java/lang/StringBuilder.append:(Ljava/lang/String;)Ljava/lang/StringBuilder;
     216: pop
     217: aload_0
     218: astore_2
     219: new           #77                 // class android/content/res/Resources$NotFoundException
     222: dup
     223: aload         4
     225: invokevirtual #81                 // Method java/lang/StringBuilder.toString:()Ljava/lang/String;
     228: invokespecial #84                 // Method android/content/res/Resources$NotFoundException."<init>":(Ljava/lang/String;)V
     231: astore        4
     233: aload_0
     234: astore_2
     235: aload         4
     237: aload_3
     238: invokevirtual #88                 // Method android/content/res/Resources$NotFoundException.initCause:(Ljava/lang/Throwable;)Ljava/lang/Throwable;
     241: pop
     242: aload_0
     243: astore_2
     244: aload         4
     246: athrow
     247: aload_2
     248: ifnull        257
     251: aload_2
     252: invokeinterface #60,  1           // InterfaceMethod android/content/res/XmlResourceParser.close:()V
     257: aload_0
     258: athrow
     259: astore_0
     260: goto          247
     263: astore_3
     264: aload         4
     266: astore_0
     267: goto          121
     270: astore_3
     271: aload         5
     273: astore_0
     274: goto          184
    Exception table:
       from    to  target type
          28    36   270   Class org/xmlpull/v1/XmlPullParserException
          28    36   263   Class java/io/IOException
          28    36   259   any
          42    50   270   Class org/xmlpull/v1/XmlPullParserException
          42    50   263   Class java/io/IOException
          42    50   259   any
          56    64   270   Class org/xmlpull/v1/XmlPullParserException
          56    64   263   Class java/io/IOException
          56    64   259   any
          64    73   270   Class org/xmlpull/v1/XmlPullParserException
          64    73   263   Class java/io/IOException
          64    73   259   any
          73    87   113   Class org/xmlpull/v1/XmlPullParserException
          73    87   105   Class java/io/IOException
          73    87    99   any
         123   132   259   any
         134   142   259   any
         144   154   259   any
         156   170   259   any
         172   179   259   any
         181   184   259   any
         186   195   259   any
         197   205   259   any
         207   217   259   any
         219   233   259   any
         235   242   259   any
         244   247   259   any
}
