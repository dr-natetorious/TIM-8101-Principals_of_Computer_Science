class ryey.easer.plugins.event.m.d$1 implements android.widget.CompoundButton$OnCheckedChangeListener {
  final ryey.easer.plugins.event.m.d a;

  ryey.easer.plugins.event.m.d$1(ryey.easer.plugins.event.m.d);
    Code:
       0: aload_0
       1: aload_1
       2: putfield      #17                 // Field a:Lryey/easer/plugins/event/m/d;
       5: aload_0
       6: invokespecial #20                 // Method java/lang/Object."<init>":()V
       9: return

  public void onCheckedChanged(android.widget.CompoundButton, boolean);
    Code:
       0: aload_0
       1: getfield      #17                 // Field a:Lryey/easer/plugins/event/m/d;
       4: invokestatic  #26                 // Method ryey/easer/plugins/event/m/d.a:(Lryey/easer/plugins/event/m/d;)Landroid/widget/EditText;
       7: iload_2
       8: invokevirtual #32                 // Method android/widget/EditText.setEnabled:(Z)V
      11: return
}
