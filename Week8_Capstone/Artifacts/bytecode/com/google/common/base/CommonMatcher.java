abstract class com.google.common.base.CommonMatcher {
  com.google.common.base.CommonMatcher();
    Code:
       0: aload_0
       1: invokespecial #8                  // Method java/lang/Object."<init>":()V
       4: return

  abstract int end();

  abstract boolean find();

  abstract boolean find(int);

  abstract boolean matches();

  abstract java.lang.String replaceAll(java.lang.String);

  abstract int start();
}
