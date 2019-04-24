class com.google.common.base.FinalizableReferenceQueue$DecoupledLoader implements com.google.common.base.FinalizableReferenceQueue$FinalizerLoader {
  com.google.common.base.FinalizableReferenceQueue$DecoupledLoader();
    Code:
       0: aload_0
       1: invokespecial #17                 // Method java/lang/Object."<init>":()V
       4: return

  java.net.URL getBaseUrl();
    Code:
       0: new           #22                 // class java/lang/StringBuilder
       3: dup
       4: invokespecial #23                 // Method java/lang/StringBuilder."<init>":()V
       7: astore_1
       8: aload_1
       9: ldc           #25                 // String com.google.common.base.internal.Finalizer
      11: bipush        46
      13: bipush        47
      15: invokevirtual #31                 // Method java/lang/String.replace:(CC)Ljava/lang/String;
      18: invokevirtual #35                 // Method java/lang/StringBuilder.append:(Ljava/lang/String;)Ljava/lang/StringBuilder;
      21: pop
      22: aload_1
      23: ldc           #37                 // String .class
      25: invokevirtual #35                 // Method java/lang/StringBuilder.append:(Ljava/lang/String;)Ljava/lang/StringBuilder;
      28: pop
      29: aload_1
      30: invokevirtual #41                 // Method java/lang/StringBuilder.toString:()Ljava/lang/String;
      33: astore_2
      34: aload_0
      35: invokevirtual #45                 // Method java/lang/Object.getClass:()Ljava/lang/Class;
      38: invokevirtual #51                 // Method java/lang/Class.getClassLoader:()Ljava/lang/ClassLoader;
      41: aload_2
      42: invokevirtual #57                 // Method java/lang/ClassLoader.getResource:(Ljava/lang/String;)Ljava/net/URL;
      45: astore_3
      46: aload_3
      47: ifnonnull     59
      50: new           #59                 // class java/io/FileNotFoundException
      53: dup
      54: aload_2
      55: invokespecial #62                 // Method java/io/FileNotFoundException."<init>":(Ljava/lang/String;)V
      58: athrow
      59: aload_3
      60: invokevirtual #65                 // Method java/net/URL.toString:()Ljava/lang/String;
      63: astore_1
      64: aload_1
      65: aload_2
      66: invokevirtual #69                 // Method java/lang/String.endsWith:(Ljava/lang/String;)Z
      69: ifne          105
      72: new           #22                 // class java/lang/StringBuilder
      75: dup
      76: invokespecial #23                 // Method java/lang/StringBuilder."<init>":()V
      79: astore_2
      80: aload_2
      81: ldc           #71                 // String Unsupported path style:
      83: invokevirtual #35                 // Method java/lang/StringBuilder.append:(Ljava/lang/String;)Ljava/lang/StringBuilder;
      86: pop
      87: aload_2
      88: aload_1
      89: invokevirtual #35                 // Method java/lang/StringBuilder.append:(Ljava/lang/String;)Ljava/lang/StringBuilder;
      92: pop
      93: new           #73                 // class java/io/IOException
      96: dup
      97: aload_2
      98: invokevirtual #41                 // Method java/lang/StringBuilder.toString:()Ljava/lang/String;
     101: invokespecial #74                 // Method java/io/IOException."<init>":(Ljava/lang/String;)V
     104: athrow
     105: new           #64                 // class java/net/URL
     108: dup
     109: aload_3
     110: aload_1
     111: iconst_0
     112: aload_1
     113: invokevirtual #78                 // Method java/lang/String.length:()I
     116: aload_2
     117: invokevirtual #78                 // Method java/lang/String.length:()I
     120: isub
     121: invokevirtual #82                 // Method java/lang/String.substring:(II)Ljava/lang/String;
     124: invokespecial #85                 // Method java/net/URL."<init>":(Ljava/net/URL;Ljava/lang/String;)V
     127: areturn

  public java.lang.Class<?> loadFinalizer();
    Code:
       0: aload_0
       1: aload_0
       2: invokevirtual #90                 // Method getBaseUrl:()Ljava/net/URL;
       5: invokevirtual #94                 // Method newLoader:(Ljava/net/URL;)Ljava/net/URLClassLoader;
       8: ldc           #25                 // String com.google.common.base.internal.Finalizer
      10: invokevirtual #98                 // Method java/lang/ClassLoader.loadClass:(Ljava/lang/String;)Ljava/lang/Class;
      13: astore_1
      14: aload_1
      15: areturn
      16: astore_1
      17: invokestatic  #102                // Method com/google/common/base/FinalizableReferenceQueue.access$000:()Ljava/util/logging/Logger;
      20: getstatic     #108                // Field java/util/logging/Level.WARNING:Ljava/util/logging/Level;
      23: ldc           #13                 // String Could not load Finalizer in its own class loader. Loading Finalizer in the current class loader instead. As a result, you will not be able to garbage collect this class loader. To support reclaiming this class loader, either resolve the underlying issue, or move Guava to your system class path.
      25: aload_1
      26: invokevirtual #114                // Method java/util/logging/Logger.log:(Ljava/util/logging/Level;Ljava/lang/String;Ljava/lang/Throwable;)V
      29: aconst_null
      30: areturn
    Exception table:
       from    to  target type
           0    14    16   Class java/lang/Exception

  java.net.URLClassLoader newLoader(java.net.URL);
    Code:
       0: new           #118                // class java/net/URLClassLoader
       3: dup
       4: iconst_1
       5: anewarray     #64                 // class java/net/URL
       8: dup
       9: iconst_0
      10: aload_1
      11: aastore
      12: aconst_null
      13: invokespecial #121                // Method java/net/URLClassLoader."<init>":([Ljava/net/URL;Ljava/lang/ClassLoader;)V
      16: areturn
}
