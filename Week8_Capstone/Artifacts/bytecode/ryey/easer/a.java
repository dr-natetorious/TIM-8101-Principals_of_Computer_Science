public class ryey.easer.a {
  public static int a(android.content.Context);
    Code:
       0: aload_0
       1: invokestatic  #10                 // Method f:(Landroid/content/Context;)Landroid/content/SharedPreferences;
       4: aload_0
       5: ldc           #11                 // int 2131624104
       7: invokevirtual #17                 // Method android/content/Context.getString:(I)Ljava/lang/String;
      10: ldc           #19                 // String 3
      12: invokeinterface #24,  3           // InterfaceMethod android/content/SharedPreferences.getString:(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;
      17: invokestatic  #30                 // Method java/lang/Integer.parseInt:(Ljava/lang/String;)I
      20: ireturn

  public static boolean b(android.content.Context);
    Code:
       0: aload_0
       1: invokestatic  #10                 // Method f:(Landroid/content/Context;)Landroid/content/SharedPreferences;
       4: aload_0
       5: ldc           #34                 // int 2131624111
       7: invokevirtual #17                 // Method android/content/Context.getString:(I)Ljava/lang/String;
      10: iconst_0
      11: invokeinterface #38,  3           // InterfaceMethod android/content/SharedPreferences.getBoolean:(Ljava/lang/String;Z)Z
      16: ireturn

  public static boolean c(android.content.Context);
    Code:
       0: aload_0
       1: invokestatic  #10                 // Method f:(Landroid/content/Context;)Landroid/content/SharedPreferences;
       4: aload_0
       5: ldc           #40                 // int 2131624116
       7: invokevirtual #17                 // Method android/content/Context.getString:(I)Ljava/lang/String;
      10: iconst_0
      11: invokeinterface #38,  3           // InterfaceMethod android/content/SharedPreferences.getBoolean:(Ljava/lang/String;Z)Z
      16: ireturn

  public static boolean d(android.content.Context);
    Code:
       0: aload_0
       1: invokestatic  #10                 // Method f:(Landroid/content/Context;)Landroid/content/SharedPreferences;
       4: aload_0
       5: ldc           #42                 // int 2131624115
       7: invokevirtual #17                 // Method android/content/Context.getString:(I)Ljava/lang/String;
      10: iconst_1
      11: invokeinterface #38,  3           // InterfaceMethod android/content/SharedPreferences.getBoolean:(Ljava/lang/String;Z)Z
      16: ireturn

  public static boolean e(android.content.Context);
    Code:
       0: getstatic     #49                 // Field android/os/Build$VERSION.SDK_INT:I
       3: bipush        26
       5: if_icmplt     10
       8: iconst_1
       9: ireturn
      10: aload_0
      11: invokestatic  #10                 // Method f:(Landroid/content/Context;)Landroid/content/SharedPreferences;
      14: aload_0
      15: ldc           #50                 // int 2131624109
      17: invokevirtual #17                 // Method android/content/Context.getString:(I)Ljava/lang/String;
      20: iconst_1
      21: invokeinterface #38,  3           // InterfaceMethod android/content/SharedPreferences.getBoolean:(Ljava/lang/String;Z)Z
      26: ireturn
}
