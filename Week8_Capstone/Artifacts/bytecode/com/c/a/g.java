public class com.c.a.g extends android.widget.FrameLayout implements com.c.a.e,com.c.a.f$c {
  public static final com.c.a.g$a b;

  static {};
    Code:
       0: new           #10                 // class com/c/a/g$a
       3: dup
       4: aconst_null
       5: invokespecial #34                 // Method com/c/a/g$a."<init>":(La/b/b/a;)V
       8: putstatic     #36                 // Field b:Lcom/c/a/g$a;
      11: getstatic     #41                 // Field com/c/a/h.a:Lcom/c/a/h$a;
      14: astore_0
      15: getstatic     #43                 // Field g:Ljava/lang/String;
      18: astore_1
      19: aload_1
      20: ldc           #45                 // String TAG
      22: invokestatic  #50                 // Method a/b/b/c.a:(Ljava/lang/Object;Ljava/lang/String;)V
      25: aload_0
      26: aload_1
      27: invokevirtual #55                 // Method com/c/a/h$a.a:(Ljava/lang/String;)Lcom/c/a/h;
      30: putstatic     #57                 // Field h:Lcom/c/a/h;
      33: return

  public com.c.a.g(android.content.Context);
    Code:
       0: aload_0
       1: aload_1
       2: aconst_null
       3: iconst_0
       4: bipush        6
       6: aconst_null
       7: invokespecial #62                 // Method "<init>":(Landroid/content/Context;Landroid/util/AttributeSet;IILa/b/b/a;)V
      10: return

  public com.c.a.g(android.content.Context, android.util.AttributeSet);
    Code:
       0: aload_0
       1: aload_1
       2: aload_2
       3: iconst_0
       4: iconst_4
       5: aconst_null
       6: invokespecial #62                 // Method "<init>":(Landroid/content/Context;Landroid/util/AttributeSet;IILa/b/b/a;)V
       9: return

  public com.c.a.g(android.content.Context, android.util.AttributeSet, int);
    Code:
       0: aload_1
       1: ldc           #66                 // String context
       3: invokestatic  #68                 // Method a/b/b/c.b:(Ljava/lang/Object;Ljava/lang/String;)V
       6: aload_0
       7: aload_1
       8: aload_2
       9: iload_3
      10: new           #70                 // class com/c/a/f
      13: dup
      14: aload_1
      15: invokespecial #72                 // Method com/c/a/f."<init>":(Landroid/content/Context;)V
      18: invokespecial #75                 // Method "<init>":(Landroid/content/Context;Landroid/util/AttributeSet;ILcom/c/a/f;)V
      21: return

  public com.c.a.g(android.content.Context, android.util.AttributeSet, int, int, a.b.b.a);
    Code:
       0: iload         4
       2: iconst_2
       3: iand
       4: ifeq          12
       7: aconst_null
       8: checkcast     #77                 // class android/util/AttributeSet
      11: astore_2
      12: iload         4
      14: iconst_4
      15: iand
      16: ifeq          21
      19: iconst_0
      20: istore_3
      21: aload_0
      22: aload_1
      23: aload_2
      24: iload_3
      25: invokespecial #79                 // Method "<init>":(Landroid/content/Context;Landroid/util/AttributeSet;I)V
      28: return

  com.c.a.g(android.content.Context, android.util.AttributeSet, int, com.c.a.f, int, a.b.b.a);
    Code:
       0: iload         5
       2: bipush        8
       4: iand
       5: ifeq          18
       8: new           #70                 // class com/c/a/f
      11: dup
      12: aload_1
      13: invokespecial #72                 // Method com/c/a/f."<init>":(Landroid/content/Context;)V
      16: astore        4
      18: aload_0
      19: aload_1
      20: aload_2
      21: iload_3
      22: aload         4
      24: invokespecial #75                 // Method "<init>":(Landroid/content/Context;Landroid/util/AttributeSet;ILcom/c/a/f;)V
      27: return

  public void a(float, int);
    Code:
       0: aload_0
       1: getfield      #82                 // Field f:Lcom/c/a/f;
       4: fload_1
       5: iload_2
       6: invokevirtual #241                // Method com/c/a/f.a:(FI)V
       9: return

  public void a(int, int);
    Code:
       0: aload_0
       1: getfield      #82                 // Field f:Lcom/c/a/f;
       4: iload_1
       5: iload_2
       6: invokevirtual #242                // Method com/c/a/f.a:(II)V
       9: return

  public void a(com.c.a.f);
    Code:
       0: aload_1
       1: ldc           #245                // String engine
       3: invokestatic  #68                 // Method a/b/b/c.b:(Ljava/lang/Object;Ljava/lang/String;)V
       6: return

  public void a(com.c.a.f, android.graphics.Matrix);
    Code:
       0: aload_1
       1: ldc           #245                // String engine
       3: invokestatic  #68                 // Method a/b/b/c.b:(Ljava/lang/Object;Ljava/lang/String;)V
       6: aload_2
       7: ldc           #248                // String matrix
       9: invokestatic  #68                 // Method a/b/b/c.b:(Ljava/lang/Object;Ljava/lang/String;)V
      12: aload_0
      13: getfield      #88                 // Field c:Landroid/graphics/Matrix;
      16: aload_2
      17: invokevirtual #252                // Method android/graphics/Matrix.set:(Landroid/graphics/Matrix;)V
      20: aload_0
      21: getfield      #254                // Field e:Z
      24: ifeq          111
      27: aload_0
      28: invokevirtual #258                // Method getChildCount:()I
      31: ifle          115
      34: aload_0
      35: iconst_0
      36: invokevirtual #262                // Method getChildAt:(I)Landroid/view/View;
      39: astore_1
      40: aload_0
      41: getfield      #88                 // Field c:Landroid/graphics/Matrix;
      44: aload_0
      45: getfield      #90                 // Field d:[F
      48: invokevirtual #266                // Method android/graphics/Matrix.getValues:([F)V
      51: aload_1
      52: ldc_w         #268                // String child
      55: invokestatic  #50                 // Method a/b/b/c.a:(Ljava/lang/Object;Ljava/lang/String;)V
      58: aload_1
      59: fconst_0
      60: invokevirtual #272                // Method android/view/View.setPivotX:(F)V
      63: aload_1
      64: fconst_0
      65: invokevirtual #275                // Method android/view/View.setPivotY:(F)V
      68: aload_1
      69: aload_0
      70: getfield      #90                 // Field d:[F
      73: iconst_2
      74: faload
      75: invokevirtual #278                // Method android/view/View.setTranslationX:(F)V
      78: aload_1
      79: aload_0
      80: getfield      #90                 // Field d:[F
      83: iconst_5
      84: faload
      85: invokevirtual #281                // Method android/view/View.setTranslationY:(F)V
      88: aload_1
      89: aload_0
      90: getfield      #90                 // Field d:[F
      93: iconst_0
      94: faload
      95: invokevirtual #284                // Method android/view/View.setScaleX:(F)V
      98: aload_1
      99: aload_0
     100: getfield      #90                 // Field d:[F
     103: iconst_4
     104: faload
     105: invokevirtual #287                // Method android/view/View.setScaleY:(F)V
     108: goto          115
     111: aload_0
     112: invokevirtual #290                // Method invalidate:()V
     115: aload_0
     116: invokevirtual #294                // Method isHorizontalScrollBarEnabled:()Z
     119: ifne          129
     122: aload_0
     123: invokevirtual #297                // Method isVerticalScrollBarEnabled:()Z
     126: ifeq          140
     129: aload_0
     130: invokevirtual #300                // Method awakenScrollBars:()Z
     133: ifne          140
     136: aload_0
     137: invokevirtual #290                // Method invalidate:()V
     140: return

  public void addView(android.view.View, int, android.view.ViewGroup$LayoutParams);
    Code:
       0: aload_1
       1: ldc_w         #268                // String child
       4: invokestatic  #68                 // Method a/b/b/c.b:(Ljava/lang/Object;Ljava/lang/String;)V
       7: aload_3
       8: ldc_w         #304                // String params
      11: invokestatic  #68                 // Method a/b/b/c.b:(Ljava/lang/Object;Ljava/lang/String;)V
      14: aload_0
      15: invokevirtual #258                // Method getChildCount:()I
      18: ifne          48
      21: aload_1
      22: invokevirtual #308                // Method android/view/View.getViewTreeObserver:()Landroid/view/ViewTreeObserver;
      25: new           #13                 // class com/c/a/g$b
      28: dup
      29: aload_0
      30: aload_1
      31: invokespecial #311                // Method com/c/a/g$b."<init>":(Lcom/c/a/g;Landroid/view/View;)V
      34: checkcast     #313                // class android/view/ViewTreeObserver$OnGlobalLayoutListener
      37: invokevirtual #319                // Method android/view/ViewTreeObserver.addOnGlobalLayoutListener:(Landroid/view/ViewTreeObserver$OnGlobalLayoutListener;)V
      40: aload_0
      41: aload_1
      42: iload_2
      43: aload_3
      44: invokespecial #321                // Method android/widget/FrameLayout.addView:(Landroid/view/View;ILandroid/view/ViewGroup$LayoutParams;)V
      47: return
      48: new           #323                // class java/lang/StringBuilder
      51: dup
      52: invokespecial #324                // Method java/lang/StringBuilder."<init>":()V
      55: astore_1
      56: aload_1
      57: getstatic     #43                 // Field g:Ljava/lang/String;
      60: invokevirtual #328                // Method java/lang/StringBuilder.append:(Ljava/lang/String;)Ljava/lang/StringBuilder;
      63: pop
      64: aload_1
      65: ldc_w         #330                // String  accepts only a single child.
      68: invokevirtual #328                // Method java/lang/StringBuilder.append:(Ljava/lang/String;)Ljava/lang/StringBuilder;
      71: pop
      72: new           #332                // class java/lang/RuntimeException
      75: dup
      76: aload_1
      77: invokevirtual #336                // Method java/lang/StringBuilder.toString:()Ljava/lang/String;
      80: invokespecial #339                // Method java/lang/RuntimeException."<init>":(Ljava/lang/String;)V
      83: checkcast     #341                // class java/lang/Throwable
      86: athrow

  public void b(float, int);
    Code:
       0: aload_0
       1: getfield      #82                 // Field f:Lcom/c/a/f;
       4: fload_1
       5: iload_2
       6: invokevirtual #342                // Method com/c/a/f.b:(FI)V
       9: return

  protected int computeHorizontalScrollOffset();
    Code:
       0: aload_0
       1: getfield      #82                 // Field f:Lcom/c/a/f;
       4: invokevirtual #345                // Method com/c/a/f.g:()I
       7: ireturn

  protected int computeHorizontalScrollRange();
    Code:
       0: aload_0
       1: getfield      #82                 // Field f:Lcom/c/a/f;
       4: invokevirtual #348                // Method com/c/a/f.h:()I
       7: ireturn

  protected int computeVerticalScrollOffset();
    Code:
       0: aload_0
       1: getfield      #82                 // Field f:Lcom/c/a/f;
       4: invokevirtual #352                // Method com/c/a/f.i:()I
       7: ireturn

  protected int computeVerticalScrollRange();
    Code:
       0: aload_0
       1: getfield      #82                 // Field f:Lcom/c/a/f;
       4: invokevirtual #356                // Method com/c/a/f.j:()I
       7: ireturn

  protected boolean drawChild(android.graphics.Canvas, android.view.View, long);
    Code:
       0: aload_1
       1: ldc_w         #360                // String canvas
       4: invokestatic  #68                 // Method a/b/b/c.b:(Ljava/lang/Object;Ljava/lang/String;)V
       7: aload_2
       8: ldc_w         #268                // String child
      11: invokestatic  #68                 // Method a/b/b/c.b:(Ljava/lang/Object;Ljava/lang/String;)V
      14: aload_0
      15: getfield      #254                // Field e:Z
      18: ifne          53
      21: aload_1
      22: invokevirtual #365                // Method android/graphics/Canvas.save:()I
      25: istore        5
      27: aload_1
      28: aload_0
      29: getfield      #88                 // Field c:Landroid/graphics/Matrix;
      32: invokevirtual #368                // Method android/graphics/Canvas.concat:(Landroid/graphics/Matrix;)V
      35: aload_0
      36: aload_1
      37: aload_2
      38: lload_3
      39: invokespecial #370                // Method android/widget/FrameLayout.drawChild:(Landroid/graphics/Canvas;Landroid/view/View;J)Z
      42: istore        6
      44: aload_1
      45: iload         5
      47: invokevirtual #373                // Method android/graphics/Canvas.restoreToCount:(I)V
      50: iload         6
      52: ireturn
      53: aload_0
      54: aload_1
      55: aload_2
      56: lload_3
      57: invokespecial #370                // Method android/widget/FrameLayout.drawChild:(Landroid/graphics/Canvas;Landroid/view/View;J)Z
      60: ireturn

  public final com.c.a.f getEngine();
    Code:
       0: aload_0
       1: getfield      #82                 // Field f:Lcom/c/a/f;
       4: areturn

  public com.c.a.a getPan();
    Code:
       0: aload_0
       1: getfield      #82                 // Field f:Lcom/c/a/f;
       4: invokevirtual #379                // Method com/c/a/f.d:()Lcom/c/a/a;
       7: areturn

  public float getPanX();
    Code:
       0: aload_0
       1: getfield      #82                 // Field f:Lcom/c/a/f;
       4: invokevirtual #383                // Method com/c/a/f.e:()F
       7: freturn

  public float getPanY();
    Code:
       0: aload_0
       1: getfield      #82                 // Field f:Lcom/c/a/f;
       4: invokevirtual #386                // Method com/c/a/f.f:()F
       7: freturn

  public float getRealZoom();
    Code:
       0: aload_0
       1: getfield      #82                 // Field f:Lcom/c/a/f;
       4: invokevirtual #389                // Method com/c/a/f.c:()F
       7: freturn

  public float getZoom();
    Code:
       0: aload_0
       1: getfield      #82                 // Field f:Lcom/c/a/f;
       4: invokevirtual #392                // Method com/c/a/f.a:()F
       7: freturn

  public boolean onInterceptTouchEvent(android.view.MotionEvent);
    Code:
       0: aload_1
       1: ldc_w         #396                // String ev
       4: invokestatic  #68                 // Method a/b/b/c.b:(Ljava/lang/Object;Ljava/lang/String;)V
       7: aload_0
       8: getfield      #82                 // Field f:Lcom/c/a/f;
      11: aload_1
      12: invokevirtual #398                // Method com/c/a/f.a:(Landroid/view/MotionEvent;)Z
      15: ifne          38
      18: aload_0
      19: getfield      #254                // Field e:Z
      22: ifeq          36
      25: aload_0
      26: aload_1
      27: invokespecial #400                // Method android/widget/FrameLayout.onInterceptTouchEvent:(Landroid/view/MotionEvent;)Z
      30: ifeq          36
      33: goto          38
      36: iconst_0
      37: ireturn
      38: iconst_1
      39: ireturn

  protected void onMeasure(int, int);
    Code:
       0: iload_1
       1: invokestatic  #407                // Method android/view/View$MeasureSpec.getMode:(I)I
       4: istore_3
       5: iload_2
       6: invokestatic  #407                // Method android/view/View$MeasureSpec.getMode:(I)I
       9: istore        4
      11: iload_3
      12: ifeq          48
      15: iload         4
      17: ifne          23
      20: goto          48
      23: aload_0
      24: iload_1
      25: invokestatic  #410                // Method android/view/View$MeasureSpec.getSize:(I)I
      28: iload_2
      29: invokestatic  #410                // Method android/view/View$MeasureSpec.getSize:(I)I
      32: invokevirtual #413                // Method setMeasuredDimension:(II)V
      35: iconst_0
      36: iconst_0
      37: invokestatic  #416                // Method android/view/View$MeasureSpec.makeMeasureSpec:(II)I
      40: istore_1
      41: aload_0
      42: iload_1
      43: iload_1
      44: invokevirtual #419                // Method measureChildren:(II)V
      47: return
      48: new           #323                // class java/lang/StringBuilder
      51: dup
      52: invokespecial #324                // Method java/lang/StringBuilder."<init>":()V
      55: astore        5
      57: aload         5
      59: getstatic     #43                 // Field g:Ljava/lang/String;
      62: invokevirtual #328                // Method java/lang/StringBuilder.append:(Ljava/lang/String;)Ljava/lang/StringBuilder;
      65: pop
      66: aload         5
      68: ldc_w         #421                // String  must be used with fixed dimensions (e.g. match_parent)
      71: invokevirtual #328                // Method java/lang/StringBuilder.append:(Ljava/lang/String;)Ljava/lang/StringBuilder;
      74: pop
      75: new           #332                // class java/lang/RuntimeException
      78: dup
      79: aload         5
      81: invokevirtual #336                // Method java/lang/StringBuilder.toString:()Ljava/lang/String;
      84: invokespecial #339                // Method java/lang/RuntimeException."<init>":(Ljava/lang/String;)V
      87: checkcast     #341                // class java/lang/Throwable
      90: athrow

  public boolean onTouchEvent(android.view.MotionEvent);
    Code:
       0: aload_1
       1: ldc_w         #396                // String ev
       4: invokestatic  #68                 // Method a/b/b/c.b:(Ljava/lang/Object;Ljava/lang/String;)V
       7: aload_0
       8: getfield      #82                 // Field f:Lcom/c/a/f;
      11: aload_1
      12: invokevirtual #424                // Method com/c/a/f.b:(Landroid/view/MotionEvent;)Z
      15: ifne          38
      18: aload_0
      19: getfield      #254                // Field e:Z
      22: ifeq          36
      25: aload_0
      26: aload_1
      27: invokespecial #426                // Method android/widget/FrameLayout.onTouchEvent:(Landroid/view/MotionEvent;)Z
      30: ifeq          36
      33: goto          38
      36: iconst_0
      37: ireturn
      38: iconst_1
      39: ireturn

  public void setAlignment(int);
    Code:
       0: aload_0
       1: getfield      #82                 // Field f:Lcom/c/a/f;
       4: iload_1
       5: invokevirtual #428                // Method com/c/a/f.a:(I)V
       8: return

  public void setAllowFlingInOverscroll(boolean);
    Code:
       0: aload_0
       1: getfield      #82                 // Field f:Lcom/c/a/f;
       4: iload_1
       5: invokevirtual #430                // Method com/c/a/f.h:(Z)V
       8: return

  public void setAnimationDuration(long);
    Code:
       0: aload_0
       1: getfield      #82                 // Field f:Lcom/c/a/f;
       4: lload_1
       5: invokevirtual #432                // Method com/c/a/f.a:(J)V
       8: return

  public void setFlingEnabled(boolean);
    Code:
       0: aload_0
       1: getfield      #82                 // Field f:Lcom/c/a/f;
       4: iload_1
       5: invokevirtual #434                // Method com/c/a/f.g:(Z)V
       8: return

  public final void setHasClickableChildren(boolean);
    Code:
       0: getstatic     #57                 // Field h:Lcom/c/a/h;
       3: iconst_5
       4: anewarray     #436                // class java/lang/Object
       7: dup
       8: iconst_0
       9: ldc_w         #438                // String setHasClickableChildren:
      12: aastore
      13: dup
      14: iconst_1
      15: ldc_w         #440                // String old:
      18: aastore
      19: dup
      20: iconst_2
      21: aload_0
      22: getfield      #254                // Field e:Z
      25: invokestatic  #446                // Method java/lang/Boolean.valueOf:(Z)Ljava/lang/Boolean;
      28: aastore
      29: dup
      30: iconst_3
      31: ldc_w         #448                // String new:
      34: aastore
      35: dup
      36: iconst_4
      37: iload_1
      38: invokestatic  #446                // Method java/lang/Boolean.valueOf:(Z)Ljava/lang/Boolean;
      41: aastore
      42: invokevirtual #451                // Method com/c/a/h.b:([Ljava/lang/Object;)V
      45: aload_0
      46: getfield      #254                // Field e:Z
      49: ifeq          96
      52: iload_1
      53: ifne          96
      56: aload_0
      57: invokevirtual #258                // Method getChildCount:()I
      60: ifle          96
      63: aload_0
      64: iconst_0
      65: invokevirtual #262                // Method getChildAt:(I)Landroid/view/View;
      68: astore_2
      69: aload_2
      70: ldc_w         #268                // String child
      73: invokestatic  #50                 // Method a/b/b/c.a:(Ljava/lang/Object;Ljava/lang/String;)V
      76: aload_2
      77: fconst_1
      78: invokevirtual #284                // Method android/view/View.setScaleX:(F)V
      81: aload_2
      82: fconst_1
      83: invokevirtual #287                // Method android/view/View.setScaleY:(F)V
      86: aload_2
      87: fconst_0
      88: invokevirtual #278                // Method android/view/View.setTranslationX:(F)V
      91: aload_2
      92: fconst_0
      93: invokevirtual #281                // Method android/view/View.setTranslationY:(F)V
      96: aload_0
      97: iload_1
      98: putfield      #254                // Field e:Z
     101: aload_0
     102: invokevirtual #454                // Method getWidth:()I
     105: ifle          139
     108: aload_0
     109: invokevirtual #457                // Method getHeight:()I
     112: ifle          139
     115: aload_0
     116: getfield      #254                // Field e:Z
     119: ifeq          135
     122: aload_0
     123: aload_0
     124: getfield      #82                 // Field f:Lcom/c/a/f;
     127: aload_0
     128: getfield      #88                 // Field c:Landroid/graphics/Matrix;
     131: invokevirtual #459                // Method a:(Lcom/c/a/f;Landroid/graphics/Matrix;)V
     134: return
     135: aload_0
     136: invokevirtual #290                // Method invalidate:()V
     139: return

  public void setHorizontalPanEnabled(boolean);
    Code:
       0: aload_0
       1: getfield      #82                 // Field f:Lcom/c/a/f;
       4: iload_1
       5: invokevirtual #461                // Method com/c/a/f.c:(Z)V
       8: return

  public void setOverPinchable(boolean);
    Code:
       0: aload_0
       1: getfield      #82                 // Field f:Lcom/c/a/f;
       4: iload_1
       5: invokevirtual #463                // Method com/c/a/f.e:(Z)V
       8: return

  public void setOverScrollHorizontal(boolean);
    Code:
       0: aload_0
       1: getfield      #82                 // Field f:Lcom/c/a/f;
       4: iload_1
       5: invokevirtual #465                // Method com/c/a/f.a:(Z)V
       8: return

  public void setOverScrollVertical(boolean);
    Code:
       0: aload_0
       1: getfield      #82                 // Field f:Lcom/c/a/f;
       4: iload_1
       5: invokevirtual #467                // Method com/c/a/f.b:(Z)V
       8: return

  public void setTransformation(int);
    Code:
       0: aload_0
       1: getfield      #82                 // Field f:Lcom/c/a/f;
       4: iload_1
       5: invokevirtual #470                // Method com/c/a/f.b:(I)V
       8: return

  public void setVerticalPanEnabled(boolean);
    Code:
       0: aload_0
       1: getfield      #82                 // Field f:Lcom/c/a/f;
       4: iload_1
       5: invokevirtual #472                // Method com/c/a/f.d:(Z)V
       8: return

  public void setZoomEnabled(boolean);
    Code:
       0: aload_0
       1: getfield      #82                 // Field f:Lcom/c/a/f;
       4: iload_1
       5: invokevirtual #474                // Method com/c/a/f.f:(Z)V
       8: return
}
