public class android.support.v7.widget.ButtonBarLayout extends android.widget.LinearLayout {
  public android.support.v7.widget.ButtonBarLayout(android.content.Context, android.util.AttributeSet);
    Code:
       0: aload_0
       1: aload_1
       2: aload_2
       3: invokespecial #13                 // Method android/widget/LinearLayout."<init>":(Landroid/content/Context;Landroid/util/AttributeSet;)V
       6: aload_0
       7: iconst_m1
       8: putfield      #15                 // Field b:I
      11: aload_0
      12: iconst_0
      13: putfield      #17                 // Field c:I
      16: aload_1
      17: aload_2
      18: getstatic     #23                 // Field android/support/v7/a/a$j.ButtonBarLayout:[I
      21: invokevirtual #29                 // Method android/content/Context.obtainStyledAttributes:(Landroid/util/AttributeSet;[I)Landroid/content/res/TypedArray;
      24: astore_1
      25: aload_0
      26: aload_1
      27: getstatic     #32                 // Field android/support/v7/a/a$j.ButtonBarLayout_allowStacking:I
      30: iconst_1
      31: invokevirtual #38                 // Method android/content/res/TypedArray.getBoolean:(IZ)Z
      34: putfield      #40                 // Field a:Z
      37: aload_1
      38: invokevirtual #44                 // Method android/content/res/TypedArray.recycle:()V
      41: return

  public int getMinimumHeight();
    Code:
       0: aload_0
       1: getfield      #17                 // Field c:I
       4: aload_0
       5: invokespecial #77                 // Method android/widget/LinearLayout.getMinimumHeight:()I
       8: invokestatic  #83                 // Method java/lang/Math.max:(II)I
      11: ireturn

  protected void onMeasure(int, int);
    Code:
       0: iload_1
       1: invokestatic  #90                 // Method android/view/View$MeasureSpec.getSize:(I)I
       4: istore_3
       5: aload_0
       6: getfield      #40                 // Field a:Z
       9: istore        7
      11: iconst_0
      12: istore        6
      14: iload         7
      16: ifeq          44
      19: iload_3
      20: aload_0
      21: getfield      #15                 // Field b:I
      24: if_icmple     39
      27: aload_0
      28: invokespecial #92                 // Method a:()Z
      31: ifeq          39
      34: aload_0
      35: iconst_0
      36: invokespecial #94                 // Method setStacked:(Z)V
      39: aload_0
      40: iload_3
      41: putfield      #15                 // Field b:I
      44: aload_0
      45: invokespecial #92                 // Method a:()Z
      48: ifne          73
      51: iload_1
      52: invokestatic  #97                 // Method android/view/View$MeasureSpec.getMode:(I)I
      55: ldc           #98                 // int 1073741824
      57: if_icmpne     73
      60: iload_3
      61: ldc           #99                 // int -2147483648
      63: invokestatic  #102                // Method android/view/View$MeasureSpec.makeMeasureSpec:(II)I
      66: istore        4
      68: iconst_1
      69: istore_3
      70: goto          78
      73: iload_1
      74: istore        4
      76: iconst_0
      77: istore_3
      78: aload_0
      79: iload         4
      81: iload_2
      82: invokespecial #104                // Method android/widget/LinearLayout.onMeasure:(II)V
      85: iload_3
      86: istore        5
      88: aload_0
      89: getfield      #40                 // Field a:Z
      92: ifeq          142
      95: iload_3
      96: istore        5
      98: aload_0
      99: invokespecial #92                 // Method a:()Z
     102: ifne          142
     105: aload_0
     106: invokevirtual #107                // Method getMeasuredWidthAndState:()I
     109: ldc           #108                // int -16777216
     111: iand
     112: ldc           #109                // int 16777216
     114: if_icmpne     123
     117: iconst_1
     118: istore        4
     120: goto          126
     123: iconst_0
     124: istore        4
     126: iload_3
     127: istore        5
     129: iload         4
     131: ifeq          142
     134: aload_0
     135: iconst_1
     136: invokespecial #94                 // Method setStacked:(Z)V
     139: iconst_1
     140: istore        5
     142: iload         5
     144: ifeq          153
     147: aload_0
     148: iload_1
     149: iload_2
     150: invokespecial #104                // Method android/widget/LinearLayout.onMeasure:(II)V
     153: aload_0
     154: iconst_0
     155: invokespecial #111                // Method a:(I)I
     158: istore_3
     159: iload         6
     161: istore_1
     162: iload_3
     163: iflt          265
     166: aload_0
     167: iload_3
     168: invokevirtual #54                 // Method getChildAt:(I)Landroid/view/View;
     171: astore        8
     173: aload         8
     175: invokevirtual #115                // Method android/view/View.getLayoutParams:()Landroid/view/ViewGroup$LayoutParams;
     178: checkcast     #117                // class android/widget/LinearLayout$LayoutParams
     181: astore        9
     183: aload_0
     184: invokevirtual #120                // Method getPaddingTop:()I
     187: aload         8
     189: invokevirtual #123                // Method android/view/View.getMeasuredHeight:()I
     192: iadd
     193: aload         9
     195: getfield      #126                // Field android/widget/LinearLayout$LayoutParams.topMargin:I
     198: iadd
     199: aload         9
     201: getfield      #129                // Field android/widget/LinearLayout$LayoutParams.bottomMargin:I
     204: iadd
     205: iconst_0
     206: iadd
     207: istore_2
     208: aload_0
     209: invokespecial #92                 // Method a:()Z
     212: ifeq          258
     215: aload_0
     216: iload_3
     217: iconst_1
     218: iadd
     219: invokespecial #111                // Method a:(I)I
     222: istore_3
     223: iload_2
     224: istore_1
     225: iload_3
     226: iflt          255
     229: iload_2
     230: aload_0
     231: iload_3
     232: invokevirtual #54                 // Method getChildAt:(I)Landroid/view/View;
     235: invokevirtual #130                // Method android/view/View.getPaddingTop:()I
     238: aload_0
     239: invokevirtual #134                // Method getResources:()Landroid/content/res/Resources;
     242: invokevirtual #140                // Method android/content/res/Resources.getDisplayMetrics:()Landroid/util/DisplayMetrics;
     245: getfield      #146                // Field android/util/DisplayMetrics.density:F
     248: ldc           #147                // float 16.0f
     250: fmul
     251: f2i
     252: iadd
     253: iadd
     254: istore_1
     255: goto          265
     258: iload_2
     259: aload_0
     260: invokevirtual #150                // Method getPaddingBottom:()I
     263: iadd
     264: istore_1
     265: aload_0
     266: invokestatic  #156                // Method android/support/v4/view/s.j:(Landroid/view/View;)I
     269: iload_1
     270: if_icmpeq     278
     273: aload_0
     274: iload_1
     275: invokevirtual #160                // Method setMinimumHeight:(I)V
     278: return

  public void setAllowStacking(boolean);
    Code:
       0: aload_0
       1: getfield      #40                 // Field a:Z
       4: iload_1
       5: if_icmpeq     37
       8: aload_0
       9: iload_1
      10: putfield      #40                 // Field a:Z
      13: aload_0
      14: getfield      #40                 // Field a:Z
      17: ifne          33
      20: aload_0
      21: invokevirtual #63                 // Method getOrientation:()I
      24: iconst_1
      25: if_icmpne     33
      28: aload_0
      29: iconst_0
      30: invokespecial #94                 // Method setStacked:(Z)V
      33: aload_0
      34: invokevirtual #164                // Method requestLayout:()V
      37: return
}
