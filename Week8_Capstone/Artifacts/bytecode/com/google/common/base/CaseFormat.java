public abstract class com.google.common.base.CaseFormat extends java.lang.Enum<com.google.common.base.CaseFormat> {
  public static final com.google.common.base.CaseFormat LOWER_CAMEL;

  public static final com.google.common.base.CaseFormat LOWER_HYPHEN;

  public static final com.google.common.base.CaseFormat LOWER_UNDERSCORE;

  public static final com.google.common.base.CaseFormat UPPER_CAMEL;

  public static final com.google.common.base.CaseFormat UPPER_UNDERSCORE;

  static {};
    Code:
       0: new           #7                  // class com/google/common/base/CaseFormat$1
       3: dup
       4: ldc           #33                 // String LOWER_HYPHEN
       6: iconst_0
       7: bipush        45
       9: invokestatic  #39                 // Method com/google/common/base/CharMatcher.is:(C)Lcom/google/common/base/CharMatcher;
      12: ldc           #41                 // String -
      14: invokespecial #45                 // Method com/google/common/base/CaseFormat$1."<init>":(Ljava/lang/String;ILcom/google/common/base/CharMatcher;Ljava/lang/String;)V
      17: putstatic     #47                 // Field LOWER_HYPHEN:Lcom/google/common/base/CaseFormat;
      20: new           #9                  // class com/google/common/base/CaseFormat$2
      23: dup
      24: ldc           #48                 // String LOWER_UNDERSCORE
      26: iconst_1
      27: bipush        95
      29: invokestatic  #39                 // Method com/google/common/base/CharMatcher.is:(C)Lcom/google/common/base/CharMatcher;
      32: ldc           #50                 // String _
      34: invokespecial #51                 // Method com/google/common/base/CaseFormat$2."<init>":(Ljava/lang/String;ILcom/google/common/base/CharMatcher;Ljava/lang/String;)V
      37: putstatic     #53                 // Field LOWER_UNDERSCORE:Lcom/google/common/base/CaseFormat;
      40: new           #11                 // class com/google/common/base/CaseFormat$3
      43: dup
      44: ldc           #54                 // String LOWER_CAMEL
      46: iconst_2
      47: bipush        65
      49: bipush        90
      51: invokestatic  #58                 // Method com/google/common/base/CharMatcher.inRange:(CC)Lcom/google/common/base/CharMatcher;
      54: ldc           #60                 // String
      56: invokespecial #61                 // Method com/google/common/base/CaseFormat$3."<init>":(Ljava/lang/String;ILcom/google/common/base/CharMatcher;Ljava/lang/String;)V
      59: putstatic     #63                 // Field LOWER_CAMEL:Lcom/google/common/base/CaseFormat;
      62: new           #13                 // class com/google/common/base/CaseFormat$4
      65: dup
      66: ldc           #64                 // String UPPER_CAMEL
      68: iconst_3
      69: bipush        65
      71: bipush        90
      73: invokestatic  #58                 // Method com/google/common/base/CharMatcher.inRange:(CC)Lcom/google/common/base/CharMatcher;
      76: ldc           #60                 // String
      78: invokespecial #65                 // Method com/google/common/base/CaseFormat$4."<init>":(Ljava/lang/String;ILcom/google/common/base/CharMatcher;Ljava/lang/String;)V
      81: putstatic     #67                 // Field UPPER_CAMEL:Lcom/google/common/base/CaseFormat;
      84: new           #15                 // class com/google/common/base/CaseFormat$5
      87: dup
      88: ldc           #68                 // String UPPER_UNDERSCORE
      90: iconst_4
      91: bipush        95
      93: invokestatic  #39                 // Method com/google/common/base/CharMatcher.is:(C)Lcom/google/common/base/CharMatcher;
      96: ldc           #50                 // String _
      98: invokespecial #69                 // Method com/google/common/base/CaseFormat$5."<init>":(Ljava/lang/String;ILcom/google/common/base/CharMatcher;Ljava/lang/String;)V
     101: putstatic     #71                 // Field UPPER_UNDERSCORE:Lcom/google/common/base/CaseFormat;
     104: iconst_5
     105: anewarray     #2                  // class com/google/common/base/CaseFormat
     108: dup
     109: iconst_0
     110: getstatic     #47                 // Field LOWER_HYPHEN:Lcom/google/common/base/CaseFormat;
     113: aastore
     114: dup
     115: iconst_1
     116: getstatic     #53                 // Field LOWER_UNDERSCORE:Lcom/google/common/base/CaseFormat;
     119: aastore
     120: dup
     121: iconst_2
     122: getstatic     #63                 // Field LOWER_CAMEL:Lcom/google/common/base/CaseFormat;
     125: aastore
     126: dup
     127: iconst_3
     128: getstatic     #67                 // Field UPPER_CAMEL:Lcom/google/common/base/CaseFormat;
     131: aastore
     132: dup
     133: iconst_4
     134: getstatic     #71                 // Field UPPER_UNDERSCORE:Lcom/google/common/base/CaseFormat;
     137: aastore
     138: putstatic     #73                 // Field $VALUES:[Lcom/google/common/base/CaseFormat;
     141: return

  com.google.common.base.CaseFormat(java.lang.String, int, com.google.common.base.CharMatcher, java.lang.String, com.google.common.base.CaseFormat$1);
    Code:
       0: aload_0
       1: aload_1
       2: iload_2
       3: aload_3
       4: aload         4
       6: invokespecial #85                 // Method "<init>":(Ljava/lang/String;ILcom/google/common/base/CharMatcher;Ljava/lang/String;)V
       9: return

  static java.lang.String access$100(java.lang.String);
    Code:
       0: aload_0
       1: invokestatic  #90                 // Method firstCharOnlyToUpper:(Ljava/lang/String;)Ljava/lang/String;
       4: areturn

  public static com.google.common.base.CaseFormat valueOf(java.lang.String);
    Code:
       0: ldc           #2                  // class com/google/common/base/CaseFormat
       2: aload_0
       3: invokestatic  #137                // Method java/lang/Enum.valueOf:(Ljava/lang/Class;Ljava/lang/String;)Ljava/lang/Enum;
       6: checkcast     #2                  // class com/google/common/base/CaseFormat
       9: areturn

  public static com.google.common.base.CaseFormat[] values();
    Code:
       0: getstatic     #73                 // Field $VALUES:[Lcom/google/common/base/CaseFormat;
       3: invokevirtual #144                // Method "[Lcom/google/common/base/CaseFormat;".clone:()Ljava/lang/Object;
       6: checkcast     #140                // class "[Lcom/google/common/base/CaseFormat;"
       9: areturn

  java.lang.String convert(com.google.common.base.CaseFormat, java.lang.String);
    Code:
       0: iconst_0
       1: istore_3
       2: aconst_null
       3: astore        5
       5: iconst_m1
       6: istore        4
       8: aload_0
       9: getfield      #79                 // Field wordBoundary:Lcom/google/common/base/CharMatcher;
      12: aload_2
      13: iload         4
      15: iconst_1
      16: iadd
      17: invokevirtual #150                // Method com/google/common/base/CharMatcher.indexIn:(Ljava/lang/CharSequence;I)I
      20: istore        4
      22: iload         4
      24: iconst_m1
      25: if_icmpeq     119
      28: iload_3
      29: ifne          79
      32: new           #98                 // class java/lang/StringBuilder
      35: dup
      36: aload_2
      37: invokevirtual #154                // Method java/lang/String.length:()I
      40: aload_0
      41: getfield      #81                 // Field wordSeparator:Ljava/lang/String;
      44: invokevirtual #154                // Method java/lang/String.length:()I
      47: iconst_4
      48: imul
      49: iadd
      50: invokespecial #157                // Method java/lang/StringBuilder."<init>":(I)V
      53: astore        5
      55: aload_1
      56: aload_2
      57: iload_3
      58: iload         4
      60: invokevirtual #160                // Method java/lang/String.substring:(II)Ljava/lang/String;
      63: invokespecial #162                // Method normalizeFirstWord:(Ljava/lang/String;)Ljava/lang/String;
      66: astore        6
      68: aload         5
      70: aload         6
      72: invokevirtual #124                // Method java/lang/StringBuilder.append:(Ljava/lang/String;)Ljava/lang/StringBuilder;
      75: pop
      76: goto          95
      79: aload_1
      80: aload_2
      81: iload_3
      82: iload         4
      84: invokevirtual #160                // Method java/lang/String.substring:(II)Ljava/lang/String;
      87: invokevirtual #132                // Method normalizeWord:(Ljava/lang/String;)Ljava/lang/String;
      90: astore        6
      92: goto          68
      95: aload         5
      97: aload_1
      98: getfield      #81                 // Field wordSeparator:Ljava/lang/String;
     101: invokevirtual #124                // Method java/lang/StringBuilder.append:(Ljava/lang/String;)Ljava/lang/StringBuilder;
     104: pop
     105: aload_0
     106: getfield      #81                 // Field wordSeparator:Ljava/lang/String;
     109: invokevirtual #154                // Method java/lang/String.length:()I
     112: iload         4
     114: iadd
     115: istore_3
     116: goto          8
     119: iload_3
     120: ifne          129
     123: aload_1
     124: aload_2
     125: invokespecial #162                // Method normalizeFirstWord:(Ljava/lang/String;)Ljava/lang/String;
     128: areturn
     129: aload         5
     131: aload_1
     132: aload_2
     133: iload_3
     134: invokevirtual #118                // Method java/lang/String.substring:(I)Ljava/lang/String;
     137: invokevirtual #132                // Method normalizeWord:(Ljava/lang/String;)Ljava/lang/String;
     140: invokevirtual #124                // Method java/lang/StringBuilder.append:(Ljava/lang/String;)Ljava/lang/StringBuilder;
     143: pop
     144: aload         5
     146: invokevirtual #128                // Method java/lang/StringBuilder.toString:()Ljava/lang/String;
     149: areturn

  public com.google.common.base.Converter<java.lang.String, java.lang.String> converterTo(com.google.common.base.CaseFormat);
    Code:
       0: new           #17                 // class com/google/common/base/CaseFormat$StringConverter
       3: dup
       4: aload_0
       5: aload_1
       6: invokespecial #167                // Method com/google/common/base/CaseFormat$StringConverter."<init>":(Lcom/google/common/base/CaseFormat;Lcom/google/common/base/CaseFormat;)V
       9: areturn

  abstract java.lang.String normalizeWord(java.lang.String);

  public final java.lang.String to(com.google.common.base.CaseFormat, java.lang.String);
    Code:
       0: aload_1
       1: invokestatic  #175                // Method com/google/common/base/Preconditions.checkNotNull:(Ljava/lang/Object;)Ljava/lang/Object;
       4: pop
       5: aload_2
       6: invokestatic  #175                // Method com/google/common/base/Preconditions.checkNotNull:(Ljava/lang/Object;)Ljava/lang/Object;
       9: pop
      10: aload_1
      11: aload_0
      12: if_acmpne     17
      15: aload_2
      16: areturn
      17: aload_0
      18: aload_1
      19: aload_2
      20: invokevirtual #177                // Method convert:(Lcom/google/common/base/CaseFormat;Ljava/lang/String;)Ljava/lang/String;
      23: areturn
}
