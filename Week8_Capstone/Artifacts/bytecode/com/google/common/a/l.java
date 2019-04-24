public final class com.google.common.a.l {
  static boolean a(com.google.common.a.k<?, ?>, java.lang.Object);
    Code:
       0: aload_1
       1: aload_0
       2: if_acmpne     7
       5: iconst_1
       6: ireturn
       7: aload_1
       8: instanceof    #26                 // class com/google/common/a/k
      11: ifeq          37
      14: aload_1
      15: checkcast     #26                 // class com/google/common/a/k
      18: astore_1
      19: aload_0
      20: invokeinterface #30,  1           // InterfaceMethod com/google/common/a/k.i:()Ljava/util/Map;
      25: aload_1
      26: invokeinterface #30,  1           // InterfaceMethod com/google/common/a/k.i:()Ljava/util/Map;
      31: invokeinterface #36,  2           // InterfaceMethod java/util/Map.equals:(Ljava/lang/Object;)Z
      36: ireturn
      37: iconst_0
      38: ireturn
}
