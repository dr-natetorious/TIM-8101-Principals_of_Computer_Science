public final class com.google.common.base.Charsets {
  public static final java.nio.charset.Charset ISO_8859_1;

  public static final java.nio.charset.Charset US_ASCII;

  public static final java.nio.charset.Charset UTF_16;

  public static final java.nio.charset.Charset UTF_16BE;

  public static final java.nio.charset.Charset UTF_16LE;

  public static final java.nio.charset.Charset UTF_8;

  static {};
    Code:
       0: ldc           #15                 // String US-ASCII
       2: invokestatic  #21                 // Method java/nio/charset/Charset.forName:(Ljava/lang/String;)Ljava/nio/charset/Charset;
       5: putstatic     #23                 // Field US_ASCII:Ljava/nio/charset/Charset;
       8: ldc           #25                 // String ISO-8859-1
      10: invokestatic  #21                 // Method java/nio/charset/Charset.forName:(Ljava/lang/String;)Ljava/nio/charset/Charset;
      13: putstatic     #27                 // Field ISO_8859_1:Ljava/nio/charset/Charset;
      16: ldc           #29                 // String UTF-8
      18: invokestatic  #21                 // Method java/nio/charset/Charset.forName:(Ljava/lang/String;)Ljava/nio/charset/Charset;
      21: putstatic     #31                 // Field UTF_8:Ljava/nio/charset/Charset;
      24: ldc           #33                 // String UTF-16BE
      26: invokestatic  #21                 // Method java/nio/charset/Charset.forName:(Ljava/lang/String;)Ljava/nio/charset/Charset;
      29: putstatic     #35                 // Field UTF_16BE:Ljava/nio/charset/Charset;
      32: ldc           #37                 // String UTF-16LE
      34: invokestatic  #21                 // Method java/nio/charset/Charset.forName:(Ljava/lang/String;)Ljava/nio/charset/Charset;
      37: putstatic     #39                 // Field UTF_16LE:Ljava/nio/charset/Charset;
      40: ldc           #41                 // String UTF-16
      42: invokestatic  #21                 // Method java/nio/charset/Charset.forName:(Ljava/lang/String;)Ljava/nio/charset/Charset;
      45: putstatic     #43                 // Field UTF_16:Ljava/nio/charset/Charset;
      48: return
}
