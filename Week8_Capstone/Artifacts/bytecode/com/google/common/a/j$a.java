abstract class com.google.common.a.j$a extends java.lang.Enum<com.google.common.a.j$a> implements com.google.common.base.Function<java.util.Map$Entry<?, ?>, java.lang.Object> {
  public static final com.google.common.a.j$a a;

  public static final com.google.common.a.j$a b;

  static {};
    Code:
       0: new           #12                 // class com/google/common/a/j$a$1
       3: dup
       4: ldc           #22                 // String KEY
       6: iconst_0
       7: invokespecial #26                 // Method com/google/common/a/j$a$1."<init>":(Ljava/lang/String;I)V
      10: putstatic     #28                 // Field a:Lcom/google/common/a/j$a;
      13: new           #14                 // class com/google/common/a/j$a$2
      16: dup
      17: ldc           #30                 // String VALUE
      19: iconst_1
      20: invokespecial #31                 // Method com/google/common/a/j$a$2."<init>":(Ljava/lang/String;I)V
      23: putstatic     #33                 // Field b:Lcom/google/common/a/j$a;
      26: iconst_2
      27: anewarray     #2                  // class com/google/common/a/j$a
      30: dup
      31: iconst_0
      32: getstatic     #28                 // Field a:Lcom/google/common/a/j$a;
      35: aastore
      36: dup
      37: iconst_1
      38: getstatic     #33                 // Field b:Lcom/google/common/a/j$a;
      41: aastore
      42: putstatic     #35                 // Field c:[Lcom/google/common/a/j$a;
      45: return

  com.google.common.a.j$a(java.lang.String, int, com.google.common.a.j$1);
    Code:
       0: aload_0
       1: aload_1
       2: iload_2
       3: invokespecial #40                 // Method "<init>":(Ljava/lang/String;I)V
       6: return

  public static com.google.common.a.j$a valueOf(java.lang.String);
    Code:
       0: ldc           #2                  // class com/google/common/a/j$a
       2: aload_0
       3: invokestatic  #45                 // Method java/lang/Enum.valueOf:(Ljava/lang/Class;Ljava/lang/String;)Ljava/lang/Enum;
       6: checkcast     #2                  // class com/google/common/a/j$a
       9: areturn

  public static com.google.common.a.j$a[] values();
    Code:
       0: getstatic     #35                 // Field c:[Lcom/google/common/a/j$a;
       3: invokevirtual #52                 // Method "[Lcom/google/common/a/j$a;".clone:()Ljava/lang/Object;
       6: checkcast     #48                 // class "[Lcom/google/common/a/j$a;"
       9: areturn
}
