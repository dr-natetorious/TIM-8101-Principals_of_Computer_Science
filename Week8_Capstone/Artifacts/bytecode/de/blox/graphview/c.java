final class de.blox.graphview.c {
  static <T> T a(T, java.lang.String);
    Code:
       0: aload_0
       1: ifnonnull     13
       4: new           #8                  // class java/lang/IllegalArgumentException
       7: dup
       8: aload_1
       9: invokespecial #12                 // Method java/lang/IllegalArgumentException."<init>":(Ljava/lang/String;)V
      12: athrow
      13: aload_0
      14: areturn
}
