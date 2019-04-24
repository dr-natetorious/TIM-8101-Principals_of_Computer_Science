abstract class com.google.common.base.CommonPattern {
  com.google.common.base.CommonPattern();
    Code:
       0: aload_0
       1: invokespecial #8                  // Method java/lang/Object."<init>":()V
       4: return

  public abstract boolean equals(java.lang.Object);

  abstract int flags();

  public abstract int hashCode();

  abstract com.google.common.base.CommonMatcher matcher(java.lang.CharSequence);

  abstract java.lang.String pattern();

  public abstract java.lang.String toString();
}
