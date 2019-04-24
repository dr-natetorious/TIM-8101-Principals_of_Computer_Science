public class ryey.easer.core.a.a.a.e {
  public static java.io.File a(java.io.File, java.lang.String);
    Code:
       0: new           #8                  // class java/io/File
       3: dup
       4: aload_0
       5: aload_1
       6: invokespecial #12                 // Method java/io/File."<init>":(Ljava/io/File;Ljava/lang/String;)V
       9: astore_0
      10: aload_0
      11: invokevirtual #16                 // Method java/io/File.exists:()Z
      14: ifeq          59
      17: aload_0
      18: invokevirtual #19                 // Method java/io/File.isDirectory:()Z
      21: ifne          57
      24: new           #21                 // class java/lang/StringBuilder
      27: dup
      28: invokespecial #24                 // Method java/lang/StringBuilder."<init>":()V
      31: astore_0
      32: aload_0
      33: ldc           #26                 // String Given path exists and is not a dir:
      35: invokevirtual #30                 // Method java/lang/StringBuilder.append:(Ljava/lang/String;)Ljava/lang/StringBuilder;
      38: pop
      39: aload_0
      40: aload_1
      41: invokevirtual #30                 // Method java/lang/StringBuilder.append:(Ljava/lang/String;)Ljava/lang/StringBuilder;
      44: pop
      45: new           #32                 // class java/lang/IllegalStateException
      48: dup
      49: aload_0
      50: invokevirtual #36                 // Method java/lang/StringBuilder.toString:()Ljava/lang/String;
      53: invokespecial #39                 // Method java/lang/IllegalStateException."<init>":(Ljava/lang/String;)V
      56: athrow
      57: aload_0
      58: areturn
      59: aload_0
      60: invokevirtual #42                 // Method java/io/File.mkdir:()Z
      63: ifne          99
      66: new           #21                 // class java/lang/StringBuilder
      69: dup
      70: invokespecial #24                 // Method java/lang/StringBuilder."<init>":()V
      73: astore_0
      74: aload_0
      75: ldc           #44                 // String Unable to create subdir in the given path:
      77: invokevirtual #30                 // Method java/lang/StringBuilder.append:(Ljava/lang/String;)Ljava/lang/StringBuilder;
      80: pop
      81: aload_0
      82: aload_1
      83: invokevirtual #30                 // Method java/lang/StringBuilder.append:(Ljava/lang/String;)Ljava/lang/StringBuilder;
      86: pop
      87: new           #32                 // class java/lang/IllegalStateException
      90: dup
      91: aload_0
      92: invokevirtual #36                 // Method java/lang/StringBuilder.toString:()Ljava/lang/String;
      95: invokespecial #39                 // Method java/lang/IllegalStateException."<init>":(Ljava/lang/String;)V
      98: athrow
      99: aload_0
     100: areturn

  public static java.lang.String a(java.io.InputStream);
    Code:
       0: new           #48                 // class java/io/ByteArrayOutputStream
       3: dup
       4: invokespecial #49                 // Method java/io/ByteArrayOutputStream."<init>":()V
       7: astore_2
       8: sipush        1024
      11: newarray       byte
      13: astore_3
      14: aload_0
      15: aload_3
      16: invokevirtual #55                 // Method java/io/InputStream.read:([B)I
      19: istore_1
      20: iload_1
      21: iconst_m1
      22: if_icmpeq     35
      25: aload_2
      26: aload_3
      27: iconst_0
      28: iload_1
      29: invokevirtual #59                 // Method java/io/ByteArrayOutputStream.write:([BII)V
      32: goto          14
      35: aload_2
      36: ldc           #61                 // String UTF-8
      38: invokevirtual #64                 // Method java/io/ByteArrayOutputStream.toString:(Ljava/lang/String;)Ljava/lang/String;
      41: areturn

  public static boolean b(java.io.File, java.lang.String);
    Code:
       0: new           #8                  // class java/io/File
       3: dup
       4: aload_0
       5: aload_1
       6: invokespecial #12                 // Method java/io/File."<init>":(Ljava/io/File;Ljava/lang/String;)V
       9: astore_0
      10: aload_0
      11: invokevirtual #16                 // Method java/io/File.exists:()Z
      14: ifeq          36
      17: aload_0
      18: invokevirtual #69                 // Method java/io/File.isFile:()Z
      21: ifeq          26
      24: iconst_1
      25: ireturn
      26: new           #32                 // class java/lang/IllegalStateException
      29: dup
      30: ldc           #71                 // String File exists but is not a file
      32: invokespecial #39                 // Method java/lang/IllegalStateException."<init>":(Ljava/lang/String;)V
      35: athrow
      36: iconst_0
      37: ireturn
}
