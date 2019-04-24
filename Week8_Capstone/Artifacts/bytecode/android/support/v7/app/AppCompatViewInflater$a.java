class android.support.v7.app.AppCompatViewInflater$a implements android.view.View$OnClickListener {
  public android.support.v7.app.AppCompatViewInflater$a(android.view.View, java.lang.String);
    Code:
       0: aload_0
       1: invokespecial #21                 // Method java/lang/Object."<init>":()V
       4: aload_0
       5: aload_1
       6: putfield      #23                 // Field a:Landroid/view/View;
       9: aload_0
      10: aload_2
      11: putfield      #25                 // Field b:Ljava/lang/String;
      14: return

  public void onClick(android.view.View);
    Code:
       0: aload_0
       1: getfield      #49                 // Field c:Ljava/lang/reflect/Method;
       4: ifnonnull     22
       7: aload_0
       8: aload_0
       9: getfield      #23                 // Field a:Landroid/view/View;
      12: invokevirtual #75                 // Method android/view/View.getContext:()Landroid/content/Context;
      15: aload_0
      16: getfield      #25                 // Field b:Ljava/lang/String;
      19: invokespecial #113                // Method a:(Landroid/content/Context;Ljava/lang/String;)V
      22: aload_0
      23: getfield      #49                 // Field c:Ljava/lang/reflect/Method;
      26: aload_0
      27: getfield      #51                 // Field d:Landroid/content/Context;
      30: iconst_1
      31: anewarray     #4                  // class java/lang/Object
      34: dup
      35: iconst_0
      36: aload_1
      37: aastore
      38: invokevirtual #119                // Method java/lang/reflect/Method.invoke:(Ljava/lang/Object;[Ljava/lang/Object;)Ljava/lang/Object;
      41: pop
      42: return
      43: astore_1
      44: new           #102                // class java/lang/IllegalStateException
      47: dup
      48: ldc           #121                // String Could not execute method for android:onClick
      50: aload_1
      51: invokespecial #124                // Method java/lang/IllegalStateException."<init>":(Ljava/lang/String;Ljava/lang/Throwable;)V
      54: athrow
      55: astore_1
      56: new           #102                // class java/lang/IllegalStateException
      59: dup
      60: ldc           #126                // String Could not execute non-public method for android:onClick
      62: aload_1
      63: invokespecial #124                // Method java/lang/IllegalStateException."<init>":(Ljava/lang/String;Ljava/lang/Throwable;)V
      66: athrow
    Exception table:
       from    to  target type
          22    42    55   Class java/lang/IllegalAccessException
          22    42    43   Class java/lang/reflect/InvocationTargetException
}
