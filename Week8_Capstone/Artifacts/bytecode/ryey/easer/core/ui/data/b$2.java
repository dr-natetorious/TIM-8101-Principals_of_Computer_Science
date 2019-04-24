class ryey.easer.core.ui.data.b$2 implements android.content.DialogInterface$OnClickListener {
  final ryey.easer.core.ui.data.b a;

  ryey.easer.core.ui.data.b$2(ryey.easer.core.ui.data.b);
    Code:
       0: aload_0
       1: aload_1
       2: putfield      #17                 // Field a:Lryey/easer/core/ui/data/b;
       5: aload_0
       6: invokespecial #20                 // Method java/lang/Object."<init>":()V
       9: return

  public void onClick(android.content.DialogInterface, int);
    Code:
       0: aload_0
       1: getfield      #17                 // Field a:Lryey/easer/core/ui/data/b;
       4: iconst_0
       5: invokevirtual #27                 // Method ryey/easer/core/ui/data/b.setResult:(I)V
       8: aload_1
       9: invokeinterface #32,  1           // InterfaceMethod android/content/DialogInterface.cancel:()V
      14: return
}
