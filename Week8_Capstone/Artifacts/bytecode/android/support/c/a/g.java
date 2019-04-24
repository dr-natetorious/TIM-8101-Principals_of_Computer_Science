public class android.support.c.a.g implements android.view.animation.Interpolator {
  public android.support.c.a.g(android.content.Context, android.util.AttributeSet, org.xmlpull.v1.XmlPullParser);
    Code:
       0: aload_0
       1: aload_1
       2: invokevirtual #17                 // Method android/content/Context.getResources:()Landroid/content/res/Resources;
       5: aload_1
       6: invokevirtual #21                 // Method android/content/Context.getTheme:()Landroid/content/res/Resources$Theme;
       9: aload_2
      10: aload_3
      11: invokespecial #24                 // Method "<init>":(Landroid/content/res/Resources;Landroid/content/res/Resources$Theme;Landroid/util/AttributeSet;Lorg/xmlpull/v1/XmlPullParser;)V
      14: return

  public android.support.c.a.g(android.content.res.Resources, android.content.res.Resources$Theme, android.util.AttributeSet, org.xmlpull.v1.XmlPullParser);
    Code:
       0: aload_0
       1: invokespecial #28                 // Method java/lang/Object."<init>":()V
       4: aload_1
       5: aload_2
       6: aload_3
       7: getstatic     #34                 // Field android/support/c/a/a.l:[I
      10: invokestatic  #39                 // Method android/support/v4/a/a/c.a:(Landroid/content/res/Resources;Landroid/content/res/Resources$Theme;Landroid/util/AttributeSet;[I)Landroid/content/res/TypedArray;
      13: astore_1
      14: aload_0
      15: aload_1
      16: aload         4
      18: invokespecial #42                 // Method a:(Landroid/content/res/TypedArray;Lorg/xmlpull/v1/XmlPullParser;)V
      21: aload_1
      22: invokevirtual #47                 // Method android/content/res/TypedArray.recycle:()V
      25: return

  public float getInterpolation(float);
    Code:
       0: fload_1
       1: fconst_0
       2: fcmpg
       3: ifgt          8
       6: fconst_0
       7: freturn
       8: fload_1
       9: fconst_1
      10: fcmpl
      11: iflt          16
      14: fconst_1
      15: freturn
      16: iconst_0
      17: istore        4
      19: aload_0
      20: getfield      #143                // Field a:[F
      23: arraylength
      24: iconst_1
      25: isub
      26: istore_3
      27: iload_3
      28: iload         4
      30: isub
      31: iconst_1
      32: if_icmple     68
      35: iload         4
      37: iload_3
      38: iadd
      39: iconst_2
      40: idiv
      41: istore        5
      43: fload_1
      44: aload_0
      45: getfield      #143                // Field a:[F
      48: iload         5
      50: faload
      51: fcmpg
      52: ifge          61
      55: iload         5
      57: istore_3
      58: goto          27
      61: iload         5
      63: istore        4
      65: goto          27
      68: aload_0
      69: getfield      #143                // Field a:[F
      72: iload_3
      73: faload
      74: aload_0
      75: getfield      #143                // Field a:[F
      78: iload         4
      80: faload
      81: fsub
      82: fstore_2
      83: fload_2
      84: fconst_0
      85: fcmpl
      86: ifne          97
      89: aload_0
      90: getfield      #145                // Field b:[F
      93: iload         4
      95: faload
      96: freturn
      97: fload_1
      98: aload_0
      99: getfield      #143                // Field a:[F
     102: iload         4
     104: faload
     105: fsub
     106: fload_2
     107: fdiv
     108: fstore_1
     109: aload_0
     110: getfield      #145                // Field b:[F
     113: iload         4
     115: faload
     116: fstore_2
     117: fload_2
     118: fload_1
     119: aload_0
     120: getfield      #145                // Field b:[F
     123: iload_3
     124: faload
     125: fload_2
     126: fsub
     127: fmul
     128: fadd
     129: freturn
}
