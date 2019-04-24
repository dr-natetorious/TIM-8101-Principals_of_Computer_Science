final class com.google.common.base.Throwables$1 extends java.util.AbstractList<java.lang.StackTraceElement> {
  final java.lang.Throwable val$t;

  com.google.common.base.Throwables$1(java.lang.Throwable);
    Code:
       0: aload_0
       1: aload_1
       2: putfield      #16                 // Field val$t:Ljava/lang/Throwable;
       5: aload_0
       6: invokespecial #19                 // Method java/util/AbstractList."<init>":()V
       9: return

  public java.lang.Object get(int);
    Code:
       0: aload_0
       1: iload_1
       2: invokevirtual #25                 // Method get:(I)Ljava/lang/StackTraceElement;
       5: areturn

  public java.lang.StackTraceElement get(int);
    Code:
       0: invokestatic  #29                 // Method com/google/common/base/Throwables.access$000:()Ljava/lang/reflect/Method;
       3: invokestatic  #33                 // Method com/google/common/base/Throwables.access$100:()Ljava/lang/Object;
       6: iconst_2
       7: anewarray     #35                 // class java/lang/Object
      10: dup
      11: iconst_0
      12: aload_0
      13: getfield      #16                 // Field val$t:Ljava/lang/Throwable;
      16: aastore
      17: dup
      18: iconst_1
      19: iload_1
      20: invokestatic  #41                 // Method java/lang/Integer.valueOf:(I)Ljava/lang/Integer;
      23: aastore
      24: invokestatic  #45                 // Method com/google/common/base/Throwables.access$200:(Ljava/lang/reflect/Method;Ljava/lang/Object;[Ljava/lang/Object;)Ljava/lang/Object;
      27: checkcast     #47                 // class java/lang/StackTraceElement
      30: areturn

  public int size();
    Code:
       0: invokestatic  #52                 // Method com/google/common/base/Throwables.access$300:()Ljava/lang/reflect/Method;
       3: invokestatic  #33                 // Method com/google/common/base/Throwables.access$100:()Ljava/lang/Object;
       6: iconst_1
       7: anewarray     #35                 // class java/lang/Object
      10: dup
      11: iconst_0
      12: aload_0
      13: getfield      #16                 // Field val$t:Ljava/lang/Throwable;
      16: aastore
      17: invokestatic  #45                 // Method com/google/common/base/Throwables.access$200:(Ljava/lang/reflect/Method;Ljava/lang/Object;[Ljava/lang/Object;)Ljava/lang/Object;
      20: checkcast     #37                 // class java/lang/Integer
      23: invokevirtual #55                 // Method java/lang/Integer.intValue:()I
      26: ireturn
}
