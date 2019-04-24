public class android.support.v4.a.a {
  static {};
    Code:
       0: new           #4                  // class java/lang/Object
       3: dup
       4: invokespecial #13                 // Method java/lang/Object."<init>":()V
       7: putstatic     #15                 // Field a:Ljava/lang/Object;
      10: return

  public static int a(android.content.Context, java.lang.String);
    Code:
       0: aload_1
       1: ifnonnull     14
       4: new           #19                 // class java/lang/IllegalArgumentException
       7: dup
       8: ldc           #21                 // String permission is null
      10: invokespecial #24                 // Method java/lang/IllegalArgumentException."<init>":(Ljava/lang/String;)V
      13: athrow
      14: aload_0
      15: aload_1
      16: invokestatic  #30                 // Method android/os/Process.myPid:()I
      19: invokestatic  #33                 // Method android/os/Process.myUid:()I
      22: invokevirtual #39                 // Method android/content/Context.checkPermission:(Ljava/lang/String;II)I
      25: ireturn

  public static android.graphics.drawable.Drawable a(android.content.Context, int);
    Code:
       0: getstatic     #46                 // Field android/os/Build$VERSION.SDK_INT:I
       3: bipush        21
       5: if_icmplt     14
       8: aload_0
       9: iload_1
      10: invokevirtual #50                 // Method android/content/Context.getDrawable:(I)Landroid/graphics/drawable/Drawable;
      13: areturn
      14: getstatic     #46                 // Field android/os/Build$VERSION.SDK_INT:I
      17: bipush        16
      19: if_icmplt     31
      22: aload_0
      23: invokevirtual #54                 // Method android/content/Context.getResources:()Landroid/content/res/Resources;
      26: iload_1
      27: invokevirtual #57                 // Method android/content/res/Resources.getDrawable:(I)Landroid/graphics/drawable/Drawable;
      30: areturn
      31: getstatic     #15                 // Field a:Ljava/lang/Object;
      34: astore_2
      35: aload_2
      36: monitorenter
      37: getstatic     #59                 // Field b:Landroid/util/TypedValue;
      40: ifnonnull     53
      43: new           #61                 // class android/util/TypedValue
      46: dup
      47: invokespecial #62                 // Method android/util/TypedValue."<init>":()V
      50: putstatic     #59                 // Field b:Landroid/util/TypedValue;
      53: aload_0
      54: invokevirtual #54                 // Method android/content/Context.getResources:()Landroid/content/res/Resources;
      57: iload_1
      58: getstatic     #59                 // Field b:Landroid/util/TypedValue;
      61: iconst_1
      62: invokevirtual #66                 // Method android/content/res/Resources.getValue:(ILandroid/util/TypedValue;Z)V
      65: getstatic     #59                 // Field b:Landroid/util/TypedValue;
      68: getfield      #69                 // Field android/util/TypedValue.resourceId:I
      71: istore_1
      72: aload_2
      73: monitorexit
      74: goto          22
      77: astore_0
      78: aload_2
      79: monitorexit
      80: aload_0
      81: athrow
    Exception table:
       from    to  target type
          37    53    77   any
          53    74    77   any
          78    80    77   any

  public static void a(android.content.Context, android.content.Intent);
    Code:
       0: getstatic     #46                 // Field android/os/Build$VERSION.SDK_INT:I
       3: bipush        26
       5: if_icmplt     15
       8: aload_0
       9: aload_1
      10: invokevirtual #74                 // Method android/content/Context.startForegroundService:(Landroid/content/Intent;)Landroid/content/ComponentName;
      13: pop
      14: return
      15: aload_0
      16: aload_1
      17: invokevirtual #77                 // Method android/content/Context.startService:(Landroid/content/Intent;)Landroid/content/ComponentName;
      20: pop
      21: return

  public static boolean a(android.content.Context, android.content.Intent[], android.os.Bundle);
    Code:
       0: getstatic     #46                 // Field android/os/Build$VERSION.SDK_INT:I
       3: bipush        16
       5: if_icmplt     17
       8: aload_0
       9: aload_1
      10: aload_2
      11: invokevirtual #82                 // Method android/content/Context.startActivities:([Landroid/content/Intent;Landroid/os/Bundle;)V
      14: goto          22
      17: aload_0
      18: aload_1
      19: invokevirtual #85                 // Method android/content/Context.startActivities:([Landroid/content/Intent;)V
      22: iconst_1
      23: ireturn

  public static android.content.res.ColorStateList b(android.content.Context, int);
    Code:
       0: getstatic     #46                 // Field android/os/Build$VERSION.SDK_INT:I
       3: bipush        23
       5: if_icmplt     14
       8: aload_0
       9: iload_1
      10: invokevirtual #90                 // Method android/content/Context.getColorStateList:(I)Landroid/content/res/ColorStateList;
      13: areturn
      14: aload_0
      15: invokevirtual #54                 // Method android/content/Context.getResources:()Landroid/content/res/Resources;
      18: iload_1
      19: invokevirtual #91                 // Method android/content/res/Resources.getColorStateList:(I)Landroid/content/res/ColorStateList;
      22: areturn

  public static int c(android.content.Context, int);
    Code:
       0: getstatic     #46                 // Field android/os/Build$VERSION.SDK_INT:I
       3: bipush        23
       5: if_icmplt     14
       8: aload_0
       9: iload_1
      10: invokevirtual #97                 // Method android/content/Context.getColor:(I)I
      13: ireturn
      14: aload_0
      15: invokevirtual #54                 // Method android/content/Context.getResources:()Landroid/content/res/Resources;
      18: iload_1
      19: invokevirtual #98                 // Method android/content/res/Resources.getColor:(I)I
      22: ireturn
}
