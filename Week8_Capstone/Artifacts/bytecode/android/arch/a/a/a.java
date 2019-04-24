public class android.arch.a.a.a extends android.arch.a.a.c {
  static {};
    Code:
       0: new           #6                  // class android/arch/a/a/a$1
       3: dup
       4: invokespecial #21                 // Method android/arch/a/a/a$1."<init>":()V
       7: putstatic     #23                 // Field d:Ljava/util/concurrent/Executor;
      10: new           #8                  // class android/arch/a/a/a$2
      13: dup
      14: invokespecial #24                 // Method android/arch/a/a/a$2."<init>":()V
      17: putstatic     #26                 // Field e:Ljava/util/concurrent/Executor;
      20: return

  public static android.arch.a.a.a a();
    Code:
       0: getstatic     #38                 // Field a:Landroid/arch/a/a/a;
       3: ifnull        10
       6: getstatic     #38                 // Field a:Landroid/arch/a/a/a;
       9: areturn
      10: ldc           #2                  // class android/arch/a/a/a
      12: monitorenter
      13: getstatic     #38                 // Field a:Landroid/arch/a/a/a;
      16: ifnonnull     29
      19: new           #2                  // class android/arch/a/a/a
      22: dup
      23: invokespecial #39                 // Method "<init>":()V
      26: putstatic     #38                 // Field a:Landroid/arch/a/a/a;
      29: ldc           #2                  // class android/arch/a/a/a
      31: monitorexit
      32: getstatic     #38                 // Field a:Landroid/arch/a/a/a;
      35: areturn
      36: astore_0
      37: ldc           #2                  // class android/arch/a/a/a
      39: monitorexit
      40: aload_0
      41: athrow
    Exception table:
       from    to  target type
          13    29    36   any
          29    32    36   any
          37    40    36   any

  public void a(java.lang.Runnable);
    Code:
       0: aload_0
       1: getfield      #35                 // Field b:Landroid/arch/a/a/c;
       4: aload_1
       5: invokevirtual #42                 // Method android/arch/a/a/c.a:(Ljava/lang/Runnable;)V
       8: return

  public void b(java.lang.Runnable);
    Code:
       0: aload_0
       1: getfield      #35                 // Field b:Landroid/arch/a/a/c;
       4: aload_1
       5: invokevirtual #44                 // Method android/arch/a/a/c.b:(Ljava/lang/Runnable;)V
       8: return

  public boolean b();
    Code:
       0: aload_0
       1: getfield      #35                 // Field b:Landroid/arch/a/a/c;
       4: invokevirtual #47                 // Method android/arch/a/a/c.b:()Z
       7: ireturn
}
