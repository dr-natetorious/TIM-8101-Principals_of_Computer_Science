public class ryey.easer.plugins.a extends java.lang.IllegalArgumentException {
  public ryey.easer.plugins.a(java.lang.Class, java.lang.Class);
    Code:
       0: aload_0
       1: ldc           #8                  // String Illegal type :: expected <%s> encountered <%s>
       3: iconst_2
       4: anewarray     #10                 // class java/lang/Object
       7: dup
       8: iconst_0
       9: aload_2
      10: aastore
      11: dup
      12: iconst_1
      13: aload_1
      14: aastore
      15: invokestatic  #16                 // Method java/lang/String.format:(Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/String;
      18: invokespecial #19                 // Method java/lang/IllegalArgumentException."<init>":(Ljava/lang/String;)V
      21: return
}
