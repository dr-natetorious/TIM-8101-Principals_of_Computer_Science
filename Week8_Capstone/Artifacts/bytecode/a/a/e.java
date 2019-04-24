class a.a.e extends a.a.d {
  public static final <T, A extends java.lang.Appendable> A a(T[], A, java.lang.CharSequence, java.lang.CharSequence, java.lang.CharSequence, int, java.lang.CharSequence, a.b.a.a<? super T, ? extends java.lang.CharSequence>);
    Code:
       0: aload_0
       1: ldc           #8                  // String receiver$0
       3: invokestatic  #14                 // Method a/b/b/c.b:(Ljava/lang/Object;Ljava/lang/String;)V
       6: aload_1
       7: ldc           #16                 // String buffer
       9: invokestatic  #14                 // Method a/b/b/c.b:(Ljava/lang/Object;Ljava/lang/String;)V
      12: aload_2
      13: ldc           #18                 // String separator
      15: invokestatic  #14                 // Method a/b/b/c.b:(Ljava/lang/Object;Ljava/lang/String;)V
      18: aload_3
      19: ldc           #20                 // String prefix
      21: invokestatic  #14                 // Method a/b/b/c.b:(Ljava/lang/Object;Ljava/lang/String;)V
      24: aload         4
      26: ldc           #22                 // String postfix
      28: invokestatic  #14                 // Method a/b/b/c.b:(Ljava/lang/Object;Ljava/lang/String;)V
      31: aload         6
      33: ldc           #24                 // String truncated
      35: invokestatic  #14                 // Method a/b/b/c.b:(Ljava/lang/Object;Ljava/lang/String;)V
      38: aload_1
      39: aload_3
      40: invokeinterface #30,  2           // InterfaceMethod java/lang/Appendable.append:(Ljava/lang/CharSequence;)Ljava/lang/Appendable;
      45: pop
      46: aload_0
      47: arraylength
      48: istore        11
      50: iconst_0
      51: istore        9
      53: iconst_0
      54: istore        8
      56: iload         8
      58: istore        10
      60: iload         9
      62: iload         11
      64: if_icmpge     124
      67: aload_0
      68: iload         9
      70: aaload
      71: astore_3
      72: iload         8
      74: iconst_1
      75: iadd
      76: istore        8
      78: iload         8
      80: iconst_1
      81: if_icmple     92
      84: aload_1
      85: aload_2
      86: invokeinterface #30,  2           // InterfaceMethod java/lang/Appendable.append:(Ljava/lang/CharSequence;)Ljava/lang/Appendable;
      91: pop
      92: iload         5
      94: iflt          108
      97: iload         8
      99: istore        10
     101: iload         8
     103: iload         5
     105: if_icmpgt     124
     108: aload_1
     109: aload_3
     110: aload         7
     112: invokestatic  #35                 // Method a/d/a.a:(Ljava/lang/Appendable;Ljava/lang/Object;La/b/a/a;)V
     115: iload         9
     117: iconst_1
     118: iadd
     119: istore        9
     121: goto          56
     124: iload         5
     126: iflt          145
     129: iload         10
     131: iload         5
     133: if_icmple     145
     136: aload_1
     137: aload         6
     139: invokeinterface #30,  2           // InterfaceMethod java/lang/Appendable.append:(Ljava/lang/CharSequence;)Ljava/lang/Appendable;
     144: pop
     145: aload_1
     146: aload         4
     148: invokeinterface #30,  2           // InterfaceMethod java/lang/Appendable.append:(Ljava/lang/CharSequence;)Ljava/lang/Appendable;
     153: pop
     154: aload_1
     155: areturn

  public static final <T> java.lang.String a(T[], java.lang.CharSequence, java.lang.CharSequence, java.lang.CharSequence, int, java.lang.CharSequence, a.b.a.a<? super T, ? extends java.lang.CharSequence>);
    Code:
       0: aload_0
       1: ldc           #8                  // String receiver$0
       3: invokestatic  #14                 // Method a/b/b/c.b:(Ljava/lang/Object;Ljava/lang/String;)V
       6: aload_1
       7: ldc           #18                 // String separator
       9: invokestatic  #14                 // Method a/b/b/c.b:(Ljava/lang/Object;Ljava/lang/String;)V
      12: aload_2
      13: ldc           #20                 // String prefix
      15: invokestatic  #14                 // Method a/b/b/c.b:(Ljava/lang/Object;Ljava/lang/String;)V
      18: aload_3
      19: ldc           #22                 // String postfix
      21: invokestatic  #14                 // Method a/b/b/c.b:(Ljava/lang/Object;Ljava/lang/String;)V
      24: aload         5
      26: ldc           #24                 // String truncated
      28: invokestatic  #14                 // Method a/b/b/c.b:(Ljava/lang/Object;Ljava/lang/String;)V
      31: aload_0
      32: new           #41                 // class java/lang/StringBuilder
      35: dup
      36: invokespecial #45                 // Method java/lang/StringBuilder."<init>":()V
      39: checkcast     #26                 // class java/lang/Appendable
      42: aload_1
      43: aload_2
      44: aload_3
      45: iload         4
      47: aload         5
      49: aload         6
      51: invokestatic  #49                 // Method a/a/a.a:([Ljava/lang/Object;Ljava/lang/Appendable;Ljava/lang/CharSequence;Ljava/lang/CharSequence;Ljava/lang/CharSequence;ILjava/lang/CharSequence;La/b/a/a;)Ljava/lang/Appendable;
      54: checkcast     #41                 // class java/lang/StringBuilder
      57: invokevirtual #53                 // Method java/lang/StringBuilder.toString:()Ljava/lang/String;
      60: astore_0
      61: aload_0
      62: ldc           #55                 // String joinTo(StringBuilder(), ?ed, transform).toString()
      64: invokestatic  #57                 // Method a/b/b/c.a:(Ljava/lang/Object;Ljava/lang/String;)V
      67: aload_0
      68: areturn

  public static java.lang.String a(java.lang.Object[], java.lang.CharSequence, java.lang.CharSequence, java.lang.CharSequence, int, java.lang.CharSequence, a.b.a.a, int, java.lang.Object);
    Code:
       0: iload         7
       2: iconst_1
       3: iand
       4: ifeq          13
       7: ldc           #61                 // String ,
       9: checkcast     #63                 // class java/lang/CharSequence
      12: astore_1
      13: iload         7
      15: iconst_2
      16: iand
      17: ifeq          26
      20: ldc           #65                 // String
      22: checkcast     #63                 // class java/lang/CharSequence
      25: astore_2
      26: iload         7
      28: iconst_4
      29: iand
      30: ifeq          39
      33: ldc           #65                 // String
      35: checkcast     #63                 // class java/lang/CharSequence
      38: astore_3
      39: iload         7
      41: bipush        8
      43: iand
      44: ifeq          53
      47: iconst_m1
      48: istore        4
      50: goto          53
      53: iload         7
      55: bipush        16
      57: iand
      58: ifeq          68
      61: ldc           #67                 // String ...
      63: checkcast     #63                 // class java/lang/CharSequence
      66: astore        5
      68: iload         7
      70: bipush        32
      72: iand
      73: ifeq          82
      76: aconst_null
      77: checkcast     #69                 // class a/b/a/a
      80: astore        6
      82: aload_0
      83: aload_1
      84: aload_2
      85: aload_3
      86: iload         4
      88: aload         5
      90: aload         6
      92: invokestatic  #71                 // Method a/a/a.a:([Ljava/lang/Object;Ljava/lang/CharSequence;Ljava/lang/CharSequence;Ljava/lang/CharSequence;ILjava/lang/CharSequence;La/b/a/a;)Ljava/lang/String;
      95: areturn
}
