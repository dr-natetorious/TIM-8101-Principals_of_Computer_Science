public abstract class android.support.v7.app.g {
  static {};
    Code:
       0: return

  android.support.v7.app.g();
    Code:
       0: aload_0
       1: invokespecial #16                 // Method java/lang/Object."<init>":()V
       4: return

  public static android.support.v7.app.g a(android.app.Activity, android.support.v7.app.f);
    Code:
       0: aload_0
       1: aload_0
       2: invokevirtual #23                 // Method android/app/Activity.getWindow:()Landroid/view/Window;
       5: aload_1
       6: invokestatic  #26                 // Method a:(Landroid/content/Context;Landroid/view/Window;Landroid/support/v7/app/f;)Landroid/support/v7/app/g;
       9: areturn

  public static android.support.v7.app.g a(android.app.Dialog, android.support.v7.app.f);
    Code:
       0: aload_0
       1: invokevirtual #33                 // Method android/app/Dialog.getContext:()Landroid/content/Context;
       4: aload_0
       5: invokevirtual #34                 // Method android/app/Dialog.getWindow:()Landroid/view/Window;
       8: aload_1
       9: invokestatic  #26                 // Method a:(Landroid/content/Context;Landroid/view/Window;Landroid/support/v7/app/f;)Landroid/support/v7/app/g;
      12: areturn

  public static void a(boolean);
    Code:
       0: iload_0
       1: putstatic     #53                 // Field b:Z
       4: return

  public static int k();
    Code:
       0: getstatic     #57                 // Field a:I
       3: ireturn

  public static boolean l();
    Code:
       0: getstatic     #53                 // Field b:Z
       3: ireturn

  public abstract android.support.v7.app.a a();

  public abstract android.support.v7.view.b a(android.support.v7.view.b$a);

  public abstract <T extends android.view.View> T a(int);

  public abstract void a(android.content.res.Configuration);

  public abstract void a(android.os.Bundle);

  public abstract void a(android.support.v7.widget.Toolbar);

  public abstract void a(android.view.View);

  public abstract void a(android.view.View, android.view.ViewGroup$LayoutParams);

  public abstract void a(java.lang.CharSequence);

  public abstract android.view.MenuInflater b();

  public abstract void b(int);

  public abstract void b(android.os.Bundle);

  public abstract void b(android.view.View, android.view.ViewGroup$LayoutParams);

  public abstract void c();

  public abstract void c(android.os.Bundle);

  public abstract boolean c(int);

  public abstract void d();

  public abstract void e();

  public abstract void f();

  public abstract void g();

  public abstract android.support.v7.app.b$a h();

  public abstract void i();

  public abstract boolean j();
}
