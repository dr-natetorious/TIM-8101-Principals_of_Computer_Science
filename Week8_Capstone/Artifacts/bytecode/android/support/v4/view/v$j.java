class android.support.v4.view.v$j implements java.util.Comparator<android.view.View> {
  android.support.v4.view.v$j();
    Code:
       0: aload_0
       1: invokespecial #14                 // Method java/lang/Object."<init>":()V
       4: return

  public int a(android.view.View, android.view.View);
    Code:
       0: aload_1
       1: invokevirtual #23                 // Method android/view/View.getLayoutParams:()Landroid/view/ViewGroup$LayoutParams;
       4: checkcast     #25                 // class android/support/v4/view/v$c
       7: astore_1
       8: aload_2
       9: invokevirtual #23                 // Method android/view/View.getLayoutParams:()Landroid/view/ViewGroup$LayoutParams;
      12: checkcast     #25                 // class android/support/v4/view/v$c
      15: astore_2
      16: aload_1
      17: getfield      #28                 // Field android/support/v4/view/v$c.a:Z
      20: aload_2
      21: getfield      #28                 // Field android/support/v4/view/v$c.a:Z
      24: if_icmpeq     38
      27: aload_1
      28: getfield      #28                 // Field android/support/v4/view/v$c.a:Z
      31: ifeq          36
      34: iconst_1
      35: ireturn
      36: iconst_m1
      37: ireturn
      38: aload_1
      39: getfield      #32                 // Field android/support/v4/view/v$c.e:I
      42: aload_2
      43: getfield      #32                 // Field android/support/v4/view/v$c.e:I
      46: isub
      47: ireturn

  public int compare(java.lang.Object, java.lang.Object);
    Code:
       0: aload_0
       1: aload_1
       2: checkcast     #19                 // class android/view/View
       5: aload_2
       6: checkcast     #19                 // class android/view/View
       9: invokevirtual #36                 // Method a:(Landroid/view/View;Landroid/view/View;)I
      12: ireturn
}
