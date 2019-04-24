class ryey.easer.plugins.operation.q.e$4 implements android.widget.CompoundButton$OnCheckedChangeListener {
  final ryey.easer.plugins.operation.q.e a;

  ryey.easer.plugins.operation.q.e$4(ryey.easer.plugins.operation.q.e);
    Code:
       0: aload_0
       1: aload_1
       2: putfield      #17                 // Field a:Lryey/easer/plugins/operation/q/e;
       5: aload_0
       6: invokespecial #20                 // Method java/lang/Object."<init>":()V
       9: return

  public void onCheckedChanged(android.widget.CompoundButton, boolean);
    Code:
       0: aload_0
       1: getfield      #17                 // Field a:Lryey/easer/plugins/operation/q/e;
       4: getfield      #27                 // Field ryey/easer/plugins/operation/q/e.i:Landroid/widget/SeekBar;
       7: astore_1
       8: iload_2
       9: ifeq          17
      12: iconst_0
      13: istore_3
      14: goto          20
      17: bipush        8
      19: istore_3
      20: aload_1
      21: iload_3
      22: invokevirtual #33                 // Method android/widget/SeekBar.setVisibility:(I)V
      25: return
}
