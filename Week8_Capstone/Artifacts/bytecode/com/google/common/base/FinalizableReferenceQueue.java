public class com.google.common.base.FinalizableReferenceQueue implements java.io.Closeable {
  final java.lang.ref.PhantomReference<java.lang.Object> frqRef;

  final java.lang.ref.ReferenceQueue<java.lang.Object> queue;

  final boolean threadStarted;

  static {};
    Code:
       0: ldc           #2                  // class com/google/common/base/FinalizableReferenceQueue
       2: invokevirtual #42                 // Method java/lang/Class.getName:()Ljava/lang/String;
       5: invokestatic  #48                 // Method java/util/logging/Logger.getLogger:(Ljava/lang/String;)Ljava/util/logging/Logger;
       8: putstatic     #50                 // Field logger:Ljava/util/logging/Logger;
      11: iconst_3
      12: anewarray     #14                 // class com/google/common/base/FinalizableReferenceQueue$FinalizerLoader
      15: dup
      16: iconst_0
      17: new           #17                 // class com/google/common/base/FinalizableReferenceQueue$SystemLoader
      20: dup
      21: invokespecial #53                 // Method com/google/common/base/FinalizableReferenceQueue$SystemLoader."<init>":()V
      24: aastore
      25: dup
      26: iconst_1
      27: new           #8                  // class com/google/common/base/FinalizableReferenceQueue$DecoupledLoader
      30: dup
      31: invokespecial #54                 // Method com/google/common/base/FinalizableReferenceQueue$DecoupledLoader."<init>":()V
      34: aastore
      35: dup
      36: iconst_2
      37: new           #11                 // class com/google/common/base/FinalizableReferenceQueue$DirectLoader
      40: dup
      41: invokespecial #55                 // Method com/google/common/base/FinalizableReferenceQueue$DirectLoader."<init>":()V
      44: aastore
      45: invokestatic  #59                 // Method loadFinalizer:([Lcom/google/common/base/FinalizableReferenceQueue$FinalizerLoader;)Ljava/lang/Class;
      48: invokestatic  #63                 // Method getStartFinalizer:(Ljava/lang/Class;)Ljava/lang/reflect/Method;
      51: putstatic     #65                 // Field startFinalizer:Ljava/lang/reflect/Method;
      54: return

  public com.google.common.base.FinalizableReferenceQueue();
    Code:
       0: aload_0
       1: invokespecial #71                 // Method java/lang/Object."<init>":()V
       4: aload_0
       5: new           #73                 // class java/lang/ref/ReferenceQueue
       8: dup
       9: invokespecial #74                 // Method java/lang/ref/ReferenceQueue."<init>":()V
      12: putfield      #76                 // Field queue:Ljava/lang/ref/ReferenceQueue;
      15: aload_0
      16: new           #78                 // class java/lang/ref/PhantomReference
      19: dup
      20: aload_0
      21: aload_0
      22: getfield      #76                 // Field queue:Ljava/lang/ref/ReferenceQueue;
      25: invokespecial #81                 // Method java/lang/ref/PhantomReference."<init>":(Ljava/lang/Object;Ljava/lang/ref/ReferenceQueue;)V
      28: putfield      #83                 // Field frqRef:Ljava/lang/ref/PhantomReference;
      31: iconst_1
      32: istore_1
      33: getstatic     #65                 // Field startFinalizer:Ljava/lang/reflect/Method;
      36: aconst_null
      37: iconst_3
      38: anewarray     #4                  // class java/lang/Object
      41: dup
      42: iconst_0
      43: ldc           #85                 // class com/google/common/base/FinalizableReference
      45: aastore
      46: dup
      47: iconst_1
      48: aload_0
      49: getfield      #76                 // Field queue:Ljava/lang/ref/ReferenceQueue;
      52: aastore
      53: dup
      54: iconst_2
      55: aload_0
      56: getfield      #83                 // Field frqRef:Ljava/lang/ref/PhantomReference;
      59: aastore
      60: invokevirtual #91                 // Method java/lang/reflect/Method.invoke:(Ljava/lang/Object;[Ljava/lang/Object;)Ljava/lang/Object;
      63: pop
      64: goto          82
      67: astore_2
      68: getstatic     #50                 // Field logger:Ljava/util/logging/Logger;
      71: getstatic     #97                 // Field java/util/logging/Level.INFO:Ljava/util/logging/Level;
      74: ldc           #99                 // String Failed to start reference finalizer thread. Reference cleanup will only occur when new references are created.
      76: aload_2
      77: invokevirtual #103                // Method java/util/logging/Logger.log:(Ljava/util/logging/Level;Ljava/lang/String;Ljava/lang/Throwable;)V
      80: iconst_0
      81: istore_1
      82: aload_0
      83: iload_1
      84: putfield      #105                // Field threadStarted:Z
      87: return
      88: astore_2
      89: new           #107                // class java/lang/AssertionError
      92: dup
      93: aload_2
      94: invokespecial #110                // Method java/lang/AssertionError."<init>":(Ljava/lang/Object;)V
      97: athrow
    Exception table:
       from    to  target type
          33    64    88   Class java/lang/IllegalAccessException
          33    64    67   Class java/lang/Throwable

  static java.util.logging.Logger access$000();
    Code:
       0: getstatic     #50                 // Field logger:Ljava/util/logging/Logger;
       3: areturn

  static java.lang.reflect.Method getStartFinalizer(java.lang.Class<?>);
    Code:
       0: aload_0
       1: ldc           #115                // String startFinalizer
       3: iconst_3
       4: anewarray     #38                 // class java/lang/Class
       7: dup
       8: iconst_0
       9: ldc           #38                 // class java/lang/Class
      11: aastore
      12: dup
      13: iconst_1
      14: ldc           #73                 // class java/lang/ref/ReferenceQueue
      16: aastore
      17: dup
      18: iconst_2
      19: ldc           #78                 // class java/lang/ref/PhantomReference
      21: aastore
      22: invokevirtual #119                // Method java/lang/Class.getMethod:(Ljava/lang/String;[Ljava/lang/Class;)Ljava/lang/reflect/Method;
      25: astore_0
      26: aload_0
      27: areturn
      28: astore_0
      29: new           #107                // class java/lang/AssertionError
      32: dup
      33: aload_0
      34: invokespecial #110                // Method java/lang/AssertionError."<init>":(Ljava/lang/Object;)V
      37: athrow
    Exception table:
       from    to  target type
           0    26    28   Class java/lang/NoSuchMethodException

  void cleanUp();
    Code:
       0: aload_0
       1: getfield      #105                // Field threadStarted:Z
       4: ifeq          8
       7: return
       8: aload_0
       9: getfield      #76                 // Field queue:Ljava/lang/ref/ReferenceQueue;
      12: invokevirtual #131                // Method java/lang/ref/ReferenceQueue.poll:()Ljava/lang/ref/Reference;
      15: astore_1
      16: aload_1
      17: ifnull        52
      20: aload_1
      21: invokevirtual #136                // Method java/lang/ref/Reference.clear:()V
      24: aload_1
      25: checkcast     #85                 // class com/google/common/base/FinalizableReference
      28: invokeinterface #139,  1          // InterfaceMethod com/google/common/base/FinalizableReference.finalizeReferent:()V
      33: goto          8
      36: astore_1
      37: getstatic     #50                 // Field logger:Ljava/util/logging/Logger;
      40: getstatic     #142                // Field java/util/logging/Level.SEVERE:Ljava/util/logging/Level;
      43: ldc           #144                // String Error cleaning up after reference.
      45: aload_1
      46: invokevirtual #103                // Method java/util/logging/Logger.log:(Ljava/util/logging/Level;Ljava/lang/String;Ljava/lang/Throwable;)V
      49: goto          8
      52: return
    Exception table:
       from    to  target type
          24    33    36   Class java/lang/Throwable

  public void close();
    Code:
       0: aload_0
       1: getfield      #83                 // Field frqRef:Ljava/lang/ref/PhantomReference;
       4: invokevirtual #149                // Method java/lang/ref/PhantomReference.enqueue:()Z
       7: pop
       8: aload_0
       9: invokevirtual #151                // Method cleanUp:()V
      12: return
}
