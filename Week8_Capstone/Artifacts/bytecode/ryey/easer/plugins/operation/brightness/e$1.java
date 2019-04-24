class ryey.easer.plugins.operation.brightness.e$1 implements android.widget.CompoundButton$OnCheckedChangeListener {
  final ryey.easer.plugins.operation.brightness.e a;

  ryey.easer.plugins.operation.brightness.e$1(ryey.easer.plugins.operation.brightness.e);
    Code:
       0: aload_0
       1: aload_1
       2: putfield      #16                 // Field a:Lryey/easer/plugins/operation/brightness/e;
       5: aload_0
       6: invokespecial #19                 // Method java/lang/Object."<init>":()V
       9: return

  public void onCheckedChanged(android.widget.CompoundButton, boolean);
    Code:
       0: iload_2
       1: ifeq          20
       4: aload_0
       5: getfield      #16                 // Field a:Lryey/easer/plugins/operation/brightness/e;
       8: invokestatic  #25                 // Method ryey/easer/plugins/operation/brightness/e.a:(Lryey/easer/plugins/operation/brightness/e;)Landroid/widget/SeekBar;
      11: astore_1
      12: iconst_0
      13: istore_2
      14: aload_1
      15: iload_2
      16: invokevirtual #31                 // Method android/widget/SeekBar.setEnabled:(Z)V
      19: return
      20: aload_0
      21: getfield      #16                 // Field a:Lryey/easer/plugins/operation/brightness/e;
      24: invokestatic  #25                 // Method ryey/easer/plugins/operation/brightness/e.a:(Lryey/easer/plugins/operation/brightness/e;)Landroid/widget/SeekBar;
      27: astore_1
      28: iconst_1
      29: istore_2
      30: goto          14
}
