class com.google.common.base.FinalizableReferenceQueue$DirectLoader implements com.google.common.base.FinalizableReferenceQueue$FinalizerLoader {
  com.google.common.base.FinalizableReferenceQueue$DirectLoader();
    Code:
       0: aload_0
       1: invokespecial #13                 // Method java/lang/Object."<init>":()V
       4: return

  public java.lang.Class<?> loadFinalizer();
    Code:
       0: ldc           #20                 // String com.google.common.base.internal.Finalizer
       2: invokestatic  #26                 // Method java/lang/Class.forName:(Ljava/lang/String;)Ljava/lang/Class;
       5: astore_1
       6: aload_1
       7: areturn
       8: astore_1
       9: new           #28                 // class java/lang/AssertionError
      12: dup
      13: aload_1
      14: invokespecial #31                 // Method java/lang/AssertionError."<init>":(Ljava/lang/Object;)V
      17: athrow
    Exception table:
       from    to  target type
           0     6     8   Class java/lang/ClassNotFoundException
}
