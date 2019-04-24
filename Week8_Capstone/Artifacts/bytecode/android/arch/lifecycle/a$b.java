class android.arch.lifecycle.a$b {
  final int a;

  final java.lang.reflect.Method b;

  android.arch.lifecycle.a$b(int, java.lang.reflect.Method);
    Code:
       0: aload_0
       1: invokespecial #15                 // Method java/lang/Object."<init>":()V
       4: aload_0
       5: iload_1
       6: putfield      #17                 // Field a:I
       9: aload_0
      10: aload_2
      11: putfield      #19                 // Field b:Ljava/lang/reflect/Method;
      14: aload_0
      15: getfield      #19                 // Field b:Ljava/lang/reflect/Method;
      18: iconst_1
      19: invokevirtual #25                 // Method java/lang/reflect/Method.setAccessible:(Z)V
      22: return

  void a(android.arch.lifecycle.e, android.arch.lifecycle.c$a, java.lang.Object);
    Code:
       0: aload_0
       1: getfield      #17                 // Field a:I
       4: tableswitch   { // 0 to 2
                     0: 72
                     1: 54
                     2: 32
               default: 111
          }
      32: aload_0
      33: getfield      #19                 // Field b:Ljava/lang/reflect/Method;
      36: aload_3
      37: iconst_2
      38: anewarray     #4                  // class java/lang/Object
      41: dup
      42: iconst_0
      43: aload_1
      44: aastore
      45: dup
      46: iconst_1
      47: aload_2
      48: aastore
      49: invokevirtual #35                 // Method java/lang/reflect/Method.invoke:(Ljava/lang/Object;[Ljava/lang/Object;)Ljava/lang/Object;
      52: pop
      53: return
      54: aload_0
      55: getfield      #19                 // Field b:Ljava/lang/reflect/Method;
      58: aload_3
      59: iconst_1
      60: anewarray     #4                  // class java/lang/Object
      63: dup
      64: iconst_0
      65: aload_1
      66: aastore
      67: invokevirtual #35                 // Method java/lang/reflect/Method.invoke:(Ljava/lang/Object;[Ljava/lang/Object;)Ljava/lang/Object;
      70: pop
      71: return
      72: aload_0
      73: getfield      #19                 // Field b:Ljava/lang/reflect/Method;
      76: aload_3
      77: iconst_0
      78: anewarray     #4                  // class java/lang/Object
      81: invokevirtual #35                 // Method java/lang/reflect/Method.invoke:(Ljava/lang/Object;[Ljava/lang/Object;)Ljava/lang/Object;
      84: pop
      85: return
      86: astore_1
      87: new           #37                 // class java/lang/RuntimeException
      90: dup
      91: aload_1
      92: invokespecial #40                 // Method java/lang/RuntimeException."<init>":(Ljava/lang/Throwable;)V
      95: athrow
      96: astore_1
      97: new           #37                 // class java/lang/RuntimeException
     100: dup
     101: ldc           #42                 // String Failed to call observer method
     103: aload_1
     104: invokevirtual #46                 // Method java/lang/reflect/InvocationTargetException.getCause:()Ljava/lang/Throwable;
     107: invokespecial #49                 // Method java/lang/RuntimeException."<init>":(Ljava/lang/String;Ljava/lang/Throwable;)V
     110: athrow
     111: return
    Exception table:
       from    to  target type
           0    32    96   Class java/lang/reflect/InvocationTargetException
           0    32    86   Class java/lang/IllegalAccessException
          32    53    96   Class java/lang/reflect/InvocationTargetException
          32    53    86   Class java/lang/IllegalAccessException
          54    71    96   Class java/lang/reflect/InvocationTargetException
          54    71    86   Class java/lang/IllegalAccessException
          72    85    96   Class java/lang/reflect/InvocationTargetException
          72    85    86   Class java/lang/IllegalAccessException

  public boolean equals(java.lang.Object);
    Code:
       0: aload_0
       1: aload_1
       2: if_acmpne     7
       5: iconst_1
       6: ireturn
       7: aload_1
       8: ifnull        64
      11: aload_0
      12: invokevirtual #55                 // Method java/lang/Object.getClass:()Ljava/lang/Class;
      15: aload_1
      16: invokevirtual #55                 // Method java/lang/Object.getClass:()Ljava/lang/Class;
      19: if_acmpeq     24
      22: iconst_0
      23: ireturn
      24: aload_1
      25: checkcast     #2                  // class android/arch/lifecycle/a$b
      28: astore_1
      29: aload_0
      30: getfield      #17                 // Field a:I
      33: aload_1
      34: getfield      #17                 // Field a:I
      37: if_icmpne     62
      40: aload_0
      41: getfield      #19                 // Field b:Ljava/lang/reflect/Method;
      44: invokevirtual #59                 // Method java/lang/reflect/Method.getName:()Ljava/lang/String;
      47: aload_1
      48: getfield      #19                 // Field b:Ljava/lang/reflect/Method;
      51: invokevirtual #59                 // Method java/lang/reflect/Method.getName:()Ljava/lang/String;
      54: invokevirtual #63                 // Method java/lang/String.equals:(Ljava/lang/Object;)Z
      57: ifeq          62
      60: iconst_1
      61: ireturn
      62: iconst_0
      63: ireturn
      64: iconst_0
      65: ireturn

  public int hashCode();
    Code:
       0: aload_0
       1: getfield      #17                 // Field a:I
       4: bipush        31
       6: imul
       7: aload_0
       8: getfield      #19                 // Field b:Ljava/lang/reflect/Method;
      11: invokevirtual #59                 // Method java/lang/reflect/Method.getName:()Ljava/lang/String;
      14: invokevirtual #67                 // Method java/lang/String.hashCode:()I
      17: iadd
      18: ireturn
}
