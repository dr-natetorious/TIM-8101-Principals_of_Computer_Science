class android.support.v4.view.d$b implements android.support.v4.view.d$a {
  final android.view.GestureDetector$OnGestureListener a;

  android.view.GestureDetector$OnDoubleTapListener b;

  boolean c;

  boolean d;

  android.view.MotionEvent e;

  static {};
    Code:
       0: invokestatic  #50                 // Method android/view/ViewConfiguration.getLongPressTimeout:()I
       3: putstatic     #52                 // Field j:I
       6: invokestatic  #55                 // Method android/view/ViewConfiguration.getTapTimeout:()I
       9: putstatic     #57                 // Field k:I
      12: invokestatic  #60                 // Method android/view/ViewConfiguration.getDoubleTapTimeout:()I
      15: putstatic     #62                 // Field l:I
      18: return

  android.support.v4.view.d$b(android.content.Context, android.view.GestureDetector$OnGestureListener, android.os.Handler);
    Code:
       0: aload_0
       1: invokespecial #67                 // Method java/lang/Object."<init>":()V
       4: aload_3
       5: ifnull        24
       8: aload_0
       9: new           #11                 // class android/support/v4/view/d$b$a
      12: dup
      13: aload_0
      14: aload_3
      15: invokespecial #70                 // Method android/support/v4/view/d$b$a."<init>":(Landroid/support/v4/view/d$b;Landroid/os/Handler;)V
      18: putfield      #72                 // Field m:Landroid/os/Handler;
      21: goto          36
      24: aload_0
      25: new           #11                 // class android/support/v4/view/d$b$a
      28: dup
      29: aload_0
      30: invokespecial #75                 // Method android/support/v4/view/d$b$a."<init>":(Landroid/support/v4/view/d$b;)V
      33: putfield      #72                 // Field m:Landroid/os/Handler;
      36: aload_0
      37: aload_2
      38: putfield      #77                 // Field a:Landroid/view/GestureDetector$OnGestureListener;
      41: aload_2
      42: instanceof    #79                 // class android/view/GestureDetector$OnDoubleTapListener
      45: ifeq          56
      48: aload_0
      49: aload_2
      50: checkcast     #79                 // class android/view/GestureDetector$OnDoubleTapListener
      53: invokevirtual #82                 // Method a:(Landroid/view/GestureDetector$OnDoubleTapListener;)V
      56: aload_0
      57: aload_1
      58: invokespecial #85                 // Method a:(Landroid/content/Context;)V
      61: return

  void a();
    Code:
       0: aload_0
       1: getfield      #72                 // Field m:Landroid/os/Handler;
       4: iconst_3
       5: invokevirtual #142                // Method android/os/Handler.removeMessages:(I)V
       8: aload_0
       9: iconst_0
      10: putfield      #157                // Field d:Z
      13: aload_0
      14: iconst_1
      15: putfield      #159                // Field n:Z
      18: aload_0
      19: getfield      #77                 // Field a:Landroid/view/GestureDetector$OnGestureListener;
      22: aload_0
      23: getfield      #161                // Field e:Landroid/view/MotionEvent;
      26: invokeinterface #167,  2          // InterfaceMethod android/view/GestureDetector$OnGestureListener.onLongPress:(Landroid/view/MotionEvent;)V
      31: return

  public void a(android.view.GestureDetector$OnDoubleTapListener);
    Code:
       0: aload_0
       1: aload_1
       2: putfield      #169                // Field b:Landroid/view/GestureDetector$OnDoubleTapListener;
       5: return

  public boolean a(android.view.MotionEvent);
    Code:
       0: aload_1
       1: invokevirtual #173                // Method android/view/MotionEvent.getAction:()I
       4: istore        6
       6: aload_0
       7: getfield      #144                // Field x:Landroid/view/VelocityTracker;
      10: ifnonnull     20
      13: aload_0
      14: invokestatic  #177                // Method android/view/VelocityTracker.obtain:()Landroid/view/VelocityTracker;
      17: putfield      #144                // Field x:Landroid/view/VelocityTracker;
      20: aload_0
      21: getfield      #144                // Field x:Landroid/view/VelocityTracker;
      24: aload_1
      25: invokevirtual #180                // Method android/view/VelocityTracker.addMovement:(Landroid/view/MotionEvent;)V
      28: iload         6
      30: sipush        255
      33: iand
      34: istore        10
      36: iconst_0
      37: istore        12
      39: iload         10
      41: bipush        6
      43: if_icmpne     52
      46: iconst_1
      47: istore        6
      49: goto          55
      52: iconst_0
      53: istore        6
      55: iload         6
      57: ifeq          69
      60: aload_1
      61: invokevirtual #183                // Method android/view/MotionEvent.getActionIndex:()I
      64: istore        7
      66: goto          72
      69: iconst_m1
      70: istore        7
      72: aload_1
      73: invokevirtual #186                // Method android/view/MotionEvent.getPointerCount:()I
      76: istore        9
      78: iconst_0
      79: istore        8
      81: fconst_0
      82: fstore_3
      83: fconst_0
      84: fstore_2
      85: iload         8
      87: iload         9
      89: if_icmpge     129
      92: iload         7
      94: iload         8
      96: if_icmpne     102
      99: goto          120
     102: fload_3
     103: aload_1
     104: iload         8
     106: invokevirtual #189                // Method android/view/MotionEvent.getX:(I)F
     109: fadd
     110: fstore_3
     111: fload_2
     112: aload_1
     113: iload         8
     115: invokevirtual #191                // Method android/view/MotionEvent.getY:(I)F
     118: fadd
     119: fstore_2
     120: iload         8
     122: iconst_1
     123: iadd
     124: istore        8
     126: goto          85
     129: iload         6
     131: ifeq          143
     134: iload         9
     136: iconst_1
     137: isub
     138: istore        6
     140: goto          147
     143: iload         9
     145: istore        6
     147: iload         6
     149: i2f
     150: fstore        4
     152: fload_3
     153: fload         4
     155: fdiv
     156: fstore_3
     157: fload_2
     158: fload         4
     160: fdiv
     161: fstore_2
     162: iload         10
     164: tableswitch   { // 0 to 6
                     0: 900
                     1: 628
                     2: 389
                     3: 383
                     4: 208
                     5: 357
                     6: 210
               default: 208
          }
     208: iconst_0
     209: ireturn
     210: aload_0
     211: fload_3
     212: putfield      #193                // Field s:F
     215: aload_0
     216: fload_3
     217: putfield      #195                // Field u:F
     220: aload_0
     221: fload_2
     222: putfield      #197                // Field t:F
     225: aload_0
     226: fload_2
     227: putfield      #199                // Field v:F
     230: aload_0
     231: getfield      #144                // Field x:Landroid/view/VelocityTracker;
     234: sipush        1000
     237: aload_0
     238: getfield      #116                // Field i:I
     241: i2f
     242: invokevirtual #203                // Method android/view/VelocityTracker.computeCurrentVelocity:(IF)V
     245: aload_1
     246: invokevirtual #183                // Method android/view/MotionEvent.getActionIndex:()I
     249: istore        7
     251: aload_1
     252: iload         7
     254: invokevirtual #207                // Method android/view/MotionEvent.getPointerId:(I)I
     257: istore        6
     259: aload_0
     260: getfield      #144                // Field x:Landroid/view/VelocityTracker;
     263: iload         6
     265: invokevirtual #210                // Method android/view/VelocityTracker.getXVelocity:(I)F
     268: fstore_2
     269: aload_0
     270: getfield      #144                // Field x:Landroid/view/VelocityTracker;
     273: iload         6
     275: invokevirtual #213                // Method android/view/VelocityTracker.getYVelocity:(I)F
     278: fstore_3
     279: iconst_0
     280: istore        6
     282: iload         12
     284: istore        11
     286: iload         6
     288: iload         9
     290: if_icmpge     1161
     293: iload         6
     295: iload         7
     297: if_icmpne     303
     300: goto          348
     303: aload_1
     304: iload         6
     306: invokevirtual #207                // Method android/view/MotionEvent.getPointerId:(I)I
     309: istore        8
     311: aload_0
     312: getfield      #144                // Field x:Landroid/view/VelocityTracker;
     315: iload         8
     317: invokevirtual #210                // Method android/view/VelocityTracker.getXVelocity:(I)F
     320: fload_2
     321: fmul
     322: aload_0
     323: getfield      #144                // Field x:Landroid/view/VelocityTracker;
     326: iload         8
     328: invokevirtual #213                // Method android/view/VelocityTracker.getYVelocity:(I)F
     331: fload_3
     332: fmul
     333: fadd
     334: fconst_0
     335: fcmpg
     336: ifge          348
     339: aload_0
     340: getfield      #144                // Field x:Landroid/view/VelocityTracker;
     343: invokevirtual #216                // Method android/view/VelocityTracker.clear:()V
     346: iconst_0
     347: ireturn
     348: iload         6
     350: iconst_1
     351: iadd
     352: istore        6
     354: goto          282
     357: aload_0
     358: fload_3
     359: putfield      #193                // Field s:F
     362: aload_0
     363: fload_3
     364: putfield      #195                // Field u:F
     367: aload_0
     368: fload_2
     369: putfield      #197                // Field t:F
     372: aload_0
     373: fload_2
     374: putfield      #199                // Field v:F
     377: aload_0
     378: invokespecial #218                // Method c:()V
     381: iconst_0
     382: ireturn
     383: aload_0
     384: invokespecial #220                // Method b:()V
     387: iconst_0
     388: ireturn
     389: aload_0
     390: getfield      #159                // Field n:Z
     393: ifeq          398
     396: iconst_0
     397: ireturn
     398: aload_0
     399: getfield      #193                // Field s:F
     402: fload_3
     403: fsub
     404: fstore        4
     406: aload_0
     407: getfield      #197                // Field t:F
     410: fload_2
     411: fsub
     412: fstore        5
     414: aload_0
     415: getfield      #151                // Field r:Z
     418: ifeq          434
     421: iconst_0
     422: aload_0
     423: getfield      #169                // Field b:Landroid/view/GestureDetector$OnDoubleTapListener;
     426: aload_1
     427: invokeinterface #223,  2          // InterfaceMethod android/view/GestureDetector$OnDoubleTapListener.onDoubleTapEvent:(Landroid/view/MotionEvent;)Z
     432: ior
     433: ireturn
     434: aload_0
     435: getfield      #155                // Field o:Z
     438: ifeq          571
     441: fload_3
     442: aload_0
     443: getfield      #195                // Field u:F
     446: fsub
     447: f2i
     448: istore        6
     450: fload_2
     451: aload_0
     452: getfield      #199                // Field v:F
     455: fsub
     456: f2i
     457: istore        7
     459: iload         6
     461: iload         6
     463: imul
     464: iload         7
     466: iload         7
     468: imul
     469: iadd
     470: istore        6
     472: iload         6
     474: aload_0
     475: getfield      #118                // Field f:I
     478: if_icmple     543
     481: aload_0
     482: getfield      #77                 // Field a:Landroid/view/GestureDetector$OnGestureListener;
     485: aload_0
     486: getfield      #161                // Field e:Landroid/view/MotionEvent;
     489: aload_1
     490: fload         4
     492: fload         5
     494: invokeinterface #227,  5          // InterfaceMethod android/view/GestureDetector$OnGestureListener.onScroll:(Landroid/view/MotionEvent;Landroid/view/MotionEvent;FF)Z
     499: istore        11
     501: aload_0
     502: fload_3
     503: putfield      #193                // Field s:F
     506: aload_0
     507: fload_2
     508: putfield      #197                // Field t:F
     511: aload_0
     512: iconst_0
     513: putfield      #155                // Field o:Z
     516: aload_0
     517: getfield      #72                 // Field m:Landroid/os/Handler;
     520: iconst_3
     521: invokevirtual #142                // Method android/os/Handler.removeMessages:(I)V
     524: aload_0
     525: getfield      #72                 // Field m:Landroid/os/Handler;
     528: iconst_1
     529: invokevirtual #142                // Method android/os/Handler.removeMessages:(I)V
     532: aload_0
     533: getfield      #72                 // Field m:Landroid/os/Handler;
     536: iconst_2
     537: invokevirtual #142                // Method android/os/Handler.removeMessages:(I)V
     540: goto          546
     543: iconst_0
     544: istore        11
     546: iload         11
     548: istore        12
     550: iload         6
     552: aload_0
     553: getfield      #118                // Field f:I
     556: if_icmple     897
     559: aload_0
     560: iconst_0
     561: putfield      #123                // Field p:Z
     564: iload         11
     566: istore        12
     568: goto          897
     571: fload         4
     573: invokestatic  #233                // Method java/lang/Math.abs:(F)F
     576: fconst_1
     577: fcmpl
     578: ifge          595
     581: iload         12
     583: istore        11
     585: fload         5
     587: invokestatic  #233                // Method java/lang/Math.abs:(F)F
     590: fconst_1
     591: fcmpl
     592: iflt          1161
     595: aload_0
     596: getfield      #77                 // Field a:Landroid/view/GestureDetector$OnGestureListener;
     599: aload_0
     600: getfield      #161                // Field e:Landroid/view/MotionEvent;
     603: aload_1
     604: fload         4
     606: fload         5
     608: invokeinterface #227,  5          // InterfaceMethod android/view/GestureDetector$OnGestureListener.onScroll:(Landroid/view/MotionEvent;Landroid/view/MotionEvent;FF)Z
     613: istore        11
     615: aload_0
     616: fload_3
     617: putfield      #193                // Field s:F
     620: aload_0
     621: fload_2
     622: putfield      #197                // Field t:F
     625: iload         11
     627: ireturn
     628: aload_0
     629: iconst_0
     630: putfield      #153                // Field c:Z
     633: aload_1
     634: invokestatic  #236                // Method android/view/MotionEvent.obtain:(Landroid/view/MotionEvent;)Landroid/view/MotionEvent;
     637: astore        13
     639: aload_0
     640: getfield      #151                // Field r:Z
     643: ifeq          663
     646: aload_0
     647: getfield      #169                // Field b:Landroid/view/GestureDetector$OnDoubleTapListener;
     650: aload_1
     651: invokeinterface #223,  2          // InterfaceMethod android/view/GestureDetector$OnDoubleTapListener.onDoubleTapEvent:(Landroid/view/MotionEvent;)Z
     656: iconst_0
     657: ior
     658: istore        11
     660: goto          828
     663: aload_0
     664: getfield      #159                // Field n:Z
     667: ifeq          686
     670: aload_0
     671: getfield      #72                 // Field m:Landroid/os/Handler;
     674: iconst_3
     675: invokevirtual #142                // Method android/os/Handler.removeMessages:(I)V
     678: aload_0
     679: iconst_0
     680: putfield      #159                // Field n:Z
     683: goto          804
     686: aload_0
     687: getfield      #155                // Field o:Z
     690: ifeq          733
     693: aload_0
     694: getfield      #77                 // Field a:Landroid/view/GestureDetector$OnGestureListener;
     697: aload_1
     698: invokeinterface #239,  2          // InterfaceMethod android/view/GestureDetector$OnGestureListener.onSingleTapUp:(Landroid/view/MotionEvent;)Z
     703: istore        11
     705: aload_0
     706: getfield      #157                // Field d:Z
     709: ifeq          730
     712: aload_0
     713: getfield      #169                // Field b:Landroid/view/GestureDetector$OnDoubleTapListener;
     716: ifnull        730
     719: aload_0
     720: getfield      #169                // Field b:Landroid/view/GestureDetector$OnDoubleTapListener;
     723: aload_1
     724: invokeinterface #242,  2          // InterfaceMethod android/view/GestureDetector$OnDoubleTapListener.onSingleTapConfirmed:(Landroid/view/MotionEvent;)Z
     729: pop
     730: goto          828
     733: aload_0
     734: getfield      #144                // Field x:Landroid/view/VelocityTracker;
     737: astore        14
     739: aload_1
     740: iconst_0
     741: invokevirtual #207                // Method android/view/MotionEvent.getPointerId:(I)I
     744: istore        6
     746: aload         14
     748: sipush        1000
     751: aload_0
     752: getfield      #116                // Field i:I
     755: i2f
     756: invokevirtual #203                // Method android/view/VelocityTracker.computeCurrentVelocity:(IF)V
     759: aload         14
     761: iload         6
     763: invokevirtual #213                // Method android/view/VelocityTracker.getYVelocity:(I)F
     766: fstore_2
     767: aload         14
     769: iload         6
     771: invokevirtual #210                // Method android/view/VelocityTracker.getXVelocity:(I)F
     774: fstore_3
     775: fload_2
     776: invokestatic  #233                // Method java/lang/Math.abs:(F)F
     779: aload_0
     780: getfield      #111                // Field h:I
     783: i2f
     784: fcmpl
     785: ifgt          810
     788: fload_3
     789: invokestatic  #233                // Method java/lang/Math.abs:(F)F
     792: aload_0
     793: getfield      #111                // Field h:I
     796: i2f
     797: fcmpl
     798: ifle          804
     801: goto          810
     804: iconst_0
     805: istore        11
     807: goto          828
     810: aload_0
     811: getfield      #77                 // Field a:Landroid/view/GestureDetector$OnGestureListener;
     814: aload_0
     815: getfield      #161                // Field e:Landroid/view/MotionEvent;
     818: aload_1
     819: fload_3
     820: fload_2
     821: invokeinterface #245,  5          // InterfaceMethod android/view/GestureDetector$OnGestureListener.onFling:(Landroid/view/MotionEvent;Landroid/view/MotionEvent;FF)Z
     826: istore        11
     828: aload_0
     829: getfield      #247                // Field q:Landroid/view/MotionEvent;
     832: ifnull        842
     835: aload_0
     836: getfield      #247                // Field q:Landroid/view/MotionEvent;
     839: invokevirtual #248                // Method android/view/MotionEvent.recycle:()V
     842: aload_0
     843: aload         13
     845: putfield      #247                // Field q:Landroid/view/MotionEvent;
     848: aload_0
     849: getfield      #144                // Field x:Landroid/view/VelocityTracker;
     852: ifnull        867
     855: aload_0
     856: getfield      #144                // Field x:Landroid/view/VelocityTracker;
     859: invokevirtual #149                // Method android/view/VelocityTracker.recycle:()V
     862: aload_0
     863: aconst_null
     864: putfield      #144                // Field x:Landroid/view/VelocityTracker;
     867: aload_0
     868: iconst_0
     869: putfield      #151                // Field r:Z
     872: aload_0
     873: iconst_0
     874: putfield      #157                // Field d:Z
     877: aload_0
     878: getfield      #72                 // Field m:Landroid/os/Handler;
     881: iconst_1
     882: invokevirtual #142                // Method android/os/Handler.removeMessages:(I)V
     885: aload_0
     886: getfield      #72                 // Field m:Landroid/os/Handler;
     889: iconst_2
     890: invokevirtual #142                // Method android/os/Handler.removeMessages:(I)V
     893: iload         11
     895: istore        12
     897: iload         12
     899: ireturn
     900: aload_0
     901: getfield      #169                // Field b:Landroid/view/GestureDetector$OnDoubleTapListener;
     904: ifnull        1014
     907: aload_0
     908: getfield      #72                 // Field m:Landroid/os/Handler;
     911: iconst_3
     912: invokevirtual #252                // Method android/os/Handler.hasMessages:(I)Z
     915: istore        11
     917: iload         11
     919: ifeq          930
     922: aload_0
     923: getfield      #72                 // Field m:Landroid/os/Handler;
     926: iconst_3
     927: invokevirtual #142                // Method android/os/Handler.removeMessages:(I)V
     930: aload_0
     931: getfield      #161                // Field e:Landroid/view/MotionEvent;
     934: ifnull        1001
     937: aload_0
     938: getfield      #247                // Field q:Landroid/view/MotionEvent;
     941: ifnull        1001
     944: iload         11
     946: ifeq          1001
     949: aload_0
     950: aload_0
     951: getfield      #161                // Field e:Landroid/view/MotionEvent;
     954: aload_0
     955: getfield      #247                // Field q:Landroid/view/MotionEvent;
     958: aload_1
     959: invokespecial #254                // Method a:(Landroid/view/MotionEvent;Landroid/view/MotionEvent;Landroid/view/MotionEvent;)Z
     962: ifeq          1001
     965: aload_0
     966: iconst_1
     967: putfield      #151                // Field r:Z
     970: aload_0
     971: getfield      #169                // Field b:Landroid/view/GestureDetector$OnDoubleTapListener;
     974: aload_0
     975: getfield      #161                // Field e:Landroid/view/MotionEvent;
     978: invokeinterface #257,  2          // InterfaceMethod android/view/GestureDetector$OnDoubleTapListener.onDoubleTap:(Landroid/view/MotionEvent;)Z
     983: iconst_0
     984: ior
     985: aload_0
     986: getfield      #169                // Field b:Landroid/view/GestureDetector$OnDoubleTapListener;
     989: aload_1
     990: invokeinterface #223,  2          // InterfaceMethod android/view/GestureDetector$OnDoubleTapListener.onDoubleTapEvent:(Landroid/view/MotionEvent;)Z
     995: ior
     996: istore        6
     998: goto          1017
    1001: aload_0
    1002: getfield      #72                 // Field m:Landroid/os/Handler;
    1005: iconst_3
    1006: getstatic     #62                 // Field l:I
    1009: i2l
    1010: invokevirtual #261                // Method android/os/Handler.sendEmptyMessageDelayed:(IJ)Z
    1013: pop
    1014: iconst_0
    1015: istore        6
    1017: aload_0
    1018: fload_3
    1019: putfield      #193                // Field s:F
    1022: aload_0
    1023: fload_3
    1024: putfield      #195                // Field u:F
    1027: aload_0
    1028: fload_2
    1029: putfield      #197                // Field t:F
    1032: aload_0
    1033: fload_2
    1034: putfield      #199                // Field v:F
    1037: aload_0
    1038: getfield      #161                // Field e:Landroid/view/MotionEvent;
    1041: ifnull        1051
    1044: aload_0
    1045: getfield      #161                // Field e:Landroid/view/MotionEvent;
    1048: invokevirtual #248                // Method android/view/MotionEvent.recycle:()V
    1051: aload_0
    1052: aload_1
    1053: invokestatic  #236                // Method android/view/MotionEvent.obtain:(Landroid/view/MotionEvent;)Landroid/view/MotionEvent;
    1056: putfield      #161                // Field e:Landroid/view/MotionEvent;
    1059: aload_0
    1060: iconst_1
    1061: putfield      #155                // Field o:Z
    1064: aload_0
    1065: iconst_1
    1066: putfield      #123                // Field p:Z
    1069: aload_0
    1070: iconst_1
    1071: putfield      #153                // Field c:Z
    1074: aload_0
    1075: iconst_0
    1076: putfield      #159                // Field n:Z
    1079: aload_0
    1080: iconst_0
    1081: putfield      #157                // Field d:Z
    1084: aload_0
    1085: getfield      #96                 // Field w:Z
    1088: ifeq          1125
    1091: aload_0
    1092: getfield      #72                 // Field m:Landroid/os/Handler;
    1095: iconst_2
    1096: invokevirtual #142                // Method android/os/Handler.removeMessages:(I)V
    1099: aload_0
    1100: getfield      #72                 // Field m:Landroid/os/Handler;
    1103: iconst_2
    1104: aload_0
    1105: getfield      #161                // Field e:Landroid/view/MotionEvent;
    1108: invokevirtual #264                // Method android/view/MotionEvent.getDownTime:()J
    1111: getstatic     #57                 // Field k:I
    1114: i2l
    1115: ladd
    1116: getstatic     #52                 // Field j:I
    1119: i2l
    1120: ladd
    1121: invokevirtual #267                // Method android/os/Handler.sendEmptyMessageAtTime:(IJ)Z
    1124: pop
    1125: aload_0
    1126: getfield      #72                 // Field m:Landroid/os/Handler;
    1129: iconst_1
    1130: aload_0
    1131: getfield      #161                // Field e:Landroid/view/MotionEvent;
    1134: invokevirtual #264                // Method android/view/MotionEvent.getDownTime:()J
    1137: getstatic     #57                 // Field k:I
    1140: i2l
    1141: ladd
    1142: invokevirtual #267                // Method android/os/Handler.sendEmptyMessageAtTime:(IJ)Z
    1145: pop
    1146: iload         6
    1148: aload_0
    1149: getfield      #77                 // Field a:Landroid/view/GestureDetector$OnGestureListener;
    1152: aload_1
    1153: invokeinterface #270,  2          // InterfaceMethod android/view/GestureDetector$OnGestureListener.onDown:(Landroid/view/MotionEvent;)Z
    1158: ior
    1159: istore        11
    1161: iload         11
    1163: ireturn
}
