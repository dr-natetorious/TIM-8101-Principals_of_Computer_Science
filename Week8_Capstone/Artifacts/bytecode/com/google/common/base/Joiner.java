public class com.google.common.base.Joiner {
  com.google.common.base.Joiner(com.google.common.base.Joiner, com.google.common.base.Joiner$1);
    Code:
       0: aload_0
       1: aload_1
       2: invokespecial #26                 // Method "<init>":(Lcom/google/common/base/Joiner;)V
       5: return

  static java.lang.String access$100(com.google.common.base.Joiner);
    Code:
       0: aload_0
       1: getfield      #22                 // Field separator:Ljava/lang/String;
       4: areturn

  public static com.google.common.base.Joiner on(char);
    Code:
       0: new           #2                  // class com/google/common/base/Joiner
       3: dup
       4: iload_0
       5: invokestatic  #50                 // Method java/lang/String.valueOf:(C)Ljava/lang/String;
       8: invokespecial #52                 // Method "<init>":(Ljava/lang/String;)V
      11: areturn

  public static com.google.common.base.Joiner on(java.lang.String);
    Code:
       0: new           #2                  // class com/google/common/base/Joiner
       3: dup
       4: aload_0
       5: invokespecial #52                 // Method "<init>":(Ljava/lang/String;)V
       8: areturn

  public <A extends java.lang.Appendable> A appendTo(A, java.lang.Iterable<?>);
    Code:
       0: aload_0
       1: aload_1
       2: aload_2
       3: invokeinterface #62,  1           // InterfaceMethod java/lang/Iterable.iterator:()Ljava/util/Iterator;
       8: invokevirtual #65                 // Method appendTo:(Ljava/lang/Appendable;Ljava/util/Iterator;)Ljava/lang/Appendable;
      11: areturn

  public final <A extends java.lang.Appendable> A appendTo(A, java.lang.Object, java.lang.Object, java.lang.Object...);
    Code:
       0: aload_0
       1: aload_1
       2: aload_2
       3: aload_3
       4: aload         4
       6: invokestatic  #70                 // Method iterable:(Ljava/lang/Object;Ljava/lang/Object;[Ljava/lang/Object;)Ljava/lang/Iterable;
       9: invokevirtual #72                 // Method appendTo:(Ljava/lang/Appendable;Ljava/lang/Iterable;)Ljava/lang/Appendable;
      12: areturn

  public <A extends java.lang.Appendable> A appendTo(A, java.util.Iterator<?>);
    Code:
       0: aload_1
       1: invokestatic  #33                 // Method com/google/common/base/Preconditions.checkNotNull:(Ljava/lang/Object;)Ljava/lang/Object;
       4: pop
       5: aload_2
       6: invokeinterface #79,  1           // InterfaceMethod java/util/Iterator.hasNext:()Z
      11: ifeq          54
      14: aload_1
      15: aload_0
      16: aload_2
      17: invokeinterface #83,  1           // InterfaceMethod java/util/Iterator.next:()Ljava/lang/Object;
      22: invokevirtual #87                 // Method toString:(Ljava/lang/Object;)Ljava/lang/CharSequence;
      25: invokeinterface #93,  2           // InterfaceMethod java/lang/Appendable.append:(Ljava/lang/CharSequence;)Ljava/lang/Appendable;
      30: pop
      31: aload_2
      32: invokeinterface #79,  1           // InterfaceMethod java/util/Iterator.hasNext:()Z
      37: ifeq          54
      40: aload_1
      41: aload_0
      42: getfield      #22                 // Field separator:Ljava/lang/String;
      45: invokeinterface #93,  2           // InterfaceMethod java/lang/Appendable.append:(Ljava/lang/CharSequence;)Ljava/lang/Appendable;
      50: pop
      51: goto          14
      54: aload_1
      55: areturn

  public final <A extends java.lang.Appendable> A appendTo(A, java.lang.Object[]);
    Code:
       0: aload_0
       1: aload_1
       2: aload_2
       3: invokestatic  #101                // Method java/util/Arrays.asList:([Ljava/lang/Object;)Ljava/util/List;
       6: invokevirtual #72                 // Method appendTo:(Ljava/lang/Appendable;Ljava/lang/Iterable;)Ljava/lang/Appendable;
       9: areturn

  public final java.lang.StringBuilder appendTo(java.lang.StringBuilder, java.lang.Iterable<?>);
    Code:
       0: aload_0
       1: aload_1
       2: aload_2
       3: invokeinterface #62,  1           // InterfaceMethod java/lang/Iterable.iterator:()Ljava/util/Iterator;
       8: invokevirtual #106                // Method appendTo:(Ljava/lang/StringBuilder;Ljava/util/Iterator;)Ljava/lang/StringBuilder;
      11: areturn

  public final java.lang.StringBuilder appendTo(java.lang.StringBuilder, java.lang.Object, java.lang.Object, java.lang.Object...);
    Code:
       0: aload_0
       1: aload_1
       2: aload_2
       3: aload_3
       4: aload         4
       6: invokestatic  #70                 // Method iterable:(Ljava/lang/Object;Ljava/lang/Object;[Ljava/lang/Object;)Ljava/lang/Iterable;
       9: invokevirtual #110                // Method appendTo:(Ljava/lang/StringBuilder;Ljava/lang/Iterable;)Ljava/lang/StringBuilder;
      12: areturn

  public final java.lang.StringBuilder appendTo(java.lang.StringBuilder, java.util.Iterator<?>);
    Code:
       0: aload_0
       1: aload_1
       2: aload_2
       3: invokevirtual #65                 // Method appendTo:(Ljava/lang/Appendable;Ljava/util/Iterator;)Ljava/lang/Appendable;
       6: pop
       7: aload_1
       8: areturn
       9: astore_1
      10: new           #114                // class java/lang/AssertionError
      13: dup
      14: aload_1
      15: invokespecial #117                // Method java/lang/AssertionError."<init>":(Ljava/lang/Object;)V
      18: athrow
    Exception table:
       from    to  target type
           0     7     9   Class java/io/IOException

  public final java.lang.StringBuilder appendTo(java.lang.StringBuilder, java.lang.Object[]);
    Code:
       0: aload_0
       1: aload_1
       2: aload_2
       3: invokestatic  #101                // Method java/util/Arrays.asList:([Ljava/lang/Object;)Ljava/util/List;
       6: invokevirtual #110                // Method appendTo:(Ljava/lang/StringBuilder;Ljava/lang/Iterable;)Ljava/lang/StringBuilder;
       9: areturn

  public final java.lang.String join(java.lang.Iterable<?>);
    Code:
       0: aload_0
       1: aload_1
       2: invokeinterface #62,  1           // InterfaceMethod java/lang/Iterable.iterator:()Ljava/util/Iterator;
       7: invokevirtual #124                // Method join:(Ljava/util/Iterator;)Ljava/lang/String;
      10: areturn

  public final java.lang.String join(java.lang.Object, java.lang.Object, java.lang.Object...);
    Code:
       0: aload_0
       1: aload_1
       2: aload_2
       3: aload_3
       4: invokestatic  #70                 // Method iterable:(Ljava/lang/Object;Ljava/lang/Object;[Ljava/lang/Object;)Ljava/lang/Iterable;
       7: invokevirtual #128                // Method join:(Ljava/lang/Iterable;)Ljava/lang/String;
      10: areturn

  public final java.lang.String join(java.util.Iterator<?>);
    Code:
       0: aload_0
       1: new           #130                // class java/lang/StringBuilder
       4: dup
       5: invokespecial #131                // Method java/lang/StringBuilder."<init>":()V
       8: aload_1
       9: invokevirtual #106                // Method appendTo:(Ljava/lang/StringBuilder;Ljava/util/Iterator;)Ljava/lang/StringBuilder;
      12: invokevirtual #134                // Method java/lang/StringBuilder.toString:()Ljava/lang/String;
      15: areturn

  public final java.lang.String join(java.lang.Object[]);
    Code:
       0: aload_0
       1: aload_1
       2: invokestatic  #101                // Method java/util/Arrays.asList:([Ljava/lang/Object;)Ljava/util/List;
       5: invokevirtual #128                // Method join:(Ljava/lang/Iterable;)Ljava/lang/String;
       8: areturn

  public com.google.common.base.Joiner skipNulls();
    Code:
       0: new           #8                  // class com/google/common/base/Joiner$2
       3: dup
       4: aload_0
       5: aload_0
       6: invokespecial #141                // Method com/google/common/base/Joiner$2."<init>":(Lcom/google/common/base/Joiner;Lcom/google/common/base/Joiner;)V
       9: areturn

  java.lang.CharSequence toString(java.lang.Object);
    Code:
       0: aload_1
       1: invokestatic  #33                 // Method com/google/common/base/Preconditions.checkNotNull:(Ljava/lang/Object;)Ljava/lang/Object;
       4: pop
       5: aload_1
       6: instanceof    #143                // class java/lang/CharSequence
       9: ifeq          17
      12: aload_1
      13: checkcast     #143                // class java/lang/CharSequence
      16: areturn
      17: aload_1
      18: invokevirtual #144                // Method java/lang/Object.toString:()Ljava/lang/String;
      21: areturn

  public com.google.common.base.Joiner useForNull(java.lang.String);
    Code:
       0: aload_1
       1: invokestatic  #33                 // Method com/google/common/base/Preconditions.checkNotNull:(Ljava/lang/Object;)Ljava/lang/Object;
       4: pop
       5: new           #6                  // class com/google/common/base/Joiner$1
       8: dup
       9: aload_0
      10: aload_0
      11: aload_1
      12: invokespecial #148                // Method com/google/common/base/Joiner$1."<init>":(Lcom/google/common/base/Joiner;Lcom/google/common/base/Joiner;Ljava/lang/String;)V
      15: areturn

  public com.google.common.base.Joiner$MapJoiner withKeyValueSeparator(char);
    Code:
       0: aload_0
       1: iload_1
       2: invokestatic  #50                 // Method java/lang/String.valueOf:(C)Ljava/lang/String;
       5: invokevirtual #153                // Method withKeyValueSeparator:(Ljava/lang/String;)Lcom/google/common/base/Joiner$MapJoiner;
       8: areturn

  public com.google.common.base.Joiner$MapJoiner withKeyValueSeparator(java.lang.String);
    Code:
       0: new           #12                 // class com/google/common/base/Joiner$MapJoiner
       3: dup
       4: aload_0
       5: aload_1
       6: aconst_null
       7: invokespecial #156                // Method com/google/common/base/Joiner$MapJoiner."<init>":(Lcom/google/common/base/Joiner;Ljava/lang/String;Lcom/google/common/base/Joiner$1;)V
      10: areturn
}
