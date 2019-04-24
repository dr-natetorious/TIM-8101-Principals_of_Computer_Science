public final class com.google.common.a.i {
  public static <E> java.util.ArrayList<E> a();
    Code:
       0: new           #8                  // class java/util/ArrayList
       3: dup
       4: invokespecial #12                 // Method java/util/ArrayList."<init>":()V
       7: areturn

  public static <E> java.util.ArrayList<E> a(java.util.Iterator<? extends E>);
    Code:
       0: invokestatic  #19                 // Method a:()Ljava/util/ArrayList;
       3: astore_1
       4: aload_1
       5: aload_0
       6: invokestatic  #24                 // Method com/google/common/a/f.a:(Ljava/util/Collection;Ljava/util/Iterator;)Z
       9: pop
      10: aload_1
      11: areturn
}
