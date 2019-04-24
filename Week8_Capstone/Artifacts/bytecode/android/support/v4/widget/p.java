public class android.support.v4.widget.p {
  static {};
    Code:
       0: new           #6                  // class android/support/v4/widget/p$1
       3: dup
       4: invokespecial #50                 // Method android/support/v4/widget/p$1."<init>":()V
       7: putstatic     #52                 // Field v:Landroid/view/animation/Interpolator;
      10: return

  public static android.support.v4.widget.p a(android.view.ViewGroup, float, android.support.v4.widget.p$a);
    Code:
       0: aload_0
       1: aload_2
       2: invokestatic  #170                // Method a:(Landroid/view/ViewGroup;Landroid/support/v4/widget/p$a;)Landroid/support/v4/widget/p;
       5: astore_0
       6: aload_0
       7: aload_0
       8: getfield      #108                // Field b:I
      11: i2f
      12: fconst_1
      13: fload_1
      14: fdiv
      15: fmul
      16: f2i
      17: putfield      #108                // Field b:I
      20: aload_0
      21: areturn

  public static android.support.v4.widget.p a(android.view.ViewGroup, android.support.v4.widget.p$a);
    Code:
       0: new           #2                  // class android/support/v4/widget/p
       3: dup
       4: aload_0
       5: invokevirtual #174                // Method android/view/ViewGroup.getContext:()Landroid/content/Context;
       8: aload_0
       9: aload_1
      10: invokespecial #176                // Method "<init>":(Landroid/content/Context;Landroid/view/ViewGroup;Landroid/support/v4/widget/p$a;)V
      13: areturn

  public int a();
    Code:
       0: aload_0
       1: getfield      #186                // Field a:I
       4: ireturn

  public void a(float);
    Code:
       0: aload_0
       1: fload_1
       2: putfield      #118                // Field n:F
       5: return

  public void a(int);
    Code:
       0: aload_0
       1: iload_1
       2: putfield      #209                // Field p:I
       5: return

  public void a(android.view.View, int);
    Code:
       0: aload_1
       1: invokevirtual #355                // Method android/view/View.getParent:()Landroid/view/ViewParent;
       4: aload_0
       5: getfield      #73                 // Field u:Landroid/view/ViewGroup;
       8: if_acmpeq     56
      11: new           #323                // class java/lang/StringBuilder
      14: dup
      15: invokespecial #324                // Method java/lang/StringBuilder."<init>":()V
      18: astore_1
      19: aload_1
      20: ldc_w         #357                // String captureChildView: parameter must be a descendant of the ViewDragHelper's tracked parent view (
      23: invokevirtual #330                // Method java/lang/StringBuilder.append:(Ljava/lang/String;)Ljava/lang/StringBuilder;
      26: pop
      27: aload_1
      28: aload_0
      29: getfield      #73                 // Field u:Landroid/view/ViewGroup;
      32: invokevirtual #360                // Method java/lang/StringBuilder.append:(Ljava/lang/Object;)Ljava/lang/StringBuilder;
      35: pop
      36: aload_1
      37: ldc_w         #362                // String )
      40: invokevirtual #330                // Method java/lang/StringBuilder.append:(Ljava/lang/String;)Ljava/lang/StringBuilder;
      43: pop
      44: new           #64                 // class java/lang/IllegalArgumentException
      47: dup
      48: aload_1
      49: invokevirtual #345                // Method java/lang/StringBuilder.toString:()Ljava/lang/String;
      52: invokespecial #69                 // Method java/lang/IllegalArgumentException."<init>":(Ljava/lang/String;)V
      55: athrow
      56: aload_0
      57: aload_1
      58: putfield      #181                // Field s:Landroid/view/View;
      61: aload_0
      62: iload_2
      63: putfield      #57                 // Field c:I
      66: aload_0
      67: getfield      #75                 // Field r:Landroid/support/v4/widget/p$a;
      70: aload_1
      71: iload_2
      72: invokevirtual #363                // Method android/support/v4/widget/p$a.b:(Landroid/view/View;I)V
      75: aload_0
      76: iconst_1
      77: invokevirtual #189                // Method c:(I)V
      80: return

  public boolean a(int, int);
    Code:
       0: aload_0
       1: getfield      #179                // Field t:Z
       4: ifne          18
       7: new           #366                // class java/lang/IllegalStateException
      10: dup
      11: ldc_w         #368                // String Cannot settleCapturedViewAt outside of a call to Callback#onViewReleased
      14: invokespecial #369                // Method java/lang/IllegalStateException."<init>":(Ljava/lang/String;)V
      17: athrow
      18: aload_0
      19: iload_1
      20: iload_2
      21: aload_0
      22: getfield      #305                // Field l:Landroid/view/VelocityTracker;
      25: aload_0
      26: getfield      #57                 // Field c:I
      29: invokevirtual #314                // Method android/view/VelocityTracker.getXVelocity:(I)F
      32: f2i
      33: aload_0
      34: getfield      #305                // Field l:Landroid/view/VelocityTracker;
      37: aload_0
      38: getfield      #57                 // Field c:I
      41: invokevirtual #319                // Method android/view/VelocityTracker.getYVelocity:(I)F
      44: f2i
      45: invokespecial #371                // Method a:(IIII)Z
      48: ireturn

  public boolean a(android.view.MotionEvent);
    Code:
       0: aload_1
       1: invokevirtual #375                // Method android/view/MotionEvent.getActionMasked:()I
       4: istore        7
       6: aload_1
       7: invokevirtual #378                // Method android/view/MotionEvent.getActionIndex:()I
      10: istore        6
      12: iload         7
      14: ifne          21
      17: aload_0
      18: invokevirtual #380                // Method e:()V
      21: aload_0
      22: getfield      #305                // Field l:Landroid/view/VelocityTracker;
      25: ifnonnull     35
      28: aload_0
      29: invokestatic  #384                // Method android/view/VelocityTracker.obtain:()Landroid/view/VelocityTracker;
      32: putfield      #305                // Field l:Landroid/view/VelocityTracker;
      35: aload_0
      36: getfield      #305                // Field l:Landroid/view/VelocityTracker;
      39: aload_1
      40: invokevirtual #387                // Method android/view/VelocityTracker.addMovement:(Landroid/view/MotionEvent;)V
      43: iload         7
      45: tableswitch   { // 0 to 6
                     0: 529
                     1: 522
                     2: 215
                     3: 522
                     4: 88
                     5: 104
                     6: 91
               default: 88
          }
      88: goto          622
      91: aload_0
      92: aload_1
      93: iload         6
      95: invokevirtual #270                // Method android/view/MotionEvent.getPointerId:(I)I
      98: invokespecial #389                // Method e:(I)V
     101: goto          88
     104: aload_1
     105: iload         6
     107: invokevirtual #270                // Method android/view/MotionEvent.getPointerId:(I)I
     110: istore        7
     112: aload_1
     113: iload         6
     115: invokevirtual #276                // Method android/view/MotionEvent.getX:(I)F
     118: fstore_2
     119: aload_1
     120: iload         6
     122: invokevirtual #279                // Method android/view/MotionEvent.getY:(I)F
     125: fstore_3
     126: aload_0
     127: fload_2
     128: fload_3
     129: iload         7
     131: invokespecial #391                // Method a:(FFI)V
     134: aload_0
     135: getfield      #186                // Field a:I
     138: ifne          179
     141: aload_0
     142: getfield      #202                // Field h:[I
     145: iload         7
     147: iaload
     148: istore        6
     150: aload_0
     151: getfield      #209                // Field p:I
     154: iload         6
     156: iand
     157: ifeq          88
     160: aload_0
     161: getfield      #75                 // Field r:Landroid/support/v4/widget/p$a;
     164: iload         6
     166: aload_0
     167: getfield      #209                // Field p:I
     170: iand
     171: iload         7
     173: invokevirtual #393                // Method android/support/v4/widget/p$a.a:(II)V
     176: goto          88
     179: aload_0
     180: getfield      #186                // Field a:I
     183: iconst_2
     184: if_icmpne     88
     187: aload_0
     188: fload_2
     189: f2i
     190: fload_3
     191: f2i
     192: invokevirtual #396                // Method d:(II)Landroid/view/View;
     195: astore_1
     196: aload_1
     197: aload_0
     198: getfield      #181                // Field s:Landroid/view/View;
     201: if_acmpne     88
     204: aload_0
     205: aload_1
     206: iload         7
     208: invokevirtual #399                // Method b:(Landroid/view/View;I)Z
     211: pop
     212: goto          88
     215: aload_0
     216: getfield      #194                // Field d:[F
     219: ifnull        88
     222: aload_0
     223: getfield      #198                // Field e:[F
     226: ifnonnull     232
     229: goto          88
     232: aload_1
     233: invokevirtual #267                // Method android/view/MotionEvent.getPointerCount:()I
     236: istore        8
     238: iconst_0
     239: istore        6
     241: iload         6
     243: iload         8
     245: if_icmpge     514
     248: aload_1
     249: iload         6
     251: invokevirtual #270                // Method android/view/MotionEvent.getPointerId:(I)I
     254: istore        9
     256: aload_0
     257: iload         9
     259: invokespecial #272                // Method g:(I)Z
     262: ifne          268
     265: goto          505
     268: aload_1
     269: iload         6
     271: invokevirtual #276                // Method android/view/MotionEvent.getX:(I)F
     274: fstore_2
     275: aload_1
     276: iload         6
     278: invokevirtual #279                // Method android/view/MotionEvent.getY:(I)F
     281: fstore_3
     282: fload_2
     283: aload_0
     284: getfield      #194                // Field d:[F
     287: iload         9
     289: faload
     290: fsub
     291: fstore        4
     293: fload_3
     294: aload_0
     295: getfield      #198                // Field e:[F
     298: iload         9
     300: faload
     301: fsub
     302: fstore        5
     304: aload_0
     305: fload_2
     306: f2i
     307: fload_3
     308: f2i
     309: invokevirtual #396                // Method d:(II)Landroid/view/View;
     312: astore        17
     314: aload         17
     316: ifnull        338
     319: aload_0
     320: aload         17
     322: fload         4
     324: fload         5
     326: invokespecial #401                // Method a:(Landroid/view/View;FF)Z
     329: ifeq          338
     332: iconst_1
     333: istore        7
     335: goto          341
     338: iconst_0
     339: istore        7
     341: iload         7
     343: ifeq          465
     346: aload         17
     348: invokevirtual #222                // Method android/view/View.getLeft:()I
     351: istore        10
     353: fload         4
     355: f2i
     356: istore        11
     358: aload_0
     359: getfield      #75                 // Field r:Landroid/support/v4/widget/p$a;
     362: aload         17
     364: iload         10
     366: iload         11
     368: iadd
     369: iload         11
     371: invokevirtual #249                // Method android/support/v4/widget/p$a.b:(Landroid/view/View;II)I
     374: istore        11
     376: aload         17
     378: invokevirtual #225                // Method android/view/View.getTop:()I
     381: istore        12
     383: fload         5
     385: f2i
     386: istore        13
     388: aload_0
     389: getfield      #75                 // Field r:Landroid/support/v4/widget/p$a;
     392: aload         17
     394: iload         12
     396: iload         13
     398: iadd
     399: iload         13
     401: invokevirtual #256                // Method android/support/v4/widget/p$a.a:(Landroid/view/View;II)I
     404: istore        13
     406: aload_0
     407: getfield      #75                 // Field r:Landroid/support/v4/widget/p$a;
     410: aload         17
     412: invokevirtual #162                // Method android/support/v4/widget/p$a.b:(Landroid/view/View;)I
     415: istore        14
     417: aload_0
     418: getfield      #75                 // Field r:Landroid/support/v4/widget/p$a;
     421: aload         17
     423: invokevirtual #166                // Method android/support/v4/widget/p$a.a:(Landroid/view/View;)I
     426: istore        15
     428: iload         14
     430: ifeq          445
     433: iload         14
     435: ifle          465
     438: iload         11
     440: iload         10
     442: if_icmpne     465
     445: iload         15
     447: ifeq          514
     450: iload         15
     452: ifle          465
     455: iload         13
     457: iload         12
     459: if_icmpne     465
     462: goto          514
     465: aload_0
     466: fload         4
     468: fload         5
     470: iload         9
     472: invokespecial #403                // Method b:(FFI)V
     475: aload_0
     476: getfield      #186                // Field a:I
     479: iconst_1
     480: if_icmpne     486
     483: goto          514
     486: iload         7
     488: ifeq          505
     491: aload_0
     492: aload         17
     494: iload         9
     496: invokevirtual #399                // Method b:(Landroid/view/View;I)Z
     499: ifeq          505
     502: goto          514
     505: iload         6
     507: iconst_1
     508: iadd
     509: istore        6
     511: goto          241
     514: aload_0
     515: aload_1
     516: invokespecial #405                // Method c:(Landroid/view/MotionEvent;)V
     519: goto          88
     522: aload_0
     523: invokevirtual #380                // Method e:()V
     526: goto          88
     529: aload_1
     530: invokevirtual #408                // Method android/view/MotionEvent.getX:()F
     533: fstore_2
     534: aload_1
     535: invokevirtual #410                // Method android/view/MotionEvent.getY:()F
     538: fstore_3
     539: aload_1
     540: iconst_0
     541: invokevirtual #270                // Method android/view/MotionEvent.getPointerId:(I)I
     544: istore        6
     546: aload_0
     547: fload_2
     548: fload_3
     549: iload         6
     551: invokespecial #391                // Method a:(FFI)V
     554: aload_0
     555: fload_2
     556: f2i
     557: fload_3
     558: f2i
     559: invokevirtual #396                // Method d:(II)Landroid/view/View;
     562: astore_1
     563: aload_1
     564: aload_0
     565: getfield      #181                // Field s:Landroid/view/View;
     568: if_acmpne     587
     571: aload_0
     572: getfield      #186                // Field a:I
     575: iconst_2
     576: if_icmpne     587
     579: aload_0
     580: aload_1
     581: iload         6
     583: invokevirtual #399                // Method b:(Landroid/view/View;I)Z
     586: pop
     587: aload_0
     588: getfield      #202                // Field h:[I
     591: iload         6
     593: iaload
     594: istore        7
     596: aload_0
     597: getfield      #209                // Field p:I
     600: iload         7
     602: iand
     603: ifeq          622
     606: aload_0
     607: getfield      #75                 // Field r:Landroid/support/v4/widget/p$a;
     610: iload         7
     612: aload_0
     613: getfield      #209                // Field p:I
     616: iand
     617: iload         6
     619: invokevirtual #393                // Method android/support/v4/widget/p$a.a:(II)V
     622: iconst_0
     623: istore        16
     625: aload_0
     626: getfield      #186                // Field a:I
     629: iconst_1
     630: if_icmpne     636
     633: iconst_1
     634: istore        16
     636: iload         16
     638: ireturn

  public boolean a(android.view.View, int, int);
    Code:
       0: aload_0
       1: aload_1
       2: putfield      #181                // Field s:Landroid/view/View;
       5: aload_0
       6: iconst_m1
       7: putfield      #57                 // Field c:I
      10: aload_0
      11: iload_2
      12: iload_3
      13: iconst_0
      14: iconst_0
      15: invokespecial #371                // Method a:(IIII)Z
      18: istore        4
      20: iload         4
      22: ifne          44
      25: aload_0
      26: getfield      #186                // Field a:I
      29: ifne          44
      32: aload_0
      33: getfield      #181                // Field s:Landroid/view/View;
      36: ifnull        44
      39: aload_0
      40: aconst_null
      41: putfield      #181                // Field s:Landroid/view/View;
      44: iload         4
      46: ireturn

  public boolean a(boolean);
    Code:
       0: aload_0
       1: getfield      #186                // Field a:I
       4: istore_2
       5: iconst_0
       6: istore        7
       8: iload_2
       9: iconst_2
      10: if_icmpne     193
      13: aload_0
      14: getfield      #125                // Field q:Landroid/widget/OverScroller;
      17: invokevirtual #416                // Method android/widget/OverScroller.computeScrollOffset:()Z
      20: istore        8
      22: aload_0
      23: getfield      #125                // Field q:Landroid/widget/OverScroller;
      26: invokevirtual #419                // Method android/widget/OverScroller.getCurrX:()I
      29: istore_2
      30: aload_0
      31: getfield      #125                // Field q:Landroid/widget/OverScroller;
      34: invokevirtual #422                // Method android/widget/OverScroller.getCurrY:()I
      37: istore_3
      38: iload_2
      39: aload_0
      40: getfield      #181                // Field s:Landroid/view/View;
      43: invokevirtual #222                // Method android/view/View.getLeft:()I
      46: isub
      47: istore        4
      49: iload_3
      50: aload_0
      51: getfield      #181                // Field s:Landroid/view/View;
      54: invokevirtual #225                // Method android/view/View.getTop:()I
      57: isub
      58: istore        5
      60: iload         4
      62: ifeq          74
      65: aload_0
      66: getfield      #181                // Field s:Landroid/view/View;
      69: iload         4
      71: invokestatic  #254                // Method android/support/v4/view/s.c:(Landroid/view/View;I)V
      74: iload         5
      76: ifeq          88
      79: aload_0
      80: getfield      #181                // Field s:Landroid/view/View;
      83: iload         5
      85: invokestatic  #258                // Method android/support/v4/view/s.b:(Landroid/view/View;I)V
      88: iload         4
      90: ifne          98
      93: iload         5
      95: ifeq          115
      98: aload_0
      99: getfield      #75                 // Field r:Landroid/support/v4/widget/p$a;
     102: aload_0
     103: getfield      #181                // Field s:Landroid/view/View;
     106: iload_2
     107: iload_3
     108: iload         4
     110: iload         5
     112: invokevirtual #261                // Method android/support/v4/widget/p$a.a:(Landroid/view/View;IIII)V
     115: iload         8
     117: istore        6
     119: iload         8
     121: ifeq          164
     124: iload         8
     126: istore        6
     128: iload_2
     129: aload_0
     130: getfield      #125                // Field q:Landroid/widget/OverScroller;
     133: invokevirtual #425                // Method android/widget/OverScroller.getFinalX:()I
     136: if_icmpne     164
     139: iload         8
     141: istore        6
     143: iload_3
     144: aload_0
     145: getfield      #125                // Field q:Landroid/widget/OverScroller;
     148: invokevirtual #428                // Method android/widget/OverScroller.getFinalY:()I
     151: if_icmpne     164
     154: aload_0
     155: getfield      #125                // Field q:Landroid/widget/OverScroller;
     158: invokevirtual #228                // Method android/widget/OverScroller.abortAnimation:()V
     161: iconst_0
     162: istore        6
     164: iload         6
     166: ifne          193
     169: iload_1
     170: ifeq          188
     173: aload_0
     174: getfield      #73                 // Field u:Landroid/view/ViewGroup;
     177: aload_0
     178: getfield      #62                 // Field w:Ljava/lang/Runnable;
     181: invokevirtual #432                // Method android/view/ViewGroup.post:(Ljava/lang/Runnable;)Z
     184: pop
     185: goto          193
     188: aload_0
     189: iconst_0
     190: invokevirtual #189                // Method c:(I)V
     193: iload         7
     195: istore_1
     196: aload_0
     197: getfield      #186                // Field a:I
     200: iconst_2
     201: if_icmpne     206
     204: iconst_1
     205: istore_1
     206: iload_1
     207: ireturn

  public int b();
    Code:
       0: aload_0
       1: getfield      #102                // Field o:I
       4: ireturn

  public void b(android.view.MotionEvent);
    Code:
       0: aload_1
       1: invokevirtual #375                // Method android/view/MotionEvent.getActionMasked:()I
       4: istore        9
       6: aload_1
       7: invokevirtual #378                // Method android/view/MotionEvent.getActionIndex:()I
      10: istore        8
      12: iload         9
      14: ifne          21
      17: aload_0
      18: invokevirtual #380                // Method e:()V
      21: aload_0
      22: getfield      #305                // Field l:Landroid/view/VelocityTracker;
      25: ifnonnull     35
      28: aload_0
      29: invokestatic  #384                // Method android/view/VelocityTracker.obtain:()Landroid/view/VelocityTracker;
      32: putfield      #305                // Field l:Landroid/view/VelocityTracker;
      35: aload_0
      36: getfield      #305                // Field l:Landroid/view/VelocityTracker;
      39: aload_1
      40: invokevirtual #387                // Method android/view/VelocityTracker.addMovement:(Landroid/view/MotionEvent;)V
      43: iconst_0
      44: istore        7
      46: iconst_0
      47: istore        6
      49: iload         9
      51: tableswitch   { // 0 to 6
                     0: 622
                     1: 605
                     2: 359
                     3: 342
                     4: 92
                     5: 231
                     6: 93
               default: 92
          }
      92: return
      93: aload_1
      94: iload         8
      96: invokevirtual #270                // Method android/view/MotionEvent.getPointerId:(I)I
      99: istore        7
     101: aload_0
     102: getfield      #186                // Field a:I
     105: iconst_1
     106: if_icmpne     224
     109: iload         7
     111: aload_0
     112: getfield      #57                 // Field c:I
     115: if_icmpne     224
     118: aload_1
     119: invokevirtual #267                // Method android/view/MotionEvent.getPointerCount:()I
     122: istore        8
     124: iload         6
     126: iload         8
     128: if_icmpge     211
     131: aload_1
     132: iload         6
     134: invokevirtual #270                // Method android/view/MotionEvent.getPointerId:(I)I
     137: istore        9
     139: iload         9
     141: aload_0
     142: getfield      #57                 // Field c:I
     145: if_icmpne     151
     148: goto          202
     151: aload_1
     152: iload         6
     154: invokevirtual #276                // Method android/view/MotionEvent.getX:(I)F
     157: fstore_2
     158: aload_1
     159: iload         6
     161: invokevirtual #279                // Method android/view/MotionEvent.getY:(I)F
     164: fstore_3
     165: aload_0
     166: fload_2
     167: f2i
     168: fload_3
     169: f2i
     170: invokevirtual #396                // Method d:(II)Landroid/view/View;
     173: aload_0
     174: getfield      #181                // Field s:Landroid/view/View;
     177: if_acmpne     202
     180: aload_0
     181: aload_0
     182: getfield      #181                // Field s:Landroid/view/View;
     185: iload         9
     187: invokevirtual #399                // Method b:(Landroid/view/View;I)Z
     190: ifeq          202
     193: aload_0
     194: getfield      #57                 // Field c:I
     197: istore        6
     199: goto          214
     202: iload         6
     204: iconst_1
     205: iadd
     206: istore        6
     208: goto          124
     211: iconst_m1
     212: istore        6
     214: iload         6
     216: iconst_m1
     217: if_icmpne     224
     220: aload_0
     221: invokespecial #434                // Method g:()V
     224: aload_0
     225: iload         7
     227: invokespecial #389                // Method e:(I)V
     230: return
     231: aload_1
     232: iload         8
     234: invokevirtual #270                // Method android/view/MotionEvent.getPointerId:(I)I
     237: istore        6
     239: aload_1
     240: iload         8
     242: invokevirtual #276                // Method android/view/MotionEvent.getX:(I)F
     245: fstore_2
     246: aload_1
     247: iload         8
     249: invokevirtual #279                // Method android/view/MotionEvent.getY:(I)F
     252: fstore_3
     253: aload_0
     254: fload_2
     255: fload_3
     256: iload         6
     258: invokespecial #391                // Method a:(FFI)V
     261: aload_0
     262: getfield      #186                // Field a:I
     265: ifne          319
     268: aload_0
     269: aload_0
     270: fload_2
     271: f2i
     272: fload_3
     273: f2i
     274: invokevirtual #396                // Method d:(II)Landroid/view/View;
     277: iload         6
     279: invokevirtual #399                // Method b:(Landroid/view/View;I)Z
     282: pop
     283: aload_0
     284: getfield      #202                // Field h:[I
     287: iload         6
     289: iaload
     290: istore        7
     292: aload_0
     293: getfield      #209                // Field p:I
     296: iload         7
     298: iand
     299: ifeq          699
     302: aload_0
     303: getfield      #75                 // Field r:Landroid/support/v4/widget/p$a;
     306: iload         7
     308: aload_0
     309: getfield      #209                // Field p:I
     312: iand
     313: iload         6
     315: invokevirtual #393                // Method android/support/v4/widget/p$a.a:(II)V
     318: return
     319: aload_0
     320: fload_2
     321: f2i
     322: fload_3
     323: f2i
     324: invokevirtual #436                // Method c:(II)Z
     327: ifeq          699
     330: aload_0
     331: aload_0
     332: getfield      #181                // Field s:Landroid/view/View;
     335: iload         6
     337: invokevirtual #399                // Method b:(Landroid/view/View;I)Z
     340: pop
     341: return
     342: aload_0
     343: getfield      #186                // Field a:I
     346: iconst_1
     347: if_icmpne     617
     350: aload_0
     351: fconst_0
     352: fconst_0
     353: invokespecial #321                // Method a:(FF)V
     356: goto          617
     359: aload_0
     360: getfield      #186                // Field a:I
     363: iconst_1
     364: if_icmpne     465
     367: aload_0
     368: aload_0
     369: getfield      #57                 // Field c:I
     372: invokespecial #272                // Method g:(I)Z
     375: ifne          379
     378: return
     379: aload_1
     380: aload_0
     381: getfield      #57                 // Field c:I
     384: invokevirtual #439                // Method android/view/MotionEvent.findPointerIndex:(I)I
     387: istore        6
     389: aload_1
     390: iload         6
     392: invokevirtual #276                // Method android/view/MotionEvent.getX:(I)F
     395: fstore_2
     396: aload_1
     397: iload         6
     399: invokevirtual #279                // Method android/view/MotionEvent.getY:(I)F
     402: fstore_3
     403: fload_2
     404: aload_0
     405: getfield      #196                // Field f:[F
     408: aload_0
     409: getfield      #57                 // Field c:I
     412: faload
     413: fsub
     414: f2i
     415: istore        6
     417: fload_3
     418: aload_0
     419: getfield      #200                // Field g:[F
     422: aload_0
     423: getfield      #57                 // Field c:I
     426: faload
     427: fsub
     428: f2i
     429: istore        7
     431: aload_0
     432: aload_0
     433: getfield      #181                // Field s:Landroid/view/View;
     436: invokevirtual #222                // Method android/view/View.getLeft:()I
     439: iload         6
     441: iadd
     442: aload_0
     443: getfield      #181                // Field s:Landroid/view/View;
     446: invokevirtual #225                // Method android/view/View.getTop:()I
     449: iload         7
     451: iadd
     452: iload         6
     454: iload         7
     456: invokespecial #441                // Method b:(IIII)V
     459: aload_0
     460: aload_1
     461: invokespecial #405                // Method c:(Landroid/view/MotionEvent;)V
     464: return
     465: aload_1
     466: invokevirtual #267                // Method android/view/MotionEvent.getPointerCount:()I
     469: istore        8
     471: iload         7
     473: istore        6
     475: iload         6
     477: iload         8
     479: if_icmpge     459
     482: aload_1
     483: iload         6
     485: invokevirtual #270                // Method android/view/MotionEvent.getPointerId:(I)I
     488: istore        7
     490: aload_0
     491: iload         7
     493: invokespecial #272                // Method g:(I)Z
     496: ifne          502
     499: goto          596
     502: aload_1
     503: iload         6
     505: invokevirtual #276                // Method android/view/MotionEvent.getX:(I)F
     508: fstore_2
     509: aload_1
     510: iload         6
     512: invokevirtual #279                // Method android/view/MotionEvent.getY:(I)F
     515: fstore_3
     516: fload_2
     517: aload_0
     518: getfield      #194                // Field d:[F
     521: iload         7
     523: faload
     524: fsub
     525: fstore        4
     527: fload_3
     528: aload_0
     529: getfield      #198                // Field e:[F
     532: iload         7
     534: faload
     535: fsub
     536: fstore        5
     538: aload_0
     539: fload         4
     541: fload         5
     543: iload         7
     545: invokespecial #403                // Method b:(FFI)V
     548: aload_0
     549: getfield      #186                // Field a:I
     552: iconst_1
     553: if_icmpne     559
     556: goto          459
     559: aload_0
     560: fload_2
     561: f2i
     562: fload_3
     563: f2i
     564: invokevirtual #396                // Method d:(II)Landroid/view/View;
     567: astore        10
     569: aload_0
     570: aload         10
     572: fload         4
     574: fload         5
     576: invokespecial #401                // Method a:(Landroid/view/View;FF)Z
     579: ifeq          596
     582: aload_0
     583: aload         10
     585: iload         7
     587: invokevirtual #399                // Method b:(Landroid/view/View;I)Z
     590: ifeq          596
     593: goto          459
     596: iload         6
     598: iconst_1
     599: iadd
     600: istore        6
     602: goto          475
     605: aload_0
     606: getfield      #186                // Field a:I
     609: iconst_1
     610: if_icmpne     617
     613: aload_0
     614: invokespecial #434                // Method g:()V
     617: aload_0
     618: invokevirtual #380                // Method e:()V
     621: return
     622: aload_1
     623: invokevirtual #408                // Method android/view/MotionEvent.getX:()F
     626: fstore_2
     627: aload_1
     628: invokevirtual #410                // Method android/view/MotionEvent.getY:()F
     631: fstore_3
     632: aload_1
     633: iconst_0
     634: invokevirtual #270                // Method android/view/MotionEvent.getPointerId:(I)I
     637: istore        6
     639: aload_0
     640: fload_2
     641: f2i
     642: fload_3
     643: f2i
     644: invokevirtual #396                // Method d:(II)Landroid/view/View;
     647: astore_1
     648: aload_0
     649: fload_2
     650: fload_3
     651: iload         6
     653: invokespecial #391                // Method a:(FFI)V
     656: aload_0
     657: aload_1
     658: iload         6
     660: invokevirtual #399                // Method b:(Landroid/view/View;I)Z
     663: pop
     664: aload_0
     665: getfield      #202                // Field h:[I
     668: iload         6
     670: iaload
     671: istore        7
     673: aload_0
     674: getfield      #209                // Field p:I
     677: iload         7
     679: iand
     680: ifeq          699
     683: aload_0
     684: getfield      #75                 // Field r:Landroid/support/v4/widget/p$a;
     687: iload         7
     689: aload_0
     690: getfield      #209                // Field p:I
     693: iand
     694: iload         6
     696: invokevirtual #393                // Method android/support/v4/widget/p$a.a:(II)V
     699: return

  public boolean b(int);
    Code:
       0: iconst_1
       1: iload_1
       2: ishl
       3: aload_0
       4: getfield      #206                // Field k:I
       7: iand
       8: ifeq          13
      11: iconst_1
      12: ireturn
      13: iconst_0
      14: ireturn

  public boolean b(int, int);
    Code:
       0: aload_0
       1: iload_2
       2: invokevirtual #288                // Method b:(I)Z
       5: istore        9
       7: iconst_0
       8: istore        8
      10: iconst_0
      11: istore        7
      13: iconst_0
      14: istore        6
      16: iload         9
      18: ifne          23
      21: iconst_0
      22: ireturn
      23: iload_1
      24: iconst_1
      25: iand
      26: iconst_1
      27: if_icmpne     36
      30: iconst_1
      31: istore        5
      33: goto          39
      36: iconst_0
      37: istore        5
      39: iload_1
      40: iconst_2
      41: iand
      42: iconst_2
      43: if_icmpne     51
      46: iconst_1
      47: istore_1
      48: goto          53
      51: iconst_0
      52: istore_1
      53: aload_0
      54: getfield      #196                // Field f:[F
      57: iload_2
      58: faload
      59: aload_0
      60: getfield      #194                // Field d:[F
      63: iload_2
      64: faload
      65: fsub
      66: fstore_3
      67: aload_0
      68: getfield      #200                // Field g:[F
      71: iload_2
      72: faload
      73: aload_0
      74: getfield      #198                // Field e:[F
      77: iload_2
      78: faload
      79: fsub
      80: fstore        4
      82: iload         5
      84: ifeq          120
      87: iload_1
      88: ifeq          120
      91: fload_3
      92: fload_3
      93: fmul
      94: fload         4
      96: fload         4
      98: fmul
      99: fadd
     100: aload_0
     101: getfield      #108                // Field b:I
     104: aload_0
     105: getfield      #108                // Field b:I
     108: imul
     109: i2f
     110: fcmpl
     111: ifle          117
     114: iconst_1
     115: istore        6
     117: iload         6
     119: ireturn
     120: iload         5
     122: ifeq          148
     125: iload         8
     127: istore        6
     129: fload_3
     130: invokestatic  #132                // Method java/lang/Math.abs:(F)F
     133: aload_0
     134: getfield      #108                // Field b:I
     137: i2f
     138: fcmpl
     139: ifle          145
     142: iconst_1
     143: istore        6
     145: iload         6
     147: ireturn
     148: iload         7
     150: istore        6
     152: iload_1
     153: ifeq          177
     156: iload         7
     158: istore        6
     160: fload         4
     162: invokestatic  #132                // Method java/lang/Math.abs:(F)F
     165: aload_0
     166: getfield      #108                // Field b:I
     169: i2f
     170: fcmpl
     171: ifle          177
     174: iconst_1
     175: istore        6
     177: iload         6
     179: ireturn

  boolean b(android.view.View, int);
    Code:
       0: aload_1
       1: aload_0
       2: getfield      #181                // Field s:Landroid/view/View;
       5: if_acmpne     18
       8: aload_0
       9: getfield      #57                 // Field c:I
      12: iload_2
      13: if_icmpne     18
      16: iconst_1
      17: ireturn
      18: aload_1
      19: ifnull        47
      22: aload_0
      23: getfield      #75                 // Field r:Landroid/support/v4/widget/p$a;
      26: aload_1
      27: iload_2
      28: invokevirtual #443                // Method android/support/v4/widget/p$a.a:(Landroid/view/View;I)Z
      31: ifeq          47
      34: aload_0
      35: iload_2
      36: putfield      #57                 // Field c:I
      39: aload_0
      40: aload_1
      41: iload_2
      42: invokevirtual #445                // Method a:(Landroid/view/View;I)V
      45: iconst_1
      46: ireturn
      47: iconst_0
      48: ireturn

  public boolean b(android.view.View, int, int);
    Code:
       0: iconst_0
       1: istore        5
       3: aload_1
       4: ifnonnull     9
       7: iconst_0
       8: ireturn
       9: iload         5
      11: istore        4
      13: iload_2
      14: aload_1
      15: invokevirtual #222                // Method android/view/View.getLeft:()I
      18: if_icmplt     60
      21: iload         5
      23: istore        4
      25: iload_2
      26: aload_1
      27: invokevirtual #446                // Method android/view/View.getRight:()I
      30: if_icmpge     60
      33: iload         5
      35: istore        4
      37: iload_3
      38: aload_1
      39: invokevirtual #225                // Method android/view/View.getTop:()I
      42: if_icmplt     60
      45: iload         5
      47: istore        4
      49: iload_3
      50: aload_1
      51: invokevirtual #447                // Method android/view/View.getBottom:()I
      54: if_icmpge     60
      57: iconst_1
      58: istore        4
      60: iload         4
      62: ireturn

  public android.view.View c();
    Code:
       0: aload_0
       1: getfield      #181                // Field s:Landroid/view/View;
       4: areturn

  void c(int);
    Code:
       0: aload_0
       1: getfield      #73                 // Field u:Landroid/view/ViewGroup;
       4: aload_0
       5: getfield      #62                 // Field w:Ljava/lang/Runnable;
       8: invokevirtual #451                // Method android/view/ViewGroup.removeCallbacks:(Ljava/lang/Runnable;)Z
      11: pop
      12: aload_0
      13: getfield      #186                // Field a:I
      16: iload_1
      17: if_icmpeq     45
      20: aload_0
      21: iload_1
      22: putfield      #186                // Field a:I
      25: aload_0
      26: getfield      #75                 // Field r:Landroid/support/v4/widget/p$a;
      29: iload_1
      30: invokevirtual #453                // Method android/support/v4/widget/p$a.a:(I)V
      33: aload_0
      34: getfield      #186                // Field a:I
      37: ifne          45
      40: aload_0
      41: aconst_null
      42: putfield      #181                // Field s:Landroid/view/View;
      45: return

  public boolean c(int, int);
    Code:
       0: aload_0
       1: aload_0
       2: getfield      #181                // Field s:Landroid/view/View;
       5: iload_1
       6: iload_2
       7: invokevirtual #455                // Method b:(Landroid/view/View;II)Z
      10: ireturn

  public int d();
    Code:
       0: aload_0
       1: getfield      #108                // Field b:I
       4: ireturn

  public android.view.View d(int, int);
    Code:
       0: aload_0
       1: getfield      #73                 // Field u:Landroid/view/ViewGroup;
       4: invokevirtual #458                // Method android/view/ViewGroup.getChildCount:()I
       7: iconst_1
       8: isub
       9: istore_3
      10: iload_3
      11: iflt          77
      14: aload_0
      15: getfield      #73                 // Field u:Landroid/view/ViewGroup;
      18: aload_0
      19: getfield      #75                 // Field r:Landroid/support/v4/widget/p$a;
      22: iload_3
      23: invokevirtual #460                // Method android/support/v4/widget/p$a.c:(I)I
      26: invokevirtual #464                // Method android/view/ViewGroup.getChildAt:(I)Landroid/view/View;
      29: astore        4
      31: iload_1
      32: aload         4
      34: invokevirtual #222                // Method android/view/View.getLeft:()I
      37: if_icmplt     70
      40: iload_1
      41: aload         4
      43: invokevirtual #446                // Method android/view/View.getRight:()I
      46: if_icmpge     70
      49: iload_2
      50: aload         4
      52: invokevirtual #225                // Method android/view/View.getTop:()I
      55: if_icmplt     70
      58: iload_2
      59: aload         4
      61: invokevirtual #447                // Method android/view/View.getBottom:()I
      64: if_icmpge     70
      67: aload         4
      69: areturn
      70: iload_3
      71: iconst_1
      72: isub
      73: istore_3
      74: goto          10
      77: aconst_null
      78: areturn

  public boolean d(int);
    Code:
       0: aload_0
       1: getfield      #194                // Field d:[F
       4: arraylength
       5: istore_3
       6: iconst_0
       7: istore_2
       8: iload_2
       9: iload_3
      10: if_icmpge     31
      13: aload_0
      14: iload_1
      15: iload_2
      16: invokevirtual #466                // Method b:(II)Z
      19: ifeq          24
      22: iconst_1
      23: ireturn
      24: iload_2
      25: iconst_1
      26: iadd
      27: istore_2
      28: goto          8
      31: iconst_0
      32: ireturn

  public void e();
    Code:
       0: aload_0
       1: iconst_m1
       2: putfield      #57                 // Field c:I
       5: aload_0
       6: invokespecial #468                // Method f:()V
       9: aload_0
      10: getfield      #305                // Field l:Landroid/view/VelocityTracker;
      13: ifnull        28
      16: aload_0
      17: getfield      #305                // Field l:Landroid/view/VelocityTracker;
      20: invokevirtual #471                // Method android/view/VelocityTracker.recycle:()V
      23: aload_0
      24: aconst_null
      25: putfield      #305                // Field l:Landroid/view/VelocityTracker;
      28: return
}
