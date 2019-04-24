public class ryey.easer.plugins.b.d {
  public static java.lang.Process a(android.content.Context, java.lang.String);
    Code:
       0: invokestatic  #12                 // Method java/lang/Runtime.getRuntime:()Ljava/lang/Runtime;
       3: iconst_3
       4: anewarray     #14                 // class java/lang/String
       7: dup
       8: iconst_0
       9: ldc           #16                 // String su
      11: aastore
      12: dup
      13: iconst_1
      14: ldc           #18                 // String -c
      16: aastore
      17: dup
      18: iconst_2
      19: aload_1
      20: aastore
      21: invokevirtual #22                 // Method java/lang/Runtime.exec:([Ljava/lang/String;)Ljava/lang/Process;
      24: areturn

  public static java.lang.Process a(java.lang.String...);
    Code:
       0: aload_0
       1: arraylength
       2: iconst_1
       3: iadd
       4: anewarray     #14                 // class java/lang/String
       7: astore_1
       8: aload_1
       9: iconst_0
      10: ldc           #16                 // String su
      12: aastore
      13: aload_0
      14: iconst_0
      15: aload_1
      16: iconst_1
      17: aload_0
      18: arraylength
      19: invokestatic  #29                 // Method java/lang/System.arraycopy:(Ljava/lang/Object;ILjava/lang/Object;II)V
      22: aload_1
      23: invokestatic  #32                 // Method c:([Ljava/lang/String;)Ljava/lang/Process;
      26: areturn

  public static void a(android.app.Activity, int, java.lang.String...);
    Code:
       0: aload_0
       1: aload_2
       2: iload_1
       3: invokestatic  #38                 // Method android/support/v4/app/a.a:(Landroid/app/Activity;[Ljava/lang/String;I)V
       6: return

  public static void a(android.content.Context, java.lang.Class);
    Code:
       0: aload_0
       1: invokevirtual #45                 // Method android/content/Context.getPackageManager:()Landroid/content/pm/PackageManager;
       4: astore_2
       5: new           #47                 // class android/content/ComponentName
       8: dup
       9: aload_0
      10: aload_1
      11: invokespecial #50                 // Method android/content/ComponentName."<init>":(Landroid/content/Context;Ljava/lang/Class;)V
      14: astore_0
      15: aload_2
      16: aload_0
      17: iconst_2
      18: iconst_1
      19: invokevirtual #56                 // Method android/content/pm/PackageManager.setComponentEnabledSetting:(Landroid/content/ComponentName;II)V
      22: aload_2
      23: aload_0
      24: iconst_1
      25: iconst_1
      26: invokevirtual #56                 // Method android/content/pm/PackageManager.setComponentEnabledSetting:(Landroid/content/ComponentName;II)V
      29: return

  public static boolean a(android.content.Context);
    Code:
       0: aload_0
       1: invokestatic  #63                 // Method android/preference/PreferenceManager.getDefaultSharedPreferences:(Landroid/content/Context;)Landroid/content/SharedPreferences;
       4: aload_0
       5: ldc           #64                 // int 2131624117
       7: invokevirtual #68                 // Method android/content/Context.getString:(I)Ljava/lang/String;
      10: iconst_0
      11: invokeinterface #74,  3           // InterfaceMethod android/content/SharedPreferences.getBoolean:(Ljava/lang/String;Z)Z
      16: ireturn

  public static boolean a(android.content.Context, java.lang.String...);
    Code:
       0: aload_1
       1: arraylength
       2: istore_3
       3: iconst_0
       4: istore_2
       5: iload_2
       6: iload_3
       7: if_icmpge     29
      10: aload_0
      11: aload_1
      12: iload_2
      13: aaload
      14: invokestatic  #80                 // Method android/support/v4/a/a.a:(Landroid/content/Context;Ljava/lang/String;)I
      17: ifeq          22
      20: iconst_0
      21: ireturn
      22: iload_2
      23: iconst_1
      24: iadd
      25: istore_2
      26: goto          5
      29: iconst_1
      30: ireturn

  public static java.lang.Process b(java.lang.String...);
    Code:
       0: aload_0
       1: arraylength
       2: iconst_1
       3: iadd
       4: anewarray     #14                 // class java/lang/String
       7: astore_1
       8: aload_1
       9: iconst_0
      10: ldc           #83                 // String sh
      12: aastore
      13: aload_0
      14: iconst_0
      15: aload_1
      16: iconst_1
      17: aload_0
      18: arraylength
      19: invokestatic  #29                 // Method java/lang/System.arraycopy:(Ljava/lang/Object;ILjava/lang/Object;II)V
      22: aload_1
      23: invokestatic  #32                 // Method c:([Ljava/lang/String;)Ljava/lang/Process;
      26: areturn

  public static boolean b(android.content.Context, java.lang.Class<? extends android.service.notification.NotificationListenerService>);
    Code:
       0: new           #47                 // class android/content/ComponentName
       3: dup
       4: aload_0
       5: aload_1
       6: invokespecial #50                 // Method android/content/ComponentName."<init>":(Landroid/content/Context;Ljava/lang/Class;)V
       9: astore_1
      10: aload_0
      11: invokevirtual #88                 // Method android/content/Context.getContentResolver:()Landroid/content/ContentResolver;
      14: ldc           #90                 // String enabled_notification_listeners
      16: invokestatic  #95                 // Method android/provider/Settings$Secure.getString:(Landroid/content/ContentResolver;Ljava/lang/String;)Ljava/lang/String;
      19: astore_0
      20: aload_0
      21: ifnull        37
      24: aload_0
      25: aload_1
      26: invokevirtual #99                 // Method android/content/ComponentName.flattenToString:()Ljava/lang/String;
      29: invokevirtual #103                // Method java/lang/String.contains:(Ljava/lang/CharSequence;)Z
      32: ifeq          37
      35: iconst_1
      36: ireturn
      37: iconst_0
      38: ireturn

  public static java.lang.Process c(java.lang.String...);
    Code:
       0: invokestatic  #12                 // Method java/lang/Runtime.getRuntime:()Ljava/lang/Runtime;
       3: aload_0
       4: iconst_0
       5: aaload
       6: invokevirtual #108                // Method java/lang/Runtime.exec:(Ljava/lang/String;)Ljava/lang/Process;
       9: astore        4
      11: new           #110                // class java/io/DataOutputStream
      14: dup
      15: aload         4
      17: invokevirtual #116                // Method java/lang/Process.getOutputStream:()Ljava/io/OutputStream;
      20: invokespecial #119                // Method java/io/DataOutputStream."<init>":(Ljava/io/OutputStream;)V
      23: astore        5
      25: iconst_1
      26: istore_1
      27: iload_1
      28: aload_0
      29: arraylength
      30: if_icmpge     95
      33: aload_0
      34: iload_1
      35: aaload
      36: astore_3
      37: aload_3
      38: astore_2
      39: aload_3
      40: ldc           #121                // String \n
      42: invokevirtual #125                // Method java/lang/String.endsWith:(Ljava/lang/String;)Z
      45: ifne          74
      48: new           #127                // class java/lang/StringBuilder
      51: dup
      52: invokespecial #130                // Method java/lang/StringBuilder."<init>":()V
      55: astore_2
      56: aload_2
      57: aload_3
      58: invokevirtual #134                // Method java/lang/StringBuilder.append:(Ljava/lang/String;)Ljava/lang/StringBuilder;
      61: pop
      62: aload_2
      63: ldc           #121                // String \n
      65: invokevirtual #134                // Method java/lang/StringBuilder.append:(Ljava/lang/String;)Ljava/lang/StringBuilder;
      68: pop
      69: aload_2
      70: invokevirtual #137                // Method java/lang/StringBuilder.toString:()Ljava/lang/String;
      73: astore_2
      74: aload         5
      76: aload_2
      77: invokevirtual #141                // Method java/lang/String.getBytes:()[B
      80: invokevirtual #145                // Method java/io/DataOutputStream.write:([B)V
      83: aload         5
      85: invokevirtual #148                // Method java/io/DataOutputStream.flush:()V
      88: iload_1
      89: iconst_1
      90: iadd
      91: istore_1
      92: goto          27
      95: aload         4
      97: areturn
}
