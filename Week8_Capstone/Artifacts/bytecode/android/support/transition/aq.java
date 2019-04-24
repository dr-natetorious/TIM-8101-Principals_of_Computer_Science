class android.support.transition.aq extends android.support.transition.ap {
  android.support.transition.aq();
    Code:
       0: aload_0
       1: invokespecial #14                 // Method android/support/transition/ap."<init>":()V
       4: return

  public void a(android.view.View, android.graphics.Matrix);
    Code:
       0: aload_0
       1: invokespecial #64                 // Method a:()V
       4: getstatic     #33                 // Field a:Ljava/lang/reflect/Method;
       7: ifnull        40
      10: getstatic     #33                 // Field a:Ljava/lang/reflect/Method;
      13: aload_1
      14: iconst_1
      15: anewarray     #66                 // class java/lang/Object
      18: dup
      19: iconst_0
      20: aload_2
      21: aastore
      22: invokevirtual #70                 // Method java/lang/reflect/Method.invoke:(Ljava/lang/Object;[Ljava/lang/Object;)Ljava/lang/Object;
      25: pop
      26: return
      27: astore_1
      28: new           #72                 // class java/lang/RuntimeException
      31: dup
      32: aload_1
      33: invokevirtual #76                 // Method java/lang/reflect/InvocationTargetException.getCause:()Ljava/lang/Throwable;
      36: invokespecial #79                 // Method java/lang/RuntimeException."<init>":(Ljava/lang/Throwable;)V
      39: athrow
      40: return
      41: astore_1
      42: return
    Exception table:
       from    to  target type
          10    26    41   Class java/lang/IllegalAccessException
          10    26    27   Class java/lang/reflect/InvocationTargetException

  public void b(android.view.View, android.graphics.Matrix);
    Code:
       0: aload_0
       1: invokespecial #81                 // Method b:()V
       4: getstatic     #55                 // Field c:Ljava/lang/reflect/Method;
       7: ifnull        40
      10: getstatic     #55                 // Field c:Ljava/lang/reflect/Method;
      13: aload_1
      14: iconst_1
      15: anewarray     #66                 // class java/lang/Object
      18: dup
      19: iconst_0
      20: aload_2
      21: aastore
      22: invokevirtual #70                 // Method java/lang/reflect/Method.invoke:(Ljava/lang/Object;[Ljava/lang/Object;)Ljava/lang/Object;
      25: pop
      26: return
      27: astore_1
      28: new           #72                 // class java/lang/RuntimeException
      31: dup
      32: aload_1
      33: invokevirtual #76                 // Method java/lang/reflect/InvocationTargetException.getCause:()Ljava/lang/Throwable;
      36: invokespecial #79                 // Method java/lang/RuntimeException."<init>":(Ljava/lang/Throwable;)V
      39: athrow
      40: return
      41: astore_1
      42: return
    Exception table:
       from    to  target type
          10    26    41   Class java/lang/IllegalAccessException
          10    26    27   Class java/lang/reflect/InvocationTargetException
}
