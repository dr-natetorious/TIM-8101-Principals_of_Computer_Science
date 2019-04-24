public class android.support.v7.widget.bx {
  static {};
    Code:
       0: getstatic     #16                 // Field android/os/Build$VERSION.SDK_INT:I
       3: bipush        18
       5: if_icmplt     57
       8: ldc           #18                 // class android/view/View
      10: ldc           #20                 // String computeFitSystemWindows
      12: iconst_2
      13: anewarray     #22                 // class java/lang/Class
      16: dup
      17: iconst_0
      18: ldc           #24                 // class android/graphics/Rect
      20: aastore
      21: dup
      22: iconst_1
      23: ldc           #24                 // class android/graphics/Rect
      25: aastore
      26: invokevirtual #28                 // Method java/lang/Class.getDeclaredMethod:(Ljava/lang/String;[Ljava/lang/Class;)Ljava/lang/reflect/Method;
      29: putstatic     #30                 // Field a:Ljava/lang/reflect/Method;
      32: getstatic     #30                 // Field a:Ljava/lang/reflect/Method;
      35: invokevirtual #36                 // Method java/lang/reflect/Method.isAccessible:()Z
      38: ifne          57
      41: getstatic     #30                 // Field a:Ljava/lang/reflect/Method;
      44: iconst_1
      45: invokevirtual #40                 // Method java/lang/reflect/Method.setAccessible:(Z)V
      48: return
      49: ldc           #42                 // String ViewUtils
      51: ldc           #44                 // String Could not find method computeFitSystemWindows. Oh well.
      53: invokestatic  #50                 // Method android/util/Log.d:(Ljava/lang/String;Ljava/lang/String;)I
      56: pop
      57: return
      58: astore_0
      59: goto          49
    Exception table:
       from    to  target type
           8    48    58   Class java/lang/NoSuchMethodException

  public static void a(android.view.View, android.graphics.Rect, android.graphics.Rect);
    Code:
       0: getstatic     #30                 // Field a:Ljava/lang/reflect/Method;
       3: ifnull        37
       6: getstatic     #30                 // Field a:Ljava/lang/reflect/Method;
       9: aload_0
      10: iconst_2
      11: anewarray     #4                  // class java/lang/Object
      14: dup
      15: iconst_0
      16: aload_1
      17: aastore
      18: dup
      19: iconst_1
      20: aload_2
      21: aastore
      22: invokevirtual #58                 // Method java/lang/reflect/Method.invoke:(Ljava/lang/Object;[Ljava/lang/Object;)Ljava/lang/Object;
      25: pop
      26: return
      27: astore_0
      28: ldc           #42                 // String ViewUtils
      30: ldc           #60                 // String Could not invoke computeFitSystemWindows
      32: aload_0
      33: invokestatic  #63                 // Method android/util/Log.d:(Ljava/lang/String;Ljava/lang/String;Ljava/lang/Throwable;)I
      36: pop
      37: return
    Exception table:
       from    to  target type
           6    26    27   Class java/lang/Exception

  public static boolean a(android.view.View);
    Code:
       0: aload_0
       1: invokestatic  #70                 // Method android/support/v4/view/s.e:(Landroid/view/View;)I
       4: iconst_1
       5: if_icmpne     10
       8: iconst_1
       9: ireturn
      10: iconst_0
      11: ireturn

  public static void b(android.view.View);
    Code:
       0: getstatic     #16                 // Field android/os/Build$VERSION.SDK_INT:I
       3: bipush        16
       5: if_icmplt     64
       8: aload_0
       9: invokevirtual #80                 // Method java/lang/Object.getClass:()Ljava/lang/Class;
      12: ldc           #82                 // String makeOptionalFitsSystemWindows
      14: iconst_0
      15: anewarray     #22                 // class java/lang/Class
      18: invokevirtual #85                 // Method java/lang/Class.getMethod:(Ljava/lang/String;[Ljava/lang/Class;)Ljava/lang/reflect/Method;
      21: astore_1
      22: aload_1
      23: invokevirtual #36                 // Method java/lang/reflect/Method.isAccessible:()Z
      26: ifne          34
      29: aload_1
      30: iconst_1
      31: invokevirtual #40                 // Method java/lang/reflect/Method.setAccessible:(Z)V
      34: aload_1
      35: aload_0
      36: iconst_0
      37: anewarray     #4                  // class java/lang/Object
      40: invokevirtual #58                 // Method java/lang/reflect/Method.invoke:(Ljava/lang/Object;[Ljava/lang/Object;)Ljava/lang/Object;
      43: pop
      44: return
      45: astore_0
      46: ldc           #42                 // String ViewUtils
      48: ldc           #87                 // String Could not invoke makeOptionalFitsSystemWindows
      50: aload_0
      51: invokestatic  #63                 // Method android/util/Log.d:(Ljava/lang/String;Ljava/lang/String;Ljava/lang/Throwable;)I
      54: pop
      55: return
      56: ldc           #42                 // String ViewUtils
      58: ldc           #89                 // String Could not find method makeOptionalFitsSystemWindows. Oh well...
      60: invokestatic  #50                 // Method android/util/Log.d:(Ljava/lang/String;Ljava/lang/String;)I
      63: pop
      64: return
      65: astore_0
      66: goto          56
    Exception table:
       from    to  target type
           8    34    65   Class java/lang/NoSuchMethodException
           8    34    45   Class java/lang/reflect/InvocationTargetException
           8    34    45   Class java/lang/IllegalAccessException
          34    44    65   Class java/lang/NoSuchMethodException
          34    44    45   Class java/lang/reflect/InvocationTargetException
          34    44    45   Class java/lang/IllegalAccessException
}
