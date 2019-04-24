class android.support.design.widget.CoordinatorLayout$f implements android.view.ViewTreeObserver$OnPreDrawListener {
  final android.support.design.widget.CoordinatorLayout a;

  android.support.design.widget.CoordinatorLayout$f(android.support.design.widget.CoordinatorLayout);
    Code:
       0: aload_0
       1: aload_1
       2: putfield      #15                 // Field a:Landroid/support/design/widget/CoordinatorLayout;
       5: aload_0
       6: invokespecial #18                 // Method java/lang/Object."<init>":()V
       9: return

  public boolean onPreDraw();
    Code:
       0: aload_0
       1: getfield      #15                 // Field a:Landroid/support/design/widget/CoordinatorLayout;
       4: iconst_0
       5: invokevirtual #24                 // Method android/support/design/widget/CoordinatorLayout.a:(I)V
       8: iconst_1
       9: ireturn
}
