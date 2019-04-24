public class android.support.v7.widget.AlertDialogLayout extends android.support.v7.widget.av {
  public android.support.v7.widget.AlertDialogLayout(android.content.Context);
    Code:
       0: aload_0
       1: aload_1
       2: invokespecial #8                  // Method android/support/v7/widget/av."<init>":(Landroid/content/Context;)V
       5: return

  public android.support.v7.widget.AlertDialogLayout(android.content.Context, android.util.AttributeSet);
    Code:
       0: aload_0
       1: aload_1
       2: aload_2
       3: invokespecial #12                 // Method android/support/v7/widget/av."<init>":(Landroid/content/Context;Landroid/util/AttributeSet;)V
       6: return

  protected void onLayout(boolean, int, int, int, int);
    Code:
       0: aload_0
       1: invokevirtual #110                // Method getPaddingLeft:()I
       4: istore        7
       6: iload         4
       8: iload_2
       9: isub
      10: istore        8
      12: aload_0
      13: invokevirtual #113                // Method getPaddingRight:()I
      16: istore        9
      18: aload_0
      19: invokevirtual #113                // Method getPaddingRight:()I
      22: istore        10
      24: aload_0
      25: invokevirtual #142                // Method getMeasuredHeight:()I
      28: istore_2
      29: aload_0
      30: invokevirtual #41                 // Method getChildCount:()I
      33: istore        11
      35: aload_0
      36: invokevirtual #145                // Method getGravity:()I
      39: istore        12
      41: iload         12
      43: bipush        112
      45: iand
      46: istore        4
      48: iload         4
      50: bipush        16
      52: if_icmpeq     85
      55: iload         4
      57: bipush        80
      59: if_icmpeq     70
      62: aload_0
      63: invokevirtual #75                 // Method getPaddingTop:()I
      66: istore_2
      67: goto          103
      70: aload_0
      71: invokevirtual #75                 // Method getPaddingTop:()I
      74: iload         5
      76: iadd
      77: iload_3
      78: isub
      79: iload_2
      80: isub
      81: istore_2
      82: goto          103
      85: aload_0
      86: invokevirtual #75                 // Method getPaddingTop:()I
      89: istore        4
      91: iload         5
      93: iload_3
      94: isub
      95: iload_2
      96: isub
      97: iconst_2
      98: idiv
      99: iload         4
     101: iadd
     102: istore_2
     103: aload_0
     104: invokevirtual #149                // Method getDividerDrawable:()Landroid/graphics/drawable/Drawable;
     107: astore        15
     109: aload         15
     111: ifnonnull     119
     114: iconst_0
     115: istore_3
     116: goto          125
     119: aload         15
     121: invokevirtual #154                // Method android/graphics/drawable/Drawable.getIntrinsicHeight:()I
     124: istore_3
     125: iconst_0
     126: istore        4
     128: iload         4
     130: iload         11
     132: if_icmpge     360
     135: aload_0
     136: iload         4
     138: invokevirtual #42                 // Method getChildAt:(I)Landroid/view/View;
     141: astore        15
     143: iload_2
     144: istore        5
     146: aload         15
     148: ifnull        348
     151: iload_2
     152: istore        5
     154: aload         15
     156: invokevirtual #45                 // Method android/view/View.getVisibility:()I
     159: bipush        8
     161: if_icmpeq     348
     164: aload         15
     166: invokevirtual #107                // Method android/view/View.getMeasuredWidth:()I
     169: istore        13
     171: aload         15
     173: invokevirtual #85                 // Method android/view/View.getMeasuredHeight:()I
     176: istore        14
     178: aload         15
     180: invokevirtual #128                // Method android/view/View.getLayoutParams:()Landroid/view/ViewGroup$LayoutParams;
     183: checkcast     #130                // class android/support/v7/widget/av$a
     186: astore        16
     188: aload         16
     190: getfield      #157                // Field android/support/v7/widget/av$a.h:I
     193: istore        6
     195: iload         6
     197: istore        5
     199: iload         6
     201: ifge          211
     204: iload         12
     206: ldc           #158                // int 8388615
     208: iand
     209: istore        5
     211: iload         5
     213: aload_0
     214: invokestatic  #161                // Method android/support/v4/view/s.e:(Landroid/view/View;)I
     217: invokestatic  #165                // Method android/support/v4/view/e.a:(II)I
     220: bipush        7
     222: iand
     223: istore        5
     225: iload         5
     227: iconst_1
     228: if_icmpeq     263
     231: iload         5
     233: iconst_5
     234: if_icmpeq     250
     237: aload         16
     239: getfield      #168                // Field android/support/v7/widget/av$a.leftMargin:I
     242: iload         7
     244: iadd
     245: istore        5
     247: goto          297
     250: iload         8
     252: iload         9
     254: isub
     255: iload         13
     257: isub
     258: istore        5
     260: goto          287
     263: iload         8
     265: iload         7
     267: isub
     268: iload         10
     270: isub
     271: iload         13
     273: isub
     274: iconst_2
     275: idiv
     276: iload         7
     278: iadd
     279: aload         16
     281: getfield      #168                // Field android/support/v7/widget/av$a.leftMargin:I
     284: iadd
     285: istore        5
     287: iload         5
     289: aload         16
     291: getfield      #171                // Field android/support/v7/widget/av$a.rightMargin:I
     294: isub
     295: istore        5
     297: iload_2
     298: istore        6
     300: aload_0
     301: iload         4
     303: invokevirtual #174                // Method c:(I)Z
     306: ifeq          314
     309: iload_2
     310: iload_3
     311: iadd
     312: istore        6
     314: iload         6
     316: aload         16
     318: getfield      #177                // Field android/support/v7/widget/av$a.topMargin:I
     321: iadd
     322: istore_2
     323: aload_0
     324: aload         15
     326: iload         5
     328: iload_2
     329: iload         13
     331: iload         14
     333: invokespecial #179                // Method a:(Landroid/view/View;IIII)V
     336: iload_2
     337: iload         14
     339: aload         16
     341: getfield      #182                // Field android/support/v7/widget/av$a.bottomMargin:I
     344: iadd
     345: iadd
     346: istore        5
     348: iload         4
     350: iconst_1
     351: iadd
     352: istore        4
     354: iload         5
     356: istore_2
     357: goto          128
     360: return

  protected void onMeasure(int, int);
    Code:
       0: aload_0
       1: iload_1
       2: iload_2
       3: invokespecial #185                // Method c:(II)Z
       6: ifne          15
       9: aload_0
      10: iload_1
      11: iload_2
      12: invokespecial #187                // Method android/support/v7/widget/av.onMeasure:(II)V
      15: return
}
