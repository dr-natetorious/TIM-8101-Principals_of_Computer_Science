class android.support.v7.app.AlertController$a$4 implements android.widget.AdapterView$OnItemClickListener {
  final android.support.v7.app.AlertController$RecycleListView a;

  final android.support.v7.app.AlertController b;

  final android.support.v7.app.AlertController$a c;

  android.support.v7.app.AlertController$a$4(android.support.v7.app.AlertController$a, android.support.v7.app.AlertController$RecycleListView, android.support.v7.app.AlertController);
    Code:
       0: aload_0
       1: aload_1
       2: putfield      #22                 // Field c:Landroid/support/v7/app/AlertController$a;
       5: aload_0
       6: aload_2
       7: putfield      #24                 // Field a:Landroid/support/v7/app/AlertController$RecycleListView;
      10: aload_0
      11: aload_3
      12: putfield      #26                 // Field b:Landroid/support/v7/app/AlertController;
      15: aload_0
      16: invokespecial #29                 // Method java/lang/Object."<init>":()V
      19: return

  public void onItemClick(android.widget.AdapterView<?>, android.view.View, int, long);
    Code:
       0: aload_0
       1: getfield      #22                 // Field c:Landroid/support/v7/app/AlertController$a;
       4: getfield      #36                 // Field android/support/v7/app/AlertController$a.F:[Z
       7: ifnull        27
      10: aload_0
      11: getfield      #22                 // Field c:Landroid/support/v7/app/AlertController$a;
      14: getfield      #36                 // Field android/support/v7/app/AlertController$a.F:[Z
      17: iload_3
      18: aload_0
      19: getfield      #24                 // Field a:Landroid/support/v7/app/AlertController$RecycleListView;
      22: iload_3
      23: invokevirtual #42                 // Method android/support/v7/app/AlertController$RecycleListView.isItemChecked:(I)Z
      26: bastore
      27: aload_0
      28: getfield      #22                 // Field c:Landroid/support/v7/app/AlertController$a;
      31: getfield      #46                 // Field android/support/v7/app/AlertController$a.J:Landroid/content/DialogInterface$OnMultiChoiceClickListener;
      34: aload_0
      35: getfield      #26                 // Field b:Landroid/support/v7/app/AlertController;
      38: getfield      #49                 // Field android/support/v7/app/AlertController.a:Landroid/support/v7/app/m;
      41: iload_3
      42: aload_0
      43: getfield      #24                 // Field a:Landroid/support/v7/app/AlertController$RecycleListView;
      46: iload_3
      47: invokevirtual #42                 // Method android/support/v7/app/AlertController$RecycleListView.isItemChecked:(I)Z
      50: invokeinterface #55,  4           // InterfaceMethod android/content/DialogInterface$OnMultiChoiceClickListener.onClick:(Landroid/content/DialogInterface;IZ)V
      55: return
}
