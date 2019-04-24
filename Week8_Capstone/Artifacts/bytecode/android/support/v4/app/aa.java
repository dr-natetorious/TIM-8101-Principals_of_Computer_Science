public final class android.support.v4.app.aa {
  public static android.content.Intent a(android.app.Activity);
    Code:
       0: getstatic     #14                 // Field android/os/Build$VERSION.SDK_INT:I
       3: bipush        16
       5: if_icmplt     19
       8: aload_0
       9: invokevirtual #20                 // Method android/app/Activity.getParentActivityIntent:()Landroid/content/Intent;
      12: astore_1
      13: aload_1
      14: ifnull        19
      17: aload_1
      18: areturn
      19: aload_0
      20: invokestatic  #24                 // Method b:(Landroid/app/Activity;)Ljava/lang/String;
      23: astore_1
      24: aload_1
      25: ifnonnull     30
      28: aconst_null
      29: areturn
      30: new           #26                 // class android/content/ComponentName
      33: dup
      34: aload_0
      35: aload_1
      36: invokespecial #30                 // Method android/content/ComponentName."<init>":(Landroid/content/Context;Ljava/lang/String;)V
      39: astore_2
      40: aload_0
      41: aload_2
      42: invokestatic  #33                 // Method b:(Landroid/content/Context;Landroid/content/ComponentName;)Ljava/lang/String;
      45: ifnonnull     53
      48: aload_2
      49: invokestatic  #39                 // Method android/content/Intent.makeMainActivity:(Landroid/content/ComponentName;)Landroid/content/Intent;
      52: areturn
      53: new           #35                 // class android/content/Intent
      56: dup
      57: invokespecial #42                 // Method android/content/Intent."<init>":()V
      60: aload_2
      61: invokevirtual #45                 // Method android/content/Intent.setComponent:(Landroid/content/ComponentName;)Landroid/content/Intent;
      64: astore_0
      65: aload_0
      66: areturn
      67: new           #47                 // class java/lang/StringBuilder
      70: dup
      71: invokespecial #48                 // Method java/lang/StringBuilder."<init>":()V
      74: astore_0
      75: aload_0
      76: ldc           #50                 // String getParentActivityIntent: bad parentActivityName '
      78: invokevirtual #54                 // Method java/lang/StringBuilder.append:(Ljava/lang/String;)Ljava/lang/StringBuilder;
      81: pop
      82: aload_0
      83: aload_1
      84: invokevirtual #54                 // Method java/lang/StringBuilder.append:(Ljava/lang/String;)Ljava/lang/StringBuilder;
      87: pop
      88: aload_0
      89: ldc           #56                 // String ' in manifest
      91: invokevirtual #54                 // Method java/lang/StringBuilder.append:(Ljava/lang/String;)Ljava/lang/StringBuilder;
      94: pop
      95: ldc           #58                 // String NavUtils
      97: aload_0
      98: invokevirtual #62                 // Method java/lang/StringBuilder.toString:()Ljava/lang/String;
     101: invokestatic  #68                 // Method android/util/Log.e:(Ljava/lang/String;Ljava/lang/String;)I
     104: pop
     105: aconst_null
     106: areturn
     107: astore_0
     108: goto          67
    Exception table:
       from    to  target type
          40    53   107   Class android/content/pm/PackageManager$NameNotFoundException
          53    65   107   Class android/content/pm/PackageManager$NameNotFoundException

  public static android.content.Intent a(android.content.Context, android.content.ComponentName);
    Code:
       0: aload_0
       1: aload_1
       2: invokestatic  #33                 // Method b:(Landroid/content/Context;Landroid/content/ComponentName;)Ljava/lang/String;
       5: astore_2
       6: aload_2
       7: ifnonnull     12
      10: aconst_null
      11: areturn
      12: new           #26                 // class android/content/ComponentName
      15: dup
      16: aload_1
      17: invokevirtual #73                 // Method android/content/ComponentName.getPackageName:()Ljava/lang/String;
      20: aload_2
      21: invokespecial #76                 // Method android/content/ComponentName."<init>":(Ljava/lang/String;Ljava/lang/String;)V
      24: astore_1
      25: aload_0
      26: aload_1
      27: invokestatic  #33                 // Method b:(Landroid/content/Context;Landroid/content/ComponentName;)Ljava/lang/String;
      30: ifnonnull     38
      33: aload_1
      34: invokestatic  #39                 // Method android/content/Intent.makeMainActivity:(Landroid/content/ComponentName;)Landroid/content/Intent;
      37: areturn
      38: new           #35                 // class android/content/Intent
      41: dup
      42: invokespecial #42                 // Method android/content/Intent."<init>":()V
      45: aload_1
      46: invokevirtual #45                 // Method android/content/Intent.setComponent:(Landroid/content/ComponentName;)Landroid/content/Intent;
      49: areturn

  public static boolean a(android.app.Activity, android.content.Intent);
    Code:
       0: getstatic     #14                 // Field android/os/Build$VERSION.SDK_INT:I
       3: bipush        16
       5: if_icmplt     14
       8: aload_0
       9: aload_1
      10: invokevirtual #81                 // Method android/app/Activity.shouldUpRecreateTask:(Landroid/content/Intent;)Z
      13: ireturn
      14: aload_0
      15: invokevirtual #84                 // Method android/app/Activity.getIntent:()Landroid/content/Intent;
      18: invokevirtual #87                 // Method android/content/Intent.getAction:()Ljava/lang/String;
      21: astore_0
      22: aload_0
      23: ifnull        37
      26: aload_0
      27: ldc           #89                 // String android.intent.action.MAIN
      29: invokevirtual #95                 // Method java/lang/String.equals:(Ljava/lang/Object;)Z
      32: ifne          37
      35: iconst_1
      36: ireturn
      37: iconst_0
      38: ireturn

  public static java.lang.String b(android.app.Activity);
    Code:
       0: aload_0
       1: aload_0
       2: invokevirtual #99                 // Method android/app/Activity.getComponentName:()Landroid/content/ComponentName;
       5: invokestatic  #33                 // Method b:(Landroid/content/Context;Landroid/content/ComponentName;)Ljava/lang/String;
       8: astore_0
       9: aload_0
      10: areturn
      11: astore_0
      12: new           #101                // class java/lang/IllegalArgumentException
      15: dup
      16: aload_0
      17: invokespecial #104                // Method java/lang/IllegalArgumentException."<init>":(Ljava/lang/Throwable;)V
      20: athrow
    Exception table:
       from    to  target type
           0     9    11   Class android/content/pm/PackageManager$NameNotFoundException

  public static java.lang.String b(android.content.Context, android.content.ComponentName);
    Code:
       0: aload_0
       1: invokevirtual #110                // Method android/content/Context.getPackageManager:()Landroid/content/pm/PackageManager;
       4: aload_1
       5: sipush        128
       8: invokevirtual #116                // Method android/content/pm/PackageManager.getActivityInfo:(Landroid/content/ComponentName;I)Landroid/content/pm/ActivityInfo;
      11: astore_1
      12: getstatic     #14                 // Field android/os/Build$VERSION.SDK_INT:I
      15: bipush        16
      17: if_icmplt     31
      20: aload_1
      21: getfield      #122                // Field android/content/pm/ActivityInfo.parentActivityName:Ljava/lang/String;
      24: astore_2
      25: aload_2
      26: ifnull        31
      29: aload_2
      30: areturn
      31: aload_1
      32: getfield      #126                // Field android/content/pm/ActivityInfo.metaData:Landroid/os/Bundle;
      35: ifnonnull     40
      38: aconst_null
      39: areturn
      40: aload_1
      41: getfield      #126                // Field android/content/pm/ActivityInfo.metaData:Landroid/os/Bundle;
      44: ldc           #128                // String android.support.PARENT_ACTIVITY
      46: invokevirtual #134                // Method android/os/Bundle.getString:(Ljava/lang/String;)Ljava/lang/String;
      49: astore_2
      50: aload_2
      51: ifnonnull     56
      54: aconst_null
      55: areturn
      56: aload_2
      57: astore_1
      58: aload_2
      59: iconst_0
      60: invokevirtual #138                // Method java/lang/String.charAt:(I)C
      63: bipush        46
      65: if_icmpne     96
      68: new           #47                 // class java/lang/StringBuilder
      71: dup
      72: invokespecial #48                 // Method java/lang/StringBuilder."<init>":()V
      75: astore_1
      76: aload_1
      77: aload_0
      78: invokevirtual #139                // Method android/content/Context.getPackageName:()Ljava/lang/String;
      81: invokevirtual #54                 // Method java/lang/StringBuilder.append:(Ljava/lang/String;)Ljava/lang/StringBuilder;
      84: pop
      85: aload_1
      86: aload_2
      87: invokevirtual #54                 // Method java/lang/StringBuilder.append:(Ljava/lang/String;)Ljava/lang/StringBuilder;
      90: pop
      91: aload_1
      92: invokevirtual #62                 // Method java/lang/StringBuilder.toString:()Ljava/lang/String;
      95: astore_1
      96: aload_1
      97: areturn

  public static void b(android.app.Activity, android.content.Intent);
    Code:
       0: getstatic     #14                 // Field android/os/Build$VERSION.SDK_INT:I
       3: bipush        16
       5: if_icmplt     15
       8: aload_0
       9: aload_1
      10: invokevirtual #143                // Method android/app/Activity.navigateUpTo:(Landroid/content/Intent;)Z
      13: pop
      14: return
      15: aload_1
      16: ldc           #144                // int 67108864
      18: invokevirtual #148                // Method android/content/Intent.addFlags:(I)Landroid/content/Intent;
      21: pop
      22: aload_0
      23: aload_1
      24: invokevirtual #152                // Method android/app/Activity.startActivity:(Landroid/content/Intent;)V
      27: aload_0
      28: invokevirtual #155                // Method android/app/Activity.finish:()V
      31: return
}
