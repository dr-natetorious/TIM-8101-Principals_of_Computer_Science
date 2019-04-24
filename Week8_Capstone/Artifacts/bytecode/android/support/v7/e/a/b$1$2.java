class android.support.v7.e.a.b$1$2 implements java.lang.Runnable {
  final android.support.v7.g.c$b a;

  final android.support.v7.e.a.b$1 b;

  android.support.v7.e.a.b$1$2(android.support.v7.e.a.b$1, android.support.v7.g.c$b);
    Code:
       0: aload_0
       1: aload_1
       2: putfield      #19                 // Field b:Landroid/support/v7/e/a/b$1;
       5: aload_0
       6: aload_2
       7: putfield      #21                 // Field a:Landroid/support/v7/g/c$b;
      10: aload_0
      11: invokespecial #23                 // Method java/lang/Object."<init>":()V
      14: return

  public void run();
    Code:
       0: aload_0
       1: getfield      #19                 // Field b:Landroid/support/v7/e/a/b$1;
       4: getfield      #28                 // Field android/support/v7/e/a/b$1.d:Landroid/support/v7/e/a/b;
       7: invokestatic  #33                 // Method android/support/v7/e/a/b.b:(Landroid/support/v7/e/a/b;)I
      10: aload_0
      11: getfield      #19                 // Field b:Landroid/support/v7/e/a/b$1;
      14: getfield      #37                 // Field android/support/v7/e/a/b$1.c:I
      17: if_icmpne     41
      20: aload_0
      21: getfield      #19                 // Field b:Landroid/support/v7/e/a/b$1;
      24: getfield      #28                 // Field android/support/v7/e/a/b$1.d:Landroid/support/v7/e/a/b;
      27: aload_0
      28: getfield      #19                 // Field b:Landroid/support/v7/e/a/b$1;
      31: getfield      #40                 // Field android/support/v7/e/a/b$1.b:Ljava/util/List;
      34: aload_0
      35: getfield      #21                 // Field a:Landroid/support/v7/g/c$b;
      38: invokestatic  #43                 // Method android/support/v7/e/a/b.a:(Landroid/support/v7/e/a/b;Ljava/util/List;Landroid/support/v7/g/c$b;)V
      41: return
}
