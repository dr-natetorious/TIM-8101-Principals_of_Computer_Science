public abstract class android.support.v7.app.a {
  public android.support.v7.app.a();
    Code:
       0: aload_0
       1: invokespecial #17                 // Method java/lang/Object."<init>":()V
       4: return

  public abstract int a();

  public android.support.v7.view.b a(android.support.v7.view.b$a);
    Code:
       0: aconst_null
       1: areturn

  public void a(float);
    Code:
       0: fload_1
       1: fconst_0
       2: fcmpl
       3: ifeq          16
       6: new           #23                 // class java/lang/UnsupportedOperationException
       9: dup
      10: ldc           #25                 // String Setting a non-zero elevation is not supported in this action bar configuration.
      12: invokespecial #28                 // Method java/lang/UnsupportedOperationException."<init>":(Ljava/lang/String;)V
      15: athrow
      16: return

  public void a(int);
    Code:
       0: return

  public void a(android.content.res.Configuration);
    Code:
       0: return

  public void a(android.graphics.drawable.Drawable);
    Code:
       0: return

  public void a(java.lang.CharSequence);
    Code:
       0: return

  public abstract void a(boolean);

  public boolean a(int, android.view.KeyEvent);
    Code:
       0: iconst_0
       1: ireturn

  public boolean a(android.view.KeyEvent);
    Code:
       0: iconst_0
       1: ireturn

  public android.content.Context b();
    Code:
       0: aconst_null
       1: areturn

  public void b(int);
    Code:
       0: return

  public abstract void b(boolean);

  public void c(boolean);
    Code:
       0: return

  public boolean c();
    Code:
       0: iconst_0
       1: ireturn

  public void d(boolean);
    Code:
       0: iload_1
       1: ifeq          14
       4: new           #23                 // class java/lang/UnsupportedOperationException
       7: dup
       8: ldc           #40                 // String Hide on content scroll is not supported in this action bar configuration.
      10: invokespecial #28                 // Method java/lang/UnsupportedOperationException."<init>":(Ljava/lang/String;)V
      13: athrow
      14: return

  public boolean d();
    Code:
       0: iconst_0
       1: ireturn

  public void e(boolean);
    Code:
       0: return

  public boolean e();
    Code:
       0: iconst_0
       1: ireturn

  public void f(boolean);
    Code:
       0: return

  public boolean f();
    Code:
       0: iconst_0
       1: ireturn

  void g();
    Code:
       0: return

  public void g(boolean);
    Code:
       0: return
}
