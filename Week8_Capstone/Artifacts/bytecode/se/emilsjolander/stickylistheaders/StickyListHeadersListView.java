public class se.emilsjolander.stickylistheaders.StickyListHeadersListView extends android.widget.FrameLayout {
  public se.emilsjolander.stickylistheaders.StickyListHeadersListView(android.content.Context);
    Code:
       0: aload_0
       1: aload_1
       2: aconst_null
       3: invokespecial #67                 // Method "<init>":(Landroid/content/Context;Landroid/util/AttributeSet;)V
       6: return

  public se.emilsjolander.stickylistheaders.StickyListHeadersListView(android.content.Context, android.util.AttributeSet);
    Code:
       0: aload_0
       1: aload_1
       2: aload_2
       3: getstatic     #73                 // Field se/emilsjolander/stickylistheaders/c$a.stickyListHeadersListViewStyle:I
       6: invokespecial #76                 // Method "<init>":(Landroid/content/Context;Landroid/util/AttributeSet;I)V
       9: return

  public se.emilsjolander.stickylistheaders.StickyListHeadersListView(android.content.Context, android.util.AttributeSet, int);
    Code:
       0: aload_0
       1: aload_1
       2: aload_2
       3: iload_3
       4: invokespecial #80                 // Method android/widget/FrameLayout."<init>":(Landroid/content/Context;Landroid/util/AttributeSet;I)V
       7: aload_0
       8: iconst_1
       9: putfield      #82                 // Field h:Z
      12: aload_0
      13: iconst_1
      14: putfield      #84                 // Field i:Z
      17: aload_0
      18: iconst_1
      19: putfield      #86                 // Field j:Z
      22: aload_0
      23: iconst_0
      24: putfield      #88                 // Field k:I
      27: aload_0
      28: iconst_0
      29: putfield      #90                 // Field l:I
      32: aload_0
      33: iconst_0
      34: putfield      #92                 // Field m:I
      37: aload_0
      38: iconst_0
      39: putfield      #94                 // Field n:I
      42: aload_0
      43: iconst_0
      44: putfield      #96                 // Field o:I
      47: aload_0
      48: aload_0
      49: invokevirtual #100                // Method getContext:()Landroid/content/Context;
      52: invokestatic  #106                // Method android/view/ViewConfiguration.get:(Landroid/content/Context;)Landroid/view/ViewConfiguration;
      55: invokevirtual #110                // Method android/view/ViewConfiguration.getScaledTouchSlop:()I
      58: i2f
      59: putfield      #112                // Field r:F
      62: aload_0
      63: new           #114                // class se/emilsjolander/stickylistheaders/g
      66: dup
      67: aload_1
      68: invokespecial #116                // Method se/emilsjolander/stickylistheaders/g."<init>":(Landroid/content/Context;)V
      71: putfield      #118                // Field a:Lse/emilsjolander/stickylistheaders/g;
      74: aload_0
      75: aload_0
      76: getfield      #118                // Field a:Lse/emilsjolander/stickylistheaders/g;
      79: invokevirtual #122                // Method se/emilsjolander/stickylistheaders/g.getDivider:()Landroid/graphics/drawable/Drawable;
      82: putfield      #124                // Field w:Landroid/graphics/drawable/Drawable;
      85: aload_0
      86: aload_0
      87: getfield      #118                // Field a:Lse/emilsjolander/stickylistheaders/g;
      90: invokevirtual #127                // Method se/emilsjolander/stickylistheaders/g.getDividerHeight:()I
      93: putfield      #129                // Field x:I
      96: aload_0
      97: getfield      #118                // Field a:Lse/emilsjolander/stickylistheaders/g;
     100: aconst_null
     101: invokevirtual #133                // Method se/emilsjolander/stickylistheaders/g.setDivider:(Landroid/graphics/drawable/Drawable;)V
     104: aload_0
     105: getfield      #118                // Field a:Lse/emilsjolander/stickylistheaders/g;
     108: iconst_0
     109: invokevirtual #137                // Method se/emilsjolander/stickylistheaders/g.setDividerHeight:(I)V
     112: aload_2
     113: ifnull        698
     116: aload_1
     117: invokevirtual #143                // Method android/content/Context.getTheme:()Landroid/content/res/Resources$Theme;
     120: aload_2
     121: getstatic     #149                // Field se/emilsjolander/stickylistheaders/c$b.StickyListHeadersListView:[I
     124: iload_3
     125: iconst_0
     126: invokevirtual #155                // Method android/content/res/Resources$Theme.obtainStyledAttributes:(Landroid/util/AttributeSet;[III)Landroid/content/res/TypedArray;
     129: astore_2
     130: aload_2
     131: getstatic     #158                // Field se/emilsjolander/stickylistheaders/c$b.StickyListHeadersListView_android_padding:I
     134: iconst_0
     135: invokevirtual #164                // Method android/content/res/TypedArray.getDimensionPixelSize:(II)I
     138: istore_3
     139: aload_0
     140: aload_2
     141: getstatic     #167                // Field se/emilsjolander/stickylistheaders/c$b.StickyListHeadersListView_android_paddingLeft:I
     144: iload_3
     145: invokevirtual #164                // Method android/content/res/TypedArray.getDimensionPixelSize:(II)I
     148: putfield      #90                 // Field l:I
     151: aload_0
     152: aload_2
     153: getstatic     #170                // Field se/emilsjolander/stickylistheaders/c$b.StickyListHeadersListView_android_paddingTop:I
     156: iload_3
     157: invokevirtual #164                // Method android/content/res/TypedArray.getDimensionPixelSize:(II)I
     160: putfield      #92                 // Field m:I
     163: aload_0
     164: aload_2
     165: getstatic     #173                // Field se/emilsjolander/stickylistheaders/c$b.StickyListHeadersListView_android_paddingRight:I
     168: iload_3
     169: invokevirtual #164                // Method android/content/res/TypedArray.getDimensionPixelSize:(II)I
     172: putfield      #94                 // Field n:I
     175: aload_0
     176: aload_2
     177: getstatic     #176                // Field se/emilsjolander/stickylistheaders/c$b.StickyListHeadersListView_android_paddingBottom:I
     180: iload_3
     181: invokevirtual #164                // Method android/content/res/TypedArray.getDimensionPixelSize:(II)I
     184: putfield      #96                 // Field o:I
     187: aload_0
     188: aload_0
     189: getfield      #90                 // Field l:I
     192: aload_0
     193: getfield      #92                 // Field m:I
     196: aload_0
     197: getfield      #94                 // Field n:I
     200: aload_0
     201: getfield      #96                 // Field o:I
     204: invokevirtual #180                // Method setPadding:(IIII)V
     207: aload_0
     208: aload_2
     209: getstatic     #183                // Field se/emilsjolander/stickylistheaders/c$b.StickyListHeadersListView_android_clipToPadding:I
     212: iconst_1
     213: invokevirtual #187                // Method android/content/res/TypedArray.getBoolean:(IZ)Z
     216: putfield      #84                 // Field i:Z
     219: aload_0
     220: iconst_1
     221: invokespecial #191                // Method android/widget/FrameLayout.setClipToPadding:(Z)V
     224: aload_0
     225: getfield      #118                // Field a:Lse/emilsjolander/stickylistheaders/g;
     228: aload_0
     229: getfield      #84                 // Field i:Z
     232: invokevirtual #192                // Method se/emilsjolander/stickylistheaders/g.setClipToPadding:(Z)V
     235: aload_2
     236: getstatic     #195                // Field se/emilsjolander/stickylistheaders/c$b.StickyListHeadersListView_android_scrollbars:I
     239: sipush        512
     242: invokevirtual #198                // Method android/content/res/TypedArray.getInt:(II)I
     245: istore_3
     246: aload_0
     247: getfield      #118                // Field a:Lse/emilsjolander/stickylistheaders/g;
     250: astore_1
     251: iload_3
     252: sipush        512
     255: iand
     256: ifeq          739
     259: iconst_1
     260: istore        4
     262: goto          265
     265: aload_1
     266: iload         4
     268: invokevirtual #201                // Method se/emilsjolander/stickylistheaders/g.setVerticalScrollBarEnabled:(Z)V
     271: aload_0
     272: getfield      #118                // Field a:Lse/emilsjolander/stickylistheaders/g;
     275: astore_1
     276: iload_3
     277: sipush        256
     280: iand
     281: ifeq          745
     284: iconst_1
     285: istore        4
     287: goto          290
     290: aload_1
     291: iload         4
     293: invokevirtual #204                // Method se/emilsjolander/stickylistheaders/g.setHorizontalScrollBarEnabled:(Z)V
     296: getstatic     #209                // Field android/os/Build$VERSION.SDK_INT:I
     299: bipush        9
     301: if_icmplt     319
     304: aload_0
     305: getfield      #118                // Field a:Lse/emilsjolander/stickylistheaders/g;
     308: aload_2
     309: getstatic     #212                // Field se/emilsjolander/stickylistheaders/c$b.StickyListHeadersListView_android_overScrollMode:I
     312: iconst_0
     313: invokevirtual #198                // Method android/content/res/TypedArray.getInt:(II)I
     316: invokevirtual #215                // Method se/emilsjolander/stickylistheaders/g.setOverScrollMode:(I)V
     319: aload_0
     320: getfield      #118                // Field a:Lse/emilsjolander/stickylistheaders/g;
     323: aload_2
     324: getstatic     #218                // Field se/emilsjolander/stickylistheaders/c$b.StickyListHeadersListView_android_fadingEdgeLength:I
     327: aload_0
     328: getfield      #118                // Field a:Lse/emilsjolander/stickylistheaders/g;
     331: invokevirtual #221                // Method se/emilsjolander/stickylistheaders/g.getVerticalFadingEdgeLength:()I
     334: invokevirtual #164                // Method android/content/res/TypedArray.getDimensionPixelSize:(II)I
     337: invokevirtual #224                // Method se/emilsjolander/stickylistheaders/g.setFadingEdgeLength:(I)V
     340: aload_2
     341: getstatic     #227                // Field se/emilsjolander/stickylistheaders/c$b.StickyListHeadersListView_android_requiresFadingEdge:I
     344: iconst_0
     345: invokevirtual #198                // Method android/content/res/TypedArray.getInt:(II)I
     348: istore_3
     349: iload_3
     350: sipush        4096
     353: if_icmpne     375
     356: aload_0
     357: getfield      #118                // Field a:Lse/emilsjolander/stickylistheaders/g;
     360: iconst_0
     361: invokevirtual #230                // Method se/emilsjolander/stickylistheaders/g.setVerticalFadingEdgeEnabled:(Z)V
     364: aload_0
     365: getfield      #118                // Field a:Lse/emilsjolander/stickylistheaders/g;
     368: iconst_1
     369: invokevirtual #233                // Method se/emilsjolander/stickylistheaders/g.setHorizontalFadingEdgeEnabled:(Z)V
     372: goto          419
     375: iload_3
     376: sipush        8192
     379: if_icmpne     403
     382: aload_0
     383: getfield      #118                // Field a:Lse/emilsjolander/stickylistheaders/g;
     386: iconst_1
     387: invokevirtual #230                // Method se/emilsjolander/stickylistheaders/g.setVerticalFadingEdgeEnabled:(Z)V
     390: aload_0
     391: getfield      #118                // Field a:Lse/emilsjolander/stickylistheaders/g;
     394: astore_1
     395: aload_1
     396: iconst_0
     397: invokevirtual #233                // Method se/emilsjolander/stickylistheaders/g.setHorizontalFadingEdgeEnabled:(Z)V
     400: goto          419
     403: aload_0
     404: getfield      #118                // Field a:Lse/emilsjolander/stickylistheaders/g;
     407: iconst_0
     408: invokevirtual #230                // Method se/emilsjolander/stickylistheaders/g.setVerticalFadingEdgeEnabled:(Z)V
     411: aload_0
     412: getfield      #118                // Field a:Lse/emilsjolander/stickylistheaders/g;
     415: astore_1
     416: goto          395
     419: aload_0
     420: getfield      #118                // Field a:Lse/emilsjolander/stickylistheaders/g;
     423: aload_2
     424: getstatic     #236                // Field se/emilsjolander/stickylistheaders/c$b.StickyListHeadersListView_android_cacheColorHint:I
     427: aload_0
     428: getfield      #118                // Field a:Lse/emilsjolander/stickylistheaders/g;
     431: invokevirtual #239                // Method se/emilsjolander/stickylistheaders/g.getCacheColorHint:()I
     434: invokevirtual #242                // Method android/content/res/TypedArray.getColor:(II)I
     437: invokevirtual #245                // Method se/emilsjolander/stickylistheaders/g.setCacheColorHint:(I)V
     440: getstatic     #209                // Field android/os/Build$VERSION.SDK_INT:I
     443: bipush        11
     445: if_icmplt     469
     448: aload_0
     449: getfield      #118                // Field a:Lse/emilsjolander/stickylistheaders/g;
     452: aload_2
     453: getstatic     #248                // Field se/emilsjolander/stickylistheaders/c$b.StickyListHeadersListView_android_choiceMode:I
     456: aload_0
     457: getfield      #118                // Field a:Lse/emilsjolander/stickylistheaders/g;
     460: invokevirtual #251                // Method se/emilsjolander/stickylistheaders/g.getChoiceMode:()I
     463: invokevirtual #198                // Method android/content/res/TypedArray.getInt:(II)I
     466: invokevirtual #254                // Method se/emilsjolander/stickylistheaders/g.setChoiceMode:(I)V
     469: aload_0
     470: getfield      #118                // Field a:Lse/emilsjolander/stickylistheaders/g;
     473: aload_2
     474: getstatic     #257                // Field se/emilsjolander/stickylistheaders/c$b.StickyListHeadersListView_android_drawSelectorOnTop:I
     477: iconst_0
     478: invokevirtual #187                // Method android/content/res/TypedArray.getBoolean:(IZ)Z
     481: invokevirtual #260                // Method se/emilsjolander/stickylistheaders/g.setDrawSelectorOnTop:(Z)V
     484: aload_0
     485: getfield      #118                // Field a:Lse/emilsjolander/stickylistheaders/g;
     488: aload_2
     489: getstatic     #263                // Field se/emilsjolander/stickylistheaders/c$b.StickyListHeadersListView_android_fastScrollEnabled:I
     492: aload_0
     493: getfield      #118                // Field a:Lse/emilsjolander/stickylistheaders/g;
     496: invokevirtual #267                // Method se/emilsjolander/stickylistheaders/g.isFastScrollEnabled:()Z
     499: invokevirtual #187                // Method android/content/res/TypedArray.getBoolean:(IZ)Z
     502: invokevirtual #270                // Method se/emilsjolander/stickylistheaders/g.setFastScrollEnabled:(Z)V
     505: getstatic     #209                // Field android/os/Build$VERSION.SDK_INT:I
     508: bipush        11
     510: if_icmplt     534
     513: aload_0
     514: getfield      #118                // Field a:Lse/emilsjolander/stickylistheaders/g;
     517: aload_2
     518: getstatic     #273                // Field se/emilsjolander/stickylistheaders/c$b.StickyListHeadersListView_android_fastScrollAlwaysVisible:I
     521: aload_0
     522: getfield      #118                // Field a:Lse/emilsjolander/stickylistheaders/g;
     525: invokevirtual #276                // Method se/emilsjolander/stickylistheaders/g.isFastScrollAlwaysVisible:()Z
     528: invokevirtual #187                // Method android/content/res/TypedArray.getBoolean:(IZ)Z
     531: invokevirtual #279                // Method se/emilsjolander/stickylistheaders/g.setFastScrollAlwaysVisible:(Z)V
     534: aload_0
     535: getfield      #118                // Field a:Lse/emilsjolander/stickylistheaders/g;
     538: aload_2
     539: getstatic     #282                // Field se/emilsjolander/stickylistheaders/c$b.StickyListHeadersListView_android_scrollbarStyle:I
     542: iconst_0
     543: invokevirtual #198                // Method android/content/res/TypedArray.getInt:(II)I
     546: invokevirtual #285                // Method se/emilsjolander/stickylistheaders/g.setScrollBarStyle:(I)V
     549: aload_2
     550: getstatic     #288                // Field se/emilsjolander/stickylistheaders/c$b.StickyListHeadersListView_android_listSelector:I
     553: invokevirtual #292                // Method android/content/res/TypedArray.hasValue:(I)Z
     556: ifeq          573
     559: aload_0
     560: getfield      #118                // Field a:Lse/emilsjolander/stickylistheaders/g;
     563: aload_2
     564: getstatic     #288                // Field se/emilsjolander/stickylistheaders/c$b.StickyListHeadersListView_android_listSelector:I
     567: invokevirtual #296                // Method android/content/res/TypedArray.getDrawable:(I)Landroid/graphics/drawable/Drawable;
     570: invokevirtual #299                // Method se/emilsjolander/stickylistheaders/g.setSelector:(Landroid/graphics/drawable/Drawable;)V
     573: aload_0
     574: getfield      #118                // Field a:Lse/emilsjolander/stickylistheaders/g;
     577: aload_2
     578: getstatic     #302                // Field se/emilsjolander/stickylistheaders/c$b.StickyListHeadersListView_android_scrollingCache:I
     581: aload_0
     582: getfield      #118                // Field a:Lse/emilsjolander/stickylistheaders/g;
     585: invokevirtual #305                // Method se/emilsjolander/stickylistheaders/g.isScrollingCacheEnabled:()Z
     588: invokevirtual #187                // Method android/content/res/TypedArray.getBoolean:(IZ)Z
     591: invokevirtual #308                // Method se/emilsjolander/stickylistheaders/g.setScrollingCacheEnabled:(Z)V
     594: aload_2
     595: getstatic     #311                // Field se/emilsjolander/stickylistheaders/c$b.StickyListHeadersListView_android_divider:I
     598: invokevirtual #292                // Method android/content/res/TypedArray.hasValue:(I)Z
     601: ifeq          615
     604: aload_0
     605: aload_2
     606: getstatic     #311                // Field se/emilsjolander/stickylistheaders/c$b.StickyListHeadersListView_android_divider:I
     609: invokevirtual #296                // Method android/content/res/TypedArray.getDrawable:(I)Landroid/graphics/drawable/Drawable;
     612: putfield      #124                // Field w:Landroid/graphics/drawable/Drawable;
     615: aload_0
     616: getfield      #118                // Field a:Lse/emilsjolander/stickylistheaders/g;
     619: aload_2
     620: getstatic     #314                // Field se/emilsjolander/stickylistheaders/c$b.StickyListHeadersListView_android_stackFromBottom:I
     623: iconst_0
     624: invokevirtual #187                // Method android/content/res/TypedArray.getBoolean:(IZ)Z
     627: invokevirtual #317                // Method se/emilsjolander/stickylistheaders/g.setStackFromBottom:(Z)V
     630: aload_0
     631: aload_2
     632: getstatic     #320                // Field se/emilsjolander/stickylistheaders/c$b.StickyListHeadersListView_android_dividerHeight:I
     635: aload_0
     636: getfield      #129                // Field x:I
     639: invokevirtual #164                // Method android/content/res/TypedArray.getDimensionPixelSize:(II)I
     642: putfield      #129                // Field x:I
     645: aload_0
     646: getfield      #118                // Field a:Lse/emilsjolander/stickylistheaders/g;
     649: aload_2
     650: getstatic     #323                // Field se/emilsjolander/stickylistheaders/c$b.StickyListHeadersListView_android_transcriptMode:I
     653: iconst_0
     654: invokevirtual #198                // Method android/content/res/TypedArray.getInt:(II)I
     657: invokevirtual #326                // Method se/emilsjolander/stickylistheaders/g.setTranscriptMode:(I)V
     660: aload_0
     661: aload_2
     662: getstatic     #329                // Field se/emilsjolander/stickylistheaders/c$b.StickyListHeadersListView_hasStickyHeaders:I
     665: iconst_1
     666: invokevirtual #187                // Method android/content/res/TypedArray.getBoolean:(IZ)Z
     669: putfield      #82                 // Field h:Z
     672: aload_0
     673: aload_2
     674: getstatic     #332                // Field se/emilsjolander/stickylistheaders/c$b.StickyListHeadersListView_isDrawingListUnderStickyHeader:I
     677: iconst_1
     678: invokevirtual #187                // Method android/content/res/TypedArray.getBoolean:(IZ)Z
     681: putfield      #86                 // Field j:Z
     684: aload_2
     685: invokevirtual #336                // Method android/content/res/TypedArray.recycle:()V
     688: goto          698
     691: astore_1
     692: aload_2
     693: invokevirtual #336                // Method android/content/res/TypedArray.recycle:()V
     696: aload_1
     697: athrow
     698: aload_0
     699: getfield      #118                // Field a:Lse/emilsjolander/stickylistheaders/g;
     702: new           #30                 // class se/emilsjolander/stickylistheaders/StickyListHeadersListView$g
     705: dup
     706: aload_0
     707: aconst_null
     708: invokespecial #339                // Method se/emilsjolander/stickylistheaders/StickyListHeadersListView$g."<init>":(Lse/emilsjolander/stickylistheaders/StickyListHeadersListView;Lse/emilsjolander/stickylistheaders/StickyListHeadersListView$1;)V
     711: invokevirtual #342                // Method se/emilsjolander/stickylistheaders/g.a:(Lse/emilsjolander/stickylistheaders/g$a;)V
     714: aload_0
     715: getfield      #118                // Field a:Lse/emilsjolander/stickylistheaders/g;
     718: new           #27                 // class se/emilsjolander/stickylistheaders/StickyListHeadersListView$f
     721: dup
     722: aload_0
     723: aconst_null
     724: invokespecial #343                // Method se/emilsjolander/stickylistheaders/StickyListHeadersListView$f."<init>":(Lse/emilsjolander/stickylistheaders/StickyListHeadersListView;Lse/emilsjolander/stickylistheaders/StickyListHeadersListView$1;)V
     727: invokevirtual #347                // Method se/emilsjolander/stickylistheaders/g.setOnScrollListener:(Landroid/widget/AbsListView$OnScrollListener;)V
     730: aload_0
     731: aload_0
     732: getfield      #118                // Field a:Lse/emilsjolander/stickylistheaders/g;
     735: invokevirtual #351                // Method addView:(Landroid/view/View;)V
     738: return
     739: iconst_0
     740: istore        4
     742: goto          265
     745: iconst_0
     746: istore        4
     748: goto          290
    Exception table:
       from    to  target type
         130   251   691   any
         265   276   691   any
         290   319   691   any
         319   349   691   any
         356   372   691   any
         382   395   691   any
         395   400   691   any
         403   416   691   any
         419   469   691   any
         469   534   691   any
         534   573   691   any
         573   615   691   any
         615   684   691   any

  static android.view.View a(se.emilsjolander.stickylistheaders.StickyListHeadersListView);
    Code:
       0: aload_0
       1: getfield      #355                // Field b:Landroid/view/View;
       4: areturn

  static void a(se.emilsjolander.stickylistheaders.StickyListHeadersListView, int);
    Code:
       0: aload_0
       1: iload_1
       2: invokespecial #381                // Method b:(I)V
       5: return

  static boolean a(se.emilsjolander.stickylistheaders.StickyListHeadersListView, android.graphics.Canvas, android.view.View, long);
    Code:
       0: aload_0
       1: aload_1
       2: aload_2
       3: lload_3
       4: invokevirtual #386                // Method drawChild:(Landroid/graphics/Canvas;Landroid/view/View;J)Z
       7: ireturn

  static java.lang.Integer b(se.emilsjolander.stickylistheaders.StickyListHeadersListView);
    Code:
       0: aload_0
       1: getfield      #389                // Field d:Ljava/lang/Integer;
       4: areturn

  static boolean b(se.emilsjolander.stickylistheaders.StickyListHeadersListView, android.graphics.Canvas, android.view.View, long);
    Code:
       0: aload_0
       1: aload_1
       2: aload_2
       3: lload_3
       4: invokevirtual #386                // Method drawChild:(Landroid/graphics/Canvas;Landroid/view/View;J)Z
       7: ireturn

  static java.lang.Long c(se.emilsjolander.stickylistheaders.StickyListHeadersListView);
    Code:
       0: aload_0
       1: getfield      #394                // Field c:Ljava/lang/Long;
       4: areturn

  static se.emilsjolander.stickylistheaders.StickyListHeadersListView$c d(se.emilsjolander.stickylistheaders.StickyListHeadersListView);
    Code:
       0: aload_0
       1: getfield      #517                // Field s:Lse/emilsjolander/stickylistheaders/StickyListHeadersListView$c;
       4: areturn

  static void e(se.emilsjolander.stickylistheaders.StickyListHeadersListView);
    Code:
       0: aload_0
       1: invokespecial #432                // Method b:()V
       4: return

  static android.widget.AbsListView$OnScrollListener f(se.emilsjolander.stickylistheaders.StickyListHeadersListView);
    Code:
       0: aload_0
       1: getfield      #557                // Field f:Landroid/widget/AbsListView$OnScrollListener;
       4: areturn

  static se.emilsjolander.stickylistheaders.g g(se.emilsjolander.stickylistheaders.StickyListHeadersListView);
    Code:
       0: aload_0
       1: getfield      #118                // Field a:Lse/emilsjolander/stickylistheaders/g;
       4: areturn

  static boolean h(se.emilsjolander.stickylistheaders.StickyListHeadersListView);
    Code:
       0: aload_0
       1: getfield      #84                 // Field i:Z
       4: ireturn

  static int i(se.emilsjolander.stickylistheaders.StickyListHeadersListView);
    Code:
       0: aload_0
       1: getfield      #92                 // Field m:I
       4: ireturn

  public int a(int);
    Code:
       0: aload_0
       1: iconst_0
       2: iload_1
       3: aload_0
       4: invokevirtual #578                // Method getHeaderViewsCount:()I
       7: isub
       8: invokestatic  #581                // Method java/lang/Math.max:(II)I
      11: invokespecial #583                // Method d:(I)Z
      14: ifne          61
      17: aload_0
      18: getfield      #402                // Field g:Lse/emilsjolander/stickylistheaders/a;
      21: iload_1
      22: aconst_null
      23: aload_0
      24: getfield      #118                // Field a:Lse/emilsjolander/stickylistheaders/g;
      27: invokevirtual #483                // Method se/emilsjolander/stickylistheaders/a.a:(ILandroid/view/View;Landroid/view/ViewGroup;)Landroid/view/View;
      30: astore_2
      31: aload_2
      32: ifnonnull     46
      35: new           #485                // class java/lang/NullPointerException
      38: dup
      39: ldc_w         #487                // String header may not be null
      42: invokespecial #490                // Method java/lang/NullPointerException."<init>":(Ljava/lang/String;)V
      45: athrow
      46: aload_0
      47: aload_2
      48: invokespecial #494                // Method a:(Landroid/view/View;)V
      51: aload_0
      52: aload_2
      53: invokespecial #496                // Method b:(Landroid/view/View;)V
      56: aload_2
      57: invokevirtual #507                // Method android/view/View.getMeasuredHeight:()I
      60: ireturn
      61: iconst_0
      62: ireturn

  public void a(int, int);
    Code:
       0: aload_0
       1: getfield      #402                // Field g:Lse/emilsjolander/stickylistheaders/a;
       4: astore        5
       6: iconst_0
       7: istore        4
       9: aload         5
      11: ifnonnull     19
      14: iconst_0
      15: istore_3
      16: goto          25
      19: aload_0
      20: iload_1
      21: invokevirtual #585                // Method a:(I)I
      24: istore_3
      25: aload_0
      26: getfield      #84                 // Field i:Z
      29: ifeq          35
      32: goto          41
      35: aload_0
      36: getfield      #92                 // Field m:I
      39: istore        4
      41: aload_0
      42: getfield      #118                // Field a:Lse/emilsjolander/stickylistheaders/g;
      45: iload_1
      46: iload_2
      47: iload_3
      48: iadd
      49: iload         4
      51: isub
      52: invokevirtual #588                // Method se/emilsjolander/stickylistheaders/g.setSelectionFromTop:(II)V
      55: return

  public boolean a();
    Code:
       0: aload_0
       1: getfield      #82                 // Field h:Z
       4: ireturn

  public boolean canScrollVertically(int);
    Code:
       0: aload_0
       1: getfield      #118                // Field a:Lse/emilsjolander/stickylistheaders/g;
       4: iload_1
       5: invokevirtual #592                // Method se/emilsjolander/stickylistheaders/g.canScrollVertically:(I)Z
       8: ireturn

  protected void dispatchDraw(android.graphics.Canvas);
    Code:
       0: aload_0
       1: getfield      #118                // Field a:Lse/emilsjolander/stickylistheaders/g;
       4: invokevirtual #595                // Method se/emilsjolander/stickylistheaders/g.getVisibility:()I
       7: ifeq          20
      10: aload_0
      11: getfield      #118                // Field a:Lse/emilsjolander/stickylistheaders/g;
      14: invokevirtual #599                // Method se/emilsjolander/stickylistheaders/g.getAnimation:()Landroid/view/animation/Animation;
      17: ifnull        31
      20: aload_0
      21: aload_1
      22: aload_0
      23: getfield      #118                // Field a:Lse/emilsjolander/stickylistheaders/g;
      26: lconst_0
      27: invokevirtual #386                // Method drawChild:(Landroid/graphics/Canvas;Landroid/view/View;J)Z
      30: pop
      31: return

  public boolean dispatchTouchEvent(android.view.MotionEvent);
    Code:
       0: aload_1
       1: invokevirtual #606                // Method android/view/MotionEvent.getAction:()I
       4: sipush        255
       7: iand
       8: ifne          62
      11: aload_0
      12: aload_1
      13: invokevirtual #610                // Method android/view/MotionEvent.getY:()F
      16: putfield      #612                // Field p:F
      19: aload_0
      20: getfield      #355                // Field b:Landroid/view/View;
      23: ifnull        55
      26: aload_0
      27: getfield      #612                // Field p:F
      30: aload_0
      31: getfield      #355                // Field b:Landroid/view/View;
      34: invokevirtual #615                // Method android/view/View.getHeight:()I
      37: aload_0
      38: getfield      #396                // Field e:Ljava/lang/Integer;
      41: invokevirtual #464                // Method java/lang/Integer.intValue:()I
      44: iadd
      45: i2f
      46: fcmpg
      47: ifgt          55
      50: iconst_1
      51: istore_2
      52: goto          57
      55: iconst_0
      56: istore_2
      57: aload_0
      58: iload_2
      59: putfield      #617                // Field q:Z
      62: aload_0
      63: getfield      #617                // Field q:Z
      66: ifeq          188
      69: aload_0
      70: getfield      #355                // Field b:Landroid/view/View;
      73: ifnull        105
      76: aload_0
      77: getfield      #612                // Field p:F
      80: aload_1
      81: invokevirtual #610                // Method android/view/MotionEvent.getY:()F
      84: fsub
      85: invokestatic  #621                // Method java/lang/Math.abs:(F)F
      88: aload_0
      89: getfield      #112                // Field r:F
      92: fcmpg
      93: ifgt          105
      96: aload_0
      97: getfield      #355                // Field b:Landroid/view/View;
     100: aload_1
     101: invokevirtual #623                // Method android/view/View.dispatchTouchEvent:(Landroid/view/MotionEvent;)Z
     104: ireturn
     105: aload_0
     106: getfield      #355                // Field b:Landroid/view/View;
     109: ifnull        135
     112: aload_1
     113: invokestatic  #627                // Method android/view/MotionEvent.obtain:(Landroid/view/MotionEvent;)Landroid/view/MotionEvent;
     116: astore_3
     117: aload_3
     118: iconst_3
     119: invokevirtual #630                // Method android/view/MotionEvent.setAction:(I)V
     122: aload_0
     123: getfield      #355                // Field b:Landroid/view/View;
     126: aload_3
     127: invokevirtual #623                // Method android/view/View.dispatchTouchEvent:(Landroid/view/MotionEvent;)Z
     130: pop
     131: aload_3
     132: invokevirtual #631                // Method android/view/MotionEvent.recycle:()V
     135: aload_1
     136: invokevirtual #634                // Method android/view/MotionEvent.getDownTime:()J
     139: aload_1
     140: invokevirtual #637                // Method android/view/MotionEvent.getEventTime:()J
     143: aload_1
     144: invokevirtual #606                // Method android/view/MotionEvent.getAction:()I
     147: aload_1
     148: invokevirtual #640                // Method android/view/MotionEvent.getX:()F
     151: aload_0
     152: getfield      #612                // Field p:F
     155: aload_1
     156: invokevirtual #643                // Method android/view/MotionEvent.getMetaState:()I
     159: invokestatic  #646                // Method android/view/MotionEvent.obtain:(JJIFFI)Landroid/view/MotionEvent;
     162: astore_1
     163: aload_1
     164: iconst_0
     165: invokevirtual #630                // Method android/view/MotionEvent.setAction:(I)V
     168: aload_0
     169: getfield      #118                // Field a:Lse/emilsjolander/stickylistheaders/g;
     172: aload_1
     173: invokevirtual #647                // Method se/emilsjolander/stickylistheaders/g.dispatchTouchEvent:(Landroid/view/MotionEvent;)Z
     176: istore_2
     177: aload_1
     178: invokevirtual #631                // Method android/view/MotionEvent.recycle:()V
     181: aload_0
     182: iconst_0
     183: putfield      #617                // Field q:Z
     186: iload_2
     187: ireturn
     188: aload_0
     189: getfield      #118                // Field a:Lse/emilsjolander/stickylistheaders/g;
     192: aload_1
     193: invokevirtual #647                // Method se/emilsjolander/stickylistheaders/g.dispatchTouchEvent:(Landroid/view/MotionEvent;)Z
     196: ireturn

  public se.emilsjolander.stickylistheaders.e getAdapter();
    Code:
       0: aload_0
       1: getfield      #402                // Field g:Lse/emilsjolander/stickylistheaders/a;
       4: ifnonnull     9
       7: aconst_null
       8: areturn
       9: aload_0
      10: getfield      #402                // Field g:Lse/emilsjolander/stickylistheaders/a;
      13: getfield      #652                // Field se/emilsjolander/stickylistheaders/a.a:Lse/emilsjolander/stickylistheaders/e;
      16: areturn

  public boolean getAreHeadersSticky();
    Code:
       0: aload_0
       1: invokevirtual #655                // Method a:()Z
       4: ireturn

  public int getCheckedItemCount();
    Code:
       0: aload_0
       1: bipush        11
       3: invokespecial #659                // Method e:(I)Z
       6: ifeq          17
       9: aload_0
      10: getfield      #118                // Field a:Lse/emilsjolander/stickylistheaders/g;
      13: invokevirtual #661                // Method se/emilsjolander/stickylistheaders/g.getCheckedItemCount:()I
      16: ireturn
      17: iconst_0
      18: ireturn

  public long[] getCheckedItemIds();
    Code:
       0: aload_0
       1: bipush        8
       3: invokespecial #659                // Method e:(I)Z
       6: ifeq          17
       9: aload_0
      10: getfield      #118                // Field a:Lse/emilsjolander/stickylistheaders/g;
      13: invokevirtual #666                // Method se/emilsjolander/stickylistheaders/g.getCheckedItemIds:()[J
      16: areturn
      17: aconst_null
      18: areturn

  public int getCheckedItemPosition();
    Code:
       0: aload_0
       1: getfield      #118                // Field a:Lse/emilsjolander/stickylistheaders/g;
       4: invokevirtual #669                // Method se/emilsjolander/stickylistheaders/g.getCheckedItemPosition:()I
       7: ireturn

  public android.util.SparseBooleanArray getCheckedItemPositions();
    Code:
       0: aload_0
       1: getfield      #118                // Field a:Lse/emilsjolander/stickylistheaders/g;
       4: invokevirtual #673                // Method se/emilsjolander/stickylistheaders/g.getCheckedItemPositions:()Landroid/util/SparseBooleanArray;
       7: areturn

  public int getCount();
    Code:
       0: aload_0
       1: getfield      #118                // Field a:Lse/emilsjolander/stickylistheaders/g;
       4: invokevirtual #674                // Method se/emilsjolander/stickylistheaders/g.getCount:()I
       7: ireturn

  public android.graphics.drawable.Drawable getDivider();
    Code:
       0: aload_0
       1: getfield      #124                // Field w:Landroid/graphics/drawable/Drawable;
       4: areturn

  public int getDividerHeight();
    Code:
       0: aload_0
       1: getfield      #129                // Field x:I
       4: ireturn

  public android.view.View getEmptyView();
    Code:
       0: aload_0
       1: getfield      #118                // Field a:Lse/emilsjolander/stickylistheaders/g;
       4: invokevirtual #678                // Method se/emilsjolander/stickylistheaders/g.getEmptyView:()Landroid/view/View;
       7: areturn

  public int getFirstVisiblePosition();
    Code:
       0: aload_0
       1: getfield      #118                // Field a:Lse/emilsjolander/stickylistheaders/g;
       4: invokevirtual #425                // Method se/emilsjolander/stickylistheaders/g.getFirstVisiblePosition:()I
       7: ireturn

  public int getFooterViewsCount();
    Code:
       0: aload_0
       1: getfield      #118                // Field a:Lse/emilsjolander/stickylistheaders/g;
       4: invokevirtual #681                // Method se/emilsjolander/stickylistheaders/g.getFooterViewsCount:()I
       7: ireturn

  public int getHeaderViewsCount();
    Code:
       0: aload_0
       1: getfield      #118                // Field a:Lse/emilsjolander/stickylistheaders/g;
       4: invokevirtual #410                // Method se/emilsjolander/stickylistheaders/g.getHeaderViewsCount:()I
       7: ireturn

  public int getLastVisiblePosition();
    Code:
       0: aload_0
       1: getfield      #118                // Field a:Lse/emilsjolander/stickylistheaders/g;
       4: invokevirtual #684                // Method se/emilsjolander/stickylistheaders/g.getLastVisiblePosition:()I
       7: ireturn

  public int getListChildCount();
    Code:
       0: aload_0
       1: getfield      #118                // Field a:Lse/emilsjolander/stickylistheaders/g;
       4: invokevirtual #413                // Method se/emilsjolander/stickylistheaders/g.getChildCount:()I
       7: ireturn

  public int getOverScrollMode();
    Code:
       0: aload_0
       1: bipush        9
       3: invokespecial #659                // Method e:(I)Z
       6: ifeq          17
       9: aload_0
      10: getfield      #118                // Field a:Lse/emilsjolander/stickylistheaders/g;
      13: invokevirtual #689                // Method se/emilsjolander/stickylistheaders/g.getOverScrollMode:()I
      16: ireturn
      17: iconst_0
      18: ireturn

  public int getPaddingBottom();
    Code:
       0: aload_0
       1: getfield      #96                 // Field o:I
       4: ireturn

  public int getPaddingLeft();
    Code:
       0: aload_0
       1: getfield      #90                 // Field l:I
       4: ireturn

  public int getPaddingRight();
    Code:
       0: aload_0
       1: getfield      #94                 // Field n:I
       4: ireturn

  public int getPaddingTop();
    Code:
       0: aload_0
       1: getfield      #92                 // Field m:I
       4: ireturn

  public int getScrollBarStyle();
    Code:
       0: aload_0
       1: getfield      #118                // Field a:Lse/emilsjolander/stickylistheaders/g;
       4: invokevirtual #696                // Method se/emilsjolander/stickylistheaders/g.getScrollBarStyle:()I
       7: ireturn

  public int getStickyHeaderTopOffset();
    Code:
       0: aload_0
       1: getfield      #88                 // Field k:I
       4: ireturn

  public android.widget.ListView getWrappedList();
    Code:
       0: aload_0
       1: getfield      #118                // Field a:Lse/emilsjolander/stickylistheaders/g;
       4: areturn

  public boolean isHorizontalScrollBarEnabled();
    Code:
       0: aload_0
       1: getfield      #118                // Field a:Lse/emilsjolander/stickylistheaders/g;
       4: invokevirtual #702                // Method se/emilsjolander/stickylistheaders/g.isHorizontalScrollBarEnabled:()Z
       7: ireturn

  public boolean isVerticalScrollBarEnabled();
    Code:
       0: aload_0
       1: getfield      #118                // Field a:Lse/emilsjolander/stickylistheaders/g;
       4: invokevirtual #705                // Method se/emilsjolander/stickylistheaders/g.isVerticalScrollBarEnabled:()Z
       7: ireturn

  protected void onLayout(boolean, int, int, int, int);
    Code:
       0: aload_0
       1: getfield      #118                // Field a:Lse/emilsjolander/stickylistheaders/g;
       4: iconst_0
       5: iconst_0
       6: aload_0
       7: getfield      #118                // Field a:Lse/emilsjolander/stickylistheaders/g;
      10: invokevirtual #708                // Method se/emilsjolander/stickylistheaders/g.getMeasuredWidth:()I
      13: aload_0
      14: invokevirtual #709                // Method getHeight:()I
      17: invokevirtual #712                // Method se/emilsjolander/stickylistheaders/g.layout:(IIII)V
      20: aload_0
      21: getfield      #355                // Field b:Landroid/view/View;
      24: ifnull        74
      27: aload_0
      28: getfield      #355                // Field b:Landroid/view/View;
      31: invokevirtual #361                // Method android/view/View.getLayoutParams:()Landroid/view/ViewGroup$LayoutParams;
      34: checkcast     #568                // class android/view/ViewGroup$MarginLayoutParams
      37: getfield      #571                // Field android/view/ViewGroup$MarginLayoutParams.topMargin:I
      40: istore_2
      41: aload_0
      42: getfield      #355                // Field b:Landroid/view/View;
      45: aload_0
      46: getfield      #90                 // Field l:I
      49: iload_2
      50: aload_0
      51: getfield      #355                // Field b:Landroid/view/View;
      54: invokevirtual #713                // Method android/view/View.getMeasuredWidth:()I
      57: aload_0
      58: getfield      #90                 // Field l:I
      61: iadd
      62: aload_0
      63: getfield      #355                // Field b:Landroid/view/View;
      66: invokevirtual #507                // Method android/view/View.getMeasuredHeight:()I
      69: iload_2
      70: iadd
      71: invokevirtual #714                // Method android/view/View.layout:(IIII)V
      74: return

  protected void onMeasure(int, int);
    Code:
       0: aload_0
       1: iload_1
       2: iload_2
       3: invokespecial #717                // Method android/widget/FrameLayout.onMeasure:(II)V
       6: aload_0
       7: aload_0
       8: getfield      #355                // Field b:Landroid/view/View;
      11: invokespecial #496                // Method b:(Landroid/view/View;)V
      14: return

  public void onRestoreInstanceState(android.os.Parcelable);
    Code:
       0: aload_0
       1: getstatic     #725                // Field android/view/View$BaseSavedState.EMPTY_STATE:Landroid/view/AbsSavedState;
       4: invokespecial #727                // Method android/widget/FrameLayout.onRestoreInstanceState:(Landroid/os/Parcelable;)V
       7: aload_0
       8: getfield      #118                // Field a:Lse/emilsjolander/stickylistheaders/g;
      11: aload_1
      12: invokevirtual #728                // Method se/emilsjolander/stickylistheaders/g.onRestoreInstanceState:(Landroid/os/Parcelable;)V
      15: return

  public android.os.Parcelable onSaveInstanceState();
    Code:
       0: aload_0
       1: invokespecial #732                // Method android/widget/FrameLayout.onSaveInstanceState:()Landroid/os/Parcelable;
       4: getstatic     #725                // Field android/view/View$BaseSavedState.EMPTY_STATE:Landroid/view/AbsSavedState;
       7: if_acmpeq     21
      10: new           #734                // class java/lang/IllegalStateException
      13: dup
      14: ldc_w         #736                // String Handling non empty state of parent class is not implemented
      17: invokespecial #737                // Method java/lang/IllegalStateException."<init>":(Ljava/lang/String;)V
      20: athrow
      21: aload_0
      22: getfield      #118                // Field a:Lse/emilsjolander/stickylistheaders/g;
      25: invokevirtual #738                // Method se/emilsjolander/stickylistheaders/g.onSaveInstanceState:()Landroid/os/Parcelable;
      28: areturn

  public void setAdapter(se.emilsjolander.stickylistheaders.e);
    Code:
       0: aconst_null
       1: astore_3
       2: aload_1
       3: ifnonnull     59
       6: aload_0
       7: getfield      #402                // Field g:Lse/emilsjolander/stickylistheaders/a;
      10: instanceof    #742                // class se/emilsjolander/stickylistheaders/d
      13: ifeq          27
      16: aload_0
      17: getfield      #402                // Field g:Lse/emilsjolander/stickylistheaders/a;
      20: checkcast     #742                // class se/emilsjolander/stickylistheaders/d
      23: aconst_null
      24: putfield      #745                // Field se/emilsjolander/stickylistheaders/d.b:Landroid/widget/SectionIndexer;
      27: aload_0
      28: getfield      #402                // Field g:Lse/emilsjolander/stickylistheaders/a;
      31: ifnull        42
      34: aload_0
      35: getfield      #402                // Field g:Lse/emilsjolander/stickylistheaders/a;
      38: aconst_null
      39: putfield      #652                // Field se/emilsjolander/stickylistheaders/a.a:Lse/emilsjolander/stickylistheaders/e;
      42: aload_0
      43: getfield      #118                // Field a:Lse/emilsjolander/stickylistheaders/g;
      46: astore_2
      47: aload_3
      48: astore_1
      49: aload_2
      50: aload_1
      51: invokevirtual #748                // Method se/emilsjolander/stickylistheaders/g.setAdapter:(Landroid/widget/ListAdapter;)V
      54: aload_0
      55: invokespecial #432                // Method b:()V
      58: return
      59: aload_0
      60: getfield      #402                // Field g:Lse/emilsjolander/stickylistheaders/a;
      63: ifnull        77
      66: aload_0
      67: getfield      #402                // Field g:Lse/emilsjolander/stickylistheaders/a;
      70: aload_0
      71: getfield      #750                // Field v:Lse/emilsjolander/stickylistheaders/StickyListHeadersListView$a;
      74: invokevirtual #754                // Method se/emilsjolander/stickylistheaders/a.unregisterDataSetObserver:(Landroid/database/DataSetObserver;)V
      77: aload_1
      78: instanceof    #756                // class android/widget/SectionIndexer
      81: ifeq          105
      84: new           #742                // class se/emilsjolander/stickylistheaders/d
      87: dup
      88: aload_0
      89: invokevirtual #100                // Method getContext:()Landroid/content/Context;
      92: aload_1
      93: invokespecial #759                // Method se/emilsjolander/stickylistheaders/d."<init>":(Landroid/content/Context;Lse/emilsjolander/stickylistheaders/e;)V
      96: astore_1
      97: aload_0
      98: aload_1
      99: putfield      #402                // Field g:Lse/emilsjolander/stickylistheaders/a;
     102: goto          121
     105: new           #404                // class se/emilsjolander/stickylistheaders/a
     108: dup
     109: aload_0
     110: invokevirtual #100                // Method getContext:()Landroid/content/Context;
     113: aload_1
     114: invokespecial #760                // Method se/emilsjolander/stickylistheaders/a."<init>":(Landroid/content/Context;Lse/emilsjolander/stickylistheaders/e;)V
     117: astore_1
     118: goto          97
     121: aload_0
     122: new           #12                 // class se/emilsjolander/stickylistheaders/StickyListHeadersListView$a
     125: dup
     126: aload_0
     127: aconst_null
     128: invokespecial #761                // Method se/emilsjolander/stickylistheaders/StickyListHeadersListView$a."<init>":(Lse/emilsjolander/stickylistheaders/StickyListHeadersListView;Lse/emilsjolander/stickylistheaders/StickyListHeadersListView$1;)V
     131: putfield      #750                // Field v:Lse/emilsjolander/stickylistheaders/StickyListHeadersListView$a;
     134: aload_0
     135: getfield      #402                // Field g:Lse/emilsjolander/stickylistheaders/a;
     138: aload_0
     139: getfield      #750                // Field v:Lse/emilsjolander/stickylistheaders/StickyListHeadersListView$a;
     142: invokevirtual #764                // Method se/emilsjolander/stickylistheaders/a.registerDataSetObserver:(Landroid/database/DataSetObserver;)V
     145: aload_0
     146: getfield      #517                // Field s:Lse/emilsjolander/stickylistheaders/StickyListHeadersListView$c;
     149: ifnull        171
     152: aload_0
     153: getfield      #402                // Field g:Lse/emilsjolander/stickylistheaders/a;
     156: new           #15                 // class se/emilsjolander/stickylistheaders/StickyListHeadersListView$b
     159: dup
     160: aload_0
     161: aconst_null
     162: invokespecial #765                // Method se/emilsjolander/stickylistheaders/StickyListHeadersListView$b."<init>":(Lse/emilsjolander/stickylistheaders/StickyListHeadersListView;Lse/emilsjolander/stickylistheaders/StickyListHeadersListView$1;)V
     165: invokevirtual #768                // Method se/emilsjolander/stickylistheaders/a.a:(Lse/emilsjolander/stickylistheaders/a$a;)V
     168: goto          179
     171: aload_0
     172: getfield      #402                // Field g:Lse/emilsjolander/stickylistheaders/a;
     175: aconst_null
     176: invokevirtual #768                // Method se/emilsjolander/stickylistheaders/a.a:(Lse/emilsjolander/stickylistheaders/a$a;)V
     179: aload_0
     180: getfield      #402                // Field g:Lse/emilsjolander/stickylistheaders/a;
     183: aload_0
     184: getfield      #124                // Field w:Landroid/graphics/drawable/Drawable;
     187: aload_0
     188: getfield      #129                // Field x:I
     191: invokevirtual #771                // Method se/emilsjolander/stickylistheaders/a.a:(Landroid/graphics/drawable/Drawable;I)V
     194: aload_0
     195: getfield      #118                // Field a:Lse/emilsjolander/stickylistheaders/g;
     198: astore_2
     199: aload_0
     200: getfield      #402                // Field g:Lse/emilsjolander/stickylistheaders/a;
     203: astore_1
     204: goto          49

  public void setAreHeadersSticky(boolean);
    Code:
       0: aload_0
       1: iload_1
       2: putfield      #82                 // Field h:Z
       5: iload_1
       6: ifne          16
       9: aload_0
      10: invokespecial #432                // Method b:()V
      13: goto          27
      16: aload_0
      17: aload_0
      18: getfield      #118                // Field a:Lse/emilsjolander/stickylistheaders/g;
      21: invokevirtual #774                // Method se/emilsjolander/stickylistheaders/g.a:()I
      24: invokespecial #381                // Method b:(I)V
      27: aload_0
      28: getfield      #118                // Field a:Lse/emilsjolander/stickylistheaders/g;
      31: invokevirtual #777                // Method se/emilsjolander/stickylistheaders/g.invalidate:()V
      34: return

  public void setBlockLayoutChildren(boolean);
    Code:
       0: aload_0
       1: getfield      #118                // Field a:Lse/emilsjolander/stickylistheaders/g;
       4: iload_1
       5: invokevirtual #780                // Method se/emilsjolander/stickylistheaders/g.a:(Z)V
       8: return

  public void setChoiceMode(int);
    Code:
       0: aload_0
       1: getfield      #118                // Field a:Lse/emilsjolander/stickylistheaders/g;
       4: iload_1
       5: invokevirtual #254                // Method se/emilsjolander/stickylistheaders/g.setChoiceMode:(I)V
       8: return

  public void setClipToPadding(boolean);
    Code:
       0: aload_0
       1: getfield      #118                // Field a:Lse/emilsjolander/stickylistheaders/g;
       4: ifnull        15
       7: aload_0
       8: getfield      #118                // Field a:Lse/emilsjolander/stickylistheaders/g;
      11: iload_1
      12: invokevirtual #192                // Method se/emilsjolander/stickylistheaders/g.setClipToPadding:(Z)V
      15: aload_0
      16: iload_1
      17: putfield      #84                 // Field i:Z
      20: return

  public void setDivider(android.graphics.drawable.Drawable);
    Code:
       0: aload_0
       1: aload_1
       2: putfield      #124                // Field w:Landroid/graphics/drawable/Drawable;
       5: aload_0
       6: getfield      #402                // Field g:Lse/emilsjolander/stickylistheaders/a;
       9: ifnull        27
      12: aload_0
      13: getfield      #402                // Field g:Lse/emilsjolander/stickylistheaders/a;
      16: aload_0
      17: getfield      #124                // Field w:Landroid/graphics/drawable/Drawable;
      20: aload_0
      21: getfield      #129                // Field x:I
      24: invokevirtual #771                // Method se/emilsjolander/stickylistheaders/a.a:(Landroid/graphics/drawable/Drawable;I)V
      27: return

  public void setDividerHeight(int);
    Code:
       0: aload_0
       1: iload_1
       2: putfield      #129                // Field x:I
       5: aload_0
       6: getfield      #402                // Field g:Lse/emilsjolander/stickylistheaders/a;
       9: ifnull        27
      12: aload_0
      13: getfield      #402                // Field g:Lse/emilsjolander/stickylistheaders/a;
      16: aload_0
      17: getfield      #124                // Field w:Landroid/graphics/drawable/Drawable;
      20: aload_0
      21: getfield      #129                // Field x:I
      24: invokevirtual #771                // Method se/emilsjolander/stickylistheaders/a.a:(Landroid/graphics/drawable/Drawable;I)V
      27: return

  public void setDrawingListUnderStickyHeader(boolean);
    Code:
       0: aload_0
       1: iload_1
       2: putfield      #86                 // Field j:Z
       5: aload_0
       6: getfield      #118                // Field a:Lse/emilsjolander/stickylistheaders/g;
       9: iconst_0
      10: invokevirtual #398                // Method se/emilsjolander/stickylistheaders/g.a:(I)V
      13: return

  public void setEmptyView(android.view.View);
    Code:
       0: aload_0
       1: getfield      #118                // Field a:Lse/emilsjolander/stickylistheaders/g;
       4: aload_1
       5: invokevirtual #784                // Method se/emilsjolander/stickylistheaders/g.setEmptyView:(Landroid/view/View;)V
       8: return

  public void setFastScrollAlwaysVisible(boolean);
    Code:
       0: aload_0
       1: bipush        11
       3: invokespecial #659                // Method e:(I)Z
       6: ifeq          17
       9: aload_0
      10: getfield      #118                // Field a:Lse/emilsjolander/stickylistheaders/g;
      13: iload_1
      14: invokevirtual #279                // Method se/emilsjolander/stickylistheaders/g.setFastScrollAlwaysVisible:(Z)V
      17: return

  public void setFastScrollEnabled(boolean);
    Code:
       0: aload_0
       1: getfield      #118                // Field a:Lse/emilsjolander/stickylistheaders/g;
       4: iload_1
       5: invokevirtual #270                // Method se/emilsjolander/stickylistheaders/g.setFastScrollEnabled:(Z)V
       8: return

  public void setHorizontalScrollBarEnabled(boolean);
    Code:
       0: aload_0
       1: getfield      #118                // Field a:Lse/emilsjolander/stickylistheaders/g;
       4: iload_1
       5: invokevirtual #204                // Method se/emilsjolander/stickylistheaders/g.setHorizontalScrollBarEnabled:(Z)V
       8: return

  public void setMultiChoiceModeListener(android.widget.AbsListView$MultiChoiceModeListener);
    Code:
       0: aload_0
       1: bipush        11
       3: invokespecial #659                // Method e:(I)Z
       6: ifeq          17
       9: aload_0
      10: getfield      #118                // Field a:Lse/emilsjolander/stickylistheaders/g;
      13: aload_1
      14: invokevirtual #788                // Method se/emilsjolander/stickylistheaders/g.setMultiChoiceModeListener:(Landroid/widget/AbsListView$MultiChoiceModeListener;)V
      17: return

  public void setOnCreateContextMenuListener(android.view.View$OnCreateContextMenuListener);
    Code:
       0: aload_0
       1: getfield      #118                // Field a:Lse/emilsjolander/stickylistheaders/g;
       4: aload_1
       5: invokevirtual #792                // Method se/emilsjolander/stickylistheaders/g.setOnCreateContextMenuListener:(Landroid/view/View$OnCreateContextMenuListener;)V
       8: return

  public void setOnHeaderClickListener(se.emilsjolander.stickylistheaders.StickyListHeadersListView$c);
    Code:
       0: aload_0
       1: aload_1
       2: putfield      #517                // Field s:Lse/emilsjolander/stickylistheaders/StickyListHeadersListView$c;
       5: aload_0
       6: getfield      #402                // Field g:Lse/emilsjolander/stickylistheaders/a;
       9: ifnull        66
      12: aload_0
      13: getfield      #517                // Field s:Lse/emilsjolander/stickylistheaders/StickyListHeadersListView$c;
      16: ifnull        58
      19: aload_0
      20: getfield      #402                // Field g:Lse/emilsjolander/stickylistheaders/a;
      23: new           #15                 // class se/emilsjolander/stickylistheaders/StickyListHeadersListView$b
      26: dup
      27: aload_0
      28: aconst_null
      29: invokespecial #765                // Method se/emilsjolander/stickylistheaders/StickyListHeadersListView$b."<init>":(Lse/emilsjolander/stickylistheaders/StickyListHeadersListView;Lse/emilsjolander/stickylistheaders/StickyListHeadersListView$1;)V
      32: invokevirtual #768                // Method se/emilsjolander/stickylistheaders/a.a:(Lse/emilsjolander/stickylistheaders/a$a;)V
      35: aload_0
      36: getfield      #355                // Field b:Landroid/view/View;
      39: ifnull        66
      42: aload_0
      43: getfield      #355                // Field b:Landroid/view/View;
      46: new           #8                  // class se/emilsjolander/stickylistheaders/StickyListHeadersListView$2
      49: dup
      50: aload_0
      51: invokespecial #795                // Method se/emilsjolander/stickylistheaders/StickyListHeadersListView$2."<init>":(Lse/emilsjolander/stickylistheaders/StickyListHeadersListView;)V
      54: invokevirtual #524                // Method android/view/View.setOnClickListener:(Landroid/view/View$OnClickListener;)V
      57: return
      58: aload_0
      59: getfield      #402                // Field g:Lse/emilsjolander/stickylistheaders/a;
      62: aconst_null
      63: invokevirtual #768                // Method se/emilsjolander/stickylistheaders/a.a:(Lse/emilsjolander/stickylistheaders/a$a;)V
      66: return

  public void setOnItemClickListener(android.widget.AdapterView$OnItemClickListener);
    Code:
       0: aload_0
       1: getfield      #118                // Field a:Lse/emilsjolander/stickylistheaders/g;
       4: aload_1
       5: invokevirtual #799                // Method se/emilsjolander/stickylistheaders/g.setOnItemClickListener:(Landroid/widget/AdapterView$OnItemClickListener;)V
       8: return

  public void setOnItemLongClickListener(android.widget.AdapterView$OnItemLongClickListener);
    Code:
       0: aload_0
       1: getfield      #118                // Field a:Lse/emilsjolander/stickylistheaders/g;
       4: aload_1
       5: invokevirtual #803                // Method se/emilsjolander/stickylistheaders/g.setOnItemLongClickListener:(Landroid/widget/AdapterView$OnItemLongClickListener;)V
       8: return

  public void setOnScrollListener(android.widget.AbsListView$OnScrollListener);
    Code:
       0: aload_0
       1: aload_1
       2: putfield      #557                // Field f:Landroid/widget/AbsListView$OnScrollListener;
       5: return

  public void setOnStickyHeaderChangedListener(se.emilsjolander.stickylistheaders.StickyListHeadersListView$d);
    Code:
       0: aload_0
       1: aload_1
       2: putfield      #498                // Field u:Lse/emilsjolander/stickylistheaders/StickyListHeadersListView$d;
       5: return

  public void setOnStickyHeaderOffsetChangedListener(se.emilsjolander.stickylistheaders.StickyListHeadersListView$e);
    Code:
       0: aload_0
       1: aload_1
       2: putfield      #573                // Field t:Lse/emilsjolander/stickylistheaders/StickyListHeadersListView$e;
       5: return

  public void setOnTouchListener(android.view.View$OnTouchListener);
    Code:
       0: aload_1
       1: ifnull        21
       4: aload_0
       5: getfield      #118                // Field a:Lse/emilsjolander/stickylistheaders/g;
       8: new           #10                 // class se/emilsjolander/stickylistheaders/StickyListHeadersListView$3
      11: dup
      12: aload_0
      13: aload_1
      14: invokespecial #812                // Method se/emilsjolander/stickylistheaders/StickyListHeadersListView$3."<init>":(Lse/emilsjolander/stickylistheaders/StickyListHeadersListView;Landroid/view/View$OnTouchListener;)V
      17: invokevirtual #814                // Method se/emilsjolander/stickylistheaders/g.setOnTouchListener:(Landroid/view/View$OnTouchListener;)V
      20: return
      21: aload_0
      22: getfield      #118                // Field a:Lse/emilsjolander/stickylistheaders/g;
      25: aconst_null
      26: invokevirtual #814                // Method se/emilsjolander/stickylistheaders/g.setOnTouchListener:(Landroid/view/View$OnTouchListener;)V
      29: return

  public void setOverScrollMode(int);
    Code:
       0: aload_0
       1: bipush        9
       3: invokespecial #659                // Method e:(I)Z
       6: ifeq          24
       9: aload_0
      10: getfield      #118                // Field a:Lse/emilsjolander/stickylistheaders/g;
      13: ifnull        24
      16: aload_0
      17: getfield      #118                // Field a:Lse/emilsjolander/stickylistheaders/g;
      20: iload_1
      21: invokevirtual #215                // Method se/emilsjolander/stickylistheaders/g.setOverScrollMode:(I)V
      24: return

  public void setPadding(int, int, int, int);
    Code:
       0: aload_0
       1: iload_1
       2: putfield      #90                 // Field l:I
       5: aload_0
       6: iload_2
       7: putfield      #92                 // Field m:I
      10: aload_0
      11: iload_3
      12: putfield      #94                 // Field n:I
      15: aload_0
      16: iload         4
      18: putfield      #96                 // Field o:I
      21: aload_0
      22: getfield      #118                // Field a:Lse/emilsjolander/stickylistheaders/g;
      25: ifnull        40
      28: aload_0
      29: getfield      #118                // Field a:Lse/emilsjolander/stickylistheaders/g;
      32: iload_1
      33: iload_2
      34: iload_3
      35: iload         4
      37: invokevirtual #815                // Method se/emilsjolander/stickylistheaders/g.setPadding:(IIII)V
      40: aload_0
      41: iconst_0
      42: iconst_0
      43: iconst_0
      44: iconst_0
      45: invokespecial #816                // Method android/widget/FrameLayout.setPadding:(IIII)V
      48: aload_0
      49: invokevirtual #819                // Method requestLayout:()V
      52: return

  public void setScrollBarStyle(int);
    Code:
       0: aload_0
       1: getfield      #118                // Field a:Lse/emilsjolander/stickylistheaders/g;
       4: iload_1
       5: invokevirtual #285                // Method se/emilsjolander/stickylistheaders/g.setScrollBarStyle:(I)V
       8: return

  public void setSelection(int);
    Code:
       0: aload_0
       1: iload_1
       2: iconst_0
       3: invokevirtual #822                // Method a:(II)V
       6: return

  public void setSelector(int);
    Code:
       0: aload_0
       1: getfield      #118                // Field a:Lse/emilsjolander/stickylistheaders/g;
       4: iload_1
       5: invokevirtual #824                // Method se/emilsjolander/stickylistheaders/g.setSelector:(I)V
       8: return

  public void setSelector(android.graphics.drawable.Drawable);
    Code:
       0: aload_0
       1: getfield      #118                // Field a:Lse/emilsjolander/stickylistheaders/g;
       4: aload_1
       5: invokevirtual #299                // Method se/emilsjolander/stickylistheaders/g.setSelector:(Landroid/graphics/drawable/Drawable;)V
       8: return

  public void setStackFromBottom(boolean);
    Code:
       0: aload_0
       1: getfield      #118                // Field a:Lse/emilsjolander/stickylistheaders/g;
       4: iload_1
       5: invokevirtual #317                // Method se/emilsjolander/stickylistheaders/g.setStackFromBottom:(Z)V
       8: return

  public void setStickyHeaderTopOffset(int);
    Code:
       0: aload_0
       1: iload_1
       2: putfield      #88                 // Field k:I
       5: aload_0
       6: aload_0
       7: getfield      #118                // Field a:Lse/emilsjolander/stickylistheaders/g;
      10: invokevirtual #774                // Method se/emilsjolander/stickylistheaders/g.a:()I
      13: invokespecial #381                // Method b:(I)V
      16: return

  public void setTranscriptMode(int);
    Code:
       0: aload_0
       1: getfield      #118                // Field a:Lse/emilsjolander/stickylistheaders/g;
       4: iload_1
       5: invokevirtual #326                // Method se/emilsjolander/stickylistheaders/g.setTranscriptMode:(I)V
       8: return

  public void setVerticalScrollBarEnabled(boolean);
    Code:
       0: aload_0
       1: getfield      #118                // Field a:Lse/emilsjolander/stickylistheaders/g;
       4: iload_1
       5: invokevirtual #201                // Method se/emilsjolander/stickylistheaders/g.setVerticalScrollBarEnabled:(Z)V
       8: return

  public boolean showContextMenu();
    Code:
       0: aload_0
       1: getfield      #118                // Field a:Lse/emilsjolander/stickylistheaders/g;
       4: invokevirtual #828                // Method se/emilsjolander/stickylistheaders/g.showContextMenu:()Z
       7: ireturn
}
