class com.google.common.base.Suppliers$SupplierOfInstance<T> implements com.google.common.base.Supplier<T>, java.io.Serializable {
  final T instance;

  com.google.common.base.Suppliers$SupplierOfInstance(T);
    Code:
       0: aload_0
       1: invokespecial #24                 // Method java/lang/Object."<init>":()V
       4: aload_0
       5: aload_1
       6: putfield      #26                 // Field instance:Ljava/lang/Object;
       9: return

  public boolean equals(java.lang.Object);
    Code:
       0: aload_1
       1: instanceof    #2                  // class com/google/common/base/Suppliers$SupplierOfInstance
       4: ifeq          24
       7: aload_1
       8: checkcast     #2                  // class com/google/common/base/Suppliers$SupplierOfInstance
      11: astore_1
      12: aload_0
      13: getfield      #26                 // Field instance:Ljava/lang/Object;
      16: aload_1
      17: getfield      #26                 // Field instance:Ljava/lang/Object;
      20: invokestatic  #37                 // Method com/google/common/base/Objects.equal:(Ljava/lang/Object;Ljava/lang/Object;)Z
      23: ireturn
      24: iconst_0
      25: ireturn

  public T get();
    Code:
       0: aload_0
       1: getfield      #26                 // Field instance:Ljava/lang/Object;
       4: areturn

  public int hashCode();
    Code:
       0: iconst_1
       1: anewarray     #5                  // class java/lang/Object
       4: dup
       5: iconst_0
       6: aload_0
       7: getfield      #26                 // Field instance:Ljava/lang/Object;
      10: aastore
      11: invokestatic  #45                 // Method com/google/common/base/Objects.hashCode:([Ljava/lang/Object;)I
      14: ireturn

  public java.lang.String toString();
    Code:
       0: new           #49                 // class java/lang/StringBuilder
       3: dup
       4: invokespecial #50                 // Method java/lang/StringBuilder."<init>":()V
       7: astore_1
       8: aload_1
       9: ldc           #52                 // String Suppliers.ofInstance(
      11: invokevirtual #56                 // Method java/lang/StringBuilder.append:(Ljava/lang/String;)Ljava/lang/StringBuilder;
      14: pop
      15: aload_1
      16: aload_0
      17: getfield      #26                 // Field instance:Ljava/lang/Object;
      20: invokevirtual #59                 // Method java/lang/StringBuilder.append:(Ljava/lang/Object;)Ljava/lang/StringBuilder;
      23: pop
      24: aload_1
      25: ldc           #61                 // String )
      27: invokevirtual #56                 // Method java/lang/StringBuilder.append:(Ljava/lang/String;)Ljava/lang/StringBuilder;
      30: pop
      31: aload_1
      32: invokevirtual #63                 // Method java/lang/StringBuilder.toString:()Ljava/lang/String;
      35: areturn
}
