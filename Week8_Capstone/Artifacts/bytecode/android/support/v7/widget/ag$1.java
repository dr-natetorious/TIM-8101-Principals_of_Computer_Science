class android.support.v7.widget.ag$1 implements android.support.v7.widget.be$a {
  final android.support.v7.widget.ag a;

  android.support.v7.widget.ag$1(android.support.v7.widget.ag);
    Code:
       0: aload_0
       1: aload_1
       2: putfield      #16                 // Field a:Landroid/support/v7/widget/ag;
       5: aload_0
       6: invokespecial #18                 // Method java/lang/Object."<init>":()V
       9: return

  public void a(android.graphics.Canvas, android.graphics.RectF, float, android.graphics.Paint);
    Code:
       0: fconst_2
       1: fload_3
       2: fmul
       3: fstore        5
       5: aload_2
       6: invokevirtual #26                 // Method android/graphics/RectF.width:()F
       9: fload         5
      11: fsub
      12: fconst_1
      13: fsub
      14: fstore        6
      16: aload_2
      17: invokevirtual #29                 // Method android/graphics/RectF.height:()F
      20: fstore        7
      22: fload_3
      23: fconst_1
      24: fcmpl
      25: iflt          277
      28: fload_3
      29: ldc           #30                 // float 0.5f
      31: fadd
      32: fstore        8
      34: aload_0
      35: getfield      #16                 // Field a:Landroid/support/v7/widget/ag;
      38: invokestatic  #33                 // Method android/support/v7/widget/ag.a:(Landroid/support/v7/widget/ag;)Landroid/graphics/RectF;
      41: astore        11
      43: fload         8
      45: fneg
      46: fstore        9
      48: aload         11
      50: fload         9
      52: fload         9
      54: fload         8
      56: fload         8
      58: invokevirtual #37                 // Method android/graphics/RectF.set:(FFFF)V
      61: aload_1
      62: invokevirtual #43                 // Method android/graphics/Canvas.save:()I
      65: istore        10
      67: aload_1
      68: aload_2
      69: getfield      #47                 // Field android/graphics/RectF.left:F
      72: fload         8
      74: fadd
      75: aload_2
      76: getfield      #50                 // Field android/graphics/RectF.top:F
      79: fload         8
      81: fadd
      82: invokevirtual #54                 // Method android/graphics/Canvas.translate:(FF)V
      85: aload_1
      86: aload_0
      87: getfield      #16                 // Field a:Landroid/support/v7/widget/ag;
      90: invokestatic  #33                 // Method android/support/v7/widget/ag.a:(Landroid/support/v7/widget/ag;)Landroid/graphics/RectF;
      93: ldc           #55                 // float 180.0f
      95: ldc           #56                 // float 90.0f
      97: iconst_1
      98: aload         4
     100: invokevirtual #60                 // Method android/graphics/Canvas.drawArc:(Landroid/graphics/RectF;FFZLandroid/graphics/Paint;)V
     103: aload_1
     104: fload         6
     106: fconst_0
     107: invokevirtual #54                 // Method android/graphics/Canvas.translate:(FF)V
     110: aload_1
     111: ldc           #56                 // float 90.0f
     113: invokevirtual #64                 // Method android/graphics/Canvas.rotate:(F)V
     116: aload_1
     117: aload_0
     118: getfield      #16                 // Field a:Landroid/support/v7/widget/ag;
     121: invokestatic  #33                 // Method android/support/v7/widget/ag.a:(Landroid/support/v7/widget/ag;)Landroid/graphics/RectF;
     124: ldc           #55                 // float 180.0f
     126: ldc           #56                 // float 90.0f
     128: iconst_1
     129: aload         4
     131: invokevirtual #60                 // Method android/graphics/Canvas.drawArc:(Landroid/graphics/RectF;FFZLandroid/graphics/Paint;)V
     134: aload_1
     135: fload         7
     137: fload         5
     139: fsub
     140: fconst_1
     141: fsub
     142: fconst_0
     143: invokevirtual #54                 // Method android/graphics/Canvas.translate:(FF)V
     146: aload_1
     147: ldc           #56                 // float 90.0f
     149: invokevirtual #64                 // Method android/graphics/Canvas.rotate:(F)V
     152: aload_1
     153: aload_0
     154: getfield      #16                 // Field a:Landroid/support/v7/widget/ag;
     157: invokestatic  #33                 // Method android/support/v7/widget/ag.a:(Landroid/support/v7/widget/ag;)Landroid/graphics/RectF;
     160: ldc           #55                 // float 180.0f
     162: ldc           #56                 // float 90.0f
     164: iconst_1
     165: aload         4
     167: invokevirtual #60                 // Method android/graphics/Canvas.drawArc:(Landroid/graphics/RectF;FFZLandroid/graphics/Paint;)V
     170: aload_1
     171: fload         6
     173: fconst_0
     174: invokevirtual #54                 // Method android/graphics/Canvas.translate:(FF)V
     177: aload_1
     178: ldc           #56                 // float 90.0f
     180: invokevirtual #64                 // Method android/graphics/Canvas.rotate:(F)V
     183: aload_1
     184: aload_0
     185: getfield      #16                 // Field a:Landroid/support/v7/widget/ag;
     188: invokestatic  #33                 // Method android/support/v7/widget/ag.a:(Landroid/support/v7/widget/ag;)Landroid/graphics/RectF;
     191: ldc           #55                 // float 180.0f
     193: ldc           #56                 // float 90.0f
     195: iconst_1
     196: aload         4
     198: invokevirtual #60                 // Method android/graphics/Canvas.drawArc:(Landroid/graphics/RectF;FFZLandroid/graphics/Paint;)V
     201: aload_1
     202: iload         10
     204: invokevirtual #68                 // Method android/graphics/Canvas.restoreToCount:(I)V
     207: aload_1
     208: aload_2
     209: getfield      #47                 // Field android/graphics/RectF.left:F
     212: fload         8
     214: fadd
     215: fconst_1
     216: fsub
     217: aload_2
     218: getfield      #50                 // Field android/graphics/RectF.top:F
     221: aload_2
     222: getfield      #71                 // Field android/graphics/RectF.right:F
     225: fload         8
     227: fsub
     228: fconst_1
     229: fadd
     230: aload_2
     231: getfield      #50                 // Field android/graphics/RectF.top:F
     234: fload         8
     236: fadd
     237: aload         4
     239: invokevirtual #75                 // Method android/graphics/Canvas.drawRect:(FFFFLandroid/graphics/Paint;)V
     242: aload_1
     243: aload_2
     244: getfield      #47                 // Field android/graphics/RectF.left:F
     247: fload         8
     249: fadd
     250: fconst_1
     251: fsub
     252: aload_2
     253: getfield      #78                 // Field android/graphics/RectF.bottom:F
     256: fload         8
     258: fsub
     259: aload_2
     260: getfield      #71                 // Field android/graphics/RectF.right:F
     263: fload         8
     265: fsub
     266: fconst_1
     267: fadd
     268: aload_2
     269: getfield      #78                 // Field android/graphics/RectF.bottom:F
     272: aload         4
     274: invokevirtual #75                 // Method android/graphics/Canvas.drawRect:(FFFFLandroid/graphics/Paint;)V
     277: aload_1
     278: aload_2
     279: getfield      #47                 // Field android/graphics/RectF.left:F
     282: aload_2
     283: getfield      #50                 // Field android/graphics/RectF.top:F
     286: fload_3
     287: fadd
     288: aload_2
     289: getfield      #71                 // Field android/graphics/RectF.right:F
     292: aload_2
     293: getfield      #78                 // Field android/graphics/RectF.bottom:F
     296: fload_3
     297: fsub
     298: aload         4
     300: invokevirtual #75                 // Method android/graphics/Canvas.drawRect:(FFFFLandroid/graphics/Paint;)V
     303: return
}
