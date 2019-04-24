class android.support.v7.widget.bj extends android.support.v4.widget.l implements android.view.View$OnClickListener {
  public android.support.v7.widget.bj(android.content.Context, android.support.v7.widget.SearchView, android.app.SearchableInfo, java.util.WeakHashMap<java.lang.String, android.graphics.drawable.Drawable$ConstantState>);
    Code:
       0: aload_0
       1: aload_1
       2: aload_2
       3: invokevirtual #41                 // Method android/support/v7/widget/SearchView.getSuggestionRowLayout:()I
       6: aconst_null
       7: iconst_1
       8: invokespecial #44                 // Method android/support/v4/widget/l."<init>":(Landroid/content/Context;ILandroid/database/Cursor;Z)V
      11: aload_0
      12: iconst_0
      13: putfield      #46                 // Field p:Z
      16: aload_0
      17: iconst_1
      18: putfield      #48                 // Field q:I
      21: aload_0
      22: iconst_m1
      23: putfield      #50                 // Field s:I
      26: aload_0
      27: iconst_m1
      28: putfield      #52                 // Field t:I
      31: aload_0
      32: iconst_m1
      33: putfield      #54                 // Field u:I
      36: aload_0
      37: iconst_m1
      38: putfield      #56                 // Field v:I
      41: aload_0
      42: iconst_m1
      43: putfield      #58                 // Field w:I
      46: aload_0
      47: iconst_m1
      48: putfield      #60                 // Field x:I
      51: aload_0
      52: aload_0
      53: getfield      #63                 // Field d:Landroid/content/Context;
      56: ldc           #65                 // String search
      58: invokevirtual #71                 // Method android/content/Context.getSystemService:(Ljava/lang/String;)Ljava/lang/Object;
      61: checkcast     #73                 // class android/app/SearchManager
      64: putfield      #75                 // Field j:Landroid/app/SearchManager;
      67: aload_0
      68: aload_2
      69: putfield      #77                 // Field k:Landroid/support/v7/widget/SearchView;
      72: aload_0
      73: aload_3
      74: putfield      #79                 // Field l:Landroid/app/SearchableInfo;
      77: aload_0
      78: aload_2
      79: invokevirtual #82                 // Method android/support/v7/widget/SearchView.getSuggestionCommitIconResId:()I
      82: putfield      #84                 // Field o:I
      85: aload_0
      86: aload_1
      87: putfield      #86                 // Field m:Landroid/content/Context;
      90: aload_0
      91: aload         4
      93: putfield      #88                 // Field n:Ljava/util/WeakHashMap;
      96: return

  public static java.lang.String a(android.database.Cursor, java.lang.String);
    Code:
       0: aload_0
       1: aload_0
       2: aload_1
       3: invokeinterface #222,  2          // InterfaceMethod android/database/Cursor.getColumnIndex:(Ljava/lang/String;)I
       8: invokestatic  #224                // Method a:(Landroid/database/Cursor;I)Ljava/lang/String;
      11: areturn

  android.database.Cursor a(android.app.SearchableInfo, java.lang.String, int);
    Code:
       0: aconst_null
       1: astore        4
       3: aload_1
       4: ifnonnull     9
       7: aconst_null
       8: areturn
       9: aload_1
      10: invokevirtual #418                // Method android/app/SearchableInfo.getSuggestAuthority:()Ljava/lang/String;
      13: astore        5
      15: aload         5
      17: ifnonnull     22
      20: aconst_null
      21: areturn
      22: new           #420                // class android/net/Uri$Builder
      25: dup
      26: invokespecial #421                // Method android/net/Uri$Builder."<init>":()V
      29: ldc_w         #423                // String content
      32: invokevirtual #427                // Method android/net/Uri$Builder.scheme:(Ljava/lang/String;)Landroid/net/Uri$Builder;
      35: aload         5
      37: invokevirtual #430                // Method android/net/Uri$Builder.authority:(Ljava/lang/String;)Landroid/net/Uri$Builder;
      40: ldc_w         #432                // String
      43: invokevirtual #435                // Method android/net/Uri$Builder.query:(Ljava/lang/String;)Landroid/net/Uri$Builder;
      46: ldc_w         #432                // String
      49: invokevirtual #438                // Method android/net/Uri$Builder.fragment:(Ljava/lang/String;)Landroid/net/Uri$Builder;
      52: astore        5
      54: aload_1
      55: invokevirtual #441                // Method android/app/SearchableInfo.getSuggestPath:()Ljava/lang/String;
      58: astore        6
      60: aload         6
      62: ifnull        73
      65: aload         5
      67: aload         6
      69: invokevirtual #444                // Method android/net/Uri$Builder.appendEncodedPath:(Ljava/lang/String;)Landroid/net/Uri$Builder;
      72: pop
      73: aload         5
      75: ldc_w         #446                // String search_suggest_query
      78: invokevirtual #449                // Method android/net/Uri$Builder.appendPath:(Ljava/lang/String;)Landroid/net/Uri$Builder;
      81: pop
      82: aload_1
      83: invokevirtual #452                // Method android/app/SearchableInfo.getSuggestSelection:()Ljava/lang/String;
      86: astore        6
      88: aload         6
      90: ifnull        105
      93: iconst_1
      94: anewarray     #138                // class java/lang/String
      97: astore_1
      98: aload_1
      99: iconst_0
     100: aload_2
     101: aastore
     102: goto          118
     105: aload         5
     107: aload_2
     108: invokevirtual #449                // Method android/net/Uri$Builder.appendPath:(Ljava/lang/String;)Landroid/net/Uri$Builder;
     111: pop
     112: aload         4
     114: astore_1
     115: goto          102
     118: iload_3
     119: ifle          135
     122: aload         5
     124: ldc_w         #454                // String limit
     127: iload_3
     128: invokestatic  #457                // Method java/lang/String.valueOf:(I)Ljava/lang/String;
     131: invokevirtual #461                // Method android/net/Uri$Builder.appendQueryParameter:(Ljava/lang/String;Ljava/lang/String;)Landroid/net/Uri$Builder;
     134: pop
     135: aload         5
     137: invokevirtual #465                // Method android/net/Uri$Builder.build:()Landroid/net/Uri;
     140: astore_2
     141: aload_0
     142: getfield      #63                 // Field d:Landroid/content/Context;
     145: invokevirtual #306                // Method android/content/Context.getContentResolver:()Landroid/content/ContentResolver;
     148: aload_2
     149: aconst_null
     150: aload         6
     152: aload_1
     153: aconst_null
     154: invokevirtual #468                // Method android/content/ContentResolver.query:(Landroid/net/Uri;[Ljava/lang/String;Ljava/lang/String;[Ljava/lang/String;Ljava/lang/String;)Landroid/database/Cursor;
     157: areturn

  public android.database.Cursor a(java.lang.CharSequence);
    Code:
       0: aload_1
       1: ifnonnull     11
       4: ldc_w         #432                // String
       7: astore_1
       8: goto          18
      11: aload_1
      12: invokeinterface #472,  1          // InterfaceMethod java/lang/CharSequence.toString:()Ljava/lang/String;
      17: astore_1
      18: aload_0
      19: getfield      #77                 // Field k:Landroid/support/v7/widget/SearchView;
      22: invokevirtual #475                // Method android/support/v7/widget/SearchView.getVisibility:()I
      25: ifne          76
      28: aload_0
      29: getfield      #77                 // Field k:Landroid/support/v7/widget/SearchView;
      32: invokevirtual #478                // Method android/support/v7/widget/SearchView.getWindowVisibility:()I
      35: ifeq          40
      38: aconst_null
      39: areturn
      40: aload_0
      41: aload_0
      42: getfield      #79                 // Field l:Landroid/app/SearchableInfo;
      45: aload_1
      46: bipush        50
      48: invokevirtual #480                // Method a:(Landroid/app/SearchableInfo;Ljava/lang/String;I)Landroid/database/Cursor;
      51: astore_1
      52: aload_1
      53: ifnull        76
      56: aload_1
      57: invokeinterface #483,  1          // InterfaceMethod android/database/Cursor.getCount:()I
      62: pop
      63: aload_1
      64: areturn
      65: astore_1
      66: ldc           #189                // String SuggestionsAdapter
      68: ldc_w         #485                // String Search suggestions query threw an exception.
      71: aload_1
      72: invokestatic  #487                // Method android/util/Log.w:(Ljava/lang/String;Ljava/lang/String;Ljava/lang/Throwable;)I
      75: pop
      76: aconst_null
      77: areturn
    Exception table:
       from    to  target type
          40    52    65   Class java/lang/RuntimeException
          56    63    65   Class java/lang/RuntimeException

  android.graphics.drawable.Drawable a(android.net.Uri);
    Code:
       0: aload_1
       1: invokevirtual #490                // Method android/net/Uri.getAuthority:()Ljava/lang/String;
       4: astore_3
       5: aload_3
       6: invokestatic  #251                // Method android/text/TextUtils.isEmpty:(Ljava/lang/CharSequence;)Z
       9: ifeq          46
      12: new           #155                // class java/lang/StringBuilder
      15: dup
      16: invokespecial #158                // Method java/lang/StringBuilder."<init>":()V
      19: astore_3
      20: aload_3
      21: ldc_w         #492                // String No authority:
      24: invokevirtual #164                // Method java/lang/StringBuilder.append:(Ljava/lang/String;)Ljava/lang/StringBuilder;
      27: pop
      28: aload_3
      29: aload_1
      30: invokevirtual #299                // Method java/lang/StringBuilder.append:(Ljava/lang/Object;)Ljava/lang/StringBuilder;
      33: pop
      34: new           #285                // class java/io/FileNotFoundException
      37: dup
      38: aload_3
      39: invokevirtual #175                // Method java/lang/StringBuilder.toString:()Ljava/lang/String;
      42: invokespecial #302                // Method java/io/FileNotFoundException."<init>":(Ljava/lang/String;)V
      45: athrow
      46: aload_0
      47: getfield      #63                 // Field d:Landroid/content/Context;
      50: invokevirtual #258                // Method android/content/Context.getPackageManager:()Landroid/content/pm/PackageManager;
      53: aload_3
      54: invokevirtual #496                // Method android/content/pm/PackageManager.getResourcesForApplication:(Ljava/lang/String;)Landroid/content/res/Resources;
      57: astore        4
      59: aload_1
      60: invokevirtual #500                // Method android/net/Uri.getPathSegments:()Ljava/util/List;
      63: astore        5
      65: aload         5
      67: ifnonnull     104
      70: new           #155                // class java/lang/StringBuilder
      73: dup
      74: invokespecial #158                // Method java/lang/StringBuilder."<init>":()V
      77: astore_3
      78: aload_3
      79: ldc_w         #502                // String No path:
      82: invokevirtual #164                // Method java/lang/StringBuilder.append:(Ljava/lang/String;)Ljava/lang/StringBuilder;
      85: pop
      86: aload_3
      87: aload_1
      88: invokevirtual #299                // Method java/lang/StringBuilder.append:(Ljava/lang/Object;)Ljava/lang/StringBuilder;
      91: pop
      92: new           #285                // class java/io/FileNotFoundException
      95: dup
      96: aload_3
      97: invokevirtual #175                // Method java/lang/StringBuilder.toString:()Ljava/lang/String;
     100: invokespecial #302                // Method java/io/FileNotFoundException."<init>":(Ljava/lang/String;)V
     103: athrow
     104: aload         5
     106: invokeinterface #507,  1          // InterfaceMethod java/util/List.size:()I
     111: istore_2
     112: iload_2
     113: iconst_1
     114: if_icmpne     169
     117: aload         5
     119: iconst_0
     120: invokeinterface #510,  2          // InterfaceMethod java/util/List.get:(I)Ljava/lang/Object;
     125: checkcast     #138                // class java/lang/String
     128: invokestatic  #153                // Method java/lang/Integer.parseInt:(Ljava/lang/String;)I
     131: istore_2
     132: goto          203
     135: new           #155                // class java/lang/StringBuilder
     138: dup
     139: invokespecial #158                // Method java/lang/StringBuilder."<init>":()V
     142: astore_3
     143: aload_3
     144: ldc_w         #512                // String Single path segment is not a resource ID:
     147: invokevirtual #164                // Method java/lang/StringBuilder.append:(Ljava/lang/String;)Ljava/lang/StringBuilder;
     150: pop
     151: aload_3
     152: aload_1
     153: invokevirtual #299                // Method java/lang/StringBuilder.append:(Ljava/lang/Object;)Ljava/lang/StringBuilder;
     156: pop
     157: new           #285                // class java/io/FileNotFoundException
     160: dup
     161: aload_3
     162: invokevirtual #175                // Method java/lang/StringBuilder.toString:()Ljava/lang/String;
     165: invokespecial #302                // Method java/io/FileNotFoundException."<init>":(Ljava/lang/String;)V
     168: athrow
     169: iload_2
     170: iconst_2
     171: if_icmpne     248
     174: aload         4
     176: aload         5
     178: iconst_1
     179: invokeinterface #510,  2          // InterfaceMethod java/util/List.get:(I)Ljava/lang/Object;
     184: checkcast     #138                // class java/lang/String
     187: aload         5
     189: iconst_0
     190: invokeinterface #510,  2          // InterfaceMethod java/util/List.get:(I)Ljava/lang/Object;
     195: checkcast     #138                // class java/lang/String
     198: aload_3
     199: invokevirtual #516                // Method android/content/res/Resources.getIdentifier:(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)I
     202: istore_2
     203: iload_2
     204: ifne          241
     207: new           #155                // class java/lang/StringBuilder
     210: dup
     211: invokespecial #158                // Method java/lang/StringBuilder."<init>":()V
     214: astore_3
     215: aload_3
     216: ldc_w         #518                // String No resource found for:
     219: invokevirtual #164                // Method java/lang/StringBuilder.append:(Ljava/lang/String;)Ljava/lang/StringBuilder;
     222: pop
     223: aload_3
     224: aload_1
     225: invokevirtual #299                // Method java/lang/StringBuilder.append:(Ljava/lang/Object;)Ljava/lang/StringBuilder;
     228: pop
     229: new           #285                // class java/io/FileNotFoundException
     232: dup
     233: aload_3
     234: invokevirtual #175                // Method java/lang/StringBuilder.toString:()Ljava/lang/String;
     237: invokespecial #302                // Method java/io/FileNotFoundException."<init>":(Ljava/lang/String;)V
     240: athrow
     241: aload         4
     243: iload_2
     244: invokevirtual #521                // Method android/content/res/Resources.getDrawable:(I)Landroid/graphics/drawable/Drawable;
     247: areturn
     248: new           #155                // class java/lang/StringBuilder
     251: dup
     252: invokespecial #158                // Method java/lang/StringBuilder."<init>":()V
     255: astore_3
     256: aload_3
     257: ldc_w         #523                // String More than two path segments:
     260: invokevirtual #164                // Method java/lang/StringBuilder.append:(Ljava/lang/String;)Ljava/lang/StringBuilder;
     263: pop
     264: aload_3
     265: aload_1
     266: invokevirtual #299                // Method java/lang/StringBuilder.append:(Ljava/lang/Object;)Ljava/lang/StringBuilder;
     269: pop
     270: new           #285                // class java/io/FileNotFoundException
     273: dup
     274: aload_3
     275: invokevirtual #175                // Method java/lang/StringBuilder.toString:()Ljava/lang/String;
     278: invokespecial #302                // Method java/io/FileNotFoundException."<init>":(Ljava/lang/String;)V
     281: athrow
     282: new           #155                // class java/lang/StringBuilder
     285: dup
     286: invokespecial #158                // Method java/lang/StringBuilder."<init>":()V
     289: astore_3
     290: aload_3
     291: ldc_w         #525                // String No package found for authority:
     294: invokevirtual #164                // Method java/lang/StringBuilder.append:(Ljava/lang/String;)Ljava/lang/StringBuilder;
     297: pop
     298: aload_3
     299: aload_1
     300: invokevirtual #299                // Method java/lang/StringBuilder.append:(Ljava/lang/Object;)Ljava/lang/StringBuilder;
     303: pop
     304: new           #285                // class java/io/FileNotFoundException
     307: dup
     308: aload_3
     309: invokevirtual #175                // Method java/lang/StringBuilder.toString:()Ljava/lang/String;
     312: invokespecial #302                // Method java/io/FileNotFoundException."<init>":(Ljava/lang/String;)V
     315: athrow
     316: astore_3
     317: goto          282
     320: astore_3
     321: goto          135
    Exception table:
       from    to  target type
          46    59   316   Class android/content/pm/PackageManager$NameNotFoundException
         117   132   320   Class java/lang/NumberFormatException

  public android.view.View a(android.content.Context, android.database.Cursor, android.view.ViewGroup);
    Code:
       0: aload_0
       1: aload_1
       2: aload_2
       3: aload_3
       4: invokespecial #528                // Method android/support/v4/widget/l.a:(Landroid/content/Context;Landroid/database/Cursor;Landroid/view/ViewGroup;)Landroid/view/View;
       7: astore_1
       8: aload_1
       9: new           #8                  // class android/support/v7/widget/bj$a
      12: dup
      13: aload_1
      14: invokespecial #531                // Method android/support/v7/widget/bj$a."<init>":(Landroid/view/View;)V
      17: invokevirtual #537                // Method android/view/View.setTag:(Ljava/lang/Object;)V
      20: aload_1
      21: getstatic     #542                // Field android/support/v7/a/a$f.edit_query:I
      24: invokevirtual #546                // Method android/view/View.findViewById:(I)Landroid/view/View;
      27: checkcast     #227                // class android/widget/ImageView
      30: aload_0
      31: getfield      #84                 // Field o:I
      34: invokevirtual #549                // Method android/widget/ImageView.setImageResource:(I)V
      37: aload_1
      38: areturn

  public void a(int);
    Code:
       0: aload_0
       1: iload_1
       2: putfield      #48                 // Field q:I
       5: return

  public void a(android.database.Cursor);
    Code:
       0: aload_0
       1: getfield      #46                 // Field p:Z
       4: ifeq          27
       7: ldc           #189                // String SuggestionsAdapter
       9: ldc_w         #551                // String Tried to change cursor after adapter was closed.
      12: invokestatic  #194                // Method android/util/Log.w:(Ljava/lang/String;Ljava/lang/String;)I
      15: pop
      16: aload_1
      17: ifnull        26
      20: aload_1
      21: invokeinterface #552,  1          // InterfaceMethod android/database/Cursor.close:()V
      26: return
      27: aload_0
      28: aload_1
      29: invokespecial #554                // Method android/support/v4/widget/l.a:(Landroid/database/Cursor;)V
      32: aload_1
      33: ifnull        126
      36: aload_0
      37: aload_1
      38: ldc_w         #556                // String suggest_text_1
      41: invokeinterface #222,  2          // InterfaceMethod android/database/Cursor.getColumnIndex:(Ljava/lang/String;)I
      46: putfield      #50                 // Field s:I
      49: aload_0
      50: aload_1
      51: ldc_w         #558                // String suggest_text_2
      54: invokeinterface #222,  2          // InterfaceMethod android/database/Cursor.getColumnIndex:(Ljava/lang/String;)I
      59: putfield      #52                 // Field t:I
      62: aload_0
      63: aload_1
      64: ldc_w         #560                // String suggest_text_2_url
      67: invokeinterface #222,  2          // InterfaceMethod android/database/Cursor.getColumnIndex:(Ljava/lang/String;)I
      72: putfield      #54                 // Field u:I
      75: aload_0
      76: aload_1
      77: ldc_w         #562                // String suggest_icon_1
      80: invokeinterface #222,  2          // InterfaceMethod android/database/Cursor.getColumnIndex:(Ljava/lang/String;)I
      85: putfield      #56                 // Field v:I
      88: aload_0
      89: aload_1
      90: ldc_w         #564                // String suggest_icon_2
      93: invokeinterface #222,  2          // InterfaceMethod android/database/Cursor.getColumnIndex:(Ljava/lang/String;)I
      98: putfield      #58                 // Field w:I
     101: aload_0
     102: aload_1
     103: ldc_w         #566                // String suggest_flags
     106: invokeinterface #222,  2          // InterfaceMethod android/database/Cursor.getColumnIndex:(Ljava/lang/String;)I
     111: putfield      #60                 // Field x:I
     114: return
     115: astore_1
     116: ldc           #189                // String SuggestionsAdapter
     118: ldc_w         #568                // String error changing cursor and caching columns
     121: aload_1
     122: invokestatic  #218                // Method android/util/Log.e:(Ljava/lang/String;Ljava/lang/String;Ljava/lang/Throwable;)I
     125: pop
     126: return
    Exception table:
       from    to  target type
          27    32   115   Class java/lang/Exception
          36   114   115   Class java/lang/Exception

  public void a(android.view.View, android.content.Context, android.database.Cursor);
    Code:
       0: aload_1
       1: invokevirtual #573                // Method android/view/View.getTag:()Ljava/lang/Object;
       4: checkcast     #8                  // class android/support/v7/widget/bj$a
       7: astore_2
       8: aload_0
       9: getfield      #60                 // Field x:I
      12: iconst_m1
      13: if_icmpeq     31
      16: aload_3
      17: aload_0
      18: getfield      #60                 // Field x:I
      21: invokeinterface #577,  2          // InterfaceMethod android/database/Cursor.getInt:(I)I
      26: istore        4
      28: goto          34
      31: iconst_0
      32: istore        4
      34: aload_2
      35: getfield      #580                // Field android/support/v7/widget/bj$a.a:Landroid/widget/TextView;
      38: ifnull        59
      41: aload_3
      42: aload_0
      43: getfield      #50                 // Field s:I
      46: invokestatic  #224                // Method a:(Landroid/database/Cursor;I)Ljava/lang/String;
      49: astore_1
      50: aload_0
      51: aload_2
      52: getfield      #580                // Field android/support/v7/widget/bj$a.a:Landroid/widget/TextView;
      55: aload_1
      56: invokespecial #582                // Method a:(Landroid/widget/TextView;Ljava/lang/CharSequence;)V
      59: aload_2
      60: getfield      #584                // Field android/support/v7/widget/bj$a.b:Landroid/widget/TextView;
      63: ifnull        162
      66: aload_3
      67: aload_0
      68: getfield      #54                 // Field u:I
      71: invokestatic  #224                // Method a:(Landroid/database/Cursor;I)Ljava/lang/String;
      74: astore_1
      75: aload_1
      76: ifnull        88
      79: aload_0
      80: aload_1
      81: invokespecial #586                // Method b:(Ljava/lang/CharSequence;)Ljava/lang/CharSequence;
      84: astore_1
      85: goto          97
      88: aload_3
      89: aload_0
      90: getfield      #52                 // Field t:I
      93: invokestatic  #224                // Method a:(Landroid/database/Cursor;I)Ljava/lang/String;
      96: astore_1
      97: aload_1
      98: invokestatic  #251                // Method android/text/TextUtils.isEmpty:(Ljava/lang/CharSequence;)Z
     101: ifeq          130
     104: aload_2
     105: getfield      #580                // Field android/support/v7/widget/bj$a.a:Landroid/widget/TextView;
     108: ifnull        153
     111: aload_2
     112: getfield      #580                // Field android/support/v7/widget/bj$a.a:Landroid/widget/TextView;
     115: iconst_0
     116: invokevirtual #590                // Method android/widget/TextView.setSingleLine:(Z)V
     119: aload_2
     120: getfield      #580                // Field android/support/v7/widget/bj$a.a:Landroid/widget/TextView;
     123: iconst_2
     124: invokevirtual #593                // Method android/widget/TextView.setMaxLines:(I)V
     127: goto          153
     130: aload_2
     131: getfield      #580                // Field android/support/v7/widget/bj$a.a:Landroid/widget/TextView;
     134: ifnull        153
     137: aload_2
     138: getfield      #580                // Field android/support/v7/widget/bj$a.a:Landroid/widget/TextView;
     141: iconst_1
     142: invokevirtual #590                // Method android/widget/TextView.setSingleLine:(Z)V
     145: aload_2
     146: getfield      #580                // Field android/support/v7/widget/bj$a.a:Landroid/widget/TextView;
     149: iconst_1
     150: invokevirtual #593                // Method android/widget/TextView.setMaxLines:(I)V
     153: aload_0
     154: aload_2
     155: getfield      #584                // Field android/support/v7/widget/bj$a.b:Landroid/widget/TextView;
     158: aload_1
     159: invokespecial #582                // Method a:(Landroid/widget/TextView;Ljava/lang/CharSequence;)V
     162: aload_2
     163: getfield      #597                // Field android/support/v7/widget/bj$a.c:Landroid/widget/ImageView;
     166: ifnull        183
     169: aload_0
     170: aload_2
     171: getfield      #597                // Field android/support/v7/widget/bj$a.c:Landroid/widget/ImageView;
     174: aload_0
     175: aload_3
     176: invokespecial #599                // Method e:(Landroid/database/Cursor;)Landroid/graphics/drawable/Drawable;
     179: iconst_4
     180: invokespecial #601                // Method a:(Landroid/widget/ImageView;Landroid/graphics/drawable/Drawable;I)V
     183: aload_2
     184: getfield      #603                // Field android/support/v7/widget/bj$a.d:Landroid/widget/ImageView;
     187: ifnull        205
     190: aload_0
     191: aload_2
     192: getfield      #603                // Field android/support/v7/widget/bj$a.d:Landroid/widget/ImageView;
     195: aload_0
     196: aload_3
     197: invokespecial #605                // Method f:(Landroid/database/Cursor;)Landroid/graphics/drawable/Drawable;
     200: bipush        8
     202: invokespecial #601                // Method a:(Landroid/widget/ImageView;Landroid/graphics/drawable/Drawable;I)V
     205: aload_0
     206: getfield      #48                 // Field q:I
     209: iconst_2
     210: if_icmpeq     241
     213: aload_0
     214: getfield      #48                 // Field q:I
     217: iconst_1
     218: if_icmpne     231
     221: iload         4
     223: iconst_1
     224: iand
     225: ifeq          231
     228: goto          241
     231: aload_2
     232: getfield      #607                // Field android/support/v7/widget/bj$a.e:Landroid/widget/ImageView;
     235: bipush        8
     237: invokevirtual #235                // Method android/widget/ImageView.setVisibility:(I)V
     240: return
     241: aload_2
     242: getfield      #607                // Field android/support/v7/widget/bj$a.e:Landroid/widget/ImageView;
     245: iconst_0
     246: invokevirtual #235                // Method android/widget/ImageView.setVisibility:(I)V
     249: aload_2
     250: getfield      #607                // Field android/support/v7/widget/bj$a.e:Landroid/widget/ImageView;
     253: aload_2
     254: getfield      #580                // Field android/support/v7/widget/bj$a.a:Landroid/widget/TextView;
     257: invokevirtual #611                // Method android/widget/TextView.getText:()Ljava/lang/CharSequence;
     260: invokevirtual #612                // Method android/widget/ImageView.setTag:(Ljava/lang/Object;)V
     263: aload_2
     264: getfield      #607                // Field android/support/v7/widget/bj$a.e:Landroid/widget/ImageView;
     267: aload_0
     268: invokevirtual #616                // Method android/widget/ImageView.setOnClickListener:(Landroid/view/View$OnClickListener;)V
     271: return

  public java.lang.CharSequence c(android.database.Cursor);
    Code:
       0: aload_1
       1: ifnonnull     6
       4: aconst_null
       5: areturn
       6: aload_1
       7: ldc_w         #619                // String suggest_intent_query
      10: invokestatic  #621                // Method a:(Landroid/database/Cursor;Ljava/lang/String;)Ljava/lang/String;
      13: astore_2
      14: aload_2
      15: ifnull        20
      18: aload_2
      19: areturn
      20: aload_0
      21: getfield      #79                 // Field l:Landroid/app/SearchableInfo;
      24: invokevirtual #624                // Method android/app/SearchableInfo.shouldRewriteQueryFromData:()Z
      27: ifeq          44
      30: aload_1
      31: ldc_w         #626                // String suggest_intent_data
      34: invokestatic  #621                // Method a:(Landroid/database/Cursor;Ljava/lang/String;)Ljava/lang/String;
      37: astore_2
      38: aload_2
      39: ifnull        44
      42: aload_2
      43: areturn
      44: aload_0
      45: getfield      #79                 // Field l:Landroid/app/SearchableInfo;
      48: invokevirtual #629                // Method android/app/SearchableInfo.shouldRewriteQueryFromText:()Z
      51: ifeq          68
      54: aload_1
      55: ldc_w         #556                // String suggest_text_1
      58: invokestatic  #621                // Method a:(Landroid/database/Cursor;Ljava/lang/String;)Ljava/lang/String;
      61: astore_1
      62: aload_1
      63: ifnull        68
      66: aload_1
      67: areturn
      68: aconst_null
      69: areturn

  public android.view.View getDropDownView(int, android.view.View, android.view.ViewGroup);
    Code:
       0: aload_0
       1: iload_1
       2: aload_2
       3: aload_3
       4: invokespecial #633                // Method android/support/v4/widget/l.getDropDownView:(ILandroid/view/View;Landroid/view/ViewGroup;)Landroid/view/View;
       7: astore_2
       8: aload_2
       9: areturn
      10: astore_2
      11: ldc           #189                // String SuggestionsAdapter
      13: ldc_w         #635                // String Search suggestions cursor threw exception.
      16: aload_2
      17: invokestatic  #487                // Method android/util/Log.w:(Ljava/lang/String;Ljava/lang/String;Ljava/lang/Throwable;)I
      20: pop
      21: aload_0
      22: aload_0
      23: getfield      #63                 // Field d:Landroid/content/Context;
      26: aload_0
      27: getfield      #638                // Field c:Landroid/database/Cursor;
      30: aload_3
      31: invokevirtual #640                // Method b:(Landroid/content/Context;Landroid/database/Cursor;Landroid/view/ViewGroup;)Landroid/view/View;
      34: astore_3
      35: aload_3
      36: ifnull        56
      39: aload_3
      40: invokevirtual #573                // Method android/view/View.getTag:()Ljava/lang/Object;
      43: checkcast     #8                  // class android/support/v7/widget/bj$a
      46: getfield      #580                // Field android/support/v7/widget/bj$a.a:Landroid/widget/TextView;
      49: aload_2
      50: invokevirtual #641                // Method java/lang/RuntimeException.toString:()Ljava/lang/String;
      53: invokevirtual #246                // Method android/widget/TextView.setText:(Ljava/lang/CharSequence;)V
      56: aload_3
      57: areturn
    Exception table:
       from    to  target type
           0     8    10   Class java/lang/RuntimeException

  public android.view.View getView(int, android.view.View, android.view.ViewGroup);
    Code:
       0: aload_0
       1: iload_1
       2: aload_2
       3: aload_3
       4: invokespecial #644                // Method android/support/v4/widget/l.getView:(ILandroid/view/View;Landroid/view/ViewGroup;)Landroid/view/View;
       7: astore_2
       8: aload_2
       9: areturn
      10: astore_2
      11: ldc           #189                // String SuggestionsAdapter
      13: ldc_w         #635                // String Search suggestions cursor threw exception.
      16: aload_2
      17: invokestatic  #487                // Method android/util/Log.w:(Ljava/lang/String;Ljava/lang/String;Ljava/lang/Throwable;)I
      20: pop
      21: aload_0
      22: aload_0
      23: getfield      #63                 // Field d:Landroid/content/Context;
      26: aload_0
      27: getfield      #638                // Field c:Landroid/database/Cursor;
      30: aload_3
      31: invokevirtual #645                // Method a:(Landroid/content/Context;Landroid/database/Cursor;Landroid/view/ViewGroup;)Landroid/view/View;
      34: astore_3
      35: aload_3
      36: ifnull        56
      39: aload_3
      40: invokevirtual #573                // Method android/view/View.getTag:()Ljava/lang/Object;
      43: checkcast     #8                  // class android/support/v7/widget/bj$a
      46: getfield      #580                // Field android/support/v7/widget/bj$a.a:Landroid/widget/TextView;
      49: aload_2
      50: invokevirtual #641                // Method java/lang/RuntimeException.toString:()Ljava/lang/String;
      53: invokevirtual #246                // Method android/widget/TextView.setText:(Ljava/lang/CharSequence;)V
      56: aload_3
      57: areturn
    Exception table:
       from    to  target type
           0     8    10   Class java/lang/RuntimeException

  public boolean hasStableIds();
    Code:
       0: iconst_0
       1: ireturn

  public void notifyDataSetChanged();
    Code:
       0: aload_0
       1: invokespecial #649                // Method android/support/v4/widget/l.notifyDataSetChanged:()V
       4: aload_0
       5: aload_0
       6: invokevirtual #652                // Method a:()Landroid/database/Cursor;
       9: invokespecial #654                // Method d:(Landroid/database/Cursor;)V
      12: return

  public void notifyDataSetInvalidated();
    Code:
       0: aload_0
       1: invokespecial #657                // Method android/support/v4/widget/l.notifyDataSetInvalidated:()V
       4: aload_0
       5: aload_0
       6: invokevirtual #652                // Method a:()Landroid/database/Cursor;
       9: invokespecial #654                // Method d:(Landroid/database/Cursor;)V
      12: return

  public void onClick(android.view.View);
    Code:
       0: aload_1
       1: invokevirtual #573                // Method android/view/View.getTag:()Ljava/lang/Object;
       4: astore_1
       5: aload_1
       6: instanceof    #376                // class java/lang/CharSequence
       9: ifeq          23
      12: aload_0
      13: getfield      #77                 // Field k:Landroid/support/v7/widget/SearchView;
      16: aload_1
      17: checkcast     #376                // class java/lang/CharSequence
      20: invokevirtual #660                // Method android/support/v7/widget/SearchView.a:(Ljava/lang/CharSequence;)V
      23: return
}
