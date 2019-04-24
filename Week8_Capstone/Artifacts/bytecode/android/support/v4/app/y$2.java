class android.support.v4.app.y$2 implements android.widget.AdapterView$OnItemClickListener {
  final android.support.v4.app.y a;

  android.support.v4.app.y$2(android.support.v4.app.y);
    Code:
       0: aload_0
       1: aload_1
       2: putfield      #14                 // Field a:Landroid/support/v4/app/y;
       5: aload_0
       6: invokespecial #17                 // Method java/lang/Object."<init>":()V
       9: return

  public void onItemClick(android.widget.AdapterView<?>, android.view.View, int, long);
    Code:
       0: aload_0
       1: getfield      #14                 // Field a:Landroid/support/v4/app/y;
       4: aload_1
       5: checkcast     #22                 // class android/widget/ListView
       8: aload_2
       9: iload_3
      10: lload         4
      12: invokevirtual #25                 // Method android/support/v4/app/y.a:(Landroid/widget/ListView;Landroid/view/View;IJ)V
      15: return
}
