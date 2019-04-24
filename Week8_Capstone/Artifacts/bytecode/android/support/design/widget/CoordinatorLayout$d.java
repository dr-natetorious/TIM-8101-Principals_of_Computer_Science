class android.support.design.widget.CoordinatorLayout$d implements android.view.ViewGroup$OnHierarchyChangeListener {
  final android.support.design.widget.CoordinatorLayout a;

  android.support.design.widget.CoordinatorLayout$d(android.support.design.widget.CoordinatorLayout);
    Code:
       0: aload_0
       1: aload_1
       2: putfield      #15                 // Field a:Landroid/support/design/widget/CoordinatorLayout;
       5: aload_0
       6: invokespecial #18                 // Method java/lang/Object."<init>":()V
       9: return

  public void onChildViewAdded(android.view.View, android.view.View);
    Code:
       0: aload_0
       1: getfield      #15                 // Field a:Landroid/support/design/widget/CoordinatorLayout;
       4: getfield      #25                 // Field android/support/design/widget/CoordinatorLayout.e:Landroid/view/ViewGroup$OnHierarchyChangeListener;
       7: ifnull        24
      10: aload_0
      11: getfield      #15                 // Field a:Landroid/support/design/widget/CoordinatorLayout;
      14: getfield      #25                 // Field android/support/design/widget/CoordinatorLayout.e:Landroid/view/ViewGroup$OnHierarchyChangeListener;
      17: aload_1
      18: aload_2
      19: invokeinterface #27,  3           // InterfaceMethod android/view/ViewGroup$OnHierarchyChangeListener.onChildViewAdded:(Landroid/view/View;Landroid/view/View;)V
      24: return

  public void onChildViewRemoved(android.view.View, android.view.View);
    Code:
       0: aload_0
       1: getfield      #15                 // Field a:Landroid/support/design/widget/CoordinatorLayout;
       4: iconst_2
       5: invokevirtual #31                 // Method android/support/design/widget/CoordinatorLayout.a:(I)V
       8: aload_0
       9: getfield      #15                 // Field a:Landroid/support/design/widget/CoordinatorLayout;
      12: getfield      #25                 // Field android/support/design/widget/CoordinatorLayout.e:Landroid/view/ViewGroup$OnHierarchyChangeListener;
      15: ifnull        32
      18: aload_0
      19: getfield      #15                 // Field a:Landroid/support/design/widget/CoordinatorLayout;
      22: getfield      #25                 // Field android/support/design/widget/CoordinatorLayout.e:Landroid/view/ViewGroup$OnHierarchyChangeListener;
      25: aload_1
      26: aload_2
      27: invokeinterface #33,  3           // InterfaceMethod android/view/ViewGroup$OnHierarchyChangeListener.onChildViewRemoved:(Landroid/view/View;Landroid/view/View;)V
      32: return
}
