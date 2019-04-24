class android.support.v7.app.AlertController$a$1 extends android.widget.ArrayAdapter<java.lang.CharSequence> {
  final android.support.v7.app.AlertController$RecycleListView a;

  final android.support.v7.app.AlertController$a b;

  android.support.v7.app.AlertController$a$1(android.support.v7.app.AlertController$a, android.content.Context, int, int, java.lang.CharSequence[], android.support.v7.app.AlertController$RecycleListView);
    Code:
       0: aload_0
       1: aload_1
       2: putfield      #19                 // Field b:Landroid/support/v7/app/AlertController$a;
       5: aload_0
       6: aload         6
       8: putfield      #21                 // Field a:Landroid/support/v7/app/AlertController$RecycleListView;
      11: aload_0
      12: aload_2
      13: iload_3
      14: iload         4
      16: aload         5
      18: invokespecial #24                 // Method android/widget/ArrayAdapter."<init>":(Landroid/content/Context;II[Ljava/lang/Object;)V
      21: return

  public android.view.View getView(int, android.view.View, android.view.ViewGroup);
    Code:
       0: aload_0
       1: iload_1
       2: aload_2
       3: aload_3
       4: invokespecial #29                 // Method android/widget/ArrayAdapter.getView:(ILandroid/view/View;Landroid/view/ViewGroup;)Landroid/view/View;
       7: astore_2
       8: aload_0
       9: getfield      #19                 // Field b:Landroid/support/v7/app/AlertController$a;
      12: getfield      #33                 // Field android/support/v7/app/AlertController$a.F:[Z
      15: ifnull        39
      18: aload_0
      19: getfield      #19                 // Field b:Landroid/support/v7/app/AlertController$a;
      22: getfield      #33                 // Field android/support/v7/app/AlertController$a.F:[Z
      25: iload_1
      26: baload
      27: ifeq          39
      30: aload_0
      31: getfield      #21                 // Field a:Landroid/support/v7/app/AlertController$RecycleListView;
      34: iload_1
      35: iconst_1
      36: invokevirtual #39                 // Method android/support/v7/app/AlertController$RecycleListView.setItemChecked:(IZ)V
      39: aload_2
      40: areturn
}
