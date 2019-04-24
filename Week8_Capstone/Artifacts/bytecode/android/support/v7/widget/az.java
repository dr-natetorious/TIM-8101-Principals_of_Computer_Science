class android.support.v7.widget.az {
  final android.support.v7.widget.az$a a;

  android.support.v7.widget.az(android.support.v7.widget.az$a);
    Code:
       0: aload_0
       1: invokespecial #13                 // Method java/lang/Object."<init>":()V
       4: aload_0
       5: aload_1
       6: putfield      #15                 // Field a:Landroid/support/v7/widget/az$a;
       9: return

  void a(java.util.List<android.support.v7.widget.f$b>);
    Code:
       0: aload_0
       1: aload_1
       2: invokespecial #58                 // Method b:(Ljava/util/List;)I
       5: istore_2
       6: iload_2
       7: iconst_m1
       8: if_icmpeq     23
      11: aload_0
      12: aload_1
      13: iload_2
      14: iload_2
      15: iconst_1
      16: iadd
      17: invokespecial #60                 // Method a:(Ljava/util/List;II)V
      20: goto          0
      23: return

  void a(java.util.List<android.support.v7.widget.f$b>, int, android.support.v7.widget.f$b, int, android.support.v7.widget.f$b);
    Code:
       0: aload_3
       1: getfield      #50                 // Field android/support/v7/widget/f$b.b:I
       4: istore        6
       6: aload_3
       7: getfield      #48                 // Field android/support/v7/widget/f$b.d:I
      10: istore        8
      12: iconst_0
      13: istore        7
      15: iload         6
      17: iload         8
      19: if_icmpge     66
      22: aload         5
      24: getfield      #50                 // Field android/support/v7/widget/f$b.b:I
      27: aload_3
      28: getfield      #50                 // Field android/support/v7/widget/f$b.b:I
      31: if_icmpne     60
      34: aload         5
      36: getfield      #48                 // Field android/support/v7/widget/f$b.d:I
      39: aload_3
      40: getfield      #48                 // Field android/support/v7/widget/f$b.d:I
      43: aload_3
      44: getfield      #50                 // Field android/support/v7/widget/f$b.b:I
      47: isub
      48: if_icmpne     60
      51: iconst_0
      52: istore        6
      54: iconst_1
      55: istore        7
      57: goto          106
      60: iconst_0
      61: istore        6
      63: goto          106
      66: aload         5
      68: getfield      #50                 // Field android/support/v7/widget/f$b.b:I
      71: aload_3
      72: getfield      #48                 // Field android/support/v7/widget/f$b.d:I
      75: iconst_1
      76: iadd
      77: if_icmpne     103
      80: aload         5
      82: getfield      #48                 // Field android/support/v7/widget/f$b.d:I
      85: aload_3
      86: getfield      #50                 // Field android/support/v7/widget/f$b.b:I
      89: aload_3
      90: getfield      #48                 // Field android/support/v7/widget/f$b.d:I
      93: isub
      94: if_icmpne     103
      97: iconst_1
      98: istore        6
     100: goto          54
     103: iconst_1
     104: istore        6
     106: aload_3
     107: getfield      #48                 // Field android/support/v7/widget/f$b.d:I
     110: aload         5
     112: getfield      #50                 // Field android/support/v7/widget/f$b.b:I
     115: if_icmpge     133
     118: aload         5
     120: aload         5
     122: getfield      #50                 // Field android/support/v7/widget/f$b.b:I
     125: iconst_1
     126: isub
     127: putfield      #50                 // Field android/support/v7/widget/f$b.b:I
     130: goto          202
     133: aload_3
     134: getfield      #48                 // Field android/support/v7/widget/f$b.d:I
     137: aload         5
     139: getfield      #50                 // Field android/support/v7/widget/f$b.b:I
     142: aload         5
     144: getfield      #48                 // Field android/support/v7/widget/f$b.d:I
     147: iadd
     148: if_icmpge     202
     151: aload         5
     153: aload         5
     155: getfield      #48                 // Field android/support/v7/widget/f$b.d:I
     158: iconst_1
     159: isub
     160: putfield      #48                 // Field android/support/v7/widget/f$b.d:I
     163: aload_3
     164: iconst_2
     165: putfield      #28                 // Field android/support/v7/widget/f$b.a:I
     168: aload_3
     169: iconst_1
     170: putfield      #48                 // Field android/support/v7/widget/f$b.d:I
     173: aload         5
     175: getfield      #48                 // Field android/support/v7/widget/f$b.d:I
     178: ifne          201
     181: aload_1
     182: iload         4
     184: invokeinterface #64,  2           // InterfaceMethod java/util/List.remove:(I)Ljava/lang/Object;
     189: pop
     190: aload_0
     191: getfield      #15                 // Field a:Landroid/support/v7/widget/az$a;
     194: aload         5
     196: invokeinterface #67,  2           // InterfaceMethod android/support/v7/widget/az$a.a:(Landroid/support/v7/widget/f$b;)V
     201: return
     202: aload_3
     203: getfield      #50                 // Field android/support/v7/widget/f$b.b:I
     206: istore        8
     208: aload         5
     210: getfield      #50                 // Field android/support/v7/widget/f$b.b:I
     213: istore        9
     215: aconst_null
     216: astore        11
     218: iload         8
     220: iload         9
     222: if_icmpgt     240
     225: aload         5
     227: aload         5
     229: getfield      #50                 // Field android/support/v7/widget/f$b.b:I
     232: iconst_1
     233: iadd
     234: putfield      #50                 // Field android/support/v7/widget/f$b.b:I
     237: goto          320
     240: aload_3
     241: getfield      #50                 // Field android/support/v7/widget/f$b.b:I
     244: aload         5
     246: getfield      #50                 // Field android/support/v7/widget/f$b.b:I
     249: aload         5
     251: getfield      #48                 // Field android/support/v7/widget/f$b.d:I
     254: iadd
     255: if_icmpge     320
     258: aload         5
     260: getfield      #50                 // Field android/support/v7/widget/f$b.b:I
     263: istore        8
     265: aload         5
     267: getfield      #48                 // Field android/support/v7/widget/f$b.d:I
     270: istore        9
     272: aload_3
     273: getfield      #50                 // Field android/support/v7/widget/f$b.b:I
     276: istore        10
     278: aload_0
     279: getfield      #15                 // Field a:Landroid/support/v7/widget/az$a;
     282: iconst_2
     283: aload_3
     284: getfield      #50                 // Field android/support/v7/widget/f$b.b:I
     287: iconst_1
     288: iadd
     289: iload         8
     291: iload         9
     293: iadd
     294: iload         10
     296: isub
     297: aconst_null
     298: invokeinterface #70,  5           // InterfaceMethod android/support/v7/widget/az$a.a:(IIILjava/lang/Object;)Landroid/support/v7/widget/f$b;
     303: astore        11
     305: aload         5
     307: aload_3
     308: getfield      #50                 // Field android/support/v7/widget/f$b.b:I
     311: aload         5
     313: getfield      #50                 // Field android/support/v7/widget/f$b.b:I
     316: isub
     317: putfield      #48                 // Field android/support/v7/widget/f$b.d:I
     320: iload         7
     322: ifeq          355
     325: aload_1
     326: iload_2
     327: aload         5
     329: invokeinterface #54,  3           // InterfaceMethod java/util/List.set:(ILjava/lang/Object;)Ljava/lang/Object;
     334: pop
     335: aload_1
     336: iload         4
     338: invokeinterface #64,  2           // InterfaceMethod java/util/List.remove:(I)Ljava/lang/Object;
     343: pop
     344: aload_0
     345: getfield      #15                 // Field a:Landroid/support/v7/widget/az$a;
     348: aload_3
     349: invokeinterface #67,  2           // InterfaceMethod android/support/v7/widget/az$a.a:(Landroid/support/v7/widget/f$b;)V
     354: return
     355: iload         6
     357: ifeq          472
     360: aload         11
     362: ifnull        417
     365: aload_3
     366: getfield      #50                 // Field android/support/v7/widget/f$b.b:I
     369: aload         11
     371: getfield      #50                 // Field android/support/v7/widget/f$b.b:I
     374: if_icmple     391
     377: aload_3
     378: aload_3
     379: getfield      #50                 // Field android/support/v7/widget/f$b.b:I
     382: aload         11
     384: getfield      #48                 // Field android/support/v7/widget/f$b.d:I
     387: isub
     388: putfield      #50                 // Field android/support/v7/widget/f$b.b:I
     391: aload_3
     392: getfield      #48                 // Field android/support/v7/widget/f$b.d:I
     395: aload         11
     397: getfield      #50                 // Field android/support/v7/widget/f$b.b:I
     400: if_icmple     417
     403: aload_3
     404: aload_3
     405: getfield      #48                 // Field android/support/v7/widget/f$b.d:I
     408: aload         11
     410: getfield      #48                 // Field android/support/v7/widget/f$b.d:I
     413: isub
     414: putfield      #48                 // Field android/support/v7/widget/f$b.d:I
     417: aload_3
     418: getfield      #50                 // Field android/support/v7/widget/f$b.b:I
     421: aload         5
     423: getfield      #50                 // Field android/support/v7/widget/f$b.b:I
     426: if_icmple     443
     429: aload_3
     430: aload_3
     431: getfield      #50                 // Field android/support/v7/widget/f$b.b:I
     434: aload         5
     436: getfield      #48                 // Field android/support/v7/widget/f$b.d:I
     439: isub
     440: putfield      #50                 // Field android/support/v7/widget/f$b.b:I
     443: aload_3
     444: getfield      #48                 // Field android/support/v7/widget/f$b.d:I
     447: aload         5
     449: getfield      #50                 // Field android/support/v7/widget/f$b.b:I
     452: if_icmple     570
     455: aload_3
     456: aload_3
     457: getfield      #48                 // Field android/support/v7/widget/f$b.d:I
     460: aload         5
     462: getfield      #48                 // Field android/support/v7/widget/f$b.d:I
     465: isub
     466: putfield      #48                 // Field android/support/v7/widget/f$b.d:I
     469: goto          570
     472: aload         11
     474: ifnull        529
     477: aload_3
     478: getfield      #50                 // Field android/support/v7/widget/f$b.b:I
     481: aload         11
     483: getfield      #50                 // Field android/support/v7/widget/f$b.b:I
     486: if_icmplt     503
     489: aload_3
     490: aload_3
     491: getfield      #50                 // Field android/support/v7/widget/f$b.b:I
     494: aload         11
     496: getfield      #48                 // Field android/support/v7/widget/f$b.d:I
     499: isub
     500: putfield      #50                 // Field android/support/v7/widget/f$b.b:I
     503: aload_3
     504: getfield      #48                 // Field android/support/v7/widget/f$b.d:I
     507: aload         11
     509: getfield      #50                 // Field android/support/v7/widget/f$b.b:I
     512: if_icmplt     529
     515: aload_3
     516: aload_3
     517: getfield      #48                 // Field android/support/v7/widget/f$b.d:I
     520: aload         11
     522: getfield      #48                 // Field android/support/v7/widget/f$b.d:I
     525: isub
     526: putfield      #48                 // Field android/support/v7/widget/f$b.d:I
     529: aload_3
     530: getfield      #50                 // Field android/support/v7/widget/f$b.b:I
     533: aload         5
     535: getfield      #50                 // Field android/support/v7/widget/f$b.b:I
     538: if_icmplt     555
     541: aload_3
     542: aload_3
     543: getfield      #50                 // Field android/support/v7/widget/f$b.b:I
     546: aload         5
     548: getfield      #48                 // Field android/support/v7/widget/f$b.d:I
     551: isub
     552: putfield      #50                 // Field android/support/v7/widget/f$b.b:I
     555: aload_3
     556: getfield      #48                 // Field android/support/v7/widget/f$b.d:I
     559: aload         5
     561: getfield      #50                 // Field android/support/v7/widget/f$b.b:I
     564: if_icmplt     570
     567: goto          455
     570: aload_1
     571: iload_2
     572: aload         5
     574: invokeinterface #54,  3           // InterfaceMethod java/util/List.set:(ILjava/lang/Object;)Ljava/lang/Object;
     579: pop
     580: aload_3
     581: getfield      #50                 // Field android/support/v7/widget/f$b.b:I
     584: aload_3
     585: getfield      #48                 // Field android/support/v7/widget/f$b.d:I
     588: if_icmpeq     604
     591: aload_1
     592: iload         4
     594: aload_3
     595: invokeinterface #54,  3           // InterfaceMethod java/util/List.set:(ILjava/lang/Object;)Ljava/lang/Object;
     600: pop
     601: goto          613
     604: aload_1
     605: iload         4
     607: invokeinterface #64,  2           // InterfaceMethod java/util/List.remove:(I)Ljava/lang/Object;
     612: pop
     613: aload         11
     615: ifnull        627
     618: aload_1
     619: iload_2
     620: aload         11
     622: invokeinterface #74,  3           // InterfaceMethod java/util/List.add:(ILjava/lang/Object;)V
     627: return

  void b(java.util.List<android.support.v7.widget.f$b>, int, android.support.v7.widget.f$b, int, android.support.v7.widget.f$b);
    Code:
       0: aload_3
       1: getfield      #48                 // Field android/support/v7/widget/f$b.d:I
       4: istore        6
       6: aload         5
       8: getfield      #50                 // Field android/support/v7/widget/f$b.b:I
      11: istore        7
      13: aconst_null
      14: astore        9
      16: iload         6
      18: iload         7
      20: if_icmpge     38
      23: aload         5
      25: aload         5
      27: getfield      #50                 // Field android/support/v7/widget/f$b.b:I
      30: iconst_1
      31: isub
      32: putfield      #50                 // Field android/support/v7/widget/f$b.b:I
      35: goto          93
      38: aload_3
      39: getfield      #48                 // Field android/support/v7/widget/f$b.d:I
      42: aload         5
      44: getfield      #50                 // Field android/support/v7/widget/f$b.b:I
      47: aload         5
      49: getfield      #48                 // Field android/support/v7/widget/f$b.d:I
      52: iadd
      53: if_icmpge     93
      56: aload         5
      58: aload         5
      60: getfield      #48                 // Field android/support/v7/widget/f$b.d:I
      63: iconst_1
      64: isub
      65: putfield      #48                 // Field android/support/v7/widget/f$b.d:I
      68: aload_0
      69: getfield      #15                 // Field a:Landroid/support/v7/widget/az$a;
      72: iconst_4
      73: aload_3
      74: getfield      #50                 // Field android/support/v7/widget/f$b.b:I
      77: iconst_1
      78: aload         5
      80: getfield      #77                 // Field android/support/v7/widget/f$b.c:Ljava/lang/Object;
      83: invokeinterface #70,  5           // InterfaceMethod android/support/v7/widget/az$a.a:(IIILjava/lang/Object;)Landroid/support/v7/widget/f$b;
      88: astore        8
      90: goto          96
      93: aconst_null
      94: astore        8
      96: aload_3
      97: getfield      #50                 // Field android/support/v7/widget/f$b.b:I
     100: aload         5
     102: getfield      #50                 // Field android/support/v7/widget/f$b.b:I
     105: if_icmpgt     123
     108: aload         5
     110: aload         5
     112: getfield      #50                 // Field android/support/v7/widget/f$b.b:I
     115: iconst_1
     116: iadd
     117: putfield      #50                 // Field android/support/v7/widget/f$b.b:I
     120: goto          197
     123: aload_3
     124: getfield      #50                 // Field android/support/v7/widget/f$b.b:I
     127: aload         5
     129: getfield      #50                 // Field android/support/v7/widget/f$b.b:I
     132: aload         5
     134: getfield      #48                 // Field android/support/v7/widget/f$b.d:I
     137: iadd
     138: if_icmpge     197
     141: aload         5
     143: getfield      #50                 // Field android/support/v7/widget/f$b.b:I
     146: aload         5
     148: getfield      #48                 // Field android/support/v7/widget/f$b.d:I
     151: iadd
     152: aload_3
     153: getfield      #50                 // Field android/support/v7/widget/f$b.b:I
     156: isub
     157: istore        6
     159: aload_0
     160: getfield      #15                 // Field a:Landroid/support/v7/widget/az$a;
     163: iconst_4
     164: aload_3
     165: getfield      #50                 // Field android/support/v7/widget/f$b.b:I
     168: iconst_1
     169: iadd
     170: iload         6
     172: aload         5
     174: getfield      #77                 // Field android/support/v7/widget/f$b.c:Ljava/lang/Object;
     177: invokeinterface #70,  5           // InterfaceMethod android/support/v7/widget/az$a.a:(IIILjava/lang/Object;)Landroid/support/v7/widget/f$b;
     182: astore        9
     184: aload         5
     186: aload         5
     188: getfield      #48                 // Field android/support/v7/widget/f$b.d:I
     191: iload         6
     193: isub
     194: putfield      #48                 // Field android/support/v7/widget/f$b.d:I
     197: aload_1
     198: iload         4
     200: aload_3
     201: invokeinterface #54,  3           // InterfaceMethod java/util/List.set:(ILjava/lang/Object;)Ljava/lang/Object;
     206: pop
     207: aload         5
     209: getfield      #48                 // Field android/support/v7/widget/f$b.d:I
     212: ifle          228
     215: aload_1
     216: iload_2
     217: aload         5
     219: invokeinterface #54,  3           // InterfaceMethod java/util/List.set:(ILjava/lang/Object;)Ljava/lang/Object;
     224: pop
     225: goto          247
     228: aload_1
     229: iload_2
     230: invokeinterface #64,  2           // InterfaceMethod java/util/List.remove:(I)Ljava/lang/Object;
     235: pop
     236: aload_0
     237: getfield      #15                 // Field a:Landroid/support/v7/widget/az$a;
     240: aload         5
     242: invokeinterface #67,  2           // InterfaceMethod android/support/v7/widget/az$a.a:(Landroid/support/v7/widget/f$b;)V
     247: aload         8
     249: ifnull        261
     252: aload_1
     253: iload_2
     254: aload         8
     256: invokeinterface #74,  3           // InterfaceMethod java/util/List.add:(ILjava/lang/Object;)V
     261: aload         9
     263: ifnull        275
     266: aload_1
     267: iload_2
     268: aload         9
     270: invokeinterface #74,  3           // InterfaceMethod java/util/List.add:(ILjava/lang/Object;)V
     275: return
}
