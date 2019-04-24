class android.support.transition.ap extends android.support.transition.ao {
  android.support.transition.ap();
    Code:
       0: aload_0
       1: invokespecial #14                 // Method android/support/transition/ao."<init>":()V
       4: return

  public void a(android.view.View, float);
    Code:
       0: aload_0
       1: invokespecial #68                 // Method a:()V
       4: getstatic     #37                 // Field a:Ljava/lang/reflect/Method;
       7: ifnull        43
      10: getstatic     #37                 // Field a:Ljava/lang/reflect/Method;
      13: aload_1
      14: iconst_1
      15: anewarray     #70                 // class java/lang/Object
      18: dup
      19: iconst_0
      20: fload_2
      21: invokestatic  #74                 // Method java/lang/Float.valueOf:(F)Ljava/lang/Float;
      24: aastore
      25: invokevirtual #78                 // Method java/lang/reflect/Method.invoke:(Ljava/lang/Object;[Ljava/lang/Object;)Ljava/lang/Object;
      28: pop
      29: return
      30: astore_1
      31: new           #80                 // class java/lang/RuntimeException
      34: dup
      35: aload_1
      36: invokevirtual #84                 // Method java/lang/reflect/InvocationTargetException.getCause:()Ljava/lang/Throwable;
      39: invokespecial #87                 // Method java/lang/RuntimeException."<init>":(Ljava/lang/Throwable;)V
      42: athrow
      43: aload_1
      44: fload_2
      45: invokevirtual #91                 // Method android/view/View.setAlpha:(F)V
      48: return
      49: astore_1
      50: return
    Exception table:
       from    to  target type
          10    29    49   Class java/lang/IllegalAccessException
          10    29    30   Class java/lang/reflect/InvocationTargetException

  public float c(android.view.View);
    Code:
       0: aload_0
       1: invokespecial #94                 // Method b:()V
       4: getstatic     #59                 // Field c:Ljava/lang/reflect/Method;
       7: ifnull        43
      10: getstatic     #59                 // Field c:Ljava/lang/reflect/Method;
      13: aload_1
      14: iconst_0
      15: anewarray     #70                 // class java/lang/Object
      18: invokevirtual #78                 // Method java/lang/reflect/Method.invoke:(Ljava/lang/Object;[Ljava/lang/Object;)Ljava/lang/Object;
      21: checkcast     #27                 // class java/lang/Float
      24: invokevirtual #98                 // Method java/lang/Float.floatValue:()F
      27: fstore_2
      28: fload_2
      29: freturn
      30: astore_1
      31: new           #80                 // class java/lang/RuntimeException
      34: dup
      35: aload_1
      36: invokevirtual #84                 // Method java/lang/reflect/InvocationTargetException.getCause:()Ljava/lang/Throwable;
      39: invokespecial #87                 // Method java/lang/RuntimeException."<init>":(Ljava/lang/Throwable;)V
      42: athrow
      43: aload_0
      44: aload_1
      45: invokespecial #100                // Method android/support/transition/ao.c:(Landroid/view/View;)F
      48: freturn
      49: astore_3
      50: goto          43
    Exception table:
       from    to  target type
          10    28    49   Class java/lang/IllegalAccessException
          10    28    30   Class java/lang/reflect/InvocationTargetException

  public void d(android.view.View);
    Code:
       0: return

  public void e(android.view.View);
    Code:
       0: return
}
