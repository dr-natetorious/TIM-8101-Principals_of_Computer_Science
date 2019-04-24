final class com.google.common.base.Equivalence$Identity extends com.google.common.base.Equivalence<java.lang.Object> implements java.io.Serializable {
  static final com.google.common.base.Equivalence$Identity INSTANCE;

  static {};
    Code:
       0: new           #2                  // class com/google/common/base/Equivalence$Identity
       3: dup
       4: invokespecial #19                 // Method "<init>":()V
       7: putstatic     #21                 // Field INSTANCE:Lcom/google/common/base/Equivalence$Identity;
      10: return

  com.google.common.base.Equivalence$Identity();
    Code:
       0: aload_0
       1: invokespecial #23                 // Method com/google/common/base/Equivalence."<init>":()V
       4: return

  protected boolean doEquivalent(java.lang.Object, java.lang.Object);
    Code:
       0: iconst_0
       1: ireturn

  protected int doHash(java.lang.Object);
    Code:
       0: aload_1
       1: invokestatic  #34                 // Method java/lang/System.identityHashCode:(Ljava/lang/Object;)I
       4: ireturn
}
