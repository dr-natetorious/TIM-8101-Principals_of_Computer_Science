abstract class android.support.design.widget.h extends android.support.design.widget.n<android.view.View> {
  final android.graphics.Rect a;

  final android.graphics.Rect b;

  public android.support.design.widget.h();
    Code:
       0: aload_0
       1: invokespecial #15                 // Method android/support/design/widget/n."<init>":()V
       4: aload_0
       5: new           #17                 // class android/graphics/Rect
       8: dup
       9: invokespecial #18                 // Method android/graphics/Rect."<init>":()V
      12: putfield      #20                 // Field a:Landroid/graphics/Rect;
      15: aload_0
      16: new           #17                 // class android/graphics/Rect
      19: dup
      20: invokespecial #18                 // Method android/graphics/Rect."<init>":()V
      23: putfield      #22                 // Field b:Landroid/graphics/Rect;
      26: aload_0
      27: iconst_0
      28: putfield      #24                 // Field c:I
      31: return

  public android.support.design.widget.h(android.content.Context, android.util.AttributeSet);
    Code:
       0: aload_0
       1: aload_1
       2: aload_2
       3: invokespecial #28                 // Method android/support/design/widget/n."<init>":(Landroid/content/Context;Landroid/util/AttributeSet;)V
       6: aload_0
       7: new           #17                 // class android/graphics/Rect
      10: dup
      11: invokespecial #18                 // Method android/graphics/Rect."<init>":()V
      14: putfield      #20                 // Field a:Landroid/graphics/Rect;
      17: aload_0
      18: new           #17                 // class android/graphics/Rect
      21: dup
      22: invokespecial #18                 // Method android/graphics/Rect."<init>":()V
      25: putfield      #22                 // Field b:Landroid/graphics/Rect;
      28: aload_0
      29: iconst_0
      30: putfield      #24                 // Field c:I
      33: return

  float a(android.view.View);
    Code:
       0: fconst_1
       1: freturn

  final int a();
    Code:
       0: aload_0
       1: getfield      #24                 // Field c:I
       4: ireturn

  public boolean a(android.support.design.widget.CoordinatorLayout, android.view.View, int, int, int, int);
    Code:
       0: aload_2
       1: invokevirtual #39                 // Method android/view/View.getLayoutParams:()Landroid/view/ViewGroup$LayoutParams;
       4: getfield      #44                 // Field android/view/ViewGroup$LayoutParams.height:I
       7: istore        8
       9: iload         8
      11: iconst_m1
      12: if_icmpeq     22
      15: iload         8
      17: bipush        -2
      19: if_icmpne     156
      22: aload_0
      23: aload_1
      24: aload_2
      25: invokevirtual #49                 // Method android/support/design/widget/CoordinatorLayout.c:(Landroid/view/View;)Ljava/util/List;
      28: invokevirtual #52                 // Method b:(Ljava/util/List;)Landroid/view/View;
      31: astore        12
      33: aload         12
      35: ifnull        156
      38: aload         12
      40: invokestatic  #58                 // Method android/support/v4/view/s.p:(Landroid/view/View;)Z
      43: ifeq          77
      46: aload_2
      47: invokestatic  #58                 // Method android/support/v4/view/s.p:(Landroid/view/View;)Z
      50: ifne          77
      53: aload_2
      54: astore        11
      56: aload         11
      58: iconst_1
      59: invokestatic  #61                 // Method android/support/v4/view/s.b:(Landroid/view/View;Z)V
      62: aload         11
      64: invokestatic  #58                 // Method android/support/v4/view/s.p:(Landroid/view/View;)Z
      67: ifeq          77
      70: aload         11
      72: invokevirtual #64                 // Method android/view/View.requestLayout:()V
      75: iconst_1
      76: ireturn
      77: iload         5
      79: invokestatic  #69                 // Method android/view/View$MeasureSpec.getSize:(I)I
      82: istore        7
      84: iload         7
      86: istore        5
      88: iload         7
      90: ifne          99
      93: aload_1
      94: invokevirtual #72                 // Method android/support/design/widget/CoordinatorLayout.getHeight:()I
      97: istore        5
      99: aload         12
     101: invokevirtual #75                 // Method android/view/View.getMeasuredHeight:()I
     104: istore        9
     106: aload_0
     107: aload         12
     109: invokevirtual #78                 // Method b:(Landroid/view/View;)I
     112: istore        10
     114: iload         8
     116: iconst_m1
     117: if_icmpne     127
     120: ldc           #79                 // int 1073741824
     122: istore        7
     124: goto          131
     127: ldc           #80                 // int -2147483648
     129: istore        7
     131: aload_1
     132: aload_2
     133: iload_3
     134: iload         4
     136: iload         5
     138: iload         9
     140: isub
     141: iload         10
     143: iadd
     144: iload         7
     146: invokestatic  #84                 // Method android/view/View$MeasureSpec.makeMeasureSpec:(II)I
     149: iload         6
     151: invokevirtual #87                 // Method android/support/design/widget/CoordinatorLayout.a:(Landroid/view/View;IIII)V
     154: iconst_1
     155: ireturn
     156: iconst_0
     157: ireturn

  int b(android.view.View);
    Code:
       0: aload_1
       1: invokevirtual #75                 // Method android/view/View.getMeasuredHeight:()I
       4: ireturn

  abstract android.view.View b(java.util.List<android.view.View>);

  public final void b(int);
    Code:
       0: aload_0
       1: iload_1
       2: putfield      #90                 // Field d:I
       5: return

  protected void b(android.support.design.widget.CoordinatorLayout, android.view.View, int);
    Code:
       0: aload_0
       1: aload_1
       2: aload_2
       3: invokevirtual #49                 // Method android/support/design/widget/CoordinatorLayout.c:(Landroid/view/View;)Ljava/util/List;
       6: invokevirtual #52                 // Method b:(Ljava/util/List;)Landroid/view/View;
       9: astore        4
      11: aload         4
      13: ifnull        223
      16: aload_2
      17: invokevirtual #39                 // Method android/view/View.getLayoutParams:()Landroid/view/ViewGroup$LayoutParams;
      20: checkcast     #93                 // class android/support/design/widget/CoordinatorLayout$e
      23: astore        5
      25: aload_0
      26: getfield      #20                 // Field a:Landroid/graphics/Rect;
      29: astore        6
      31: aload         6
      33: aload_1
      34: invokevirtual #96                 // Method android/support/design/widget/CoordinatorLayout.getPaddingLeft:()I
      37: aload         5
      39: getfield      #99                 // Field android/support/design/widget/CoordinatorLayout$e.leftMargin:I
      42: iadd
      43: aload         4
      45: invokevirtual #102                // Method android/view/View.getBottom:()I
      48: aload         5
      50: getfield      #105                // Field android/support/design/widget/CoordinatorLayout$e.topMargin:I
      53: iadd
      54: aload_1
      55: invokevirtual #108                // Method android/support/design/widget/CoordinatorLayout.getWidth:()I
      58: aload_1
      59: invokevirtual #111                // Method android/support/design/widget/CoordinatorLayout.getPaddingRight:()I
      62: isub
      63: aload         5
      65: getfield      #114                // Field android/support/design/widget/CoordinatorLayout$e.rightMargin:I
      68: isub
      69: aload_1
      70: invokevirtual #72                 // Method android/support/design/widget/CoordinatorLayout.getHeight:()I
      73: aload         4
      75: invokevirtual #102                // Method android/view/View.getBottom:()I
      78: iadd
      79: aload_1
      80: invokevirtual #117                // Method android/support/design/widget/CoordinatorLayout.getPaddingBottom:()I
      83: isub
      84: aload         5
      86: getfield      #120                // Field android/support/design/widget/CoordinatorLayout$e.bottomMargin:I
      89: isub
      90: invokevirtual #124                // Method android/graphics/Rect.set:(IIII)V
      93: aload_1
      94: invokevirtual #128                // Method android/support/design/widget/CoordinatorLayout.getLastWindowInsets:()Landroid/support/v4/view/ab;
      97: astore        7
      99: aload         7
     101: ifnull        150
     104: aload_1
     105: invokestatic  #58                 // Method android/support/v4/view/s.p:(Landroid/view/View;)Z
     108: ifeq          150
     111: aload_2
     112: invokestatic  #58                 // Method android/support/v4/view/s.p:(Landroid/view/View;)Z
     115: ifne          150
     118: aload         6
     120: aload         6
     122: getfield      #131                // Field android/graphics/Rect.left:I
     125: aload         7
     127: invokevirtual #135                // Method android/support/v4/view/ab.a:()I
     130: iadd
     131: putfield      #131                // Field android/graphics/Rect.left:I
     134: aload         6
     136: aload         6
     138: getfield      #138                // Field android/graphics/Rect.right:I
     141: aload         7
     143: invokevirtual #140                // Method android/support/v4/view/ab.c:()I
     146: isub
     147: putfield      #138                // Field android/graphics/Rect.right:I
     150: aload_0
     151: getfield      #22                 // Field b:Landroid/graphics/Rect;
     154: astore_1
     155: aload         5
     157: getfield      #141                // Field android/support/design/widget/CoordinatorLayout$e.c:I
     160: invokestatic  #143                // Method c:(I)I
     163: aload_2
     164: invokevirtual #146                // Method android/view/View.getMeasuredWidth:()I
     167: aload_2
     168: invokevirtual #75                 // Method android/view/View.getMeasuredHeight:()I
     171: aload         6
     173: aload_1
     174: iload_3
     175: invokestatic  #151                // Method android/support/v4/view/e.a:(IIILandroid/graphics/Rect;Landroid/graphics/Rect;I)V
     178: aload_0
     179: aload         4
     181: invokevirtual #153                // Method c:(Landroid/view/View;)I
     184: istore_3
     185: aload_2
     186: aload_1
     187: getfield      #131                // Field android/graphics/Rect.left:I
     190: aload_1
     191: getfield      #156                // Field android/graphics/Rect.top:I
     194: iload_3
     195: isub
     196: aload_1
     197: getfield      #138                // Field android/graphics/Rect.right:I
     200: aload_1
     201: getfield      #159                // Field android/graphics/Rect.bottom:I
     204: iload_3
     205: isub
     206: invokevirtual #162                // Method android/view/View.layout:(IIII)V
     209: aload_1
     210: getfield      #156                // Field android/graphics/Rect.top:I
     213: aload         4
     215: invokevirtual #102                // Method android/view/View.getBottom:()I
     218: isub
     219: istore_3
     220: goto          232
     223: aload_0
     224: aload_1
     225: aload_2
     226: iload_3
     227: invokespecial #164                // Method android/support/design/widget/n.b:(Landroid/support/design/widget/CoordinatorLayout;Landroid/view/View;I)V
     230: iconst_0
     231: istore_3
     232: aload_0
     233: iload_3
     234: putfield      #24                 // Field c:I
     237: return

  final int c(android.view.View);
    Code:
       0: aload_0
       1: getfield      #90                 // Field d:I
       4: ifne          9
       7: iconst_0
       8: ireturn
       9: aload_0
      10: aload_1
      11: invokevirtual #166                // Method a:(Landroid/view/View;)F
      14: aload_0
      15: getfield      #90                 // Field d:I
      18: i2f
      19: fmul
      20: f2i
      21: iconst_0
      22: aload_0
      23: getfield      #90                 // Field d:I
      26: invokestatic  #171                // Method android/support/v4/d/a.a:(III)I
      29: ireturn

  public final int d();
    Code:
       0: aload_0
       1: getfield      #90                 // Field d:I
       4: ireturn
}
