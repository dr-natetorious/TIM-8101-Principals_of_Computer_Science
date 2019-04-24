public abstract class android.support.v7.view.b {
  public android.support.v7.view.b();
    Code:
       0: aload_0
       1: invokespecial #14                 // Method java/lang/Object."<init>":()V
       4: return

  public abstract android.view.MenuInflater a();

  public abstract void a(int);

  public abstract void a(android.view.View);

  public abstract void a(java.lang.CharSequence);

  public void a(java.lang.Object);
    Code:
       0: aload_0
       1: aload_1
       2: putfield      #22                 // Field a:Ljava/lang/Object;
       5: return

  public void a(boolean);
    Code:
       0: aload_0
       1: iload_1
       2: putfield      #25                 // Field b:Z
       5: return

  public abstract android.view.Menu b();

  public abstract void b(int);

  public abstract void b(java.lang.CharSequence);

  public abstract void c();

  public abstract void d();

  public abstract java.lang.CharSequence f();

  public abstract java.lang.CharSequence g();

  public boolean h();
    Code:
       0: iconst_0
       1: ireturn

  public abstract android.view.View i();

  public java.lang.Object j();
    Code:
       0: aload_0
       1: getfield      #22                 // Field a:Ljava/lang/Object;
       4: areturn

  public boolean k();
    Code:
       0: aload_0
       1: getfield      #25                 // Field b:Z
       4: ireturn
}
