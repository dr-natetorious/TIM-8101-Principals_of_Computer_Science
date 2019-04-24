public final class android.support.v4.app.b {
  public static int a(android.content.Context, java.lang.String, java.lang.String);
    Code:
       0: getstatic     #12                 // Field android/os/Build$VERSION.SDK_INT:I
       3: bipush        23
       5: if_icmplt     23
       8: aload_0
       9: ldc           #14                 // class android/app/AppOpsManager
      11: invokevirtual #20                 // Method android/content/Context.getSystemService:(Ljava/lang/Class;)Ljava/lang/Object;
      14: checkcast     #14                 // class android/app/AppOpsManager
      17: aload_1
      18: aload_2
      19: invokevirtual #24                 // Method android/app/AppOpsManager.noteProxyOpNoThrow:(Ljava/lang/String;Ljava/lang/String;)I
      22: ireturn
      23: iconst_1
      24: ireturn

  public static java.lang.String a(java.lang.String);
    Code:
       0: getstatic     #12                 // Field android/os/Build$VERSION.SDK_INT:I
       3: bipush        23
       5: if_icmplt     13
       8: aload_0
       9: invokestatic  #29                 // Method android/app/AppOpsManager.permissionToOp:(Ljava/lang/String;)Ljava/lang/String;
      12: areturn
      13: aconst_null
      14: areturn
}
