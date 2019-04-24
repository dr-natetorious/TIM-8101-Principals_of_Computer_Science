class com.google.common.base.Predicates$InPredicate<T> implements com.google.common.base.Predicate<T>, java.io.Serializable {
  com.google.common.base.Predicates$InPredicate(java.util.Collection, com.google.common.base.Predicates$1);
    Code:
       0: aload_0
       1: aload_1
       2: invokespecial #40                 // Method "<init>":(Ljava/util/Collection;)V
       5: return

  public boolean apply(T);
    Code:
       0: aload_0
       1: getfield      #34                 // Field target:Ljava/util/Collection;
       4: aload_1
       5: invokeinterface #49,  2           // InterfaceMethod java/util/Collection.contains:(Ljava/lang/Object;)Z
      10: istore_2
      11: iload_2
      12: ireturn
      13: iconst_0
      14: ireturn
      15: astore_1
      16: goto          13
    Exception table:
       from    to  target type
           0    11    15   Class java/lang/NullPointerException
           0    11    15   Class java/lang/ClassCastException

  public boolean equals(java.lang.Object);
    Code:
       0: aload_1
       1: instanceof    #2                  // class com/google/common/base/Predicates$InPredicate
       4: ifeq          26
       7: aload_1
       8: checkcast     #2                  // class com/google/common/base/Predicates$InPredicate
      11: astore_1
      12: aload_0
      13: getfield      #34                 // Field target:Ljava/util/Collection;
      16: aload_1
      17: getfield      #34                 // Field target:Ljava/util/Collection;
      20: invokeinterface #53,  2           // InterfaceMethod java/util/Collection.equals:(Ljava/lang/Object;)Z
      25: ireturn
      26: iconst_0
      27: ireturn

  public int hashCode();
    Code:
       0: aload_0
       1: getfield      #34                 // Field target:Ljava/util/Collection;
       4: invokeinterface #57,  1           // InterfaceMethod java/util/Collection.hashCode:()I
       9: ireturn

  public java.lang.String toString();
    Code:
       0: new           #61                 // class java/lang/StringBuilder
       3: dup
       4: invokespecial #62                 // Method java/lang/StringBuilder."<init>":()V
       7: astore_1
       8: aload_1
       9: ldc           #64                 // String Predicates.in(
      11: invokevirtual #68                 // Method java/lang/StringBuilder.append:(Ljava/lang/String;)Ljava/lang/StringBuilder;
      14: pop
      15: aload_1
      16: aload_0
      17: getfield      #34                 // Field target:Ljava/util/Collection;
      20: invokevirtual #71                 // Method java/lang/StringBuilder.append:(Ljava/lang/Object;)Ljava/lang/StringBuilder;
      23: pop
      24: aload_1
      25: ldc           #73                 // String )
      27: invokevirtual #68                 // Method java/lang/StringBuilder.append:(Ljava/lang/String;)Ljava/lang/StringBuilder;
      30: pop
      31: aload_1
      32: invokevirtual #75                 // Method java/lang/StringBuilder.toString:()Ljava/lang/String;
      35: areturn
}
