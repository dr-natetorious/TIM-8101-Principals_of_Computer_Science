class android.support.transition.ah extends android.support.transition.ag {
  android.support.transition.ah();
    Code:
       0: aload_0
       1: invokespecial #12                 // Method android/support/transition/ag."<init>":()V
       4: return

  public android.support.transition.ae a(android.view.ViewGroup);
    Code:
       0: new           #54                 // class android/support/transition/ad
       3: dup
       4: aload_1
       5: invokespecial #57                 // Method android/support/transition/ad."<init>":(Landroid/view/ViewGroup;)V
       8: areturn

  public void a(android.view.ViewGroup, boolean);
    Code:
       0: aload_0
       1: invokespecial #64                 // Method a:()V
       4: getstatic     #35                 // Field a:Ljava/lang/reflect/Method;
       7: ifnull        49
      10: getstatic     #35                 // Field a:Ljava/lang/reflect/Method;
      13: aload_1
      14: iconst_1
      15: anewarray     #66                 // class java/lang/Object
      18: dup
      19: iconst_0
      20: iload_2
      21: invokestatic  #70                 // Method java/lang/Boolean.valueOf:(Z)Ljava/lang/Boolean;
      24: aastore
      25: invokevirtual #74                 // Method java/lang/reflect/Method.invoke:(Ljava/lang/Object;[Ljava/lang/Object;)Ljava/lang/Object;
      28: pop
      29: return
      30: astore_3
      31: ldc           #76                 // String Error invoking suppressLayout method
      33: astore_1
      34: goto          41
      37: astore_3
      38: ldc           #78                 // String Failed to invoke suppressLayout method
      40: astore_1
      41: ldc           #43                 // String ViewUtilsApi18
      43: aload_1
      44: aload_3
      45: invokestatic  #51                 // Method android/util/Log.i:(Ljava/lang/String;Ljava/lang/String;Ljava/lang/Throwable;)I
      48: pop
      49: return
    Exception table:
       from    to  target type
          10    29    37   Class java/lang/IllegalAccessException
          10    29    30   Class java/lang/reflect/InvocationTargetException
}
