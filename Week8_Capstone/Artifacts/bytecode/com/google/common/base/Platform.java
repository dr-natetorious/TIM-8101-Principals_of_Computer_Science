final class com.google.common.base.Platform {
  static {};
    Code:
       0: ldc           #2                  // class com/google/common/base/Platform
       2: invokevirtual #21                 // Method java/lang/Class.getName:()Ljava/lang/String;
       5: invokestatic  #27                 // Method java/util/logging/Logger.getLogger:(Ljava/lang/String;)Ljava/util/logging/Logger;
       8: putstatic     #29                 // Field logger:Ljava/util/logging/Logger;
      11: invokestatic  #33                 // Method loadPatternCompiler:()Lcom/google/common/base/PatternCompiler;
      14: putstatic     #35                 // Field patternCompiler:Lcom/google/common/base/PatternCompiler;
      17: return

  static com.google.common.base.CommonPattern compilePattern(java.lang.String);
    Code:
       0: aload_0
       1: invokestatic  #47                 // Method com/google/common/base/Preconditions.checkNotNull:(Ljava/lang/Object;)Ljava/lang/Object;
       4: pop
       5: getstatic     #35                 // Field patternCompiler:Lcom/google/common/base/PatternCompiler;
       8: aload_0
       9: invokeinterface #52,  2           // InterfaceMethod com/google/common/base/PatternCompiler.compile:(Ljava/lang/String;)Lcom/google/common/base/CommonPattern;
      14: areturn

  static java.lang.String formatCompact4Digits(double);
    Code:
       0: getstatic     #60                 // Field java/util/Locale.ROOT:Ljava/util/Locale;
       3: ldc           #62                 // String %.4g
       5: iconst_1
       6: anewarray     #4                  // class java/lang/Object
       9: dup
      10: iconst_0
      11: dload_0
      12: invokestatic  #68                 // Method java/lang/Double.valueOf:(D)Ljava/lang/Double;
      15: aastore
      16: invokestatic  #74                 // Method java/lang/String.format:(Ljava/util/Locale;Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/String;
      19: areturn

  static <T extends java.lang.Enum<T>> com.google.common.base.Optional<T> getEnumIfPresent(java.lang.Class<T>, java.lang.String);
    Code:
       0: aload_0
       1: invokestatic  #82                 // Method com/google/common/base/Enums.getEnumConstants:(Ljava/lang/Class;)Ljava/util/Map;
       4: aload_1
       5: invokeinterface #87,  2           // InterfaceMethod java/util/Map.get:(Ljava/lang/Object;)Ljava/lang/Object;
      10: checkcast     #89                 // class java/lang/ref/WeakReference
      13: astore_1
      14: aload_1
      15: ifnonnull     22
      18: invokestatic  #95                 // Method com/google/common/base/Optional.absent:()Lcom/google/common/base/Optional;
      21: areturn
      22: aload_0
      23: aload_1
      24: invokevirtual #98                 // Method java/lang/ref/WeakReference.get:()Ljava/lang/Object;
      27: invokevirtual #101                // Method java/lang/Class.cast:(Ljava/lang/Object;)Ljava/lang/Object;
      30: invokestatic  #105                // Method com/google/common/base/Optional.of:(Ljava/lang/Object;)Lcom/google/common/base/Optional;
      33: areturn

  static com.google.common.base.CharMatcher precomputeCharMatcher(com.google.common.base.CharMatcher);
    Code:
       0: aload_0
       1: invokevirtual #132                // Method com/google/common/base/CharMatcher.precomputedInternal:()Lcom/google/common/base/CharMatcher;
       4: areturn

  static boolean stringIsNullOrEmpty(java.lang.String);
    Code:
       0: aload_0
       1: ifnull        16
       4: aload_0
       5: invokevirtual #138                // Method java/lang/String.isEmpty:()Z
       8: ifeq          14
      11: goto          16
      14: iconst_0
      15: ireturn
      16: iconst_1
      17: ireturn

  static long systemNanoTime();
    Code:
       0: invokestatic  #145                // Method java/lang/System.nanoTime:()J
       3: lreturn

  static boolean usingJdkPatternCompiler();
    Code:
       0: getstatic     #35                 // Field patternCompiler:Lcom/google/common/base/PatternCompiler;
       3: instanceof    #8                  // class com/google/common/base/Platform$JdkPatternCompiler
       6: ireturn
}
