public class android.support.v7.widget.ay$a extends android.support.v7.widget.ap {
  final int a;

  final int b;

  public android.support.v7.widget.ay$a(android.content.Context, boolean);
    Code:
       0: aload_0
       1: aload_1
       2: iload_2
       3: invokespecial #17                 // Method android/support/v7/widget/ap."<init>":(Landroid/content/Context;Z)V
       6: aload_1
       7: invokevirtual #23                 // Method android/content/Context.getResources:()Landroid/content/res/Resources;
      10: invokevirtual #29                 // Method android/content/res/Resources.getConfiguration:()Landroid/content/res/Configuration;
      13: astore_1
      14: getstatic     #34                 // Field android/os/Build$VERSION.SDK_INT:I
      17: bipush        17
      19: if_icmplt     43
      22: iconst_1
      23: aload_1
      24: invokevirtual #40                 // Method android/content/res/Configuration.getLayoutDirection:()I
      27: if_icmpne     43
      30: aload_0
      31: bipush        21
      33: putfield      #42                 // Field a:I
      36: aload_0
      37: bipush        22
      39: putfield      #44                 // Field b:I
      42: return
      43: aload_0
      44: bipush        22
      46: putfield      #42                 // Field a:I
      49: aload_0
      50: bipush        21
      52: putfield      #44                 // Field b:I
      55: return

  public int a(int, int, int, int, int);
    Code:
       0: aload_0
       1: iload_1
       2: iload_2
       3: iload_3
       4: iload         4
       6: iload         5
       8: invokespecial #48                 // Method android/support/v7/widget/ap.a:(IIIII)I
      11: ireturn

  public boolean a(android.view.MotionEvent, int);
    Code:
       0: aload_0
       1: aload_1
       2: iload_2
       3: invokespecial #51                 // Method android/support/v7/widget/ap.a:(Landroid/view/MotionEvent;I)Z
       6: ireturn

  public boolean hasFocus();
    Code:
       0: aload_0
       1: invokespecial #55                 // Method android/support/v7/widget/ap.hasFocus:()Z
       4: ireturn

  public boolean hasWindowFocus();
    Code:
       0: aload_0
       1: invokespecial #58                 // Method android/support/v7/widget/ap.hasWindowFocus:()Z
       4: ireturn

  public boolean isFocused();
    Code:
       0: aload_0
       1: invokespecial #61                 // Method android/support/v7/widget/ap.isFocused:()Z
       4: ireturn

  public boolean isInTouchMode();
    Code:
       0: aload_0
       1: invokespecial #64                 // Method android/support/v7/widget/ap.isInTouchMode:()Z
       4: ireturn

  public boolean onHoverEvent(android.view.MotionEvent);
    Code:
       0: aload_0
       1: getfield      #68                 // Field c:Landroid/support/v7/widget/ax;
       4: ifnull        191
       7: aload_0
       8: invokevirtual #72                 // Method getAdapter:()Landroid/widget/ListAdapter;
      11: astore        4
      13: aload         4
      15: instanceof    #74                 // class android/widget/HeaderViewListAdapter
      18: ifeq          51
      21: aload         4
      23: checkcast     #74                 // class android/widget/HeaderViewListAdapter
      26: astore        4
      28: aload         4
      30: invokevirtual #77                 // Method android/widget/HeaderViewListAdapter.getHeadersCount:()I
      33: istore_2
      34: aload         4
      36: invokevirtual #80                 // Method android/widget/HeaderViewListAdapter.getWrappedAdapter:()Landroid/widget/ListAdapter;
      39: astore        4
      41: aload         4
      43: checkcast     #82                 // class android/support/v7/view/menu/g
      46: astore        6
      48: goto          56
      51: iconst_0
      52: istore_2
      53: goto          41
      56: aconst_null
      57: astore        5
      59: aload         5
      61: astore        4
      63: aload_1
      64: invokevirtual #87                 // Method android/view/MotionEvent.getAction:()I
      67: bipush        10
      69: if_icmpeq     129
      72: aload_0
      73: aload_1
      74: invokevirtual #91                 // Method android/view/MotionEvent.getX:()F
      77: f2i
      78: aload_1
      79: invokevirtual #94                 // Method android/view/MotionEvent.getY:()F
      82: f2i
      83: invokevirtual #98                 // Method pointToPosition:(II)I
      86: istore_3
      87: aload         5
      89: astore        4
      91: iload_3
      92: iconst_m1
      93: if_icmpeq     129
      96: iload_3
      97: iload_2
      98: isub
      99: istore_2
     100: aload         5
     102: astore        4
     104: iload_2
     105: iflt          129
     108: aload         5
     110: astore        4
     112: iload_2
     113: aload         6
     115: invokevirtual #101                // Method android/support/v7/view/menu/g.getCount:()I
     118: if_icmpge     129
     121: aload         6
     123: iload_2
     124: invokevirtual #104                // Method android/support/v7/view/menu/g.a:(I)Landroid/support/v7/view/menu/j;
     127: astore        4
     129: aload_0
     130: getfield      #106                // Field d:Landroid/view/MenuItem;
     133: astore        5
     135: aload         5
     137: aload         4
     139: if_acmpeq     191
     142: aload         6
     144: invokevirtual #109                // Method android/support/v7/view/menu/g.a:()Landroid/support/v7/view/menu/h;
     147: astore        6
     149: aload         5
     151: ifnull        167
     154: aload_0
     155: getfield      #68                 // Field c:Landroid/support/v7/widget/ax;
     158: aload         6
     160: aload         5
     162: invokeinterface #114,  3          // InterfaceMethod android/support/v7/widget/ax.a:(Landroid/support/v7/view/menu/h;Landroid/view/MenuItem;)V
     167: aload_0
     168: aload         4
     170: putfield      #106                // Field d:Landroid/view/MenuItem;
     173: aload         4
     175: ifnull        191
     178: aload_0
     179: getfield      #68                 // Field c:Landroid/support/v7/widget/ax;
     182: aload         6
     184: aload         4
     186: invokeinterface #116,  3          // InterfaceMethod android/support/v7/widget/ax.b:(Landroid/support/v7/view/menu/h;Landroid/view/MenuItem;)V
     191: aload_0
     192: aload_1
     193: invokespecial #118                // Method android/support/v7/widget/ap.onHoverEvent:(Landroid/view/MotionEvent;)Z
     196: ireturn

  public boolean onKeyDown(int, android.view.KeyEvent);
    Code:
       0: aload_0
       1: invokevirtual #124                // Method getSelectedView:()Landroid/view/View;
       4: checkcast     #126                // class android/support/v7/view/menu/ListMenuItemView
       7: astore_3
       8: aload_3
       9: ifnull        53
      12: iload_1
      13: aload_0
      14: getfield      #42                 // Field a:I
      17: if_icmpne     53
      20: aload_3
      21: invokevirtual #129                // Method android/support/v7/view/menu/ListMenuItemView.isEnabled:()Z
      24: ifeq          51
      27: aload_3
      28: invokevirtual #133                // Method android/support/v7/view/menu/ListMenuItemView.getItemData:()Landroid/support/v7/view/menu/j;
      31: invokevirtual #138                // Method android/support/v7/view/menu/j.hasSubMenu:()Z
      34: ifeq          51
      37: aload_0
      38: aload_3
      39: aload_0
      40: invokevirtual #141                // Method getSelectedItemPosition:()I
      43: aload_0
      44: invokevirtual #145                // Method getSelectedItemId:()J
      47: invokevirtual #149                // Method performItemClick:(Landroid/view/View;IJ)Z
      50: pop
      51: iconst_1
      52: ireturn
      53: aload_3
      54: ifnull        86
      57: iload_1
      58: aload_0
      59: getfield      #44                 // Field b:I
      62: if_icmpne     86
      65: aload_0
      66: iconst_m1
      67: invokevirtual #153                // Method setSelection:(I)V
      70: aload_0
      71: invokevirtual #72                 // Method getAdapter:()Landroid/widget/ListAdapter;
      74: checkcast     #82                 // class android/support/v7/view/menu/g
      77: invokevirtual #109                // Method android/support/v7/view/menu/g.a:()Landroid/support/v7/view/menu/h;
      80: iconst_0
      81: invokevirtual #158                // Method android/support/v7/view/menu/h.b:(Z)V
      84: iconst_1
      85: ireturn
      86: aload_0
      87: iload_1
      88: aload_2
      89: invokespecial #160                // Method android/support/v7/widget/ap.onKeyDown:(ILandroid/view/KeyEvent;)Z
      92: ireturn

  public boolean onTouchEvent(android.view.MotionEvent);
    Code:
       0: aload_0
       1: aload_1
       2: invokespecial #163                // Method android/support/v7/widget/ap.onTouchEvent:(Landroid/view/MotionEvent;)Z
       5: ireturn

  public void setHoverListener(android.support.v7.widget.ax);
    Code:
       0: aload_0
       1: aload_1
       2: putfield      #68                 // Field c:Landroid/support/v7/widget/ax;
       5: return

  public void setSelector(android.graphics.drawable.Drawable);
    Code:
       0: aload_0
       1: aload_1
       2: invokespecial #169                // Method android/support/v7/widget/ap.setSelector:(Landroid/graphics/drawable/Drawable;)V
       5: return
}
