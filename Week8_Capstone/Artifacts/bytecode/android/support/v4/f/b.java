public class android.support.v4.f.b {
  static {};
    Code:
       0: new           #35                 // class android/support/v4/g/g
       3: dup
       4: bipush        16
       6: invokespecial #39                 // Method android/support/v4/g/g."<init>":(I)V
       9: putstatic     #41                 // Field a:Landroid/support/v4/g/g;
      12: new           #43                 // class android/support/v4/f/c
      15: dup
      16: ldc           #45                 // String fonts
      18: bipush        10
      20: sipush        10000
      23: invokespecial #48                 // Method android/support/v4/f/c."<init>":(Ljava/lang/String;II)V
      26: putstatic     #50                 // Field b:Landroid/support/v4/f/c;
      29: new           #4                  // class java/lang/Object
      32: dup
      33: invokespecial #52                 // Method java/lang/Object."<init>":()V
      36: putstatic     #54                 // Field c:Ljava/lang/Object;
      39: new           #56                 // class android/support/v4/g/m
      42: dup
      43: invokespecial #57                 // Method android/support/v4/g/m."<init>":()V
      46: putstatic     #59                 // Field d:Landroid/support/v4/g/m;
      49: new           #12                 // class android/support/v4/f/b$4
      52: dup
      53: invokespecial #60                 // Method android/support/v4/f/b$4."<init>":()V
      56: putstatic     #62                 // Field e:Ljava/util/Comparator;
      59: return

  public static android.content.pm.ProviderInfo a(android.content.pm.PackageManager, android.support.v4.f.a, android.content.res.Resources);
    Code:
       0: aload_1
       1: invokevirtual #69                 // Method android/support/v4/f/a.a:()Ljava/lang/String;
       4: astore        5
       6: iconst_0
       7: istore_3
       8: aload_0
       9: aload         5
      11: iconst_0
      12: invokevirtual #75                 // Method android/content/pm/PackageManager.resolveContentProvider:(Ljava/lang/String;I)Landroid/content/pm/ProviderInfo;
      15: astore        4
      17: aload         4
      19: ifnonnull     56
      22: new           #77                 // class java/lang/StringBuilder
      25: dup
      26: invokespecial #78                 // Method java/lang/StringBuilder."<init>":()V
      29: astore_0
      30: aload_0
      31: ldc           #80                 // String No package found for authority:
      33: invokevirtual #84                 // Method java/lang/StringBuilder.append:(Ljava/lang/String;)Ljava/lang/StringBuilder;
      36: pop
      37: aload_0
      38: aload         5
      40: invokevirtual #84                 // Method java/lang/StringBuilder.append:(Ljava/lang/String;)Ljava/lang/StringBuilder;
      43: pop
      44: new           #86                 // class android/content/pm/PackageManager$NameNotFoundException
      47: dup
      48: aload_0
      49: invokevirtual #89                 // Method java/lang/StringBuilder.toString:()Ljava/lang/String;
      52: invokespecial #92                 // Method android/content/pm/PackageManager$NameNotFoundException."<init>":(Ljava/lang/String;)V
      55: athrow
      56: aload         4
      58: getfield      #98                 // Field android/content/pm/ProviderInfo.packageName:Ljava/lang/String;
      61: aload_1
      62: invokevirtual #100                // Method android/support/v4/f/a.b:()Ljava/lang/String;
      65: invokevirtual #106                // Method java/lang/String.equals:(Ljava/lang/Object;)Z
      68: ifne          121
      71: new           #77                 // class java/lang/StringBuilder
      74: dup
      75: invokespecial #78                 // Method java/lang/StringBuilder."<init>":()V
      78: astore_0
      79: aload_0
      80: ldc           #108                // String Found content provider
      82: invokevirtual #84                 // Method java/lang/StringBuilder.append:(Ljava/lang/String;)Ljava/lang/StringBuilder;
      85: pop
      86: aload_0
      87: aload         5
      89: invokevirtual #84                 // Method java/lang/StringBuilder.append:(Ljava/lang/String;)Ljava/lang/StringBuilder;
      92: pop
      93: aload_0
      94: ldc           #110                // String , but package was not
      96: invokevirtual #84                 // Method java/lang/StringBuilder.append:(Ljava/lang/String;)Ljava/lang/StringBuilder;
      99: pop
     100: aload_0
     101: aload_1
     102: invokevirtual #100                // Method android/support/v4/f/a.b:()Ljava/lang/String;
     105: invokevirtual #84                 // Method java/lang/StringBuilder.append:(Ljava/lang/String;)Ljava/lang/StringBuilder;
     108: pop
     109: new           #86                 // class android/content/pm/PackageManager$NameNotFoundException
     112: dup
     113: aload_0
     114: invokevirtual #89                 // Method java/lang/StringBuilder.toString:()Ljava/lang/String;
     117: invokespecial #92                 // Method android/content/pm/PackageManager$NameNotFoundException."<init>":(Ljava/lang/String;)V
     120: athrow
     121: aload_0
     122: aload         4
     124: getfield      #98                 // Field android/content/pm/ProviderInfo.packageName:Ljava/lang/String;
     127: bipush        64
     129: invokevirtual #114                // Method android/content/pm/PackageManager.getPackageInfo:(Ljava/lang/String;I)Landroid/content/pm/PackageInfo;
     132: getfield      #120                // Field android/content/pm/PackageInfo.signatures:[Landroid/content/pm/Signature;
     135: invokestatic  #123                // Method a:([Landroid/content/pm/Signature;)Ljava/util/List;
     138: astore_0
     139: aload_0
     140: getstatic     #62                 // Field e:Ljava/util/Comparator;
     143: invokestatic  #129                // Method java/util/Collections.sort:(Ljava/util/List;Ljava/util/Comparator;)V
     146: aload_1
     147: aload_2
     148: invokestatic  #132                // Method a:(Landroid/support/v4/f/a;Landroid/content/res/Resources;)Ljava/util/List;
     151: astore_1
     152: iload_3
     153: aload_1
     154: invokeinterface #138,  1          // InterfaceMethod java/util/List.size:()I
     159: if_icmpge     205
     162: new           #140                // class java/util/ArrayList
     165: dup
     166: aload_1
     167: iload_3
     168: invokeinterface #144,  2          // InterfaceMethod java/util/List.get:(I)Ljava/lang/Object;
     173: checkcast     #146                // class java/util/Collection
     176: invokespecial #149                // Method java/util/ArrayList."<init>":(Ljava/util/Collection;)V
     179: astore_2
     180: aload_2
     181: getstatic     #62                 // Field e:Ljava/util/Comparator;
     184: invokestatic  #129                // Method java/util/Collections.sort:(Ljava/util/List;Ljava/util/Comparator;)V
     187: aload_0
     188: aload_2
     189: invokestatic  #152                // Method a:(Ljava/util/List;Ljava/util/List;)Z
     192: ifeq          198
     195: aload         4
     197: areturn
     198: iload_3
     199: iconst_1
     200: iadd
     201: istore_3
     202: goto          152
     205: aconst_null
     206: areturn

  public static android.graphics.Typeface a(android.content.Context, android.support.v4.f.a, android.support.v4.a.a.b$a, android.os.Handler, boolean, int, int);
    Code:
       0: new           #77                 // class java/lang/StringBuilder
       3: dup
       4: invokespecial #78                 // Method java/lang/StringBuilder."<init>":()V
       7: astore        7
       9: aload         7
      11: aload_1
      12: invokevirtual #158                // Method android/support/v4/f/a.f:()Ljava/lang/String;
      15: invokevirtual #84                 // Method java/lang/StringBuilder.append:(Ljava/lang/String;)Ljava/lang/StringBuilder;
      18: pop
      19: aload         7
      21: ldc           #160                // String -
      23: invokevirtual #84                 // Method java/lang/StringBuilder.append:(Ljava/lang/String;)Ljava/lang/StringBuilder;
      26: pop
      27: aload         7
      29: iload         6
      31: invokevirtual #163                // Method java/lang/StringBuilder.append:(I)Ljava/lang/StringBuilder;
      34: pop
      35: aload         7
      37: invokevirtual #89                 // Method java/lang/StringBuilder.toString:()Ljava/lang/String;
      40: astore        7
      42: getstatic     #41                 // Field a:Landroid/support/v4/g/g;
      45: aload         7
      47: invokevirtual #166                // Method android/support/v4/g/g.a:(Ljava/lang/Object;)Ljava/lang/Object;
      50: checkcast     #168                // class android/graphics/Typeface
      53: astore        8
      55: aload         8
      57: ifnull        73
      60: aload_2
      61: ifnull        70
      64: aload_2
      65: aload         8
      67: invokevirtual #173                // Method android/support/v4/a/a/b$a.a:(Landroid/graphics/Typeface;)V
      70: aload         8
      72: areturn
      73: iload         4
      75: ifeq          129
      78: iload         5
      80: iconst_m1
      81: if_icmpne     129
      84: aload_0
      85: aload_1
      86: iload         6
      88: invokestatic  #176                // Method b:(Landroid/content/Context;Landroid/support/v4/f/a;I)Landroid/support/v4/f/b$c;
      91: astore_0
      92: aload_2
      93: ifnull        124
      96: aload_0
      97: getfield      #179                // Field android/support/v4/f/b$c.b:I
     100: ifne          115
     103: aload_2
     104: aload_0
     105: getfield      #182                // Field android/support/v4/f/b$c.a:Landroid/graphics/Typeface;
     108: aload_3
     109: invokevirtual #185                // Method android/support/v4/a/a/b$a.a:(Landroid/graphics/Typeface;Landroid/os/Handler;)V
     112: goto          124
     115: aload_2
     116: aload_0
     117: getfield      #179                // Field android/support/v4/f/b$c.b:I
     120: aload_3
     121: invokevirtual #188                // Method android/support/v4/a/a/b$a.a:(ILandroid/os/Handler;)V
     124: aload_0
     125: getfield      #182                // Field android/support/v4/f/b$c.a:Landroid/graphics/Typeface;
     128: areturn
     129: new           #6                  // class android/support/v4/f/b$1
     132: dup
     133: aload_0
     134: aload_1
     135: iload         6
     137: aload         7
     139: invokespecial #191                // Method android/support/v4/f/b$1."<init>":(Landroid/content/Context;Landroid/support/v4/f/a;ILjava/lang/String;)V
     142: astore_1
     143: iload         4
     145: ifeq          166
     148: getstatic     #50                 // Field b:Landroid/support/v4/f/c;
     151: aload_1
     152: iload         5
     154: invokevirtual #194                // Method android/support/v4/f/c.a:(Ljava/util/concurrent/Callable;I)Ljava/lang/Object;
     157: checkcast     #20                 // class android/support/v4/f/b$c
     160: getfield      #182                // Field android/support/v4/f/b$c.a:Landroid/graphics/Typeface;
     163: astore_0
     164: aload_0
     165: areturn
     166: aload_2
     167: ifnonnull     175
     170: aconst_null
     171: astore_0
     172: goto          185
     175: new           #8                  // class android/support/v4/f/b$2
     178: dup
     179: aload_2
     180: aload_3
     181: invokespecial #197                // Method android/support/v4/f/b$2."<init>":(Landroid/support/v4/a/a/b$a;Landroid/os/Handler;)V
     184: astore_0
     185: getstatic     #54                 // Field c:Ljava/lang/Object;
     188: astore_2
     189: aload_2
     190: monitorenter
     191: getstatic     #59                 // Field d:Landroid/support/v4/g/m;
     194: aload         7
     196: invokevirtual #200                // Method android/support/v4/g/m.containsKey:(Ljava/lang/Object;)Z
     199: ifeq          226
     202: aload_0
     203: ifnull        222
     206: getstatic     #59                 // Field d:Landroid/support/v4/g/m;
     209: aload         7
     211: invokevirtual #202                // Method android/support/v4/g/m.get:(Ljava/lang/Object;)Ljava/lang/Object;
     214: checkcast     #140                // class java/util/ArrayList
     217: aload_0
     218: invokevirtual #205                // Method java/util/ArrayList.add:(Ljava/lang/Object;)Z
     221: pop
     222: aload_2
     223: monitorexit
     224: aconst_null
     225: areturn
     226: aload_0
     227: ifnull        254
     230: new           #140                // class java/util/ArrayList
     233: dup
     234: invokespecial #206                // Method java/util/ArrayList."<init>":()V
     237: astore_3
     238: aload_3
     239: aload_0
     240: invokevirtual #205                // Method java/util/ArrayList.add:(Ljava/lang/Object;)Z
     243: pop
     244: getstatic     #59                 // Field d:Landroid/support/v4/g/m;
     247: aload         7
     249: aload_3
     250: invokevirtual #210                // Method android/support/v4/g/m.put:(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
     253: pop
     254: aload_2
     255: monitorexit
     256: getstatic     #50                 // Field b:Landroid/support/v4/f/c;
     259: aload_1
     260: new           #10                 // class android/support/v4/f/b$3
     263: dup
     264: aload         7
     266: invokespecial #211                // Method android/support/v4/f/b$3."<init>":(Ljava/lang/String;)V
     269: invokevirtual #214                // Method android/support/v4/f/c.a:(Ljava/util/concurrent/Callable;Landroid/support/v4/f/c$a;)V
     272: aconst_null
     273: areturn
     274: astore_0
     275: aload_2
     276: monitorexit
     277: aload_0
     278: athrow
     279: astore_0
     280: aconst_null
     281: areturn
    Exception table:
       from    to  target type
         148   164   279   Class java/lang/InterruptedException
         191   202   274   any
         206   222   274   any
         222   224   274   any
         230   254   274   any
         254   256   274   any
         275   277   274   any

  public static android.support.v4.f.b$a a(android.content.Context, android.os.CancellationSignal, android.support.v4.f.a);
    Code:
       0: aload_0
       1: invokevirtual #221                // Method android/content/Context.getPackageManager:()Landroid/content/pm/PackageManager;
       4: aload_2
       5: aload_0
       6: invokevirtual #225                // Method android/content/Context.getResources:()Landroid/content/res/Resources;
       9: invokestatic  #227                // Method a:(Landroid/content/pm/PackageManager;Landroid/support/v4/f/a;Landroid/content/res/Resources;)Landroid/content/pm/ProviderInfo;
      12: astore_3
      13: aload_3
      14: ifnonnull     27
      17: new           #14                 // class android/support/v4/f/b$a
      20: dup
      21: iconst_1
      22: aconst_null
      23: invokespecial #230                // Method android/support/v4/f/b$a."<init>":(I[Landroid/support/v4/f/b$b;)V
      26: areturn
      27: new           #14                 // class android/support/v4/f/b$a
      30: dup
      31: iconst_0
      32: aload_0
      33: aload_2
      34: aload_3
      35: getfield      #233                // Field android/content/pm/ProviderInfo.authority:Ljava/lang/String;
      38: aload_1
      39: invokestatic  #236                // Method a:(Landroid/content/Context;Landroid/support/v4/f/a;Ljava/lang/String;Landroid/os/CancellationSignal;)[Landroid/support/v4/f/b$b;
      42: invokespecial #230                // Method android/support/v4/f/b$a."<init>":(I[Landroid/support/v4/f/b$b;)V
      45: areturn

  static android.support.v4.f.b$c a(android.content.Context, android.support.v4.f.a, int);
    Code:
       0: aload_0
       1: aload_1
       2: iload_2
       3: invokestatic  #176                // Method b:(Landroid/content/Context;Landroid/support/v4/f/a;I)Landroid/support/v4/f/b$c;
       6: areturn

  static android.support.v4.g.g a();
    Code:
       0: getstatic     #41                 // Field a:Landroid/support/v4/g/g;
       3: areturn

  public static java.util.Map<android.net.Uri, java.nio.ByteBuffer> a(android.content.Context, android.support.v4.f.b$b[], android.os.CancellationSignal);
    Code:
       0: new           #260                // class java/util/HashMap
       3: dup
       4: invokespecial #261                // Method java/util/HashMap."<init>":()V
       7: astore        5
       9: aload_1
      10: arraylength
      11: istore        4
      13: iconst_0
      14: istore_3
      15: iload_3
      16: iload         4
      18: if_icmpge     79
      21: aload_1
      22: iload_3
      23: aaload
      24: astore        6
      26: aload         6
      28: invokevirtual #262                // Method android/support/v4/f/b$b.e:()I
      31: ifeq          37
      34: goto          72
      37: aload         6
      39: invokevirtual #265                // Method android/support/v4/f/b$b.a:()Landroid/net/Uri;
      42: astore        6
      44: aload         5
      46: aload         6
      48: invokevirtual #266                // Method java/util/HashMap.containsKey:(Ljava/lang/Object;)Z
      51: ifeq          57
      54: goto          72
      57: aload         5
      59: aload         6
      61: aload_0
      62: aload_2
      63: aload         6
      65: invokestatic  #271                // Method android/support/v4/b/h.a:(Landroid/content/Context;Landroid/os/CancellationSignal;Landroid/net/Uri;)Ljava/nio/ByteBuffer;
      68: invokevirtual #272                // Method java/util/HashMap.put:(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
      71: pop
      72: iload_3
      73: iconst_1
      74: iadd
      75: istore_3
      76: goto          15
      79: aload         5
      81: invokestatic  #276                // Method java/util/Collections.unmodifiableMap:(Ljava/util/Map;)Ljava/util/Map;
      84: areturn

  static android.support.v4.f.b$b[] a(android.content.Context, android.support.v4.f.a, java.lang.String, android.os.CancellationSignal);
    Code:
       0: new           #140                // class java/util/ArrayList
       3: dup
       4: invokespecial #206                // Method java/util/ArrayList."<init>":()V
       7: astore        14
       9: new           #287                // class android/net/Uri$Builder
      12: dup
      13: invokespecial #288                // Method android/net/Uri$Builder."<init>":()V
      16: ldc_w         #290                // String content
      19: invokevirtual #294                // Method android/net/Uri$Builder.scheme:(Ljava/lang/String;)Landroid/net/Uri$Builder;
      22: aload_2
      23: invokevirtual #296                // Method android/net/Uri$Builder.authority:(Ljava/lang/String;)Landroid/net/Uri$Builder;
      26: invokevirtual #299                // Method android/net/Uri$Builder.build:()Landroid/net/Uri;
      29: astore        16
      31: new           #287                // class android/net/Uri$Builder
      34: dup
      35: invokespecial #288                // Method android/net/Uri$Builder."<init>":()V
      38: ldc_w         #290                // String content
      41: invokevirtual #294                // Method android/net/Uri$Builder.scheme:(Ljava/lang/String;)Landroid/net/Uri$Builder;
      44: aload_2
      45: invokevirtual #296                // Method android/net/Uri$Builder.authority:(Ljava/lang/String;)Landroid/net/Uri$Builder;
      48: ldc_w         #301                // String file
      51: invokevirtual #304                // Method android/net/Uri$Builder.appendPath:(Ljava/lang/String;)Landroid/net/Uri$Builder;
      54: invokevirtual #299                // Method android/net/Uri$Builder.build:()Landroid/net/Uri;
      57: astore        17
      59: aconst_null
      60: astore        15
      62: aload         15
      64: astore_2
      65: getstatic     #309                // Field android/os/Build$VERSION.SDK_INT:I
      68: bipush        16
      70: if_icmple     163
      73: aload         15
      75: astore_2
      76: aload_0
      77: invokevirtual #313                // Method android/content/Context.getContentResolver:()Landroid/content/ContentResolver;
      80: astore_0
      81: aload         15
      83: astore_2
      84: aload_1
      85: invokevirtual #315                // Method android/support/v4/f/a.c:()Ljava/lang/String;
      88: astore_1
      89: aload         15
      91: astore_2
      92: aload_0
      93: aload         16
      95: bipush        7
      97: anewarray     #102                // class java/lang/String
     100: dup
     101: iconst_0
     102: ldc_w         #317                // String _id
     105: aastore
     106: dup
     107: iconst_1
     108: ldc_w         #319                // String file_id
     111: aastore
     112: dup
     113: iconst_2
     114: ldc_w         #321                // String font_ttc_index
     117: aastore
     118: dup
     119: iconst_3
     120: ldc_w         #323                // String font_variation_settings
     123: aastore
     124: dup
     125: iconst_4
     126: ldc_w         #325                // String font_weight
     129: aastore
     130: dup
     131: iconst_5
     132: ldc_w         #327                // String font_italic
     135: aastore
     136: dup
     137: bipush        6
     139: ldc_w         #329                // String result_code
     142: aastore
     143: ldc_w         #331                // String query = ?
     146: iconst_1
     147: anewarray     #102                // class java/lang/String
     150: dup
     151: iconst_0
     152: aload_1
     153: aastore
     154: aconst_null
     155: aload_3
     156: invokevirtual #337                // Method android/content/ContentResolver.query:(Landroid/net/Uri;[Ljava/lang/String;Ljava/lang/String;[Ljava/lang/String;Ljava/lang/String;Landroid/os/CancellationSignal;)Landroid/database/Cursor;
     159: astore_0
     160: goto          568
     163: aload         15
     165: astore_2
     166: aload_0
     167: invokevirtual #313                // Method android/content/Context.getContentResolver:()Landroid/content/ContentResolver;
     170: astore_0
     171: aload         15
     173: astore_2
     174: aload_1
     175: invokevirtual #315                // Method android/support/v4/f/a.c:()Ljava/lang/String;
     178: astore_1
     179: aload         15
     181: astore_2
     182: aload_0
     183: aload         16
     185: bipush        7
     187: anewarray     #102                // class java/lang/String
     190: dup
     191: iconst_0
     192: ldc_w         #317                // String _id
     195: aastore
     196: dup
     197: iconst_1
     198: ldc_w         #319                // String file_id
     201: aastore
     202: dup
     203: iconst_2
     204: ldc_w         #321                // String font_ttc_index
     207: aastore
     208: dup
     209: iconst_3
     210: ldc_w         #323                // String font_variation_settings
     213: aastore
     214: dup
     215: iconst_4
     216: ldc_w         #325                // String font_weight
     219: aastore
     220: dup
     221: iconst_5
     222: ldc_w         #327                // String font_italic
     225: aastore
     226: dup
     227: bipush        6
     229: ldc_w         #329                // String result_code
     232: aastore
     233: ldc_w         #331                // String query = ?
     236: iconst_1
     237: anewarray     #102                // class java/lang/String
     240: dup
     241: iconst_0
     242: aload_1
     243: aastore
     244: aconst_null
     245: invokevirtual #340                // Method android/content/ContentResolver.query:(Landroid/net/Uri;[Ljava/lang/String;Ljava/lang/String;[Ljava/lang/String;Ljava/lang/String;)Landroid/database/Cursor;
     248: astore_0
     249: goto          568
     252: aload         14
     254: astore_1
     255: aload_0
     256: ifnull        533
     259: aload         14
     261: astore_1
     262: aload_0
     263: astore_2
     264: aload_0
     265: invokeinterface #345,  1          // InterfaceMethod android/database/Cursor.getCount:()I
     270: ifle          533
     273: aload_0
     274: astore_2
     275: aload_0
     276: ldc_w         #329                // String result_code
     279: invokeinterface #349,  2          // InterfaceMethod android/database/Cursor.getColumnIndex:(Ljava/lang/String;)I
     284: istore        7
     286: aload_0
     287: astore_2
     288: new           #140                // class java/util/ArrayList
     291: dup
     292: invokespecial #206                // Method java/util/ArrayList."<init>":()V
     295: astore_3
     296: aload_0
     297: astore_2
     298: aload_0
     299: ldc_w         #317                // String _id
     302: invokeinterface #349,  2          // InterfaceMethod android/database/Cursor.getColumnIndex:(Ljava/lang/String;)I
     307: istore        8
     309: aload_0
     310: astore_2
     311: aload_0
     312: ldc_w         #319                // String file_id
     315: invokeinterface #349,  2          // InterfaceMethod android/database/Cursor.getColumnIndex:(Ljava/lang/String;)I
     320: istore        9
     322: aload_0
     323: astore_2
     324: aload_0
     325: ldc_w         #321                // String font_ttc_index
     328: invokeinterface #349,  2          // InterfaceMethod android/database/Cursor.getColumnIndex:(Ljava/lang/String;)I
     333: istore        10
     335: aload_0
     336: astore_2
     337: aload_0
     338: ldc_w         #325                // String font_weight
     341: invokeinterface #349,  2          // InterfaceMethod android/database/Cursor.getColumnIndex:(Ljava/lang/String;)I
     346: istore        11
     348: aload_0
     349: astore_2
     350: aload_0
     351: ldc_w         #327                // String font_italic
     354: invokeinterface #349,  2          // InterfaceMethod android/database/Cursor.getColumnIndex:(Ljava/lang/String;)I
     359: istore        12
     361: aload_0
     362: astore_2
     363: aload_0
     364: invokeinterface #353,  1          // InterfaceMethod android/database/Cursor.moveToNext:()Z
     369: ifeq          531
     372: iload         7
     374: iconst_m1
     375: if_icmpeq     571
     378: aload_0
     379: astore_2
     380: aload_0
     381: iload         7
     383: invokeinterface #357,  2          // InterfaceMethod android/database/Cursor.getInt:(I)I
     388: istore        4
     390: goto          393
     393: iload         10
     395: iconst_m1
     396: if_icmpeq     577
     399: aload_0
     400: astore_2
     401: aload_0
     402: iload         10
     404: invokeinterface #357,  2          // InterfaceMethod android/database/Cursor.getInt:(I)I
     409: istore        5
     411: goto          414
     414: iload         9
     416: iconst_m1
     417: if_icmpne     439
     420: aload_0
     421: astore_2
     422: aload         16
     424: aload_0
     425: iload         8
     427: invokeinterface #361,  2          // InterfaceMethod android/database/Cursor.getLong:(I)J
     432: invokestatic  #367                // Method android/content/ContentUris.withAppendedId:(Landroid/net/Uri;J)Landroid/net/Uri;
     435: astore_1
     436: goto          583
     439: aload_0
     440: astore_2
     441: aload         17
     443: aload_0
     444: iload         9
     446: invokeinterface #361,  2          // InterfaceMethod android/database/Cursor.getLong:(I)J
     451: invokestatic  #367                // Method android/content/ContentUris.withAppendedId:(Landroid/net/Uri;J)Landroid/net/Uri;
     454: astore_1
     455: goto          583
     458: iload         11
     460: iconst_m1
     461: if_icmpeq     586
     464: aload_0
     465: astore_2
     466: aload_0
     467: iload         11
     469: invokeinterface #357,  2          // InterfaceMethod android/database/Cursor.getInt:(I)I
     474: istore        6
     476: goto          479
     479: iload         12
     481: iconst_m1
     482: if_icmpeq     594
     485: aload_0
     486: astore_2
     487: aload_0
     488: iload         12
     490: invokeinterface #357,  2          // InterfaceMethod android/database/Cursor.getInt:(I)I
     495: iconst_1
     496: if_icmpne     594
     499: iconst_1
     500: istore        13
     502: goto          505
     505: aload_0
     506: astore_2
     507: aload_3
     508: new           #17                 // class android/support/v4/f/b$b
     511: dup
     512: aload_1
     513: iload         5
     515: iload         6
     517: iload         13
     519: iload         4
     521: invokespecial #370                // Method android/support/v4/f/b$b."<init>":(Landroid/net/Uri;IIZI)V
     524: invokevirtual #205                // Method java/util/ArrayList.add:(Ljava/lang/Object;)Z
     527: pop
     528: goto          361
     531: aload_3
     532: astore_1
     533: aload_0
     534: ifnull        543
     537: aload_0
     538: invokeinterface #373,  1          // InterfaceMethod android/database/Cursor.close:()V
     543: aload_1
     544: iconst_0
     545: anewarray     #17                 // class android/support/v4/f/b$b
     548: invokevirtual #377                // Method java/util/ArrayList.toArray:([Ljava/lang/Object;)[Ljava/lang/Object;
     551: checkcast     #379                // class "[Landroid/support/v4/f/b$b;"
     554: areturn
     555: astore_0
     556: aload_2
     557: ifnull        566
     560: aload_2
     561: invokeinterface #373,  1          // InterfaceMethod android/database/Cursor.close:()V
     566: aload_0
     567: athrow
     568: goto          252
     571: iconst_0
     572: istore        4
     574: goto          393
     577: iconst_0
     578: istore        5
     580: goto          414
     583: goto          458
     586: sipush        400
     589: istore        6
     591: goto          479
     594: iconst_0
     595: istore        13
     597: goto          505
    Exception table:
       from    to  target type
          65    73   555   any
          76    81   555   any
          84    89   555   any
          92   160   555   any
         166   171   555   any
         174   179   555   any
         182   249   555   any
         264   273   555   any
         275   286   555   any
         288   296   555   any
         298   309   555   any
         311   322   555   any
         324   335   555   any
         337   348   555   any
         350   361   555   any
         363   372   555   any
         380   390   555   any
         401   411   555   any
         422   436   555   any
         441   455   555   any
         466   476   555   any
         487   499   555   any
         507   528   555   any

  static java.lang.Object b();
    Code:
       0: getstatic     #54                 // Field c:Ljava/lang/Object;
       3: areturn

  static android.support.v4.g.m c();
    Code:
       0: getstatic     #59                 // Field d:Landroid/support/v4/g/m;
       3: areturn
}
