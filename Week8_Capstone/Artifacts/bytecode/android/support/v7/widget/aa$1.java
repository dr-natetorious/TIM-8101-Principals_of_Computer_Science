class android.support.v7.widget.aa$1 extends android.support.v4.a.a.b$a {
  final java.lang.ref.WeakReference a;

  final android.support.v7.widget.aa b;

  android.support.v7.widget.aa$1(android.support.v7.widget.aa, java.lang.ref.WeakReference);
    Code:
       0: aload_0
       1: aload_1
       2: putfield      #16                 // Field b:Landroid/support/v7/widget/aa;
       5: aload_0
       6: aload_2
       7: putfield      #18                 // Field a:Ljava/lang/ref/WeakReference;
      10: aload_0
      11: invokespecial #21                 // Method android/support/v4/a/a/b$a."<init>":()V
      14: return

  public void a(int);
    Code:
       0: return

  public void a(android.graphics.Typeface);
    Code:
       0: aload_0
       1: getfield      #16                 // Field b:Landroid/support/v7/widget/aa;
       4: aload_0
       5: getfield      #18                 // Field a:Ljava/lang/ref/WeakReference;
       8: aload_1
       9: invokestatic  #27                 // Method android/support/v7/widget/aa.a:(Landroid/support/v7/widget/aa;Ljava/lang/ref/WeakReference;Landroid/graphics/Typeface;)V
      12: return
}
