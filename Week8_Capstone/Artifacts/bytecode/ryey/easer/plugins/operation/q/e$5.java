class ryey.easer.plugins.operation.q.e$5 implements android.widget.CompoundButton$OnCheckedChangeListener {
  final android.view.View a;

  final ryey.easer.plugins.operation.q.e b;

  ryey.easer.plugins.operation.q.e$5(ryey.easer.plugins.operation.q.e, android.view.View);
    Code:
       0: aload_0
       1: aload_1
       2: putfield      #19                 // Field b:Lryey/easer/plugins/operation/q/e;
       5: aload_0
       6: aload_2
       7: putfield      #21                 // Field a:Landroid/view/View;
      10: aload_0
      11: invokespecial #24                 // Method java/lang/Object."<init>":()V
      14: return

  public void onCheckedChanged(android.widget.CompoundButton, boolean);
    Code:
       0: iload_2
       1: ifeq          9
       4: iconst_0
       5: istore_3
       6: goto          12
       9: bipush        8
      11: istore_3
      12: aload_0
      13: getfield      #19                 // Field b:Lryey/easer/plugins/operation/q/e;
      16: getfield      #31                 // Field ryey/easer/plugins/operation/q/e.j:Landroid/widget/SeekBar;
      19: iload_3
      20: invokevirtual #37                 // Method android/widget/SeekBar.setVisibility:(I)V
      23: aload_0
      24: getfield      #21                 // Field a:Landroid/view/View;
      27: ldc           #38                 // int 2131296706
      29: invokevirtual #44                 // Method android/view/View.findViewById:(I)Landroid/view/View;
      32: iload_3
      33: invokevirtual #45                 // Method android/view/View.setVisibility:(I)V
      36: aload_0
      37: getfield      #19                 // Field b:Lryey/easer/plugins/operation/q/e;
      40: getfield      #49                 // Field ryey/easer/plugins/operation/q/e.k:Landroid/widget/EditText;
      43: iload_3
      44: invokevirtual #52                 // Method android/widget/EditText.setVisibility:(I)V
      47: return
}
