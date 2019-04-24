public abstract class com.google.common.base.FinalizablePhantomReference<T> extends java.lang.ref.PhantomReference<T> implements com.google.common.base.FinalizableReference {
  protected com.google.common.base.FinalizablePhantomReference(T, com.google.common.base.FinalizableReferenceQueue);
    Code:
       0: aload_0
       1: aload_1
       2: aload_2
       3: getfield      #15                 // Field com/google/common/base/FinalizableReferenceQueue.queue:Ljava/lang/ref/ReferenceQueue;
       6: invokespecial #18                 // Method java/lang/ref/PhantomReference."<init>":(Ljava/lang/Object;Ljava/lang/ref/ReferenceQueue;)V
       9: aload_2
      10: invokevirtual #22                 // Method com/google/common/base/FinalizableReferenceQueue.cleanUp:()V
      13: return
}
