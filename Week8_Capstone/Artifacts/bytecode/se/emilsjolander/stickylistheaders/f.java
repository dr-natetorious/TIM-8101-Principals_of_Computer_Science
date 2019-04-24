public class se.emilsjolander.stickylistheaders.f extends android.view.ViewGroup {
  android.view.View a;

  android.graphics.drawable.Drawable b;

  int c;

  android.view.View d;

  int e;

  se.emilsjolander.stickylistheaders.f(android.content.Context);
    Code:
       0: aload_0
       1: aload_1
       2: invokespecial #16                 // Method android/view/ViewGroup."<init>":(Landroid/content/Context;)V
       5: return

  void a(android.view.View, android.view.View, android.graphics.drawable.Drawable, int);
    Code:
       0: aload_1
       1: ifnonnull     14
       4: new           #20                 // class java/lang/NullPointerException
       7: dup
       8: ldc           #22                 // String List view item must not be null.
      10: invokespecial #25                 // Method java/lang/NullPointerException."<init>":(Ljava/lang/String;)V
      13: athrow
      14: aload_0
      15: getfield      #27                 // Field a:Landroid/view/View;
      18: aload_1
      19: if_acmpeq     74
      22: aload_0
      23: aload_0
      24: getfield      #27                 // Field a:Landroid/view/View;
      27: invokevirtual #31                 // Method removeView:(Landroid/view/View;)V
      30: aload_0
      31: aload_1
      32: putfield      #27                 // Field a:Landroid/view/View;
      35: aload_1
      36: invokevirtual #37                 // Method android/view/View.getParent:()Landroid/view/ViewParent;
      39: astore        5
      41: aload         5
      43: ifnull        69
      46: aload         5
      48: aload_0
      49: if_acmpeq     69
      52: aload         5
      54: instanceof    #4                  // class android/view/ViewGroup
      57: ifeq          69
      60: aload         5
      62: checkcast     #4                  // class android/view/ViewGroup
      65: aload_1
      66: invokevirtual #38                 // Method android/view/ViewGroup.removeView:(Landroid/view/View;)V
      69: aload_0
      70: aload_1
      71: invokevirtual #41                 // Method addView:(Landroid/view/View;)V
      74: aload_0
      75: getfield      #43                 // Field d:Landroid/view/View;
      78: aload_2
      79: if_acmpeq     111
      82: aload_0
      83: getfield      #43                 // Field d:Landroid/view/View;
      86: ifnull        97
      89: aload_0
      90: aload_0
      91: getfield      #43                 // Field d:Landroid/view/View;
      94: invokevirtual #31                 // Method removeView:(Landroid/view/View;)V
      97: aload_0
      98: aload_2
      99: putfield      #43                 // Field d:Landroid/view/View;
     102: aload_2
     103: ifnull        111
     106: aload_0
     107: aload_2
     108: invokevirtual #41                 // Method addView:(Landroid/view/View;)V
     111: aload_0
     112: getfield      #45                 // Field b:Landroid/graphics/drawable/Drawable;
     115: aload_3
     116: if_acmpeq     134
     119: aload_0
     120: aload_3
     121: putfield      #45                 // Field b:Landroid/graphics/drawable/Drawable;
     124: aload_0
     125: iload         4
     127: putfield      #47                 // Field c:I
     130: aload_0
     131: invokevirtual #51                 // Method invalidate:()V
     134: return

  public boolean a();
    Code:
       0: aload_0
       1: getfield      #43                 // Field d:Landroid/view/View;
       4: ifnull        9
       7: iconst_1
       8: ireturn
       9: iconst_0
      10: ireturn

  protected void dispatchDraw(android.graphics.Canvas);
    Code:
       0: aload_0
       1: aload_1
       2: invokespecial #56                 // Method android/view/ViewGroup.dispatchDraw:(Landroid/graphics/Canvas;)V
       5: aload_0
       6: getfield      #43                 // Field d:Landroid/view/View;
       9: ifnonnull     62
      12: aload_0
      13: getfield      #45                 // Field b:Landroid/graphics/drawable/Drawable;
      16: ifnull        62
      19: aload_0
      20: getfield      #27                 // Field a:Landroid/view/View;
      23: invokevirtual #60                 // Method android/view/View.getVisibility:()I
      26: bipush        8
      28: if_icmpeq     62
      31: getstatic     #65                 // Field android/os/Build$VERSION.SDK_INT:I
      34: bipush        11
      36: if_icmpge     54
      39: aload_1
      40: iconst_0
      41: iconst_0
      42: aload_0
      43: invokevirtual #68                 // Method getWidth:()I
      46: aload_0
      47: getfield      #47                 // Field c:I
      50: invokevirtual #74                 // Method android/graphics/Canvas.clipRect:(IIII)Z
      53: pop
      54: aload_0
      55: getfield      #45                 // Field b:Landroid/graphics/drawable/Drawable;
      58: aload_1
      59: invokevirtual #79                 // Method android/graphics/drawable/Drawable.draw:(Landroid/graphics/Canvas;)V
      62: return

  public android.view.View getHeader();
    Code:
       0: aload_0
       1: getfield      #43                 // Field d:Landroid/view/View;
       4: areturn

  public android.view.View getItem();
    Code:
       0: aload_0
       1: getfield      #27                 // Field a:Landroid/view/View;
       4: areturn

  protected void onLayout(boolean, int, int, int, int);
    Code:
       0: aload_0
       1: invokevirtual #68                 // Method getWidth:()I
       4: istore_2
       5: aload_0
       6: invokevirtual #87                 // Method getHeight:()I
       9: istore_3
      10: aload_0
      11: getfield      #43                 // Field d:Landroid/view/View;
      14: ifnull        57
      17: aload_0
      18: getfield      #43                 // Field d:Landroid/view/View;
      21: invokevirtual #90                 // Method android/view/View.getMeasuredHeight:()I
      24: istore        4
      26: aload_0
      27: getfield      #43                 // Field d:Landroid/view/View;
      30: iconst_0
      31: iconst_0
      32: iload_2
      33: iload         4
      35: invokevirtual #94                 // Method android/view/View.layout:(IIII)V
      38: aload_0
      39: iload         4
      41: putfield      #96                 // Field e:I
      44: aload_0
      45: getfield      #27                 // Field a:Landroid/view/View;
      48: iconst_0
      49: iload         4
      51: iload_2
      52: iload_3
      53: invokevirtual #94                 // Method android/view/View.layout:(IIII)V
      56: return
      57: aload_0
      58: getfield      #45                 // Field b:Landroid/graphics/drawable/Drawable;
      61: ifnull        101
      64: aload_0
      65: getfield      #45                 // Field b:Landroid/graphics/drawable/Drawable;
      68: iconst_0
      69: iconst_0
      70: iload_2
      71: aload_0
      72: getfield      #47                 // Field c:I
      75: invokevirtual #99                 // Method android/graphics/drawable/Drawable.setBounds:(IIII)V
      78: aload_0
      79: aload_0
      80: getfield      #47                 // Field c:I
      83: putfield      #96                 // Field e:I
      86: aload_0
      87: getfield      #27                 // Field a:Landroid/view/View;
      90: iconst_0
      91: aload_0
      92: getfield      #47                 // Field c:I
      95: iload_2
      96: iload_3
      97: invokevirtual #94                 // Method android/view/View.layout:(IIII)V
     100: return
     101: aload_0
     102: iconst_0
     103: putfield      #96                 // Field e:I
     106: aload_0
     107: getfield      #27                 // Field a:Landroid/view/View;
     110: iconst_0
     111: iconst_0
     112: iload_2
     113: iload_3
     114: invokevirtual #94                 // Method android/view/View.layout:(IIII)V
     117: return

  protected void onMeasure(int, int);
    Code:
       0: iload_1
       1: invokestatic  #107                // Method android/view/View$MeasureSpec.getSize:(I)I
       4: istore_2
       5: iload_2
       6: ldc           #108                // int 1073741824
       8: invokestatic  #112                // Method android/view/View$MeasureSpec.makeMeasureSpec:(II)I
      11: istore_3
      12: aload_0
      13: getfield      #43                 // Field d:Landroid/view/View;
      16: ifnull        90
      19: aload_0
      20: getfield      #43                 // Field d:Landroid/view/View;
      23: invokevirtual #116                // Method android/view/View.getLayoutParams:()Landroid/view/ViewGroup$LayoutParams;
      26: astore        4
      28: aload         4
      30: ifnull        62
      33: aload         4
      35: getfield      #121                // Field android/view/ViewGroup$LayoutParams.height:I
      38: ifle          62
      41: aload_0
      42: getfield      #43                 // Field d:Landroid/view/View;
      45: iload_3
      46: aload         4
      48: getfield      #121                // Field android/view/ViewGroup$LayoutParams.height:I
      51: ldc           #108                // int 1073741824
      53: invokestatic  #112                // Method android/view/View$MeasureSpec.makeMeasureSpec:(II)I
      56: invokevirtual #124                // Method android/view/View.measure:(II)V
      59: goto          75
      62: aload_0
      63: getfield      #43                 // Field d:Landroid/view/View;
      66: iload_3
      67: iconst_0
      68: iconst_0
      69: invokestatic  #112                // Method android/view/View$MeasureSpec.makeMeasureSpec:(II)I
      72: invokevirtual #124                // Method android/view/View.measure:(II)V
      75: aload_0
      76: getfield      #43                 // Field d:Landroid/view/View;
      79: invokevirtual #90                 // Method android/view/View.getMeasuredHeight:()I
      82: istore_1
      83: iload_1
      84: iconst_0
      85: iadd
      86: istore_1
      87: goto          119
      90: aload_0
      91: getfield      #45                 // Field b:Landroid/graphics/drawable/Drawable;
      94: ifnull        117
      97: aload_0
      98: getfield      #27                 // Field a:Landroid/view/View;
     101: invokevirtual #60                 // Method android/view/View.getVisibility:()I
     104: bipush        8
     106: if_icmpeq     117
     109: aload_0
     110: getfield      #47                 // Field c:I
     113: istore_1
     114: goto          83
     117: iconst_0
     118: istore_1
     119: aload_0
     120: getfield      #27                 // Field a:Landroid/view/View;
     123: invokevirtual #116                // Method android/view/View.getLayoutParams:()Landroid/view/ViewGroup$LayoutParams;
     126: astore        4
     128: aload_0
     129: getfield      #27                 // Field a:Landroid/view/View;
     132: invokevirtual #60                 // Method android/view/View.getVisibility:()I
     135: bipush        8
     137: if_icmpne     157
     140: aload_0
     141: getfield      #27                 // Field a:Landroid/view/View;
     144: iload_3
     145: iconst_0
     146: ldc           #108                // int 1073741824
     148: invokestatic  #112                // Method android/view/View$MeasureSpec.makeMeasureSpec:(II)I
     151: invokevirtual #124                // Method android/view/View.measure:(II)V
     154: goto          214
     157: aload         4
     159: ifnull        191
     162: aload         4
     164: getfield      #121                // Field android/view/ViewGroup$LayoutParams.height:I
     167: iflt          191
     170: aload_0
     171: getfield      #27                 // Field a:Landroid/view/View;
     174: iload_3
     175: aload         4
     177: getfield      #121                // Field android/view/ViewGroup$LayoutParams.height:I
     180: ldc           #108                // int 1073741824
     182: invokestatic  #112                // Method android/view/View$MeasureSpec.makeMeasureSpec:(II)I
     185: invokevirtual #124                // Method android/view/View.measure:(II)V
     188: goto          204
     191: aload_0
     192: getfield      #27                 // Field a:Landroid/view/View;
     195: iload_3
     196: iconst_0
     197: iconst_0
     198: invokestatic  #112                // Method android/view/View$MeasureSpec.makeMeasureSpec:(II)I
     201: invokevirtual #124                // Method android/view/View.measure:(II)V
     204: iload_1
     205: aload_0
     206: getfield      #27                 // Field a:Landroid/view/View;
     209: invokevirtual #90                 // Method android/view/View.getMeasuredHeight:()I
     212: iadd
     213: istore_1
     214: aload_0
     215: iload_2
     216: iload_1
     217: invokevirtual #127                // Method setMeasuredDimension:(II)V
     220: return
}
