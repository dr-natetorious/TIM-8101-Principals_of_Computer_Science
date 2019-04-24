final class android.support.v7.g.c$1 implements java.util.Comparator<android.support.v7.g.c$f> {
  android.support.v7.g.c$1();
    Code:
       0: aload_0
       1: invokespecial #13                 // Method java/lang/Object."<init>":()V
       4: return

  public int a(android.support.v7.g.c$f, android.support.v7.g.c$f);
    Code:
       0: aload_1
       1: getfield      #21                 // Field android/support/v7/g/c$f.a:I
       4: aload_2
       5: getfield      #21                 // Field android/support/v7/g/c$f.a:I
       8: isub
       9: istore        4
      11: iload         4
      13: istore_3
      14: iload         4
      16: ifne          29
      19: aload_1
      20: getfield      #24                 // Field android/support/v7/g/c$f.b:I
      23: aload_2
      24: getfield      #24                 // Field android/support/v7/g/c$f.b:I
      27: isub
      28: istore_3
      29: iload_3
      30: ireturn

  public int compare(java.lang.Object, java.lang.Object);
    Code:
       0: aload_0
       1: aload_1
       2: checkcast     #18                 // class android/support/v7/g/c$f
       5: aload_2
       6: checkcast     #18                 // class android/support/v7/g/c$f
       9: invokevirtual #28                 // Method a:(Landroid/support/v7/g/c$f;Landroid/support/v7/g/c$f;)I
      12: ireturn
}
