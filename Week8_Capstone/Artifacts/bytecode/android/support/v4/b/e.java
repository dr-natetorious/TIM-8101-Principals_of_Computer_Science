class android.support.v4.b.e extends android.support.v4.b.g {
  static {};
    Code:
       0: aconst_null
       1: astore        4
       3: ldc           #19                 // String android.graphics.FontFamily
       5: invokestatic  #25                 // Method java/lang/Class.forName:(Ljava/lang/String;)Ljava/lang/Class;
       8: astore_1
       9: aload_1
      10: iconst_0
      11: anewarray     #21                 // class java/lang/Class
      14: invokevirtual #29                 // Method java/lang/Class.getConstructor:([Ljava/lang/Class;)Ljava/lang/reflect/Constructor;
      17: astore_0
      18: aload_1
      19: ldc           #31                 // String addFontWeightStyle
      21: iconst_5
      22: anewarray     #21                 // class java/lang/Class
      25: dup
      26: iconst_0
      27: ldc           #33                 // class java/nio/ByteBuffer
      29: aastore
      30: dup
      31: iconst_1
      32: getstatic     #38                 // Field java/lang/Integer.TYPE:Ljava/lang/Class;
      35: aastore
      36: dup
      37: iconst_2
      38: ldc           #40                 // class java/util/List
      40: aastore
      41: dup
      42: iconst_3
      43: getstatic     #38                 // Field java/lang/Integer.TYPE:Ljava/lang/Class;
      46: aastore
      47: dup
      48: iconst_4
      49: getstatic     #43                 // Field java/lang/Boolean.TYPE:Ljava/lang/Class;
      52: aastore
      53: invokevirtual #47                 // Method java/lang/Class.getMethod:(Ljava/lang/String;[Ljava/lang/Class;)Ljava/lang/reflect/Method;
      56: astore_3
      57: ldc           #49                 // class android/graphics/Typeface
      59: ldc           #51                 // String createFromFamiliesWithDefault
      61: iconst_1
      62: anewarray     #21                 // class java/lang/Class
      65: dup
      66: iconst_0
      67: aload_1
      68: iconst_1
      69: invokestatic  #57                 // Method java/lang/reflect/Array.newInstance:(Ljava/lang/Class;I)Ljava/lang/Object;
      72: invokevirtual #63                 // Method java/lang/Object.getClass:()Ljava/lang/Class;
      75: aastore
      76: invokevirtual #47                 // Method java/lang/Class.getMethod:(Ljava/lang/String;[Ljava/lang/Class;)Ljava/lang/reflect/Method;
      79: astore_2
      80: goto          109
      83: astore_0
      84: ldc           #65                 // String TypefaceCompatApi24Impl
      86: aload_0
      87: invokevirtual #63                 // Method java/lang/Object.getClass:()Ljava/lang/Class;
      90: invokevirtual #69                 // Method java/lang/Class.getName:()Ljava/lang/String;
      93: aload_0
      94: invokestatic  #75                 // Method android/util/Log.e:(Ljava/lang/String;Ljava/lang/String;Ljava/lang/Throwable;)I
      97: pop
      98: aconst_null
      99: astore_1
     100: aload_1
     101: astore_0
     102: aload_0
     103: astore_3
     104: aload_0
     105: astore_2
     106: aload         4
     108: astore_0
     109: aload_0
     110: putstatic     #77                 // Field b:Ljava/lang/reflect/Constructor;
     113: aload_1
     114: putstatic     #79                 // Field a:Ljava/lang/Class;
     117: aload_3
     118: putstatic     #81                 // Field c:Ljava/lang/reflect/Method;
     121: aload_2
     122: putstatic     #83                 // Field d:Ljava/lang/reflect/Method;
     125: return
    Exception table:
       from    to  target type
           3    80    83   Class java/lang/ClassNotFoundException
           3    80    83   Class java/lang/NoSuchMethodException

  android.support.v4.b.e();
    Code:
       0: aload_0
       1: invokespecial #87                 // Method android/support/v4/b/g."<init>":()V
       4: return

  public static boolean a();
    Code:
       0: getstatic     #81                 // Field c:Ljava/lang/reflect/Method;
       3: ifnonnull     14
       6: ldc           #65                 // String TypefaceCompatApi24Impl
       8: ldc           #110                // String Unable to collect necessary private methods.Fallback to legacy implementation.
      10: invokestatic  #114                // Method android/util/Log.w:(Ljava/lang/String;Ljava/lang/String;)I
      13: pop
      14: getstatic     #81                 // Field c:Ljava/lang/reflect/Method;
      17: ifnull        22
      20: iconst_1
      21: ireturn
      22: iconst_0
      23: ireturn

  public android.graphics.Typeface a(android.content.Context, android.os.CancellationSignal, android.support.v4.f.b$b[], int);
    Code:
       0: invokestatic  #136                // Method b:()Ljava/lang/Object;
       3: astore        9
       5: new           #138                // class android/support/v4/g/m
       8: dup
       9: invokespecial #139                // Method android/support/v4/g/m."<init>":()V
      12: astore        10
      14: aload_3
      15: arraylength
      16: istore        6
      18: iconst_0
      19: istore        5
      21: iload         5
      23: iload         6
      25: if_icmpge     117
      28: aload_3
      29: iload         5
      31: aaload
      32: astore        11
      34: aload         11
      36: invokevirtual #144                // Method android/support/v4/f/b$b.a:()Landroid/net/Uri;
      39: astore        12
      41: aload         10
      43: aload         12
      45: invokevirtual #148                // Method android/support/v4/g/m.get:(Ljava/lang/Object;)Ljava/lang/Object;
      48: checkcast     #33                 // class java/nio/ByteBuffer
      51: astore        8
      53: aload         8
      55: astore        7
      57: aload         8
      59: ifnonnull     81
      62: aload_1
      63: aload_2
      64: aload         12
      66: invokestatic  #153                // Method android/support/v4/b/h.a:(Landroid/content/Context;Landroid/os/CancellationSignal;Landroid/net/Uri;)Ljava/nio/ByteBuffer;
      69: astore        7
      71: aload         10
      73: aload         12
      75: aload         7
      77: invokevirtual #157                // Method android/support/v4/g/m.put:(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
      80: pop
      81: aload         9
      83: aload         7
      85: aload         11
      87: invokevirtual #160                // Method android/support/v4/f/b$b.b:()I
      90: aload         11
      92: invokevirtual #162                // Method android/support/v4/f/b$b.c:()I
      95: aload         11
      97: invokevirtual #164                // Method android/support/v4/f/b$b.d:()Z
     100: invokestatic  #166                // Method a:(Ljava/lang/Object;Ljava/nio/ByteBuffer;IIZ)Z
     103: ifne          108
     106: aconst_null
     107: areturn
     108: iload         5
     110: iconst_1
     111: iadd
     112: istore        5
     114: goto          21
     117: aload         9
     119: invokestatic  #168                // Method a:(Ljava/lang/Object;)Landroid/graphics/Typeface;
     122: iload         4
     124: invokestatic  #172                // Method android/graphics/Typeface.create:(Landroid/graphics/Typeface;I)Landroid/graphics/Typeface;
     127: areturn

  public android.graphics.Typeface a(android.content.Context, android.support.v4.a.a.a$b, android.content.res.Resources, int);
    Code:
       0: invokestatic  #136                // Method b:()Ljava/lang/Object;
       3: astore        6
       5: aload_2
       6: invokevirtual #178                // Method android/support/v4/a/a/a$b.a:()[Landroid/support/v4/a/a/a$c;
       9: astore_2
      10: aload_2
      11: arraylength
      12: istore        5
      14: iconst_0
      15: istore        4
      17: iload         4
      19: iload         5
      21: if_icmpge     81
      24: aload_2
      25: iload         4
      27: aaload
      28: astore        7
      30: aload_1
      31: aload_3
      32: aload         7
      34: invokevirtual #182                // Method android/support/v4/a/a/a$c.d:()I
      37: invokestatic  #185                // Method android/support/v4/b/h.a:(Landroid/content/Context;Landroid/content/res/Resources;I)Ljava/nio/ByteBuffer;
      40: astore        8
      42: aload         8
      44: ifnonnull     49
      47: aconst_null
      48: areturn
      49: aload         6
      51: aload         8
      53: iconst_0
      54: aload         7
      56: invokevirtual #186                // Method android/support/v4/a/a/a$c.b:()I
      59: aload         7
      61: invokevirtual #188                // Method android/support/v4/a/a/a$c.c:()Z
      64: invokestatic  #166                // Method a:(Ljava/lang/Object;Ljava/nio/ByteBuffer;IIZ)Z
      67: ifne          72
      70: aconst_null
      71: areturn
      72: iload         4
      74: iconst_1
      75: iadd
      76: istore        4
      78: goto          17
      81: aload         6
      83: invokestatic  #168                // Method a:(Ljava/lang/Object;)Landroid/graphics/Typeface;
      86: areturn
}
