class android.support.design.widget.CoordinatorLayout$h implements java.util.Comparator<android.view.View> {
  android.support.design.widget.CoordinatorLayout$h();
    Code:
       0: aload_0
       1: invokespecial #14                 // Method java/lang/Object."<init>":()V
       4: return

  public int a(android.view.View, android.view.View);
    Code:
       0: aload_1
       1: invokestatic  #23                 // Method android/support/v4/view/s.x:(Landroid/view/View;)F
       4: fstore_3
       5: aload_2
       6: invokestatic  #23                 // Method android/support/v4/view/s.x:(Landroid/view/View;)F
       9: fstore        4
      11: fload_3
      12: fload         4
      14: fcmpl
      15: ifle          20
      18: iconst_m1
      19: ireturn
      20: fload_3
      21: fload         4
      23: fcmpg
      24: ifge          29
      27: iconst_1
      28: ireturn
      29: iconst_0
      30: ireturn

  public int compare(java.lang.Object, java.lang.Object);
    Code:
       0: aload_0
       1: aload_1
       2: checkcast     #27                 // class android/view/View
       5: aload_2
       6: checkcast     #27                 // class android/view/View
       9: invokevirtual #29                 // Method a:(Landroid/view/View;Landroid/view/View;)I
      12: ireturn
}
