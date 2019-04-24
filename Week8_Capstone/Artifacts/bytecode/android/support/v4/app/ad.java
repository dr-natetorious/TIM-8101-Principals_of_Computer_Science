class android.support.v4.app.ad implements android.support.v4.app.ab {
  android.support.v4.app.ad(android.support.v4.app.ac$b);
    Code:
       0: aload_0
       1: invokespecial #26                 // Method java/lang/Object."<init>":()V
       4: aload_0
       5: new           #28                 // class java/util/ArrayList
       8: dup
       9: invokespecial #29                 // Method java/util/ArrayList."<init>":()V
      12: putfield      #31                 // Field e:Ljava/util/List;
      15: aload_0
      16: new           #33                 // class android/os/Bundle
      19: dup
      20: invokespecial #34                 // Method android/os/Bundle."<init>":()V
      23: putfield      #36                 // Field f:Landroid/os/Bundle;
      26: aload_0
      27: aload_1
      28: putfield      #38                 // Field b:Landroid/support/v4/app/ac$b;
      31: getstatic     #43                 // Field android/os/Build$VERSION.SDK_INT:I
      34: bipush        26
      36: if_icmplt     63
      39: new           #45                 // class android/app/Notification$Builder
      42: dup
      43: aload_1
      44: getfield      #50                 // Field android/support/v4/app/ac$b.a:Landroid/content/Context;
      47: aload_1
      48: getfield      #54                 // Field android/support/v4/app/ac$b.H:Ljava/lang/String;
      51: invokespecial #57                 // Method android/app/Notification$Builder."<init>":(Landroid/content/Context;Ljava/lang/String;)V
      54: astore_3
      55: aload_0
      56: aload_3
      57: putfield      #59                 // Field a:Landroid/app/Notification$Builder;
      60: goto          78
      63: new           #45                 // class android/app/Notification$Builder
      66: dup
      67: aload_1
      68: getfield      #50                 // Field android/support/v4/app/ac$b.a:Landroid/content/Context;
      71: invokespecial #62                 // Method android/app/Notification$Builder."<init>":(Landroid/content/Context;)V
      74: astore_3
      75: goto          55
      78: aload_1
      79: getfield      #66                 // Field android/support/v4/app/ac$b.M:Landroid/app/Notification;
      82: astore        5
      84: aload_0
      85: getfield      #59                 // Field a:Landroid/app/Notification$Builder;
      88: aload         5
      90: getfield      #72                 // Field android/app/Notification.when:J
      93: invokevirtual #76                 // Method android/app/Notification$Builder.setWhen:(J)Landroid/app/Notification$Builder;
      96: aload         5
      98: getfield      #79                 // Field android/app/Notification.icon:I
     101: aload         5
     103: getfield      #82                 // Field android/app/Notification.iconLevel:I
     106: invokevirtual #86                 // Method android/app/Notification$Builder.setSmallIcon:(II)Landroid/app/Notification$Builder;
     109: aload         5
     111: getfield      #89                 // Field android/app/Notification.contentView:Landroid/widget/RemoteViews;
     114: invokevirtual #93                 // Method android/app/Notification$Builder.setContent:(Landroid/widget/RemoteViews;)Landroid/app/Notification$Builder;
     117: aload         5
     119: getfield      #97                 // Field android/app/Notification.tickerText:Ljava/lang/CharSequence;
     122: aload_1
     123: getfield      #99                 // Field android/support/v4/app/ac$b.g:Landroid/widget/RemoteViews;
     126: invokevirtual #103                // Method android/app/Notification$Builder.setTicker:(Ljava/lang/CharSequence;Landroid/widget/RemoteViews;)Landroid/app/Notification$Builder;
     129: aload         5
     131: getfield      #107                // Field android/app/Notification.vibrate:[J
     134: invokevirtual #111                // Method android/app/Notification$Builder.setVibrate:([J)Landroid/app/Notification$Builder;
     137: aload         5
     139: getfield      #114                // Field android/app/Notification.ledARGB:I
     142: aload         5
     144: getfield      #117                // Field android/app/Notification.ledOnMS:I
     147: aload         5
     149: getfield      #120                // Field android/app/Notification.ledOffMS:I
     152: invokevirtual #124                // Method android/app/Notification$Builder.setLights:(III)Landroid/app/Notification$Builder;
     155: astore_3
     156: aload         5
     158: getfield      #127                // Field android/app/Notification.flags:I
     161: iconst_2
     162: iand
     163: ifeq          171
     166: iconst_1
     167: istore_2
     168: goto          173
     171: iconst_0
     172: istore_2
     173: aload_3
     174: iload_2
     175: invokevirtual #131                // Method android/app/Notification$Builder.setOngoing:(Z)Landroid/app/Notification$Builder;
     178: astore_3
     179: aload         5
     181: getfield      #127                // Field android/app/Notification.flags:I
     184: bipush        8
     186: iand
     187: ifeq          195
     190: iconst_1
     191: istore_2
     192: goto          197
     195: iconst_0
     196: istore_2
     197: aload_3
     198: iload_2
     199: invokevirtual #134                // Method android/app/Notification$Builder.setOnlyAlertOnce:(Z)Landroid/app/Notification$Builder;
     202: astore_3
     203: aload         5
     205: getfield      #127                // Field android/app/Notification.flags:I
     208: bipush        16
     210: iand
     211: ifeq          219
     214: iconst_1
     215: istore_2
     216: goto          221
     219: iconst_0
     220: istore_2
     221: aload_3
     222: iload_2
     223: invokevirtual #137                // Method android/app/Notification$Builder.setAutoCancel:(Z)Landroid/app/Notification$Builder;
     226: aload         5
     228: getfield      #140                // Field android/app/Notification.defaults:I
     231: invokevirtual #144                // Method android/app/Notification$Builder.setDefaults:(I)Landroid/app/Notification$Builder;
     234: aload_1
     235: getfield      #146                // Field android/support/v4/app/ac$b.c:Ljava/lang/CharSequence;
     238: invokevirtual #150                // Method android/app/Notification$Builder.setContentTitle:(Ljava/lang/CharSequence;)Landroid/app/Notification$Builder;
     241: aload_1
     242: getfield      #152                // Field android/support/v4/app/ac$b.d:Ljava/lang/CharSequence;
     245: invokevirtual #155                // Method android/app/Notification$Builder.setContentText:(Ljava/lang/CharSequence;)Landroid/app/Notification$Builder;
     248: aload_1
     249: getfield      #158                // Field android/support/v4/app/ac$b.i:Ljava/lang/CharSequence;
     252: invokevirtual #161                // Method android/app/Notification$Builder.setContentInfo:(Ljava/lang/CharSequence;)Landroid/app/Notification$Builder;
     255: aload_1
     256: getfield      #164                // Field android/support/v4/app/ac$b.e:Landroid/app/PendingIntent;
     259: invokevirtual #168                // Method android/app/Notification$Builder.setContentIntent:(Landroid/app/PendingIntent;)Landroid/app/Notification$Builder;
     262: aload         5
     264: getfield      #171                // Field android/app/Notification.deleteIntent:Landroid/app/PendingIntent;
     267: invokevirtual #174                // Method android/app/Notification$Builder.setDeleteIntent:(Landroid/app/PendingIntent;)Landroid/app/Notification$Builder;
     270: astore_3
     271: aload_1
     272: getfield      #176                // Field android/support/v4/app/ac$b.f:Landroid/app/PendingIntent;
     275: astore        4
     277: aload         5
     279: getfield      #127                // Field android/app/Notification.flags:I
     282: sipush        128
     285: iand
     286: ifeq          294
     289: iconst_1
     290: istore_2
     291: goto          296
     294: iconst_0
     295: istore_2
     296: aload_3
     297: aload         4
     299: iload_2
     300: invokevirtual #180                // Method android/app/Notification$Builder.setFullScreenIntent:(Landroid/app/PendingIntent;Z)Landroid/app/Notification$Builder;
     303: aload_1
     304: getfield      #183                // Field android/support/v4/app/ac$b.h:Landroid/graphics/Bitmap;
     307: invokevirtual #187                // Method android/app/Notification$Builder.setLargeIcon:(Landroid/graphics/Bitmap;)Landroid/app/Notification$Builder;
     310: aload_1
     311: getfield      #190                // Field android/support/v4/app/ac$b.j:I
     314: invokevirtual #193                // Method android/app/Notification$Builder.setNumber:(I)Landroid/app/Notification$Builder;
     317: aload_1
     318: getfield      #196                // Field android/support/v4/app/ac$b.q:I
     321: aload_1
     322: getfield      #199                // Field android/support/v4/app/ac$b.r:I
     325: aload_1
     326: getfield      #203                // Field android/support/v4/app/ac$b.s:Z
     329: invokevirtual #207                // Method android/app/Notification$Builder.setProgress:(IIZ)Landroid/app/Notification$Builder;
     332: pop
     333: getstatic     #43                 // Field android/os/Build$VERSION.SDK_INT:I
     336: bipush        21
     338: if_icmpge     359
     341: aload_0
     342: getfield      #59                 // Field a:Landroid/app/Notification$Builder;
     345: aload         5
     347: getfield      #211                // Field android/app/Notification.sound:Landroid/net/Uri;
     350: aload         5
     352: getfield      #214                // Field android/app/Notification.audioStreamType:I
     355: invokevirtual #218                // Method android/app/Notification$Builder.setSound:(Landroid/net/Uri;I)Landroid/app/Notification$Builder;
     358: pop
     359: getstatic     #43                 // Field android/os/Build$VERSION.SDK_INT:I
     362: bipush        16
     364: if_icmplt     568
     367: aload_0
     368: getfield      #59                 // Field a:Landroid/app/Notification$Builder;
     371: aload_1
     372: getfield      #221                // Field android/support/v4/app/ac$b.o:Ljava/lang/CharSequence;
     375: invokevirtual #224                // Method android/app/Notification$Builder.setSubText:(Ljava/lang/CharSequence;)Landroid/app/Notification$Builder;
     378: aload_1
     379: getfield      #227                // Field android/support/v4/app/ac$b.m:Z
     382: invokevirtual #230                // Method android/app/Notification$Builder.setUsesChronometer:(Z)Landroid/app/Notification$Builder;
     385: aload_1
     386: getfield      #233                // Field android/support/v4/app/ac$b.k:I
     389: invokevirtual #236                // Method android/app/Notification$Builder.setPriority:(I)Landroid/app/Notification$Builder;
     392: pop
     393: aload_1
     394: getfield      #239                // Field android/support/v4/app/ac$b.b:Ljava/util/ArrayList;
     397: invokevirtual #243                // Method java/util/ArrayList.iterator:()Ljava/util/Iterator;
     400: astore_3
     401: aload_3
     402: invokeinterface #249,  1          // InterfaceMethod java/util/Iterator.hasNext:()Z
     407: ifeq          426
     410: aload_0
     411: aload_3
     412: invokeinterface #253,  1          // InterfaceMethod java/util/Iterator.next:()Ljava/lang/Object;
     417: checkcast     #255                // class android/support/v4/app/ac$a
     420: invokespecial #258                // Method a:(Landroid/support/v4/app/ac$a;)V
     423: goto          401
     426: aload_1
     427: getfield      #261                // Field android/support/v4/app/ac$b.A:Landroid/os/Bundle;
     430: ifnull        444
     433: aload_0
     434: getfield      #36                 // Field f:Landroid/os/Bundle;
     437: aload_1
     438: getfield      #261                // Field android/support/v4/app/ac$b.A:Landroid/os/Bundle;
     441: invokevirtual #265                // Method android/os/Bundle.putAll:(Landroid/os/Bundle;)V
     444: getstatic     #43                 // Field android/os/Build$VERSION.SDK_INT:I
     447: bipush        20
     449: if_icmpge     552
     452: aload_1
     453: getfield      #268                // Field android/support/v4/app/ac$b.w:Z
     456: ifeq          470
     459: aload_0
     460: getfield      #36                 // Field f:Landroid/os/Bundle;
     463: ldc_w         #270                // String android.support.localOnly
     466: iconst_1
     467: invokevirtual #274                // Method android/os/Bundle.putBoolean:(Ljava/lang/String;Z)V
     470: aload_1
     471: getfield      #277                // Field android/support/v4/app/ac$b.t:Ljava/lang/String;
     474: ifnull        531
     477: aload_0
     478: getfield      #36                 // Field f:Landroid/os/Bundle;
     481: ldc_w         #279                // String android.support.groupKey
     484: aload_1
     485: getfield      #277                // Field android/support/v4/app/ac$b.t:Ljava/lang/String;
     488: invokevirtual #283                // Method android/os/Bundle.putString:(Ljava/lang/String;Ljava/lang/String;)V
     491: aload_1
     492: getfield      #286                // Field android/support/v4/app/ac$b.u:Z
     495: ifeq          518
     498: aload_0
     499: getfield      #36                 // Field f:Landroid/os/Bundle;
     502: astore_3
     503: ldc_w         #288                // String android.support.isGroupSummary
     506: astore        4
     508: aload_3
     509: aload         4
     511: iconst_1
     512: invokevirtual #274                // Method android/os/Bundle.putBoolean:(Ljava/lang/String;Z)V
     515: goto          531
     518: aload_0
     519: getfield      #36                 // Field f:Landroid/os/Bundle;
     522: astore_3
     523: ldc_w         #290                // String android.support.useSideChannel
     526: astore        4
     528: goto          508
     531: aload_1
     532: getfield      #293                // Field android/support/v4/app/ac$b.v:Ljava/lang/String;
     535: ifnull        552
     538: aload_0
     539: getfield      #36                 // Field f:Landroid/os/Bundle;
     542: ldc_w         #295                // String android.support.sortKey
     545: aload_1
     546: getfield      #293                // Field android/support/v4/app/ac$b.v:Ljava/lang/String;
     549: invokevirtual #283                // Method android/os/Bundle.putString:(Ljava/lang/String;Ljava/lang/String;)V
     552: aload_0
     553: aload_1
     554: getfield      #298                // Field android/support/v4/app/ac$b.E:Landroid/widget/RemoteViews;
     557: putfield      #300                // Field c:Landroid/widget/RemoteViews;
     560: aload_0
     561: aload_1
     562: getfield      #303                // Field android/support/v4/app/ac$b.F:Landroid/widget/RemoteViews;
     565: putfield      #305                // Field d:Landroid/widget/RemoteViews;
     568: getstatic     #43                 // Field android/os/Build$VERSION.SDK_INT:I
     571: bipush        19
     573: if_icmplt     643
     576: aload_0
     577: getfield      #59                 // Field a:Landroid/app/Notification$Builder;
     580: aload_1
     581: getfield      #308                // Field android/support/v4/app/ac$b.l:Z
     584: invokevirtual #311                // Method android/app/Notification$Builder.setShowWhen:(Z)Landroid/app/Notification$Builder;
     587: pop
     588: getstatic     #43                 // Field android/os/Build$VERSION.SDK_INT:I
     591: bipush        21
     593: if_icmpge     643
     596: aload_1
     597: getfield      #314                // Field android/support/v4/app/ac$b.N:Ljava/util/ArrayList;
     600: ifnull        643
     603: aload_1
     604: getfield      #314                // Field android/support/v4/app/ac$b.N:Ljava/util/ArrayList;
     607: invokevirtual #317                // Method java/util/ArrayList.isEmpty:()Z
     610: ifne          643
     613: aload_0
     614: getfield      #36                 // Field f:Landroid/os/Bundle;
     617: ldc_w         #319                // String android.people
     620: aload_1
     621: getfield      #314                // Field android/support/v4/app/ac$b.N:Ljava/util/ArrayList;
     624: aload_1
     625: getfield      #314                // Field android/support/v4/app/ac$b.N:Ljava/util/ArrayList;
     628: invokevirtual #323                // Method java/util/ArrayList.size:()I
     631: anewarray     #325                // class java/lang/String
     634: invokevirtual #329                // Method java/util/ArrayList.toArray:([Ljava/lang/Object;)[Ljava/lang/Object;
     637: checkcast     #331                // class "[Ljava/lang/String;"
     640: invokevirtual #335                // Method android/os/Bundle.putStringArray:(Ljava/lang/String;[Ljava/lang/String;)V
     643: getstatic     #43                 // Field android/os/Build$VERSION.SDK_INT:I
     646: bipush        20
     648: if_icmplt     692
     651: aload_0
     652: getfield      #59                 // Field a:Landroid/app/Notification$Builder;
     655: aload_1
     656: getfield      #268                // Field android/support/v4/app/ac$b.w:Z
     659: invokevirtual #338                // Method android/app/Notification$Builder.setLocalOnly:(Z)Landroid/app/Notification$Builder;
     662: aload_1
     663: getfield      #277                // Field android/support/v4/app/ac$b.t:Ljava/lang/String;
     666: invokevirtual #342                // Method android/app/Notification$Builder.setGroup:(Ljava/lang/String;)Landroid/app/Notification$Builder;
     669: aload_1
     670: getfield      #286                // Field android/support/v4/app/ac$b.u:Z
     673: invokevirtual #345                // Method android/app/Notification$Builder.setGroupSummary:(Z)Landroid/app/Notification$Builder;
     676: aload_1
     677: getfield      #293                // Field android/support/v4/app/ac$b.v:Ljava/lang/String;
     680: invokevirtual #348                // Method android/app/Notification$Builder.setSortKey:(Ljava/lang/String;)Landroid/app/Notification$Builder;
     683: pop
     684: aload_0
     685: aload_1
     686: getfield      #351                // Field android/support/v4/app/ac$b.L:I
     689: putfield      #353                // Field g:I
     692: getstatic     #43                 // Field android/os/Build$VERSION.SDK_INT:I
     695: bipush        21
     697: if_icmplt     795
     700: aload_0
     701: getfield      #59                 // Field a:Landroid/app/Notification$Builder;
     704: aload_1
     705: getfield      #356                // Field android/support/v4/app/ac$b.z:Ljava/lang/String;
     708: invokevirtual #359                // Method android/app/Notification$Builder.setCategory:(Ljava/lang/String;)Landroid/app/Notification$Builder;
     711: aload_1
     712: getfield      #362                // Field android/support/v4/app/ac$b.B:I
     715: invokevirtual #365                // Method android/app/Notification$Builder.setColor:(I)Landroid/app/Notification$Builder;
     718: aload_1
     719: getfield      #368                // Field android/support/v4/app/ac$b.C:I
     722: invokevirtual #371                // Method android/app/Notification$Builder.setVisibility:(I)Landroid/app/Notification$Builder;
     725: aload_1
     726: getfield      #374                // Field android/support/v4/app/ac$b.D:Landroid/app/Notification;
     729: invokevirtual #378                // Method android/app/Notification$Builder.setPublicVersion:(Landroid/app/Notification;)Landroid/app/Notification$Builder;
     732: aload         5
     734: getfield      #211                // Field android/app/Notification.sound:Landroid/net/Uri;
     737: aload         5
     739: getfield      #382                // Field android/app/Notification.audioAttributes:Landroid/media/AudioAttributes;
     742: invokevirtual #385                // Method android/app/Notification$Builder.setSound:(Landroid/net/Uri;Landroid/media/AudioAttributes;)Landroid/app/Notification$Builder;
     745: pop
     746: aload_1
     747: getfield      #314                // Field android/support/v4/app/ac$b.N:Ljava/util/ArrayList;
     750: invokevirtual #243                // Method java/util/ArrayList.iterator:()Ljava/util/Iterator;
     753: astore_3
     754: aload_3
     755: invokeinterface #249,  1          // InterfaceMethod java/util/Iterator.hasNext:()Z
     760: ifeq          787
     763: aload_3
     764: invokeinterface #253,  1          // InterfaceMethod java/util/Iterator.next:()Ljava/lang/Object;
     769: checkcast     #325                // class java/lang/String
     772: astore        4
     774: aload_0
     775: getfield      #59                 // Field a:Landroid/app/Notification$Builder;
     778: aload         4
     780: invokevirtual #388                // Method android/app/Notification$Builder.addPerson:(Ljava/lang/String;)Landroid/app/Notification$Builder;
     783: pop
     784: goto          754
     787: aload_0
     788: aload_1
     789: getfield      #391                // Field android/support/v4/app/ac$b.G:Landroid/widget/RemoteViews;
     792: putfield      #393                // Field h:Landroid/widget/RemoteViews;
     795: getstatic     #43                 // Field android/os/Build$VERSION.SDK_INT:I
     798: bipush        24
     800: if_icmplt     879
     803: aload_0
     804: getfield      #59                 // Field a:Landroid/app/Notification$Builder;
     807: aload_1
     808: getfield      #261                // Field android/support/v4/app/ac$b.A:Landroid/os/Bundle;
     811: invokevirtual #397                // Method android/app/Notification$Builder.setExtras:(Landroid/os/Bundle;)Landroid/app/Notification$Builder;
     814: aload_1
     815: getfield      #401                // Field android/support/v4/app/ac$b.p:[Ljava/lang/CharSequence;
     818: invokevirtual #405                // Method android/app/Notification$Builder.setRemoteInputHistory:([Ljava/lang/CharSequence;)Landroid/app/Notification$Builder;
     821: pop
     822: aload_1
     823: getfield      #298                // Field android/support/v4/app/ac$b.E:Landroid/widget/RemoteViews;
     826: ifnull        841
     829: aload_0
     830: getfield      #59                 // Field a:Landroid/app/Notification$Builder;
     833: aload_1
     834: getfield      #298                // Field android/support/v4/app/ac$b.E:Landroid/widget/RemoteViews;
     837: invokevirtual #408                // Method android/app/Notification$Builder.setCustomContentView:(Landroid/widget/RemoteViews;)Landroid/app/Notification$Builder;
     840: pop
     841: aload_1
     842: getfield      #303                // Field android/support/v4/app/ac$b.F:Landroid/widget/RemoteViews;
     845: ifnull        860
     848: aload_0
     849: getfield      #59                 // Field a:Landroid/app/Notification$Builder;
     852: aload_1
     853: getfield      #303                // Field android/support/v4/app/ac$b.F:Landroid/widget/RemoteViews;
     856: invokevirtual #411                // Method android/app/Notification$Builder.setCustomBigContentView:(Landroid/widget/RemoteViews;)Landroid/app/Notification$Builder;
     859: pop
     860: aload_1
     861: getfield      #391                // Field android/support/v4/app/ac$b.G:Landroid/widget/RemoteViews;
     864: ifnull        879
     867: aload_0
     868: getfield      #59                 // Field a:Landroid/app/Notification$Builder;
     871: aload_1
     872: getfield      #391                // Field android/support/v4/app/ac$b.G:Landroid/widget/RemoteViews;
     875: invokevirtual #414                // Method android/app/Notification$Builder.setCustomHeadsUpContentView:(Landroid/widget/RemoteViews;)Landroid/app/Notification$Builder;
     878: pop
     879: getstatic     #43                 // Field android/os/Build$VERSION.SDK_INT:I
     882: bipush        26
     884: if_icmplt     972
     887: aload_0
     888: getfield      #59                 // Field a:Landroid/app/Notification$Builder;
     891: aload_1
     892: getfield      #416                // Field android/support/v4/app/ac$b.I:I
     895: invokevirtual #419                // Method android/app/Notification$Builder.setBadgeIconType:(I)Landroid/app/Notification$Builder;
     898: aload_1
     899: getfield      #421                // Field android/support/v4/app/ac$b.J:Ljava/lang/String;
     902: invokevirtual #424                // Method android/app/Notification$Builder.setShortcutId:(Ljava/lang/String;)Landroid/app/Notification$Builder;
     905: aload_1
     906: getfield      #427                // Field android/support/v4/app/ac$b.K:J
     909: invokevirtual #430                // Method android/app/Notification$Builder.setTimeoutAfter:(J)Landroid/app/Notification$Builder;
     912: aload_1
     913: getfield      #351                // Field android/support/v4/app/ac$b.L:I
     916: invokevirtual #433                // Method android/app/Notification$Builder.setGroupAlertBehavior:(I)Landroid/app/Notification$Builder;
     919: pop
     920: aload_1
     921: getfield      #436                // Field android/support/v4/app/ac$b.y:Z
     924: ifeq          939
     927: aload_0
     928: getfield      #59                 // Field a:Landroid/app/Notification$Builder;
     931: aload_1
     932: getfield      #439                // Field android/support/v4/app/ac$b.x:Z
     935: invokevirtual #442                // Method android/app/Notification$Builder.setColorized:(Z)Landroid/app/Notification$Builder;
     938: pop
     939: aload_1
     940: getfield      #54                 // Field android/support/v4/app/ac$b.H:Ljava/lang/String;
     943: invokestatic  #447                // Method android/text/TextUtils.isEmpty:(Ljava/lang/CharSequence;)Z
     946: ifne          972
     949: aload_0
     950: getfield      #59                 // Field a:Landroid/app/Notification$Builder;
     953: aconst_null
     954: invokevirtual #450                // Method android/app/Notification$Builder.setSound:(Landroid/net/Uri;)Landroid/app/Notification$Builder;
     957: iconst_0
     958: invokevirtual #144                // Method android/app/Notification$Builder.setDefaults:(I)Landroid/app/Notification$Builder;
     961: iconst_0
     962: iconst_0
     963: iconst_0
     964: invokevirtual #124                // Method android/app/Notification$Builder.setLights:(III)Landroid/app/Notification$Builder;
     967: aconst_null
     968: invokevirtual #111                // Method android/app/Notification$Builder.setVibrate:([J)Landroid/app/Notification$Builder;
     971: pop
     972: return

  public android.app.Notification a();
    Code:
       0: aload_0
       1: getfield      #38                 // Field b:Landroid/support/v4/app/ac$b;
       4: getfield      #518                // Field android/support/v4/app/ac$b.n:Landroid/support/v4/app/ac$c;
       7: astore_2
       8: aload_2
       9: ifnull        17
      12: aload_2
      13: aload_0
      14: invokevirtual #523                // Method android/support/v4/app/ac$c.a:(Landroid/support/v4/app/ab;)V
      17: aload_2
      18: ifnull        30
      21: aload_2
      22: aload_0
      23: invokevirtual #526                // Method android/support/v4/app/ac$c.b:(Landroid/support/v4/app/ab;)Landroid/widget/RemoteViews;
      26: astore_1
      27: goto          32
      30: aconst_null
      31: astore_1
      32: aload_0
      33: invokevirtual #528                // Method b:()Landroid/app/Notification;
      36: astore_3
      37: aload_1
      38: ifnull        49
      41: aload_3
      42: aload_1
      43: putfield      #89                 // Field android/app/Notification.contentView:Landroid/widget/RemoteViews;
      46: goto          70
      49: aload_0
      50: getfield      #38                 // Field b:Landroid/support/v4/app/ac$b;
      53: getfield      #298                // Field android/support/v4/app/ac$b.E:Landroid/widget/RemoteViews;
      56: ifnull        70
      59: aload_0
      60: getfield      #38                 // Field b:Landroid/support/v4/app/ac$b;
      63: getfield      #298                // Field android/support/v4/app/ac$b.E:Landroid/widget/RemoteViews;
      66: astore_1
      67: goto          41
      70: getstatic     #43                 // Field android/os/Build$VERSION.SDK_INT:I
      73: bipush        16
      75: if_icmplt     97
      78: aload_2
      79: ifnull        97
      82: aload_2
      83: aload_0
      84: invokevirtual #530                // Method android/support/v4/app/ac$c.c:(Landroid/support/v4/app/ab;)Landroid/widget/RemoteViews;
      87: astore_1
      88: aload_1
      89: ifnull        97
      92: aload_3
      93: aload_1
      94: putfield      #533                // Field android/app/Notification.bigContentView:Landroid/widget/RemoteViews;
      97: getstatic     #43                 // Field android/os/Build$VERSION.SDK_INT:I
     100: bipush        21
     102: if_icmplt     130
     105: aload_2
     106: ifnull        130
     109: aload_0
     110: getfield      #38                 // Field b:Landroid/support/v4/app/ac$b;
     113: getfield      #518                // Field android/support/v4/app/ac$b.n:Landroid/support/v4/app/ac$c;
     116: aload_0
     117: invokevirtual #535                // Method android/support/v4/app/ac$c.d:(Landroid/support/v4/app/ab;)Landroid/widget/RemoteViews;
     120: astore_1
     121: aload_1
     122: ifnull        130
     125: aload_3
     126: aload_1
     127: putfield      #538                // Field android/app/Notification.headsUpContentView:Landroid/widget/RemoteViews;
     130: getstatic     #43                 // Field android/os/Build$VERSION.SDK_INT:I
     133: bipush        16
     135: if_icmplt     156
     138: aload_2
     139: ifnull        156
     142: aload_3
     143: invokestatic  #543                // Method android/support/v4/app/ac.a:(Landroid/app/Notification;)Landroid/os/Bundle;
     146: astore_1
     147: aload_1
     148: ifnull        156
     151: aload_2
     152: aload_1
     153: invokevirtual #545                // Method android/support/v4/app/ac$c.a:(Landroid/os/Bundle;)V
     156: aload_3
     157: areturn

  protected android.app.Notification b();
    Code:
       0: getstatic     #43                 // Field android/os/Build$VERSION.SDK_INT:I
       3: bipush        26
       5: if_icmplt     16
       8: aload_0
       9: getfield      #59                 // Field a:Landroid/app/Notification$Builder;
      12: invokevirtual #547                // Method android/app/Notification$Builder.build:()Landroid/app/Notification;
      15: areturn
      16: getstatic     #43                 // Field android/os/Build$VERSION.SDK_INT:I
      19: bipush        24
      21: if_icmplt     103
      24: aload_0
      25: getfield      #59                 // Field a:Landroid/app/Notification$Builder;
      28: invokevirtual #547                // Method android/app/Notification$Builder.build:()Landroid/app/Notification;
      31: astore_1
      32: aload_0
      33: getfield      #353                // Field g:I
      36: ifeq          101
      39: aload_1
      40: invokevirtual #551                // Method android/app/Notification.getGroup:()Ljava/lang/String;
      43: ifnull        70
      46: aload_1
      47: getfield      #127                // Field android/app/Notification.flags:I
      50: sipush        512
      53: iand
      54: ifeq          70
      57: aload_0
      58: getfield      #353                // Field g:I
      61: iconst_2
      62: if_icmpne     70
      65: aload_0
      66: aload_1
      67: invokespecial #553                // Method a:(Landroid/app/Notification;)V
      70: aload_1
      71: invokevirtual #551                // Method android/app/Notification.getGroup:()Ljava/lang/String;
      74: ifnull        101
      77: aload_1
      78: getfield      #127                // Field android/app/Notification.flags:I
      81: sipush        512
      84: iand
      85: ifne          101
      88: aload_0
      89: getfield      #353                // Field g:I
      92: iconst_1
      93: if_icmpne     101
      96: aload_0
      97: aload_1
      98: invokespecial #553                // Method a:(Landroid/app/Notification;)V
     101: aload_1
     102: areturn
     103: getstatic     #43                 // Field android/os/Build$VERSION.SDK_INT:I
     106: bipush        21
     108: if_icmplt     247
     111: aload_0
     112: getfield      #59                 // Field a:Landroid/app/Notification$Builder;
     115: aload_0
     116: getfield      #36                 // Field f:Landroid/os/Bundle;
     119: invokevirtual #397                // Method android/app/Notification$Builder.setExtras:(Landroid/os/Bundle;)Landroid/app/Notification$Builder;
     122: pop
     123: aload_0
     124: getfield      #59                 // Field a:Landroid/app/Notification$Builder;
     127: invokevirtual #547                // Method android/app/Notification$Builder.build:()Landroid/app/Notification;
     130: astore_1
     131: aload_0
     132: getfield      #300                // Field c:Landroid/widget/RemoteViews;
     135: ifnull        146
     138: aload_1
     139: aload_0
     140: getfield      #300                // Field c:Landroid/widget/RemoteViews;
     143: putfield      #89                 // Field android/app/Notification.contentView:Landroid/widget/RemoteViews;
     146: aload_0
     147: getfield      #305                // Field d:Landroid/widget/RemoteViews;
     150: ifnull        161
     153: aload_1
     154: aload_0
     155: getfield      #305                // Field d:Landroid/widget/RemoteViews;
     158: putfield      #533                // Field android/app/Notification.bigContentView:Landroid/widget/RemoteViews;
     161: aload_0
     162: getfield      #393                // Field h:Landroid/widget/RemoteViews;
     165: ifnull        176
     168: aload_1
     169: aload_0
     170: getfield      #393                // Field h:Landroid/widget/RemoteViews;
     173: putfield      #538                // Field android/app/Notification.headsUpContentView:Landroid/widget/RemoteViews;
     176: aload_0
     177: getfield      #353                // Field g:I
     180: ifeq          245
     183: aload_1
     184: invokevirtual #551                // Method android/app/Notification.getGroup:()Ljava/lang/String;
     187: ifnull        214
     190: aload_1
     191: getfield      #127                // Field android/app/Notification.flags:I
     194: sipush        512
     197: iand
     198: ifeq          214
     201: aload_0
     202: getfield      #353                // Field g:I
     205: iconst_2
     206: if_icmpne     214
     209: aload_0
     210: aload_1
     211: invokespecial #553                // Method a:(Landroid/app/Notification;)V
     214: aload_1
     215: invokevirtual #551                // Method android/app/Notification.getGroup:()Ljava/lang/String;
     218: ifnull        245
     221: aload_1
     222: getfield      #127                // Field android/app/Notification.flags:I
     225: sipush        512
     228: iand
     229: ifne          245
     232: aload_0
     233: getfield      #353                // Field g:I
     236: iconst_1
     237: if_icmpne     245
     240: aload_0
     241: aload_1
     242: invokespecial #553                // Method a:(Landroid/app/Notification;)V
     245: aload_1
     246: areturn
     247: getstatic     #43                 // Field android/os/Build$VERSION.SDK_INT:I
     250: bipush        20
     252: if_icmplt     376
     255: aload_0
     256: getfield      #59                 // Field a:Landroid/app/Notification$Builder;
     259: aload_0
     260: getfield      #36                 // Field f:Landroid/os/Bundle;
     263: invokevirtual #397                // Method android/app/Notification$Builder.setExtras:(Landroid/os/Bundle;)Landroid/app/Notification$Builder;
     266: pop
     267: aload_0
     268: getfield      #59                 // Field a:Landroid/app/Notification$Builder;
     271: invokevirtual #547                // Method android/app/Notification$Builder.build:()Landroid/app/Notification;
     274: astore_1
     275: aload_0
     276: getfield      #300                // Field c:Landroid/widget/RemoteViews;
     279: ifnull        290
     282: aload_1
     283: aload_0
     284: getfield      #300                // Field c:Landroid/widget/RemoteViews;
     287: putfield      #89                 // Field android/app/Notification.contentView:Landroid/widget/RemoteViews;
     290: aload_0
     291: getfield      #305                // Field d:Landroid/widget/RemoteViews;
     294: ifnull        305
     297: aload_1
     298: aload_0
     299: getfield      #305                // Field d:Landroid/widget/RemoteViews;
     302: putfield      #533                // Field android/app/Notification.bigContentView:Landroid/widget/RemoteViews;
     305: aload_0
     306: getfield      #353                // Field g:I
     309: ifeq          374
     312: aload_1
     313: invokevirtual #551                // Method android/app/Notification.getGroup:()Ljava/lang/String;
     316: ifnull        343
     319: aload_1
     320: getfield      #127                // Field android/app/Notification.flags:I
     323: sipush        512
     326: iand
     327: ifeq          343
     330: aload_0
     331: getfield      #353                // Field g:I
     334: iconst_2
     335: if_icmpne     343
     338: aload_0
     339: aload_1
     340: invokespecial #553                // Method a:(Landroid/app/Notification;)V
     343: aload_1
     344: invokevirtual #551                // Method android/app/Notification.getGroup:()Ljava/lang/String;
     347: ifnull        374
     350: aload_1
     351: getfield      #127                // Field android/app/Notification.flags:I
     354: sipush        512
     357: iand
     358: ifne          374
     361: aload_0
     362: getfield      #353                // Field g:I
     365: iconst_1
     366: if_icmpne     374
     369: aload_0
     370: aload_1
     371: invokespecial #553                // Method a:(Landroid/app/Notification;)V
     374: aload_1
     375: areturn
     376: getstatic     #43                 // Field android/os/Build$VERSION.SDK_INT:I
     379: bipush        19
     381: if_icmplt     459
     384: aload_0
     385: getfield      #31                 // Field e:Ljava/util/List;
     388: invokestatic  #556                // Method android/support/v4/app/ae.a:(Ljava/util/List;)Landroid/util/SparseArray;
     391: astore_1
     392: aload_1
     393: ifnull        407
     396: aload_0
     397: getfield      #36                 // Field f:Landroid/os/Bundle;
     400: ldc_w         #558                // String android.support.actionExtras
     403: aload_1
     404: invokevirtual #562                // Method android/os/Bundle.putSparseParcelableArray:(Ljava/lang/String;Landroid/util/SparseArray;)V
     407: aload_0
     408: getfield      #59                 // Field a:Landroid/app/Notification$Builder;
     411: aload_0
     412: getfield      #36                 // Field f:Landroid/os/Bundle;
     415: invokevirtual #397                // Method android/app/Notification$Builder.setExtras:(Landroid/os/Bundle;)Landroid/app/Notification$Builder;
     418: pop
     419: aload_0
     420: getfield      #59                 // Field a:Landroid/app/Notification$Builder;
     423: invokevirtual #547                // Method android/app/Notification$Builder.build:()Landroid/app/Notification;
     426: astore_1
     427: aload_0
     428: getfield      #300                // Field c:Landroid/widget/RemoteViews;
     431: ifnull        442
     434: aload_1
     435: aload_0
     436: getfield      #300                // Field c:Landroid/widget/RemoteViews;
     439: putfield      #89                 // Field android/app/Notification.contentView:Landroid/widget/RemoteViews;
     442: aload_0
     443: getfield      #305                // Field d:Landroid/widget/RemoteViews;
     446: ifnull        457
     449: aload_1
     450: aload_0
     451: getfield      #305                // Field d:Landroid/widget/RemoteViews;
     454: putfield      #533                // Field android/app/Notification.bigContentView:Landroid/widget/RemoteViews;
     457: aload_1
     458: areturn
     459: getstatic     #43                 // Field android/os/Build$VERSION.SDK_INT:I
     462: bipush        16
     464: if_icmplt     606
     467: aload_0
     468: getfield      #59                 // Field a:Landroid/app/Notification$Builder;
     471: invokevirtual #547                // Method android/app/Notification$Builder.build:()Landroid/app/Notification;
     474: astore_1
     475: aload_1
     476: invokestatic  #543                // Method android/support/v4/app/ac.a:(Landroid/app/Notification;)Landroid/os/Bundle;
     479: astore_2
     480: new           #33                 // class android/os/Bundle
     483: dup
     484: aload_0
     485: getfield      #36                 // Field f:Landroid/os/Bundle;
     488: invokespecial #482                // Method android/os/Bundle."<init>":(Landroid/os/Bundle;)V
     491: astore_3
     492: aload_0
     493: getfield      #36                 // Field f:Landroid/os/Bundle;
     496: invokevirtual #566                // Method android/os/Bundle.keySet:()Ljava/util/Set;
     499: invokeinterface #569,  1          // InterfaceMethod java/util/Set.iterator:()Ljava/util/Iterator;
     504: astore        4
     506: aload         4
     508: invokeinterface #249,  1          // InterfaceMethod java/util/Iterator.hasNext:()Z
     513: ifeq          546
     516: aload         4
     518: invokeinterface #253,  1          // InterfaceMethod java/util/Iterator.next:()Ljava/lang/Object;
     523: checkcast     #325                // class java/lang/String
     526: astore        5
     528: aload_2
     529: aload         5
     531: invokevirtual #573                // Method android/os/Bundle.containsKey:(Ljava/lang/String;)Z
     534: ifeq          506
     537: aload_3
     538: aload         5
     540: invokevirtual #577                // Method android/os/Bundle.remove:(Ljava/lang/String;)V
     543: goto          506
     546: aload_2
     547: aload_3
     548: invokevirtual #265                // Method android/os/Bundle.putAll:(Landroid/os/Bundle;)V
     551: aload_0
     552: getfield      #31                 // Field e:Ljava/util/List;
     555: invokestatic  #556                // Method android/support/v4/app/ae.a:(Ljava/util/List;)Landroid/util/SparseArray;
     558: astore_2
     559: aload_2
     560: ifnull        574
     563: aload_1
     564: invokestatic  #543                // Method android/support/v4/app/ac.a:(Landroid/app/Notification;)Landroid/os/Bundle;
     567: ldc_w         #558                // String android.support.actionExtras
     570: aload_2
     571: invokevirtual #562                // Method android/os/Bundle.putSparseParcelableArray:(Ljava/lang/String;Landroid/util/SparseArray;)V
     574: aload_0
     575: getfield      #300                // Field c:Landroid/widget/RemoteViews;
     578: ifnull        589
     581: aload_1
     582: aload_0
     583: getfield      #300                // Field c:Landroid/widget/RemoteViews;
     586: putfield      #89                 // Field android/app/Notification.contentView:Landroid/widget/RemoteViews;
     589: aload_0
     590: getfield      #305                // Field d:Landroid/widget/RemoteViews;
     593: ifnull        604
     596: aload_1
     597: aload_0
     598: getfield      #305                // Field d:Landroid/widget/RemoteViews;
     601: putfield      #533                // Field android/app/Notification.bigContentView:Landroid/widget/RemoteViews;
     604: aload_1
     605: areturn
     606: aload_0
     607: getfield      #59                 // Field a:Landroid/app/Notification$Builder;
     610: invokevirtual #580                // Method android/app/Notification$Builder.getNotification:()Landroid/app/Notification;
     613: areturn
}
