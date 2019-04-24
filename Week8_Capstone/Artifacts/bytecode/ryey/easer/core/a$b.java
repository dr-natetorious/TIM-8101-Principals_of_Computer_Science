public class ryey.easer.core.a$b {
  public ryey.easer.core.a$b();
    Code:
       0: aload_0
       1: invokespecial #16                 // Method java/lang/Object."<init>":()V
       4: aload_0
       5: new           #18                 // class ryey/easer/core/a$a
       8: dup
       9: invokespecial #19                 // Method ryey/easer/core/a$a."<init>":()V
      12: putfield      #21                 // Field a:Lryey/easer/core/a$a;
      15: aload_0
      16: new           #9                  // class ryey/easer/core/a$b$1
      19: dup
      20: aload_0
      21: invokespecial #24                 // Method ryey/easer/core/a$b$1."<init>":(Lryey/easer/core/a$b;)V
      24: putfield      #26                 // Field b:Landroid/content/ServiceConnection;
      27: return

  static ryey.easer.core.a$a a(ryey.easer.core.a$b);
    Code:
       0: aload_0
       1: getfield      #21                 // Field a:Lryey/easer/core/a$a;
       4: areturn

  public void a(android.content.Context);
    Code:
       0: aload_1
       1: new           #31                 // class android/content/Intent
       4: dup
       5: aload_1
       6: ldc           #33                 // class ryey/easer/core/ProfileLoaderService
       8: invokespecial #36                 // Method android/content/Intent."<init>":(Landroid/content/Context;Ljava/lang/Class;)V
      11: aload_0
      12: getfield      #26                 // Field b:Landroid/content/ServiceConnection;
      15: iconst_1
      16: invokevirtual #42                 // Method android/content/Context.bindService:(Landroid/content/Intent;Landroid/content/ServiceConnection;I)Z
      19: pop
      20: return

  public void a(java.lang.String);
    Code:
       0: aload_0
       1: getfield      #21                 // Field a:Lryey/easer/core/a$a;
       4: aload_1
       5: invokevirtual #45                 // Method ryey/easer/core/a$a.a:(Ljava/lang/String;)V
       8: return

  public void b(android.content.Context);
    Code:
       0: aload_1
       1: aload_0
       2: getfield      #26                 // Field b:Landroid/content/ServiceConnection;
       5: invokevirtual #49                 // Method android/content/Context.unbindService:(Landroid/content/ServiceConnection;)V
       8: return
}
