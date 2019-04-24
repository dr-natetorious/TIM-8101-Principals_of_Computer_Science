class android.support.v7.view.g$a implements android.view.MenuItem$OnMenuItemClickListener {
  static {};
    Code:
       0: iconst_1
       1: anewarray     #19                 // class java/lang/Class
       4: dup
       5: iconst_0
       6: ldc           #21                 // class android/view/MenuItem
       8: aastore
       9: putstatic     #23                 // Field a:[Ljava/lang/Class;
      12: return

  public android.support.v7.view.g$a(java.lang.Object, java.lang.String);
    Code:
       0: aload_0
       1: invokespecial #30                 // Method java/lang/Object."<init>":()V
       4: aload_0
       5: aload_1
       6: putfield      #32                 // Field b:Ljava/lang/Object;
       9: aload_1
      10: invokevirtual #36                 // Method java/lang/Object.getClass:()Ljava/lang/Class;
      13: astore_3
      14: aload_0
      15: aload_3
      16: aload_2
      17: getstatic     #23                 // Field a:[Ljava/lang/Class;
      20: invokevirtual #40                 // Method java/lang/Class.getMethod:(Ljava/lang/String;[Ljava/lang/Class;)Ljava/lang/reflect/Method;
      23: putfield      #42                 // Field c:Ljava/lang/reflect/Method;
      26: return
      27: astore_1
      28: new           #44                 // class java/lang/StringBuilder
      31: dup
      32: invokespecial #45                 // Method java/lang/StringBuilder."<init>":()V
      35: astore        4
      37: aload         4
      39: ldc           #47                 // String Couldn't resolve menu item onClick handler
      41: invokevirtual #51                 // Method java/lang/StringBuilder.append:(Ljava/lang/String;)Ljava/lang/StringBuilder;
      44: pop
      45: aload         4
      47: aload_2
      48: invokevirtual #51                 // Method java/lang/StringBuilder.append:(Ljava/lang/String;)Ljava/lang/StringBuilder;
      51: pop
      52: aload         4
      54: ldc           #53                 // String  in class
      56: invokevirtual #51                 // Method java/lang/StringBuilder.append:(Ljava/lang/String;)Ljava/lang/StringBuilder;
      59: pop
      60: aload         4
      62: aload_3
      63: invokevirtual #57                 // Method java/lang/Class.getName:()Ljava/lang/String;
      66: invokevirtual #51                 // Method java/lang/StringBuilder.append:(Ljava/lang/String;)Ljava/lang/StringBuilder;
      69: pop
      70: new           #59                 // class android/view/InflateException
      73: dup
      74: aload         4
      76: invokevirtual #62                 // Method java/lang/StringBuilder.toString:()Ljava/lang/String;
      79: invokespecial #65                 // Method android/view/InflateException."<init>":(Ljava/lang/String;)V
      82: astore_2
      83: aload_2
      84: aload_1
      85: invokevirtual #69                 // Method android/view/InflateException.initCause:(Ljava/lang/Throwable;)Ljava/lang/Throwable;
      88: pop
      89: aload_2
      90: athrow
    Exception table:
       from    to  target type
          14    26    27   Class java/lang/Exception

  public boolean onMenuItemClick(android.view.MenuItem);
    Code:
       0: aload_0
       1: getfield      #42                 // Field c:Ljava/lang/reflect/Method;
       4: invokevirtual #76                 // Method java/lang/reflect/Method.getReturnType:()Ljava/lang/Class;
       7: getstatic     #82                 // Field java/lang/Boolean.TYPE:Ljava/lang/Class;
      10: if_acmpne     39
      13: aload_0
      14: getfield      #42                 // Field c:Ljava/lang/reflect/Method;
      17: aload_0
      18: getfield      #32                 // Field b:Ljava/lang/Object;
      21: iconst_1
      22: anewarray     #4                  // class java/lang/Object
      25: dup
      26: iconst_0
      27: aload_1
      28: aastore
      29: invokevirtual #86                 // Method java/lang/reflect/Method.invoke:(Ljava/lang/Object;[Ljava/lang/Object;)Ljava/lang/Object;
      32: checkcast     #78                 // class java/lang/Boolean
      35: invokevirtual #90                 // Method java/lang/Boolean.booleanValue:()Z
      38: ireturn
      39: aload_0
      40: getfield      #42                 // Field c:Ljava/lang/reflect/Method;
      43: aload_0
      44: getfield      #32                 // Field b:Ljava/lang/Object;
      47: iconst_1
      48: anewarray     #4                  // class java/lang/Object
      51: dup
      52: iconst_0
      53: aload_1
      54: aastore
      55: invokevirtual #86                 // Method java/lang/reflect/Method.invoke:(Ljava/lang/Object;[Ljava/lang/Object;)Ljava/lang/Object;
      58: pop
      59: iconst_1
      60: ireturn
      61: astore_1
      62: new           #92                 // class java/lang/RuntimeException
      65: dup
      66: aload_1
      67: invokespecial #95                 // Method java/lang/RuntimeException."<init>":(Ljava/lang/Throwable;)V
      70: athrow
    Exception table:
       from    to  target type
           0    39    61   Class java/lang/Exception
          39    59    61   Class java/lang/Exception
}
