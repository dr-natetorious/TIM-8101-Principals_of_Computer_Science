class android.support.v7.view.menu.k$b extends android.widget.FrameLayout implements android.support.v7.view.c {
  final android.view.CollapsibleActionView a;

  android.support.v7.view.menu.k$b(android.view.View);
    Code:
       0: aload_0
       1: aload_1
       2: invokevirtual #19                 // Method android/view/View.getContext:()Landroid/content/Context;
       5: invokespecial #22                 // Method android/widget/FrameLayout."<init>":(Landroid/content/Context;)V
       8: aload_0
       9: aload_1
      10: checkcast     #24                 // class android/view/CollapsibleActionView
      13: putfield      #26                 // Field a:Landroid/view/CollapsibleActionView;
      16: aload_0
      17: aload_1
      18: invokevirtual #29                 // Method addView:(Landroid/view/View;)V
      21: return

  public void a();
    Code:
       0: aload_0
       1: getfield      #26                 // Field a:Landroid/view/CollapsibleActionView;
       4: invokeinterface #34,  1           // InterfaceMethod android/view/CollapsibleActionView.onActionViewExpanded:()V
       9: return

  public void b();
    Code:
       0: aload_0
       1: getfield      #26                 // Field a:Landroid/view/CollapsibleActionView;
       4: invokeinterface #37,  1           // InterfaceMethod android/view/CollapsibleActionView.onActionViewCollapsed:()V
       9: return

  android.view.View c();
    Code:
       0: aload_0
       1: getfield      #26                 // Field a:Landroid/view/CollapsibleActionView;
       4: checkcast     #15                 // class android/view/View
       7: areturn
}
