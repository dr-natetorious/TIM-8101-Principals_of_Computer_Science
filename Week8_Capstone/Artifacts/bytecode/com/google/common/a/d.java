final class com.google.common.a.d {
  static int a(int, java.lang.String);
    Code:
       0: iload_0
       1: ifge          43
       4: new           #9                  // class java/lang/StringBuilder
       7: dup
       8: invokespecial #13                 // Method java/lang/StringBuilder."<init>":()V
      11: astore_2
      12: aload_2
      13: aload_1
      14: invokevirtual #17                 // Method java/lang/StringBuilder.append:(Ljava/lang/String;)Ljava/lang/StringBuilder;
      17: pop
      18: aload_2
      19: ldc           #19                 // String  cannot be negative but was:
      21: invokevirtual #17                 // Method java/lang/StringBuilder.append:(Ljava/lang/String;)Ljava/lang/StringBuilder;
      24: pop
      25: aload_2
      26: iload_0
      27: invokevirtual #22                 // Method java/lang/StringBuilder.append:(I)Ljava/lang/StringBuilder;
      30: pop
      31: new           #24                 // class java/lang/IllegalArgumentException
      34: dup
      35: aload_2
      36: invokevirtual #28                 // Method java/lang/StringBuilder.toString:()Ljava/lang/String;
      39: invokespecial #31                 // Method java/lang/IllegalArgumentException."<init>":(Ljava/lang/String;)V
      42: athrow
      43: iload_0
      44: ireturn

  static void a(boolean);
    Code:
       0: iload_0
       1: ldc           #36                 // String no calls to next() since the last call to remove()
       3: invokestatic  #42                 // Method com/google/common/base/Preconditions.checkState:(ZLjava/lang/Object;)V
       6: return
}
