public class ryey.easer.commons.a {
  static {};
    Code:
       0: iconst_3
       1: anewarray     #10                 // class java/lang/String
       4: dup
       5: iconst_0
       6: ldc           #12                 // String operation
       8: aastore
       9: dup
      10: iconst_1
      11: ldc           #14                 // String event
      13: aastore
      14: dup
      15: iconst_2
      16: ldc           #16                 // String condition
      18: aastore
      19: putstatic     #18                 // Field a:[Ljava/lang/String;
      22: return

  public static java.lang.String a(int, java.lang.String);
    Code:
       0: getstatic     #26                 // Field java/util/Locale.US:Ljava/util/Locale;
       3: ldc           #28                 // String %s_plugin_enabled_%s
       5: iconst_2
       6: anewarray     #4                  // class java/lang/Object
       9: dup
      10: iconst_0
      11: getstatic     #18                 // Field a:[Ljava/lang/String;
      14: iload_0
      15: aaload
      16: aastore
      17: dup
      18: iconst_1
      19: aload_1
      20: aastore
      21: invokestatic  #32                 // Method java/lang/String.format:(Ljava/util/Locale;Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/String;
      24: areturn

  public static java.lang.String a(ryey.easer.commons.local_plugin.d);
    Code:
       0: aload_0
       1: instanceof    #35                 // class ryey/easer/commons/local_plugin/c/d
       4: ifeq          16
       7: getstatic     #18                 // Field a:[Ljava/lang/String;
      10: iconst_0
      11: aaload
      12: astore_1
      13: goto          45
      16: aload_0
      17: instanceof    #37                 // class ryey/easer/commons/local_plugin/eventplugin/b
      20: ifeq          32
      23: getstatic     #18                 // Field a:[Ljava/lang/String;
      26: iconst_1
      27: aaload
      28: astore_1
      29: goto          45
      32: aload_0
      33: instanceof    #39                 // class ryey/easer/commons/local_plugin/a/c
      36: ifeq          71
      39: getstatic     #18                 // Field a:[Ljava/lang/String;
      42: iconst_2
      43: aaload
      44: astore_1
      45: getstatic     #26                 // Field java/util/Locale.US:Ljava/util/Locale;
      48: ldc           #28                 // String %s_plugin_enabled_%s
      50: iconst_2
      51: anewarray     #4                  // class java/lang/Object
      54: dup
      55: iconst_0
      56: aload_1
      57: aastore
      58: dup
      59: iconst_1
      60: aload_0
      61: invokeinterface #44,  1           // InterfaceMethod ryey/easer/commons/local_plugin/d.a:()Ljava/lang/String;
      66: aastore
      67: invokestatic  #32                 // Method java/lang/String.format:(Ljava/util/Locale;Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/String;
      70: areturn
      71: new           #46                 // class java/lang/IllegalAccessError
      74: dup
      75: ldc           #48                 // String Unknown plugin type???
      77: invokespecial #52                 // Method java/lang/IllegalAccessError."<init>":(Ljava/lang/String;)V
      80: athrow

  public static boolean a(android.content.Context, int, java.lang.String);
    Code:
       0: aload_0
       1: invokestatic  #59                 // Method android/preference/PreferenceManager.getDefaultSharedPreferences:(Landroid/content/Context;)Landroid/content/SharedPreferences;
       4: iload_1
       5: aload_2
       6: invokestatic  #61                 // Method a:(ILjava/lang/String;)Ljava/lang/String;
       9: iconst_1
      10: invokeinterface #67,  3           // InterfaceMethod android/content/SharedPreferences.getBoolean:(Ljava/lang/String;Z)Z
      15: ireturn
}
