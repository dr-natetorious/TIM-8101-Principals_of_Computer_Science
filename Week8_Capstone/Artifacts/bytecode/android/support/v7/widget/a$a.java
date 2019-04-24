public class android.support.v7.widget.a$a implements android.support.v4.view.y {
  int a;

  final android.support.v7.widget.a b;

  protected android.support.v7.widget.a$a(android.support.v7.widget.a);
    Code:
       0: aload_0
       1: aload_1
       2: putfield      #18                 // Field b:Landroid/support/v7/widget/a;
       5: aload_0
       6: invokespecial #21                 // Method java/lang/Object."<init>":()V
       9: aload_0
      10: iconst_0
      11: putfield      #23                 // Field c:Z
      14: return

  public android.support.v7.widget.a$a a(android.support.v4.view.x, int);
    Code:
       0: aload_0
       1: getfield      #18                 // Field b:Landroid/support/v7/widget/a;
       4: aload_1
       5: putfield      #29                 // Field android/support/v7/widget/a.f:Landroid/support/v4/view/x;
       8: aload_0
       9: iload_2
      10: putfield      #31                 // Field a:I
      13: aload_0
      14: areturn

  public void a(android.view.View);
    Code:
       0: aload_0
       1: getfield      #18                 // Field b:Landroid/support/v7/widget/a;
       4: iconst_0
       5: invokestatic  #35                 // Method android/support/v7/widget/a.a:(Landroid/support/v7/widget/a;I)V
       8: aload_0
       9: iconst_0
      10: putfield      #23                 // Field c:Z
      13: return

  public void b(android.view.View);
    Code:
       0: aload_0
       1: getfield      #23                 // Field c:Z
       4: ifeq          8
       7: return
       8: aload_0
       9: getfield      #18                 // Field b:Landroid/support/v7/widget/a;
      12: aconst_null
      13: putfield      #29                 // Field android/support/v7/widget/a.f:Landroid/support/v4/view/x;
      16: aload_0
      17: getfield      #18                 // Field b:Landroid/support/v7/widget/a;
      20: aload_0
      21: getfield      #31                 // Field a:I
      24: invokestatic  #37                 // Method android/support/v7/widget/a.b:(Landroid/support/v7/widget/a;I)V
      27: return

  public void c(android.view.View);
    Code:
       0: aload_0
       1: iconst_1
       2: putfield      #23                 // Field c:Z
       5: return
}
