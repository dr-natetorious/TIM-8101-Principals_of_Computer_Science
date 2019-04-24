public class android.support.v7.view.f extends android.view.ActionMode {
  final android.content.Context a;

  final android.support.v7.view.b b;

  public android.support.v7.view.f(android.content.Context, android.support.v7.view.b);
    Code:
       0: aload_0
       1: invokespecial #15                 // Method android/view/ActionMode."<init>":()V
       4: aload_0
       5: aload_1
       6: putfield      #17                 // Field a:Landroid/content/Context;
       9: aload_0
      10: aload_2
      11: putfield      #19                 // Field b:Landroid/support/v7/view/b;
      14: return

  public void finish();
    Code:
       0: aload_0
       1: getfield      #19                 // Field b:Landroid/support/v7/view/b;
       4: invokevirtual #26                 // Method android/support/v7/view/b.c:()V
       7: return

  public android.view.View getCustomView();
    Code:
       0: aload_0
       1: getfield      #19                 // Field b:Landroid/support/v7/view/b;
       4: invokevirtual #31                 // Method android/support/v7/view/b.i:()Landroid/view/View;
       7: areturn

  public android.view.Menu getMenu();
    Code:
       0: aload_0
       1: getfield      #17                 // Field a:Landroid/content/Context;
       4: aload_0
       5: getfield      #19                 // Field b:Landroid/support/v7/view/b;
       8: invokevirtual #35                 // Method android/support/v7/view/b.b:()Landroid/view/Menu;
      11: checkcast     #37                 // class android/support/v4/c/a/a
      14: invokestatic  #42                 // Method android/support/v7/view/menu/q.a:(Landroid/content/Context;Landroid/support/v4/c/a/a;)Landroid/view/Menu;
      17: areturn

  public android.view.MenuInflater getMenuInflater();
    Code:
       0: aload_0
       1: getfield      #19                 // Field b:Landroid/support/v7/view/b;
       4: invokevirtual #46                 // Method android/support/v7/view/b.a:()Landroid/view/MenuInflater;
       7: areturn

  public java.lang.CharSequence getSubtitle();
    Code:
       0: aload_0
       1: getfield      #19                 // Field b:Landroid/support/v7/view/b;
       4: invokevirtual #51                 // Method android/support/v7/view/b.g:()Ljava/lang/CharSequence;
       7: areturn

  public java.lang.Object getTag();
    Code:
       0: aload_0
       1: getfield      #19                 // Field b:Landroid/support/v7/view/b;
       4: invokevirtual #56                 // Method android/support/v7/view/b.j:()Ljava/lang/Object;
       7: areturn

  public java.lang.CharSequence getTitle();
    Code:
       0: aload_0
       1: getfield      #19                 // Field b:Landroid/support/v7/view/b;
       4: invokevirtual #60                 // Method android/support/v7/view/b.f:()Ljava/lang/CharSequence;
       7: areturn

  public boolean getTitleOptionalHint();
    Code:
       0: aload_0
       1: getfield      #19                 // Field b:Landroid/support/v7/view/b;
       4: invokevirtual #65                 // Method android/support/v7/view/b.k:()Z
       7: ireturn

  public void invalidate();
    Code:
       0: aload_0
       1: getfield      #19                 // Field b:Landroid/support/v7/view/b;
       4: invokevirtual #69                 // Method android/support/v7/view/b.d:()V
       7: return

  public boolean isTitleOptional();
    Code:
       0: aload_0
       1: getfield      #19                 // Field b:Landroid/support/v7/view/b;
       4: invokevirtual #73                 // Method android/support/v7/view/b.h:()Z
       7: ireturn

  public void setCustomView(android.view.View);
    Code:
       0: aload_0
       1: getfield      #19                 // Field b:Landroid/support/v7/view/b;
       4: aload_1
       5: invokevirtual #77                 // Method android/support/v7/view/b.a:(Landroid/view/View;)V
       8: return

  public void setSubtitle(int);
    Code:
       0: aload_0
       1: getfield      #19                 // Field b:Landroid/support/v7/view/b;
       4: iload_1
       5: invokevirtual #81                 // Method android/support/v7/view/b.b:(I)V
       8: return

  public void setSubtitle(java.lang.CharSequence);
    Code:
       0: aload_0
       1: getfield      #19                 // Field b:Landroid/support/v7/view/b;
       4: aload_1
       5: invokevirtual #84                 // Method android/support/v7/view/b.a:(Ljava/lang/CharSequence;)V
       8: return

  public void setTag(java.lang.Object);
    Code:
       0: aload_0
       1: getfield      #19                 // Field b:Landroid/support/v7/view/b;
       4: aload_1
       5: invokevirtual #88                 // Method android/support/v7/view/b.a:(Ljava/lang/Object;)V
       8: return

  public void setTitle(int);
    Code:
       0: aload_0
       1: getfield      #19                 // Field b:Landroid/support/v7/view/b;
       4: iload_1
       5: invokevirtual #91                 // Method android/support/v7/view/b.a:(I)V
       8: return

  public void setTitle(java.lang.CharSequence);
    Code:
       0: aload_0
       1: getfield      #19                 // Field b:Landroid/support/v7/view/b;
       4: aload_1
       5: invokevirtual #93                 // Method android/support/v7/view/b.b:(Ljava/lang/CharSequence;)V
       8: return

  public void setTitleOptionalHint(boolean);
    Code:
       0: aload_0
       1: getfield      #19                 // Field b:Landroid/support/v7/view/b;
       4: iload_1
       5: invokevirtual #97                 // Method android/support/v7/view/b.a:(Z)V
       8: return
}
