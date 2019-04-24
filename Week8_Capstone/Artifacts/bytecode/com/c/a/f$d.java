final class com.c.a.f$d extends android.view.ScaleGestureDetector$SimpleOnScaleGestureListener {
  final com.c.a.f a;

  public com.c.a.f$d();
    Code:
       0: aload_0
       1: aload_1
       2: putfield      #16                 // Field a:Lcom/c/a/f;
       5: aload_0
       6: invokespecial #19                 // Method android/view/ScaleGestureDetector$SimpleOnScaleGestureListener."<init>":()V
       9: aload_0
      10: new           #21                 // class com/c/a/a
      13: dup
      14: getstatic     #26                 // Field a/b/b/b.a:La/b/b/b;
      17: invokevirtual #29                 // Method a/b/b/b.a:()F
      20: getstatic     #26                 // Field a/b/b/b.a:La/b/b/b;
      23: invokevirtual #29                 // Method a/b/b/b.a:()F
      26: invokespecial #32                 // Method com/c/a/a."<init>":(FF)V
      29: putfield      #34                 // Field b:Lcom/c/a/a;
      32: aload_0
      33: new           #21                 // class com/c/a/a
      36: dup
      37: fconst_0
      38: fconst_0
      39: invokespecial #32                 // Method com/c/a/a."<init>":(FF)V
      42: putfield      #36                 // Field c:Lcom/c/a/a;
      45: return

  public boolean onScale(android.view.ScaleGestureDetector);
    Code:
       0: aload_1
       1: ldc           #77                 // String detector
       3: invokestatic  #82                 // Method a/b/b/c.b:(Ljava/lang/Object;Ljava/lang/String;)V
       6: aload_0
       7: getfield      #16                 // Field a:Lcom/c/a/f;
      10: invokestatic  #85                 // Method com/c/a/f.a:(Lcom/c/a/f;)Z
      13: ifne          18
      16: iconst_0
      17: ireturn
      18: aload_0
      19: getfield      #16                 // Field a:Lcom/c/a/f;
      22: iconst_2
      23: invokestatic  #88                 // Method com/c/a/f.a:(Lcom/c/a/f;I)Z
      26: ifeq          195
      29: aload_0
      30: getfield      #16                 // Field a:Lcom/c/a/f;
      33: aload_1
      34: invokevirtual #93                 // Method android/view/ScaleGestureDetector.getFocusX:()F
      37: aload_1
      38: invokevirtual #96                 // Method android/view/ScaleGestureDetector.getFocusY:()F
      41: invokestatic  #99                 // Method com/c/a/f.a:(Lcom/c/a/f;FF)Lcom/c/a/a;
      44: astore        4
      46: aload_0
      47: getfield      #34                 // Field b:Lcom/c/a/a;
      50: invokevirtual #51                 // Method com/c/a/a.a:()F
      53: invokestatic  #103                // Method java/lang/Float.isNaN:(F)Z
      56: ifeq          103
      59: aload_0
      60: getfield      #34                 // Field b:Lcom/c/a/a;
      63: aload         4
      65: invokevirtual #106                // Method com/c/a/a.a:(Lcom/c/a/a;)V
      68: invokestatic  #109                // Method com/c/a/f.k:()Lcom/c/a/h;
      71: iconst_4
      72: anewarray     #111                // class java/lang/Object
      75: dup
      76: iconst_0
      77: ldc           #113                // String onScale:
      79: aastore
      80: dup
      81: iconst_1
      82: ldc           #115                // String Setting initial focus.
      84: aastore
      85: dup
      86: iconst_2
      87: ldc           #117                // String absTarget:
      89: aastore
      90: dup
      91: iconst_3
      92: aload_0
      93: getfield      #34                 // Field b:Lcom/c/a/a;
      96: aastore
      97: invokevirtual #122                // Method com/c/a/h.b:([Ljava/lang/Object;)V
     100: goto          119
     103: aload_0
     104: getfield      #36                 // Field c:Lcom/c/a/a;
     107: aload_0
     108: getfield      #34                 // Field b:Lcom/c/a/a;
     111: aload         4
     113: invokevirtual #125                // Method com/c/a/a.b:(Lcom/c/a/a;)Lcom/c/a/a;
     116: invokevirtual #106                // Method com/c/a/a.a:(Lcom/c/a/a;)V
     119: aload_1
     120: invokevirtual #128                // Method android/view/ScaleGestureDetector.getScaleFactor:()F
     123: fstore_2
     124: aload_0
     125: getfield      #16                 // Field a:Lcom/c/a/f;
     128: invokevirtual #40                 // Method com/c/a/f.a:()F
     131: fstore_3
     132: aload_0
     133: getfield      #16                 // Field a:Lcom/c/a/f;
     136: fload_3
     137: fload_2
     138: fmul
     139: aload_0
     140: getfield      #16                 // Field a:Lcom/c/a/f;
     143: invokevirtual #131                // Method com/c/a/f.e:()F
     146: aload_0
     147: getfield      #36                 // Field c:Lcom/c/a/a;
     150: invokevirtual #51                 // Method com/c/a/a.a:()F
     153: fadd
     154: aload_0
     155: getfield      #16                 // Field a:Lcom/c/a/f;
     158: invokevirtual #134                // Method com/c/a/f.f:()F
     161: aload_0
     162: getfield      #36                 // Field c:Lcom/c/a/a;
     165: invokevirtual #56                 // Method com/c/a/a.b:()F
     168: fadd
     169: iconst_1
     170: iconst_1
     171: aload_1
     172: invokevirtual #93                 // Method android/view/ScaleGestureDetector.getFocusX:()F
     175: invokestatic  #68                 // Method java/lang/Float.valueOf:(F)Ljava/lang/Float;
     178: aload_1
     179: invokevirtual #96                 // Method android/view/ScaleGestureDetector.getFocusY:()F
     182: invokestatic  #68                 // Method java/lang/Float.valueOf:(F)Ljava/lang/Float;
     185: iconst_0
     186: sipush        128
     189: aconst_null
     190: invokestatic  #137                // Method com/c/a/f.a:(Lcom/c/a/f;FFFZZLjava/lang/Float;Ljava/lang/Float;ZILjava/lang/Object;)V
     193: iconst_1
     194: ireturn
     195: iconst_0
     196: ireturn

  public boolean onScaleBegin(android.view.ScaleGestureDetector);
    Code:
       0: aload_1
       1: ldc           #77                 // String detector
       3: invokestatic  #82                 // Method a/b/b/c.b:(Ljava/lang/Object;Ljava/lang/String;)V
       6: iconst_1
       7: ireturn

  public void onScaleEnd(android.view.ScaleGestureDetector);
    Code:
       0: aload_1
       1: ldc           #77                 // String detector
       3: invokestatic  #82                 // Method a/b/b/c.b:(Ljava/lang/Object;Ljava/lang/String;)V
       6: invokestatic  #109                // Method com/c/a/f.k:()Lcom/c/a/h;
       9: bipush        7
      11: anewarray     #111                // class java/lang/Object
      14: dup
      15: iconst_0
      16: ldc           #142                // String onScaleEnd:
      18: aastore
      19: dup
      20: iconst_1
      21: ldc           #144                // String mInitialAbsFocusPoint.x:
      23: aastore
      24: dup
      25: iconst_2
      26: aload_0
      27: getfield      #34                 // Field b:Lcom/c/a/a;
      30: invokevirtual #51                 // Method com/c/a/a.a:()F
      33: invokestatic  #68                 // Method java/lang/Float.valueOf:(F)Ljava/lang/Float;
      36: aastore
      37: dup
      38: iconst_3
      39: ldc           #146                // String mInitialAbsFocusPoint.y:
      41: aastore
      42: dup
      43: iconst_4
      44: aload_0
      45: getfield      #34                 // Field b:Lcom/c/a/a;
      48: invokevirtual #56                 // Method com/c/a/a.b:()F
      51: invokestatic  #68                 // Method java/lang/Float.valueOf:(F)Ljava/lang/Float;
      54: aastore
      55: dup
      56: iconst_5
      57: ldc           #148                // String mOverPinchable;
      59: aastore
      60: dup
      61: bipush        6
      63: aload_0
      64: getfield      #16                 // Field a:Lcom/c/a/f;
      67: invokestatic  #150                // Method com/c/a/f.b:(Lcom/c/a/f;)Z
      70: invokestatic  #155                // Method java/lang/Boolean.valueOf:(Z)Ljava/lang/Boolean;
      73: aastore
      74: invokevirtual #122                // Method com/c/a/h.b:([Ljava/lang/Object;)V
      77: aload_0
      78: getfield      #16                 // Field a:Lcom/c/a/f;
      81: invokestatic  #150                // Method com/c/a/f.b:(Lcom/c/a/f;)Z
      84: ifne          124
      87: aload_0
      88: getfield      #16                 // Field a:Lcom/c/a/f;
      91: invokestatic  #157                // Method com/c/a/f.c:(Lcom/c/a/f;)Z
      94: ifne          124
      97: aload_0
      98: getfield      #16                 // Field a:Lcom/c/a/f;
     101: invokestatic  #159                // Method com/c/a/f.d:(Lcom/c/a/f;)Z
     104: ifeq          110
     107: goto          124
     110: aload_0
     111: getfield      #16                 // Field a:Lcom/c/a/f;
     114: iconst_0
     115: invokestatic  #88                 // Method com/c/a/f.a:(Lcom/c/a/f;I)Z
     118: pop
     119: aload_0
     120: invokespecial #161                // Method a:()V
     123: return
     124: aload_0
     125: getfield      #16                 // Field a:Lcom/c/a/f;
     128: invokestatic  #163                // Method com/c/a/f.e:(Lcom/c/a/f;)F
     131: fstore_3
     132: aload_0
     133: getfield      #16                 // Field a:Lcom/c/a/f;
     136: invokestatic  #165                // Method com/c/a/f.f:(Lcom/c/a/f;)F
     139: fstore        4
     141: aload_0
     142: getfield      #16                 // Field a:Lcom/c/a/f;
     145: aload_0
     146: getfield      #16                 // Field a:Lcom/c/a/f;
     149: invokevirtual #40                 // Method com/c/a/f.a:()F
     152: iconst_0
     153: invokestatic  #168                // Method com/c/a/f.a:(Lcom/c/a/f;FZ)F
     156: fstore_2
     157: invokestatic  #109                // Method com/c/a/f.k:()Lcom/c/a/h;
     160: bipush        9
     162: anewarray     #111                // class java/lang/Object
     165: dup
     166: iconst_0
     167: ldc           #142                // String onScaleEnd:
     169: aastore
     170: dup
     171: iconst_1
     172: ldc           #170                // String zoom:
     174: aastore
     175: dup
     176: iconst_2
     177: aload_0
     178: getfield      #16                 // Field a:Lcom/c/a/f;
     181: invokevirtual #40                 // Method com/c/a/f.a:()F
     184: invokestatic  #68                 // Method java/lang/Float.valueOf:(F)Ljava/lang/Float;
     187: aastore
     188: dup
     189: iconst_3
     190: ldc           #172                // String newZoom:
     192: aastore
     193: dup
     194: iconst_4
     195: fload_2
     196: invokestatic  #68                 // Method java/lang/Float.valueOf:(F)Ljava/lang/Float;
     199: aastore
     200: dup
     201: iconst_5
     202: ldc           #174                // String max:
     204: aastore
     205: dup
     206: bipush        6
     208: fload_3
     209: invokestatic  #68                 // Method java/lang/Float.valueOf:(F)Ljava/lang/Float;
     212: aastore
     213: dup
     214: bipush        7
     216: ldc           #176                // String min:
     218: aastore
     219: dup
     220: bipush        8
     222: fload         4
     224: invokestatic  #68                 // Method java/lang/Float.valueOf:(F)Ljava/lang/Float;
     227: aastore
     228: invokevirtual #122                // Method com/c/a/h.b:([Ljava/lang/Object;)V
     231: aload_0
     232: getfield      #16                 // Field a:Lcom/c/a/f;
     235: aload_0
     236: getfield      #16                 // Field a:Lcom/c/a/f;
     239: invokestatic  #180                // Method com/c/a/f.g:(Lcom/c/a/f;)Lcom/c/a/d;
     242: invokestatic  #183                // Method com/c/a/f.a:(Lcom/c/a/f;Lcom/c/a/d;)Lcom/c/a/a;
     245: astore_1
     246: aload_1
     247: invokevirtual #51                 // Method com/c/a/a.a:()F
     250: fconst_0
     251: fcmpg
     252: ifne          292
     255: aload_1
     256: invokevirtual #56                 // Method com/c/a/a.b:()F
     259: fconst_0
     260: fcmpg
     261: ifne          292
     264: fload_2
     265: aload_0
     266: getfield      #16                 // Field a:Lcom/c/a/f;
     269: invokevirtual #40                 // Method com/c/a/f.a:()F
     272: invokestatic  #187                // Method java/lang/Float.compare:(FF)I
     275: ifne          292
     278: aload_0
     279: getfield      #16                 // Field a:Lcom/c/a/f;
     282: iconst_0
     283: invokestatic  #88                 // Method com/c/a/f.a:(Lcom/c/a/f;I)Z
     286: pop
     287: aload_0
     288: invokespecial #161                // Method a:()V
     291: return
     292: aload_0
     293: aload_1
     294: invokespecial #189                // Method a:(Lcom/c/a/a;)Landroid/graphics/PointF;
     297: astore        5
     299: aload_0
     300: getfield      #16                 // Field a:Lcom/c/a/f;
     303: invokevirtual #192                // Method com/c/a/f.d:()Lcom/c/a/a;
     306: aload_1
     307: invokevirtual #194                // Method com/c/a/a.c:(Lcom/c/a/a;)Lcom/c/a/a;
     310: astore        6
     312: fload_2
     313: aload_0
     314: getfield      #16                 // Field a:Lcom/c/a/f;
     317: invokevirtual #40                 // Method com/c/a/f.a:()F
     320: invokestatic  #187                // Method java/lang/Float.compare:(FF)I
     323: ifeq          431
     326: new           #21                 // class com/c/a/a
     329: dup
     330: aload_0
     331: getfield      #16                 // Field a:Lcom/c/a/f;
     334: invokevirtual #192                // Method com/c/a/f.d:()Lcom/c/a/a;
     337: invokespecial #196                // Method com/c/a/a."<init>":(Lcom/c/a/a;)V
     340: astore        7
     342: aload_0
     343: getfield      #16                 // Field a:Lcom/c/a/f;
     346: invokevirtual #40                 // Method com/c/a/f.a:()F
     349: fstore_3
     350: aload_0
     351: getfield      #16                 // Field a:Lcom/c/a/f;
     354: fload_2
     355: iconst_1
     356: iconst_1
     357: aload         5
     359: getfield      #200                // Field android/graphics/PointF.x:F
     362: aload         5
     364: getfield      #203                // Field android/graphics/PointF.y:F
     367: iconst_0
     368: invokestatic  #206                // Method com/c/a/f.a:(Lcom/c/a/f;FZZFFZ)V
     371: aload_1
     372: aload_0
     373: getfield      #16                 // Field a:Lcom/c/a/f;
     376: aload_0
     377: getfield      #16                 // Field a:Lcom/c/a/f;
     380: invokestatic  #180                // Method com/c/a/f.g:(Lcom/c/a/f;)Lcom/c/a/d;
     383: invokestatic  #183                // Method com/c/a/f.a:(Lcom/c/a/f;Lcom/c/a/d;)Lcom/c/a/a;
     386: invokevirtual #106                // Method com/c/a/a.a:(Lcom/c/a/a;)V
     389: aload         6
     391: aload_0
     392: getfield      #16                 // Field a:Lcom/c/a/f;
     395: invokevirtual #192                // Method com/c/a/f.d:()Lcom/c/a/a;
     398: aload_1
     399: invokevirtual #194                // Method com/c/a/a.c:(Lcom/c/a/a;)Lcom/c/a/a;
     402: invokevirtual #106                // Method com/c/a/a.a:(Lcom/c/a/a;)V
     405: aload_0
     406: getfield      #16                 // Field a:Lcom/c/a/f;
     409: fload_3
     410: aload         7
     412: invokevirtual #51                 // Method com/c/a/a.a:()F
     415: aload         7
     417: invokevirtual #56                 // Method com/c/a/a.b:()F
     420: iconst_1
     421: iconst_1
     422: aconst_null
     423: aconst_null
     424: iconst_0
     425: bipush        96
     427: aconst_null
     428: invokestatic  #137                // Method com/c/a/f.a:(Lcom/c/a/f;FFFZZLjava/lang/Float;Ljava/lang/Float;ZILjava/lang/Object;)V
     431: aload_1
     432: invokevirtual #51                 // Method com/c/a/a.a:()F
     435: fconst_0
     436: fcmpg
     437: ifne          461
     440: aload_1
     441: invokevirtual #56                 // Method com/c/a/a.b:()F
     444: fconst_0
     445: fcmpg
     446: ifne          461
     449: aload_0
     450: getfield      #16                 // Field a:Lcom/c/a/f;
     453: fload_2
     454: iconst_1
     455: invokestatic  #209                // Method com/c/a/f.b:(Lcom/c/a/f;FZ)V
     458: goto          497
     461: aload_0
     462: getfield      #16                 // Field a:Lcom/c/a/f;
     465: fload_2
     466: aload         6
     468: invokevirtual #51                 // Method com/c/a/a.a:()F
     471: aload         6
     473: invokevirtual #56                 // Method com/c/a/a.b:()F
     476: iconst_1
     477: iconst_1
     478: aload         5
     480: getfield      #200                // Field android/graphics/PointF.x:F
     483: invokestatic  #68                 // Method java/lang/Float.valueOf:(F)Ljava/lang/Float;
     486: aload         5
     488: getfield      #203                // Field android/graphics/PointF.y:F
     491: invokestatic  #68                 // Method java/lang/Float.valueOf:(F)Ljava/lang/Float;
     494: invokestatic  #212                // Method com/c/a/f.a:(Lcom/c/a/f;FFFZZLjava/lang/Float;Ljava/lang/Float;)V
     497: aload_0
     498: invokespecial #161                // Method a:()V
     501: return
     502: astore_1
     503: aload_0
     504: invokespecial #161                // Method a:()V
     507: aload_1
     508: athrow
    Exception table:
       from    to  target type
          77   107   502   any
         110   119   502   any
         124   287   502   any
         292   431   502   any
         431   458   502   any
         461   497   502   any
}
