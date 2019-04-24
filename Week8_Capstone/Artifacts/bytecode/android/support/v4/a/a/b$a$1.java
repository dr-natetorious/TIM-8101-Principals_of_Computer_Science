class android.support.v4.a.a.b$a$1 implements java.lang.Runnable {
  final android.graphics.Typeface a;

  final android.support.v4.a.a.b$a b;

  android.support.v4.a.a.b$a$1(android.support.v4.a.a.b$a, android.graphics.Typeface);
    Code:
       0: aload_0
       1: aload_1
       2: putfield      #20                 // Field b:Landroid/support/v4/a/a/b$a;
       5: aload_0
       6: aload_2
       7: putfield      #22                 // Field a:Landroid/graphics/Typeface;
      10: aload_0
      11: invokespecial #25                 // Method java/lang/Object."<init>":()V
      14: return

  public void run();
    Code:
       0: aload_0
       1: getfield      #20                 // Field b:Landroid/support/v4/a/a/b$a;
       4: aload_0
       5: getfield      #22                 // Field a:Landroid/graphics/Typeface;
       8: invokevirtual #30                 // Method android/support/v4/a/a/b$a.a:(Landroid/graphics/Typeface;)V
      11: return
}
