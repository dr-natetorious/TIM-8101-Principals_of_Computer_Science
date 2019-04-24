final class com.c.a.f$b extends android.view.GestureDetector$SimpleOnGestureListener {
  final com.c.a.f a;

  public com.c.a.f$b();
    Code:
       0: aload_0
       1: aload_1
       2: putfield      #13                 // Field a:Lcom/c/a/f;
       5: aload_0
       6: invokespecial #16                 // Method android/view/GestureDetector$SimpleOnGestureListener."<init>":()V
       9: return

  public boolean onDown(android.view.MotionEvent);
    Code:
       0: aload_1
       1: ldc           #22                 // String e
       3: invokestatic  #27                 // Method a/b/b/c.b:(Ljava/lang/Object;Ljava/lang/String;)V
       6: iconst_1
       7: ireturn

  public boolean onFling(android.view.MotionEvent, android.view.MotionEvent, float, float);
    Code:
       0: aload_1
       1: ldc           #31                 // String e1
       3: invokestatic  #27                 // Method a/b/b/c.b:(Ljava/lang/Object;Ljava/lang/String;)V
       6: aload_2
       7: ldc           #33                 // String e2
       9: invokestatic  #27                 // Method a/b/b/c.b:(Ljava/lang/Object;Ljava/lang/String;)V
      12: aload_0
      13: getfield      #13                 // Field a:Lcom/c/a/f;
      16: invokestatic  #37                 // Method com/c/a/f.l:(Lcom/c/a/f;)Z
      19: ifne          24
      22: iconst_0
      23: ireturn
      24: aload_0
      25: getfield      #13                 // Field a:Lcom/c/a/f;
      28: invokestatic  #40                 // Method com/c/a/f.m:(Lcom/c/a/f;)Z
      31: ifne          46
      34: aload_0
      35: getfield      #13                 // Field a:Lcom/c/a/f;
      38: invokestatic  #43                 // Method com/c/a/f.n:(Lcom/c/a/f;)Z
      41: ifne          46
      44: iconst_0
      45: ireturn
      46: aload_0
      47: getfield      #13                 // Field a:Lcom/c/a/f;
      50: invokestatic  #40                 // Method com/c/a/f.m:(Lcom/c/a/f;)Z
      53: istore        8
      55: fconst_0
      56: fstore        5
      58: iload         8
      60: ifeq          66
      63: goto          68
      66: fconst_0
      67: fstore_3
      68: fload_3
      69: f2i
      70: istore        6
      72: fload         5
      74: fstore_3
      75: aload_0
      76: getfield      #13                 // Field a:Lcom/c/a/f;
      79: invokestatic  #43                 // Method com/c/a/f.n:(Lcom/c/a/f;)Z
      82: ifeq          88
      85: fload         4
      87: fstore_3
      88: fload_3
      89: f2i
      90: istore        7
      92: aload_0
      93: getfield      #13                 // Field a:Lcom/c/a/f;
      96: iload         6
      98: iload         7
     100: invokestatic  #46                 // Method com/c/a/f.a:(Lcom/c/a/f;II)Z
     103: ireturn

  public boolean onScroll(android.view.MotionEvent, android.view.MotionEvent, float, float);
    Code:
       0: aload_1
       1: ldc           #31                 // String e1
       3: invokestatic  #27                 // Method a/b/b/c.b:(Ljava/lang/Object;Ljava/lang/String;)V
       6: aload_2
       7: ldc           #33                 // String e2
       9: invokestatic  #27                 // Method a/b/b/c.b:(Ljava/lang/Object;Ljava/lang/String;)V
      12: aload_0
      13: getfield      #13                 // Field a:Lcom/c/a/f;
      16: invokestatic  #40                 // Method com/c/a/f.m:(Lcom/c/a/f;)Z
      19: ifne          34
      22: aload_0
      23: getfield      #13                 // Field a:Lcom/c/a/f;
      26: invokestatic  #43                 // Method com/c/a/f.n:(Lcom/c/a/f;)Z
      29: ifne          34
      32: iconst_0
      33: ireturn
      34: aload_0
      35: getfield      #13                 // Field a:Lcom/c/a/f;
      38: iconst_1
      39: invokestatic  #50                 // Method com/c/a/f.a:(Lcom/c/a/f;I)Z
      42: ifeq          348
      45: new           #52                 // class com/c/a/a
      48: dup
      49: fload_3
      50: fneg
      51: fload         4
      53: fneg
      54: invokespecial #55                 // Method com/c/a/a."<init>":(FF)V
      57: astore_1
      58: aload_0
      59: getfield      #13                 // Field a:Lcom/c/a/f;
      62: invokestatic  #59                 // Method com/c/a/f.g:(Lcom/c/a/f;)Lcom/c/a/d;
      65: astore_2
      66: aload_2
      67: invokevirtual #64                 // Method com/c/a/d.a:()F
      70: fstore        4
      72: iconst_0
      73: i2f
      74: fstore_3
      75: fload         4
      77: fload_3
      78: fcmpg
      79: ifge          91
      82: aload_1
      83: invokevirtual #65                 // Method com/c/a/a.a:()F
      86: fload_3
      87: fcmpl
      88: ifgt          109
      91: aload_2
      92: invokevirtual #64                 // Method com/c/a/d.a:()F
      95: fload_3
      96: fcmpl
      97: ifle          179
     100: aload_1
     101: invokevirtual #65                 // Method com/c/a/a.a:()F
     104: fload_3
     105: fcmpg
     106: ifge          179
     109: fconst_1
     110: aload_2
     111: invokevirtual #64                 // Method com/c/a/d.a:()F
     114: invokestatic  #71                 // Method java/lang/Math.abs:(F)F
     117: aload_0
     118: getfield      #13                 // Field a:Lcom/c/a/f;
     121: invokestatic  #75                 // Method com/c/a/f.o:(Lcom/c/a/f;)I
     124: i2f
     125: fdiv
     126: f2d
     127: ldc2_w        #76                 // double 0.4d
     130: invokestatic  #81                 // Method java/lang/Math.pow:(DD)D
     133: d2f
     134: fsub
     135: ldc           #82                 // float 0.6f
     137: fmul
     138: fstore        4
     140: invokestatic  #86                 // Method com/c/a/f.k:()Lcom/c/a/h;
     143: iconst_3
     144: anewarray     #88                 // class java/lang/Object
     147: dup
     148: iconst_0
     149: ldc           #89                 // String onScroll
     151: aastore
     152: dup
     153: iconst_1
     154: ldc           #91                 // String applying friction X:
     156: aastore
     157: dup
     158: iconst_2
     159: fload         4
     161: invokestatic  #97                 // Method java/lang/Float.valueOf:(F)Ljava/lang/Float;
     164: aastore
     165: invokevirtual #102                // Method com/c/a/h.b:([Ljava/lang/Object;)V
     168: aload_1
     169: aload_1
     170: invokevirtual #65                 // Method com/c/a/a.a:()F
     173: fload         4
     175: fmul
     176: invokevirtual #105                // Method com/c/a/a.a:(F)V
     179: aload_2
     180: invokevirtual #107                // Method com/c/a/d.b:()F
     183: fload_3
     184: fcmpg
     185: ifge          197
     188: aload_1
     189: invokevirtual #108                // Method com/c/a/a.b:()F
     192: fload_3
     193: fcmpl
     194: ifgt          215
     197: aload_2
     198: invokevirtual #107                // Method com/c/a/d.b:()F
     201: fload_3
     202: fcmpl
     203: ifle          282
     206: aload_1
     207: invokevirtual #108                // Method com/c/a/a.b:()F
     210: fload_3
     211: fcmpg
     212: ifge          282
     215: fconst_1
     216: aload_2
     217: invokevirtual #107                // Method com/c/a/d.b:()F
     220: invokestatic  #71                 // Method java/lang/Math.abs:(F)F
     223: aload_0
     224: getfield      #13                 // Field a:Lcom/c/a/f;
     227: invokestatic  #75                 // Method com/c/a/f.o:(Lcom/c/a/f;)I
     230: i2f
     231: fdiv
     232: f2d
     233: ldc2_w        #76                 // double 0.4d
     236: invokestatic  #81                 // Method java/lang/Math.pow:(DD)D
     239: d2f
     240: fsub
     241: ldc           #82                 // float 0.6f
     243: fmul
     244: fstore_3
     245: invokestatic  #86                 // Method com/c/a/f.k:()Lcom/c/a/h;
     248: iconst_3
     249: anewarray     #88                 // class java/lang/Object
     252: dup
     253: iconst_0
     254: ldc           #89                 // String onScroll
     256: aastore
     257: dup
     258: iconst_1
     259: ldc           #110                // String applying friction Y:
     261: aastore
     262: dup
     263: iconst_2
     264: fload_3
     265: invokestatic  #97                 // Method java/lang/Float.valueOf:(F)Ljava/lang/Float;
     268: aastore
     269: invokevirtual #102                // Method com/c/a/h.b:([Ljava/lang/Object;)V
     272: aload_1
     273: aload_1
     274: invokevirtual #108                // Method com/c/a/a.b:()F
     277: fload_3
     278: fmul
     279: invokevirtual #112                // Method com/c/a/a.b:(F)V
     282: aload_0
     283: getfield      #13                 // Field a:Lcom/c/a/f;
     286: invokestatic  #40                 // Method com/c/a/f.m:(Lcom/c/a/f;)Z
     289: ifne          297
     292: aload_1
     293: fconst_0
     294: invokevirtual #105                // Method com/c/a/a.a:(F)V
     297: aload_0
     298: getfield      #13                 // Field a:Lcom/c/a/f;
     301: invokestatic  #43                 // Method com/c/a/f.n:(Lcom/c/a/f;)Z
     304: ifne          312
     307: aload_1
     308: fconst_0
     309: invokevirtual #112                // Method com/c/a/a.b:(F)V
     312: aload_1
     313: invokevirtual #65                 // Method com/c/a/a.a:()F
     316: fconst_0
     317: fcmpg
     318: ifne          330
     321: aload_1
     322: invokevirtual #108                // Method com/c/a/a.b:()F
     325: fconst_0
     326: fcmpg
     327: ifeq          346
     330: aload_0
     331: getfield      #13                 // Field a:Lcom/c/a/f;
     334: aload_1
     335: invokevirtual #65                 // Method com/c/a/a.a:()F
     338: aload_1
     339: invokevirtual #108                // Method com/c/a/a.b:()F
     342: iconst_1
     343: invokestatic  #115                // Method com/c/a/f.a:(Lcom/c/a/f;FFZ)V
     346: iconst_1
     347: ireturn
     348: iconst_0
     349: ireturn
}
