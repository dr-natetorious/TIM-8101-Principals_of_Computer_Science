class android.support.v7.widget.SearchView$f extends android.view.TouchDelegate {
  public android.support.v7.widget.SearchView$f(android.graphics.Rect, android.graphics.Rect, android.view.View);
    Code:
       0: aload_0
       1: aload_1
       2: aload_3
       3: invokespecial #21                 // Method android/view/TouchDelegate."<init>":(Landroid/graphics/Rect;Landroid/view/View;)V
       6: aload_0
       7: aload_3
       8: invokevirtual #27                 // Method android/view/View.getContext:()Landroid/content/Context;
      11: invokestatic  #33                 // Method android/view/ViewConfiguration.get:(Landroid/content/Context;)Landroid/view/ViewConfiguration;
      14: invokevirtual #37                 // Method android/view/ViewConfiguration.getScaledTouchSlop:()I
      17: putfield      #39                 // Field e:I
      20: aload_0
      21: new           #41                 // class android/graphics/Rect
      24: dup
      25: invokespecial #44                 // Method android/graphics/Rect."<init>":()V
      28: putfield      #46                 // Field b:Landroid/graphics/Rect;
      31: aload_0
      32: new           #41                 // class android/graphics/Rect
      35: dup
      36: invokespecial #44                 // Method android/graphics/Rect."<init>":()V
      39: putfield      #48                 // Field d:Landroid/graphics/Rect;
      42: aload_0
      43: new           #41                 // class android/graphics/Rect
      46: dup
      47: invokespecial #44                 // Method android/graphics/Rect."<init>":()V
      50: putfield      #50                 // Field c:Landroid/graphics/Rect;
      53: aload_0
      54: aload_1
      55: aload_2
      56: invokevirtual #53                 // Method a:(Landroid/graphics/Rect;Landroid/graphics/Rect;)V
      59: aload_0
      60: aload_3
      61: putfield      #55                 // Field a:Landroid/view/View;
      64: return

  public void a(android.graphics.Rect, android.graphics.Rect);
    Code:
       0: aload_0
       1: getfield      #46                 // Field b:Landroid/graphics/Rect;
       4: aload_1
       5: invokevirtual #60                 // Method android/graphics/Rect.set:(Landroid/graphics/Rect;)V
       8: aload_0
       9: getfield      #48                 // Field d:Landroid/graphics/Rect;
      12: aload_1
      13: invokevirtual #60                 // Method android/graphics/Rect.set:(Landroid/graphics/Rect;)V
      16: aload_0
      17: getfield      #48                 // Field d:Landroid/graphics/Rect;
      20: aload_0
      21: getfield      #39                 // Field e:I
      24: ineg
      25: aload_0
      26: getfield      #39                 // Field e:I
      29: ineg
      30: invokevirtual #64                 // Method android/graphics/Rect.inset:(II)V
      33: aload_0
      34: getfield      #50                 // Field c:Landroid/graphics/Rect;
      37: aload_2
      38: invokevirtual #60                 // Method android/graphics/Rect.set:(Landroid/graphics/Rect;)V
      41: return

  public boolean onTouchEvent(android.view.MotionEvent);
    Code:
       0: aload_1
       1: invokevirtual #72                 // Method android/view/MotionEvent.getX:()F
       4: f2i
       5: istore        5
       7: aload_1
       8: invokevirtual #75                 // Method android/view/MotionEvent.getY:()F
      11: f2i
      12: istore        6
      14: aload_1
      15: invokevirtual #78                 // Method android/view/MotionEvent.getAction:()I
      18: istore_3
      19: iconst_1
      20: istore        4
      22: iconst_0
      23: istore        8
      25: iload_3
      26: tableswitch   { // 0 to 3
                     0: 124
                     1: 76
                     2: 76
                     3: 59
               default: 56
          }
      56: goto          152
      59: aload_0
      60: getfield      #80                 // Field f:Z
      63: istore        7
      65: aload_0
      66: iconst_0
      67: putfield      #80                 // Field f:Z
      70: iload         4
      72: istore_3
      73: goto          158
      76: aload_0
      77: getfield      #80                 // Field f:Z
      80: istore        9
      82: iload         9
      84: istore        7
      86: iload         4
      88: istore_3
      89: iload         9
      91: ifeq          158
      94: iload         9
      96: istore        7
      98: iload         4
     100: istore_3
     101: aload_0
     102: getfield      #48                 // Field d:Landroid/graphics/Rect;
     105: iload         5
     107: iload         6
     109: invokevirtual #84                 // Method android/graphics/Rect.contains:(II)Z
     112: ifne          158
     115: iconst_0
     116: istore_3
     117: iload         9
     119: istore        7
     121: goto          158
     124: aload_0
     125: getfield      #46                 // Field b:Landroid/graphics/Rect;
     128: iload         5
     130: iload         6
     132: invokevirtual #84                 // Method android/graphics/Rect.contains:(II)Z
     135: ifeq          152
     138: aload_0
     139: iconst_1
     140: putfield      #80                 // Field f:Z
     143: iconst_1
     144: istore        7
     146: iload         4
     148: istore_3
     149: goto          158
     152: iconst_0
     153: istore        7
     155: iload         4
     157: istore_3
     158: iload         7
     160: ifeq          245
     163: iload_3
     164: ifeq          205
     167: aload_0
     168: getfield      #50                 // Field c:Landroid/graphics/Rect;
     171: iload         5
     173: iload         6
     175: invokevirtual #84                 // Method android/graphics/Rect.contains:(II)Z
     178: ifne          205
     181: aload_0
     182: getfield      #55                 // Field a:Landroid/view/View;
     185: invokevirtual #87                 // Method android/view/View.getWidth:()I
     188: iconst_2
     189: idiv
     190: i2f
     191: fstore_2
     192: aload_0
     193: getfield      #55                 // Field a:Landroid/view/View;
     196: invokevirtual #90                 // Method android/view/View.getHeight:()I
     199: iconst_2
     200: idiv
     201: istore_3
     202: goto          228
     205: iload         5
     207: aload_0
     208: getfield      #50                 // Field c:Landroid/graphics/Rect;
     211: getfield      #93                 // Field android/graphics/Rect.left:I
     214: isub
     215: i2f
     216: fstore_2
     217: iload         6
     219: aload_0
     220: getfield      #50                 // Field c:Landroid/graphics/Rect;
     223: getfield      #96                 // Field android/graphics/Rect.top:I
     226: isub
     227: istore_3
     228: aload_1
     229: fload_2
     230: iload_3
     231: i2f
     232: invokevirtual #100                // Method android/view/MotionEvent.setLocation:(FF)V
     235: aload_0
     236: getfield      #55                 // Field a:Landroid/view/View;
     239: aload_1
     240: invokevirtual #103                // Method android/view/View.dispatchTouchEvent:(Landroid/view/MotionEvent;)Z
     243: istore        8
     245: iload         8
     247: ireturn
}
