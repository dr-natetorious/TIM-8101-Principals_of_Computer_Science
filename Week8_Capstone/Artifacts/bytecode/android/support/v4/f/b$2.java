final class android.support.v4.f.b$2 implements android.support.v4.f.c$a<android.support.v4.f.b$c> {
  final android.support.v4.a.a.b$a a;

  final android.os.Handler b;

  android.support.v4.f.b$2(android.support.v4.a.a.b$a, android.os.Handler);
    Code:
       0: aload_0
       1: aload_1
       2: putfield      #19                 // Field a:Landroid/support/v4/a/a/b$a;
       5: aload_0
       6: aload_2
       7: putfield      #21                 // Field b:Landroid/os/Handler;
      10: aload_0
      11: invokespecial #24                 // Method java/lang/Object."<init>":()V
      14: return

  public void a(android.support.v4.f.b$c);
    Code:
       0: aload_1
       1: ifnonnull     17
       4: aload_0
       5: getfield      #19                 // Field a:Landroid/support/v4/a/a/b$a;
       8: iconst_1
       9: aload_0
      10: getfield      #21                 // Field b:Landroid/os/Handler;
      13: invokevirtual #31                 // Method android/support/v4/a/a/b$a.a:(ILandroid/os/Handler;)V
      16: return
      17: aload_1
      18: getfield      #36                 // Field android/support/v4/f/b$c.b:I
      21: ifne          40
      24: aload_0
      25: getfield      #19                 // Field a:Landroid/support/v4/a/a/b$a;
      28: aload_1
      29: getfield      #39                 // Field android/support/v4/f/b$c.a:Landroid/graphics/Typeface;
      32: aload_0
      33: getfield      #21                 // Field b:Landroid/os/Handler;
      36: invokevirtual #42                 // Method android/support/v4/a/a/b$a.a:(Landroid/graphics/Typeface;Landroid/os/Handler;)V
      39: return
      40: aload_0
      41: getfield      #19                 // Field a:Landroid/support/v4/a/a/b$a;
      44: aload_1
      45: getfield      #36                 // Field android/support/v4/f/b$c.b:I
      48: aload_0
      49: getfield      #21                 // Field b:Landroid/os/Handler;
      52: invokevirtual #31                 // Method android/support/v4/a/a/b$a.a:(ILandroid/os/Handler;)V
      55: return

  public void a(java.lang.Object);
    Code:
       0: aload_0
       1: aload_1
       2: checkcast     #33                 // class android/support/v4/f/b$c
       5: invokevirtual #45                 // Method a:(Landroid/support/v4/f/b$c;)V
       8: return
}
