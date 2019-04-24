class android.support.v4.app.j$a extends android.support.v4.app.m<android.support.v4.app.j> {
  final android.support.v4.app.j a;

  public android.support.v4.app.j$a(android.support.v4.app.j);
    Code:
       0: aload_0
       1: aload_1
       2: putfield      #13                 // Field a:Landroid/support/v4/app/j;
       5: aload_0
       6: aload_1
       7: invokespecial #15                 // Method android/support/v4/app/m."<init>":(Landroid/support/v4/app/j;)V
      10: return

  public android.view.View a(int);
    Code:
       0: aload_0
       1: getfield      #13                 // Field a:Landroid/support/v4/app/j;
       4: iload_1
       5: invokevirtual #20                 // Method android/support/v4/app/j.findViewById:(I)Landroid/view/View;
       8: areturn

  public void a(android.support.v4.app.i, android.content.Intent, int, android.os.Bundle);
    Code:
       0: aload_0
       1: getfield      #13                 // Field a:Landroid/support/v4/app/j;
       4: aload_1
       5: aload_2
       6: iload_3
       7: aload         4
       9: invokevirtual #24                 // Method android/support/v4/app/j.startActivityFromFragment:(Landroid/support/v4/app/i;Landroid/content/Intent;ILandroid/os/Bundle;)V
      12: return

  public void a(android.support.v4.app.i, android.content.IntentSender, int, android.content.Intent, int, int, int, android.os.Bundle);
    Code:
       0: aload_0
       1: getfield      #13                 // Field a:Landroid/support/v4/app/j;
       4: aload_1
       5: aload_2
       6: iload_3
       7: aload         4
       9: iload         5
      11: iload         6
      13: iload         7
      15: aload         8
      17: invokevirtual #28                 // Method android/support/v4/app/j.startIntentSenderFromFragment:(Landroid/support/v4/app/i;Landroid/content/IntentSender;ILandroid/content/Intent;IIILandroid/os/Bundle;)V
      20: return

  public void a(android.support.v4.app.i, java.lang.String[], int);
    Code:
       0: aload_0
       1: getfield      #13                 // Field a:Landroid/support/v4/app/j;
       4: aload_1
       5: aload_2
       6: iload_3
       7: invokevirtual #32                 // Method android/support/v4/app/j.requestPermissionsFromFragment:(Landroid/support/v4/app/i;[Ljava/lang/String;I)V
      10: return

  public void a(java.lang.String, java.io.FileDescriptor, java.io.PrintWriter, java.lang.String[]);
    Code:
       0: aload_0
       1: getfield      #13                 // Field a:Landroid/support/v4/app/j;
       4: aload_1
       5: aload_2
       6: aload_3
       7: aload         4
       9: invokevirtual #36                 // Method android/support/v4/app/j.dump:(Ljava/lang/String;Ljava/io/FileDescriptor;Ljava/io/PrintWriter;[Ljava/lang/String;)V
      12: return

  public boolean a();
    Code:
       0: aload_0
       1: getfield      #13                 // Field a:Landroid/support/v4/app/j;
       4: invokevirtual #41                 // Method android/support/v4/app/j.getWindow:()Landroid/view/Window;
       7: astore_1
       8: aload_1
       9: ifnull        21
      12: aload_1
      13: invokevirtual #47                 // Method android/view/Window.peekDecorView:()Landroid/view/View;
      16: ifnull        21
      19: iconst_1
      20: ireturn
      21: iconst_0
      22: ireturn

  public boolean a(android.support.v4.app.i);
    Code:
       0: aload_0
       1: getfield      #13                 // Field a:Landroid/support/v4/app/j;
       4: invokevirtual #51                 // Method android/support/v4/app/j.isFinishing:()Z
       7: iconst_1
       8: ixor
       9: ireturn

  public boolean a(java.lang.String);
    Code:
       0: aload_0
       1: getfield      #13                 // Field a:Landroid/support/v4/app/j;
       4: aload_1
       5: invokestatic  #57                 // Method android/support/v4/app/a.a:(Landroid/app/Activity;Ljava/lang/String;)Z
       8: ireturn

  public android.view.LayoutInflater b();
    Code:
       0: aload_0
       1: getfield      #13                 // Field a:Landroid/support/v4/app/j;
       4: invokevirtual #62                 // Method android/support/v4/app/j.getLayoutInflater:()Landroid/view/LayoutInflater;
       7: aload_0
       8: getfield      #13                 // Field a:Landroid/support/v4/app/j;
      11: invokevirtual #68                 // Method android/view/LayoutInflater.cloneInContext:(Landroid/content/Context;)Landroid/view/LayoutInflater;
      14: areturn

  public void b(android.support.v4.app.i);
    Code:
       0: aload_0
       1: getfield      #13                 // Field a:Landroid/support/v4/app/j;
       4: aload_1
       5: invokevirtual #72                 // Method android/support/v4/app/j.onAttachFragment:(Landroid/support/v4/app/i;)V
       8: return

  public android.support.v4.app.j c();
    Code:
       0: aload_0
       1: getfield      #13                 // Field a:Landroid/support/v4/app/j;
       4: areturn

  public void d();
    Code:
       0: aload_0
       1: getfield      #13                 // Field a:Landroid/support/v4/app/j;
       4: invokevirtual #79                 // Method android/support/v4/app/j.supportInvalidateOptionsMenu:()V
       7: return

  public boolean e();
    Code:
       0: aload_0
       1: getfield      #13                 // Field a:Landroid/support/v4/app/j;
       4: invokevirtual #41                 // Method android/support/v4/app/j.getWindow:()Landroid/view/Window;
       7: ifnull        12
      10: iconst_1
      11: ireturn
      12: iconst_0
      13: ireturn

  public int f();
    Code:
       0: aload_0
       1: getfield      #13                 // Field a:Landroid/support/v4/app/j;
       4: invokevirtual #41                 // Method android/support/v4/app/j.getWindow:()Landroid/view/Window;
       7: astore_1
       8: aload_1
       9: ifnonnull     14
      12: iconst_0
      13: ireturn
      14: aload_1
      15: invokevirtual #86                 // Method android/view/Window.getAttributes:()Landroid/view/WindowManager$LayoutParams;
      18: getfield      #92                 // Field android/view/WindowManager$LayoutParams.windowAnimations:I
      21: ireturn

  public java.lang.Object g();
    Code:
       0: aload_0
       1: invokevirtual #96                 // Method c:()Landroid/support/v4/app/j;
       4: areturn
}
