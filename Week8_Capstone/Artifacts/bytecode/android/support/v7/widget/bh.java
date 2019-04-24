public class android.support.v7.widget.bh extends android.widget.HorizontalScrollView implements android.widget.AdapterView$OnItemSelectedListener {
  java.lang.Runnable a;

  android.support.v7.widget.av b;

  int c;

  int d;

  static {};
    Code:
       0: new           #35                 // class android/view/animation/DecelerateInterpolator
       3: dup
       4: invokespecial #38                 // Method android/view/animation/DecelerateInterpolator."<init>":()V
       7: putstatic     #40                 // Field j:Landroid/view/animation/Interpolator;
      10: return

  android.support.v7.widget.bh$c a(android.support.v7.app.a$c, boolean);
    Code:
       0: new           #16                 // class android/support/v7/widget/bh$c
       3: dup
       4: aload_0
       5: aload_0
       6: invokevirtual #106                // Method getContext:()Landroid/content/Context;
       9: aload_1
      10: iload_2
      11: invokespecial #129                // Method android/support/v7/widget/bh$c."<init>":(Landroid/support/v7/widget/bh;Landroid/content/Context;Landroid/support/v7/app/a$c;Z)V
      14: astore_1
      15: iload_2
      16: ifeq          42
      19: aload_1
      20: aconst_null
      21: invokevirtual #133                // Method android/support/v7/widget/bh$c.setBackgroundDrawable:(Landroid/graphics/drawable/Drawable;)V
      24: aload_1
      25: new           #135                // class android/widget/AbsListView$LayoutParams
      28: dup
      29: iconst_m1
      30: aload_0
      31: getfield      #137                // Field h:I
      34: invokespecial #138                // Method android/widget/AbsListView$LayoutParams."<init>":(II)V
      37: invokevirtual #139                // Method android/support/v7/widget/bh$c.setLayoutParams:(Landroid/view/ViewGroup$LayoutParams;)V
      40: aload_1
      41: areturn
      42: aload_1
      43: iconst_1
      44: invokevirtual #143                // Method android/support/v7/widget/bh$c.setFocusable:(Z)V
      47: aload_0
      48: getfield      #145                // Field e:Landroid/support/v7/widget/bh$b;
      51: ifnonnull     66
      54: aload_0
      55: new           #13                 // class android/support/v7/widget/bh$b
      58: dup
      59: aload_0
      60: invokespecial #146                // Method android/support/v7/widget/bh$b."<init>":(Landroid/support/v7/widget/bh;)V
      63: putfield      #145                // Field e:Landroid/support/v7/widget/bh$b;
      66: aload_1
      67: aload_0
      68: getfield      #145                // Field e:Landroid/support/v7/widget/bh$b;
      71: invokevirtual #150                // Method android/support/v7/widget/bh$c.setOnClickListener:(Landroid/view/View$OnClickListener;)V
      74: aload_1
      75: areturn

  public void a(int);
    Code:
       0: aload_0
       1: getfield      #57                 // Field b:Landroid/support/v7/widget/av;
       4: iload_1
       5: invokevirtual #156                // Method android/support/v7/widget/av.getChildAt:(I)Landroid/view/View;
       8: astore_2
       9: aload_0
      10: getfield      #83                 // Field a:Ljava/lang/Runnable;
      13: ifnull        25
      16: aload_0
      17: aload_0
      18: getfield      #83                 // Field a:Ljava/lang/Runnable;
      21: invokevirtual #87                 // Method removeCallbacks:(Ljava/lang/Runnable;)Z
      24: pop
      25: aload_0
      26: new           #8                  // class android/support/v7/widget/bh$1
      29: dup
      30: aload_0
      31: aload_2
      32: invokespecial #159                // Method android/support/v7/widget/bh$1."<init>":(Landroid/support/v7/widget/bh;Landroid/view/View;)V
      35: putfield      #83                 // Field a:Ljava/lang/Runnable;
      38: aload_0
      39: aload_0
      40: getfield      #83                 // Field a:Ljava/lang/Runnable;
      43: invokevirtual #162                // Method post:(Ljava/lang/Runnable;)Z
      46: pop
      47: return

  public void onAttachedToWindow();
    Code:
       0: aload_0
       1: invokespecial #165                // Method android/widget/HorizontalScrollView.onAttachedToWindow:()V
       4: aload_0
       5: getfield      #83                 // Field a:Ljava/lang/Runnable;
       8: ifnull        20
      11: aload_0
      12: aload_0
      13: getfield      #83                 // Field a:Ljava/lang/Runnable;
      16: invokevirtual #162                // Method post:(Ljava/lang/Runnable;)Z
      19: pop
      20: return

  protected void onConfigurationChanged(android.content.res.Configuration);
    Code:
       0: aload_0
       1: aload_1
       2: invokespecial #169                // Method android/widget/HorizontalScrollView.onConfigurationChanged:(Landroid/content/res/Configuration;)V
       5: aload_0
       6: invokevirtual #106                // Method getContext:()Landroid/content/Context;
       9: invokestatic  #174                // Method android/support/v7/view/a.a:(Landroid/content/Context;)Landroid/support/v7/view/a;
      12: astore_1
      13: aload_0
      14: aload_1
      15: invokevirtual #176                // Method android/support/v7/view/a.e:()I
      18: invokevirtual #179                // Method setContentHeight:(I)V
      21: aload_0
      22: aload_1
      23: invokevirtual #181                // Method android/support/v7/view/a.g:()I
      26: putfield      #183                // Field d:I
      29: return

  public void onDetachedFromWindow();
    Code:
       0: aload_0
       1: invokespecial #186                // Method android/widget/HorizontalScrollView.onDetachedFromWindow:()V
       4: aload_0
       5: getfield      #83                 // Field a:Ljava/lang/Runnable;
       8: ifnull        20
      11: aload_0
      12: aload_0
      13: getfield      #83                 // Field a:Ljava/lang/Runnable;
      16: invokevirtual #87                 // Method removeCallbacks:(Ljava/lang/Runnable;)Z
      19: pop
      20: return

  public void onItemSelected(android.widget.AdapterView<?>, android.view.View, int, long);
    Code:
       0: aload_2
       1: checkcast     #16                 // class android/support/v7/widget/bh$c
       4: invokevirtual #191                // Method android/support/v7/widget/bh$c.b:()Landroid/support/v7/app/a$c;
       7: invokevirtual #195                // Method android/support/v7/app/a$c.d:()V
      10: return

  public void onMeasure(int, int);
    Code:
       0: iload_1
       1: invokestatic  #204                // Method android/view/View$MeasureSpec.getMode:(I)I
       4: istore_2
       5: iconst_1
       6: istore_3
       7: iload_2
       8: ldc           #205                // int 1073741824
      10: if_icmpne     19
      13: iconst_1
      14: istore        5
      16: goto          22
      19: iconst_0
      20: istore        5
      22: aload_0
      23: iload         5
      25: invokevirtual #208                // Method setFillViewport:(Z)V
      28: aload_0
      29: getfield      #57                 // Field b:Landroid/support/v7/widget/av;
      32: invokevirtual #211                // Method android/support/v7/widget/av.getChildCount:()I
      35: istore        4
      37: iload         4
      39: iconst_1
      40: if_icmple     102
      43: iload_2
      44: ldc           #205                // int 1073741824
      46: if_icmpeq     55
      49: iload_2
      50: ldc           #212                // int -2147483648
      52: if_icmpne     102
      55: iload         4
      57: iconst_2
      58: if_icmple     77
      61: aload_0
      62: iload_1
      63: invokestatic  #215                // Method android/view/View$MeasureSpec.getSize:(I)I
      66: i2f
      67: ldc           #216                // float 0.4f
      69: fmul
      70: f2i
      71: putfield      #218                // Field c:I
      74: goto          87
      77: aload_0
      78: iload_1
      79: invokestatic  #215                // Method android/view/View$MeasureSpec.getSize:(I)I
      82: iconst_2
      83: idiv
      84: putfield      #218                // Field c:I
      87: aload_0
      88: getfield      #218                // Field c:I
      91: aload_0
      92: getfield      #183                // Field d:I
      95: invokestatic  #224                // Method java/lang/Math.min:(II)I
      98: istore_2
      99: goto          104
     102: iconst_m1
     103: istore_2
     104: aload_0
     105: iload_2
     106: putfield      #218                // Field c:I
     109: aload_0
     110: getfield      #137                // Field h:I
     113: ldc           #205                // int 1073741824
     115: invokestatic  #227                // Method android/view/View$MeasureSpec.makeMeasureSpec:(II)I
     118: istore        4
     120: iload         5
     122: ifne          137
     125: aload_0
     126: getfield      #229                // Field g:Z
     129: ifeq          137
     132: iload_3
     133: istore_2
     134: goto          139
     137: iconst_0
     138: istore_2
     139: iload_2
     140: ifeq          174
     143: aload_0
     144: getfield      #57                 // Field b:Landroid/support/v7/widget/av;
     147: iconst_0
     148: iload         4
     150: invokevirtual #232                // Method android/support/v7/widget/av.measure:(II)V
     153: aload_0
     154: getfield      #57                 // Field b:Landroid/support/v7/widget/av;
     157: invokevirtual #235                // Method android/support/v7/widget/av.getMeasuredWidth:()I
     160: iload_1
     161: invokestatic  #215                // Method android/view/View$MeasureSpec.getSize:(I)I
     164: if_icmple     174
     167: aload_0
     168: invokespecial #237                // Method b:()V
     171: goto          179
     174: aload_0
     175: invokespecial #239                // Method c:()Z
     178: pop
     179: aload_0
     180: invokevirtual #240                // Method getMeasuredWidth:()I
     183: istore_2
     184: aload_0
     185: iload_1
     186: iload         4
     188: invokespecial #242                // Method android/widget/HorizontalScrollView.onMeasure:(II)V
     191: aload_0
     192: invokevirtual #240                // Method getMeasuredWidth:()I
     195: istore_1
     196: iload         5
     198: ifeq          214
     201: iload_2
     202: iload_1
     203: if_icmpeq     214
     206: aload_0
     207: aload_0
     208: getfield      #89                 // Field i:I
     211: invokevirtual #100                // Method setTabSelected:(I)V
     214: return

  public void onNothingSelected(android.widget.AdapterView<?>);
    Code:
       0: return

  public void setAllowCollapse(boolean);
    Code:
       0: aload_0
       1: iload_1
       2: putfield      #229                // Field g:Z
       5: return

  public void setContentHeight(int);
    Code:
       0: aload_0
       1: iload_1
       2: putfield      #137                // Field h:I
       5: aload_0
       6: invokevirtual #249                // Method requestLayout:()V
       9: return

  public void setTabSelected(int);
    Code:
       0: aload_0
       1: iload_1
       2: putfield      #89                 // Field i:I
       5: aload_0
       6: getfield      #57                 // Field b:Landroid/support/v7/widget/av;
       9: invokevirtual #211                // Method android/support/v7/widget/av.getChildCount:()I
      12: istore_3
      13: iconst_0
      14: istore_2
      15: iload_2
      16: iload_3
      17: if_icmpge     68
      20: aload_0
      21: getfield      #57                 // Field b:Landroid/support/v7/widget/av;
      24: iload_2
      25: invokevirtual #156                // Method android/support/v7/widget/av.getChildAt:(I)Landroid/view/View;
      28: astore        5
      30: iload_2
      31: iload_1
      32: if_icmpne     41
      35: iconst_1
      36: istore        4
      38: goto          44
      41: iconst_0
      42: istore        4
      44: aload         5
      46: iload         4
      48: invokevirtual #254                // Method android/view/View.setSelected:(Z)V
      51: iload         4
      53: ifeq          61
      56: aload_0
      57: iload_1
      58: invokevirtual #256                // Method a:(I)V
      61: iload_2
      62: iconst_1
      63: iadd
      64: istore_2
      65: goto          15
      68: aload_0
      69: getfield      #44                 // Field f:Landroid/widget/Spinner;
      72: ifnull        87
      75: iload_1
      76: iflt          87
      79: aload_0
      80: getfield      #44                 // Field f:Landroid/widget/Spinner;
      83: iload_1
      84: invokevirtual #93                 // Method android/widget/Spinner.setSelection:(I)V
      87: return
}
