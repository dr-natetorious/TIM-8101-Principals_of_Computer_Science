final class com.google.common.base.Equivalence$Equals extends com.google.common.base.Equivalence<java.lang.Object> implements java.io.Serializable {
  static final com.google.common.base.Equivalence$Equals INSTANCE;

  static {};
    Code:
       0: new           #2                  // class com/google/common/base/Equivalence$Equals
       3: dup
       4: invokespecial #19                 // Method "<init>":()V
       7: putstatic     #21                 // Field INSTANCE:Lcom/google/common/base/Equivalence$Equals;
      10: return

  com.google.common.base.Equivalence$Equals();
    Code:
       0: aload_0
       1: invokespecial #23                 // Method com/google/common/base/Equivalence."<init>":()V
       4: return

  protected boolean doEquivalent(java.lang.Object, java.lang.Object);
    Code:
       0: aload_1
       1: aload_2
       2: invokevirtual #33                 // Method java/lang/Object.equals:(Ljava/lang/Object;)Z
       5: ireturn

  protected int doHash(java.lang.Object);
    Code:
       0: aload_1
       1: invokevirtual #39                 // Method java/lang/Object.hashCode:()I
       4: ireturn
}
