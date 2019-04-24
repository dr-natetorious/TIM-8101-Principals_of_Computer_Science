class ryey.easer.plugins.event.d.f$1 extends android.content.BroadcastReceiver {
  final ryey.easer.plugins.event.d.f a;

  ryey.easer.plugins.event.d.f$1(ryey.easer.plugins.event.d.f);
    Code:
       0: aload_0
       1: aload_1
       2: putfield      #12                 // Field a:Lryey/easer/plugins/event/d/f;
       5: aload_0
       6: invokespecial #15                 // Method android/content/BroadcastReceiver."<init>":()V
       9: return

  public void onReceive(android.content.Context, android.content.Intent);
    Code:
       0: aload_2
       1: invokevirtual #24                 // Method android/content/Intent.getAction:()Ljava/lang/String;
       4: ldc           #26                 // String ryey.easer.plugins.event.bluetooth_device.return_from_dialog
       6: invokevirtual #32                 // Method java/lang/String.equals:(Ljava/lang/Object;)Z
       9: ifeq          45
      12: aload_0
      13: getfield      #12                 // Field a:Lryey/easer/plugins/event/d/f;
      16: aload_2
      17: ldc           #34                 // String ryey.easer.plugins.event.calendar.extra.calendar_id
      19: ldc2_w        #35                 // long -1l
      22: invokevirtual #40                 // Method android/content/Intent.getLongExtra:(Ljava/lang/String;J)J
      25: invokestatic  #43                 // Method ryey/easer/plugins/event/d/f.a:(Lryey/easer/plugins/event/d/f;J)J
      28: pop2
      29: aload_0
      30: getfield      #12                 // Field a:Lryey/easer/plugins/event/d/f;
      33: invokestatic  #46                 // Method ryey/easer/plugins/event/d/f.a:(Lryey/easer/plugins/event/d/f;)Landroid/widget/TextView;
      36: aload_2
      37: ldc           #48                 // String ryey.easer.plugins.event.calendar.extra.calendar_name
      39: invokevirtual #52                 // Method android/content/Intent.getStringExtra:(Ljava/lang/String;)Ljava/lang/String;
      42: invokevirtual #58                 // Method android/widget/TextView.setText:(Ljava/lang/CharSequence;)V
      45: return
}
