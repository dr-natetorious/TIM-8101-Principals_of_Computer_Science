class a.d.f extends a.d.e {
  public static final <T> void a(java.lang.Appendable, T, a.b.a.a<? super T, ? extends java.lang.CharSequence>);
    Code:
       0: aload_0
       1: ldc           #8                  // String receiver$0
       3: invokestatic  #14                 // Method a/b/b/c.b:(Ljava/lang/Object;Ljava/lang/String;)V
       6: aload_2
       7: ifnull        30
      10: aload_2
      11: aload_1
      12: invokeinterface #19,  2           // InterfaceMethod a/b/a/a.a:(Ljava/lang/Object;)Ljava/lang/Object;
      17: astore_1
      18: aload_0
      19: aload_1
      20: checkcast     #21                 // class java/lang/CharSequence
      23: invokeinterface #27,  2           // InterfaceMethod java/lang/Appendable.append:(Ljava/lang/CharSequence;)Ljava/lang/Appendable;
      28: pop
      29: return
      30: aload_1
      31: ifnull        42
      34: aload_1
      35: instanceof    #21                 // class java/lang/CharSequence
      38: istore_3
      39: goto          44
      42: iconst_1
      43: istore_3
      44: iload_3
      45: ifeq          51
      48: goto          18
      51: aload_1
      52: instanceof    #29                 // class java/lang/Character
      55: ifeq          73
      58: aload_0
      59: aload_1
      60: checkcast     #29                 // class java/lang/Character
      63: invokevirtual #33                 // Method java/lang/Character.charValue:()C
      66: invokeinterface #36,  2           // InterfaceMethod java/lang/Appendable.append:(C)Ljava/lang/Appendable;
      71: pop
      72: return
      73: aload_1
      74: invokestatic  #42                 // Method java/lang/String.valueOf:(Ljava/lang/Object;)Ljava/lang/String;
      77: astore_1
      78: goto          18
}
