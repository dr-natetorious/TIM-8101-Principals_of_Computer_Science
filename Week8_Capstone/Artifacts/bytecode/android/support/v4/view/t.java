public final class android.support.v4.view.t {
  static {};
    Code:
       0: getstatic     #16                 // Field android/os/Build$VERSION.SDK_INT:I
       3: bipush        25
       5: if_icmpne     31
       8: ldc           #18                 // class android/view/ViewConfiguration
      10: ldc           #20                 // String getScaledScrollFactor
      12: iconst_0
      13: anewarray     #22                 // class java/lang/Class
      16: invokevirtual #26                 // Method java/lang/Class.getDeclaredMethod:(Ljava/lang/String;[Ljava/lang/Class;)Ljava/lang/reflect/Method;
      19: putstatic     #28                 // Field a:Ljava/lang/reflect/Method;
      22: return
      23: ldc           #30                 // String ViewConfigCompat
      25: ldc           #32                 // String Could not find method getScaledScrollFactor() on ViewConfiguration
      27: invokestatic  #38                 // Method android/util/Log.i:(Ljava/lang/String;Ljava/lang/String;)I
      30: pop
      31: return
      32: astore_0
      33: goto          23
    Exception table:
       from    to  target type
           8    22    32   Class java/lang/Exception

  public static float a(android.view.ViewConfiguration, android.content.Context);
    Code:
       0: getstatic     #16                 // Field android/os/Build$VERSION.SDK_INT:I
       3: bipush        26
       5: if_icmplt     13
       8: aload_0
       9: invokevirtual #44                 // Method android/view/ViewConfiguration.getScaledHorizontalScrollFactor:()F
      12: freturn
      13: aload_0
      14: aload_1
      15: invokestatic  #47                 // Method c:(Landroid/view/ViewConfiguration;Landroid/content/Context;)F
      18: freturn

  public static float b(android.view.ViewConfiguration, android.content.Context);
    Code:
       0: getstatic     #16                 // Field android/os/Build$VERSION.SDK_INT:I
       3: bipush        26
       5: if_icmplt     13
       8: aload_0
       9: invokevirtual #51                 // Method android/view/ViewConfiguration.getScaledVerticalScrollFactor:()F
      12: freturn
      13: aload_0
      14: aload_1
      15: invokestatic  #47                 // Method c:(Landroid/view/ViewConfiguration;Landroid/content/Context;)F
      18: freturn
}
