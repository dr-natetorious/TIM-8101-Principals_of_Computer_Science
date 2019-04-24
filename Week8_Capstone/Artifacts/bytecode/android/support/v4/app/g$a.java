class android.support.v4.app.g$a {
  public static android.os.IBinder a(android.os.Bundle, java.lang.String);
    Code:
       0: getstatic     #21                 // Field b:Z
       3: ifne          49
       6: ldc           #23                 // class android/os/Bundle
       8: ldc           #25                 // String getIBinder
      10: iconst_1
      11: anewarray     #27                 // class java/lang/Class
      14: dup
      15: iconst_0
      16: ldc           #29                 // class java/lang/String
      18: aastore
      19: invokevirtual #33                 // Method java/lang/Class.getMethod:(Ljava/lang/String;[Ljava/lang/Class;)Ljava/lang/reflect/Method;
      22: putstatic     #35                 // Field a:Ljava/lang/reflect/Method;
      25: getstatic     #35                 // Field a:Ljava/lang/reflect/Method;
      28: iconst_1
      29: invokevirtual #41                 // Method java/lang/reflect/Method.setAccessible:(Z)V
      32: goto          45
      35: astore_2
      36: ldc           #43                 // String BundleCompatBaseImpl
      38: ldc           #45                 // String Failed to retrieve getIBinder method
      40: aload_2
      41: invokestatic  #51                 // Method android/util/Log.i:(Ljava/lang/String;Ljava/lang/String;Ljava/lang/Throwable;)I
      44: pop
      45: iconst_1
      46: putstatic     #21                 // Field b:Z
      49: getstatic     #35                 // Field a:Ljava/lang/reflect/Method;
      52: ifnull        90
      55: getstatic     #35                 // Field a:Ljava/lang/reflect/Method;
      58: aload_0
      59: iconst_1
      60: anewarray     #4                  // class java/lang/Object
      63: dup
      64: iconst_0
      65: aload_1
      66: aastore
      67: invokevirtual #55                 // Method java/lang/reflect/Method.invoke:(Ljava/lang/Object;[Ljava/lang/Object;)Ljava/lang/Object;
      70: checkcast     #57                 // class android/os/IBinder
      73: astore_0
      74: aload_0
      75: areturn
      76: astore_0
      77: ldc           #43                 // String BundleCompatBaseImpl
      79: ldc           #59                 // String Failed to invoke getIBinder via reflection
      81: aload_0
      82: invokestatic  #51                 // Method android/util/Log.i:(Ljava/lang/String;Ljava/lang/String;Ljava/lang/Throwable;)I
      85: pop
      86: aconst_null
      87: putstatic     #35                 // Field a:Ljava/lang/reflect/Method;
      90: aconst_null
      91: areturn
    Exception table:
       from    to  target type
           6    32    35   Class java/lang/NoSuchMethodException
          55    74    76   Class java/lang/reflect/InvocationTargetException
          55    74    76   Class java/lang/IllegalAccessException
          55    74    76   Class java/lang/IllegalArgumentException
}
