public class android.support.v4.b.f extends android.support.v4.b.d {
  static {};
    Code:
       0: aconst_null
       1: astore        8
       3: ldc           #22                 // String android.graphics.FontFamily
       5: invokestatic  #28                 // Method java/lang/Class.forName:(Ljava/lang/String;)Ljava/lang/Class;
       8: astore_1
       9: aload_1
      10: iconst_0
      11: anewarray     #24                 // class java/lang/Class
      14: invokevirtual #32                 // Method java/lang/Class.getConstructor:([Ljava/lang/Class;)Ljava/lang/reflect/Constructor;
      17: astore_0
      18: aload_1
      19: ldc           #34                 // String addFontFromAssetManager
      21: bipush        8
      23: anewarray     #24                 // class java/lang/Class
      26: dup
      27: iconst_0
      28: ldc           #36                 // class android/content/res/AssetManager
      30: aastore
      31: dup
      32: iconst_1
      33: ldc           #38                 // class java/lang/String
      35: aastore
      36: dup
      37: iconst_2
      38: getstatic     #43                 // Field java/lang/Integer.TYPE:Ljava/lang/Class;
      41: aastore
      42: dup
      43: iconst_3
      44: getstatic     #46                 // Field java/lang/Boolean.TYPE:Ljava/lang/Class;
      47: aastore
      48: dup
      49: iconst_4
      50: getstatic     #43                 // Field java/lang/Integer.TYPE:Ljava/lang/Class;
      53: aastore
      54: dup
      55: iconst_5
      56: getstatic     #43                 // Field java/lang/Integer.TYPE:Ljava/lang/Class;
      59: aastore
      60: dup
      61: bipush        6
      63: getstatic     #43                 // Field java/lang/Integer.TYPE:Ljava/lang/Class;
      66: aastore
      67: dup
      68: bipush        7
      70: ldc           #48                 // class "[Landroid/graphics/fonts/FontVariationAxis;"
      72: aastore
      73: invokevirtual #52                 // Method java/lang/Class.getMethod:(Ljava/lang/String;[Ljava/lang/Class;)Ljava/lang/reflect/Method;
      76: astore_3
      77: aload_1
      78: ldc           #54                 // String addFontFromBuffer
      80: iconst_5
      81: anewarray     #24                 // class java/lang/Class
      84: dup
      85: iconst_0
      86: ldc           #56                 // class java/nio/ByteBuffer
      88: aastore
      89: dup
      90: iconst_1
      91: getstatic     #43                 // Field java/lang/Integer.TYPE:Ljava/lang/Class;
      94: aastore
      95: dup
      96: iconst_2
      97: ldc           #48                 // class "[Landroid/graphics/fonts/FontVariationAxis;"
      99: aastore
     100: dup
     101: iconst_3
     102: getstatic     #43                 // Field java/lang/Integer.TYPE:Ljava/lang/Class;
     105: aastore
     106: dup
     107: iconst_4
     108: getstatic     #43                 // Field java/lang/Integer.TYPE:Ljava/lang/Class;
     111: aastore
     112: invokevirtual #52                 // Method java/lang/Class.getMethod:(Ljava/lang/String;[Ljava/lang/Class;)Ljava/lang/reflect/Method;
     115: astore        4
     117: aload_1
     118: ldc           #58                 // String freeze
     120: iconst_0
     121: anewarray     #24                 // class java/lang/Class
     124: invokevirtual #52                 // Method java/lang/Class.getMethod:(Ljava/lang/String;[Ljava/lang/Class;)Ljava/lang/reflect/Method;
     127: astore        5
     129: aload_1
     130: ldc           #60                 // String abortCreation
     132: iconst_0
     133: anewarray     #24                 // class java/lang/Class
     136: invokevirtual #52                 // Method java/lang/Class.getMethod:(Ljava/lang/String;[Ljava/lang/Class;)Ljava/lang/reflect/Method;
     139: astore        6
     141: ldc           #62                 // class android/graphics/Typeface
     143: ldc           #64                 // String createFromFamiliesWithDefault
     145: iconst_3
     146: anewarray     #24                 // class java/lang/Class
     149: dup
     150: iconst_0
     151: aload_1
     152: iconst_1
     153: invokestatic  #70                 // Method java/lang/reflect/Array.newInstance:(Ljava/lang/Class;I)Ljava/lang/Object;
     156: invokevirtual #76                 // Method java/lang/Object.getClass:()Ljava/lang/Class;
     159: aastore
     160: dup
     161: iconst_1
     162: getstatic     #43                 // Field java/lang/Integer.TYPE:Ljava/lang/Class;
     165: aastore
     166: dup
     167: iconst_2
     168: getstatic     #43                 // Field java/lang/Integer.TYPE:Ljava/lang/Class;
     171: aastore
     172: invokevirtual #79                 // Method java/lang/Class.getDeclaredMethod:(Ljava/lang/String;[Ljava/lang/Class;)Ljava/lang/reflect/Method;
     175: astore_2
     176: aload_2
     177: iconst_1
     178: invokevirtual #85                 // Method java/lang/reflect/Method.setAccessible:(Z)V
     181: goto          254
     184: astore_0
     185: new           #87                 // class java/lang/StringBuilder
     188: dup
     189: invokespecial #90                 // Method java/lang/StringBuilder."<init>":()V
     192: astore_1
     193: aload_1
     194: ldc           #92                 // String Unable to collect necessary methods for class
     196: invokevirtual #96                 // Method java/lang/StringBuilder.append:(Ljava/lang/String;)Ljava/lang/StringBuilder;
     199: pop
     200: aload_1
     201: aload_0
     202: invokevirtual #76                 // Method java/lang/Object.getClass:()Ljava/lang/Class;
     205: invokevirtual #100                // Method java/lang/Class.getName:()Ljava/lang/String;
     208: invokevirtual #96                 // Method java/lang/StringBuilder.append:(Ljava/lang/String;)Ljava/lang/StringBuilder;
     211: pop
     212: ldc           #102                // String TypefaceCompatApi26Impl
     214: aload_1
     215: invokevirtual #105                // Method java/lang/StringBuilder.toString:()Ljava/lang/String;
     218: aload_0
     219: invokestatic  #110                // Method android/util/Log.e:(Ljava/lang/String;Ljava/lang/String;Ljava/lang/Throwable;)I
     222: pop
     223: aconst_null
     224: astore        7
     226: aload         7
     228: astore_0
     229: aload_0
     230: astore_1
     231: aload_1
     232: astore_2
     233: aload_2
     234: astore_3
     235: aload_3
     236: astore        6
     238: aload_3
     239: astore        5
     241: aload_2
     242: astore        4
     244: aload_1
     245: astore_3
     246: aload_0
     247: astore_2
     248: aload         7
     250: astore_1
     251: aload         8
     253: astore_0
     254: aload_0
     255: putstatic     #112                // Field b:Ljava/lang/reflect/Constructor;
     258: aload_1
     259: putstatic     #114                // Field a:Ljava/lang/Class;
     262: aload_3
     263: putstatic     #116                // Field c:Ljava/lang/reflect/Method;
     266: aload         4
     268: putstatic     #118                // Field d:Ljava/lang/reflect/Method;
     271: aload         5
     273: putstatic     #120                // Field e:Ljava/lang/reflect/Method;
     276: aload         6
     278: putstatic     #122                // Field f:Ljava/lang/reflect/Method;
     281: aload_2
     282: putstatic     #124                // Field g:Ljava/lang/reflect/Method;
     285: return
    Exception table:
       from    to  target type
           3   181   184   Class java/lang/ClassNotFoundException
           3   181   184   Class java/lang/NoSuchMethodException

  public android.support.v4.b.f();
    Code:
       0: aload_0
       1: invokespecial #126                // Method android/support/v4/b/d."<init>":()V
       4: return

  public android.graphics.Typeface a(android.content.Context, android.content.res.Resources, int, java.lang.String, int);
    Code:
       0: invokestatic  #182                // Method a:()Z
       3: ifne          18
       6: aload_0
       7: aload_1
       8: aload_2
       9: iload_3
      10: aload         4
      12: iload         5
      14: invokespecial #184                // Method android/support/v4/b/d.a:(Landroid/content/Context;Landroid/content/res/Resources;ILjava/lang/String;I)Landroid/graphics/Typeface;
      17: areturn
      18: invokestatic  #186                // Method b:()Ljava/lang/Object;
      21: astore_2
      22: aload_1
      23: aload_2
      24: aload         4
      26: iconst_0
      27: iconst_m1
      28: iconst_m1
      29: invokestatic  #188                // Method a:(Landroid/content/Context;Ljava/lang/Object;Ljava/lang/String;III)Z
      32: ifne          41
      35: aload_2
      36: invokestatic  #190                // Method c:(Ljava/lang/Object;)V
      39: aconst_null
      40: areturn
      41: aload_2
      42: invokestatic  #192                // Method b:(Ljava/lang/Object;)Z
      45: ifne          50
      48: aconst_null
      49: areturn
      50: aload_2
      51: invokestatic  #194                // Method a:(Ljava/lang/Object;)Landroid/graphics/Typeface;
      54: areturn

  public android.graphics.Typeface a(android.content.Context, android.os.CancellationSignal, android.support.v4.f.b$b[], int);
    Code:
       0: new           #145                // class java/lang/RuntimeException
       3: dup
       4: ldc           #197                // String d2j fail translate: java.lang.RuntimeException: can not merge I and Z\n\tat com.googlecode.dex2jar.ir.TypeClass.merge(TypeClass.java:100)\n\tat com.googlecode.dex2jar.ir.ts.TypeTransformer$TypeRef.updateTypeClass(TypeTransformer.java:174)\n\tat com.googlecode.dex2jar.ir.ts.TypeTransformer$TypeAnalyze.provideAs(TypeTransformer.java:780)\n\tat com.googlecode.dex2jar.ir.ts.TypeTransformer$TypeAnalyze.enexpr(TypeTransformer.java:659)\n\tat com.googlecode.dex2jar.ir.ts.TypeTransformer$TypeAnalyze.exExpr(TypeTransformer.java:719)\n\tat com.googlecode.dex2jar.ir.ts.TypeTransformer$TypeAnalyze.exExpr(TypeTransformer.java:703)\n\tat com.googlecode.dex2jar.ir.ts.TypeTransformer$TypeAnalyze.enexpr(TypeTransformer.java:698)\n\tat com.googlecode.dex2jar.ir.ts.TypeTransformer$TypeAnalyze.exExpr(TypeTransformer.java:719)\n\tat com.googlecode.dex2jar.ir.ts.TypeTransformer$TypeAnalyze.exExpr(TypeTransformer.java:703)\n\tat com.googlecode.dex2jar.ir.ts.TypeTransformer$TypeAnalyze.e2expr(TypeTransformer.java:629)\n\tat com.googlecode.dex2jar.ir.ts.TypeTransformer$TypeAnalyze.exExpr(TypeTransformer.java:716)\n\tat com.googlecode.dex2jar.ir.ts.TypeTransformer$TypeAnalyze.exExpr(TypeTransformer.java:703)\n\tat com.googlecode.dex2jar.ir.ts.TypeTransformer$TypeAnalyze.s1stmt(TypeTransformer.java:810)\n\tat com.googlecode.dex2jar.ir.ts.TypeTransformer$TypeAnalyze.sxStmt(TypeTransformer.java:840)\n\tat com.googlecode.dex2jar.ir.ts.TypeTransformer$TypeAnalyze.analyze(TypeTransformer.java:206)\n\tat com.googlecode.dex2jar.ir.ts.TypeTransformer.transform(TypeTransformer.java:44)\n\tat com.googlecode.d2j.dex.Dex2jar$2.optimize(Dex2jar.java:162)\n\tat com.googlecode.d2j.dex.Dex2Asm.convertCode(Dex2Asm.java:414)\n\tat com.googlecode.d2j.dex.ExDex2Asm.convertCode(ExDex2Asm.java:42)\n\tat com.googlecode.d2j.dex.Dex2jar$2.convertCode(Dex2jar.java:128)\n\tat com.googlecode.d2j.dex.Dex2Asm.convertMethod(Dex2Asm.java:509)\n\tat com.googlecode.d2j.dex.Dex2Asm.convertClass(Dex2Asm.java:406)\n\tat com.googlecode.d2j.dex.Dex2Asm.convertDex(Dex2Asm.java:422)\n\tat com.googlecode.d2j.dex.Dex2jar.doTranslate(Dex2jar.java:172)\n\tat com.googlecode.d2j.dex.Dex2jar.to(Dex2jar.java:272)\n\tat com.googlecode.dex2jar.tools.Dex2jarCmd.doCommandLine(Dex2jarCmd.java:108)\n\tat com.googlecode.dex2jar.tools.BaseCmd.doMain(BaseCmd.java:288)\n\tat com.googlecode.dex2jar.tools.Dex2jarCmd.main(Dex2jarCmd.java:32)\n
       6: invokespecial #202                // Method java/lang/Runtime."<init>":(Ljava/lang/String;)V
       9: athrow

  public android.graphics.Typeface a(android.content.Context, android.support.v4.a.a.a$b, android.content.res.Resources, int);
    Code:
       0: new           #145                // class java/lang/RuntimeException
       3: dup
       4: ldc           #197                // String d2j fail translate: java.lang.RuntimeException: can not merge I and Z\n\tat com.googlecode.dex2jar.ir.TypeClass.merge(TypeClass.java:100)\n\tat com.googlecode.dex2jar.ir.ts.TypeTransformer$TypeRef.updateTypeClass(TypeTransformer.java:174)\n\tat com.googlecode.dex2jar.ir.ts.TypeTransformer$TypeAnalyze.provideAs(TypeTransformer.java:780)\n\tat com.googlecode.dex2jar.ir.ts.TypeTransformer$TypeAnalyze.enexpr(TypeTransformer.java:659)\n\tat com.googlecode.dex2jar.ir.ts.TypeTransformer$TypeAnalyze.exExpr(TypeTransformer.java:719)\n\tat com.googlecode.dex2jar.ir.ts.TypeTransformer$TypeAnalyze.exExpr(TypeTransformer.java:703)\n\tat com.googlecode.dex2jar.ir.ts.TypeTransformer$TypeAnalyze.enexpr(TypeTransformer.java:698)\n\tat com.googlecode.dex2jar.ir.ts.TypeTransformer$TypeAnalyze.exExpr(TypeTransformer.java:719)\n\tat com.googlecode.dex2jar.ir.ts.TypeTransformer$TypeAnalyze.exExpr(TypeTransformer.java:703)\n\tat com.googlecode.dex2jar.ir.ts.TypeTransformer$TypeAnalyze.e2expr(TypeTransformer.java:629)\n\tat com.googlecode.dex2jar.ir.ts.TypeTransformer$TypeAnalyze.exExpr(TypeTransformer.java:716)\n\tat com.googlecode.dex2jar.ir.ts.TypeTransformer$TypeAnalyze.exExpr(TypeTransformer.java:703)\n\tat com.googlecode.dex2jar.ir.ts.TypeTransformer$TypeAnalyze.s1stmt(TypeTransformer.java:810)\n\tat com.googlecode.dex2jar.ir.ts.TypeTransformer$TypeAnalyze.sxStmt(TypeTransformer.java:840)\n\tat com.googlecode.dex2jar.ir.ts.TypeTransformer$TypeAnalyze.analyze(TypeTransformer.java:206)\n\tat com.googlecode.dex2jar.ir.ts.TypeTransformer.transform(TypeTransformer.java:44)\n\tat com.googlecode.d2j.dex.Dex2jar$2.optimize(Dex2jar.java:162)\n\tat com.googlecode.d2j.dex.Dex2Asm.convertCode(Dex2Asm.java:414)\n\tat com.googlecode.d2j.dex.ExDex2Asm.convertCode(ExDex2Asm.java:42)\n\tat com.googlecode.d2j.dex.Dex2jar$2.convertCode(Dex2jar.java:128)\n\tat com.googlecode.d2j.dex.Dex2Asm.convertMethod(Dex2Asm.java:509)\n\tat com.googlecode.d2j.dex.Dex2Asm.convertClass(Dex2Asm.java:406)\n\tat com.googlecode.d2j.dex.Dex2Asm.convertDex(Dex2Asm.java:422)\n\tat com.googlecode.d2j.dex.Dex2jar.doTranslate(Dex2jar.java:172)\n\tat com.googlecode.d2j.dex.Dex2jar.to(Dex2jar.java:272)\n\tat com.googlecode.dex2jar.tools.Dex2jarCmd.doCommandLine(Dex2jarCmd.java:108)\n\tat com.googlecode.dex2jar.tools.BaseCmd.doMain(BaseCmd.java:288)\n\tat com.googlecode.dex2jar.tools.Dex2jarCmd.main(Dex2jarCmd.java:32)\n
       6: invokespecial #202                // Method java/lang/Runtime."<init>":(Ljava/lang/String;)V
       9: athrow
}
