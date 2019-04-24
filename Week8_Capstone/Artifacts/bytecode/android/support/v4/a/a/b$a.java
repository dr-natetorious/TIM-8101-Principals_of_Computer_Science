public abstract class android.support.v4.a.a.b$a {
  public android.support.v4.a.a.b$a();
    Code:
       0: aload_0
       1: invokespecial #15                 // Method java/lang/Object."<init>":()V
       4: return

  public abstract void a(int);

  public final void a(int, android.os.Handler);
    Code:
       0: aload_2
       1: astore_3
       2: aload_2
       3: ifnonnull     17
       6: new           #20                 // class android/os/Handler
       9: dup
      10: invokestatic  #26                 // Method android/os/Looper.getMainLooper:()Landroid/os/Looper;
      13: invokespecial #29                 // Method android/os/Handler."<init>":(Landroid/os/Looper;)V
      16: astore_3
      17: aload_3
      18: new           #11                 // class android/support/v4/a/a/b$a$2
      21: dup
      22: aload_0
      23: iload_1
      24: invokespecial #32                 // Method android/support/v4/a/a/b$a$2."<init>":(Landroid/support/v4/a/a/b$a;I)V
      27: invokevirtual #36                 // Method android/os/Handler.post:(Ljava/lang/Runnable;)Z
      30: pop
      31: return

  public abstract void a(android.graphics.Typeface);

  public final void a(android.graphics.Typeface, android.os.Handler);
    Code:
       0: aload_2
       1: astore_3
       2: aload_2
       3: ifnonnull     17
       6: new           #20                 // class android/os/Handler
       9: dup
      10: invokestatic  #26                 // Method android/os/Looper.getMainLooper:()Landroid/os/Looper;
      13: invokespecial #29                 // Method android/os/Handler."<init>":(Landroid/os/Looper;)V
      16: astore_3
      17: aload_3
      18: new           #9                  // class android/support/v4/a/a/b$a$1
      21: dup
      22: aload_0
      23: aload_1
      24: invokespecial #41                 // Method android/support/v4/a/a/b$a$1."<init>":(Landroid/support/v4/a/a/b$a;Landroid/graphics/Typeface;)V
      27: invokevirtual #36                 // Method android/os/Handler.post:(Ljava/lang/Runnable;)Z
      30: pop
      31: return
}
