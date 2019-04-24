public class android.support.v7.app.AppCompatViewInflater {
  static {};
    Code:
       0: iconst_2
       1: anewarray     #22                 // class java/lang/Class
       4: dup
       5: iconst_0
       6: ldc           #24                 // class android/content/Context
       8: aastore
       9: dup
      10: iconst_1
      11: ldc           #26                 // class android/util/AttributeSet
      13: aastore
      14: putstatic     #28                 // Field a:[Ljava/lang/Class;
      17: iconst_1
      18: newarray       int
      20: dup
      21: iconst_0
      22: ldc           #29                 // int 16843375
      24: iastore
      25: putstatic     #31                 // Field b:[I
      28: iconst_3
      29: anewarray     #33                 // class java/lang/String
      32: dup
      33: iconst_0
      34: ldc           #35                 // String android.widget.
      36: aastore
      37: dup
      38: iconst_1
      39: ldc           #37                 // String android.view.
      41: aastore
      42: dup
      43: iconst_2
      44: ldc           #39                 // String android.webkit.
      46: aastore
      47: putstatic     #41                 // Field c:[Ljava/lang/String;
      50: new           #43                 // class android/support/v4/g/a
      53: dup
      54: invokespecial #46                 // Method android/support/v4/g/a."<init>":()V
      57: putstatic     #48                 // Field d:Ljava/util/Map;
      60: return

  public android.support.v7.app.AppCompatViewInflater();
    Code:
       0: aload_0
       1: invokespecial #50                 // Method java/lang/Object."<init>":()V
       4: aload_0
       5: iconst_2
       6: anewarray     #4                  // class java/lang/Object
       9: putfield      #52                 // Field e:[Ljava/lang/Object;
      12: return

  protected android.support.v7.widget.ac a(android.content.Context, android.util.AttributeSet);
    Code:
       0: new           #220                // class android/support/v7/widget/ac
       3: dup
       4: aload_1
       5: aload_2
       6: invokespecial #223                // Method android/support/v7/widget/ac."<init>":(Landroid/content/Context;Landroid/util/AttributeSet;)V
       9: areturn

  protected android.view.View a(android.content.Context, java.lang.String, android.util.AttributeSet);
    Code:
       0: aconst_null
       1: areturn

  final android.view.View a(android.view.View, java.lang.String, android.content.Context, android.util.AttributeSet, boolean, boolean, boolean, boolean);
    Code:
       0: iload         5
       2: ifeq          18
       5: aload_1
       6: ifnull        18
       9: aload_1
      10: invokevirtual #155                // Method android/view/View.getContext:()Landroid/content/Context;
      13: astore        10
      15: goto          21
      18: aload_3
      19: astore        10
      21: iload         6
      23: ifne          34
      26: aload         10
      28: astore_1
      29: iload         7
      31: ifeq          46
      34: aload         10
      36: aload         4
      38: iload         6
      40: iload         7
      42: invokestatic  #226                // Method a:(Landroid/content/Context;Landroid/util/AttributeSet;ZZ)Landroid/content/Context;
      45: astore_1
      46: aload_1
      47: astore        10
      49: iload         8
      51: ifeq          60
      54: aload_1
      55: invokestatic  #231                // Method android/support/v7/widget/bm.a:(Landroid/content/Context;)Landroid/content/Context;
      58: astore        10
      60: iconst_m1
      61: istore        9
      63: aload_2
      64: invokevirtual #234                // Method java/lang/String.hashCode:()I
      67: lookupswitch  { // 13
           -1946472170: 371
           -1455429095: 354
           -1346021293: 337
            -938935918: 322
            -937446323: 307
            -658531749: 291
            -339785223: 276
             776382189: 260
            1125864064: 245
            1413872058: 229
            1601505219: 213
            1666676343: 198
            2001146706: 183
               default: 180
          }
     180: goto          385
     183: aload_2
     184: ldc           #236                // String Button
     186: invokevirtual #205                // Method java/lang/String.equals:(Ljava/lang/Object;)Z
     189: ifeq          385
     192: iconst_2
     193: istore        9
     195: goto          385
     198: aload_2
     199: ldc           #238                // String EditText
     201: invokevirtual #205                // Method java/lang/String.equals:(Ljava/lang/Object;)Z
     204: ifeq          385
     207: iconst_3
     208: istore        9
     210: goto          385
     213: aload_2
     214: ldc           #240                // String CheckBox
     216: invokevirtual #205                // Method java/lang/String.equals:(Ljava/lang/Object;)Z
     219: ifeq          385
     222: bipush        6
     224: istore        9
     226: goto          385
     229: aload_2
     230: ldc           #242                // String AutoCompleteTextView
     232: invokevirtual #205                // Method java/lang/String.equals:(Ljava/lang/Object;)Z
     235: ifeq          385
     238: bipush        9
     240: istore        9
     242: goto          385
     245: aload_2
     246: ldc           #244                // String ImageView
     248: invokevirtual #205                // Method java/lang/String.equals:(Ljava/lang/Object;)Z
     251: ifeq          385
     254: iconst_1
     255: istore        9
     257: goto          385
     260: aload_2
     261: ldc           #246                // String RadioButton
     263: invokevirtual #205                // Method java/lang/String.equals:(Ljava/lang/Object;)Z
     266: ifeq          385
     269: bipush        7
     271: istore        9
     273: goto          385
     276: aload_2
     277: ldc           #248                // String Spinner
     279: invokevirtual #205                // Method java/lang/String.equals:(Ljava/lang/Object;)Z
     282: ifeq          385
     285: iconst_4
     286: istore        9
     288: goto          385
     291: aload_2
     292: ldc           #250                // String SeekBar
     294: invokevirtual #205                // Method java/lang/String.equals:(Ljava/lang/Object;)Z
     297: ifeq          385
     300: bipush        12
     302: istore        9
     304: goto          385
     307: aload_2
     308: ldc           #252                // String ImageButton
     310: invokevirtual #205                // Method java/lang/String.equals:(Ljava/lang/Object;)Z
     313: ifeq          385
     316: iconst_5
     317: istore        9
     319: goto          385
     322: aload_2
     323: ldc           #254                // String TextView
     325: invokevirtual #205                // Method java/lang/String.equals:(Ljava/lang/Object;)Z
     328: ifeq          385
     331: iconst_0
     332: istore        9
     334: goto          385
     337: aload_2
     338: ldc_w         #256                // String MultiAutoCompleteTextView
     341: invokevirtual #205                // Method java/lang/String.equals:(Ljava/lang/Object;)Z
     344: ifeq          385
     347: bipush        10
     349: istore        9
     351: goto          385
     354: aload_2
     355: ldc_w         #258                // String CheckedTextView
     358: invokevirtual #205                // Method java/lang/String.equals:(Ljava/lang/Object;)Z
     361: ifeq          385
     364: bipush        8
     366: istore        9
     368: goto          385
     371: aload_2
     372: ldc_w         #260                // String RatingBar
     375: invokevirtual #205                // Method java/lang/String.equals:(Ljava/lang/Object;)Z
     378: ifeq          385
     381: bipush        11
     383: istore        9
     385: iload         9
     387: tableswitch   { // 0 to 12
                     0: 609
                     1: 597
                     2: 585
                     3: 573
                     4: 561
                     5: 549
                     6: 537
                     7: 525
                     8: 513
                     9: 501
                    10: 489
                    11: 477
                    12: 465
               default: 452
          }
     452: aload_0
     453: aload         10
     455: aload_2
     456: aload         4
     458: invokevirtual #262                // Method a:(Landroid/content/Context;Ljava/lang/String;Landroid/util/AttributeSet;)Landroid/view/View;
     461: astore_1
     462: goto          624
     465: aload_0
     466: aload         10
     468: aload         4
     470: invokevirtual #266                // Method m:(Landroid/content/Context;Landroid/util/AttributeSet;)Landroid/support/v7/widget/x;
     473: astore_1
     474: goto          618
     477: aload_0
     478: aload         10
     480: aload         4
     482: invokevirtual #270                // Method l:(Landroid/content/Context;Landroid/util/AttributeSet;)Landroid/support/v7/widget/w;
     485: astore_1
     486: goto          618
     489: aload_0
     490: aload         10
     492: aload         4
     494: invokevirtual #274                // Method k:(Landroid/content/Context;Landroid/util/AttributeSet;)Landroid/support/v7/widget/s;
     497: astore_1
     498: goto          618
     501: aload_0
     502: aload         10
     504: aload         4
     506: invokevirtual #278                // Method j:(Landroid/content/Context;Landroid/util/AttributeSet;)Landroid/support/v7/widget/g;
     509: astore_1
     510: goto          618
     513: aload_0
     514: aload         10
     516: aload         4
     518: invokevirtual #281                // Method i:(Landroid/content/Context;Landroid/util/AttributeSet;)Landroid/support/v7/widget/k;
     521: astore_1
     522: goto          618
     525: aload_0
     526: aload         10
     528: aload         4
     530: invokevirtual #285                // Method h:(Landroid/content/Context;Landroid/util/AttributeSet;)Landroid/support/v7/widget/v;
     533: astore_1
     534: goto          618
     537: aload_0
     538: aload         10
     540: aload         4
     542: invokevirtual #289                // Method g:(Landroid/content/Context;Landroid/util/AttributeSet;)Landroid/support/v7/widget/j;
     545: astore_1
     546: goto          618
     549: aload_0
     550: aload         10
     552: aload         4
     554: invokevirtual #293                // Method f:(Landroid/content/Context;Landroid/util/AttributeSet;)Landroid/support/v7/widget/p;
     557: astore_1
     558: goto          618
     561: aload_0
     562: aload         10
     564: aload         4
     566: invokevirtual #296                // Method e:(Landroid/content/Context;Landroid/util/AttributeSet;)Landroid/support/v7/widget/z;
     569: astore_1
     570: goto          618
     573: aload_0
     574: aload         10
     576: aload         4
     578: invokevirtual #299                // Method d:(Landroid/content/Context;Landroid/util/AttributeSet;)Landroid/support/v7/widget/n;
     581: astore_1
     582: goto          618
     585: aload_0
     586: aload         10
     588: aload         4
     590: invokevirtual #302                // Method c:(Landroid/content/Context;Landroid/util/AttributeSet;)Landroid/support/v7/widget/i;
     593: astore_1
     594: goto          618
     597: aload_0
     598: aload         10
     600: aload         4
     602: invokevirtual #305                // Method b:(Landroid/content/Context;Landroid/util/AttributeSet;)Landroid/support/v7/widget/r;
     605: astore_1
     606: goto          618
     609: aload_0
     610: aload         10
     612: aload         4
     614: invokevirtual #307                // Method a:(Landroid/content/Context;Landroid/util/AttributeSet;)Landroid/support/v7/widget/ac;
     617: astore_1
     618: aload_0
     619: aload_1
     620: aload_2
     621: invokespecial #309                // Method a:(Landroid/view/View;Ljava/lang/String;)V
     624: aload_1
     625: astore        11
     627: aload_1
     628: ifnonnull     651
     631: aload_1
     632: astore        11
     634: aload_3
     635: aload         10
     637: if_acmpeq     651
     640: aload_0
     641: aload         10
     643: aload_2
     644: aload         4
     646: invokespecial #311                // Method b:(Landroid/content/Context;Ljava/lang/String;Landroid/util/AttributeSet;)Landroid/view/View;
     649: astore        11
     651: aload         11
     653: ifnull        664
     656: aload_0
     657: aload         11
     659: aload         4
     661: invokespecial #313                // Method a:(Landroid/view/View;Landroid/util/AttributeSet;)V
     664: aload         11
     666: areturn

  protected android.support.v7.widget.r b(android.content.Context, android.util.AttributeSet);
    Code:
       0: new           #315                // class android/support/v7/widget/r
       3: dup
       4: aload_1
       5: aload_2
       6: invokespecial #316                // Method android/support/v7/widget/r."<init>":(Landroid/content/Context;Landroid/util/AttributeSet;)V
       9: areturn

  protected android.support.v7.widget.i c(android.content.Context, android.util.AttributeSet);
    Code:
       0: new           #318                // class android/support/v7/widget/i
       3: dup
       4: aload_1
       5: aload_2
       6: invokespecial #319                // Method android/support/v7/widget/i."<init>":(Landroid/content/Context;Landroid/util/AttributeSet;)V
       9: areturn

  protected android.support.v7.widget.n d(android.content.Context, android.util.AttributeSet);
    Code:
       0: new           #321                // class android/support/v7/widget/n
       3: dup
       4: aload_1
       5: aload_2
       6: invokespecial #322                // Method android/support/v7/widget/n."<init>":(Landroid/content/Context;Landroid/util/AttributeSet;)V
       9: areturn

  protected android.support.v7.widget.z e(android.content.Context, android.util.AttributeSet);
    Code:
       0: new           #324                // class android/support/v7/widget/z
       3: dup
       4: aload_1
       5: aload_2
       6: invokespecial #325                // Method android/support/v7/widget/z."<init>":(Landroid/content/Context;Landroid/util/AttributeSet;)V
       9: areturn

  protected android.support.v7.widget.p f(android.content.Context, android.util.AttributeSet);
    Code:
       0: new           #327                // class android/support/v7/widget/p
       3: dup
       4: aload_1
       5: aload_2
       6: invokespecial #328                // Method android/support/v7/widget/p."<init>":(Landroid/content/Context;Landroid/util/AttributeSet;)V
       9: areturn

  protected android.support.v7.widget.j g(android.content.Context, android.util.AttributeSet);
    Code:
       0: new           #330                // class android/support/v7/widget/j
       3: dup
       4: aload_1
       5: aload_2
       6: invokespecial #331                // Method android/support/v7/widget/j."<init>":(Landroid/content/Context;Landroid/util/AttributeSet;)V
       9: areturn

  protected android.support.v7.widget.v h(android.content.Context, android.util.AttributeSet);
    Code:
       0: new           #333                // class android/support/v7/widget/v
       3: dup
       4: aload_1
       5: aload_2
       6: invokespecial #334                // Method android/support/v7/widget/v."<init>":(Landroid/content/Context;Landroid/util/AttributeSet;)V
       9: areturn

  protected android.support.v7.widget.k i(android.content.Context, android.util.AttributeSet);
    Code:
       0: new           #336                // class android/support/v7/widget/k
       3: dup
       4: aload_1
       5: aload_2
       6: invokespecial #337                // Method android/support/v7/widget/k."<init>":(Landroid/content/Context;Landroid/util/AttributeSet;)V
       9: areturn

  protected android.support.v7.widget.g j(android.content.Context, android.util.AttributeSet);
    Code:
       0: new           #339                // class android/support/v7/widget/g
       3: dup
       4: aload_1
       5: aload_2
       6: invokespecial #340                // Method android/support/v7/widget/g."<init>":(Landroid/content/Context;Landroid/util/AttributeSet;)V
       9: areturn

  protected android.support.v7.widget.s k(android.content.Context, android.util.AttributeSet);
    Code:
       0: new           #342                // class android/support/v7/widget/s
       3: dup
       4: aload_1
       5: aload_2
       6: invokespecial #343                // Method android/support/v7/widget/s."<init>":(Landroid/content/Context;Landroid/util/AttributeSet;)V
       9: areturn

  protected android.support.v7.widget.w l(android.content.Context, android.util.AttributeSet);
    Code:
       0: new           #345                // class android/support/v7/widget/w
       3: dup
       4: aload_1
       5: aload_2
       6: invokespecial #346                // Method android/support/v7/widget/w."<init>":(Landroid/content/Context;Landroid/util/AttributeSet;)V
       9: areturn

  protected android.support.v7.widget.x m(android.content.Context, android.util.AttributeSet);
    Code:
       0: new           #348                // class android/support/v7/widget/x
       3: dup
       4: aload_1
       5: aload_2
       6: invokespecial #349                // Method android/support/v7/widget/x."<init>":(Landroid/content/Context;Landroid/util/AttributeSet;)V
       9: areturn
}
