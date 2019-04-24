class android.support.v7.app.AlertController$5 implements java.lang.Runnable {
  final android.view.View a;

  final android.view.View b;

  final android.support.v7.app.AlertController c;

  android.support.v7.app.AlertController$5(android.support.v7.app.AlertController, android.view.View, android.view.View);
    Code:
       0: aload_0
       1: aload_1
       2: putfield      #19                 // Field c:Landroid/support/v7/app/AlertController;
       5: aload_0
       6: aload_2
       7: putfield      #21                 // Field a:Landroid/view/View;
      10: aload_0
      11: aload_3
      12: putfield      #23                 // Field b:Landroid/view/View;
      15: aload_0
      16: invokespecial #26                 // Method java/lang/Object."<init>":()V
      19: return

  public void run();
    Code:
       0: aload_0
       1: getfield      #19                 // Field c:Landroid/support/v7/app/AlertController;
       4: getfield      #31                 // Field android/support/v7/app/AlertController.b:Landroid/widget/ListView;
       7: aload_0
       8: getfield      #21                 // Field a:Landroid/view/View;
      11: aload_0
      12: getfield      #23                 // Field b:Landroid/view/View;
      15: invokestatic  #34                 // Method android/support/v7/app/AlertController.a:(Landroid/view/View;Landroid/view/View;Landroid/view/View;)V
      18: return
}
