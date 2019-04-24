class android.support.v7.widget.bq$2 extends android.support.v4.view.z {
  final int a;

  final android.support.v7.widget.bq b;

  android.support.v7.widget.bq$2(android.support.v7.widget.bq, int);
    Code:
       0: aload_0
       1: aload_1
       2: putfield      #18                 // Field b:Landroid/support/v7/widget/bq;
       5: aload_0
       6: iload_2
       7: putfield      #20                 // Field a:I
      10: aload_0
      11: invokespecial #23                 // Method android/support/v4/view/z."<init>":()V
      14: aload_0
      15: iconst_0
      16: putfield      #25                 // Field c:Z
      19: return

  public void a(android.view.View);
    Code:
       0: aload_0
       1: getfield      #18                 // Field b:Landroid/support/v7/widget/bq;
       4: getfield      #30                 // Field android/support/v7/widget/bq.a:Landroid/support/v7/widget/Toolbar;
       7: iconst_0
       8: invokevirtual #36                 // Method android/support/v7/widget/Toolbar.setVisibility:(I)V
      11: return

  public void b(android.view.View);
    Code:
       0: aload_0
       1: getfield      #25                 // Field c:Z
       4: ifne          21
       7: aload_0
       8: getfield      #18                 // Field b:Landroid/support/v7/widget/bq;
      11: getfield      #30                 // Field android/support/v7/widget/bq.a:Landroid/support/v7/widget/Toolbar;
      14: aload_0
      15: getfield      #20                 // Field a:I
      18: invokevirtual #36                 // Method android/support/v7/widget/Toolbar.setVisibility:(I)V
      21: return

  public void c(android.view.View);
    Code:
       0: aload_0
       1: iconst_1
       2: putfield      #25                 // Field c:Z
       5: return
}
