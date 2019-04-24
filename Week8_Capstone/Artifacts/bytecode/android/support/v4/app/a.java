public class android.support.v4.app.a extends android.support.v4.a.a {
  public static android.support.v4.app.a$b a();
    Code:
       0: getstatic     #27                 // Field a:Landroid/support/v4/app/a$b;
       3: areturn

  public static void a(android.app.Activity);
    Code:
       0: getstatic     #35                 // Field android/os/Build$VERSION.SDK_INT:I
       3: bipush        16
       5: if_icmplt     13
       8: aload_0
       9: invokevirtual #41                 // Method android/app/Activity.finishAffinity:()V
      12: return
      13: aload_0
      14: invokevirtual #44                 // Method android/app/Activity.finish:()V
      17: return

  public static void a(android.app.Activity, android.content.Intent, int, android.os.Bundle);
    Code:
       0: getstatic     #35                 // Field android/os/Build$VERSION.SDK_INT:I
       3: bipush        16
       5: if_icmplt     16
       8: aload_0
       9: aload_1
      10: iload_2
      11: aload_3
      12: invokevirtual #49                 // Method android/app/Activity.startActivityForResult:(Landroid/content/Intent;ILandroid/os/Bundle;)V
      15: return
      16: aload_0
      17: aload_1
      18: iload_2
      19: invokevirtual #52                 // Method android/app/Activity.startActivityForResult:(Landroid/content/Intent;I)V
      22: return

  public static void a(android.app.Activity, android.content.IntentSender, int, android.content.Intent, int, int, int, android.os.Bundle);
    Code:
       0: getstatic     #35                 // Field android/os/Build$VERSION.SDK_INT:I
       3: bipush        16
       5: if_icmplt     24
       8: aload_0
       9: aload_1
      10: iload_2
      11: aload_3
      12: iload         4
      14: iload         5
      16: iload         6
      18: aload         7
      20: invokevirtual #57                 // Method android/app/Activity.startIntentSenderForResult:(Landroid/content/IntentSender;ILandroid/content/Intent;IIILandroid/os/Bundle;)V
      23: return
      24: aload_0
      25: aload_1
      26: iload_2
      27: aload_3
      28: iload         4
      30: iload         5
      32: iload         6
      34: invokevirtual #60                 // Method android/app/Activity.startIntentSenderForResult:(Landroid/content/IntentSender;ILandroid/content/Intent;III)V
      37: return

  public static void a(android.app.Activity, android.support.v4.app.ah);
    Code:
       0: getstatic     #35                 // Field android/os/Build$VERSION.SDK_INT:I
       3: istore_2
       4: aconst_null
       5: astore_3
       6: iload_2
       7: bipush        23
       9: if_icmplt     31
      12: aload_1
      13: ifnull        25
      16: new           #20                 // class android/support/v4/app/a$e
      19: dup
      20: aload_1
      21: invokespecial #65                 // Method android/support/v4/app/a$e."<init>":(Landroid/support/v4/app/ah;)V
      24: astore_3
      25: aload_0
      26: aload_3
      27: invokevirtual #69                 // Method android/app/Activity.setEnterSharedElementCallback:(Landroid/app/SharedElementCallback;)V
      30: return
      31: getstatic     #35                 // Field android/os/Build$VERSION.SDK_INT:I
      34: bipush        21
      36: if_icmplt     55
      39: aload_1
      40: ifnull        25
      43: new           #17                 // class android/support/v4/app/a$d
      46: dup
      47: aload_1
      48: invokespecial #70                 // Method android/support/v4/app/a$d."<init>":(Landroid/support/v4/app/ah;)V
      51: astore_3
      52: goto          25
      55: return

  public static void a(android.app.Activity, java.lang.String[], int);
    Code:
       0: getstatic     #27                 // Field a:Landroid/support/v4/app/a$b;
       3: ifnull        21
       6: getstatic     #27                 // Field a:Landroid/support/v4/app/a$b;
       9: aload_0
      10: aload_1
      11: iload_2
      12: invokeinterface #74,  4           // InterfaceMethod android/support/v4/app/a$b.a:(Landroid/app/Activity;[Ljava/lang/String;I)Z
      17: ifeq          21
      20: return
      21: getstatic     #35                 // Field android/os/Build$VERSION.SDK_INT:I
      24: bipush        23
      26: if_icmplt     53
      29: aload_0
      30: instanceof    #14                 // class android/support/v4/app/a$c
      33: ifeq          46
      36: aload_0
      37: checkcast     #14                 // class android/support/v4/app/a$c
      40: iload_2
      41: invokeinterface #78,  2           // InterfaceMethod android/support/v4/app/a$c.validateRequestPermissionsRequestCode:(I)V
      46: aload_0
      47: aload_1
      48: iload_2
      49: invokevirtual #82                 // Method android/app/Activity.requestPermissions:([Ljava/lang/String;I)V
      52: return
      53: aload_0
      54: instanceof    #8                  // class android/support/v4/app/a$a
      57: ifeq          84
      60: new           #84                 // class android/os/Handler
      63: dup
      64: invokestatic  #90                 // Method android/os/Looper.getMainLooper:()Landroid/os/Looper;
      67: invokespecial #93                 // Method android/os/Handler."<init>":(Landroid/os/Looper;)V
      70: new           #6                  // class android/support/v4/app/a$1
      73: dup
      74: aload_1
      75: aload_0
      76: iload_2
      77: invokespecial #96                 // Method android/support/v4/app/a$1."<init>":([Ljava/lang/String;Landroid/app/Activity;I)V
      80: invokevirtual #100                // Method android/os/Handler.post:(Ljava/lang/Runnable;)Z
      83: pop
      84: return

  public static boolean a(android.app.Activity, java.lang.String);
    Code:
       0: getstatic     #35                 // Field android/os/Build$VERSION.SDK_INT:I
       3: bipush        23
       5: if_icmplt     14
       8: aload_0
       9: aload_1
      10: invokevirtual #105                // Method android/app/Activity.shouldShowRequestPermissionRationale:(Ljava/lang/String;)Z
      13: ireturn
      14: iconst_0
      15: ireturn

  public static void b(android.app.Activity);
    Code:
       0: getstatic     #35                 // Field android/os/Build$VERSION.SDK_INT:I
       3: bipush        21
       5: if_icmplt     13
       8: aload_0
       9: invokevirtual #108                // Method android/app/Activity.finishAfterTransition:()V
      12: return
      13: aload_0
      14: invokevirtual #44                 // Method android/app/Activity.finish:()V
      17: return

  public static void b(android.app.Activity, android.support.v4.app.ah);
    Code:
       0: getstatic     #35                 // Field android/os/Build$VERSION.SDK_INT:I
       3: istore_2
       4: aconst_null
       5: astore_3
       6: iload_2
       7: bipush        23
       9: if_icmplt     31
      12: aload_1
      13: ifnull        25
      16: new           #20                 // class android/support/v4/app/a$e
      19: dup
      20: aload_1
      21: invokespecial #65                 // Method android/support/v4/app/a$e."<init>":(Landroid/support/v4/app/ah;)V
      24: astore_3
      25: aload_0
      26: aload_3
      27: invokevirtual #111                // Method android/app/Activity.setExitSharedElementCallback:(Landroid/app/SharedElementCallback;)V
      30: return
      31: getstatic     #35                 // Field android/os/Build$VERSION.SDK_INT:I
      34: bipush        21
      36: if_icmplt     55
      39: aload_1
      40: ifnull        25
      43: new           #17                 // class android/support/v4/app/a$d
      46: dup
      47: aload_1
      48: invokespecial #70                 // Method android/support/v4/app/a$d."<init>":(Landroid/support/v4/app/ah;)V
      51: astore_3
      52: goto          25
      55: return

  public static void c(android.app.Activity);
    Code:
       0: getstatic     #35                 // Field android/os/Build$VERSION.SDK_INT:I
       3: bipush        21
       5: if_icmplt     12
       8: aload_0
       9: invokevirtual #114                // Method android/app/Activity.postponeEnterTransition:()V
      12: return

  public static void d(android.app.Activity);
    Code:
       0: getstatic     #35                 // Field android/os/Build$VERSION.SDK_INT:I
       3: bipush        21
       5: if_icmplt     12
       8: aload_0
       9: invokevirtual #117                // Method android/app/Activity.startPostponedEnterTransition:()V
      12: return
}
