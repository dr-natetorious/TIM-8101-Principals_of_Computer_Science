final class com.b.a.m {
  static java.lang.String a(int);
    Code:
       0: iload_0
       1: tableswitch   { // 2 to 7
                     2: 58
                     3: 55
                     4: 52
                     5: 49
                     6: 46
                     7: 43
               default: 40
          }
      40: ldc           #8                  // String UNKNOWN
      42: areturn
      43: ldc           #10                 // String ASSERT
      45: areturn
      46: ldc           #12                 // String ERROR
      48: areturn
      49: ldc           #14                 // String WARN
      51: areturn
      52: ldc           #16                 // String INFO
      54: areturn
      55: ldc           #18                 // String DEBUG
      57: areturn
      58: ldc           #20                 // String VERBOSE
      60: areturn

  public static java.lang.String a(java.lang.Object);
    Code:
       0: aload_0
       1: ifnonnull     7
       4: ldc           #24                 // String null
       6: areturn
       7: aload_0
       8: invokevirtual #28                 // Method java/lang/Object.getClass:()Ljava/lang/Class;
      11: invokevirtual #34                 // Method java/lang/Class.isArray:()Z
      14: ifne          22
      17: aload_0
      18: invokevirtual #38                 // Method java/lang/Object.toString:()Ljava/lang/String;
      21: areturn
      22: aload_0
      23: instanceof    #40                 // class "[Z"
      26: ifeq          37
      29: aload_0
      30: checkcast     #40                 // class "[Z"
      33: invokestatic  #45                 // Method java/util/Arrays.toString:([Z)Ljava/lang/String;
      36: areturn
      37: aload_0
      38: instanceof    #47                 // class "[B"
      41: ifeq          52
      44: aload_0
      45: checkcast     #47                 // class "[B"
      48: invokestatic  #50                 // Method java/util/Arrays.toString:([B)Ljava/lang/String;
      51: areturn
      52: aload_0
      53: instanceof    #52                 // class "[C"
      56: ifeq          67
      59: aload_0
      60: checkcast     #52                 // class "[C"
      63: invokestatic  #55                 // Method java/util/Arrays.toString:([C)Ljava/lang/String;
      66: areturn
      67: aload_0
      68: instanceof    #57                 // class "[S"
      71: ifeq          82
      74: aload_0
      75: checkcast     #57                 // class "[S"
      78: invokestatic  #60                 // Method java/util/Arrays.toString:([S)Ljava/lang/String;
      81: areturn
      82: aload_0
      83: instanceof    #62                 // class "[I"
      86: ifeq          97
      89: aload_0
      90: checkcast     #62                 // class "[I"
      93: invokestatic  #65                 // Method java/util/Arrays.toString:([I)Ljava/lang/String;
      96: areturn
      97: aload_0
      98: instanceof    #67                 // class "[J"
     101: ifeq          112
     104: aload_0
     105: checkcast     #67                 // class "[J"
     108: invokestatic  #70                 // Method java/util/Arrays.toString:([J)Ljava/lang/String;
     111: areturn
     112: aload_0
     113: instanceof    #72                 // class "[F"
     116: ifeq          127
     119: aload_0
     120: checkcast     #72                 // class "[F"
     123: invokestatic  #75                 // Method java/util/Arrays.toString:([F)Ljava/lang/String;
     126: areturn
     127: aload_0
     128: instanceof    #77                 // class "[D"
     131: ifeq          142
     134: aload_0
     135: checkcast     #77                 // class "[D"
     138: invokestatic  #80                 // Method java/util/Arrays.toString:([D)Ljava/lang/String;
     141: areturn
     142: aload_0
     143: instanceof    #82                 // class "[Ljava/lang/Object;"
     146: ifeq          157
     149: aload_0
     150: checkcast     #82                 // class "[Ljava/lang/Object;"
     153: invokestatic  #86                 // Method java/util/Arrays.deepToString:([Ljava/lang/Object;)Ljava/lang/String;
     156: areturn
     157: ldc           #88                 // String Couldn't find a correct type for the object
     159: areturn

  static java.lang.String a(java.lang.Throwable);
    Code:
       0: aload_0
       1: ifnonnull     7
       4: ldc           #91                 // String
       6: areturn
       7: aload_0
       8: astore_1
       9: aload_1
      10: ifnull        31
      13: aload_1
      14: instanceof    #93                 // class java/net/UnknownHostException
      17: ifeq          23
      20: ldc           #91                 // String
      22: areturn
      23: aload_1
      24: invokevirtual #99                 // Method java/lang/Throwable.getCause:()Ljava/lang/Throwable;
      27: astore_1
      28: goto          9
      31: new           #101                // class java/io/StringWriter
      34: dup
      35: invokespecial #105                // Method java/io/StringWriter."<init>":()V
      38: astore_1
      39: new           #107                // class java/io/PrintWriter
      42: dup
      43: aload_1
      44: invokespecial #110                // Method java/io/PrintWriter."<init>":(Ljava/io/Writer;)V
      47: astore_2
      48: aload_0
      49: aload_2
      50: invokestatic  #115                // Method com/google/a/a/a/a/a/a.a:(Ljava/lang/Throwable;Ljava/io/PrintWriter;)V
      53: aload_2
      54: invokevirtual #118                // Method java/io/PrintWriter.flush:()V
      57: aload_1
      58: invokevirtual #119                // Method java/io/StringWriter.toString:()Ljava/lang/String;
      61: areturn

  static boolean a(java.lang.CharSequence);
    Code:
       0: aload_0
       1: ifnull        18
       4: aload_0
       5: invokeinterface #126,  1          // InterfaceMethod java/lang/CharSequence.length:()I
      10: ifne          16
      13: goto          18
      16: iconst_0
      17: ireturn
      18: iconst_1
      19: ireturn

  static boolean a(java.lang.CharSequence, java.lang.CharSequence);
    Code:
       0: aload_0
       1: aload_1
       2: if_acmpne     7
       5: iconst_1
       6: ireturn
       7: aload_0
       8: ifnull        87
      11: aload_1
      12: ifnull        87
      15: aload_0
      16: invokeinterface #126,  1          // InterfaceMethod java/lang/CharSequence.length:()I
      21: istore_3
      22: iload_3
      23: aload_1
      24: invokeinterface #126,  1          // InterfaceMethod java/lang/CharSequence.length:()I
      29: if_icmpne     87
      32: aload_0
      33: instanceof    #129                // class java/lang/String
      36: ifeq          52
      39: aload_1
      40: instanceof    #129                // class java/lang/String
      43: ifeq          52
      46: aload_0
      47: aload_1
      48: invokevirtual #133                // Method java/lang/Object.equals:(Ljava/lang/Object;)Z
      51: ireturn
      52: iconst_0
      53: istore_2
      54: iload_2
      55: iload_3
      56: if_icmpge     85
      59: aload_0
      60: iload_2
      61: invokeinterface #137,  2          // InterfaceMethod java/lang/CharSequence.charAt:(I)C
      66: aload_1
      67: iload_2
      68: invokeinterface #137,  2          // InterfaceMethod java/lang/CharSequence.charAt:(I)C
      73: if_icmpeq     78
      76: iconst_0
      77: ireturn
      78: iload_2
      79: iconst_1
      80: iadd
      81: istore_2
      82: goto          54
      85: iconst_1
      86: ireturn
      87: iconst_0
      88: ireturn
}
