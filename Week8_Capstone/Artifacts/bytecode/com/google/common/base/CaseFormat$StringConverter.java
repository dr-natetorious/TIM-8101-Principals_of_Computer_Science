final class com.google.common.base.CaseFormat$StringConverter extends com.google.common.base.Converter<java.lang.String, java.lang.String> implements java.io.Serializable {
  com.google.common.base.CaseFormat$StringConverter(com.google.common.base.CaseFormat, com.google.common.base.CaseFormat);
    Code:
       0: aload_0
       1: invokespecial #22                 // Method com/google/common/base/Converter."<init>":()V
       4: aload_0
       5: aload_1
       6: invokestatic  #28                 // Method com/google/common/base/Preconditions.checkNotNull:(Ljava/lang/Object;)Ljava/lang/Object;
       9: checkcast     #9                  // class com/google/common/base/CaseFormat
      12: putfield      #30                 // Field sourceFormat:Lcom/google/common/base/CaseFormat;
      15: aload_0
      16: aload_2
      17: invokestatic  #28                 // Method com/google/common/base/Preconditions.checkNotNull:(Ljava/lang/Object;)Ljava/lang/Object;
      20: checkcast     #9                  // class com/google/common/base/CaseFormat
      23: putfield      #32                 // Field targetFormat:Lcom/google/common/base/CaseFormat;
      26: return

  protected java.lang.Object doBackward(java.lang.Object);
    Code:
       0: aload_0
       1: aload_1
       2: checkcast     #36                 // class java/lang/String
       5: invokevirtual #39                 // Method doBackward:(Ljava/lang/String;)Ljava/lang/String;
       8: areturn

  protected java.lang.String doBackward(java.lang.String);
    Code:
       0: aload_0
       1: getfield      #32                 // Field targetFormat:Lcom/google/common/base/CaseFormat;
       4: aload_0
       5: getfield      #30                 // Field sourceFormat:Lcom/google/common/base/CaseFormat;
       8: aload_1
       9: invokevirtual #43                 // Method com/google/common/base/CaseFormat.to:(Lcom/google/common/base/CaseFormat;Ljava/lang/String;)Ljava/lang/String;
      12: areturn

  protected java.lang.Object doForward(java.lang.Object);
    Code:
       0: aload_0
       1: aload_1
       2: checkcast     #36                 // class java/lang/String
       5: invokevirtual #46                 // Method doForward:(Ljava/lang/String;)Ljava/lang/String;
       8: areturn

  protected java.lang.String doForward(java.lang.String);
    Code:
       0: aload_0
       1: getfield      #30                 // Field sourceFormat:Lcom/google/common/base/CaseFormat;
       4: aload_0
       5: getfield      #32                 // Field targetFormat:Lcom/google/common/base/CaseFormat;
       8: aload_1
       9: invokevirtual #43                 // Method com/google/common/base/CaseFormat.to:(Lcom/google/common/base/CaseFormat;Ljava/lang/String;)Ljava/lang/String;
      12: areturn

  public boolean equals(java.lang.Object);
    Code:
       0: aload_1
       1: instanceof    #2                  // class com/google/common/base/CaseFormat$StringConverter
       4: istore        4
       6: iconst_0
       7: istore_3
       8: iload_3
       9: istore_2
      10: iload         4
      12: ifeq          54
      15: aload_1
      16: checkcast     #2                  // class com/google/common/base/CaseFormat$StringConverter
      19: astore_1
      20: iload_3
      21: istore_2
      22: aload_0
      23: getfield      #30                 // Field sourceFormat:Lcom/google/common/base/CaseFormat;
      26: aload_1
      27: getfield      #30                 // Field sourceFormat:Lcom/google/common/base/CaseFormat;
      30: invokevirtual #50                 // Method com/google/common/base/CaseFormat.equals:(Ljava/lang/Object;)Z
      33: ifeq          54
      36: iload_3
      37: istore_2
      38: aload_0
      39: getfield      #32                 // Field targetFormat:Lcom/google/common/base/CaseFormat;
      42: aload_1
      43: getfield      #32                 // Field targetFormat:Lcom/google/common/base/CaseFormat;
      46: invokevirtual #50                 // Method com/google/common/base/CaseFormat.equals:(Ljava/lang/Object;)Z
      49: ifeq          54
      52: iconst_1
      53: istore_2
      54: iload_2
      55: ireturn

  public int hashCode();
    Code:
       0: aload_0
       1: getfield      #30                 // Field sourceFormat:Lcom/google/common/base/CaseFormat;
       4: invokevirtual #54                 // Method com/google/common/base/CaseFormat.hashCode:()I
       7: aload_0
       8: getfield      #32                 // Field targetFormat:Lcom/google/common/base/CaseFormat;
      11: invokevirtual #54                 // Method com/google/common/base/CaseFormat.hashCode:()I
      14: ixor
      15: ireturn

  public java.lang.String toString();
    Code:
       0: new           #58                 // class java/lang/StringBuilder
       3: dup
       4: invokespecial #59                 // Method java/lang/StringBuilder."<init>":()V
       7: astore_1
       8: aload_1
       9: aload_0
      10: getfield      #30                 // Field sourceFormat:Lcom/google/common/base/CaseFormat;
      13: invokevirtual #63                 // Method java/lang/StringBuilder.append:(Ljava/lang/Object;)Ljava/lang/StringBuilder;
      16: pop
      17: aload_1
      18: ldc           #65                 // String .converterTo(
      20: invokevirtual #68                 // Method java/lang/StringBuilder.append:(Ljava/lang/String;)Ljava/lang/StringBuilder;
      23: pop
      24: aload_1
      25: aload_0
      26: getfield      #32                 // Field targetFormat:Lcom/google/common/base/CaseFormat;
      29: invokevirtual #63                 // Method java/lang/StringBuilder.append:(Ljava/lang/Object;)Ljava/lang/StringBuilder;
      32: pop
      33: aload_1
      34: ldc           #70                 // String )
      36: invokevirtual #68                 // Method java/lang/StringBuilder.append:(Ljava/lang/String;)Ljava/lang/StringBuilder;
      39: pop
      40: aload_1
      41: invokevirtual #72                 // Method java/lang/StringBuilder.toString:()Ljava/lang/String;
      44: areturn
}
