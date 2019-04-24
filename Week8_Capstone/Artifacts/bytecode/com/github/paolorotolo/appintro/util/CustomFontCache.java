public class com.github.paolorotolo.appintro.util.CustomFontCache {
  static {};
    Code:
       0: ldc           #2                  // class com/github/paolorotolo/appintro/util/CustomFontCache
       2: invokestatic  #17                 // Method com/github/paolorotolo/appintro/util/LogHelper.makeLogTag:(Ljava/lang/Class;)Ljava/lang/String;
       5: putstatic     #19                 // Field TAG:Ljava/lang/String;
       8: new           #21                 // class java/util/Hashtable
      11: dup
      12: invokespecial #24                 // Method java/util/Hashtable."<init>":()V
      15: putstatic     #26                 // Field fCache:Ljava/util/Hashtable;
      18: return

  public com.github.paolorotolo.appintro.util.CustomFontCache();
    Code:
       0: aload_0
       1: invokespecial #28                 // Method java/lang/Object."<init>":()V
       4: return

  public static android.graphics.Typeface get(java.lang.String, android.content.Context);
    Code:
       0: getstatic     #26                 // Field fCache:Ljava/util/Hashtable;
       3: aload_0
       4: invokevirtual #35                 // Method java/util/Hashtable.get:(Ljava/lang/Object;)Ljava/lang/Object;
       7: checkcast     #37                 // class android/graphics/Typeface
      10: astore_2
      11: aload_2
      12: ifnonnull     85
      15: aload_1
      16: invokevirtual #43                 // Method android/content/Context.getAssets:()Landroid/content/res/AssetManager;
      19: aload_0
      20: invokestatic  #47                 // Method android/graphics/Typeface.createFromAsset:(Landroid/content/res/AssetManager;Ljava/lang/String;)Landroid/graphics/Typeface;
      23: astore_1
      24: aload_1
      25: ifnull        37
      28: getstatic     #26                 // Field fCache:Ljava/util/Hashtable;
      31: aload_0
      32: aload_1
      33: invokevirtual #51                 // Method java/util/Hashtable.put:(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
      36: pop
      37: aload_1
      38: areturn
      39: astore_1
      40: ldc           #53                 // String
      42: aload_0
      43: invokevirtual #59                 // Method java/lang/String.equals:(Ljava/lang/Object;)Z
      46: ifeq          68
      49: getstatic     #19                 // Field TAG:Ljava/lang/String;
      52: aload_1
      53: iconst_1
      54: anewarray     #4                  // class java/lang/Object
      57: dup
      58: iconst_0
      59: ldc           #61                 // String Empty path
      61: aastore
      62: invokestatic  #65                 // Method com/github/paolorotolo/appintro/util/LogHelper.w:(Ljava/lang/String;Ljava/lang/Throwable;[Ljava/lang/Object;)V
      65: goto          83
      68: getstatic     #19                 // Field TAG:Ljava/lang/String;
      71: aload_1
      72: iconst_1
      73: anewarray     #4                  // class java/lang/Object
      76: dup
      77: iconst_0
      78: aload_0
      79: aastore
      80: invokestatic  #65                 // Method com/github/paolorotolo/appintro/util/LogHelper.w:(Ljava/lang/String;Ljava/lang/Throwable;[Ljava/lang/Object;)V
      83: aconst_null
      84: areturn
      85: aload_2
      86: areturn
    Exception table:
       from    to  target type
          15    24    39   Class java/lang/Exception
          28    37    39   Class java/lang/Exception
}
