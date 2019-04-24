class android.support.v4.e.c$b implements java.lang.Runnable {
  final int a;

  final android.os.Bundle b;

  final android.support.v4.e.c c;

  android.support.v4.e.c$b(android.support.v4.e.c, int, android.os.Bundle);
    Code:
       0: aload_0
       1: aload_1
       2: putfield      #18                 // Field c:Landroid/support/v4/e/c;
       5: aload_0
       6: invokespecial #21                 // Method java/lang/Object."<init>":()V
       9: aload_0
      10: iload_2
      11: putfield      #23                 // Field a:I
      14: aload_0
      15: aload_3
      16: putfield      #25                 // Field b:Landroid/os/Bundle;
      19: return

  public void run();
    Code:
       0: aload_0
       1: getfield      #18                 // Field c:Landroid/support/v4/e/c;
       4: aload_0
       5: getfield      #23                 // Field a:I
       8: aload_0
       9: getfield      #25                 // Field b:Landroid/os/Bundle;
      12: invokevirtual #30                 // Method android/support/v4/e/c.a:(ILandroid/os/Bundle;)V
      15: return
}
