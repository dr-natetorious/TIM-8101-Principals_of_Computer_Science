class ryey.easer.plugins.operation.brightness.DumbSettingBrightnessActivity$a extends android.os.Handler {
  android.app.Activity a;

  ryey.easer.plugins.operation.brightness.DumbSettingBrightnessActivity$a(android.app.Activity);
    Code:
       0: aload_0
       1: invokespecial #13                 // Method android/os/Handler."<init>":()V
       4: aload_0
       5: aload_1
       6: putfield      #15                 // Field a:Landroid/app/Activity;
       9: return

  public void handleMessage(android.os.Message);
    Code:
       0: aload_1
       1: getfield      #24                 // Field android/os/Message.what:I
       4: iconst_1
       5: if_icmpne     15
       8: aload_0
       9: getfield      #15                 // Field a:Landroid/app/Activity;
      12: invokevirtual #29                 // Method android/app/Activity.finish:()V
      15: aload_0
      16: aload_1
      17: invokespecial #31                 // Method android/os/Handler.handleMessage:(Landroid/os/Message;)V
      20: return
}
