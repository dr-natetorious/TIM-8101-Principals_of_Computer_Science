public final class com.google.common.base.MoreObjects {
  public static <T> T firstNonNull(T, T);
    Code:
       0: aload_0
       1: ifnull        6
       4: aload_0
       5: areturn
       6: aload_1
       7: invokestatic  #25                 // Method com/google/common/base/Preconditions.checkNotNull:(Ljava/lang/Object;)Ljava/lang/Object;
      10: areturn

  public static com.google.common.base.MoreObjects$ToStringHelper toStringHelper(java.lang.Class<?>);
    Code:
       0: new           #8                  // class com/google/common/base/MoreObjects$ToStringHelper
       3: dup
       4: aload_0
       5: invokevirtual #35                 // Method java/lang/Class.getSimpleName:()Ljava/lang/String;
       8: aconst_null
       9: invokespecial #38                 // Method com/google/common/base/MoreObjects$ToStringHelper."<init>":(Ljava/lang/String;Lcom/google/common/base/MoreObjects$1;)V
      12: areturn

  public static com.google.common.base.MoreObjects$ToStringHelper toStringHelper(java.lang.Object);
    Code:
       0: new           #8                  // class com/google/common/base/MoreObjects$ToStringHelper
       3: dup
       4: aload_0
       5: invokevirtual #44                 // Method java/lang/Object.getClass:()Ljava/lang/Class;
       8: invokevirtual #35                 // Method java/lang/Class.getSimpleName:()Ljava/lang/String;
      11: aconst_null
      12: invokespecial #38                 // Method com/google/common/base/MoreObjects$ToStringHelper."<init>":(Ljava/lang/String;Lcom/google/common/base/MoreObjects$1;)V
      15: areturn

  public static com.google.common.base.MoreObjects$ToStringHelper toStringHelper(java.lang.String);
    Code:
       0: new           #8                  // class com/google/common/base/MoreObjects$ToStringHelper
       3: dup
       4: aload_0
       5: aconst_null
       6: invokespecial #38                 // Method com/google/common/base/MoreObjects$ToStringHelper."<init>":(Ljava/lang/String;Lcom/google/common/base/MoreObjects$1;)V
       9: areturn
}
