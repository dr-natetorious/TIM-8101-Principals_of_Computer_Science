public class android.support.v7.widget.Toolbar$b extends android.support.v7.app.a$a {
  int b;

  public android.support.v7.widget.Toolbar$b(int, int);
    Code:
       0: aload_0
       1: iload_1
       2: iload_2
       3: invokespecial #12                 // Method android/support/v7/app/a$a."<init>":(II)V
       6: aload_0
       7: iconst_0
       8: putfield      #14                 // Field b:I
      11: aload_0
      12: ldc           #15                 // int 8388627
      14: putfield      #18                 // Field a:I
      17: return

  public android.support.v7.widget.Toolbar$b(android.content.Context, android.util.AttributeSet);
    Code:
       0: aload_0
       1: aload_1
       2: aload_2
       3: invokespecial #22                 // Method android/support/v7/app/a$a."<init>":(Landroid/content/Context;Landroid/util/AttributeSet;)V
       6: aload_0
       7: iconst_0
       8: putfield      #14                 // Field b:I
      11: return

  public android.support.v7.widget.Toolbar$b(android.support.v7.app.a$a);
    Code:
       0: aload_0
       1: aload_1
       2: invokespecial #25                 // Method android/support/v7/app/a$a."<init>":(Landroid/support/v7/app/a$a;)V
       5: aload_0
       6: iconst_0
       7: putfield      #14                 // Field b:I
      10: return

  public android.support.v7.widget.Toolbar$b(android.support.v7.widget.Toolbar$b);
    Code:
       0: aload_0
       1: aload_1
       2: invokespecial #25                 // Method android/support/v7/app/a$a."<init>":(Landroid/support/v7/app/a$a;)V
       5: aload_0
       6: iconst_0
       7: putfield      #14                 // Field b:I
      10: aload_0
      11: aload_1
      12: getfield      #14                 // Field b:I
      15: putfield      #14                 // Field b:I
      18: return

  public android.support.v7.widget.Toolbar$b(android.view.ViewGroup$LayoutParams);
    Code:
       0: aload_0
       1: aload_1
       2: invokespecial #29                 // Method android/support/v7/app/a$a."<init>":(Landroid/view/ViewGroup$LayoutParams;)V
       5: aload_0
       6: iconst_0
       7: putfield      #14                 // Field b:I
      10: return

  public android.support.v7.widget.Toolbar$b(android.view.ViewGroup$MarginLayoutParams);
    Code:
       0: aload_0
       1: aload_1
       2: invokespecial #29                 // Method android/support/v7/app/a$a."<init>":(Landroid/view/ViewGroup$LayoutParams;)V
       5: aload_0
       6: iconst_0
       7: putfield      #14                 // Field b:I
      10: aload_0
      11: aload_1
      12: invokevirtual #32                 // Method a:(Landroid/view/ViewGroup$MarginLayoutParams;)V
      15: return

  void a(android.view.ViewGroup$MarginLayoutParams);
    Code:
       0: aload_0
       1: aload_1
       2: getfield      #37                 // Field android/view/ViewGroup$MarginLayoutParams.leftMargin:I
       5: putfield      #38                 // Field leftMargin:I
       8: aload_0
       9: aload_1
      10: getfield      #41                 // Field android/view/ViewGroup$MarginLayoutParams.topMargin:I
      13: putfield      #42                 // Field topMargin:I
      16: aload_0
      17: aload_1
      18: getfield      #45                 // Field android/view/ViewGroup$MarginLayoutParams.rightMargin:I
      21: putfield      #46                 // Field rightMargin:I
      24: aload_0
      25: aload_1
      26: getfield      #49                 // Field android/view/ViewGroup$MarginLayoutParams.bottomMargin:I
      29: putfield      #50                 // Field bottomMargin:I
      32: return
}
