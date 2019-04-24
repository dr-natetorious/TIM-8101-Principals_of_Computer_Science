class android.support.v7.app.AlertController$a$3 implements android.widget.AdapterView$OnItemClickListener {
  final android.support.v7.app.AlertController a;

  final android.support.v7.app.AlertController$a b;

  android.support.v7.app.AlertController$a$3(android.support.v7.app.AlertController$a, android.support.v7.app.AlertController);
    Code:
       0: aload_0
       1: aload_1
       2: putfield      #20                 // Field b:Landroid/support/v7/app/AlertController$a;
       5: aload_0
       6: aload_2
       7: putfield      #22                 // Field a:Landroid/support/v7/app/AlertController;
      10: aload_0
      11: invokespecial #25                 // Method java/lang/Object."<init>":()V
      14: return

  public void onItemClick(android.widget.AdapterView<?>, android.view.View, int, long);
    Code:
       0: aload_0
       1: getfield      #20                 // Field b:Landroid/support/v7/app/AlertController$a;
       4: getfield      #32                 // Field android/support/v7/app/AlertController$a.x:Landroid/content/DialogInterface$OnClickListener;
       7: aload_0
       8: getfield      #22                 // Field a:Landroid/support/v7/app/AlertController;
      11: getfield      #35                 // Field android/support/v7/app/AlertController.a:Landroid/support/v7/app/m;
      14: iload_3
      15: invokeinterface #41,  3           // InterfaceMethod android/content/DialogInterface$OnClickListener.onClick:(Landroid/content/DialogInterface;I)V
      20: aload_0
      21: getfield      #20                 // Field b:Landroid/support/v7/app/AlertController$a;
      24: getfield      #45                 // Field android/support/v7/app/AlertController$a.H:Z
      27: ifne          40
      30: aload_0
      31: getfield      #22                 // Field a:Landroid/support/v7/app/AlertController;
      34: getfield      #35                 // Field android/support/v7/app/AlertController.a:Landroid/support/v7/app/m;
      37: invokevirtual #50                 // Method android/support/v7/app/m.dismiss:()V
      40: return
}
