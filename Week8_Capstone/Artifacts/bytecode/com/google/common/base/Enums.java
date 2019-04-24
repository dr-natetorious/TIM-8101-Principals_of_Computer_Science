public final class com.google.common.base.Enums {
  static {};
    Code:
       0: new           #14                 // class java/util/WeakHashMap
       3: dup
       4: invokespecial #17                 // Method java/util/WeakHashMap."<init>":()V
       7: putstatic     #19                 // Field enumConstantCache:Ljava/util/Map;
      10: return

  static <T extends java.lang.Enum<T>> java.util.Map<java.lang.String, java.lang.ref.WeakReference<? extends java.lang.Enum<?>>> getEnumConstants(java.lang.Class<T>);
    Code:
       0: getstatic     #19                 // Field enumConstantCache:Ljava/util/Map;
       3: astore_3
       4: aload_3
       5: monitorenter
       6: getstatic     #19                 // Field enumConstantCache:Ljava/util/Map;
       9: aload_0
      10: invokeinterface #29,  2           // InterfaceMethod java/util/Map.get:(Ljava/lang/Object;)Ljava/lang/Object;
      15: checkcast     #25                 // class java/util/Map
      18: astore_2
      19: aload_2
      20: astore_1
      21: aload_2
      22: ifnonnull     30
      25: aload_0
      26: invokestatic  #32                 // Method populateCache:(Ljava/lang/Class;)Ljava/util/Map;
      29: astore_1
      30: aload_3
      31: monitorexit
      32: aload_1
      33: areturn
      34: astore_0
      35: aload_3
      36: monitorexit
      37: aload_0
      38: athrow
    Exception table:
       from    to  target type
           6    19    34   any
          25    30    34   any
          30    32    34   any
          35    37    34   any

  public static java.lang.reflect.Field getField(java.lang.Enum<?>);
    Code:
       0: aload_0
       1: invokevirtual #44                 // Method java/lang/Enum.getDeclaringClass:()Ljava/lang/Class;
       4: astore_1
       5: aload_1
       6: aload_0
       7: invokevirtual #48                 // Method java/lang/Enum.name:()Ljava/lang/String;
      10: invokevirtual #54                 // Method java/lang/Class.getDeclaredField:(Ljava/lang/String;)Ljava/lang/reflect/Field;
      13: astore_0
      14: aload_0
      15: areturn
      16: astore_0
      17: new           #56                 // class java/lang/AssertionError
      20: dup
      21: aload_0
      22: invokespecial #59                 // Method java/lang/AssertionError."<init>":(Ljava/lang/Object;)V
      25: athrow
    Exception table:
       from    to  target type
           5    14    16   Class java/lang/NoSuchFieldException

  public static <T extends java.lang.Enum<T>> com.google.common.base.Optional<T> getIfPresent(java.lang.Class<T>, java.lang.String);
    Code:
       0: aload_0
       1: invokestatic  #67                 // Method com/google/common/base/Preconditions.checkNotNull:(Ljava/lang/Object;)Ljava/lang/Object;
       4: pop
       5: aload_1
       6: invokestatic  #67                 // Method com/google/common/base/Preconditions.checkNotNull:(Ljava/lang/Object;)Ljava/lang/Object;
       9: pop
      10: aload_0
      11: aload_1
      12: invokestatic  #72                 // Method com/google/common/base/Platform.getEnumIfPresent:(Ljava/lang/Class;Ljava/lang/String;)Lcom/google/common/base/Optional;
      15: areturn

  public static <T extends java.lang.Enum<T>> com.google.common.base.Converter<java.lang.String, T> stringConverter(java.lang.Class<T>);
    Code:
       0: new           #6                  // class com/google/common/base/Enums$StringConverter
       3: dup
       4: aload_0
       5: invokespecial #108                // Method com/google/common/base/Enums$StringConverter."<init>":(Ljava/lang/Class;)V
       8: areturn
}
