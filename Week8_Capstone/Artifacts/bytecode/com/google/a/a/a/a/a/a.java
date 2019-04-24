public final class com.google.a.a.a.a.a.a {
  static final com.google.a.a.a.a.a.a$a a;

  static final int b;

  static {};
    Code:
       0: invokestatic  #22                 // Method b:()Ljava/lang/Integer;
       3: astore_2
       4: aload_2
       5: ifnull        28
       8: aload_2
       9: invokevirtual #28                 // Method java/lang/Integer.intValue:()I
      12: bipush        19
      14: if_icmplt     28
      17: new           #12                 // class com/google/a/a/a/a/a/a$c
      20: dup
      21: invokespecial #31                 // Method com/google/a/a/a/a/a/a$c."<init>":()V
      24: astore_1
      25: goto          123
      28: invokestatic  #34                 // Method a:()Z
      31: ifeq          45
      34: new           #9                  // class com/google/a/a/a/a/a/a$b
      37: dup
      38: invokespecial #35                 // Method com/google/a/a/a/a/a/a$b."<init>":()V
      41: astore_1
      42: goto          123
      45: new           #9                  // class com/google/a/a/a/a/a/a$b
      48: dup
      49: invokespecial #35                 // Method com/google/a/a/a/a/a/a$b."<init>":()V
      52: astore_1
      53: goto          123
      56: astore_1
      57: aconst_null
      58: astore_2
      59: getstatic     #41                 // Field java/lang/System.err:Ljava/io/PrintStream;
      62: astore_3
      63: new           #43                 // class java/lang/StringBuilder
      66: dup
      67: invokespecial #44                 // Method java/lang/StringBuilder."<init>":()V
      70: astore        4
      72: aload         4
      74: ldc           #46                 // String An error has occured when initializing the try-with-resources desuguring strategy. The default strategy
      76: invokevirtual #50                 // Method java/lang/StringBuilder.append:(Ljava/lang/String;)Ljava/lang/StringBuilder;
      79: pop
      80: aload         4
      82: ldc           #9                  // class com/google/a/a/a/a/a/a$b
      84: invokevirtual #56                 // Method java/lang/Class.getName:()Ljava/lang/String;
      87: invokevirtual #50                 // Method java/lang/StringBuilder.append:(Ljava/lang/String;)Ljava/lang/StringBuilder;
      90: pop
      91: aload         4
      93: ldc           #58                 // String will be used. The error is:
      95: invokevirtual #50                 // Method java/lang/StringBuilder.append:(Ljava/lang/String;)Ljava/lang/StringBuilder;
      98: pop
      99: aload_3
     100: aload         4
     102: invokevirtual #61                 // Method java/lang/StringBuilder.toString:()Ljava/lang/String;
     105: invokevirtual #67                 // Method java/io/PrintStream.println:(Ljava/lang/String;)V
     108: aload_1
     109: getstatic     #41                 // Field java/lang/System.err:Ljava/io/PrintStream;
     112: invokevirtual #71                 // Method java/lang/Throwable.printStackTrace:(Ljava/io/PrintStream;)V
     115: new           #9                  // class com/google/a/a/a/a/a/a$b
     118: dup
     119: invokespecial #35                 // Method com/google/a/a/a/a/a/a$b."<init>":()V
     122: astore_1
     123: aload_1
     124: putstatic     #73                 // Field a:Lcom/google/a/a/a/a/a/a$a;
     127: aload_2
     128: ifnonnull     136
     131: iconst_1
     132: istore_0
     133: goto          141
     136: aload_2
     137: invokevirtual #28                 // Method java/lang/Integer.intValue:()I
     140: istore_0
     141: iload_0
     142: putstatic     #75                 // Field b:I
     145: return
     146: astore_1
     147: goto          59
    Exception table:
       from    to  target type
           0     4    56   Class java/lang/Throwable
           8    25   146   Class java/lang/Throwable
          28    42   146   Class java/lang/Throwable
          45    53   146   Class java/lang/Throwable

  public static void a(java.lang.Throwable);
    Code:
       0: getstatic     #73                 // Field a:Lcom/google/a/a/a/a/a/a$a;
       3: aload_0
       4: invokevirtual #79                 // Method com/google/a/a/a/a/a/a$a.a:(Ljava/lang/Throwable;)V
       7: return

  public static void a(java.lang.Throwable, java.io.PrintWriter);
    Code:
       0: getstatic     #73                 // Field a:Lcom/google/a/a/a/a/a/a$a;
       3: aload_0
       4: aload_1
       5: invokevirtual #82                 // Method com/google/a/a/a/a/a/a$a.a:(Ljava/lang/Throwable;Ljava/io/PrintWriter;)V
       8: return

  public static void a(java.lang.Throwable, java.lang.Throwable);
    Code:
       0: getstatic     #73                 // Field a:Lcom/google/a/a/a/a/a/a$a;
       3: aload_0
       4: aload_1
       5: invokevirtual #85                 // Method com/google/a/a/a/a/a/a$a.a:(Ljava/lang/Throwable;Ljava/lang/Throwable;)V
       8: return
}
