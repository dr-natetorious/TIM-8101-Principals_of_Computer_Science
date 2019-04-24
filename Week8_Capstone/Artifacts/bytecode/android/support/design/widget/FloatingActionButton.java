public class android.support.design.widget.FloatingActionButton extends android.support.design.widget.r {
  int a;

  boolean b;

  final android.graphics.Rect c;

  public android.support.design.widget.FloatingActionButton(android.content.Context);
    Code:
       0: aload_0
       1: aload_1
       2: aconst_null
       3: invokespecial #40                 // Method "<init>":(Landroid/content/Context;Landroid/util/AttributeSet;)V
       6: return

  public android.support.design.widget.FloatingActionButton(android.content.Context, android.util.AttributeSet);
    Code:
       0: aload_0
       1: aload_1
       2: aload_2
       3: iconst_0
       4: invokespecial #44                 // Method "<init>":(Landroid/content/Context;Landroid/util/AttributeSet;I)V
       7: return

  public android.support.design.widget.FloatingActionButton(android.content.Context, android.util.AttributeSet, int);
    Code:
       0: aload_0
       1: aload_1
       2: aload_2
       3: iload_3
       4: invokespecial #45                 // Method android/support/design/widget/r."<init>":(Landroid/content/Context;Landroid/util/AttributeSet;I)V
       7: aload_0
       8: new           #47                 // class android/graphics/Rect
      11: dup
      12: invokespecial #50                 // Method android/graphics/Rect."<init>":()V
      15: putfield      #52                 // Field c:Landroid/graphics/Rect;
      18: aload_0
      19: new           #47                 // class android/graphics/Rect
      22: dup
      23: invokespecial #50                 // Method android/graphics/Rect."<init>":()V
      26: putfield      #54                 // Field k:Landroid/graphics/Rect;
      29: aload_1
      30: invokestatic  #58                 // Method android/support/design/widget/m.a:(Landroid/content/Context;)V
      33: aload_1
      34: aload_2
      35: getstatic     #64                 // Field android/support/design/a$j.FloatingActionButton:[I
      38: iload_3
      39: getstatic     #69                 // Field android/support/design/a$i.Widget_Design_FloatingActionButton:I
      42: invokevirtual #75                 // Method android/content/Context.obtainStyledAttributes:(Landroid/util/AttributeSet;[III)Landroid/content/res/TypedArray;
      45: astore_1
      46: aload_0
      47: aload_1
      48: getstatic     #78                 // Field android/support/design/a$j.FloatingActionButton_backgroundTint:I
      51: invokevirtual #84                 // Method android/content/res/TypedArray.getColorStateList:(I)Landroid/content/res/ColorStateList;
      54: putfield      #86                 // Field d:Landroid/content/res/ColorStateList;
      57: aload_0
      58: aload_1
      59: getstatic     #89                 // Field android/support/design/a$j.FloatingActionButton_backgroundTintMode:I
      62: iconst_m1
      63: invokevirtual #93                 // Method android/content/res/TypedArray.getInt:(II)I
      66: aconst_null
      67: invokestatic  #98                 // Method android/support/design/widget/p.a:(ILandroid/graphics/PorterDuff$Mode;)Landroid/graphics/PorterDuff$Mode;
      70: putfield      #100                // Field e:Landroid/graphics/PorterDuff$Mode;
      73: aload_0
      74: aload_1
      75: getstatic     #103                // Field android/support/design/a$j.FloatingActionButton_rippleColor:I
      78: iconst_0
      79: invokevirtual #106                // Method android/content/res/TypedArray.getColor:(II)I
      82: putfield      #108                // Field g:I
      85: aload_0
      86: aload_1
      87: getstatic     #111                // Field android/support/design/a$j.FloatingActionButton_fabSize:I
      90: iconst_m1
      91: invokevirtual #93                 // Method android/content/res/TypedArray.getInt:(II)I
      94: putfield      #113                // Field h:I
      97: aload_0
      98: aload_1
      99: getstatic     #116                // Field android/support/design/a$j.FloatingActionButton_fabCustomSize:I
     102: iconst_0
     103: invokevirtual #119                // Method android/content/res/TypedArray.getDimensionPixelSize:(II)I
     106: putfield      #121                // Field i:I
     109: aload_0
     110: aload_1
     111: getstatic     #124                // Field android/support/design/a$j.FloatingActionButton_borderWidth:I
     114: iconst_0
     115: invokevirtual #119                // Method android/content/res/TypedArray.getDimensionPixelSize:(II)I
     118: putfield      #126                // Field f:I
     121: aload_1
     122: getstatic     #129                // Field android/support/design/a$j.FloatingActionButton_elevation:I
     125: fconst_0
     126: invokevirtual #133                // Method android/content/res/TypedArray.getDimension:(IF)F
     129: fstore        4
     131: aload_1
     132: getstatic     #136                // Field android/support/design/a$j.FloatingActionButton_pressedTranslationZ:I
     135: fconst_0
     136: invokevirtual #133                // Method android/content/res/TypedArray.getDimension:(IF)F
     139: fstore        5
     141: aload_0
     142: aload_1
     143: getstatic     #139                // Field android/support/design/a$j.FloatingActionButton_useCompatPadding:I
     146: iconst_0
     147: invokevirtual #143                // Method android/content/res/TypedArray.getBoolean:(IZ)Z
     150: putfield      #145                // Field b:Z
     153: aload_1
     154: invokevirtual #148                // Method android/content/res/TypedArray.recycle:()V
     157: aload_0
     158: new           #150                // class android/support/v7/widget/q
     161: dup
     162: aload_0
     163: invokespecial #153                // Method android/support/v7/widget/q."<init>":(Landroid/widget/ImageView;)V
     166: putfield      #155                // Field l:Landroid/support/v7/widget/q;
     169: aload_0
     170: getfield      #155                // Field l:Landroid/support/v7/widget/q;
     173: aload_2
     174: iload_3
     175: invokevirtual #158                // Method android/support/v7/widget/q.a:(Landroid/util/AttributeSet;I)V
     178: aload_0
     179: aload_0
     180: invokevirtual #162                // Method getResources:()Landroid/content/res/Resources;
     183: getstatic     #167                // Field android/support/design/a$d.design_fab_image_size:I
     186: invokevirtual #172                // Method android/content/res/Resources.getDimension:(I)F
     189: f2i
     190: putfield      #174                // Field j:I
     193: aload_0
     194: invokespecial #178                // Method getImpl:()Landroid/support/design/widget/e;
     197: aload_0
     198: getfield      #86                 // Field d:Landroid/content/res/ColorStateList;
     201: aload_0
     202: getfield      #100                // Field e:Landroid/graphics/PorterDuff$Mode;
     205: aload_0
     206: getfield      #108                // Field g:I
     209: aload_0
     210: getfield      #126                // Field f:I
     213: invokevirtual #183                // Method android/support/design/widget/e.a:(Landroid/content/res/ColorStateList;Landroid/graphics/PorterDuff$Mode;II)V
     216: aload_0
     217: invokespecial #178                // Method getImpl:()Landroid/support/design/widget/e;
     220: fload         4
     222: invokevirtual #186                // Method android/support/design/widget/e.a:(F)V
     225: aload_0
     226: invokespecial #178                // Method getImpl:()Landroid/support/design/widget/e;
     229: fload         5
     231: invokevirtual #188                // Method android/support/design/widget/e.b:(F)V
     234: return

  static void a(android.support.design.widget.FloatingActionButton, android.graphics.drawable.Drawable);
    Code:
       0: aload_0
       1: aload_1
       2: invokespecial #234                // Method android/support/design/widget/r.setBackgroundDrawable:(Landroid/graphics/drawable/Drawable;)V
       5: return

  public void a();
    Code:
       0: aload_0
       1: aconst_null
       2: invokevirtual #259                // Method a:(Landroid/support/design/widget/FloatingActionButton$a;)V
       5: return

  public void a(android.support.design.widget.FloatingActionButton$a);
    Code:
       0: aload_0
       1: aload_1
       2: iconst_1
       3: invokevirtual #262                // Method b:(Landroid/support/design/widget/FloatingActionButton$a;Z)V
       6: return

  void a(android.support.design.widget.FloatingActionButton$a, boolean);
    Code:
       0: aload_0
       1: invokespecial #178                // Method getImpl:()Landroid/support/design/widget/e;
       4: aload_0
       5: aload_1
       6: invokespecial #264                // Method b:(Landroid/support/design/widget/FloatingActionButton$a;)Landroid/support/design/widget/e$c;
       9: iload_2
      10: invokevirtual #267                // Method android/support/design/widget/e.b:(Landroid/support/design/widget/e$c;Z)V
      13: return

  public boolean a(android.graphics.Rect);
    Code:
       0: aload_0
       1: invokestatic  #274                // Method android/support/v4/view/s.w:(Landroid/view/View;)Z
       4: ifeq          87
       7: aload_1
       8: iconst_0
       9: iconst_0
      10: aload_0
      11: invokevirtual #278                // Method getWidth:()I
      14: aload_0
      15: invokevirtual #281                // Method getHeight:()I
      18: invokevirtual #285                // Method android/graphics/Rect.set:(IIII)V
      21: aload_1
      22: aload_1
      23: getfield      #288                // Field android/graphics/Rect.left:I
      26: aload_0
      27: getfield      #52                 // Field c:Landroid/graphics/Rect;
      30: getfield      #288                // Field android/graphics/Rect.left:I
      33: iadd
      34: putfield      #288                // Field android/graphics/Rect.left:I
      37: aload_1
      38: aload_1
      39: getfield      #291                // Field android/graphics/Rect.top:I
      42: aload_0
      43: getfield      #52                 // Field c:Landroid/graphics/Rect;
      46: getfield      #291                // Field android/graphics/Rect.top:I
      49: iadd
      50: putfield      #291                // Field android/graphics/Rect.top:I
      53: aload_1
      54: aload_1
      55: getfield      #294                // Field android/graphics/Rect.right:I
      58: aload_0
      59: getfield      #52                 // Field c:Landroid/graphics/Rect;
      62: getfield      #294                // Field android/graphics/Rect.right:I
      65: isub
      66: putfield      #294                // Field android/graphics/Rect.right:I
      69: aload_1
      70: aload_1
      71: getfield      #297                // Field android/graphics/Rect.bottom:I
      74: aload_0
      75: getfield      #52                 // Field c:Landroid/graphics/Rect;
      78: getfield      #297                // Field android/graphics/Rect.bottom:I
      81: isub
      82: putfield      #297                // Field android/graphics/Rect.bottom:I
      85: iconst_1
      86: ireturn
      87: iconst_0
      88: ireturn

  void b(android.support.design.widget.FloatingActionButton$a, boolean);
    Code:
       0: aload_0
       1: invokespecial #178                // Method getImpl:()Landroid/support/design/widget/e;
       4: aload_0
       5: aload_1
       6: invokespecial #264                // Method b:(Landroid/support/design/widget/FloatingActionButton$a;)Landroid/support/design/widget/e$c;
       9: iload_2
      10: invokevirtual #299                // Method android/support/design/widget/e.a:(Landroid/support/design/widget/e$c;Z)V
      13: return

  protected void drawableStateChanged();
    Code:
       0: aload_0
       1: invokespecial #302                // Method android/support/design/widget/r.drawableStateChanged:()V
       4: aload_0
       5: invokespecial #178                // Method getImpl:()Landroid/support/design/widget/e;
       8: aload_0
       9: invokevirtual #306                // Method getDrawableState:()[I
      12: invokevirtual #309                // Method android/support/design/widget/e.a:([I)V
      15: return

  public android.content.res.ColorStateList getBackgroundTintList();
    Code:
       0: aload_0
       1: getfield      #86                 // Field d:Landroid/content/res/ColorStateList;
       4: areturn

  public android.graphics.PorterDuff$Mode getBackgroundTintMode();
    Code:
       0: aload_0
       1: getfield      #100                // Field e:Landroid/graphics/PorterDuff$Mode;
       4: areturn

  public float getCompatElevation();
    Code:
       0: aload_0
       1: invokespecial #178                // Method getImpl:()Landroid/support/design/widget/e;
       4: invokevirtual #317                // Method android/support/design/widget/e.a:()F
       7: freturn

  public android.graphics.drawable.Drawable getContentBackground();
    Code:
       0: aload_0
       1: invokespecial #178                // Method getImpl:()Landroid/support/design/widget/e;
       4: invokevirtual #321                // Method android/support/design/widget/e.c:()Landroid/graphics/drawable/Drawable;
       7: areturn

  public int getCustomSize();
    Code:
       0: aload_0
       1: getfield      #121                // Field i:I
       4: ireturn

  public int getRippleColor();
    Code:
       0: aload_0
       1: getfield      #108                // Field g:I
       4: ireturn

  public int getSize();
    Code:
       0: aload_0
       1: getfield      #113                // Field h:I
       4: ireturn

  int getSizeDimension();
    Code:
       0: aload_0
       1: aload_0
       2: getfield      #113                // Field h:I
       5: invokespecial #216                // Method a:(I)I
       8: ireturn

  public boolean getUseCompatPadding();
    Code:
       0: aload_0
       1: getfield      #145                // Field b:Z
       4: ireturn

  public void jumpDrawablesToCurrentState();
    Code:
       0: aload_0
       1: invokespecial #329                // Method android/support/design/widget/r.jumpDrawablesToCurrentState:()V
       4: aload_0
       5: invokespecial #178                // Method getImpl:()Landroid/support/design/widget/e;
       8: invokevirtual #331                // Method android/support/design/widget/e.b:()V
      11: return

  protected void onAttachedToWindow();
    Code:
       0: aload_0
       1: invokespecial #334                // Method android/support/design/widget/r.onAttachedToWindow:()V
       4: aload_0
       5: invokespecial #178                // Method getImpl:()Landroid/support/design/widget/e;
       8: invokevirtual #336                // Method android/support/design/widget/e.f:()V
      11: return

  protected void onDetachedFromWindow();
    Code:
       0: aload_0
       1: invokespecial #339                // Method android/support/design/widget/r.onDetachedFromWindow:()V
       4: aload_0
       5: invokespecial #178                // Method getImpl:()Landroid/support/design/widget/e;
       8: invokevirtual #341                // Method android/support/design/widget/e.g:()V
      11: return

  protected void onMeasure(int, int);
    Code:
       0: aload_0
       1: invokevirtual #345                // Method getSizeDimension:()I
       4: istore_3
       5: aload_0
       6: iload_3
       7: aload_0
       8: getfield      #174                // Field j:I
      11: isub
      12: iconst_2
      13: idiv
      14: putfield      #347                // Field a:I
      17: aload_0
      18: invokespecial #178                // Method getImpl:()Landroid/support/design/widget/e;
      21: invokevirtual #349                // Method android/support/design/widget/e.e:()V
      24: iload_3
      25: iload_1
      26: invokestatic  #351                // Method a:(II)I
      29: iload_3
      30: iload_2
      31: invokestatic  #351                // Method a:(II)I
      34: invokestatic  #229                // Method java/lang/Math.min:(II)I
      37: istore_1
      38: aload_0
      39: aload_0
      40: getfield      #52                 // Field c:Landroid/graphics/Rect;
      43: getfield      #288                // Field android/graphics/Rect.left:I
      46: iload_1
      47: iadd
      48: aload_0
      49: getfield      #52                 // Field c:Landroid/graphics/Rect;
      52: getfield      #294                // Field android/graphics/Rect.right:I
      55: iadd
      56: iload_1
      57: aload_0
      58: getfield      #52                 // Field c:Landroid/graphics/Rect;
      61: getfield      #291                // Field android/graphics/Rect.top:I
      64: iadd
      65: aload_0
      66: getfield      #52                 // Field c:Landroid/graphics/Rect;
      69: getfield      #297                // Field android/graphics/Rect.bottom:I
      72: iadd
      73: invokevirtual #354                // Method setMeasuredDimension:(II)V
      76: return

  public boolean onTouchEvent(android.view.MotionEvent);
    Code:
       0: aload_1
       1: invokevirtual #361                // Method android/view/MotionEvent.getAction:()I
       4: ifeq          10
       7: goto          43
      10: aload_0
      11: aload_0
      12: getfield      #54                 // Field k:Landroid/graphics/Rect;
      15: invokevirtual #363                // Method a:(Landroid/graphics/Rect;)Z
      18: ifeq          43
      21: aload_0
      22: getfield      #54                 // Field k:Landroid/graphics/Rect;
      25: aload_1
      26: invokevirtual #366                // Method android/view/MotionEvent.getX:()F
      29: f2i
      30: aload_1
      31: invokevirtual #369                // Method android/view/MotionEvent.getY:()F
      34: f2i
      35: invokevirtual #373                // Method android/graphics/Rect.contains:(II)Z
      38: ifne          43
      41: iconst_0
      42: ireturn
      43: aload_0
      44: aload_1
      45: invokespecial #375                // Method android/support/design/widget/r.onTouchEvent:(Landroid/view/MotionEvent;)Z
      48: ireturn

  public void setBackgroundColor(int);
    Code:
       0: ldc_w         #378                // String FloatingActionButton
       3: ldc_w         #380                // String Setting a custom background is not supported.
       6: invokestatic  #385                // Method android/util/Log.i:(Ljava/lang/String;Ljava/lang/String;)I
       9: pop
      10: return

  public void setBackgroundDrawable(android.graphics.drawable.Drawable);
    Code:
       0: ldc_w         #378                // String FloatingActionButton
       3: ldc_w         #380                // String Setting a custom background is not supported.
       6: invokestatic  #385                // Method android/util/Log.i:(Ljava/lang/String;Ljava/lang/String;)I
       9: pop
      10: return

  public void setBackgroundResource(int);
    Code:
       0: ldc_w         #378                // String FloatingActionButton
       3: ldc_w         #380                // String Setting a custom background is not supported.
       6: invokestatic  #385                // Method android/util/Log.i:(Ljava/lang/String;Ljava/lang/String;)I
       9: pop
      10: return

  public void setBackgroundTintList(android.content.res.ColorStateList);
    Code:
       0: aload_0
       1: getfield      #86                 // Field d:Landroid/content/res/ColorStateList;
       4: aload_1
       5: if_acmpeq     21
       8: aload_0
       9: aload_1
      10: putfield      #86                 // Field d:Landroid/content/res/ColorStateList;
      13: aload_0
      14: invokespecial #178                // Method getImpl:()Landroid/support/design/widget/e;
      17: aload_1
      18: invokevirtual #390                // Method android/support/design/widget/e.a:(Landroid/content/res/ColorStateList;)V
      21: return

  public void setBackgroundTintMode(android.graphics.PorterDuff$Mode);
    Code:
       0: aload_0
       1: getfield      #100                // Field e:Landroid/graphics/PorterDuff$Mode;
       4: aload_1
       5: if_acmpeq     21
       8: aload_0
       9: aload_1
      10: putfield      #100                // Field e:Landroid/graphics/PorterDuff$Mode;
      13: aload_0
      14: invokespecial #178                // Method getImpl:()Landroid/support/design/widget/e;
      17: aload_1
      18: invokevirtual #394                // Method android/support/design/widget/e.a:(Landroid/graphics/PorterDuff$Mode;)V
      21: return

  public void setCompatElevation(float);
    Code:
       0: aload_0
       1: invokespecial #178                // Method getImpl:()Landroid/support/design/widget/e;
       4: fload_1
       5: invokevirtual #186                // Method android/support/design/widget/e.a:(F)V
       8: return

  public void setCustomSize(int);
    Code:
       0: iload_1
       1: ifge          15
       4: new           #398                // class java/lang/IllegalArgumentException
       7: dup
       8: ldc_w         #400                // String Custom size should be non-negative.
      11: invokespecial #403                // Method java/lang/IllegalArgumentException."<init>":(Ljava/lang/String;)V
      14: athrow
      15: aload_0
      16: iload_1
      17: putfield      #121                // Field i:I
      20: return

  public void setImageResource(int);
    Code:
       0: aload_0
       1: getfield      #155                // Field l:Landroid/support/v7/widget/q;
       4: iload_1
       5: invokevirtual #406                // Method android/support/v7/widget/q.a:(I)V
       8: return

  public void setRippleColor(int);
    Code:
       0: aload_0
       1: getfield      #108                // Field g:I
       4: iload_1
       5: if_icmpeq     21
       8: aload_0
       9: iload_1
      10: putfield      #108                // Field g:I
      13: aload_0
      14: invokespecial #178                // Method getImpl:()Landroid/support/design/widget/e;
      17: iload_1
      18: invokevirtual #408                // Method android/support/design/widget/e.a:(I)V
      21: return

  public void setSize(int);
    Code:
       0: iload_1
       1: aload_0
       2: getfield      #113                // Field h:I
       5: if_icmpeq     17
       8: aload_0
       9: iload_1
      10: putfield      #113                // Field h:I
      13: aload_0
      14: invokevirtual #412                // Method requestLayout:()V
      17: return

  public void setUseCompatPadding(boolean);
    Code:
       0: aload_0
       1: getfield      #145                // Field b:Z
       4: iload_1
       5: if_icmpeq     20
       8: aload_0
       9: iload_1
      10: putfield      #145                // Field b:Z
      13: aload_0
      14: invokespecial #178                // Method getImpl:()Landroid/support/design/widget/e;
      17: invokevirtual #416                // Method android/support/design/widget/e.d:()V
      20: return

  public void setVisibility(int);
    Code:
       0: aload_0
       1: iload_1
       2: invokespecial #419                // Method android/support/design/widget/r.setVisibility:(I)V
       5: return
}
