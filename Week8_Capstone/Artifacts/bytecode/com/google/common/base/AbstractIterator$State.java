final class com.google.common.base.AbstractIterator$State extends java.lang.Enum<com.google.common.base.AbstractIterator$State> {
  public static final com.google.common.base.AbstractIterator$State DONE;

  public static final com.google.common.base.AbstractIterator$State FAILED;

  public static final com.google.common.base.AbstractIterator$State NOT_READY;

  public static final com.google.common.base.AbstractIterator$State READY;

  static {};
    Code:
       0: new           #2                  // class com/google/common/base/AbstractIterator$State
       3: dup
       4: ldc           #18                 // String READY
       6: iconst_0
       7: invokespecial #22                 // Method "<init>":(Ljava/lang/String;I)V
      10: putstatic     #24                 // Field READY:Lcom/google/common/base/AbstractIterator$State;
      13: new           #2                  // class com/google/common/base/AbstractIterator$State
      16: dup
      17: ldc           #25                 // String NOT_READY
      19: iconst_1
      20: invokespecial #22                 // Method "<init>":(Ljava/lang/String;I)V
      23: putstatic     #27                 // Field NOT_READY:Lcom/google/common/base/AbstractIterator$State;
      26: new           #2                  // class com/google/common/base/AbstractIterator$State
      29: dup
      30: ldc           #28                 // String DONE
      32: iconst_2
      33: invokespecial #22                 // Method "<init>":(Ljava/lang/String;I)V
      36: putstatic     #30                 // Field DONE:Lcom/google/common/base/AbstractIterator$State;
      39: new           #2                  // class com/google/common/base/AbstractIterator$State
      42: dup
      43: ldc           #31                 // String FAILED
      45: iconst_3
      46: invokespecial #22                 // Method "<init>":(Ljava/lang/String;I)V
      49: putstatic     #33                 // Field FAILED:Lcom/google/common/base/AbstractIterator$State;
      52: iconst_4
      53: anewarray     #2                  // class com/google/common/base/AbstractIterator$State
      56: dup
      57: iconst_0
      58: getstatic     #24                 // Field READY:Lcom/google/common/base/AbstractIterator$State;
      61: aastore
      62: dup
      63: iconst_1
      64: getstatic     #27                 // Field NOT_READY:Lcom/google/common/base/AbstractIterator$State;
      67: aastore
      68: dup
      69: iconst_2
      70: getstatic     #30                 // Field DONE:Lcom/google/common/base/AbstractIterator$State;
      73: aastore
      74: dup
      75: iconst_3
      76: getstatic     #33                 // Field FAILED:Lcom/google/common/base/AbstractIterator$State;
      79: aastore
      80: putstatic     #35                 // Field $VALUES:[Lcom/google/common/base/AbstractIterator$State;
      83: return

  public static com.google.common.base.AbstractIterator$State valueOf(java.lang.String);
    Code:
       0: ldc           #2                  // class com/google/common/base/AbstractIterator$State
       2: aload_0
       3: invokestatic  #43                 // Method java/lang/Enum.valueOf:(Ljava/lang/Class;Ljava/lang/String;)Ljava/lang/Enum;
       6: checkcast     #2                  // class com/google/common/base/AbstractIterator$State
       9: areturn

  public static com.google.common.base.AbstractIterator$State[] values();
    Code:
       0: getstatic     #35                 // Field $VALUES:[Lcom/google/common/base/AbstractIterator$State;
       3: invokevirtual #50                 // Method "[Lcom/google/common/base/AbstractIterator$State;".clone:()Ljava/lang/Object;
       6: checkcast     #46                 // class "[Lcom/google/common/base/AbstractIterator$State;"
       9: areturn
}
