class android.support.v7.widget.z$b$1 implements android.widget.AdapterView$OnItemClickListener {
  final android.support.v7.widget.z a;

  final android.support.v7.widget.z$b b;

  android.support.v7.widget.z$b$1(android.support.v7.widget.z$b, android.support.v7.widget.z);
    Code:
       0: aload_0
       1: aload_1
       2: putfield      #20                 // Field b:Landroid/support/v7/widget/z$b;
       5: aload_0
       6: aload_2
       7: putfield      #22                 // Field a:Landroid/support/v7/widget/z;
      10: aload_0
      11: invokespecial #25                 // Method java/lang/Object."<init>":()V
      14: return

  public void onItemClick(android.widget.AdapterView<?>, android.view.View, int, long);
    Code:
       0: aload_0
       1: getfield      #20                 // Field b:Landroid/support/v7/widget/z$b;
       4: getfield      #30                 // Field android/support/v7/widget/z$b.b:Landroid/support/v7/widget/z;
       7: iload_3
       8: invokevirtual #34                 // Method android/support/v7/widget/z.setSelection:(I)V
      11: aload_0
      12: getfield      #20                 // Field b:Landroid/support/v7/widget/z$b;
      15: getfield      #30                 // Field android/support/v7/widget/z$b.b:Landroid/support/v7/widget/z;
      18: invokevirtual #38                 // Method android/support/v7/widget/z.getOnItemClickListener:()Landroid/widget/AdapterView$OnItemClickListener;
      21: ifnull        50
      24: aload_0
      25: getfield      #20                 // Field b:Landroid/support/v7/widget/z$b;
      28: getfield      #30                 // Field android/support/v7/widget/z$b.b:Landroid/support/v7/widget/z;
      31: aload_2
      32: iload_3
      33: aload_0
      34: getfield      #20                 // Field b:Landroid/support/v7/widget/z$b;
      37: getfield      #41                 // Field android/support/v7/widget/z$b.a:Landroid/widget/ListAdapter;
      40: iload_3
      41: invokeinterface #47,  2           // InterfaceMethod android/widget/ListAdapter.getItemId:(I)J
      46: invokevirtual #51                 // Method android/support/v7/widget/z.performItemClick:(Landroid/view/View;IJ)Z
      49: pop
      50: aload_0
      51: getfield      #20                 // Field b:Landroid/support/v7/widget/z$b;
      54: invokevirtual #54                 // Method android/support/v7/widget/z$b.e:()V
      57: return
}
