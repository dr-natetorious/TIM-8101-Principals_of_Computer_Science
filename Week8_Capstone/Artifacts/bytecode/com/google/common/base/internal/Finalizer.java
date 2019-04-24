public class com.google.common.base.internal.Finalizer implements java.lang.Runnable {
  static {};
    Code:
       0: ldc           #2                  // class com/google/common/base/internal/Finalizer
       2: invokevirtual #34                 // Method java/lang/Class.getName:()Ljava/lang/String;
       5: invokestatic  #40                 // Method java/util/logging/Logger.getLogger:(Ljava/lang/String;)Ljava/util/logging/Logger;
       8: putstatic     #42                 // Field logger:Ljava/util/logging/Logger;
      11: invokestatic  #46                 // Method getBigThreadConstructor:()Ljava/lang/reflect/Constructor;
      14: putstatic     #48                 // Field bigThreadConstructor:Ljava/lang/reflect/Constructor;
      17: getstatic     #48                 // Field bigThreadConstructor:Ljava/lang/reflect/Constructor;
      20: ifnonnull     30
      23: invokestatic  #52                 // Method getInheritableThreadLocalsField:()Ljava/lang/reflect/Field;
      26: astore_0
      27: goto          32
      30: aconst_null
      31: astore_0
      32: aload_0
      33: putstatic     #54                 // Field inheritableThreadLocals:Ljava/lang/reflect/Field;
      36: return

  public static void startFinalizer(java.lang.Class<?>, java.lang.ref.ReferenceQueue<java.lang.Object>, java.lang.ref.PhantomReference<java.lang.Object>);
    Code:
       0: aload_0
       1: invokevirtual #34                 // Method java/lang/Class.getName:()Ljava/lang/String;
       4: ldc           #10                 // String com.google.common.base.FinalizableReference
       6: invokevirtual #169                // Method java/lang/String.equals:(Ljava/lang/Object;)Z
       9: ifne          22
      12: new           #171                // class java/lang/IllegalArgumentException
      15: dup
      16: ldc           #173                // String Expected com.google.common.base.FinalizableReference.
      18: invokespecial #176                // Method java/lang/IllegalArgumentException."<init>":(Ljava/lang/String;)V
      21: athrow
      22: new           #2                  // class com/google/common/base/internal/Finalizer
      25: dup
      26: aload_0
      27: aload_1
      28: aload_2
      29: invokespecial #178                // Method "<init>":(Ljava/lang/Class;Ljava/lang/ref/ReferenceQueue;Ljava/lang/ref/PhantomReference;)V
      32: astore_2
      33: ldc           #2                  // class com/google/common/base/internal/Finalizer
      35: invokevirtual #34                 // Method java/lang/Class.getName:()Ljava/lang/String;
      38: astore_3
      39: getstatic     #48                 // Field bigThreadConstructor:Ljava/lang/reflect/Constructor;
      42: ifnull        104
      45: getstatic     #48                 // Field bigThreadConstructor:Ljava/lang/reflect/Constructor;
      48: iconst_5
      49: anewarray     #4                  // class java/lang/Object
      52: dup
      53: iconst_0
      54: aconst_null
      55: checkcast     #114                // class java/lang/ThreadGroup
      58: aastore
      59: dup
      60: iconst_1
      61: aload_2
      62: aastore
      63: dup
      64: iconst_2
      65: aload_3
      66: aastore
      67: dup
      68: iconst_3
      69: lconst_0
      70: invokestatic  #182                // Method java/lang/Long.valueOf:(J)Ljava/lang/Long;
      73: aastore
      74: dup
      75: iconst_4
      76: iconst_0
      77: invokestatic  #185                // Method java/lang/Boolean.valueOf:(Z)Ljava/lang/Boolean;
      80: aastore
      81: invokevirtual #191                // Method java/lang/reflect/Constructor.newInstance:([Ljava/lang/Object;)Ljava/lang/Object;
      84: checkcast     #112                // class java/lang/Thread
      87: astore_0
      88: goto          106
      91: astore_0
      92: getstatic     #42                 // Field logger:Ljava/util/logging/Logger;
      95: getstatic     #159                // Field java/util/logging/Level.INFO:Ljava/util/logging/Level;
      98: ldc           #193                // String Failed to create a thread without inherited thread-local values
     100: aload_0
     101: invokevirtual #103                // Method java/util/logging/Logger.log:(Ljava/util/logging/Level;Ljava/lang/String;Ljava/lang/Throwable;)V
     104: aconst_null
     105: astore_0
     106: aload_0
     107: astore_1
     108: aload_0
     109: ifnonnull     126
     112: new           #112                // class java/lang/Thread
     115: dup
     116: aconst_null
     117: checkcast     #114                // class java/lang/ThreadGroup
     120: aload_2
     121: aload_3
     122: invokespecial #196                // Method java/lang/Thread."<init>":(Ljava/lang/ThreadGroup;Ljava/lang/Runnable;Ljava/lang/String;)V
     125: astore_1
     126: aload_1
     127: iconst_1
     128: invokevirtual #199                // Method java/lang/Thread.setDaemon:(Z)V
     131: getstatic     #54                 // Field inheritableThreadLocals:Ljava/lang/reflect/Field;
     134: ifnull        161
     137: getstatic     #54                 // Field inheritableThreadLocals:Ljava/lang/reflect/Field;
     140: aload_1
     141: aconst_null
     142: invokevirtual #203                // Method java/lang/reflect/Field.set:(Ljava/lang/Object;Ljava/lang/Object;)V
     145: goto          161
     148: astore_0
     149: getstatic     #42                 // Field logger:Ljava/util/logging/Logger;
     152: getstatic     #159                // Field java/util/logging/Level.INFO:Ljava/util/logging/Level;
     155: ldc           #205                // String Failed to clear thread local values inherited by reference finalizer thread.
     157: aload_0
     158: invokevirtual #103                // Method java/util/logging/Logger.log:(Ljava/util/logging/Level;Ljava/lang/String;Ljava/lang/Throwable;)V
     161: aload_1
     162: invokevirtual #208                // Method java/lang/Thread.start:()V
     165: return
    Exception table:
       from    to  target type
          45    88    91   Class java/lang/Throwable
         131   145   148   Class java/lang/Throwable

  public void run();
    Code:
       0: aload_0
       1: aload_0
       2: getfield      #61                 // Field queue:Ljava/lang/ref/ReferenceQueue;
       5: invokevirtual #214                // Method java/lang/ref/ReferenceQueue.remove:()Ljava/lang/ref/Reference;
       8: invokespecial #216                // Method cleanUp:(Ljava/lang/ref/Reference;)Z
      11: istore_1
      12: iload_1
      13: ifne          0
      16: return
      17: astore_2
      18: goto          0
    Exception table:
       from    to  target type
           0    12    17   Class java/lang/InterruptedException
}
