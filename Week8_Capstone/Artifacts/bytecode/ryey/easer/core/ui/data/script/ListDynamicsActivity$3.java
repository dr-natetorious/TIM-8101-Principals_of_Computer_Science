class ryey.easer.core.ui.data.script.ListDynamicsActivity$3 implements android.content.DialogInterface$OnClickListener {
  final android.widget.AdapterView$AdapterContextMenuInfo a;

  final ryey.easer.core.ui.data.script.ListDynamicsActivity b;

  ryey.easer.core.ui.data.script.ListDynamicsActivity$3(ryey.easer.core.ui.data.script.ListDynamicsActivity, android.widget.AdapterView$AdapterContextMenuInfo);
    Code:
       0: aload_0
       1: aload_1
       2: putfield      #19                 // Field b:Lryey/easer/core/ui/data/script/ListDynamicsActivity;
       5: aload_0
       6: aload_2
       7: putfield      #21                 // Field a:Landroid/widget/AdapterView$AdapterContextMenuInfo;
      10: aload_0
      11: invokespecial #24                 // Method java/lang/Object."<init>":()V
      14: return

  public void onClick(android.content.DialogInterface, int);
    Code:
       0: aload_0
       1: getfield      #19                 // Field b:Lryey/easer/core/ui/data/script/ListDynamicsActivity;
       4: getfield      #31                 // Field ryey/easer/core/ui/data/script/ListDynamicsActivity.c:Ljava/util/List;
       7: aload_0
       8: getfield      #21                 // Field a:Landroid/widget/AdapterView$AdapterContextMenuInfo;
      11: getfield      #37                 // Field android/widget/AdapterView$AdapterContextMenuInfo.position:I
      14: invokeinterface #43,  2           // InterfaceMethod java/util/List.remove:(I)Ljava/lang/Object;
      19: pop
      20: aload_0
      21: getfield      #19                 // Field b:Lryey/easer/core/ui/data/script/ListDynamicsActivity;
      24: getfield      #47                 // Field ryey/easer/core/ui/data/script/ListDynamicsActivity.d:Lryey/easer/core/ui/data/script/ListDynamicsActivity$a;
      27: invokevirtual #52                 // Method ryey/easer/core/ui/data/script/ListDynamicsActivity$a.notifyDataSetChanged:()V
      30: aload_1
      31: invokeinterface #57,  1           // InterfaceMethod android/content/DialogInterface.dismiss:()V
      36: return
}
