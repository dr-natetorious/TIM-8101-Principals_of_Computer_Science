public class a.b.b.c {
  static <T extends java.lang.Throwable> T a(T, java.lang.String);
    Code:
       0: aload_0
       1: invokevirtual #28                 // Method java/lang/Throwable.getStackTrace:()[Ljava/lang/StackTraceElement;
       4: astore        5
       6: aload         5
       8: arraylength
       9: istore        4
      11: iconst_m1
      12: istore_3
      13: iconst_0
      14: istore_2
      15: iload_2
      16: iload         4
      18: if_icmpge     44
      21: aload_1
      22: aload         5
      24: iload_2
      25: aaload
      26: invokevirtual #33                 // Method java/lang/StackTraceElement.getClassName:()Ljava/lang/String;
      29: invokevirtual #39                 // Method java/lang/String.equals:(Ljava/lang/Object;)Z
      32: ifeq          37
      35: iload_2
      36: istore_3
      37: iload_2
      38: iconst_1
      39: iadd
      40: istore_2
      41: goto          15
      44: aload         5
      46: invokestatic  #45                 // Method java/util/Arrays.asList:([Ljava/lang/Object;)Ljava/util/List;
      49: iload_3
      50: iconst_1
      51: iadd
      52: iload         4
      54: invokeinterface #51,  3           // InterfaceMethod java/util/List.subList:(II)Ljava/util/List;
      59: astore_1
      60: aload_0
      61: aload_1
      62: aload_1
      63: invokeinterface #55,  1           // InterfaceMethod java/util/List.size:()I
      68: anewarray     #30                 // class java/lang/StackTraceElement
      71: invokeinterface #59,  2           // InterfaceMethod java/util/List.toArray:([Ljava/lang/Object;)[Ljava/lang/Object;
      76: checkcast     #61                 // class "[Ljava/lang/StackTraceElement;"
      79: invokevirtual #65                 // Method java/lang/Throwable.setStackTrace:([Ljava/lang/StackTraceElement;)V
      82: aload_0
      83: areturn

  public static void a();
    Code:
       0: new           #68                 // class a/a
       3: dup
       4: invokespecial #69                 // Method a/a."<init>":()V
       7: invokestatic  #71                 // Method a:(Ljava/lang/Throwable;)Ljava/lang/Throwable;
      10: checkcast     #68                 // class a/a
      13: athrow

  public static void a(java.lang.Object, java.lang.String);
    Code:
       0: aload_0
       1: ifnonnull     43
       4: new           #74                 // class java/lang/StringBuilder
       7: dup
       8: invokespecial #75                 // Method java/lang/StringBuilder."<init>":()V
      11: astore_0
      12: aload_0
      13: aload_1
      14: invokevirtual #79                 // Method java/lang/StringBuilder.append:(Ljava/lang/String;)Ljava/lang/StringBuilder;
      17: pop
      18: aload_0
      19: ldc           #81                 // String  must not be null
      21: invokevirtual #79                 // Method java/lang/StringBuilder.append:(Ljava/lang/String;)Ljava/lang/StringBuilder;
      24: pop
      25: new           #83                 // class java/lang/IllegalStateException
      28: dup
      29: aload_0
      30: invokevirtual #86                 // Method java/lang/StringBuilder.toString:()Ljava/lang/String;
      33: invokespecial #89                 // Method java/lang/IllegalStateException."<init>":(Ljava/lang/String;)V
      36: invokestatic  #71                 // Method a:(Ljava/lang/Throwable;)Ljava/lang/Throwable;
      39: checkcast     #83                 // class java/lang/IllegalStateException
      42: athrow
      43: return

  public static void a(java.lang.String);
    Code:
       0: new           #91                 // class a/c
       3: dup
       4: aload_0
       5: invokespecial #92                 // Method a/c."<init>":(Ljava/lang/String;)V
       8: invokestatic  #71                 // Method a:(Ljava/lang/Throwable;)Ljava/lang/Throwable;
      11: checkcast     #91                 // class a/c
      14: athrow

  public static boolean a(java.lang.Object, java.lang.Object);
    Code:
       0: aload_0
       1: ifnonnull     12
       4: aload_1
       5: ifnonnull     10
       8: iconst_1
       9: ireturn
      10: iconst_0
      11: ireturn
      12: aload_0
      13: aload_1
      14: invokevirtual #94                 // Method java/lang/Object.equals:(Ljava/lang/Object;)Z
      17: ireturn

  public static void b(java.lang.Object, java.lang.String);
    Code:
       0: aload_0
       1: ifnonnull     8
       4: aload_1
       5: invokestatic  #98                 // Method c:(Ljava/lang/String;)V
       8: return

  public static void b(java.lang.String);
    Code:
       0: new           #74                 // class java/lang/StringBuilder
       3: dup
       4: invokespecial #75                 // Method java/lang/StringBuilder."<init>":()V
       7: astore_1
       8: aload_1
       9: ldc           #100                // String lateinit property
      11: invokevirtual #79                 // Method java/lang/StringBuilder.append:(Ljava/lang/String;)Ljava/lang/StringBuilder;
      14: pop
      15: aload_1
      16: aload_0
      17: invokevirtual #79                 // Method java/lang/StringBuilder.append:(Ljava/lang/String;)Ljava/lang/StringBuilder;
      20: pop
      21: aload_1
      22: ldc           #102                // String  has not been initialized
      24: invokevirtual #79                 // Method java/lang/StringBuilder.append:(Ljava/lang/String;)Ljava/lang/StringBuilder;
      27: pop
      28: aload_1
      29: invokevirtual #86                 // Method java/lang/StringBuilder.toString:()Ljava/lang/String;
      32: invokestatic  #104                // Method a:(Ljava/lang/String;)V
      35: return
}
