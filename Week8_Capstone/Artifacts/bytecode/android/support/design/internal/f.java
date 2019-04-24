public class android.support.design.internal.f extends android.widget.FrameLayout {
  android.graphics.drawable.Drawable a;

  android.graphics.Rect b;

  public android.support.design.internal.f(android.content.Context);
    Code:
       0: aload_0
       1: aload_1
       2: aconst_null
       3: invokespecial #16                 // Method "<init>":(Landroid/content/Context;Landroid/util/AttributeSet;)V
       6: return

  public android.support.design.internal.f(android.content.Context, android.util.AttributeSet);
    Code:
       0: aload_0
       1: aload_1
       2: aload_2
       3: iconst_0
       4: invokespecial #20                 // Method "<init>":(Landroid/content/Context;Landroid/util/AttributeSet;I)V
       7: return

  public android.support.design.internal.f(android.content.Context, android.util.AttributeSet, int);
    Code:
       0: aload_0
       1: aload_1
       2: aload_2
       3: iload_3
       4: invokespecial #21                 // Method android/widget/FrameLayout."<init>":(Landroid/content/Context;Landroid/util/AttributeSet;I)V
       7: aload_0
       8: new           #23                 // class android/graphics/Rect
      11: dup
      12: invokespecial #26                 // Method android/graphics/Rect."<init>":()V
      15: putfield      #28                 // Field c:Landroid/graphics/Rect;
      18: aload_1
      19: aload_2
      20: getstatic     #34                 // Field android/support/design/a$j.ScrimInsetsFrameLayout:[I
      23: iload_3
      24: getstatic     #40                 // Field android/support/design/a$i.Widget_Design_ScrimInsetsFrameLayout:I
      27: invokevirtual #46                 // Method android/content/Context.obtainStyledAttributes:(Landroid/util/AttributeSet;[III)Landroid/content/res/TypedArray;
      30: astore_1
      31: aload_0
      32: aload_1
      33: getstatic     #49                 // Field android/support/design/a$j.ScrimInsetsFrameLayout_insetForeground:I
      36: invokevirtual #55                 // Method android/content/res/TypedArray.getDrawable:(I)Landroid/graphics/drawable/Drawable;
      39: putfield      #57                 // Field a:Landroid/graphics/drawable/Drawable;
      42: aload_1
      43: invokevirtual #60                 // Method android/content/res/TypedArray.recycle:()V
      46: aload_0
      47: iconst_1
      48: invokevirtual #64                 // Method setWillNotDraw:(Z)V
      51: aload_0
      52: new           #6                  // class android/support/design/internal/f$1
      55: dup
      56: aload_0
      57: invokespecial #67                 // Method android/support/design/internal/f$1."<init>":(Landroid/support/design/internal/f;)V
      60: invokestatic  #72                 // Method android/support/v4/view/s.a:(Landroid/view/View;Landroid/support/v4/view/p;)V
      63: return

  protected void a(android.support.v4.view.ab);
    Code:
       0: return

  public void draw(android.graphics.Canvas);
    Code:
       0: aload_0
       1: aload_1
       2: invokespecial #77                 // Method android/widget/FrameLayout.draw:(Landroid/graphics/Canvas;)V
       5: aload_0
       6: invokevirtual #81                 // Method getWidth:()I
       9: istore_2
      10: aload_0
      11: invokevirtual #84                 // Method getHeight:()I
      14: istore_3
      15: aload_0
      16: getfield      #86                 // Field b:Landroid/graphics/Rect;
      19: ifnull        231
      22: aload_0
      23: getfield      #57                 // Field a:Landroid/graphics/drawable/Drawable;
      26: ifnull        231
      29: aload_1
      30: invokevirtual #91                 // Method android/graphics/Canvas.save:()I
      33: istore        4
      35: aload_1
      36: aload_0
      37: invokevirtual #94                 // Method getScrollX:()I
      40: i2f
      41: aload_0
      42: invokevirtual #97                 // Method getScrollY:()I
      45: i2f
      46: invokevirtual #101                // Method android/graphics/Canvas.translate:(FF)V
      49: aload_0
      50: getfield      #28                 // Field c:Landroid/graphics/Rect;
      53: iconst_0
      54: iconst_0
      55: iload_2
      56: aload_0
      57: getfield      #86                 // Field b:Landroid/graphics/Rect;
      60: getfield      #104                // Field android/graphics/Rect.top:I
      63: invokevirtual #108                // Method android/graphics/Rect.set:(IIII)V
      66: aload_0
      67: getfield      #57                 // Field a:Landroid/graphics/drawable/Drawable;
      70: aload_0
      71: getfield      #28                 // Field c:Landroid/graphics/Rect;
      74: invokevirtual #114                // Method android/graphics/drawable/Drawable.setBounds:(Landroid/graphics/Rect;)V
      77: aload_0
      78: getfield      #57                 // Field a:Landroid/graphics/drawable/Drawable;
      81: aload_1
      82: invokevirtual #115                // Method android/graphics/drawable/Drawable.draw:(Landroid/graphics/Canvas;)V
      85: aload_0
      86: getfield      #28                 // Field c:Landroid/graphics/Rect;
      89: iconst_0
      90: iload_3
      91: aload_0
      92: getfield      #86                 // Field b:Landroid/graphics/Rect;
      95: getfield      #118                // Field android/graphics/Rect.bottom:I
      98: isub
      99: iload_2
     100: iload_3
     101: invokevirtual #108                // Method android/graphics/Rect.set:(IIII)V
     104: aload_0
     105: getfield      #57                 // Field a:Landroid/graphics/drawable/Drawable;
     108: aload_0
     109: getfield      #28                 // Field c:Landroid/graphics/Rect;
     112: invokevirtual #114                // Method android/graphics/drawable/Drawable.setBounds:(Landroid/graphics/Rect;)V
     115: aload_0
     116: getfield      #57                 // Field a:Landroid/graphics/drawable/Drawable;
     119: aload_1
     120: invokevirtual #115                // Method android/graphics/drawable/Drawable.draw:(Landroid/graphics/Canvas;)V
     123: aload_0
     124: getfield      #28                 // Field c:Landroid/graphics/Rect;
     127: iconst_0
     128: aload_0
     129: getfield      #86                 // Field b:Landroid/graphics/Rect;
     132: getfield      #104                // Field android/graphics/Rect.top:I
     135: aload_0
     136: getfield      #86                 // Field b:Landroid/graphics/Rect;
     139: getfield      #121                // Field android/graphics/Rect.left:I
     142: iload_3
     143: aload_0
     144: getfield      #86                 // Field b:Landroid/graphics/Rect;
     147: getfield      #118                // Field android/graphics/Rect.bottom:I
     150: isub
     151: invokevirtual #108                // Method android/graphics/Rect.set:(IIII)V
     154: aload_0
     155: getfield      #57                 // Field a:Landroid/graphics/drawable/Drawable;
     158: aload_0
     159: getfield      #28                 // Field c:Landroid/graphics/Rect;
     162: invokevirtual #114                // Method android/graphics/drawable/Drawable.setBounds:(Landroid/graphics/Rect;)V
     165: aload_0
     166: getfield      #57                 // Field a:Landroid/graphics/drawable/Drawable;
     169: aload_1
     170: invokevirtual #115                // Method android/graphics/drawable/Drawable.draw:(Landroid/graphics/Canvas;)V
     173: aload_0
     174: getfield      #28                 // Field c:Landroid/graphics/Rect;
     177: iload_2
     178: aload_0
     179: getfield      #86                 // Field b:Landroid/graphics/Rect;
     182: getfield      #124                // Field android/graphics/Rect.right:I
     185: isub
     186: aload_0
     187: getfield      #86                 // Field b:Landroid/graphics/Rect;
     190: getfield      #104                // Field android/graphics/Rect.top:I
     193: iload_2
     194: iload_3
     195: aload_0
     196: getfield      #86                 // Field b:Landroid/graphics/Rect;
     199: getfield      #118                // Field android/graphics/Rect.bottom:I
     202: isub
     203: invokevirtual #108                // Method android/graphics/Rect.set:(IIII)V
     206: aload_0
     207: getfield      #57                 // Field a:Landroid/graphics/drawable/Drawable;
     210: aload_0
     211: getfield      #28                 // Field c:Landroid/graphics/Rect;
     214: invokevirtual #114                // Method android/graphics/drawable/Drawable.setBounds:(Landroid/graphics/Rect;)V
     217: aload_0
     218: getfield      #57                 // Field a:Landroid/graphics/drawable/Drawable;
     221: aload_1
     222: invokevirtual #115                // Method android/graphics/drawable/Drawable.draw:(Landroid/graphics/Canvas;)V
     225: aload_1
     226: iload         4
     228: invokevirtual #128                // Method android/graphics/Canvas.restoreToCount:(I)V
     231: return

  protected void onAttachedToWindow();
    Code:
       0: aload_0
       1: invokespecial #131                // Method android/widget/FrameLayout.onAttachedToWindow:()V
       4: aload_0
       5: getfield      #57                 // Field a:Landroid/graphics/drawable/Drawable;
       8: ifnull        19
      11: aload_0
      12: getfield      #57                 // Field a:Landroid/graphics/drawable/Drawable;
      15: aload_0
      16: invokevirtual #135                // Method android/graphics/drawable/Drawable.setCallback:(Landroid/graphics/drawable/Drawable$Callback;)V
      19: return

  protected void onDetachedFromWindow();
    Code:
       0: aload_0
       1: invokespecial #138                // Method android/widget/FrameLayout.onDetachedFromWindow:()V
       4: aload_0
       5: getfield      #57                 // Field a:Landroid/graphics/drawable/Drawable;
       8: ifnull        19
      11: aload_0
      12: getfield      #57                 // Field a:Landroid/graphics/drawable/Drawable;
      15: aconst_null
      16: invokevirtual #135                // Method android/graphics/drawable/Drawable.setCallback:(Landroid/graphics/drawable/Drawable$Callback;)V
      19: return
}
