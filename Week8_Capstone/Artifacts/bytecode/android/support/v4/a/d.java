public final class android.support.v4.a.d {
  public static int a(android.content.Context, java.lang.String);
    Code:
       0: aload_0
       1: aload_1
       2: invokestatic  #12                 // Method android/os/Process.myPid:()I
       5: invokestatic  #15                 // Method android/os/Process.myUid:()I
       8: aload_0
       9: invokevirtual #21                 // Method android/content/Context.getPackageName:()Ljava/lang/String;
      12: invokestatic  #24                 // Method a:(Landroid/content/Context;Ljava/lang/String;IILjava/lang/String;)I
      15: ireturn

  public static int a(android.content.Context, java.lang.String, int, int, java.lang.String);
    Code:
       0: aload_0
       1: aload_1
       2: iload_2
       3: iload_3
       4: invokevirtual #29                 // Method android/content/Context.checkPermission:(Ljava/lang/String;II)I
       7: iconst_m1
       8: if_icmpne     13
      11: iconst_m1
      12: ireturn
      13: aload_1
      14: invokestatic  #34                 // Method android/support/v4/app/b.a:(Ljava/lang/String;)Ljava/lang/String;
      17: astore        5
      19: aload         5
      21: ifnonnull     26
      24: iconst_0
      25: ireturn
      26: aload         4
      28: astore_1
      29: aload         4
      31: ifnonnull     63
      34: aload_0
      35: invokevirtual #38                 // Method android/content/Context.getPackageManager:()Landroid/content/pm/PackageManager;
      38: iload_3
      39: invokevirtual #44                 // Method android/content/pm/PackageManager.getPackagesForUid:(I)[Ljava/lang/String;
      42: astore_1
      43: aload_1
      44: ifnull        61
      47: aload_1
      48: arraylength
      49: ifgt          54
      52: iconst_m1
      53: ireturn
      54: aload_1
      55: iconst_0
      56: aaload
      57: astore_1
      58: goto          63
      61: iconst_m1
      62: ireturn
      63: aload_0
      64: aload         5
      66: aload_1
      67: invokestatic  #47                 // Method android/support/v4/app/b.a:(Landroid/content/Context;Ljava/lang/String;Ljava/lang/String;)I
      70: ifeq          76
      73: bipush        -2
      75: ireturn
      76: iconst_0
      77: ireturn
}
