public class android.support.v7.app.m extends android.app.Dialog implements android.support.v7.app.f {
  public android.support.v7.app.m(android.content.Context, int);
    Code:
       0: aload_0
       1: aload_1
       2: aload_1
       3: iload_2
       4: invokestatic  #13                 // Method a:(Landroid/content/Context;I)I
       7: invokespecial #15                 // Method android/app/Dialog."<init>":(Landroid/content/Context;I)V
      10: aload_0
      11: invokevirtual #18                 // Method a:()Landroid/support/v7/app/g;
      14: aconst_null
      15: invokevirtual #23                 // Method android/support/v7/app/g.a:(Landroid/os/Bundle;)V
      18: aload_0
      19: invokevirtual #18                 // Method a:()Landroid/support/v7/app/g;
      22: invokevirtual #27                 // Method android/support/v7/app/g.j:()Z
      25: pop
      26: return

  public android.support.v7.app.g a();
    Code:
       0: aload_0
       1: getfield      #56                 // Field a:Landroid/support/v7/app/g;
       4: ifnonnull     16
       7: aload_0
       8: aload_0
       9: aload_0
      10: invokestatic  #59                 // Method android/support/v7/app/g.a:(Landroid/app/Dialog;Landroid/support/v7/app/f;)Landroid/support/v7/app/g;
      13: putfield      #56                 // Field a:Landroid/support/v7/app/g;
      16: aload_0
      17: getfield      #56                 // Field a:Landroid/support/v7/app/g;
      20: areturn

  public boolean a(int);
    Code:
       0: aload_0
       1: invokevirtual #18                 // Method a:()Landroid/support/v7/app/g;
       4: iload_1
       5: invokevirtual #63                 // Method android/support/v7/app/g.c:(I)Z
       8: ireturn

  public void addContentView(android.view.View, android.view.ViewGroup$LayoutParams);
    Code:
       0: aload_0
       1: invokevirtual #18                 // Method a:()Landroid/support/v7/app/g;
       4: aload_1
       5: aload_2
       6: invokevirtual #68                 // Method android/support/v7/app/g.b:(Landroid/view/View;Landroid/view/ViewGroup$LayoutParams;)V
       9: return

  public <T extends android.view.View> T findViewById(int);
    Code:
       0: aload_0
       1: invokevirtual #18                 // Method a:()Landroid/support/v7/app/g;
       4: iload_1
       5: invokevirtual #72                 // Method android/support/v7/app/g.a:(I)Landroid/view/View;
       8: areturn

  public void invalidateOptionsMenu();
    Code:
       0: aload_0
       1: invokevirtual #18                 // Method a:()Landroid/support/v7/app/g;
       4: invokevirtual #78                 // Method android/support/v7/app/g.f:()V
       7: return

  protected void onCreate(android.os.Bundle);
    Code:
       0: aload_0
       1: invokevirtual #18                 // Method a:()Landroid/support/v7/app/g;
       4: invokevirtual #82                 // Method android/support/v7/app/g.i:()V
       7: aload_0
       8: aload_1
       9: invokespecial #84                 // Method android/app/Dialog.onCreate:(Landroid/os/Bundle;)V
      12: aload_0
      13: invokevirtual #18                 // Method a:()Landroid/support/v7/app/g;
      16: aload_1
      17: invokevirtual #23                 // Method android/support/v7/app/g.a:(Landroid/os/Bundle;)V
      20: return

  protected void onStop();
    Code:
       0: aload_0
       1: invokespecial #87                 // Method android/app/Dialog.onStop:()V
       4: aload_0
       5: invokevirtual #18                 // Method a:()Landroid/support/v7/app/g;
       8: invokevirtual #90                 // Method android/support/v7/app/g.d:()V
      11: return

  public void onSupportActionModeFinished(android.support.v7.view.b);
    Code:
       0: return

  public void onSupportActionModeStarted(android.support.v7.view.b);
    Code:
       0: return

  public android.support.v7.view.b onWindowStartingSupportActionMode(android.support.v7.view.b$a);
    Code:
       0: aconst_null
       1: areturn

  public void setContentView(int);
    Code:
       0: aload_0
       1: invokevirtual #18                 // Method a:()Landroid/support/v7/app/g;
       4: iload_1
       5: invokevirtual #99                 // Method android/support/v7/app/g.b:(I)V
       8: return

  public void setContentView(android.view.View);
    Code:
       0: aload_0
       1: invokevirtual #18                 // Method a:()Landroid/support/v7/app/g;
       4: aload_1
       5: invokevirtual #102                // Method android/support/v7/app/g.a:(Landroid/view/View;)V
       8: return

  public void setContentView(android.view.View, android.view.ViewGroup$LayoutParams);
    Code:
       0: aload_0
       1: invokevirtual #18                 // Method a:()Landroid/support/v7/app/g;
       4: aload_1
       5: aload_2
       6: invokevirtual #104                // Method android/support/v7/app/g.a:(Landroid/view/View;Landroid/view/ViewGroup$LayoutParams;)V
       9: return

  public void setTitle(int);
    Code:
       0: aload_0
       1: iload_1
       2: invokespecial #107                // Method android/app/Dialog.setTitle:(I)V
       5: aload_0
       6: invokevirtual #18                 // Method a:()Landroid/support/v7/app/g;
       9: aload_0
      10: invokevirtual #111                // Method getContext:()Landroid/content/Context;
      13: iload_1
      14: invokevirtual #115                // Method android/content/Context.getString:(I)Ljava/lang/String;
      17: invokevirtual #118                // Method android/support/v7/app/g.a:(Ljava/lang/CharSequence;)V
      20: return

  public void setTitle(java.lang.CharSequence);
    Code:
       0: aload_0
       1: aload_1
       2: invokespecial #120                // Method android/app/Dialog.setTitle:(Ljava/lang/CharSequence;)V
       5: aload_0
       6: invokevirtual #18                 // Method a:()Landroid/support/v7/app/g;
       9: aload_1
      10: invokevirtual #118                // Method android/support/v7/app/g.a:(Ljava/lang/CharSequence;)V
      13: return
}
