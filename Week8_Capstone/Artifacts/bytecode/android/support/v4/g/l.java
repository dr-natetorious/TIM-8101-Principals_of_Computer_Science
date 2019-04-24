public class android.support.v4.g.l {
  public static <T> T a(T);
    Code:
       0: aload_0
       1: ifnonnull     12
       4: new           #8                  // class java/lang/NullPointerException
       7: dup
       8: invokespecial #12                 // Method java/lang/NullPointerException."<init>":()V
      11: athrow
      12: aload_0
      13: areturn
}
