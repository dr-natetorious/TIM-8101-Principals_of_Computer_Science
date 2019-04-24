class android.support.v4.widget.k$b extends android.support.v4.widget.k$a {
  static {};
    Code:
       0: ldc           #15                 // class android/widget/PopupWindow
       2: ldc           #17                 // String mOverlapAnchor
       4: invokevirtual #23                 // Method java/lang/Class.getDeclaredField:(Ljava/lang/String;)Ljava/lang/reflect/Field;
       7: putstatic     #25                 // Field a:Ljava/lang/reflect/Field;
      10: getstatic     #25                 // Field a:Ljava/lang/reflect/Field;
      13: iconst_1
      14: invokevirtual #31                 // Method java/lang/reflect/Field.setAccessible:(Z)V
      17: return
      18: astore_0
      19: ldc           #33                 // String PopupWindowCompatApi21
      21: ldc           #35                 // String Could not fetch mOverlapAnchor field from PopupWindow
      23: aload_0
      24: invokestatic  #41                 // Method android/util/Log.i:(Ljava/lang/String;Ljava/lang/String;Ljava/lang/Throwable;)I
      27: pop
      28: return
    Exception table:
       from    to  target type
           0    17    18   Class java/lang/NoSuchFieldException

  android.support.v4.widget.k$b();
    Code:
       0: aload_0
       1: invokespecial #45                 // Method android/support/v4/widget/k$a."<init>":()V
       4: return

  public void a(android.widget.PopupWindow, boolean);
    Code:
       0: getstatic     #25                 // Field a:Ljava/lang/reflect/Field;
       3: ifnull        28
       6: getstatic     #25                 // Field a:Ljava/lang/reflect/Field;
       9: aload_1
      10: iload_2
      11: invokestatic  #54                 // Method java/lang/Boolean.valueOf:(Z)Ljava/lang/Boolean;
      14: invokevirtual #58                 // Method java/lang/reflect/Field.set:(Ljava/lang/Object;Ljava/lang/Object;)V
      17: return
      18: astore_1
      19: ldc           #33                 // String PopupWindowCompatApi21
      21: ldc           #60                 // String Could not set overlap anchor field in PopupWindow
      23: aload_1
      24: invokestatic  #41                 // Method android/util/Log.i:(Ljava/lang/String;Ljava/lang/String;Ljava/lang/Throwable;)I
      27: pop
      28: return
    Exception table:
       from    to  target type
           6    17    18   Class java/lang/IllegalAccessException
}
