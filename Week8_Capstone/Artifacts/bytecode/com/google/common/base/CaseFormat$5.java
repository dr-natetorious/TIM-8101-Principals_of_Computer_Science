final class com.google.common.base.CaseFormat$5 extends com.google.common.base.CaseFormat {
  com.google.common.base.CaseFormat$5(java.lang.String, int, com.google.common.base.CharMatcher, java.lang.String);
    Code:
       0: aload_0
       1: aload_1
       2: iload_2
       3: aload_3
       4: aload         4
       6: aconst_null
       7: invokespecial #9                  // Method com/google/common/base/CaseFormat."<init>":(Ljava/lang/String;ILcom/google/common/base/CharMatcher;Ljava/lang/String;Lcom/google/common/base/CaseFormat$1;)V
      10: return

  java.lang.String convert(com.google.common.base.CaseFormat, java.lang.String);
    Code:
       0: aload_1
       1: getstatic     #16                 // Field LOWER_HYPHEN:Lcom/google/common/base/CaseFormat;
       4: if_acmpne     19
       7: aload_2
       8: bipush        95
      10: bipush        45
      12: invokevirtual #22                 // Method java/lang/String.replace:(CC)Ljava/lang/String;
      15: invokestatic  #28                 // Method com/google/common/base/Ascii.toLowerCase:(Ljava/lang/String;)Ljava/lang/String;
      18: areturn
      19: aload_1
      20: getstatic     #31                 // Field LOWER_UNDERSCORE:Lcom/google/common/base/CaseFormat;
      23: if_acmpne     31
      26: aload_2
      27: invokestatic  #28                 // Method com/google/common/base/Ascii.toLowerCase:(Ljava/lang/String;)Ljava/lang/String;
      30: areturn
      31: aload_0
      32: aload_1
      33: aload_2
      34: invokespecial #33                 // Method com/google/common/base/CaseFormat.convert:(Lcom/google/common/base/CaseFormat;Ljava/lang/String;)Ljava/lang/String;
      37: areturn

  java.lang.String normalizeWord(java.lang.String);
    Code:
       0: aload_1
       1: invokestatic  #37                 // Method com/google/common/base/Ascii.toUpperCase:(Ljava/lang/String;)Ljava/lang/String;
       4: areturn
}
