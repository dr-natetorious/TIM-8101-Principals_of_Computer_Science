class android.support.v4.e.c$a extends android.support.v4.e.b$a {
  final android.support.v4.e.c a;

  android.support.v4.e.c$a(android.support.v4.e.c);
    Code:
       0: aload_0
       1: aload_1
       2: putfield      #12                 // Field a:Landroid/support/v4/e/c;
       5: aload_0
       6: invokespecial #15                 // Method android/support/v4/e/b$a."<init>":()V
       9: return

  public void a(int, android.os.Bundle);
    Code:
       0: aload_0
       1: getfield      #12                 // Field a:Landroid/support/v4/e/c;
       4: getfield      #21                 // Field android/support/v4/e/c.b:Landroid/os/Handler;
       7: ifnull        35
      10: aload_0
      11: getfield      #12                 // Field a:Landroid/support/v4/e/c;
      14: getfield      #21                 // Field android/support/v4/e/c.b:Landroid/os/Handler;
      17: new           #23                 // class android/support/v4/e/c$b
      20: dup
      21: aload_0
      22: getfield      #12                 // Field a:Landroid/support/v4/e/c;
      25: iload_1
      26: aload_2
      27: invokespecial #26                 // Method android/support/v4/e/c$b."<init>":(Landroid/support/v4/e/c;ILandroid/os/Bundle;)V
      30: invokevirtual #32                 // Method android/os/Handler.post:(Ljava/lang/Runnable;)Z
      33: pop
      34: return
      35: aload_0
      36: getfield      #12                 // Field a:Landroid/support/v4/e/c;
      39: iload_1
      40: aload_2
      41: invokevirtual #34                 // Method android/support/v4/e/c.a:(ILandroid/os/Bundle;)V
      44: return
}
