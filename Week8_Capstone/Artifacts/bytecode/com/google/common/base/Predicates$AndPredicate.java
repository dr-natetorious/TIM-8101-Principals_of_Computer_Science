class com.google.common.base.Predicates$AndPredicate<T> implements com.google.common.base.Predicate<T>, java.io.Serializable {
  com.google.common.base.Predicates$AndPredicate(java.util.List, com.google.common.base.Predicates$1);
    Code:
       0: aload_0
       1: aload_1
       2: invokespecial #32                 // Method "<init>":(Ljava/util/List;)V
       5: return

  public boolean apply(T);
    Code:
       0: iconst_0
       1: istore_2
       2: iload_2
       3: aload_0
       4: getfield      #26                 // Field components:Ljava/util/List;
       7: invokeinterface #40,  1           // InterfaceMethod java/util/List.size:()I
      12: if_icmpge     46
      15: aload_0
      16: getfield      #26                 // Field components:Ljava/util/List;
      19: iload_2
      20: invokeinterface #44,  2           // InterfaceMethod java/util/List.get:(I)Ljava/lang/Object;
      25: checkcast     #7                  // class com/google/common/base/Predicate
      28: aload_1
      29: invokeinterface #46,  2           // InterfaceMethod com/google/common/base/Predicate.apply:(Ljava/lang/Object;)Z
      34: ifne          39
      37: iconst_0
      38: ireturn
      39: iload_2
      40: iconst_1
      41: iadd
      42: istore_2
      43: goto          2
      46: iconst_1
      47: ireturn

  public boolean equals(java.lang.Object);
    Code:
       0: aload_1
       1: instanceof    #2                  // class com/google/common/base/Predicates$AndPredicate
       4: ifeq          26
       7: aload_1
       8: checkcast     #2                  // class com/google/common/base/Predicates$AndPredicate
      11: astore_1
      12: aload_0
      13: getfield      #26                 // Field components:Ljava/util/List;
      16: aload_1
      17: getfield      #26                 // Field components:Ljava/util/List;
      20: invokeinterface #50,  2           // InterfaceMethod java/util/List.equals:(Ljava/lang/Object;)Z
      25: ireturn
      26: iconst_0
      27: ireturn

  public int hashCode();
    Code:
       0: aload_0
       1: getfield      #26                 // Field components:Ljava/util/List;
       4: invokeinterface #53,  1           // InterfaceMethod java/util/List.hashCode:()I
       9: ldc           #54                 // int 306654252
      11: iadd
      12: ireturn

  public java.lang.String toString();
    Code:
       0: ldc           #58                 // String and
       2: aload_0
       3: getfield      #26                 // Field components:Ljava/util/List;
       6: invokestatic  #62                 // Method com/google/common/base/Predicates.access$800:(Ljava/lang/String;Ljava/lang/Iterable;)Ljava/lang/String;
       9: areturn
}
