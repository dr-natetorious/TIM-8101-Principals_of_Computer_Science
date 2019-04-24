class android.support.v7.widget.RecyclerView$w implements java.lang.Runnable {
  android.view.animation.Interpolator a;

  final android.support.v7.widget.RecyclerView b;

  android.support.v7.widget.RecyclerView$w(android.support.v7.widget.RecyclerView);
    Code:
       0: aload_0
       1: aload_1
       2: putfield      #25                 // Field b:Landroid/support/v7/widget/RecyclerView;
       5: aload_0
       6: invokespecial #28                 // Method java/lang/Object."<init>":()V
       9: aload_0
      10: getstatic     #30                 // Field android/support/v7/widget/RecyclerView.I:Landroid/view/animation/Interpolator;
      13: putfield      #32                 // Field a:Landroid/view/animation/Interpolator;
      16: aload_0
      17: iconst_0
      18: putfield      #34                 // Field f:Z
      21: aload_0
      22: iconst_0
      23: putfield      #36                 // Field g:Z
      26: aload_0
      27: new           #38                 // class android/widget/OverScroller
      30: dup
      31: aload_1
      32: invokevirtual #42                 // Method android/support/v7/widget/RecyclerView.getContext:()Landroid/content/Context;
      35: getstatic     #30                 // Field android/support/v7/widget/RecyclerView.I:Landroid/view/animation/Interpolator;
      38: invokespecial #45                 // Method android/widget/OverScroller."<init>":(Landroid/content/Context;Landroid/view/animation/Interpolator;)V
      41: putfield      #47                 // Field e:Landroid/widget/OverScroller;
      44: return

  static android.widget.OverScroller a(android.support.v7.widget.RecyclerView$w);
    Code:
       0: aload_0
       1: getfield      #47                 // Field e:Landroid/widget/OverScroller;
       4: areturn

  void a();
    Code:
       0: aload_0
       1: getfield      #34                 // Field f:Z
       4: ifeq          13
       7: aload_0
       8: iconst_1
       9: putfield      #36                 // Field g:Z
      12: return
      13: aload_0
      14: getfield      #25                 // Field b:Landroid/support/v7/widget/RecyclerView;
      17: aload_0
      18: invokevirtual #96                 // Method android/support/v7/widget/RecyclerView.removeCallbacks:(Ljava/lang/Runnable;)Z
      21: pop
      22: aload_0
      23: getfield      #25                 // Field b:Landroid/support/v7/widget/RecyclerView;
      26: aload_0
      27: invokestatic  #101                // Method android/support/v4/view/s.a:(Landroid/view/View;Ljava/lang/Runnable;)V
      30: return

  public void a(int, int);
    Code:
       0: aload_0
       1: getfield      #25                 // Field b:Landroid/support/v7/widget/RecyclerView;
       4: iconst_2
       5: invokevirtual #106                // Method android/support/v7/widget/RecyclerView.setScrollState:(I)V
       8: aload_0
       9: iconst_0
      10: putfield      #108                // Field d:I
      13: aload_0
      14: iconst_0
      15: putfield      #110                // Field c:I
      18: aload_0
      19: getfield      #47                 // Field e:Landroid/widget/OverScroller;
      22: iconst_0
      23: iconst_0
      24: iload_1
      25: iload_2
      26: ldc           #111                // int -2147483648
      28: ldc           #112                // int 2147483647
      30: ldc           #111                // int -2147483648
      32: ldc           #112                // int 2147483647
      34: invokevirtual #116                // Method android/widget/OverScroller.fling:(IIIIIIII)V
      37: aload_0
      38: invokevirtual #92                 // Method a:()V
      41: return

  public void a(int, int, int);
    Code:
       0: aload_0
       1: iload_1
       2: iload_2
       3: iload_3
       4: getstatic     #30                 // Field android/support/v7/widget/RecyclerView.I:Landroid/view/animation/Interpolator;
       7: invokevirtual #120                // Method a:(IIILandroid/view/animation/Interpolator;)V
      10: return

  public void a(int, int, int, int);
    Code:
       0: aload_0
       1: iload_1
       2: iload_2
       3: aload_0
       4: iload_1
       5: iload_2
       6: iload_3
       7: iload         4
       9: invokespecial #123                // Method b:(IIII)I
      12: invokevirtual #125                // Method a:(III)V
      15: return

  public void a(int, int, int, android.view.animation.Interpolator);
    Code:
       0: aload_0
       1: getfield      #32                 // Field a:Landroid/view/animation/Interpolator;
       4: aload         4
       6: if_acmpeq     35
       9: aload_0
      10: aload         4
      12: putfield      #32                 // Field a:Landroid/view/animation/Interpolator;
      15: aload_0
      16: new           #38                 // class android/widget/OverScroller
      19: dup
      20: aload_0
      21: getfield      #25                 // Field b:Landroid/support/v7/widget/RecyclerView;
      24: invokevirtual #42                 // Method android/support/v7/widget/RecyclerView.getContext:()Landroid/content/Context;
      27: aload         4
      29: invokespecial #45                 // Method android/widget/OverScroller."<init>":(Landroid/content/Context;Landroid/view/animation/Interpolator;)V
      32: putfield      #47                 // Field e:Landroid/widget/OverScroller;
      35: aload_0
      36: getfield      #25                 // Field b:Landroid/support/v7/widget/RecyclerView;
      39: iconst_2
      40: invokevirtual #106                // Method android/support/v7/widget/RecyclerView.setScrollState:(I)V
      43: aload_0
      44: iconst_0
      45: putfield      #108                // Field d:I
      48: aload_0
      49: iconst_0
      50: putfield      #110                // Field c:I
      53: aload_0
      54: getfield      #47                 // Field e:Landroid/widget/OverScroller;
      57: iconst_0
      58: iconst_0
      59: iload_1
      60: iload_2
      61: iload_3
      62: invokevirtual #129                // Method android/widget/OverScroller.startScroll:(IIIII)V
      65: getstatic     #134                // Field android/os/Build$VERSION.SDK_INT:I
      68: bipush        23
      70: if_icmpge     81
      73: aload_0
      74: getfield      #47                 // Field e:Landroid/widget/OverScroller;
      77: invokevirtual #138                // Method android/widget/OverScroller.computeScrollOffset:()Z
      80: pop
      81: aload_0
      82: invokevirtual #92                 // Method a:()V
      85: return

  public void a(int, int, android.view.animation.Interpolator);
    Code:
       0: aload_0
       1: iload_1
       2: iload_2
       3: iconst_0
       4: iconst_0
       5: invokespecial #123                // Method b:(IIII)I
       8: istore        4
      10: aload_3
      11: astore        5
      13: aload_3
      14: ifnonnull     22
      17: getstatic     #30                 // Field android/support/v7/widget/RecyclerView.I:Landroid/view/animation/Interpolator;
      20: astore        5
      22: aload_0
      23: iload_1
      24: iload_2
      25: iload         4
      27: aload         5
      29: invokevirtual #120                // Method a:(IIILandroid/view/animation/Interpolator;)V
      32: return

  public void b();
    Code:
       0: aload_0
       1: getfield      #25                 // Field b:Landroid/support/v7/widget/RecyclerView;
       4: aload_0
       5: invokevirtual #96                 // Method android/support/v7/widget/RecyclerView.removeCallbacks:(Ljava/lang/Runnable;)Z
       8: pop
       9: aload_0
      10: getfield      #47                 // Field e:Landroid/widget/OverScroller;
      13: invokevirtual #142                // Method android/widget/OverScroller.abortAnimation:()V
      16: return

  public void b(int, int);
    Code:
       0: aload_0
       1: iload_1
       2: iload_2
       3: iconst_0
       4: iconst_0
       5: invokevirtual #144                // Method a:(IIII)V
       8: return

  public void run();
    Code:
       0: aload_0
       1: getfield      #25                 // Field b:Landroid/support/v7/widget/RecyclerView;
       4: getfield      #149                // Field android/support/v7/widget/RecyclerView.m:Landroid/support/v7/widget/RecyclerView$i;
       7: ifnonnull     15
      10: aload_0
      11: invokevirtual #151                // Method b:()V
      14: return
      15: aload_0
      16: invokespecial #153                // Method c:()V
      19: aload_0
      20: getfield      #25                 // Field b:Landroid/support/v7/widget/RecyclerView;
      23: invokevirtual #155                // Method android/support/v7/widget/RecyclerView.d:()V
      26: aload_0
      27: getfield      #47                 // Field e:Landroid/widget/OverScroller;
      30: astore        13
      32: aload_0
      33: getfield      #25                 // Field b:Landroid/support/v7/widget/RecyclerView;
      36: getfield      #149                // Field android/support/v7/widget/RecyclerView.m:Landroid/support/v7/widget/RecyclerView$i;
      39: getfield      #161                // Field android/support/v7/widget/RecyclerView$i.t:Landroid/support/v7/widget/RecyclerView$t;
      42: astore        14
      44: aload         13
      46: invokevirtual #138                // Method android/widget/OverScroller.computeScrollOffset:()Z
      49: ifeq          881
      52: aload_0
      53: getfield      #25                 // Field b:Landroid/support/v7/widget/RecyclerView;
      56: invokestatic  #164                // Method android/support/v7/widget/RecyclerView.a:(Landroid/support/v7/widget/RecyclerView;)[I
      59: astore        15
      61: aload         13
      63: invokevirtual #167                // Method android/widget/OverScroller.getCurrX:()I
      66: istore        11
      68: aload         13
      70: invokevirtual #170                // Method android/widget/OverScroller.getCurrY:()I
      73: istore        12
      75: iload         11
      77: aload_0
      78: getfield      #110                // Field c:I
      81: isub
      82: istore_2
      83: iload         12
      85: aload_0
      86: getfield      #108                // Field d:I
      89: isub
      90: istore_1
      91: aload_0
      92: iload         11
      94: putfield      #110                // Field c:I
      97: aload_0
      98: iload         12
     100: putfield      #108                // Field d:I
     103: iload_2
     104: istore        6
     106: iload_1
     107: istore        5
     109: aload_0
     110: getfield      #25                 // Field b:Landroid/support/v7/widget/RecyclerView;
     113: iload_2
     114: iload_1
     115: aload         15
     117: aconst_null
     118: iconst_1
     119: invokevirtual #173                // Method android/support/v7/widget/RecyclerView.a:(II[I[II)Z
     122: ifeq          141
     125: iload_2
     126: aload         15
     128: iconst_0
     129: iaload
     130: isub
     131: istore        6
     133: iload_1
     134: aload         15
     136: iconst_1
     137: iaload
     138: isub
     139: istore        5
     141: aload_0
     142: getfield      #25                 // Field b:Landroid/support/v7/widget/RecyclerView;
     145: getfield      #177                // Field android/support/v7/widget/RecyclerView.l:Landroid/support/v7/widget/RecyclerView$a;
     148: ifnull        446
     151: aload_0
     152: getfield      #25                 // Field b:Landroid/support/v7/widget/RecyclerView;
     155: invokevirtual #179                // Method android/support/v7/widget/RecyclerView.e:()V
     158: aload_0
     159: getfield      #25                 // Field b:Landroid/support/v7/widget/RecyclerView;
     162: invokevirtual #181                // Method android/support/v7/widget/RecyclerView.l:()V
     165: ldc           #183                // String RV Scroll
     167: invokestatic  #188                // Method android/support/v4/e/d.a:(Ljava/lang/String;)V
     170: aload_0
     171: getfield      #25                 // Field b:Landroid/support/v7/widget/RecyclerView;
     174: aload_0
     175: getfield      #25                 // Field b:Landroid/support/v7/widget/RecyclerView;
     178: getfield      #192                // Field android/support/v7/widget/RecyclerView.C:Landroid/support/v7/widget/RecyclerView$u;
     181: invokevirtual #195                // Method android/support/v7/widget/RecyclerView.a:(Landroid/support/v7/widget/RecyclerView$u;)V
     184: iload         6
     186: ifeq          224
     189: aload_0
     190: getfield      #25                 // Field b:Landroid/support/v7/widget/RecyclerView;
     193: getfield      #149                // Field android/support/v7/widget/RecyclerView.m:Landroid/support/v7/widget/RecyclerView$i;
     196: iload         6
     198: aload_0
     199: getfield      #25                 // Field b:Landroid/support/v7/widget/RecyclerView;
     202: getfield      #198                // Field android/support/v7/widget/RecyclerView.d:Landroid/support/v7/widget/RecyclerView$p;
     205: aload_0
     206: getfield      #25                 // Field b:Landroid/support/v7/widget/RecyclerView;
     209: getfield      #192                // Field android/support/v7/widget/RecyclerView.C:Landroid/support/v7/widget/RecyclerView$u;
     212: invokevirtual #201                // Method android/support/v7/widget/RecyclerView$i.a:(ILandroid/support/v7/widget/RecyclerView$p;Landroid/support/v7/widget/RecyclerView$u;)I
     215: istore_1
     216: iload         6
     218: iload_1
     219: isub
     220: istore_2
     221: goto          228
     224: iconst_0
     225: istore_1
     226: iconst_0
     227: istore_2
     228: iload         5
     230: ifeq          269
     233: aload_0
     234: getfield      #25                 // Field b:Landroid/support/v7/widget/RecyclerView;
     237: getfield      #149                // Field android/support/v7/widget/RecyclerView.m:Landroid/support/v7/widget/RecyclerView$i;
     240: iload         5
     242: aload_0
     243: getfield      #25                 // Field b:Landroid/support/v7/widget/RecyclerView;
     246: getfield      #198                // Field android/support/v7/widget/RecyclerView.d:Landroid/support/v7/widget/RecyclerView$p;
     249: aload_0
     250: getfield      #25                 // Field b:Landroid/support/v7/widget/RecyclerView;
     253: getfield      #192                // Field android/support/v7/widget/RecyclerView.C:Landroid/support/v7/widget/RecyclerView$u;
     256: invokevirtual #203                // Method android/support/v7/widget/RecyclerView$i.b:(ILandroid/support/v7/widget/RecyclerView$p;Landroid/support/v7/widget/RecyclerView$u;)I
     259: istore_3
     260: iload         5
     262: iload_3
     263: isub
     264: istore        4
     266: goto          274
     269: iconst_0
     270: istore_3
     271: iconst_0
     272: istore        4
     274: invokestatic  #204                // Method android/support/v4/e/d.a:()V
     277: aload_0
     278: getfield      #25                 // Field b:Landroid/support/v7/widget/RecyclerView;
     281: invokevirtual #206                // Method android/support/v7/widget/RecyclerView.w:()V
     284: aload_0
     285: getfield      #25                 // Field b:Landroid/support/v7/widget/RecyclerView;
     288: invokevirtual #208                // Method android/support/v7/widget/RecyclerView.m:()V
     291: aload_0
     292: getfield      #25                 // Field b:Landroid/support/v7/widget/RecyclerView;
     295: iconst_0
     296: invokevirtual #211                // Method android/support/v7/widget/RecyclerView.a:(Z)V
     299: iload_1
     300: istore        7
     302: iload_2
     303: istore        10
     305: iload_3
     306: istore        9
     308: iload         4
     310: istore        8
     312: aload         14
     314: ifnull        458
     317: iload_1
     318: istore        7
     320: iload_2
     321: istore        10
     323: iload_3
     324: istore        9
     326: iload         4
     328: istore        8
     330: aload         14
     332: invokevirtual #215                // Method android/support/v7/widget/RecyclerView$t.b:()Z
     335: ifne          458
     338: iload_1
     339: istore        7
     341: iload_2
     342: istore        10
     344: iload_3
     345: istore        9
     347: iload         4
     349: istore        8
     351: aload         14
     353: invokevirtual #217                // Method android/support/v7/widget/RecyclerView$t.c:()Z
     356: ifeq          458
     359: aload_0
     360: getfield      #25                 // Field b:Landroid/support/v7/widget/RecyclerView;
     363: getfield      #192                // Field android/support/v7/widget/RecyclerView.C:Landroid/support/v7/widget/RecyclerView$u;
     366: invokevirtual #221                // Method android/support/v7/widget/RecyclerView$u.e:()I
     369: istore        7
     371: iload         7
     373: ifne          397
     376: aload         14
     378: invokevirtual #222                // Method android/support/v7/widget/RecyclerView$t.a:()V
     381: iload_1
     382: istore        7
     384: iload_2
     385: istore        10
     387: iload_3
     388: istore        9
     390: iload         4
     392: istore        8
     394: goto          458
     397: aload         14
     399: invokevirtual #224                // Method android/support/v7/widget/RecyclerView$t.d:()I
     402: iload         7
     404: if_icmplt     416
     407: aload         14
     409: iload         7
     411: iconst_1
     412: isub
     413: invokevirtual #226                // Method android/support/v7/widget/RecyclerView$t.a:(I)V
     416: aload         14
     418: iload         6
     420: iload_2
     421: isub
     422: iload         5
     424: iload         4
     426: isub
     427: invokestatic  #229                // Method android/support/v7/widget/RecyclerView$t.a:(Landroid/support/v7/widget/RecyclerView$t;II)V
     430: iload_1
     431: istore        7
     433: iload_2
     434: istore        10
     436: iload_3
     437: istore        9
     439: iload         4
     441: istore        8
     443: goto          458
     446: iconst_0
     447: istore        7
     449: iconst_0
     450: istore        10
     452: iconst_0
     453: istore        9
     455: iconst_0
     456: istore        8
     458: aload_0
     459: getfield      #25                 // Field b:Landroid/support/v7/widget/RecyclerView;
     462: getfield      #233                // Field android/support/v7/widget/RecyclerView.o:Ljava/util/ArrayList;
     465: invokevirtual #238                // Method java/util/ArrayList.isEmpty:()Z
     468: ifne          478
     471: aload_0
     472: getfield      #25                 // Field b:Landroid/support/v7/widget/RecyclerView;
     475: invokevirtual #241                // Method android/support/v7/widget/RecyclerView.invalidate:()V
     478: aload_0
     479: getfield      #25                 // Field b:Landroid/support/v7/widget/RecyclerView;
     482: invokevirtual #244                // Method android/support/v7/widget/RecyclerView.getOverScrollMode:()I
     485: iconst_2
     486: if_icmpeq     500
     489: aload_0
     490: getfield      #25                 // Field b:Landroid/support/v7/widget/RecyclerView;
     493: iload         6
     495: iload         5
     497: invokevirtual #246                // Method android/support/v7/widget/RecyclerView.c:(II)V
     500: aload_0
     501: getfield      #25                 // Field b:Landroid/support/v7/widget/RecyclerView;
     504: iload         7
     506: iload         9
     508: iload         10
     510: iload         8
     512: aconst_null
     513: iconst_1
     514: invokevirtual #249                // Method android/support/v7/widget/RecyclerView.a:(IIII[II)Z
     517: ifne          658
     520: iload         10
     522: ifne          530
     525: iload         8
     527: ifeq          658
     530: aload         13
     532: invokevirtual #253                // Method android/widget/OverScroller.getCurrVelocity:()F
     535: f2i
     536: istore_2
     537: iload         10
     539: iload         11
     541: if_icmpeq     565
     544: iload         10
     546: ifge          555
     549: iload_2
     550: ineg
     551: istore_1
     552: goto          567
     555: iload         10
     557: ifle          565
     560: iload_2
     561: istore_1
     562: goto          567
     565: iconst_0
     566: istore_1
     567: iload         8
     569: iload         12
     571: if_icmpeq     593
     574: iload         8
     576: ifge          585
     579: iload_2
     580: ineg
     581: istore_2
     582: goto          595
     585: iload         8
     587: ifle          593
     590: goto          595
     593: iconst_0
     594: istore_2
     595: aload_0
     596: getfield      #25                 // Field b:Landroid/support/v7/widget/RecyclerView;
     599: invokevirtual #244                // Method android/support/v7/widget/RecyclerView.getOverScrollMode:()I
     602: iconst_2
     603: if_icmpeq     615
     606: aload_0
     607: getfield      #25                 // Field b:Landroid/support/v7/widget/RecyclerView;
     610: iload_1
     611: iload_2
     612: invokevirtual #255                // Method android/support/v7/widget/RecyclerView.d:(II)V
     615: iload_1
     616: ifne          634
     619: iload         10
     621: iload         11
     623: if_icmpeq     634
     626: aload         13
     628: invokevirtual #258                // Method android/widget/OverScroller.getFinalX:()I
     631: ifne          658
     634: iload_2
     635: ifne          653
     638: iload         8
     640: iload         12
     642: if_icmpeq     653
     645: aload         13
     647: invokevirtual #261                // Method android/widget/OverScroller.getFinalY:()I
     650: ifne          658
     653: aload         13
     655: invokevirtual #142                // Method android/widget/OverScroller.abortAnimation:()V
     658: iload         7
     660: ifne          668
     663: iload         9
     665: ifeq          679
     668: aload_0
     669: getfield      #25                 // Field b:Landroid/support/v7/widget/RecyclerView;
     672: iload         7
     674: iload         9
     676: invokevirtual #264                // Method android/support/v7/widget/RecyclerView.i:(II)V
     679: aload_0
     680: getfield      #25                 // Field b:Landroid/support/v7/widget/RecyclerView;
     683: invokestatic  #267                // Method android/support/v7/widget/RecyclerView.b:(Landroid/support/v7/widget/RecyclerView;)Z
     686: ifne          696
     689: aload_0
     690: getfield      #25                 // Field b:Landroid/support/v7/widget/RecyclerView;
     693: invokevirtual #241                // Method android/support/v7/widget/RecyclerView.invalidate:()V
     696: iload         5
     698: ifeq          726
     701: aload_0
     702: getfield      #25                 // Field b:Landroid/support/v7/widget/RecyclerView;
     705: getfield      #149                // Field android/support/v7/widget/RecyclerView.m:Landroid/support/v7/widget/RecyclerView$i;
     708: invokevirtual #269                // Method android/support/v7/widget/RecyclerView$i.f:()Z
     711: ifeq          726
     714: iload         9
     716: iload         5
     718: if_icmpne     726
     721: iconst_1
     722: istore_1
     723: goto          728
     726: iconst_0
     727: istore_1
     728: iload         6
     730: ifeq          758
     733: aload_0
     734: getfield      #25                 // Field b:Landroid/support/v7/widget/RecyclerView;
     737: getfield      #149                // Field android/support/v7/widget/RecyclerView.m:Landroid/support/v7/widget/RecyclerView$i;
     740: invokevirtual #271                // Method android/support/v7/widget/RecyclerView$i.e:()Z
     743: ifeq          758
     746: iload         7
     748: iload         6
     750: if_icmpne     758
     753: iconst_1
     754: istore_2
     755: goto          760
     758: iconst_0
     759: istore_2
     760: iload         6
     762: ifne          770
     765: iload         5
     767: ifeq          786
     770: iload_2
     771: ifne          786
     774: iload_1
     775: ifeq          781
     778: goto          786
     781: iconst_0
     782: istore_1
     783: goto          788
     786: iconst_1
     787: istore_1
     788: aload         13
     790: invokevirtual #274                // Method android/widget/OverScroller.isFinished:()Z
     793: ifne          849
     796: iload_1
     797: ifne          814
     800: aload_0
     801: getfield      #25                 // Field b:Landroid/support/v7/widget/RecyclerView;
     804: iconst_1
     805: invokevirtual #278                // Method android/support/v7/widget/RecyclerView.h:(I)Z
     808: ifne          814
     811: goto          849
     814: aload_0
     815: invokevirtual #92                 // Method a:()V
     818: aload_0
     819: getfield      #25                 // Field b:Landroid/support/v7/widget/RecyclerView;
     822: getfield      #282                // Field android/support/v7/widget/RecyclerView.A:Landroid/support/v7/widget/at;
     825: ifnull        881
     828: aload_0
     829: getfield      #25                 // Field b:Landroid/support/v7/widget/RecyclerView;
     832: getfield      #282                // Field android/support/v7/widget/RecyclerView.A:Landroid/support/v7/widget/at;
     835: aload_0
     836: getfield      #25                 // Field b:Landroid/support/v7/widget/RecyclerView;
     839: iload         6
     841: iload         5
     843: invokevirtual #287                // Method android/support/v7/widget/at.a:(Landroid/support/v7/widget/RecyclerView;II)V
     846: goto          881
     849: aload_0
     850: getfield      #25                 // Field b:Landroid/support/v7/widget/RecyclerView;
     853: iconst_0
     854: invokevirtual #106                // Method android/support/v7/widget/RecyclerView.setScrollState:(I)V
     857: invokestatic  #290                // Method android/support/v7/widget/RecyclerView.y:()Z
     860: ifeq          873
     863: aload_0
     864: getfield      #25                 // Field b:Landroid/support/v7/widget/RecyclerView;
     867: getfield      #294                // Field android/support/v7/widget/RecyclerView.B:Landroid/support/v7/widget/at$a;
     870: invokevirtual #297                // Method android/support/v7/widget/at$a.a:()V
     873: aload_0
     874: getfield      #25                 // Field b:Landroid/support/v7/widget/RecyclerView;
     877: iconst_1
     878: invokevirtual #299                // Method android/support/v7/widget/RecyclerView.g:(I)V
     881: aload         14
     883: ifnull        913
     886: aload         14
     888: invokevirtual #215                // Method android/support/v7/widget/RecyclerView$t.b:()Z
     891: ifeq          901
     894: aload         14
     896: iconst_0
     897: iconst_0
     898: invokestatic  #229                // Method android/support/v7/widget/RecyclerView$t.a:(Landroid/support/v7/widget/RecyclerView$t;II)V
     901: aload_0
     902: getfield      #36                 // Field g:Z
     905: ifne          913
     908: aload         14
     910: invokevirtual #222                // Method android/support/v7/widget/RecyclerView$t.a:()V
     913: aload_0
     914: invokespecial #300                // Method d:()V
     917: return
}
