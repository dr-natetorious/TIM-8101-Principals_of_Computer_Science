public class android.support.v7.widget.ActionBarContainer extends android.widget.FrameLayout {
  android.graphics.drawable.Drawable a;

  android.graphics.drawable.Drawable b;

  android.graphics.drawable.Drawable c;

  boolean d;

  boolean e;

  public android.support.v7.widget.ActionBarContainer(android.content.Context);
    Code:
       0: aload_0
       1: aload_1
       2: aconst_null
       3: invokespecial #23                 // Method "<init>":(Landroid/content/Context;Landroid/util/AttributeSet;)V
       6: return

  public android.support.v7.widget.ActionBarContainer(android.content.Context, android.util.AttributeSet);
    Code:
       0: aload_0
       1: aload_1
       2: aload_2
       3: invokespecial #25                 // Method android/widget/FrameLayout."<init>":(Landroid/content/Context;Landroid/util/AttributeSet;)V
       6: getstatic     #30                 // Field android/os/Build$VERSION.SDK_INT:I
       9: bipush        21
      11: if_icmplt     27
      14: new           #32                 // class android/support/v7/widget/c
      17: dup
      18: aload_0
      19: invokespecial #35                 // Method android/support/v7/widget/c."<init>":(Landroid/support/v7/widget/ActionBarContainer;)V
      22: astore        5
      24: goto          37
      27: new           #37                 // class android/support/v7/widget/b
      30: dup
      31: aload_0
      32: invokespecial #38                 // Method android/support/v7/widget/b."<init>":(Landroid/support/v7/widget/ActionBarContainer;)V
      35: astore        5
      37: aload_0
      38: aload         5
      40: invokestatic  #43                 // Method android/support/v4/view/s.a:(Landroid/view/View;Landroid/graphics/drawable/Drawable;)V
      43: aload_1
      44: aload_2
      45: getstatic     #49                 // Field android/support/v7/a/a$j.ActionBar:[I
      48: invokevirtual #55                 // Method android/content/Context.obtainStyledAttributes:(Landroid/util/AttributeSet;[I)Landroid/content/res/TypedArray;
      51: astore_1
      52: aload_0
      53: aload_1
      54: getstatic     #58                 // Field android/support/v7/a/a$j.ActionBar_background:I
      57: invokevirtual #64                 // Method android/content/res/TypedArray.getDrawable:(I)Landroid/graphics/drawable/Drawable;
      60: putfield      #66                 // Field a:Landroid/graphics/drawable/Drawable;
      63: aload_0
      64: aload_1
      65: getstatic     #69                 // Field android/support/v7/a/a$j.ActionBar_backgroundStacked:I
      68: invokevirtual #64                 // Method android/content/res/TypedArray.getDrawable:(I)Landroid/graphics/drawable/Drawable;
      71: putfield      #71                 // Field b:Landroid/graphics/drawable/Drawable;
      74: aload_0
      75: aload_1
      76: getstatic     #74                 // Field android/support/v7/a/a$j.ActionBar_height:I
      79: iconst_m1
      80: invokevirtual #78                 // Method android/content/res/TypedArray.getDimensionPixelSize:(II)I
      83: putfield      #80                 // Field j:I
      86: aload_0
      87: invokevirtual #84                 // Method getId:()I
      90: getstatic     #89                 // Field android/support/v7/a/a$f.split_action_bar:I
      93: if_icmpne     112
      96: aload_0
      97: iconst_1
      98: putfield      #91                 // Field d:Z
     101: aload_0
     102: aload_1
     103: getstatic     #94                 // Field android/support/v7/a/a$j.ActionBar_backgroundSplit:I
     106: invokevirtual #64                 // Method android/content/res/TypedArray.getDrawable:(I)Landroid/graphics/drawable/Drawable;
     109: putfield      #96                 // Field c:Landroid/graphics/drawable/Drawable;
     112: aload_1
     113: invokevirtual #100                // Method android/content/res/TypedArray.recycle:()V
     116: aload_0
     117: getfield      #91                 // Field d:Z
     120: istore_3
     121: iconst_0
     122: istore        4
     124: iload_3
     125: ifeq          143
     128: iload         4
     130: istore_3
     131: aload_0
     132: getfield      #96                 // Field c:Landroid/graphics/drawable/Drawable;
     135: ifnonnull     166
     138: iconst_1
     139: istore_3
     140: goto          166
     143: iload         4
     145: istore_3
     146: aload_0
     147: getfield      #66                 // Field a:Landroid/graphics/drawable/Drawable;
     150: ifnonnull     166
     153: iload         4
     155: istore_3
     156: aload_0
     157: getfield      #71                 // Field b:Landroid/graphics/drawable/Drawable;
     160: ifnonnull     166
     163: goto          138
     166: aload_0
     167: iload_3
     168: invokevirtual #104                // Method setWillNotDraw:(Z)V
     171: return

  protected void drawableStateChanged();
    Code:
       0: aload_0
       1: invokespecial #129                // Method android/widget/FrameLayout.drawableStateChanged:()V
       4: aload_0
       5: getfield      #66                 // Field a:Landroid/graphics/drawable/Drawable;
       8: ifnull        33
      11: aload_0
      12: getfield      #66                 // Field a:Landroid/graphics/drawable/Drawable;
      15: invokevirtual #135                // Method android/graphics/drawable/Drawable.isStateful:()Z
      18: ifeq          33
      21: aload_0
      22: getfield      #66                 // Field a:Landroid/graphics/drawable/Drawable;
      25: aload_0
      26: invokevirtual #139                // Method getDrawableState:()[I
      29: invokevirtual #143                // Method android/graphics/drawable/Drawable.setState:([I)Z
      32: pop
      33: aload_0
      34: getfield      #71                 // Field b:Landroid/graphics/drawable/Drawable;
      37: ifnull        62
      40: aload_0
      41: getfield      #71                 // Field b:Landroid/graphics/drawable/Drawable;
      44: invokevirtual #135                // Method android/graphics/drawable/Drawable.isStateful:()Z
      47: ifeq          62
      50: aload_0
      51: getfield      #71                 // Field b:Landroid/graphics/drawable/Drawable;
      54: aload_0
      55: invokevirtual #139                // Method getDrawableState:()[I
      58: invokevirtual #143                // Method android/graphics/drawable/Drawable.setState:([I)Z
      61: pop
      62: aload_0
      63: getfield      #96                 // Field c:Landroid/graphics/drawable/Drawable;
      66: ifnull        91
      69: aload_0
      70: getfield      #96                 // Field c:Landroid/graphics/drawable/Drawable;
      73: invokevirtual #135                // Method android/graphics/drawable/Drawable.isStateful:()Z
      76: ifeq          91
      79: aload_0
      80: getfield      #96                 // Field c:Landroid/graphics/drawable/Drawable;
      83: aload_0
      84: invokevirtual #139                // Method getDrawableState:()[I
      87: invokevirtual #143                // Method android/graphics/drawable/Drawable.setState:([I)Z
      90: pop
      91: return

  public android.view.View getTabContainer();
    Code:
       0: aload_0
       1: getfield      #147                // Field g:Landroid/view/View;
       4: areturn

  public void jumpDrawablesToCurrentState();
    Code:
       0: aload_0
       1: invokespecial #150                // Method android/widget/FrameLayout.jumpDrawablesToCurrentState:()V
       4: aload_0
       5: getfield      #66                 // Field a:Landroid/graphics/drawable/Drawable;
       8: ifnull        18
      11: aload_0
      12: getfield      #66                 // Field a:Landroid/graphics/drawable/Drawable;
      15: invokevirtual #153                // Method android/graphics/drawable/Drawable.jumpToCurrentState:()V
      18: aload_0
      19: getfield      #71                 // Field b:Landroid/graphics/drawable/Drawable;
      22: ifnull        32
      25: aload_0
      26: getfield      #71                 // Field b:Landroid/graphics/drawable/Drawable;
      29: invokevirtual #153                // Method android/graphics/drawable/Drawable.jumpToCurrentState:()V
      32: aload_0
      33: getfield      #96                 // Field c:Landroid/graphics/drawable/Drawable;
      36: ifnull        46
      39: aload_0
      40: getfield      #96                 // Field c:Landroid/graphics/drawable/Drawable;
      43: invokevirtual #153                // Method android/graphics/drawable/Drawable.jumpToCurrentState:()V
      46: return

  public void onFinishInflate();
    Code:
       0: aload_0
       1: invokespecial #156                // Method android/widget/FrameLayout.onFinishInflate:()V
       4: aload_0
       5: aload_0
       6: getstatic     #159                // Field android/support/v7/a/a$f.action_bar:I
       9: invokevirtual #163                // Method findViewById:(I)Landroid/view/View;
      12: putfield      #165                // Field h:Landroid/view/View;
      15: aload_0
      16: aload_0
      17: getstatic     #168                // Field android/support/v7/a/a$f.action_context_bar:I
      20: invokevirtual #163                // Method findViewById:(I)Landroid/view/View;
      23: putfield      #170                // Field i:Landroid/view/View;
      26: return

  public boolean onHoverEvent(android.view.MotionEvent);
    Code:
       0: aload_0
       1: aload_1
       2: invokespecial #174                // Method android/widget/FrameLayout.onHoverEvent:(Landroid/view/MotionEvent;)Z
       5: pop
       6: iconst_1
       7: ireturn

  public boolean onInterceptTouchEvent(android.view.MotionEvent);
    Code:
       0: aload_0
       1: getfield      #177                // Field f:Z
       4: ifne          20
       7: aload_0
       8: aload_1
       9: invokespecial #179                // Method android/widget/FrameLayout.onInterceptTouchEvent:(Landroid/view/MotionEvent;)Z
      12: ifeq          18
      15: goto          20
      18: iconst_0
      19: ireturn
      20: iconst_1
      21: ireturn

  public void onLayout(boolean, int, int, int, int);
    Code:
       0: aload_0
       1: iload_1
       2: iload_2
       3: iload_3
       4: iload         4
       6: iload         5
       8: invokespecial #183                // Method android/widget/FrameLayout.onLayout:(ZIIII)V
      11: aload_0
      12: getfield      #147                // Field g:Landroid/view/View;
      15: astore        9
      17: iconst_1
      18: istore        5
      20: iconst_0
      21: istore_3
      22: aload         9
      24: ifnull        42
      27: aload         9
      29: invokevirtual #110                // Method android/view/View.getVisibility:()I
      32: bipush        8
      34: if_icmpeq     42
      37: iconst_1
      38: istore_1
      39: goto          44
      42: iconst_0
      43: istore_1
      44: aload         9
      46: ifnull        105
      49: aload         9
      51: invokevirtual #110                // Method android/view/View.getVisibility:()I
      54: bipush        8
      56: if_icmpeq     105
      59: aload_0
      60: invokevirtual #184                // Method getMeasuredHeight:()I
      63: istore        6
      65: aload         9
      67: invokevirtual #118                // Method android/view/View.getLayoutParams:()Landroid/view/ViewGroup$LayoutParams;
      70: checkcast     #120                // class android/widget/FrameLayout$LayoutParams
      73: astore        7
      75: aload         9
      77: iload_2
      78: iload         6
      80: aload         9
      82: invokevirtual #113                // Method android/view/View.getMeasuredHeight:()I
      85: isub
      86: aload         7
      88: getfield      #126                // Field android/widget/FrameLayout$LayoutParams.bottomMargin:I
      91: isub
      92: iload         4
      94: iload         6
      96: aload         7
      98: getfield      #126                // Field android/widget/FrameLayout$LayoutParams.bottomMargin:I
     101: isub
     102: invokevirtual #188                // Method android/view/View.layout:(IIII)V
     105: aload_0
     106: getfield      #91                 // Field d:Z
     109: ifeq          147
     112: aload_0
     113: getfield      #96                 // Field c:Landroid/graphics/drawable/Drawable;
     116: ifnull        142
     119: aload_0
     120: getfield      #96                 // Field c:Landroid/graphics/drawable/Drawable;
     123: iconst_0
     124: iconst_0
     125: aload_0
     126: invokevirtual #191                // Method getMeasuredWidth:()I
     129: aload_0
     130: invokevirtual #184                // Method getMeasuredHeight:()I
     133: invokevirtual #194                // Method android/graphics/drawable/Drawable.setBounds:(IIII)V
     136: iload         5
     138: istore_2
     139: goto          339
     142: iconst_0
     143: istore_2
     144: goto          339
     147: iload_3
     148: istore_2
     149: aload_0
     150: getfield      #66                 // Field a:Landroid/graphics/drawable/Drawable;
     153: ifnull        290
     156: aload_0
     157: getfield      #165                // Field h:Landroid/view/View;
     160: invokevirtual #110                // Method android/view/View.getVisibility:()I
     163: ifne          220
     166: aload_0
     167: getfield      #66                 // Field a:Landroid/graphics/drawable/Drawable;
     170: astore        8
     172: aload_0
     173: getfield      #165                // Field h:Landroid/view/View;
     176: invokevirtual #197                // Method android/view/View.getLeft:()I
     179: istore_3
     180: aload_0
     181: getfield      #165                // Field h:Landroid/view/View;
     184: invokevirtual #200                // Method android/view/View.getTop:()I
     187: istore        4
     189: aload_0
     190: getfield      #165                // Field h:Landroid/view/View;
     193: invokevirtual #203                // Method android/view/View.getRight:()I
     196: istore_2
     197: aload_0
     198: getfield      #165                // Field h:Landroid/view/View;
     201: astore        7
     203: aload         8
     205: iload_3
     206: iload         4
     208: iload_2
     209: aload         7
     211: invokevirtual #206                // Method android/view/View.getBottom:()I
     214: invokevirtual #194                // Method android/graphics/drawable/Drawable.setBounds:(IIII)V
     217: goto          288
     220: aload_0
     221: getfield      #170                // Field i:Landroid/view/View;
     224: ifnull        277
     227: aload_0
     228: getfield      #170                // Field i:Landroid/view/View;
     231: invokevirtual #110                // Method android/view/View.getVisibility:()I
     234: ifne          277
     237: aload_0
     238: getfield      #66                 // Field a:Landroid/graphics/drawable/Drawable;
     241: astore        8
     243: aload_0
     244: getfield      #170                // Field i:Landroid/view/View;
     247: invokevirtual #197                // Method android/view/View.getLeft:()I
     250: istore_3
     251: aload_0
     252: getfield      #170                // Field i:Landroid/view/View;
     255: invokevirtual #200                // Method android/view/View.getTop:()I
     258: istore        4
     260: aload_0
     261: getfield      #170                // Field i:Landroid/view/View;
     264: invokevirtual #203                // Method android/view/View.getRight:()I
     267: istore_2
     268: aload_0
     269: getfield      #170                // Field i:Landroid/view/View;
     272: astore        7
     274: goto          203
     277: aload_0
     278: getfield      #66                 // Field a:Landroid/graphics/drawable/Drawable;
     281: iconst_0
     282: iconst_0
     283: iconst_0
     284: iconst_0
     285: invokevirtual #194                // Method android/graphics/drawable/Drawable.setBounds:(IIII)V
     288: iconst_1
     289: istore_2
     290: aload_0
     291: iload_1
     292: putfield      #208                // Field e:Z
     295: iload_1
     296: ifeq          339
     299: aload_0
     300: getfield      #71                 // Field b:Landroid/graphics/drawable/Drawable;
     303: ifnull        339
     306: aload_0
     307: getfield      #71                 // Field b:Landroid/graphics/drawable/Drawable;
     310: aload         9
     312: invokevirtual #197                // Method android/view/View.getLeft:()I
     315: aload         9
     317: invokevirtual #200                // Method android/view/View.getTop:()I
     320: aload         9
     322: invokevirtual #203                // Method android/view/View.getRight:()I
     325: aload         9
     327: invokevirtual #206                // Method android/view/View.getBottom:()I
     330: invokevirtual #194                // Method android/graphics/drawable/Drawable.setBounds:(IIII)V
     333: iload         5
     335: istore_2
     336: goto          339
     339: iload_2
     340: ifeq          347
     343: aload_0
     344: invokevirtual #211                // Method invalidate:()V
     347: return

  public void onMeasure(int, int);
    Code:
       0: iload_2
       1: istore_3
       2: aload_0
       3: getfield      #165                // Field h:Landroid/view/View;
       6: ifnonnull     46
       9: iload_2
      10: istore_3
      11: iload_2
      12: invokestatic  #219                // Method android/view/View$MeasureSpec.getMode:(I)I
      15: ldc           #220                // int -2147483648
      17: if_icmpne     46
      20: iload_2
      21: istore_3
      22: aload_0
      23: getfield      #80                 // Field j:I
      26: iflt          46
      29: aload_0
      30: getfield      #80                 // Field j:I
      33: iload_2
      34: invokestatic  #223                // Method android/view/View$MeasureSpec.getSize:(I)I
      37: invokestatic  #228                // Method java/lang/Math.min:(II)I
      40: ldc           #220                // int -2147483648
      42: invokestatic  #231                // Method android/view/View$MeasureSpec.makeMeasureSpec:(II)I
      45: istore_3
      46: aload_0
      47: iload_1
      48: iload_3
      49: invokespecial #233                // Method android/widget/FrameLayout.onMeasure:(II)V
      52: aload_0
      53: getfield      #165                // Field h:Landroid/view/View;
      56: ifnonnull     60
      59: return
      60: iload_3
      61: invokestatic  #219                // Method android/view/View$MeasureSpec.getMode:(I)I
      64: istore_2
      65: aload_0
      66: getfield      #147                // Field g:Landroid/view/View;
      69: ifnull        178
      72: aload_0
      73: getfield      #147                // Field g:Landroid/view/View;
      76: invokevirtual #110                // Method android/view/View.getVisibility:()I
      79: bipush        8
      81: if_icmpeq     178
      84: iload_2
      85: ldc           #234                // int 1073741824
      87: if_icmpeq     178
      90: aload_0
      91: aload_0
      92: getfield      #165                // Field h:Landroid/view/View;
      95: invokespecial #236                // Method a:(Landroid/view/View;)Z
      98: ifne          117
     101: aload_0
     102: getfield      #165                // Field h:Landroid/view/View;
     105: astore        4
     107: aload_0
     108: aload         4
     110: invokespecial #238                // Method b:(Landroid/view/View;)I
     113: istore_1
     114: goto          139
     117: aload_0
     118: aload_0
     119: getfield      #170                // Field i:Landroid/view/View;
     122: invokespecial #236                // Method a:(Landroid/view/View;)Z
     125: ifne          137
     128: aload_0
     129: getfield      #170                // Field i:Landroid/view/View;
     132: astore        4
     134: goto          107
     137: iconst_0
     138: istore_1
     139: iload_2
     140: ldc           #220                // int -2147483648
     142: if_icmpne     153
     145: iload_3
     146: invokestatic  #223                // Method android/view/View$MeasureSpec.getSize:(I)I
     149: istore_2
     150: goto          156
     153: ldc           #239                // int 2147483647
     155: istore_2
     156: aload_0
     157: aload_0
     158: invokevirtual #191                // Method getMeasuredWidth:()I
     161: iload_1
     162: aload_0
     163: aload_0
     164: getfield      #147                // Field g:Landroid/view/View;
     167: invokespecial #238                // Method b:(Landroid/view/View;)I
     170: iadd
     171: iload_2
     172: invokestatic  #228                // Method java/lang/Math.min:(II)I
     175: invokevirtual #242                // Method setMeasuredDimension:(II)V
     178: return

  public boolean onTouchEvent(android.view.MotionEvent);
    Code:
       0: aload_0
       1: aload_1
       2: invokespecial #245                // Method android/widget/FrameLayout.onTouchEvent:(Landroid/view/MotionEvent;)Z
       5: pop
       6: iconst_1
       7: ireturn

  public void setPrimaryBackground(android.graphics.drawable.Drawable);
    Code:
       0: aload_0
       1: getfield      #66                 // Field a:Landroid/graphics/drawable/Drawable;
       4: ifnull        23
       7: aload_0
       8: getfield      #66                 // Field a:Landroid/graphics/drawable/Drawable;
      11: aconst_null
      12: invokevirtual #251                // Method android/graphics/drawable/Drawable.setCallback:(Landroid/graphics/drawable/Drawable$Callback;)V
      15: aload_0
      16: aload_0
      17: getfield      #66                 // Field a:Landroid/graphics/drawable/Drawable;
      20: invokevirtual #254                // Method unscheduleDrawable:(Landroid/graphics/drawable/Drawable;)V
      23: aload_0
      24: aload_1
      25: putfield      #66                 // Field a:Landroid/graphics/drawable/Drawable;
      28: aload_1
      29: ifnull        79
      32: aload_1
      33: aload_0
      34: invokevirtual #251                // Method android/graphics/drawable/Drawable.setCallback:(Landroid/graphics/drawable/Drawable$Callback;)V
      37: aload_0
      38: getfield      #165                // Field h:Landroid/view/View;
      41: ifnull        79
      44: aload_0
      45: getfield      #66                 // Field a:Landroid/graphics/drawable/Drawable;
      48: aload_0
      49: getfield      #165                // Field h:Landroid/view/View;
      52: invokevirtual #197                // Method android/view/View.getLeft:()I
      55: aload_0
      56: getfield      #165                // Field h:Landroid/view/View;
      59: invokevirtual #200                // Method android/view/View.getTop:()I
      62: aload_0
      63: getfield      #165                // Field h:Landroid/view/View;
      66: invokevirtual #203                // Method android/view/View.getRight:()I
      69: aload_0
      70: getfield      #165                // Field h:Landroid/view/View;
      73: invokevirtual #206                // Method android/view/View.getBottom:()I
      76: invokevirtual #194                // Method android/graphics/drawable/Drawable.setBounds:(IIII)V
      79: aload_0
      80: getfield      #91                 // Field d:Z
      83: istore_2
      84: iconst_0
      85: istore_3
      86: iload_2
      87: ifeq          104
      90: iload_3
      91: istore_2
      92: aload_0
      93: getfield      #96                 // Field c:Landroid/graphics/drawable/Drawable;
      96: ifnonnull     125
      99: iconst_1
     100: istore_2
     101: goto          125
     104: iload_3
     105: istore_2
     106: aload_0
     107: getfield      #66                 // Field a:Landroid/graphics/drawable/Drawable;
     110: ifnonnull     125
     113: iload_3
     114: istore_2
     115: aload_0
     116: getfield      #71                 // Field b:Landroid/graphics/drawable/Drawable;
     119: ifnonnull     125
     122: goto          99
     125: aload_0
     126: iload_2
     127: invokevirtual #104                // Method setWillNotDraw:(Z)V
     130: aload_0
     131: invokevirtual #211                // Method invalidate:()V
     134: return

  public void setSplitBackground(android.graphics.drawable.Drawable);
    Code:
       0: aload_0
       1: getfield      #96                 // Field c:Landroid/graphics/drawable/Drawable;
       4: ifnull        23
       7: aload_0
       8: getfield      #96                 // Field c:Landroid/graphics/drawable/Drawable;
      11: aconst_null
      12: invokevirtual #251                // Method android/graphics/drawable/Drawable.setCallback:(Landroid/graphics/drawable/Drawable$Callback;)V
      15: aload_0
      16: aload_0
      17: getfield      #96                 // Field c:Landroid/graphics/drawable/Drawable;
      20: invokevirtual #254                // Method unscheduleDrawable:(Landroid/graphics/drawable/Drawable;)V
      23: aload_0
      24: aload_1
      25: putfield      #96                 // Field c:Landroid/graphics/drawable/Drawable;
      28: iconst_0
      29: istore_3
      30: aload_1
      31: ifnull        70
      34: aload_1
      35: aload_0
      36: invokevirtual #251                // Method android/graphics/drawable/Drawable.setCallback:(Landroid/graphics/drawable/Drawable$Callback;)V
      39: aload_0
      40: getfield      #91                 // Field d:Z
      43: ifeq          70
      46: aload_0
      47: getfield      #96                 // Field c:Landroid/graphics/drawable/Drawable;
      50: ifnull        70
      53: aload_0
      54: getfield      #96                 // Field c:Landroid/graphics/drawable/Drawable;
      57: iconst_0
      58: iconst_0
      59: aload_0
      60: invokevirtual #191                // Method getMeasuredWidth:()I
      63: aload_0
      64: invokevirtual #184                // Method getMeasuredHeight:()I
      67: invokevirtual #194                // Method android/graphics/drawable/Drawable.setBounds:(IIII)V
      70: aload_0
      71: getfield      #91                 // Field d:Z
      74: ifeq          91
      77: iload_3
      78: istore_2
      79: aload_0
      80: getfield      #96                 // Field c:Landroid/graphics/drawable/Drawable;
      83: ifnonnull     112
      86: iconst_1
      87: istore_2
      88: goto          112
      91: iload_3
      92: istore_2
      93: aload_0
      94: getfield      #66                 // Field a:Landroid/graphics/drawable/Drawable;
      97: ifnonnull     112
     100: iload_3
     101: istore_2
     102: aload_0
     103: getfield      #71                 // Field b:Landroid/graphics/drawable/Drawable;
     106: ifnonnull     112
     109: goto          86
     112: aload_0
     113: iload_2
     114: invokevirtual #104                // Method setWillNotDraw:(Z)V
     117: aload_0
     118: invokevirtual #211                // Method invalidate:()V
     121: return

  public void setStackedBackground(android.graphics.drawable.Drawable);
    Code:
       0: aload_0
       1: getfield      #71                 // Field b:Landroid/graphics/drawable/Drawable;
       4: ifnull        23
       7: aload_0
       8: getfield      #71                 // Field b:Landroid/graphics/drawable/Drawable;
      11: aconst_null
      12: invokevirtual #251                // Method android/graphics/drawable/Drawable.setCallback:(Landroid/graphics/drawable/Drawable$Callback;)V
      15: aload_0
      16: aload_0
      17: getfield      #71                 // Field b:Landroid/graphics/drawable/Drawable;
      20: invokevirtual #254                // Method unscheduleDrawable:(Landroid/graphics/drawable/Drawable;)V
      23: aload_0
      24: aload_1
      25: putfield      #71                 // Field b:Landroid/graphics/drawable/Drawable;
      28: aload_1
      29: ifnull        86
      32: aload_1
      33: aload_0
      34: invokevirtual #251                // Method android/graphics/drawable/Drawable.setCallback:(Landroid/graphics/drawable/Drawable$Callback;)V
      37: aload_0
      38: getfield      #208                // Field e:Z
      41: ifeq          86
      44: aload_0
      45: getfield      #71                 // Field b:Landroid/graphics/drawable/Drawable;
      48: ifnull        86
      51: aload_0
      52: getfield      #71                 // Field b:Landroid/graphics/drawable/Drawable;
      55: aload_0
      56: getfield      #147                // Field g:Landroid/view/View;
      59: invokevirtual #197                // Method android/view/View.getLeft:()I
      62: aload_0
      63: getfield      #147                // Field g:Landroid/view/View;
      66: invokevirtual #200                // Method android/view/View.getTop:()I
      69: aload_0
      70: getfield      #147                // Field g:Landroid/view/View;
      73: invokevirtual #203                // Method android/view/View.getRight:()I
      76: aload_0
      77: getfield      #147                // Field g:Landroid/view/View;
      80: invokevirtual #206                // Method android/view/View.getBottom:()I
      83: invokevirtual #194                // Method android/graphics/drawable/Drawable.setBounds:(IIII)V
      86: aload_0
      87: getfield      #91                 // Field d:Z
      90: istore_2
      91: iconst_0
      92: istore_3
      93: iload_2
      94: ifeq          111
      97: iload_3
      98: istore_2
      99: aload_0
     100: getfield      #96                 // Field c:Landroid/graphics/drawable/Drawable;
     103: ifnonnull     132
     106: iconst_1
     107: istore_2
     108: goto          132
     111: iload_3
     112: istore_2
     113: aload_0
     114: getfield      #66                 // Field a:Landroid/graphics/drawable/Drawable;
     117: ifnonnull     132
     120: iload_3
     121: istore_2
     122: aload_0
     123: getfield      #71                 // Field b:Landroid/graphics/drawable/Drawable;
     126: ifnonnull     132
     129: goto          106
     132: aload_0
     133: iload_2
     134: invokevirtual #104                // Method setWillNotDraw:(Z)V
     137: aload_0
     138: invokevirtual #211                // Method invalidate:()V
     141: return

  public void setTabContainer(android.support.v7.widget.bh);
    Code:
       0: aload_0
       1: getfield      #147                // Field g:Landroid/view/View;
       4: ifnull        15
       7: aload_0
       8: aload_0
       9: getfield      #147                // Field g:Landroid/view/View;
      12: invokevirtual #262                // Method removeView:(Landroid/view/View;)V
      15: aload_0
      16: aload_1
      17: putfield      #147                // Field g:Landroid/view/View;
      20: aload_1
      21: ifnull        50
      24: aload_0
      25: aload_1
      26: invokevirtual #265                // Method addView:(Landroid/view/View;)V
      29: aload_1
      30: invokevirtual #268                // Method android/support/v7/widget/bh.getLayoutParams:()Landroid/view/ViewGroup$LayoutParams;
      33: astore_2
      34: aload_2
      35: iconst_m1
      36: putfield      #273                // Field android/view/ViewGroup$LayoutParams.width:I
      39: aload_2
      40: bipush        -2
      42: putfield      #276                // Field android/view/ViewGroup$LayoutParams.height:I
      45: aload_1
      46: iconst_0
      47: invokevirtual #279                // Method android/support/v7/widget/bh.setAllowCollapse:(Z)V
      50: return

  public void setTransitioning(boolean);
    Code:
       0: aload_0
       1: iload_1
       2: putfield      #177                // Field f:Z
       5: iload_1
       6: ifeq          16
       9: ldc_w         #281                // int 393216
      12: istore_2
      13: goto          20
      16: ldc_w         #282                // int 262144
      19: istore_2
      20: aload_0
      21: iload_2
      22: invokevirtual #286                // Method setDescendantFocusability:(I)V
      25: return

  public void setVisibility(int);
    Code:
       0: aload_0
       1: iload_1
       2: invokespecial #289                // Method android/widget/FrameLayout.setVisibility:(I)V
       5: iload_1
       6: ifne          14
       9: iconst_1
      10: istore_2
      11: goto          16
      14: iconst_0
      15: istore_2
      16: aload_0
      17: getfield      #66                 // Field a:Landroid/graphics/drawable/Drawable;
      20: ifnull        33
      23: aload_0
      24: getfield      #66                 // Field a:Landroid/graphics/drawable/Drawable;
      27: iload_2
      28: iconst_0
      29: invokevirtual #293                // Method android/graphics/drawable/Drawable.setVisible:(ZZ)Z
      32: pop
      33: aload_0
      34: getfield      #71                 // Field b:Landroid/graphics/drawable/Drawable;
      37: ifnull        50
      40: aload_0
      41: getfield      #71                 // Field b:Landroid/graphics/drawable/Drawable;
      44: iload_2
      45: iconst_0
      46: invokevirtual #293                // Method android/graphics/drawable/Drawable.setVisible:(ZZ)Z
      49: pop
      50: aload_0
      51: getfield      #96                 // Field c:Landroid/graphics/drawable/Drawable;
      54: ifnull        67
      57: aload_0
      58: getfield      #96                 // Field c:Landroid/graphics/drawable/Drawable;
      61: iload_2
      62: iconst_0
      63: invokevirtual #293                // Method android/graphics/drawable/Drawable.setVisible:(ZZ)Z
      66: pop
      67: return

  public android.view.ActionMode startActionModeForChild(android.view.View, android.view.ActionMode$Callback);
    Code:
       0: aconst_null
       1: areturn

  public android.view.ActionMode startActionModeForChild(android.view.View, android.view.ActionMode$Callback, int);
    Code:
       0: iload_3
       1: ifeq          12
       4: aload_0
       5: aload_1
       6: aload_2
       7: iload_3
       8: invokespecial #298                // Method android/widget/FrameLayout.startActionModeForChild:(Landroid/view/View;Landroid/view/ActionMode$Callback;I)Landroid/view/ActionMode;
      11: areturn
      12: aconst_null
      13: areturn

  protected boolean verifyDrawable(android.graphics.drawable.Drawable);
    Code:
       0: aload_1
       1: aload_0
       2: getfield      #66                 // Field a:Landroid/graphics/drawable/Drawable;
       5: if_acmpne     15
       8: aload_0
       9: getfield      #91                 // Field d:Z
      12: ifeq          53
      15: aload_1
      16: aload_0
      17: getfield      #71                 // Field b:Landroid/graphics/drawable/Drawable;
      20: if_acmpne     30
      23: aload_0
      24: getfield      #208                // Field e:Z
      27: ifne          53
      30: aload_1
      31: aload_0
      32: getfield      #96                 // Field c:Landroid/graphics/drawable/Drawable;
      35: if_acmpne     45
      38: aload_0
      39: getfield      #91                 // Field d:Z
      42: ifne          53
      45: aload_0
      46: aload_1
      47: invokespecial #302                // Method android/widget/FrameLayout.verifyDrawable:(Landroid/graphics/drawable/Drawable;)Z
      50: ifeq          55
      53: iconst_1
      54: ireturn
      55: iconst_0
      56: ireturn
}
