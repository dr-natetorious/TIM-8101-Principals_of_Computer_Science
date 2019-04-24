class com.google.common.base.FinalizableReferenceQueue$SystemLoader implements com.google.common.base.FinalizableReferenceQueue$FinalizerLoader {
  static boolean disabled;

  com.google.common.base.FinalizableReferenceQueue$SystemLoader();
    Code:
       0: aload_0
       1: invokespecial #15                 // Method java/lang/Object."<init>":()V
       4: return

  public java.lang.Class<?> loadFinalizer();
    Code:
       0: getstatic     #24                 // Field disabled:Z
       3: ifeq          8
       6: aconst_null
       7: areturn
       8: invokestatic  #30                 // Method java/lang/ClassLoader.getSystemClassLoader:()Ljava/lang/ClassLoader;
      11: astore_1
      12: aload_1
      13: ifnull        25
      16: aload_1
      17: ldc           #32                 // String com.google.common.base.internal.Finalizer
      19: invokevirtual #36                 // Method java/lang/ClassLoader.loadClass:(Ljava/lang/String;)Ljava/lang/Class;
      22: astore_1
      23: aload_1
      24: areturn
      25: aconst_null
      26: areturn
      27: invokestatic  #40                 // Method com/google/common/base/FinalizableReferenceQueue.access$000:()Ljava/util/logging/Logger;
      30: ldc           #42                 // String Not allowed to access system class loader.
      32: invokevirtual #48                 // Method java/util/logging/Logger.info:(Ljava/lang/String;)V
      35: aconst_null
      36: areturn
      37: astore_1
      38: goto          27
      41: astore_1
      42: aconst_null
      43: areturn
    Exception table:
       from    to  target type
           8    12    37   Class java/lang/SecurityException
          16    23    41   Class java/lang/ClassNotFoundException
}
