public class android.support.design.internal.a extends android.support.v7.widget.av {
  protected boolean a;

  boolean b;

  public android.support.design.internal.a(android.content.Context);
    Code:
       0: aload_0
       1: aload_1
       2: aconst_null
       3: invokespecial #19                 // Method "<init>":(Landroid/content/Context;Landroid/util/AttributeSet;)V
       6: return

  public android.support.design.internal.a(android.content.Context, android.util.AttributeSet);
    Code:
       0: aload_0
       1: aload_1
       2: aload_2
       3: iconst_0
       4: invokespecial #23                 // Method "<init>":(Landroid/content/Context;Landroid/util/AttributeSet;I)V
       7: return

  public android.support.design.internal.a(android.content.Context, android.util.AttributeSet, int);
    Code:
       0: aload_0
       1: aload_1
       2: aload_2
       3: iload_3
       4: invokespecial #24                 // Method android/support/v7/widget/av."<init>":(Landroid/content/Context;Landroid/util/AttributeSet;I)V
       7: aload_0
       8: new           #26                 // class android/graphics/Rect
      11: dup
      12: invokespecial #29                 // Method android/graphics/Rect."<init>":()V
      15: putfield      #31                 // Field d:Landroid/graphics/Rect;
      18: aload_0
      19: new           #26                 // class android/graphics/Rect
      22: dup
      23: invokespecial #29                 // Method android/graphics/Rect."<init>":()V
      26: putfield      #33                 // Field e:Landroid/graphics/Rect;
      29: aload_0
      30: bipush        119
      32: putfield      #35                 // Field f:I
      35: aload_0
      36: iconst_1
      37: putfield      #37                 // Field a:Z
      40: aload_0
      41: iconst_0
      42: putfield      #39                 // Field b:Z
      45: aload_1
      46: aload_2
      47: getstatic     #45                 // Field android/support/design/a$j.ForegroundLinearLayout:[I
      50: iload_3
      51: iconst_0
      52: invokevirtual #51                 // Method android/content/Context.obtainStyledAttributes:(Landroid/util/AttributeSet;[III)Landroid/content/res/TypedArray;
      55: astore_1
      56: aload_0
      57: aload_1
      58: getstatic     #54                 // Field android/support/design/a$j.ForegroundLinearLayout_android_foregroundGravity:I
      61: aload_0
      62: getfield      #35                 // Field f:I
      65: invokevirtual #60                 // Method android/content/res/TypedArray.getInt:(II)I
      68: putfield      #35                 // Field f:I
      71: aload_1
      72: getstatic     #63                 // Field android/support/design/a$j.ForegroundLinearLayout_android_foreground:I
      75: invokevirtual #67                 // Method android/content/res/TypedArray.getDrawable:(I)Landroid/graphics/drawable/Drawable;
      78: astore_2
      79: aload_2
      80: ifnull        88
      83: aload_0
      84: aload_2
      85: invokevirtual #71                 // Method setForeground:(Landroid/graphics/drawable/Drawable;)V
      88: aload_0
      89: aload_1
      90: getstatic     #74                 // Field android/support/design/a$j.ForegroundLinearLayout_foregroundInsidePadding:I
      93: iconst_1
      94: invokevirtual #78                 // Method android/content/res/TypedArray.getBoolean:(IZ)Z
      97: putfield      #37                 // Field a:Z
     100: aload_1
     101: invokevirtual #81                 // Method android/content/res/TypedArray.recycle:()V
     104: return

  public void draw(android.graphics.Canvas);
    Code:
       0: aload_0
       1: aload_1
       2: invokespecial #85                 // Method android/support/v7/widget/av.draw:(Landroid/graphics/Canvas;)V
       5: aload_0
       6: getfield      #87                 // Field c:Landroid/graphics/drawable/Drawable;
       9: ifnull        140
      12: aload_0
      13: getfield      #87                 // Field c:Landroid/graphics/drawable/Drawable;
      16: astore        4
      18: aload_0
      19: getfield      #39                 // Field b:Z
      22: ifeq          134
      25: aload_0
      26: iconst_0
      27: putfield      #39                 // Field b:Z
      30: aload_0
      31: getfield      #31                 // Field d:Landroid/graphics/Rect;
      34: astore        5
      36: aload_0
      37: getfield      #33                 // Field e:Landroid/graphics/Rect;
      40: astore        6
      42: aload_0
      43: invokevirtual #91                 // Method getRight:()I
      46: aload_0
      47: invokevirtual #94                 // Method getLeft:()I
      50: isub
      51: istore_2
      52: aload_0
      53: invokevirtual #97                 // Method getBottom:()I
      56: aload_0
      57: invokevirtual #100                // Method getTop:()I
      60: isub
      61: istore_3
      62: aload_0
      63: getfield      #37                 // Field a:Z
      66: ifeq          81
      69: aload         5
      71: iconst_0
      72: iconst_0
      73: iload_2
      74: iload_3
      75: invokevirtual #104                // Method android/graphics/Rect.set:(IIII)V
      78: goto          106
      81: aload         5
      83: aload_0
      84: invokevirtual #107                // Method getPaddingLeft:()I
      87: aload_0
      88: invokevirtual #110                // Method getPaddingTop:()I
      91: iload_2
      92: aload_0
      93: invokevirtual #113                // Method getPaddingRight:()I
      96: isub
      97: iload_3
      98: aload_0
      99: invokevirtual #116                // Method getPaddingBottom:()I
     102: isub
     103: invokevirtual #104                // Method android/graphics/Rect.set:(IIII)V
     106: aload_0
     107: getfield      #35                 // Field f:I
     110: aload         4
     112: invokevirtual #121                // Method android/graphics/drawable/Drawable.getIntrinsicWidth:()I
     115: aload         4
     117: invokevirtual #124                // Method android/graphics/drawable/Drawable.getIntrinsicHeight:()I
     120: aload         5
     122: aload         6
     124: invokestatic  #130                // Method android/view/Gravity.apply:(IIILandroid/graphics/Rect;Landroid/graphics/Rect;)V
     127: aload         4
     129: aload         6
     131: invokevirtual #134                // Method android/graphics/drawable/Drawable.setBounds:(Landroid/graphics/Rect;)V
     134: aload         4
     136: aload_1
     137: invokevirtual #135                // Method android/graphics/drawable/Drawable.draw:(Landroid/graphics/Canvas;)V
     140: return

  public void drawableHotspotChanged(float, float);
    Code:
       0: aload_0
       1: fload_1
       2: fload_2
       3: invokespecial #139                // Method android/support/v7/widget/av.drawableHotspotChanged:(FF)V
       6: aload_0
       7: getfield      #87                 // Field c:Landroid/graphics/drawable/Drawable;
      10: ifnull        22
      13: aload_0
      14: getfield      #87                 // Field c:Landroid/graphics/drawable/Drawable;
      17: fload_1
      18: fload_2
      19: invokevirtual #142                // Method android/graphics/drawable/Drawable.setHotspot:(FF)V
      22: return

  protected void drawableStateChanged();
    Code:
       0: aload_0
       1: invokespecial #145                // Method android/support/v7/widget/av.drawableStateChanged:()V
       4: aload_0
       5: getfield      #87                 // Field c:Landroid/graphics/drawable/Drawable;
       8: ifnull        33
      11: aload_0
      12: getfield      #87                 // Field c:Landroid/graphics/drawable/Drawable;
      15: invokevirtual #149                // Method android/graphics/drawable/Drawable.isStateful:()Z
      18: ifeq          33
      21: aload_0
      22: getfield      #87                 // Field c:Landroid/graphics/drawable/Drawable;
      25: aload_0
      26: invokevirtual #153                // Method getDrawableState:()[I
      29: invokevirtual #157                // Method android/graphics/drawable/Drawable.setState:([I)Z
      32: pop
      33: return

  public android.graphics.drawable.Drawable getForeground();
    Code:
       0: aload_0
       1: getfield      #87                 // Field c:Landroid/graphics/drawable/Drawable;
       4: areturn

  public int getForegroundGravity();
    Code:
       0: aload_0
       1: getfield      #35                 // Field f:I
       4: ireturn

  public void jumpDrawablesToCurrentState();
    Code:
       0: aload_0
       1: invokespecial #163                // Method android/support/v7/widget/av.jumpDrawablesToCurrentState:()V
       4: aload_0
       5: getfield      #87                 // Field c:Landroid/graphics/drawable/Drawable;
       8: ifnull        18
      11: aload_0
      12: getfield      #87                 // Field c:Landroid/graphics/drawable/Drawable;
      15: invokevirtual #166                // Method android/graphics/drawable/Drawable.jumpToCurrentState:()V
      18: return

  protected void onLayout(boolean, int, int, int, int);
    Code:
       0: aload_0
       1: iload_1
       2: iload_2
       3: iload_3
       4: iload         4
       6: iload         5
       8: invokespecial #170                // Method android/support/v7/widget/av.onLayout:(ZIIII)V
      11: aload_0
      12: iload_1
      13: aload_0
      14: getfield      #39                 // Field b:Z
      17: ior
      18: putfield      #39                 // Field b:Z
      21: return

  protected void onSizeChanged(int, int, int, int);
    Code:
       0: aload_0
       1: iload_1
       2: iload_2
       3: iload_3
       4: iload         4
       6: invokespecial #173                // Method android/support/v7/widget/av.onSizeChanged:(IIII)V
       9: aload_0
      10: iconst_1
      11: putfield      #39                 // Field b:Z
      14: return

  public void setForeground(android.graphics.drawable.Drawable);
    Code:
       0: aload_0
       1: getfield      #87                 // Field c:Landroid/graphics/drawable/Drawable;
       4: aload_1
       5: if_acmpeq     103
       8: aload_0
       9: getfield      #87                 // Field c:Landroid/graphics/drawable/Drawable;
      12: ifnull        31
      15: aload_0
      16: getfield      #87                 // Field c:Landroid/graphics/drawable/Drawable;
      19: aconst_null
      20: invokevirtual #177                // Method android/graphics/drawable/Drawable.setCallback:(Landroid/graphics/drawable/Drawable$Callback;)V
      23: aload_0
      24: aload_0
      25: getfield      #87                 // Field c:Landroid/graphics/drawable/Drawable;
      28: invokevirtual #180                // Method unscheduleDrawable:(Landroid/graphics/drawable/Drawable;)V
      31: aload_0
      32: aload_1
      33: putfield      #87                 // Field c:Landroid/graphics/drawable/Drawable;
      36: aload_1
      37: ifnull        90
      40: aload_0
      41: iconst_0
      42: invokevirtual #184                // Method setWillNotDraw:(Z)V
      45: aload_1
      46: aload_0
      47: invokevirtual #177                // Method android/graphics/drawable/Drawable.setCallback:(Landroid/graphics/drawable/Drawable$Callback;)V
      50: aload_1
      51: invokevirtual #149                // Method android/graphics/drawable/Drawable.isStateful:()Z
      54: ifeq          66
      57: aload_1
      58: aload_0
      59: invokevirtual #153                // Method getDrawableState:()[I
      62: invokevirtual #157                // Method android/graphics/drawable/Drawable.setState:([I)Z
      65: pop
      66: aload_0
      67: getfield      #35                 // Field f:I
      70: bipush        119
      72: if_icmpne     95
      75: aload_1
      76: new           #26                 // class android/graphics/Rect
      79: dup
      80: invokespecial #29                 // Method android/graphics/Rect."<init>":()V
      83: invokevirtual #188                // Method android/graphics/drawable/Drawable.getPadding:(Landroid/graphics/Rect;)Z
      86: pop
      87: goto          95
      90: aload_0
      91: iconst_1
      92: invokevirtual #184                // Method setWillNotDraw:(Z)V
      95: aload_0
      96: invokevirtual #191                // Method requestLayout:()V
      99: aload_0
     100: invokevirtual #194                // Method invalidate:()V
     103: return

  public void setForegroundGravity(int);
    Code:
       0: aload_0
       1: getfield      #35                 // Field f:I
       4: iload_1
       5: if_icmpeq     78
       8: iload_1
       9: istore_2
      10: ldc           #197                // int 8388615
      12: iload_1
      13: iand
      14: ifne          22
      17: iload_1
      18: ldc           #198                // int 8388611
      20: ior
      21: istore_2
      22: iload_2
      23: istore_1
      24: iload_2
      25: bipush        112
      27: iand
      28: ifne          36
      31: iload_2
      32: bipush        48
      34: ior
      35: istore_1
      36: aload_0
      37: iload_1
      38: putfield      #35                 // Field f:I
      41: aload_0
      42: getfield      #35                 // Field f:I
      45: bipush        119
      47: if_icmpne     74
      50: aload_0
      51: getfield      #87                 // Field c:Landroid/graphics/drawable/Drawable;
      54: ifnull        74
      57: new           #26                 // class android/graphics/Rect
      60: dup
      61: invokespecial #29                 // Method android/graphics/Rect."<init>":()V
      64: astore_3
      65: aload_0
      66: getfield      #87                 // Field c:Landroid/graphics/drawable/Drawable;
      69: aload_3
      70: invokevirtual #188                // Method android/graphics/drawable/Drawable.getPadding:(Landroid/graphics/Rect;)Z
      73: pop
      74: aload_0
      75: invokevirtual #191                // Method requestLayout:()V
      78: return

  protected boolean verifyDrawable(android.graphics.drawable.Drawable);
    Code:
       0: aload_0
       1: aload_1
       2: invokespecial #202                // Method android/support/v7/widget/av.verifyDrawable:(Landroid/graphics/drawable/Drawable;)Z
       5: ifne          21
       8: aload_1
       9: aload_0
      10: getfield      #87                 // Field c:Landroid/graphics/drawable/Drawable;
      13: if_acmpne     19
      16: goto          21
      19: iconst_0
      20: ireturn
      21: iconst_1
      22: ireturn
}
