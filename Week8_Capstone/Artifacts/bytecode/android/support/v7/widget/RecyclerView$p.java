public final class android.support.v7.widget.RecyclerView$p {
  final java.util.ArrayList<android.support.v7.widget.RecyclerView$x> a;

  java.util.ArrayList<android.support.v7.widget.RecyclerView$x> b;

  final java.util.ArrayList<android.support.v7.widget.RecyclerView$x> c;

  int d;

  android.support.v7.widget.RecyclerView$o e;

  final android.support.v7.widget.RecyclerView f;

  public android.support.v7.widget.RecyclerView$p(android.support.v7.widget.RecyclerView);
    Code:
       0: aload_0
       1: aload_1
       2: putfield      #28                 // Field f:Landroid/support/v7/widget/RecyclerView;
       5: aload_0
       6: invokespecial #31                 // Method java/lang/Object."<init>":()V
       9: aload_0
      10: new           #33                 // class java/util/ArrayList
      13: dup
      14: invokespecial #34                 // Method java/util/ArrayList."<init>":()V
      17: putfield      #36                 // Field a:Ljava/util/ArrayList;
      20: aload_0
      21: aconst_null
      22: putfield      #38                 // Field b:Ljava/util/ArrayList;
      25: aload_0
      26: new           #33                 // class java/util/ArrayList
      29: dup
      30: invokespecial #34                 // Method java/util/ArrayList."<init>":()V
      33: putfield      #40                 // Field c:Ljava/util/ArrayList;
      36: aload_0
      37: aload_0
      38: getfield      #36                 // Field a:Ljava/util/ArrayList;
      41: invokestatic  #46                 // Method java/util/Collections.unmodifiableList:(Ljava/util/List;)Ljava/util/List;
      44: putfield      #48                 // Field g:Ljava/util/List;
      47: aload_0
      48: iconst_2
      49: putfield      #50                 // Field h:I
      52: aload_0
      53: iconst_2
      54: putfield      #52                 // Field d:I
      57: return

  android.support.v7.widget.RecyclerView$x a(int, boolean, long);
    Code:
       0: iload_1
       1: iflt          1062
       4: iload_1
       5: aload_0
       6: getfield      #28                 // Field f:Landroid/support/v7/widget/RecyclerView;
       9: getfield      #113                // Field android/support/v7/widget/RecyclerView.C:Landroid/support/v7/widget/RecyclerView$u;
      12: invokevirtual #154                // Method android/support/v7/widget/RecyclerView$u.e:()I
      15: if_icmplt     21
      18: goto          1062
      21: aload_0
      22: getfield      #28                 // Field f:Landroid/support/v7/widget/RecyclerView;
      25: getfield      #113                // Field android/support/v7/widget/RecyclerView.C:Landroid/support/v7/widget/RecyclerView$u;
      28: invokevirtual #118                // Method android/support/v7/widget/RecyclerView$u.a:()Z
      31: istore        10
      33: iconst_1
      34: istore        9
      36: iload         10
      38: ifeq          63
      41: aload_0
      42: iload_1
      43: invokevirtual #157                // Method f:(I)Landroid/support/v7/widget/RecyclerView$x;
      46: astore        16
      48: aload         16
      50: astore        15
      52: aload         16
      54: ifnull        66
      57: iconst_1
      58: istore        6
      60: goto          73
      63: aconst_null
      64: astore        15
      66: iconst_0
      67: istore        6
      69: aload         15
      71: astore        16
      73: aload         16
      75: astore        15
      77: iload         6
      79: istore        5
      81: aload         16
      83: ifnonnull     191
      86: aload_0
      87: iload_1
      88: iload_2
      89: invokevirtual #160                // Method b:(IZ)Landroid/support/v7/widget/RecyclerView$x;
      92: astore        16
      94: aload         16
      96: astore        15
      98: iload         6
     100: istore        5
     102: aload         16
     104: ifnull        191
     107: aload_0
     108: aload         16
     110: invokevirtual #163                // Method a:(Landroid/support/v7/widget/RecyclerView$x;)Z
     113: ifne          184
     116: iload_2
     117: ifne          174
     120: aload         16
     122: iconst_4
     123: invokevirtual #139                // Method android/support/v7/widget/RecyclerView$x.b:(I)V
     126: aload         16
     128: invokevirtual #165                // Method android/support/v7/widget/RecyclerView$x.i:()Z
     131: ifeq          155
     134: aload_0
     135: getfield      #28                 // Field f:Landroid/support/v7/widget/RecyclerView;
     138: aload         16
     140: getfield      #126                // Field android/support/v7/widget/RecyclerView$x.a:Landroid/view/View;
     143: iconst_0
     144: invokevirtual #169                // Method android/support/v7/widget/RecyclerView.removeDetachedView:(Landroid/view/View;Z)V
     147: aload         16
     149: invokevirtual #172                // Method android/support/v7/widget/RecyclerView$x.j:()V
     152: goto          168
     155: aload         16
     157: invokevirtual #175                // Method android/support/v7/widget/RecyclerView$x.k:()Z
     160: ifeq          168
     163: aload         16
     165: invokevirtual #177                // Method android/support/v7/widget/RecyclerView$x.l:()V
     168: aload_0
     169: aload         16
     171: invokevirtual #179                // Method b:(Landroid/support/v7/widget/RecyclerView$x;)V
     174: aconst_null
     175: astore        15
     177: iload         6
     179: istore        5
     181: goto          191
     184: iconst_1
     185: istore        5
     187: aload         16
     189: astore        15
     191: aload         15
     193: astore        17
     195: iload         5
     197: istore        7
     199: aload         15
     201: ifnonnull     761
     204: aload_0
     205: getfield      #28                 // Field f:Landroid/support/v7/widget/RecyclerView;
     208: getfield      #182                // Field android/support/v7/widget/RecyclerView.e:Landroid/support/v7/widget/f;
     211: iload_1
     212: invokevirtual #187                // Method android/support/v7/widget/f.b:(I)I
     215: istore        7
     217: iload         7
     219: iflt          659
     222: iload         7
     224: aload_0
     225: getfield      #28                 // Field f:Landroid/support/v7/widget/RecyclerView;
     228: getfield      #98                 // Field android/support/v7/widget/RecyclerView.l:Landroid/support/v7/widget/RecyclerView$a;
     231: invokevirtual #189                // Method android/support/v7/widget/RecyclerView$a.a:()I
     234: if_icmplt     240
     237: goto          659
     240: aload_0
     241: getfield      #28                 // Field f:Landroid/support/v7/widget/RecyclerView;
     244: getfield      #98                 // Field android/support/v7/widget/RecyclerView.l:Landroid/support/v7/widget/RecyclerView$a;
     247: iload         7
     249: invokevirtual #190                // Method android/support/v7/widget/RecyclerView$a.b:(I)I
     252: istore        8
     254: aload         15
     256: astore        16
     258: iload         5
     260: istore        6
     262: aload_0
     263: getfield      #28                 // Field f:Landroid/support/v7/widget/RecyclerView;
     266: getfield      #98                 // Field android/support/v7/widget/RecyclerView.l:Landroid/support/v7/widget/RecyclerView$a;
     269: invokevirtual #192                // Method android/support/v7/widget/RecyclerView$a.d:()Z
     272: ifeq          323
     275: aload_0
     276: aload_0
     277: getfield      #28                 // Field f:Landroid/support/v7/widget/RecyclerView;
     280: getfield      #98                 // Field android/support/v7/widget/RecyclerView.l:Landroid/support/v7/widget/RecyclerView$a;
     283: iload         7
     285: invokevirtual #195                // Method android/support/v7/widget/RecyclerView$a.a:(I)J
     288: iload         8
     290: iload_2
     291: invokevirtual #198                // Method a:(JIZ)Landroid/support/v7/widget/RecyclerView$x;
     294: astore        15
     296: aload         15
     298: astore        16
     300: iload         5
     302: istore        6
     304: aload         15
     306: ifnull        323
     309: aload         15
     311: iload         7
     313: putfield      #200                // Field android/support/v7/widget/RecyclerView$x.c:I
     316: iconst_1
     317: istore        6
     319: aload         15
     321: astore        16
     323: aload         16
     325: astore        15
     327: aload         16
     329: ifnonnull     479
     332: aload         16
     334: astore        15
     336: aload_0
     337: getfield      #202                // Field i:Landroid/support/v7/widget/RecyclerView$v;
     340: ifnull        479
     343: aload_0
     344: getfield      #202                // Field i:Landroid/support/v7/widget/RecyclerView$v;
     347: aload_0
     348: iload_1
     349: iload         8
     351: invokevirtual #207                // Method android/support/v7/widget/RecyclerView$v.a:(Landroid/support/v7/widget/RecyclerView$p;II)Landroid/view/View;
     354: astore        17
     356: aload         16
     358: astore        15
     360: aload         17
     362: ifnull        479
     365: aload_0
     366: getfield      #28                 // Field f:Landroid/support/v7/widget/RecyclerView;
     369: aload         17
     371: invokevirtual #210                // Method android/support/v7/widget/RecyclerView.b:(Landroid/view/View;)Landroid/support/v7/widget/RecyclerView$x;
     374: astore        16
     376: aload         16
     378: ifnonnull     424
     381: new           #212                // class java/lang/StringBuilder
     384: dup
     385: invokespecial #213                // Method java/lang/StringBuilder."<init>":()V
     388: astore        15
     390: aload         15
     392: ldc           #215                // String getViewForPositionAndType returned a view which does not have a ViewHolder
     394: invokevirtual #219                // Method java/lang/StringBuilder.append:(Ljava/lang/String;)Ljava/lang/StringBuilder;
     397: pop
     398: aload         15
     400: aload_0
     401: getfield      #28                 // Field f:Landroid/support/v7/widget/RecyclerView;
     404: invokevirtual #222                // Method android/support/v7/widget/RecyclerView.a:()Ljava/lang/String;
     407: invokevirtual #219                // Method java/lang/StringBuilder.append:(Ljava/lang/String;)Ljava/lang/StringBuilder;
     410: pop
     411: new           #224                // class java/lang/IllegalArgumentException
     414: dup
     415: aload         15
     417: invokevirtual #227                // Method java/lang/StringBuilder.toString:()Ljava/lang/String;
     420: invokespecial #230                // Method java/lang/IllegalArgumentException."<init>":(Ljava/lang/String;)V
     423: athrow
     424: aload         16
     426: astore        15
     428: aload         16
     430: invokevirtual #232                // Method android/support/v7/widget/RecyclerView$x.c:()Z
     433: ifeq          479
     436: new           #212                // class java/lang/StringBuilder
     439: dup
     440: invokespecial #213                // Method java/lang/StringBuilder."<init>":()V
     443: astore        15
     445: aload         15
     447: ldc           #234                // String getViewForPositionAndType returned a view that is ignored. You must call stopIgnoring before returning this view.
     449: invokevirtual #219                // Method java/lang/StringBuilder.append:(Ljava/lang/String;)Ljava/lang/StringBuilder;
     452: pop
     453: aload         15
     455: aload_0
     456: getfield      #28                 // Field f:Landroid/support/v7/widget/RecyclerView;
     459: invokevirtual #222                // Method android/support/v7/widget/RecyclerView.a:()Ljava/lang/String;
     462: invokevirtual #219                // Method java/lang/StringBuilder.append:(Ljava/lang/String;)Ljava/lang/StringBuilder;
     465: pop
     466: new           #224                // class java/lang/IllegalArgumentException
     469: dup
     470: aload         15
     472: invokevirtual #227                // Method java/lang/StringBuilder.toString:()Ljava/lang/String;
     475: invokespecial #230                // Method java/lang/IllegalArgumentException."<init>":(Ljava/lang/String;)V
     478: athrow
     479: aload         15
     481: astore        16
     483: aload         15
     485: ifnonnull     533
     488: aload_0
     489: invokevirtual #237                // Method g:()Landroid/support/v7/widget/RecyclerView$o;
     492: iload         8
     494: invokevirtual #239                // Method android/support/v7/widget/RecyclerView$o.a:(I)Landroid/support/v7/widget/RecyclerView$x;
     497: astore        15
     499: aload         15
     501: astore        16
     503: aload         15
     505: ifnull        533
     508: aload         15
     510: invokevirtual #242                // Method android/support/v7/widget/RecyclerView$x.v:()V
     513: aload         15
     515: astore        16
     517: getstatic     #245                // Field android/support/v7/widget/RecyclerView.a:Z
     520: ifeq          533
     523: aload_0
     524: aload         15
     526: invokespecial #247                // Method f:(Landroid/support/v7/widget/RecyclerView$x;)V
     529: aload         15
     531: astore        16
     533: aload         16
     535: astore        17
     537: iload         6
     539: istore        7
     541: aload         16
     543: ifnonnull     761
     546: aload_0
     547: getfield      #28                 // Field f:Landroid/support/v7/widget/RecyclerView;
     550: invokevirtual #85                 // Method android/support/v7/widget/RecyclerView.getNanoTime:()J
     553: lstore        11
     555: lload_3
     556: ldc2_w        #86                 // long 9223372036854775807l
     559: lcmp
     560: ifeq          580
     563: aload_0
     564: getfield      #89                 // Field e:Landroid/support/v7/widget/RecyclerView$o;
     567: iload         8
     569: lload         11
     571: lload_3
     572: invokevirtual #249                // Method android/support/v7/widget/RecyclerView$o.a:(IJJ)Z
     575: ifne          580
     578: aconst_null
     579: areturn
     580: aload_0
     581: getfield      #28                 // Field f:Landroid/support/v7/widget/RecyclerView;
     584: getfield      #98                 // Field android/support/v7/widget/RecyclerView.l:Landroid/support/v7/widget/RecyclerView$a;
     587: aload_0
     588: getfield      #28                 // Field f:Landroid/support/v7/widget/RecyclerView;
     591: iload         8
     593: invokevirtual #252                // Method android/support/v7/widget/RecyclerView$a.c:(Landroid/view/ViewGroup;I)Landroid/support/v7/widget/RecyclerView$x;
     596: astore        15
     598: invokestatic  #255                // Method android/support/v7/widget/RecyclerView.y:()Z
     601: ifeq          633
     604: aload         15
     606: getfield      #126                // Field android/support/v7/widget/RecyclerView$x.a:Landroid/view/View;
     609: invokestatic  #258                // Method android/support/v7/widget/RecyclerView.l:(Landroid/view/View;)Landroid/support/v7/widget/RecyclerView;
     612: astore        16
     614: aload         16
     616: ifnull        633
     619: aload         15
     621: new           #260                // class java/lang/ref/WeakReference
     624: dup
     625: aload         16
     627: invokespecial #263                // Method java/lang/ref/WeakReference."<init>":(Ljava/lang/Object;)V
     630: putfield      #266                // Field android/support/v7/widget/RecyclerView$x.b:Ljava/lang/ref/WeakReference;
     633: aload_0
     634: getfield      #28                 // Field f:Landroid/support/v7/widget/RecyclerView;
     637: invokevirtual #85                 // Method android/support/v7/widget/RecyclerView.getNanoTime:()J
     640: lstore        13
     642: aload_0
     643: getfield      #89                 // Field e:Landroid/support/v7/widget/RecyclerView$o;
     646: iload         8
     648: lload         13
     650: lload         11
     652: lsub
     653: invokevirtual #268                // Method android/support/v7/widget/RecyclerView$o.a:(IJ)V
     656: goto          769
     659: new           #212                // class java/lang/StringBuilder
     662: dup
     663: invokespecial #213                // Method java/lang/StringBuilder."<init>":()V
     666: astore        15
     668: aload         15
     670: ldc_w         #270                // String Inconsistency detected. Invalid item position
     673: invokevirtual #219                // Method java/lang/StringBuilder.append:(Ljava/lang/String;)Ljava/lang/StringBuilder;
     676: pop
     677: aload         15
     679: iload_1
     680: invokevirtual #273                // Method java/lang/StringBuilder.append:(I)Ljava/lang/StringBuilder;
     683: pop
     684: aload         15
     686: ldc_w         #275                // String (offset:
     689: invokevirtual #219                // Method java/lang/StringBuilder.append:(Ljava/lang/String;)Ljava/lang/StringBuilder;
     692: pop
     693: aload         15
     695: iload         7
     697: invokevirtual #273                // Method java/lang/StringBuilder.append:(I)Ljava/lang/StringBuilder;
     700: pop
     701: aload         15
     703: ldc_w         #277                // String ).
     706: invokevirtual #219                // Method java/lang/StringBuilder.append:(Ljava/lang/String;)Ljava/lang/StringBuilder;
     709: pop
     710: aload         15
     712: ldc_w         #279                // String state:
     715: invokevirtual #219                // Method java/lang/StringBuilder.append:(Ljava/lang/String;)Ljava/lang/StringBuilder;
     718: pop
     719: aload         15
     721: aload_0
     722: getfield      #28                 // Field f:Landroid/support/v7/widget/RecyclerView;
     725: getfield      #113                // Field android/support/v7/widget/RecyclerView.C:Landroid/support/v7/widget/RecyclerView$u;
     728: invokevirtual #154                // Method android/support/v7/widget/RecyclerView$u.e:()I
     731: invokevirtual #273                // Method java/lang/StringBuilder.append:(I)Ljava/lang/StringBuilder;
     734: pop
     735: aload         15
     737: aload_0
     738: getfield      #28                 // Field f:Landroid/support/v7/widget/RecyclerView;
     741: invokevirtual #222                // Method android/support/v7/widget/RecyclerView.a:()Ljava/lang/String;
     744: invokevirtual #219                // Method java/lang/StringBuilder.append:(Ljava/lang/String;)Ljava/lang/StringBuilder;
     747: pop
     748: new           #281                // class java/lang/IndexOutOfBoundsException
     751: dup
     752: aload         15
     754: invokevirtual #227                // Method java/lang/StringBuilder.toString:()Ljava/lang/String;
     757: invokespecial #282                // Method java/lang/IndexOutOfBoundsException."<init>":(Ljava/lang/String;)V
     760: athrow
     761: aload         17
     763: astore        15
     765: iload         7
     767: istore        6
     769: iload         6
     771: ifeq          870
     774: aload_0
     775: getfield      #28                 // Field f:Landroid/support/v7/widget/RecyclerView;
     778: getfield      #113                // Field android/support/v7/widget/RecyclerView.C:Landroid/support/v7/widget/RecyclerView$u;
     781: invokevirtual #118                // Method android/support/v7/widget/RecyclerView$u.a:()Z
     784: ifne          870
     787: aload         15
     789: sipush        8192
     792: invokevirtual #285                // Method android/support/v7/widget/RecyclerView$x.a:(I)Z
     795: ifeq          870
     798: aload         15
     800: iconst_0
     801: sipush        8192
     804: invokevirtual #288                // Method android/support/v7/widget/RecyclerView$x.a:(II)V
     807: aload_0
     808: getfield      #28                 // Field f:Landroid/support/v7/widget/RecyclerView;
     811: getfield      #113                // Field android/support/v7/widget/RecyclerView.C:Landroid/support/v7/widget/RecyclerView$u;
     814: getfield      #290                // Field android/support/v7/widget/RecyclerView$u.i:Z
     817: ifeq          870
     820: aload         15
     822: invokestatic  #295                // Method android/support/v7/widget/RecyclerView$f.e:(Landroid/support/v7/widget/RecyclerView$x;)I
     825: istore        5
     827: aload_0
     828: getfield      #28                 // Field f:Landroid/support/v7/widget/RecyclerView;
     831: getfield      #298                // Field android/support/v7/widget/RecyclerView.y:Landroid/support/v7/widget/RecyclerView$f;
     834: aload_0
     835: getfield      #28                 // Field f:Landroid/support/v7/widget/RecyclerView;
     838: getfield      #113                // Field android/support/v7/widget/RecyclerView.C:Landroid/support/v7/widget/RecyclerView$u;
     841: aload         15
     843: iload         5
     845: sipush        4096
     848: ior
     849: aload         15
     851: invokevirtual #302                // Method android/support/v7/widget/RecyclerView$x.u:()Ljava/util/List;
     854: invokevirtual #305                // Method android/support/v7/widget/RecyclerView$f.a:(Landroid/support/v7/widget/RecyclerView$u;Landroid/support/v7/widget/RecyclerView$x;ILjava/util/List;)Landroid/support/v7/widget/RecyclerView$f$c;
     857: astore        16
     859: aload_0
     860: getfield      #28                 // Field f:Landroid/support/v7/widget/RecyclerView;
     863: aload         15
     865: aload         16
     867: invokevirtual #308                // Method android/support/v7/widget/RecyclerView.a:(Landroid/support/v7/widget/RecyclerView$x;Landroid/support/v7/widget/RecyclerView$f$c;)V
     870: aload_0
     871: getfield      #28                 // Field f:Landroid/support/v7/widget/RecyclerView;
     874: getfield      #113                // Field android/support/v7/widget/RecyclerView.C:Landroid/support/v7/widget/RecyclerView$u;
     877: invokevirtual #118                // Method android/support/v7/widget/RecyclerView$u.a:()Z
     880: ifeq          900
     883: aload         15
     885: invokevirtual #310                // Method android/support/v7/widget/RecyclerView$x.p:()Z
     888: ifeq          900
     891: aload         15
     893: iload_1
     894: putfield      #120                // Field android/support/v7/widget/RecyclerView$x.g:I
     897: goto          927
     900: aload         15
     902: invokevirtual #310                // Method android/support/v7/widget/RecyclerView$x.p:()Z
     905: ifeq          932
     908: aload         15
     910: invokevirtual #313                // Method android/support/v7/widget/RecyclerView$x.o:()Z
     913: ifne          932
     916: aload         15
     918: invokevirtual #314                // Method android/support/v7/widget/RecyclerView$x.n:()Z
     921: ifeq          927
     924: goto          932
     927: iconst_0
     928: istore_2
     929: goto          952
     932: aload_0
     933: aload         15
     935: aload_0
     936: getfield      #28                 // Field f:Landroid/support/v7/widget/RecyclerView;
     939: getfield      #182                // Field android/support/v7/widget/RecyclerView.e:Landroid/support/v7/widget/f;
     942: iload_1
     943: invokevirtual #187                // Method android/support/v7/widget/f.b:(I)I
     946: iload_1
     947: lload_3
     948: invokespecial #316                // Method a:(Landroid/support/v7/widget/RecyclerView$x;IIJ)Z
     951: istore_2
     952: aload         15
     954: getfield      #126                // Field android/support/v7/widget/RecyclerView$x.a:Landroid/view/View;
     957: invokevirtual #322                // Method android/view/View.getLayoutParams:()Landroid/view/ViewGroup$LayoutParams;
     960: astore        16
     962: aload         16
     964: ifnonnull     996
     967: aload_0
     968: getfield      #28                 // Field f:Landroid/support/v7/widget/RecyclerView;
     971: invokevirtual #325                // Method android/support/v7/widget/RecyclerView.generateDefaultLayoutParams:()Landroid/view/ViewGroup$LayoutParams;
     974: astore        16
     976: aload         16
     978: checkcast     #327                // class android/support/v7/widget/RecyclerView$j
     981: astore        16
     983: aload         15
     985: getfield      #126                // Field android/support/v7/widget/RecyclerView$x.a:Landroid/view/View;
     988: aload         16
     990: invokevirtual #331                // Method android/view/View.setLayoutParams:(Landroid/view/ViewGroup$LayoutParams;)V
     993: goto          1029
     996: aload_0
     997: getfield      #28                 // Field f:Landroid/support/v7/widget/RecyclerView;
    1000: aload         16
    1002: invokevirtual #335                // Method android/support/v7/widget/RecyclerView.checkLayoutParams:(Landroid/view/ViewGroup$LayoutParams;)Z
    1005: ifne          1022
    1008: aload_0
    1009: getfield      #28                 // Field f:Landroid/support/v7/widget/RecyclerView;
    1012: aload         16
    1014: invokevirtual #339                // Method android/support/v7/widget/RecyclerView.generateLayoutParams:(Landroid/view/ViewGroup$LayoutParams;)Landroid/view/ViewGroup$LayoutParams;
    1017: astore        16
    1019: goto          976
    1022: aload         16
    1024: checkcast     #327                // class android/support/v7/widget/RecyclerView$j
    1027: astore        16
    1029: aload         16
    1031: aload         15
    1033: putfield      #342                // Field android/support/v7/widget/RecyclerView$j.c:Landroid/support/v7/widget/RecyclerView$x;
    1036: iload         6
    1038: ifeq          1051
    1041: iload_2
    1042: ifeq          1051
    1045: iload         9
    1047: istore_2
    1048: goto          1053
    1051: iconst_0
    1052: istore_2
    1053: aload         16
    1055: iload_2
    1056: putfield      #344                // Field android/support/v7/widget/RecyclerView$j.f:Z
    1059: aload         15
    1061: areturn
    1062: new           #212                // class java/lang/StringBuilder
    1065: dup
    1066: invokespecial #213                // Method java/lang/StringBuilder."<init>":()V
    1069: astore        15
    1071: aload         15
    1073: ldc_w         #346                // String Invalid item position
    1076: invokevirtual #219                // Method java/lang/StringBuilder.append:(Ljava/lang/String;)Ljava/lang/StringBuilder;
    1079: pop
    1080: aload         15
    1082: iload_1
    1083: invokevirtual #273                // Method java/lang/StringBuilder.append:(I)Ljava/lang/StringBuilder;
    1086: pop
    1087: aload         15
    1089: ldc_w         #348                // String (
    1092: invokevirtual #219                // Method java/lang/StringBuilder.append:(Ljava/lang/String;)Ljava/lang/StringBuilder;
    1095: pop
    1096: aload         15
    1098: iload_1
    1099: invokevirtual #273                // Method java/lang/StringBuilder.append:(I)Ljava/lang/StringBuilder;
    1102: pop
    1103: aload         15
    1105: ldc_w         #350                // String ). Item count:
    1108: invokevirtual #219                // Method java/lang/StringBuilder.append:(Ljava/lang/String;)Ljava/lang/StringBuilder;
    1111: pop
    1112: aload         15
    1114: aload_0
    1115: getfield      #28                 // Field f:Landroid/support/v7/widget/RecyclerView;
    1118: getfield      #113                // Field android/support/v7/widget/RecyclerView.C:Landroid/support/v7/widget/RecyclerView$u;
    1121: invokevirtual #154                // Method android/support/v7/widget/RecyclerView$u.e:()I
    1124: invokevirtual #273                // Method java/lang/StringBuilder.append:(I)Ljava/lang/StringBuilder;
    1127: pop
    1128: aload         15
    1130: aload_0
    1131: getfield      #28                 // Field f:Landroid/support/v7/widget/RecyclerView;
    1134: invokevirtual #222                // Method android/support/v7/widget/RecyclerView.a:()Ljava/lang/String;
    1137: invokevirtual #219                // Method java/lang/StringBuilder.append:(Ljava/lang/String;)Ljava/lang/StringBuilder;
    1140: pop
    1141: new           #281                // class java/lang/IndexOutOfBoundsException
    1144: dup
    1145: aload         15
    1147: invokevirtual #227                // Method java/lang/StringBuilder.toString:()Ljava/lang/String;
    1150: invokespecial #282                // Method java/lang/IndexOutOfBoundsException."<init>":(Ljava/lang/String;)V
    1153: athrow

  android.support.v7.widget.RecyclerView$x a(long, int, boolean);
    Code:
       0: aload_0
       1: getfield      #36                 // Field a:Ljava/util/ArrayList;
       4: invokevirtual #353                // Method java/util/ArrayList.size:()I
       7: iconst_1
       8: isub
       9: istore        5
      11: iload         5
      13: iflt          142
      16: aload_0
      17: getfield      #36                 // Field a:Ljava/util/ArrayList;
      20: iload         5
      22: invokevirtual #357                // Method java/util/ArrayList.get:(I)Ljava/lang/Object;
      25: checkcast     #76                 // class android/support/v7/widget/RecyclerView$x
      28: astore        6
      30: aload         6
      32: invokevirtual #359                // Method android/support/v7/widget/RecyclerView$x.g:()J
      35: lload_1
      36: lcmp
      37: ifne          133
      40: aload         6
      42: invokevirtual #175                // Method android/support/v7/widget/RecyclerView$x.k:()Z
      45: ifne          133
      48: iload_3
      49: aload         6
      51: invokevirtual #81                 // Method android/support/v7/widget/RecyclerView$x.h:()I
      54: if_icmpne     96
      57: aload         6
      59: bipush        32
      61: invokevirtual #139                // Method android/support/v7/widget/RecyclerView$x.b:(I)V
      64: aload         6
      66: invokevirtual #362                // Method android/support/v7/widget/RecyclerView$x.q:()Z
      69: ifeq          93
      72: aload_0
      73: getfield      #28                 // Field f:Landroid/support/v7/widget/RecyclerView;
      76: getfield      #113                // Field android/support/v7/widget/RecyclerView.C:Landroid/support/v7/widget/RecyclerView$u;
      79: invokevirtual #118                // Method android/support/v7/widget/RecyclerView$u.a:()Z
      82: ifne          93
      85: aload         6
      87: iconst_2
      88: bipush        14
      90: invokevirtual #288                // Method android/support/v7/widget/RecyclerView$x.a:(II)V
      93: aload         6
      95: areturn
      96: iload         4
      98: ifne          133
     101: aload_0
     102: getfield      #36                 // Field a:Ljava/util/ArrayList;
     105: iload         5
     107: invokevirtual #365                // Method java/util/ArrayList.remove:(I)Ljava/lang/Object;
     110: pop
     111: aload_0
     112: getfield      #28                 // Field f:Landroid/support/v7/widget/RecyclerView;
     115: aload         6
     117: getfield      #126                // Field android/support/v7/widget/RecyclerView$x.a:Landroid/view/View;
     120: iconst_0
     121: invokevirtual #169                // Method android/support/v7/widget/RecyclerView.removeDetachedView:(Landroid/view/View;Z)V
     124: aload_0
     125: aload         6
     127: getfield      #126                // Field android/support/v7/widget/RecyclerView$x.a:Landroid/view/View;
     130: invokevirtual #368                // Method b:(Landroid/view/View;)V
     133: iload         5
     135: iconst_1
     136: isub
     137: istore        5
     139: goto          11
     142: aload_0
     143: getfield      #40                 // Field c:Ljava/util/ArrayList;
     146: invokevirtual #353                // Method java/util/ArrayList.size:()I
     149: iconst_1
     150: isub
     151: istore        5
     153: iload         5
     155: iflt          231
     158: aload_0
     159: getfield      #40                 // Field c:Ljava/util/ArrayList;
     162: iload         5
     164: invokevirtual #357                // Method java/util/ArrayList.get:(I)Ljava/lang/Object;
     167: checkcast     #76                 // class android/support/v7/widget/RecyclerView$x
     170: astore        6
     172: aload         6
     174: invokevirtual #359                // Method android/support/v7/widget/RecyclerView$x.g:()J
     177: lload_1
     178: lcmp
     179: ifne          222
     182: iload_3
     183: aload         6
     185: invokevirtual #81                 // Method android/support/v7/widget/RecyclerView$x.h:()I
     188: if_icmpne     209
     191: iload         4
     193: ifne          206
     196: aload_0
     197: getfield      #40                 // Field c:Ljava/util/ArrayList;
     200: iload         5
     202: invokevirtual #365                // Method java/util/ArrayList.remove:(I)Ljava/lang/Object;
     205: pop
     206: aload         6
     208: areturn
     209: iload         4
     211: ifne          222
     214: aload_0
     215: iload         5
     217: invokevirtual #370                // Method d:(I)V
     220: aconst_null
     221: areturn
     222: iload         5
     224: iconst_1
     225: isub
     226: istore        5
     228: goto          153
     231: aconst_null
     232: areturn

  android.view.View a(int, boolean);
    Code:
       0: aload_0
       1: iload_1
       2: iload_2
       3: ldc2_w        #86                 // long 9223372036854775807l
       6: invokevirtual #373                // Method a:(IZJ)Landroid/support/v7/widget/RecyclerView$x;
       9: getfield      #126                // Field android/support/v7/widget/RecyclerView$x.a:Landroid/view/View;
      12: areturn

  public void a();
    Code:
       0: aload_0
       1: getfield      #36                 // Field a:Ljava/util/ArrayList;
       4: invokevirtual #376                // Method java/util/ArrayList.clear:()V
       7: aload_0
       8: invokevirtual #378                // Method d:()V
      11: return

  public void a(int);
    Code:
       0: aload_0
       1: iload_1
       2: putfield      #50                 // Field h:I
       5: aload_0
       6: invokevirtual #380                // Method b:()V
       9: return

  void a(int, int);
    Code:
       0: iload_1
       1: iload_2
       2: if_icmpge     16
       5: iload_1
       6: istore_3
       7: iload_2
       8: istore        4
      10: iconst_m1
      11: istore        5
      13: goto          24
      16: iload_1
      17: istore        4
      19: iload_2
      20: istore_3
      21: iconst_1
      22: istore        5
      24: aload_0
      25: getfield      #40                 // Field c:Ljava/util/ArrayList;
      28: invokevirtual #353                // Method java/util/ArrayList.size:()I
      31: istore        7
      33: iconst_0
      34: istore        6
      36: iload         6
      38: iload         7
      40: if_icmpge     122
      43: aload_0
      44: getfield      #40                 // Field c:Ljava/util/ArrayList;
      47: iload         6
      49: invokevirtual #357                // Method java/util/ArrayList.get:(I)Ljava/lang/Object;
      52: checkcast     #76                 // class android/support/v7/widget/RecyclerView$x
      55: astore        8
      57: aload         8
      59: ifnull        113
      62: aload         8
      64: getfield      #200                // Field android/support/v7/widget/RecyclerView$x.c:I
      67: iload_3
      68: if_icmplt     113
      71: aload         8
      73: getfield      #200                // Field android/support/v7/widget/RecyclerView$x.c:I
      76: iload         4
      78: if_icmple     84
      81: goto          113
      84: aload         8
      86: getfield      #200                // Field android/support/v7/widget/RecyclerView$x.c:I
      89: iload_1
      90: if_icmpne     105
      93: aload         8
      95: iload_2
      96: iload_1
      97: isub
      98: iconst_0
      99: invokevirtual #383                // Method android/support/v7/widget/RecyclerView$x.a:(IZ)V
     102: goto          113
     105: aload         8
     107: iload         5
     109: iconst_0
     110: invokevirtual #383                // Method android/support/v7/widget/RecyclerView$x.a:(IZ)V
     113: iload         6
     115: iconst_1
     116: iadd
     117: istore        6
     119: goto          36
     122: return

  void a(int, int, boolean);
    Code:
       0: aload_0
       1: getfield      #40                 // Field c:Ljava/util/ArrayList;
       4: invokevirtual #353                // Method java/util/ArrayList.size:()I
       7: iconst_1
       8: isub
       9: istore        4
      11: iload         4
      13: iflt          88
      16: aload_0
      17: getfield      #40                 // Field c:Ljava/util/ArrayList;
      20: iload         4
      22: invokevirtual #357                // Method java/util/ArrayList.get:(I)Ljava/lang/Object;
      25: checkcast     #76                 // class android/support/v7/widget/RecyclerView$x
      28: astore        5
      30: aload         5
      32: ifnull        79
      35: aload         5
      37: getfield      #200                // Field android/support/v7/widget/RecyclerView$x.c:I
      40: iload_1
      41: iload_2
      42: iadd
      43: if_icmplt     57
      46: aload         5
      48: iload_2
      49: ineg
      50: iload_3
      51: invokevirtual #383                // Method android/support/v7/widget/RecyclerView$x.a:(IZ)V
      54: goto          79
      57: aload         5
      59: getfield      #200                // Field android/support/v7/widget/RecyclerView$x.c:I
      62: iload_1
      63: if_icmplt     79
      66: aload         5
      68: bipush        8
      70: invokevirtual #139                // Method android/support/v7/widget/RecyclerView$x.b:(I)V
      73: aload_0
      74: iload         4
      76: invokevirtual #370                // Method d:(I)V
      79: iload         4
      81: iconst_1
      82: isub
      83: istore        4
      85: goto          11
      88: return

  void a(android.support.v7.widget.RecyclerView$a, android.support.v7.widget.RecyclerView$a, boolean);
    Code:
       0: aload_0
       1: invokevirtual #387                // Method a:()V
       4: aload_0
       5: invokevirtual #237                // Method g:()Landroid/support/v7/widget/RecyclerView$o;
       8: aload_1
       9: aload_2
      10: iload_3
      11: invokevirtual #389                // Method android/support/v7/widget/RecyclerView$o.a:(Landroid/support/v7/widget/RecyclerView$a;Landroid/support/v7/widget/RecyclerView$a;Z)V
      14: return

  void a(android.support.v7.widget.RecyclerView$o);
    Code:
       0: aload_0
       1: getfield      #89                 // Field e:Landroid/support/v7/widget/RecyclerView$o;
       4: ifnull        14
       7: aload_0
       8: getfield      #89                 // Field e:Landroid/support/v7/widget/RecyclerView$o;
      11: invokevirtual #391                // Method android/support/v7/widget/RecyclerView$o.b:()V
      14: aload_0
      15: aload_1
      16: putfield      #89                 // Field e:Landroid/support/v7/widget/RecyclerView$o;
      19: aload_1
      20: ifnull        37
      23: aload_0
      24: getfield      #89                 // Field e:Landroid/support/v7/widget/RecyclerView$o;
      27: aload_0
      28: getfield      #28                 // Field f:Landroid/support/v7/widget/RecyclerView;
      31: invokevirtual #395                // Method android/support/v7/widget/RecyclerView.getAdapter:()Landroid/support/v7/widget/RecyclerView$a;
      34: invokevirtual #398                // Method android/support/v7/widget/RecyclerView$o.a:(Landroid/support/v7/widget/RecyclerView$a;)V
      37: return

  void a(android.support.v7.widget.RecyclerView$v);
    Code:
       0: aload_0
       1: aload_1
       2: putfield      #202                // Field i:Landroid/support/v7/widget/RecyclerView$v;
       5: return

  void a(android.support.v7.widget.RecyclerView$x, boolean);
    Code:
       0: aload_1
       1: invokestatic  #402                // Method android/support/v7/widget/RecyclerView.c:(Landroid/support/v7/widget/RecyclerView$x;)V
       4: aload_1
       5: sipush        16384
       8: invokevirtual #285                // Method android/support/v7/widget/RecyclerView$x.a:(I)Z
      11: ifeq          30
      14: aload_1
      15: iconst_0
      16: sipush        16384
      19: invokevirtual #288                // Method android/support/v7/widget/RecyclerView$x.a:(II)V
      22: aload_1
      23: getfield      #126                // Field android/support/v7/widget/RecyclerView$x.a:Landroid/view/View;
      26: aconst_null
      27: invokestatic  #151                // Method android/support/v4/view/s.a:(Landroid/view/View;Landroid/support/v4/view/b;)V
      30: iload_2
      31: ifeq          39
      34: aload_0
      35: aload_1
      36: invokevirtual #404                // Method d:(Landroid/support/v7/widget/RecyclerView$x;)V
      39: aload_1
      40: aconst_null
      41: putfield      #79                 // Field android/support/v7/widget/RecyclerView$x.m:Landroid/support/v7/widget/RecyclerView;
      44: aload_0
      45: invokevirtual #237                // Method g:()Landroid/support/v7/widget/RecyclerView$o;
      48: aload_1
      49: invokevirtual #406                // Method android/support/v7/widget/RecyclerView$o.a:(Landroid/support/v7/widget/RecyclerView$x;)V
      52: return

  public void a(android.view.View);
    Code:
       0: aload_1
       1: invokestatic  #408                // Method android/support/v7/widget/RecyclerView.e:(Landroid/view/View;)Landroid/support/v7/widget/RecyclerView$x;
       4: astore_2
       5: aload_2
       6: invokevirtual #411                // Method android/support/v7/widget/RecyclerView$x.r:()Z
       9: ifeq          21
      12: aload_0
      13: getfield      #28                 // Field f:Landroid/support/v7/widget/RecyclerView;
      16: aload_1
      17: iconst_0
      18: invokevirtual #169                // Method android/support/v7/widget/RecyclerView.removeDetachedView:(Landroid/view/View;Z)V
      21: aload_2
      22: invokevirtual #165                // Method android/support/v7/widget/RecyclerView$x.i:()Z
      25: ifeq          35
      28: aload_2
      29: invokevirtual #172                // Method android/support/v7/widget/RecyclerView$x.j:()V
      32: goto          46
      35: aload_2
      36: invokevirtual #175                // Method android/support/v7/widget/RecyclerView$x.k:()Z
      39: ifeq          46
      42: aload_2
      43: invokevirtual #177                // Method android/support/v7/widget/RecyclerView$x.l:()V
      46: aload_0
      47: aload_2
      48: invokevirtual #179                // Method b:(Landroid/support/v7/widget/RecyclerView$x;)V
      51: return

  boolean a(android.support.v7.widget.RecyclerView$x);
    Code:
       0: aload_1
       1: invokevirtual #362                // Method android/support/v7/widget/RecyclerView$x.q:()Z
       4: ifeq          18
       7: aload_0
       8: getfield      #28                 // Field f:Landroid/support/v7/widget/RecyclerView;
      11: getfield      #113                // Field android/support/v7/widget/RecyclerView.C:Landroid/support/v7/widget/RecyclerView$u;
      14: invokevirtual #118                // Method android/support/v7/widget/RecyclerView$u.a:()Z
      17: ireturn
      18: aload_1
      19: getfield      #200                // Field android/support/v7/widget/RecyclerView$x.c:I
      22: iflt          126
      25: aload_1
      26: getfield      #200                // Field android/support/v7/widget/RecyclerView$x.c:I
      29: aload_0
      30: getfield      #28                 // Field f:Landroid/support/v7/widget/RecyclerView;
      33: getfield      #98                 // Field android/support/v7/widget/RecyclerView.l:Landroid/support/v7/widget/RecyclerView$a;
      36: invokevirtual #189                // Method android/support/v7/widget/RecyclerView$a.a:()I
      39: if_icmplt     45
      42: goto          126
      45: aload_0
      46: getfield      #28                 // Field f:Landroid/support/v7/widget/RecyclerView;
      49: getfield      #113                // Field android/support/v7/widget/RecyclerView.C:Landroid/support/v7/widget/RecyclerView$u;
      52: invokevirtual #118                // Method android/support/v7/widget/RecyclerView$u.a:()Z
      55: istore_3
      56: iconst_0
      57: istore_2
      58: iload_3
      59: ifne          85
      62: aload_0
      63: getfield      #28                 // Field f:Landroid/support/v7/widget/RecyclerView;
      66: getfield      #98                 // Field android/support/v7/widget/RecyclerView.l:Landroid/support/v7/widget/RecyclerView$a;
      69: aload_1
      70: getfield      #200                // Field android/support/v7/widget/RecyclerView$x.c:I
      73: invokevirtual #190                // Method android/support/v7/widget/RecyclerView$a.b:(I)I
      76: aload_1
      77: invokevirtual #81                 // Method android/support/v7/widget/RecyclerView$x.h:()I
      80: if_icmpeq     85
      83: iconst_0
      84: ireturn
      85: aload_0
      86: getfield      #28                 // Field f:Landroid/support/v7/widget/RecyclerView;
      89: getfield      #98                 // Field android/support/v7/widget/RecyclerView.l:Landroid/support/v7/widget/RecyclerView$a;
      92: invokevirtual #192                // Method android/support/v7/widget/RecyclerView$a.d:()Z
      95: ifeq          124
      98: aload_1
      99: invokevirtual #359                // Method android/support/v7/widget/RecyclerView$x.g:()J
     102: aload_0
     103: getfield      #28                 // Field f:Landroid/support/v7/widget/RecyclerView;
     106: getfield      #98                 // Field android/support/v7/widget/RecyclerView.l:Landroid/support/v7/widget/RecyclerView$a;
     109: aload_1
     110: getfield      #200                // Field android/support/v7/widget/RecyclerView$x.c:I
     113: invokevirtual #195                // Method android/support/v7/widget/RecyclerView$a.a:(I)J
     116: lcmp
     117: ifne          122
     120: iconst_1
     121: istore_2
     122: iload_2
     123: ireturn
     124: iconst_1
     125: ireturn
     126: new           #212                // class java/lang/StringBuilder
     129: dup
     130: invokespecial #213                // Method java/lang/StringBuilder."<init>":()V
     133: astore        4
     135: aload         4
     137: ldc_w         #413                // String Inconsistency detected. Invalid view holder adapter position
     140: invokevirtual #219                // Method java/lang/StringBuilder.append:(Ljava/lang/String;)Ljava/lang/StringBuilder;
     143: pop
     144: aload         4
     146: aload_1
     147: invokevirtual #416                // Method java/lang/StringBuilder.append:(Ljava/lang/Object;)Ljava/lang/StringBuilder;
     150: pop
     151: aload         4
     153: aload_0
     154: getfield      #28                 // Field f:Landroid/support/v7/widget/RecyclerView;
     157: invokevirtual #222                // Method android/support/v7/widget/RecyclerView.a:()Ljava/lang/String;
     160: invokevirtual #219                // Method java/lang/StringBuilder.append:(Ljava/lang/String;)Ljava/lang/StringBuilder;
     163: pop
     164: new           #281                // class java/lang/IndexOutOfBoundsException
     167: dup
     168: aload         4
     170: invokevirtual #227                // Method java/lang/StringBuilder.toString:()Ljava/lang/String;
     173: invokespecial #282                // Method java/lang/IndexOutOfBoundsException."<init>":(Ljava/lang/String;)V
     176: athrow

  public int b(int);
    Code:
       0: iload_1
       1: iflt          48
       4: iload_1
       5: aload_0
       6: getfield      #28                 // Field f:Landroid/support/v7/widget/RecyclerView;
       9: getfield      #113                // Field android/support/v7/widget/RecyclerView.C:Landroid/support/v7/widget/RecyclerView$u;
      12: invokevirtual #154                // Method android/support/v7/widget/RecyclerView$u.e:()I
      15: if_icmplt     21
      18: goto          48
      21: aload_0
      22: getfield      #28                 // Field f:Landroid/support/v7/widget/RecyclerView;
      25: getfield      #113                // Field android/support/v7/widget/RecyclerView.C:Landroid/support/v7/widget/RecyclerView$u;
      28: invokevirtual #118                // Method android/support/v7/widget/RecyclerView$u.a:()Z
      31: ifne          36
      34: iload_1
      35: ireturn
      36: aload_0
      37: getfield      #28                 // Field f:Landroid/support/v7/widget/RecyclerView;
      40: getfield      #182                // Field android/support/v7/widget/RecyclerView.e:Landroid/support/v7/widget/f;
      43: iload_1
      44: invokevirtual #187                // Method android/support/v7/widget/f.b:(I)I
      47: ireturn
      48: new           #212                // class java/lang/StringBuilder
      51: dup
      52: invokespecial #213                // Method java/lang/StringBuilder."<init>":()V
      55: astore_2
      56: aload_2
      57: ldc_w         #418                // String invalid position
      60: invokevirtual #219                // Method java/lang/StringBuilder.append:(Ljava/lang/String;)Ljava/lang/StringBuilder;
      63: pop
      64: aload_2
      65: iload_1
      66: invokevirtual #273                // Method java/lang/StringBuilder.append:(I)Ljava/lang/StringBuilder;
      69: pop
      70: aload_2
      71: ldc_w         #420                // String . State
      74: invokevirtual #219                // Method java/lang/StringBuilder.append:(Ljava/lang/String;)Ljava/lang/StringBuilder;
      77: pop
      78: aload_2
      79: ldc_w         #422                // String item count is
      82: invokevirtual #219                // Method java/lang/StringBuilder.append:(Ljava/lang/String;)Ljava/lang/StringBuilder;
      85: pop
      86: aload_2
      87: aload_0
      88: getfield      #28                 // Field f:Landroid/support/v7/widget/RecyclerView;
      91: getfield      #113                // Field android/support/v7/widget/RecyclerView.C:Landroid/support/v7/widget/RecyclerView$u;
      94: invokevirtual #154                // Method android/support/v7/widget/RecyclerView$u.e:()I
      97: invokevirtual #273                // Method java/lang/StringBuilder.append:(I)Ljava/lang/StringBuilder;
     100: pop
     101: aload_2
     102: aload_0
     103: getfield      #28                 // Field f:Landroid/support/v7/widget/RecyclerView;
     106: invokevirtual #222                // Method android/support/v7/widget/RecyclerView.a:()Ljava/lang/String;
     109: invokevirtual #219                // Method java/lang/StringBuilder.append:(Ljava/lang/String;)Ljava/lang/StringBuilder;
     112: pop
     113: new           #281                // class java/lang/IndexOutOfBoundsException
     116: dup
     117: aload_2
     118: invokevirtual #227                // Method java/lang/StringBuilder.toString:()Ljava/lang/String;
     121: invokespecial #282                // Method java/lang/IndexOutOfBoundsException."<init>":(Ljava/lang/String;)V
     124: athrow

  android.support.v7.widget.RecyclerView$x b(int, boolean);
    Code:
       0: aload_0
       1: getfield      #36                 // Field a:Ljava/util/ArrayList;
       4: invokevirtual #353                // Method java/util/ArrayList.size:()I
       7: istore        5
       9: iconst_0
      10: istore        4
      12: iconst_0
      13: istore_3
      14: iload_3
      15: iload         5
      17: if_icmpge     96
      20: aload_0
      21: getfield      #36                 // Field a:Ljava/util/ArrayList;
      24: iload_3
      25: invokevirtual #357                // Method java/util/ArrayList.get:(I)Ljava/lang/Object;
      28: checkcast     #76                 // class android/support/v7/widget/RecyclerView$x
      31: astore        6
      33: aload         6
      35: invokevirtual #175                // Method android/support/v7/widget/RecyclerView$x.k:()Z
      38: ifne          89
      41: aload         6
      43: invokevirtual #424                // Method android/support/v7/widget/RecyclerView$x.d:()I
      46: iload_1
      47: if_icmpne     89
      50: aload         6
      52: invokevirtual #314                // Method android/support/v7/widget/RecyclerView$x.n:()Z
      55: ifne          89
      58: aload_0
      59: getfield      #28                 // Field f:Landroid/support/v7/widget/RecyclerView;
      62: getfield      #113                // Field android/support/v7/widget/RecyclerView.C:Landroid/support/v7/widget/RecyclerView$u;
      65: getfield      #425                // Field android/support/v7/widget/RecyclerView$u.f:Z
      68: ifne          79
      71: aload         6
      73: invokevirtual #362                // Method android/support/v7/widget/RecyclerView$x.q:()Z
      76: ifne          89
      79: aload         6
      81: bipush        32
      83: invokevirtual #139                // Method android/support/v7/widget/RecyclerView$x.b:(I)V
      86: aload         6
      88: areturn
      89: iload_3
      90: iconst_1
      91: iadd
      92: istore_3
      93: goto          14
      96: iload_2
      97: ifne          235
     100: aload_0
     101: getfield      #28                 // Field f:Landroid/support/v7/widget/RecyclerView;
     104: getfield      #428                // Field android/support/v7/widget/RecyclerView.f:Landroid/support/v7/widget/aj;
     107: iload_1
     108: invokevirtual #432                // Method android/support/v7/widget/aj.c:(I)Landroid/view/View;
     111: astore        7
     113: aload         7
     115: ifnull        235
     118: aload         7
     120: invokestatic  #408                // Method android/support/v7/widget/RecyclerView.e:(Landroid/view/View;)Landroid/support/v7/widget/RecyclerView$x;
     123: astore        6
     125: aload_0
     126: getfield      #28                 // Field f:Landroid/support/v7/widget/RecyclerView;
     129: getfield      #428                // Field android/support/v7/widget/RecyclerView.f:Landroid/support/v7/widget/aj;
     132: aload         7
     134: invokevirtual #434                // Method android/support/v7/widget/aj.e:(Landroid/view/View;)V
     137: aload_0
     138: getfield      #28                 // Field f:Landroid/support/v7/widget/RecyclerView;
     141: getfield      #428                // Field android/support/v7/widget/RecyclerView.f:Landroid/support/v7/widget/aj;
     144: aload         7
     146: invokevirtual #436                // Method android/support/v7/widget/aj.b:(Landroid/view/View;)I
     149: istore_1
     150: iload_1
     151: iconst_m1
     152: if_icmpne     207
     155: new           #212                // class java/lang/StringBuilder
     158: dup
     159: invokespecial #213                // Method java/lang/StringBuilder."<init>":()V
     162: astore        7
     164: aload         7
     166: ldc_w         #438                // String layout index should not be -1 after unhiding a view:
     169: invokevirtual #219                // Method java/lang/StringBuilder.append:(Ljava/lang/String;)Ljava/lang/StringBuilder;
     172: pop
     173: aload         7
     175: aload         6
     177: invokevirtual #416                // Method java/lang/StringBuilder.append:(Ljava/lang/Object;)Ljava/lang/StringBuilder;
     180: pop
     181: aload         7
     183: aload_0
     184: getfield      #28                 // Field f:Landroid/support/v7/widget/RecyclerView;
     187: invokevirtual #222                // Method android/support/v7/widget/RecyclerView.a:()Ljava/lang/String;
     190: invokevirtual #219                // Method java/lang/StringBuilder.append:(Ljava/lang/String;)Ljava/lang/StringBuilder;
     193: pop
     194: new           #440                // class java/lang/IllegalStateException
     197: dup
     198: aload         7
     200: invokevirtual #227                // Method java/lang/StringBuilder.toString:()Ljava/lang/String;
     203: invokespecial #441                // Method java/lang/IllegalStateException."<init>":(Ljava/lang/String;)V
     206: athrow
     207: aload_0
     208: getfield      #28                 // Field f:Landroid/support/v7/widget/RecyclerView;
     211: getfield      #428                // Field android/support/v7/widget/RecyclerView.f:Landroid/support/v7/widget/aj;
     214: iload_1
     215: invokevirtual #443                // Method android/support/v7/widget/aj.e:(I)V
     218: aload_0
     219: aload         7
     221: invokevirtual #445                // Method c:(Landroid/view/View;)V
     224: aload         6
     226: sipush        8224
     229: invokevirtual #139                // Method android/support/v7/widget/RecyclerView$x.b:(I)V
     232: aload         6
     234: areturn
     235: aload_0
     236: getfield      #40                 // Field c:Ljava/util/ArrayList;
     239: invokevirtual #353                // Method java/util/ArrayList.size:()I
     242: istore        5
     244: iload         4
     246: istore_3
     247: iload_3
     248: iload         5
     250: if_icmpge     306
     253: aload_0
     254: getfield      #40                 // Field c:Ljava/util/ArrayList;
     257: iload_3
     258: invokevirtual #357                // Method java/util/ArrayList.get:(I)Ljava/lang/Object;
     261: checkcast     #76                 // class android/support/v7/widget/RecyclerView$x
     264: astore        6
     266: aload         6
     268: invokevirtual #314                // Method android/support/v7/widget/RecyclerView$x.n:()Z
     271: ifne          299
     274: aload         6
     276: invokevirtual #424                // Method android/support/v7/widget/RecyclerView$x.d:()I
     279: iload_1
     280: if_icmpne     299
     283: iload_2
     284: ifne          296
     287: aload_0
     288: getfield      #40                 // Field c:Ljava/util/ArrayList;
     291: iload_3
     292: invokevirtual #365                // Method java/util/ArrayList.remove:(I)Ljava/lang/Object;
     295: pop
     296: aload         6
     298: areturn
     299: iload_3
     300: iconst_1
     301: iadd
     302: istore_3
     303: goto          247
     306: aconst_null
     307: areturn

  void b();
    Code:
       0: aload_0
       1: getfield      #28                 // Field f:Landroid/support/v7/widget/RecyclerView;
       4: getfield      #448                // Field android/support/v7/widget/RecyclerView.m:Landroid/support/v7/widget/RecyclerView$i;
       7: ifnull        24
      10: aload_0
      11: getfield      #28                 // Field f:Landroid/support/v7/widget/RecyclerView;
      14: getfield      #448                // Field android/support/v7/widget/RecyclerView.m:Landroid/support/v7/widget/RecyclerView$i;
      17: getfield      #453                // Field android/support/v7/widget/RecyclerView$i.x:I
      20: istore_1
      21: goto          26
      24: iconst_0
      25: istore_1
      26: aload_0
      27: aload_0
      28: getfield      #50                 // Field h:I
      31: iload_1
      32: iadd
      33: putfield      #52                 // Field d:I
      36: aload_0
      37: getfield      #40                 // Field c:Ljava/util/ArrayList;
      40: invokevirtual #353                // Method java/util/ArrayList.size:()I
      43: iconst_1
      44: isub
      45: istore_1
      46: iload_1
      47: iflt          76
      50: aload_0
      51: getfield      #40                 // Field c:Ljava/util/ArrayList;
      54: invokevirtual #353                // Method java/util/ArrayList.size:()I
      57: aload_0
      58: getfield      #52                 // Field d:I
      61: if_icmple     76
      64: aload_0
      65: iload_1
      66: invokevirtual #370                // Method d:(I)V
      69: iload_1
      70: iconst_1
      71: isub
      72: istore_1
      73: goto          46
      76: return

  void b(int, int);
    Code:
       0: aload_0
       1: getfield      #40                 // Field c:Ljava/util/ArrayList;
       4: invokevirtual #353                // Method java/util/ArrayList.size:()I
       7: istore        4
       9: iconst_0
      10: istore_3
      11: iload_3
      12: iload         4
      14: if_icmpge     58
      17: aload_0
      18: getfield      #40                 // Field c:Ljava/util/ArrayList;
      21: iload_3
      22: invokevirtual #357                // Method java/util/ArrayList.get:(I)Ljava/lang/Object;
      25: checkcast     #76                 // class android/support/v7/widget/RecyclerView$x
      28: astore        5
      30: aload         5
      32: ifnull        51
      35: aload         5
      37: getfield      #200                // Field android/support/v7/widget/RecyclerView$x.c:I
      40: iload_1
      41: if_icmplt     51
      44: aload         5
      46: iload_2
      47: iconst_1
      48: invokevirtual #383                // Method android/support/v7/widget/RecyclerView$x.a:(IZ)V
      51: iload_3
      52: iconst_1
      53: iadd
      54: istore_3
      55: goto          11
      58: return

  void b(android.support.v7.widget.RecyclerView$x);
    Code:
       0: aload_1
       1: invokevirtual #165                // Method android/support/v7/widget/RecyclerView$x.i:()Z
       4: istore        6
       6: iconst_0
       7: istore        5
       9: iconst_0
      10: istore        4
      12: iload         6
      14: ifne          404
      17: aload_1
      18: getfield      #126                // Field android/support/v7/widget/RecyclerView$x.a:Landroid/view/View;
      21: invokevirtual #457                // Method android/view/View.getParent:()Landroid/view/ViewParent;
      24: ifnull        30
      27: goto          404
      30: aload_1
      31: invokevirtual #411                // Method android/support/v7/widget/RecyclerView$x.r:()Z
      34: ifeq          88
      37: new           #212                // class java/lang/StringBuilder
      40: dup
      41: invokespecial #213                // Method java/lang/StringBuilder."<init>":()V
      44: astore        7
      46: aload         7
      48: ldc_w         #459                // String Tmp detached view should be removed from RecyclerView before it can be recycled:
      51: invokevirtual #219                // Method java/lang/StringBuilder.append:(Ljava/lang/String;)Ljava/lang/StringBuilder;
      54: pop
      55: aload         7
      57: aload_1
      58: invokevirtual #416                // Method java/lang/StringBuilder.append:(Ljava/lang/Object;)Ljava/lang/StringBuilder;
      61: pop
      62: aload         7
      64: aload_0
      65: getfield      #28                 // Field f:Landroid/support/v7/widget/RecyclerView;
      68: invokevirtual #222                // Method android/support/v7/widget/RecyclerView.a:()Ljava/lang/String;
      71: invokevirtual #219                // Method java/lang/StringBuilder.append:(Ljava/lang/String;)Ljava/lang/StringBuilder;
      74: pop
      75: new           #224                // class java/lang/IllegalArgumentException
      78: dup
      79: aload         7
      81: invokevirtual #227                // Method java/lang/StringBuilder.toString:()Ljava/lang/String;
      84: invokespecial #230                // Method java/lang/IllegalArgumentException."<init>":(Ljava/lang/String;)V
      87: athrow
      88: aload_1
      89: invokevirtual #232                // Method android/support/v7/widget/RecyclerView$x.c:()Z
      92: ifeq          135
      95: new           #212                // class java/lang/StringBuilder
      98: dup
      99: invokespecial #213                // Method java/lang/StringBuilder."<init>":()V
     102: astore_1
     103: aload_1
     104: ldc_w         #461                // String Trying to recycle an ignored view holder. You should first call stopIgnoringView(view) before calling recycle.
     107: invokevirtual #219                // Method java/lang/StringBuilder.append:(Ljava/lang/String;)Ljava/lang/StringBuilder;
     110: pop
     111: aload_1
     112: aload_0
     113: getfield      #28                 // Field f:Landroid/support/v7/widget/RecyclerView;
     116: invokevirtual #222                // Method android/support/v7/widget/RecyclerView.a:()Ljava/lang/String;
     119: invokevirtual #219                // Method java/lang/StringBuilder.append:(Ljava/lang/String;)Ljava/lang/StringBuilder;
     122: pop
     123: new           #224                // class java/lang/IllegalArgumentException
     126: dup
     127: aload_1
     128: invokevirtual #227                // Method java/lang/StringBuilder.toString:()Ljava/lang/String;
     131: invokespecial #230                // Method java/lang/IllegalArgumentException."<init>":(Ljava/lang/String;)V
     134: athrow
     135: aload_1
     136: invokestatic  #462                // Method android/support/v7/widget/RecyclerView$x.a:(Landroid/support/v7/widget/RecyclerView$x;)Z
     139: istore        5
     141: aload_0
     142: getfield      #28                 // Field f:Landroid/support/v7/widget/RecyclerView;
     145: getfield      #98                 // Field android/support/v7/widget/RecyclerView.l:Landroid/support/v7/widget/RecyclerView$a;
     148: ifnull        175
     151: iload         5
     153: ifeq          175
     156: aload_0
     157: getfield      #28                 // Field f:Landroid/support/v7/widget/RecyclerView;
     160: getfield      #98                 // Field android/support/v7/widget/RecyclerView.l:Landroid/support/v7/widget/RecyclerView$a;
     163: aload_1
     164: invokevirtual #464                // Method android/support/v7/widget/RecyclerView$a.b:(Landroid/support/v7/widget/RecyclerView$x;)Z
     167: ifeq          175
     170: iconst_1
     171: istore_2
     172: goto          177
     175: iconst_0
     176: istore_2
     177: iload_2
     178: ifne          202
     181: aload_1
     182: invokevirtual #467                // Method android/support/v7/widget/RecyclerView$x.w:()Z
     185: ifeq          191
     188: goto          202
     191: iconst_0
     192: istore_2
     193: iload         4
     195: istore_3
     196: iload_2
     197: istore        4
     199: goto          373
     202: aload_0
     203: getfield      #52                 // Field d:I
     206: ifle          350
     209: aload_1
     210: sipush        526
     213: invokevirtual #285                // Method android/support/v7/widget/RecyclerView$x.a:(I)Z
     216: ifne          350
     219: aload_0
     220: getfield      #40                 // Field c:Ljava/util/ArrayList;
     223: invokevirtual #353                // Method java/util/ArrayList.size:()I
     226: istore_3
     227: iload_3
     228: istore_2
     229: iload_3
     230: aload_0
     231: getfield      #52                 // Field d:I
     234: if_icmplt     252
     237: iload_3
     238: istore_2
     239: iload_3
     240: ifle          252
     243: aload_0
     244: iconst_0
     245: invokevirtual #370                // Method d:(I)V
     248: iload_3
     249: iconst_1
     250: isub
     251: istore_2
     252: iload_2
     253: istore_3
     254: invokestatic  #255                // Method android/support/v7/widget/RecyclerView.y:()Z
     257: ifeq          336
     260: iload_2
     261: istore_3
     262: iload_2
     263: ifle          336
     266: iload_2
     267: istore_3
     268: aload_0
     269: getfield      #28                 // Field f:Landroid/support/v7/widget/RecyclerView;
     272: getfield      #471                // Field android/support/v7/widget/RecyclerView.B:Landroid/support/v7/widget/at$a;
     275: aload_1
     276: getfield      #200                // Field android/support/v7/widget/RecyclerView$x.c:I
     279: invokevirtual #474                // Method android/support/v7/widget/at$a.a:(I)Z
     282: ifne          336
     285: iload_2
     286: iconst_1
     287: isub
     288: istore_2
     289: iload_2
     290: iflt          332
     293: aload_0
     294: getfield      #40                 // Field c:Ljava/util/ArrayList;
     297: iload_2
     298: invokevirtual #357                // Method java/util/ArrayList.get:(I)Ljava/lang/Object;
     301: checkcast     #76                 // class android/support/v7/widget/RecyclerView$x
     304: getfield      #200                // Field android/support/v7/widget/RecyclerView$x.c:I
     307: istore_3
     308: aload_0
     309: getfield      #28                 // Field f:Landroid/support/v7/widget/RecyclerView;
     312: getfield      #471                // Field android/support/v7/widget/RecyclerView.B:Landroid/support/v7/widget/at$a;
     315: iload_3
     316: invokevirtual #474                // Method android/support/v7/widget/at$a.a:(I)Z
     319: ifne          325
     322: goto          332
     325: iload_2
     326: iconst_1
     327: isub
     328: istore_2
     329: goto          289
     332: iload_2
     333: iconst_1
     334: iadd
     335: istore_3
     336: aload_0
     337: getfield      #40                 // Field c:Ljava/util/ArrayList;
     340: iload_3
     341: aload_1
     342: invokevirtual #478                // Method java/util/ArrayList.add:(ILjava/lang/Object;)V
     345: iconst_1
     346: istore_2
     347: goto          352
     350: iconst_0
     351: istore_2
     352: iload         4
     354: istore_3
     355: iload_2
     356: istore        4
     358: iload_2
     359: ifne          373
     362: aload_0
     363: aload_1
     364: iconst_1
     365: invokevirtual #480                // Method a:(Landroid/support/v7/widget/RecyclerView$x;Z)V
     368: iconst_1
     369: istore_3
     370: iload_2
     371: istore        4
     373: aload_0
     374: getfield      #28                 // Field f:Landroid/support/v7/widget/RecyclerView;
     377: getfield      #483                // Field android/support/v7/widget/RecyclerView.g:Landroid/support/v7/widget/bw;
     380: aload_1
     381: invokevirtual #487                // Method android/support/v7/widget/bw.g:(Landroid/support/v7/widget/RecyclerView$x;)V
     384: iload         4
     386: ifne          403
     389: iload_3
     390: ifne          403
     393: iload         5
     395: ifeq          403
     398: aload_1
     399: aconst_null
     400: putfield      #79                 // Field android/support/v7/widget/RecyclerView$x.m:Landroid/support/v7/widget/RecyclerView;
     403: return
     404: new           #212                // class java/lang/StringBuilder
     407: dup
     408: invokespecial #213                // Method java/lang/StringBuilder."<init>":()V
     411: astore        7
     413: aload         7
     415: ldc_w         #489                // String Scrapped or attached views may not be recycled. isScrap:
     418: invokevirtual #219                // Method java/lang/StringBuilder.append:(Ljava/lang/String;)Ljava/lang/StringBuilder;
     421: pop
     422: aload         7
     424: aload_1
     425: invokevirtual #165                // Method android/support/v7/widget/RecyclerView$x.i:()Z
     428: invokevirtual #492                // Method java/lang/StringBuilder.append:(Z)Ljava/lang/StringBuilder;
     431: pop
     432: aload         7
     434: ldc_w         #494                // String  isAttached:
     437: invokevirtual #219                // Method java/lang/StringBuilder.append:(Ljava/lang/String;)Ljava/lang/StringBuilder;
     440: pop
     441: aload_1
     442: getfield      #126                // Field android/support/v7/widget/RecyclerView$x.a:Landroid/view/View;
     445: invokevirtual #457                // Method android/view/View.getParent:()Landroid/view/ViewParent;
     448: ifnull        454
     451: iconst_1
     452: istore        5
     454: aload         7
     456: iload         5
     458: invokevirtual #492                // Method java/lang/StringBuilder.append:(Z)Ljava/lang/StringBuilder;
     461: pop
     462: aload         7
     464: aload_0
     465: getfield      #28                 // Field f:Landroid/support/v7/widget/RecyclerView;
     468: invokevirtual #222                // Method android/support/v7/widget/RecyclerView.a:()Ljava/lang/String;
     471: invokevirtual #219                // Method java/lang/StringBuilder.append:(Ljava/lang/String;)Ljava/lang/StringBuilder;
     474: pop
     475: new           #224                // class java/lang/IllegalArgumentException
     478: dup
     479: aload         7
     481: invokevirtual #227                // Method java/lang/StringBuilder.toString:()Ljava/lang/String;
     484: invokespecial #230                // Method java/lang/IllegalArgumentException."<init>":(Ljava/lang/String;)V
     487: athrow

  void b(android.view.View);
    Code:
       0: aload_1
       1: invokestatic  #408                // Method android/support/v7/widget/RecyclerView.e:(Landroid/view/View;)Landroid/support/v7/widget/RecyclerView$x;
       4: astore_1
       5: aload_1
       6: aconst_null
       7: invokestatic  #497                // Method android/support/v7/widget/RecyclerView$x.a:(Landroid/support/v7/widget/RecyclerView$x;Landroid/support/v7/widget/RecyclerView$p;)Landroid/support/v7/widget/RecyclerView$p;
      10: pop
      11: aload_1
      12: iconst_0
      13: invokestatic  #500                // Method android/support/v7/widget/RecyclerView$x.a:(Landroid/support/v7/widget/RecyclerView$x;Z)Z
      16: pop
      17: aload_1
      18: invokevirtual #177                // Method android/support/v7/widget/RecyclerView$x.l:()V
      21: aload_0
      22: aload_1
      23: invokevirtual #179                // Method b:(Landroid/support/v7/widget/RecyclerView$x;)V
      26: return

  public android.view.View c(int);
    Code:
       0: aload_0
       1: iload_1
       2: iconst_0
       3: invokevirtual #502                // Method a:(IZ)Landroid/view/View;
       6: areturn

  public java.util.List<android.support.v7.widget.RecyclerView$x> c();
    Code:
       0: aload_0
       1: getfield      #48                 // Field g:Ljava/util/List;
       4: areturn

  void c(int, int);
    Code:
       0: aload_0
       1: getfield      #40                 // Field c:Ljava/util/ArrayList;
       4: invokevirtual #353                // Method java/util/ArrayList.size:()I
       7: iconst_1
       8: isub
       9: istore_3
      10: iload_3
      11: iflt          74
      14: aload_0
      15: getfield      #40                 // Field c:Ljava/util/ArrayList;
      18: iload_3
      19: invokevirtual #357                // Method java/util/ArrayList.get:(I)Ljava/lang/Object;
      22: checkcast     #76                 // class android/support/v7/widget/RecyclerView$x
      25: astore        5
      27: aload         5
      29: ifnonnull     35
      32: goto          67
      35: aload         5
      37: getfield      #200                // Field android/support/v7/widget/RecyclerView$x.c:I
      40: istore        4
      42: iload         4
      44: iload_1
      45: if_icmplt     67
      48: iload         4
      50: iload_2
      51: iload_1
      52: iadd
      53: if_icmpge     67
      56: aload         5
      58: iconst_2
      59: invokevirtual #139                // Method android/support/v7/widget/RecyclerView$x.b:(I)V
      62: aload_0
      63: iload_3
      64: invokevirtual #370                // Method d:(I)V
      67: iload_3
      68: iconst_1
      69: isub
      70: istore_3
      71: goto          10
      74: return

  void c(android.support.v7.widget.RecyclerView$x);
    Code:
       0: aload_1
       1: invokestatic  #505                // Method android/support/v7/widget/RecyclerView$x.b:(Landroid/support/v7/widget/RecyclerView$x;)Z
       4: ifeq          21
       7: aload_0
       8: getfield      #38                 // Field b:Ljava/util/ArrayList;
      11: astore_2
      12: aload_2
      13: aload_1
      14: invokevirtual #508                // Method java/util/ArrayList.remove:(Ljava/lang/Object;)Z
      17: pop
      18: goto          29
      21: aload_0
      22: getfield      #36                 // Field a:Ljava/util/ArrayList;
      25: astore_2
      26: goto          12
      29: aload_1
      30: aconst_null
      31: invokestatic  #497                // Method android/support/v7/widget/RecyclerView$x.a:(Landroid/support/v7/widget/RecyclerView$x;Landroid/support/v7/widget/RecyclerView$p;)Landroid/support/v7/widget/RecyclerView$p;
      34: pop
      35: aload_1
      36: iconst_0
      37: invokestatic  #500                // Method android/support/v7/widget/RecyclerView$x.a:(Landroid/support/v7/widget/RecyclerView$x;Z)Z
      40: pop
      41: aload_1
      42: invokevirtual #177                // Method android/support/v7/widget/RecyclerView$x.l:()V
      45: return

  void c(android.view.View);
    Code:
       0: aload_1
       1: invokestatic  #408                // Method android/support/v7/widget/RecyclerView.e:(Landroid/view/View;)Landroid/support/v7/widget/RecyclerView$x;
       4: astore_2
       5: aload_2
       6: bipush        12
       8: invokevirtual #285                // Method android/support/v7/widget/RecyclerView$x.a:(I)Z
      11: ifne          67
      14: aload_2
      15: invokevirtual #510                // Method android/support/v7/widget/RecyclerView$x.x:()Z
      18: ifeq          67
      21: aload_0
      22: getfield      #28                 // Field f:Landroid/support/v7/widget/RecyclerView;
      25: aload_2
      26: invokevirtual #511                // Method android/support/v7/widget/RecyclerView.b:(Landroid/support/v7/widget/RecyclerView$x;)Z
      29: ifeq          35
      32: goto          67
      35: aload_0
      36: getfield      #38                 // Field b:Ljava/util/ArrayList;
      39: ifnonnull     53
      42: aload_0
      43: new           #33                 // class java/util/ArrayList
      46: dup
      47: invokespecial #34                 // Method java/util/ArrayList."<init>":()V
      50: putfield      #38                 // Field b:Ljava/util/ArrayList;
      53: aload_2
      54: aload_0
      55: iconst_1
      56: invokevirtual #514                // Method android/support/v7/widget/RecyclerView$x.a:(Landroid/support/v7/widget/RecyclerView$p;Z)V
      59: aload_0
      60: getfield      #38                 // Field b:Ljava/util/ArrayList;
      63: astore_1
      64: goto          145
      67: aload_2
      68: invokevirtual #314                // Method android/support/v7/widget/RecyclerView$x.n:()Z
      71: ifeq          134
      74: aload_2
      75: invokevirtual #362                // Method android/support/v7/widget/RecyclerView$x.q:()Z
      78: ifne          134
      81: aload_0
      82: getfield      #28                 // Field f:Landroid/support/v7/widget/RecyclerView;
      85: getfield      #98                 // Field android/support/v7/widget/RecyclerView.l:Landroid/support/v7/widget/RecyclerView$a;
      88: invokevirtual #192                // Method android/support/v7/widget/RecyclerView$a.d:()Z
      91: ifne          134
      94: new           #212                // class java/lang/StringBuilder
      97: dup
      98: invokespecial #213                // Method java/lang/StringBuilder."<init>":()V
     101: astore_1
     102: aload_1
     103: ldc_w         #516                // String Called scrap view with an invalid view. Invalid views cannot be reused from scrap, they should rebound from recycler pool.
     106: invokevirtual #219                // Method java/lang/StringBuilder.append:(Ljava/lang/String;)Ljava/lang/StringBuilder;
     109: pop
     110: aload_1
     111: aload_0
     112: getfield      #28                 // Field f:Landroid/support/v7/widget/RecyclerView;
     115: invokevirtual #222                // Method android/support/v7/widget/RecyclerView.a:()Ljava/lang/String;
     118: invokevirtual #219                // Method java/lang/StringBuilder.append:(Ljava/lang/String;)Ljava/lang/StringBuilder;
     121: pop
     122: new           #224                // class java/lang/IllegalArgumentException
     125: dup
     126: aload_1
     127: invokevirtual #227                // Method java/lang/StringBuilder.toString:()Ljava/lang/String;
     130: invokespecial #230                // Method java/lang/IllegalArgumentException."<init>":(Ljava/lang/String;)V
     133: athrow
     134: aload_2
     135: aload_0
     136: iconst_0
     137: invokevirtual #514                // Method android/support/v7/widget/RecyclerView$x.a:(Landroid/support/v7/widget/RecyclerView$p;Z)V
     140: aload_0
     141: getfield      #36                 // Field a:Ljava/util/ArrayList;
     144: astore_1
     145: aload_1
     146: aload_2
     147: invokevirtual #518                // Method java/util/ArrayList.add:(Ljava/lang/Object;)Z
     150: pop
     151: return

  void d();
    Code:
       0: aload_0
       1: getfield      #40                 // Field c:Ljava/util/ArrayList;
       4: invokevirtual #353                // Method java/util/ArrayList.size:()I
       7: iconst_1
       8: isub
       9: istore_1
      10: iload_1
      11: iflt          26
      14: aload_0
      15: iload_1
      16: invokevirtual #370                // Method d:(I)V
      19: iload_1
      20: iconst_1
      21: isub
      22: istore_1
      23: goto          10
      26: aload_0
      27: getfield      #40                 // Field c:Ljava/util/ArrayList;
      30: invokevirtual #376                // Method java/util/ArrayList.clear:()V
      33: invokestatic  #255                // Method android/support/v7/widget/RecyclerView.y:()Z
      36: ifeq          49
      39: aload_0
      40: getfield      #28                 // Field f:Landroid/support/v7/widget/RecyclerView;
      43: getfield      #471                // Field android/support/v7/widget/RecyclerView.B:Landroid/support/v7/widget/at$a;
      46: invokevirtual #519                // Method android/support/v7/widget/at$a.a:()V
      49: return

  void d(int);
    Code:
       0: aload_0
       1: aload_0
       2: getfield      #40                 // Field c:Ljava/util/ArrayList;
       5: iload_1
       6: invokevirtual #357                // Method java/util/ArrayList.get:(I)Ljava/lang/Object;
       9: checkcast     #76                 // class android/support/v7/widget/RecyclerView$x
      12: iconst_1
      13: invokevirtual #480                // Method a:(Landroid/support/v7/widget/RecyclerView$x;Z)V
      16: aload_0
      17: getfield      #40                 // Field c:Ljava/util/ArrayList;
      20: iload_1
      21: invokevirtual #365                // Method java/util/ArrayList.remove:(I)Ljava/lang/Object;
      24: pop
      25: return

  void d(android.support.v7.widget.RecyclerView$x);
    Code:
       0: aload_0
       1: getfield      #28                 // Field f:Landroid/support/v7/widget/RecyclerView;
       4: getfield      #522                // Field android/support/v7/widget/RecyclerView.n:Landroid/support/v7/widget/RecyclerView$q;
       7: ifnull        23
      10: aload_0
      11: getfield      #28                 // Field f:Landroid/support/v7/widget/RecyclerView;
      14: getfield      #522                // Field android/support/v7/widget/RecyclerView.n:Landroid/support/v7/widget/RecyclerView$q;
      17: aload_1
      18: invokeinterface #525,  2          // InterfaceMethod android/support/v7/widget/RecyclerView$q.a:(Landroid/support/v7/widget/RecyclerView$x;)V
      23: aload_0
      24: getfield      #28                 // Field f:Landroid/support/v7/widget/RecyclerView;
      27: getfield      #98                 // Field android/support/v7/widget/RecyclerView.l:Landroid/support/v7/widget/RecyclerView$a;
      30: ifnull        44
      33: aload_0
      34: getfield      #28                 // Field f:Landroid/support/v7/widget/RecyclerView;
      37: getfield      #98                 // Field android/support/v7/widget/RecyclerView.l:Landroid/support/v7/widget/RecyclerView$a;
      40: aload_1
      41: invokevirtual #526                // Method android/support/v7/widget/RecyclerView$a.a:(Landroid/support/v7/widget/RecyclerView$x;)V
      44: aload_0
      45: getfield      #28                 // Field f:Landroid/support/v7/widget/RecyclerView;
      48: getfield      #113                // Field android/support/v7/widget/RecyclerView.C:Landroid/support/v7/widget/RecyclerView$u;
      51: ifnull        65
      54: aload_0
      55: getfield      #28                 // Field f:Landroid/support/v7/widget/RecyclerView;
      58: getfield      #483                // Field android/support/v7/widget/RecyclerView.g:Landroid/support/v7/widget/bw;
      61: aload_1
      62: invokevirtual #487                // Method android/support/v7/widget/bw.g:(Landroid/support/v7/widget/RecyclerView$x;)V
      65: return

  int e();
    Code:
       0: aload_0
       1: getfield      #36                 // Field a:Ljava/util/ArrayList;
       4: invokevirtual #353                // Method java/util/ArrayList.size:()I
       7: ireturn

  android.view.View e(int);
    Code:
       0: aload_0
       1: getfield      #36                 // Field a:Ljava/util/ArrayList;
       4: iload_1
       5: invokevirtual #357                // Method java/util/ArrayList.get:(I)Ljava/lang/Object;
       8: checkcast     #76                 // class android/support/v7/widget/RecyclerView$x
      11: getfield      #126                // Field android/support/v7/widget/RecyclerView$x.a:Landroid/view/View;
      14: areturn

  android.support.v7.widget.RecyclerView$x f(int);
    Code:
       0: aload_0
       1: getfield      #38                 // Field b:Ljava/util/ArrayList;
       4: ifnull        193
       7: aload_0
       8: getfield      #38                 // Field b:Ljava/util/ArrayList;
      11: invokevirtual #353                // Method java/util/ArrayList.size:()I
      14: istore        4
      16: iload         4
      18: ifne          23
      21: aconst_null
      22: areturn
      23: iconst_0
      24: istore_3
      25: iconst_0
      26: istore_2
      27: iload_2
      28: iload         4
      30: if_icmpge     80
      33: aload_0
      34: getfield      #38                 // Field b:Ljava/util/ArrayList;
      37: iload_2
      38: invokevirtual #357                // Method java/util/ArrayList.get:(I)Ljava/lang/Object;
      41: checkcast     #76                 // class android/support/v7/widget/RecyclerView$x
      44: astore        7
      46: aload         7
      48: invokevirtual #175                // Method android/support/v7/widget/RecyclerView$x.k:()Z
      51: ifne          73
      54: aload         7
      56: invokevirtual #424                // Method android/support/v7/widget/RecyclerView$x.d:()I
      59: iload_1
      60: if_icmpne     73
      63: aload         7
      65: bipush        32
      67: invokevirtual #139                // Method android/support/v7/widget/RecyclerView$x.b:(I)V
      70: aload         7
      72: areturn
      73: iload_2
      74: iconst_1
      75: iadd
      76: istore_2
      77: goto          27
      80: aload_0
      81: getfield      #28                 // Field f:Landroid/support/v7/widget/RecyclerView;
      84: getfield      #98                 // Field android/support/v7/widget/RecyclerView.l:Landroid/support/v7/widget/RecyclerView$a;
      87: invokevirtual #192                // Method android/support/v7/widget/RecyclerView$a.d:()Z
      90: ifeq          193
      93: aload_0
      94: getfield      #28                 // Field f:Landroid/support/v7/widget/RecyclerView;
      97: getfield      #182                // Field android/support/v7/widget/RecyclerView.e:Landroid/support/v7/widget/f;
     100: iload_1
     101: invokevirtual #187                // Method android/support/v7/widget/f.b:(I)I
     104: istore_1
     105: iload_1
     106: ifle          193
     109: iload_1
     110: aload_0
     111: getfield      #28                 // Field f:Landroid/support/v7/widget/RecyclerView;
     114: getfield      #98                 // Field android/support/v7/widget/RecyclerView.l:Landroid/support/v7/widget/RecyclerView$a;
     117: invokevirtual #189                // Method android/support/v7/widget/RecyclerView$a.a:()I
     120: if_icmpge     193
     123: aload_0
     124: getfield      #28                 // Field f:Landroid/support/v7/widget/RecyclerView;
     127: getfield      #98                 // Field android/support/v7/widget/RecyclerView.l:Landroid/support/v7/widget/RecyclerView$a;
     130: iload_1
     131: invokevirtual #195                // Method android/support/v7/widget/RecyclerView$a.a:(I)J
     134: lstore        5
     136: iload_3
     137: istore_1
     138: iload_1
     139: iload         4
     141: if_icmpge     193
     144: aload_0
     145: getfield      #38                 // Field b:Ljava/util/ArrayList;
     148: iload_1
     149: invokevirtual #357                // Method java/util/ArrayList.get:(I)Ljava/lang/Object;
     152: checkcast     #76                 // class android/support/v7/widget/RecyclerView$x
     155: astore        7
     157: aload         7
     159: invokevirtual #175                // Method android/support/v7/widget/RecyclerView$x.k:()Z
     162: ifne          186
     165: aload         7
     167: invokevirtual #359                // Method android/support/v7/widget/RecyclerView$x.g:()J
     170: lload         5
     172: lcmp
     173: ifne          186
     176: aload         7
     178: bipush        32
     180: invokevirtual #139                // Method android/support/v7/widget/RecyclerView$x.b:(I)V
     183: aload         7
     185: areturn
     186: iload_1
     187: iconst_1
     188: iadd
     189: istore_1
     190: goto          138
     193: aconst_null
     194: areturn

  void f();
    Code:
       0: aload_0
       1: getfield      #36                 // Field a:Ljava/util/ArrayList;
       4: invokevirtual #376                // Method java/util/ArrayList.clear:()V
       7: aload_0
       8: getfield      #38                 // Field b:Ljava/util/ArrayList;
      11: ifnull        21
      14: aload_0
      15: getfield      #38                 // Field b:Ljava/util/ArrayList;
      18: invokevirtual #376                // Method java/util/ArrayList.clear:()V
      21: return

  android.support.v7.widget.RecyclerView$o g();
    Code:
       0: aload_0
       1: getfield      #89                 // Field e:Landroid/support/v7/widget/RecyclerView$o;
       4: ifnonnull     18
       7: aload_0
       8: new           #91                 // class android/support/v7/widget/RecyclerView$o
      11: dup
      12: invokespecial #527                // Method android/support/v7/widget/RecyclerView$o."<init>":()V
      15: putfield      #89                 // Field e:Landroid/support/v7/widget/RecyclerView$o;
      18: aload_0
      19: getfield      #89                 // Field e:Landroid/support/v7/widget/RecyclerView$o;
      22: areturn

  void h();
    Code:
       0: aload_0
       1: getfield      #40                 // Field c:Ljava/util/ArrayList;
       4: invokevirtual #353                // Method java/util/ArrayList.size:()I
       7: istore_2
       8: iconst_0
       9: istore_1
      10: iload_1
      11: iload_2
      12: if_icmpge     49
      15: aload_0
      16: getfield      #40                 // Field c:Ljava/util/ArrayList;
      19: iload_1
      20: invokevirtual #357                // Method java/util/ArrayList.get:(I)Ljava/lang/Object;
      23: checkcast     #76                 // class android/support/v7/widget/RecyclerView$x
      26: astore_3
      27: aload_3
      28: ifnull        42
      31: aload_3
      32: bipush        6
      34: invokevirtual #139                // Method android/support/v7/widget/RecyclerView$x.b:(I)V
      37: aload_3
      38: aconst_null
      39: invokevirtual #529                // Method android/support/v7/widget/RecyclerView$x.a:(Ljava/lang/Object;)V
      42: iload_1
      43: iconst_1
      44: iadd
      45: istore_1
      46: goto          10
      49: aload_0
      50: getfield      #28                 // Field f:Landroid/support/v7/widget/RecyclerView;
      53: getfield      #98                 // Field android/support/v7/widget/RecyclerView.l:Landroid/support/v7/widget/RecyclerView$a;
      56: ifnull        72
      59: aload_0
      60: getfield      #28                 // Field f:Landroid/support/v7/widget/RecyclerView;
      63: getfield      #98                 // Field android/support/v7/widget/RecyclerView.l:Landroid/support/v7/widget/RecyclerView$a;
      66: invokevirtual #192                // Method android/support/v7/widget/RecyclerView$a.d:()Z
      69: ifne          76
      72: aload_0
      73: invokevirtual #378                // Method d:()V
      76: return

  void i();
    Code:
       0: aload_0
       1: getfield      #40                 // Field c:Ljava/util/ArrayList;
       4: invokevirtual #353                // Method java/util/ArrayList.size:()I
       7: istore_3
       8: iconst_0
       9: istore_2
      10: iconst_0
      11: istore_1
      12: iload_1
      13: iload_3
      14: if_icmpge     38
      17: aload_0
      18: getfield      #40                 // Field c:Ljava/util/ArrayList;
      21: iload_1
      22: invokevirtual #357                // Method java/util/ArrayList.get:(I)Ljava/lang/Object;
      25: checkcast     #76                 // class android/support/v7/widget/RecyclerView$x
      28: invokevirtual #530                // Method android/support/v7/widget/RecyclerView$x.a:()V
      31: iload_1
      32: iconst_1
      33: iadd
      34: istore_1
      35: goto          12
      38: aload_0
      39: getfield      #36                 // Field a:Ljava/util/ArrayList;
      42: invokevirtual #353                // Method java/util/ArrayList.size:()I
      45: istore_3
      46: iconst_0
      47: istore_1
      48: iload_1
      49: iload_3
      50: if_icmpge     74
      53: aload_0
      54: getfield      #36                 // Field a:Ljava/util/ArrayList;
      57: iload_1
      58: invokevirtual #357                // Method java/util/ArrayList.get:(I)Ljava/lang/Object;
      61: checkcast     #76                 // class android/support/v7/widget/RecyclerView$x
      64: invokevirtual #530                // Method android/support/v7/widget/RecyclerView$x.a:()V
      67: iload_1
      68: iconst_1
      69: iadd
      70: istore_1
      71: goto          48
      74: aload_0
      75: getfield      #38                 // Field b:Ljava/util/ArrayList;
      78: ifnull        117
      81: aload_0
      82: getfield      #38                 // Field b:Ljava/util/ArrayList;
      85: invokevirtual #353                // Method java/util/ArrayList.size:()I
      88: istore_3
      89: iload_2
      90: istore_1
      91: iload_1
      92: iload_3
      93: if_icmpge     117
      96: aload_0
      97: getfield      #38                 // Field b:Ljava/util/ArrayList;
     100: iload_1
     101: invokevirtual #357                // Method java/util/ArrayList.get:(I)Ljava/lang/Object;
     104: checkcast     #76                 // class android/support/v7/widget/RecyclerView$x
     107: invokevirtual #530                // Method android/support/v7/widget/RecyclerView$x.a:()V
     110: iload_1
     111: iconst_1
     112: iadd
     113: istore_1
     114: goto          91
     117: return

  void j();
    Code:
       0: aload_0
       1: getfield      #40                 // Field c:Ljava/util/ArrayList;
       4: invokevirtual #353                // Method java/util/ArrayList.size:()I
       7: istore_2
       8: iconst_0
       9: istore_1
      10: iload_1
      11: iload_2
      12: if_icmpge     52
      15: aload_0
      16: getfield      #40                 // Field c:Ljava/util/ArrayList;
      19: iload_1
      20: invokevirtual #357                // Method java/util/ArrayList.get:(I)Ljava/lang/Object;
      23: checkcast     #76                 // class android/support/v7/widget/RecyclerView$x
      26: getfield      #126                // Field android/support/v7/widget/RecyclerView$x.a:Landroid/view/View;
      29: invokevirtual #322                // Method android/view/View.getLayoutParams:()Landroid/view/ViewGroup$LayoutParams;
      32: checkcast     #327                // class android/support/v7/widget/RecyclerView$j
      35: astore_3
      36: aload_3
      37: ifnull        45
      40: aload_3
      41: iconst_1
      42: putfield      #532                // Field android/support/v7/widget/RecyclerView$j.e:Z
      45: iload_1
      46: iconst_1
      47: iadd
      48: istore_1
      49: goto          10
      52: return
}
