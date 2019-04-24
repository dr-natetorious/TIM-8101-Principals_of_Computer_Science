final class com.google.common.a.j$a$1 extends com.google.common.a.j$a {
  com.google.common.a.j$a$1(java.lang.String, int);
    Code:
       0: aload_0
       1: aload_1
       2: iload_2
       3: aconst_null
       4: invokespecial #12                 // Method com/google/common/a/j$a."<init>":(Ljava/lang/String;ILcom/google/common/a/j$1;)V
       7: return

  public java.lang.Object a(java.util.Map$Entry<?, ?>);
    Code:
       0: aload_1
       1: invokeinterface #20,  1           // InterfaceMethod java/util/Map$Entry.getKey:()Ljava/lang/Object;
       6: areturn

  public java.lang.Object apply(java.lang.Object);
    Code:
       0: aload_0
       1: aload_1
       2: checkcast     #16                 // class java/util/Map$Entry
       5: invokevirtual #26                 // Method a:(Ljava/util/Map$Entry;)Ljava/lang/Object;
       8: areturn
}
