public abstract class android.support.v4.app.m<E> extends android.support.v4.app.k {
  final android.content.Context b;

  final int c;

  final android.support.v4.app.o d;

  android.support.v4.app.m(android.app.Activity, android.content.Context, android.os.Handler, int);
    Code:
       0: aload_0
       1: invokespecial #20                 // Method android/support/v4/app/k."<init>":()V
       4: aload_0
       5: new           #22                 // class android/support/v4/app/o
       8: dup
       9: invokespecial #23                 // Method android/support/v4/app/o."<init>":()V
      12: putfield      #25                 // Field d:Landroid/support/v4/app/o;
      15: aload_0
      16: aload_1
      17: putfield      #27                 // Field a:Landroid/app/Activity;
      20: aload_0
      21: aload_2
      22: putfield      #29                 // Field b:Landroid/content/Context;
      25: aload_0
      26: aload_3
      27: putfield      #31                 // Field e:Landroid/os/Handler;
      30: aload_0
      31: iload         4
      33: putfield      #33                 // Field c:I
      36: return

  android.support.v4.app.m(android.support.v4.app.j);
    Code:
       0: aload_0
       1: aload_1
       2: aload_1
       3: aload_1
       4: getfield      #40                 // Field android/support/v4/app/j.mHandler:Landroid/os/Handler;
       7: iconst_0
       8: invokespecial #42                 // Method "<init>":(Landroid/app/Activity;Landroid/content/Context;Landroid/os/Handler;I)V
      11: return

  public android.view.View a(int);
    Code:
       0: aconst_null
       1: areturn

  public void a(android.support.v4.app.i, android.content.Intent, int, android.os.Bundle);
    Code:
       0: iload_3
       1: iconst_m1
       2: if_icmpeq     15
       5: new           #46                 // class java/lang/IllegalStateException
       8: dup
       9: ldc           #48                 // String Starting activity with a requestCode requires a FragmentActivity host
      11: invokespecial #51                 // Method java/lang/IllegalStateException."<init>":(Ljava/lang/String;)V
      14: athrow
      15: aload_0
      16: getfield      #29                 // Field b:Landroid/content/Context;
      19: aload_2
      20: invokevirtual #57                 // Method android/content/Context.startActivity:(Landroid/content/Intent;)V
      23: return

  public void a(android.support.v4.app.i, android.content.IntentSender, int, android.content.Intent, int, int, int, android.os.Bundle);
    Code:
       0: iload_3
       1: iconst_m1
       2: if_icmpeq     15
       5: new           #46                 // class java/lang/IllegalStateException
       8: dup
       9: ldc           #60                 // String Starting intent sender with a requestCode requires a FragmentActivity host
      11: invokespecial #51                 // Method java/lang/IllegalStateException."<init>":(Ljava/lang/String;)V
      14: athrow
      15: aload_0
      16: getfield      #27                 // Field a:Landroid/app/Activity;
      19: aload_2
      20: iload_3
      21: aload         4
      23: iload         5
      25: iload         6
      27: iload         7
      29: aload         8
      31: invokestatic  #65                 // Method android/support/v4/app/a.a:(Landroid/app/Activity;Landroid/content/IntentSender;ILandroid/content/Intent;IIILandroid/os/Bundle;)V
      34: return

  public void a(android.support.v4.app.i, java.lang.String[], int);
    Code:
       0: return

  public void a(java.lang.String, java.io.FileDescriptor, java.io.PrintWriter, java.lang.String[]);
    Code:
       0: return

  public boolean a();
    Code:
       0: iconst_1
       1: ireturn

  public boolean a(android.support.v4.app.i);
    Code:
       0: iconst_1
       1: ireturn

  public boolean a(java.lang.String);
    Code:
       0: iconst_0
       1: ireturn

  public android.view.LayoutInflater b();
    Code:
       0: aload_0
       1: getfield      #29                 // Field b:Landroid/content/Context;
       4: invokestatic  #77                 // Method android/view/LayoutInflater.from:(Landroid/content/Context;)Landroid/view/LayoutInflater;
       7: areturn

  void b(android.support.v4.app.i);
    Code:
       0: return

  public void d();
    Code:
       0: return

  public boolean e();
    Code:
       0: iconst_1
       1: ireturn

  public int f();
    Code:
       0: aload_0
       1: getfield      #33                 // Field c:I
       4: ireturn

  public abstract E g();

  android.app.Activity h();
    Code:
       0: aload_0
       1: getfield      #27                 // Field a:Landroid/app/Activity;
       4: areturn

  android.content.Context i();
    Code:
       0: aload_0
       1: getfield      #29                 // Field b:Landroid/content/Context;
       4: areturn

  android.os.Handler j();
    Code:
       0: aload_0
       1: getfield      #31                 // Field e:Landroid/os/Handler;
       4: areturn

  android.support.v4.app.o k();
    Code:
       0: aload_0
       1: getfield      #25                 // Field d:Landroid/support/v4/app/o;
       4: areturn
}
