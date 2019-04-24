class android.support.design.internal.c$g extends android.support.design.internal.c$j {
  public android.support.design.internal.c$g(android.view.LayoutInflater, android.view.ViewGroup, android.view.View$OnClickListener);
    Code:
       0: aload_0
       1: aload_1
       2: getstatic     #15                 // Field android/support/design/a$h.design_navigation_item:I
       5: aload_2
       6: iconst_0
       7: invokevirtual #21                 // Method android/view/LayoutInflater.inflate:(ILandroid/view/ViewGroup;Z)Landroid/view/View;
      10: invokespecial #24                 // Method android/support/design/internal/c$j."<init>":(Landroid/view/View;)V
      13: aload_0
      14: getfield      #28                 // Field a:Landroid/view/View;
      17: aload_3
      18: invokevirtual #34                 // Method android/view/View.setOnClickListener:(Landroid/view/View$OnClickListener;)V
      21: return
}
