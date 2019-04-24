class android.support.v4.a.a.b$a$2 implements java.lang.Runnable {
  final int a;

  final android.support.v4.a.a.b$a b;

  android.support.v4.a.a.b$a$2(android.support.v4.a.a.b$a, int);
    Code:
       0: aload_0
       1: aload_1
       2: putfield      #20                 // Field b:Landroid/support/v4/a/a/b$a;
       5: aload_0
       6: iload_2
       7: putfield      #22                 // Field a:I
      10: aload_0
      11: invokespecial #25                 // Method java/lang/Object."<init>":()V
      14: return

  public void run();
    Code:
       0: aload_0
       1: getfield      #20                 // Field b:Landroid/support/v4/a/a/b$a;
       4: aload_0
       5: getfield      #22                 // Field a:I
       8: invokevirtual #30                 // Method android/support/v4/a/a/b$a.a:(I)V
      11: return
}
