class ryey.easer.plugins.a.k.d$3 implements android.content.DialogInterface$OnClickListener {
  final android.widget.ArrayAdapter a;

  final ryey.easer.plugins.a.k.d b;

  ryey.easer.plugins.a.k.d$3(ryey.easer.plugins.a.k.d, android.widget.ArrayAdapter);
    Code:
       0: aload_0
       1: aload_1
       2: putfield      #19                 // Field b:Lryey/easer/plugins/a/k/d;
       5: aload_0
       6: aload_2
       7: putfield      #21                 // Field a:Landroid/widget/ArrayAdapter;
      10: aload_0
      11: invokespecial #23                 // Method java/lang/Object."<init>":()V
      14: return

  public void onClick(android.content.DialogInterface, int);
    Code:
       0: aload_0
       1: getfield      #19                 // Field b:Lryey/easer/plugins/a/k/d;
       4: aload_0
       5: getfield      #21                 // Field a:Landroid/widget/ArrayAdapter;
       8: iload_2
       9: invokevirtual #32                 // Method android/widget/ArrayAdapter.getItem:(I)Ljava/lang/Object;
      12: checkcast     #34                 // class ryey/easer/plugins/a/k/d$a
      15: invokestatic  #37                 // Method ryey/easer/plugins/a/k/d.a:(Lryey/easer/plugins/a/k/d;Lryey/easer/plugins/a/k/d$a;)V
      18: return
}
