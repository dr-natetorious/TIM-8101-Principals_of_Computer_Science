public class ryey.easer.plugins.operation.brightness.DumbSettingBrightnessActivity extends android.app.Activity {
  public ryey.easer.plugins.operation.brightness.DumbSettingBrightnessActivity();
    Code:
       0: aload_0
       1: invokespecial #11                 // Method android/app/Activity."<init>":()V
       4: return

  static void a(android.content.Context, float);
    Code:
       0: new           #15                 // class android/content/Intent
       3: dup
       4: aload_0
       5: ldc           #2                  // class ryey/easer/plugins/operation/brightness/DumbSettingBrightnessActivity
       7: invokespecial #18                 // Method android/content/Intent."<init>":(Landroid/content/Context;Ljava/lang/Class;)V
      10: astore_2
      11: aload_2
      12: ldc           #19                 // int 268435456
      14: invokevirtual #23                 // Method android/content/Intent.setFlags:(I)Landroid/content/Intent;
      17: pop
      18: aload_2
      19: ldc           #25                 // String brightness
      21: fload_1
      22: invokevirtual #29                 // Method android/content/Intent.putExtra:(Ljava/lang/String;F)Landroid/content/Intent;
      25: pop
      26: aload_0
      27: aload_2
      28: invokevirtual #35                 // Method android/content/Context.startActivity:(Landroid/content/Intent;)V
      31: return

  protected void onCreate(android.os.Bundle);
    Code:
       0: aload_0
       1: aload_1
       2: invokespecial #39                 // Method android/app/Activity.onCreate:(Landroid/os/Bundle;)V
       5: new           #6                  // class ryey/easer/plugins/operation/brightness/DumbSettingBrightnessActivity$a
       8: dup
       9: aload_0
      10: invokespecial #42                 // Method ryey/easer/plugins/operation/brightness/DumbSettingBrightnessActivity$a."<init>":(Landroid/app/Activity;)V
      13: astore_1
      14: aload_0
      15: invokevirtual #46                 // Method getIntent:()Landroid/content/Intent;
      18: ldc           #25                 // String brightness
      20: fconst_0
      21: invokevirtual #50                 // Method android/content/Intent.getFloatExtra:(Ljava/lang/String;F)F
      24: fstore_2
      25: aload_0
      26: invokevirtual #54                 // Method getWindow:()Landroid/view/Window;
      29: invokevirtual #60                 // Method android/view/Window.getAttributes:()Landroid/view/WindowManager$LayoutParams;
      32: astore_3
      33: aload_3
      34: fload_2
      35: putfield      #66                 // Field android/view/WindowManager$LayoutParams.screenBrightness:F
      38: aload_0
      39: invokevirtual #54                 // Method getWindow:()Landroid/view/Window;
      42: aload_3
      43: invokevirtual #70                 // Method android/view/Window.setAttributes:(Landroid/view/WindowManager$LayoutParams;)V
      46: aload_1
      47: aload_1
      48: iconst_1
      49: invokevirtual #76                 // Method android/os/Handler.obtainMessage:(I)Landroid/os/Message;
      52: ldc2_w        #77                 // long 1000l
      55: invokevirtual #82                 // Method android/os/Handler.sendMessageDelayed:(Landroid/os/Message;J)Z
      58: pop
      59: return
}
