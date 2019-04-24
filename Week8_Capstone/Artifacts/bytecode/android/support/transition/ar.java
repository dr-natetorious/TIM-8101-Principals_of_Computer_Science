class android.support.transition.ar extends android.support.transition.aq {
  android.support.transition.ar();
    Code:
       0: aload_0
       1: invokespecial #12                 // Method android/support/transition/aq."<init>":()V
       4: return

  public void a(android.view.View, int, int, int, int);
    Code:
       0: aload_0
       1: invokespecial #62                 // Method a:()V
       4: getstatic     #38                 // Field a:Ljava/lang/reflect/Method;
       7: ifnull        66
      10: getstatic     #38                 // Field a:Ljava/lang/reflect/Method;
      13: aload_1
      14: iconst_4
      15: anewarray     #64                 // class java/lang/Object
      18: dup
      19: iconst_0
      20: iload_2
      21: invokestatic  #68                 // Method java/lang/Integer.valueOf:(I)Ljava/lang/Integer;
      24: aastore
      25: dup
      26: iconst_1
      27: iload_3
      28: invokestatic  #68                 // Method java/lang/Integer.valueOf:(I)Ljava/lang/Integer;
      31: aastore
      32: dup
      33: iconst_2
      34: iload         4
      36: invokestatic  #68                 // Method java/lang/Integer.valueOf:(I)Ljava/lang/Integer;
      39: aastore
      40: dup
      41: iconst_3
      42: iload         5
      44: invokestatic  #68                 // Method java/lang/Integer.valueOf:(I)Ljava/lang/Integer;
      47: aastore
      48: invokevirtual #72                 // Method java/lang/reflect/Method.invoke:(Ljava/lang/Object;[Ljava/lang/Object;)Ljava/lang/Object;
      51: pop
      52: return
      53: astore_1
      54: new           #74                 // class java/lang/RuntimeException
      57: dup
      58: aload_1
      59: invokevirtual #78                 // Method java/lang/reflect/InvocationTargetException.getCause:()Ljava/lang/Throwable;
      62: invokespecial #81                 // Method java/lang/RuntimeException."<init>":(Ljava/lang/Throwable;)V
      65: athrow
      66: return
      67: astore_1
      68: return
    Exception table:
       from    to  target type
          10    52    67   Class java/lang/IllegalAccessException
          10    52    53   Class java/lang/reflect/InvocationTargetException
}
